package com.bilibili.studio.editor.utils;

import android.os.Bundle;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/utils/BiliCollectionExtensionKt.class */
public final class BiliCollectionExtensionKt {
    @NotNull
    public static final <K, V> Map<K, V> append(@NotNull Map<K, V> map, @NotNull Pair<? extends K, ? extends V>... pairArr) {
        MapsKt.putAll(map, pairArr);
        return map;
    }

    @NotNull
    public static final Map<String, String> toMap(@NotNull Bundle bundle) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : bundle.keySet()) {
            String string = bundle.getString(str);
            String str2 = string;
            if (string == null) {
                str2 = "";
            }
            linkedHashMap.put(str, str2);
        }
        return linkedHashMap;
    }
}
