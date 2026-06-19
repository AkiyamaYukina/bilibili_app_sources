package com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ViewDataBinding;
import com.bilibili.app.gemini.ui.DataBindingComponent;
import dv0.w0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/uicomponent/a0.class */
@StabilityInferred(parameters = 0)
public final class a0 extends DataBindingComponent<w0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.restrictionlayer.M f102842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.restrictionlayer.J f102843b;

    public a0(@NotNull com.bilibili.ship.theseus.united.page.restrictionlayer.M m7, @NotNull com.bilibili.ship.theseus.united.page.restrictionlayer.J j7) {
        this.f102842a = m7;
        this.f102843b = j7;
    }

    public final Object b(ViewDataBinding viewDataBinding, Continuation continuation) {
        w0 w0Var = (w0) viewDataBinding;
        w0Var.r(this.f102842a);
        w0Var.q(this.f102843b);
        w0Var.executePendingBindings();
        return Unit.INSTANCE;
    }

    public final ViewDataBinding d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return w0.inflate(layoutInflater, viewGroup, false);
    }
}
