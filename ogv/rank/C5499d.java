package com.bilibili.ogv.rank;

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

/* JADX INFO: renamed from: com.bilibili.ogv.rank.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/d.class */
public final class C5499d implements UiComposableLike {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unit f71960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VertexContext f71961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KomponentScope f71962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PagerState f71963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f71964e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C5500e f71965f;

    /* JADX INFO: renamed from: com.bilibili.ogv.rank.d$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/d$a.class */
    public static final class a implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Modifier f71966a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PagerState f71967b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f71968c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final C5500e f71969d;

        public a(Modifier modifier, PagerState pagerState, List list, C5500e c5500e) {
            this.f71966a = modifier;
            this.f71967b = pagerState;
            this.f71968c = list;
            this.f71969d = c5500e;
        }

        public final Object invoke(Object obj, Object obj2) {
            Composer composer = (Composer) obj;
            int iIntValue = ((Number) obj2).intValue();
            if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1461546774, iIntValue, -1, "kntr.common.komponent.setContent.<no name provided>.invoke.<anonymous> (Komponent.kt:79)");
                }
                composer.startReplaceGroup(1314387308);
                List list = this.f71968c;
                C5500e c5500e = this.f71969d;
                PageReadyUiKt.h(this.f71967b, list, c5500e.f71972c, c5500e.f71971b, this.f71966a, composer, 0);
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

    public C5499d(Unit unit, VertexContext vertexContext, KomponentScope komponentScope, PagerState pagerState, List list, C5500e c5500e) {
        this.f71961b = vertexContext;
        this.f71962c = komponentScope;
        this.f71963d = pagerState;
        this.f71964e = list;
        this.f71965f = c5500e;
        this.f71960a = unit;
    }

    public final Object getContentType() {
        return Reflection.getOrCreateKotlinClass(C5499d.class);
    }

    public final Object getKey() {
        return this.f71962c.getKey();
    }

    public final Object getState() {
        return this.f71960a;
    }

    @Composable
    public final void invoke(Modifier modifier, Composer composer, int i7) {
        composer.startReplaceGroup(1906618612);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1906618612, i7, -1, "kntr.common.komponent.setContent.<no name provided>.invoke (Komponent.kt:78)");
        }
        this.f71961b.ProvideCompositionLocals(ComposableLambdaKt.rememberComposableLambda(1461546774, true, new a(modifier, this.f71963d, this.f71964e, this.f71965f), composer, 54), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }
}
