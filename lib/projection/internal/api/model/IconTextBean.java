package com.bilibili.lib.projection.internal.api.model;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/api/model/IconTextBean.class */
@Keep
public final class IconTextBean {

    @Nullable
    private Integer defaultResourceId;

    @JSONField(name = "icon")
    @Nullable
    private DarkLightIcon icon;

    @JSONField(name = "pic")
    @Nullable
    private DarkLightIcon pic;

    @JSONField(name = "text")
    @Nullable
    private String text;

    @Nullable
    public final Integer getDefaultResourceId() {
        return this.defaultResourceId;
    }

    @Nullable
    public final DarkLightIcon getIcon() {
        return this.icon;
    }

    @Nullable
    public final DarkLightIcon getPic() {
        return this.pic;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    public final void setDefaultResourceId(@Nullable Integer num) {
        this.defaultResourceId = num;
    }

    public final void setIcon(@Nullable DarkLightIcon darkLightIcon) {
        this.icon = darkLightIcon;
    }

    public final void setPic(@Nullable DarkLightIcon darkLightIcon) {
        this.pic = darkLightIcon;
    }

    public final void setText(@Nullable String str) {
        this.text = str;
    }
}
