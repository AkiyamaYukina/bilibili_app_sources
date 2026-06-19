package com.bilibili.ogv.kmm.operation.banner;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.ogv.kmm.operation.banner.C5449m;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import nl0.C8106C;

/* JADX INFO: renamed from: com.bilibili.ogv.kmm.operation.banner.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/banner/g.class */
public final class C5443g implements Function3<Modifier, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5449m.a f68114a;

    public C5443g(C5449m.a aVar) {
        this.f68114a = aVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Modifier modifier = (Modifier) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        int i7 = iIntValue;
        if ((iIntValue & 6) == 0) {
            i7 = iIntValue | (composer.changed(modifier) ? 4 : 2);
        }
        if (composer.shouldExecute((i7 & 19) != 18, i7 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1622003413, i7, -1, "com.bilibili.ogv.kmm.operation.banner.BannerModuleSupportModule.provide.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BannerModuleSupportModule.kt:152)");
            }
            C8106C.b(this.f68114a.f68129a.f71391a, com.bilibili.ad.adview.liveroom.answer.fragment.compont.I.a(6, modifier, Dp.m3880constructorimpl(1), Color.m2628copywmQWz5c$default(BiliTheme.INSTANCE.getColors(composer, BiliTheme.$stable).getText_white-0d7_KjU(), 0.25f, 0.0f, 0.0f, 0.0f, 14, null)), 0.0f, 0.0f, composer, 0, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
