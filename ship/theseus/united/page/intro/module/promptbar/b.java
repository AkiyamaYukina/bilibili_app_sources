package com.bilibili.ship.theseus.united.page.intro.module.promptbar;

import com.bilibili.ship.theseus.united.page.playviewextra.PromptBarVo;
import com.bilibili.ship.theseus.united.page.restrictionlayer.ReportVo;
import com.bilibili.ship.theseus.united.page.restrictionlayer.TextVo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/promptbar/b.class */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PromptBarVo f100696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f100697b;

    public /* synthetic */ b(PromptBarVo promptBarVo, c cVar) {
        this.f100696a = promptBarVo;
        this.f100697b = cVar;
    }

    public final Object invoke() {
        PromptBarVo promptBarVo = this.f100696a;
        ReportVo reportVo = promptBarVo.f102400g;
        c cVar = this.f100697b;
        if (reportVo != null) {
            if (reportVo.d().length() > 0) {
                cVar.d(reportVo.d(), reportVo.c());
            }
            String strD = reportVo.d();
            String str = strD;
            if (strD.length() == 0) {
                str = "united.player-video-detail.vip-banner.button.show";
            }
            cVar.h.a(str, null, reportVo.c());
        }
        for (TextVo textVo : promptBarVo.d()) {
            ReportVo reportVoL = textVo.l();
            String strD2 = reportVoL != null ? reportVoL.d() : null;
            if (strD2 != null && strD2.length() != 0) {
                cVar.d(strD2, textVo.l().c());
            }
        }
        return Unit.INSTANCE;
    }
}
