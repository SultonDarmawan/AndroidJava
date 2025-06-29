// Generated by view binder compiler. Do not edit!
package com.example.myapplication2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myapplication2.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLatPresentBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final Button btnSubmit;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final TextView tvOptionFour;

  @NonNull
  public final TextView tvOptionOne;

  @NonNull
  public final TextView tvOptionThree;

  @NonNull
  public final TextView tvOptionTwo;

  @NonNull
  public final TextView tvProgress;

  @NonNull
  public final TextView tvQuestion;

  private ActivityLatPresentBinding(@NonNull ScrollView rootView, @NonNull Button btnSubmit,
      @NonNull ProgressBar progressBar, @NonNull TextView tvOptionFour,
      @NonNull TextView tvOptionOne, @NonNull TextView tvOptionThree, @NonNull TextView tvOptionTwo,
      @NonNull TextView tvProgress, @NonNull TextView tvQuestion) {
    this.rootView = rootView;
    this.btnSubmit = btnSubmit;
    this.progressBar = progressBar;
    this.tvOptionFour = tvOptionFour;
    this.tvOptionOne = tvOptionOne;
    this.tvOptionThree = tvOptionThree;
    this.tvOptionTwo = tvOptionTwo;
    this.tvProgress = tvProgress;
    this.tvQuestion = tvQuestion;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLatPresentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLatPresentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_lat_present, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLatPresentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnSubmit;
      Button btnSubmit = ViewBindings.findChildViewById(rootView, id);
      if (btnSubmit == null) {
        break missingId;
      }

      id = R.id.progressBar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.tvOptionFour;
      TextView tvOptionFour = ViewBindings.findChildViewById(rootView, id);
      if (tvOptionFour == null) {
        break missingId;
      }

      id = R.id.tvOptionOne;
      TextView tvOptionOne = ViewBindings.findChildViewById(rootView, id);
      if (tvOptionOne == null) {
        break missingId;
      }

      id = R.id.tvOptionThree;
      TextView tvOptionThree = ViewBindings.findChildViewById(rootView, id);
      if (tvOptionThree == null) {
        break missingId;
      }

      id = R.id.tvOptionTwo;
      TextView tvOptionTwo = ViewBindings.findChildViewById(rootView, id);
      if (tvOptionTwo == null) {
        break missingId;
      }

      id = R.id.tvProgress;
      TextView tvProgress = ViewBindings.findChildViewById(rootView, id);
      if (tvProgress == null) {
        break missingId;
      }

      id = R.id.tvQuestion;
      TextView tvQuestion = ViewBindings.findChildViewById(rootView, id);
      if (tvQuestion == null) {
        break missingId;
      }

      return new ActivityLatPresentBinding((ScrollView) rootView, btnSubmit, progressBar,
          tvOptionFour, tvOptionOne, tvOptionThree, tvOptionTwo, tvProgress, tvQuestion);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
