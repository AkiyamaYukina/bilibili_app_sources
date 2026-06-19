package com.bilibili.ship.theseus.ogv.intro;

import android.content.Context;
import androidx.activity.ComponentActivity;
import com.bilibili.community.follow.FollowSeasonStatus;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.media.resource.ExtraInfo;
import com.bilibili.ship.theseus.ogv.pay.OgvPayService;
import com.bilibili.ship.theseus.ogv.pay.PopWinVo;
import com.bilibili.ship.theseus.ogv.pay.j;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.StateFlow;
import xl0.C8986a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/J.class */
public final class J implements com.bilibili.ship.theseus.united.page.restrictionlayer.t<com.bilibili.ship.theseus.united.page.restrictionlayer.r> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StateFlow f92224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.bilibili.ship.theseus.united.page.screenstate.c f92225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.bilibili.ship.theseus.keel.player.h f92226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yW0.b f92227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BiliAccounts f92228e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ComponentActivity f92229f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final OgvSeason f92230g;
    public final OgvPayService h;

    public J(StateFlow stateFlow, com.bilibili.ship.theseus.united.page.screenstate.c cVar, com.bilibili.ship.theseus.keel.player.h hVar, yW0.b bVar, BiliAccounts biliAccounts, ComponentActivity componentActivity, OgvSeason ogvSeason, OgvPayService ogvPayService) {
        this.f92224a = stateFlow;
        this.f92225b = cVar;
        this.f92226c = hVar;
        this.f92227d = bVar;
        this.f92228e = biliAccounts;
        this.f92229f = componentActivity;
        this.f92230g = ogvSeason;
        this.h = ogvPayService;
    }

    @Override // com.bilibili.ship.theseus.united.page.restrictionlayer.t
    public final void a(com.bilibili.ship.theseus.united.page.restrictionlayer.r rVar) {
        boolean z6 = rVar.f102757a;
        com.bilibili.ship.theseus.keel.player.h hVar = this.f92226c;
        com.bilibili.ship.theseus.united.page.screenstate.c cVar = this.f92225b;
        if (z6) {
            ExtraInfo extraInfo = (ExtraInfo) this.f92224a.getValue();
            PopWinVo popWinVo = null;
            if (extraInfo != null) {
                PopWinVo popWinVo2 = (PopWinVo) Ju0.a.f11699f.a(extraInfo);
                popWinVo = null;
                if (popWinVo2 != null) {
                    popWinVo = null;
                    if (popWinVo2.b() == PopWinVo.Type.COMMON) {
                        popWinVo = popWinVo2;
                    }
                }
            }
            if (popWinVo != null) {
                cVar.g();
                hVar.pause();
                com.bilibili.ship.theseus.ogv.pay.j jVar = (com.bilibili.ship.theseus.ogv.pay.j) this.f92227d.get();
                jVar.getClass();
                new j.a(jVar, popWinVo).show();
                return;
            }
        }
        cVar.g();
        hVar.pause();
        if (!this.f92228e.isLogin()) {
            Qj0.g.e(this.f92229f, C8986a.a());
            return;
        }
        if (this.f92230g.f94461n.f94503b) {
            OgvPayService.a(this.h, null, null, null, null, 15);
            return;
        }
        final OgvPayService ogvPayService = this.h;
        ogvPayService.getClass();
        Context context = ogvPayService.f94154c;
        OgvSeason ogvSeason = ogvPayService.f94156e;
        String str = ogvSeason.f94453e;
        String strA = ogvSeason.f94461n.a();
        String str2 = strA;
        if (strA == null) {
            str2 = "";
        }
        com.bilibili.community.follow.c cVar2 = com.bilibili.community.follow.c.a;
        com.bilibili.community.follow.b bVar = (com.bilibili.community.follow.b) com.bilibili.community.follow.c.c.c(com.bilibili.community.follow.c.a(ogvPayService.f94161k));
        com.bilibili.community.follow.b bVar2 = bVar;
        if (bVar == null) {
            bVar2 = new com.bilibili.community.follow.b(false, FollowSeasonStatus.UNKNOWN);
        }
        com.bilibili.ship.theseus.ogv.pay.a aVar = new com.bilibili.ship.theseus.ogv.pay.a(context, str, str2, bVar2.a, com.bilibili.ogv.pub.season.b.a(ogvSeason.f94450b));
        aVar.h = new Function1(ogvPayService) { // from class: com.bilibili.ship.theseus.ogv.pay.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final OgvPayService f94188a;

            {
                this.f94188a = ogvPayService;
            }

            public final Object invoke(Object obj) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                OgvPayService ogvPayService2 = this.f94188a;
                long j7 = ogvPayService2.f94161k;
                com.bilibili.community.follow.c cVar3 = com.bilibili.community.follow.c.a;
                com.bilibili.community.follow.b bVar3 = (com.bilibili.community.follow.b) com.bilibili.community.follow.c.c.c(com.bilibili.community.follow.c.a(j7));
                com.bilibili.community.follow.b bVar4 = bVar3;
                if (bVar3 == null) {
                    bVar4 = new com.bilibili.community.follow.b(false, FollowSeasonStatus.UNKNOWN);
                }
                if (zBooleanValue && !bVar4.a) {
                    BuildersKt.launch$default(ogvPayService2.f94152a, (CoroutineContext) null, (CoroutineStart) null, new OgvPayService$showPayTipUnStartDialog$1$1(ogvPayService2, null), 3, (Object) null);
                }
                OgvPayService.a(ogvPayService2, null, null, null, null, 14);
                return Unit.INSTANCE;
            }
        };
        aVar.show();
    }

    @Override // com.bilibili.ship.theseus.united.page.restrictionlayer.t
    public final Class<com.bilibili.ship.theseus.united.page.restrictionlayer.r> b() {
        return com.bilibili.ship.theseus.united.page.restrictionlayer.r.class;
    }
}
