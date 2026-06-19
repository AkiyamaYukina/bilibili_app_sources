package com.bilibili.ship.theseus.united.page.loading;

import G21.i;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.bilibili.compose.theme.ThemeStrategy;
import com.bilibili.ship.theseus.united.page.color.ActivityColorRepository;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/loading/a.class */
public final class a extends com.bilibili.ship.theseus.united.utils.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f102021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TheseusPageLoadingStateService f102022c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ThemeStrategy themeStrategy, boolean z6, TheseusPageLoadingStateService theseusPageLoadingStateService) {
        super(themeStrategy);
        this.f102021b = z6;
        this.f102022c = theseusPageLoadingStateService;
    }

    @Override // com.bilibili.ship.theseus.united.utils.a
    @Composable
    public final void a(Modifier.Companion companion, Composer composer) {
        composer.startReplaceGroup(1849522600);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1849522600, 6, -1, "com.bilibili.ship.theseus.united.utils.BiliComposeUIComponent.<no name provided>.Content (BiliComposeUIComponent.kt:18)");
        }
        composer.startReplaceGroup(1218909959);
        boolean z6 = this.f102021b;
        float fM3880constructorimpl = Dp.m3880constructorimpl(z6 ? 46 : 38);
        long sp = TextUnitKt.getSp(z6 ? 15 : 13);
        FontWeight.Companion companion2 = FontWeight.Companion;
        FontWeight bold = z6 ? companion2.getBold() : companion2.getNormal();
        TheseusPageLoadingStateService theseusPageLoadingStateService = this.f102022c;
        Integer numA = theseusPageLoadingStateService.f102017b.a();
        ActivityColorRepository activityColorRepository = theseusPageLoadingStateService.f102017b;
        i.b(companion, new G21.a(fM3880constructorimpl, sp, bold, activityColorRepository.h(), activityColorRepository.c(), Dp.m3880constructorimpl(z6 ? 4 : 2), z6 ? Dp.m3880constructorimpl(16) : Dp.Companion.m3900getUnspecifiedD9Ej5fM(), numA, activityColorRepository.d(), activityColorRepository.f()), composer, 6);
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }
}
