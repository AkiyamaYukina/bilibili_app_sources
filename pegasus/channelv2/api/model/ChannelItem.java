package com.bilibili.pegasus.channelv2.api.model;

import Wn0.a;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import java.util.Objects;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/api/model/ChannelItem.class */
@Keep
public class ChannelItem extends a {

    @JSONField(name = "id")
    public long channelId;

    @Nullable
    @JSONField(name = "cover")
    public String cover;

    @JSONField(name = "is_atten")
    public boolean isAtten;

    @Nullable
    @JSONField(name = "is_update")
    public int is_update;

    @Nullable
    @JSONField(name = "label")
    public String label;

    @Nullable
    @JSONField(name = "name")
    public String name;

    @Nullable
    @JSONField(deserialize = false, serialize = false)
    public String tabName;

    @Nullable
    @JSONField(name = "type_icon")
    public String typeIcon;

    @Nullable
    @JSONField(name = EditCustomizeSticker.TAG_URI)
    public String uri;

    @JSONField(name = "official_verify")
    public int verifyType;

    public static ChannelItem copy(ChannelItem channelItem) {
        ChannelItem channelItem2 = new ChannelItem();
        channelItem2.channelId = channelItem.channelId;
        channelItem2.name = channelItem.name;
        channelItem2.cover = channelItem.cover;
        channelItem2.label = channelItem.label;
        channelItem2.uri = channelItem.uri;
        channelItem2.isAtten = channelItem.isAtten;
        channelItem2.typeIcon = channelItem.typeIcon;
        channelItem2.verifyType = channelItem.verifyType;
        channelItem2.is_update = channelItem.is_update;
        channelItem2.tabName = channelItem.tabName;
        return channelItem2;
    }

    @Override // Wn0.a
    public boolean equals(Object obj) {
        boolean z6 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        ChannelItem channelItem = (ChannelItem) obj;
        if (this.channelId != channelItem.channelId || this.isAtten != channelItem.isAtten || this.verifyType != channelItem.verifyType || this.is_update != channelItem.is_update || !Objects.equals(this.name, channelItem.name) || !Objects.equals(this.cover, channelItem.cover) || !Objects.equals(this.label, channelItem.label) || !Objects.equals(this.uri, channelItem.uri) || !Objects.equals(this.typeIcon, channelItem.typeIcon) || !Objects.equals(this.tabName, channelItem.tabName)) {
            z6 = false;
        }
        return z6;
    }

    @Override // Wn0.a
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), Long.valueOf(this.channelId), this.name, this.cover, this.label, this.uri, Boolean.valueOf(this.isAtten), Integer.valueOf(this.verifyType), this.typeIcon, Integer.valueOf(this.is_update), this.tabName);
    }
}
