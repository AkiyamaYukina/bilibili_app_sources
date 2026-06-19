package com.bilibili.ship.theseus.united.page.toolbar.actionview.projection;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.framework.exposure.core.collecter.ViewExposureLayoutInfoCollectorKt;
import dv0.C0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/actionview/projection/b.class */
@StabilityInferred(parameters = 0)
public final class b extends FrameLayout {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f103374d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0 f103375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Boolean> f103376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final SharedFlow<Boolean> f103377c;

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    public b(@NotNull Context context) {
        super(context);
        MutableSharedFlow<Boolean> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, BufferOverflow.DROP_LATEST, 1, (Object) null);
        this.f103376b = mutableSharedFlowMutableSharedFlow$default;
        this.f103377c = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        setBinding(C0.inflate(LayoutInflater.from(getContext()), this));
        ViewExposureLayoutInfoCollectorKt.setExposureLayoutInfoReceiver(this, new ExposureEntry((Function1) new Object(), new Gi.a(this, 3)));
    }

    @NotNull
    public final C0 getBinding() {
        C0 c02 = this.f103375a;
        if (c02 != null) {
            return c02;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    @NotNull
    public final SharedFlow<Boolean> getVisibilityFlow() {
        return this.f103377c;
    }

    public final void setBinding(@NotNull C0 c02) {
        this.f103375a = c02;
    }
}
