package com.bilibili.studio.editor.moudle.intelligence.vm;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/vm/BiliIntelligenceGenLogicManagerNew$startProjectGenAnyway$1.class */
final class BiliIntelligenceGenLogicManagerNew$startProjectGenAnyway$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final j this$0;

    /* JADX INFO: renamed from: com.bilibili.studio.editor.moudle.intelligence.vm.BiliIntelligenceGenLogicManagerNew$startProjectGenAnyway$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/vm/BiliIntelligenceGenLogicManagerNew$startProjectGenAnyway$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final j this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(j jVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = jVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (this.this$0.f107649t.get()) {
                this.this$0.getClass();
                j.g("[智能成片][项目生成] 已强制生成项目，无需再生成");
            } else {
                this.this$0.getClass();
                j.g("[智能成片][项目生成] 兜底模板超时时间到了，强制生成项目");
                this.this$0.j();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiliIntelligenceGenLogicManagerNew$startProjectGenAnyway$1(j jVar, Continuation<? super BiliIntelligenceGenLogicManagerNew$startProjectGenAnyway$1> continuation) {
        super(2, continuation);
        this.this$0 = jVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BiliIntelligenceGenLogicManagerNew$startProjectGenAnyway$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        MainCoroutineDispatcher main = Dispatchers.getMain();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
        this.label = 2;
        if (BuildersKt.withContext(main, anonymousClass1, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
