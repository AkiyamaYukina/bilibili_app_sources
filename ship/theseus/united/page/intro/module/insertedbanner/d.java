package com.bilibili.ship.theseus.united.page.intro.module.insertedbanner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ViewDataBinding;
import com.bilibili.app.gemini.ui.DataBindingComponent;
import dv0.AbstractC6852D;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/insertedbanner/d.class */
@StabilityInferred(parameters = 0)
public final class d extends DataBindingComponent<AbstractC6852D> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final f f100174a;

    public d(@NotNull f fVar) {
        this.f100174a = fVar;
    }

    public final Object b(ViewDataBinding viewDataBinding, Continuation continuation) {
        AbstractC6852D abstractC6852D = (AbstractC6852D) viewDataBinding;
        abstractC6852D.q(this.f100174a);
        abstractC6852D.executePendingBindings();
        return Unit.INSTANCE;
    }

    public final ViewDataBinding d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AbstractC6852D.inflate(layoutInflater, viewGroup, false);
    }
}
