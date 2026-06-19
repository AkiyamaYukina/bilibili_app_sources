package com.bilibili.ogv.kmm.operation.schedule;

import androidx.compose.foundation.layout.BoxWithConstraintsKt;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/schedule/s.class */
public final class s implements UiComposableLike {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unit f68826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VertexContext f68827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KomponentScope f68828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f68829d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/schedule/s$a.class */
    public static final class a implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Modifier f68830a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f68831b;

        public a(Modifier modifier, List list) {
            this.f68830a = modifier;
            this.f68831b = list;
        }

        public final Object invoke(Object obj, Object obj2) {
            Composer composer = (Composer) obj;
            int iIntValue = ((Number) obj2).intValue();
            if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1461546774, iIntValue, -1, "kntr.common.komponent.setContent.<no name provided>.invoke.<anonymous> (Komponent.kt:79)");
                }
                composer.startReplaceGroup(781423834);
                BoxWithConstraintsKt.BoxWithConstraints(this.f68830a, null, false, ComposableLambdaKt.rememberComposableLambda(-1610187461, true, new p(this.f68831b), composer, 54), composer, 3072, 6);
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

    public s(Unit unit, VertexContext vertexContext, KomponentScope komponentScope, List list) {
        this.f68827b = vertexContext;
        this.f68828c = komponentScope;
        this.f68829d = list;
        this.f68826a = unit;
    }

    public final Object getContentType() {
        return Reflection.getOrCreateKotlinClass(s.class);
    }

    public final Object getKey() {
        return this.f68828c.getKey();
    }

    public final Object getState() {
        return this.f68826a;
    }

    @Composable
    public final void invoke(Modifier modifier, Composer composer, int i7) {
        composer.startReplaceGroup(1906618612);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1906618612, i7, -1, "kntr.common.komponent.setContent.<no name provided>.invoke (Komponent.kt:78)");
        }
        this.f68827b.ProvideCompositionLocals(ComposableLambdaKt.rememberComposableLambda(1461546774, true, new a(modifier, this.f68829d), composer, 54), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }
}
