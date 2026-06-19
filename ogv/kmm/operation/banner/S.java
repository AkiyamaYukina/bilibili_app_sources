package com.bilibili.ogv.kmm.operation.banner;

import com.bilibili.framework.exposure.core.ExposureLayoutInfo;
import com.bilibili.framework.exposure.core.ExposureLayoutInfoReceiver;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/banner/S.class */
public final class S implements ExposureLayoutInfoReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f68046a;

    public S(T t7) {
        this.f68046a = t7;
    }

    public final void onNewLayoutInfoReceived(ExposureLayoutInfo exposureLayoutInfo) {
        this.f68046a.f68047a.setValue(exposureLayoutInfo);
    }
}
