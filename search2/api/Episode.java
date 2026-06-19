package com.bilibili.search2.api;

import Ps0.InterfaceC2789j;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.polymer.app.search.v1.ReasonStyle;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/Episode.class */
@StabilityInferred(parameters = 0)
@Keep
public final class Episode extends Os0.g implements InterfaceC2789j {
    public static final int $stable = 8;

    @JSONField(name = "badges")
    @Nullable
    private List<? extends Tag> badges;

    @JSONField(name = "index")
    @Nullable
    private String index;

    @JSONField(name = "param")
    @Nullable
    private String param;

    @JSONField(deserialize = false, serialize = false)
    private int position;

    @JSONField(name = EditCustomizeSticker.TAG_URI)
    @Nullable
    private String uri;

    public Episode() {
    }

    public Episode(@NotNull com.bapis.bilibili.polymer.app.search.v1.Episode episode) {
        this.uri = episode.getUri();
        this.param = episode.getParam();
        this.index = episode.getIndex();
        this.position = episode.getPosition();
        ArrayList arrayList = new ArrayList();
        Iterator it = episode.getBadgesList().iterator();
        while (it.hasNext()) {
            arrayList.add(new Tag((ReasonStyle) it.next()));
        }
        if (arrayList.isEmpty()) {
            return;
        }
        setBadges(arrayList);
    }

    @Override // Ps0.InterfaceC2789j
    @Nullable
    public List<Tag> getBadges() {
        return this.badges;
    }

    @Nullable
    public final String getIndex() {
        return this.index;
    }

    @Nullable
    public final String getParam() {
        return this.param;
    }

    public final int getPosition() {
        return this.position;
    }

    @Nullable
    public final String getUri() {
        return this.uri;
    }

    public void setBadges(@Nullable List<? extends Tag> list) {
        this.badges = list;
    }

    public final void setIndex(@Nullable String str) {
        this.index = str;
    }

    public final void setParam(@Nullable String str) {
        this.param = str;
    }

    public final void setPosition(int i7) {
        this.position = i7;
    }

    public final void setUri(@Nullable String str) {
        this.uri = str;
    }
}
