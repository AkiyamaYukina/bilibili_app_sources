package com.bilibili.ogv.rank;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import kntr.common.komponent.KomponentScope;
import kntr.common.komponent.UiComposableLike;
import kntr.common.trio.vertex.VertexContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/H.class */
public final class H implements UiComposableLike {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unit f71834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VertexContext f71835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KomponentScope f71836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final T f71837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final KomponentScope f71838e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final MutableState f71839f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PageUiService f71840g;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/H$a.class */
    public static final class a implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Modifier f71841a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final T f71842b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final KomponentScope f71843c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final MutableState f71844d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final PageUiService f71845e;

        public a(Modifier modifier, T t7, KomponentScope komponentScope, MutableState mutableState, PageUiService pageUiService) {
            this.f71841a = modifier;
            this.f71842b = t7;
            this.f71843c = komponentScope;
            this.f71844d = mutableState;
            this.f71845e = pageUiService;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x00d9  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0154  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(java.lang.Object r11, java.lang.Object r12) {
            /*
                Method dump skipped, instruction units count: 426
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.rank.H.a.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public H(Unit unit, VertexContext vertexContext, KomponentScope komponentScope, T t7, KomponentScope komponentScope2, MutableState mutableState, PageUiService pageUiService) {
        this.f71835b = vertexContext;
        this.f71836c = komponentScope;
        this.f71837d = t7;
        this.f71838e = komponentScope2;
        this.f71839f = mutableState;
        this.f71840g = pageUiService;
        this.f71834a = unit;
    }

    public final Object getContentType() {
        return Reflection.getOrCreateKotlinClass(H.class);
    }

    public final Object getKey() {
        return this.f71836c.getKey();
    }

    public final Object getState() {
        return this.f71834a;
    }

    @Composable
    public final void invoke(Modifier modifier, Composer composer, int i7) {
        composer.startReplaceGroup(1906618612);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1906618612, i7, -1, "kntr.common.komponent.setContent.<no name provided>.invoke (Komponent.kt:78)");
        }
        this.f71835b.ProvideCompositionLocals(ComposableLambdaKt.rememberComposableLambda(1461546774, true, new a(modifier, this.f71837d, this.f71838e, this.f71839f, this.f71840g), composer, 54), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }
}
