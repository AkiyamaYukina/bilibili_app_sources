package com.bilibili.teenagersmode.osteen;

import android.app.Activity;
import android.content.Context;
import com.bilibili.base.BiliContext;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/osteen/c.class */
public final class c extends BiliContext.ActivityStateCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f110587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f110588b;

    public c(d dVar, Context context) {
        this.f110587a = dVar;
        this.f110588b = context;
    }

    public final void onVisibleCountChanged(Activity activity, int i7, int i8) {
        super.onVisibleCountChanged(activity, i7, i8);
        if (i7 > 0 || i8 <= 0) {
            return;
        }
        this.f110587a.f110589a.setValue(new com.bilibili.app.comm.restrict.f(d.f(this.f110588b), com.bilibili.app.comm.restrict.c.a(d.e(this.f110588b))));
    }
}
