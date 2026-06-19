package com.bilibili.opd.app.bizcommon.mangapaysdk.view;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/view/p.class */
public final class p extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1<String, Unit> f74158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f74159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f74160c;

    public p(int i7, String str, Function1 function1) {
        this.f74158a = function1;
        this.f74159b = str;
        this.f74160c = i7;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Function1<String, Unit> function1 = this.f74158a;
        if (function1 != null) {
            function1.invoke(this.f74159b);
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(this.f74160c);
        textPaint.setUnderlineText(false);
    }
}
