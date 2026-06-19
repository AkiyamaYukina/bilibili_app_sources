package com.bilibili.upper.module.cover_v2.model.template.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.z;
import androidx.room.B;
import cf.p;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/model/template/bean/MultiCoverTemplateBean.class */
@StabilityInferred(parameters = 0)
@Keep
public final class MultiCoverTemplateBean implements Serializable {
    public static final int $stable = 8;

    @Nullable
    private String animationCover;

    @Nullable
    private String cover;

    @JSONField(name = "download_url")
    @Nullable
    private String downloadUrl;

    @Nullable
    private Integer id;

    @Nullable
    private String name;

    @Nullable
    private Integer rank;

    @Nullable
    private String tags;

    @Nullable
    public final String getAnimationCover() {
        return this.animationCover;
    }

    @Nullable
    public final String getCover() {
        return this.cover;
    }

    @Nullable
    public final String getDownloadUrl() {
        return this.downloadUrl;
    }

    @Nullable
    public final Integer getId() {
        return this.id;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Integer getRank() {
        return this.rank;
    }

    @Nullable
    public final String getTags() {
        return this.tags;
    }

    public final void setAnimationCover(@Nullable String str) {
        this.animationCover = str;
    }

    public final void setCover(@Nullable String str) {
        this.cover = str;
    }

    public final void setDownloadUrl(@Nullable String str) {
        this.downloadUrl = str;
    }

    public final void setId(@Nullable Integer num) {
        this.id = num;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setRank(@Nullable Integer num) {
        this.rank = num;
    }

    public final void setTags(@Nullable String str) {
        this.tags = str;
    }

    @NotNull
    public String toString() {
        Integer num = this.id;
        String str = this.name;
        String str2 = this.cover;
        String str3 = this.animationCover;
        String str4 = this.downloadUrl;
        Integer num2 = this.rank;
        String str5 = this.tags;
        StringBuilder sbB = z.b("CoverTemplateBean(id=", num, ", name=", str, ", cover=");
        B.a(str2, ", animationCover=", str3, ", downloadUrl=", sbB);
        p.a(num2, str4, ", rank=", ", tags=", sbB);
        return C8770a.a(sbB, str5, ")");
    }
}
