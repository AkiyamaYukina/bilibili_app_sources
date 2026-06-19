package com.bilibili.ship.theseus.united.page.intro.module.season;

import androidx.window.core.layout.WindowSizeClass;
import dv0.n0;
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
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedSeasonPanelDescComponent$bindContent$3.class */
final class UnitedSeasonPanelDescComponent$bindContent$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final n0 $binding;
    private Object L$0;
    int label;
    final D this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonPanelDescComponent$bindContent$3$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedSeasonPanelDescComponent$bindContent$3$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final n0 $binding;
        int label;
        final D this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonPanelDescComponent$bindContent$3$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedSeasonPanelDescComponent$bindContent$3$1$1.class */
        public static final class C10521 extends SuspendLambda implements Function2<WindowSizeClass, Continuation<? super Unit>, Object> {
            final n0 $binding;
            int label;
            final D this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10521(D d7, n0 n0Var, Continuation<? super C10521> continuation) {
                super(2, continuation);
                this.this$0 = d7;
                this.$binding = n0Var;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C10521(this.this$0, this.$binding, continuation);
            }

            public final Object invoke(WindowSizeClass windowSizeClass, Continuation<? super Unit> continuation) {
                return create(windowSizeClass, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (this.this$0.f101451m.f()) {
                    this.$binding.f117060d.setVisibility(0);
                } else {
                    this.$binding.f117060d.setVisibility(8);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(D d7, n0 n0Var, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = d7;
            this.$binding = n0Var;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$binding, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    D d7 = this.this$0;
                    StateFlow<WindowSizeClass> stateFlow = d7.f101451m.f102939c;
                    C10521 c10521 = new C10521(d7, this.$binding, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlow, c10521, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                this.$binding.f117058b.setOnClickListener(null);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                this.$binding.f117058b.setOnClickListener(null);
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnitedSeasonPanelDescComponent$bindContent$3(D d7, n0 n0Var, Continuation<? super UnitedSeasonPanelDescComponent$bindContent$3> continuation) {
        super(2, continuation);
        this.this$0 = d7;
        this.$binding = n0Var;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UnitedSeasonPanelDescComponent$bindContent$3 unitedSeasonPanelDescComponent$bindContent$3 = new UnitedSeasonPanelDescComponent$bindContent$3(this.this$0, this.$binding, continuation);
        unitedSeasonPanelDescComponent$bindContent$3.L$0 = obj;
        return unitedSeasonPanelDescComponent$bindContent$3;
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
        return BuildersKt.launch$default((CoroutineScope) this.L$0, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, this.$binding, null), 3, (Object) null);
    }
}
