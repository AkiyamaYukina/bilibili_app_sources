package com.bilibili.module.vip.mall;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import com.bilibili.compose.theme.BiliThemeKt;
import com.bilibili.compose.theme.ThemeStrategy;
import com.bilibili.mobile.BLHumanActionParamsType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/mall/v.class */
public final class v {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(@NotNull final String str, @NotNull final Function0<Unit> function0, @Nullable Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(486746078);
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
                ComposerKt.traceEventStart(486746078, i9, -1, "com.bilibili.module.vip.mall.VipBuyLoadingDialog (VipPurchaseLoadingFragment.kt:58)");
            }
            BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(-269927018, true, new Function2(str, function0) { // from class: com.bilibili.module.vip.mall.s

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Function0 f66291a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f66292b;

                {
                    this.f66291a = function0;
                    this.f66292b = str;
                }

                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (composer2.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-269927018, iIntValue, -1, "com.bilibili.module.vip.mall.VipBuyLoadingDialog.<anonymous> (VipPurchaseLoadingFragment.kt:60)");
                        }
                        AndroidDialog_androidKt.Dialog(this.f66291a, new DialogProperties(false, false, false, 5, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(167285791, true, new u(this.f66292b, 0), composer2, 54), composer2, BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKIN_SEGMENT_MIN_THRESHOLD, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer2.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i10 = 0;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(i7, i10, str, function0) { // from class: com.bilibili.module.vip.mall.t

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f66293a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f66294b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Object f66295c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Object f66296d;

                {
                    this.f66293a = i10;
                    this.f66295c = str;
                    this.f66296d = function0;
                    this.f66294b = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    Integer num = (Integer) obj2;
                    switch (this.f66293a) {
                        case 0:
                            num.intValue();
                            v.a((String) this.f66295c, (Function0) this.f66296d, composer2, RecomposeScopeImplKt.updateChangedFlags(this.f66294b | 1));
                            break;
                        default:
                            num.getClass();
                            kntr.app.im.chat.sticker.r.d((kntr.app.im.chat.sticker.s) this.f66295c, (Modifier) this.f66296d, composer2, RecomposeScopeImplKt.updateChangedFlags(this.f66294b | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
