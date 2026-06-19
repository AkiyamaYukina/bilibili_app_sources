package com.bilibili.pegasus.components.recover;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.category.Z;
import com.bilibili.pegasus.BasePegasusComponent;
import com.bilibili.pegasus.HolderExtra;
import com.bilibili.pegasus.IPegasusViewModel;
import com.bilibili.pegasus.PegasusHeaderManager;
import com.bilibili.pegasus.PegasusHolderData;
import com.bilibili.pegasus.data.base.BasePegasusData;
import com.bilibili.pegasus.data.request.PegasusFlush;
import com.bilibili.pegasus.vm.C5771f;
import com.bilibili.pegasus.vm.D;
import com.bilibili.pegasus.vm.PegasusViewModel;
import com.bilibili.pegasus.vm.n;
import com.bilibili.pegasus.vm.y;
import fp0.p;
import hp0.C7488c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import lp0.C7879b;
import mp0.C8028c;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/recover/ManualRefreshRecoverComponent.class */
@StabilityInferred(parameters = 0)
public final class ManualRefreshRecoverComponent extends BasePegasusComponent {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final String f77139k = "ManualRefreshRecoverComponent";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f77140l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public List<? extends PegasusHolderData> f77141m = CollectionsKt.emptyList();

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.recover.ManualRefreshRecoverComponent$onViewCreated$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/recover/ManualRefreshRecoverComponent$onViewCreated$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ManualRefreshRecoverComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.recover.ManualRefreshRecoverComponent$onViewCreated$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/recover/ManualRefreshRecoverComponent$onViewCreated$1$1.class */
        public static final class C05021 extends SuspendLambda implements Function2<C7879b, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final ManualRefreshRecoverComponent this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05021(ManualRefreshRecoverComponent manualRefreshRecoverComponent, Continuation<? super C05021> continuation) {
                super(2, continuation);
                this.this$0 = manualRefreshRecoverComponent;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C05021 c05021 = new C05021(this.this$0, continuation);
                c05021.L$0 = obj;
                return c05021;
            }

            public final Object invoke(C7879b c7879b, Continuation<? super Unit> continuation) {
                return create(c7879b, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (((C7879b) this.L$0).f123308b) {
                    BLog.i("[Pegasus]ManualRefreshRecover", "RefreshStateAction isRefresh=true");
                    ManualRefreshRecoverComponent manualRefreshRecoverComponent = this.this$0;
                    manualRefreshRecoverComponent.d();
                    PegasusViewModel pegasusViewModelB = manualRefreshRecoverComponent.b();
                    if (pegasusViewModelB != null) {
                        pegasusViewModelB.f79017j = null;
                    }
                    manualRefreshRecoverComponent.f77141m = CollectionsKt.emptyList();
                    manualRefreshRecoverComponent.f77140l = -1;
                    PegasusViewModel pegasusViewModelB2 = manualRefreshRecoverComponent.b();
                    if (pegasusViewModelB2 == null) {
                        BLog.i("[Pegasus]ManualRefreshRecover", "onRefreshStarted, vm is null");
                    } else {
                        PegasusFlush pegasusFlush = pegasusViewModelB2.f79016i.f123311c;
                        List<PegasusHolderData> list = ((C8028c) pegasusViewModelB2.f79020m.getValue()).f123831a.f123826a;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : list) {
                            if (!(((PegasusHolderData) obj2) instanceof p)) {
                                arrayList.add(obj2);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : arrayList) {
                            if (!y.c((PegasusHolderData) obj3)) {
                                arrayList2.add(obj3);
                            }
                        }
                        if (arrayList2.isEmpty()) {
                            BLog.i("[Pegasus]ManualRefreshRecover", "onRefreshStarted, currentFeeds empty");
                            manualRefreshRecoverComponent.f77140l = pegasusFlush.getValue();
                        } else {
                            manualRefreshRecoverComponent.f77141m = arrayList2;
                            manualRefreshRecoverComponent.f77140l = pegasusFlush.getValue();
                            int value = pegasusFlush.getValue();
                            int size = manualRefreshRecoverComponent.f77141m.size();
                            StringBuilder sb = new StringBuilder("onRefreshStarted, flush=");
                            sb.append(pegasusFlush);
                            sb.append("(");
                            sb.append(value);
                            sb.append("), oldFeedsSize=");
                            Z.b(size, "[Pegasus]ManualRefreshRecover", sb);
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ManualRefreshRecoverComponent manualRefreshRecoverComponent, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = manualRefreshRecoverComponent;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            final StateFlow stateAction;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                IPegasusViewModel viewModel = this.this$0.getViewModel();
                if (viewModel != null && (stateAction = viewModel.getStateAction()) != null) {
                    Flow<Object> flow = new Flow<Object>(stateAction) { // from class: com.bilibili.pegasus.components.recover.ManualRefreshRecoverComponent$onViewCreated$1$invokeSuspend$$inlined$filterIsInstance$1

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final StateFlow f77142a;

                        /* JADX INFO: renamed from: com.bilibili.pegasus.components.recover.ManualRefreshRecoverComponent$onViewCreated$1$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/recover/ManualRefreshRecoverComponent$onViewCreated$1$invokeSuspend$$inlined$filterIsInstance$1$2.class */
                        public static final class AnonymousClass2<T> implements FlowCollector {

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final FlowCollector f77143a;

                            /* JADX INFO: renamed from: com.bilibili.pegasus.components.recover.ManualRefreshRecoverComponent$onViewCreated$1$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/recover/ManualRefreshRecoverComponent$onViewCreated$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.class */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                Object L$1;
                                int label;
                                Object result;
                                final AnonymousClass2 this$0;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass1(AnonymousClass2 anonymousClass2, Continuation continuation) {
                                    super(continuation);
                                    this.this$0 = anonymousClass2;
                                }

                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return this.this$0.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.f77143a = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                            */
                            public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                                /*
                                    r5 = this;
                                    r0 = r7
                                    boolean r0 = r0 instanceof com.bilibili.pegasus.components.recover.ManualRefreshRecoverComponent$onViewCreated$1$invokeSuspend$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1
                                    if (r0 == 0) goto L29
                                    r0 = r7
                                    com.bilibili.pegasus.components.recover.ManualRefreshRecoverComponent$onViewCreated$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 r0 = (com.bilibili.pegasus.components.recover.ManualRefreshRecoverComponent$onViewCreated$1$invokeSuspend$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1) r0
                                    r9 = r0
                                    r0 = r9
                                    int r0 = r0.label
                                    r8 = r0
                                    r0 = r8
                                    r1 = -2147483648(0xffffffff80000000, float:-0.0)
                                    r0 = r0 & r1
                                    if (r0 == 0) goto L29
                                    r0 = r9
                                    r1 = r8
                                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                    int r1 = r1 + r2
                                    r0.label = r1
                                    r0 = r9
                                    r7 = r0
                                    goto L33
                                L29:
                                    com.bilibili.pegasus.components.recover.ManualRefreshRecoverComponent$onViewCreated$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 r0 = new com.bilibili.pegasus.components.recover.ManualRefreshRecoverComponent$onViewCreated$1$invokeSuspend$$inlined$filterIsInstance$1$2$1
                                    r1 = r0
                                    r2 = r5
                                    r3 = r7
                                    r1.<init>(r2, r3)
                                    r7 = r0
                                L33:
                                    r0 = r7
                                    java.lang.Object r0 = r0.result
                                    r9 = r0
                                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                    r10 = r0
                                    r0 = r7
                                    int r0 = r0.label
                                    r8 = r0
                                    r0 = r8
                                    if (r0 == 0) goto L5e
                                    r0 = r8
                                    r1 = 1
                                    if (r0 != r1) goto L54
                                    r0 = r9
                                    kotlin.ResultKt.throwOnFailure(r0)
                                    goto L82
                                L54:
                                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                                    r1 = r0
                                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                                    r1.<init>(r2)
                                    throw r0
                                L5e:
                                    r0 = r9
                                    kotlin.ResultKt.throwOnFailure(r0)
                                    r0 = r6
                                    boolean r0 = r0 instanceof lp0.C7879b
                                    if (r0 == 0) goto L82
                                    r0 = r7
                                    r1 = 1
                                    r0.label = r1
                                    r0 = r5
                                    kotlinx.coroutines.flow.FlowCollector r0 = r0.f77143a
                                    r1 = r6
                                    r2 = r7
                                    java.lang.Object r0 = r0.emit(r1, r2)
                                    r1 = r10
                                    if (r0 != r1) goto L82
                                    r0 = r10
                                    return r0
                                L82:
                                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                                    return r0
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.recover.ManualRefreshRecoverComponent$onViewCreated$1$invokeSuspend$$inlined$filterIsInstance$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                            }
                        }

                        {
                            this.f77142a = stateAction;
                        }

                        public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                            Object objCollect = this.f77142a.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    };
                    C05021 c05021 = new C05021(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flow, c05021, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.recover.ManualRefreshRecoverComponent$onViewCreated$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/recover/ManualRefreshRecoverComponent$onViewCreated$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ManualRefreshRecoverComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.recover.ManualRefreshRecoverComponent$onViewCreated$2$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/recover/ManualRefreshRecoverComponent$onViewCreated$2$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ManualRefreshRecoverComponent f77144a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final PegasusViewModel f77145b;

            public a(ManualRefreshRecoverComponent manualRefreshRecoverComponent, PegasusViewModel pegasusViewModel) {
                this.f77144a = manualRefreshRecoverComponent;
                this.f77145b = pegasusViewModel;
            }

            /* JADX WARN: Removed duplicated region for block: B:73:0x031c  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r11, kotlin.coroutines.Continuation r12) {
                /*
                    Method dump skipped, instruction units count: 802
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.recover.ManualRefreshRecoverComponent.AnonymousClass2.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ManualRefreshRecoverComponent manualRefreshRecoverComponent, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = manualRefreshRecoverComponent;
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
                PegasusViewModel pegasusViewModelB = this.this$0.b();
                if (pegasusViewModelB == null) {
                    return Unit.INSTANCE;
                }
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(pegasusViewModelB.f79025r);
                a aVar = new a(this.this$0, pegasusViewModelB);
                this.label = 1;
                if (flowDistinctUntilChanged.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.recover.ManualRefreshRecoverComponent$onViewCreated$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/recover/ManualRefreshRecoverComponent$onViewCreated$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ManualRefreshRecoverComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.recover.ManualRefreshRecoverComponent$onViewCreated$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/recover/ManualRefreshRecoverComponent$onViewCreated$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<i, Continuation<? super Unit>, Object> {
            int label;
            final ManualRefreshRecoverComponent this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ManualRefreshRecoverComponent manualRefreshRecoverComponent, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = manualRefreshRecoverComponent;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            public final Object invoke(i iVar, Continuation<? super Unit> continuation) {
                return create(iVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                n nVar;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ManualRefreshRecoverComponent manualRefreshRecoverComponent = this.this$0;
                PegasusViewModel pegasusViewModelB = manualRefreshRecoverComponent.b();
                if (pegasusViewModelB == null || (nVar = pegasusViewModelB.f79017j) == null) {
                    BLog.w("[Pegasus]ManualRefreshRecover", "expandFoldedCards, manual refresh recover state is null");
                } else {
                    List<PegasusHolderData> list = nVar.f79071b;
                    if (list.isEmpty()) {
                        BLog.w("[Pegasus]ManualRefreshRecover", "expandFoldedCards, foldedCards is empty");
                    } else {
                        BLog.i("[Pegasus]ManualRefreshRecover", "expandFoldedCards, cardsSize=" + list.size());
                        PegasusViewModel pegasusViewModelB2 = manualRefreshRecoverComponent.b();
                        if (pegasusViewModelB2 != null) {
                            pegasusViewModelB2.z(pegasusViewModelB2, new C5771f(nVar.f79070a, list));
                        }
                        PegasusViewModel pegasusViewModelB3 = manualRefreshRecoverComponent.b();
                        if (pegasusViewModelB3 != null) {
                            pegasusViewModelB3.f79017j = null;
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ManualRefreshRecoverComponent manualRefreshRecoverComponent, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = manualRefreshRecoverComponent;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            final StateFlow stateAction;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                IPegasusViewModel viewModel = this.this$0.getViewModel();
                if (viewModel != null && (stateAction = viewModel.getStateAction()) != null) {
                    Flow<Object> flow = new Flow<Object>(stateAction) { // from class: com.bilibili.pegasus.components.recover.ManualRefreshRecoverComponent$onViewCreated$3$invokeSuspend$$inlined$filterIsInstance$1

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final StateFlow f77146a;

                        /* JADX INFO: renamed from: com.bilibili.pegasus.components.recover.ManualRefreshRecoverComponent$onViewCreated$3$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/recover/ManualRefreshRecoverComponent$onViewCreated$3$invokeSuspend$$inlined$filterIsInstance$1$2.class */
                        public static final class AnonymousClass2<T> implements FlowCollector {

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final FlowCollector f77147a;

                            /* JADX INFO: renamed from: com.bilibili.pegasus.components.recover.ManualRefreshRecoverComponent$onViewCreated$3$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/recover/ManualRefreshRecoverComponent$onViewCreated$3$invokeSuspend$$inlined$filterIsInstance$1$2$1.class */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                Object L$1;
                                int label;
                                Object result;
                                final AnonymousClass2 this$0;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass1(AnonymousClass2 anonymousClass2, Continuation continuation) {
                                    super(continuation);
                                    this.this$0 = anonymousClass2;
                                }

                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return this.this$0.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.f77147a = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                            */
                            public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                                /*
                                    r5 = this;
                                    r0 = r7
                                    boolean r0 = r0 instanceof com.bilibili.pegasus.components.recover.ManualRefreshRecoverComponent$onViewCreated$3$invokeSuspend$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1
                                    if (r0 == 0) goto L29
                                    r0 = r7
                                    com.bilibili.pegasus.components.recover.ManualRefreshRecoverComponent$onViewCreated$3$invokeSuspend$$inlined$filterIsInstance$1$2$1 r0 = (com.bilibili.pegasus.components.recover.ManualRefreshRecoverComponent$onViewCreated$3$invokeSuspend$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1) r0
                                    r9 = r0
                                    r0 = r9
                                    int r0 = r0.label
                                    r8 = r0
                                    r0 = r8
                                    r1 = -2147483648(0xffffffff80000000, float:-0.0)
                                    r0 = r0 & r1
                                    if (r0 == 0) goto L29
                                    r0 = r9
                                    r1 = r8
                                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                    int r1 = r1 + r2
                                    r0.label = r1
                                    r0 = r9
                                    r7 = r0
                                    goto L33
                                L29:
                                    com.bilibili.pegasus.components.recover.ManualRefreshRecoverComponent$onViewCreated$3$invokeSuspend$$inlined$filterIsInstance$1$2$1 r0 = new com.bilibili.pegasus.components.recover.ManualRefreshRecoverComponent$onViewCreated$3$invokeSuspend$$inlined$filterIsInstance$1$2$1
                                    r1 = r0
                                    r2 = r5
                                    r3 = r7
                                    r1.<init>(r2, r3)
                                    r7 = r0
                                L33:
                                    r0 = r7
                                    java.lang.Object r0 = r0.result
                                    r10 = r0
                                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                    r9 = r0
                                    r0 = r7
                                    int r0 = r0.label
                                    r8 = r0
                                    r0 = r8
                                    if (r0 == 0) goto L5e
                                    r0 = r8
                                    r1 = 1
                                    if (r0 != r1) goto L54
                                    r0 = r10
                                    kotlin.ResultKt.throwOnFailure(r0)
                                    goto L82
                                L54:
                                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                                    r1 = r0
                                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                                    r1.<init>(r2)
                                    throw r0
                                L5e:
                                    r0 = r10
                                    kotlin.ResultKt.throwOnFailure(r0)
                                    r0 = r6
                                    boolean r0 = r0 instanceof com.bilibili.pegasus.components.recover.i
                                    if (r0 == 0) goto L82
                                    r0 = r7
                                    r1 = 1
                                    r0.label = r1
                                    r0 = r5
                                    kotlinx.coroutines.flow.FlowCollector r0 = r0.f77147a
                                    r1 = r6
                                    r2 = r7
                                    java.lang.Object r0 = r0.emit(r1, r2)
                                    r1 = r9
                                    if (r0 != r1) goto L82
                                    r0 = r9
                                    return r0
                                L82:
                                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                                    return r0
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.recover.ManualRefreshRecoverComponent$onViewCreated$3$invokeSuspend$$inlined$filterIsInstance$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                            }
                        }

                        {
                            this.f77146a = stateAction;
                        }

                        public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                            Object objCollect = this.f77146a.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    };
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flow, anonymousClass1, this) == coroutine_suspended) {
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

    public ManualRefreshRecoverComponent(int i7) {
    }

    public static void c(List list) {
        List<C7488c> listG;
        HolderExtra holderExtra;
        HolderExtra holderExtra2;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PegasusHolderData pegasusHolderData = (PegasusHolderData) it.next();
            pegasusHolderData.getExtra().setRecoverCard(true);
            pegasusHolderData.getExtra().setRecoverExposed(false);
            if (pegasusHolderData instanceof gp0.c) {
                List<gp0.b> listK = ((gp0.c) pegasusHolderData).k();
                if (listK != null) {
                    Iterator<T> it2 = listK.iterator();
                    while (it2.hasNext()) {
                        BasePegasusData basePegasusDataM = ((gp0.b) it2.next()).m();
                        if (basePegasusDataM != null) {
                            basePegasusDataM.getExtra().setRecoverCard(true);
                            basePegasusDataM.getExtra().setRecoverExposed(false);
                        }
                    }
                }
            } else if ((pegasusHolderData instanceof hp0.j) && (listG = ((hp0.j) pegasusHolderData).g()) != null) {
                for (C7488c c7488c : listG) {
                    if (c7488c != null && (holderExtra2 = c7488c.f121099z) != null) {
                        holderExtra2.setRecoverCard(true);
                    }
                    if (c7488c != null && (holderExtra = c7488c.f121099z) != null) {
                        holderExtra.setRecoverExposed(false);
                    }
                }
            }
        }
    }

    public final PegasusViewModel b() {
        IPegasusViewModel viewModel = getViewModel();
        return viewModel instanceof PegasusViewModel ? (PegasusViewModel) viewModel : null;
    }

    public final void d() {
        Object next;
        PegasusViewModel pegasusViewModelB = b();
        if (pegasusViewModelB == null) {
            BLog.i("[Pegasus]ManualRefreshRecover", "removeStaleRecoverStrip, vm is null, skip");
            return;
        }
        Iterator<T> it = ((C8028c) pegasusViewModelB.f79020m.getValue()).f123831a.f123826a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((PegasusHolderData) next) instanceof p) {
                    break;
                }
            }
        }
        PegasusHolderData pegasusHolderData = (PegasusHolderData) next;
        if (pegasusHolderData == null) {
            BLog.i("[Pegasus]ManualRefreshRecover", "removeStaleRecoverStrip, no residual strip");
        } else {
            BLog.i("[Pegasus]ManualRefreshRecover", "removeStaleRecoverStrip, removing residual strip");
            pegasusViewModelB.z(pegasusViewModelB, new D(pegasusHolderData, true));
        }
    }

    @NotNull
    public final String getComponentName() {
        return this.f77139k;
    }

    public final void onViewCreated(@NotNull View view, @NotNull RecyclerView recyclerView, @NotNull PegasusHeaderManager pegasusHeaderManager) {
        LifecycleCoroutineScope lifecycleScope;
        LifecycleCoroutineScope lifecycleScope2;
        LifecycleCoroutineScope lifecycleScope3;
        super.onViewCreated(view, recyclerView, pegasusHeaderManager);
        BLog.i("[Pegasus]ManualRefreshRecover", "onViewCreated");
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        if (viewLifecycleOwner != null && (lifecycleScope3 = LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner)) != null) {
            BuildersKt.launch$default(lifecycleScope3, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        }
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        if (viewLifecycleOwner2 != null && (lifecycleScope2 = LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2)) != null) {
            BuildersKt.launch$default(lifecycleScope2, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        }
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        if (viewLifecycleOwner3 == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner3)) == null) {
            return;
        }
        BuildersKt.launch$default(lifecycleScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
    }
}
