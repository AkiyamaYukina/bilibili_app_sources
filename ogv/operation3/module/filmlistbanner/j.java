package com.bilibili.ogv.operation3.module.filmlistbanner;

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
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/filmlistbanner/j.class */
public final class j implements UiComposableLike {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unit f71297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VertexContext f71298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KomponentScope f71299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Modifier f71300d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final PagerState f71301e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f71302f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f71303g;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/filmlistbanner/j$a.class */
    public static final class a implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Modifier f71304a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Modifier f71305b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final PagerState f71306c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f71307d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List f71308e;

        public a(Modifier modifier, Modifier modifier2, PagerState pagerState, int i7, List list) {
            this.f71304a = modifier;
            this.f71305b = modifier2;
            this.f71306c = pagerState;
            this.f71307d = i7;
            this.f71308e = list;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x011d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(java.lang.Object r21, java.lang.Object r22) {
            /*
                Method dump skipped, instruction units count: 692
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.operation3.module.filmlistbanner.j.a.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public j(Unit unit, VertexContext vertexContext, KomponentScope komponentScope, Modifier modifier, PagerState pagerState, int i7, List list) {
        this.f71298b = vertexContext;
        this.f71299c = komponentScope;
        this.f71300d = modifier;
        this.f71301e = pagerState;
        this.f71302f = i7;
        this.f71303g = list;
        this.f71297a = unit;
    }

    public final Object getContentType() {
        return Reflection.getOrCreateKotlinClass(j.class);
    }

    public final Object getKey() {
        return this.f71299c.getKey();
    }

    public final Object getState() {
        return this.f71297a;
    }

    @Composable
    public final void invoke(Modifier modifier, Composer composer, int i7) {
        composer.startReplaceGroup(1906618612);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1906618612, i7, -1, "kntr.common.komponent.setContent.<no name provided>.invoke (Komponent.kt:78)");
        }
        this.f71298b.ProvideCompositionLocals(ComposableLambdaKt.rememberComposableLambda(1461546774, true, new a(modifier, this.f71300d, this.f71301e, this.f71302f, this.f71303g), composer, 54), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }
}
