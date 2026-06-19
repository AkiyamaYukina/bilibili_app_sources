package com.bilibili.pegasus.holders;

import android.view.View;
import android.view.ViewGroup;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.magicasakura.widgets.TintView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/n1.class */
public final class n1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f77903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k1 f77904b;

    public n1(View view, k1 k1Var) {
        this.f77903a = view;
        this.f77904b = k1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TintView tintView = this.f77904b.f77887f.f53847k;
        ViewGroup.LayoutParams layoutParams = tintView.getLayoutParams();
        layoutParams.width = this.f77904b.f77887f.h.getWidth() - ListExtentionsKt.toPx(2);
        tintView.setLayoutParams(layoutParams);
    }
}
