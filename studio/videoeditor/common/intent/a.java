package com.bilibili.studio.videoeditor.common.intent;

import G.p;
import M3.C2568c;
import M3.C2571d;
import android.content.Context;
import com.google.gson.Gson;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.io.FilesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/common/intent/a.class */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Lazy<a> f109426c = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new C2568c(5));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Lazy<Gson> f109427d = LazyKt.lazy(new C2571d(7));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final HashMap<String, WeakReference<Object>> f109428a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public String f109429b;

    /* JADX INFO: renamed from: com.bilibili.studio.videoeditor.common.intent.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/common/intent/a$a.class */
    public static final class C1206a {
        @NotNull
        public static a a() {
            return (a) a.f109426c.getValue();
        }
    }

    public static String b(Context context) {
        File externalFilesDir = context.getExternalFilesDir("video_edit");
        File filesDir = externalFilesDir;
        if (externalFilesDir == null) {
            filesDir = context.getFilesDir();
        }
        if (!filesDir.exists()) {
            filesDir.mkdir();
        }
        String strA = p.a(filesDir.getAbsolutePath(), "/default/");
        File file = new File(strA);
        if (!file.exists()) {
            file.mkdir();
        }
        return strA;
    }

    @Nullable
    public final Object a(@NotNull Context context, @NotNull Class cls, @NotNull String str) {
        WeakReference<Object> weakReference = this.f109428a.get(str);
        if ((weakReference != null ? weakReference.get() : null) != null) {
            WeakReference<Object> weakReference2 = this.f109428a.get(str);
            return weakReference2 != null ? weakReference2.get() : null;
        }
        if (this.f109429b == null) {
            this.f109429b = b(context);
        }
        String[] list = new File(this.f109429b).list();
        if (list == null) {
            return null;
        }
        new ArrayList();
        for (String str2 : list) {
            if (str2.equals(str)) {
                try {
                    Object objFromJson = ((Gson) f109427d.getValue()).fromJson(FilesKt.h(new File(this.f109429b + str2)), cls);
                    if (objFromJson != null) {
                        this.f109428a.put(str, new WeakReference<>(objFromJson));
                        return objFromJson;
                    }
                    continue;
                } catch (Exception e7) {
                    BLog.e("BigDataIntentKeeper", e7.getMessage());
                }
            }
        }
        return null;
    }

    public final void c(@NotNull Context context, @NotNull String str, @NotNull Object obj) {
        this.f109428a.put(str, new WeakReference<>(obj));
        if (this.f109429b == null) {
            this.f109429b = b(context);
        }
        try {
            FilesKt.l(new File(this.f109429b + str), ((Gson) f109427d.getValue()).toJson(obj));
        } catch (Exception e7) {
            BLog.e("BigDataIntentKeeper", e7.getMessage());
        }
    }
}
