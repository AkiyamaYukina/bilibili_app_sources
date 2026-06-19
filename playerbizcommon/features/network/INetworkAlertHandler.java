package com.bilibili.playerbizcommon.features.network;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/network/INetworkAlertHandler.class */
public interface INetworkAlertHandler {
    default void onAlertWidgetDismiss() {
    }

    default void onAlertWidgetShow() {
    }

    default void onAllowPlayWithMobileData() {
    }

    default boolean onBackPressed() {
        return false;
    }

    default void onContinueToPlay() {
    }

    default void onGotoUnicom() {
    }

    default void onPanelClick() {
    }
}
