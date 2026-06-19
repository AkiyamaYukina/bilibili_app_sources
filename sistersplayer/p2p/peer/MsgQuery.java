package com.bilibili.sistersplayer.p2p.peer;

import java.util.List;
import java.util.Map;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/peer/MsgQuery.class */
public final class MsgQuery {

    @Nullable
    private Object data;

    public MsgQuery(@Nullable Object obj) {
        this.data = obj;
    }

    @NotNull
    public final MsgQuery get(int i7) {
        List list;
        Object obj = this.data;
        return (obj == null || !(obj instanceof List) || (list = (List) obj) == null || i7 < 0 || i7 >= list.size()) ? new MsgQuery(null) : new MsgQuery(list.get(i7));
    }

    @NotNull
    public final MsgQuery get(@NotNull String str) {
        Map map;
        Object obj = this.data;
        return (obj == null || !(obj instanceof Map) || (map = (Map) obj) == null || !map.containsKey(str)) ? new MsgQuery(null) : new MsgQuery(map.get(str));
    }

    @Nullable
    public final Boolean getBoolean() {
        Object obj = this.data;
        return obj instanceof Boolean ? (Boolean) obj : null;
    }

    @Nullable
    public final byte[] getByteArray() {
        Object obj = this.data;
        return obj instanceof byte[] ? (byte[]) obj : null;
    }

    @Nullable
    public final Object getData() {
        return this.data;
    }

    @Nullable
    public final Double getDouble() {
        Object obj = this.data;
        return obj instanceof Double ? (Double) obj : obj instanceof Float ? Double.valueOf(((Float) obj).floatValue()) : obj instanceof Integer ? Double.valueOf(((Integer) obj).intValue()) : obj instanceof Long ? Double.valueOf(((Long) obj).longValue()) : null;
    }

    @Nullable
    public final Float getFloat() {
        Object obj = this.data;
        return obj instanceof Float ? (Float) obj : obj instanceof Double ? Float.valueOf((float) ((Double) obj).doubleValue()) : obj instanceof Integer ? Float.valueOf(((Integer) obj).intValue()) : obj instanceof Long ? Float.valueOf(((Long) obj).longValue()) : null;
    }

    @Nullable
    public final Integer getInt() {
        Object obj = this.data;
        return obj instanceof Integer ? (Integer) obj : obj instanceof Long ? Integer.valueOf((int) ((Long) obj).longValue()) : obj instanceof Double ? Integer.valueOf(MathKt.roundToInt(((Double) obj).doubleValue())) : obj instanceof Float ? Integer.valueOf(MathKt.roundToInt(((Float) obj).floatValue())) : null;
    }

    @Nullable
    public final Integer getLength() {
        List list;
        Object obj = this.data;
        if (obj == null || !(obj instanceof List) || (list = (List) obj) == null) {
            return null;
        }
        return Integer.valueOf(list.size());
    }

    @Nullable
    public final Long getLong() {
        Object obj = this.data;
        return obj instanceof Long ? (Long) obj : obj instanceof Integer ? Long.valueOf(((Integer) obj).intValue()) : obj instanceof Float ? Long.valueOf(MathKt.roundToLong(((Float) obj).floatValue())) : obj instanceof Double ? Long.valueOf(MathKt.roundToLong(((Double) obj).doubleValue())) : null;
    }

    @Nullable
    public final String getString() {
        Object obj = this.data;
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final void setData(@Nullable Object obj) {
        this.data = obj;
    }
}
