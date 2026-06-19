package com.bilibili.okretro.call.rxjava;

import am0.C3234c;
import androidx.annotation.Keep;
import com.bilibili.api.base.util.Types;
import com.bilibili.api.utils.GsonInstance;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/okretro/call/rxjava/RxGeneralResponseConverterFactory.class */
@Keep
public final class RxGeneralResponseConverterFactory extends Converter.Factory {
    @Nullable
    public Converter<ResponseBody, ?> responseBodyConverter(@NotNull Type type, @NotNull Annotation[] annotationArr, @Nullable Retrofit retrofit) {
        if (Intrinsics.areEqual(Types.getRawType(type), RxGeneralResponse.class)) {
            boolean zA = false;
            Type type2 = type instanceof ParameterizedType ? ((ParameterizedType) type).getActualTypeArguments()[0] : null;
            if (type2 != null) {
                zA = C3234c.a(type2);
            }
            if (zA) {
                Gson gson = GsonInstance.globalGson;
                return new C3234c(gson, gson.getAdapter(TypeToken.get(type)));
            }
        }
        return super.responseBodyConverter(type, annotationArr, retrofit);
    }
}
