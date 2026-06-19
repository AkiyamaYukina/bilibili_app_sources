package com.bilibili.tgwt.square;

import DD0.Z;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ViewDataBinding;
import com.bilibili.app.gemini.ui.DataBindingComponent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/square/o.class */
@StabilityInferred(parameters = 0)
public final class o extends DataBindingComponent<Z> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final p f112147a;

    public o(@NotNull p pVar) {
        this.f112147a = pVar;
    }

    public final Object b(ViewDataBinding viewDataBinding, Continuation continuation) {
        Z z6 = (Z) viewDataBinding;
        z6.q(this.f112147a);
        z6.executePendingBindings();
        return Unit.INSTANCE;
    }

    public final ViewDataBinding d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return Z.inflate(layoutInflater, viewGroup, false);
    }
}
