package com.bilibili.ship.theseus.united.page.intro.module.relate.footer;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.bilibili.lib.theme.R$color;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/footer/b.class */
public final class b extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f101198a;

    public b(Context context) {
        this.f101198a = context;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(ContextCompat.getColor(this.f101198a, R$color.Brand_pink));
        textPaint.setUnderlineText(false);
    }
}
