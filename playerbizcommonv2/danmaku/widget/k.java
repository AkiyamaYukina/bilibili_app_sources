package com.bilibili.playerbizcommonv2.danmaku.widget;

import com.bilibili.playerbizcommonv2.danmaku.view.PlayerPagerSlidingTabStrip;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import kotlin.jvm.internal.Intrinsics;
import tv.danmaku.biliplayerv2.service.report.IReporterService;
import tv.danmaku.biliplayerv2.service.report.NeuronsEvents;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/widget/k.class */
public final class k implements PlayerPagerSlidingTabStrip.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f81666a;

    public k(e eVar) {
        this.f81666a = eVar;
    }

    @Override // com.bilibili.playerbizcommonv2.danmaku.view.PlayerPagerSlidingTabStrip.d
    public final void onTabClick(int i7) {
        String str = i7 != 0 ? i7 != 1 ? EditCustomizeSticker.TAG_MID : "regular" : "string";
        IReporterService iReporterService = this.f81666a.f81631b;
        IReporterService iReporterService2 = iReporterService;
        if (iReporterService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mReporterService");
            iReporterService2 = null;
        }
        iReporterService2.report(new NeuronsEvents.NormalEvent("player.player.danmaku-filter.tab.player", new String[]{"tab", str}));
    }
}
