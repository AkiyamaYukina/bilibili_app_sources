package com.bilibili.ship.theseus.ogv.intro.followup;

import com.bilibili.community.follow.FollowSeasonRepository$flowOfFollowSeason$;
import com.bilibili.community.follow.FollowUpperRepository$flowOfFollowUpper$;
import com.bilibili.community.follow.f;
import com.bilibili.ship.theseus.ogv.intro.followup.c;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/followup/OgvGuideOfFollowUpperService$create$1.class */
public final class OgvGuideOfFollowUpperService$create$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final OgvGuideOfFollowUpperData $data;
    final c.a $upAfterFollowingFanVm;
    int label;
    final OgvGuideOfFollowUpperService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.followup.OgvGuideOfFollowUpperService$create$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/followup/OgvGuideOfFollowUpperService$create$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final OgvGuideOfFollowUpperData $data;
        final c.a $upAfterFollowingFanVm;
        private Object L$0;
        int label;
        final OgvGuideOfFollowUpperService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.followup.OgvGuideOfFollowUpperService$create$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/followup/OgvGuideOfFollowUpperService$create$1$1$1.class */
        public static final class C07011 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final OgvGuideOfFollowUpperData $data;
            final c.a $upAfterFollowingFanVm;
            int label;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.followup.OgvGuideOfFollowUpperService$create$1$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/followup/OgvGuideOfFollowUpperService$create$1$1$1$1.class */
            public static final class C07021 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
                final c.a $upAfterFollowingFanVm;
                Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C07021(c.a aVar, Continuation<? super C07021> continuation) {
                    super(2, continuation);
                    this.$upAfterFollowingFanVm = aVar;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C07021 c07021 = new C07021(this.$upAfterFollowingFanVm, continuation);
                    c07021.L$0 = obj;
                    return c07021;
                }

                public final Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    return create(bool, continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    Boolean bool = (Boolean) this.L$0;
                    if (bool != null) {
                        c.a aVar = this.$upAfterFollowingFanVm;
                        boolean zBooleanValue = bool.booleanValue();
                        if (zBooleanValue != aVar.f93082i) {
                            aVar.f93082i = zBooleanValue;
                            aVar.notifyPropertyChanged(18);
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07011(OgvGuideOfFollowUpperData ogvGuideOfFollowUpperData, c.a aVar, Continuation<? super C07011> continuation) {
                super(2, continuation);
                this.$data = ogvGuideOfFollowUpperData;
                this.$upAfterFollowingFanVm = aVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C07011(this.$data, this.$upAfterFollowingFanVm, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Upper upperB = this.$data.b();
                    if (upperB == null) {
                        return Unit.INSTANCE;
                    }
                    f fVar = f.a;
                    FollowUpperRepository$flowOfFollowUpper$.inlined.map.1 r02 = new FollowUpperRepository$flowOfFollowUpper$.inlined.map.1(f.c.b(f.f(upperB.f93060a)));
                    C07021 c07021 = new C07021(this.$upAfterFollowingFanVm, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(r02, c07021, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.followup.OgvGuideOfFollowUpperService$create$1$1$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/followup/OgvGuideOfFollowUpperService$create$1$1$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final OgvGuideOfFollowUpperData $data;
            final c.a $upAfterFollowingFanVm;
            int label;
            final OgvGuideOfFollowUpperService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.followup.OgvGuideOfFollowUpperService$create$1$1$2$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/followup/OgvGuideOfFollowUpperService$create$1$1$2$a.class */
            public static final class a<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final OgvGuideOfFollowUpperData f93057a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final c.a f93058b;

                public a(OgvGuideOfFollowUpperData ogvGuideOfFollowUpperData, c.a aVar) {
                    this.f93057a = ogvGuideOfFollowUpperData;
                    this.f93058b = aVar;
                }

                public final Object emit(Object obj, Continuation continuation) {
                    Upper upperB;
                    Unit unit;
                    if (((com.bilibili.community.follow.b) obj).a && (upperB = this.f93057a.b()) != null) {
                        f fVar = f.a;
                        Boolean bool = (Boolean) f.c.c(f.f(upperB.f93060a));
                        if (!(bool != null ? bool.booleanValue() : false)) {
                            this.f93058b.m(true);
                        }
                        unit = Unit.INSTANCE;
                    } else {
                        unit = Unit.INSTANCE;
                    }
                    return unit;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(OgvGuideOfFollowUpperService ogvGuideOfFollowUpperService, OgvGuideOfFollowUpperData ogvGuideOfFollowUpperData, c.a aVar, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = ogvGuideOfFollowUpperService;
                this.$data = ogvGuideOfFollowUpperData;
                this.$upAfterFollowingFanVm = aVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$data, this.$upAfterFollowingFanVm, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    long j7 = this.this$0.h.f94449a;
                    com.bilibili.community.follow.c cVar = com.bilibili.community.follow.c.a;
                    Flow flowDrop = FlowKt.drop(new FollowSeasonRepository$flowOfFollowSeason$.inlined.map.1(com.bilibili.community.follow.c.c.b(com.bilibili.community.follow.c.a(j7))), 1);
                    a aVar = new a(this.$data, this.$upAfterFollowingFanVm);
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.followup.OgvGuideOfFollowUpperService$create$1$1$3, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/followup/OgvGuideOfFollowUpperService$create$1$1$3.class */
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final c.a $upAfterFollowingFanVm;
            int label;
            final OgvGuideOfFollowUpperService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.followup.OgvGuideOfFollowUpperService$create$1$1$3$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/followup/OgvGuideOfFollowUpperService$create$1$1$3$a.class */
            public static final class a<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final c.a f93059a;

                public a(c.a aVar) {
                    this.f93059a = aVar;
                }

                public final Object emit(Object obj, Continuation continuation) {
                    int iIntValue = ((Number) obj).intValue();
                    c.a aVar = this.f93059a;
                    if (iIntValue != aVar.f93084k) {
                        aVar.f93084k = iIntValue;
                        aVar.notifyPropertyChanged(284);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(OgvGuideOfFollowUpperService ogvGuideOfFollowUpperService, c.a aVar, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = ogvGuideOfFollowUpperService;
                this.$upAfterFollowingFanVm = aVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, this.$upAfterFollowingFanVm, continuation);
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
                    StateFlow<Integer> stateFlow = this.this$0.f93055g.f100020a;
                    a aVar = new a(this.$upAfterFollowingFanVm);
                    this.label = 1;
                    if (stateFlow.collect(aVar, this) == coroutine_suspended) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OgvGuideOfFollowUpperData ogvGuideOfFollowUpperData, c.a aVar, OgvGuideOfFollowUpperService ogvGuideOfFollowUpperService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$data = ogvGuideOfFollowUpperData;
            this.$upAfterFollowingFanVm = aVar;
            this.this$0 = ogvGuideOfFollowUpperService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$data, this.$upAfterFollowingFanVm, this.this$0, continuation);
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
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C07011(this.$data, this.$upAfterFollowingFanVm, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$data, this.$upAfterFollowingFanVm, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.this$0, this.$upAfterFollowingFanVm, null), 3, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvGuideOfFollowUpperService$create$1(OgvGuideOfFollowUpperData ogvGuideOfFollowUpperData, c.a aVar, OgvGuideOfFollowUpperService ogvGuideOfFollowUpperService, Continuation<? super OgvGuideOfFollowUpperService$create$1> continuation) {
        super(1, continuation);
        this.$data = ogvGuideOfFollowUpperData;
        this.$upAfterFollowingFanVm = aVar;
        this.this$0 = ogvGuideOfFollowUpperService;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new OgvGuideOfFollowUpperService$create$1(this.$data, this.$upAfterFollowingFanVm, this.this$0, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$data, this.$upAfterFollowingFanVm, this.this$0, null);
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
