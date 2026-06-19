package com.bilibili.ship.theseus.united.page.intro.module.insertedbanner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ViewDataBinding;
import com.bilibili.app.gemini.ui.DataBindingComponent;
import com.bilibili.app.gemini.ui.UIComponent;
import dv0.AbstractC6886x;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/insertedbanner/g.class */
@StabilityInferred(parameters = 0)
public final class g extends DataBindingComponent<AbstractC6886x> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f100181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<UIComponent<?>> f100182b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/insertedbanner/g$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a extends androidx.databinding.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public String f100183a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f100184b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f100185c;
    }

    public g(@NotNull a aVar, @NotNull List<? extends UIComponent<?>> list) {
        this.f100181a = aVar;
        this.f100182b = list;
    }

    public final Object b(ViewDataBinding viewDataBinding, Continuation continuation) {
        AbstractC6886x abstractC6886x = (AbstractC6886x) viewDataBinding;
        abstractC6886x.f117171x.getAdapter().N(this.f100182b);
        abstractC6886x.q(this.f100181a);
        abstractC6886x.executePendingBindings();
        return Unit.INSTANCE;
    }

    public final ViewDataBinding d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AbstractC6886x abstractC6886xInflate = AbstractC6886x.inflate(layoutInflater, viewGroup, false);
        abstractC6886xInflate.f117171x.setAdapter(com.bilibili.ship.theseus.united.page.intro.i.a());
        return abstractC6886xInflate;
    }
}
