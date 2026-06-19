package com.bilibili.search2.result.vertical.live.report;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.autofill.r;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/vertical/live/report/ReporterMap.class */
@Deprecated(message = "")
@StabilityInferred(parameters = 0)
public final class ReporterMap extends LinkedHashMap<String, Object> {
    public static final int $stable = 8;

    @NotNull
    public static final String COLON = ":";

    @NotNull
    public static final a Companion = new Object();

    @NotNull
    public static final String LEFT_BRACES = "{";

    @NotNull
    public static final String RIGHT_BRACES = "}";

    @NotNull
    public static final String SCREEN_STATUS = ":";

    @NotNull
    public static final String SEMICOLON = ";";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/vertical/live/report/ReporterMap$a.class */
    public static final class a {
    }

    @NotNull
    public final ReporterMap addParams(@Nullable String str, @Nullable Object obj) {
        super.put(str, obj);
        return this;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj == null ? true : obj instanceof String) {
            return containsKey((String) obj);
        }
        return false;
    }

    public /* bridge */ boolean containsKey(String str) {
        return super.containsKey((Object) str);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<String, Object>> entrySet() {
        return getEntries();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj == null ? true : obj instanceof String) {
            return get((String) obj);
        }
        return null;
    }

    public /* bridge */ Object get(String str) {
        return super.get((Object) str);
    }

    public /* bridge */ Set<Map.Entry<String, Object>> getEntries() {
        return super.entrySet();
    }

    public /* bridge */ Set<String> getKeys() {
        return super.keySet();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj == null ? true : obj instanceof String) ? obj2 : getOrDefault((String) obj, obj2);
    }

    public /* bridge */ Object getOrDefault(String str, Object obj) {
        return super.getOrDefault((Object) str, obj);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ Collection<Object> getValues() {
        return super.values();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<String> keySet() {
        return getKeys();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    @Deprecated(message = "")
    @NotNull
    public Object put(@Nullable String str, @NotNull Object obj) {
        throw new UnsupportedOperationException("should use ReporterMap#addParams().");
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj == null ? true : obj instanceof String) {
            return remove((String) obj);
        }
        return null;
    }

    public /* bridge */ Object remove(String str) {
        return super.remove((Object) str);
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if ((obj == null ? true : obj instanceof String) && obj2 != null) {
            return remove((String) obj, obj2);
        }
        return false;
    }

    public /* bridge */ boolean remove(String str, Object obj) {
        return super.remove((Object) str, obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.AbstractMap
    @NotNull
    public String toString() {
        StringBuilder sbA = r.a(LEFT_BRACES);
        if (!isEmpty()) {
            for (Map.Entry<String, Object> entry : entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                sbA.append(key);
                sbA.append(":");
                sbA.append(value);
                sbA.append(SEMICOLON);
            }
            M4.a.a(1, sbA);
        }
        sbA.append(RIGHT_BRACES);
        return sbA.toString();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<Object> values() {
        return getValues();
    }
}
