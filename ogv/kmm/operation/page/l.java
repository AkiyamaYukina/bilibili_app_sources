package com.bilibili.ogv.kmm.operation.page;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.bilibili.ogv.kmm.operation.page.p;
import kntr.common.komponent.KomponentScope;
import kntr.common.komponent.UiComposableLike;
import kntr.common.trio.vertex.VertexContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/page/l.class */
public final class l implements UiComposableLike {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unit f68614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VertexContext f68615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KomponentScope f68616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f68617d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/page/l$a.class */
    public static final class a implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Modifier f68618a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p f68619b;

        public a(Modifier modifier, p pVar) {
            this.f68618a = modifier;
            this.f68619b = pVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            Composer composer = (Composer) obj;
            int iIntValue = ((Number) obj2).intValue();
            if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1461546774, iIntValue, -1, "kntr.common.komponent.setContent.<no name provided>.invoke.<anonymous> (Komponent.kt:79)");
                }
                composer.startReplaceGroup(1101173947);
                com.bilibili.ogv.bdesign.placeholder.c.a(0, 10, composer, this.f68618a, null, ((p.a) this.f68619b).f68642a, null);
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

    public l(Unit unit, VertexContext vertexContext, KomponentScope komponentScope, p pVar) {
        this.f68615b = vertexContext;
        this.f68616c = komponentScope;
        this.f68617d = pVar;
        this.f68614a = unit;
    }

    public final Object getContentType() {
        return Reflection.getOrCreateKotlinClass(l.class);
    }

    public final Object getKey() {
        return this.f68616c.getKey();
    }

    public final Object getState() {
        return this.f68614a;
    }

    @Composable
    public final void invoke(Modifier modifier, Composer composer, int i7) {
        composer.startReplaceGroup(1906618612);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1906618612, i7, -1, "kntr.common.komponent.setContent.<no name provided>.invoke (Komponent.kt:78)");
        }
        this.f68615b.ProvideCompositionLocals(ComposableLambdaKt.rememberComposableLambda(1461546774, true, new a(modifier, this.f68617d), composer, 54), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }
}
