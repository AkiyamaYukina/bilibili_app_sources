package com.bilibili.ogv.operation3.module.feedback;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material3.DividerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import com.bilibili.compose.theme.BiliTheme;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/feedback/u.class */
public final class u implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f71251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f71252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f71253c;

    public u(List list, List list2, Function1 function1) {
        this.f71251a = list;
        this.f71252b = function1;
        this.f71253c = list2;
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
            w wVar = (w) this.f71251a.get(iIntValue);
            composer.startReplaceGroup(-1484754210);
            v.b(wVar, this.f71252b, SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), composer, 384);
            if (iIntValue < CollectionsKt.getLastIndex(this.f71253c)) {
                composer.startReplaceGroup(-1484606899);
                DividerKt.m2008HorizontalDivider9IZ8Weo(null, Dp.m3880constructorimpl((float) 0.5d), BiliTheme.INSTANCE.getColors(composer, BiliTheme.$stable).getLine_regular-0d7_KjU(), composer, 48, 1);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1484432276);
                composer.endReplaceGroup();
            }
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
