package com.bilibili.search2.result.all;

import android.content.SharedPreferences;
import android.view.View;
import com.bilibili.base.BiliGlobalPreferenceHelper;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/all/DownPullPopWindow$tryStartOnceGuideAnimation$2.class */
final class DownPullPopWindow$tryStartOnceGuideAnimation$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final View $anchor;
    final Function0<Integer> $getYOff;
    final int $xOff;
    int label;
    final C6052f this$0;

    /* JADX INFO: renamed from: com.bilibili.search2.result.all.DownPullPopWindow$tryStartOnceGuideAnimation$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/all/DownPullPopWindow$tryStartOnceGuideAnimation$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Unit unit;
            SharedPreferences.Editor editorEdit;
            SharedPreferences.Editor editorPutBoolean;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SharedPreferences bLKVSharedPreference = BiliGlobalPreferenceHelper.getBLKVSharedPreference();
            if (bLKVSharedPreference == null || (editorEdit = bLKVSharedPreference.edit()) == null || (editorPutBoolean = editorEdit.putBoolean("has_show_down_pull_guide_key", true)) == null) {
                unit = null;
            } else {
                editorPutBoolean.apply();
                unit = Unit.INSTANCE;
            }
            return unit;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownPullPopWindow$tryStartOnceGuideAnimation$2(C6052f c6052f, View view, int i7, Function0<Integer> function0, Continuation<? super DownPullPopWindow$tryStartOnceGuideAnimation$2> continuation) {
        super(1, continuation);
        this.this$0 = c6052f;
        this.$anchor = view;
        this.$xOff = i7;
        this.$getYOff = function0;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new DownPullPopWindow$tryStartOnceGuideAnimation$2(this.this$0, this.$anchor, this.$xOff, this.$getYOff, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            C6052f c6052f = this.this$0;
            View view = this.$anchor;
            int i8 = this.$xOff;
            Function0<Integer> function0 = this.$getYOff;
            this.label = 1;
            if (C6052f.a(c6052f, view, i8, function0, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
        }
        CoroutineDispatcher io2 = Dispatchers.getIO();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
        this.label = 2;
        Object objWithContext = BuildersKt.withContext(io2, anonymousClass1, this);
        obj = objWithContext;
        if (objWithContext == coroutine_suspended) {
            return coroutine_suspended;
        }
        return obj;
    }
}
