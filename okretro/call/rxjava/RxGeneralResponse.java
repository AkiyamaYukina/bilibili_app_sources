package com.bilibili.okretro.call.rxjava;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.bson.common.Bson;
import com.bilibili.bson.fastjsoninterop.BothParsers;
import com.bilibili.lib.sharewrapper.basic.ThirdPartyExtraBuilder;
import com.bilibili.okretro.BaseResponse;
import com.bilibili.okretro.converter.RetrofitResponseConverterFactory;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/okretro/call/rxjava/RxGeneralResponse.class */
@Keep
@Bson
@BothParsers
@RetrofitResponseConverterFactory(RxGeneralResponseConverterFactory.class)
public final class RxGeneralResponse<T> extends BaseResponse {

    @SerializedName("data")
    @JvmField
    @Nullable
    @JSONField(name = "data")
    public T _data;

    @SerializedName(ThirdPartyExtraBuilder.KEY_RESULT)
    @JvmField
    @Nullable
    @JSONField(name = ThirdPartyExtraBuilder.KEY_RESULT)
    public T _result;

    @Nullable
    public final T getData() {
        T t7 = this._data;
        T t8 = t7;
        if (t7 == null) {
            t8 = this._result;
        }
        return t8;
    }
}
