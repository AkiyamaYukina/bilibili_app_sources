package com.bilibili.pegasus.components;

import android.text.TextUtils;
import androidx.annotation.Keep;
import com.bilibili.biligame.api.bean.gamedetail.GameDetailContent;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/HDApkInfo.class */
@Keep
final class HDApkInfo {

    @SerializedName("apk_size")
    @Nullable
    private String apkSize;

    @SerializedName("app_current_version")
    @Nullable
    private String appCurrentVersion;

    @SerializedName("app_developer")
    @Nullable
    private String appDeveloper;

    @SerializedName("app_name")
    @Nullable
    private String appName;

    @SerializedName("app_update_time")
    @Nullable
    private String appUpdateTime;

    @SerializedName("icon")
    @Nullable
    private String icon;

    @SerializedName("id")
    private long id;

    @SerializedName("jump_to_app_store")
    private int jumpAppStore;

    @SerializedName("package_url")
    @Nullable
    private String packageUrl;

    @SerializedName("permission_purpose")
    @Nullable
    private String permissionPurposeUrl;

    @SerializedName("popup_title")
    @Nullable
    private String popupTitle;

    @SerializedName(GameDetailContent.DetailInfo.DATA_TYPE_PRIVACY_POLICY)
    @Nullable
    private String privacyPolicyUrl;

    @SerializedName("push_text")
    @Nullable
    private String pushText;

    @SerializedName("push_title")
    @Nullable
    private String pushTitle;

    public final boolean canJumpAppStore() {
        boolean z6 = true;
        if (this.jumpAppStore != 1) {
            z6 = false;
        }
        return z6;
    }

    @Nullable
    public final String getApkSize() {
        return this.apkSize;
    }

    @Nullable
    public final String getAppCurrentVersion() {
        return this.appCurrentVersion;
    }

    @Nullable
    public final String getAppDeveloper() {
        return this.appDeveloper;
    }

    @Nullable
    public final String getAppName() {
        return this.appName;
    }

    @Nullable
    public final String getAppUpdateTime() {
        return this.appUpdateTime;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    public final long getId() {
        return this.id;
    }

    public final int getJumpAppStore() {
        return this.jumpAppStore;
    }

    @Nullable
    public final String getPackageUrl() {
        return this.packageUrl;
    }

    @Nullable
    public final String getPermissionPurposeUrl() {
        return this.permissionPurposeUrl;
    }

    @Nullable
    public final String getPopupTitle() {
        return this.popupTitle;
    }

    @Nullable
    public final String getPrivacyPolicyUrl() {
        return this.privacyPolicyUrl;
    }

    @Nullable
    public final String getPushText() {
        return this.pushText;
    }

    @Nullable
    public final String getPushTitle() {
        return this.pushTitle;
    }

    public final boolean isValid() {
        return (TextUtils.isEmpty(this.appCurrentVersion) || TextUtils.isEmpty(this.appUpdateTime) || TextUtils.isEmpty(this.apkSize) || TextUtils.isEmpty(this.permissionPurposeUrl) || TextUtils.isEmpty(this.privacyPolicyUrl) || TextUtils.isEmpty(this.appDeveloper) || TextUtils.isEmpty(this.appName) || TextUtils.isEmpty(this.popupTitle) || TextUtils.isEmpty(this.icon) || TextUtils.isEmpty(this.packageUrl)) ? false : true;
    }

    public final void setApkSize(@Nullable String str) {
        this.apkSize = str;
    }

    public final void setAppCurrentVersion(@Nullable String str) {
        this.appCurrentVersion = str;
    }

    public final void setAppDeveloper(@Nullable String str) {
        this.appDeveloper = str;
    }

    public final void setAppName(@Nullable String str) {
        this.appName = str;
    }

    public final void setAppUpdateTime(@Nullable String str) {
        this.appUpdateTime = str;
    }

    public final void setIcon(@Nullable String str) {
        this.icon = str;
    }

    public final void setId(long j7) {
        this.id = j7;
    }

    public final void setJumpAppStore(int i7) {
        this.jumpAppStore = i7;
    }

    public final void setPackageUrl(@Nullable String str) {
        this.packageUrl = str;
    }

    public final void setPermissionPurposeUrl(@Nullable String str) {
        this.permissionPurposeUrl = str;
    }

    public final void setPopupTitle(@Nullable String str) {
        this.popupTitle = str;
    }

    public final void setPrivacyPolicyUrl(@Nullable String str) {
        this.privacyPolicyUrl = str;
    }

    public final void setPushText(@Nullable String str) {
        this.pushText = str;
    }

    public final void setPushTitle(@Nullable String str) {
        this.pushTitle = str;
    }
}
