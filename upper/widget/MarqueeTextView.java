package com.bilibili.upper.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.magicasakura.widgets.TintTextView;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/MarqueeTextView.class */
@StabilityInferred(parameters = 0)
public final class MarqueeTextView extends TintTextView {
    public MarqueeTextView(@Nullable Context context) {
        this(context, null);
    }

    public MarqueeTextView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setEllipsize(TextUtils.TruncateAt.MARQUEE);
        setMarqueeRepeatLimit(-1);
        setSingleLine();
        setFocusable(true);
        setTextIsSelectable(false);
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return true;
    }
}
