package com.bilibili.studio.videoeditor.common.intent;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/common/intent/b.class */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f109430a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map<String, Object> f109431b = Collections.synchronizedMap(new LinkedHashMap());

    @Nullable
    public final <T> T a(@NotNull String str) {
        Object obj;
        synchronized (this) {
            Object obj2 = f109431b.get(str);
            obj = obj2;
            if (obj2 == null) {
                obj = null;
            }
        }
        return (T) obj;
    }

    public final void b(@NotNull Object obj, @NotNull String str) {
        synchronized (this) {
            Map<String, Object> map = f109431b;
            if (!map.containsKey(str) && map.size() >= 40) {
                c();
            }
            map.put(str, obj);
        }
    }

    public final void c() {
        synchronized (this) {
            Map<String, Object> map = f109431b;
            if (!map.isEmpty()) {
                Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
                it.next();
                it.remove();
                BLog.e("BigDataMemoryKeeper", "removeFirstInsertData data=" + Unit.INSTANCE);
            }
        }
    }
}
