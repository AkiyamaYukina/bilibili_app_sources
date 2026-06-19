package com.bilibili.ship.theseus.ogv.intro.activityentrance;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ViewDataBinding;
import com.bilibili.app.gemini.ui.DataBindingComponent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import zu0.AbstractC9221c;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/activityentrance/c.class */
@StabilityInferred(parameters = 0)
public final class c extends DataBindingComponent<AbstractC9221c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final b f92314a;

    public c(@NotNull b bVar) {
        this.f92314a = bVar;
    }

    public final Object b(ViewDataBinding viewDataBinding, Continuation continuation) {
        AbstractC9221c abstractC9221c = (AbstractC9221c) viewDataBinding;
        abstractC9221c.q(this.f92314a);
        abstractC9221c.executePendingBindings();
        return Unit.INSTANCE;
    }

    public final ViewDataBinding d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AbstractC9221c.inflate(layoutInflater, viewGroup, false);
    }
}
