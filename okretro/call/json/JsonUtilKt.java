package com.bilibili.okretro.call.json;

import com.bilibili.api.utils.GsonInstance;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/okretro/call/json/JsonUtilKt.class */
public final class JsonUtilKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Gson f73428a = GsonInstance.globalGson;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/okretro/call/json/JsonUtilKt$a.class */
    public static final class a<T> extends TypeToken<T> {
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/okretro/call/json/JsonUtilKt$b.class */
    public static final class b<T> extends TypeToken<T> {
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/okretro/call/json/JsonUtilKt$c.class */
    public static final class c<T> extends TypeToken<T> {
    }

    public static final /* synthetic */ <T> T parseJson(JsonElement jsonElement) {
        Intrinsics.needClassReification();
        return (T) parseJson(jsonElement, new b().getType());
    }

    public static final <T> T parseJson(@NotNull JsonElement jsonElement, @NotNull Type type) {
        return (T) f73428a.fromJson(jsonElement, type);
    }

    public static final /* synthetic */ <T> T parseJson(fN0.a aVar) {
        Intrinsics.needClassReification();
        return (T) parseJson(aVar, new c().getType());
    }

    public static final <T> T parseJson(@NotNull fN0.a aVar, @NotNull Type type) {
        return (T) f73428a.fromJson(aVar, type);
    }

    public static final /* synthetic */ <T> T parseJson(String str) {
        Intrinsics.needClassReification();
        return (T) parseJson(str, new a().getType());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.gson.JsonSyntaxException */
    public static final <T> T parseJson(@NotNull String str, @NotNull Type type) throws JsonSyntaxException {
        if (StringsKt.isBlank(str)) {
            throw new JsonSyntaxException("Empty input not allowed.");
        }
        return (T) f73428a.fromJson(str, type);
    }

    @NotNull
    public static final String toJson(@Nullable Object obj) {
        return f73428a.toJson(obj);
    }

    @NotNull
    public static final JsonElement toJsonTree(@Nullable Object obj) {
        return f73428a.toJsonTree(obj);
    }
}
