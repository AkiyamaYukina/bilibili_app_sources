package com.bilibili.ogv.rank;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.bilibili.compose.theme.BiliThemeKt;
import com.bilibili.compose.theme.ThemeStrategy;
import kntr.common.komponent.KomponentScope;
import kntr.common.komponent.UiComposableLike;
import kntr.common.trio.vertex.VertexContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/S.class */
public final class S implements UiComposableLike {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unit f71887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VertexContext f71888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KomponentScope f71889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final UiComposableLike f71890d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/S$a.class */
    public static final class a implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Modifier f71891a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final UiComposableLike f71892b;

        public a(Modifier modifier, UiComposableLike uiComposableLike) {
            this.f71891a = modifier;
            this.f71892b = uiComposableLike;
        }

        public final Object invoke(Object obj, Object obj2) {
            Composer composer = (Composer) obj;
            int iIntValue = ((Number) obj2).intValue();
            if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1461546774, iIntValue, -1, "kntr.common.komponent.setContent.<no name provided>.invoke.<anonymous> (Komponent.kt:79)");
                }
                composer.startReplaceGroup(413433607);
                BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(-1197810296, true, new Q(this.f71891a, this.f71892b), composer, 54), composer, 384, 3);
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

    public S(Unit unit, VertexContext vertexContext, KomponentScope komponentScope, UiComposableLike uiComposableLike) {
        this.f71888b = vertexContext;
        this.f71889c = komponentScope;
        this.f71890d = uiComposableLike;
        this.f71887a = unit;
    }

    public final Object getContentType() {
        return Reflection.getOrCreateKotlinClass(S.class);
    }

    public final Object getKey() {
        return this.f71889c.getKey();
    }

    public final Object getState() {
        return this.f71887a;
    }

    @Composable
    public final void invoke(Modifier modifier, Composer composer, int i7) {
        composer.startReplaceGroup(1906618612);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1906618612, i7, -1, "kntr.common.komponent.setContent.<no name provided>.invoke (Komponent.kt:78)");
        }
        this.f71888b.ProvideCompositionLocals(ComposableLambdaKt.rememberComposableLambda(1461546774, true, new a(modifier, this.f71890d), composer, 54), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }
}
