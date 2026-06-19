package com.bilibili.playerbizcommonv2.danmaku.widget;

import android.content.Context;
import android.view.View;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import lr0.C7887d;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/widget/j.class */
public final class j implements Cr0.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f81664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f81665b;

    public j(e eVar, Context context) {
        this.f81664a = eVar;
        this.f81665b = context;
    }

    @Override // Cr0.f
    public final CharSequence getTitle() {
        return this.f81665b.getResources().getString(2131846888);
    }

    @Override // Cr0.f
    public final View getView() {
        Context context = this.f81665b;
        e eVar = this.f81664a;
        if (eVar.f81644p == null) {
            eVar.f81644p = new C7887d(context, eVar, EditCustomizeSticker.TAG_MID);
        }
        C7887d c7887d = eVar.f81644p;
        if (c7887d != null) {
            c7887d.f123346d.setText(2131846907);
        }
        return eVar.f81644p.f123345c;
    }
}
