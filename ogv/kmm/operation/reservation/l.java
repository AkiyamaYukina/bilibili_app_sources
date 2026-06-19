package com.bilibili.ogv.kmm.operation.reservation;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ogv.operation3.module.operable.delivery.DeliveryReport;
import javax.inject.Inject;
import org.jetbrains.annotations.NotNull;
import rj0.C8526a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/reservation/l.class */
@StabilityInferred(parameters = 0)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final DeliveryReport f68688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final C8526a f68689b;

    @Inject
    public l(@NotNull DeliveryReport deliveryReport, @NotNull C8526a c8526a) {
        this.f68688a = deliveryReport;
        this.f68689b = c8526a;
    }
}
