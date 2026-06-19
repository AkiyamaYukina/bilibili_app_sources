package com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ViewDataBinding;
import com.bilibili.app.gemini.ui.DataBindingComponent;
import dv0.A0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/uicomponent/d0.class */
@StabilityInferred(parameters = 0)
public final class d0 extends DataBindingComponent<A0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.restrictionlayer.M f102848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.restrictionlayer.J f102849b;

    public d0(@NotNull com.bilibili.ship.theseus.united.page.restrictionlayer.M m7, @NotNull com.bilibili.ship.theseus.united.page.restrictionlayer.J j7) {
        this.f102848a = m7;
        this.f102849b = j7;
    }

    public final Object b(ViewDataBinding viewDataBinding, Continuation continuation) {
        A0 a02 = (A0) viewDataBinding;
        a02.r(this.f102848a);
        a02.q(this.f102849b);
        a02.f116716x.setContent(ComposableLambdaKt.composableLambdaInstance(2135106114, true, new com.bilibili.app.comment3.ui.holder.handle.s(this, 1)));
        a02.executePendingBindings();
        return Unit.INSTANCE;
    }

    public final ViewDataBinding d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return A0.inflate(layoutInflater, viewGroup, false);
    }
}
