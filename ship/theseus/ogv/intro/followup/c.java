package com.bilibili.ship.theseus.ogv.intro.followup;

import Y9.p;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ViewDataBinding;
import com.bilibili.app.gemini.ui.DataBindingComponent;
import com.bilibili.framework.exposure.core.ExposureEntry;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zu0.o1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/followup/c.class */
@StabilityInferred(parameters = 0)
public final class c extends DataBindingComponent<o1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f93074a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/followup/c$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a extends androidx.databinding.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final com.bilibili.ship.theseus.ogv.intro.followup.a f93075a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final p f93076b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final ExposureEntry f93077c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public Drawable f93078d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public CharSequence f93079e = "";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f93080f = -15197924;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public String f93081g = "";

        @NotNull
        public String h = "";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f93082i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f93083j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f93084k;

        public a(@NotNull com.bilibili.ship.theseus.ogv.intro.followup.a aVar, @NotNull p pVar, @NotNull ExposureEntry exposureEntry) {
            this.f93075a = aVar;
            this.f93076b = pVar;
            this.f93077c = exposureEntry;
        }

        public final void m(boolean z6) {
            if (z6 == this.f93083j) {
                return;
            }
            this.f93083j = z6;
            notifyPropertyChanged(727);
        }
    }

    public c(@NotNull a aVar) {
        this.f93074a = aVar;
    }

    public final Object b(ViewDataBinding viewDataBinding, Continuation continuation) {
        o1 o1Var = (o1) viewDataBinding;
        o1Var.q(this.f93074a);
        o1Var.executePendingBindings();
        return Unit.INSTANCE;
    }

    public final ViewDataBinding d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return o1.inflate(layoutInflater, viewGroup, false);
    }
}
