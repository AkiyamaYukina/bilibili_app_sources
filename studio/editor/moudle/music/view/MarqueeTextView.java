package com.bilibili.studio.editor.moudle.music.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/music/view/MarqueeTextView.class */
public final class MarqueeTextView extends AppCompatTextView {
    @JvmOverloads
    public MarqueeTextView(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public MarqueeTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public MarqueeTextView(Context context, AttributeSet attributeSet, int i7) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    @Override // android.widget.TextView, android.view.View
    public void setSelected(boolean z6) {
        if (z6) {
            requestFocus();
            setEllipsize(TextUtils.TruncateAt.MARQUEE);
        } else {
            setEllipsize(TextUtils.TruncateAt.END);
        }
        super.setSelected(z6);
    }
}
