package com.bilibili.search2.result.base;

import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bilibili.search2.api.FilterValue;
import com.bilibili.search2.api.VerticalSearchResult;
import com.bilibili.search2.result.base.BaseSearchResultViewModel$filterVersion$$inlined$transform$1;
import com.bilibili.search2.result.base.BaseSearchResultViewModel$filterVersionAfterEffect$$inlined$transform$1;
import com.bilibili.search2.result.base.q;
import com.bilibili.search2.result.base.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q4.D;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/BaseSearchResultViewModel.class */
@StabilityInferred(parameters = 0)
public abstract class BaseSearchResultViewModel extends AndroidViewModel {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f87495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<u> f87496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<q.a> f87497d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final AtomicInteger f87498e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final StateFlow<SearchState> f87499f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f87500g;

    @NotNull
    public List<j> h;

    public BaseSearchResultViewModel(@NotNull Application application) {
        super(application);
        this.f87495b = "BaseSearchResultViewModel";
        MutableSharedFlow<u> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, (BufferOverflow) null, 6, (Object) null);
        this.f87496c = mutableSharedFlowMutableSharedFlow$default;
        this.f87497d = SharedFlowKt.MutableSharedFlow$default(1, 0, (BufferOverflow) null, 6, (Object) null);
        this.f87498e = new AtomicInteger(0);
        final Flow flowS0 = S0(mutableSharedFlowMutableSharedFlow$default, "1");
        final Flow flow = FlowKt.flow(new BaseSearchResultViewModel$filterVersion$$inlined$transform$1(new Flow<u>(flowS0, this) { // from class: com.bilibili.search2.result.base.BaseSearchResultViewModel$filterNetwork$$inlined$map$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Flow f87501a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final BaseSearchResultViewModel f87502b;

            /* JADX INFO: renamed from: com.bilibili.search2.result.base.BaseSearchResultViewModel$filterNetwork$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/BaseSearchResultViewModel$filterNetwork$$inlined$map$1$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f87503a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final BaseSearchResultViewModel f87504b;

                /* JADX INFO: renamed from: com.bilibili.search2.result.base.BaseSearchResultViewModel$filterNetwork$$inlined$map$1$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/BaseSearchResultViewModel$filterNetwork$$inlined$map$1$2$1.class */
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

                public AnonymousClass2(FlowCollector flowCollector, BaseSearchResultViewModel baseSearchResultViewModel) {
                    this.f87503a = flowCollector;
                    this.f87504b = baseSearchResultViewModel;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                /* JADX WARN: Type inference failed for: r2v3, types: [com.bilibili.search2.result.base.i, com.bilibili.search2.result.base.i$b] */
                /* JADX WARN: Type inference failed for: r2v4, types: [com.bilibili.search2.result.base.i, com.bilibili.search2.result.base.i$b] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                    /*
                        Method dump skipped, instruction units count: 216
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.base.BaseSearchResultViewModel$filterNetwork$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f87501a = flowS0;
                this.f87502b = this;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f87501a.collect(new AnonymousClass2(flowCollector, this.f87502b), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, null, this));
        Flow flow2 = FlowKt.flow(new BaseSearchResultViewModel$filterVersionAfterEffect$$inlined$transform$1(S0(FlowKt.merge(new Flow[]{FlowKt.flatMapConcat(new Flow<Object>(flow) { // from class: com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Flow f87509a;

            /* JADX INFO: renamed from: com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$1$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$1$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f87510a;

                /* JADX INFO: renamed from: com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$1$2$1.class */
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
                    this.f87510a = flowCollector;
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
                        boolean r0 = r0 instanceof com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L29
                        r0 = r7
                        com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$1$2$1 r0 = (com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1) r0
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
                        com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$1$2$1 r0 = new com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$1$2$1
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
                        boolean r0 = r0 instanceof com.bilibili.search2.result.base.u.c
                        if (r0 == 0) goto L82
                        r0 = r7
                        r1 = 1
                        r0.label = r1
                        r0 = r5
                        kotlinx.coroutines.flow.FlowCollector r0 = r0.f87510a
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
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f87509a = flow;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f87509a.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, new BaseSearchResultViewModel$toEffectFlow$1(this, null)), FlowKt.flatMapConcat(new Flow<Object>(flow) { // from class: com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$2

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Flow f87515a;

            /* JADX INFO: renamed from: com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$2$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$2$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f87516a;

                /* JADX INFO: renamed from: com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$2$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$2$2$1.class */
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
                    this.f87516a = flowCollector;
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
                        boolean r0 = r0 instanceof com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L29
                        r0 = r7
                        com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$2$2$1 r0 = (com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$2.AnonymousClass2.AnonymousClass1) r0
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
                        com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$2$2$1 r0 = new com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$2$2$1
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
                        boolean r0 = r0 instanceof com.bilibili.search2.result.base.u.e
                        if (r0 == 0) goto L82
                        r0 = r7
                        r1 = 1
                        r0.label = r1
                        r0 = r5
                        kotlinx.coroutines.flow.FlowCollector r0 = r0.f87516a
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
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$2.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f87515a = flow;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f87515a.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, new BaseSearchResultViewModel$toEffectFlow$2(this, null)), FlowKt.flatMapConcat(new Flow<Object>(flow) { // from class: com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$3

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Flow f87517a;

            /* JADX INFO: renamed from: com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$3$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$3$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f87518a;

                /* JADX INFO: renamed from: com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$3$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$3$2$1.class */
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
                    this.f87518a = flowCollector;
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
                        boolean r0 = r0 instanceof com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$3.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L29
                        r0 = r7
                        com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$3$2$1 r0 = (com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$3.AnonymousClass2.AnonymousClass1) r0
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
                        com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$3$2$1 r0 = new com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$3$2$1
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
                        boolean r0 = r0 instanceof com.bilibili.search2.result.base.u.k
                        if (r0 == 0) goto L82
                        r0 = r7
                        r1 = 1
                        r0.label = r1
                        r0 = r5
                        kotlinx.coroutines.flow.FlowCollector r0 = r0.f87518a
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
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$3.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f87517a = flow;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f87517a.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, new BaseSearchResultViewModel$toEffectFlow$3(this, null)), FlowKt.flatMapConcat(new Flow<Object>(flow) { // from class: com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$4

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Flow f87519a;

            /* JADX INFO: renamed from: com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$4$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$4$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f87520a;

                /* JADX INFO: renamed from: com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$4$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$4$2$1.class */
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
                    this.f87520a = flowCollector;
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
                        boolean r0 = r0 instanceof com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$4.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L29
                        r0 = r7
                        com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$4$2$1 r0 = (com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$4.AnonymousClass2.AnonymousClass1) r0
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
                        com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$4$2$1 r0 = new com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$4$2$1
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
                        boolean r0 = r0 instanceof com.bilibili.search2.result.base.u.g
                        if (r0 == 0) goto L82
                        r0 = r7
                        r1 = 1
                        r0.label = r1
                        r0 = r5
                        kotlinx.coroutines.flow.FlowCollector r0 = r0.f87520a
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
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$4.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f87519a = flow;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f87519a.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, new BaseSearchResultViewModel$toEffectFlow$4(this, null)), FlowKt.flatMapConcat(new g(flow, 0), new BaseSearchResultViewModel$toEffectFlow$5(this, null)), FlowKt.flatMapConcat(new Flow<Object>(flow) { // from class: com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$6

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Flow f87522a;

            /* JADX INFO: renamed from: com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$6$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$6$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f87523a;

                /* JADX INFO: renamed from: com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$6$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$6$2$1.class */
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
                    this.f87523a = flowCollector;
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
                        boolean r0 = r0 instanceof com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$6.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L29
                        r0 = r7
                        com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$6$2$1 r0 = (com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$6.AnonymousClass2.AnonymousClass1) r0
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
                        com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$6$2$1 r0 = new com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$6$2$1
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
                        boolean r0 = r0 instanceof com.bilibili.search2.result.base.u.h
                        if (r0 == 0) goto L82
                        r0 = r7
                        r1 = 1
                        r0.label = r1
                        r0 = r5
                        kotlinx.coroutines.flow.FlowCollector r0 = r0.f87523a
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
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$6.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f87522a = flow;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f87522a.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, new BaseSearchResultViewModel$toEffectFlow$6(this, null)), FlowKt.flatMapConcat(new Flow<Object>(flow) { // from class: com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$7

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Flow f87524a;

            /* JADX INFO: renamed from: com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$7$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$7$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f87525a;

                /* JADX INFO: renamed from: com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$7$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$7$2$1.class */
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
                    this.f87525a = flowCollector;
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
                        boolean r0 = r0 instanceof com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$7.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L29
                        r0 = r7
                        com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$7$2$1 r0 = (com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$7.AnonymousClass2.AnonymousClass1) r0
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
                        com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$7$2$1 r0 = new com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$7$2$1
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
                        boolean r0 = r0 instanceof com.bilibili.search2.result.base.u.d
                        if (r0 == 0) goto L82
                        r0 = r7
                        r1 = 1
                        r0.label = r1
                        r0 = r5
                        kotlinx.coroutines.flow.FlowCollector r0 = r0.f87525a
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
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$7.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f87524a = flow;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f87524a.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, new BaseSearchResultViewModel$toEffectFlow$7(this, null)), FlowKt.flatMapConcat(new Flow<Object>(flow) { // from class: com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$8

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Flow f87526a;

            /* JADX INFO: renamed from: com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$8$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$8$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f87527a;

                /* JADX INFO: renamed from: com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$8$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$8$2$1.class */
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
                    this.f87527a = flowCollector;
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
                        boolean r0 = r0 instanceof com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$8.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L29
                        r0 = r7
                        com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$8$2$1 r0 = (com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$8.AnonymousClass2.AnonymousClass1) r0
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
                        com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$8$2$1 r0 = new com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$8$2$1
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
                        boolean r0 = r0 instanceof com.bilibili.search2.result.base.u.a
                        if (r0 == 0) goto L82
                        r0 = r7
                        r1 = 1
                        r0.label = r1
                        r0 = r5
                        kotlinx.coroutines.flow.FlowCollector r0 = r0.f87527a
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
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$8.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f87526a = flow;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f87526a.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, new BaseSearchResultViewModel$toEffectFlow$8(this, null)), FlowKt.flatMapConcat(new Flow<Object>(flow) { // from class: com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$9

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Flow f87528a;

            /* JADX INFO: renamed from: com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$9$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$9$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f87529a;

                /* JADX INFO: renamed from: com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$9$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$9$2$1.class */
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
                    this.f87529a = flowCollector;
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
                        boolean r0 = r0 instanceof com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$9.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L29
                        r0 = r7
                        com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$9$2$1 r0 = (com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$9.AnonymousClass2.AnonymousClass1) r0
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
                        com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$9$2$1 r0 = new com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$9$2$1
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
                        boolean r0 = r0 instanceof com.bilibili.search2.result.base.u.b
                        if (r0 == 0) goto L82
                        r0 = r7
                        r1 = 1
                        r0.label = r1
                        r0 = r5
                        kotlinx.coroutines.flow.FlowCollector r0 = r0.f87529a
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
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$9.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f87528a = flow;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f87528a.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, new BaseSearchResultViewModel$toEffectFlow$9(this, null)), FlowKt.flatMapConcat(new Flow<Object>(flow) { // from class: com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$10

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Flow f87511a;

            /* JADX INFO: renamed from: com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$10$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$10$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f87512a;

                /* JADX INFO: renamed from: com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$10$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$10$2$1.class */
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
                    this.f87512a = flowCollector;
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
                        boolean r0 = r0 instanceof com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$10.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L29
                        r0 = r7
                        com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$10$2$1 r0 = (com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$10.AnonymousClass2.AnonymousClass1) r0
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
                        com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$10$2$1 r0 = new com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$10$2$1
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
                        boolean r0 = r0 instanceof com.bilibili.search2.result.base.u.i
                        if (r0 == 0) goto L82
                        r0 = r7
                        r1 = 1
                        r0.label = r1
                        r0 = r5
                        kotlinx.coroutines.flow.FlowCollector r0 = r0.f87512a
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
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$10.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f87511a = flow;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f87511a.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, new BaseSearchResultViewModel$toEffectFlow$10(null)), FlowKt.flatMapConcat(new Flow<Object>(flow) { // from class: com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$11

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Flow f87513a;

            /* JADX INFO: renamed from: com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$11$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$11$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f87514a;

                /* JADX INFO: renamed from: com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$11$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$11$2$1.class */
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
                    this.f87514a = flowCollector;
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
                        boolean r0 = r0 instanceof com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$11.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L29
                        r0 = r7
                        com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$11$2$1 r0 = (com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$11.AnonymousClass2.AnonymousClass1) r0
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
                        com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$11$2$1 r0 = new com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$11$2$1
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
                        boolean r0 = r0 instanceof com.bilibili.search2.result.base.u.j
                        if (r0 == 0) goto L82
                        r0 = r7
                        r1 = 1
                        r0.label = r1
                        r0 = r5
                        kotlinx.coroutines.flow.FlowCollector r0 = r0.f87514a
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
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$$inlined$filterIsInstance$11.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f87513a = flow;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f87513a.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, new BaseSearchResultViewModel$toEffectFlow$11(null))}), "2"), null, this));
        Flow flowOnEach = FlowKt.onEach(flow2, new BaseSearchResultViewModel$sendEvent$1(this, flow2, null));
        SearchState.Companion.getClass();
        this.f87499f = FlowKt.stateIn(FlowKt.flowOn(FlowKt.runningFold(flowOnEach, SearchState.initial, new BaseSearchResultViewModel$searchState$1(this, null)), Dispatchers.getIO()), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.getEagerly(), SearchState.initial);
        this.h = new ArrayList();
    }

    public static final Object I0(BaseSearchResultViewModel baseSearchResultViewModel, FlowCollector flowCollector, q qVar, int i7, BaseSearchResultViewModel$filterVersionAfterEffect$$inlined$transform$1.AnonymousClass1.C05901 c05901) {
        Object objEmit;
        int i8 = baseSearchResultViewModel.f87498e.get();
        String str = baseSearchResultViewModel.f87495b;
        if (i7 < i8) {
            D.a(i7, baseSearchResultViewModel.f87498e.get(), "after net abort ", " < ", str);
            objEmit = Unit.INSTANCE;
        } else {
            defpackage.a.a(i7, "after net emit ", str);
            objEmit = flowCollector.emit(qVar, c05901);
            if (objEmit != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objEmit = Unit.INSTANCE;
            }
        }
        return objEmit;
    }

    public static final Object J0(BaseSearchResultViewModel baseSearchResultViewModel, FlowCollector flowCollector, u uVar, int i7, BaseSearchResultViewModel$filterVersion$$inlined$transform$1.AnonymousClass1.C05891 c05891) {
        Object objEmit;
        int i8 = baseSearchResultViewModel.f87498e.get();
        String str = baseSearchResultViewModel.f87495b;
        if (i7 < i8) {
            D.a(i7, baseSearchResultViewModel.f87498e.get(), "before net abort ", " < ", str);
            objEmit = Unit.INSTANCE;
        } else {
            BLog.d(str, "before net emit " + i7 + " " + uVar);
            objEmit = flowCollector.emit(uVar, c05891);
            if (objEmit != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objEmit = Unit.INSTANCE;
            }
        }
        return objEmit;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object U0(com.bilibili.search2.result.base.BaseSearchResultViewModel r6, kotlinx.coroutines.flow.FlowCollector r7, com.bilibili.search2.api.VerticalSearchResult r8, com.bilibili.search2.result.base.x r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            Method dump skipped, instruction units count: 705
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.base.BaseSearchResultViewModel.U0(com.bilibili.search2.result.base.BaseSearchResultViewModel, kotlinx.coroutines.flow.FlowCollector, com.bilibili.search2.api.VerticalSearchResult, com.bilibili.search2.result.base.x, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public void K0(@NotNull VerticalSearchResult verticalSearchResult) {
    }

    @Nullable
    public final Map<String, String> L0() {
        Pair pair;
        Map<String, String> map = null;
        if (Xs0.b.f28321a) {
            List<j> list = this.h;
            if (list == null || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (true) {
                    map = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    if (!((j) it.next()).f87553b.isEmpty()) {
                        List<j> list2 = this.h;
                        ArrayList arrayList = new ArrayList();
                        for (j jVar : list2) {
                            String str = jVar.f87552a.f19204d;
                            if (jVar.f87553b.isEmpty() || str == null || !(!StringsKt.isBlank(str))) {
                                pair = null;
                            } else {
                                List<Integer> list3 = jVar.f87553b;
                                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                                Iterator<T> it2 = list3.iterator();
                                while (it2.hasNext()) {
                                    FilterValue filterValue = (FilterValue) CollectionsKt.getOrNull(jVar.f87552a.f19202b, ((Number) it2.next()).intValue());
                                    arrayList2.add(filterValue != null ? filterValue.getParam() : null);
                                }
                                pair = TuplesKt.to(str, CollectionsKt.p(arrayList2, ",", (CharSequence) null, (CharSequence) null, (Function1) null, 62));
                            }
                            if (pair != null) {
                                arrayList.add(pair);
                            }
                        }
                        map = MapsKt.toMap(arrayList);
                    }
                }
            } else {
                map = null;
            }
        }
        return map;
    }

    @Nullable
    public final Boolean M0() {
        return ((SearchState) this.f87499f.getValue()).getHasNoResultCard();
    }

    public final int N0() {
        return ((SearchState) this.f87499f.getValue()).getPage();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0021  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String O0() {
        /*
            r2 = this;
            r0 = r2
            kotlinx.coroutines.flow.StateFlow<com.bilibili.search2.result.base.SearchState> r0 = r0.f87499f
            r5 = r0
            r0 = r5
            java.lang.Object r0 = r0.getValue()
            com.bilibili.search2.result.base.SearchState r0 = (com.bilibili.search2.result.base.SearchState) r0
            com.bilibili.search2.api.SearchResultAll r0 = r0.getData()
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L21
            r0 = r3
            java.lang.String r0 = r0.query
            r4 = r0
            r0 = r4
            r3 = r0
            r0 = r4
            if (r0 != 0) goto L3c
        L21:
            r0 = r5
            java.lang.Object r0 = r0.getValue()
            com.bilibili.search2.result.base.SearchState r0 = (com.bilibili.search2.result.base.SearchState) r0
            com.bilibili.search2.api.VerticalSearchResult r0 = r0.getVerticalSearchResult()
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L3a
            r0 = r3
            java.lang.String r0 = r0.getQuery()
            r3 = r0
            goto L3c
        L3a:
            r0 = 0
            r3 = r0
        L3c:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.base.BaseSearchResultViewModel.O0():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0021  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String P0() {
        /*
            r2 = this;
            r0 = r2
            kotlinx.coroutines.flow.StateFlow<com.bilibili.search2.result.base.SearchState> r0 = r0.f87499f
            r5 = r0
            r0 = r5
            java.lang.Object r0 = r0.getValue()
            com.bilibili.search2.result.base.SearchState r0 = (com.bilibili.search2.result.base.SearchState) r0
            com.bilibili.search2.api.SearchResultAll r0 = r0.getData()
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L21
            r0 = r3
            java.lang.String r0 = r0.qvId
            r4 = r0
            r0 = r4
            r3 = r0
            r0 = r4
            if (r0 != 0) goto L3c
        L21:
            r0 = r5
            java.lang.Object r0 = r0.getValue()
            com.bilibili.search2.result.base.SearchState r0 = (com.bilibili.search2.result.base.SearchState) r0
            com.bilibili.search2.api.VerticalSearchResult r0 = r0.getVerticalSearchResult()
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L3a
            r0 = r3
            java.lang.String r0 = r0.getQvId()
            r3 = r0
            goto L3c
        L3a:
            r0 = 0
            r3 = r0
        L3c:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.base.BaseSearchResultViewModel.P0():java.lang.String");
    }

    public final boolean Q0() {
        return ((SearchState) this.f87499f.getValue()).isEnd();
    }

    @Nullable
    public final Boolean R0() {
        return ((SearchState) this.f87499f.getValue()).isLoading();
    }

    @NotNull
    public final <T> Flow<T> S0(@NotNull Flow<? extends T> flow, @NotNull String str) {
        return FlowKt.onEach(flow, new BaseSearchResultViewModel$log$1(this, str, flow, null));
    }

    public final void T0(@NotNull String str, @NotNull String str2) {
        StringBuilder sbA = G0.b.a("[", Thread.currentThread().getName(), "]  ", str2, "  ---");
        sbA.append(this);
        BLog.v(str, sbA.toString());
    }

    public final void V0(@NotNull u uVar) {
        T0(this.f87495b, "send " + uVar);
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new BaseSearchResultViewModel$send$1(this, uVar, null), 3, (Object) null);
    }

    @Nullable
    public Object X0(@NotNull u.f fVar, @NotNull Continuation<? super Flow<? extends q>> continuation) {
        return FlowKt.flow(new BaseSearchResultViewModel$toEffectFlow$21(null));
    }

    @Nullable
    public Object Y0(@NotNull u.g gVar, @NotNull Continuation<? super Flow<? extends q>> continuation) {
        return FlowKt.flow(new BaseSearchResultViewModel$toEffectFlow$19(null));
    }

    @Nullable
    public Flow Z0() {
        return FlowKt.flow(new BaseSearchResultViewModel$toEffectFlow$29(null));
    }

    @Nullable
    public Flow a1(@NotNull u.a aVar) {
        return FlowKt.flow(new BaseSearchResultViewModel$toEffectFlow$27(null));
    }

    @Nullable
    public Flow b1(@NotNull u.c cVar) {
        return FlowKt.flow(new BaseSearchResultViewModel$toEffectFlow$13(null));
    }

    @Nullable
    public Flow c1(@NotNull u.d dVar) {
        return FlowKt.flow(new BaseSearchResultViewModel$toEffectFlow$25(null));
    }

    @Nullable
    public Flow d1(@NotNull u.e eVar) {
        return FlowKt.flow(new BaseSearchResultViewModel$toEffectFlow$15(null));
    }

    @Nullable
    public Flow e1(@NotNull u.h hVar) {
        return FlowKt.flow(new BaseSearchResultViewModel$toEffectFlow$23(null));
    }

    @Nullable
    public Flow f1(@NotNull u.k kVar) {
        return FlowKt.flow(new BaseSearchResultViewModel$toEffectFlow$17(null));
    }

    @Nullable
    public final String getTrackId() {
        return ((SearchState) this.f87499f.getValue()).getTrackId();
    }
}
