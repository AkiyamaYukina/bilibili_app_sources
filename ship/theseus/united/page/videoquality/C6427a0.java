package com.bilibili.ship.theseus.united.page.videoquality;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import com.bilibili.compose.theme.ThemeStrategy;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.framework.exposure.core.collecter.ComposeExposureLayoutInfoCollectorKt;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videoquality.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/a0.class */
public final class C6427a0 extends com.bilibili.ship.theseus.united.utils.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Painter f103853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Painter f103854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ex0.g f103855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ExposureEntry f103856e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6427a0(ThemeStrategy themeStrategy, Painter painter, Painter painter2, Ex0.g gVar, ExposureEntry exposureEntry) {
        super(themeStrategy);
        this.f103853b = painter;
        this.f103854c = painter2;
        this.f103855d = gVar;
        this.f103856e = exposureEntry;
    }

    @Override // com.bilibili.ship.theseus.united.utils.a
    @Composable
    public final void a(Modifier.Companion companion, Composer composer) {
        composer.startReplaceGroup(1849522600);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1849522600, 6, -1, "com.bilibili.ship.theseus.united.utils.BiliComposeUIComponent.<no name provided>.Content (BiliComposeUIComponent.kt:18)");
        }
        composer.startReplaceGroup(-2048913621);
        Modifier modifierCollectExposureLayoutInfo = ComposeExposureLayoutInfoCollectorKt.collectExposureLayoutInfo(companion, this.f103856e);
        int i7 = Painter.$stable;
        QualityVisionKt.a(this.f103853b, this.f103854c, this.f103855d, modifierCollectExposureLayoutInfo, composer, i7 | (i7 << 3));
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }
}
