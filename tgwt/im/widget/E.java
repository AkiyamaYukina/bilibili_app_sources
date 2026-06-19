package com.bilibili.tgwt.im.widget;

import android.text.TextPaint;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.bilibili.lib.theme.R$color;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/widget/E.class */
public final class E extends lV.z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D f111379b;

    public E(D d7) {
        this.f111379b = d7;
    }

    public final void onClick(View view) {
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(ContextCompat.getColor(this.f111379b.getContext(), R$color.Wh0_u));
    }
}
