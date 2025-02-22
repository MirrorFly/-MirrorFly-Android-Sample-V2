// Generated by view binder compiler. Do not edit!
package com.contusfly.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.emoji.widget.EmojiAppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.contusfly.R;
import com.contusfly.views.CircularImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class MessageChildItemBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout grpmeminfo;

  @NonNull
  public final CircularImageView imageChatPicture;

  @NonNull
  public final EmojiAppCompatTextView textChatName;

  @NonNull
  public final EmojiAppCompatTextView textUserStatus;

  private MessageChildItemBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout grpmeminfo,
      @NonNull CircularImageView imageChatPicture, @NonNull EmojiAppCompatTextView textChatName,
      @NonNull EmojiAppCompatTextView textUserStatus) {
    this.rootView = rootView;
    this.grpmeminfo = grpmeminfo;
    this.imageChatPicture = imageChatPicture;
    this.textChatName = textChatName;
    this.textUserStatus = textUserStatus;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static MessageChildItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static MessageChildItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.message_child_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static MessageChildItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.grpmeminfo;
      LinearLayout grpmeminfo = ViewBindings.findChildViewById(rootView, id);
      if (grpmeminfo == null) {
        break missingId;
      }

      id = R.id.image_chat_picture;
      CircularImageView imageChatPicture = ViewBindings.findChildViewById(rootView, id);
      if (imageChatPicture == null) {
        break missingId;
      }

      id = R.id.text_chat_name;
      EmojiAppCompatTextView textChatName = ViewBindings.findChildViewById(rootView, id);
      if (textChatName == null) {
        break missingId;
      }

      id = R.id.text_user_status;
      EmojiAppCompatTextView textUserStatus = ViewBindings.findChildViewById(rootView, id);
      if (textUserStatus == null) {
        break missingId;
      }

      return new MessageChildItemBinding((LinearLayout) rootView, grpmeminfo, imageChatPicture,
          textChatName, textUserStatus);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
