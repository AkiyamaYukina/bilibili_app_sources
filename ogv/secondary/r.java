package com.bilibili.ogv.secondary;

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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/r.class */
public final class r implements UiComposableLike {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unit f72922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VertexContext f72923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KomponentScope f72924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final I f72925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final KomponentScope f72926e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final MutableState f72927f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PageUiService f72928g;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/r$a.class */
    public static final class a implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Modifier f72929a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final I f72930b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final KomponentScope f72931c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final MutableState f72932d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final PageUiService f72933e;

        public a(Modifier modifier, I i7, KomponentScope komponentScope, MutableState mutableState, PageUiService pageUiService) {
            this.f72929a = modifier;
            this.f72930b = i7;
            this.f72931c = komponentScope;
            this.f72932d = mutableState;
            this.f72933e = pageUiService;
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
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.secondary.r.a.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public r(Unit unit, VertexContext vertexContext, KomponentScope komponentScope, I i7, KomponentScope komponentScope2, MutableState mutableState, PageUiService pageUiService) {
        this.f72923b = vertexContext;
        this.f72924c = komponentScope;
        this.f72925d = i7;
        this.f72926e = komponentScope2;
        this.f72927f = mutableState;
        this.f72928g = pageUiService;
        this.f72922a = unit;
    }

    public final Object getContentType() {
        return Reflection.getOrCreateKotlinClass(r.class);
    }

    public final Object getKey() {
        return this.f72924c.getKey();
    }

    public final Object getState() {
        return this.f72922a;
    }

    @Composable
    public final void invoke(Modifier modifier, Composer composer, int i7) {
        composer.startReplaceGroup(1906618612);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1906618612, i7, -1, "kntr.common.komponent.setContent.<no name provided>.invoke (Komponent.kt:78)");
        }
        this.f72923b.ProvideCompositionLocals(ComposableLambdaKt.rememberComposableLambda(1461546774, true, new a(modifier, this.f72925d, this.f72926e, this.f72927f, this.f72928g), composer, 54), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }
}
