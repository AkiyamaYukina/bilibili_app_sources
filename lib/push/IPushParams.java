package com.bilibili.lib.push;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/IPushParams.class */
public interface IPushParams {
    default List<String> brandListCheckHms() {
        return new ArrayList();
    }

    default boolean clearReddot() {
        return true;
    }

    default void collocateExtraReportParams(Map<String, String> map) {
    }

    default String dotClassName() {
        return "";
    }

    default boolean featureFlag(String str) {
        return true;
    }

    @NonNull
    String getAppKey();

    @NonNull
    String getBuvid();

    @NonNull
    default String getMobiApp() {
        return BPushFoundation.getMobiApp();
    }

    @NonNull
    String getPushAppId();

    default String getReddotExp() {
        return "";
    }

    default boolean getReddotExpCancel() {
        return false;
    }

    default String getReddotExpHuawei() {
        return "";
    }

    default String getReddotExpOppo() {
        return "";
    }

    @NonNull
    String getSecretKey();

    @Nullable
    String getUserAccessKey(Context context);

    @Nullable
    String getUserId(Context context);

    default int getVersionCode() {
        return BPushFoundation.getVersionCode();
    }

    default long huaweiNotificationTimeout() {
        return 2000L;
    }

    default boolean isEnable() {
        return true;
    }

    default boolean reportRedDotClick() {
        return false;
    }

    default boolean reportReddotClearFailure() {
        return false;
    }

    default boolean reportReddotClearSuccess() {
        return false;
    }

    default boolean reportReddotNumber() {
        return false;
    }

    default boolean requestBlock(String str, String str2) {
        return false;
    }
}
