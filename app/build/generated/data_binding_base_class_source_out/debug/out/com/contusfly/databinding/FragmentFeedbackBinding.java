// Generated by view binder compiler. Do not edit!
package com.contusfly.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.contusfly.R;
import com.contusfly.spinnerview.MaterialSpinner;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentFeedbackBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final AppCompatButton buttonDeleteAccount;

  @NonNull
  public final AppCompatEditText descriptionEditText;

  @NonNull
  public final MaterialSpinner reasonSpinner;

  private FragmentFeedbackBinding(@NonNull ScrollView rootView,
      @NonNull AppCompatButton buttonDeleteAccount, @NonNull AppCompatEditText descriptionEditText,
      @NonNull MaterialSpinner reasonSpinner) {
    this.rootView = rootView;
    this.buttonDeleteAccount = buttonDeleteAccount;
    this.descriptionEditText = descriptionEditText;
    this.reasonSpinner = reasonSpinner;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentFeedbackBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentFeedbackBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_feedback, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentFeedbackBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button_delete_account;
      AppCompatButton buttonDeleteAccount = ViewBindings.findChildViewById(rootView, id);
      if (buttonDeleteAccount == null) {
        break missingId;
      }

      id = R.id.description_edit_text;
      AppCompatEditText descriptionEditText = ViewBindings.findChildViewById(rootView, id);
      if (descriptionEditText == null) {
        break missingId;
      }

      id = R.id.reason_spinner;
      MaterialSpinner reasonSpinner = ViewBindings.findChildViewById(rootView, id);
      if (reasonSpinner == null) {
        break missingId;
      }

      return new FragmentFeedbackBinding((ScrollView) rootView, buttonDeleteAccount,
          descriptionEditText, reasonSpinner);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
