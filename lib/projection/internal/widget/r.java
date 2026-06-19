package com.bilibili.lib.projection.internal.widget;

import android.view.View;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.projection.internal.search.ProjectionHowToPrjFullActivity;
import com.bilibili.mobile.BLMobileHumanActionNative;
import com.bilibili.ship.theseus.cheese.biz.intro.primary.C6095p;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/r.class */
public final /* synthetic */ class r implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f64123a;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f64123a) {
            case 0:
                BLog.d("ZZC", "click sub title");
                int i7 = ProjectionHowToPrjFullActivity.f63570E;
                BLRouter.routeTo(new RouteRequest.Builder("bilibili://projection/guide-full").flags(BLMobileHumanActionNative.BL_MOBILE_ENABLE_DYNAMIC_GESTURE).build(), view.getContext());
                break;
            default:
                int i8 = C6095p.f89751g;
                break;
        }
    }
}
