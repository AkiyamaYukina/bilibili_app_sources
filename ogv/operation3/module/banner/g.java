package com.bilibili.ogv.operation3.module.banner;

import androidx.compose.foundation.interaction.DragInteractionKt;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kntr.common.komponent.KomponentScope;
import kntr.common.komponent.UiComposableLike;
import kntr.common.trio.vertex.VertexContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/banner/g.class */
public final class g implements UiComposableLike {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unit f71141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VertexContext f71142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KomponentScope f71143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PagerState f71144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f71145e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f71146f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/banner/g$a.class */
    public static final class a implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Modifier f71147a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PagerState f71148b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f71149c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f71150d;

        public a(int i7, PagerState pagerState, Modifier modifier, List list) {
            this.f71147a = modifier;
            this.f71148b = pagerState;
            this.f71149c = list;
            this.f71150d = i7;
        }

        public final Object invoke(Object obj, Object obj2) {
            Composer composer = (Composer) obj;
            int iIntValue = ((Number) obj2).intValue();
            if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1461546774, iIntValue, -1, "kntr.common.komponent.setContent.<no name provided>.invoke.<anonymous> (Komponent.kt:79)");
                }
                composer.startReplaceGroup(-1551484455);
                BoxWithConstraintsKt.BoxWithConstraints(PaddingKt.m1346paddingqDBjuR0$default(this.f71147a, 0.0f, Dp.m3880constructorimpl(12), 0.0f, Dp.m3880constructorimpl(4), 5, null), null, false, ComposableLambdaKt.rememberComposableLambda(499428171, true, new e(this.f71149c, !DragInteractionKt.collectIsDraggedAsState(r0.getInteractionSource(), composer, 0).getValue().booleanValue(), this.f71148b, this.f71150d), composer, 54), composer, 3072, 6);
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

    public g(Unit unit, VertexContext vertexContext, KomponentScope komponentScope, PagerState pagerState, List list, int i7) {
        this.f71142b = vertexContext;
        this.f71143c = komponentScope;
        this.f71144d = pagerState;
        this.f71145e = list;
        this.f71146f = i7;
        this.f71141a = unit;
    }

    public final Object getContentType() {
        return Reflection.getOrCreateKotlinClass(g.class);
    }

    public final Object getKey() {
        return this.f71143c.getKey();
    }

    public final Object getState() {
        return this.f71141a;
    }

    @Composable
    public final void invoke(Modifier modifier, Composer composer, int i7) {
        composer.startReplaceGroup(1906618612);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1906618612, i7, -1, "kntr.common.komponent.setContent.<no name provided>.invoke (Komponent.kt:78)");
        }
        this.f71142b.ProvideCompositionLocals(ComposableLambdaKt.rememberComposableLambda(1461546774, true, new a(this.f71146f, this.f71144d, modifier, this.f71145e), composer, 54), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }
}
