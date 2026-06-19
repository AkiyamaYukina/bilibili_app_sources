package com.bilibili.tgwt.im.widget;

import android.text.TextPaint;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.bilibili.lib.theme.R$color;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/widget/t.class */
public final class t extends lV.z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f111470b;

    public t(m mVar) {
        this.f111470b = mVar;
    }

    public final void onClick(View view) {
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(ContextCompat.getColor(this.f111470b.getContext(), R$color.Ga10));
    }
}
