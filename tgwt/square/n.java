package com.bilibili.tgwt.square;

import DD0.X;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ViewDataBinding;
import com.bilibili.app.gemini.ui.DataBindingComponent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/square/n.class */
@StabilityInferred(parameters = 0)
public final class n extends DataBindingComponent<X> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final q f112146a;

    public n(@NotNull q qVar) {
        this.f112146a = qVar;
    }

    public final Object b(ViewDataBinding viewDataBinding, Continuation continuation) {
        X x6 = (X) viewDataBinding;
        q qVar = this.f112146a;
        x6.q(qVar);
        x6.f2403w.getAdapter().N(qVar.f112163a);
        x6.executePendingBindings();
        return Unit.INSTANCE;
    }

    public final ViewDataBinding d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        X xInflate = X.inflate(layoutInflater, viewGroup, false);
        xInflate.f2403w.setAdapter(new com.bilibili.app.gemini.ui.f(false));
        return xInflate;
    }
}
