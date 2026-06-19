package com.bilibili.tgwt.square;

import DD0.r0;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ViewDataBinding;
import com.bilibili.app.gemini.ui.DataBindingComponent;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.framework.exposure.core.collecter.ViewExposureLayoutInfoCollectorKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/square/r.class */
@StabilityInferred(parameters = 0)
public final class r extends DataBindingComponent<r0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f112168c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final t f112169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ExposureEntry f112170b;

    public r(@NotNull t tVar, @NotNull ExposureEntry exposureEntry) {
        this.f112169a = tVar;
        this.f112170b = exposureEntry;
    }

    public final Object b(ViewDataBinding viewDataBinding, Continuation continuation) {
        r0 r0Var = (r0) viewDataBinding;
        r0Var.q(this.f112169a);
        ViewExposureLayoutInfoCollectorKt.setExposureLayoutInfoReceiver(r0Var.getRoot(), this.f112170b);
        r0Var.executePendingBindings();
        return Unit.INSTANCE;
    }

    public final ViewDataBinding d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return r0.inflate(layoutInflater, viewGroup, false);
    }
}
