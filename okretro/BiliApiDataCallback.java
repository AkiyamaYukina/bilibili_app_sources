package com.bilibili.okretro;

import androidx.annotation.Nullable;
import com.bilibili.api.BiliApiException;
import com.bilibili.api.base.Config;
import retrofit2.Call;
import retrofit2.HttpException;
import retrofit2.Response;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/okretro/BiliApiDataCallback.class */
public abstract class BiliApiDataCallback<T> extends BiliApiCallback<GeneralResponse<T>> {
    public abstract void onDataSuccess(@Nullable T t7);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.okretro.BiliApiCallback
    public void onResponse(Call<GeneralResponse<T>> call, Response<GeneralResponse<T>> response) {
        if (isCancel()) {
            return;
        }
        if (!response.isSuccessful() || isCancel()) {
            onFailure(call, new HttpException(response));
            return;
        }
        GeneralResponse generalResponse = (GeneralResponse) response.body();
        if (generalResponse == null) {
            onDataSuccess(null);
            return;
        }
        if (generalResponse.code == 0) {
            onDataSuccess(generalResponse.data);
            return;
        }
        if (Config.isDebuggable() && generalResponse.code == -400) {
            BLog.e("BiliApi", "WTF?! Check your parameters!");
        }
        onFailure(call, new BiliApiException(generalResponse.code, generalResponse.message));
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public void onSuccess(GeneralResponse<T> generalResponse) {
        throw new UnsupportedOperationException();
    }
}
