package com.bilibili.okretro.converter;

import am0.C3232a;
import am0.C3233b;
import am0.C3234c;
import androidx.annotation.NonNull;
import bm0.C5120b;
import com.bilibili.api.base.util.Types;
import com.bilibili.api.utils.GsonInstance;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.utils.ExBilowUtil;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlinx.serialization.Serializable;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okio.Buffer;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.http.Streaming;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/okretro/converter/BiliConverterFactory.class */
public class BiliConverterFactory extends Converter.Factory {
    public static final BiliConverterFactory INSTANCE = new BiliConverterFactory();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/okretro/converter/BiliConverterFactory$a.class */
    public static final class a implements Converter<ResponseBody, ResponseBody> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f73445a = new Object();

        public final Object convert(@NonNull Object obj) throws IOException {
            ResponseBody responseBody = (ResponseBody) obj;
            try {
                Buffer buffer = new Buffer();
                responseBody.source().readAll(buffer);
                return ResponseBody.create(responseBody.contentType(), responseBody.contentLength(), buffer);
            } finally {
                responseBody.close();
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/okretro/converter/BiliConverterFactory$b.class */
    public static final class b implements Converter<ResponseBody, ResponseBody> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f73446a = new Object();

        public final Object convert(@NonNull Object obj) throws IOException {
            return (ResponseBody) obj;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/okretro/converter/BiliConverterFactory$c.class */
    public static final class c implements Converter<ResponseBody, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f73447a = new Object();

        public final Object convert(@NonNull Object obj) throws IOException {
            return ((ResponseBody) obj).string();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/okretro/converter/BiliConverterFactory$d.class */
    public static final class d implements Converter<ResponseBody, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f73448a = new Object();

        public final Object convert(@NonNull Object obj) throws IOException {
            ((ResponseBody) obj).close();
            return null;
        }
    }

    public Converter<?, RequestBody> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        return null;
    }

    @NonNull
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        Class rawType = Types.getRawType(type);
        if (rawType == String.class) {
            return c.f73447a;
        }
        if (rawType.isAnnotationPresent(RetrofitResponseConverterFactory.class)) {
            try {
                Converter<ResponseBody, ?> converterResponseBodyConverter = ((RetrofitResponseConverterFactory) rawType.getAnnotation(RetrofitResponseConverterFactory.class)).value().newInstance().responseBodyConverter(type, annotationArr, retrofit);
                if (converterResponseBodyConverter != null) {
                    return converterResponseBodyConverter;
                }
            } catch (IllegalAccessException e7) {
                e7.printStackTrace();
            } catch (InstantiationException e8) {
                e8.printStackTrace();
            }
        }
        if (rawType == ResponseBody.class) {
            return ExBilowUtil.isAnnotationPresent(annotationArr, Streaming.class) ? b.f73446a : a.f73445a;
        }
        if (rawType.isAnnotationPresent(Serializable.class)) {
            try {
                return C5120b.f56758a.responseBodyConverter(type, annotationArr, retrofit);
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
        if (rawType == GeneralResponse.class) {
            Type type2 = type instanceof ParameterizedType ? ((ParameterizedType) type).getActualTypeArguments()[0] : null;
            Type type3 = type2;
            if (type2 == null) {
                type3 = Void.class;
            }
            return new C3233b(type3);
        }
        if (type == Void.class) {
            return d.f73448a;
        }
        if (!C3234c.a(type)) {
            return new C3232a(type);
        }
        Gson gson = GsonInstance.globalGson;
        return new C3234c(gson, gson.getAdapter(TypeToken.get(type)));
    }
}
