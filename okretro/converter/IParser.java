package com.bilibili.okretro.converter;

import androidx.annotation.NonNull;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Converter;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/okretro/converter/IParser.class */
public interface IParser<T> extends Converter<ResponseBody, T> {
    @Override // 
    @NonNull
    T convert(ResponseBody responseBody) throws IOException, RuntimeException;
}
