package com.bilibili.ogv.kmm.operation.cinematicket;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.bilibili.ogv.bpf.countdown.CountdownModelKt$createCountdownModel$1;
import com.bilibili.ogv.kmm.operation.cinematicket.a;
import com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.C6542t;
import kntr.common.komponent.KomponentScope;
import kntr.common.komponent.UiComposableLike;
import kntr.common.trio.vertex.VertexContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlin.time.Duration;
import ml0.C8013d;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/cinematicket/e.class */
public final class e implements UiComposableLike {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unit f68231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VertexContext f68232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KomponentScope f68233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a.c f68234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CountdownModelKt$createCountdownModel$1 f68235e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.bilibili.ogv.kmm.operation.cinematicket.a f68236f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C6542t f68237g;
    public final com.bilibili.ogv.kmm.operation.inlinevideo.b h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C6542t f68238i;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/cinematicket/e$a.class */
    public static final class a implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Modifier f68239a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a.c f68240b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CountdownModelKt$createCountdownModel$1 f68241c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final com.bilibili.ogv.kmm.operation.cinematicket.a f68242d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final C6542t f68243e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final com.bilibili.ogv.kmm.operation.inlinevideo.b f68244f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final C6542t f68245g;

        public a(Modifier modifier, a.c cVar, CountdownModelKt$createCountdownModel$1 countdownModelKt$createCountdownModel$1, com.bilibili.ogv.kmm.operation.cinematicket.a aVar, C6542t c6542t, com.bilibili.ogv.kmm.operation.inlinevideo.b bVar, C6542t c6542t2) {
            this.f68239a = modifier;
            this.f68240b = cVar;
            this.f68241c = countdownModelKt$createCountdownModel$1;
            this.f68242d = aVar;
            this.f68243e = c6542t;
            this.f68244f = bVar;
            this.f68245g = c6542t2;
        }

        public final Object invoke(Object obj, Object obj2) {
            Composer composer = (Composer) obj;
            int iIntValue = ((Number) obj2).intValue();
            if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1461546774, iIntValue, -1, "kntr.common.komponent.setContent.<no name provided>.invoke.<anonymous> (Komponent.kt:79)");
                }
                composer.startReplaceGroup(-1417735746);
                a.c cVar = this.f68240b;
                if (cVar.f68191f > 0) {
                    CountdownModelKt$createCountdownModel$1 countdownModelKt$createCountdownModel$1 = this.f68241c;
                    if (!Duration.isNegative-impl(countdownModelKt$createCountdownModel$1.a(composer, 0))) {
                        i.b(this.f68242d, cVar, this.f68243e, this.f68244f, countdownModelKt$createCountdownModel$1, C8013d.a(this.f68239a, this.f68245g), composer, 0);
                    }
                }
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

    public e(Unit unit, VertexContext vertexContext, KomponentScope komponentScope, a.c cVar, CountdownModelKt$createCountdownModel$1 countdownModelKt$createCountdownModel$1, com.bilibili.ogv.kmm.operation.cinematicket.a aVar, C6542t c6542t, com.bilibili.ogv.kmm.operation.inlinevideo.b bVar, C6542t c6542t2) {
        this.f68232b = vertexContext;
        this.f68233c = komponentScope;
        this.f68234d = cVar;
        this.f68235e = countdownModelKt$createCountdownModel$1;
        this.f68236f = aVar;
        this.f68237g = c6542t;
        this.h = bVar;
        this.f68238i = c6542t2;
        this.f68231a = unit;
    }

    public final Object getContentType() {
        return Reflection.getOrCreateKotlinClass(e.class);
    }

    public final Object getKey() {
        return this.f68233c.getKey();
    }

    public final Object getState() {
        return this.f68231a;
    }

    @Composable
    public final void invoke(Modifier modifier, Composer composer, int i7) {
        composer.startReplaceGroup(1906618612);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1906618612, i7, -1, "kntr.common.komponent.setContent.<no name provided>.invoke (Komponent.kt:78)");
        }
        C6542t c6542t = this.f68238i;
        this.f68232b.ProvideCompositionLocals(ComposableLambdaKt.rememberComposableLambda(1461546774, true, new a(modifier, this.f68234d, this.f68235e, this.f68236f, this.f68237g, this.h, c6542t), composer, 54), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }
}
