package com.bilibili.opd.app.bizcommon.mangapaysdk.view;

import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequestKt;
import com.bilibili.ship.theseus.united.page.intro.module.relate.DetailRelateService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/view/f.class */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f74149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f74150b;

    public /* synthetic */ f(Object obj, int i7) {
        this.f74149a = i7;
        this.f74150b = obj;
    }

    public final Object invoke(Object obj) {
        switch (this.f74149a) {
            case 0:
                BLRouter.routeTo(RouteRequestKt.toRouteRequest("https://www.bilibili.com/blackboard/activity-kOydTV2JWj.html").newBuilder().build(), (MangaPayFragment) this.f74150b);
                break;
            default:
                ((DetailRelateService) this.f74150b).h((DetailRelateService.c) obj);
                break;
        }
        return Unit.INSTANCE;
    }
}
