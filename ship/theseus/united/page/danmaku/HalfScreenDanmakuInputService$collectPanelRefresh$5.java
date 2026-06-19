package com.bilibili.ship.theseus.united.page.danmaku;

import com.bapis.bilibili.community.service.dm.v1.BubbleType;
import com.bapis.bilibili.community.service.dm.v1.BubbleV2;
import com.bapis.bilibili.community.service.dm.v1.PostPanelV2;
import com.bilibili.ship.theseus.united.page.danmaku.HalfScreenDanmakuInputService;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/HalfScreenDanmakuInputService$collectPanelRefresh$5.class */
final class HalfScreenDanmakuInputService$collectPanelRefresh$5 extends SuspendLambda implements Function2<Pair<? extends PostPanelV2, ? extends HalfScreenDanmakuInputService.d>, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final HalfScreenDanmakuInputService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HalfScreenDanmakuInputService$collectPanelRefresh$5(HalfScreenDanmakuInputService halfScreenDanmakuInputService, Continuation<? super HalfScreenDanmakuInputService$collectPanelRefresh$5> continuation) {
        super(2, continuation);
        this.this$0 = halfScreenDanmakuInputService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        HalfScreenDanmakuInputService$collectPanelRefresh$5 halfScreenDanmakuInputService$collectPanelRefresh$5 = new HalfScreenDanmakuInputService$collectPanelRefresh$5(this.this$0, continuation);
        halfScreenDanmakuInputService$collectPanelRefresh$5.L$0 = obj;
        return halfScreenDanmakuInputService$collectPanelRefresh$5;
    }

    public final Object invoke(Pair<PostPanelV2, HalfScreenDanmakuInputService.d> pair, Continuation<? super Unit> continuation) {
        return create(pair, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        DanmakuCompoundRepository danmakuCompoundRepository;
        PostPanelV2 postPanelV2A;
        BubbleV2 bubble;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Pair pair = (Pair) this.L$0;
        PostPanelV2 postPanelV2 = (PostPanelV2) pair.component1();
        HalfScreenDanmakuInputService.d dVar = (HalfScreenDanmakuInputService.d) pair.component2();
        defpackage.a.b("[theseus-united-HalfScreenDanmakuInputService$collectPanelRefresh$5-invokeSuspend] ", "collectPanelRefresh " + postPanelV2, "HalfScreenDanmakuInputService$collectPanelRefresh$5-invokeSuspend");
        HalfScreenDanmakuInputService.b(this.this$0);
        this.this$0.f(postPanelV2 != null ? postPanelV2.getClickButton() : null);
        if (dVar == null) {
            return Unit.INSTANCE;
        }
        HalfScreenDanmakuInputService halfScreenDanmakuInputService = this.this$0;
        if (!halfScreenDanmakuInputService.f99463n.h().f102988b && (postPanelV2A = (danmakuCompoundRepository = halfScreenDanmakuInputService.f99458i).a()) != null && (bubble = postPanelV2A.getBubble()) != null) {
            com.bilibili.app.gemini.player.widget.danmaku.h hVar = halfScreenDanmakuInputService.f99445G;
            boolean zA = hVar != null ? hVar.a() : false;
            if (danmakuCompoundRepository.d() && !danmakuCompoundRepository.f99367c.isDanmakuForbidden() && bubble.getBubbleType() == BubbleType.BubbleTypeClickButton && !zA) {
                halfScreenDanmakuInputService.f99444F.trySend-JP2dKIU(new HalfScreenDanmakuInputService.a.C0977a(bubble, dVar.f99499a));
            }
        }
        return Unit.INSTANCE;
    }
}
