package com.bilibili.ship.theseus.ogv.media;

import Di0.C1602f;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.J;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.lib.theme.R$color;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.ship.theseus.united.page.playviewextra.PlayerToastVo;
import com.bilibili.ship.theseus.united.page.restrictionlayer.TextVo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/media/c.class */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final KProperty<Object>[] f94009a = {new MutablePropertyReference0Impl(c.class, "lastSeenDate", "getLastSeenDate()Ljava/lang/String;", 1)};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Cj0.e f94010b = Cj0.f.e(com.bilibili.ship.theseus.ogv.w.f94906a, "lastSeenAIEnhancedQualityReminderDate");

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(PlayerToastVo playerToastVo, final C6210a c6210a, Modifier modifier, Composer composer, int i7) {
        int i8;
        Object obj;
        Composer composerStartRestartGroup = composer.startRestartGroup(-790518404);
        if ((i7 & 6) == 0) {
            i8 = i7 | ((i7 & 8) == 0 ? composerStartRestartGroup.changed(playerToastVo) : composerStartRestartGroup.changedInstance(playerToastVo) ? 4 : 2);
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changedInstance(c6210a) ? 32 : 16);
        }
        int i10 = i9 | 384;
        if (composerStartRestartGroup.shouldExecute((i10 & 147) != 146, i10 & 1)) {
            Modifier.Companion companion = Modifier.Companion;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-790518404, i10, -1, "com.bilibili.ship.theseus.ogv.media.PlayerToast (AIEnhancedQualityReminderToastService.kt:130)");
            }
            Color.Companion companion2 = Color.Companion;
            Modifier modifierWrapContentSize$default = SizeKt.wrapContentSize$default(PaddingKt.m1344paddingVpY3zN4$default(BackgroundKt.m1168backgroundbw27NRU(companion, Color.m2628copywmQWz5c$default(companion2.m2655getBlack0d7_KjU(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.RoundedCornerShape(new C.e(Dp.m3880constructorimpl(4)))), 0.0f, Dp.m3880constructorimpl(8), 1, null), null, false, 3, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composerStartRestartGroup, 48);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWrapContentSize$default);
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
            float f7 = 12;
            J.a(f7, 6, composerStartRestartGroup, companion);
            ImageKt.Image(Ij0.c.a(2131240927, composerStartRestartGroup, 0), (String) null, SizeKt.m1372size3ABfNKs(companion, Dp.m3880constructorimpl(16)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKIN_SEGMENT_MIN_THRESHOLD, 120);
            SpacerKt.Spacer(SizeKt.m1377width3ABfNKs(companion, Dp.m3880constructorimpl(6)), composerStartRestartGroup, 6);
            TextVo textVoA = playerToastVo.a();
            if (textVoA == null) {
                composerStartRestartGroup.startReplaceGroup(911635909);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(911635910);
                TextKt.m1772Text4IGK_g(textVoA.f102705a, rowScopeInstance.weight(companion, 1.0f, false), companion2.m2666getWhite0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m3827getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, BiliTheme.INSTANCE.getTextStyle(composerStartRestartGroup, BiliTheme.$stable).getT12(), composerStartRestartGroup, 384, 3120, 55288);
                composerStartRestartGroup.endReplaceGroup();
            }
            J.a(10, 6, composerStartRestartGroup, companion);
            final TextVo textVo = playerToastVo.f102390b;
            if (textVo == null) {
                composerStartRestartGroup.startReplaceGroup(912024742);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(912024743);
                boolean z6 = (i10 & 112) == 32;
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(textVo);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if ((zChangedInstance | z6) || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new Function0(c6210a, textVo) { // from class: com.bilibili.ship.theseus.ogv.media.b

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final C6210a f94007a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final TextVo f94008b;

                        {
                            this.f94007a = c6210a;
                            this.f94008b = textVo;
                        }

                        public final Object invoke() {
                            this.f94007a.invoke(this.f94008b);
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                TextKt.m1772Text4IGK_g(textVo.f102705a, ClickableKt.m1186clickableoSLSa3U$default(companion, false, null, null, null, (Function0) objRememberedValue, 15, null), ColorResources_androidKt.colorResource(R$color.Brand_pink, composerStartRestartGroup, 0), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, BiliTheme.INSTANCE.getTextStyle(composerStartRestartGroup, BiliTheme.$stable).getT12(), composerStartRestartGroup, 0, 0, 65528);
                composerStartRestartGroup.endReplaceGroup();
            }
            SpacerKt.Spacer(SizeKt.m1377width3ABfNKs(companion, Dp.m3880constructorimpl(f7)), composerStartRestartGroup, 6);
            composerStartRestartGroup.endNode();
            obj = companion;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                obj = companion;
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            obj = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.bilibili.playset.detail.b(i7, 1, playerToastVo, obj, c6210a));
        }
    }
}
