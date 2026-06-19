package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.api.BiliApiException;
import com.bilibili.okretro.BaseResponse;
import retrofit2.HttpException;
import retrofit2.Response;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameApiResponse.class */
@Keep
public class BiligameApiResponse<T> extends BaseResponse {
    public static final int CODE_ALREADY_FOLLOW_GAME = -909;
    public static final int CODE_BLOCK = 22003;
    public static final int CODE_BLOCKED = 22002;
    public static final int CODE_FORBID = -908;
    public static final int CODE_FORBID_COMMENT = -930;
    public static final int CODE_NO_DATA = -703;
    public static final int CODE_PRICE_ERROR = -101002;
    public static final int CODE_PRODUCT_NOT_PAY = -101006;
    public T data;

    @JSONField(name = "remain_day")
    public int remainDay;
    public long ts;

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.bilibili.api.BiliApiException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: retrofit2.HttpException */
    public static <T> T extractResult(Response<BiligameApiResponse<T>> response) throws BiliApiException, HttpException {
        if (!response.isSuccessful()) {
            throw new HttpException(response);
        }
        BiligameApiResponse biligameApiResponse = (BiligameApiResponse) response.body();
        if (biligameApiResponse == null) {
            return null;
        }
        if (biligameApiResponse.code == 0) {
            return biligameApiResponse.data;
        }
        throw new BiliApiException(biligameApiResponse.code, biligameApiResponse.message);
    }

    public boolean isBlock() {
        int i7 = this.code;
        return i7 == 22002 || i7 == 22003;
    }

    public boolean isForbid() {
        return this.code == -930;
    }

    public boolean isNoData() {
        return this.code == -703;
    }
}
