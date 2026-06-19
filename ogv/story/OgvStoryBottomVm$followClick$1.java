package com.bilibili.ogv.story;

import android.view.View;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/story/OgvStoryBottomVm$followClick$1.class */
public final class OgvStoryBottomVm$followClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final View $v;
    int label;
    final OgvStoryBottomVm this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvStoryBottomVm$followClick$1(OgvStoryBottomVm ogvStoryBottomVm, View view, Continuation<? super OgvStoryBottomVm$followClick$1> continuation) {
        super(2, continuation);
        this.this$0 = ogvStoryBottomVm;
        this.$v = view;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OgvStoryBottomVm$followClick$1(this.this$0, this.$v, continuation);
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
            OgvStoryBottomVm ogvStoryBottomVm = this.this$0;
            com.bilibili.community.follow.d dVar = new com.bilibili.community.follow.d(ogvStoryBottomVm.f72973K, ogvStoryBottomVm.f72972J, (Long) null);
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
        OgvStoryBottomVm ogvStoryBottomVm2 = this.this$0;
        View view = this.$v;
        if (Result.isSuccess-impl(obj2)) {
            FollowSeasonResult followSeasonResult = (FollowSeasonResult) obj2;
            ogvStoryBottomVm2.f72973K = followSeasonResult.a();
            ogvStoryBottomVm2.D(ogvStoryBottomVm2.f72974L, view.getContext());
            String str = followSeasonResult.b;
            if (str.length() > 0) {
                ToastHelper.showToastShort(view.getContext(), str);
            }
        }
        return Unit.INSTANCE;
    }
}
