package com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent;

import Di0.C1602f;
import I3.C2287z;
import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.TextKt;
import androidx.compose.material3.C4162p;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.lifecycle.Lifecycle;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.C0;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.I0;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.compose.theme.ThemeDayNight;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.framework.exposure.core.collecter.ComposeExposureLayoutInfoCollectorKt;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.ship.theseus.united.page.restrictionlayer.C6378c;
import com.bilibili.ship.theseus.united.page.restrictionlayer.C6383h;
import com.bilibili.ship.theseus.united.page.restrictionlayer.C6385j;
import com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerVo;
import com.bilibili.ship.theseus.united.page.restrictionlayer.TextVo;
import kntr.base.imageloader.BiliImageKt;
import kntr.base.imageloader.ImageRequest;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.time.Duration;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/uicomponent/p.class */
@StabilityInferred(parameters = 0)
public final class C6407p implements UIComponent<UIComponent.b<ComposeView>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.restrictionlayer.M f102882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final C6383h f102883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final C6383h f102884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Flow<Boolean> f102885d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f102886e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final StateFlow<WindowSizeClass> f102887f;

    public C6407p(@NotNull com.bilibili.ship.theseus.united.page.restrictionlayer.M m7, @NotNull C6383h c6383h, @NotNull C6383h c6383h2, @NotNull Flow flow, boolean z6, @NotNull StateFlow stateFlow) {
        this.f102882a = m7;
        this.f102883b = c6383h;
        this.f102884c = c6383h2;
        this.f102885d = flow;
        this.f102886e = z6;
        this.f102887f = stateFlow;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void a(@NotNull final com.bilibili.ship.theseus.united.page.restrictionlayer.M m7, final boolean z6, @NotNull final WindowSizeClass windowSizeClass, @Nullable Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1627364549);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(m7) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(z6) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changedInstance(windowSizeClass) ? 256 : 128);
        }
        int i11 = i10;
        if ((i7 & 3072) == 0) {
            i11 = i10 | (composerStartRestartGroup.changedInstance(this) ? 2048 : 1024);
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 1171) != 1170, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1627364549, i11, -1, "com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.RestrictionChargingPlayableUIComponent.Content (RestrictionChargingPlayableUIComponent.kt:77)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Object c2287z = objRememberedValue;
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                c2287z = new C2287z(10);
                composerStartRestartGroup.updateRememberedValue(c2287z);
            }
            Modifier modifierM1186clickableoSLSa3U$default = ClickableKt.m1186clickableoSLSa3U$default(modifierFillMaxSize$default, false, null, null, null, (Function0) c2287z, 14, null);
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1186clickableoSLSa3U$default);
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
            O4.d.c(companion3, composerM2296constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion3, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (!this.f102886e || com.bilibili.ship.theseus.united.page.screensize.b.a(windowSizeClass)) {
                composerStartRestartGroup.startReplaceGroup(-391191748);
                int i12 = i11 & 14;
                b(m7, composerStartRestartGroup, ((i11 >> 6) & 112) | i12);
                e(m7, z6, windowSizeClass, true, composerStartRestartGroup, i12 | 3072 | (i11 & 112) | (i11 & 896) | ((i11 << 3) & 57344));
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-391999608);
                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
                int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default2);
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
                O4.d.c(companion3, composerM2296constructorimpl2, measurePolicyColumnMeasurePolicy, composerM2296constructorimpl2, currentCompositionLocalMap2);
                Updater.m2304setimpl(composerM2296constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion3, composerM2296constructorimpl2, Integer.valueOf(iHashCode2), composerM2296constructorimpl2));
                Modifier modifierWeight$default = ColumnScope.weight$default(ColumnScopeInstance.INSTANCE, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 1.0f, false, 2, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopCenter(), false);
                int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWeight$default);
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
                O4.d.c(companion3, composerM2296constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM2296constructorimpl3, currentCompositionLocalMap3);
                Updater.m2304setimpl(composerM2296constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion3, composerM2296constructorimpl3, Integer.valueOf(iHashCode3), composerM2296constructorimpl3));
                int i13 = i11 & 14;
                int i14 = i13 | ((i11 >> 6) & 112);
                b(m7, composerStartRestartGroup, i14);
                e(m7, z6, windowSizeClass, false, composerStartRestartGroup, i13 | 3072 | (i11 & 112) | (i11 & 896) | ((i11 << 3) & 57344));
                composerStartRestartGroup.endNode();
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                int iHashCode4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
                O4.d.c(companion3, composerM2296constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM2296constructorimpl4, currentCompositionLocalMap4);
                Updater.m2304setimpl(composerM2296constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion3, composerM2296constructorimpl4, Integer.valueOf(iHashCode4), composerM2296constructorimpl4));
                d(m7, composerStartRestartGroup, i14);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(this, m7, z6, windowSizeClass, i7) { // from class: com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.j

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final C6407p f102863a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final com.bilibili.ship.theseus.united.page.restrictionlayer.M f102864b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final boolean f102865c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final WindowSizeClass f102866d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final int f102867e;

                {
                    this.f102863a = this;
                    this.f102864b = m7;
                    this.f102865c = z6;
                    this.f102866d = windowSizeClass;
                    this.f102867e = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f102867e | 1);
                    this.f102863a.a(this.f102864b, this.f102865c, this.f102866d, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void b(@NotNull final com.bilibili.ship.theseus.united.page.restrictionlayer.M m7, @Nullable Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-38424527);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(m7) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 3) != 2, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-38424527, i8, -1, "com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.RestrictionChargingPlayableUIComponent.ContentImg (RestrictionChargingPlayableUIComponent.kt:117)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
            O4.d.c(companion3, composerM2296constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion3, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            String str = m7.f102586n;
            Unit unit = null;
            if (str == null) {
                composerStartRestartGroup.startReplaceGroup(969893287);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                BiliImageKt.BiliImage(Ef.x.b(composerStartRestartGroup, 969893288, str), SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), (String) null, (Lifecycle) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function2) null, (Function4) null, composerStartRestartGroup, 48, 1020);
                composerStartRestartGroup.endReplaceGroup();
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                composerStartRestartGroup.startReplaceGroup(970071476);
                BoxKt.Box(BackgroundKt.m1169backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), Color.Companion.m2655getBlack0d7_KjU(), null, 2, null), composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1970949171);
                composerStartRestartGroup.endReplaceGroup();
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Object objM2579verticalGradient8A3gB4$default = objRememberedValue;
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                Brush.Companion companion4 = Brush.Companion;
                Color.Companion companion5 = Color.Companion;
                objM2579verticalGradient8A3gB4$default = Brush.Companion.m2579verticalGradient8A3gB4$default(companion4, CollectionsKt.listOf(new Color[]{Color.m2619boximpl(Color.m2628copywmQWz5c$default(companion5.m2655getBlack0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m2619boximpl(companion5.m2655getBlack0d7_KjU())}), 0.0f, 0.0f, 0, 14, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objM2579verticalGradient8A3gB4$default);
            }
            BoxKt.Box(boxScopeInstance.align(BackgroundKt.background$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), (Brush) objM2579verticalGradient8A3gB4$default, null, 0.0f, 6, null), companion2.getBottomCenter()), composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(this, m7, i7) { // from class: com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.k

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final C6407p f102868a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final com.bilibili.ship.theseus.united.page.restrictionlayer.M f102869b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f102870c;

                {
                    this.f102868a = this;
                    this.f102869b = m7;
                    this.f102870c = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f102870c | 1);
                    this.f102868a.b(this.f102869b, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        ((ComposeView) ((UIComponent.b) viewEntry).a).setContent(ComposableLambdaKt.composableLambdaInstance(1686286473, true, new XY0.d(this, 2)));
        return Unit.INSTANCE;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void c(Composer composer, int i7) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-588248636);
        int i8 = i7 & 1;
        if (composerStartRestartGroup.shouldExecute(i8 != 0, i8)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-588248636, i7, -1, "com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.RestrictionChargingPlayableUIComponent.ImagePlaceholder (RestrictionChargingPlayableUIComponent.kt:304)");
            }
            ImageKt.Image(Ij0.c.a(2131231978, composerStartRestartGroup, 0), "ImagePlaceholder", androidx.compose.foundation.text.contextmenu.internal.J.a(BackgroundKt.m1169backgroundbw27NRU$default(SizeKt.m1358height3ABfNKs(SizeKt.m1377width3ABfNKs(Modifier.Companion, Dp.m3880constructorimpl(68)), Dp.m3880constructorimpl(38)), Color.m2628copywmQWz5c$default(Color.Companion.m2655getBlack0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), 4), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C0(this, i7, 1));
        }
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setClickable(true);
        return new UIComponent.b(composeView);
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void d(final com.bilibili.ship.theseus.united.page.restrictionlayer.M m7, Composer composer, final int i7) {
        int i8;
        Modifier modifierM1346paddingqDBjuR0$default;
        Composer composerStartRestartGroup = composer.startRestartGroup(1324759843);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(m7) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changedInstance(this) ? 32 : 16);
        }
        if (composerStartRestartGroup.shouldExecute((i9 & 19) != 18, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1324759843, i9, -1, "com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.RestrictionChargingPlayableUIComponent.NextPlayableContent (RestrictionChargingPlayableUIComponent.kt:321)");
            }
            RestrictionLayerVo.NextPlayableVo nextPlayableVo = m7.f102594v;
            if (nextPlayableVo == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Z41.a(i7, 1, this, m7));
                    return;
                }
                return;
            }
            State stateCollectAsState = SnapshotStateKt.collectAsState(m7.f102598z, null, composerStartRestartGroup, 0, 1);
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierM1358height3ABfNKs = SizeKt.m1358height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3880constructorimpl(50));
            if (this.f102886e) {
                float f7 = 12;
                modifierM1346paddingqDBjuR0$default = PaddingKt.m1346paddingqDBjuR0$default(BackgroundKt.m1169backgroundbw27NRU$default(companion, Color.Companion.m2655getBlack0d7_KjU(), null, 2, null), Dp.m3880constructorimpl(f7), 0.0f, Dp.m3880constructorimpl(f7), Dp.m3880constructorimpl(10), 2, null);
            } else {
                modifierM1346paddingqDBjuR0$default = PaddingKt.m1346paddingqDBjuR0$default(companion, 0.0f, Dp.m3880constructorimpl(12), 0.0f, 0.0f, 13, null);
            }
            Modifier modifierThen = modifierM1358height3ABfNKs.then(modifierM1346paddingqDBjuR0$default);
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen);
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
            O4.d.c(companion3, composerM2296constructorimpl, measurePolicyRowMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion3, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            C6383h c6383h = this.f102884c;
            Modifier modifierA = c6383h.a(companion);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierA);
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
            BiliImageKt.BiliImage(new ImageRequest(nextPlayableVo.f102688b).build(), androidx.compose.foundation.text.contextmenu.internal.J.a(SizeKt.m1358height3ABfNKs(SizeKt.m1377width3ABfNKs(companion, Dp.m3880constructorimpl(68)), Dp.m3880constructorimpl(38)), 4), (String) null, (Lifecycle) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, ComposableLambdaKt.rememberComposableLambda(2042877329, true, new Function2(this) { // from class: com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.l

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final C6407p f102871a;

                {
                    this.f102871a = this;
                }

                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (composer2.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2042877329, iIntValue, -1, "com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.RestrictionChargingPlayableUIComponent.NextPlayableContent.<anonymous>.<anonymous>.<anonymous> (RestrictionChargingPlayableUIComponent.kt:346)");
                        }
                        this.f102871a.c(composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer2.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-1911354021, true, new Function4(this) { // from class: com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.m

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final C6407p f102872a;

                {
                    this.f102872a = this;
                }

                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    Composer composer2 = (Composer) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1911354021, iIntValue, -1, "com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.RestrictionChargingPlayableUIComponent.NextPlayableContent.<anonymous>.<anonymous>.<anonymous> (RestrictionChargingPlayableUIComponent.kt:349)");
                    }
                    this.f102872a.c(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 905969664, 252);
            float f8 = 28;
            Modifier modifierM1372size3ABfNKs = SizeKt.m1372size3ABfNKs(companion, Dp.m3880constructorimpl(f8));
            Color.Companion companion4 = Color.Companion;
            Modifier modifierM1168backgroundbw27NRU = BackgroundKt.m1168backgroundbw27NRU(modifierM1372size3ABfNKs, Color.m2628copywmQWz5c$default(companion4.m2666getWhite0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
            int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1168backgroundbw27NRU);
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
            O4.d.c(companion3, composerM2296constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM2296constructorimpl3, currentCompositionLocalMap3);
            Updater.m2304setimpl(composerM2296constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion3, composerM2296constructorimpl3, Integer.valueOf(iHashCode3), composerM2296constructorimpl3));
            long j7 = ((Duration) stateCollectAsState.getValue()).unbox-impl();
            Duration.Companion companion5 = Duration.Companion;
            if (Duration.compareTo-LRDsOJo(j7, companion5.getZERO-UwyO8pc()) > 0) {
                composerStartRestartGroup.startReplaceGroup(65005088);
                ProgressIndicatorKt.m1727CircularProgressIndicatorDUhRLBM(1 - ((Duration.getInWholeMilliseconds-impl(((Duration) stateCollectAsState.getValue()).unbox-impl()) * 1.0f) / Duration.getInWholeMilliseconds-impl(m7.f102595w)), SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), companion4.m2666getWhite0d7_KjU(), Dp.m3880constructorimpl(2), Color.m2628copywmQWz5c$default(companion4.m2666getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), StrokeCap.Companion.m2808getRoundKaPHkGw(), composerStartRestartGroup, 28080, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(65542287);
                composerStartRestartGroup.endReplaceGroup();
            }
            Painter painterA = Ij0.c.a(2131238958, composerStartRestartGroup, 0);
            float f9 = 1;
            IconKt.m1714Iconww6aTOc(painterA, "play", SizeKt.m1372size3ABfNKs(PaddingKt.m1346paddingqDBjuR0$default(companion, Dp.m3880constructorimpl(f9), 0.0f, 0.0f, 0.0f, 14, null), Dp.m3880constructorimpl(16)), companion4.m2666getWhite0d7_KjU(), composerStartRestartGroup, Painter.$stable | 3504, 0);
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            SpacerKt.Spacer(SizeKt.m1377width3ABfNKs(SizeKt.m1358height3ABfNKs(companion, Dp.m3880constructorimpl(f9)), Dp.m3880constructorimpl(8)), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceGroup(-1695260339);
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            if (Duration.compareTo-LRDsOJo(((Duration) stateCollectAsState.getValue()).unbox-impl(), companion5.getZERO-UwyO8pc()) > 0) {
                composerStartRestartGroup.startReplaceGroup(-422597417);
                builder.pushStyle(new SpanStyle(BiliTheme.INSTANCE.getColors(composerStartRestartGroup, BiliTheme.$stable).getGraph_white-0d7_KjU(), TextUnitKt.getSp(15), FontWeight.Companion.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65528, (DefaultConstructorMarker) null));
                builder.append(String.valueOf(Duration.getInWholeSeconds-impl(((Duration) stateCollectAsState.getValue()).unbox-impl()) + 1));
                builder.pop();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-422174577);
                composerStartRestartGroup.endReplaceGroup();
            }
            long sp = TextUnitKt.getSp(14);
            BiliTheme biliTheme = BiliTheme.INSTANCE;
            int i10 = BiliTheme.$stable;
            builder.pushStyle(new SpanStyle(biliTheme.getColors(composerStartRestartGroup, i10).getText4-0d7_KjU(), sp, FontWeight.Companion.getNormal(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65528, (DefaultConstructorMarker) null));
            builder.append(Duration.compareTo-LRDsOJo(((Duration) stateCollectAsState.getValue()).unbox-impl(), companion5.getZERO-UwyO8pc()) > 0 ? " 秒后播放下个视频" : nextPlayableVo.f102687a);
            builder.pop();
            AnnotatedString annotatedString = builder.toAnnotatedString();
            composerStartRestartGroup.endReplaceGroup();
            TextKt.m1773TextIbK3jfQ(annotatedString, RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, null, null, composerStartRestartGroup, 0, 3072, 253948);
            String str = Duration.compareTo-LRDsOJo(((Duration) stateCollectAsState.getValue()).unbox-impl(), companion5.getZERO-UwyO8pc()) > 0 ? "取消连播" : "立即播放";
            Modifier modifierAlign = rowScopeInstance.align(com.bilibili.ad.adview.liveroom.answer.fragment.compont.H.a(14, SizeKt.m1358height3ABfNKs(SizeKt.m1377width3ABfNKs(companion, Dp.m3880constructorimpl(85)), Dp.m3880constructorimpl(f8)), Color.m2628copywmQWz5c$default(companion4.m2666getWhite0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null)), companion2.getCenterVertically());
            Modifier modifierA2 = Duration.compareTo-LRDsOJo(((Duration) stateCollectAsState.getValue()).unbox-impl(), companion5.getZERO-UwyO8pc()) > 0 ? this.f102883b.a(modifierAlign) : c6383h.a(modifierAlign);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
            int iHashCode4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierA2);
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
            O4.d.c(companion3, composerM2296constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM2296constructorimpl4, currentCompositionLocalMap4);
            Updater.m2304setimpl(composerM2296constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion3, composerM2296constructorimpl4, Integer.valueOf(iHashCode4), composerM2296constructorimpl4));
            TextKt.m1772Text4IGK_g(str, (Modifier) null, biliTheme.getColors(composerStartRestartGroup, i10).getText_white-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, biliTheme.getTextStyle(composerStartRestartGroup, i10).getT14(), composerStartRestartGroup, 0, 3072, 57338);
            if (C4162p.a(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2(this, m7, i7) { // from class: com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.n

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final C6407p f102873a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final com.bilibili.ship.theseus.united.page.restrictionlayer.M f102874b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f102875c;

                {
                    this.f102873a = this;
                    this.f102874b = m7;
                    this.f102875c = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f102875c | 1);
                    this.f102873a.d(this.f102874b, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void e(@NotNull final com.bilibili.ship.theseus.united.page.restrictionlayer.M m7, final boolean z6, @NotNull final WindowSizeClass windowSizeClass, final boolean z7, @Nullable Composer composer, final int i7) {
        int i8;
        int i9;
        Composer composer2;
        long jColor;
        long jColor2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1521527773);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(m7) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i10 = i8;
        if ((i7 & 48) == 0) {
            i10 = i8 | (composerStartRestartGroup.changed(z6) ? 32 : 16);
        }
        if ((i7 & 384) == 0) {
            i9 = i10 | (composerStartRestartGroup.changedInstance(windowSizeClass) ? 256 : 128);
        } else {
            i9 = i10;
        }
        int i11 = i9;
        if ((i7 & 3072) == 0) {
            i11 = i9 | (composerStartRestartGroup.changed(z7) ? 2048 : 1024);
        }
        int i12 = i11;
        if ((i7 & 24576) == 0) {
            i12 = i11 | (composerStartRestartGroup.changedInstance(this) ? 16384 : 8192);
        }
        if (composerStartRestartGroup.shouldExecute((i12 & 9363) != 9362, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1521527773, i12, -1, "com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.RestrictionChargingPlayableUIComponent.VerticalChargingTextContent (RestrictionChargingPlayableUIComponent.kt:157)");
            }
            BiliTheme biliTheme = BiliTheme.INSTANCE;
            int i13 = BiliTheme.$stable;
            boolean z8 = biliTheme.getDayNightTheme(composerStartRestartGroup, i13) == ThemeDayNight.Night;
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
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
            O4.d.c(companion3, composerM2296constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion3, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            boolean z9 = this.f102886e;
            Modifier modifierFillMaxSize$default2 = (!z9 || com.bilibili.ship.theseus.united.page.screensize.b.a(windowSizeClass)) ? com.bilibili.ship.theseus.united.page.screensize.b.d(windowSizeClass) ? SizeKt.fillMaxSize$default(PaddingKt.m1342padding3ABfNKs(companion, Dp.m3880constructorimpl(12)), 0.0f, 1, null) : SizeKt.m1379widthInVpY3zN4$default(SizeKt.fillMaxHeight$default(PaddingKt.m1342padding3ABfNKs(companion, Dp.m3880constructorimpl(12)), 0.0f, 1, null), 0.0f, Dp.m3880constructorimpl(375), 1, null) : com.bilibili.ship.theseus.united.page.screensize.b.d(windowSizeClass) ? companion : SizeKt.m1379widthInVpY3zN4$default(companion, 0.0f, Dp.m3880constructorimpl(375), 1, null);
            ExposureEntry exposureEntry = m7.f102579f;
            Modifier modifierCollectExposureLayoutInfo = modifierFillMaxSize$default2;
            if (exposureEntry != null) {
                modifierCollectExposureLayoutInfo = ComposeExposureLayoutInfoCollectorKt.collectExposureLayoutInfo(modifierFillMaxSize$default2, exposureEntry);
                if (modifierCollectExposureLayoutInfo == null) {
                    modifierCollectExposureLayoutInfo = modifierFillMaxSize$default2;
                }
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy((!z9 || com.bilibili.ship.theseus.united.page.screensize.b.a(windowSizeClass)) ? Arrangement.INSTANCE.getBottom() : Arrangement.INSTANCE.getCenter(), companion2.getCenterHorizontally(), composerStartRestartGroup, 48);
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierCollectExposureLayoutInfo);
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
            O4.d.c(companion3, composerM2296constructorimpl2, measurePolicyColumnMeasurePolicy, composerM2296constructorimpl2, currentCompositionLocalMap2);
            Updater.m2304setimpl(composerM2296constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion3, composerM2296constructorimpl2, Integer.valueOf(iHashCode2), composerM2296constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            boolean zChanged = composerStartRestartGroup.changed(density);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                float fMo1270toPx0680j_4 = density.mo1270toPx0680j_4(Dp.m3880constructorimpl(1));
                objRememberedValue = new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.m2628copywmQWz5c$default(Color.Companion.m2655getBlack0d7_KjU(), 0.25f, 0.0f, 0.0f, 0.0f, 14, null), Offset.m2447constructorimpl((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fMo1270toPx0680j_4)) & 4294967295L)), fMo1270toPx0680j_4, null), (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16769023, (DefaultConstructorMarker) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            TextStyle textStyle = (TextStyle) objRememberedValue;
            C6378c c6378c = (C6378c) CollectionsKt.firstOrNull(m7.n());
            C6385j c6385j = c6378c != null ? c6378c.f102727a : null;
            boolean z10 = (c6385j == null || z6) ? false : true;
            TextVo textVo = m7.h;
            if (textVo == null) {
                composerStartRestartGroup.startReplaceGroup(-1278619580);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1278619579);
                if (z8) {
                    jColor = ColorKt.Color(textVo.n());
                } else {
                    Integer numO = textVo.o();
                    jColor = ColorKt.Color(numO != null ? numO.intValue() : textVo.n());
                }
                TextStyle t14b = biliTheme.getTextStyle(composerStartRestartGroup, i13).getT14b();
                t14b.plus(textStyle);
                TextKt.m1772Text4IGK_g(textVo.f102705a, SizeKt.wrapContentWidth$default(companion, null, false, 3, null), jColor, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, t14b, composerStartRestartGroup, 48, 0, 65528);
                Unit unit = Unit.INSTANCE;
                composerStartRestartGroup.endReplaceGroup();
            }
            TextVo textVo2 = m7.f102581i;
            if (textVo2 == null) {
                composerStartRestartGroup.startReplaceGroup(-1277923816);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1277923815);
                com.bilibili.ad.adview.liveroom.answer.fragment.compont.q.a(4, 6, composerStartRestartGroup, companion);
                if (z8) {
                    jColor2 = ColorKt.Color(textVo2.n());
                } else {
                    Integer numO2 = textVo2.o();
                    jColor2 = ColorKt.Color(numO2 != null ? numO2.intValue() : textVo2.n());
                }
                Modifier modifierWrapContentWidth$default = SizeKt.wrapContentWidth$default(companion, null, false, 3, null);
                TextStyle t13 = biliTheme.getTextStyle(composerStartRestartGroup, i13).getT13();
                t13.plus(textStyle);
                TextKt.m1772Text4IGK_g(textVo2.f102705a, modifierWrapContentWidth$default, jColor2, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, t13, composerStartRestartGroup, 48, 0, 65528);
                Unit unit2 = Unit.INSTANCE;
                composerStartRestartGroup.endReplaceGroup();
            }
            if (!z9 || com.bilibili.ship.theseus.united.page.screensize.b.a(windowSizeClass)) {
                composerStartRestartGroup.startReplaceGroup(-1277010927);
                SpacerKt.Spacer(SizeKt.m1358height3ABfNKs(companion, Dp.m3880constructorimpl(z10 ? 16 : 37)), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1277129006);
                SpacerKt.Spacer(SizeKt.m1358height3ABfNKs(companion, z10 ? Dp.m3880constructorimpl(16) : Dp.m3880constructorimpl(0)), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (c6385j == null || z6) {
                composerStartRestartGroup.startReplaceGroup(-1275023517);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1276748512);
                Modifier modifierWrapContentSize$default = SizeKt.wrapContentSize$default(companion, null, false, 3, null);
                long j7 = biliTheme.getColors(composerStartRestartGroup, i13).getBrand_pink-0d7_KjU();
                float f7 = 14;
                Modifier modifierM1343paddingVpY3zN4 = PaddingKt.m1343paddingVpY3zN4(c6385j.f102749a.a(modifierWrapContentSize$default.then(BackgroundKt.m1168backgroundbw27NRU(companion, j7, RoundedCornerShapeKt.m1502RoundedCornerShape0680j_4(Dp.m3880constructorimpl(f7))))), Dp.m3880constructorimpl(27), Dp.m3880constructorimpl(5));
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getCenter(), companion2.getCenterVertically(), composerStartRestartGroup, 54);
                int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1343paddingVpY3zN4);
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
                O4.d.c(companion3, composerM2296constructorimpl3, measurePolicyRowMeasurePolicy, composerM2296constructorimpl3, currentCompositionLocalMap3);
                Updater.m2304setimpl(composerM2296constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion3, composerM2296constructorimpl3, Integer.valueOf(iHashCode3), composerM2296constructorimpl3));
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                TextVo textVo3 = c6385j.f102750b;
                String strI = textVo3.i();
                if (strI == null || strI.length() <= 0) {
                    strI = null;
                }
                if (strI == null) {
                    composerStartRestartGroup.startReplaceGroup(-1982973495);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    BiliImageKt.BiliImage(Fa.A.a(composerStartRestartGroup, -1982973494, strI).colorFilter(ColorFilter.Companion.m2671tintxETnrds$default(ColorFilter.Companion, biliTheme.getColors(composerStartRestartGroup, i13).getBrand_pink-0d7_KjU(), 0, 2, null)).build(), SizeKt.m1372size3ABfNKs(companion, Dp.m3880constructorimpl(f7)), (String) null, (Lifecycle) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function2) null, (Function4) null, composerStartRestartGroup, 48, 1020);
                    Unit unit3 = Unit.INSTANCE;
                    composerStartRestartGroup.endReplaceGroup();
                }
                TextKt.m1772Text4IGK_g(textVo3.f102705a, SizeKt.wrapContentSize$default(companion, null, false, 3, null), biliTheme.getColors(composerStartRestartGroup, i13).getGraph_white-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, biliTheme.getTextStyle(composerStartRestartGroup, i13).getT14(), composerStartRestartGroup, 48, 3072, 57336);
                composerStartRestartGroup.endNode();
                I0.a(12, 6, composerStartRestartGroup, companion);
            }
            if (z7) {
                composerStartRestartGroup.startReplaceGroup(-1274941801);
                if (com.bilibili.ship.theseus.united.page.screensize.b.d(windowSizeClass)) {
                    composerStartRestartGroup.startReplaceGroup(-1274816189);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1274901718);
                    I0.a(48, 6, composerStartRestartGroup, companion);
                }
                d(m7, composerStartRestartGroup, (i12 & 14) | ((i12 >> 9) & 112));
                if (com.bilibili.ship.theseus.united.page.screensize.b.c(windowSizeClass) || com.bilibili.ship.theseus.united.page.screensize.b.b(windowSizeClass)) {
                    composerStartRestartGroup.startReplaceGroup(-1274680502);
                    I0.a(38, 6, composerStartRestartGroup, companion);
                } else if (com.bilibili.ship.theseus.united.page.screensize.b.a(windowSizeClass)) {
                    composerStartRestartGroup.startReplaceGroup(-1274545466);
                    SpacerKt.Spacer(SizeKt.m1358height3ABfNKs(companion, Dp.m3880constructorimpl((windowSizeClass.getMinHeightDp() * 0.35f) - BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_HAND_DET_SCORE_THRESHOLD)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1274425341);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1274407485);
                composerStartRestartGroup.endReplaceGroup();
            }
            composer2 = composerStartRestartGroup;
            if (C4162p.a(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
                composer2 = composerStartRestartGroup;
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(this, m7, z6, windowSizeClass, z7, i7) { // from class: com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.o

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final C6407p f102876a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final com.bilibili.ship.theseus.united.page.restrictionlayer.M f102877b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final boolean f102878c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final WindowSizeClass f102879d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final boolean f102880e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final int f102881f;

                {
                    this.f102876a = this;
                    this.f102877b = m7;
                    this.f102878c = z6;
                    this.f102879d = windowSizeClass;
                    this.f102880e = z7;
                    this.f102881f = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f102881f | 1);
                    WindowSizeClass windowSizeClass2 = this.f102879d;
                    boolean z11 = this.f102880e;
                    this.f102876a.e(this.f102877b, this.f102878c, windowSizeClass2, z11, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
