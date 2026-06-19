package com.bilibili.ship.theseus.united.page.error;

import android.view.View;
import com.bilibili.app.comm.aghanim.api.WebRequest;
import com.bilibili.app.screen.adjust.widget.z;
import com.bilibili.bilibili.giftPanel.biz.panel.p;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.mobile.BLMobileHumanActionNative;
import com.bilibili.ship.theseus.united.page.error.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/error/g.class */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f99613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f99614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f99615c;

    public /* synthetic */ g(int i7, Object obj, Object obj2) {
        this.f99613a = i7;
        this.f99614b = obj;
        this.f99615c = obj2;
    }

    public final Object invoke(Object obj) {
        switch (this.f99613a) {
            case 0:
                View view = (View) obj;
                if (Intrinsics.areEqual(a.C0984a.f99585a, (a) this.f99614b)) {
                    TheseusPageErrorStateService theseusPageErrorStateService = (TheseusPageErrorStateService) this.f99615c;
                    theseusPageErrorStateService.getClass();
                    BLRouter.routeTo(new RouteRequest.Builder("activity://main/go-to-answer").flags(BLMobileHumanActionNative.BL_MOBILE_ENABLE_DYNAMIC_GESTURE).requestCode(202).build(), theseusPageErrorStateService.f99574a);
                } else {
                    z.a(view);
                }
                break;
            default:
                ((WebRequest) obj).portrait(new p(3, (rJ.a) this.f99614b, (String) this.f99615c));
                break;
        }
        return Unit.INSTANCE;
    }
}
