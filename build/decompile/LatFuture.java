/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.graphics.Typeface
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 *  androidx.appcompat.app.ActionBar
 *  androidx.appcompat.app.AppCompatActivity
 *  androidx.core.content.ContextCompat
 *  com.example.myapplication2.databinding.ActivityLatFutureBinding
 */
package com.example.myapplication2;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import com.example.myapplication2.QuestionLat;
import com.example.myapplication2.Questions;
import com.example.myapplication2.ResultActivity;
import com.example.myapplication2.databinding.ActivityLatFutureBinding;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 8, 0}, k=1, xi=48, d1={"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0002J\b\u0010\u0014\u001a\u00020\u0011H\u0002J\b\u0010\u0015\u001a\u00020\u0011H\u0002J\u0012\u0010\u0016\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0012\u0010\u0019\u001a\u00020\u00112\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\u0018\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\tH\u0002J\b\u0010 \u001a\u00020\u0011H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2={"Lcom/example/myapplication2/LatFuture;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/view/View$OnClickListener;", "()V", "binding", "Lcom/example/myapplication2/databinding/ActivityLatFutureBinding;", "canSelectOption", "", "mCorrectAnswers", "", "mCurrentPosition", "mQuestionList", "Ljava/util/ArrayList;", "Lcom/example/myapplication2/Questions;", "Lkotlin/collections/ArrayList;", "mSelectedOptionPosition", "answerView", "", "answer", "drawableView", "buttonVisible", "defaultOptionView", "onClick", "view", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "selectedOptionView", "tv", "Landroid/widget/TextView;", "selectedOption", "setQuestion", "app_debug"})
public final class LatFuture
extends AppCompatActivity
implements View.OnClickListener {
    private int mCurrentPosition = 1;
    private int mSelectedOptionPosition;
    private boolean canSelectOption = true;
    private int mCorrectAnswers;
    private ArrayList<Questions> mQuestionList;
    private ActivityLatFutureBinding binding;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityLatFutureBinding activityLatFutureBinding = ActivityLatFutureBinding.inflate((LayoutInflater)this.getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue((Object)activityLatFutureBinding, "inflate(layoutInflater)");
        this.binding = activityLatFutureBinding;
        ActivityLatFutureBinding activityLatFutureBinding2 = this.binding;
        if (activityLatFutureBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityLatFutureBinding2 = null;
        }
        this.setContentView((View)activityLatFutureBinding2.getRoot());
        ActivityLatFutureBinding activityLatFutureBinding3 = this.binding;
        if (activityLatFutureBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityLatFutureBinding3 = null;
        }
        activityLatFutureBinding3.tvOptionOne.setOnClickListener((View.OnClickListener)this);
        ActivityLatFutureBinding activityLatFutureBinding4 = this.binding;
        if (activityLatFutureBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityLatFutureBinding4 = null;
        }
        activityLatFutureBinding4.tvOptionTwo.setOnClickListener((View.OnClickListener)this);
        ActivityLatFutureBinding activityLatFutureBinding5 = this.binding;
        if (activityLatFutureBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityLatFutureBinding5 = null;
        }
        activityLatFutureBinding5.tvOptionThree.setOnClickListener((View.OnClickListener)this);
        ActivityLatFutureBinding activityLatFutureBinding6 = this.binding;
        if (activityLatFutureBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityLatFutureBinding6 = null;
        }
        activityLatFutureBinding6.tvOptionFour.setOnClickListener((View.OnClickListener)this);
        ActivityLatFutureBinding activityLatFutureBinding7 = this.binding;
        if (activityLatFutureBinding7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityLatFutureBinding7 = null;
        }
        activityLatFutureBinding7.btnSubmit.setOnClickListener((View.OnClickListener)this);
        this.mQuestionList = QuestionLat.INSTANCE.getQuestions3();
        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        this.setQuestion();
    }

    private final void setQuestion() {
        this.defaultOptionView();
        ActivityLatFutureBinding activityLatFutureBinding = this.binding;
        if (activityLatFutureBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityLatFutureBinding = null;
        }
        activityLatFutureBinding.btnSubmit.setVisibility(8);
        this.canSelectOption = true;
        ArrayList<Questions> arrayList = this.mQuestionList;
        if (arrayList == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mQuestionList");
            arrayList = null;
        }
        Questions questions = arrayList.get(this.mCurrentPosition - 1);
        Intrinsics.checkNotNullExpressionValue(questions, "mQuestionList[mCurrentPosition - 1]");
        Questions questionPackage = questions;
        ActivityLatFutureBinding activityLatFutureBinding2 = this.binding;
        if (activityLatFutureBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityLatFutureBinding2 = null;
        }
        activityLatFutureBinding2.tvQuestion.setText((CharSequence)questionPackage.getQuestion());
        ActivityLatFutureBinding activityLatFutureBinding3 = this.binding;
        if (activityLatFutureBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityLatFutureBinding3 = null;
        }
        activityLatFutureBinding3.progressBar.setProgress(this.mCurrentPosition);
        ActivityLatFutureBinding activityLatFutureBinding4 = this.binding;
        if (activityLatFutureBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityLatFutureBinding4 = null;
        }
        StringBuilder stringBuilder = new StringBuilder().append(this.mCurrentPosition).append('/');
        ActivityLatFutureBinding activityLatFutureBinding5 = this.binding;
        if (activityLatFutureBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityLatFutureBinding5 = null;
        }
        activityLatFutureBinding4.tvProgress.setText((CharSequence)stringBuilder.append(activityLatFutureBinding5.progressBar.getMax()).toString());
        ActivityLatFutureBinding activityLatFutureBinding6 = this.binding;
        if (activityLatFutureBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityLatFutureBinding6 = null;
        }
        activityLatFutureBinding6.tvOptionOne.setText((CharSequence)questionPackage.getOptionOne());
        ActivityLatFutureBinding activityLatFutureBinding7 = this.binding;
        if (activityLatFutureBinding7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityLatFutureBinding7 = null;
        }
        activityLatFutureBinding7.tvOptionTwo.setText((CharSequence)questionPackage.getOptionTwo());
        ActivityLatFutureBinding activityLatFutureBinding8 = this.binding;
        if (activityLatFutureBinding8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityLatFutureBinding8 = null;
        }
        activityLatFutureBinding8.tvOptionThree.setText((CharSequence)questionPackage.getOptionThree());
        ActivityLatFutureBinding activityLatFutureBinding9 = this.binding;
        if (activityLatFutureBinding9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityLatFutureBinding9 = null;
        }
        activityLatFutureBinding9.tvOptionFour.setText((CharSequence)questionPackage.getOptionFour());
        ArrayList<Questions> arrayList2 = this.mQuestionList;
        if (arrayList2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mQuestionList");
            arrayList2 = null;
        }
        if (this.mCurrentPosition == arrayList2.size()) {
            ActivityLatFutureBinding activityLatFutureBinding10 = this.binding;
            if (activityLatFutureBinding10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityLatFutureBinding10 = null;
            }
            activityLatFutureBinding10.btnSubmit.setText((CharSequence)"Finish");
        } else {
            ActivityLatFutureBinding activityLatFutureBinding11 = this.binding;
            if (activityLatFutureBinding11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityLatFutureBinding11 = null;
            }
            activityLatFutureBinding11.btnSubmit.setText((CharSequence)"Submit");
        }
    }

    private final void defaultOptionView() {
        ArrayList<TextView> options = new ArrayList<TextView>();
        ActivityLatFutureBinding activityLatFutureBinding = this.binding;
        if (activityLatFutureBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityLatFutureBinding = null;
        }
        options.add(0, activityLatFutureBinding.tvOptionOne);
        ActivityLatFutureBinding activityLatFutureBinding2 = this.binding;
        if (activityLatFutureBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityLatFutureBinding2 = null;
        }
        options.add(1, activityLatFutureBinding2.tvOptionTwo);
        ActivityLatFutureBinding activityLatFutureBinding3 = this.binding;
        if (activityLatFutureBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityLatFutureBinding3 = null;
        }
        options.add(2, activityLatFutureBinding3.tvOptionThree);
        ActivityLatFutureBinding activityLatFutureBinding4 = this.binding;
        if (activityLatFutureBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityLatFutureBinding4 = null;
        }
        options.add(3, activityLatFutureBinding4.tvOptionFour);
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
                ActivityLatFutureBinding activityLatFutureBinding = this.binding;
                if (activityLatFutureBinding == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityLatFutureBinding = null;
                }
                activityLatFutureBinding.tvOptionOne.setBackground(ContextCompat.getDrawable((Context)((Context)this), (int)drawableView));
                break;
            }
            case 2: {
                ActivityLatFutureBinding activityLatFutureBinding = this.binding;
                if (activityLatFutureBinding == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityLatFutureBinding = null;
                }
                activityLatFutureBinding.tvOptionTwo.setBackground(ContextCompat.getDrawable((Context)((Context)this), (int)drawableView));
                break;
            }
            case 3: {
                ActivityLatFutureBinding activityLatFutureBinding = this.binding;
                if (activityLatFutureBinding == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityLatFutureBinding = null;
                }
                activityLatFutureBinding.tvOptionThree.setBackground(ContextCompat.getDrawable((Context)((Context)this), (int)drawableView));
                break;
            }
            case 4: {
                ActivityLatFutureBinding activityLatFutureBinding = this.binding;
                if (activityLatFutureBinding == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityLatFutureBinding = null;
                }
                activityLatFutureBinding.tvOptionFour.setBackground(ContextCompat.getDrawable((Context)((Context)this), (int)drawableView));
            }
        }
    }

    private final void buttonVisible() {
        ActivityLatFutureBinding activityLatFutureBinding = this.binding;
        if (activityLatFutureBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityLatFutureBinding = null;
        }
        activityLatFutureBinding.btnSubmit.setVisibility(0);
    }

    public void onClick(@Nullable View view) {
        Integer n;
        View view2 = view;
        Integer n2 = n = view2 != null ? Integer.valueOf(view2.getId()) : null;
        int n3 = 2131362309;
        if (n2 != null && n2 == n3) {
            if (this.canSelectOption) {
                ActivityLatFutureBinding activityLatFutureBinding = this.binding;
                if (activityLatFutureBinding == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityLatFutureBinding = null;
                }
                TextView textView = activityLatFutureBinding.tvOptionOne;
                Intrinsics.checkNotNullExpressionValue((Object)textView, "binding.tvOptionOne");
                this.selectedOptionView(textView, 1);
                this.buttonVisible();
            }
        } else {
            Integer n4 = n;
            n3 = 2131362311;
            if (n4 != null && n4 == n3) {
                if (this.canSelectOption) {
                    ActivityLatFutureBinding activityLatFutureBinding = this.binding;
                    if (activityLatFutureBinding == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        activityLatFutureBinding = null;
                    }
                    TextView textView = activityLatFutureBinding.tvOptionTwo;
                    Intrinsics.checkNotNullExpressionValue((Object)textView, "binding.tvOptionTwo");
                    this.selectedOptionView(textView, 2);
                    this.buttonVisible();
                }
            } else {
                Integer n5 = n;
                n3 = 2131362310;
                if (n5 != null && n5 == n3) {
                    if (this.canSelectOption) {
                        ActivityLatFutureBinding activityLatFutureBinding = this.binding;
                        if (activityLatFutureBinding == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityLatFutureBinding = null;
                        }
                        TextView textView = activityLatFutureBinding.tvOptionThree;
                        Intrinsics.checkNotNullExpressionValue((Object)textView, "binding.tvOptionThree");
                        this.selectedOptionView(textView, 3);
                        this.buttonVisible();
                    }
                } else {
                    Integer n6 = n;
                    n3 = 2131362308;
                    if (n6 != null && n6 == n3) {
                        if (this.canSelectOption) {
                            ActivityLatFutureBinding activityLatFutureBinding = this.binding;
                            if (activityLatFutureBinding == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityLatFutureBinding = null;
                            }
                            TextView textView = activityLatFutureBinding.tvOptionFour;
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
                                    ActivityLatFutureBinding activityLatFutureBinding = this.binding;
                                    if (activityLatFutureBinding == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                                        activityLatFutureBinding = null;
                                    }
                                    activityLatFutureBinding.btnSubmit.setText((CharSequence)"Finish");
                                } else {
                                    ActivityLatFutureBinding activityLatFutureBinding = this.binding;
                                    if (activityLatFutureBinding == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                                        activityLatFutureBinding = null;
                                    }
                                    activityLatFutureBinding.btnSubmit.setText((CharSequence)"Go To Next Question");
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
}
