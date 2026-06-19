package com.bilibili.ogv.operation3.module.filmlistbanner;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import kntr.common.komponent.KomponentScope;
import kntr.common.komponent.UiComposableLike;
import kntr.common.trio.vertex.VertexContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import ml0.C8013d;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/filmlistbanner/i.class */
public final class i implements UiComposableLike {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unit f71289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VertexContext f71290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KomponentScope f71291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f71292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Modifier f71293e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/filmlistbanner/i$a.class */
    public static final class a implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Modifier f71294a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f f71295b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Modifier f71296c;

        public a(Modifier modifier, f fVar, Modifier modifier2) {
            this.f71294a = modifier;
            this.f71295b = fVar;
            this.f71296c = modifier2;
        }

        public final Object invoke(Object obj, Object obj2) {
            Composer composer = (Composer) obj;
            int iIntValue = ((Number) obj2).intValue();
            if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1461546774, iIntValue, -1, "kntr.common.komponent.setContent.<no name provided>.invoke.<anonymous> (Komponent.kt:79)");
                }
                composer.startReplaceGroup(-1075681725);
                f fVar = this.f71295b;
                m.b(fVar.f71282a, C8013d.a(this.f71294a.then(this.f71296c), fVar.f71283b), composer, 0);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer.skipToGroupEnd();
            }
            return Unit.INSTANCE;
        }
    }

    public i(Unit unit, VertexContext vertexContext, KomponentScope komponentScope, f fVar, Modifier modifier) {
        this.f71290b = vertexContext;
        this.f71291c = komponentScope;
        this.f71292d = fVar;
        this.f71293e = modifier;
        this.f71289a = unit;
    }

    public final Object getContentType() {
        return Reflection.getOrCreateKotlinClass(i.class);
    }

    public final Object getKey() {
        return this.f71291c.getKey();
    }

    public final Object getState() {
        return this.f71289a;
    }

    @Composable
    public final void invoke(Modifier modifier, Composer composer, int i7) {
        composer.startReplaceGroup(1906618612);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1906618612, i7, -1, "kntr.common.komponent.setContent.<no name provided>.invoke (Komponent.kt:78)");
        }
        this.f71290b.ProvideCompositionLocals(ComposableLambdaKt.rememberComposableLambda(1461546774, true, new a(modifier, this.f71292d, this.f71293e), composer, 54), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }
}
