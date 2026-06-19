package com.bilibili.ship.theseus.ugc.watchpoint;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.biliplayerv2.service.interact.biz.model.ChronosThumbnailInfo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/watchpoint/WatchPointLayerService$tryShowWatchPointLayer$1.class */
final class WatchPointLayerService$tryShowWatchPointLayer$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final List<ChronosThumbnailInfo.WatchPoint> $list;
    Object L$0;
    Object L$1;
    int label;
    final WatchPointLayerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchPointLayerService$tryShowWatchPointLayer$1(WatchPointLayerService watchPointLayerService, List<ChronosThumbnailInfo.WatchPoint> list, Continuation<? super WatchPointLayerService$tryShowWatchPointLayer$1> continuation) {
        super(2, continuation);
        this.this$0 = watchPointLayerService;
        this.$list = list;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WatchPointLayerService$tryShowWatchPointLayer$1(this.this$0, this.$list, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        com.bilibili.ship.theseus.united.page.playingarea.g gVar;
        com.bilibili.ship.theseus.united.page.playingarea.g gVar2;
        String str;
        String str2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) this.L$1;
            com.bilibili.ship.theseus.united.page.playingarea.g gVar3 = (com.bilibili.ship.theseus.united.page.playingarea.g) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                gVar = gVar3;
                gVar.j(str2);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                str = str2;
                gVar2 = gVar3;
                th = th;
                gVar2.j(str);
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        WatchPointLayerService watchPointLayerService = this.this$0;
        gVar = watchPointLayerService.f98579d;
        List<ChronosThumbnailInfo.WatchPoint> list = this.$list;
        gVar.f("BgmFloatLayerService");
        try {
            this.L$0 = gVar;
            this.L$1 = "BgmFloatLayerService";
            this.label = 1;
            if (WatchPointLayerService.a(watchPointLayerService, list, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            str2 = "BgmFloatLayerService";
            gVar.j(str2);
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            th = th2;
            gVar2 = gVar;
            str = "BgmFloatLayerService";
            gVar2.j(str);
            throw th;
        }
    }
}
