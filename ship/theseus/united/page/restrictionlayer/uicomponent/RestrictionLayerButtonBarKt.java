package com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent;

import Di0.C1602f;
import androidx.compose.animation.C3353d;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.compose.C4551h;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintLayoutKt;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.HorizontalAnchorable;
import androidx.constraintlayout.compose.Measurer;
import androidx.constraintlayout.compose.ToolingUtilsKt;
import androidx.constraintlayout.compose.VerticalAnchorable;
import com.bilibili.ship.theseus.united.page.restrictionlayer.C6378c;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/uicomponent/RestrictionLayerButtonBarKt.class */
public final class RestrictionLayerButtonBarKt {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/uicomponent/RestrictionLayerButtonBarKt$a.class */
    public static final class a implements Function1<ConstrainScope, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f102818a = new Object();

        public final Object invoke(Object obj) {
            ConstrainScope constrainScope = (ConstrainScope) obj;
            HorizontalAnchorable.DefaultImpls.m4198linkToVpY3zN4$default(constrainScope.getTop(), constrainScope.getParent().getTop(), Dp.m3880constructorimpl(9), 0.0f, 4, null);
            VerticalAnchorable.DefaultImpls.m4207linkToVpY3zN4$default(constrainScope.getStart(), constrainScope.getParent().getStart(), 0.0f, 0.0f, 6, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/uicomponent/RestrictionLayerButtonBarKt$b.class */
    public static final class b implements Function1<ConstrainScope, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ConstrainedLayoutReference f102819a;

        public b(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f102819a = constrainedLayoutReference;
        }

        public final Object invoke(Object obj) {
            ConstrainScope constrainScope = (ConstrainScope) obj;
            VerticalAnchorable.DefaultImpls.m4207linkToVpY3zN4$default(constrainScope.getEnd(), this.f102819a.getEnd(), 0.0f, 0.0f, 6, null);
            HorizontalAnchorable.DefaultImpls.m4198linkToVpY3zN4$default(constrainScope.getTop(), constrainScope.getParent().getTop(), 0.0f, 0.0f, 6, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/uicomponent/RestrictionLayerButtonBarKt$c.class */
    public static final class c implements Function1<ConstrainScope, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ConstrainedLayoutReference f102820a;

        public c(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f102820a = constrainedLayoutReference;
        }

        public final Object invoke(Object obj) {
            ConstrainScope constrainScope = (ConstrainScope) obj;
            VerticalAnchorable start = constrainScope.getStart();
            ConstrainedLayoutReference constrainedLayoutReference = this.f102820a;
            VerticalAnchorable.DefaultImpls.m4207linkToVpY3zN4$default(start, constrainedLayoutReference.getEnd(), Dp.m3880constructorimpl(4), 0.0f, 4, null);
            VerticalAnchorable.DefaultImpls.m4207linkToVpY3zN4$default(constrainScope.getEnd(), constrainScope.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            HorizontalAnchorable.DefaultImpls.m4198linkToVpY3zN4$default(constrainScope.getTop(), constrainedLayoutReference.getTop(), 0.0f, 0.0f, 6, null);
            HorizontalAnchorable.DefaultImpls.m4198linkToVpY3zN4$default(constrainScope.getBottom(), constrainedLayoutReference.getBottom(), 0.0f, 0.0f, 6, null);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(@NotNull final List<C6378c> list, final float f7, @Nullable Modifier modifier, @Nullable Composer composer, final int i7, final int i8) {
        int i9;
        Composer composerStartRestartGroup = composer.startRestartGroup(-501340835);
        int i10 = (i7 & 6) == 0 ? (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i7 : i7;
        int i11 = i10;
        if ((i7 & 48) == 0) {
            i11 = i10 | (composerStartRestartGroup.changed(f7) ? 32 : 16);
        }
        int i12 = i8 & 4;
        if (i12 != 0) {
            i9 = i11 | 384;
        } else {
            i9 = i11;
            if ((i7 & 384) == 0) {
                i9 = i11 | (composerStartRestartGroup.changed(modifier) ? 256 : 128);
            }
        }
        if (composerStartRestartGroup.shouldExecute((i9 & 147) != 146, i9 & 1)) {
            if (i12 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-501340835, i9, -1, "com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.RestrictionLayerButtonBar (RestrictionLayerButtonBar.kt:24)");
            }
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m1302spacedBy0680j_4(Dp.m3880constructorimpl(8)), Alignment.Companion.getTop(), composerStartRestartGroup, 6);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            O4.d.c(companion, composerM2296constructorimpl, measurePolicyRowMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-423950630);
            int i13 = 0;
            for (Object obj : list) {
                if (i13 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                final C6378c c6378c = (C6378c) obj;
                Modifier modifierA = c6378c.f102727a.f102749a.a(SizeKt.wrapContentSize$default(Modifier.Companion, null, false, 3, null));
                composerStartRestartGroup.startReplaceableGroup(-270267587);
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                Composer.Companion companion2 = Composer.Companion;
                Object objA = objRememberedValue;
                if (objRememberedValue == companion2.getEmpty()) {
                    objA = Yb.a.a(composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                final Measurer measurer = (Measurer) objA;
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                Object objA2 = objRememberedValue2;
                if (objRememberedValue2 == companion2.getEmpty()) {
                    objA2 = C4551h.a(composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objA2;
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                Object objMutableStateOf$default = objRememberedValue3;
                if (objRememberedValue3 == companion2.getEmpty()) {
                    objMutableStateOf$default = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objMutableStateOf$default);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Pair<MeasurePolicy, Function0<Unit>> pairRememberConstraintLayoutMeasurePolicy = ConstraintLayoutKt.rememberConstraintLayoutMeasurePolicy(257, constraintLayoutScope, (MutableState<Boolean>) objMutableStateOf$default, measurer, composerStartRestartGroup, 4544);
                MeasurePolicy measurePolicy = (MeasurePolicy) pairRememberConstraintLayoutMeasurePolicy.component1();
                final Function0 function0 = (Function0) pairRememberConstraintLayoutMeasurePolicy.component2();
                final int i14 = 0;
                final int i15 = i13;
                LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifierA, false, new Function1<SemanticsPropertyReceiver, Unit>(measurer) { // from class: com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.RestrictionLayerButtonBarKt$RestrictionLayerButtonBar_uFdPcIQ$lambda$0$0$$inlined$ConstraintLayout$1
                    final Measurer $measurer;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                        this.$measurer = measurer;
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((SemanticsPropertyReceiver) obj2);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        ToolingUtilsKt.setDesignInfoProvider(semanticsPropertyReceiver, this.$measurer);
                    }
                }, 1, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894182, true, new Function2<Composer, Integer, Unit>(constraintLayoutScope, i14, function0, list, i15, c6378c, f7) { // from class: com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.RestrictionLayerButtonBarKt$RestrictionLayerButtonBar_uFdPcIQ$lambda$0$0$$inlined$ConstraintLayout$2
                    final int $$changed;
                    final float $buttonHeight$inlined;
                    final C6378c $buttonVm$inlined;
                    final List $buttonVmList$inlined;
                    final int $index$inlined;
                    final Function0 $onHelpersChanged;
                    final ConstraintLayoutScope $scope;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                        this.$scope = constraintLayoutScope;
                        this.$onHelpersChanged = function0;
                        this.$buttonVmList$inlined = list;
                        this.$index$inlined = i15;
                        this.$buttonVm$inlined = c6378c;
                        this.$buttonHeight$inlined = f7;
                        this.$$changed = i14;
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                        invoke((Composer) obj2, ((Number) obj3).intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:37:0x0207  */
                    /* JADX WARN: Removed duplicated region for block: B:48:0x02ed  */
                    @androidx.compose.runtime.Composable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void invoke(@org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r37, int r38) {
                        /*
                            Method dump skipped, instruction units count: 877
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.RestrictionLayerButtonBarKt$RestrictionLayerButtonBar_uFdPcIQ$lambda$0$0$$inlined$ConstraintLayout$2.invoke(androidx.compose.runtime.Composer, int):void");
                    }
                }), measurePolicy, composerStartRestartGroup, 48, 0);
                composerStartRestartGroup.endReplaceableGroup();
                i13++;
            }
            if (C3353d.c(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = modifier;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(list, f7, modifier2, i7, i8) { // from class: com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.z

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final List f102915a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final float f102916b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Modifier f102917c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final int f102918d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final int f102919e;

                {
                    this.f102915a = list;
                    this.f102916b = f7;
                    this.f102917c = modifier2;
                    this.f102918d = i7;
                    this.f102919e = i8;
                }

                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f102918d | 1);
                    Modifier modifier3 = this.f102917c;
                    int i16 = this.f102919e;
                    RestrictionLayerButtonBarKt.a(this.f102915a, this.f102916b, modifier3, (Composer) obj2, iUpdateChangedFlags, i16);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
