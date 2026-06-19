package com.bilibili.ship.theseus.united.page.toolbar.actionview.projection;

import com.bilibili.framework.exposure.core.transformer.ExposureAreaVisibilityTransformerKt;
import com.bilibili.framework.exposure.core.transformer.ExposureVisibleDurationTransformerKt;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/actionview/projection/a.class */
public final /* synthetic */ class a implements Function1 {
    public final Object invoke(Object obj) {
        int i7 = b.f103374d;
        return ExposureVisibleDurationTransformerKt.exposeImmediatelyWhenNoticeable(ExposureAreaVisibilityTransformerKt.noticeableWhenAreaPixelIsAtLeast((Flow) obj, 1));
    }
}
