package com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.window.core.layout.WindowSizeClass;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/uicomponent/i.class */
public final /* synthetic */ class C6400i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C6407p f102862a;

    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2074772433, iIntValue, -1, "com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.RestrictionChargingPlayableUIComponent.bindToView.<anonymous>.<anonymous> (RestrictionChargingPlayableUIComponent.kt:61)");
            }
            C6407p c6407p = this.f102862a;
            c6407p.a(c6407p.f102882a, ((Boolean) SnapshotStateKt.collectAsState(c6407p.f102885d, Boolean.FALSE, null, composer, 48, 2).getValue()).booleanValue(), (WindowSizeClass) SnapshotStateKt.collectAsState(c6407p.f102887f, null, composer, 0, 1).getValue(), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
