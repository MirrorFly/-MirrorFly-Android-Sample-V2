// Generated by view binder compiler. Do not edit!
package com.contusfly.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.contusfly.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FrequencyDialogBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatButton cancelBtn;

  @NonNull
  public final ConstraintLayout dailyBox;

  @NonNull
  public final AppCompatImageView dailyImage;

  @NonNull
  public final AppCompatTextView dailyTitle;

  @NonNull
  public final AppCompatTextView dialogTitle;

  @NonNull
  public final ConstraintLayout monthlyBox;

  @NonNull
  public final AppCompatImageView monthlyImage;

  @NonNull
  public final AppCompatTextView monthlyTitle;

  @NonNull
  public final LinearLayout optionBox;

  @NonNull
  public final ConstraintLayout weeklyBox;

  @NonNull
  public final AppCompatImageView weeklyImage;

  @NonNull
  public final AppCompatTextView weeklyTitle;

  private FrequencyDialogBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatButton cancelBtn, @NonNull ConstraintLayout dailyBox,
      @NonNull AppCompatImageView dailyImage, @NonNull AppCompatTextView dailyTitle,
      @NonNull AppCompatTextView dialogTitle, @NonNull ConstraintLayout monthlyBox,
      @NonNull AppCompatImageView monthlyImage, @NonNull AppCompatTextView monthlyTitle,
      @NonNull LinearLayout optionBox, @NonNull ConstraintLayout weeklyBox,
      @NonNull AppCompatImageView weeklyImage, @NonNull AppCompatTextView weeklyTitle) {
    this.rootView = rootView;
    this.cancelBtn = cancelBtn;
    this.dailyBox = dailyBox;
    this.dailyImage = dailyImage;
    this.dailyTitle = dailyTitle;
    this.dialogTitle = dialogTitle;
    this.monthlyBox = monthlyBox;
    this.monthlyImage = monthlyImage;
    this.monthlyTitle = monthlyTitle;
    this.optionBox = optionBox;
    this.weeklyBox = weeklyBox;
    this.weeklyImage = weeklyImage;
    this.weeklyTitle = weeklyTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FrequencyDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FrequencyDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.frequency_dialog, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FrequencyDialogBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cancelBtn;
      AppCompatButton cancelBtn = ViewBindings.findChildViewById(rootView, id);
      if (cancelBtn == null) {
        break missingId;
      }

      id = R.id.dailyBox;
      ConstraintLayout dailyBox = ViewBindings.findChildViewById(rootView, id);
      if (dailyBox == null) {
        break missingId;
      }

      id = R.id.dailyImage;
      AppCompatImageView dailyImage = ViewBindings.findChildViewById(rootView, id);
      if (dailyImage == null) {
        break missingId;
      }

      id = R.id.dailyTitle;
      AppCompatTextView dailyTitle = ViewBindings.findChildViewById(rootView, id);
      if (dailyTitle == null) {
        break missingId;
      }

      id = R.id.dialogTitle;
      AppCompatTextView dialogTitle = ViewBindings.findChildViewById(rootView, id);
      if (dialogTitle == null) {
        break missingId;
      }

      id = R.id.monthlyBox;
      ConstraintLayout monthlyBox = ViewBindings.findChildViewById(rootView, id);
      if (monthlyBox == null) {
        break missingId;
      }

      id = R.id.monthlyImage;
      AppCompatImageView monthlyImage = ViewBindings.findChildViewById(rootView, id);
      if (monthlyImage == null) {
        break missingId;
      }

      id = R.id.monthlyTitle;
      AppCompatTextView monthlyTitle = ViewBindings.findChildViewById(rootView, id);
      if (monthlyTitle == null) {
        break missingId;
      }

      id = R.id.optionBox;
      LinearLayout optionBox = ViewBindings.findChildViewById(rootView, id);
      if (optionBox == null) {
        break missingId;
      }

      id = R.id.weeklyBox;
      ConstraintLayout weeklyBox = ViewBindings.findChildViewById(rootView, id);
      if (weeklyBox == null) {
        break missingId;
      }

      id = R.id.weeklyImage;
      AppCompatImageView weeklyImage = ViewBindings.findChildViewById(rootView, id);
      if (weeklyImage == null) {
        break missingId;
      }

      id = R.id.weeklyTitle;
      AppCompatTextView weeklyTitle = ViewBindings.findChildViewById(rootView, id);
      if (weeklyTitle == null) {
        break missingId;
      }

      return new FrequencyDialogBinding((ConstraintLayout) rootView, cancelBtn, dailyBox,
          dailyImage, dailyTitle, dialogTitle, monthlyBox, monthlyImage, monthlyTitle, optionBox,
          weeklyBox, weeklyImage, weeklyTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
