package com.bilibili.studio.centerplus.network.entity;

import androidx.annotation.Keep;
import java.io.Serializable;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/network/entity/CenterPlusActivityBean.class */
@Keep
public final class CenterPlusActivityBean implements Serializable {
    private long activityId;

    @Nullable
    private String activityLink;
    private long androidMaxVersion;
    private long androidMinVersion;

    @Nullable
    private String buttonText;

    @Nullable
    private Boolean closeCenterPlus;

    @Nullable
    private String desc;
    private long endTime;

    @Nullable
    private Boolean hideClose;

    @Nullable
    private Boolean hideTimeLabel;
    private long iOSMaxVersion;
    private long iOSMinVersion;

    @Nullable
    private String imageUrl;

    @Nullable
    private Boolean showError;

    @Nullable
    private String showFrequency;

    @Nullable
    private ShowPosition showPosition;
    private long startTime;

    @Nullable
    private String title;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/network/entity/CenterPlusActivityBean$ShowPosition.class */
    @Keep
    public static final class ShowPosition implements Serializable {

        @Nullable
        private Boolean aiFeed;

        @Nullable
        private Boolean capture;

        @Nullable
        private Boolean template;

        @Nullable
        private Boolean upload;

        public ShowPosition() {
            Boolean bool = Boolean.FALSE;
            this.capture = bool;
            this.template = bool;
            this.aiFeed = bool;
            this.upload = bool;
        }

        @Nullable
        public final Boolean getAiFeed() {
            return this.aiFeed;
        }

        @Nullable
        public final Boolean getCapture() {
            return this.capture;
        }

        @Nullable
        public final Boolean getTemplate() {
            return this.template;
        }

        @Nullable
        public final Boolean getUpload() {
            return this.upload;
        }

        public final void setAiFeed(@Nullable Boolean bool) {
            this.aiFeed = bool;
        }

        public final void setCapture(@Nullable Boolean bool) {
            this.capture = bool;
        }

        public final void setTemplate(@Nullable Boolean bool) {
            this.template = bool;
        }

        public final void setUpload(@Nullable Boolean bool) {
            this.upload = bool;
        }
    }

    public CenterPlusActivityBean() {
        Boolean bool = Boolean.FALSE;
        this.hideClose = bool;
        this.closeCenterPlus = bool;
        this.showError = bool;
        this.hideTimeLabel = bool;
    }

    public final long getActivityId() {
        return this.activityId;
    }

    @Nullable
    public final String getActivityLink() {
        return this.activityLink;
    }

    public final long getAndroidMaxVersion() {
        return this.androidMaxVersion;
    }

    public final long getAndroidMinVersion() {
        return this.androidMinVersion;
    }

    @Nullable
    public final String getButtonText() {
        return this.buttonText;
    }

    @Nullable
    public final Boolean getCloseCenterPlus() {
        return this.closeCenterPlus;
    }

    @Nullable
    public final String getDesc() {
        return this.desc;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    @Nullable
    public final Boolean getHideClose() {
        return this.hideClose;
    }

    @Nullable
    public final Boolean getHideTimeLabel() {
        return this.hideTimeLabel;
    }

    public final long getIOSMaxVersion() {
        return this.iOSMaxVersion;
    }

    public final long getIOSMinVersion() {
        return this.iOSMinVersion;
    }

    @Nullable
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @Nullable
    public final Boolean getShowError() {
        return this.showError;
    }

    @Nullable
    public final String getShowFrequency() {
        return this.showFrequency;
    }

    @Nullable
    public final ShowPosition getShowPosition() {
        return this.showPosition;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final void setActivityId(long j7) {
        this.activityId = j7;
    }

    public final void setActivityLink(@Nullable String str) {
        this.activityLink = str;
    }

    public final void setAndroidMaxVersion(long j7) {
        this.androidMaxVersion = j7;
    }

    public final void setAndroidMinVersion(long j7) {
        this.androidMinVersion = j7;
    }

    public final void setButtonText(@Nullable String str) {
        this.buttonText = str;
    }

    public final void setCloseCenterPlus(@Nullable Boolean bool) {
        this.closeCenterPlus = bool;
    }

    public final void setDesc(@Nullable String str) {
        this.desc = str;
    }

    public final void setEndTime(long j7) {
        this.endTime = j7;
    }

    public final void setHideClose(@Nullable Boolean bool) {
        this.hideClose = bool;
    }

    public final void setHideTimeLabel(@Nullable Boolean bool) {
        this.hideTimeLabel = bool;
    }

    public final void setIOSMaxVersion(long j7) {
        this.iOSMaxVersion = j7;
    }

    public final void setIOSMinVersion(long j7) {
        this.iOSMinVersion = j7;
    }

    public final void setImageUrl(@Nullable String str) {
        this.imageUrl = str;
    }

    public final void setShowError(@Nullable Boolean bool) {
        this.showError = bool;
    }

    public final void setShowFrequency(@Nullable String str) {
        this.showFrequency = str;
    }

    public final void setShowPosition(@Nullable ShowPosition showPosition) {
        this.showPosition = showPosition;
    }

    public final void setStartTime(long j7) {
        this.startTime = j7;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }
}
