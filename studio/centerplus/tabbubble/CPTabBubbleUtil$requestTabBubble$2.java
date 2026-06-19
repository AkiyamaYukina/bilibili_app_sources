package com.bilibili.studio.centerplus.tabbubble;

import com.bilibili.okretro.BiliApiCallback;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.ServiceGenerator;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/tabbubble/CPTabBubbleUtil$requestTabBubble$2.class */
final class CPTabBubbleUtil$requestTabBubble$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super TabBubbleResult>, Object> {
    final String $exclusion;
    Object L$0;
    int label;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/tabbubble/CPTabBubbleUtil$requestTabBubble$2$a.class */
    public static final class a extends BiliApiCallback<GeneralResponse<TabBubbleResult>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CancellableContinuationImpl f105199b;

        public a(CancellableContinuationImpl cancellableContinuationImpl) {
            this.f105199b = cancellableContinuationImpl;
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final void onError(Throwable th) {
            if (isCancel()) {
                return;
            }
            this.f105199b.resumeWith(Result.constructor-impl((Object) null));
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final void onSuccess(GeneralResponse<TabBubbleResult> generalResponse) {
            GeneralResponse<TabBubbleResult> generalResponse2 = generalResponse;
            if (isCancel()) {
                return;
            }
            Result.Companion companion = Result.Companion;
            this.f105199b.resumeWith(Result.constructor-impl(generalResponse2 != null ? generalResponse2.data : null));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CPTabBubbleUtil$requestTabBubble$2(String str, Continuation<? super CPTabBubbleUtil$requestTabBubble$2> continuation) {
        super(2, continuation);
        this.$exclusion = str;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CPTabBubbleUtil$requestTabBubble$2(this.$exclusion, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super TabBubbleResult> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            String str = this.$exclusion;
            this.L$0 = str;
            this.label = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
            ((b) ServiceGenerator.createService(b.class)).getTabBubble(str).enqueue(new a(cancellableContinuationImpl));
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            obj = result;
            if (result == coroutine_suspended) {
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
