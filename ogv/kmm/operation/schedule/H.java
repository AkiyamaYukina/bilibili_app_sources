package com.bilibili.ogv.kmm.operation.schedule;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import java.util.List;
import kntr.common.komponent.KomponentScope;
import kntr.common.komponent.UiComposableLike;
import kntr.common.trio.vertex.VertexContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/schedule/H.class */
public final class H implements UiComposableLike {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unit f68721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VertexContext f68722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KomponentScope f68723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f68724d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u f68725e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/schedule/H$a.class */
    public static final class a implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Modifier f68726a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f68727b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final u f68728c;

        public a(Modifier modifier, List list, u uVar) {
            this.f68726a = modifier;
            this.f68727b = list;
            this.f68728c = uVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            Composer composer = (Composer) obj;
            int iIntValue = ((Number) obj2).intValue();
            if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1461546774, iIntValue, -1, "kntr.common.komponent.setContent.<no name provided>.invoke.<anonymous> (Komponent.kt:79)");
                }
                composer.startReplaceGroup(1113053226);
                E.d(this.f68727b, this.f68728c, this.f68726a, composer, 0);
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

    public H(Unit unit, VertexContext vertexContext, KomponentScope komponentScope, List list, u uVar) {
        this.f68722b = vertexContext;
        this.f68723c = komponentScope;
        this.f68724d = list;
        this.f68725e = uVar;
        this.f68721a = unit;
    }

    public final Object getContentType() {
        return Reflection.getOrCreateKotlinClass(H.class);
    }

    public final Object getKey() {
        return this.f68723c.getKey();
    }

    public final Object getState() {
        return this.f68721a;
    }

    @Composable
    public final void invoke(Modifier modifier, Composer composer, int i7) {
        composer.startReplaceGroup(1906618612);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1906618612, i7, -1, "kntr.common.komponent.setContent.<no name provided>.invoke (Komponent.kt:78)");
        }
        this.f68722b.ProvideCompositionLocals(ComposableLambdaKt.rememberComposableLambda(1461546774, true, new a(modifier, this.f68724d, this.f68725e), composer, 54), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }
}
