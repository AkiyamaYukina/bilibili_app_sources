package com.bilibili.ship.theseus.ugc.watchpoint;

import java.util.ArrayList;
import kotlin.jvm.internal.Ref;
import tv.danmaku.biliplayerv2.service.interact.biz.model.ChronosThumbnailInfo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/watchpoint/g.class */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ref.ObjectRef<b> f98591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WatchPointLayerService f98592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<ChronosThumbnailInfo.WatchPoint> f98593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yq0.d f98594d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f98595e;

    public g(Ref.ObjectRef<b> objectRef, WatchPointLayerService watchPointLayerService, ArrayList<ChronosThumbnailInfo.WatchPoint> arrayList, yq0.d dVar, Oi1.d dVar2, h hVar) {
        this.f98591a = objectRef;
        this.f98592b = watchPointLayerService;
        this.f98593c = arrayList;
        this.f98594d = dVar;
        this.f98595e = hVar;
    }

    public final boolean a() {
        return this.f98592b.f98580e.getSegmentSwitchValue();
    }
}
