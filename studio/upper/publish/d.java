package com.bilibili.studio.upper.publish;

import android.os.Handler;
import android.os.Looper;
import com.bilibili.studio.upper.service.UpperArchiveMossWatcher;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/upper/publish/d.class */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final HashSet<a> f108674a = new HashSet<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final IA0.b f108675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final PublishDynamicMossCallback f108676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final g f108677d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/upper/publish/d$a.class */
    public interface a {
        void a(@NotNull Collection<IA0.a> collection);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/upper/publish/d$b.class */
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f108678a;

        static {
            int[] iArr = new int[UploadConfig$Status.values().length];
            try {
                iArr[UploadConfig$Status.UPLOAD_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            f108678a = iArr;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Handler$Callback, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [IA0.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.bilibili.studio.upper.publish.c, java.lang.Object] */
    static {
        ?? obj = new Object();
        ?? obj2 = new Object();
        obj2.f10090a = new HashMap<>();
        obj2.f10091b = new Handler(Looper.getMainLooper(), obj);
        f108675b = obj2;
        PublishDynamicMossCallback publishDynamicMossCallback = new PublishDynamicMossCallback(obj2);
        f108676c = publishDynamicMossCallback;
        f108677d = new g(obj2, new Object());
        LinkedHashMap linkedHashMap = (LinkedHashMap) UpperArchiveMossWatcher.f108683a;
        if (linkedHashMap.get(1L) == null) {
            linkedHashMap.put(1L, publishDynamicMossCallback);
        }
    }
}
