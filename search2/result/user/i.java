package com.bilibili.search2.result.user;

import android.content.Context;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.blrouter.RouteRequestKt;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.tgwt.square.CommonCard;
import com.bilibili.tgwt.square.WaitRoom;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/user/i.class */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f88556a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f88557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f88558c;

    public /* synthetic */ i(j jVar, Ref.LongRef longRef) {
        this.f88557b = jVar;
        this.f88558c = longRef;
    }

    public /* synthetic */ i(CommonCard commonCard, String str) {
        this.f88557b = commonCard;
        this.f88558c = str;
    }

    public final Object invoke(Object obj) {
        Object obj2 = this.f88558c;
        Object obj3 = this.f88557b;
        switch (this.f88556a) {
            case 0:
                j jVar = (j) obj3;
                if (((Boolean) obj).booleanValue()) {
                    Os0.e eVar = Os0.e.f18030a;
                    BLRouter.routeTo(new RouteRequest.Builder("bilibili://space/:mid/").extras(new Os0.d(((Ref.LongRef) obj2).element)).requestCode(101).build(), jVar.f88560a.get());
                }
                Xs0.b.i("search.user-search.user-search.all.click", "pr", "app-user", (BaseSearchItem) jVar.getData(), null, null, null, null, null, jVar.f88572n, false, null, 6144);
                break;
            default:
                Context context = (Context) obj;
                WaitRoom waitRoom = ((CommonCard) obj3).f112028k;
                if (waitRoom == null || !waitRoom.f112100j) {
                    Qj0.g.c(context, RouteRequestKt.toRouteRequest((String) obj2));
                } else {
                    ToastHelper.showToastShort(context, 2131836251);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
