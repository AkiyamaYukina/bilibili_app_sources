package com.bilibili.ogv.kmm.operation.banner;

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

/* JADX INFO: renamed from: com.bilibili.ogv.kmm.operation.banner.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/banner/o.class */
public final class C5451o implements UiComposableLike {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unit f68132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VertexContext f68133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KomponentScope f68134c;

    /* JADX INFO: renamed from: com.bilibili.ogv.kmm.operation.banner.o$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/banner/o$a.class */
    public static final class a implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Modifier f68135a;

        public a(Modifier modifier) {
            this.f68135a = modifier;
        }

        public final Object invoke(Object obj, Object obj2) {
            Composer composer = (Composer) obj;
            int iIntValue = ((Number) obj2).intValue();
            if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1461546774, iIntValue, -1, "kntr.common.komponent.setContent.<no name provided>.invoke.<anonymous> (Komponent.kt:79)");
                }
                composer.startReplaceGroup(-1225009410);
                SpacerKt.Spacer(this.f68135a, composer, 0);
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

    public C5451o(Unit unit, VertexContext vertexContext, KomponentScope komponentScope) {
        this.f68133b = vertexContext;
        this.f68134c = komponentScope;
        this.f68132a = unit;
    }

    public final Object getContentType() {
        return Reflection.getOrCreateKotlinClass(C5451o.class);
    }

    public final Object getKey() {
        return this.f68134c.getKey();
    }

    public final Object getState() {
        return this.f68132a;
    }

    @Composable
    public final void invoke(Modifier modifier, Composer composer, int i7) {
        composer.startReplaceGroup(1906618612);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1906618612, i7, -1, "kntr.common.komponent.setContent.<no name provided>.invoke (Komponent.kt:78)");
        }
        this.f68133b.ProvideCompositionLocals(ComposableLambdaKt.rememberComposableLambda(1461546774, true, new a(modifier), composer, 54), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }
}
