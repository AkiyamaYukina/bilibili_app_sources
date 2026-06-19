package com.bilibili.lib.projection.internal.widget;

import Je0.C2406d;
import Je0.InterfaceC2403a;
import androidx.activity.ComponentActivity;
import com.bilibili.lib.projection.ProjectionClient;
import com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionItem;
import com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem;
import ie0.C7564c;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import le0.InterfaceC7845m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/w.class */
public final class w implements InterfaceC2403a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ComponentActivity f64145a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Job f64147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public C2406d f64148d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public InterfaceC7845m f64149e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f64146b = StateFlowKt.MutableStateFlow(Boolean.FALSE);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final CompositeDisposable f64150f = new CompositeDisposable();

    public w(@NotNull ComponentActivity componentActivity, int i7) {
        this.f64145a = componentActivity;
        this.f64149e = C7564c.f121625a.h(i7);
    }

    @Override // Je0.InterfaceC2403a
    public final void a1(float f7, boolean z6) {
        com.bilibili.lib.projection.internal.reporter.a reporter;
        com.bilibili.lib.projection.internal.device.a aVarS;
        MutableStateFlow<Boolean> mutableStateFlow = this.f64146b;
        StandardProjectionItem standardProjectionItem = null;
        if (z6) {
            InterfaceC7845m interfaceC7845m = this.f64149e;
            if (interfaceC7845m != null) {
                ProjectionClient.setPlaySpeed$default(interfaceC7845m, f7, false, 2, null);
            }
            mutableStateFlow.setValue(Boolean.TRUE);
        } else {
            InterfaceC7845m interfaceC7845m2 = this.f64149e;
            if (interfaceC7845m2 != null) {
                InterfaceC7845m.h(interfaceC7845m2, this.f64145a, false, false, false, 10);
            }
            mutableStateFlow.setValue(Boolean.TRUE);
        }
        InterfaceC7845m interfaceC7845m3 = this.f64149e;
        if (interfaceC7845m3 == null || (reporter = interfaceC7845m3.getReporter()) == null) {
            return;
        }
        InterfaceC7845m interfaceC7845m4 = this.f64149e;
        ProjectionDeviceInternal device = (interfaceC7845m4 == null || (aVarS = interfaceC7845m4.s()) == null) ? null : aVarS.getDevice();
        InterfaceC7845m interfaceC7845m5 = this.f64149e;
        IProjectionItem iProjectionItemN = interfaceC7845m5 != null ? interfaceC7845m5.n(false) : null;
        if (iProjectionItemN instanceof StandardProjectionItem) {
            standardProjectionItem = (StandardProjectionItem) iProjectionItemN;
        }
        reporter.U(Float.valueOf(f7), device, standardProjectionItem);
    }
}
