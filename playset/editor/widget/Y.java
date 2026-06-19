package com.bilibili.playset.editor.widget;

import Di0.C1602f;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.selection.P0;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/editor/widget/Y.class */
public final class Y implements G.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScrollState f84975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final State<Float> f84976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final G.l f84977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f84978d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextStyle f84979e;

    public Y(ScrollState scrollState, State<Float> state, G.l lVar, String str, TextStyle textStyle) {
        this.f84975a = scrollState;
        this.f84976b = state;
        this.f84977c = lVar;
        this.f84978d = str;
        this.f84979e = textStyle;
    }

    @Override // G.j
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public final void a(final int i7, Composer composer, final ComposableLambda composableLambda) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-931797321);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(composableLambda) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(this) ? 32 : 16);
        }
        if (composerStartRestartGroup.shouldExecute((i9 & 19) != 18, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-931797321, i9, -1, "com.bilibili.playset.editor.widget.EditorScrollableTextField.<no name provided>.Decoration (PlaySetEditorTextField.kt:161)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
            final float fFloatValue = this.f84976b.getValue().floatValue();
            final long jColor = ColorKt.Color(4292467161L);
            final float fM3880constructorimpl = Dp.m3880constructorimpl(3);
            final float fM3880constructorimpl2 = Dp.m3880constructorimpl(0);
            final ScrollState scrollState = this.f84975a;
            Modifier modifierDrawWithContent = DrawModifierKt.drawWithContent(modifierFillMaxWidth$default, new Function1(scrollState, jColor, fFloatValue, fM3880constructorimpl2, fM3880constructorimpl) { // from class: com.bilibili.playset.editor.widget.W

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final ScrollState f84966a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final long f84967b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final float f84968c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final float f84969d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final float f84970e;

                {
                    this.f84966a = scrollState;
                    this.f84967b = jColor;
                    this.f84968c = fFloatValue;
                    this.f84969d = fM3880constructorimpl2;
                    this.f84970e = fM3880constructorimpl;
                }

                public final Object invoke(Object obj) {
                    ContentDrawScope contentDrawScope = (ContentDrawScope) obj;
                    contentDrawScope.drawContent();
                    if (this.f84966a.getMaxValue() > 0) {
                        float fIntBitsToFloat = (Float.intBitsToFloat((int) (contentDrawScope.mo2935getSizeNHjbRc() & 4294967295L)) * Float.intBitsToFloat((int) (contentDrawScope.mo2935getSizeNHjbRc() & 4294967295L))) / RangesKt.coerceAtLeast(Float.intBitsToFloat((int) (contentDrawScope.mo2935getSizeNHjbRc() & 4294967295L)) + r0.getMaxValue(), 20.0f);
                        float value = r0.getValue() / r0.getMaxValue();
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (contentDrawScope.mo2935getSizeNHjbRc() & 4294967295L));
                        long jM2628copywmQWz5c$default = Color.m2628copywmQWz5c$default(this.f84967b, this.f84968c, 0.0f, 0.0f, 0.0f, 14, null);
                        long jM2447constructorimpl = Offset.m2447constructorimpl((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (contentDrawScope.mo2935getSizeNHjbRc() >> 32)) - contentDrawScope.mo1270toPx0680j_4(this.f84969d))) << 32) | (((long) Float.floatToRawIntBits((fIntBitsToFloat2 - fIntBitsToFloat) * value)) & 4294967295L));
                        long jM2518constructorimpl = Size.m2518constructorimpl((((long) Float.floatToRawIntBits(contentDrawScope.mo1270toPx0680j_4(this.f84970e))) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L));
                        float fMo1270toPx0680j_4 = contentDrawScope.mo1270toPx0680j_4(Dp.m3880constructorimpl(2));
                        DrawScope.m2913drawRoundRectuAw5IA$default(contentDrawScope, jM2628copywmQWz5c$default, jM2447constructorimpl, jM2518constructorimpl, CornerRadius.m2425constructorimpl((((long) Float.floatToRawIntBits(fMo1270toPx0680j_4)) << 32) | (((long) Float.floatToRawIntBits(fMo1270toPx0680j_4)) & 4294967295L)), null, 0.0f, null, 0, 240, null);
                    }
                    return Unit.INSTANCE;
                }
            });
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierDrawWithContent);
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
            O4.d.c(companion, composerM2296constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (this.f84977c.c().f6521c.length() == 0) {
                composerStartRestartGroup.startReplaceGroup(1003794009);
                TextKt.m1772Text4IGK_g(this.f84978d, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, this.f84979e, composerStartRestartGroup, 0, 0, 65534);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1003867045);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (P0.b(i9 & 14, composerStartRestartGroup, composableLambda)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i10 = 0;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(this, composableLambda, i7, i10) { // from class: com.bilibili.playset.editor.widget.X

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f84971a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f84972b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Object f84973c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Function3 f84974d;

                {
                    this.f84971a = i10;
                    this.f84973c = this;
                    this.f84974d = composableLambda;
                    this.f84972b = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    int i11 = this.f84971a;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i11) {
                        case 0:
                            ((Y) this.f84973c).a(RecomposeScopeImplKt.updateChangedFlags(this.f84972b | 1), composer2, (ComposableLambda) this.f84974d);
                            break;
                        default:
                            kntr.common.share.biz.guess.I.q((kntr.common.share.biz.guess.J) this.f84973c, this.f84974d, composer2, RecomposeScopeImplKt.updateChangedFlags(this.f84972b | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
