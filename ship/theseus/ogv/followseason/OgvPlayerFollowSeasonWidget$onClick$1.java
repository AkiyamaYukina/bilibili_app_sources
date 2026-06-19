package com.bilibili.ship.theseus.ogv.followseason;

import com.bilibili.community.Community;
import com.bilibili.community.follow.FollowSeasonResult;
import com.bilibili.droid.ToastHelper;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/followseason/OgvPlayerFollowSeasonWidget$onClick$1.class */
final class OgvPlayerFollowSeasonWidget$onClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final OgvPlayerFollowSeasonWidget this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvPlayerFollowSeasonWidget$onClick$1(OgvPlayerFollowSeasonWidget ogvPlayerFollowSeasonWidget, Continuation<? super OgvPlayerFollowSeasonWidget$onClick$1> continuation) {
        super(2, continuation);
        this.this$0 = ogvPlayerFollowSeasonWidget;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OgvPlayerFollowSeasonWidget$onClick$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Community community = Community.a;
            com.bilibili.community.follow.b bVarH = Community.h(this.this$0.f92176b.f94449a);
            com.bilibili.community.follow.d dVar = new com.bilibili.community.follow.d(bVarH.a, this.this$0.f92176b.f94449a, (Long) null);
            this.label = 1;
            Object objG = community.g(dVar, this);
            obj2 = objG;
            if (objG == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            obj2 = ((Result) obj).unbox-impl();
        }
        OgvPlayerFollowSeasonWidget ogvPlayerFollowSeasonWidget = this.this$0;
        if (Result.isSuccess-impl(obj2)) {
            FollowSeasonResult followSeasonResult = (FollowSeasonResult) obj2;
            if (followSeasonResult.b.length() > 0) {
                ToastHelper.showToastShort(ogvPlayerFollowSeasonWidget.getContext(), followSeasonResult.b);
            }
        }
        return Unit.INSTANCE;
    }
}
