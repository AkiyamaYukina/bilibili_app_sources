package com.bilibili.tgwt.square;

import DD0.Q;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ViewDataBinding;
import com.bilibili.app.gemini.ui.DataBindingComponent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/square/u.class */
@StabilityInferred(parameters = 0)
public final class u extends DataBindingComponent<Q> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final x f112186a;

    public u(@NotNull x xVar) {
        this.f112186a = xVar;
    }

    public final Object b(ViewDataBinding viewDataBinding, Continuation continuation) {
        Q q7 = (Q) viewDataBinding;
        q7.q(this.f112186a);
        q7.executePendingBindings();
        return Unit.INSTANCE;
    }

    public final ViewDataBinding d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return Q.inflate(layoutInflater, viewGroup, false);
    }
}
