package com.bilibili.playerbizcommonv2.danmaku.widget;

import android.content.Context;
import android.view.View;
import lr0.C7887d;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/widget/i.class */
public final class i implements Cr0.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f81662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f81663b;

    public i(e eVar, Context context) {
        this.f81662a = eVar;
        this.f81663b = context;
    }

    @Override // Cr0.f
    public final CharSequence getTitle() {
        return this.f81663b.getResources().getString(2131846957);
    }

    @Override // Cr0.f
    public final View getView() {
        Context context = this.f81663b;
        e eVar = this.f81662a;
        if (eVar.f81643o == null) {
            eVar.f81643o = new C7887d(context, eVar, "regular");
        }
        C7887d c7887d = eVar.f81643o;
        if (c7887d != null) {
            c7887d.f123346d.setText(2131845531);
        }
        return eVar.f81643o.f123345c;
    }
}
