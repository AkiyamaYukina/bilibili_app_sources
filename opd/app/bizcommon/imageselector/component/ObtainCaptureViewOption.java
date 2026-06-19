package com.bilibili.opd.app.bizcommon.imageselector.component;

import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/component/ObtainCaptureViewOption.class */
@StabilityInferred(parameters = 0)
@Keep
public final class ObtainCaptureViewOption {
    public static final int $stable = 8;

    @Nullable
    private Bundle extra;

    @Nullable
    public final Bundle getExtra() {
        return this.extra;
    }

    public final void setExtra(@Nullable Bundle bundle) {
        this.extra = bundle;
    }
}
