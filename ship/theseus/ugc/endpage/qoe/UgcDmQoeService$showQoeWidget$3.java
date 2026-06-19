package com.bilibili.ship.theseus.ugc.endpage.qoe;

import com.bilibili.ship.theseus.ugc.endpage.qoe.UgcDmQoeComponent;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import kotlin.KotlinNothingValueException;
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
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/qoe/UgcDmQoeService$showQoeWidget$3.class */
final class UgcDmQoeService$showQoeWidget$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final UgcDmQoeComponent $component;
    final long $total;
    private Object L$0;
    int label;
    final x this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.endpage.qoe.UgcDmQoeService$showQoeWidget$3$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/qoe/UgcDmQoeService$showQoeWidget$3$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final UgcDmQoeComponent $component;
        final long $total;
        private Object L$0;
        int label;
        final x this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.endpage.qoe.UgcDmQoeService$showQoeWidget$3$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/qoe/UgcDmQoeService$showQoeWidget$3$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final x f96691a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final long f96692b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final CoroutineScope f96693c;

            public a(x xVar, long j7, CoroutineScope coroutineScope) {
                this.f96691a = xVar;
                this.f96692b = j7;
                this.f96693c = coroutineScope;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            /* JADX WARN: Removed duplicated region for block: B:23:0x00d0  */
            /* JADX WARN: Removed duplicated region for block: B:50:0x01be  */
            /* JADX WARN: Removed duplicated region for block: B:84:0x0373  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r17, kotlin.coroutines.Continuation r18) throws kotlin.NoWhenBranchMatchedException {
                /*
                    Method dump skipped, instruction units count: 1157
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.endpage.qoe.UgcDmQoeService$showQoeWidget$3.AnonymousClass1.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UgcDmQoeComponent ugcDmQoeComponent, x xVar, long j7, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$component = ugcDmQoeComponent;
            this.this$0 = xVar;
            this.$total = j7;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$component, this.this$0, this.$total, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                SharedFlow<UgcDmQoeComponent.a> sharedFlow = this.$component.f96613d;
                a aVar = new a(this.this$0, this.$total, coroutineScope);
                this.label = 1;
                if (sharedFlow.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.endpage.qoe.UgcDmQoeService$showQoeWidget$3$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/qoe/UgcDmQoeService$showQoeWidget$3$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final UgcDmQoeComponent $component;
        int label;
        final x this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(x xVar, UgcDmQoeComponent ugcDmQoeComponent, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = xVar;
            this.$component = ugcDmQoeComponent;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$component, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                TheseusFloatLayerService theseusFloatLayerService = this.this$0.f96777e;
                UgcDmQoeComponent ugcDmQoeComponent = this.$component;
                this.label = 1;
                if (theseusFloatLayerService.i(ugcDmQoeComponent, null, this) == coroutine_suspended) {
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
    public UgcDmQoeService$showQoeWidget$3(UgcDmQoeComponent ugcDmQoeComponent, x xVar, long j7, Continuation<? super UgcDmQoeService$showQoeWidget$3> continuation) {
        super(2, continuation);
        this.$component = ugcDmQoeComponent;
        this.this$0 = xVar;
        this.$total = j7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UgcDmQoeService$showQoeWidget$3 ugcDmQoeService$showQoeWidget$3 = new UgcDmQoeService$showQoeWidget$3(this.$component, this.this$0, this.$total, continuation);
        ugcDmQoeService$showQoeWidget$3.L$0 = obj;
        return ugcDmQoeService$showQoeWidget$3;
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
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.$component, this.this$0, this.$total, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$component, null), 3, (Object) null);
    }
}
