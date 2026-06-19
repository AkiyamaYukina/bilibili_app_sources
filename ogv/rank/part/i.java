package com.bilibili.ogv.rank.part;

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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/part/i.class */
public final class i implements UiComposableLike {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unit f72076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VertexContext f72077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KomponentScope f72078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final UiComposableLike f72079d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/part/i$a.class */
    public static final class a implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Modifier f72080a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final UiComposableLike f72081b;

        public a(Modifier modifier, UiComposableLike uiComposableLike) {
            this.f72080a = modifier;
            this.f72081b = uiComposableLike;
        }

        public final Object invoke(Object obj, Object obj2) {
            Composer composer = (Composer) obj;
            int iIntValue = ((Number) obj2).intValue();
            if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1461546774, iIntValue, -1, "kntr.common.komponent.setContent.<no name provided>.invoke.<anonymous> (Komponent.kt:79)");
                }
                composer.startReplaceGroup(-1806387863);
                this.f72081b.invoke(this.f72080a, composer, 0);
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

    public i(Unit unit, VertexContext vertexContext, KomponentScope komponentScope, UiComposableLike uiComposableLike) {
        this.f72077b = vertexContext;
        this.f72078c = komponentScope;
        this.f72079d = uiComposableLike;
        this.f72076a = unit;
    }

    public final Object getContentType() {
        return Reflection.getOrCreateKotlinClass(i.class);
    }

    public final Object getKey() {
        return this.f72078c.getKey();
    }

    public final Object getState() {
        return this.f72076a;
    }

    @Composable
    public final void invoke(Modifier modifier, Composer composer, int i7) {
        composer.startReplaceGroup(1906618612);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1906618612, i7, -1, "kntr.common.komponent.setContent.<no name provided>.invoke (Komponent.kt:78)");
        }
        this.f72077b.ProvideCompositionLocals(ComposableLambdaKt.rememberComposableLambda(1461546774, true, new a(modifier, this.f72079d), composer, 54), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }
}
