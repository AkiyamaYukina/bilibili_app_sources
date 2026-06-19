package com.bilibili.biligame.api.bean.gamedetail;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/gamedetail/ActivityInfoBean.class */
@StabilityInferred(parameters = 0)
@Keep
public final class ActivityInfoBean implements Serializable {
    public static final int $stable = 8;

    @JSONField(name = "activity_content")
    @Nullable
    private String activityContent;

    @JSONField(name = "activity_desc")
    @Nullable
    private String activityDesc;

    @JSONField(name = "activity_id")
    @Nullable
    private String activityId;

    @JSONField(name = "background_color")
    @Nullable
    private String backgroundColor;

    @JSONField(name = "default_select")
    private boolean defaultSelect;

    @JSONField(name = "display_icons")
    @Nullable
    private List<String> displayIcons;

    @JSONField(name = "end_time")
    private long endTime;

    @JSONField(name = "game_icon")
    @Nullable
    private String gameIcon;

    @JSONField(name = "game_name")
    @Nullable
    private String gameName;

    @JSONField(name = "top_prize_icons")
    @Nullable
    private List<String> icons;

    @JSONField(name = "immersion_image")
    @Nullable
    private String immersionImage;

    @JSONField(name = "is_game_top")
    private boolean isGameTop;

    @JSONField(name = "is_top")
    private boolean isTop;

    @JSONField(name = "jump_url")
    @Nullable
    private String jumpUrl;

    @JSONField(name = "prop_pic_url")
    @Nullable
    private String picUrl;

    @JSONField(name = "prize_icons")
    @Nullable
    private List<String> prizeIcons;

    @JSONField(name = "prize_items")
    @Nullable
    private List<ActivityPrizeItemBean> prizeItems;

    @JSONField(name = "prize_prompt")
    @Nullable
    private String prizePrompt;

    @JSONField(name = "start_time")
    private long startTime;

    @JSONField(name = "title")
    @Nullable
    private String title;

    @JSONField(name = "valid_status")
    private int validStatus;

    @JSONField(name = "game_base_id")
    private int gameBaseId = -1;

    @JSONField(name = "activity_type")
    private int activityType = -1;

    @JSONField(name = "model_type")
    private int modelType = -1;

    @Nullable
    public final String getActivityContent() {
        return this.activityContent;
    }

    @Nullable
    public final String getActivityDesc() {
        return this.activityDesc;
    }

    @Nullable
    public final String getActivityId() {
        return this.activityId;
    }

    public final int getActivityType() {
        return this.activityType;
    }

    @Nullable
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final boolean getDefaultSelect() {
        return this.defaultSelect;
    }

    @Nullable
    public final List<String> getDisplayIcons() {
        return this.displayIcons;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final int getGameBaseId() {
        return this.gameBaseId;
    }

    @Nullable
    public final String getGameIcon() {
        return this.gameIcon;
    }

    @Nullable
    public final String getGameName() {
        return this.gameName;
    }

    @Nullable
    public final List<String> getIcons() {
        return this.icons;
    }

    @Nullable
    public final String getImmersionImage() {
        return this.immersionImage;
    }

    @Nullable
    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    public final int getModelType() {
        return this.modelType;
    }

    @Nullable
    public final String getPicUrl() {
        return this.picUrl;
    }

    @Nullable
    public final List<String> getPrizeIcons() {
        return this.prizeIcons;
    }

    @Nullable
    public final List<ActivityPrizeItemBean> getPrizeItems() {
        return this.prizeItems;
    }

    @Nullable
    public final String getPrizePrompt() {
        return this.prizePrompt;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final int getValidStatus() {
        return this.validStatus;
    }

    public final boolean isGameTop() {
        return this.isGameTop;
    }

    public final boolean isTop() {
        return this.isTop;
    }

    public final void setActivityContent(@Nullable String str) {
        this.activityContent = str;
    }

    public final void setActivityDesc(@Nullable String str) {
        this.activityDesc = str;
    }

    public final void setActivityId(@Nullable String str) {
        this.activityId = str;
    }

    public final void setActivityType(int i7) {
        this.activityType = i7;
    }

    public final void setBackgroundColor(@Nullable String str) {
        this.backgroundColor = str;
    }

    public final void setDefaultSelect(boolean z6) {
        this.defaultSelect = z6;
    }

    public final void setDisplayIcons(@Nullable List<String> list) {
        this.displayIcons = list;
    }

    public final void setEndTime(long j7) {
        this.endTime = j7;
    }

    public final void setGameBaseId(int i7) {
        this.gameBaseId = i7;
    }

    public final void setGameIcon(@Nullable String str) {
        this.gameIcon = str;
    }

    public final void setGameName(@Nullable String str) {
        this.gameName = str;
    }

    public final void setGameTop(boolean z6) {
        this.isGameTop = z6;
    }

    public final void setIcons(@Nullable List<String> list) {
        this.icons = list;
    }

    public final void setImmersionImage(@Nullable String str) {
        this.immersionImage = str;
    }

    public final void setJumpUrl(@Nullable String str) {
        this.jumpUrl = str;
    }

    public final void setModelType(int i7) {
        this.modelType = i7;
    }

    public final void setPicUrl(@Nullable String str) {
        this.picUrl = str;
    }

    public final void setPrizeIcons(@Nullable List<String> list) {
        this.prizeIcons = list;
    }

    public final void setPrizeItems(@Nullable List<ActivityPrizeItemBean> list) {
        this.prizeItems = list;
    }

    public final void setPrizePrompt(@Nullable String str) {
        this.prizePrompt = str;
    }

    public final void setStartTime(long j7) {
        this.startTime = j7;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setTop(boolean z6) {
        this.isTop = z6;
    }

    public final void setValidStatus(int i7) {
        this.validStatus = i7;
    }
}
