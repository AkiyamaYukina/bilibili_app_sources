package com.bilibili.upper.module.cover_v2.model.template;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/model/template/MultiCoverTemplateDefinition.class */
@StabilityInferred(parameters = 0)
@Keep
public final class MultiCoverTemplateDefinition {
    public static final int $stable = 8;

    @NotNull
    private MultiCoverTemplateCoordinate coordinate = new MultiCoverTemplateCoordinate();

    @NotNull
    private List<MultiCoverTemplateCaption> captions = new ArrayList();

    @NotNull
    private List<MultiCoverTemplateSticker> stickers = new ArrayList();

    @JSONField(name = "bg_url")
    @NotNull
    private String backgroundUrl = "";

    @NotNull
    public final String getBackgroundUrl() {
        return this.backgroundUrl;
    }

    @NotNull
    public final List<MultiCoverTemplateCaption> getCaptions() {
        return this.captions;
    }

    @NotNull
    public final MultiCoverTemplateCoordinate getCoordinate() {
        return this.coordinate;
    }

    @NotNull
    public final List<MultiCoverTemplateSticker> getStickers() {
        return this.stickers;
    }

    public final void setBackgroundUrl(@NotNull String str) {
        this.backgroundUrl = str;
    }

    public final void setCaptions(@NotNull List<MultiCoverTemplateCaption> list) {
        this.captions = list;
    }

    public final void setCoordinate(@NotNull MultiCoverTemplateCoordinate multiCoverTemplateCoordinate) {
        this.coordinate = multiCoverTemplateCoordinate;
    }

    public final void setStickers(@NotNull List<MultiCoverTemplateSticker> list) {
        this.stickers = list;
    }
}
