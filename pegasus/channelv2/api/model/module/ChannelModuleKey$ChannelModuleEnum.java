package com.bilibili.pegasus.channelv2.api.model.module;

import Xn0.a;
import Xn0.d;
import Xn0.e;
import Xn0.f;
import Xn0.g;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/api/model/module/ChannelModuleKey$ChannelModuleEnum.class */
public enum ChannelModuleKey$ChannelModuleEnum {
    SEARCH("search", e.class),
    ALL("subscribe", a.class),
    UPDATE("new", g.class),
    RCMD("rcmd", d.class),
    TOPIC_RCMD("topic_rcmd", f.class);

    public final Class instanceClass;
    public final String moduleType;

    ChannelModuleKey$ChannelModuleEnum(String str, Class cls) {
        this.instanceClass = cls;
        this.moduleType = str;
    }

    @Nullable
    public static ChannelModuleKey$ChannelModuleEnum getByType(@NonNull String str) {
        for (ChannelModuleKey$ChannelModuleEnum channelModuleKey$ChannelModuleEnum : values()) {
            if (channelModuleKey$ChannelModuleEnum.moduleType.equals(str)) {
                return channelModuleKey$ChannelModuleEnum;
            }
        }
        return null;
    }
}
