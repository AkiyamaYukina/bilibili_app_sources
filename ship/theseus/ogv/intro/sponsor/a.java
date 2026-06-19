package com.bilibili.ship.theseus.ogv.intro.sponsor;

import Ct0.o;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ViewDataBinding;
import com.bilibili.ad.adview.search.inline.card155.d0;
import com.bilibili.app.gemini.ui.DataBindingComponent;
import com.bilibili.framework.exposure.core.ExposureEntry;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zu0.F0;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/sponsor/a.class */
@StabilityInferred(parameters = 0)
public final class a extends DataBindingComponent<F0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final C0735a f93914a;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.sponsor.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/sponsor/a$a.class */
    @StabilityInferred(parameters = 0)
    public static final class C0735a extends androidx.databinding.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final o f93915a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final d0 f93916b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final ExposureEntry f93917c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final ExposureEntry f93918d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f93920f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f93921g;

        @Nullable
        public Drawable h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f93924k;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f93927n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f93928o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f93931r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f93933t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f93934u;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f93919e = true;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public String f93922i = "";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        public String f93923j = "";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @NotNull
        public String f93925l = "";

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @NotNull
        public String f93926m = "";

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        @NotNull
        public CharSequence f93929p = "";

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        @NotNull
        public String f93930q = "";

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        @NotNull
        public List<Pair<String, Boolean>> f93932s = new ArrayList();

        public C0735a(@NotNull o oVar, @NotNull d0 d0Var, @NotNull ExposureEntry exposureEntry, @NotNull ExposureEntry exposureEntry2) {
            this.f93915a = oVar;
            this.f93916b = d0Var;
            this.f93917c = exposureEntry;
            this.f93918d = exposureEntry2;
        }

        public final void m(boolean z6) {
            if (z6 == this.f93920f) {
                return;
            }
            this.f93920f = z6;
            notifyPropertyChanged(24);
        }

        public final void n(boolean z6) {
            if (z6 == this.f93931r) {
                return;
            }
            this.f93931r = z6;
            notifyPropertyChanged(470);
        }

        public final void o(boolean z6) {
            if (z6 == this.f93928o) {
                return;
            }
            this.f93928o = z6;
            notifyPropertyChanged(593);
        }
    }

    public a(@NotNull C0735a c0735a) {
        this.f93914a = c0735a;
    }

    public final Object b(ViewDataBinding viewDataBinding, Continuation continuation) {
        F0 f02 = (F0) viewDataBinding;
        f02.q(this.f93914a);
        f02.executePendingBindings();
        return Unit.INSTANCE;
    }

    public final ViewDataBinding d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return F0.inflate(layoutInflater, viewGroup, false);
    }
}
