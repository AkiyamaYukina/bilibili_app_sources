package com.bilibili.mall.kmm.virtumart;

import F3.C1868y0;
import com.bilibili.mall.kmm.virtumart.vm.MallUIState;
import ih0.C7576c;
import ih0.C7577d;
import ih0.C7578e;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kntr.kotlin.native.ObjCExportAll;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mall/kmm/virtumart/MallCoursePageVM.class */
@ObjCExportAll(kind = ObjCExportAll.Kind.CALLABLE)
public final class MallCoursePageVM {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f65677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f65678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f65679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Lazy f65680d = LazyKt.lazy(new C1868y0(12));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<MallUIState<C7576c>> f65681e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public C7576c f65682f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final SharedFlow f65683g;

    @NotNull
    public final MutableStateFlow<MallUIState<C7577d>> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final SharedFlow f65684i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public Job f65685j;

    public MallCoursePageVM(@NotNull CoroutineScope coroutineScope, @NotNull String str, @NotNull String str2) {
        this.f65677a = coroutineScope;
        this.f65678b = str;
        this.f65679c = str2;
        MutableStateFlow<MallUIState<C7576c>> MutableStateFlow = StateFlowKt.MutableStateFlow(new MallUIState((MallUIState.MallDataUIStatus) null, 3));
        this.f65681e = MutableStateFlow;
        this.f65683g = FlowKt.asSharedFlow(MutableStateFlow);
        MutableStateFlow<MallUIState<C7577d>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(new MallUIState((MallUIState.MallDataUIStatus) null, 3));
        this.h = MutableStateFlow2;
        this.f65684i = FlowKt.asSharedFlow(MutableStateFlow2);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.bilibili.mall.kmm.virtumart.MallCoursePageVM r20, ih0.C7577d r21, ih0.C7577d r22, kotlin.coroutines.jvm.internal.SuspendLambda r23) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.mall.kmm.virtumart.MallCoursePageVM.a(com.bilibili.mall.kmm.virtumart.MallCoursePageVM, ih0.d, ih0.d, kotlin.coroutines.jvm.internal.SuspendLambda):java.lang.Object");
    }

    public static Object f(MallCoursePageVM mallCoursePageVM, MutableStateFlow mutableStateFlow, SuspendLambda suspendLambda) {
        mallCoursePageVM.getClass();
        Object objEmit = mutableStateFlow.emit(new MallUIState(MallUIState.MallDataUIStatus.FAILED_LOAD, (Object) null), suspendLambda);
        if (objEmit != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objEmit = Unit.INSTANCE;
        }
        return objEmit;
    }

    public static Object g(MutableStateFlow mutableStateFlow, Object obj, SuspendLambda suspendLambda) {
        Object objEmit = mutableStateFlow.emit(new MallUIState(MallUIState.MallDataUIStatus.SUCCESS, obj), suspendLambda);
        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
    }

    @Nullable
    public final C7578e b() {
        Long l7;
        C7576c c7576c = this.f65682f;
        C7578e next = null;
        if (c7576c != null) {
            C7578e c7578e = c7576c.f121699g;
            next = null;
            if (c7578e != null) {
                Iterator<C7578e> it = c7576c.f121695c.iterator();
                while (true) {
                    next = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    next = it.next();
                    if (next.f121720c > c7578e.f121720c) {
                        C7577d c7577d = next.f121724g;
                        if (c7577d != null ? Intrinsics.areEqual(c7577d.f121701b, Boolean.TRUE) : false) {
                            if (((c7577d == null || (l7 = c7577d.f121708j) == null) ? 0L : l7.longValue()) > 0) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
        return next;
    }

    public final void c(@NotNull Map<String, ? extends Object> map) {
        MallUIState.MallDataUIStatus mallDataUIStatus = MallUIState.MallDataUIStatus.LOADING;
        this.f65681e.setValue(new MallUIState(mallDataUIStatus, 2));
        this.h.setValue(new MallUIState(mallDataUIStatus, 2));
        BuildersKt.launch$default(this.f65677a, (CoroutineContext) null, (CoroutineStart) null, new MallCoursePageVM$loadData$1(this, map, null), 3, (Object) null);
    }

    public final void d(@NotNull C7577d c7577d) {
        this.h.setValue(new MallUIState(MallUIState.MallDataUIStatus.LOADING, 2));
        C7576c c7576c = this.f65682f;
        if (c7576c != null) {
            c7576c.a(c7577d);
        }
        Job job = this.f65685j;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f65685j = null;
        this.f65685j = BuildersKt.launch$default(this.f65677a, (CoroutineContext) null, (CoroutineStart) null, new MallCoursePageVM$playItemInfo$1(this, c7577d, null), 3, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(long j7, boolean z6) {
        C7577d c7577d = (C7577d) ((MallUIState) this.h.getValue()).f65689b;
        if (c7577d == null) {
            return;
        }
        BuildersKt.launch$default(this.f65677a, (CoroutineContext) null, (CoroutineStart) null, new MallCoursePageVM$reportItemPlayProgress$1(c7577d, z6, j7, this, null), 3, (Object) null);
    }
}
