package com.bilibili.ogv.secondary;

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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/C.class */
public final class C implements UiComposableLike {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unit f72597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VertexContext f72598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KomponentScope f72599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final UiComposableLike f72600d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/C$a.class */
    public static final class a implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Modifier f72601a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final UiComposableLike f72602b;

        public a(Modifier modifier, UiComposableLike uiComposableLike) {
            this.f72601a = modifier;
            this.f72602b = uiComposableLike;
        }

        public final Object invoke(Object obj, Object obj2) {
            Composer composer = (Composer) obj;
            int iIntValue = ((Number) obj2).intValue();
            if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1461546774, iIntValue, -1, "kntr.common.komponent.setContent.<no name provided>.invoke.<anonymous> (Komponent.kt:79)");
                }
                composer.startReplaceGroup(642373235);
                BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(-1883630218, true, new B(this.f72601a, this.f72602b), composer, 54), composer, 384, 3);
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

    public C(Unit unit, VertexContext vertexContext, KomponentScope komponentScope, UiComposableLike uiComposableLike) {
        this.f72598b = vertexContext;
        this.f72599c = komponentScope;
        this.f72600d = uiComposableLike;
        this.f72597a = unit;
    }

    public final Object getContentType() {
        return Reflection.getOrCreateKotlinClass(C.class);
    }

    public final Object getKey() {
        return this.f72599c.getKey();
    }

    public final Object getState() {
        return this.f72597a;
    }

    @Composable
    public final void invoke(Modifier modifier, Composer composer, int i7) {
        composer.startReplaceGroup(1906618612);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1906618612, i7, -1, "kntr.common.komponent.setContent.<no name provided>.invoke (Komponent.kt:78)");
        }
        this.f72598b.ProvideCompositionLocals(ComposableLambdaKt.rememberComposableLambda(1461546774, true, new a(modifier, this.f72600d), composer, 54), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }
}
