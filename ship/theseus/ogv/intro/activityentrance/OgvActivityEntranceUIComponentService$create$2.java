package com.bilibili.ship.theseus.ogv.intro.activityentrance;

import com.bilibili.lib.performance.EntryPointKt;
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
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/activityentrance/OgvActivityEntranceUIComponentService$create$2.class */
public final class OgvActivityEntranceUIComponentService$create$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final b $vm;
    int label;
    final OgvActivityEntranceUIComponentService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.activityentrance.OgvActivityEntranceUIComponentService$create$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/activityentrance/OgvActivityEntranceUIComponentService$create$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
        final b $vm;
        private Object L$0;
        int label;
        final OgvActivityEntranceUIComponentService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.activityentrance.OgvActivityEntranceUIComponentService$create$2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/activityentrance/OgvActivityEntranceUIComponentService$create$2$1$1.class */
        public static final class C06901 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final b $vm;
            int label;
            final OgvActivityEntranceUIComponentService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.activityentrance.OgvActivityEntranceUIComponentService$create$2$1$1$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/activityentrance/OgvActivityEntranceUIComponentService$create$2$1$1$a.class */
            public static final class a<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final b f92304a;

                public a(b bVar) {
                    this.f92304a = bVar;
                }

                public final Object emit(Object obj, Continuation continuation) {
                    int iIntValue = ((Number) obj).intValue();
                    b bVar = this.f92304a;
                    if (iIntValue != bVar.f92313c) {
                        bVar.f92313c = iIntValue;
                        bVar.notifyPropertyChanged(285);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06901(OgvActivityEntranceUIComponentService ogvActivityEntranceUIComponentService, b bVar, Continuation<? super C06901> continuation) {
                super(2, continuation);
                this.this$0 = ogvActivityEntranceUIComponentService;
                this.$vm = bVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C06901(this.this$0, this.$vm, continuation);
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
                    StateFlow<Integer> stateFlow = this.this$0.f92303d.f100020a;
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
        public AnonymousClass1(OgvActivityEntranceUIComponentService ogvActivityEntranceUIComponentService, b bVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ogvActivityEntranceUIComponentService;
            this.$vm = bVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$vm, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
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
            return BuildersKt.launch$default((CoroutineScope) this.L$0, (CoroutineContext) null, (CoroutineStart) null, new C06901(this.this$0, this.$vm, null), 3, (Object) null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvActivityEntranceUIComponentService$create$2(b bVar, OgvActivityEntranceUIComponentService ogvActivityEntranceUIComponentService, Continuation<? super OgvActivityEntranceUIComponentService$create$2> continuation) {
        super(1, continuation);
        this.$vm = bVar;
        this.this$0 = ogvActivityEntranceUIComponentService;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new OgvActivityEntranceUIComponentService$create$2(this.$vm, this.this$0, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$vm, null);
                this.label = 1;
                Object objCoroutineScope = CoroutineScopeKt.coroutineScope(anonymousClass1, this);
                obj = objCoroutineScope;
                if (objCoroutineScope == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (EntryPointKt.getMemleakOptEnable()) {
                this.$vm.f92311a.clear();
            }
            return Unit.INSTANCE;
        } catch (Throwable th) {
            if (EntryPointKt.getMemleakOptEnable()) {
                this.$vm.f92311a.clear();
            }
            throw th;
        }
    }
}
