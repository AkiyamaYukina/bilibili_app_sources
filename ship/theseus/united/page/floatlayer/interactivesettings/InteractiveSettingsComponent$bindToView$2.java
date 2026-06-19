package com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings;

import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bilibili.app.gemini.ui.UIComponentExtKt;
import com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings.InteractiveSettingsComponent$bindToView$2;
import com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings.InteractiveSettingsService;
import com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/interactivesettings/InteractiveSettingsComponent$bindToView$2.class */
final class InteractiveSettingsComponent$bindToView$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final TextView $close;
    final ConstraintLayout $root;
    private Object L$0;
    int label;
    final b this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings.InteractiveSettingsComponent$bindToView$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/interactivesettings/InteractiveSettingsComponent$bindToView$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final b this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings.InteractiveSettingsComponent$bindToView$2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/interactivesettings/InteractiveSettingsComponent$bindToView$2$1$1.class */
        public static final class C09881 extends SuspendLambda implements Function2<InteractiveSettingsService.a, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final b this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C09881(b bVar, Continuation<? super C09881> continuation) {
                super(2, continuation);
                this.this$0 = bVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C09881 c09881 = new C09881(this.this$0, continuation);
                c09881.L$0 = obj;
                return c09881;
            }

            public final Object invoke(InteractiveSettingsService.a aVar, Continuation<? super Unit> continuation) {
                return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                List<InteractionSection> list = ((InteractiveSettingsService.a) this.L$0).f99798a;
                e eVar = this.this$0.f99800b;
                if (!Intrinsics.areEqual(list, eVar.f99810a)) {
                    ((ArrayList) eVar.f99810a).clear();
                    List<InteractionSection> list2 = eVar.f99810a;
                    ((ArrayList) list2).addAll(list);
                    eVar.notifyDataSetChanged();
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(b bVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = bVar;
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
                b bVar = this.this$0;
                StateFlow<InteractiveSettingsService.a> stateFlow = bVar.f99799a;
                C09881 c09881 = new C09881(bVar, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, c09881, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings.InteractiveSettingsComponent$bindToView$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/interactivesettings/InteractiveSettingsComponent$bindToView$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final TextView $close;
        int label;
        final b this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings.InteractiveSettingsComponent$bindToView$2$2$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/interactivesettings/InteractiveSettingsComponent$bindToView$2$2$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f99776a;

            public a(b bVar) {
                this.f99776a = bVar;
            }

            public final Object emit(Object obj, Continuation continuation) {
                Function0<Unit> function0 = this.f99776a.f99803e;
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(TextView textView, b bVar, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$close = textView;
            this.this$0 = bVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$close, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowA = UIComponentExtKt.a(this.$close);
                a aVar = new a(this.this$0);
                this.label = 1;
                if (flowA.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings.InteractiveSettingsComponent$bindToView$2$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/interactivesettings/InteractiveSettingsComponent$bindToView$2$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final ConstraintLayout $root;
        int label;
        final b this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings.InteractiveSettingsComponent$bindToView$2$3$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/interactivesettings/InteractiveSettingsComponent$bindToView$2$3$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f99777a;

            public a(b bVar) {
                this.f99777a = bVar;
            }

            public final Object emit(Object obj, Continuation continuation) {
                Function0<Unit> function0 = this.f99777a.f99803e;
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ConstraintLayout constraintLayout, b bVar, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$root = constraintLayout;
            this.this$0 = bVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.$root, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowA = UIComponentExtKt.a(this.$root);
                a aVar = new a(this.this$0);
                this.label = 1;
                if (flowA.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings.InteractiveSettingsComponent$bindToView$2$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/interactivesettings/InteractiveSettingsComponent$bindToView$2$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final b this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings.InteractiveSettingsComponent$bindToView$2$4$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/interactivesettings/InteractiveSettingsComponent$bindToView$2$4$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<ProducerScope<? super b.a.C0990a>, Continuation<? super Unit>, Object> {
            private Object L$0;
            int label;
            final b this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings.InteractiveSettingsComponent$bindToView$2$4$1$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/interactivesettings/InteractiveSettingsComponent$bindToView$2$4$1$a.class */
            public static final class a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final ProducerScope<b.a.C0990a> f99778a;

                /* JADX WARN: Multi-variable type inference failed */
                public a(ProducerScope<? super b.a.C0990a> producerScope) {
                    this.f99778a = producerScope;
                }

                public final void a(InteractionItem interactionItem) {
                    this.f99778a.trySend-JP2dKIU(new b.a.C0990a(interactionItem));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(b bVar, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = bVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$0(b bVar) {
                bVar.f99800b.f99811b = null;
                return Unit.INSTANCE;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(ProducerScope<? super b.a.C0990a> producerScope, Continuation<? super Unit> continuation) {
                return create(producerScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    ProducerScope producerScope = (ProducerScope) this.L$0;
                    a aVar = new a(producerScope);
                    final b bVar = this.this$0;
                    bVar.f99800b.f99811b = aVar;
                    Function0 function0 = new Function0(bVar) { // from class: com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings.c

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final b f99805a;

                        {
                            this.f99805a = bVar;
                        }

                        public final Object invoke() {
                            return InteractiveSettingsComponent$bindToView$2.AnonymousClass4.AnonymousClass1.invokeSuspend$lambda$0(this.f99805a);
                        }
                    };
                    this.label = 1;
                    if (ProduceKt.awaitClose(producerScope, function0, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings.InteractiveSettingsComponent$bindToView$2$4$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/interactivesettings/InteractiveSettingsComponent$bindToView$2$4$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f99779a;

            public a(b bVar) {
                this.f99779a = bVar;
            }

            public final Object emit(Object obj, Continuation continuation) {
                Object objEmit = this.f99779a.f99801c.emit((b.a.C0990a) obj, continuation);
                if (objEmit != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objEmit = Unit.INSTANCE;
                }
                return objEmit;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(b bVar, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = bVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowCallbackFlow = FlowKt.callbackFlow(new AnonymousClass1(this.this$0, null));
                a aVar = new a(this.this$0);
                this.label = 1;
                if (flowCallbackFlow.collect(aVar, this) == coroutine_suspended) {
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
    public InteractiveSettingsComponent$bindToView$2(b bVar, TextView textView, ConstraintLayout constraintLayout, Continuation<? super InteractiveSettingsComponent$bindToView$2> continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$close = textView;
        this.$root = constraintLayout;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InteractiveSettingsComponent$bindToView$2 interactiveSettingsComponent$bindToView$2 = new InteractiveSettingsComponent$bindToView$2(this.this$0, this.$close, this.$root, continuation);
        interactiveSettingsComponent$bindToView$2.L$0 = obj;
        return interactiveSettingsComponent$bindToView$2;
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
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.$close, this.this$0, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.$root, this.this$0, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this.this$0, null), 3, (Object) null);
    }
}
