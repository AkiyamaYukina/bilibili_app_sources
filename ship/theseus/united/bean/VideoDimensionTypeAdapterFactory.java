package com.bilibili.ship.theseus.united.bean;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/bean/VideoDimensionTypeAdapterFactory.class */
final class VideoDimensionTypeAdapterFactory implements com.google.gson.i {
    @NotNull
    public final <T> TypeAdapter<T> a(@NotNull Gson gson, @Nullable TypeToken<T> typeToken) {
        return new VideoDimensionTypeAdapter(gson.getAdapter(Integer.TYPE), gson.getAdapter(Boolean.TYPE));
    }
}
