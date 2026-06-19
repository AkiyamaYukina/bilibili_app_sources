package com.bilibili.ship.theseus.ogv.intro.livereserve;

import androidx.core.content.ContextCompat;
import com.bilibili.lib.theme.R$color;
import com.bilibili.ship.theseus.ogv.intro.livereserve.b;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/livereserve/OgvLiveReserveUIComponentService$create$1.class */
final class OgvLiveReserveUIComponentService$create$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final b.a $vm;
    int label;
    final e this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.livereserve.OgvLiveReserveUIComponentService$create$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/livereserve/OgvLiveReserveUIComponentService$create$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final b.a $vm;
        private Object L$0;
        int label;
        final e this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.livereserve.OgvLiveReserveUIComponentService$create$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/livereserve/OgvLiveReserveUIComponentService$create$1$1$1.class */
        public static final class C07051 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final b.a $vm;
            int label;
            final e this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.livereserve.OgvLiveReserveUIComponentService$create$1$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/livereserve/OgvLiveReserveUIComponentService$create$1$1$1$1.class */
            public static final class C07061 extends SuspendLambda implements Function2<OgvLiveReserveVo, Continuation<? super Unit>, Object> {
                final b.a $vm;
                Object L$0;
                int label;
                final e this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C07061(e eVar, b.a aVar, Continuation<? super C07061> continuation) {
                    super(2, continuation);
                    this.this$0 = eVar;
                    this.$vm = aVar;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C07061 c07061 = new C07061(this.this$0, this.$vm, continuation);
                    c07061.L$0 = obj;
                    return c07061;
                }

                public final Object invoke(OgvLiveReserveVo ogvLiveReserveVo, Continuation<? super Unit> continuation) {
                    return create(ogvLiveReserveVo, continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    OgvLiveReserveVo ogvLiveReserveVo = (OgvLiveReserveVo) this.L$0;
                    e eVar = this.this$0;
                    b.a aVar = this.$vm;
                    eVar.getClass();
                    boolean z6 = false;
                    if (ogvLiveReserveVo == null) {
                        if (aVar.f93313n != 0) {
                            aVar.f93313n = 0;
                            aVar.notifyPropertyChanged(357);
                        }
                        if (aVar.f93314o) {
                            aVar.f93314o = false;
                            aVar.notifyPropertyChanged(358);
                        }
                    } else {
                        aVar.f93307g = ogvLiveReserveVo.f93294k;
                        aVar.f93305e = ogvLiveReserveVo.a();
                        aVar.f93306f = ogvLiveReserveVo.f93290f;
                        boolean zD = ogvLiveReserveVo.d();
                        aVar.f93303c = zD;
                        int color = (!zD || ogvLiveReserveVo.c()) ? ContextCompat.getColor(eVar.f93319a, R$color.Brand_pink) : ContextCompat.getColor(eVar.f93319a, R$color.Ga5);
                        if (color != aVar.f93312m) {
                            aVar.f93312m = color;
                            aVar.notifyPropertyChanged(80);
                        }
                        aVar.f93304d = ogvLiveReserveVo.f93285a;
                        if (true != aVar.f93314o) {
                            aVar.f93314o = true;
                            aVar.notifyPropertyChanged(358);
                        }
                        int iB = Uj0.c.b(51, eVar.f93319a);
                        if (iB != aVar.f93313n) {
                            aVar.f93313n = iB;
                            aVar.notifyPropertyChanged(357);
                        }
                        if (Cj0.a.a(eVar.f93319a)) {
                            String str = aVar.f93310k;
                            String str2 = ogvLiveReserveVo.f93287c;
                            if (!Intrinsics.areEqual(str2, str)) {
                                aVar.f93310k = str2;
                                aVar.notifyPropertyChanged(288);
                            }
                            if (str2.length() > 0) {
                                z6 = true;
                            }
                            if (z6 != aVar.f93311l) {
                                aVar.f93311l = z6;
                                aVar.notifyPropertyChanged(289);
                            }
                        } else {
                            String str3 = aVar.f93310k;
                            String str4 = ogvLiveReserveVo.f93286b;
                            if (!Intrinsics.areEqual(str4, str3)) {
                                aVar.f93310k = str4;
                                aVar.notifyPropertyChanged(288);
                            }
                            boolean z7 = false;
                            if (str4.length() > 0) {
                                z7 = true;
                            }
                            if (z7 != aVar.f93311l) {
                                aVar.f93311l = z7;
                                aVar.notifyPropertyChanged(289);
                            }
                        }
                        String str5 = aVar.f93308i;
                        String str6 = ogvLiveReserveVo.f93288d;
                        if (!Intrinsics.areEqual(str6, str5)) {
                            aVar.f93308i = str6;
                            aVar.notifyPropertyChanged(655);
                        }
                        String strB = ogvLiveReserveVo.b();
                        if (!Intrinsics.areEqual(strB, aVar.f93309j)) {
                            aVar.f93309j = strB;
                            aVar.notifyPropertyChanged(79);
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07051(e eVar, b.a aVar, Continuation<? super C07051> continuation) {
                super(2, continuation);
                this.this$0 = eVar;
                this.$vm = aVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C07051(this.this$0, this.$vm, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    e eVar = this.this$0;
                    MutableStateFlow mutableStateFlow = eVar.f93324f.f93299c;
                    C07061 c07061 = new C07061(eVar, this.$vm, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(mutableStateFlow, c07061, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.livereserve.OgvLiveReserveUIComponentService$create$1$1$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/livereserve/OgvLiveReserveUIComponentService$create$1$1$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final b.a $vm;
            int label;
            final e this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.livereserve.OgvLiveReserveUIComponentService$create$1$1$2$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/livereserve/OgvLiveReserveUIComponentService$create$1$1$2$a.class */
            public static final class a<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final b.a f93284a;

                public a(b.a aVar) {
                    this.f93284a = aVar;
                }

                public final Object emit(Object obj, Continuation continuation) {
                    int iIntValue = ((Number) obj).intValue();
                    b.a aVar = this.f93284a;
                    if (iIntValue != aVar.f93315p) {
                        aVar.f93315p = iIntValue;
                        aVar.notifyPropertyChanged(285);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(e eVar, b.a aVar, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = eVar;
                this.$vm = aVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$vm, continuation);
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
                    StateFlow<Integer> stateFlow = this.this$0.f93325g.f100020a;
                    a aVar = new a(this.$vm);
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
        public AnonymousClass1(e eVar, b.a aVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = eVar;
            this.$vm = aVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$vm, continuation);
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
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C07051(this.this$0, this.$vm, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$vm, null), 3, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvLiveReserveUIComponentService$create$1(e eVar, b.a aVar, Continuation<? super OgvLiveReserveUIComponentService$create$1> continuation) {
        super(1, continuation);
        this.this$0 = eVar;
        this.$vm = aVar;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new OgvLiveReserveUIComponentService$create$1(this.this$0, this.$vm, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$vm, null);
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
