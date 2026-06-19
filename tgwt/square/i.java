package com.bilibili.tgwt.square;

import DD0.n0;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ViewDataBinding;
import com.bilibili.app.gemini.ui.DataBindingComponent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/square/i.class */
@StabilityInferred(parameters = 0)
public final class i extends DataBindingComponent<n0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final j f112136a;

    public i(@NotNull j jVar) {
        this.f112136a = jVar;
    }

    public final Object b(ViewDataBinding viewDataBinding, Continuation continuation) {
        n0 n0Var = (n0) viewDataBinding;
        n0Var.q(this.f112136a);
        n0Var.executePendingBindings();
        return Unit.INSTANCE;
    }

    public final ViewDataBinding d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return n0.inflate(layoutInflater, viewGroup, false);
    }
}
