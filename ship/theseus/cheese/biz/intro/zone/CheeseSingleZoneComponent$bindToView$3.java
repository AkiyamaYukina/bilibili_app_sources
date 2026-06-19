package com.bilibili.ship.theseus.cheese.biz.intro.zone;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.bilibili.app.gemini.ui.UIComponentExtKt;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.ship.theseus.cheese.biz.intro.zone.b;
import fu0.U;
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
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/zone/CheeseSingleZoneComponent$bindToView$3.class */
final class CheeseSingleZoneComponent$bindToView$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final U $binding;
    final d $data;
    private Object L$0;
    int label;
    final b this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.zone.CheeseSingleZoneComponent$bindToView$3$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/zone/CheeseSingleZoneComponent$bindToView$3$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final U $binding;
        final d $data;
        int label;
        final b this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.zone.CheeseSingleZoneComponent$bindToView$3$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/zone/CheeseSingleZoneComponent$bindToView$3$1$1.class */
        public static final class C06451 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
            final d $data;
            int label;
            final b this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06451(b bVar, d dVar, Continuation<? super C06451> continuation) {
                super(2, continuation);
                this.this$0 = bVar;
                this.$data = dVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C06451(this.this$0, this.$data, continuation);
            }

            public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
                return create(unit, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.f90309b.tryEmit(new b.a.C0648a(this.$data));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(U u7, b bVar, d dVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$binding = u7;
            this.this$0 = bVar;
            this.$data = dVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$binding, this.this$0, this.$data, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowA = UIComponentExtKt.a(this.$binding.f119503a);
                C06451 c06451 = new C06451(this.this$0, this.$data, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowA, c06451, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.zone.CheeseSingleZoneComponent$bindToView$3$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/zone/CheeseSingleZoneComponent$bindToView$3$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final U $binding;
        int label;
        final b this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.zone.CheeseSingleZoneComponent$bindToView$3$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/zone/CheeseSingleZoneComponent$bindToView$3$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
            final U $binding;
            int I$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(U u7, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$binding = u7;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$binding, continuation);
                anonymousClass1.I$0 = ((Number) obj).intValue();
                return anonymousClass1;
            }

            public final Object invoke(int i7, Continuation<? super Unit> continuation) {
                return create(Integer.valueOf(i7), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).intValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                int i7 = this.I$0;
                ConstraintLayout constraintLayout = this.$binding.f119504b;
                constraintLayout.setPaddingRelative(DimenUtilsKt.dpToPx(i7), constraintLayout.getPaddingTop(), DimenUtilsKt.dpToPx(i7), constraintLayout.getPaddingBottom());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(b bVar, U u7, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = bVar;
            this.$binding = u7;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$binding, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Integer> stateFlow = this.this$0.f90308a.f90314b;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$binding, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
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
    public CheeseSingleZoneComponent$bindToView$3(U u7, b bVar, d dVar, Continuation<? super CheeseSingleZoneComponent$bindToView$3> continuation) {
        super(2, continuation);
        this.$binding = u7;
        this.this$0 = bVar;
        this.$data = dVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CheeseSingleZoneComponent$bindToView$3 cheeseSingleZoneComponent$bindToView$3 = new CheeseSingleZoneComponent$bindToView$3(this.$binding, this.this$0, this.$data, continuation);
        cheeseSingleZoneComponent$bindToView$3.L$0 = obj;
        return cheeseSingleZoneComponent$bindToView$3;
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
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.$binding, this.this$0, this.$data, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$binding, null), 3, (Object) null);
    }
}
