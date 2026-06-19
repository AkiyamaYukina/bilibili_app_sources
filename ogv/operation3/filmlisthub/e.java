package com.bilibili.ogv.operation3.filmlisthub;

import Di0.C1602f;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.TopAppBarDefaults;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import com.bilibili.compose.theme.BiliTheme;
import kntr.common.komponent.KomponentScope;
import kntr.common.komponent.UiComposableLike;
import kntr.common.trio.vertex.VertexContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.compose.resources.StringResource;
import org.jetbrains.compose.resources.StringResourcesKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/filmlisthub/e.class */
public final class e implements UiComposableLike {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unit f71100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VertexContext f71101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KomponentScope f71102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final State f71103d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/filmlisthub/e$a.class */
    public static final class a implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Modifier f71104a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final State f71105b;

        public a(Modifier modifier, State state) {
            this.f71104a = modifier;
            this.f71105b = state;
        }

        public final Object invoke(Object obj, Object obj2) {
            Composer composer = (Composer) obj;
            int iIntValue = ((Number) obj2).intValue();
            if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1461546774, iIntValue, -1, "kntr.common.komponent.setContent.<no name provided>.invoke.<anonymous> (Komponent.kt:79)");
                }
                composer.startReplaceGroup(1253347658);
                Modifier modifierM1169backgroundbw27NRU$default = BackgroundKt.m1169backgroundbw27NRU$default(this.f71104a, BiliTheme.INSTANCE.getColors(composer, BiliTheme.$stable).getBg1-0d7_KjU(), null, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
                int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM1169backgroundbw27NRU$default);
                ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                if (composer.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                Composer composerM2296constructorimpl = Updater.m2296constructorimpl(composer);
                O4.d.c(companion, composerM2296constructorimpl, measurePolicyColumnMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
                Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                String strStringResource = StringResourcesKt.stringResource((StringResource) O3.a.f17707f.getValue(), composer, 0);
                Modifier.Companion companion2 = Modifier.Companion;
                Xk0.b.a(0, composer, WindowInsetsPaddingKt.windowInsetsPadding(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), TopAppBarDefaults.INSTANCE.getWindowInsets(composer, TopAppBarDefaults.$stable)), strStringResource);
                ((UiComposableLike) this.f71105b.getValue()).invoke(WindowInsetsPadding_androidKt.navigationBarsPadding(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null)), composer, 0);
                composer.endNode();
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

    public e(Unit unit, VertexContext vertexContext, KomponentScope komponentScope, State state) {
        this.f71101b = vertexContext;
        this.f71102c = komponentScope;
        this.f71103d = state;
        this.f71100a = unit;
    }

    public final Object getContentType() {
        return Reflection.getOrCreateKotlinClass(e.class);
    }

    public final Object getKey() {
        return this.f71102c.getKey();
    }

    public final Object getState() {
        return this.f71100a;
    }

    @Composable
    public final void invoke(Modifier modifier, Composer composer, int i7) {
        composer.startReplaceGroup(1906618612);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1906618612, i7, -1, "kntr.common.komponent.setContent.<no name provided>.invoke (Komponent.kt:78)");
        }
        this.f71101b.ProvideCompositionLocals(ComposableLambdaKt.rememberComposableLambda(1461546774, true, new a(modifier, this.f71103d), composer, 54), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }
}
