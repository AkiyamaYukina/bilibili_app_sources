package com.bilibili.ship.theseus.cheese.player.layer;

import Di0.C1602f;
import android.content.Context;
import android.view.View;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.compose.HorizontalAnchorable;
import androidx.constraintlayout.compose.VerticalAnchorable;
import com.bilibili.compose.theme.BiliThemeKt;
import com.bilibili.compose.theme.ThemeStrategy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/layer/CheesePayLayerComposeViewKt.class */
public final class CheesePayLayerComposeViewKt {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/layer/CheesePayLayerComposeViewKt$a.class */
    public static final class a implements Function1<ConstrainScope, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f90612a = new Object();

        public final Object invoke(Object obj) {
            ConstrainScope constrainScope = (ConstrainScope) obj;
            HorizontalAnchorable top = constrainScope.getTop();
            ConstraintLayoutBaseScope.HorizontalAnchor top2 = constrainScope.getParent().getTop();
            float f7 = 16;
            HorizontalAnchorable.DefaultImpls.m4198linkToVpY3zN4$default(top, top2, Dp.m3880constructorimpl(f7), 0.0f, 4, null);
            VerticalAnchorable.DefaultImpls.m4207linkToVpY3zN4$default(constrainScope.getStart(), constrainScope.getParent().getStart(), Dp.m3880constructorimpl(f7), 0.0f, 4, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/layer/CheesePayLayerComposeViewKt$b.class */
    public static final class b implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.bilibili.ship.theseus.cheese.player.layer.e f90613a;

        public b(com.bilibili.ship.theseus.cheese.player.layer.e eVar) {
            this.f90613a = eVar;
        }

        public final Object invoke() {
            this.f90613a.f90633g.invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/layer/CheesePayLayerComposeViewKt$c.class */
    public static final class c implements Function1<ConstrainScope, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f90614a = new Object();

        public final Object invoke(Object obj) {
            ConstrainScope constrainScope = (ConstrainScope) obj;
            HorizontalAnchorable.DefaultImpls.m4198linkToVpY3zN4$default(constrainScope.getTop(), constrainScope.getParent().getTop(), 0.0f, 0.0f, 6, null);
            HorizontalAnchorable.DefaultImpls.m4198linkToVpY3zN4$default(constrainScope.getBottom(), constrainScope.getParent().getBottom(), 0.0f, 0.0f, 6, null);
            VerticalAnchorable.DefaultImpls.m4207linkToVpY3zN4$default(constrainScope.getStart(), constrainScope.getParent().getStart(), 0.0f, 0.0f, 6, null);
            VerticalAnchorable.DefaultImpls.m4207linkToVpY3zN4$default(constrainScope.getEnd(), constrainScope.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/layer/CheesePayLayerComposeViewKt$d.class */
    public static final class d implements Function1<ConstrainScope, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ConstrainedLayoutReference f90615a;

        public d(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f90615a = constrainedLayoutReference;
        }

        public final Object invoke(Object obj) {
            ConstrainScope constrainScope = (ConstrainScope) obj;
            HorizontalAnchorable.DefaultImpls.m4198linkToVpY3zN4$default(constrainScope.getTop(), constrainScope.getParent().getTop(), 0.0f, 0.0f, 6, null);
            HorizontalAnchorable.DefaultImpls.m4198linkToVpY3zN4$default(constrainScope.getBottom(), this.f90615a.getTop(), 0.0f, 0.0f, 6, null);
            VerticalAnchorable.DefaultImpls.m4207linkToVpY3zN4$default(constrainScope.getStart(), constrainScope.getParent().getStart(), 0.0f, 0.0f, 6, null);
            VerticalAnchorable.DefaultImpls.m4207linkToVpY3zN4$default(constrainScope.getEnd(), constrainScope.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/layer/CheesePayLayerComposeViewKt$e.class */
    public static final class e implements Function1<ConstrainScope, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ConstrainedLayoutReference f90616a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ConstrainedLayoutReference f90617b;

        public e(ConstrainedLayoutReference constrainedLayoutReference, ConstrainedLayoutReference constrainedLayoutReference2) {
            this.f90616a = constrainedLayoutReference;
            this.f90617b = constrainedLayoutReference2;
        }

        public final Object invoke(Object obj) {
            ConstrainScope constrainScope = (ConstrainScope) obj;
            HorizontalAnchorable top = constrainScope.getTop();
            ConstrainedLayoutReference constrainedLayoutReference = this.f90616a;
            HorizontalAnchorable.DefaultImpls.m4198linkToVpY3zN4$default(top, constrainedLayoutReference.getBottom(), Dp.m3880constructorimpl(4), 0.0f, 4, null);
            HorizontalAnchorable.DefaultImpls.m4198linkToVpY3zN4$default(constrainScope.getBottom(), this.f90617b.getTop(), 0.0f, 0.0f, 6, null);
            VerticalAnchorable.DefaultImpls.m4207linkToVpY3zN4$default(constrainScope.getStart(), constrainedLayoutReference.getStart(), 0.0f, 0.0f, 6, null);
            VerticalAnchorable.DefaultImpls.m4207linkToVpY3zN4$default(constrainScope.getEnd(), constrainedLayoutReference.getEnd(), 0.0f, 0.0f, 6, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/layer/CheesePayLayerComposeViewKt$f.class */
    public static final class f implements Function1<ConstrainScope, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ConstrainedLayoutReference f90618a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ConstrainedLayoutReference f90619b;

        public f(ConstrainedLayoutReference constrainedLayoutReference, ConstrainedLayoutReference constrainedLayoutReference2) {
            this.f90618a = constrainedLayoutReference;
            this.f90619b = constrainedLayoutReference2;
        }

        public final Object invoke(Object obj) {
            ConstrainScope constrainScope = (ConstrainScope) obj;
            HorizontalAnchorable.DefaultImpls.m4198linkToVpY3zN4$default(constrainScope.getTop(), this.f90618a.getBottom(), Dp.m3880constructorimpl(16), 0.0f, 4, null);
            HorizontalAnchorable.DefaultImpls.m4198linkToVpY3zN4$default(constrainScope.getBottom(), constrainScope.getParent().getBottom(), 0.0f, 0.0f, 6, null);
            VerticalAnchorable start = constrainScope.getStart();
            ConstrainedLayoutReference constrainedLayoutReference = this.f90619b;
            VerticalAnchorable.DefaultImpls.m4207linkToVpY3zN4$default(start, constrainedLayoutReference.getStart(), 0.0f, 0.0f, 6, null);
            VerticalAnchorable.DefaultImpls.m4207linkToVpY3zN4$default(constrainScope.getEnd(), constrainedLayoutReference.getEnd(), 0.0f, 0.0f, 6, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/layer/CheesePayLayerComposeViewKt$g.class */
    public static final class g implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.bilibili.ship.theseus.cheese.player.layer.e f90620a;

        public g(com.bilibili.ship.theseus.cheese.player.layer.e eVar) {
            this.f90620a = eVar;
        }

        public final Object invoke() {
            this.f90620a.f90632f.invoke();
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(final Function1<? super Context, ? extends View> function1, Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(712844427);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(function1) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 3) != 2, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(712844427, i8, -1, "com.bilibili.ship.theseus.cheese.player.layer.CheesePayBackgroundBlur (CheesePayLayerComposeView.kt:167)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2296constructorimpl = Updater.m2296constructorimpl(composerStartRestartGroup);
            O4.d.c(companion2, composerM2296constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            c(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), function1, composerStartRestartGroup, ((i8 << 3) & 112) | 6);
            SpacerKt.Spacer(BackgroundKt.m1169backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), ColorKt.Color(2566914048L), null, 2, null), composerStartRestartGroup, 6);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(i7, function1) { // from class: com.bilibili.ship.theseus.cheese.player.layer.d

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FunctionReferenceImpl f90625a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f90626b;

                {
                    this.f90625a = (FunctionReferenceImpl) function1;
                    this.f90626b = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f90626b | 1);
                    CheesePayLayerComposeViewKt.a(this.f90625a, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void b(@NotNull final com.bilibili.ship.theseus.cheese.player.layer.e eVar, @Nullable Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1007610452);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(eVar) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 3) != 2, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1007610452, i8, -1, "com.bilibili.ship.theseus.cheese.player.layer.CheesePayLayerView (CheesePayLayerComposeView.kt:39)");
            }
            BiliThemeKt.BiliTheme(ThemeStrategy.FollowApp, false, ComposableLambdaKt.rememberComposableLambda(-1041555612, true, new Xr0.g(eVar, 2), composerStartRestartGroup, 54), composerStartRestartGroup, 390, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(eVar, i7) { // from class: com.bilibili.ship.theseus.cheese.player.layer.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final e f90623a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f90624b;

                {
                    this.f90623a = eVar;
                    this.f90624b = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f90624b | 1);
                    CheesePayLayerComposeViewKt.b(this.f90623a, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void c(Modifier modifier, Function1 function1, Composer composer, int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1332139235);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changedInstance(function1) ? 32 : 16);
        }
        if (composerStartRestartGroup.shouldExecute((i9 & 19) != 18, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1332139235, i9, -1, "com.bilibili.ship.theseus.cheese.player.layer.CoverBlurView (CheesePayLayerComposeView.kt:210)");
            }
            AndroidView_androidKt.AndroidView(function1, modifier, null, composerStartRestartGroup, ((i9 >> 3) & 14) | ((i9 << 3) & 112), 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new b01.d(i7, modifier, function1));
        }
    }
}
