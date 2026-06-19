package com.bilibili.ogv.rank.part;

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
import kotlinx.coroutines.CompletableDeferred;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/part/k.class */
public final class k implements UiComposableLike<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f72084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VertexContext f72085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KomponentScope f72086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CompletableDeferred f72087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final State f72088e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/part/k$a.class */
    public static final class a implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Modifier f72089a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CompletableDeferred f72090b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final State f72091c;

        public a(Modifier modifier, CompletableDeferred completableDeferred, State state) {
            this.f72089a = modifier;
            this.f72090b = completableDeferred;
            this.f72091c = state;
        }

        public final Object invoke(Object obj, Object obj2) {
            Composer composer = (Composer) obj;
            int iIntValue = ((Number) obj2).intValue();
            if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1461546774, iIntValue, -1, "kntr.common.komponent.setContent.<no name provided>.invoke.<anonymous> (Komponent.kt:79)");
                }
                composer.startReplaceGroup(-1952482026);
                this.f72090b.complete(Unit.INSTANCE);
                ((UiComposableLike) this.f72091c.getValue()).invoke(this.f72089a, composer, 0);
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

    public k(d dVar, VertexContext vertexContext, KomponentScope komponentScope, CompletableDeferred completableDeferred, State state) {
        this.f72085b = vertexContext;
        this.f72086c = komponentScope;
        this.f72087d = completableDeferred;
        this.f72088e = state;
        this.f72084a = dVar;
    }

    public final Object getContentType() {
        return Reflection.getOrCreateKotlinClass(k.class);
    }

    public final Object getKey() {
        return this.f72086c.getKey();
    }

    public final d getState() {
        return this.f72084a;
    }

    @Composable
    public final void invoke(Modifier modifier, Composer composer, int i7) {
        composer.startReplaceGroup(1906618612);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1906618612, i7, -1, "kntr.common.komponent.setContent.<no name provided>.invoke (Komponent.kt:78)");
        }
        this.f72085b.ProvideCompositionLocals(ComposableLambdaKt.rememberComposableLambda(1461546774, true, new a(modifier, this.f72087d, this.f72088e), composer, 54), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }
}
