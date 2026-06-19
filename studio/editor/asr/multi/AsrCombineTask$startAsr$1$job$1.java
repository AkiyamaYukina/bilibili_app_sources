package com.bilibili.studio.editor.asr.multi;

import com.bilibili.studio.editor.asr.bean.AsrResultWrapper;
import com.bilibili.studio.editor.asr.multi.a;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/multi/AsrCombineTask$startAsr$1$job$1.class */
final class AsrCombineTask$startAsr$1$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AsrResultWrapper>, Object> {
    final a.C1186a $it;
    int label;
    final a this$0;

    /* JADX INFO: renamed from: com.bilibili.studio.editor.asr.multi.AsrCombineTask$startAsr$1$job$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/multi/AsrCombineTask$startAsr$1$job$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AsrResultWrapper>, Object> {
        final a.C1186a $it;
        int label;
        final a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a.C1186a c1186a, a aVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$it = c1186a;
            this.this$0 = aVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$it, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AsrResultWrapper> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                a.C1186a c1186a = this.$it;
                AsrSingleTask asrSingleTask = c1186a.f105623b;
                boolean z6 = this.this$0.f105614a;
                this.label = 1;
                Object objA = asrSingleTask.a(c1186a.f105622a, this);
                obj = objA;
                if (objA == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsrCombineTask$startAsr$1$job$1(a.C1186a c1186a, a aVar, Continuation<? super AsrCombineTask$startAsr$1$job$1> continuation) {
        super(2, continuation);
        this.$it = c1186a;
        this.this$0 = aVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AsrCombineTask$startAsr$1$job$1(this.$it, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AsrResultWrapper> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return BuildersKt.runBlocking$default((CoroutineContext) null, new AnonymousClass1(this.$it, this.this$0, null), 1, (Object) null);
    }
}
