package com.bilibili.pegasus.components.interest.ui.v36.vm;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.pegasus.components.interest.A;
import com.bilibili.pegasus.components.interest.ui.common.j;
import com.bilibili.pegasus.components.interest.ui.reporter.InterestPageType;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import com.bilibili.pegasus.data.interestchoose.InterestChooseItem;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kp0.C7779b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v36/vm/InterestChooseV36PageViewModel.class */
@StabilityInferred(parameters = 0)
public final class InterestChooseV36PageViewModel implements A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<InterestChoose> f76855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final StateFlow<InterestChoose> f76856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f76857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f76858d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Integer> f76859e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final SharedFlow<Integer> f76860f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<j> f76861g;

    @NotNull
    public final SharedFlow<j> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final InterestChooseV36PageViewModel$special$$inlined$map$2 f76862i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final List<Long> f76863j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final InterestChooseV36PageViewModel$special$$inlined$map$3 f76864k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Integer> f76865l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final StateFlow<Integer> f76866m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Flow<Vo0.a> f76867n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final Flow<C7779b> f76868o;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v36/vm/InterestChooseV36PageViewModel$a.class */
    public static final class a<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterestChooseV36PageViewModel f76869a;

        public a(InterestChooseV36PageViewModel interestChooseV36PageViewModel) {
            this.f76869a = interestChooseV36PageViewModel;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t8) {
            return ComparisonsKt.compareValues(Integer.valueOf(((ArrayList) this.f76869a.f76863j).indexOf(Long.valueOf(((InterestChooseItem) t7).getId()))), Integer.valueOf(((ArrayList) this.f76869a.f76863j).indexOf(Long.valueOf(((InterestChooseItem) t8).getId()))));
        }
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [com.bilibili.pegasus.components.interest.ui.v36.vm.InterestChooseV36PageViewModel$special$$inlined$map$2] */
    /* JADX WARN: Type inference failed for: r1v17, types: [com.bilibili.pegasus.components.interest.ui.v36.vm.InterestChooseV36PageViewModel$special$$inlined$map$3] */
    public InterestChooseV36PageViewModel() {
        MutableStateFlow<InterestChoose> MutableStateFlow = StateFlowKt.MutableStateFlow((Object) null);
        this.f76855a = MutableStateFlow;
        this.f76856b = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.f76857c = MutableStateFlow2;
        this.f76858d = FlowKt.asStateFlow(MutableStateFlow2);
        BufferOverflow bufferOverflow = BufferOverflow.DROP_OLDEST;
        MutableSharedFlow<Integer> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, (Object) null);
        this.f76859e = mutableSharedFlowMutableSharedFlow$default;
        this.f76860f = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<j> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, (Object) null);
        this.f76861g = mutableSharedFlowMutableSharedFlow$default2;
        this.h = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        final InterestChooseV36PageViewModel$special$$inlined$map$1 interestChooseV36PageViewModel$special$$inlined$map$1 = new InterestChooseV36PageViewModel$special$$inlined$map$1(MutableStateFlow);
        this.f76862i = new Flow<List<? extends InterestChooseItem>>(interestChooseV36PageViewModel$special$$inlined$map$1) { // from class: com.bilibili.pegasus.components.interest.ui.v36.vm.InterestChooseV36PageViewModel$special$$inlined$map$2

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final InterestChooseV36PageViewModel$special$$inlined$map$1 f76872a;

            /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v36.vm.InterestChooseV36PageViewModel$special$$inlined$map$2$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v36/vm/InterestChooseV36PageViewModel$special$$inlined$map$2$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f76873a;

                /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v36.vm.InterestChooseV36PageViewModel$special$$inlined$map$2$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v36/vm/InterestChooseV36PageViewModel$special$$inlined$map$2$2$1.class */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
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
                    this.f76873a = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:36:0x0121  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                    /*
                        Method dump skipped, instruction units count: 296
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.ui.v36.vm.InterestChooseV36PageViewModel$special$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f76872a = interestChooseV36PageViewModel$special$$inlined$map$1;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f76872a.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
        this.f76863j = new ArrayList();
        this.f76864k = new Flow<List<? extends InterestChooseItem>>(interestChooseV36PageViewModel$special$$inlined$map$1, this) { // from class: com.bilibili.pegasus.components.interest.ui.v36.vm.InterestChooseV36PageViewModel$special$$inlined$map$3

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final InterestChooseV36PageViewModel$special$$inlined$map$1 f76874a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final InterestChooseV36PageViewModel f76875b;

            /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v36.vm.InterestChooseV36PageViewModel$special$$inlined$map$3$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v36/vm/InterestChooseV36PageViewModel$special$$inlined$map$3$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f76876a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final InterestChooseV36PageViewModel f76877b;

                /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v36.vm.InterestChooseV36PageViewModel$special$$inlined$map$3$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v36/vm/InterestChooseV36PageViewModel$special$$inlined$map$3$2$1.class */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
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

                public AnonymousClass2(FlowCollector flowCollector, InterestChooseV36PageViewModel interestChooseV36PageViewModel) {
                    this.f76876a = flowCollector;
                    this.f76877b = interestChooseV36PageViewModel;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                    /*
                        Method dump skipped, instruction units count: 241
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.ui.v36.vm.InterestChooseV36PageViewModel$special$$inlined$map$3.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f76874a = interestChooseV36PageViewModel$special$$inlined$map$1;
                this.f76875b = this;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f76874a.collect(new AnonymousClass2(flowCollector, this.f76875b), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
        MutableStateFlow<Integer> MutableStateFlow3 = StateFlowKt.MutableStateFlow(0);
        this.f76865l = MutableStateFlow3;
        this.f76866m = FlowKt.asStateFlow(MutableStateFlow3);
        Flow<Vo0.a> flowCombine = FlowKt.combine(MutableStateFlow3, interestChooseV36PageViewModel$special$$inlined$map$1, new InterestChooseV36PageViewModel$secondPageItemFlow$1(null));
        this.f76867n = flowCombine;
        this.f76868o = FlowKt.combine(MutableStateFlow, interestChooseV36PageViewModel$special$$inlined$map$1, flowCombine, new InterestChooseV36PageViewModel$interestChooseConfirmButtonState$1(this, null));
    }

    @Override // com.bilibili.pegasus.components.interest.A
    public final void W(@Nullable InterestPageType interestPageType) {
        this.f76861g.tryEmit(new j(interestPageType, 2));
    }

    public final void a(int i7) {
        this.f76865l.setValue(Integer.valueOf(i7));
        if (i7 == 0) {
            ((ArrayList) this.f76863j).clear();
        }
    }
}
