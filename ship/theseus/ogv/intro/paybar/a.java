package com.bilibili.ship.theseus.ogv.intro.paybar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ViewDataBinding;
import com.bilibili.app.gemini.ui.DataBindingComponent;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.ship.theseus.ogv.playviewextra.PayTip;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zu0.J0;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/paybar/a.class */
@StabilityInferred(parameters = 0)
public final class a extends DataBindingComponent<J0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final C0708a f93344a;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.paybar.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/paybar/a$a.class */
    @StabilityInferred(parameters = 0)
    public static final class C0708a extends androidx.databinding.a {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public int f93345A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public boolean f93346B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public int f93347C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public int f93348D;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final b f93349a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final c f93350b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public ExposureEntry f93351c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public PayTip f93352d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f93353e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public Drawable f93354f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public Drawable f93355g;
        public boolean h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        public Integer f93356i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f93357j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f93359l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f93361n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f93362o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public boolean f93364q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public boolean f93366s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        @Nullable
        public Drawable f93368u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f93369v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f93370w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f93372y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public boolean f93373z;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NotNull
        public String f93358k = "";

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @NotNull
        public String f93360m = "";

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        @NotNull
        public String f93363p = "";

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        @NotNull
        public String f93365r = "";

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public boolean f93367t = true;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        @NotNull
        public String f93371x = "";

        public C0708a(@NotNull b bVar, @NotNull c cVar) {
            this.f93349a = bVar;
            this.f93350b = cVar;
        }

        public final void m(boolean z6) {
            if (z6 == this.f93357j) {
                return;
            }
            this.f93357j = z6;
            notifyPropertyChanged(17);
        }

        public final void n(boolean z6) {
            if (z6 == this.f93353e) {
                return;
            }
            this.f93353e = z6;
            notifyPropertyChanged(55);
        }

        public final void o(boolean z6) {
            if (z6 == this.h) {
                return;
            }
            this.h = z6;
            notifyPropertyChanged(64);
        }

        public final void q(boolean z6) {
            if (z6 == this.f93373z) {
                return;
            }
            this.f93373z = z6;
            notifyPropertyChanged(328);
        }

        public final void r(boolean z6) {
            if (z6 == this.f93362o) {
                return;
            }
            this.f93362o = z6;
            notifyPropertyChanged(583);
        }

        public final void s(boolean z6) {
            if (z6 == this.f93361n) {
                return;
            }
            this.f93361n = z6;
            notifyPropertyChanged(586);
        }

        public final void u(@NotNull String str) {
            if (Intrinsics.areEqual(str, this.f93371x)) {
                return;
            }
            this.f93371x = str;
            notifyPropertyChanged(667);
        }

        public final void v(int i7) {
            if (i7 == this.f93372y) {
                return;
            }
            this.f93372y = i7;
            notifyPropertyChanged(668);
        }

        public final void w(boolean z6) {
            if (z6 == this.f93359l) {
                return;
            }
            this.f93359l = z6;
            notifyPropertyChanged(724);
        }

        public final void z(boolean z6) {
            if (z6 == this.f93364q) {
                return;
            }
            this.f93364q = z6;
            notifyPropertyChanged(726);
        }
    }

    public a(@NotNull C0708a c0708a) {
        this.f93344a = c0708a;
    }

    public final Object b(ViewDataBinding viewDataBinding, Continuation continuation) {
        J0 j02 = (J0) viewDataBinding;
        j02.q(this.f93344a);
        j02.executePendingBindings();
        return Unit.INSTANCE;
    }

    public final ViewDataBinding d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return J0.inflate(layoutInflater, viewGroup, false);
    }
}
