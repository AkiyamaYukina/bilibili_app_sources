package com.bilibili.ship.theseus.united.page.intro.module.relate;

import com.bilibili.framework.exposure.core.transformer.ExposureAreaVisibilityTransformerKt;
import com.bilibili.framework.exposure.core.transformer.ExposureVisibleDurationTransformerKt;
import kotlin.jvm.functions.Function1;
import kotlin.time.Duration;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/C.class */
public final /* synthetic */ class C implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DetailRelateService f100823a;

    public final Object invoke(Object obj) {
        DetailRelateService detailRelateService = this.f100823a;
        detailRelateService.getClass();
        return FlowKt.take(ExposureVisibleDurationTransformerKt.exposeIfNoticeableFor-HG0u8IE(ExposureAreaVisibilityTransformerKt.noticeableWhenAreaPixelIsAtLeast(FlowKt.combine((Flow) obj, detailRelateService.f100884t, new DetailRelateService$excludeWhenFloatShowing$1(null)), 1), Duration.Companion.getZERO-UwyO8pc()), 1);
    }
}
