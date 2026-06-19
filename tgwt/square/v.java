package com.bilibili.tgwt.square;

import DD0.t0;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ViewDataBinding;
import com.bilibili.app.gemini.ui.DataBindingComponent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/square/v.class */
@StabilityInferred(parameters = 0)
public final class v extends DataBindingComponent<t0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final w f112187a;

    public v(@NotNull w wVar) {
        this.f112187a = wVar;
    }

    public final Object b(ViewDataBinding viewDataBinding, Continuation continuation) {
        t0 t0Var = (t0) viewDataBinding;
        t0Var.q(this.f112187a);
        t0Var.executePendingBindings();
        return Unit.INSTANCE;
    }

    public final ViewDataBinding d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return t0.inflate(layoutInflater, viewGroup, false);
    }
}
