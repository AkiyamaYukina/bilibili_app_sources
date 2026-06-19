package com.bilibili.ship.theseus.united.page.restrictionlayer;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/TextVoTypeAdapterFactory.class */
final class TextVoTypeAdapterFactory implements com.google.gson.i {
    @Nullable
    public final <T> TypeAdapter<T> a(@NotNull Gson gson, @NotNull TypeToken<T> typeToken) {
        if (Intrinsics.areEqual(typeToken.getType(), TextVo.class)) {
            return new TextVoTypeAdapter(gson);
        }
        return null;
    }
}
