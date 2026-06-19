package com.bilibili.ogv.kmm.operation.cinematicket;

import androidx.compose.foundation.layout.SpacerKt;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/cinematicket/d.class */
public final class d implements UiComposableLike {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unit f68227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VertexContext f68228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KomponentScope f68229c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/cinematicket/d$a.class */
    public static final class a implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Modifier f68230a;

        public a(Modifier modifier) {
            this.f68230a = modifier;
        }

        public final Object invoke(Object obj, Object obj2) {
            Composer composer = (Composer) obj;
            int iIntValue = ((Number) obj2).intValue();
            if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1461546774, iIntValue, -1, "kntr.common.komponent.setContent.<no name provided>.invoke.<anonymous> (Komponent.kt:79)");
                }
                composer.startReplaceGroup(-813067941);
                SpacerKt.Spacer(this.f68230a, composer, 0);
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

    public d(Unit unit, VertexContext vertexContext, KomponentScope komponentScope) {
        this.f68228b = vertexContext;
        this.f68229c = komponentScope;
        this.f68227a = unit;
    }

    public final Object getContentType() {
        return Reflection.getOrCreateKotlinClass(d.class);
    }

    public final Object getKey() {
        return this.f68229c.getKey();
    }

    public final Object getState() {
        return this.f68227a;
    }

    @Composable
    public final void invoke(Modifier modifier, Composer composer, int i7) {
        composer.startReplaceGroup(1906618612);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1906618612, i7, -1, "kntr.common.komponent.setContent.<no name provided>.invoke (Komponent.kt:78)");
        }
        this.f68228b.ProvideCompositionLocals(ComposableLambdaKt.rememberComposableLambda(1461546774, true, new a(modifier), composer, 54), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }
}
