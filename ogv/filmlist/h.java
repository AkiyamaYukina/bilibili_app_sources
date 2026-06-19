package com.bilibili.ogv.filmlist;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.bilibili.ogv.filmlist.part.PartReadyUiService;
import kntr.common.komponent.KomponentScope;
import kntr.common.komponent.UiComposableLike;
import kntr.common.trio.vertex.VertexContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/filmlist/h.class */
public final class h implements UiComposableLike {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unit f67714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VertexContext f67715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KomponentScope f67716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PartReadyUiService f67717d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/filmlist/h$a.class */
    public static final class a implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Modifier f67718a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PartReadyUiService f67719b;

        public a(Modifier modifier, PartReadyUiService partReadyUiService) {
            this.f67718a = modifier;
            this.f67719b = partReadyUiService;
        }

        public final Object invoke(Object obj, Object obj2) {
            Composer composer = (Composer) obj;
            int iIntValue = ((Number) obj2).intValue();
            if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1461546774, iIntValue, -1, "kntr.common.komponent.setContent.<no name provided>.invoke.<anonymous> (Komponent.kt:79)");
                }
                composer.startReplaceGroup(1378612814);
                this.f67719b.a(this.f67718a, composer, 0);
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

    public h(Unit unit, VertexContext vertexContext, KomponentScope komponentScope, PartReadyUiService partReadyUiService) {
        this.f67715b = vertexContext;
        this.f67716c = komponentScope;
        this.f67717d = partReadyUiService;
        this.f67714a = unit;
    }

    public final Object getContentType() {
        return Reflection.getOrCreateKotlinClass(h.class);
    }

    public final Object getKey() {
        return this.f67716c.getKey();
    }

    public final Object getState() {
        return this.f67714a;
    }

    @Composable
    public final void invoke(Modifier modifier, Composer composer, int i7) {
        composer.startReplaceGroup(1906618612);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1906618612, i7, -1, "kntr.common.komponent.setContent.<no name provided>.invoke (Komponent.kt:78)");
        }
        this.f67715b.ProvideCompositionLocals(ComposableLambdaKt.rememberComposableLambda(1461546774, true, new a(modifier, this.f67717d), composer, 54), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }
}
