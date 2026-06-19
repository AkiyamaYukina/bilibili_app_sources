package com.bilibili.pegasus.widgets;

import QK.I;
import android.view.View;
import com.bilibili.bililive.infra.log.LiveLog;
import com.bilibili.bililive.infra.log.LiveLogDelegate;
import com.bilibili.bililive.room.ui.common.tab.top.LiveRoomGoldRankFragmentV3;
import com.bilibili.pegasus.PegasusInlineVolumeMode;
import com.bilibili.ship.theseus.united.page.intro.module.kingposition.C6289c;
import com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionComponent2;
import com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService;
import com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionType;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/widgets/g.class */
public final /* synthetic */ class g implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f79236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f79237b;

    public /* synthetic */ g(Object obj, int i7) {
        this.f79236a = i7;
        this.f79237b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        str = "";
        switch (this.f79236a) {
            case 0:
                InlineVolumeModeSettingView inlineVolumeModeSettingView = (InlineVolumeModeSettingView) this.f79237b;
                int i7 = InlineVolumeModeSettingView.h;
                com.bilibili.pegasus.promo.setting.c.a();
                inlineVolumeModeSettingView.f79176e.setVisibility(0);
                inlineVolumeModeSettingView.f79177f.setVisibility(8);
                com.bilibili.pegasus.k kVar = inlineVolumeModeSettingView.f79178g;
                PegasusInlineVolumeMode pegasusInlineVolumeModeA = null;
                if (kVar != null) {
                    pegasusInlineVolumeModeA = kVar.a();
                }
                if (InlineVolumeModeSettingView.c(pegasusInlineVolumeModeA)) {
                    return;
                }
                com.bilibili.pegasus.k kVar2 = inlineVolumeModeSettingView.f79178g;
                if (kVar2 != null) {
                    kVar2.b(PegasusInlineVolumeMode.MODE_USER_OPEN);
                }
                InlineVolumeModeSettingView.d(true);
                return;
            case 1:
                KingPositionService.d dVar = ((KingPositionComponent2.DisLikeComponent) this.f79237b).f100257a;
                if (dVar.f()) {
                    C6289c c6289c = (C6289c) ((LinkedHashMap) dVar.f100413a.f100470a).get(KingPositionType.DISLIKE);
                    String str2 = str;
                    if (c6289c != null) {
                        str2 = c6289c.f100460c;
                        if (str2 == null) {
                            str2 = str;
                        }
                    }
                    com.bilibili.ship.theseus.united.utils.q.c(str2);
                    return;
                }
                KingPositionService kingPositionService = dVar.h;
                PageReportService pageReportService = kingPositionService.f100389t;
                Map mapCreateMapBuilder = MapsKt.createMapBuilder();
                mapCreateMapBuilder.put("action_type", kingPositionService.h.h() ? "2" : "1");
                Unit unit = Unit.INSTANCE;
                PageReportService.g(pageReportService, "united.player-video-detail.user-action.unlike.click", MapsKt.build(mapCreateMapBuilder), 4);
                kingPositionService.c(true);
                return;
            default:
                LiveRoomGoldRankFragmentV3 liveRoomGoldRankFragmentV3 = (LiveRoomGoldRankFragmentV3) this.f79237b;
                int i8 = LiveRoomGoldRankFragmentV3.P;
                liveRoomGoldRankFragmentV3.getClass();
                LiveLog.Companion companion = LiveLog.Companion;
                if (companion.matchLevel(3)) {
                    str = "mTvRankOnline click" != 0 ? "mTvRankOnline click" : "";
                    LiveLogDelegate logDelegate = companion.getLogDelegate();
                    if (logDelegate != null) {
                        LiveLogDelegate.onLog$default(logDelegate, 3, "BaseRoomLiveRankFragmentV3", str, (Throwable) null, 8, (Object) null);
                    }
                    BLog.i("BaseRoomLiveRankFragmentV3", str);
                }
                I i9 = (com.bilibili.bililive.room.ui.roomv3.base.viewmodel.f) liveRoomGoldRankFragmentV3.jf().c.get(I.class);
                if (!(i9 instanceof I)) {
                    throw new IllegalStateException(I.class.getName().concat(" was not injected !"));
                }
                I i10 = i9;
                i10.getClass();
                com.bilibili.bililive.room.biz.hybrid.a aVar = (com.bilibili.bililive.room.biz.hybrid.a) eE.b.b.a().a.a(((com.bilibili.bililive.room.ui.roomv3.base.viewmodel.f) i10).d.e, com.bilibili.bililive.room.biz.hybrid.a.class);
                if (aVar != null) {
                    aVar.M(1, "https://live.bilibili.com/p/contribute-rank-description-h5/index.html?is_live_half_webview=1&hybrid_half_ui=1,3,100p,70p,0,0,30,100,12,0;2,2,375,100p,0,0,30,100,0,0;3,3,100p,70p,0,0,30,100,12,0;4,2,375,100p,0,0,30,100,0,0;5,3,100p,70p,0,0,30,100,12,0;6,3,100p,70p,0,0,30,100,12,0;7,3,100p,70p,0,0,30,100,12,0;8,3,100p,70p,0,0,30,100,0,0", false);
                    return;
                }
                return;
        }
    }
}
