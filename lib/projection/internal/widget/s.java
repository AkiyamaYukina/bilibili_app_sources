package com.bilibili.lib.projection.internal.widget;

import android.view.View;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.projection.internal.search.ProjectionHowToPrjFullActivity;
import com.bilibili.mobile.BLMobileHumanActionNative;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/s.class */
public final /* synthetic */ class s implements View.OnClickListener {
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        BLog.d("ZZC", "click sub title icon");
        int i7 = ProjectionHowToPrjFullActivity.f63570E;
        BLRouter.routeTo(new RouteRequest.Builder("bilibili://projection/guide-full").flags(BLMobileHumanActionNative.BL_MOBILE_ENABLE_DYNAMIC_GESTURE).build(), view.getContext());
    }
}
