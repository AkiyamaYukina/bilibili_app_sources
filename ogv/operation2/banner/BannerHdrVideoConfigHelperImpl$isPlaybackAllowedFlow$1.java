package com.bilibili.ogv.operation2.banner;

import androidx.lifecycle.Lifecycle;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/banner/BannerHdrVideoConfigHelperImpl$isPlaybackAllowedFlow$1.class */
public final class BannerHdrVideoConfigHelperImpl$isPlaybackAllowedFlow$1 extends SuspendLambda implements Function3<Boolean, Lifecycle.State, Continuation<? super Boolean>, Object> {
    Object L$0;
    boolean Z$0;
    int label;

    public BannerHdrVideoConfigHelperImpl$isPlaybackAllowedFlow$1(Continuation<? super BannerHdrVideoConfigHelperImpl$isPlaybackAllowedFlow$1> continuation) {
        super(3, continuation);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke(((Boolean) obj).booleanValue(), (Lifecycle.State) obj2, (Continuation<? super Boolean>) obj3);
    }

    public final Object invoke(boolean z6, Lifecycle.State state, Continuation<? super Boolean> continuation) {
        BannerHdrVideoConfigHelperImpl$isPlaybackAllowedFlow$1 bannerHdrVideoConfigHelperImpl$isPlaybackAllowedFlow$1 = new BannerHdrVideoConfigHelperImpl$isPlaybackAllowedFlow$1(continuation);
        bannerHdrVideoConfigHelperImpl$isPlaybackAllowedFlow$1.Z$0 = z6;
        bannerHdrVideoConfigHelperImpl$isPlaybackAllowedFlow$1.L$0 = state;
        return bannerHdrVideoConfigHelperImpl$isPlaybackAllowedFlow$1.invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Boxing.boxBoolean(this.Z$0 && ((Lifecycle.State) this.L$0).compareTo(Lifecycle.State.RESUMED) >= 0);
    }
}
