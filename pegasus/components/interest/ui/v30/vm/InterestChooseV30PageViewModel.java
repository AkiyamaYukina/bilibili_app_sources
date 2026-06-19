package com.bilibili.pegasus.components.interest.ui.v30.vm;

import Ko0.a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import com.bilibili.pegasus.data.interestchoose.InterestChooseItem;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kp0.C7779b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v30/vm/InterestChooseV30PageViewModel.class */
@StabilityInferred(parameters = 0)
public final class InterestChooseV30PageViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<InterestChoose> f76580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final StateFlow<InterestChoose> f76581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f76582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f76583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final InterestChooseV30PageViewModel$special$$inlined$map$2 f76584e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final InterestChooseV30PageViewModel$special$$inlined$map$3 f76585f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Integer> f76586g;

    @NotNull
    public final StateFlow<Integer> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Flow<a> f76587i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Flow<C7779b> f76588j;

    /* JADX WARN: Type inference failed for: r1v7, types: [com.bilibili.pegasus.components.interest.ui.v30.vm.InterestChooseV30PageViewModel$special$$inlined$map$2] */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.bilibili.pegasus.components.interest.ui.v30.vm.InterestChooseV30PageViewModel$special$$inlined$map$3] */
    public InterestChooseV30PageViewModel() {
        final MutableStateFlow<InterestChoose> MutableStateFlow = StateFlowKt.MutableStateFlow((Object) null);
        this.f76580a = MutableStateFlow;
        this.f76581b = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.f76582c = MutableStateFlow2;
        this.f76583d = FlowKt.asStateFlow(MutableStateFlow2);
        final InterestChooseV30PageViewModel$special$$inlined$map$1 interestChooseV30PageViewModel$special$$inlined$map$1 = new InterestChooseV30PageViewModel$special$$inlined$map$1(MutableStateFlow);
        this.f76584e = new Flow<List<? extends Object>>(MutableStateFlow) { // from class: com.bilibili.pegasus.components.interest.ui.v30.vm.InterestChooseV30PageViewModel$special$$inlined$map$2

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MutableStateFlow f76591a;

            /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v30.vm.InterestChooseV30PageViewModel$special$$inlined$map$2$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v30/vm/InterestChooseV30PageViewModel$special$$inlined$map$2$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f76592a;

                /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v30.vm.InterestChooseV30PageViewModel$special$$inlined$map$2$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v30/vm/InterestChooseV30PageViewModel$special$$inlined$map$2$2$1.class */
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
                    this.f76592a = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                    /*
                        Method dump skipped, instruction units count: 345
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.ui.v30.vm.InterestChooseV30PageViewModel$special$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f76591a = MutableStateFlow;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f76591a.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
        this.f76585f = new Flow<List<? extends InterestChooseItem>>(interestChooseV30PageViewModel$special$$inlined$map$1) { // from class: com.bilibili.pegasus.components.interest.ui.v30.vm.InterestChooseV30PageViewModel$special$$inlined$map$3

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final InterestChooseV30PageViewModel$special$$inlined$map$1 f76593a;

            /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v30.vm.InterestChooseV30PageViewModel$special$$inlined$map$3$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v30/vm/InterestChooseV30PageViewModel$special$$inlined$map$3$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f76594a;

                /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v30.vm.InterestChooseV30PageViewModel$special$$inlined$map$3$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v30/vm/InterestChooseV30PageViewModel$special$$inlined$map$3$2$1.class */
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
                    this.f76594a = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                    /*
                        Method dump skipped, instruction units count: 227
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.ui.v30.vm.InterestChooseV30PageViewModel$special$$inlined$map$3.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f76593a = interestChooseV30PageViewModel$special$$inlined$map$1;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f76593a.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
        MutableStateFlow<Integer> MutableStateFlow3 = StateFlowKt.MutableStateFlow(0);
        this.f76586g = MutableStateFlow3;
        this.h = FlowKt.asStateFlow(MutableStateFlow3);
        Flow<a> flowCombine = FlowKt.combine(MutableStateFlow3, interestChooseV30PageViewModel$special$$inlined$map$1, new InterestChooseV30PageViewModel$secondPageItemFlow$1(null));
        this.f76587i = flowCombine;
        this.f76588j = FlowKt.combine(interestChooseV30PageViewModel$special$$inlined$map$1, flowCombine, new InterestChooseV30PageViewModel$interestChooseConfirmButtonState$1(this, null));
    }
}
