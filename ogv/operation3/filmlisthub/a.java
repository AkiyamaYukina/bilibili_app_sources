package com.bilibili.ogv.operation3.filmlisthub;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import kntr.common.komponent.KomponentScope;
import kntr.common.komponent.UiComposableLike;
import kntr.common.trio.toast.Toaster;
import kntr.common.trio.vertex.VertexContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/filmlisthub/a.class */
public final class a implements UiComposableLike {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unit f71057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VertexContext f71058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KomponentScope f71059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f71060d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final KomponentScope f71061e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final MutableState f71062f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final FilmListHubPageModel f71063g;
    public final Toaster h;

    /* JADX INFO: renamed from: com.bilibili.ogv.operation3.filmlisthub.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/filmlisthub/a$a.class */
    public static final class C0439a implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Modifier f71064a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l f71065b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final KomponentScope f71066c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final MutableState f71067d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final FilmListHubPageModel f71068e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Toaster f71069f;

        public C0439a(Modifier modifier, l lVar, KomponentScope komponentScope, MutableState mutableState, FilmListHubPageModel filmListHubPageModel, Toaster toaster) {
            this.f71064a = modifier;
            this.f71065b = lVar;
            this.f71066c = komponentScope;
            this.f71067d = mutableState;
            this.f71068e = filmListHubPageModel;
            this.f71069f = toaster;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x00ed  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0178  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(java.lang.Object r11, java.lang.Object r12) {
            /*
                Method dump skipped, instruction units count: 464
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.operation3.filmlisthub.a.C0439a.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public a(Unit unit, VertexContext vertexContext, KomponentScope komponentScope, l lVar, KomponentScope komponentScope2, MutableState mutableState, FilmListHubPageModel filmListHubPageModel, Toaster toaster) {
        this.f71058b = vertexContext;
        this.f71059c = komponentScope;
        this.f71060d = lVar;
        this.f71061e = komponentScope2;
        this.f71062f = mutableState;
        this.f71063g = filmListHubPageModel;
        this.h = toaster;
        this.f71057a = unit;
    }

    public final Object getContentType() {
        return Reflection.getOrCreateKotlinClass(a.class);
    }

    public final Object getKey() {
        return this.f71059c.getKey();
    }

    public final Object getState() {
        return this.f71057a;
    }

    @Composable
    public final void invoke(Modifier modifier, Composer composer, int i7) {
        composer.startReplaceGroup(1906618612);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1906618612, i7, -1, "kntr.common.komponent.setContent.<no name provided>.invoke (Komponent.kt:78)");
        }
        FilmListHubPageModel filmListHubPageModel = this.f71063g;
        this.f71058b.ProvideCompositionLocals(ComposableLambdaKt.rememberComposableLambda(1461546774, true, new C0439a(modifier, this.f71060d, this.f71061e, this.f71062f, filmListHubPageModel, this.h), composer, 54), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }
}
