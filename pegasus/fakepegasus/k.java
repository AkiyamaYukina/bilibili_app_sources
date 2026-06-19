package com.bilibili.pegasus.fakepegasus;

import android.content.res.Resources;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.pegasus.utils.x;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/fakepegasus/k.class */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f77467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f77468b;

    static {
        int iO = x.o((int) ((Resources.getSystem().getDisplayMetrics().widthPixels - (ListExtentionsKt.toPx(8.0f) * 3)) / 2.0f));
        f77467a = iO;
        f77468b = (int) ((iO * 10.0f) / 16);
    }
}
