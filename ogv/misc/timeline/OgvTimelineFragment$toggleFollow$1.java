package com.bilibili.ogv.misc.timeline;

import com.bilibili.community.Community;
import com.bilibili.community.follow.FollowSeasonResult;
import com.bilibili.droid.ToastHelper;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/OgvTimelineFragment$toggleFollow$1.class */
final class OgvTimelineFragment$toggleFollow$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final boolean $hasFollowed;
    final Function0<Unit> $onToggled;
    final long $seasonId;
    int label;
    final OgvTimelineFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvTimelineFragment$toggleFollow$1(boolean z6, long j7, OgvTimelineFragment ogvTimelineFragment, Function0<Unit> function0, Continuation<? super OgvTimelineFragment$toggleFollow$1> continuation) {
        super(2, continuation);
        this.$hasFollowed = z6;
        this.$seasonId = j7;
        this.this$0 = ogvTimelineFragment;
        this.$onToggled = function0;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OgvTimelineFragment$toggleFollow$1(this.$hasFollowed, this.$seasonId, this.this$0, this.$onToggled, continuation);
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
            com.bilibili.community.follow.d dVar = new com.bilibili.community.follow.d(this.$hasFollowed, this.$seasonId, (Long) null);
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
        OgvTimelineFragment ogvTimelineFragment = this.this$0;
        Function0<Unit> function0 = this.$onToggled;
        if (Result.isSuccess-impl(obj2)) {
            ToastHelper.showToastShort(ogvTimelineFragment.getContext(), ((FollowSeasonResult) obj2).b);
            function0.invoke();
        }
        OgvTimelineFragment ogvTimelineFragment2 = this.this$0;
        if (Result.exceptionOrNull-impl(obj2) != null) {
            ToastHelper.showToastShort(ogvTimelineFragment2.getContext(), 2131832098);
        }
        return Unit.INSTANCE;
    }
}
