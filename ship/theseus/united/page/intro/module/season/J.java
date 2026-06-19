package com.bilibili.ship.theseus.united.page.intro.module.season;

import android.os.Bundle;
import com.bilibili.base.MainThread;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.studio.videoeditor.template.BiliTemplateEngineManager;
import com.bilibili.studio.videoeditor.template.C6609g;
import java.util.HashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import tv.danmaku.bili.fullscreen.state.M1;
import tv.danmaku.bili.fullscreen.state.N1;
import tv.danmaku.bili.fullscreen.state.O1;
import tv.danmaku.bili.fullscreen.state.Q1;
import tv.danmaku.bili.fullscreen.state.R1;
import tv.danmaku.bili.fullscreen.state.v0;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/J.class */
public final /* synthetic */ class J implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f101482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f101483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f101484c;

    public /* synthetic */ J(int i7, Object obj, Object obj2) {
        this.f101482a = i7;
        this.f101483b = obj;
        this.f101484c = obj2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
        Q1 r12;
        Object obj2 = this.f101484c;
        Object obj3 = this.f101483b;
        switch (this.f101482a) {
            case 0:
                long jLongValue = ((Long) obj).longValue();
                PageReportService pageReportService = ((UnitedSeasonPanelService) obj3).f101602m;
                HashMap map = new HashMap();
                map.put("goto_sectionid", String.valueOf(jLongValue));
                map.put("sectionid", ((Ref.ObjectRef) obj2).element);
                Unit unit = Unit.INSTANCE;
                PageReportService.g(pageReportService, "united.player-video-detail.drama-float.sectionid.click", map, 4);
                return Unit.INSTANCE;
            case 1:
                final Bundle bundle = (Bundle) obj2;
                final String str = (String) obj;
                final com.bilibili.upper.module.template.vm.g gVar = (com.bilibili.upper.module.template.vm.g) obj3;
                gVar.f114049d.postValue(101);
                gVar.O0();
                MainThread.runOnMainThread(new Function0(gVar, str, bundle) { // from class: com.bilibili.upper.module.template.vm.b

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final g f114031a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final String f114032b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final Bundle f114033c;

                    {
                        this.f114031a = gVar;
                        this.f114032b = str;
                        this.f114033c = bundle;
                    }

                    public final Object invoke() {
                        Bundle bundle2 = this.f114033c;
                        g gVar2 = this.f114031a;
                        String str2 = this.f114032b;
                        String str3 = str2;
                        if (str2 == null) {
                            str3 = "";
                        }
                        BiliTemplateEngineManager biliTemplateEngineManager = gVar2.f114047b;
                        biliTemplateEngineManager.getClass();
                        BiliTemplateEngineManager.c(biliTemplateEngineManager, false, true, false, new C6609g(biliTemplateEngineManager, null, str3, bundle2, 0), 4);
                        return Unit.INSTANCE;
                    }
                });
                return Unit.INSTANCE;
            default:
                N1 n12 = (v0) obj3;
                boolean z6 = n12 instanceof N1;
                M1 m1 = (M1) obj2;
                if (z6) {
                    r12 = new Q1(m1, n12.a.b, false);
                } else {
                    if (!(n12 instanceof O1)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    r12 = new R1(m1, false);
                }
                return r12;
        }
    }
}
