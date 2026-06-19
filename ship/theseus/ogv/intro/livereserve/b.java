package com.bilibili.ship.theseus.ogv.intro.livereserve;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ViewDataBinding;
import com.bilibili.app.gemini.ui.DataBindingComponent;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.ship.theseus.ogv.intro.livereserve.OgvLiveReserveVo;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zu0.AbstractC9251r0;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/livereserve/b.class */
@StabilityInferred(parameters = 0)
public final class b extends DataBindingComponent<AbstractC9251r0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f93300a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/livereserve/b$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a extends androidx.databinding.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final c f93301a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final d f93302b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f93303c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f93304d;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public Map<String, String> f93307g;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f93311l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f93313n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f93314o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f93315p;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public OgvLiveReserveVo.JumpType f93305e = OgvLiveReserveVo.JumpType.REFRESH;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public String f93306f = "";

        @NotNull
        public final ExposureEntry h = new ExposureEntry(com.bilibili.ship.theseus.united.report.a.f104837a, new NI.e(this, 3));

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public String f93308i = "";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        public String f93309j = "";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NotNull
        public String f93310k = "";

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f93312m = -39271;

        public a(@NotNull c cVar, @NotNull d dVar) {
            this.f93301a = cVar;
            this.f93302b = dVar;
        }
    }

    public b(@NotNull a aVar) {
        this.f93300a = aVar;
    }

    public final Object b(ViewDataBinding viewDataBinding, Continuation continuation) {
        AbstractC9251r0 abstractC9251r0 = (AbstractC9251r0) viewDataBinding;
        abstractC9251r0.q(this.f93300a);
        abstractC9251r0.executePendingBindings();
        return Unit.INSTANCE;
    }

    public final ViewDataBinding d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AbstractC9251r0.inflate(layoutInflater, viewGroup, false);
    }
}
