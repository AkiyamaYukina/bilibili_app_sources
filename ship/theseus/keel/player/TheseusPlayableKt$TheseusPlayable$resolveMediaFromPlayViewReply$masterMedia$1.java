package com.bilibili.ship.theseus.keel.player;

import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import com.bapis.bilibili.playershared.Fragment;
import com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams;
import com.bilibili.lib.media.resource.ExtraInfo;
import com.bilibili.lib.media.resource.MediaResource;
import com.bilibili.player.tangram.playercore.B;
import com.bilibili.player.tangram.playercore.C;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/keel/player/TheseusPlayableKt$TheseusPlayable$resolveMediaFromPlayViewReply$masterMedia$1.class */
final class TheseusPlayableKt$TheseusPlayable$resolveMediaFromPlayViewReply$masterMedia$1 extends SuspendLambda implements Function2<C, Continuation<? super MediaResource>, Object> {
    final Function1<PlayViewUniteReply, ExtraInfo> $extractExtraInfo;
    final Ref.ObjectRef<Fragment> $fragment;
    final MutableStateFlow<GeminiCommonPlayableParams> $playableParamsFlow;
    final h $player;
    final ii1.a $profiler;
    final B $this_resolveMediaFromPlayViewReply;
    final Ref.BooleanRef $usesTrialQuality;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusPlayableKt$TheseusPlayable$resolveMediaFromPlayViewReply$masterMedia$1(B b7, MutableStateFlow<GeminiCommonPlayableParams> mutableStateFlow, h hVar, ii1.a aVar, Ref.ObjectRef<Fragment> objectRef, Ref.BooleanRef booleanRef, Function1<? super PlayViewUniteReply, ExtraInfo> function1, Continuation<? super TheseusPlayableKt$TheseusPlayable$resolveMediaFromPlayViewReply$masterMedia$1> continuation) {
        super(2, continuation);
        this.$this_resolveMediaFromPlayViewReply = b7;
        this.$playableParamsFlow = mutableStateFlow;
        this.$player = hVar;
        this.$profiler = aVar;
        this.$fragment = objectRef;
        this.$usesTrialQuality = booleanRef;
        this.$extractExtraInfo = function1;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TheseusPlayableKt$TheseusPlayable$resolveMediaFromPlayViewReply$masterMedia$1 theseusPlayableKt$TheseusPlayable$resolveMediaFromPlayViewReply$masterMedia$1 = new TheseusPlayableKt$TheseusPlayable$resolveMediaFromPlayViewReply$masterMedia$1(this.$this_resolveMediaFromPlayViewReply, this.$playableParamsFlow, this.$player, this.$profiler, this.$fragment, this.$usesTrialQuality, this.$extractExtraInfo, continuation);
        theseusPlayableKt$TheseusPlayable$resolveMediaFromPlayViewReply$masterMedia$1.L$0 = obj;
        return theseusPlayableKt$TheseusPlayable$resolveMediaFromPlayViewReply$masterMedia$1;
    }

    public final Object invoke(C c7, Continuation<? super MediaResource> continuation) {
        return create(c7, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            C c7 = (C) this.L$0;
            B b7 = this.$this_resolveMediaFromPlayViewReply;
            MutableStateFlow<GeminiCommonPlayableParams> mutableStateFlow = this.$playableParamsFlow;
            h hVar = this.$player;
            ii1.a aVar = this.$profiler;
            Ref.ObjectRef<Fragment> objectRef = this.$fragment;
            Ref.BooleanRef booleanRef = this.$usesTrialQuality;
            Function1<PlayViewUniteReply, ExtraInfo> function1 = this.$extractExtraInfo;
            this.label = 1;
            Object objM = p.m(b7, mutableStateFlow, hVar, aVar, objectRef, booleanRef, function1, c7, this);
            obj = objM;
            if (objM == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
