package com.bilibili.ship.theseus.united.page.intro.module.insertedbanner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ViewDataBinding;
import com.bilibili.app.gemini.ui.DataBindingComponent;
import dv0.AbstractC6888z;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/insertedbanner/a.class */
@StabilityInferred(parameters = 0)
public final class a extends DataBindingComponent<AbstractC6888z> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final f f100167a;

    public a(@NotNull f fVar) {
        this.f100167a = fVar;
    }

    public final Object b(ViewDataBinding viewDataBinding, Continuation continuation) {
        AbstractC6888z abstractC6888z = (AbstractC6888z) viewDataBinding;
        abstractC6888z.q(this.f100167a);
        abstractC6888z.executePendingBindings();
        return Unit.INSTANCE;
    }

    public final ViewDataBinding d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AbstractC6888z.inflate(layoutInflater, viewGroup, false);
    }
}
