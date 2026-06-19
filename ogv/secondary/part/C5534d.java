package com.bilibili.ogv.secondary.part;

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

/* JADX INFO: renamed from: com.bilibili.ogv.secondary.part.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/part/d.class */
public final class C5534d implements UiComposableLike {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unit f72812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VertexContext f72813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KomponentScope f72814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f72815d;

    /* JADX INFO: renamed from: com.bilibili.ogv.secondary.part.d$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/part/d$a.class */
    public static final class a implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Modifier f72816a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f72817b;

        public a(Modifier modifier, String str) {
            this.f72816a = modifier;
            this.f72817b = str;
        }

        public final Object invoke(Object obj, Object obj2) {
            Composer composer = (Composer) obj;
            int iIntValue = ((Number) obj2).intValue();
            if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1461546774, iIntValue, -1, "kntr.common.komponent.setContent.<no name provided>.invoke.<anonymous> (Komponent.kt:79)");
                }
                composer.startReplaceGroup(1423999705);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-189751800, 0, -1, "com.bilibili.ogv.secondary.rememberSecondaryOperationWebState (SecondaryOperationWeb.kt:27)");
                }
                Object objRememberedValue = composer.rememberedValue();
                Object h = objRememberedValue;
                if (objRememberedValue == Composer.Companion.getEmpty()) {
                    h = new com.bilibili.ogv.secondary.H(this.f72817b);
                    composer.updateRememberedValue(h);
                }
                com.bilibili.ogv.secondary.H h7 = (com.bilibili.ogv.secondary.H) h;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                com.bilibili.ogv.secondary.G.a(h7, this.f72816a, composer, 0);
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

    public C5534d(Unit unit, VertexContext vertexContext, KomponentScope komponentScope, String str) {
        this.f72813b = vertexContext;
        this.f72814c = komponentScope;
        this.f72815d = str;
        this.f72812a = unit;
    }

    public final Object getContentType() {
        return Reflection.getOrCreateKotlinClass(C5534d.class);
    }

    public final Object getKey() {
        return this.f72814c.getKey();
    }

    public final Object getState() {
        return this.f72812a;
    }

    @Composable
    public final void invoke(Modifier modifier, Composer composer, int i7) {
        composer.startReplaceGroup(1906618612);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1906618612, i7, -1, "kntr.common.komponent.setContent.<no name provided>.invoke (Komponent.kt:78)");
        }
        this.f72813b.ProvideCompositionLocals(ComposableLambdaKt.rememberComposableLambda(1461546774, true, new a(modifier, this.f72815d), composer, 54), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }
}
