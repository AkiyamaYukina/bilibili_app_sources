package com.bilibili.ogv.secondary;

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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/v.class */
public final class v implements UiComposableLike {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unit f72943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VertexContext f72944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KomponentScope f72945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final State f72946d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/v$a.class */
    public static final class a implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Modifier f72947a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final State f72948b;

        public a(Modifier modifier, State state) {
            this.f72947a = modifier;
            this.f72948b = state;
        }

        public final Object invoke(Object obj, Object obj2) {
            Composer composer = (Composer) obj;
            int iIntValue = ((Number) obj2).intValue();
            if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1461546774, iIntValue, -1, "kntr.common.komponent.setContent.<no name provided>.invoke.<anonymous> (Komponent.kt:79)");
                }
                composer.startReplaceGroup(-1913682255);
                ((UiComposableLike) this.f72948b.getValue()).invoke(this.f72947a, composer, 0);
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

    public v(Unit unit, VertexContext vertexContext, KomponentScope komponentScope, State state) {
        this.f72944b = vertexContext;
        this.f72945c = komponentScope;
        this.f72946d = state;
        this.f72943a = unit;
    }

    public final Object getContentType() {
        return Reflection.getOrCreateKotlinClass(v.class);
    }

    public final Object getKey() {
        return this.f72945c.getKey();
    }

    public final Object getState() {
        return this.f72943a;
    }

    @Composable
    public final void invoke(Modifier modifier, Composer composer, int i7) {
        composer.startReplaceGroup(1906618612);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1906618612, i7, -1, "kntr.common.komponent.setContent.<no name provided>.invoke (Komponent.kt:78)");
        }
        this.f72944b.ProvideCompositionLocals(ComposableLambdaKt.rememberComposableLambda(1461546774, true, new a(modifier, this.f72946d), composer, 54), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }
}
