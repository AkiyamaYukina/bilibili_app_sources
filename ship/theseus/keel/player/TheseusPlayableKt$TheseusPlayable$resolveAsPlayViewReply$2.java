package com.bilibili.ship.theseus.keel.player;

import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import com.bapis.bilibili.playershared.Fragment;
import com.bilibili.app.gemini.base.player.GeminiCommonResolverParams;
import com.bilibili.app.gemini.base.resolver.GeminiCommonResolver;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/keel/player/TheseusPlayableKt$TheseusPlayable$resolveAsPlayViewReply$2.class */
final class TheseusPlayableKt$TheseusPlayable$resolveAsPlayViewReply$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super PlayViewUniteReply>, Object> {
    final Ref.ObjectRef<Fragment> $fragment;
    final ii1.a $profiler;
    final GeminiCommonResolverParams $resolveParams;
    final Ref.BooleanRef $usesTrialQuality;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusPlayableKt$TheseusPlayable$resolveAsPlayViewReply$2(ii1.a aVar, GeminiCommonResolverParams geminiCommonResolverParams, Ref.ObjectRef<Fragment> objectRef, Ref.BooleanRef booleanRef, Continuation<? super TheseusPlayableKt$TheseusPlayable$resolveAsPlayViewReply$2> continuation) {
        super(2, continuation);
        this.$profiler = aVar;
        this.$resolveParams = geminiCommonResolverParams;
        this.$fragment = objectRef;
        this.$usesTrialQuality = booleanRef;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TheseusPlayableKt$TheseusPlayable$resolveAsPlayViewReply$2(this.$profiler, this.$resolveParams, this.$fragment, this.$usesTrialQuality, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super PlayViewUniteReply> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ii1.a aVar = this.$profiler;
        if (aVar != null) {
            aVar.a("start_resolve_play_url", (Map) null);
        }
        try {
            GeminiCommonResolver.a aVar2 = GeminiCommonResolver.Companion;
            GeminiCommonResolverParams geminiCommonResolverParams = this.$resolveParams;
            Fragment fragment = (Fragment) this.$fragment.element;
            boolean z6 = this.$usesTrialQuality.element;
            aVar2.getClass();
            return GeminiCommonResolver.a.i(geminiCommonResolverParams, fragment, z6);
        } finally {
            ii1.a aVar3 = this.$profiler;
            if (aVar3 != null) {
                aVar3.a("end_resolve_play_url", (Map) null);
            }
        }
    }
}
