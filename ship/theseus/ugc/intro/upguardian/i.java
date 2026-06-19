package com.bilibili.ship.theseus.ugc.intro.upguardian;

import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upguardian/i.class */
public final /* synthetic */ class i implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UpGuardianService f97626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f97627b;

    public /* synthetic */ i(UpGuardianService upGuardianService, int i7) {
        this.f97626a = upGuardianService;
        this.f97627b = i7;
    }

    public final Object invoke() {
        HashMap map = new HashMap();
        UpGuardianService upGuardianService = this.f97626a;
        map.put("up_mid", String.valueOf(upGuardianService.f97582c.f()));
        com.bilibili.ship.theseus.united.page.view.a aVar = upGuardianService.f97583d;
        map.put(GameCardButton.extraAvid, aVar.b());
        map.put("cid", aVar.d());
        map.put("scene", String.valueOf(this.f97627b));
        PageReportService.i(upGuardianService.f97587i, "united.player-video-detail.up-guard.0.show", map, 4);
        return Unit.INSTANCE;
    }
}
