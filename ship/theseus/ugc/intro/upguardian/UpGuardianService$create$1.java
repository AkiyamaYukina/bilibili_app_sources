package com.bilibili.ship.theseus.ugc.intro.upguardian;

import com.bilibili.ship.theseus.united.page.view.d;
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
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upguardian/UpGuardianService$create$1.class */
public final class UpGuardianService$create$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final e $data;
    final com.bilibili.ship.theseus.ugc.intro.b $placeHolder;
    int label;
    final UpGuardianService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.upguardian.UpGuardianService$create$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upguardian/UpGuardianService$create$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final e $data;
        final com.bilibili.ship.theseus.ugc.intro.b $placeHolder;
        private Object L$0;
        int label;
        final UpGuardianService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.upguardian.UpGuardianService$create$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upguardian/UpGuardianService$create$1$1$1.class */
        public static final class C08811 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final e $data;
            final com.bilibili.ship.theseus.ugc.intro.b $placeHolder;
            int label;
            final UpGuardianService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.upguardian.UpGuardianService$create$1$1$1$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upguardian/UpGuardianService$create$1$1$1$a.class */
            public static final class a<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final UpGuardianService f97597a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final e f97598b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final com.bilibili.ship.theseus.ugc.intro.b f97599c;

                public a(UpGuardianService upGuardianService, e eVar, com.bilibili.ship.theseus.ugc.intro.b bVar) {
                    this.f97597a = upGuardianService;
                    this.f97598b = eVar;
                    this.f97599c = bVar;
                }

                public final Object emit(Object obj, Continuation continuation) {
                    UpGuardianService.b(this.f97597a, ((Boolean) obj).booleanValue(), false, this.f97598b, 6, this.f97599c);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08811(UpGuardianService upGuardianService, e eVar, com.bilibili.ship.theseus.ugc.intro.b bVar, Continuation<? super C08811> continuation) {
                super(2, continuation);
                this.this$0 = upGuardianService;
                this.$data = eVar;
                this.$placeHolder = bVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C08811(this.this$0, this.$data, this.$placeHolder, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowDrop = FlowKt.drop(this.this$0.f97581b.f103999g, 1);
                    a aVar = new a(this.this$0, this.$data, this.$placeHolder);
                    this.label = 1;
                    if (flowDrop.collect(aVar, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.upguardian.UpGuardianService$create$1$1$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upguardian/UpGuardianService$create$1$1$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final e $data;
            final com.bilibili.ship.theseus.ugc.intro.b $placeHolder;
            int label;
            final UpGuardianService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.upguardian.UpGuardianService$create$1$1$2$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upguardian/UpGuardianService$create$1$1$2$a.class */
            public static final class a<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final UpGuardianService f97600a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final e f97601b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final com.bilibili.ship.theseus.ugc.intro.b f97602c;

                public a(UpGuardianService upGuardianService, e eVar, com.bilibili.ship.theseus.ugc.intro.b bVar) {
                    this.f97600a = upGuardianService;
                    this.f97601b = eVar;
                    this.f97602c = bVar;
                }

                public final Object emit(Object obj, Continuation continuation) {
                    UpGuardianService.b(this.f97600a, ((Boolean) obj).booleanValue(), false, this.f97601b, 7, this.f97602c);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(UpGuardianService upGuardianService, e eVar, com.bilibili.ship.theseus.ugc.intro.b bVar, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = upGuardianService;
                this.$data = eVar;
                this.$placeHolder = bVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$data, this.$placeHolder, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowDrop = FlowKt.drop(this.this$0.f97581b.f104002k, 1);
                    a aVar = new a(this.this$0, this.$data, this.$placeHolder);
                    this.label = 1;
                    if (flowDrop.collect(aVar, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.upguardian.UpGuardianService$create$1$1$3, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upguardian/UpGuardianService$create$1$1$3.class */
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final e $data;
            final com.bilibili.ship.theseus.ugc.intro.b $placeHolder;
            int label;
            final UpGuardianService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.upguardian.UpGuardianService$create$1$1$3$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upguardian/UpGuardianService$create$1$1$3$a.class */
            public static final class a<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final UpGuardianService f97603a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final e f97604b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final com.bilibili.ship.theseus.ugc.intro.b f97605c;

                public a(UpGuardianService upGuardianService, e eVar, com.bilibili.ship.theseus.ugc.intro.b bVar) {
                    this.f97603a = upGuardianService;
                    this.f97604b = eVar;
                    this.f97605c = bVar;
                }

                public final Object emit(Object obj, Continuation continuation) {
                    UpGuardianService.b(this.f97603a, ((Boolean) obj).booleanValue(), false, this.f97604b, 8, this.f97605c);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(UpGuardianService upGuardianService, e eVar, com.bilibili.ship.theseus.ugc.intro.b bVar, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = upGuardianService;
                this.$data = eVar;
                this.$placeHolder = bVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, this.$data, this.$placeHolder, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowDrop = FlowKt.drop(this.this$0.f97581b.f103998f, 1);
                    a aVar = new a(this.this$0, this.$data, this.$placeHolder);
                    this.label = 1;
                    if (flowDrop.collect(aVar, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.upguardian.UpGuardianService$create$1$1$4, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upguardian/UpGuardianService$create$1$1$4.class */
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final e $data;
            final com.bilibili.ship.theseus.ugc.intro.b $placeHolder;
            int label;
            final UpGuardianService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.upguardian.UpGuardianService$create$1$1$4$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upguardian/UpGuardianService$create$1$1$4$1.class */
            public static final class C08821 extends SuspendLambda implements Function2<d.a, Continuation<? super Unit>, Object> {
                final e $data;
                final com.bilibili.ship.theseus.ugc.intro.b $placeHolder;
                Object L$0;
                int label;
                final UpGuardianService this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C08821(UpGuardianService upGuardianService, e eVar, com.bilibili.ship.theseus.ugc.intro.b bVar, Continuation<? super C08821> continuation) {
                    super(2, continuation);
                    this.this$0 = upGuardianService;
                    this.$data = eVar;
                    this.$placeHolder = bVar;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C08821 c08821 = new C08821(this.this$0, this.$data, this.$placeHolder, continuation);
                    c08821.L$0 = obj;
                    return c08821;
                }

                public final Object invoke(d.a aVar, Continuation<? super Unit> continuation) {
                    return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i7 = this.label;
                    if (i7 == 0) {
                        ResultKt.throwOnFailure(obj);
                        d.a aVar = (d.a) this.L$0;
                        if (aVar != null) {
                            UpGuardianService upGuardianService = this.this$0;
                            d.a aVar2 = !upGuardianService.f97593o ? aVar : null;
                            if (aVar2 != null) {
                                UpGuardianService.b(upGuardianService, false, aVar.f104067k, this.$data, 1, this.$placeHolder);
                                this.L$0 = aVar2;
                                this.label = 1;
                                if (UpGuardianService.a(upGuardianService, aVar.f104067k, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
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
            public AnonymousClass4(UpGuardianService upGuardianService, e eVar, com.bilibili.ship.theseus.ugc.intro.b bVar, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = upGuardianService;
                this.$data = eVar;
                this.$placeHolder = bVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.this$0, this.$data, this.$placeHolder, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowDrop = FlowKt.drop(this.this$0.f97582c.f104057d, 1);
                    C08821 c08821 = new C08821(this.this$0, this.$data, this.$placeHolder, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowDrop, c08821, this) == coroutine_suspended) {
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
        public AnonymousClass1(UpGuardianService upGuardianService, e eVar, com.bilibili.ship.theseus.ugc.intro.b bVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = upGuardianService;
            this.$data = eVar;
            this.$placeHolder = bVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$data, this.$placeHolder, continuation);
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
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C08811(this.this$0, this.$data, this.$placeHolder, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$data, this.$placeHolder, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.this$0, this.$data, this.$placeHolder, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this.this$0, this.$data, this.$placeHolder, null), 3, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpGuardianService$create$1(UpGuardianService upGuardianService, e eVar, com.bilibili.ship.theseus.ugc.intro.b bVar, Continuation<? super UpGuardianService$create$1> continuation) {
        super(1, continuation);
        this.this$0 = upGuardianService;
        this.$data = eVar;
        this.$placeHolder = bVar;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new UpGuardianService$create$1(this.this$0, this.$data, this.$placeHolder, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        UpGuardianService upGuardianService = this.this$0;
        BuildersKt.launch$default(upGuardianService.f97580a, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(upGuardianService, this.$data, this.$placeHolder, null), 3, (Object) null);
        return Unit.INSTANCE;
    }
}
