package com.bilibili.ship.theseus.ogv.intro.download.ui;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.bilibili.compose.iconfont.BiliIconfont;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.mobile.BLHumanActionParamsType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.download.ui.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/ui/d.class */
public final class C6165d {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0369  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(@org.jetbrains.annotations.NotNull com.bilibili.ship.theseus.ogv.intro.download.ui.b0 r26, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r27, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r28, int r29) {
        /*
            Method dump skipped, instruction units count: 1162
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.intro.download.ui.C6165d.a(com.bilibili.ship.theseus.ogv.intro.download.ui.b0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void b(Composer composer, final int i7, final String str) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(948095553);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 3) != 2, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(948095553, i8, -1, "com.bilibili.ship.theseus.ogv.intro.download.ui.QualityContent (DownloadAudioVideoQualityUI.kt:67)");
            }
            BiliTheme biliTheme = BiliTheme.INSTANCE;
            int i9 = BiliTheme.$stable;
            TextKt.m1772Text4IGK_g(str, (Modifier) null, biliTheme.getColors(composerStartRestartGroup, i9).getText1-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3787boximpl(TextAlign.Companion.m3794getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, biliTheme.getTextStyle(composerStartRestartGroup, i9).getT14(), composerStartRestartGroup, i8 & 14, 0, 65018);
            Modifier.Companion companion = Modifier.Companion;
            com.bilibili.ad.adview.liveroom.answer.fragment.compont.J.a(2, 6, composerStartRestartGroup, companion);
            IconKt.m1714Iconww6aTOc(BiliIconfont.INSTANCE.getArrow_expand_line_900(composerStartRestartGroup, 6), (String) null, SizeKt.m1372size3ABfNKs(companion, Dp.m3880constructorimpl(12)), biliTheme.getColors(composerStartRestartGroup, i9).getText1-0d7_KjU(), composerStartRestartGroup, Painter.$stable | BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKIN_SEGMENT_MIN_THRESHOLD, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(str, i7) { // from class: com.bilibili.ship.theseus.ogv.intro.download.ui.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f92536a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f92537b;

                {
                    this.f92536a = str;
                    this.f92537b = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    C6165d.b((Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f92537b | 1), this.f92536a);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
