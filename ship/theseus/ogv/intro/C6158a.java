package com.bilibili.ship.theseus.ogv.intro;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import com.bilibili.compose.theme.ThemeStrategy;
import com.bilibili.framework.exposure.core.ExposureEntry;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/a.class */
public final class C6158a extends com.bilibili.ship.theseus.united.utils.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C6159b f92290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final P f92291c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6158a(ThemeStrategy themeStrategy, C6159b c6159b, P p7) {
        super(themeStrategy);
        this.f92290b = c6159b;
        this.f92291c = p7;
    }

    @Override // com.bilibili.ship.theseus.united.utils.a
    @Composable
    public final void a(Modifier.Companion companion, Composer composer) {
        composer.startReplaceGroup(1849522600);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1849522600, 6, -1, "com.bilibili.ship.theseus.united.utils.BiliComposeUIComponent.<no name provided>.Content (BiliComposeUIComponent.kt:18)");
        }
        composer.startReplaceGroup(-1006655746);
        State stateCollectAsState = SnapshotStateKt.collectAsState(this.f92290b.f92323e.f100020a, null, composer, 0, 1);
        this.f92291c.a(PaddingKt.m1346paddingqDBjuR0$default(companion, Dp.m3880constructorimpl(((Number) stateCollectAsState.getValue()).intValue()), 0.0f, Dp.m3880constructorimpl(((Number) stateCollectAsState.getValue()).intValue()), Dp.m3880constructorimpl(12), 2, null), composer, ExposureEntry.$stable << 3);
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }
}
