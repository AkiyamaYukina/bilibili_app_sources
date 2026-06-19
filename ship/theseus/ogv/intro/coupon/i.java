package com.bilibili.ship.theseus.ogv.intro.coupon;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ObservableInt;
import com.bilibili.ship.theseus.ogv.pay.DialogCoupon;
import com.bilibili.ship.theseus.ogv.pay.PopWinVo;
import com.bilibili.ship.theseus.united.page.restrictionlayer.TextVo;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/coupon/i.class */
@StabilityInferred(parameters = 0)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ObservableInt f92362a = new ObservableInt();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f92363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f92364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final List<DialogCoupon> f92365d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final List<TextVo> f92366e;

    public i(@NotNull PopWinVo popWinVo) {
        TextVo textVo = popWinVo.f94174b;
        this.f92363b = textVo != null ? textVo.f102705a : null;
        TextVo textVoA = popWinVo.a();
        this.f92364c = textVoA != null ? textVoA.f102705a : null;
        this.f92365d = popWinVo.f94176d;
        this.f92366e = popWinVo.f94177e;
    }
}
