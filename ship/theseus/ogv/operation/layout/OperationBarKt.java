package com.bilibili.ship.theseus.ogv.operation.layout;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.B0;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.compose.C;
import androidx.constraintlayout.compose.C4550g;
import androidx.constraintlayout.compose.ConstraintLayoutKt;
import androidx.constraintlayout.compose.Measurer;
import androidx.constraintlayout.compose.ToolingUtilsKt;
import androidx.constraintlayout.compose.l;
import androidx.constraintlayout.compose.o;
import androidx.constraintlayout.compose.v;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.H;
import com.bilibili.ship.theseus.ogv.operation.OperationActivityVo;
import com.bilibili.ship.theseus.ogv.operation.UIStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/operation/layout/OperationBarKt.class */
public final class OperationBarKt {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/operation/layout/OperationBarKt$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f94122a;

        static {
            int[] iArr = new int[UIStyle.values().length];
            try {
                iArr[UIStyle.BAR_ICON.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[UIStyle.BAR_COUNT_DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            f94122a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(@NotNull final e eVar, @Nullable Composer composer, int i7) {
        int i8;
        String showEventId;
        Composer composerStartRestartGroup = composer.startRestartGroup(614635104);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(eVar) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 3) != 2, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(614635104, i8, -1, "com.bilibili.ship.theseus.ogv.operation.layout.OperationBarI (OperationBar.kt:77)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            Object b02 = objRememberedValue;
            if (objRememberedValue == companion.getEmpty()) {
                b02 = new B0(1);
                composerStartRestartGroup.updateRememberedValue(b02);
            }
            l lVarConstraintSet = ConstraintLayoutKt.ConstraintSet((Function1<? super o, Unit>) b02);
            MutableState mutableState = eVar.f94132d;
            OperationActivityVo operationActivityVo = (OperationActivityVo) mutableState.getValue();
            if (operationActivityVo == null || (showEventId = operationActivityVo.getShowEventId()) == null || showEventId.length() == 0) {
                operationActivityVo = null;
            }
            if (operationActivityVo == null) {
                composerStartRestartGroup.startReplaceGroup(1150422306);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1150422307);
                String showEventId2 = operationActivityVo.getShowEventId();
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                Object objMutableStateOf$default = objRememberedValue2;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objMutableStateOf$default = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objMutableStateOf$default);
                }
                MutableState mutableState2 = (MutableState) objMutableStateOf$default;
                composerStartRestartGroup.startReplaceGroup(978367550);
                composerStartRestartGroup.endReplaceGroup();
                if (ZW.a.a(mutableState2)) {
                    composerStartRestartGroup.startReplaceGroup(978514366);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(978392319);
                    Boolean bool = (Boolean) mutableState2.getValue();
                    bool.getClass();
                    EffectsKt.LaunchedEffect(showEventId2, bool, new OperationBarKt$OperationBarI$lambda$2$$inlined$ReportOnExposure$1(showEventId2, mutableState2, null, eVar, operationActivityVo), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
                Unit unit = Unit.INSTANCE;
                composerStartRestartGroup.endReplaceGroup();
            }
            final OperationActivityVo operationActivityVo2 = (OperationActivityVo) mutableState.getValue();
            if (operationActivityVo2 != null) {
                composerStartRestartGroup.startReplaceGroup(1150837118);
                Modifier.Companion companion2 = Modifier.Companion;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m1344paddingVpY3zN4$default(companion2, Dp.m3880constructorimpl(12), 0.0f, 2, null), 0.0f, 1, null);
                int i9 = a.f94122a[operationActivityVo2.f94062b.ordinal()];
                Modifier modifierA = H.a(8, SizeKt.m1358height3ABfNKs(modifierFillMaxWidth$default, i9 != 1 ? i9 != 2 ? Dp.m3880constructorimpl(60) : Dp.m3880constructorimpl(60) : Dp.m3880constructorimpl(70)), ColorKt.Color(3845075512L));
                final ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(152554731, true, new Function2(operationActivityVo2, eVar) { // from class: com.bilibili.ship.theseus.ogv.operation.layout.a

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final OperationActivityVo f94123a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final e f94124b;

                    {
                        this.f94123a = operationActivityVo2;
                        this.f94124b = eVar;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:180:0x08f3  */
                    /* JADX WARN: Removed duplicated region for block: B:189:0x09bb  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object invoke(java.lang.Object r27, java.lang.Object r28) {
                        /*
                            Method dump skipped, instruction units count: 2593
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.operation.layout.a.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                }, composerStartRestartGroup, 54);
                composerStartRestartGroup.startReplaceableGroup(-270262697);
                AnimationSpecKt.tween$default(0, 0, null, 7, null);
                Object objA = C4550g.a(-270260906, composerStartRestartGroup, -3687241);
                Object objMutableStateOf$default2 = objA;
                if (objA == companion.getEmpty()) {
                    objMutableStateOf$default2 = SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objMutableStateOf$default2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                MutableState<Long> mutableState3 = (MutableState) objMutableStateOf$default2;
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                Object objA2 = objRememberedValue3;
                if (objRememberedValue3 == companion.getEmpty()) {
                    objA2 = Yb.a.a(composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                final Measurer measurer = (Measurer) objA2;
                MeasurePolicy measurePolicyRememberConstraintLayoutMeasurePolicy = ConstraintLayoutKt.rememberConstraintLayoutMeasurePolicy(257, mutableState3, lVarConstraintSet, measurer, composerStartRestartGroup, 4144);
                if (lVarConstraintSet instanceof v) {
                    ((v) lVarConstraintSet).f46014a = mutableState3;
                }
                measurer.addLayoutInformationReceiver(lVarConstraintSet instanceof C ? (C) lVarConstraintSet : null);
                float forcedScaleFactor = measurer.getForcedScaleFactor();
                if (Float.isNaN(forcedScaleFactor)) {
                    composerStartRestartGroup.startReplaceableGroup(-270259702);
                    final int i10 = 1572864;
                    LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifierA, false, new Function1<SemanticsPropertyReceiver, Unit>(measurer) { // from class: com.bilibili.ship.theseus.ogv.operation.layout.OperationBarKt$OperationBarI$$inlined$ConstraintLayout$9
                        final Measurer $measurer;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                            this.$measurer = measurer;
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((SemanticsPropertyReceiver) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            ToolingUtilsKt.setDesignInfoProvider(semanticsPropertyReceiver, this.$measurer);
                        }
                    }, 1, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819901122, true, new Function2<Composer, Integer, Unit>(measurer, composableLambdaRememberComposableLambda, i10) { // from class: com.bilibili.ship.theseus.ogv.operation.layout.OperationBarKt$OperationBarI$$inlined$ConstraintLayout$10
                        final int $$changed;
                        final Function2 $content;
                        final Measurer $measurer;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                            this.$measurer = measurer;
                            this.$content = composableLambdaRememberComposableLambda;
                            this.$$changed = i10;
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i11) {
                            if (((i11 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                            } else {
                                this.$measurer.createDesignElements(composer2, 8);
                                this.$content.invoke(composer2, Integer.valueOf((this.$$changed >> 18) & 14));
                            }
                        }
                    }), measurePolicyRememberConstraintLayoutMeasurePolicy, composerStartRestartGroup, 48, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-270260292);
                    Modifier modifierScale = ScaleKt.scale(modifierA, measurer.getForcedScaleFactor());
                    composerStartRestartGroup.startReplaceableGroup(-1990474327);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1376089335);
                    Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(companion2);
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM2296constructorimpl = Updater.m2296constructorimpl(composerStartRestartGroup);
                    Updater.m2304setimpl(composerM2296constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m2304setimpl(composerM2296constructorimpl, density, companion3.getSetDensity());
                    Updater.m2304setimpl(composerM2296constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf.invoke(SkippableUpdater.m2287boximpl(SkippableUpdater.m2288constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    composerStartRestartGroup.startReplaceableGroup(-1253629305);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    final int i11 = 1572864;
                    LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifierScale, false, new Function1<SemanticsPropertyReceiver, Unit>(measurer) { // from class: com.bilibili.ship.theseus.ogv.operation.layout.OperationBarKt$OperationBarI$$inlined$ConstraintLayout$7
                        final Measurer $measurer;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                            this.$measurer = measurer;
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((SemanticsPropertyReceiver) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            ToolingUtilsKt.setDesignInfoProvider(semanticsPropertyReceiver, this.$measurer);
                        }
                    }, 1, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819900598, true, new Function2<Composer, Integer, Unit>(measurer, composableLambdaRememberComposableLambda, i11) { // from class: com.bilibili.ship.theseus.ogv.operation.layout.OperationBarKt$OperationBarI$$inlined$ConstraintLayout$8
                        final int $$changed;
                        final Function2 $content;
                        final Measurer $measurer;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                            this.$measurer = measurer;
                            this.$content = composableLambdaRememberComposableLambda;
                            this.$$changed = i11;
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i12) {
                            if (((i12 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                            } else {
                                this.$measurer.createDesignElements(composer2, 8);
                                this.$content.invoke(composer2, Integer.valueOf((this.$$changed >> 18) & 14));
                            }
                        }
                    }), measurePolicyRememberConstraintLayoutMeasurePolicy, composerStartRestartGroup, 48, 0);
                    measurer.drawDebugBounds(boxScopeInstance, forcedScaleFactor, composerStartRestartGroup, 518);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1156068802);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new NR.l(eVar, i7, 1));
        }
    }
}
