package com.bilibili.search2.result.all;

import android.content.SharedPreferences;
import com.bilibili.base.BiliGlobalPreferenceHelper;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/all/DownPullPopWindow$tryStartOnceGuideAnimation$hasShow$1.class */
final class DownPullPopWindow$tryStartOnceGuideAnimation$hasShow$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    int label;

    public DownPullPopWindow$tryStartOnceGuideAnimation$hasShow$1(Continuation<? super DownPullPopWindow$tryStartOnceGuideAnimation$hasShow$1> continuation) {
        super(2, continuation);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DownPullPopWindow$tryStartOnceGuideAnimation$hasShow$1(continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        SharedPreferences bLKVSharedPreference = BiliGlobalPreferenceHelper.getBLKVSharedPreference();
        return bLKVSharedPreference != null ? Boxing.boxBoolean(bLKVSharedPreference.getBoolean("has_show_down_pull_guide_key", false)) : null;
    }
}
