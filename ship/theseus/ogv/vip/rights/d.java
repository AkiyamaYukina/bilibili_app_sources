package com.bilibili.ship.theseus.ogv.vip.rights;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.bilibili.bililive.biz.interactions.popularredpacket.view.record.k;
import com.bilibili.compose.theme.BiliThemeKt;
import com.bilibili.compose.theme.ThemeStrategy;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/vip/rights/d.class */
public final class d {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(@Nullable Composer composer, final int i7, @NotNull final String str) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(1947441572);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 3) != 2, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1947441572, i8, -1, "com.bilibili.ship.theseus.ogv.vip.rights.VipQualityRightsRemindToast (VipQualityRightsToggleRemind.kt:16)");
            }
            BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(1269750620, true, new k(str, 1), composerStartRestartGroup, 54), composerStartRestartGroup, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(str, i7) { // from class: com.bilibili.ship.theseus.ogv.vip.rights.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f94904a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f94905b;

                {
                    this.f94904a = str;
                    this.f94905b = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    d.a((Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f94905b | 1), this.f94904a);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
