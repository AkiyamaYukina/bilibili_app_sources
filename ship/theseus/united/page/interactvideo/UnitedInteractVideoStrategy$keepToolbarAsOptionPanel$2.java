package com.bilibili.ship.theseus.united.page.interactvideo;

import com.bilibili.ship.theseus.united.page.toolbar.ToolbarRepository;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/UnitedInteractVideoStrategy$keepToolbarAsOptionPanel$2.class */
final class UnitedInteractVideoStrategy$keepToolbarAsOptionPanel$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final Function0<Unit> $replayAction;
    final boolean $showsReplay;
    private Object L$0;
    int label;
    final x this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.interactvideo.UnitedInteractVideoStrategy$keepToolbarAsOptionPanel$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/UnitedInteractVideoStrategy$keepToolbarAsOptionPanel$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final x this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(x xVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = xVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                ToolbarRepository toolbarRepository = this.this$0.f100012b;
                this.label = 1;
                if (toolbarRepository.i(this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.interactvideo.UnitedInteractVideoStrategy$keepToolbarAsOptionPanel$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/UnitedInteractVideoStrategy$keepToolbarAsOptionPanel$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final x this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(x xVar, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = xVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                ToolbarRepository toolbarRepository = this.this$0.f100012b;
                this.label = 1;
                if (toolbarRepository.h(this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.interactvideo.UnitedInteractVideoStrategy$keepToolbarAsOptionPanel$2$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/UnitedInteractVideoStrategy$keepToolbarAsOptionPanel$2$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final x this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(x xVar, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = xVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                ToolbarRepository toolbarRepository = this.this$0.f100012b;
                this.label = 1;
                Object objA = toolbarRepository.f103286j.a(this);
                if (objA != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objA = Unit.INSTANCE;
                }
                if (objA == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.interactvideo.UnitedInteractVideoStrategy$keepToolbarAsOptionPanel$2$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/UnitedInteractVideoStrategy$keepToolbarAsOptionPanel$2$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Function0<Unit> $replayAction;
        final boolean $showsReplay;
        int label;
        final x this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(boolean z6, x xVar, Function0<Unit> function0, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.$showsReplay = z6;
            this.this$0 = xVar;
            this.$replayAction = function0;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.$showsReplay, this.this$0, this.$replayAction, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.$showsReplay) {
                    ToolbarRepository toolbarRepository = this.this$0.f100012b;
                    Function0<Unit> function0 = this.$replayAction;
                    this.label = 1;
                    if (toolbarRepository.f(function0, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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
    public UnitedInteractVideoStrategy$keepToolbarAsOptionPanel$2(x xVar, boolean z6, Function0<Unit> function0, Continuation<? super UnitedInteractVideoStrategy$keepToolbarAsOptionPanel$2> continuation) {
        super(2, continuation);
        this.this$0 = xVar;
        this.$showsReplay = z6;
        this.$replayAction = function0;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UnitedInteractVideoStrategy$keepToolbarAsOptionPanel$2 unitedInteractVideoStrategy$keepToolbarAsOptionPanel$2 = new UnitedInteractVideoStrategy$keepToolbarAsOptionPanel$2(this.this$0, this.$showsReplay, this.$replayAction, continuation);
        unitedInteractVideoStrategy$keepToolbarAsOptionPanel$2.L$0 = obj;
        return unitedInteractVideoStrategy$keepToolbarAsOptionPanel$2;
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
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.this$0, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this.$showsReplay, this.this$0, this.$replayAction, null), 3, (Object) null);
    }
}
