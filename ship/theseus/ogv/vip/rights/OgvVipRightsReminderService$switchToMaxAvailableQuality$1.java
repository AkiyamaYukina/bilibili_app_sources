package com.bilibili.ship.theseus.ogv.vip.rights;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/vip/rights/OgvVipRightsReminderService$switchToMaxAvailableQuality$1.class */
final class OgvVipRightsReminderService$switchToMaxAvailableQuality$1 extends ContinuationImpl {
    int label;
    Object result;
    final OgvVipRightsReminderService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvVipRightsReminderService$switchToMaxAvailableQuality$1(OgvVipRightsReminderService ogvVipRightsReminderService, Continuation<? super OgvVipRightsReminderService$switchToMaxAvailableQuality$1> continuation) {
        super(continuation);
        this.this$0 = ogvVipRightsReminderService;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return OgvVipRightsReminderService.d(this.this$0, this);
    }
}
