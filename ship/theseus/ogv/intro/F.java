package com.bilibili.ship.theseus.ogv.intro;

import android.content.Context;
import com.bilibili.lib.media.resource.ExtraInfo;
import com.bilibili.ship.theseus.ogv.pay.PopWinVo;
import com.bilibili.ship.theseus.united.page.restrictionlayer.C6380e;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/F.class */
public final class F implements com.bilibili.ship.theseus.united.page.restrictionlayer.t<C6380e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.bilibili.ship.theseus.united.page.screenstate.c f92210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.bilibili.ship.theseus.keel.player.h f92211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StateFlow f92212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.bilibili.ship.theseus.ogv.intro.coupon.e f92213d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f92214e;

    public F(com.bilibili.ship.theseus.united.page.screenstate.c cVar, com.bilibili.ship.theseus.keel.player.h hVar, StateFlow stateFlow, com.bilibili.ship.theseus.ogv.intro.coupon.e eVar, Context context) {
        this.f92210a = cVar;
        this.f92211b = hVar;
        this.f92212c = stateFlow;
        this.f92213d = eVar;
        this.f92214e = context;
    }

    @Override // com.bilibili.ship.theseus.united.page.restrictionlayer.t
    public final void a(C6380e c6380e) {
        this.f92210a.g();
        this.f92211b.pause();
        ExtraInfo extraInfo = (ExtraInfo) this.f92212c.getValue();
        PopWinVo popWinVo = extraInfo != null ? (PopWinVo) Ju0.a.f11699f.a(extraInfo) : null;
        if (popWinVo == null || popWinVo.f94176d.isEmpty()) {
            return;
        }
        this.f92213d.a(this.f92214e, popWinVo).show();
    }

    @Override // com.bilibili.ship.theseus.united.page.restrictionlayer.t
    public final Class<C6380e> b() {
        return C6380e.class;
    }
}
