package com.bilibili.ship.theseus.united.page.intro.module.guidestrip;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ViewDataBinding;
import com.bilibili.app.gemini.ui.DataBindingComponent;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.iconfont.IconTextDrawable;
import dv0.AbstractC6869i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/guidestrip/f.class */
@StabilityInferred(parameters = 0)
public final class f extends DataBindingComponent<AbstractC6869i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f100121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final StateFlow<Integer> f100122b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/guidestrip/f$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a extends androidx.databinding.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final ExposureEntry f100123a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final g f100124b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final h f100125c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f100126d;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f100132k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f100133l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f100134m;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f100136o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f100137p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        @Nullable
        public IconTextDrawable f100138q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f100139r;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f100127e = -4879;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f100128f = -39271;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public String f100129g = "";

        @NotNull
        public String h = "";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public String f100130i = "";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        public String f100131j = "";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f100135n = 12;

        public a(@NotNull ExposureEntry exposureEntry, @NotNull g gVar, @NotNull h hVar, boolean z6) {
            this.f100123a = exposureEntry;
            this.f100124b = gVar;
            this.f100125c = hVar;
            this.f100126d = z6;
        }

        public final void m(int i7) {
            if (i7 == this.f100134m) {
                return;
            }
            this.f100134m = i7;
            notifyPropertyChanged(250);
        }
    }

    public f(@NotNull a aVar, @NotNull StateFlow<Integer> stateFlow) {
        this.f100121a = aVar;
        this.f100122b = stateFlow;
    }

    public final Object b(ViewDataBinding viewDataBinding, Continuation continuation) {
        AbstractC6869i abstractC6869i = (AbstractC6869i) viewDataBinding;
        abstractC6869i.q(this.f100121a);
        abstractC6869i.executePendingBindings();
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new GuideStripUIComponent$bind$2(this, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final ViewDataBinding d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AbstractC6869i.inflate(layoutInflater, viewGroup, false);
    }
}
