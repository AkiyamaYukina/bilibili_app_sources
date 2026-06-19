package com.bilibili.playerbizcommon.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.widget.TextSwitcher;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/view/TextSwitcherWithOptionAnimation.class */
public final class TextSwitcherWithOptionAnimation extends TextSwitcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public CharSequence f80370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Animation f80371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Animation f80372c;

    public TextSwitcherWithOptionAnimation(@Nullable Context context) {
        super(context);
    }

    public TextSwitcherWithOptionAnimation(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Nullable
    public final CharSequence getText() {
        return this.f80370a;
    }

    public final void setOptionInAnimation(@Nullable Animation animation) {
        this.f80371b = animation;
        setInAnimation(animation);
    }

    public final void setOptionOutAnimation(@Nullable Animation animation) {
        this.f80372c = animation;
        setOutAnimation(animation);
    }

    @Override // android.widget.TextSwitcher
    public void setText(@Nullable CharSequence charSequence) {
        this.f80370a = charSequence;
        super.setText(charSequence);
    }

    public final void setTextColor(@ColorInt int i7) {
        if (getChildCount() != 2) {
            return;
        }
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i7);
        View childAt = getChildAt(0);
        TextView textView = childAt instanceof TextView ? (TextView) childAt : null;
        if (textView != null) {
            textView.setTextColor(colorStateListValueOf);
        }
        View childAt2 = getChildAt(1);
        TextView textView2 = null;
        if (childAt2 instanceof TextView) {
            textView2 = (TextView) childAt2;
        }
        if (textView2 != null) {
            textView2.setTextColor(colorStateListValueOf);
        }
    }

    public final void setTextWithAnimation(@Nullable CharSequence charSequence) {
        if (!Intrinsics.areEqual(getInAnimation(), this.f80371b)) {
            setInAnimation(this.f80371b);
        }
        if (!Intrinsics.areEqual(getOutAnimation(), this.f80372c)) {
            setOutAnimation(this.f80372c);
        }
        setText(charSequence);
    }

    public final void setTextWithoutAnimation(@Nullable CharSequence charSequence) {
        if (Intrinsics.areEqual(this.f80370a, charSequence)) {
            return;
        }
        setInAnimation(null);
        setOutAnimation(null);
        setText(charSequence);
    }
}
