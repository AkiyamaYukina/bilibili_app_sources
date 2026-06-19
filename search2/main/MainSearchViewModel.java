package com.bilibili.search2.main;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.search2.api.SearchService;
import com.bilibili.search2.result.all.C6059m;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/MainSearchViewModel.class */
@StabilityInferred(parameters = 0)
public final class MainSearchViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final C6059m f86728a = C6059m.f87303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final C6042i f86729b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Boolean f86730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Ws0.a> f86731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final StateFlow<Ws0.a> f86732e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final SearchService f86733f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<com.bilibili.search2.main.data.i> f86734g;

    @NotNull
    public final StateFlow<com.bilibili.search2.main.data.i> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final StateFlow<com.bilibili.search2.discover.h> f86735i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final StateFlow<com.bilibili.search2.discover.l> f86736j;

    /* JADX WARN: Type inference failed for: r1v1, types: [com.bilibili.search2.main.i, java.lang.Object] */
    @Inject
    public MainSearchViewModel() {
        MutableStateFlow<Ws0.a> MutableStateFlow = StateFlowKt.MutableStateFlow(new Ws0.a(0));
        this.f86731d = MutableStateFlow;
        this.f86732e = FlowKt.asStateFlow(MutableStateFlow);
        this.f86733f = (SearchService) ServiceGenerator.createService(SearchService.class);
        MutableStateFlow<com.bilibili.search2.main.data.i> MutableStateFlow2 = StateFlowKt.MutableStateFlow(new com.bilibili.search2.main.data.i(null));
        this.f86734g = MutableStateFlow2;
        final StateFlow<com.bilibili.search2.main.data.i> stateFlowAsStateFlow = FlowKt.asStateFlow(MutableStateFlow2);
        this.h = stateFlowAsStateFlow;
        Flow<com.bilibili.search2.discover.h> flow = new Flow<com.bilibili.search2.discover.h>(stateFlowAsStateFlow) { // from class: com.bilibili.search2.main.MainSearchViewModel$special$$inlined$map$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final StateFlow f86737a;

            /* JADX INFO: renamed from: com.bilibili.search2.main.MainSearchViewModel$special$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/MainSearchViewModel$special$$inlined$map$1$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f86738a;

                /* JADX INFO: renamed from: com.bilibili.search2.main.MainSearchViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/MainSearchViewModel$special$$inlined$map$1$2$1.class */
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
                    this.f86738a = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
                    /*
                        Method dump skipped, instruction units count: 258
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.main.MainSearchViewModel$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f86737a = stateFlowAsStateFlow;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f86737a.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
        CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(this);
        SharingStarted.Companion companion = SharingStarted.Companion;
        this.f86735i = FlowKt.stateIn(flow, viewModelScope, companion.getLazily(), (Object) null);
        this.f86736j = FlowKt.stateIn(new Flow<com.bilibili.search2.discover.l>(stateFlowAsStateFlow) { // from class: com.bilibili.search2.main.MainSearchViewModel$special$$inlined$map$2

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final StateFlow f86739a;

            /* JADX INFO: renamed from: com.bilibili.search2.main.MainSearchViewModel$special$$inlined$map$2$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/MainSearchViewModel$special$$inlined$map$2$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f86740a;

                /* JADX INFO: renamed from: com.bilibili.search2.main.MainSearchViewModel$special$$inlined$map$2$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/MainSearchViewModel$special$$inlined$map$2$2$1.class */
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
                    this.f86740a = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
                    /*
                        Method dump skipped, instruction units count: 258
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.main.MainSearchViewModel$special$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f86739a = stateFlowAsStateFlow;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f86739a.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, ViewModelKt.getViewModelScope(this), companion.getLazily(), (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object I0(com.bilibili.search2.main.MainSearchViewModel r10, java.lang.String r11, int r12, int r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, kotlin.coroutines.jvm.internal.ContinuationImpl r19) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.main.MainSearchViewModel.I0(com.bilibili.search2.main.MainSearchViewModel, java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
