package com.bilibili.ogv.filmlist.guide;

import com.bilibili.framework.exposure.core.ExposureLayoutInfo;
import com.bilibili.framework.exposure.core.ExposureLayoutInfoReceiver;
import com.bilibili.framework.exposure.core.transformer.ExposureAreaVisibilityTransformerKt;
import kntr.base.config.SerializableSharedPreferencesProperty;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/filmlist/guide/c.class */
public final class c implements ExposureLayoutInfoReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SerializableSharedPreferencesProperty<Boolean> f67710a;

    public c(SerializableSharedPreferencesProperty<Boolean> serializableSharedPreferencesProperty) {
        this.f67710a = serializableSharedPreferencesProperty;
    }

    public final void onNewLayoutInfoReceived(ExposureLayoutInfo exposureLayoutInfo) {
        if (ExposureAreaVisibilityTransformerKt.noticeableWhenAreaRatioIsAtLeast(exposureLayoutInfo, 1.0f)) {
            this.f67710a.setValue((Object) null, d.f67711a[0], Boolean.TRUE);
        }
    }
}
