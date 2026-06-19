package com.bilibili.ship.theseus.ogv.intro.section.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ViewDataBinding;
import com.bilibili.app.gemini.ui.DataBindingComponent;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;
import zu0.AbstractC9263x0;
import zu0.AbstractC9267z0;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/ui/u.class */
@StabilityInferred(parameters = 0)
public final class u extends DataBindingComponent<AbstractC9267z0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final c f93883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<a> f93884b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/ui/u$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a extends DataBindingComponent<AbstractC9263x0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final b f93885a;

        public a(@NotNull b bVar) {
            this.f93885a = bVar;
        }

        public final Object b(ViewDataBinding viewDataBinding, Continuation continuation) {
            AbstractC9263x0 abstractC9263x0 = (AbstractC9263x0) viewDataBinding;
            abstractC9263x0.q(this.f93885a);
            abstractC9263x0.executePendingBindings();
            return Unit.INSTANCE;
        }

        public final ViewDataBinding d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            return AbstractC9263x0.inflate(layoutInflater, viewGroup, false);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/ui/u$b.class */
    @StabilityInferred(parameters = 0)
    public static final class b extends androidx.databinding.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f93886a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final MutableSharedFlow<Long> f93887b = SharedFlowKt.MutableSharedFlow$default(0, 1, BufferOverflow.DROP_LATEST, 1, (Object) null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public String f93888c = "";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f93889d;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/ui/u$c.class */
    @StabilityInferred(parameters = 0)
    public static final class c extends androidx.databinding.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public Pair<Integer, Integer> f93890a = new Pair<>(0, 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f93891b;
    }

    public u(@NotNull c cVar, @NotNull List<a> list) {
        this.f93883a = cVar;
        this.f93884b = list;
    }

    public final Object b(ViewDataBinding viewDataBinding, Continuation continuation) {
        AbstractC9267z0 abstractC9267z0 = (AbstractC9267z0) viewDataBinding;
        abstractC9267z0.q(this.f93883a);
        abstractC9267z0.f130932w.getAdapter().N(this.f93884b);
        abstractC9267z0.executePendingBindings();
        return Unit.INSTANCE;
    }

    public final ViewDataBinding d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AbstractC9267z0 abstractC9267z0Inflate = AbstractC9267z0.inflate(layoutInflater, viewGroup, false);
        abstractC9267z0Inflate.f130932w.setAdapter(com.bilibili.ship.theseus.united.page.intro.i.a());
        return abstractC9267z0Inflate;
    }

    public final void e(long j7) {
        Iterator<T> it = this.f93884b.iterator();
        while (it.hasNext()) {
            b bVar = ((a) it.next()).f93885a;
            boolean z6 = bVar.f93886a == j7;
            if (z6 != bVar.f93889d) {
                bVar.f93889d = z6;
                bVar.notifyPropertyChanged(550);
            }
        }
    }
}
