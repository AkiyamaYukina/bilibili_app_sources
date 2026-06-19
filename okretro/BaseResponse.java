package com.bilibili.okretro;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/okretro/BaseResponse.class */
@Keep
public abstract class BaseResponse {

    @JvmField
    public int code;

    @JvmField
    @Nullable
    public String message;

    @JvmField
    public int ttl;

    @JSONField(deserialize = false, serialize = false)
    public boolean isSuccess() {
        return this.code == 0;
    }
}
