package com.bilibili.ship.theseus.cheese.biz.intro.studyrecord;

import Di0.C1602f;
import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.animation.C3353d;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupProperties;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.H;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.compose.theme.BiliThemeKt;
import com.bilibili.compose.theme.GarbInfo;
import java.util.List;
import kntr.app.ad.biz.videodetail.pausedpage.ui.modules.l0;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/studyrecord/w.class */
@StabilityInferred(parameters = 0)
public final class w implements UIComponent<UIComponent.b<ComposeView>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow f90282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final z f90283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ZF0.i f90284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Md.d f90285d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/studyrecord/w$a.class */
    public static final class a implements androidx.compose.ui.window.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f90286a;

        public a(int i7) {
            this.f90286a = i7;
        }

        @Override // androidx.compose.ui.window.n
        public final long a(y0.g gVar, long j7, LayoutDirection layoutDirection, long j8) {
            return IntOffset.m3940constructorimpl((((long) (gVar.f129543a - this.f90286a)) << 32) | (((long) gVar.f129546d) & 4294967295L));
        }
    }

    public w(@NotNull MutableStateFlow mutableStateFlow, @NotNull z zVar, @NotNull ZF0.i iVar, @NotNull Md.d dVar) {
        this.f90282a = mutableStateFlow;
        this.f90283b = zVar;
        this.f90284c = iVar;
        this.f90285d = dVar;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void a(final int i7, Composer composer, final Modifier modifier, final List list) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-420634266);
        int i8 = (i7 & 6) == 0 ? (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i7 : i7;
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(modifier) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changedInstance(this) ? 256 : 128);
        }
        int i11 = 0;
        if (composerStartRestartGroup.shouldExecute((i10 & 147) != 146, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-420634266, i10, -1, "com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.CheeseStudyRecordComponent.BarChart (CheeseStudyRecordComponent.kt:228)");
            }
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composerStartRestartGroup, 0);
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
            Float fMaxOrNull = CollectionsKt.maxOrNull(list);
            float fMin = Math.min(Math.max((fMaxOrNull != null ? fMaxOrNull.floatValue() : 0.0f) * 1.2f, 10.0f), 240.0f);
            composerStartRestartGroup.startReplaceGroup(1413909599);
            for (Object obj : list) {
                if (i11 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                float fMin2 = Math.min(((Number) obj).floatValue() / fMin, 1.0f);
                Modifier.Companion companion2 = Modifier.Companion;
                b(Fa.z.a(15, companion2, 0.0f, 1, (Object) null), fMin2, composerStartRestartGroup, (i10 & 896) | 48);
                if (i11 < CollectionsKt.getLastIndex(list)) {
                    composerStartRestartGroup.startReplaceGroup(343866332);
                    H0.e.a(6, 6, composerStartRestartGroup, companion2);
                } else {
                    composerStartRestartGroup.startReplaceGroup(343942251);
                    composerStartRestartGroup.endReplaceGroup();
                }
                i11++;
            }
            if (C3353d.c(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i12 = 0;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(this, list, modifier, i7, i12) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.t

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f90271a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Modifier f90272b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f90273c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Object f90274d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final Object f90275e;

                {
                    this.f90271a = i12;
                    this.f90274d = this;
                    this.f90275e = list;
                    this.f90272b = modifier;
                    this.f90273c = i7;
                }

                public final Object invoke(Object obj2, Object obj3) {
                    switch (this.f90271a) {
                        case 0:
                            List list2 = (List) this.f90275e;
                            ((Integer) obj3).getClass();
                            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f90273c | 1);
                            ((w) this.f90274d).a(iUpdateChangedFlags, (Composer) obj2, this.f90272b, list2);
                            break;
                        default:
                            ((Integer) obj3).getClass();
                            l0.a(RecomposeScopeImplKt.updateChangedFlags(this.f90273c | 1), (Composer) obj2, this.f90272b, (Function0) this.f90275e, (Function1) this.f90274d);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void b(final Modifier modifier, final float f7, Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1464958041);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(f7) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(modifier) ? 32 : 16);
        }
        if (composerStartRestartGroup.shouldExecute((i9 & 19) != 18, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1464958041, i9, -1, "com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.CheeseStudyRecordComponent.BarItem (CheeseStudyRecordComponent.kt:252)");
            }
            final boolean zC = UW.g.c((GarbInfo) composerStartRestartGroup.consume(BiliThemeKt.getLocalTheme()));
            BoxWithConstraintsKt.BoxWithConstraints(modifier, Alignment.Companion.getBottomCenter(), false, ComposableLambdaKt.rememberComposableLambda(-1396307439, true, new Function3(zC, f7) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.u

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final boolean f90276a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final float f90277b;

                {
                    this.f90276a = zC;
                    this.f90277b = f7;
                }

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    BoxWithConstraintsScope boxWithConstraintsScope = (BoxWithConstraintsScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    int i10 = iIntValue;
                    if ((iIntValue & 6) == 0) {
                        i10 = iIntValue | (composer2.changed(boxWithConstraintsScope) ? 4 : 2);
                    }
                    if (composer2.shouldExecute((i10 & 19) != 18, i10 & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1396307439, i10, -1, "com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.CheeseStudyRecordComponent.BarItem.<anonymous> (CheeseStudyRecordComponent.kt:258)");
                        }
                        Modifier.Companion companion = Modifier.Companion;
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                        boolean z6 = this.f90276a;
                        long j7 = z6 ? 4280164386L : 4294375416L;
                        float f8 = 2;
                        SpacerKt.Spacer(H.a(f8, modifierFillMaxSize$default, ColorKt.Color(j7)), composer2, 0);
                        SpacerKt.Spacer(BackgroundKt.background$default(SizeKt.m1358height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3880constructorimpl(boxWithConstraintsScope.mo1316getMaxHeightD9Ej5fM() * this.f90277b)), Brush.Companion.m2579verticalGradient8A3gB4$default(Brush.Companion, CollectionsKt.listOf(new Color[]{Color.m2619boximpl(Color.m2628copywmQWz5c$default(ColorKt.Color(4294928025L), z6 ? 0.6f : 1.0f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m2619boximpl(Color.m2628copywmQWz5c$default(ColorKt.Color(4294948277L), z6 ? 0.6f : 1.0f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 0.0f, 0, 14, (Object) null), RoundedCornerShapeKt.m1502RoundedCornerShape0680j_4(Dp.m3880constructorimpl(f8)), 0.0f, 4, null), composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer2.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i9 >> 3) & 14) | 3120, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(this, f7, modifier, i7) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.v

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final w f90278a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final float f90279b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Modifier f90280c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final int f90281d;

                {
                    this.f90278a = this;
                    this.f90279b = f7;
                    this.f90280c = modifier;
                    this.f90281d = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f90281d | 1);
                    float f8 = this.f90279b;
                    Modifier modifier2 = this.f90280c;
                    this.f90278a.b(modifier2, f8, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        ((ComposeView) ((UIComponent.b) viewEntry).a).setContent(ComposableLambdaKt.composableLambdaInstance(-1616706473, true, new com.bilibili.ad.adview.liveroom.card.ui.enterprise.c(this, 1)));
        return Unit.INSTANCE;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void c(final String str, final Function0<Unit> function0, Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(557936278);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changedInstance(function0) ? 32 : 16);
        }
        if (composerStartRestartGroup.shouldExecute((i9 & 19) != 18, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(557936278, i9, -1, "com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.CheeseStudyRecordComponent.DetailInfoPopup (CheeseStudyRecordComponent.kt:287)");
            }
            AndroidPopup_androidKt.Popup(new a(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo1265roundToPx0680j_4(Dp.m3880constructorimpl(12))), function0, new PopupProperties(false, false, false, false, 15, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(-93343304, true, new Function2(str) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.r

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f90266a;

                {
                    this.f90266a = str;
                }

                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (composer2.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-93343304, iIntValue, -1, "com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.CheeseStudyRecordComponent.DetailInfoPopup.<anonymous> (CheeseStudyRecordComponent.kt:308)");
                        }
                        Modifier.Companion companion = Modifier.Companion;
                        Modifier modifierM1379widthInVpY3zN4$default = SizeKt.m1379widthInVpY3zN4$default(PaddingKt.m1346paddingqDBjuR0$default(companion, 0.0f, Dp.m3880constructorimpl(2), 0.0f, 0.0f, 13, null), 0.0f, Dp.m3880constructorimpl(172), 1, null);
                        Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                        Alignment.Companion companion2 = Alignment.Companion;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer2, 0);
                        int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM1379widthInVpY3zN4$default);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM2296constructorimpl = Updater.m2296constructorimpl(composer2);
                        O4.d.c(companion3, composerM2296constructorimpl, measurePolicyColumnMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
                        Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion3, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        Painter painterA = Ij0.c.a(2131244875, composer2, 0);
                        ColorFilter colorFilterM2671tintxETnrds$default = ColorFilter.Companion.m2671tintxETnrds$default(ColorFilter.Companion, Color.m2628copywmQWz5c$default(ColorKt.Color(4281283128L), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), 0, 2, null);
                        Modifier modifierM1377width3ABfNKs = SizeKt.m1377width3ABfNKs(PaddingKt.m1346paddingqDBjuR0$default(companion, Dp.m3880constructorimpl(12), 0.0f, 0.0f, 0.0f, 14, null), Dp.m3880constructorimpl(16));
                        float f7 = 6;
                        ImageKt.Image(painterA, (String) null, SizeKt.m1358height3ABfNKs(modifierM1377width3ABfNKs, Dp.m3880constructorimpl(f7)), (Alignment) null, (ContentScale) null, 0.0f, colorFilterM2671tintxETnrds$default, composer2, Painter.$stable | 1573296, 56);
                        float f8 = 4;
                        Modifier modifierM1343paddingVpY3zN4 = PaddingKt.m1343paddingVpY3zN4(BackgroundKt.m1169backgroundbw27NRU$default(com.bilibili.ad.adview.videodetail.endpage.cards.A.a(f8, companion), Color.m2628copywmQWz5c$default(ColorKt.Color(4281283128L), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m3880constructorimpl(f7), Dp.m3880constructorimpl(f8));
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                        int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierM1343paddingVpY3zN4);
                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM2296constructorimpl2 = Updater.m2296constructorimpl(composer2);
                        O4.d.c(companion3, composerM2296constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM2296constructorimpl2, currentCompositionLocalMap2);
                        Updater.m2304setimpl(composerM2296constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion3, composerM2296constructorimpl2, Integer.valueOf(iHashCode2), composerM2296constructorimpl2));
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        TextKt.m1772Text4IGK_g(this.f90266a, (Modifier) companion, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TextStyle.m3586copyp1EtxEg$default(BiliTheme.INSTANCE.getTextStyle(composer2, BiliTheme.$stable).getT10(), ColorKt.Color(4291415248L), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), composer2, 48, 0, 65532);
                        if (C4162p.a(composer2)) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer2.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i9 & 112) | 3456, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(this, str, function0, i7) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.s

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final w f90267a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f90268b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Function0 f90269c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final int f90270d;

                {
                    this.f90267a = this;
                    this.f90268b = str;
                    this.f90269c = function0;
                    this.f90270d = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f90270d | 1);
                    this.f90267a.c(this.f90268b, this.f90269c, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new UIComponent.b(composeView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0858  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(@org.jetbrains.annotations.NotNull final com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.StudyRecord r27, @org.jetbrains.annotations.NotNull final com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.z r28, @org.jetbrains.annotations.NotNull final Md.d r29, @org.jetbrains.annotations.Nullable final androidx.compose.ui.Modifier r30, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r31, final int r32) {
        /*
            Method dump skipped, instruction units count: 2485
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.w.d(com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.StudyRecord, com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.z, Md.d, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):void");
    }
}
