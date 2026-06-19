package com.bilibili.ship.theseus.ugc.watchpoint;

import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.live.streaming.source.TextSource;
import java.util.HashMap;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import sh1.l;
import tv.danmaku.bili.ui.main2.W;
import tv.danmaku.biliplayerv2.service.interact.biz.model.ChronosThumbnailInfo;
import yq0.d;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/watchpoint/f.class */
public final class f implements d.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ref.IntRef f98588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ref.ObjectRef<ChronosThumbnailInfo.WatchPoint> f98589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WatchPointLayerService f98590c;

    public f(Ref.IntRef intRef, Ref.ObjectRef<ChronosThumbnailInfo.WatchPoint> objectRef, WatchPointLayerService watchPointLayerService) {
        this.f98588a = intRef;
        this.f98589b = objectRef;
        this.f98590c = watchPointLayerService;
    }

    @Override // yq0.d.b
    public final void a(String str, String str2, String str3, String str4) {
        WatchPointLayerService watchPointLayerService = this.f98590c;
        String strB = watchPointLayerService.h.b();
        String strD = watchPointLayerService.h.d();
        int i7 = l.a;
        HashMap mapA = W.a("starttime", str2, "endtime", str3);
        mapA.put(TextSource.CFG_CONTENT, str4);
        if (Intrinsics.areEqual(str, "main.ugc-video-detail.chapter.0.click")) {
            mapA.put(GameCardButton.extraAvid, strB);
            mapA.put("cid", strD);
        }
        Neurons.reportClick(false, str, mapA);
    }

    @Override // yq0.d.b
    public final void seekTo(int i7) {
        this.f98588a.element = i7 / 1000;
        this.f98589b.element = null;
        WatchPointLayerService watchPointLayerService = this.f98590c;
        BuildersKt.launch$default(watchPointLayerService.f98576a, (CoroutineContext) null, (CoroutineStart) null, new WatchPointLayerService$showWatchPointLayer$adapter$1$seekTo$1(watchPointLayerService, i7, null), 3, (Object) null);
    }
}
