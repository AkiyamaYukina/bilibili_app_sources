package com.bilibili.pegasus.components.interest.ui.v29.vm;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.pegasus.components.interest.A;
import com.bilibili.pegasus.components.interest.ui.reporter.InterestPageType;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import java.util.List;
import kotlin.Unit;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v29/vm/InterestChooseV29PageViewModel.class */
@StabilityInferred(parameters = 0)
public final class InterestChooseV29PageViewModel implements A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<InterestChoose> f76548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final StateFlow<InterestChoose> f76549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f76550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f76551d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Unit> f76552e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final SharedFlow<Unit> f76553f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final InterestChooseV29PageViewModel$special$$inlined$map$1 f76554g;

    @NotNull
    public final InterestChooseV29PageViewModel$special$$inlined$map$2 h;

    /* JADX WARN: Type inference failed for: r1v10, types: [com.bilibili.pegasus.components.interest.ui.v29.vm.InterestChooseV29PageViewModel$special$$inlined$map$1] */
    /* JADX WARN: Type inference failed for: r1v11, types: [com.bilibili.pegasus.components.interest.ui.v29.vm.InterestChooseV29PageViewModel$special$$inlined$map$2] */
    public InterestChooseV29PageViewModel() {
        final MutableStateFlow<InterestChoose> MutableStateFlow = StateFlowKt.MutableStateFlow((Object) null);
        this.f76548a = MutableStateFlow;
        this.f76549b = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.f76550c = MutableStateFlow2;
        this.f76551d = FlowKt.asStateFlow(MutableStateFlow2);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, BufferOverflow.DROP_OLDEST, 1, (Object) null);
        this.f76552e = mutableSharedFlowMutableSharedFlow$default;
        this.f76553f = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        this.f76554g = new Flow<List<? extends Object>>(MutableStateFlow) { // from class: com.bilibili.pegasus.components.interest.ui.v29.vm.InterestChooseV29PageViewModel$special$$inlined$map$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MutableStateFlow f76555a;

            /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v29.vm.InterestChooseV29PageViewModel$special$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v29/vm/InterestChooseV29PageViewModel$special$$inlined$map$1$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f76556a;

                /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v29.vm.InterestChooseV29PageViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v29/vm/InterestChooseV29PageViewModel$special$$inlined$map$1$2$1.class */
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
                    this.f76556a = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                    /*
                        Method dump skipped, instruction units count: 255
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.ui.v29.vm.InterestChooseV29PageViewModel$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f76555a = MutableStateFlow;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f76555a.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
        this.h = new Flow<C7779b>(MutableStateFlow) { // from class: com.bilibili.pegasus.components.interest.ui.v29.vm.InterestChooseV29PageViewModel$special$$inlined$map$2

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MutableStateFlow f76557a;

            /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v29.vm.InterestChooseV29PageViewModel$special$$inlined$map$2$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v29/vm/InterestChooseV29PageViewModel$special$$inlined$map$2$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f76558a;

                /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v29.vm.InterestChooseV29PageViewModel$special$$inlined$map$2$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v29/vm/InterestChooseV29PageViewModel$special$$inlined$map$2$2$1.class */
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
                    this.f76558a = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:19:0x007d  */
                /* JADX WARN: Removed duplicated region for block: B:37:0x00da  */
                /* JADX WARN: Removed duplicated region for block: B:39:0x00e9  */
                /* JADX WARN: Removed duplicated region for block: B:54:0x0140  */
                /* JADX WARN: Removed duplicated region for block: B:57:0x0148  */
                /* JADX WARN: Removed duplicated region for block: B:61:0x015c  */
                /* JADX WARN: Removed duplicated region for block: B:62:0x0162  */
                /* JADX WARN: Removed duplicated region for block: B:66:0x0176  */
                /* JADX WARN: Removed duplicated region for block: B:69:0x019c  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
                    /*
                        Method dump skipped, instruction units count: 419
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.ui.v29.vm.InterestChooseV29PageViewModel$special$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f76557a = MutableStateFlow;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f76557a.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    @Override // com.bilibili.pegasus.components.interest.A
    public final void W(@Nullable InterestPageType interestPageType) {
        this.f76552e.tryEmit(Unit.INSTANCE);
    }
}
