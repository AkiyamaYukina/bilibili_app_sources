package com.bilibili.opd.app.bizcommon.mangapaysdk.data.model;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/data/model/MangaBanner.class */
@Keep
public final class MangaBanner {

    @JSONField(name = "banner_type")
    private int bannerType;

    @JSONField(name = "background")
    @NotNull
    private String imageUrl = "";

    @JSONField(name = EditCustomizeSticker.TAG_URI)
    @NotNull
    private String schema = "";

    public final int getBannerType() {
        return this.bannerType;
    }

    @NotNull
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    public final String getSchema() {
        return this.schema;
    }

    public final void setBannerType(int i7) {
        this.bannerType = i7;
    }

    public final void setImageUrl(@NotNull String str) {
        this.imageUrl = str;
    }

    public final void setSchema(@NotNull String str) {
        this.schema = str;
    }
}
