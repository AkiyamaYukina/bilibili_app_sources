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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/part/p.class */
public final class p implements UiComposableLike {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unit f72874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VertexContext f72875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KomponentScope f72876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final nl0.q f72877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C7615a f72878e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/part/p$a.class */
    public static final class a implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Modifier f72879a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final nl0.q f72880b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C7615a f72881c;

        public a(Modifier modifier, nl0.q qVar, C7615a c7615a) {
            this.f72879a = modifier;
            this.f72880b = qVar;
            this.f72881c = c7615a;
        }

        public final Object invoke(Object obj, Object obj2) {
            Composer composer = (Composer) obj;
            int iIntValue = ((Number) obj2).intValue();
            if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1461546774, iIntValue, -1, "kntr.common.komponent.setContent.<no name provided>.invoke.<anonymous> (Komponent.kt:79)");
                }
                composer.startReplaceGroup(1547182035);
                this.f72880b.a(C8013d.a(this.f72879a, this.f72881c), 0.0f, composer, 512);
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

    public p(Unit unit, VertexContext vertexContext, KomponentScope komponentScope, nl0.q qVar, C7615a c7615a) {
        this.f72875b = vertexContext;
        this.f72876c = komponentScope;
        this.f72877d = qVar;
        this.f72878e = c7615a;
        this.f72874a = unit;
    }

    public final Object getContentType() {
        return Reflection.getOrCreateKotlinClass(p.class);
    }

    public final Object getKey() {
        return this.f72876c.getKey();
    }

    public final Object getState() {
        return this.f72874a;
    }

    @Composable
    public final void invoke(Modifier modifier, Composer composer, int i7) {
        composer.startReplaceGroup(1906618612);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1906618612, i7, -1, "kntr.common.komponent.setContent.<no name provided>.invoke (Komponent.kt:78)");
        }
        this.f72875b.ProvideCompositionLocals(ComposableLambdaKt.rememberComposableLambda(1461546774, true, new a(modifier, this.f72877d, this.f72878e), composer, 54), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }
}
