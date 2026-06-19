package com.bilibili.ship.theseus.ogv.intro.section.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ViewDataBinding;
import com.bilibili.app.gemini.ui.DataBindingComponent;
import com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository$special$$inlined$map$1;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import zu0.X;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/ui/c.class */
@StabilityInferred(parameters = 0)
public final class c extends DataBindingComponent<X> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow f93822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final a f93823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final OgvCurrentEpisodeRepository$special$$inlined$map$1 f93824c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/ui/c$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a extends androidx.databinding.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f93826b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f93828d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public Pair<Integer, Integer> f93825a = new Pair<>(0, 0);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public String f93827c = "";
    }

    public c(@NotNull MutableStateFlow mutableStateFlow, @NotNull a aVar, @NotNull OgvCurrentEpisodeRepository$special$$inlined$map$1 ogvCurrentEpisodeRepository$special$$inlined$map$1) {
        this.f93822a = mutableStateFlow;
        this.f93823b = aVar;
        this.f93824c = ogvCurrentEpisodeRepository$special$$inlined$map$1;
    }

    public final Object b(ViewDataBinding viewDataBinding, Continuation continuation) {
        X x6 = (X) viewDataBinding;
        x6.q(this.f93823b);
        x6.executePendingBindings();
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new OgvEpisodeListUIComponent$bind$2(this, x6.f130602w.getAdapter(), x6, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final ViewDataBinding d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        X xInflate = X.inflate(layoutInflater, viewGroup, false);
        xInflate.f130602w.addItemDecoration(new d(context));
        xInflate.f130602w.setAdapter(com.bilibili.ship.theseus.united.page.intro.i.a());
        return xInflate;
    }
}
