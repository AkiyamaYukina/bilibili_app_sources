package com.bilibili.ogv.rank;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.bilibili.ogv.rank.part.PartReadyUiService;
import kntr.common.komponent.KomponentScope;
import kntr.common.komponent.UiComposableLike;
import kntr.common.trio.vertex.VertexContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/P.class */
public final class P implements UiComposableLike {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unit f71865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VertexContext f71866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KomponentScope f71867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PartReadyUiService f71868d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/P$a.class */
    public static final class a implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Modifier f71869a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PartReadyUiService f71870b;

        public a(Modifier modifier, PartReadyUiService partReadyUiService) {
            this.f71869a = modifier;
            this.f71870b = partReadyUiService;
        }

        public final Object invoke(Object obj, Object obj2) {
            Composer composer = (Composer) obj;
            int iIntValue = ((Number) obj2).intValue();
            if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1461546774, iIntValue, -1, "kntr.common.komponent.setContent.<no name provided>.invoke.<anonymous> (Komponent.kt:79)");
                }
                composer.startReplaceGroup(98302131);
                this.f71870b.a(this.f71869a, composer, 0);
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

    public P(Unit unit, VertexContext vertexContext, KomponentScope komponentScope, PartReadyUiService partReadyUiService) {
        this.f71866b = vertexContext;
        this.f71867c = komponentScope;
        this.f71868d = partReadyUiService;
        this.f71865a = unit;
    }

    public final Object getContentType() {
        return Reflection.getOrCreateKotlinClass(P.class);
    }

    public final Object getKey() {
        return this.f71867c.getKey();
    }

    public final Object getState() {
        return this.f71865a;
    }

    @Composable
    public final void invoke(Modifier modifier, Composer composer, int i7) {
        composer.startReplaceGroup(1906618612);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1906618612, i7, -1, "kntr.common.komponent.setContent.<no name provided>.invoke (Komponent.kt:78)");
        }
        this.f71866b.ProvideCompositionLocals(ComposableLambdaKt.rememberComposableLambda(1461546774, true, new a(modifier, this.f71868d), composer, 54), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }
}
