package com.bilibili.ship.theseus.united.page.danmaku;

import com.bapis.bilibili.community.service.dm.v1.PostPanelV2;
import com.bilibili.ship.theseus.united.page.danmaku.HalfScreenDanmakuInputService;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/HalfScreenDanmakuInputService$collectPanelRefresh$4.class */
final /* synthetic */ class HalfScreenDanmakuInputService$collectPanelRefresh$4 extends AdaptedFunctionReference implements Function3<PostPanelV2, HalfScreenDanmakuInputService.d, Continuation<? super Pair<? extends PostPanelV2, ? extends HalfScreenDanmakuInputService.d>>, Object>, SuspendFunction {
    public static final HalfScreenDanmakuInputService$collectPanelRefresh$4 INSTANCE = new HalfScreenDanmakuInputService$collectPanelRefresh$4();

    public HalfScreenDanmakuInputService$collectPanelRefresh$4() {
        super(3, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
    }

    public final Object invoke(PostPanelV2 postPanelV2, HalfScreenDanmakuInputService.d dVar, Continuation<? super Pair<PostPanelV2, HalfScreenDanmakuInputService.d>> continuation) {
        return new Pair(postPanelV2, dVar);
    }
}
