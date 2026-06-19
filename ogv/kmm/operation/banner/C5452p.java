package com.bilibili.ogv.kmm.operation.banner;

import androidx.compose.foundation.pager.PagerState;
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
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CompletableDeferred;

/* JADX INFO: renamed from: com.bilibili.ogv.kmm.operation.banner.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/banner/p.class */
public final class C5452p implements UiComposableLike {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unit f68136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VertexContext f68137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KomponentScope f68138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC5439c f68139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ref.BooleanRef f68140e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CompletableDeferred f68141f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PagerState f68142g;
    public final List h;

    /* JADX INFO: renamed from: com.bilibili.ogv.kmm.operation.banner.p$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/banner/p$a.class */
    public static final class a implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Modifier f68143a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC5439c f68144b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Ref.BooleanRef f68145c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final CompletableDeferred f68146d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final PagerState f68147e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final List f68148f;

        public a(Modifier modifier, InterfaceC5439c interfaceC5439c, Ref.BooleanRef booleanRef, CompletableDeferred completableDeferred, PagerState pagerState, List list) {
            this.f68143a = modifier;
            this.f68144b = interfaceC5439c;
            this.f68145c = booleanRef;
            this.f68146d = completableDeferred;
            this.f68147e = pagerState;
            this.f68148f = list;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0089  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(java.lang.Object r13, java.lang.Object r14) {
            /*
                Method dump skipped, instruction units count: 271
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.kmm.operation.banner.C5452p.a.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public C5452p(Unit unit, VertexContext vertexContext, KomponentScope komponentScope, InterfaceC5439c interfaceC5439c, Ref.BooleanRef booleanRef, CompletableDeferred completableDeferred, PagerState pagerState, List list) {
        this.f68137b = vertexContext;
        this.f68138c = komponentScope;
        this.f68139d = interfaceC5439c;
        this.f68140e = booleanRef;
        this.f68141f = completableDeferred;
        this.f68142g = pagerState;
        this.h = list;
        this.f68136a = unit;
    }

    public final Object getContentType() {
        return Reflection.getOrCreateKotlinClass(C5452p.class);
    }

    public final Object getKey() {
        return this.f68138c.getKey();
    }

    public final Object getState() {
        return this.f68136a;
    }

    @Composable
    public final void invoke(Modifier modifier, Composer composer, int i7) {
        composer.startReplaceGroup(1906618612);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1906618612, i7, -1, "kntr.common.komponent.setContent.<no name provided>.invoke (Komponent.kt:78)");
        }
        List list = this.h;
        this.f68137b.ProvideCompositionLocals(ComposableLambdaKt.rememberComposableLambda(1461546774, true, new a(modifier, this.f68139d, this.f68140e, this.f68141f, this.f68142g, list), composer, 54), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }
}
