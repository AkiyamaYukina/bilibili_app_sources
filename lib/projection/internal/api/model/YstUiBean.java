package com.bilibili.lib.projection.internal.api.model;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/api/model/YstUiBean.class */
@Keep
public final class YstUiBean {

    @JSONField(name = "benefits")
    @Nullable
    private List<IconTextBean> benefits;

    @JSONField(name = "dm_text")
    @Nullable
    private String dmIconText;

    @JSONField(name = "fold_cnt")
    private int foldCnt = 4;

    @JSONField(name = "fourk_text")
    @Nullable
    private String fourkIconText;

    @JSONField(name = "help")
    @Nullable
    private TextUrlBean help;

    @JSONField(name = "live_high_quality_text")
    @Nullable
    private String highQualityIconText;

    @JSONField(name = "last_text")
    @Nullable
    private String lastShowText;

    @JSONField(name = "offline_text")
    @Nullable
    private String offlineText;

    @JSONField(name = "offline_tips")
    @Nullable
    private List<IconTextBean> offlineTips;

    @JSONField(name = "scan_help")
    @Nullable
    private TextUrlBean scanHelp;

    @JSONField(name = "search")
    @Nullable
    private YstSearchBean search;

    @JSONField(name = "title_icon")
    @Nullable
    private DarkLightIcon titleIcon;

    @JSONField(name = "title_text")
    @Nullable
    private String titleText;

    @Nullable
    public final List<IconTextBean> getBenefits() {
        return this.benefits;
    }

    @Nullable
    public final String getDmIconText() {
        return this.dmIconText;
    }

    public final int getFoldCnt() {
        return this.foldCnt;
    }

    @Nullable
    public final String getFourkIconText() {
        return this.fourkIconText;
    }

    @Nullable
    public final TextUrlBean getHelp() {
        return this.help;
    }

    @Nullable
    public final String getHighQualityIconText() {
        return this.highQualityIconText;
    }

    @Nullable
    public final String getLastShowText() {
        return this.lastShowText;
    }

    @Nullable
    public final String getOfflineText() {
        return this.offlineText;
    }

    @Nullable
    public final List<IconTextBean> getOfflineTips() {
        return this.offlineTips;
    }

    @Nullable
    public final TextUrlBean getScanHelp() {
        return this.scanHelp;
    }

    @Nullable
    public final YstSearchBean getSearch() {
        return this.search;
    }

    @Nullable
    public final DarkLightIcon getTitleIcon() {
        return this.titleIcon;
    }

    @Nullable
    public final String getTitleText() {
        return this.titleText;
    }

    public final void setBenefits(@Nullable List<IconTextBean> list) {
        this.benefits = list;
    }

    public final void setDmIconText(@Nullable String str) {
        this.dmIconText = str;
    }

    public final void setFoldCnt(int i7) {
        this.foldCnt = i7;
    }

    public final void setFourkIconText(@Nullable String str) {
        this.fourkIconText = str;
    }

    public final void setHelp(@Nullable TextUrlBean textUrlBean) {
        this.help = textUrlBean;
    }

    public final void setHighQualityIconText(@Nullable String str) {
        this.highQualityIconText = str;
    }

    public final void setLastShowText(@Nullable String str) {
        this.lastShowText = str;
    }

    public final void setOfflineText(@Nullable String str) {
        this.offlineText = str;
    }

    public final void setOfflineTips(@Nullable List<IconTextBean> list) {
        this.offlineTips = list;
    }

    public final void setScanHelp(@Nullable TextUrlBean textUrlBean) {
        this.scanHelp = textUrlBean;
    }

    public final void setSearch(@Nullable YstSearchBean ystSearchBean) {
        this.search = ystSearchBean;
    }

    public final void setTitleIcon(@Nullable DarkLightIcon darkLightIcon) {
        this.titleIcon = darkLightIcon;
    }

    public final void setTitleText(@Nullable String str) {
        this.titleText = str;
    }
}
