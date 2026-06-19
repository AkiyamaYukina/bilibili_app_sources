package com.bilibili.playerbizcommonv2.danmaku.widget;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/widget/f.class */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f81655a;

    public f(e eVar) {
        this.f81655a = eVar;
    }

    public final void a(String str) {
        e eVar = this.f81655a;
        View view = eVar.f81635f;
        if (view != null) {
            view.setEnabled(true);
        }
        if (TextUtils.isEmpty(str)) {
            eVar.l(eVar.getMContext().getString(2131847154));
        } else {
            eVar.l(str);
        }
        eVar.k(false);
    }
}
