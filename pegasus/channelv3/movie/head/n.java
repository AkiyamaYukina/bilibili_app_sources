package com.bilibili.pegasus.channelv3.movie.head;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/head/n.class */
public final class n implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f75445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gl.m f75446b;

    public n(m mVar, gl.m mVar2) {
        this.f75445a = mVar;
        this.f75446b = mVar2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        view.removeOnLayoutChangeListener(this);
        ConstraintLayout constraintLayout = this.f75445a.a().j;
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = this.f75446b.f.getHeight() + marginLayoutParams.topMargin;
        constraintLayout.setLayoutParams(marginLayoutParams);
    }
}
