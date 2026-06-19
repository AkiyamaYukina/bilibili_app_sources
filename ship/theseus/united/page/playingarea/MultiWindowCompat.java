package com.bilibili.ship.theseus.united.page.playingarea;

import androidx.compose.runtime.internal.StabilityInferred;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/MultiWindowCompat.class */
@StabilityInferred(parameters = 0)
public final class MultiWindowCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.h f102245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f102246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Flow<Boolean> f102247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final PageNestedScrollFusionRepository f102248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final g f102249e;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.playingarea.MultiWindowCompat$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/MultiWindowCompat$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final MultiWindowCompat this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.playingarea.MultiWindowCompat$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/MultiWindowCompat$1$1.class */
        public static final class C10811 extends SuspendLambda implements Function2<IndexedValue<? extends Boolean>, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final MultiWindowCompat this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.playingarea.MultiWindowCompat$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/MultiWindowCompat$1$1$1.class */
            public static final class C10821 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                private Object L$0;
                int label;
                final MultiWindowCompat this$0;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.playingarea.MultiWindowCompat$1$1$1$1, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/MultiWindowCompat$1$1$1$1.class */
                public static final class C10831 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    Object L$0;
                    Object L$1;
                    int label;
                    final MultiWindowCompat this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C10831(MultiWindowCompat multiWindowCompat, Continuation<? super C10831> continuation) {
                        super(2, continuation);
                        this.this$0 = multiWindowCompat;
                    }

                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C10831(this.this$0, continuation);
                    }

                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                    }

                    public final Object invokeSuspend(Object obj) throws Throwable {
                        g gVar;
                        String str;
                        g gVar2;
                        String str2;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i7 = this.label;
                        if (i7 == 0) {
                            ResultKt.throwOnFailure(obj);
                            MultiWindowCompat multiWindowCompat = this.this$0;
                            gVar = multiWindowCompat.f102249e;
                            multiWindowCompat.getClass();
                            gVar.f("MultiWindowCompat");
                            try {
                                this.L$0 = gVar;
                                this.L$1 = "MultiWindowCompat";
                                this.label = 1;
                                if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                str2 = "MultiWindowCompat";
                            } catch (Throwable th) {
                                th = th;
                                str = "MultiWindowCompat";
                                gVar2 = gVar;
                                gVar2.j(str);
                                throw th;
                            }
                        } else {
                            if (i7 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            String str3 = (String) this.L$1;
                            gVar = (g) this.L$0;
                            str = str3;
                            gVar2 = gVar;
                            try {
                                ResultKt.throwOnFailure(obj);
                                str2 = str3;
                            } catch (Throwable th2) {
                                th = th2;
                                gVar2.j(str);
                                throw th;
                            }
                        }
                        str = str2;
                        gVar2 = gVar;
                        throw new KotlinNothingValueException();
                    }
                }

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.playingarea.MultiWindowCompat$1$1$1$2, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/MultiWindowCompat$1$1$1$2.class */
                public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    int label;
                    final MultiWindowCompat this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass2(MultiWindowCompat multiWindowCompat, Continuation<? super AnonymousClass2> continuation) {
                        super(2, continuation);
                        this.this$0 = multiWindowCompat;
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
                            MultiWindowCompat multiWindowCompat = this.this$0;
                            this.label = 1;
                            multiWindowCompat.getClass();
                            if (CoroutineScopeKt.coroutineScope(new MultiWindowCompat$changeScrollEnabled$2(multiWindowCompat, null), this) == coroutine_suspended) {
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
                public C10821(MultiWindowCompat multiWindowCompat, Continuation<? super C10821> continuation) {
                    super(2, continuation);
                    this.this$0 = multiWindowCompat;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C10821 c10821 = new C10821(this.this$0, continuation);
                    c10821.L$0 = obj;
                    return c10821;
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
                    BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C10831(this.this$0, null), 3, (Object) null);
                    BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, null), 3, (Object) null);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10811(MultiWindowCompat multiWindowCompat, Continuation<? super C10811> continuation) {
                super(2, continuation);
                this.this$0 = multiWindowCompat;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C10811 c10811 = new C10811(this.this$0, continuation);
                c10811.L$0 = obj;
                return c10811;
            }

            public final Object invoke(IndexedValue<Boolean> indexedValue, Continuation<? super Unit> continuation) {
                return create(indexedValue, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    IndexedValue indexedValue = (IndexedValue) this.L$0;
                    int iComponent1 = indexedValue.component1();
                    boolean zBooleanValue = ((Boolean) indexedValue.component2()).booleanValue();
                    defpackage.a.b("[theseus-united-MultiWindowCompat$1$1-invokeSuspend] ", "multi window change index = " + iComponent1 + ", multiWindow = " + zBooleanValue, "MultiWindowCompat$1$1-invokeSuspend");
                    if (iComponent1 == 0 && !zBooleanValue) {
                        return Unit.INSTANCE;
                    }
                    if (zBooleanValue) {
                        C10821 c10821 = new C10821(this.this$0, null);
                        this.label = 1;
                        if (CoroutineScopeKt.coroutineScope(c10821, this) == coroutine_suspended) {
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
        public AnonymousClass1(MultiWindowCompat multiWindowCompat, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = multiWindowCompat;
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
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.withIndex(this.this$0.f102247c));
                C10811 c10811 = new C10811(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, c10811, this) == coroutine_suspended) {
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

    @Inject
    public MultiWindowCompat(@NotNull com.bilibili.ship.theseus.keel.player.h hVar, @NotNull CoroutineScope coroutineScope, @NotNull Flow<Boolean> flow, @NotNull PageNestedScrollFusionRepository pageNestedScrollFusionRepository, @NotNull g gVar) {
        this.f102245a = hVar;
        this.f102246b = coroutineScope;
        this.f102247c = flow;
        this.f102248d = pageNestedScrollFusionRepository;
        this.f102249e = gVar;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
