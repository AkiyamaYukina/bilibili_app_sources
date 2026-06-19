package com.bilibili.mini.player.biz.setting;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mini/player/biz/setting/MiniWindowResetInfo.class */
@Keep
public final class MiniWindowResetInfo {

    @JvmField
    @JSONField(name = "id")
    @Nullable
    public Integer id;

    @JvmField
    @JSONField(name = "target")
    @Nullable
    public Integer target;
}
