package com.bilibili.pegasus.channelv2.api.model.search;

import Wn0.c;
import Yn0.a;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import java.util.Objects;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/api/model/search/ChannelSearchExtendItem.class */
@Keep
public class ChannelSearchExtendItem extends a {

    @Nullable
    @JSONField(name = "button")
    public c button;

    @Nullable
    @JSONField(name = "icon")
    public String cover;

    @Nullable
    @JSONField(name = "goto")
    public String gotoX;

    @JSONField(name = "id")
    public long id;

    @JSONField(name = "is_atten")
    public boolean isAtten;

    @Nullable
    @JSONField(name = "label")
    public String label;

    @Nullable
    @JSONField(name = "param")
    public String param;

    @Nullable
    @JSONField(name = "title")
    public String title;

    @Nullable
    @JSONField(name = "type_icon")
    public String typeIcon;

    @Nullable
    @JSONField(name = EditCustomizeSticker.TAG_URI)
    public String uri;

    @Override // Yn0.a
    public boolean equals(Object obj) {
        boolean z6 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        ChannelSearchExtendItem channelSearchExtendItem = (ChannelSearchExtendItem) obj;
        if (this.id != channelSearchExtendItem.id || this.isAtten != channelSearchExtendItem.isAtten || !Objects.equals(this.title, channelSearchExtendItem.title) || !Objects.equals(this.cover, channelSearchExtendItem.cover) || !Objects.equals(this.uri, channelSearchExtendItem.uri) || !Objects.equals(this.param, channelSearchExtendItem.param) || !Objects.equals(this.gotoX, channelSearchExtendItem.gotoX) || !Objects.equals(this.label, channelSearchExtendItem.label) || !Objects.equals(this.typeIcon, channelSearchExtendItem.typeIcon) || !Objects.equals(this.button, channelSearchExtendItem.button)) {
            z6 = false;
        }
        return z6;
    }

    @Override // Yn0.a
    @Nullable
    public String getChannelId() {
        return this.param;
    }

    @Override // Yn0.a
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), Long.valueOf(this.id), this.title, this.cover, this.uri, this.param, this.gotoX, this.label, Boolean.valueOf(this.isAtten), this.typeIcon, this.button);
    }
}
