package com.bilibili.playset.detail.widget;

import Di0.C1602f;
import I3.P2;
import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.IconKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Dp;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.iconfont.KtxKt;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.google.accompanist.drawablepainter.DrawablePainterKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.compose.resources.StringResource;
import org.jetbrains.compose.resources.StringResourcesKt;

/* JADX INFO: renamed from: com.bilibili.playset.detail.widget.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/widget/f.class */
public final class C5921f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f84633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f84634b = ComposableLambdaKt.composableLambdaInstance(-130307200, false, new com.bilibili.ad.adview.story.card.card53.select.basic.z(1));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f84635c = ComposableLambdaKt.composableLambdaInstance(1125674601, false, new Object());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f84636d = ComposableLambdaKt.composableLambdaInstance(-747538936, false, new Object());

    static {
        final int i7 = 0;
        f84633a = ComposableLambdaKt.composableLambdaInstance(-1727847995, false, new Function2(i7) { // from class: com.bilibili.playset.detail.widget.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f84632a;

            {
                this.f84632a = i7;
            }

            public final Object invoke(Object obj, Object obj2) {
                switch (this.f84632a) {
                    case 0:
                        Composer composer = (Composer) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (composer.shouldExecute((iIntValue & 3) != 2, 1 & iIntValue)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1727847995, iIntValue, -1, "com.bilibili.playset.detail.widget.ComposableSingletons$MultiTypeListDetailHeadContentKt.lambda$-1727847995.<anonymous> (MultiTypeListDetailHeadContent.kt:79)");
                            }
                            IconKt.m1714Iconww6aTOc(DrawablePainterKt.rememberDrawablePainter(KtxKt.getAppCompatDrawable((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()), 2131238660), composer, 0), (String) null, SizeKt.m1372size3ABfNKs(Modifier.Companion, Dp.m3880constructorimpl(24)), BiliTheme.INSTANCE.getColors(composer, BiliTheme.$stable).getText2-0d7_KjU(), composer, Painter.$stable | BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKIN_SEGMENT_MIN_THRESHOLD, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer.skipToGroupEnd();
                        }
                        break;
                    default:
                        Composer composer2 = (Composer) obj;
                        int iIntValue2 = ((Integer) obj2).intValue();
                        if (composer2.shouldExecute((iIntValue2 & 3) != 2, 1 & iIntValue2)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-215180641, iIntValue2, -1, "kntr.watch.later.watchlaterold.edit.ComposableSingletons$FavoritesFolderBottomSheetKt.lambda$-215180641.<anonymous> (FavoritesFolderBottomSheet.kt:355)");
                            }
                            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                            Modifier.Companion companion = Modifier.Companion;
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
                            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, companion);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                            O4.d.c(companion2, composerM2296constructorimpl, measurePolicyRowMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
                            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            ProgressIndicatorKt.m2046CircularProgressIndicator4lLiAd8(SizeKt.m1372size3ABfNKs(companion, Dp.m3880constructorimpl(24)), 0L, 0.0f, 0L, 0, 0.0f, composer2, 6, 62);
                            com.bilibili.ad.adview.liveroom.answer.fragment.compont.q.a(16, 6, composer2, companion);
                            TextKt.m2186TextNvy7gAk(StringResourcesKt.stringResource((StringResource) P2.f9778h2.getValue(), composer2, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 0, 0, 262142);
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer2.skipToGroupEnd();
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        });
    }
}
