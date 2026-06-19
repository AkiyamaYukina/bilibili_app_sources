package com.bilibili.ogv.secondary.part;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import it0.C7615a;
import kntr.common.komponent.KomponentScope;
import kntr.common.komponent.UiComposableLike;
import kntr.common.trio.vertex.VertexContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import ml0.C8013d;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/part/t.class */
public final class t implements UiComposableLike {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unit f72888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VertexContext f72889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KomponentScope f72890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final nl0.q f72891d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C7615a f72892e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/part/t$a.class */
    public static final class a implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Modifier f72893a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final nl0.q f72894b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C7615a f72895c;

        public a(Modifier modifier, nl0.q qVar, C7615a c7615a) {
            this.f72893a = modifier;
            this.f72894b = qVar;
            this.f72895c = c7615a;
        }

        public final Object invoke(Object obj, Object obj2) {
            Composer composer = (Composer) obj;
            int iIntValue = ((Number) obj2).intValue();
            if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1461546774, iIntValue, -1, "kntr.common.komponent.setContent.<no name provided>.invoke.<anonymous> (Komponent.kt:79)");
                }
                composer.startReplaceGroup(1743977775);
                this.f72894b.a(C8013d.a(this.f72893a, this.f72895c), 0.0f, composer, 512);
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

    public t(Unit unit, VertexContext vertexContext, KomponentScope komponentScope, nl0.q qVar, C7615a c7615a) {
        this.f72889b = vertexContext;
        this.f72890c = komponentScope;
        this.f72891d = qVar;
        this.f72892e = c7615a;
        this.f72888a = unit;
    }

    public final Object getContentType() {
        return Reflection.getOrCreateKotlinClass(t.class);
    }

    public final Object getKey() {
        return this.f72890c.getKey();
    }

    public final Object getState() {
        return this.f72888a;
    }

    @Composable
    public final void invoke(Modifier modifier, Composer composer, int i7) {
        composer.startReplaceGroup(1906618612);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1906618612, i7, -1, "kntr.common.komponent.setContent.<no name provided>.invoke (Komponent.kt:78)");
        }
        this.f72889b.ProvideCompositionLocals(ComposableLambdaKt.rememberComposableLambda(1461546774, true, new a(modifier, this.f72891d, this.f72892e), composer, 54), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }
}
