package com.bilibili.ship.theseus.cheese.biz.intro.pack;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.compose.theme.ThemeDayNight;
import com.bilibili.search2.api.SearchBangumiItem;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/pack/q.class */
public final class q implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f89565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CheesePackageLayerComponent f89566b;

    public q(List list, CheesePackageLayerComponent cheesePackageLayerComponent) {
        this.f89565a = list;
        this.f89566b = cheesePackageLayerComponent;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i7;
        LazyItemScope lazyItemScope = (LazyItemScope) obj;
        int iIntValue = ((Number) obj2).intValue();
        Composer composer = (Composer) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i7 = (composer.changed(lazyItemScope) ? 4 : 2) | iIntValue2;
        } else {
            i7 = iIntValue2;
        }
        int i8 = i7;
        if ((iIntValue2 & 48) == 0) {
            i8 = i7 | (composer.changed(iIntValue) ? 32 : 16);
        }
        if (composer.shouldExecute((i8 & 147) != 146, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2039820996, i8, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
            }
            t tVar = (t) this.f89565a.get(iIntValue);
            composer.startReplaceGroup(-1514270496);
            BiliTheme biliTheme = BiliTheme.INSTANCE;
            int i9 = BiliTheme.$stable;
            Pair<Color, Color> pair = new Pair<>(Color.m2619boximpl(biliTheme.getColors(composer, i9).getGa1-0d7_KjU()), Color.m2619boximpl(biliTheme.getColors(composer, i9).getGa2-0d7_KjU()));
            boolean z6 = biliTheme.getDayNightTheme(composer, i9) == ThemeDayNight.Night;
            int i10 = CheesePackageLayerComponent.f89479d;
            this.f89566b.b(iIntValue, tVar, pair, z6, composer, ((i8 & SearchBangumiItem.TYPE_FULLNET_MOVIE) >> 3) & 14);
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
