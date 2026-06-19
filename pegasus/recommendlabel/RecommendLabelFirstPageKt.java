package com.bilibili.pegasus.recommendlabel;

import Di0.C1602f;
import android.content.Context;
import androidx.activity.OnBackPressedDispatcher;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ButtonColors;
import androidx.compose.material.ButtonDefaults;
import androidx.compose.material.ButtonElevation;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.TextKt;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AbstractC4464g0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.constraintlayout.compose.C4550g;
import androidx.constraintlayout.compose.C4551h;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintLayoutKt;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.Dimension;
import androidx.constraintlayout.compose.HorizontalAnchorable;
import androidx.constraintlayout.compose.Measurer;
import androidx.constraintlayout.compose.ToolingUtilsKt;
import androidx.constraintlayout.compose.VerticalAnchorable;
import com.alipay.alipaysecuritysdk.common.config.Constant;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.compose.image.BiliImageKt;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.compose.theme.ThemeDayNight;
import com.bilibili.lib.image2.BiliImageLoaderHelper;
import com.bilibili.pegasus.recommendlabel.data.Label;
import com.bilibili.pegasus.recommendlabel.data.UinterestPageMaterial;
import java.util.List;
import kotlin.Function;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/RecommendLabelFirstPageKt.class */
public final class RecommendLabelFirstPageKt {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/RecommendLabelFirstPageKt$a.class */
    public static final class a implements Function1<ConstrainScope, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f78642a = new Object();

        public final Object invoke(Object obj) {
            ConstrainScope constrainScope = (ConstrainScope) obj;
            HorizontalAnchorable.DefaultImpls.m4198linkToVpY3zN4$default(constrainScope.getTop(), constrainScope.getParent().getTop(), 0.0f, 0.0f, 6, null);
            VerticalAnchorable.DefaultImpls.m4207linkToVpY3zN4$default(constrainScope.getStart(), constrainScope.getParent().getStart(), 0.0f, 0.0f, 6, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/RecommendLabelFirstPageKt$b.class */
    public static final class b implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OnBackPressedDispatcher f78643a;

        public b(OnBackPressedDispatcher onBackPressedDispatcher) {
            this.f78643a = onBackPressedDispatcher;
        }

        public final Object invoke() {
            OnBackPressedDispatcher onBackPressedDispatcher = this.f78643a;
            if (onBackPressedDispatcher != null) {
                onBackPressedDispatcher.onBackPressed();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/RecommendLabelFirstPageKt$c.class */
    public static final class c implements Function1<ConstrainScope, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ConstrainedLayoutReference f78644a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ConstrainedLayoutReference f78645b;

        public c(ConstrainedLayoutReference constrainedLayoutReference, ConstrainedLayoutReference constrainedLayoutReference2) {
            this.f78644a = constrainedLayoutReference;
            this.f78645b = constrainedLayoutReference2;
        }

        public final Object invoke(Object obj) {
            ConstrainScope constrainScope = (ConstrainScope) obj;
            HorizontalAnchorable.DefaultImpls.m4198linkToVpY3zN4$default(constrainScope.getTop(), this.f78644a.getBottom(), 0.0f, 0.0f, 6, null);
            VerticalAnchorable.DefaultImpls.m4207linkToVpY3zN4$default(constrainScope.getEnd(), this.f78645b.getStart(), 0.0f, 0.0f, 6, null);
            VerticalAnchorable.DefaultImpls.m4207linkToVpY3zN4$default(constrainScope.getStart(), constrainScope.getParent().getStart(), 0.0f, 0.0f, 6, null);
            constrainScope.setWidth(Dimension.Companion.getFillToConstraints());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/RecommendLabelFirstPageKt$d.class */
    public static final class d implements Function1<ConstrainScope, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f78646a = new Object();

        public final Object invoke(Object obj) {
            ConstrainScope constrainScope = (ConstrainScope) obj;
            HorizontalAnchorable.DefaultImpls.m4198linkToVpY3zN4$default(constrainScope.getTop(), constrainScope.getParent().getTop(), 0.0f, 0.0f, 6, null);
            VerticalAnchorable.DefaultImpls.m4207linkToVpY3zN4$default(constrainScope.getEnd(), constrainScope.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/RecommendLabelFirstPageKt$e.class */
    public static final /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f78647a;

        static {
            int[] iArr = new int[RecommendLabelPageStatus.values().length];
            try {
                iArr[RecommendLabelPageStatus.FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[RecommendLabelPageStatus.Empty.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[RecommendLabelPageStatus.LoadedWithData.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f78647a = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0527  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final com.bilibili.pegasus.recommendlabel.f0 r26, final androidx.compose.material.I2 r27, final kotlin.jvm.functions.Function1 r28, androidx.compose.runtime.Composer r29, int r30) {
        /*
            Method dump skipped, instruction units count: 1769
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.recommendlabel.RecommendLabelFirstPageKt.a(com.bilibili.pegasus.recommendlabel.f0, androidx.compose.material.I2, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void b(final f0 f0Var, final Function0 function0, final Function0 function02, Composer composer, final int i7) {
        int i8;
        String editButtonText;
        String moreInterestButton;
        Composer composerStartRestartGroup = composer.startRestartGroup(387767673);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(f0Var) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changedInstance(function0) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changedInstance(function02) ? 256 : 128);
        }
        if (composerStartRestartGroup.shouldExecute((i10 & 147) != 146, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(387767673, i10, -1, "com.bilibili.pegasus.recommendlabel.EditButton (RecommendLabelFirstPage.kt:756)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            float f7 = 12;
            Modifier modifierM1345paddingqDBjuR0 = PaddingKt.m1345paddingqDBjuR0(modifierFillMaxWidth$default, Dp.m3880constructorimpl(f7), Dp.m3880constructorimpl(8), Dp.m3880constructorimpl(f7), Dp.m3880constructorimpl(16));
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m1302spacedBy0680j_4(Dp.m3880constructorimpl(f7)), Alignment.Companion.getCenterVertically(), composerStartRestartGroup, 54);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1345paddingqDBjuR0);
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
            O4.d.c(companion2, composerM2296constructorimpl, measurePolicyRowMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            UinterestPageMaterial uinterestPageMaterial = f0Var.f78708d;
            String strTakeIfNotBlank = (uinterestPageMaterial == null || (moreInterestButton = uinterestPageMaterial.getMoreInterestButton()) == null) ? null : ListExtentionsKt.takeIfNotBlank(moreInterestButton);
            if (strTakeIfNotBlank == null) {
                composerStartRestartGroup.startReplaceGroup(-2112294687);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-2112294686);
                Modifier modifierM1358height3ABfNKs = SizeKt.m1358height3ABfNKs(RowScope.weight$default(rowScopeInstance, companion, 0.5f, false, 2, null), Dp.m3880constructorimpl(44));
                BorderStroke borderStrokeM1178BorderStrokecXLIe8U = BorderStrokeKt.m1178BorderStrokecXLIe8U(Dp.m3880constructorimpl((float) 0.5d), BiliTheme.INSTANCE.getColors(composerStartRestartGroup, BiliTheme.$stable).getLine_bold-0d7_KjU());
                RoundedCornerShape roundedCornerShapeM1502RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1502RoundedCornerShape0680j_4(Dp.m3880constructorimpl(32));
                float f8 = 0;
                PaddingValues paddingValuesM1335PaddingValues0680j_4 = PaddingKt.m1335PaddingValues0680j_4(Dp.m3880constructorimpl(f8));
                ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
                long jM2664getTransparent0d7_KjU = Color.Companion.m2664getTransparent0d7_KjU();
                int i11 = ButtonDefaults.$stable;
                ButtonColors buttonColorsM1640buttonColorsro_MJ88 = buttonDefaults.m1640buttonColorsro_MJ88(jM2664getTransparent0d7_KjU, 0L, 0L, 0L, composerStartRestartGroup, (i11 << 12) | 6, 14);
                ButtonElevation buttonElevationM1641elevationR_JCAzs = buttonDefaults.m1641elevationR_JCAzs(Dp.m3880constructorimpl(f8), Dp.m3880constructorimpl(f8), 0.0f, Dp.m3880constructorimpl(f8), Dp.m3880constructorimpl(f8), composerStartRestartGroup, (i11 << 15) | 27702, 4);
                boolean z6 = (i10 & 112) == 32;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z6 || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new KS0.d(function0, 6);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                ButtonKt.Button((Function0) objRememberedValue, modifierM1358height3ABfNKs, false, null, buttonElevationM1641elevationR_JCAzs, roundedCornerShapeM1502RoundedCornerShape0680j_4, borderStrokeM1178BorderStrokecXLIe8U, buttonColorsM1640buttonColorsro_MJ88, paddingValuesM1335PaddingValues0680j_4, ComposableLambdaKt.rememberComposableLambda(-1362808849, true, new com.bilibili.bililive.room.ui.roomv3.control.i(strTakeIfNotBlank, 1), composerStartRestartGroup, 54), composerStartRestartGroup, 905969664, 12);
                composerStartRestartGroup.endReplaceGroup();
            }
            UinterestPageMaterial uinterestPageMaterial2 = f0Var.f78708d;
            String strTakeIfNotBlank2 = (uinterestPageMaterial2 == null || (editButtonText = uinterestPageMaterial2.getEditButtonText()) == null) ? null : ListExtentionsKt.takeIfNotBlank(editButtonText);
            if (strTakeIfNotBlank2 == null) {
                composerStartRestartGroup.startReplaceGroup(-2111236161);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-2111236160);
                Modifier modifierM1358height3ABfNKs2 = SizeKt.m1358height3ABfNKs(RowScope.weight$default(rowScopeInstance, companion, 0.5f, false, 2, null), Dp.m3880constructorimpl(44));
                BorderStroke borderStrokeM1178BorderStrokecXLIe8U2 = BorderStrokeKt.m1178BorderStrokecXLIe8U(Dp.m3880constructorimpl((float) 0.5d), BiliTheme.INSTANCE.getColors(composerStartRestartGroup, BiliTheme.$stable).getLine_bold-0d7_KjU());
                RoundedCornerShape roundedCornerShapeM1502RoundedCornerShape0680j_42 = RoundedCornerShapeKt.m1502RoundedCornerShape0680j_4(Dp.m3880constructorimpl(32));
                float f9 = 0;
                PaddingValues paddingValuesM1335PaddingValues0680j_42 = PaddingKt.m1335PaddingValues0680j_4(Dp.m3880constructorimpl(f9));
                ButtonDefaults buttonDefaults2 = ButtonDefaults.INSTANCE;
                long jM2664getTransparent0d7_KjU2 = Color.Companion.m2664getTransparent0d7_KjU();
                int i12 = ButtonDefaults.$stable;
                ButtonColors buttonColorsM1640buttonColorsro_MJ882 = buttonDefaults2.m1640buttonColorsro_MJ88(jM2664getTransparent0d7_KjU2, 0L, 0L, 0L, composerStartRestartGroup, (i12 << 12) | 6, 14);
                ButtonElevation buttonElevationM1641elevationR_JCAzs2 = buttonDefaults2.m1641elevationR_JCAzs(Dp.m3880constructorimpl(f9), Dp.m3880constructorimpl(f9), 0.0f, Dp.m3880constructorimpl(f9), Dp.m3880constructorimpl(f9), composerStartRestartGroup, (i12 << 15) | 27702, 4);
                boolean z7 = (i10 & 896) == 256;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z7 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new W2.e(function02, 3);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                final String str = strTakeIfNotBlank2;
                ButtonKt.Button((Function0) objRememberedValue2, modifierM1358height3ABfNKs2, false, null, buttonElevationM1641elevationR_JCAzs2, roundedCornerShapeM1502RoundedCornerShape0680j_42, borderStrokeM1178BorderStrokecXLIe8U2, buttonColorsM1640buttonColorsro_MJ882, paddingValuesM1335PaddingValues0680j_42, ComposableLambdaKt.rememberComposableLambda(302126886, true, new Function3(str) { // from class: com.bilibili.pegasus.recommendlabel.W

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final String f78660a;

                    {
                        this.f78660a = str;
                    }

                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        Composer composer2 = (Composer) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(302126886, iIntValue, -1, "com.bilibili.pegasus.recommendlabel.EditButton.<anonymous>.<anonymous>.<anonymous> (RecommendLabelFirstPage.kt:813)");
                            }
                            BiliTheme biliTheme = BiliTheme.INSTANCE;
                            int i13 = BiliTheme.$stable;
                            TextKt.m1772Text4IGK_g(this.f78660a, (Modifier) null, biliTheme.getColors(composer2, i13).getText2-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, biliTheme.getTextStyle(composer2, i13).getT14b(), composer2, 0, 0, 65530);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer2.skipToGroupEnd();
                        }
                        return Unit.INSTANCE;
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 905969664, 12);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                composerStartRestartGroup = composerStartRestartGroup;
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(f0Var, function0, function02, i7) { // from class: com.bilibili.pegasus.recommendlabel.X

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final f0 f78661a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Function0 f78662b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Function0 f78663c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final int f78664d;

                {
                    this.f78661a = f0Var;
                    this.f78662b = function0;
                    this.f78663c = function02;
                    this.f78664d = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f78664d | 1);
                    Function0 function03 = this.f78662b;
                    Function0 function04 = this.f78663c;
                    RecommendLabelFirstPageKt.b(this.f78661a, function03, function04, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x013a  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(final com.bilibili.pegasus.recommendlabel.C5740i r26, final kotlin.jvm.functions.Function1<? super com.bilibili.pegasus.recommendlabel.InterfaceC5739h, kotlin.Unit> r27, androidx.compose.runtime.Composer r28, final int r29) {
        /*
            Method dump skipped, instruction units count: 1077
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.recommendlabel.RecommendLabelFirstPageKt.c(com.bilibili.pegasus.recommendlabel.i, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v33, types: [androidx.compose.ui.Modifier, androidx.compose.ui.platform.g0] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void d(@NotNull final f0 f0Var, @Nullable final Function1 function1, @Nullable final Function0 function0, @Nullable final Function0 function02, @Nullable final Function2 function2, @Nullable final Function0 function03, @Nullable final Function0 function04, @Nullable Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-435210150);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(f0Var) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changedInstance(function1) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changedInstance(function0) ? 256 : 128);
        }
        int i11 = i10;
        if ((i7 & 3072) == 0) {
            i11 = i10 | (composerStartRestartGroup.changedInstance(function02) ? 2048 : 1024);
        }
        int i12 = i11;
        if ((i7 & 24576) == 0) {
            i12 = i11 | (composerStartRestartGroup.changedInstance(function2) ? 16384 : 8192);
        }
        int i13 = i12;
        if ((196608 & i7) == 0) {
            i13 = i12 | (composerStartRestartGroup.changedInstance(function03) ? 131072 : 65536);
        }
        if ((1572864 & i7) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(function04) ? 1048576 : 524288;
        }
        if (composerStartRestartGroup.shouldExecute((i13 & 599187) != 599186, i13 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-435210150, i13, -1, "com.bilibili.pegasus.recommendlabel.MainPage (RecommendLabelFirstPage.kt:333)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            O4.d.c(companion3, composerM2296constructorimpl, measurePolicyColumnMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion3, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i14 = i13 & 14;
            l(f0Var, composerStartRestartGroup, i14);
            Modifier modifierWeight$default = ColumnScope.weight$default(columnScopeInstance, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 1.0f, false, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWeight$default);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2296constructorimpl2 = Updater.m2296constructorimpl(composerStartRestartGroup);
            O4.d.c(companion3, composerM2296constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM2296constructorimpl2, currentCompositionLocalMap2);
            Updater.m2304setimpl(composerM2296constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion3, composerM2296constructorimpl2, Integer.valueOf(iHashCode2), composerM2296constructorimpl2));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i15 = e.f78647a[f0Var.f78711g.ordinal()];
            if (i15 == 1) {
                composerStartRestartGroup.startReplaceGroup(-894549968);
                Modifier modifierThen = boxScopeInstance.align(companion, companion2.getTopCenter()).then(new AbstractC4464g0(InspectableValueKt.f44956a));
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getCenterHorizontally(), composerStartRestartGroup, 48);
                int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen);
                Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM2296constructorimpl3 = Updater.m2296constructorimpl(composerStartRestartGroup);
                O4.d.c(companion3, composerM2296constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM2296constructorimpl3, currentCompositionLocalMap3);
                Updater.m2304setimpl(composerM2296constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion3, composerM2296constructorimpl3, Integer.valueOf(iHashCode3), composerM2296constructorimpl3));
                Modifier modifierM1358height3ABfNKs = SizeKt.m1358height3ABfNKs(SizeKt.m1377width3ABfNKs(companion, Dp.m3880constructorimpl(280)), Dp.m3880constructorimpl(154));
                String strResourceToUri$default = BiliImageLoaderHelper.resourceToUri$default((String) null, 2131236939, 1, (Object) null);
                ContentScale fit = ContentScale.Companion.getFit();
                Alignment center = companion2.getCenter();
                BiliTheme biliTheme = BiliTheme.INSTANCE;
                int i16 = BiliTheme.$stable;
                BiliImageKt.BiliImage(strResourceToUri$default, modifierM1358height3ABfNKs, "Loading view", false, 0, (String) null, false, (Function3) null, center, fit, biliTheme.getDayNightTheme(composerStartRestartGroup, i16) == ThemeDayNight.Night ? 0.5f : 1.0f, (ColorFilter) null, composerStartRestartGroup, 905970096, 0, 2296);
                float f7 = 48;
                TextKt.m1772Text4IGK_g("网络尚未连接，请稍后再试", PaddingKt.m1346paddingqDBjuR0$default(companion, Dp.m3880constructorimpl(f7), Dp.m3880constructorimpl(6), Dp.m3880constructorimpl(f7), 0.0f, 8, null), biliTheme.getColors(composerStartRestartGroup, i16).getText3-0d7_KjU(), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3078, 0, 131056);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
                Unit unit = Unit.INSTANCE;
            } else if (i15 == 2 || i15 == 3) {
                composerStartRestartGroup.startReplaceGroup(-893230143);
                Modifier modifierM1334offsetVpY3zN4$default = OffsetKt.m1334offsetVpY3zN4$default(companion, 0.0f, Dp.m3880constructorimpl(-23), 1, null);
                float f8 = 12;
                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(androidx.compose.foundation.text.contextmenu.internal.J.a(PaddingKt.m1344paddingVpY3zN4$default(modifierM1334offsetVpY3zN4$default, Dp.m3880constructorimpl(f8), 0.0f, 2, null), f8), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
                int iHashCode4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
                Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor4);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM2296constructorimpl4 = Updater.m2296constructorimpl(composerStartRestartGroup);
                O4.d.c(companion3, composerM2296constructorimpl4, measurePolicyColumnMeasurePolicy3, composerM2296constructorimpl4, currentCompositionLocalMap4);
                Updater.m2304setimpl(composerM2296constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion3, composerM2296constructorimpl4, Integer.valueOf(iHashCode4), composerM2296constructorimpl4));
                e(f0Var, composerStartRestartGroup, i14);
                i(f0Var, function1, function0, function02, function2, function03, function04, composerStartRestartGroup, i13 & 4194302);
                List<Label> list = f0Var.f78705a;
                BLog.d("RecommendLabelPage", "RecommendLabelFirstPage: " + (list != null ? Integer.valueOf(list.size()) : null));
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
                Unit unit2 = Unit.INSTANCE;
            } else {
                composerStartRestartGroup.startReplaceGroup(-892207949);
                composerStartRestartGroup.endReplaceGroup();
                Unit unit3 = Unit.INSTANCE;
            }
            composerStartRestartGroup.endNode();
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            StringBuilder sb = new StringBuilder("state.navigationHeight=");
            int i17 = f0Var.h;
            sb.append(i17);
            BLog.d("RecommendLabelPage", sb.toString());
            BoxKt.Box(SizeKt.m1358height3ABfNKs(modifierFillMaxWidth$default, Dp.m3878boximpl(density.mo1268toDpu2uoSUM(i17)).m3894unboximpl()), composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(f0Var, function1, function0, function02, function2, function03, function04, i7) { // from class: com.bilibili.pegasus.recommendlabel.H

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final f0 f78583a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Function1 f78584b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Function0 f78585c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Function0 f78586d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final Function2 f78587e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final Function0 f78588f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final Function0 f78589g;
                public final int h;

                {
                    this.f78583a = f0Var;
                    this.f78584b = function1;
                    this.f78585c = function0;
                    this.f78586d = function02;
                    this.f78587e = function2;
                    this.f78588f = function03;
                    this.f78589g = function04;
                    this.h = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.h | 1);
                    Function0 function05 = this.f78588f;
                    Function0 function06 = this.f78589g;
                    RecommendLabelFirstPageKt.d(this.f78583a, this.f78584b, this.f78585c, this.f78586d, this.f78587e, function05, function06, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0168  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(com.bilibili.pegasus.recommendlabel.f0 r26, androidx.compose.runtime.Composer r27, int r28) {
        /*
            Method dump skipped, instruction units count: 1098
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.recommendlabel.RecommendLabelFirstPageKt.e(com.bilibili.pegasus.recommendlabel.f0, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x01d8  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void f(final kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super com.bilibili.pegasus.recommendlabel.data.Label, kotlin.Unit> r26, final int r27, final com.bilibili.pegasus.recommendlabel.data.Label r28, androidx.compose.runtime.Composer r29, final int r30) {
        /*
            Method dump skipped, instruction units count: 1159
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.recommendlabel.RecommendLabelFirstPageKt.f(kotlin.jvm.functions.Function2, int, com.bilibili.pegasus.recommendlabel.data.Label, androidx.compose.runtime.Composer, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void g(final f0 f0Var, final Function1 function1, final Function2 function2, Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-723311236);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(f0Var) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 384) == 0) {
            i9 = i8 | (composerStartRestartGroup.changedInstance(function2) ? 256 : 128);
        }
        if (composerStartRestartGroup.shouldExecute((i9 & 131) != 130, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-723311236, i9, -1, "com.bilibili.pegasus.recommendlabel.MyFavoriteRow (RecommendLabelFirstPage.kt:828)");
            }
            final int i10 = 0;
            FlowLayoutKt.FlowRow(PaddingKt.m1343paddingVpY3zN4(Modifier.Companion, Dp.m3880constructorimpl(6), Dp.m3880constructorimpl(0)), null, null, null, 0, 0, ComposableLambdaKt.rememberComposableLambda(1674785719, true, new Function3(i10, f0Var, function2) { // from class: com.bilibili.pegasus.recommendlabel.N

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f78611a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f78612b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Function f78613c;

                {
                    this.f78611a = i10;
                    this.f78612b = f0Var;
                    this.f78613c = function2;
                }

                /* JADX WARN: Removed duplicated region for block: B:26:0x0106  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invoke(java.lang.Object r15, java.lang.Object r16, java.lang.Object r17) {
                    /*
                        Method dump skipped, instruction units count: 960
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.recommendlabel.N.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 1572870, 62);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(f0Var, function1, function2, i7) { // from class: com.bilibili.pegasus.recommendlabel.O

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final f0 f78614a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Function1 f78615b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Function2 f78616c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final int f78617d;

                {
                    this.f78614a = f0Var;
                    this.f78615b = function1;
                    this.f78616c = function2;
                    this.f78617d = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f78617d | 1);
                    Function1 function12 = this.f78615b;
                    Function2 function22 = this.f78616c;
                    RecommendLabelFirstPageKt.g(this.f78614a, function12, function22, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0311  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void h(final java.util.List<com.bilibili.pegasus.recommendlabel.data.AreaItem> r26, androidx.compose.runtime.Composer r27, final int r28) {
        /*
            Method dump skipped, instruction units count: 1243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.recommendlabel.RecommendLabelFirstPageKt.h(java.util.List, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0415  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void i(final com.bilibili.pegasus.recommendlabel.f0 r26, final kotlin.jvm.functions.Function1 r27, final kotlin.jvm.functions.Function0 r28, final kotlin.jvm.functions.Function0 r29, final kotlin.jvm.functions.Function2 r30, final kotlin.jvm.functions.Function0 r31, final kotlin.jvm.functions.Function0 r32, androidx.compose.runtime.Composer r33, final int r34) {
        /*
            Method dump skipped, instruction units count: 1755
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.recommendlabel.RecommendLabelFirstPageKt.i(com.bilibili.pegasus.recommendlabel.f0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00d6  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void j(final com.bilibili.pegasus.recommendlabel.f0 r27, final kotlin.jvm.functions.Function0 r28, androidx.compose.runtime.Composer r29, final int r30) {
        /*
            Method dump skipped, instruction units count: 510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.recommendlabel.RecommendLabelFirstPageKt.j(com.bilibili.pegasus.recommendlabel.f0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0233  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void k(@org.jetbrains.annotations.NotNull final com.bilibili.pegasus.recommendlabel.f0 r25, @org.jetbrains.annotations.Nullable final kotlin.jvm.functions.Function1 r26, @org.jetbrains.annotations.Nullable final kotlin.jvm.functions.Function0 r27, @org.jetbrains.annotations.Nullable final kotlin.jvm.functions.Function0 r28, @org.jetbrains.annotations.Nullable final kotlin.jvm.functions.Function2 r29, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r30, int r31) {
        /*
            Method dump skipped, instruction units count: 827
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.recommendlabel.RecommendLabelFirstPageKt.k(com.bilibili.pegasus.recommendlabel.f0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void l(final f0 f0Var, Composer composer, int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1526103993);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(f0Var) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 3) != 2, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1526103993, i8, -1, "com.bilibili.pegasus.recommendlabel.TopArea (RecommendLabelFirstPage.kt:422)");
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", Constant.SDK_OS);
            final float fMo1268toDpu2uoSUM = density.mo1268toDpu2uoSUM(identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0);
            Modifier.Companion companion = Modifier.Companion;
            BoxKt.Box(SizeKt.m1358height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), fMo1268toDpu2uoSUM), composerStartRestartGroup, 0);
            Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, false, 3, null);
            Object objA = C4550g.a(-270267587, composerStartRestartGroup, -3687241);
            Composer.Companion companion2 = Composer.Companion;
            Object objA2 = objA;
            if (objA == companion2.getEmpty()) {
                objA2 = Yb.a.a(composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final Measurer measurer = (Measurer) objA2;
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Object objA3 = objRememberedValue;
            if (objRememberedValue == companion2.getEmpty()) {
                objA3 = C4551h.a(composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objA3;
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Object objMutableStateOf$default = objRememberedValue2;
            if (objRememberedValue2 == companion2.getEmpty()) {
                objMutableStateOf$default = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objMutableStateOf$default);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Pair<MeasurePolicy, Function0<Unit>> pairRememberConstraintLayoutMeasurePolicy = ConstraintLayoutKt.rememberConstraintLayoutMeasurePolicy(257, constraintLayoutScope, (MutableState<Boolean>) objMutableStateOf$default, measurer, composerStartRestartGroup, 4544);
            MeasurePolicy measurePolicy = (MeasurePolicy) pairRememberConstraintLayoutMeasurePolicy.component1();
            final Function0 function0 = (Function0) pairRememberConstraintLayoutMeasurePolicy.component2();
            final int i9 = 6;
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifierWrapContentHeight$default, false, new Function1<SemanticsPropertyReceiver, Unit>(measurer) { // from class: com.bilibili.pegasus.recommendlabel.RecommendLabelFirstPageKt$TopArea$$inlined$ConstraintLayout$1
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
            }, 1, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894182, true, new Function2<Composer, Integer, Unit>(constraintLayoutScope, i9, function0, f0Var, fMo1268toDpu2uoSUM) { // from class: com.bilibili.pegasus.recommendlabel.RecommendLabelFirstPageKt$TopArea$$inlined$ConstraintLayout$2
                final int $$changed;
                final float $heightDp$inlined;
                final Function0 $onHelpersChanged;
                final ConstraintLayoutScope $scope;
                final f0 $state$inlined;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                    this.$scope = constraintLayoutScope;
                    this.$onHelpersChanged = function0;
                    this.$state$inlined = f0Var;
                    this.$heightDp$inlined = fMo1268toDpu2uoSUM;
                    this.$$changed = i9;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Removed duplicated region for block: B:19:0x010d  */
                /* JADX WARN: Removed duplicated region for block: B:24:0x017c  */
                /* JADX WARN: Removed duplicated region for block: B:29:0x01e1  */
                @androidx.compose.runtime.Composable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void invoke(@org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r27, int r28) {
                    /*
                        Method dump skipped, instruction units count: 761
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.recommendlabel.RecommendLabelFirstPageKt$TopArea$$inlined$ConstraintLayout$2.invoke(androidx.compose.runtime.Composer, int):void");
                }
            }), measurePolicy, composerStartRestartGroup, 48, 0);
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.bilibili.biligame.ui.playing.widget.s(f0Var, i7, 1));
        }
    }
}
