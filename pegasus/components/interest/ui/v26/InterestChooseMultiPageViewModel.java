package com.bilibili.pegasus.components.interest.ui.v26;

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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v26/InterestChooseMultiPageViewModel.class */
@StabilityInferred(parameters = 0)
public final class InterestChooseMultiPageViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<InterestChoose> f76435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final StateFlow<InterestChoose> f76436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Integer> f76437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Flow<kp0.g> f76438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final InterestChooseMultiPageViewModel$special$$inlined$map$2 f76439e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Flow<C7779b> f76440f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f76441g;

    @NotNull
    public final StateFlow<Boolean> h;

    /* JADX WARN: Type inference failed for: r1v7, types: [com.bilibili.pegasus.components.interest.ui.v26.InterestChooseMultiPageViewModel$special$$inlined$map$2] */
    public InterestChooseMultiPageViewModel() {
        MutableStateFlow<InterestChoose> MutableStateFlow = StateFlowKt.MutableStateFlow((Object) null);
        this.f76435a = MutableStateFlow;
        this.f76436b = FlowKt.asStateFlow(MutableStateFlow);
        final InterestChooseMultiPageViewModel$special$$inlined$map$1 interestChooseMultiPageViewModel$special$$inlined$map$1 = new InterestChooseMultiPageViewModel$special$$inlined$map$1(MutableStateFlow);
        MutableStateFlow<Integer> MutableStateFlow2 = StateFlowKt.MutableStateFlow(0);
        this.f76437c = MutableStateFlow2;
        Flow<kp0.g> flowCombine = FlowKt.combine(MutableStateFlow2, interestChooseMultiPageViewModel$special$$inlined$map$1, new InterestChooseMultiPageViewModel$secondPageItemFlow$1(null));
        this.f76438d = flowCombine;
        this.f76439e = new Flow<List<? extends InterestChooseItem>>(interestChooseMultiPageViewModel$special$$inlined$map$1) { // from class: com.bilibili.pegasus.components.interest.ui.v26.InterestChooseMultiPageViewModel$special$$inlined$map$2

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final InterestChooseMultiPageViewModel$special$$inlined$map$1 f76444a;

            /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v26.InterestChooseMultiPageViewModel$special$$inlined$map$2$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v26/InterestChooseMultiPageViewModel$special$$inlined$map$2$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f76445a;

                /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v26.InterestChooseMultiPageViewModel$special$$inlined$map$2$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v26/InterestChooseMultiPageViewModel$special$$inlined$map$2$2$1.class */
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
                    this.f76445a = flowCollector;
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
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.ui.v26.InterestChooseMultiPageViewModel$special$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f76444a = interestChooseMultiPageViewModel$special$$inlined$map$1;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f76444a.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
        this.f76440f = FlowKt.combine(interestChooseMultiPageViewModel$special$$inlined$map$1, flowCombine, new InterestChooseMultiPageViewModel$interestChooseConfirmFlow$1(this, null));
        MutableStateFlow<Boolean> MutableStateFlow3 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.f76441g = MutableStateFlow3;
        this.h = FlowKt.asStateFlow(MutableStateFlow3);
    }
}
