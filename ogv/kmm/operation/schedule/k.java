package com.bilibili.ogv.kmm.operation.schedule;

import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import java.util.List;
import kntr.common.komponent.KomponentScope;
import kntr.common.komponent.UiComposableLike;
import kntr.common.trio.vertex.VertexContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/schedule/k.class */
public final class k implements UiComposableLike {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unit f68801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VertexContext f68802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KomponentScope f68803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LazyListState f68804d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MutableIntState f68805e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f68806f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/schedule/k$a.class */
    public static final class a implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Modifier f68807a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LazyListState f68808b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final MutableIntState f68809c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List f68810d;

        public a(Modifier modifier, LazyListState lazyListState, MutableIntState mutableIntState, List list) {
            this.f68807a = modifier;
            this.f68808b = lazyListState;
            this.f68809c = mutableIntState;
            this.f68810d = list;
        }

        public final Object invoke(Object obj, Object obj2) {
            Composer composer = (Composer) obj;
            int iIntValue = ((Number) obj2).intValue();
            if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1461546774, iIntValue, -1, "kntr.common.komponent.setContent.<no name provided>.invoke.<anonymous> (Komponent.kt:79)");
                }
                composer.startReplaceGroup(-621160823);
                BoxWithConstraintsKt.BoxWithConstraints(this.f68807a, null, false, ComposableLambdaKt.rememberComposableLambda(1933174747, true, new C5465h(this.f68808b, this.f68809c, this.f68810d), composer, 54), composer, 3072, 6);
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

    public k(Unit unit, VertexContext vertexContext, KomponentScope komponentScope, LazyListState lazyListState, MutableIntState mutableIntState, List list) {
        this.f68802b = vertexContext;
        this.f68803c = komponentScope;
        this.f68804d = lazyListState;
        this.f68805e = mutableIntState;
        this.f68806f = list;
        this.f68801a = unit;
    }

    public final Object getContentType() {
        return Reflection.getOrCreateKotlinClass(k.class);
    }

    public final Object getKey() {
        return this.f68803c.getKey();
    }

    public final Object getState() {
        return this.f68801a;
    }

    @Composable
    public final void invoke(Modifier modifier, Composer composer, int i7) {
        composer.startReplaceGroup(1906618612);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1906618612, i7, -1, "kntr.common.komponent.setContent.<no name provided>.invoke (Komponent.kt:78)");
        }
        this.f68802b.ProvideCompositionLocals(ComposableLambdaKt.rememberComposableLambda(1461546774, true, new a(modifier, this.f68804d, this.f68805e, this.f68806f), composer, 54), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }
}
