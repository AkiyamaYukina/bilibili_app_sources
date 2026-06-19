package com.bilibili.studio.videoeditor.util;

import android.view.View;
import tv.danmaku.android.log.BLog;

/* JADX INFO: renamed from: com.bilibili.studio.videoeditor.util.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/util/x.class */
public final class ViewOnAttachStateChangeListenerC6650x implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C6649w f110256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f110257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f110258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f110259d;

    public ViewOnAttachStateChangeListenerC6650x(C6649w c6649w, View view, int i7, int i8) {
        this.f110256a = c6649w;
        this.f110257b = view;
        this.f110258c = i7;
        this.f110259d = i8;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (view.getWindowToken() != null) {
            try {
                this.f110256a.showAsDropDown(this.f110257b, this.f110258c, this.f110259d);
            } catch (Exception e7) {
                BLog.efmt("EditorGuideUtil", "handleShowGuide...onViewAttachedToWindow...e = %s", new Object[]{e7.fillInStackTrace()});
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
