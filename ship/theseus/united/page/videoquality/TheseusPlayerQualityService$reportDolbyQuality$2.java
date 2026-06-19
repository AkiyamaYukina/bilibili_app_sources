package com.bilibili.ship.theseus.united.page.videoquality;

import com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams;
import com.bilibili.playerbizcommonv2.service.audio.DolbyType;
import com.bilibili.playerbizcommonv2.service.audio.VideoType;
import com.bilibili.search2.api.SearchBangumiItem;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/TheseusPlayerQualityService$reportDolbyQuality$2.class */
final class TheseusPlayerQualityService$reportDolbyQuality$2 extends SuspendLambda implements Function2<com.bilibili.player.tangram.basic.a, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final TheseusPlayerQualityService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusPlayerQualityService$reportDolbyQuality$2(TheseusPlayerQualityService theseusPlayerQualityService, Continuation<? super TheseusPlayerQualityService$reportDolbyQuality$2> continuation) {
        super(2, continuation);
        this.this$0 = theseusPlayerQualityService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TheseusPlayerQualityService$reportDolbyQuality$2 theseusPlayerQualityService$reportDolbyQuality$2 = new TheseusPlayerQualityService$reportDolbyQuality$2(this.this$0, continuation);
        theseusPlayerQualityService$reportDolbyQuality$2.L$0 = (com.bilibili.player.tangram.basic.a) obj;
        return theseusPlayerQualityService$reportDolbyQuality$2;
    }

    /* JADX INFO: renamed from: invoke-Ivnldq8, reason: not valid java name and merged with bridge method [inline-methods] */
    public final Object invoke(com.bilibili.player.tangram.basic.a aVar, Continuation<? super Unit> continuation) {
        return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        com.bilibili.player.tangram.basic.a aVar = (com.bilibili.player.tangram.basic.a) this.L$0;
        if (aVar == null ? false : com.bilibili.player.tangram.basic.a.b(aVar.f79320a, SearchBangumiItem.TYPE_FULLNET_MOVIE)) {
            GeminiCommonPlayableParams geminiCommonPlayableParamsF = this.this$0.f103789q.f();
            long avid = geminiCommonPlayableParamsF.getDisplayParams().getAvid();
            long cid = geminiCommonPlayableParamsF.getDisplayParams().getCid();
            String from = geminiCommonPlayableParamsF.getFrom();
            Fr0.m.a(avid, cid, DolbyType.VIDEO, Intrinsics.areEqual(from, "vupload") ? VideoType.UGC : Intrinsics.areEqual(from, "bangumi") ? VideoType.PGC : VideoType.UNKNOWN, "play");
        }
        return Unit.INSTANCE;
    }
}
