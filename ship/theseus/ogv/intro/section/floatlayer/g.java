package com.bilibili.ship.theseus.ogv.intro.section.floatlayer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.gemini.ui.DataBindingComponent;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository$special$$inlined$map$1;
import com.bilibili.ship.theseus.ogv.intro.section.ui.c;
import com.bilibili.ship.theseus.ogv.intro.section.ui.s;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import zu0.U0;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/floatlayer/g.class */
@StabilityInferred(parameters = 0)
public final class g extends DataBindingComponent<U0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final s.a f93656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Flow<List<UIComponent<?>>> f93657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final c.a f93658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final OgvCurrentEpisodeRepository$special$$inlined$map$1 f93659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final StateFlow<WindowSizeClass> f93660e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.ogv.intro.section.service.c f93661f;

    public g(@NotNull s.a aVar, @NotNull Flow flow, @NotNull c.a aVar2, @NotNull OgvCurrentEpisodeRepository$special$$inlined$map$1 ogvCurrentEpisodeRepository$special$$inlined$map$1, @NotNull StateFlow stateFlow, @NotNull com.bilibili.ship.theseus.ogv.intro.section.service.c cVar) {
        this.f93656a = aVar;
        this.f93657b = flow;
        this.f93658c = aVar2;
        this.f93659d = ogvCurrentEpisodeRepository$special$$inlined$map$1;
        this.f93660e = stateFlow;
        this.f93661f = cVar;
    }

    public final Object b(ViewDataBinding viewDataBinding, Continuation continuation) {
        U0 u02 = (U0) viewDataBinding;
        u02.s(this.f93656a);
        u02.q(this.f93658c);
        u02.r(this.f93661f);
        u02.executePendingBindings();
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new OgvPreviewSectionMergedFloatLayerUIComponent$bind$2(this, u02.f130580x.getAdapter(), u02, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final ViewDataBinding d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        U0 u0Inflate = U0.inflate(layoutInflater, viewGroup, false);
        RecyclerView.Adapter adapterA = com.bilibili.ship.theseus.united.page.intro.i.a();
        u0Inflate.f130580x.setAdapter(adapterA);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 2);
        RecyclerView recyclerView = u0Inflate.f130580x;
        recyclerView.setLayoutManager(gridLayoutManager);
        e eVar = new e(adapterA);
        u0Inflate.f130581y.addItemDecoration(new f(context));
        recyclerView.addItemDecoration(eVar);
        return u0Inflate;
    }
}
