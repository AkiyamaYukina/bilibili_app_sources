package com.bilibili.studio.centerplus.util;

import com.bilibili.studio.editor.moudle.intelligence.media.strategy.d;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/util/i.class */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final CopyOnWriteArrayList<b> f105298a = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public static b f105299b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/util/i$a.class */
    public interface a {
        default void release() {
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/util/i$b.class */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f105300a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final ConcurrentHashMap<Object, a> f105301b = new ConcurrentHashMap<>();

        public b(int i7) {
            this.f105300a = i7;
        }
    }

    @Nullable
    public static a a() {
        d.a aVar = com.bilibili.studio.editor.moudle.intelligence.media.strategy.d.f107410d;
        b bVar = f105299b;
        a aVar2 = null;
        if (bVar != null) {
            a aVar3 = bVar.f105301b.get(aVar);
            aVar2 = null;
            if (aVar3 instanceof a) {
                aVar2 = aVar3;
            }
        }
        return aVar2;
    }
}
