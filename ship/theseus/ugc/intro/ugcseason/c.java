package com.bilibili.ship.theseus.ugc.intro.ugcseason;

import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.LottieValueCallback;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcseason/c.class */
public final class c extends LottieValueCallback<ColorFilter> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f97469c;

    public c(Integer num) {
        this.f97469c = num;
    }

    @Override // com.airbnb.lottie.value.LottieValueCallback
    public final ColorFilter getValue(LottieFrameInfo<ColorFilter> lottieFrameInfo) {
        return new PorterDuffColorFilter(this.f97469c.intValue(), PorterDuff.Mode.SRC_IN);
    }
}
