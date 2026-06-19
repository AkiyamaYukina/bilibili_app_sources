package com.bilibili.ship.theseus.cheese.biz.report;

import com.bilibili.framework.exposure.core.transformer.ExposureAreaVisibilityTransformerKt;
import com.bilibili.framework.exposure.core.transformer.ExposureVisibleDurationTransformerKt;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/report/b.class */
public final /* synthetic */ class b implements Function1 {
    public final Object invoke(Object obj) {
        return ExposureVisibleDurationTransformerKt.exposeImmediatelyWhenNoticeable(ExposureAreaVisibilityTransformerKt.noticeableWhenAreaPixelIsAtLeast((Flow) obj, 1));
    }
}
