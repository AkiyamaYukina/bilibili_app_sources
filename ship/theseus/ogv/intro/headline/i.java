package com.bilibili.ship.theseus.ogv.intro.headline;

import PX0.T;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ViewDataBinding;
import com.bilibili.app.gemini.ui.DataBindingComponent;
import com.bilibili.biligame.ui.discover2.act.p0;
import com.bilibili.compose.theme.BiliThemeKt;
import com.bilibili.compose.theme.ThemeStrategy;
import com.bilibili.framework.exposure.core.ExposureEntry;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zu0.J;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/headline/i.class */
@StabilityInferred(parameters = 0)
public final class i extends DataBindingComponent<J> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f93137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableState f93138b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/headline/i$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a extends androidx.databinding.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final ExposureEntry f93139a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final ExposureEntry f93140b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final ExposureEntry f93141c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final d f93142d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final e f93143e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final String f93144f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public final String f93145g;

        @Nullable
        public final g h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        public Drawable f93146i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f93147j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f93148k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f93149l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f93150m;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f93152o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f93153p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        @Nullable
        public Drawable f93154q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f93155r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public boolean f93156s;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public boolean f93160w;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @NotNull
        public String f93151n = "";

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        @NotNull
        public String f93157t = "theseus_follow_guide_light_lottie.json";

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        @NotNull
        public String f93158u = "";

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        @NotNull
        public String f93159v = "";

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        @NotNull
        public final Jj0.d f93161x = new Object();

        /* JADX WARN: Type inference failed for: r1v12, types: [Jj0.d, java.lang.Object] */
        public a(@NotNull ExposureEntry exposureEntry, @NotNull ExposureEntry exposureEntry2, @NotNull ExposureEntry exposureEntry3, @NotNull d dVar, @NotNull e eVar, @NotNull String str, @NotNull String str2, @Nullable g gVar) {
            this.f93139a = exposureEntry;
            this.f93140b = exposureEntry2;
            this.f93141c = exposureEntry3;
            this.f93142d = dVar;
            this.f93143e = eVar;
            this.f93144f = str;
            this.f93145g = str2;
            this.h = gVar;
        }
    }

    public i(@NotNull a aVar, @NotNull MutableState mutableState) {
        this.f93137a = aVar;
        this.f93138b = mutableState;
    }

    public final Object b(ViewDataBinding viewDataBinding, Continuation continuation) {
        J j7 = (J) viewDataBinding;
        j7.q(this.f93137a);
        j7.executePendingBindings();
        final int i7 = 0;
        j7.f130484B.setContent(ComposableLambdaKt.composableLambdaInstance(1276004900, true, new Function2(this, i7) { // from class: com.bilibili.ship.theseus.ogv.intro.headline.h

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f93135a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f93136b;

            {
                this.f93135a = i7;
                this.f93136b = this;
            }

            public final Object invoke(Object obj, Object obj2) {
                switch (this.f93135a) {
                    case 0:
                        Composer composer = (Composer) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1276004900, iIntValue, -1, "com.bilibili.ship.theseus.ogv.intro.headline.OgvHeadlineComponent.bind.<anonymous> (OgvHeadlineComponent.kt:35)");
                            }
                            BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(-1246631572, true, new p0((i) this.f93136b, 1), composer, 54), composer, 384, 3);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer.skipToGroupEnd();
                        }
                        break;
                    default:
                        ((T) this.f93136b).appendAll((String) obj, (List) obj2);
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        return Unit.INSTANCE;
    }

    public final ViewDataBinding d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return J.inflate(layoutInflater, viewGroup, false);
    }
}
