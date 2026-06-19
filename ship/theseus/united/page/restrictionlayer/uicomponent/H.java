package com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/uicomponent/H.class */
public final /* synthetic */ class H implements Function4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f102787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ComposableLambda f102788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function2 f102789c;

    public /* synthetic */ H(List list, ComposableLambda composableLambda, Function2 function2) {
        this.f102787a = list;
        this.f102788b = composableLambda;
        this.f102789c = function2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        List list = this.f102787a;
        int iIntValue = ((Integer) obj2).intValue();
        Composer composer = (Composer) obj3;
        int iIntValue2 = ((Integer) obj4).intValue();
        int i7 = iIntValue2;
        if ((iIntValue2 & 48) == 0) {
            i7 = iIntValue2 | (composer.changed(iIntValue) ? 32 : 16);
        }
        if (composer.shouldExecute((i7 & 145) != 144, i7 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-912499471, i7, -1, "com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.RestrictionPlaylistUIComponent.AutoScrollingLazyRow.<anonymous>.<anonymous>.<anonymous> (RestrictionPlaylistUIComponent.kt:273)");
            }
            this.f102788b.invoke(list.get(iIntValue % list.size()), composer, 0);
            this.f102789c.invoke(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
