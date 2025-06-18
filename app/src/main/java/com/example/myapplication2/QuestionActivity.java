package com.example.myapplication2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.example.myapplication2.databinding.ActivityQuestionBinding;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class QuestionActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityQuestionBinding binding;
    private int mCurrentPosition = 1;
    private int mSelectedOptionPosition = 0;
    private boolean canSelectOption = true;
    private int mCorrectAnswers = 0;
    private ArrayList<Questions> mQuestionList;

    private static final String TAG = "QuestionActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityQuestionBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.tvOptionOne.setOnClickListener(this);
        binding.tvOptionTwo.setOnClickListener(this);
        binding.tvOptionThree.setOnClickListener(this);
        binding.tvOptionFour.setOnClickListener(this);
        binding.btnSubmit.setOnClickListener(this);

        mQuestionList = DataQuestions.getQuestions();

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        // Debug: cek apakah nis sudah ada di SharedPreferences
        SharedPreferences userPref = getSharedPreferences("user_data", Context.MODE_PRIVATE);
        String nisCheck = userPref.getString("nis", null);
        if (nisCheck == null) {
            Log.w(TAG, "NIS belum disimpan di SharedPreferences user_data");
        } else {
            Log.d(TAG, "NIS saat onCreate: " + nisCheck);
        }

        setQuestion();
    }

    private void setQuestion() {
        defaultOptionView();
        binding.btnSubmit.setVisibility(View.GONE);
        canSelectOption = true;

        Questions question = mQuestionList.get(mCurrentPosition - 1);
        binding.tvQuestion.setText(question.getQuestion());
        binding.progressBar.setProgress(mCurrentPosition);
        binding.tvProgress.setText(mCurrentPosition + "/" + binding.progressBar.getMax());
        binding.tvOptionOne.setText(question.getOptionOne());
        binding.tvOptionTwo.setText(question.getOptionTwo());
        binding.tvOptionThree.setText(question.getOptionThree());
        binding.tvOptionFour.setText(question.getOptionFour());
        binding.btnSubmit.setText(mCurrentPosition == mQuestionList.size() ? "Finish" : "Submit");
    }

    private void defaultOptionView() {
        ArrayList<TextView> options = new ArrayList<>();
        options.add(binding.tvOptionOne);
        options.add(binding.tvOptionTwo);
        options.add(binding.tvOptionThree);
        options.add(binding.tvOptionFour);

        for (TextView option : options) {
            option.setTextColor(ContextCompat.getColor(this, R.color.white3));
            option.setTypeface(Typeface.DEFAULT);
            option.setBackground(ContextCompat.getDrawable(this, R.drawable.default_option_border_bg));
        }
    }

    private void selectedOptionView(TextView tv, int selectedOption) {
        defaultOptionView();
        mSelectedOptionPosition = selectedOption;
        tv.setTextColor(ContextCompat.getColor(this, R.color.light_color));
        tv.setTypeface(tv.getTypeface(), Typeface.BOLD);
        tv.setBackground(ContextCompat.getDrawable(this, R.drawable.selected_option_border_bg));
    }

    private void answerView(int answer, int drawableView) {
        switch (answer) {
            case 1:
                binding.tvOptionOne.setBackground(ContextCompat.getDrawable(this, drawableView));
                break;
            case 2:
                binding.tvOptionTwo.setBackground(ContextCompat.getDrawable(this, drawableView));
                break;
            case 3:
                binding.tvOptionThree.setBackground(ContextCompat.getDrawable(this, drawableView));
                break;
            case 4:
                binding.tvOptionFour.setBackground(ContextCompat.getDrawable(this, drawableView));
                break;
        }
    }

    private void buttonVisible() {
        binding.btnSubmit.setVisibility(View.VISIBLE);
    }

    @Override
    public void onClick(View view) {
        if (view == null) return;

        switch (view.getId()) {
            case R.id.tvOptionOne:
                if (canSelectOption) {
                    selectedOptionView(binding.tvOptionOne, 1);
                    buttonVisible();
                }
                break;
            case R.id.tvOptionTwo:
                if (canSelectOption) {
                    selectedOptionView(binding.tvOptionTwo, 2);
                    buttonVisible();
                }
                break;
            case R.id.tvOptionThree:
                if (canSelectOption) {
                    selectedOptionView(binding.tvOptionThree, 3);
                    buttonVisible();
                }
                break;
            case R.id.tvOptionFour:
                if (canSelectOption) {
                    selectedOptionView(binding.tvOptionFour, 4);
                    buttonVisible();
                }
                break;
            case R.id.btnSubmit:
                if (mSelectedOptionPosition == 0) {
                    mCurrentPosition++;
                    if (mCurrentPosition <= mQuestionList.size()) {
                        setQuestion();
                    } else {
                        Intent intent = new Intent(this, ResultActivity.class);
                        intent.putExtra(DataQuestions.SCORE_KEY, mCorrectAnswers);
                        intent.putExtra(DataQuestions.TOTAL_QUESTION_KEY, mQuestionList.size());
                        saveQuizHistory(this, mCorrectAnswers);
                        startActivity(intent);
                        finish();
                    }
                } else {
                    Questions question = mQuestionList.get(mCurrentPosition - 1);
                    if (question.getAnswer() != mSelectedOptionPosition) {
                        answerView(mSelectedOptionPosition, R.drawable.wrong_option_bg);
                    } else {
                        mCorrectAnswers++;
                    }

                    answerView(question.getAnswer(), R.drawable.correct_option_bg);
                    binding.btnSubmit.setText(mCurrentPosition == mQuestionList.size() ? "Finish" : "Go To Next Question");

                    mSelectedOptionPosition = 0;
                    canSelectOption = false;
                }
                break;
        }
    }

    private void saveQuizHistory(Context context, int score) {
        SharedPreferences sharedPref = context.getSharedPreferences("quiz_history", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();

        String jsonQuizHistory = sharedPref.getString("quiz_history", null);
        List<QuizResult> quizHistory = jsonQuizHistory != null ?
                new Gson().fromJson(jsonQuizHistory, new TypeToken<List<QuizResult>>() {}.getType()) : new ArrayList<>();

        SharedPreferences userPref = context.getSharedPreferences("user_data", Context.MODE_PRIVATE);
        String nis = userPref.getString("nis", null);

        if (nis == null) {
            nis = "UNKNOWN";
            Log.w(TAG, "NIS belum disimpan di SharedPreferences user_data");
        } else {
            Log.d(TAG, "NIS didapat dari SharedPreferences: " + nis);
        }

        long currentTime = System.currentTimeMillis();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());

        QuizResult quizResult = new QuizResult(score, dateFormat.format(currentTime), timeFormat.format(currentTime), nis);
        quizHistory.add(quizResult);

        editor.putString("quiz_history", new Gson().toJson(quizHistory));
        editor.apply();
    }
}
