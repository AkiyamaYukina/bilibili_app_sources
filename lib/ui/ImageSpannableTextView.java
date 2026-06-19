package com.bilibili.lib.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.util.AttributeSet;
import android.widget.TextView;
import com.bilibili.magicasakura.widgets.TintTextView;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/ImageSpannableTextView.class */
public class ImageSpannableTextView extends TintTextView {
    private boolean mHasImages;

    public ImageSpannableTextView(Context context) {
        super(context);
    }

    public ImageSpannableTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ImageSpannableTextView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
    }

    public ImageSpan[] getImages() {
        if (this.mHasImages && length() > 0) {
            CharSequence text = getText();
            if (text instanceof Spanned) {
                return (ImageSpan[]) ((Spanned) text).getSpans(0, length(), ImageSpan.class);
            }
        }
        return new ImageSpan[0];
    }

    @Override // android.widget.TextView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        if (this.mHasImages) {
            invalidate();
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public boolean isHasImages() {
        return this.mHasImages;
    }

    public void onAttach() {
        for (ImageSpan imageSpan : getImages()) {
            imageSpan.onAttach(this);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // com.bilibili.magicasakura.widgets.TintTextView, android.widget.TextView, android.view.View
    public void onAttachedToWindow() throws NoWhenBranchMatchedException {
        super.onAttachedToWindow();
        onAttach();
    }

    public void onDetach() {
        for (ImageSpan imageSpan : getImages()) {
            Drawable drawable = imageSpan.getDrawable();
            if (drawable != null) {
                unscheduleDrawable(drawable);
            }
            imageSpan.onDetach();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        onDetach();
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        onAttach();
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        onDetach();
    }

    public void onTextSet(CharSequence charSequence) {
        if (this.mHasImages) {
            onDetach();
            this.mHasImages = false;
        }
        if (charSequence instanceof Spanned) {
            ImageSpan[] imageSpanArr = (ImageSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ImageSpan.class);
            boolean z6 = false;
            if (imageSpanArr != null) {
                z6 = false;
                if (imageSpanArr.length > 0) {
                    z6 = true;
                }
            }
            this.mHasImages = z6;
        }
    }

    public void setHasImages(boolean z6) {
        this.mHasImages = z6;
    }

    public void setSpannableText(CharSequence charSequence) {
        setText(charSequence, TextView.BufferType.SPANNABLE);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        onTextSet(charSequence);
        super.setText(charSequence, bufferType);
    }
}
