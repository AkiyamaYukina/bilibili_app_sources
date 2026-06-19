package com.bilibili.upper.module.cover.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover/ui/n.class */
public final class n extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f112775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UpperCoverSettingActivity f112776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f112777c;

    public n(String str, UpperCoverSettingActivity upperCoverSettingActivity, int i7) {
        this.f112775a = str;
        this.f112776b = upperCoverSettingActivity;
        this.f112777c = i7;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        BLRouter.routeTo(new RouteRequest.Builder(this.f112775a).build(), this.f112776b);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.f112777c);
        textPaint.setUnderlineText(true);
    }
}
