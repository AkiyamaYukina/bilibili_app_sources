package com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ViewDataBinding;
import com.bilibili.app.gemini.ui.DataBindingComponent;
import dv0.u0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/uicomponent/V.class */
@StabilityInferred(parameters = 0)
public final class V extends DataBindingComponent<u0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.restrictionlayer.M f102825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.restrictionlayer.J f102826b;

    public V(@NotNull com.bilibili.ship.theseus.united.page.restrictionlayer.M m7, @NotNull com.bilibili.ship.theseus.united.page.restrictionlayer.J j7) {
        this.f102825a = m7;
        this.f102826b = j7;
    }

    public final Object b(ViewDataBinding viewDataBinding, Continuation continuation) {
        u0 u0Var = (u0) viewDataBinding;
        u0Var.r(this.f102825a);
        u0Var.q(this.f102826b);
        u0Var.executePendingBindings();
        return Unit.INSTANCE;
    }

    public final ViewDataBinding d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return u0.inflate(layoutInflater, viewGroup, false);
    }
}
