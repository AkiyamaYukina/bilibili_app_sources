package com.bilibili.playerbizcommonv2.danmaku.widget;

import android.content.Context;
import android.view.View;
import lr0.C7887d;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/widget/h.class */
public final class h implements Cr0.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f81660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f81661b;

    public h(e eVar, Context context) {
        this.f81660a = eVar;
        this.f81661b = context;
    }

    @Override // Cr0.f
    public final CharSequence getTitle() {
        return this.f81661b.getResources().getString(2131845719);
    }

    @Override // Cr0.f
    public final View getView() {
        Context context = this.f81661b;
        e eVar = this.f81660a;
        if (eVar.f81642n == null) {
            eVar.f81642n = new C7887d(context, eVar, "string");
        }
        C7887d c7887d = eVar.f81642n;
        if (c7887d != null) {
            c7887d.f123346d.setText(2131846623);
        }
        return eVar.f81642n.f123345c;
    }
}
