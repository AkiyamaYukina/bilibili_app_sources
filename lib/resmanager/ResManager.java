package com.bilibili.lib.resmanager;

import GY0.d;
import Ze0.InterfaceC3172a;
import android.app.Application;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.lib.resmanager.core.CacheEntry;
import com.bilibili.lib.resmanager.core.DefaultResCache;
import com.bilibili.lib.resmanager.core.b;
import com.bilibili.lib.resmanager.core.m;
import com.bilibili.lib.resmanager.core.n;
import com.bilibili.lib.resmanager.core.q;
import com.bilibili.lib.resmanager.core.r;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/resmanager/ResManager.class */
public final class ResManager {

    @NotNull
    public static final ResManager INSTANCE = new ResManager();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static DefaultResCache f64277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public static q f64278b;

    @JvmStatic
    @WorkerThread
    public static final void delete(@NotNull ResRequest resRequest) {
        DefaultResCache defaultResCache = f64277a;
        if (defaultResCache != null) {
            defaultResCache.b(resRequest);
        }
    }

    @JvmStatic
    @WorkerThread
    public static final void deleteBatch(@NotNull List<? extends ResRequest> list) {
        DefaultResCache defaultResCache;
        if (list.isEmpty() || (defaultResCache = f64277a) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ReentrantLock reentrantLock = defaultResCache.f64286d;
        reentrantLock.lock();
        try {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                String strA = r.a((ResRequest) it.next());
                if (TextUtils.isEmpty(strA)) {
                    return;
                }
                CacheEntry cacheEntry = (CacheEntry) ((LinkedHashMap) defaultResCache.f64285c).get(strA);
                if (cacheEntry != null && !TextUtils.isEmpty(cacheEntry.getLocation())) {
                    defaultResCache.c(cacheEntry);
                    defaultResCache.k(cacheEntry);
                    arrayList.add(cacheEntry);
                    TypeIntrinsics.asMutableMap(defaultResCache.f64285c).remove(strA);
                }
            }
            n nVar = defaultResCache.f64289g;
            if (nVar != null) {
                nVar.a(arrayList);
            }
            BLog.i("ResManager", "Delete file batch success!");
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            defaultResCache.j(arrayList);
        } finally {
            reentrantLock.unlock();
        }
    }

    @JvmStatic
    @WorkerThread
    public static final void deleteWithWhitelist(@NotNull DownloadBizType downloadBizType, @NotNull List<? extends ResRequest> list) {
        DefaultResCache defaultResCache = f64277a;
        if (defaultResCache != null) {
            if (list.isEmpty()) {
                BLog.w("ResManager", "deleteWithWhitelist: WhiteList is empty, will delete all type of " + downloadBizType);
            }
            ArrayList arrayList = new ArrayList();
            ReentrantLock reentrantLock = defaultResCache.f64286d;
            reentrantLock.lock();
            try {
                Iterator it = ((LinkedHashMap) defaultResCache.f64285c).entrySet().iterator();
                List<? extends ResRequest> list2 = list;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(r.a((ResRequest) it2.next()));
                }
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    String str = (String) entry.getKey();
                    CacheEntry cacheEntry = (CacheEntry) entry.getValue();
                    if (Intrinsics.areEqual(cacheEntry.getBizType(), downloadBizType.name()) && !arrayList2.contains(str)) {
                        defaultResCache.c(cacheEntry);
                        defaultResCache.k(cacheEntry);
                        it.remove();
                        arrayList.add(cacheEntry);
                    }
                }
                n nVar = defaultResCache.f64289g;
                if (nVar != null) {
                    nVar.a(arrayList);
                }
                BLog.i("ResManager", "deleteWithWhitelist: Deleted resources: " + arrayList);
                Unit unit = Unit.INSTANCE;
                reentrantLock.unlock();
                defaultResCache.j(arrayList);
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    @JvmStatic
    @JvmOverloads
    public static final void download(@NotNull ResDownloadRequest resDownloadRequest) {
        download$default(resDownloadRequest, null, 2, null);
    }

    @JvmStatic
    @JvmOverloads
    public static final void download(@NotNull ResDownloadRequest resDownloadRequest, @Nullable ResCallback resCallback) {
        INSTANCE.getClass();
        q qVar = f64278b;
        if (qVar != null) {
            qVar.a(resDownloadRequest, f64277a, resCallback);
        }
    }

    public static /* synthetic */ void download$default(ResDownloadRequest resDownloadRequest, ResCallback resCallback, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            resCallback = null;
        }
        download(resDownloadRequest, resCallback);
    }

    @JvmStatic
    public static final void downloadBatch(@NotNull List<ResDownloadRequest> list) {
        if (list.isEmpty()) {
            return;
        }
        for (ResDownloadRequest resDownloadRequest : list) {
            INSTANCE.getClass();
            q qVar = f64278b;
            if (qVar != null) {
                qVar.a(resDownloadRequest, f64277a, null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0041  */
    @kotlin.jvm.JvmStatic
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean downloadSync(@org.jetbrains.annotations.NotNull com.bilibili.lib.resmanager.ResDownloadRequest r6) {
        /*
            com.bilibili.lib.resmanager.ResManager r0 = com.bilibili.lib.resmanager.ResManager.INSTANCE
            java.lang.Class r0 = r0.getClass()
            com.bilibili.lib.resmanager.core.q r0 = com.bilibili.lib.resmanager.ResManager.f64278b
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L41
            com.bilibili.lib.resmanager.core.DefaultResCache r0 = com.bilibili.lib.resmanager.ResManager.f64277a
            r9 = r0
            r0 = r8
            boolean r0 = r0.f64330b
            if (r0 != 0) goto L1f
            r0 = r8
            r1 = r9
            r0.b(r1)
        L1f:
            r0 = r8
            com.bilibili.lib.resmanager.core.b r0 = r0.f64329a
            r1 = r6
            r2 = r9
            r3 = 0
            com.bilibili.gripper.downloader.GDownloader$Dispatchers r4 = com.bilibili.gripper.downloader.GDownloader.Dispatchers.UNCONFINED
            com.bilibili.gripper.downloader.GDownloader$Task r0 = r0.a(r1, r2, r3, r4)
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L34
            goto L41
        L34:
            r0 = r6
            java.lang.Object r0 = r0.execute-d1pmJ48()
            boolean r0 = kotlin.Result.isSuccess-impl(r0)
            r7 = r0
            goto L43
        L41:
            r0 = 0
            r7 = r0
        L43:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.resmanager.ResManager.downloadSync(com.bilibili.lib.resmanager.ResDownloadRequest):boolean");
    }

    @JvmStatic
    @WorkerThread
    @Nullable
    public static final ResResponse fetch(@NotNull ResRequest resRequest) {
        DefaultResCache defaultResCache = f64277a;
        return defaultResCache != null ? defaultResCache.d(resRequest) : null;
    }

    @JvmStatic
    @WorkerThread
    @Nullable
    public static final ResResponse fetchAsync(@NotNull ResDownloadRequest resDownloadRequest, @Nullable ResCallback resCallback) {
        DefaultResCache defaultResCache = f64277a;
        ResResponse resResponseD = defaultResCache != null ? defaultResCache.d(resDownloadRequest) : null;
        if (resResponseD == null) {
            INSTANCE.getClass();
            q qVar = f64278b;
            if (qVar != null) {
                qVar.a(resDownloadRequest, f64277a, resCallback);
            }
        }
        return resResponseD;
    }

    public static /* synthetic */ ResResponse fetchAsync$default(ResDownloadRequest resDownloadRequest, ResCallback resCallback, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            resCallback = null;
        }
        return fetchAsync(resDownloadRequest, resCallback);
    }

    @JvmStatic
    public static final long getTotalSize(@NotNull DownloadBizType downloadBizType) {
        DefaultResCache defaultResCache = f64277a;
        long jLongValue = 0;
        if (defaultResCache != null) {
            Long l7 = defaultResCache.f64287e.get(downloadBizType.name());
            jLongValue = 0;
            if (l7 != null) {
                jLongValue = l7.longValue();
            }
        }
        return jLongValue;
    }

    @JvmStatic
    public static final void init(@NotNull Application application, @Nullable InterfaceC3172a interfaceC3172a, boolean z6) {
        f64278b = new q(new b(application));
        DefaultResCache defaultResCache = new DefaultResCache(interfaceC3172a, z6);
        f64277a = defaultResCache;
        defaultResCache.g(application);
    }

    @JvmStatic
    public static final boolean isFileExist(@NotNull ResRequest resRequest) {
        DefaultResCache defaultResCache = f64277a;
        return defaultResCache != null ? defaultResCache.h(resRequest).booleanValue() : false;
    }

    @JvmStatic
    @WorkerThread
    public static final boolean rename(@NotNull ResRequest resRequest, @NotNull ResRequest resRequest2) {
        DefaultResCache defaultResCache = f64277a;
        boolean zRenameTo = false;
        if (defaultResCache != null) {
            final String strA = r.a(resRequest);
            String strA2 = r.a(resRequest2);
            zRenameTo = false;
            if (!TextUtils.isEmpty(strA)) {
                if (TextUtils.isEmpty(strA2) || TextUtils.equals(strA, strA2)) {
                    zRenameTo = false;
                } else {
                    try {
                        ReentrantLock reentrantLock = defaultResCache.f64286d;
                        reentrantLock.lock();
                        try {
                            final CacheEntry cacheEntry = (CacheEntry) ((LinkedHashMap) defaultResCache.f64285c).get(strA);
                            if (cacheEntry == null || TextUtils.isEmpty(cacheEntry.getLocation())) {
                                BLog.i("ResManager", "Rename failure! origin file not exist!: request = " + resRequest);
                            } else {
                                File file = defaultResCache.f64288f;
                                File file2 = file;
                                if (file == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("mBaseDir");
                                    file2 = null;
                                }
                                File file3 = new File(file2, cacheEntry.getLocation());
                                if (file3.exists()) {
                                    CacheEntry cacheEntry2 = (CacheEntry) ((LinkedHashMap) defaultResCache.f64285c).get(strA2);
                                    if (cacheEntry2 != null && !TextUtils.isEmpty(cacheEntry2.getLocation())) {
                                        defaultResCache.c(cacheEntry2);
                                        TypeIntrinsics.asMutableMap(defaultResCache.f64285c).remove(strA);
                                    }
                                    File file4 = new File(file3.getParent(), strA2);
                                    boolean zRenameTo2 = file3.renameTo(file4);
                                    zRenameTo = zRenameTo2;
                                    if (!zRenameTo2) {
                                        zRenameTo = zRenameTo2;
                                        if (file4.exists()) {
                                            file4.delete();
                                            zRenameTo = file3.renameTo(file4);
                                        }
                                    }
                                    if (zRenameTo) {
                                        cacheEntry.setFileKey(strA2);
                                        cacheEntry.setLocation(defaultResCache.e(file4));
                                        TypeIntrinsics.asMutableMap(defaultResCache.f64285c).remove(strA);
                                        defaultResCache.f64285c.put(strA2, cacheEntry);
                                        final n nVar = defaultResCache.f64289g;
                                        if (nVar != null) {
                                            HandlerThreads.post(2, new Runnable(nVar, strA, cacheEntry) { // from class: com.bilibili.lib.resmanager.core.j

                                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                                public final n f64313a;

                                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                public final String f64314b;

                                                /* JADX INFO: renamed from: c, reason: collision with root package name */
                                                public final CacheEntry f64315c;

                                                {
                                                    this.f64313a = nVar;
                                                    this.f64314b = strA;
                                                    this.f64315c = cacheEntry;
                                                }

                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    final n nVar2 = this.f64313a;
                                                    final String str = this.f64314b;
                                                    final CacheEntry cacheEntry3 = this.f64315c;
                                                    try {
                                                        nVar2.f64324a.runInTransaction(new Runnable(nVar2, str, cacheEntry3) { // from class: com.bilibili.lib.resmanager.core.l

                                                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                                                            public final n f64318a;

                                                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                            public final String f64319b;

                                                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                                                            public final CacheEntry f64320c;

                                                            {
                                                                this.f64318a = nVar2;
                                                                this.f64319b = str;
                                                                this.f64320c = cacheEntry3;
                                                            }

                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                n nVar3 = this.f64318a;
                                                                String str2 = this.f64319b;
                                                                CacheEntry cacheEntry4 = this.f64320c;
                                                                nVar3.f64324a.e().b(CollectionsKt.listOf(str2));
                                                                nVar3.f64324a.e().c(CollectionsKt.listOf(h.a(cacheEntry4)));
                                                                BLog.i("ResManager", "deleteAndUpdate success: deleteKey = " + str2 + ", update = " + cacheEntry4);
                                                            }
                                                        });
                                                    } catch (Throwable th) {
                                                        BLog.e("ResManager", "deleteAndUpdate failed: deleteKey = " + str + ", update = " + cacheEntry3, th);
                                                    }
                                                }
                                            });
                                        }
                                    }
                                    BLog.i("ResManager", "Rename file: key = " + cacheEntry + ", result: " + zRenameTo);
                                    reentrantLock.unlock();
                                } else {
                                    BLog.i("ResManager", "Rename failure! origin file not exist!: request = " + resRequest);
                                }
                            }
                            zRenameTo = false;
                        } finally {
                            reentrantLock.unlock();
                        }
                    } catch (Throwable th) {
                        BLog.e("ResManager", "Rename file failed", th);
                        zRenameTo = false;
                    }
                }
            }
        }
        return zRenameTo;
    }

    @JvmStatic
    @WorkerThread
    public static final void update(@NotNull Ze0.b bVar) {
        update((List<? extends Ze0.b>) CollectionsKt.listOf(bVar));
    }

    @JvmStatic
    @WorkerThread
    public static final void update(@NotNull List<? extends Ze0.b> list) {
        DefaultResCache defaultResCache;
        CacheEntry cacheEntry;
        if (list.isEmpty() || (defaultResCache = f64277a) == null) {
            return;
        }
        ReentrantLock reentrantLock = defaultResCache.f64286d;
        reentrantLock.lock();
        try {
            ArrayList arrayList = new ArrayList();
            for (Ze0.b bVar : list) {
                String strA = r.a(bVar);
                CacheEntry cacheEntry2 = null;
                if (!TextUtils.isEmpty(strA) && (cacheEntry = (CacheEntry) ((LinkedHashMap) defaultResCache.f64285c).get(strA)) != null) {
                    DownloadBizType downloadBizType = bVar.f29615c;
                    if (downloadBizType != null) {
                        cacheEntry.setBizType(downloadBizType.name());
                    }
                    Boolean bool = bVar.f29616d;
                    if (bool != null) {
                        cacheEntry.setCleanable(bool.booleanValue());
                    }
                    cacheEntry2 = cacheEntry;
                }
                if (cacheEntry2 != null) {
                    arrayList.add(cacheEntry2);
                }
            }
            n nVar = defaultResCache.f64289g;
            if (nVar != null) {
                d dVar = new d(7);
                if (arrayList.isEmpty()) {
                    dVar.invoke();
                } else {
                    HandlerThreads.post(2, new m(nVar, arrayList, dVar));
                }
            }
            BLog.i("ResManager", "update success: requests = " + list);
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }
}
