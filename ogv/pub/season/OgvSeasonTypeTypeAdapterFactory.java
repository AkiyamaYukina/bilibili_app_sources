package com.bilibili.ogv.pub.season;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.i;
import com.google.gson.reflect.TypeToken;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/season/OgvSeasonTypeTypeAdapterFactory.class */
final class OgvSeasonTypeTypeAdapterFactory implements i {
    @Nullable
    public final <T> TypeAdapter<T> a(@NotNull Gson gson, @NotNull TypeToken<T> typeToken) {
        if (Intrinsics.areEqual(typeToken.getType(), a.class)) {
            return new OgvSeasonTypeTypeAdapter(gson.getAdapter(Integer.TYPE));
        }
        return null;
    }
}
