package com.bilibili.studio.editor.asr.multi;

import com.bilibili.studio.editor.asr.bean.AsrResultWrapper;
import com.bilibili.studio.editor.asr.multi.a;
import com.bilibili.studio.editor.asr.multi.step.b;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/multi/AsrCombineTask$extractAudio$1.class */
final class AsrCombineTask$extractAudio$1 extends SuspendLambda implements Function2<a.C1186a, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;

    /* JADX INFO: renamed from: com.bilibili.studio.editor.asr.multi.AsrCombineTask$extractAudio$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/multi/AsrCombineTask$extractAudio$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final a.C1186a $chain;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a.C1186a c1186a, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$chain = c1186a;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$chain, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object objA;
            a.C1186a c1186a;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                a.C1186a c1186a2 = this.$chain;
                AsrSingleTask asrSingleTask = c1186a2.f105623b;
                this.L$0 = c1186a2;
                this.label = 1;
                objA = asrSingleTask.f105603b.a(c1186a2.f105622a, this);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c1186a = c1186a2;
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c1186a = (a.C1186a) this.L$0;
                ResultKt.throwOnFailure(obj);
                objA = obj;
            }
            c1186a.f105624c = (b.a) objA;
            return Unit.INSTANCE;
        }
    }

    public AsrCombineTask$extractAudio$1(Continuation<? super AsrCombineTask$extractAudio$1> continuation) {
        super(2, continuation);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AsrCombineTask$extractAudio$1 asrCombineTask$extractAudio$1 = new AsrCombineTask$extractAudio$1(continuation);
        asrCombineTask$extractAudio$1.L$0 = obj;
        return asrCombineTask$extractAudio$1;
    }

    public final Object invoke(a.C1186a c1186a, Continuation<? super Unit> continuation) {
        return create(c1186a, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        a.C1186a c1186a = (a.C1186a) this.L$0;
        AsrResultWrapper asrResultWrapper = c1186a.f105625d;
        if (asrResultWrapper == null || !asrResultWrapper.isAvailable()) {
            BuildersKt.runBlocking$default((CoroutineContext) null, new AnonymousClass1(c1186a, null), 1, (Object) null);
        }
        return Unit.INSTANCE;
    }
}
