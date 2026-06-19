package com.bilibili.studio.videoeditor.generalrender.parsexml.base;

import androidx.annotation.NonNull;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/generalrender/parsexml/base/GsonUtils.class */
@Deprecated
public final class GsonUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<String, Gson> f109657a = new ConcurrentHashMap();

    public GsonUtils() {
        throw new UnsupportedOperationException("Don't support instantiate me!!!");
    }

    public static <T> T fromJson(@NonNull Gson gson, Reader reader, @NonNull Class<T> cls) {
        return (T) gson.fromJson(reader, cls);
    }

    public static <T> T fromJson(@NonNull Gson gson, Reader reader, @NonNull Type type) {
        return (T) gson.fromJson(reader, type);
    }

    public static <T> T fromJson(@NonNull Gson gson, String str, @NonNull Class<T> cls) {
        return (T) gson.fromJson(str, cls);
    }

    public static <T> T fromJson(@NonNull Gson gson, String str, @NonNull Type type) {
        return (T) gson.fromJson(str, type);
    }

    public static <T> T fromJson(@NonNull Reader reader, @NonNull Class<T> cls) {
        return (T) fromJson(getGson(), reader, (Class) cls);
    }

    public static <T> T fromJson(@NonNull Reader reader, @NonNull Type type) {
        return (T) fromJson(getGson(), reader, type);
    }

    public static <T> T fromJson(String str, @NonNull Class<T> cls) {
        return (T) fromJson(getGson(), str, (Class) cls);
    }

    public static <T> T fromJson(String str, @NonNull Type type) {
        return (T) fromJson(getGson(), str, type);
    }

    public static Gson getGson() {
        Map<String, Gson> map = f109657a;
        Gson gson = (Gson) ((ConcurrentHashMap) map).get("delegateGsonKey");
        if (gson != null) {
            return gson;
        }
        Gson gson2 = (Gson) ((ConcurrentHashMap) map).get("defaultGsonKey");
        Gson gsonCreate = gson2;
        if (gson2 == null) {
            gsonCreate = new GsonBuilder().serializeNulls().disableHtmlEscaping().create();
            ((ConcurrentHashMap) map).put("defaultGsonKey", gsonCreate);
        }
        return gsonCreate;
    }
}
