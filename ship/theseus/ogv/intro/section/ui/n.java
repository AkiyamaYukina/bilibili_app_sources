package com.bilibili.ship.theseus.ogv.intro.section.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ViewDataBinding;
import com.bilibili.app.gemini.ui.DataBindingComponent;
import com.bilibili.app.gemini.ui.UIComponent;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import zu0.AbstractC9262x;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/ui/n.class */
@StabilityInferred(parameters = 0)
public final class n extends DataBindingComponent<AbstractC9262x> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f93861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<UIComponent<?>> f93862b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/ui/n$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a extends androidx.databinding.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public Jj0.h f93863a = new Jj0.h();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f93864b;
    }

    public n(@NotNull a aVar, @NotNull List<? extends UIComponent<?>> list) {
        this.f93861a = aVar;
        this.f93862b = list;
    }

    public final Object b(ViewDataBinding viewDataBinding, Continuation continuation) {
        AbstractC9262x abstractC9262x = (AbstractC9262x) viewDataBinding;
        abstractC9262x.q(this.f93861a);
        abstractC9262x.executePendingBindings();
        abstractC9262x.f130909w.getAdapter().N(this.f93862b);
        return Unit.INSTANCE;
    }

    public final ViewDataBinding d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AbstractC9262x abstractC9262xInflate = AbstractC9262x.inflate(layoutInflater, viewGroup, false);
        abstractC9262xInflate.f130909w.setAdapter(com.bilibili.ship.theseus.united.page.intro.i.a());
        abstractC9262xInflate.f130909w.addItemDecoration(new o(context));
        return abstractC9262xInflate;
    }
}
