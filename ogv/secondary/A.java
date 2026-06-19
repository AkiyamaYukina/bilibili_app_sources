package com.bilibili.ogv.secondary;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.bilibili.ogv.secondary.part.PartReadyUiService;
import kntr.common.komponent.KomponentScope;
import kntr.common.komponent.UiComposableLike;
import kntr.common.trio.vertex.VertexContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/A.class */
public final class A implements UiComposableLike {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unit f72589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VertexContext f72590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KomponentScope f72591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PartReadyUiService f72592d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/A$a.class */
    public static final class a implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Modifier f72593a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PartReadyUiService f72594b;

        public a(Modifier modifier, PartReadyUiService partReadyUiService) {
            this.f72593a = modifier;
            this.f72594b = partReadyUiService;
        }

        public final Object invoke(Object obj, Object obj2) {
            Composer composer = (Composer) obj;
            int iIntValue = ((Number) obj2).intValue();
            if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1461546774, iIntValue, -1, "kntr.common.komponent.setContent.<no name provided>.invoke.<anonymous> (Komponent.kt:79)");
                }
                composer.startReplaceGroup(214854177);
                this.f72594b.a(this.f72593a, composer, 0);
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

    public A(Unit unit, VertexContext vertexContext, KomponentScope komponentScope, PartReadyUiService partReadyUiService) {
        this.f72590b = vertexContext;
        this.f72591c = komponentScope;
        this.f72592d = partReadyUiService;
        this.f72589a = unit;
    }

    public final Object getContentType() {
        return Reflection.getOrCreateKotlinClass(A.class);
    }

    public final Object getKey() {
        return this.f72591c.getKey();
    }

    public final Object getState() {
        return this.f72589a;
    }

    @Composable
    public final void invoke(Modifier modifier, Composer composer, int i7) {
        composer.startReplaceGroup(1906618612);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1906618612, i7, -1, "kntr.common.komponent.setContent.<no name provided>.invoke (Komponent.kt:78)");
        }
        this.f72590b.ProvideCompositionLocals(ComposableLambdaKt.rememberComposableLambda(1461546774, true, new a(modifier, this.f72592d), composer, 54), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }
}
