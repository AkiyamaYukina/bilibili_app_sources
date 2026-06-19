package com.bilibili.studio.videoeditor.util;

import android.content.Context;
import android.view.View;
import android.widget.PopupWindow;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/util/A.class */
public final class A implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PopupWindow f110195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f110196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f110197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f110198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f110199e;

    public A(PopupWindow popupWindow, View view, View view2, Context context, int i7) {
        this.f110195a = popupWindow;
        this.f110196b = view;
        this.f110197c = view2;
        this.f110198d = context;
        this.f110199e = i7;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (view.getWindowToken() != null) {
            try {
                this.f110195a.showAsDropDown(this.f110196b, ((-(this.f110197c.getMeasuredWidth() - this.f110196b.getMeasuredWidth())) / 2) + DensityUtil.dp2px(this.f110198d, this.f110199e), DensityUtil.dp2px(this.f110198d, -81));
            } catch (Exception e7) {
                BLog.efmt("EditorGuideUtil", "handleShowCenterArrowGuide...onViewAttachedToWindow...e = %s", new Object[]{e7.fillInStackTrace()});
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
