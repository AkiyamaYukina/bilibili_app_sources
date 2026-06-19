package com.bilibili.ogv.kmm.operation.page;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import kntr.common.komponent.KomponentScope;
import kntr.common.komponent.UiComposableLike;
import kntr.common.trio.vertex.VertexContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/page/n.class */
public final class n implements UiComposableLike<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f68621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VertexContext f68622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KomponentScope f68623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MutableState f68624d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ref.ObjectRef f68625e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Ref.BooleanRef f68626f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final KomponentScope f68627g;
    public final State h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Ref.ObjectRef f68628i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o f68629j;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/page/n$a.class */
    public static final class a implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Modifier f68630a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MutableState f68631b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Ref.ObjectRef f68632c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Ref.BooleanRef f68633d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final KomponentScope f68634e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final State f68635f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Ref.ObjectRef f68636g;
        public final o h;

        public a(Modifier modifier, MutableState mutableState, Ref.ObjectRef objectRef, Ref.BooleanRef booleanRef, KomponentScope komponentScope, State state, Ref.ObjectRef objectRef2, o oVar) {
            this.f68630a = modifier;
            this.f68631b = mutableState;
            this.f68632c = objectRef;
            this.f68633d = booleanRef;
            this.f68634e = komponentScope;
            this.f68635f = state;
            this.f68636g = objectRef2;
            this.h = oVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0094  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(java.lang.Object r13, java.lang.Object r14) {
            /*
                Method dump skipped, instruction units count: 349
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.kmm.operation.page.n.a.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public n(d dVar, VertexContext vertexContext, KomponentScope komponentScope, MutableState mutableState, Ref.ObjectRef objectRef, Ref.BooleanRef booleanRef, KomponentScope komponentScope2, State state, Ref.ObjectRef objectRef2, o oVar) {
        this.f68622b = vertexContext;
        this.f68623c = komponentScope;
        this.f68624d = mutableState;
        this.f68625e = objectRef;
        this.f68626f = booleanRef;
        this.f68627g = komponentScope2;
        this.h = state;
        this.f68628i = objectRef2;
        this.f68629j = oVar;
        this.f68621a = dVar;
    }

    public final Object getContentType() {
        return Reflection.getOrCreateKotlinClass(n.class);
    }

    public final Object getKey() {
        return this.f68623c.getKey();
    }

    public final d getState() {
        return this.f68621a;
    }

    @Composable
    public final void invoke(Modifier modifier, Composer composer, int i7) {
        composer.startReplaceGroup(1906618612);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1906618612, i7, -1, "kntr.common.komponent.setContent.<no name provided>.invoke (Komponent.kt:78)");
        }
        Ref.ObjectRef objectRef = this.f68628i;
        o oVar = this.f68629j;
        this.f68622b.ProvideCompositionLocals(ComposableLambdaKt.rememberComposableLambda(1461546774, true, new a(modifier, this.f68624d, this.f68625e, this.f68626f, this.f68627g, this.h, objectRef, oVar), composer, 54), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }
}
