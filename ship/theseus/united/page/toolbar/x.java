package com.bilibili.ship.theseus.united.page.toolbar;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import tv.danmaku.biliplayerv2.service.report.NeuronsEvents;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/x.class */
public final /* synthetic */ class x implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MenuService f103456a;

    public final Object invoke(Object obj, Object obj2) {
        long jLongValue = ((Long) obj).longValue();
        this.f103456a.f103253l.report(new NeuronsEvents.NormalEvent("player.player.sleep-timer-panel.0.player", new String[]{"sleeptimer_time", jLongValue == 0 ? "off" : String.valueOf(jLongValue)}));
        return Unit.INSTANCE;
    }
}
