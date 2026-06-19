package com.bilibili.ogvcommon.play.resolver;

import androidx.collection.LruCache;
import com.bilibili.lib.media.resource.ExtraInfo;
import com.bilibili.okretro.call.json.JsonUtilKt;
import com.google.common.base.Optional;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/resolver/b.class */
public final class b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Type f73254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final LruCache<String, Optional<T>> f73255b = new LruCache<>(5);

    public b(@NotNull Type type) {
        this.f73254a = type;
    }

    @Nullable
    public final T a(@NotNull ExtraInfo extraInfo, @NotNull KProperty<?> kProperty) {
        Optional<T> optionalAbsent;
        String str = (String) extraInfo.getBusinessExtraInfo().get(kProperty.getName());
        if (str == null) {
            return null;
        }
        LruCache<String, Optional<T>> lruCache = this.f73255b;
        synchronized (lruCache) {
            optionalAbsent = lruCache.get(str);
            if (optionalAbsent == null) {
                try {
                    optionalAbsent = Optional.fromNullable(JsonUtilKt.parseJson(str, this.f73254a));
                } catch (JsonParseException e7) {
                    BLog.e("ExtraDelegate-getValue", "[ogv-common-ExtraDelegate-getValue] Parse failed.", e7);
                    optionalAbsent = Optional.absent();
                }
                lruCache.put(str, optionalAbsent);
            }
        }
        return (T) optionalAbsent.orNull();
    }

    public final void b(@NotNull ExtraInfo extraInfo, @NotNull KProperty<?> kProperty, @Nullable T t7) {
        String name = kProperty.getName();
        if (t7 == null) {
            extraInfo.getBusinessExtraInfo().remove(name);
            return;
        }
        String json = JsonUtilKt.toJson(t7);
        extraInfo.getBusinessExtraInfo().put(name, json);
        this.f73255b.put(json, Optional.of(t7));
    }
}
