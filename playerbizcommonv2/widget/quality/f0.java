package com.bilibili.playerbizcommonv2.widget.quality;

import com.bilibili.ship.theseus.united.page.videoquality.BuyVipScene;
import com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerVipQualityTrialService;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import tv.danmaku.biliplayerv2.service.report.NeuronsEvents;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/quality/f0.class */
public final /* synthetic */ class f0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f82816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f82817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f82818c;

    public /* synthetic */ f0(int i7, Object obj, Object obj2) {
        this.f82816a = i7;
        this.f82817b = obj;
        this.f82818c = obj2;
    }

    public final Object invoke() {
        switch (this.f82816a) {
            case 0:
                ((Function1) this.f82817b).invoke(Boolean.valueOf(!((Boolean) this.f82818c).booleanValue()));
                break;
            default:
                TheseusPlayerVipQualityTrialService theseusPlayerVipQualityTrialService = ((com.bilibili.ship.theseus.united.page.videoquality.E) this.f82817b).f103702a;
                String str = ((sk.a) this.f82818c).b;
                String str2 = str;
                if (str == null) {
                    str2 = "";
                }
                com.bilibili.player.tangram.basic.a aVarX = theseusPlayerVipQualityTrialService.f103821g.x();
                BuyVipScene buyVipScene = BuyVipScene.QUALITY_SWITCH_PANEL;
                Map<String, String> mapEmptyMap = MapsKt.emptyMap();
                if (!theseusPlayerVipQualityTrialService.d() || !CollectionsKt.contains(theseusPlayerVipQualityTrialService.g(), aVarX)) {
                    aVarX = null;
                }
                theseusPlayerVipQualityTrialService.h(buyVipScene, str2, mapEmptyMap, aVarX);
                theseusPlayerVipQualityTrialService.f103819e.report(new NeuronsEvents.b("player.player.quality-list.pay-btn-click.player", (Map) null));
                break;
        }
        return Unit.INSTANCE;
    }
}
