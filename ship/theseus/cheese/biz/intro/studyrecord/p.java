package com.bilibili.ship.theseus.cheese.biz.intro.studyrecord;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.H;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.framework.exposure.core.collecter.ComposeExposureLayoutInfoCollectorKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/studyrecord/p.class */
public final /* synthetic */ class p implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f90259a;

    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-361309281, iIntValue, -1, "com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.CheeseStudyRecordComponent.bindToView.<anonymous>.<anonymous> (CheeseStudyRecordComponent.kt:87)");
            }
            w wVar = this.f90259a;
            StudyRecord studyRecord = (StudyRecord) SnapshotStateKt.collectAsState(wVar.f90282a, null, composer, 0, 1).getValue();
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
            BiliTheme biliTheme = BiliTheme.INSTANCE;
            int i7 = BiliTheme.$stable;
            wVar.d(studyRecord, wVar.f90283b, wVar.f90285d, ComposeExposureLayoutInfoCollectorKt.collectExposureLayoutInfo(PaddingKt.m1342padding3ABfNKs(H.a(6, PaddingKt.m1344paddingVpY3zN4$default(BackgroundKt.m1169backgroundbw27NRU$default(modifierFillMaxWidth$default, biliTheme.getColors(composer, i7).getBg2-0d7_KjU(), null, 2, null), 0.0f, Dp.m3880constructorimpl(3), 1, null), biliTheme.getColors(composer, i7).getBg1-0d7_KjU()), Dp.m3880constructorimpl(10)), new ExposureEntry(com.bilibili.ship.theseus.cheese.biz.report.c.f90463a, wVar.f90284c)), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
