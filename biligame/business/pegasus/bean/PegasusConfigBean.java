package com.bilibili.biligame.business.pegasus.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.tencent.map.geolocation.TencentLocationRequest;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/pegasus/bean/PegasusConfigBean.class */
@Keep
public final class PegasusConfigBean {

    @JSONField(name = "priority")
    @Nullable
    private Integer priority;

    @JSONField(name = "subtitle_day_color")
    @Nullable
    private String subtitleDayColor;

    @JSONField(name = "subtitle_night_color")
    @Nullable
    private String subtitleNightColor;

    @JSONField(name = "key")
    @Nullable
    private String key = "";

    @JSONField(name = "dialog_duration")
    private int dialogDuration = TencentLocationRequest.ONLY_GPS_TIME_OUT;

    @JSONField(name = "remind_later")
    private int remindater = 7;

    @JSONField(name = "limit_times")
    private int limitTimes = 1;

    @JSONField(name = "title")
    @Nullable
    private String title = "";

    @JSONField(name = "show_remind_later")
    @Nullable
    private String showRemindLater = "1";

    @JSONField(name = "remind_later_text")
    @Nullable
    private String remindLaterText = "";

    @JSONField(name = "remind_later_toast")
    @Nullable
    private String remindLaterToast = "";

    @JSONField(name = "button_text_one")
    @Nullable
    private String buttonTextOne = "";

    @JSONField(name = "button_text_all")
    @Nullable
    private String buttonTextAll = "";

    @JSONField(name = "show_size")
    @Nullable
    private String showSize = "1";

    @JSONField(name = "show_subtitle")
    @Nullable
    private String showSubtitle = "1";

    @JSONField(name = "subtitle_text")
    @Nullable
    private String subtitleText = "";

    @JSONField(name = "lazy_duration")
    private int lazyDuration = 2000;

    @Nullable
    public final String getButtonTextAll() {
        return this.buttonTextAll;
    }

    @Nullable
    public final String getButtonTextOne() {
        return this.buttonTextOne;
    }

    public final int getDialogDuration() {
        return this.dialogDuration;
    }

    @Nullable
    public final String getKey() {
        return this.key;
    }

    public final int getLazyDuration() {
        return this.lazyDuration;
    }

    public final int getLimitTimes() {
        return this.limitTimes;
    }

    @Nullable
    public final Integer getPriority() {
        return this.priority;
    }

    @Nullable
    public final String getRemindLaterText() {
        return this.remindLaterText;
    }

    @Nullable
    public final String getRemindLaterToast() {
        return this.remindLaterToast;
    }

    public final int getRemindater() {
        return this.remindater;
    }

    @Nullable
    public final String getShowRemindLater() {
        return this.showRemindLater;
    }

    @Nullable
    public final String getShowSize() {
        return this.showSize;
    }

    @Nullable
    public final String getShowSubtitle() {
        return this.showSubtitle;
    }

    @Nullable
    public final String getSubtitleDayColor() {
        return this.subtitleDayColor;
    }

    @Nullable
    public final String getSubtitleNightColor() {
        return this.subtitleNightColor;
    }

    @Nullable
    public final String getSubtitleText() {
        return this.subtitleText;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final boolean isShowRemindLater() {
        return Intrinsics.areEqual(this.showRemindLater, "1");
    }

    public final boolean isShowSize() {
        return Intrinsics.areEqual(this.showSize, "1");
    }

    public final boolean isShowSubTitle() {
        return Intrinsics.areEqual(this.showSubtitle, "1");
    }

    public final void setButtonTextAll(@Nullable String str) {
        this.buttonTextAll = str;
    }

    public final void setButtonTextOne(@Nullable String str) {
        this.buttonTextOne = str;
    }

    public final void setDialogDuration(int i7) {
        this.dialogDuration = i7;
    }

    public final void setKey(@Nullable String str) {
        this.key = str;
    }

    public final void setLazyDuration(int i7) {
        this.lazyDuration = i7;
    }

    public final void setLimitTimes(int i7) {
        this.limitTimes = i7;
    }

    public final void setPriority(@Nullable Integer num) {
        this.priority = num;
    }

    public final void setRemindLaterText(@Nullable String str) {
        this.remindLaterText = str;
    }

    public final void setRemindLaterToast(@Nullable String str) {
        this.remindLaterToast = str;
    }

    public final void setRemindater(int i7) {
        this.remindater = i7;
    }

    public final void setShowRemindLater(@Nullable String str) {
        this.showRemindLater = str;
    }

    public final void setShowSize(@Nullable String str) {
        this.showSize = str;
    }

    public final void setShowSubtitle(@Nullable String str) {
        this.showSubtitle = str;
    }

    public final void setSubtitleDayColor(@Nullable String str) {
        this.subtitleDayColor = str;
    }

    public final void setSubtitleNightColor(@Nullable String str) {
        this.subtitleNightColor = str;
    }

    public final void setSubtitleText(@Nullable String str) {
        this.subtitleText = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }
}
