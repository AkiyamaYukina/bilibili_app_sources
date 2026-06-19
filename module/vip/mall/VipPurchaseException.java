package com.bilibili.module.vip.mall;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.module.vip.mall.VipPayResultInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/mall/VipPurchaseException.class */
@StabilityInferred(parameters = 0)
public abstract class VipPurchaseException extends Exception {
    public static final int $stable = 8;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/mall/VipPurchaseException$AccountVipTimeNotUpdated.class */
    @StabilityInferred(parameters = 0)
    public static final class AccountVipTimeNotUpdated extends VipPurchaseException {
        public static final int $stable = 8;

        @NotNull
        private final VipPayResultInfo.VipPayResultDialogContentInfo dialogContentInfo;

        @NotNull
        private final String orderId;

        public AccountVipTimeNotUpdated(@NotNull String str, @NotNull VipPayResultInfo.VipPayResultDialogContentInfo vipPayResultDialogContentInfo) {
            super(null);
            this.orderId = str;
            this.dialogContentInfo = vipPayResultDialogContentInfo;
        }

        @NotNull
        public final VipPayResultInfo.VipPayResultDialogContentInfo getDialogContentInfo() {
            return this.dialogContentInfo;
        }

        @NotNull
        public final String getOrderId() {
            return this.orderId;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/mall/VipPurchaseException$CreateOrderFailed.class */
    @StabilityInferred(parameters = 0)
    public static final class CreateOrderFailed extends VipPurchaseException {
        public static final int $stable = 8;

        @NotNull
        private final VipPayResultInfo.VipPayResultDialogContentInfo dialogContentInfo;
        private final boolean needRefreshPanel;

        public CreateOrderFailed(@NotNull VipPayResultInfo.VipPayResultDialogContentInfo vipPayResultDialogContentInfo, boolean z6) {
            super(null);
            this.dialogContentInfo = vipPayResultDialogContentInfo;
            this.needRefreshPanel = z6;
        }

        @NotNull
        public final VipPayResultInfo.VipPayResultDialogContentInfo getDialogContentInfo() {
            return this.dialogContentInfo;
        }

        public final boolean getNeedRefreshPanel() {
            return this.needRefreshPanel;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/mall/VipPurchaseException$NotLoggedIn.class */
    @StabilityInferred(parameters = 0)
    public static final class NotLoggedIn extends VipPurchaseException {

        @NotNull
        public static final NotLoggedIn INSTANCE = new NotLoggedIn();
        public static final int $stable = 8;

        private NotLoggedIn() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/mall/VipPurchaseException$OrderCheckFailed.class */
    @StabilityInferred(parameters = 0)
    public static final class OrderCheckFailed extends VipPurchaseException {
        public static final int $stable = 8;

        @NotNull
        private final VipPayResultInfo.VipPayResultDialogContentInfo dialogContentInfo;

        @NotNull
        private final String orderId;

        public OrderCheckFailed(@NotNull String str, @NotNull VipPayResultInfo.VipPayResultDialogContentInfo vipPayResultDialogContentInfo) {
            super(null);
            this.orderId = str;
            this.dialogContentInfo = vipPayResultDialogContentInfo;
        }

        @NotNull
        public final VipPayResultInfo.VipPayResultDialogContentInfo getDialogContentInfo() {
            return this.dialogContentInfo;
        }

        @NotNull
        public final String getOrderId() {
            return this.orderId;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/mall/VipPurchaseException$PayFailed.class */
    @StabilityInferred(parameters = 0)
    public static final class PayFailed extends VipPurchaseException {

        @NotNull
        public static final PayFailed INSTANCE = new PayFailed();
        public static final int $stable = 8;

        private PayFailed() {
            super(null);
        }
    }

    private VipPurchaseException() {
    }

    public /* synthetic */ VipPurchaseException(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
