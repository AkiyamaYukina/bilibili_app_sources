package com.bilibili.player.tangram.basic;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/basic/QualityPreferenceProviderImpl$associateWith$2.class */
public final class QualityPreferenceProviderImpl$associateWith$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final l $playable;
    private Object L$0;
    int label;
    final QualityPreferenceProviderImpl this$0;

    /* JADX INFO: renamed from: com.bilibili.player.tangram.basic.QualityPreferenceProviderImpl$associateWith$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/basic/QualityPreferenceProviderImpl$associateWith$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final l $playable;
        int label;
        final QualityPreferenceProviderImpl this$0;

        /* JADX INFO: renamed from: com.bilibili.player.tangram.basic.QualityPreferenceProviderImpl$associateWith$2$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/basic/QualityPreferenceProviderImpl$associateWith$2$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final QualityPreferenceProviderImpl f79300a;

            public a(QualityPreferenceProviderImpl qualityPreferenceProviderImpl) {
                this.f79300a = qualityPreferenceProviderImpl;
            }

            public final Object emit(Object obj, Continuation continuation) {
                this.f79300a.f79295b.setValue((com.bilibili.player.tangram.basic.a) obj);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(l lVar, QualityPreferenceProviderImpl qualityPreferenceProviderImpl, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$playable = lVar;
            this.this$0 = qualityPreferenceProviderImpl;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$playable, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<com.bilibili.player.tangram.basic.a> flowH = this.$playable.H();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (flowH.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.player.tangram.basic.QualityPreferenceProviderImpl$associateWith$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/basic/QualityPreferenceProviderImpl$associateWith$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final l $playable;
        int label;
        final QualityPreferenceProviderImpl this$0;

        /* JADX INFO: renamed from: com.bilibili.player.tangram.basic.QualityPreferenceProviderImpl$associateWith$2$2$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/basic/QualityPreferenceProviderImpl$associateWith$2$2$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final QualityPreferenceProviderImpl f79301a;

            public a(QualityPreferenceProviderImpl qualityPreferenceProviderImpl) {
                this.f79301a = qualityPreferenceProviderImpl;
            }

            public final Object emit(Object obj, Continuation continuation) {
                this.f79301a.f79296c.setValue((com.bilibili.player.tangram.basic.a) obj);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(l lVar, QualityPreferenceProviderImpl qualityPreferenceProviderImpl, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$playable = lVar;
            this.this$0 = qualityPreferenceProviderImpl;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$playable, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<com.bilibili.player.tangram.basic.a> flowB = this.$playable.B();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (flowB.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QualityPreferenceProviderImpl$associateWith$2(l lVar, QualityPreferenceProviderImpl qualityPreferenceProviderImpl, Continuation<? super QualityPreferenceProviderImpl$associateWith$2> continuation) {
        super(2, continuation);
        this.$playable = lVar;
        this.this$0 = qualityPreferenceProviderImpl;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        QualityPreferenceProviderImpl$associateWith$2 qualityPreferenceProviderImpl$associateWith$2 = new QualityPreferenceProviderImpl$associateWith$2(this.$playable, this.this$0, continuation);
        qualityPreferenceProviderImpl$associateWith$2.L$0 = obj;
        return qualityPreferenceProviderImpl$associateWith$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.$playable, this.this$0, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.$playable, this.this$0, null), 3, (Object) null);
    }
}
