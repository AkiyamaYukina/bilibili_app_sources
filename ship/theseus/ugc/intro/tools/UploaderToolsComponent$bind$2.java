package com.bilibili.ship.theseus.ugc.intro.tools;

import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.framework.exposure.core.collecter.ViewExposureLayoutInfoCollectorKt;
import com.bilibili.ship.theseus.ugc.intro.tools.UploaderToolsComponent;
import com.bilibili.ship.theseus.ugc.intro.tools.UploaderToolsComponent$bind$2;
import dv0.r0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/tools/UploaderToolsComponent$bind$2.class */
public final class UploaderToolsComponent$bind$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final r0 $binding;
    private Object L$0;
    int label;
    final UploaderToolsComponent this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.tools.UploaderToolsComponent$bind$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/tools/UploaderToolsComponent$bind$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final r0 $binding;
        int label;
        final UploaderToolsComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.tools.UploaderToolsComponent$bind$2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/tools/UploaderToolsComponent$bind$2$1$1.class */
        public static final class C08511 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
            final ConstraintLayout $root;
            int I$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08511(ConstraintLayout constraintLayout, Continuation<? super C08511> continuation) {
                super(2, continuation);
                this.$root = constraintLayout;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C08511 c08511 = new C08511(this.$root, continuation);
                c08511.I$0 = ((Number) obj).intValue();
                return c08511;
            }

            public final Object invoke(int i7, Continuation<? super Unit> continuation) {
                return create(Integer.valueOf(i7), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).intValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                int iDpToPx = DimenUtilsKt.dpToPx(this.I$0);
                ConstraintLayout constraintLayout = this.$root;
                constraintLayout.setPadding(iDpToPx, constraintLayout.getPaddingTop(), iDpToPx, this.$root.getPaddingBottom());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(r0 r0Var, UploaderToolsComponent uploaderToolsComponent, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$binding = r0Var;
            this.this$0 = uploaderToolsComponent;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$binding, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                ConstraintLayout constraintLayout = this.$binding.f117115a;
                StateFlow<Integer> stateFlow = this.this$0.f97184b;
                C08511 c08511 = new C08511(constraintLayout, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, c08511, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.tools.UploaderToolsComponent$bind$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/tools/UploaderToolsComponent$bind$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final r0 $binding;
        int label;
        final UploaderToolsComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.tools.UploaderToolsComponent$bind$2$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/tools/UploaderToolsComponent$bind$2$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<UploaderToolsComponent.b, Continuation<? super Unit>, Object> {
            final r0 $binding;
            Object L$0;
            int label;
            final UploaderToolsComponent this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(r0 r0Var, UploaderToolsComponent uploaderToolsComponent, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$binding = r0Var;
                this.this$0 = uploaderToolsComponent;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$0(UploaderToolsComponent uploaderToolsComponent, UploaderToolsComponent.b bVar) {
                MutableSharedFlow<UploaderToolsComponent.a> mutableSharedFlow = uploaderToolsComponent.f97185c;
                List<b> list = bVar.f97192a.f97224b;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((b) it.next()).f97211b);
                }
                List<b> list2 = bVar.f97192a.f97224b;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((b) it2.next()).f97215f);
                }
                mutableSharedFlow.tryEmit(new UploaderToolsComponent.a.b(arrayList, arrayList2));
                return Unit.INSTANCE;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$binding, this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(UploaderToolsComponent.b bVar, Continuation<? super Unit> continuation) {
                return create(bVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                final UploaderToolsComponent.b bVar = (UploaderToolsComponent.b) this.L$0;
                if (bVar.f97192a == null) {
                    return Unit.INSTANCE;
                }
                final UploaderToolsComponent uploaderToolsComponent = this.this$0;
                ViewExposureLayoutInfoCollectorKt.setExposureLayoutInfoReceiver(this.$binding.f117115a, new ExposureEntry(com.bilibili.ship.theseus.united.page.report.a.f102493a, new Function0(uploaderToolsComponent, bVar) { // from class: com.bilibili.ship.theseus.ugc.intro.tools.e

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final UploaderToolsComponent f97220a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final UploaderToolsComponent.b f97221b;

                    {
                        this.f97220a = uploaderToolsComponent;
                        this.f97221b = bVar;
                    }

                    public final Object invoke() {
                        return UploaderToolsComponent$bind$2.AnonymousClass2.AnonymousClass1.invokeSuspend$lambda$0(this.f97220a, this.f97221b);
                    }
                }));
                TextView textView = this.$binding.f117116b;
                g gVar = bVar.f97192a;
                textView.setText(gVar.f97223a);
                UploaderToolsComponent.c cVar = this.this$0.f97187e;
                List<b> list = gVar.f97224b;
                if (!Intrinsics.areEqual(cVar.f97195a, list)) {
                    ((ArrayList) cVar.f97195a).clear();
                    ((ArrayList) cVar.f97195a).addAll(list);
                    cVar.notifyDataSetChanged();
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(UploaderToolsComponent uploaderToolsComponent, r0 r0Var, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = uploaderToolsComponent;
            this.$binding = r0Var;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$binding, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                UploaderToolsComponent uploaderToolsComponent = this.this$0;
                StateFlow<UploaderToolsComponent.b> stateFlow = uploaderToolsComponent.f97183a;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$binding, uploaderToolsComponent, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.tools.UploaderToolsComponent$bind$2$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/tools/UploaderToolsComponent$bind$2$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UploaderToolsComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.tools.UploaderToolsComponent$bind$2$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/tools/UploaderToolsComponent$bind$2$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<ProducerScope<? super UploaderToolsComponent.a.C0850a>, Continuation<? super Unit>, Object> {
            private Object L$0;
            int label;
            final UploaderToolsComponent this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.tools.UploaderToolsComponent$bind$2$3$1$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/tools/UploaderToolsComponent$bind$2$3$1$a.class */
            public static final class a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final ProducerScope<UploaderToolsComponent.a.C0850a> f97193a;

                /* JADX WARN: Multi-variable type inference failed */
                public a(ProducerScope<? super UploaderToolsComponent.a.C0850a> producerScope) {
                    this.f97193a = producerScope;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(UploaderToolsComponent uploaderToolsComponent, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = uploaderToolsComponent;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$0(UploaderToolsComponent uploaderToolsComponent) {
                uploaderToolsComponent.f97187e.f97196b = null;
                return Unit.INSTANCE;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(ProducerScope<? super UploaderToolsComponent.a.C0850a> producerScope, Continuation<? super Unit> continuation) {
                return create(producerScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    ProducerScope producerScope = (ProducerScope) this.L$0;
                    a aVar = new a(producerScope);
                    final UploaderToolsComponent uploaderToolsComponent = this.this$0;
                    uploaderToolsComponent.f97187e.f97196b = aVar;
                    Function0 function0 = new Function0(uploaderToolsComponent) { // from class: com.bilibili.ship.theseus.ugc.intro.tools.f

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final UploaderToolsComponent f97222a;

                        {
                            this.f97222a = uploaderToolsComponent;
                        }

                        public final Object invoke() {
                            return UploaderToolsComponent$bind$2.AnonymousClass3.AnonymousClass1.invokeSuspend$lambda$0(this.f97222a);
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.tools.UploaderToolsComponent$bind$2$3$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/tools/UploaderToolsComponent$bind$2$3$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final UploaderToolsComponent f97194a;

            public a(UploaderToolsComponent uploaderToolsComponent) {
                this.f97194a = uploaderToolsComponent;
            }

            public final Object emit(Object obj, Continuation continuation) {
                Object objEmit = this.f97194a.f97185c.emit((UploaderToolsComponent.a.C0850a) obj, continuation);
                if (objEmit != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objEmit = Unit.INSTANCE;
                }
                return objEmit;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(UploaderToolsComponent uploaderToolsComponent, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = uploaderToolsComponent;
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
    public UploaderToolsComponent$bind$2(r0 r0Var, UploaderToolsComponent uploaderToolsComponent, Continuation<? super UploaderToolsComponent$bind$2> continuation) {
        super(2, continuation);
        this.$binding = r0Var;
        this.this$0 = uploaderToolsComponent;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UploaderToolsComponent$bind$2 uploaderToolsComponent$bind$2 = new UploaderToolsComponent$bind$2(this.$binding, this.this$0, continuation);
        uploaderToolsComponent$bind$2.L$0 = obj;
        return uploaderToolsComponent$bind$2;
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
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.$binding, this.this$0, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$binding, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.this$0, null), 3, (Object) null);
    }
}
