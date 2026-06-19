package com.bilibili.biligame.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/bean/WikiAboutInfo.class */
@StabilityInferred(parameters = 0)
@Keep
public final class WikiAboutInfo {
    public static final int $stable = 8;

    @JSONField(name = "builder_img")
    @Nullable
    private String builderImg;

    @JSONField(name = "contributor_face")
    @Nullable
    private List<String> contributorList;

    @JSONField(name = "contributor_total")
    @Nullable
    private String contributorTotal;

    @JSONField(name = "more_contributor_url")
    @Nullable
    private String moreConUrl;

    @JSONField(name = "site_builder")
    @Nullable
    private String siteBuilder;

    @JSONField(name = "text")
    @Nullable
    private String text;

    @Nullable
    public final String getBuilderImg() {
        return this.builderImg;
    }

    @Nullable
    public final List<String> getContributorList() {
        return this.contributorList;
    }

    @Nullable
    public final String getContributorTotal() {
        return this.contributorTotal;
    }

    @Nullable
    public final String getMoreConUrl() {
        return this.moreConUrl;
    }

    @Nullable
    public final String getSiteBuilder() {
        return this.siteBuilder;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    public final void setBuilderImg(@Nullable String str) {
        this.builderImg = str;
    }

    public final void setContributorList(@Nullable List<String> list) {
        this.contributorList = list;
    }

    public final void setContributorTotal(@Nullable String str) {
        this.contributorTotal = str;
    }

    public final void setMoreConUrl(@Nullable String str) {
        this.moreConUrl = str;
    }

    public final void setSiteBuilder(@Nullable String str) {
        this.siteBuilder = str;
    }

    public final void setText(@Nullable String str) {
        this.text = str;
    }
}
