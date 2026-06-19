package com.bilibili.ship.theseus.united.page.videoquality;

import com.bilibili.player.tangram.basic.c;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/P.class */
public final class P implements Function0<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f103736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0<Unit> f103737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f103738c;

    public P(T t7, Function0<Unit> function0, int i7) {
        this.f103736a = t7;
        this.f103737b = function0;
        this.f103738c = i7;
    }

    public final Object invoke() {
        T t7 = this.f103736a;
        PageReportService.g(t7.f103763f, "player.player.vip-vision-info.click.player", null, 6);
        this.f103737b.invoke();
        com.bilibili.ship.theseus.keel.player.h hVar = t7.f103758a;
        com.bilibili.player.tangram.basic.a aVarA = hVar.f91109c.a();
        int i7 = this.f103738c;
        if (!(aVarA == null ? false : com.bilibili.player.tangram.basic.a.b(aVarA.f79320a, i7)) || (hVar.f91109c.g() instanceof c.a)) {
            t7.f103762e.e(new c.b(i7));
        }
        return Unit.INSTANCE;
    }
}
