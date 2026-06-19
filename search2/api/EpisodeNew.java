package com.bilibili.search2.api;

import Ps0.InterfaceC2789j;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.polymer.app.search.v1.ReasonStyle;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/EpisodeNew.class */
@StabilityInferred(parameters = 0)
@Keep
public final class EpisodeNew extends Os0.g implements InterfaceC2789j {
    public static final int $stable = 8;

    @SerializedName("badges")
    @JSONField(name = "badges")
    @Nullable
    private List<? extends Tag> badges;

    @SerializedName("cover")
    @JSONField(name = "cover")
    @Nullable
    private String cover;

    @SerializedName("label")
    @JSONField(name = "label")
    @Nullable
    private String label;

    @SerializedName("param")
    @JSONField(name = "param")
    @Nullable
    private String param;
    private int posForNeuron;

    @JSONField(deserialize = false, serialize = false)
    private int position;

    @SerializedName("title")
    @JSONField(name = "title")
    @Nullable
    private String title;

    @SerializedName("type")
    @JSONField(name = "type")
    private int type;

    @SerializedName(EditCustomizeSticker.TAG_URI)
    @JSONField(name = EditCustomizeSticker.TAG_URI)
    @Nullable
    private String uri;

    public EpisodeNew() {
    }

    public EpisodeNew(@NotNull com.bapis.bilibili.polymer.app.search.v1.EpisodeNew episodeNew) {
        this.uri = episodeNew.getUri();
        this.param = episodeNew.getParam();
        this.title = episodeNew.getTitle();
        this.cover = episodeNew.getCover();
        this.label = episodeNew.getLabel();
        ArrayList arrayList = new ArrayList();
        Iterator it = episodeNew.getBadgesList().iterator();
        while (it.hasNext()) {
            arrayList.add(new Tag((ReasonStyle) it.next()));
        }
        if (!arrayList.isEmpty()) {
            setBadges(arrayList);
        }
        this.type = episodeNew.getType();
    }

    @Override // Ps0.InterfaceC2789j
    @Nullable
    public List<Tag> getBadges() {
        return this.badges;
    }

    @Nullable
    public final String getCover() {
        return this.cover;
    }

    @Nullable
    public final String getLabel() {
        return this.label;
    }

    @Nullable
    public final String getParam() {
        return this.param;
    }

    public final int getPosForNeuron() {
        return this.posForNeuron;
    }

    public final int getPosition() {
        return this.position;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final int getType() {
        return this.type;
    }

    @Nullable
    public final String getUri() {
        return this.uri;
    }

    public void setBadges(@Nullable List<? extends Tag> list) {
        this.badges = list;
    }

    public final void setCover(@Nullable String str) {
        this.cover = str;
    }

    public final void setLabel(@Nullable String str) {
        this.label = str;
    }

    public final void setParam(@Nullable String str) {
        this.param = str;
    }

    public final void setPosForNeuron(int i7) {
        this.posForNeuron = i7;
    }

    public final void setPosition(int i7) {
        this.position = i7;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setType(int i7) {
        this.type = i7;
    }

    public final void setUri(@Nullable String str) {
        this.uri = str;
    }
}
