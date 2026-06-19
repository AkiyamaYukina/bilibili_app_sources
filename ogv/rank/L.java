package com.bilibili.ogv.rank;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import kntr.common.komponent.KomponentScope;
import kntr.common.komponent.UiComposableLike;
import kntr.common.trio.vertex.VertexContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/L.class */
public final class L implements UiComposableLike {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unit f71855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VertexContext f71856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KomponentScope f71857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final State f71858d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/L$a.class */
    public static final class a implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Modifier f71859a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final State f71860b;

        public a(Modifier modifier, State state) {
            this.f71859a = modifier;
            this.f71860b = state;
        }

        public final Object invoke(Object obj, Object obj2) {
            Composer composer = (Composer) obj;
            int iIntValue = ((Number) obj2).intValue();
            if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1461546774, iIntValue, -1, "kntr.common.komponent.setContent.<no name provided>.invoke.<anonymous> (Komponent.kt:79)");
                }
                composer.startReplaceGroup(1603487493);
                ((UiComposableLike) this.f71860b.getValue()).invoke(this.f71859a, composer, 0);
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

    public L(Unit unit, VertexContext vertexContext, KomponentScope komponentScope, State state) {
        this.f71856b = vertexContext;
        this.f71857c = komponentScope;
        this.f71858d = state;
        this.f71855a = unit;
    }

    public final Object getContentType() {
        return Reflection.getOrCreateKotlinClass(L.class);
    }

    public final Object getKey() {
        return this.f71857c.getKey();
    }

    public final Object getState() {
        return this.f71855a;
    }

    @Composable
    public final void invoke(Modifier modifier, Composer composer, int i7) {
        composer.startReplaceGroup(1906618612);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1906618612, i7, -1, "kntr.common.komponent.setContent.<no name provided>.invoke (Komponent.kt:78)");
        }
        this.f71856b.ProvideCompositionLocals(ComposableLambdaKt.rememberComposableLambda(1461546774, true, new a(modifier, this.f71858d), composer, 54), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }
}
