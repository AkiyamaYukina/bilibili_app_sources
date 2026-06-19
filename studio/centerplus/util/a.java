package com.bilibili.studio.centerplus.util;

import androidx.activity.result.ActivityResultLauncher;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/util/a.class */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Map<String, a> f105281c = new LinkedHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public ActivityResultLauncher<String[]> f105282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public com.bilibili.upper.module.contribute.picker.v3.widget.a f105283b;

    /* JADX INFO: renamed from: com.bilibili.studio.centerplus.util.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/util/a$a.class */
    public static final class C1184a {
        @NotNull
        public static a a(@NotNull String str) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) a.f105281c;
            Object obj = linkedHashMap.get(str);
            Object aVar = obj;
            if (obj == null) {
                aVar = new a();
                linkedHashMap.put(str, aVar);
            }
            return (a) aVar;
        }
    }
}
