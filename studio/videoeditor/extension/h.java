package com.bilibili.studio.videoeditor.extension;

import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/extension/h.class */
public final class h {
    @Nullable
    public static final Object a(@Nullable P50.f<?> fVar, @NotNull String str) {
        if (fVar == null) {
            return null;
        }
        Map<Object, Map<String, Object>> map = g.f109568a;
        Map map2 = (Map) ((LinkedHashMap) g.f109568a).get(Long.valueOf(fVar.getObjHashCode()));
        Object obj = null;
        if (map2 != null) {
            obj = map2.get(str);
        }
        return obj;
    }

    @Nullable
    public static final void b(@Nullable P50.f fVar) {
        if (fVar == null) {
            return;
        }
        Map<Object, Map<String, Object>> map = g.f109568a;
        g.f109568a.remove(Long.valueOf(fVar.getObjHashCode()));
    }

    public static final void c(@Nullable P50.f<?> fVar, @NotNull String str, @Nullable Object obj) {
        if (fVar == null) {
            return;
        }
        Map<Object, Map<String, Object>> map = g.f109568a;
        Long lValueOf = Long.valueOf(fVar.getObjHashCode());
        Map<Object, Map<String, Object>> map2 = g.f109568a;
        Map<String, Object> map3 = (Map) ((LinkedHashMap) map2).get(lValueOf);
        Map<String, Object> linkedHashMap = map3;
        if (map3 == null) {
            linkedHashMap = new LinkedHashMap();
        }
        linkedHashMap.put(str, obj);
        map2.put(lValueOf, linkedHashMap);
    }
}
