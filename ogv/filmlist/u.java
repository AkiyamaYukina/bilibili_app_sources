package com.bilibili.ogv.filmlist;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import kntr.common.komponent.KomponentScope;
import kntr.common.komponent.UiComposableLike;
import kntr.common.trio.toast.Toaster;
import kntr.common.trio.vertex.VertexContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/filmlist/u.class */
public final class u implements UiComposableLike {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unit f67817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VertexContext f67818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KomponentScope f67819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s f67820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final KomponentScope f67821e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final MutableState f67822f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final B f67823g;
    public final Toaster h;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/filmlist/u$a.class */
    public static final class a implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Modifier f67824a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final s f67825b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final KomponentScope f67826c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final MutableState f67827d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final B f67828e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Toaster f67829f;

        public a(Modifier modifier, s sVar, KomponentScope komponentScope, MutableState mutableState, B b7, Toaster toaster) {
            this.f67824a = modifier;
            this.f67825b = sVar;
            this.f67826c = komponentScope;
            this.f67827d = mutableState;
            this.f67828e = b7;
            this.f67829f = toaster;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x00e7  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(java.lang.Object r11, java.lang.Object r12) {
            /*
                Method dump skipped, instruction units count: 319
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.filmlist.u.a.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public u(Unit unit, VertexContext vertexContext, KomponentScope komponentScope, s sVar, KomponentScope komponentScope2, MutableState mutableState, B b7, Toaster toaster) {
        this.f67818b = vertexContext;
        this.f67819c = komponentScope;
        this.f67820d = sVar;
        this.f67821e = komponentScope2;
        this.f67822f = mutableState;
        this.f67823g = b7;
        this.h = toaster;
        this.f67817a = unit;
    }

    public final Object getContentType() {
        return Reflection.getOrCreateKotlinClass(u.class);
    }

    public final Object getKey() {
        return this.f67819c.getKey();
    }

    public final Object getState() {
        return this.f67817a;
    }

    @Composable
    public final void invoke(Modifier modifier, Composer composer, int i7) {
        composer.startReplaceGroup(1906618612);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1906618612, i7, -1, "kntr.common.komponent.setContent.<no name provided>.invoke (Komponent.kt:78)");
        }
        B b7 = this.f67823g;
        this.f67818b.ProvideCompositionLocals(ComposableLambdaKt.rememberComposableLambda(1461546774, true, new a(modifier, this.f67820d, this.f67821e, this.f67822f, b7, this.h), composer, 54), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }
}
