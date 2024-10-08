package com.route

import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.google.android.material.textfield.TextInputLayout

@BindingAdapter("error")
fun bindErrorOnTextInputLayout(
    textInputLayout: TextInputLayout,
    errorMessage: String?
) {
    textInputLayout.error = errorMessage


}

@BindingAdapter("text")
fun bindStringInTextView(textView: TextView, title: String?) {
    textView.setText(title)
}

@BindingAdapter("textId")
fun bindStringInTextViewUsingId(textView: TextView, titleId: Int) {
    textView.setText(titleId)
}

@BindingAdapter("imageId")
fun bindImageUsingImageId(imageView: ImageView, imageId: Int) {
    imageView.setImageResource(imageId)
}

