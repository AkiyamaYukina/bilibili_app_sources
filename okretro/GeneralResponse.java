package com.bilibili.okretro;

import androidx.annotation.Keep;
import com.bilibili.bson.common.Bson;
import com.bilibili.bson.fastjsoninterop.BothParsers;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/okretro/GeneralResponse.class */
@Bson
@BothParsers
@Keep
public class GeneralResponse<T> extends BaseResponse {
    public T data;
}
