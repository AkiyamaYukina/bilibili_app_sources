package com.bilibili.ship.theseus.ogv.intro.section.service;

import com.bilibili.ship.theseus.ogv.intro.section.ui.v;
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
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/service/OgvSectionTitleUIComponentService$buildFeatureSectionTitleUIComponent$1.class */
final class OgvSectionTitleUIComponentService$buildFeatureSectionTitleUIComponent$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final v.a $vm;
    int label;
    final h this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.service.OgvSectionTitleUIComponentService$buildFeatureSectionTitleUIComponent$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/service/OgvSectionTitleUIComponentService$buildFeatureSectionTitleUIComponent$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final v.a $vm;
        private Object L$0;
        int label;
        final h this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.service.OgvSectionTitleUIComponentService$buildFeatureSectionTitleUIComponent$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/service/OgvSectionTitleUIComponentService$buildFeatureSectionTitleUIComponent$1$1$1.class */
        public static final class C07221 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final v.a $vm;
            int label;
            final h this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.service.OgvSectionTitleUIComponentService$buildFeatureSectionTitleUIComponent$1$1$1$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/service/OgvSectionTitleUIComponentService$buildFeatureSectionTitleUIComponent$1$1$1$a.class */
            public static final class a<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final v.a f93773a;

                public a(v.a aVar) {
                    this.f93773a = aVar;
                }

                public final Object emit(Object obj, Continuation continuation) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    v.a aVar = this.f93773a;
                    if (zBooleanValue != aVar.f93903l) {
                        aVar.f93903l = zBooleanValue;
                        aVar.notifyPropertyChanged(489);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07221(h hVar, v.a aVar, Continuation<? super C07221> continuation) {
                super(2, continuation);
                this.this$0 = hVar;
                this.$vm = aVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C07221(this.this$0, this.$vm, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    MutableStateFlow<Boolean> mutableStateFlow = this.this$0.f93796b.f7441i;
                    a aVar = new a(this.$vm);
                    this.label = 1;
                    if (mutableStateFlow.collect(aVar, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.service.OgvSectionTitleUIComponentService$buildFeatureSectionTitleUIComponent$1$1$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/service/OgvSectionTitleUIComponentService$buildFeatureSectionTitleUIComponent$1$1$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final v.a $vm;
            int label;
            final h this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.service.OgvSectionTitleUIComponentService$buildFeatureSectionTitleUIComponent$1$1$2$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/service/OgvSectionTitleUIComponentService$buildFeatureSectionTitleUIComponent$1$1$2$a.class */
            public static final class a<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final v.a f93774a;

                public a(v.a aVar) {
                    this.f93774a = aVar;
                }

                public final Object emit(Object obj, Continuation continuation) {
                    int iIntValue = ((Number) obj).intValue();
                    v.a aVar = this.f93774a;
                    if (iIntValue != aVar.f93905n) {
                        aVar.f93905n = iIntValue;
                        aVar.notifyPropertyChanged(285);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(h hVar, v.a aVar, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = hVar;
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
                    StateFlow<Integer> stateFlow = this.this$0.f93799e.f100020a;
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
        public AnonymousClass1(h hVar, v.a aVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = hVar;
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
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C07221(this.this$0, this.$vm, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$vm, null), 3, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvSectionTitleUIComponentService$buildFeatureSectionTitleUIComponent$1(h hVar, v.a aVar, Continuation<? super OgvSectionTitleUIComponentService$buildFeatureSectionTitleUIComponent$1> continuation) {
        super(1, continuation);
        this.this$0 = hVar;
        this.$vm = aVar;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new OgvSectionTitleUIComponentService$buildFeatureSectionTitleUIComponent$1(this.this$0, this.$vm, continuation);
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
