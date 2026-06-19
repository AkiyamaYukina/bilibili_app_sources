package com.bilibili.opd.app.bizcommon.mangapaysdk.data.model;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/data/model/OrderPayState.class */
public final class OrderPayState {
    private static final EnumEntries $ENTRIES;
    private static final OrderPayState[] $VALUES;
    private final int state;
    public static final OrderPayState Unknown = new OrderPayState("Unknown", 0, -1);
    public static final OrderPayState OrderSuccess = new OrderPayState("OrderSuccess", 1, 0);
    public static final OrderPayState ChargebacksNoVirtualAssetsReturn = new OrderPayState("ChargebacksNoVirtualAssetsReturn", 2, 1);
    public static final OrderPayState Chargebacks = new OrderPayState("Chargebacks", 3, 2);
    public static final OrderPayState AllInOneConsume = new OrderPayState("AllInOneConsume", 4, 3);
    public static final OrderPayState BCoinConsume = new OrderPayState("BCoinConsume", 5, 4);
    public static final OrderPayState BCoinConsumeFailure = new OrderPayState("BCoinConsumeFailure", 6, 5);

    private static final /* synthetic */ OrderPayState[] $values() {
        return new OrderPayState[]{Unknown, OrderSuccess, ChargebacksNoVirtualAssetsReturn, Chargebacks, AllInOneConsume, BCoinConsume, BCoinConsumeFailure};
    }

    static {
        OrderPayState[] orderPayStateArr$values = $values();
        $VALUES = orderPayStateArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(orderPayStateArr$values);
    }

    private OrderPayState(String str, int i7, int i8) {
        this.state = i8;
    }

    @NotNull
    public static EnumEntries<OrderPayState> getEntries() {
        return $ENTRIES;
    }

    public static OrderPayState valueOf(String str) {
        return (OrderPayState) Enum.valueOf(OrderPayState.class, str);
    }

    public static OrderPayState[] values() {
        return (OrderPayState[]) $VALUES.clone();
    }

    public final int getState() {
        return this.state;
    }
}
