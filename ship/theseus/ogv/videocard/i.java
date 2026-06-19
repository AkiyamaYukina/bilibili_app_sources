package com.bilibili.ship.theseus.ogv.videocard;

import android.graphics.drawable.Drawable;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videocard/i.class */
@StabilityInferred(parameters = 0)
public final class i extends androidx.databinding.a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f94722A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public float f94723B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @Nullable
    public Drawable f94724C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f94725D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f94726E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @Nullable
    public d f94727F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    @Nullable
    public c f94728G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f94729H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f94730I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f94731J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public float f94732K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f94733L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f94734M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    @Nullable
    public Job f94735N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    @NotNull
    public Map<String, String> f94736O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int f94737P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f94738Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public int f94739R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public long f94740S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public long f94741T;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f94742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f94743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f94744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f94745d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f94746e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public String f94747f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public String f94748g;

    @Nullable
    public Long h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public Long f94749i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f94750j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f94751k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f94752l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f94753m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f94754n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f94755o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f94756p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f94757q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f94758r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public String f94759s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public b f94760t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public b f94761u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f94762v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f94763w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public String f94764x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public String f94765y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public String f94766z;

    public final void m(int i7) {
        if (i7 == this.f94758r) {
            return;
        }
        this.f94758r = i7;
        notifyPropertyChanged(282);
    }

    public final void n(int i7) {
        if (i7 == this.f94743b) {
            return;
        }
        this.f94743b = i7;
        notifyPropertyChanged(296);
    }

    public final void o(int i7) {
        if (i7 == this.f94742a) {
            return;
        }
        this.f94742a = i7;
        notifyPropertyChanged(300);
    }

    public final void q(int i7) {
        if (i7 == this.f94744c) {
            return;
        }
        this.f94744c = i7;
        notifyPropertyChanged(422);
    }

    public final void r(int i7) {
        if (i7 == this.f94745d) {
            return;
        }
        this.f94745d = i7;
        notifyPropertyChanged(423);
    }

    public final void s(@Nullable Job job) {
        Job job2 = this.f94735N;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        this.f94735N = job;
    }

    public final void u(boolean z6) {
        if (z6 == this.f94763w) {
            return;
        }
        this.f94763w = z6;
        notifyPropertyChanged(550);
    }

    public final void v(int i7) {
        if (i7 == this.f94757q) {
            return;
        }
        this.f94757q = i7;
        notifyPropertyChanged(743);
    }
}
