package com.bilibili.ship.theseus.united.page.intro.module.relate;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.compose.theme.ThemeStrategy;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/U.class */
public final class U extends com.bilibili.ship.theseus.united.utils.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DetailRelateService f101069b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(ThemeStrategy themeStrategy, DetailRelateService detailRelateService) {
        super(themeStrategy);
        this.f101069b = detailRelateService;
    }

    @Override // com.bilibili.ship.theseus.united.utils.a
    @Composable
    public final void a(Modifier.Companion companion, Composer composer) {
        long jA;
        composer.startReplaceGroup(1849522600);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1849522600, 6, -1, "com.bilibili.ship.theseus.united.utils.BiliComposeUIComponent.<no name provided>.Content (BiliComposeUIComponent.kt:18)");
        }
        composer.startReplaceGroup(-1444134745);
        Integer numF = this.f101069b.f100871f.f();
        Color colorA = numF != null ? xu0.c.a(numF) : null;
        if (colorA == null) {
            composer.startReplaceGroup(-185129721);
            jA = BiliTheme.INSTANCE.getColors(composer, BiliTheme.$stable).getGraph_bg_regular-0d7_KjU();
            composer.endReplaceGroup();
        } else {
            jA = com.bilibili.ad.adview.videodetail.pausedpage.brand.loopcard.t.a(composer, -185132015, colorA);
        }
        G21.i.e(48, 0, jA, composer, companion);
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }
}
