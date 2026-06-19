package com.bilibili.ship.theseus.ogv.intro.section.floatlayer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.app.gemini.ui.UIComponent.ViewEntry;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository$special$$inlined$map$1;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zu0.c1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/floatlayer/o.class */
@StabilityInferred(parameters = 0)
public final class o<SeasonListViewEntry extends UIComponent.ViewEntry> implements UIComponent<a<SeasonListViewEntry>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final b f93684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final com.bilibili.ship.theseus.ogv.intro.section.ui.u f93685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final OgvCurrentEpisodeRepository$special$$inlined$map$1 f93686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final StateFlow<WindowSizeClass> f93687d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f93688e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/floatlayer/o$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a<SeasonListViewEntry extends UIComponent.ViewEntry> implements UIComponent.ViewEntry {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final c1 f93689a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final SeasonListViewEntry f93690b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final View f93691c;

        public a(@NotNull c1 c1Var, @Nullable SeasonListViewEntry seasonlistviewentry) {
            this.f93689a = c1Var;
            this.f93690b = seasonlistviewentry;
            this.f93691c = c1Var.getRoot();
        }

        @NotNull
        public final View getRoot() {
            return this.f93691c;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/floatlayer/o$b.class */
    @StabilityInferred(parameters = 0)
    public static final class b extends androidx.databinding.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final MutableStateFlow<List<UIComponent<?>>> f93692a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final MutableStateFlow f93693b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public String f93694c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f93695d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f93696e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public Pair<Integer, Integer> f93697f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f93698g;
        public boolean h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public String f93699i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f93700j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f93701k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f93702l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @NotNull
        public final MutableSharedFlow<Long> f93703m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @NotNull
        public final MutableSharedFlow<Long> f93704n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f93705o;

        public b() {
            MutableStateFlow<List<UIComponent<?>>> MutableStateFlow = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
            this.f93692a = MutableStateFlow;
            this.f93693b = MutableStateFlow;
            this.f93694c = "";
            this.f93697f = new Pair<>(0, 0);
            this.f93699i = "";
            this.f93700j = true;
            BufferOverflow bufferOverflow = BufferOverflow.DROP_LATEST;
            this.f93703m = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, (Object) null);
            this.f93704n = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, (Object) null);
        }

        public final void m() {
            this.f93704n.tryEmit(Long.valueOf(this.f93701k));
        }

        public final void n(boolean z6) {
            if (z6 == this.h) {
                return;
            }
            this.h = z6;
            notifyPropertyChanged(198);
        }

        public final void o(boolean z6) {
            if (z6 == this.f93695d) {
                return;
            }
            this.f93695d = z6;
            notifyPropertyChanged(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_HAIR_SEGMENT_MIN_THRESHOLD);
        }

        public final void q(@NotNull String str) {
            if (Intrinsics.areEqual(str, this.f93694c)) {
                return;
            }
            this.f93694c = str;
            notifyPropertyChanged(640);
        }
    }

    public o(@NotNull b bVar, @Nullable com.bilibili.ship.theseus.ogv.intro.section.ui.u uVar, @NotNull OgvCurrentEpisodeRepository$special$$inlined$map$1 ogvCurrentEpisodeRepository$special$$inlined$map$1, @NotNull StateFlow stateFlow, @NotNull Function0 function0) {
        this.f93684a = bVar;
        this.f93685b = uVar;
        this.f93686c = ogvCurrentEpisodeRepository$special$$inlined$map$1;
        this.f93687d = stateFlow;
        this.f93688e = function0;
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        a aVar = (a) viewEntry;
        c1 c1Var = aVar.f93689a;
        c1Var.r(this.f93684a);
        c1Var.q(this.f93688e);
        c1Var.executePendingBindings();
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new OgvSectionFloatLayerUIComponent$bindToView$2(this, aVar, c1Var, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        com.bilibili.app.gemini.ui.d dVarCreateViewEntry;
        c1 c1VarInflate = c1.inflate(LayoutInflater.from(context), viewGroup, false);
        c1VarInflate.f130656E.setLayoutManager(new GridLayoutManager(context, 120));
        RecyclerView.Adapter adapterA = com.bilibili.ship.theseus.united.page.intro.i.a();
        RecyclerView recyclerView = c1VarInflate.f130656E;
        recyclerView.setAdapter(adapterA);
        recyclerView.addItemDecoration(new q(adapterA));
        com.bilibili.ship.theseus.ogv.intro.section.ui.u uVar = this.f93685b;
        if (uVar != null) {
            dVarCreateViewEntry = uVar.createViewEntry(context, c1VarInflate.f130652A);
            c1VarInflate.f130652A.addView(dVarCreateViewEntry.a.getRoot());
        } else {
            dVarCreateViewEntry = null;
        }
        return new a(c1VarInflate, dVarCreateViewEntry);
    }

    @NotNull
    public final Object viewReusingKey() {
        Object objViewReusingKey = super.viewReusingKey();
        com.bilibili.ship.theseus.ogv.intro.section.ui.u uVar = this.f93685b;
        return CollectionsKt.listOf(new Object[]{objViewReusingKey, uVar != null ? uVar.viewReusingKey() : null});
    }
}
