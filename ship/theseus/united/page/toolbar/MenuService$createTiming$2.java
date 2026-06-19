package com.bilibili.ship.theseus.united.page.toolbar;

import com.bilibili.playerbizcommonv2.widget.setting.Z;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/MenuService$createTiming$2.class */
final class MenuService$createTiming$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final MutableStateFlow<String> $descriptionFlow;
    final MutableStateFlow<Boolean> $isTimingFlow;
    final Z $more;
    final Aj.f $timingReminderManager;
    int label;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.MenuService$createTiming$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/MenuService$createTiming$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final MutableStateFlow<String> $descriptionFlow;
        final MutableStateFlow<Boolean> $isTimingFlow;
        final Z $more;
        final Aj.f $timingReminderManager;
        private Object L$0;
        int label;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.MenuService$createTiming$2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/MenuService$createTiming$2$1$1.class */
        public static final class C11291 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final MutableStateFlow<String> $descriptionFlow;
            final MutableStateFlow<Boolean> $isTimingFlow;
            final Z $more;
            final Aj.f $timingReminderManager;
            int label;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.MenuService$createTiming$2$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/MenuService$createTiming$2$1$1$1.class */
            public static final class C11301 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
                final MutableStateFlow<String> $descriptionFlow;
                final MutableStateFlow<Boolean> $isTimingFlow;
                final Z $more;
                final Aj.f $timingReminderManager;
                int I$0;
                int I$1;
                Object L$0;
                Object L$1;
                Object L$2;
                Object L$3;
                boolean Z$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C11301(Aj.f fVar, MutableStateFlow<String> mutableStateFlow, Z z6, MutableStateFlow<Boolean> mutableStateFlow2, Continuation<? super C11301> continuation) {
                    super(2, continuation);
                    this.$timingReminderManager = fVar;
                    this.$descriptionFlow = mutableStateFlow;
                    this.$more = z6;
                    this.$isTimingFlow = mutableStateFlow2;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C11301 c11301 = new C11301(this.$timingReminderManager, this.$descriptionFlow, this.$more, this.$isTimingFlow, continuation);
                    c11301.Z$0 = ((Boolean) obj).booleanValue();
                    return c11301;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
                }

                public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
                    return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x0085  */
                /* JADX WARN: Removed duplicated region for block: B:25:0x00f5  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00e9 -> B:24:0x00ef). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                    /*
                        Method dump skipped, instruction units count: 249
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.toolbar.MenuService$createTiming$2.AnonymousClass1.C11291.C11301.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11291(MutableStateFlow<Boolean> mutableStateFlow, Aj.f fVar, MutableStateFlow<String> mutableStateFlow2, Z z6, Continuation<? super C11291> continuation) {
                super(2, continuation);
                this.$isTimingFlow = mutableStateFlow;
                this.$timingReminderManager = fVar;
                this.$descriptionFlow = mutableStateFlow2;
                this.$more = z6;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C11291(this.$isTimingFlow, this.$timingReminderManager, this.$descriptionFlow, this.$more, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    MutableStateFlow<Boolean> mutableStateFlow = this.$isTimingFlow;
                    C11301 c11301 = new C11301(this.$timingReminderManager, this.$descriptionFlow, this.$more, mutableStateFlow, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(mutableStateFlow, c11301, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.MenuService$createTiming$2$1$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/MenuService$createTiming$2$1$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final MutableStateFlow<Boolean> $isTimingFlow;
            final Aj.f $timingReminderManager;
            Object L$0;
            int label;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.MenuService$createTiming$2$1$2$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/MenuService$createTiming$2$1$2$a.class */
            public static final class a implements zj.a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Aj.f f103279a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final MutableStateFlow<Boolean> f103280b;

                public a(Aj.f fVar, MutableStateFlow<Boolean> mutableStateFlow) {
                    this.f103279a = fVar;
                    this.f103280b = mutableStateFlow;
                }

                public final void a() {
                }

                public final void b() {
                }

                public final void c() {
                    BLog.i("MenuService$createTiming$2$1$2$callback$1-onClickRepeat", "[theseus-united-MenuService$createTiming$2$1$2$callback$1-onClickRepeat] click repeat");
                    long jC = this.f103279a.c();
                    MutableStateFlow<Boolean> mutableStateFlow = this.f103280b;
                    if (jC > 1000) {
                        mutableStateFlow.setValue(Boolean.TRUE);
                    } else {
                        mutableStateFlow.setValue(Boolean.FALSE);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(Aj.f fVar, MutableStateFlow<Boolean> mutableStateFlow, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$timingReminderManager = fVar;
                this.$isTimingFlow = mutableStateFlow;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$timingReminderManager, this.$isTimingFlow, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) throws Throwable {
                a aVar;
                a aVar2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Aj.f fVar = this.$timingReminderManager;
                    aVar = new a(fVar, this.$isTimingFlow);
                    try {
                        fVar.g(aVar);
                        this.L$0 = aVar;
                        this.label = 1;
                        if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Throwable th) {
                        th = th;
                        this.$timingReminderManager.l(aVar);
                        throw th;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a aVar3 = (a) this.L$0;
                    aVar2 = aVar3;
                    try {
                        ResultKt.throwOnFailure(obj);
                        aVar = aVar3;
                    } catch (Throwable th2) {
                        aVar = aVar2;
                        th = th2;
                        this.$timingReminderManager.l(aVar);
                        throw th;
                    }
                }
                aVar2 = aVar;
                throw new KotlinNothingValueException();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MutableStateFlow<Boolean> mutableStateFlow, Aj.f fVar, MutableStateFlow<String> mutableStateFlow2, Z z6, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$isTimingFlow = mutableStateFlow;
            this.$timingReminderManager = fVar;
            this.$descriptionFlow = mutableStateFlow2;
            this.$more = z6;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$isTimingFlow, this.$timingReminderManager, this.$descriptionFlow, this.$more, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
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
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C11291(this.$isTimingFlow, this.$timingReminderManager, this.$descriptionFlow, this.$more, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.$timingReminderManager, this.$isTimingFlow, null), 3, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuService$createTiming$2(MutableStateFlow<Boolean> mutableStateFlow, Aj.f fVar, MutableStateFlow<String> mutableStateFlow2, Z z6, Continuation<? super MenuService$createTiming$2> continuation) {
        super(1, continuation);
        this.$isTimingFlow = mutableStateFlow;
        this.$timingReminderManager = fVar;
        this.$descriptionFlow = mutableStateFlow2;
        this.$more = z6;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new MenuService$createTiming$2(this.$isTimingFlow, this.$timingReminderManager, this.$descriptionFlow, this.$more, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$isTimingFlow, this.$timingReminderManager, this.$descriptionFlow, this.$more, null);
            this.label = 1;
            if (CoroutineScopeKt.coroutineScope(anonymousClass1, this) == coroutine_suspended) {
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
