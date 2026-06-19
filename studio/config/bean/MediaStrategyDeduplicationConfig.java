package com.bilibili.studio.config.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/config/bean/MediaStrategyDeduplicationConfig.class */
@Keep
public final class MediaStrategyDeduplicationConfig {

    @JSONField(name = "exposure_asset_backward_day")
    private int assetBackwardDay;

    @JSONField(name = "exposure_content_backward_day")
    private int contentBackwardDay;

    @JSONField(name = "click_content_forward_count")
    private int contentForwardCount;

    @JSONField(name = "record_expire_day")
    private int expireDay;

    @JSONField(name = "exposure_asset_count")
    private int exposureAssetCount;

    @JSONField(name = "exposure_asset_day")
    private int exposureAssetDay;

    @JSONField(name = "exposure_content_count")
    private int exposureContentCount;

    @JSONField(name = "exposure_content_day")
    private int exposureContentDay;

    @JSONField(name = "min_asset_count_exclude_publish")
    private int minAssetCountExcludePublish;

    public final int getAssetBackwardDay() {
        return this.assetBackwardDay;
    }

    public final int getContentBackwardDay() {
        return this.contentBackwardDay;
    }

    public final int getContentForwardCount() {
        return this.contentForwardCount;
    }

    public final int getExpireDay() {
        return this.expireDay;
    }

    public final int getExposureAssetCount() {
        return this.exposureAssetCount;
    }

    public final int getExposureAssetDay() {
        return this.exposureAssetDay;
    }

    public final int getExposureContentCount() {
        return this.exposureContentCount;
    }

    public final int getExposureContentDay() {
        return this.exposureContentDay;
    }

    public final int getMinAssetCountExcludePublish() {
        return this.minAssetCountExcludePublish;
    }

    public final void setAssetBackwardDay(int i7) {
        this.assetBackwardDay = i7;
    }

    public final void setContentBackwardDay(int i7) {
        this.contentBackwardDay = i7;
    }

    public final void setContentForwardCount(int i7) {
        this.contentForwardCount = i7;
    }

    public final void setExpireDay(int i7) {
        this.expireDay = i7;
    }

    public final void setExposureAssetCount(int i7) {
        this.exposureAssetCount = i7;
    }

    public final void setExposureAssetDay(int i7) {
        this.exposureAssetDay = i7;
    }

    public final void setExposureContentCount(int i7) {
        this.exposureContentCount = i7;
    }

    public final void setExposureContentDay(int i7) {
        this.exposureContentDay = i7;
    }

    public final void setMinAssetCountExcludePublish(int i7) {
        this.minAssetCountExcludePublish = i7;
    }
}
