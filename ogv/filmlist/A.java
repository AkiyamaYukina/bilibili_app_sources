package com.bilibili.ogv.filmlist;

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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/filmlist/A.class */
public final class A implements UiComposableLike {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unit f67604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VertexContext f67605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KomponentScope f67606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final State f67607d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/filmlist/A$a.class */
    public static final class a implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Modifier f67608a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final State f67609b;

        public a(Modifier modifier, State state) {
            this.f67608a = modifier;
            this.f67609b = state;
        }

        public final Object invoke(Object obj, Object obj2) {
            Composer composer = (Composer) obj;
            int iIntValue = ((Number) obj2).intValue();
            if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1461546774, iIntValue, -1, "kntr.common.komponent.setContent.<no name provided>.invoke.<anonymous> (Komponent.kt:79)");
                }
                composer.startReplaceGroup(104377892);
                ((UiComposableLike) this.f67609b.getValue()).invoke(this.f67608a, composer, 0);
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

    public A(Unit unit, VertexContext vertexContext, KomponentScope komponentScope, State state) {
        this.f67605b = vertexContext;
        this.f67606c = komponentScope;
        this.f67607d = state;
        this.f67604a = unit;
    }

    public final Object getContentType() {
        return Reflection.getOrCreateKotlinClass(A.class);
    }

    public final Object getKey() {
        return this.f67606c.getKey();
    }

    public final Object getState() {
        return this.f67604a;
    }

    @Composable
    public final void invoke(Modifier modifier, Composer composer, int i7) {
        composer.startReplaceGroup(1906618612);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1906618612, i7, -1, "kntr.common.komponent.setContent.<no name provided>.invoke (Komponent.kt:78)");
        }
        this.f67605b.ProvideCompositionLocals(ComposableLambdaKt.rememberComposableLambda(1461546774, true, new a(modifier, this.f67607d), composer, 54), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }
}
