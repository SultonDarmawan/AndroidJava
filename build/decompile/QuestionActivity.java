/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.graphics.Typeface
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 *  androidx.appcompat.app.ActionBar
 *  androidx.appcompat.app.AppCompatActivity
 *  androidx.core.content.ContextCompat
 *  com.example.myapplication2.databinding.ActivityQuestionBinding
 */
package com.example.myapplication2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import com.example.myapplication2.DataQuestions;
import com.example.myapplication2.Questions;
import com.example.myapplication2.QuizResult;
import com.example.myapplication2.ResultActivity;
import com.example.myapplication2.databinding.ActivityQuestionBinding;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 8, 0}, k=1, xi=48, d1={"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0002J\b\u0010\u0014\u001a\u00020\u0011H\u0002J\b\u0010\u0015\u001a\u00020\u0011H\u0002J\u0012\u0010\u0016\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0012\u0010\u0019\u001a\u00020\u00112\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\u0016\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\tJ\u0018\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\tH\u0002J\b\u0010$\u001a\u00020\u0011H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2={"Lcom/example/myapplication2/QuestionActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/view/View$OnClickListener;", "()V", "binding", "Lcom/example/myapplication2/databinding/ActivityQuestionBinding;", "canSelectOption", "", "mCorrectAnswers", "", "mCurrentPosition", "mQuestionList", "Ljava/util/ArrayList;", "Lcom/example/myapplication2/Questions;", "Lkotlin/collections/ArrayList;", "mSelectedOptionPosition", "answerView", "", "answer", "drawableView", "buttonVisible", "defaultOptionView", "onClick", "view", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "saveQuizHistory", "context", "Landroid/content/Context;", "score", "selectedOptionView", "tv", "Landroid/widget/TextView;", "selectedOption", "setQuestion", "app_debug"})
public final class QuestionActivity
extends AppCompatActivity
implements View.OnClickListener {
    private ActivityQuestionBinding binding;
    private int mCurrentPosition = 1;
    private int mSelectedOptionPosition;
    private boolean canSelectOption = true;
    private int mCorrectAnswers;
    private ArrayList<Questions> mQuestionList;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityQuestionBinding activityQuestionBinding = ActivityQuestionBinding.inflate((LayoutInflater)this.getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue((Object)activityQuestionBinding, "inflate(layoutInflater)");
        this.binding = activityQuestionBinding;
        ActivityQuestionBinding activityQuestionBinding2 = this.binding;
        if (activityQuestionBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityQuestionBinding2 = null;
        }
        this.setContentView((View)activityQuestionBinding2.getRoot());
        ActivityQuestionBinding activityQuestionBinding3 = this.binding;
        if (activityQuestionBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityQuestionBinding3 = null;
        }
        activityQuestionBinding3.tvOptionOne.setOnClickListener((View.OnClickListener)this);
        ActivityQuestionBinding activityQuestionBinding4 = this.binding;
        if (activityQuestionBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityQuestionBinding4 = null;
        }
        activityQuestionBinding4.tvOptionTwo.setOnClickListener((View.OnClickListener)this);
        ActivityQuestionBinding activityQuestionBinding5 = this.binding;
        if (activityQuestionBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityQuestionBinding5 = null;
        }
        activityQuestionBinding5.tvOptionThree.setOnClickListener((View.OnClickListener)this);
        ActivityQuestionBinding activityQuestionBinding6 = this.binding;
        if (activityQuestionBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityQuestionBinding6 = null;
        }
        activityQuestionBinding6.tvOptionFour.setOnClickListener((View.OnClickListener)this);
        ActivityQuestionBinding activityQuestionBinding7 = this.binding;
        if (activityQuestionBinding7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityQuestionBinding7 = null;
        }
        activityQuestionBinding7.btnSubmit.setOnClickListener((View.OnClickListener)this);
        this.mQuestionList = DataQuestions.INSTANCE.getQuestions();
        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        this.setQuestion();
    }

    private final void setQuestion() {
        this.defaultOptionView();
        ActivityQuestionBinding activityQuestionBinding = this.binding;
        if (activityQuestionBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityQuestionBinding = null;
        }
        activityQuestionBinding.btnSubmit.setVisibility(8);
        this.canSelectOption = true;
        ArrayList<Questions> arrayList = this.mQuestionList;
        if (arrayList == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mQuestionList");
            arrayList = null;
        }
        Questions questions = arrayList.get(this.mCurrentPosition - 1);
        Intrinsics.checkNotNullExpressionValue(questions, "mQuestionList[mCurrentPosition - 1]");
        Questions questionPackage = questions;
        ActivityQuestionBinding activityQuestionBinding2 = this.binding;
        if (activityQuestionBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityQuestionBinding2 = null;
        }
        activityQuestionBinding2.tvQuestion.setText((CharSequence)questionPackage.getQuestion());
        ActivityQuestionBinding activityQuestionBinding3 = this.binding;
        if (activityQuestionBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityQuestionBinding3 = null;
        }
        activityQuestionBinding3.progressBar.setProgress(this.mCurrentPosition);
        ActivityQuestionBinding activityQuestionBinding4 = this.binding;
        if (activityQuestionBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityQuestionBinding4 = null;
        }
        StringBuilder stringBuilder = new StringBuilder().append(this.mCurrentPosition).append('/');
        ActivityQuestionBinding activityQuestionBinding5 = this.binding;
        if (activityQuestionBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityQuestionBinding5 = null;
        }
        activityQuestionBinding4.tvProgress.setText((CharSequence)stringBuilder.append(activityQuestionBinding5.progressBar.getMax()).toString());
        ActivityQuestionBinding activityQuestionBinding6 = this.binding;
        if (activityQuestionBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityQuestionBinding6 = null;
        }
        activityQuestionBinding6.tvOptionOne.setText((CharSequence)questionPackage.getOptionOne());
        ActivityQuestionBinding activityQuestionBinding7 = this.binding;
        if (activityQuestionBinding7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityQuestionBinding7 = null;
        }
        activityQuestionBinding7.tvOptionTwo.setText((CharSequence)questionPackage.getOptionTwo());
        ActivityQuestionBinding activityQuestionBinding8 = this.binding;
        if (activityQuestionBinding8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityQuestionBinding8 = null;
        }
        activityQuestionBinding8.tvOptionThree.setText((CharSequence)questionPackage.getOptionThree());
        ActivityQuestionBinding activityQuestionBinding9 = this.binding;
        if (activityQuestionBinding9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityQuestionBinding9 = null;
        }
        activityQuestionBinding9.tvOptionFour.setText((CharSequence)questionPackage.getOptionFour());
        ArrayList<Questions> arrayList2 = this.mQuestionList;
        if (arrayList2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mQuestionList");
            arrayList2 = null;
        }
        if (this.mCurrentPosition == arrayList2.size()) {
            ActivityQuestionBinding activityQuestionBinding10 = this.binding;
            if (activityQuestionBinding10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityQuestionBinding10 = null;
            }
            activityQuestionBinding10.btnSubmit.setText((CharSequence)"Finish");
        } else {
            ActivityQuestionBinding activityQuestionBinding11 = this.binding;
            if (activityQuestionBinding11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityQuestionBinding11 = null;
            }
            activityQuestionBinding11.btnSubmit.setText((CharSequence)"Submit");
        }
    }

    private final void defaultOptionView() {
        ArrayList<TextView> options = new ArrayList<TextView>();
        ActivityQuestionBinding activityQuestionBinding = this.binding;
        if (activityQuestionBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityQuestionBinding = null;
        }
        options.add(0, activityQuestionBinding.tvOptionOne);
        ActivityQuestionBinding activityQuestionBinding2 = this.binding;
        if (activityQuestionBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityQuestionBinding2 = null;
        }
        options.add(1, activityQuestionBinding2.tvOptionTwo);
        ActivityQuestionBinding activityQuestionBinding3 = this.binding;
        if (activityQuestionBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityQuestionBinding3 = null;
        }
        options.add(2, activityQuestionBinding3.tvOptionThree);
        ActivityQuestionBinding activityQuestionBinding4 = this.binding;
        if (activityQuestionBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityQuestionBinding4 = null;
        }
        options.add(3, activityQuestionBinding4.tvOptionFour);
        for (TextView option : options) {
            option.setTextColor(ContextCompat.getColor((Context)((Context)this), (int)2131100430));
            option.setTypeface(Typeface.DEFAULT);
            option.setBackground(ContextCompat.getDrawable((Context)((Context)this), (int)2131230864));
        }
    }

    private final void selectedOptionView(TextView tv, int selectedOption) {
        this.defaultOptionView();
        this.mSelectedOptionPosition = selectedOption;
        tv.setTextColor(ContextCompat.getColor((Context)((Context)this), (int)2131099759));
        tv.setTypeface(tv.getTypeface(), 1);
        tv.setBackground(ContextCompat.getDrawable((Context)((Context)this), (int)2131230986));
    }

    private final void answerView(int answer, int drawableView) {
        switch (answer) {
            case 1: {
                ActivityQuestionBinding activityQuestionBinding = this.binding;
                if (activityQuestionBinding == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityQuestionBinding = null;
                }
                activityQuestionBinding.tvOptionOne.setBackground(ContextCompat.getDrawable((Context)((Context)this), (int)drawableView));
                break;
            }
            case 2: {
                ActivityQuestionBinding activityQuestionBinding = this.binding;
                if (activityQuestionBinding == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityQuestionBinding = null;
                }
                activityQuestionBinding.tvOptionTwo.setBackground(ContextCompat.getDrawable((Context)((Context)this), (int)drawableView));
                break;
            }
            case 3: {
                ActivityQuestionBinding activityQuestionBinding = this.binding;
                if (activityQuestionBinding == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityQuestionBinding = null;
                }
                activityQuestionBinding.tvOptionThree.setBackground(ContextCompat.getDrawable((Context)((Context)this), (int)drawableView));
                break;
            }
            case 4: {
                ActivityQuestionBinding activityQuestionBinding = this.binding;
                if (activityQuestionBinding == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityQuestionBinding = null;
                }
                activityQuestionBinding.tvOptionFour.setBackground(ContextCompat.getDrawable((Context)((Context)this), (int)drawableView));
            }
        }
    }

    private final void buttonVisible() {
        ActivityQuestionBinding activityQuestionBinding = this.binding;
        if (activityQuestionBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityQuestionBinding = null;
        }
        activityQuestionBinding.btnSubmit.setVisibility(0);
    }

    public void onClick(@Nullable View view) {
        Integer n;
        View view2 = view;
        Integer n2 = n = view2 != null ? Integer.valueOf(view2.getId()) : null;
        int n3 = 2131362309;
        if (n2 != null && n2 == n3) {
            if (this.canSelectOption) {
                ActivityQuestionBinding activityQuestionBinding = this.binding;
                if (activityQuestionBinding == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityQuestionBinding = null;
                }
                TextView textView = activityQuestionBinding.tvOptionOne;
                Intrinsics.checkNotNullExpressionValue((Object)textView, "binding.tvOptionOne");
                this.selectedOptionView(textView, 1);
                this.buttonVisible();
            }
        } else {
            Integer n4 = n;
            n3 = 2131362311;
            if (n4 != null && n4 == n3) {
                if (this.canSelectOption) {
                    ActivityQuestionBinding activityQuestionBinding = this.binding;
                    if (activityQuestionBinding == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        activityQuestionBinding = null;
                    }
                    TextView textView = activityQuestionBinding.tvOptionTwo;
                    Intrinsics.checkNotNullExpressionValue((Object)textView, "binding.tvOptionTwo");
                    this.selectedOptionView(textView, 2);
                    this.buttonVisible();
                }
            } else {
                Integer n5 = n;
                n3 = 2131362310;
                if (n5 != null && n5 == n3) {
                    if (this.canSelectOption) {
                        ActivityQuestionBinding activityQuestionBinding = this.binding;
                        if (activityQuestionBinding == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityQuestionBinding = null;
                        }
                        TextView textView = activityQuestionBinding.tvOptionThree;
                        Intrinsics.checkNotNullExpressionValue((Object)textView, "binding.tvOptionThree");
                        this.selectedOptionView(textView, 3);
                        this.buttonVisible();
                    }
                } else {
                    Integer n6 = n;
                    n3 = 2131362308;
                    if (n6 != null && n6 == n3) {
                        if (this.canSelectOption) {
                            ActivityQuestionBinding activityQuestionBinding = this.binding;
                            if (activityQuestionBinding == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityQuestionBinding = null;
                            }
                            TextView textView = activityQuestionBinding.tvOptionFour;
                            Intrinsics.checkNotNullExpressionValue((Object)textView, "binding.tvOptionFour");
                            this.selectedOptionView(textView, 4);
                            this.buttonVisible();
                        }
                    } else {
                        Integer n7 = n;
                        n3 = 2131361896;
                        if (n7 != null && n7 == n3) {
                            if (this.mSelectedOptionPosition == 0) {
                                n3 = this.mCurrentPosition;
                                this.mCurrentPosition = n3 + 1;
                                ArrayList<Questions> arrayList = this.mQuestionList;
                                if (arrayList == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("mQuestionList");
                                    arrayList = null;
                                }
                                if (this.mCurrentPosition <= arrayList.size()) {
                                    this.setQuestion();
                                } else {
                                    Intent intent = new Intent((Context)this, ResultActivity.class);
                                    intent.putExtra("score", this.mCorrectAnswers);
                                    ArrayList<Questions> arrayList2 = this.mQuestionList;
                                    if (arrayList2 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("mQuestionList");
                                        arrayList2 = null;
                                    }
                                    intent.putExtra("total_question", arrayList2.size());
                                    this.saveQuizHistory((Context)this, this.mCorrectAnswers);
                                    this.startActivity(intent);
                                    this.finish();
                                }
                            } else {
                                ArrayList<Questions> arrayList = this.mQuestionList;
                                if (arrayList == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("mQuestionList");
                                    arrayList = null;
                                }
                                Questions questions = arrayList.get(this.mCurrentPosition - 1);
                                Intrinsics.checkNotNullExpressionValue(questions, "mQuestionList[mCurrentPosition-1]");
                                Questions question = questions;
                                if (question.getAnswer() != this.mSelectedOptionPosition) {
                                    this.answerView(this.mSelectedOptionPosition, 2131230993);
                                } else {
                                    int n8 = this.mCorrectAnswers;
                                    this.mCorrectAnswers = n8 + 1;
                                }
                                this.answerView(question.getAnswer(), 2131230863);
                                ArrayList<Questions> arrayList3 = this.mQuestionList;
                                if (arrayList3 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("mQuestionList");
                                    arrayList3 = null;
                                }
                                if (this.mCurrentPosition == arrayList3.size()) {
                                    ActivityQuestionBinding activityQuestionBinding = this.binding;
                                    if (activityQuestionBinding == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                                        activityQuestionBinding = null;
                                    }
                                    activityQuestionBinding.btnSubmit.setText((CharSequence)"Finish");
                                } else {
                                    ActivityQuestionBinding activityQuestionBinding = this.binding;
                                    if (activityQuestionBinding == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                                        activityQuestionBinding = null;
                                    }
                                    activityQuestionBinding.btnSubmit.setText((CharSequence)"Go To Next Question");
                                }
                                this.mSelectedOptionPosition = 0;
                                this.canSelectOption = false;
                            }
                        }
                    }
                }
            }
        }
    }

    public final void saveQuizHistory(@NotNull Context context, int score) {
        List list;
        Intrinsics.checkNotNullParameter((Object)context, "context");
        SharedPreferences sharedPref = context.getSharedPreferences("quiz_history", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        String jsonQuizHistory = sharedPref.getString("quiz_history", null);
        if (jsonQuizHistory != null) {
            Object t = new Gson().fromJson(jsonQuizHistory, new TypeToken<List<QuizResult>>(){}.getType());
            Intrinsics.checkNotNullExpressionValue(t, "{\n            Gson().fro\u2026lt>>() {}.type)\n        }");
            list = (List)t;
        } else {
            list = new ArrayList();
        }
        List quizHistory2 = list;
        long currentTime = System.currentTimeMillis();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());
        String dateString = dateFormat.format(currentTime);
        String timeString = timeFormat.format(currentTime);
        Intrinsics.checkNotNullExpressionValue(dateString, "dateString");
        Intrinsics.checkNotNullExpressionValue(timeString, "timeString");
        QuizResult quizResult = new QuizResult(score, dateString, timeString);
        quizHistory2.add(quizResult);
        String updatedJsonQuizHistory = new Gson().toJson(quizHistory2);
        editor.putString("quiz_history", updatedJsonQuizHistory);
        editor.apply();
    }
}
