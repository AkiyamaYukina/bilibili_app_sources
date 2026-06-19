package com.bilibili.lib.resmanager.core;

import android.text.TextUtils;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.gripper.downloader.GDownloader;
import com.bilibili.lib.resmanager.ResCallback;
import com.bilibili.lib.resmanager.ResDownloadRequest;
import com.bilibili.lib.resmanager.ResResponse;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/resmanager/core/a.class */
public final class a implements GDownloader.DownloadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f64294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ResDownloadRequest f64295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ResCallback f64296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final DefaultResCache f64297d;

    public a(b bVar, ResDownloadRequest resDownloadRequest, ResCallback resCallback, DefaultResCache defaultResCache) {
        this.f64294a = bVar;
        this.f64295b = resDownloadRequest;
        this.f64296c = resCallback;
        this.f64297d = defaultResCache;
    }

    public final void onError(String str, GDownloader.Info.Error error) {
        super.onError(str, error);
        ResDownloadRequest resDownloadRequest = this.f64295b;
        StringBuilder sbA = G0.b.a("DownloadListener2: download failed! url:", resDownloadRequest.getUrl$resmanager_release(), ", key:", resDownloadRequest.getKey$resmanager_release(), ", info = ");
        sbA.append(error);
        BLog.i("BiliResDownloader", sbA.toString());
        Set<String> set = this.f64294a.f64299b;
        TypeIntrinsics.asMutableCollection(set).remove(resDownloadRequest.getUrl$resmanager_release());
        ResCallback resCallback = this.f64296c;
        if (resCallback != null) {
            resCallback.onFailure(error.getErrorCode(), error.getThrowable().toString());
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void onFinish(String str, GDownloader.Info.Success success) {
        CacheEntry cacheEntry;
        super.onFinish(str, success);
        String filename = success.getFilename();
        String dir = success.getDir();
        b bVar = this.f64294a;
        Set<String> set = bVar.f64299b;
        ResDownloadRequest resDownloadRequest = this.f64295b;
        TypeIntrinsics.asMutableCollection(set).remove(resDownloadRequest.getUrl$resmanager_release());
        boolean zIsEmpty = TextUtils.isEmpty(filename);
        ResCallback resCallback = this.f64296c;
        if (zIsEmpty || TextUtils.isEmpty(dir)) {
            if (resCallback != null) {
                resCallback.onFailure(1, "dest file not exist");
                return;
            }
            return;
        }
        File file = new File(dir, filename);
        if (!file.exists()) {
            if (resCallback != null) {
                resCallback.onFailure(1, "dest file not exist");
                return;
            }
            return;
        }
        StringBuilder sbA = G0.b.a("DownloadListener2: download success! url:", resDownloadRequest.getUrl$resmanager_release(), ", key:", resDownloadRequest.getKey$resmanager_release(), ", path:");
        sbA.append(dir);
        sbA.append("/");
        sbA.append(filename);
        BLog.i("BiliResDownloader", sbA.toString());
        DefaultResCache defaultResCache = this.f64297d;
        if (defaultResCache != null) {
            String strA = r.a(resDownloadRequest);
            if (!TextUtils.isEmpty(strA)) {
                ReentrantLock reentrantLock = defaultResCache.f64286d;
                reentrantLock.lock();
                try {
                    String strE = defaultResCache.e(file);
                    if (!TextUtils.isEmpty(strE)) {
                        CacheEntry cacheEntry2 = new CacheEntry();
                        cacheEntry2.setFileKey(strA);
                        cacheEntry2.setLocation(strE);
                        cacheEntry2.setCtime(System.currentTimeMillis());
                        cacheEntry2.setSize(file.length());
                        cacheEntry2.setEncryptMode(resDownloadRequest.getEncrypted$resmanager_release() ? 1 : 0);
                        cacheEntry2.setAccessCount(1);
                        cacheEntry2.setAccessTime(System.nanoTime());
                        cacheEntry2.setCleanable(resDownloadRequest.getCleanable$resmanager_release());
                        cacheEntry2.setBizType(resDownloadRequest.getBizType$resmanager_release().name());
                        if (defaultResCache.f64285c.containsKey(strA) && (cacheEntry = (CacheEntry) ((LinkedHashMap) defaultResCache.f64285c).get(strA)) != null) {
                            if (!Intrinsics.areEqual(cacheEntry.getLocation(), cacheEntry2.getLocation())) {
                                defaultResCache.c(cacheEntry);
                            }
                            HashMap<String, Long> map = defaultResCache.f64287e;
                            String bizType = cacheEntry2.getBizType();
                            Long l7 = defaultResCache.f64287e.get(cacheEntry2.getBizType());
                            map.put(bizType, Long.valueOf((l7 != null ? l7.longValue() : 0L) - defaultResCache.f(cacheEntry2)));
                        }
                        defaultResCache.f64285c.put(strA, cacheEntry2);
                        HashMap<String, Long> map2 = defaultResCache.f64287e;
                        String bizType2 = cacheEntry2.getBizType();
                        long jF = defaultResCache.f(cacheEntry2);
                        Long l8 = defaultResCache.f64287e.get(cacheEntry2.getBizType());
                        map2.put(bizType2, Long.valueOf(jF + (l8 != null ? l8.longValue() : 0L)));
                        n nVar = defaultResCache.f64289g;
                        if (nVar != null) {
                            List listListOf = CollectionsKt.listOf(cacheEntry2);
                            GY0.d dVar = new GY0.d(7);
                            if (listListOf.isEmpty()) {
                                dVar.invoke();
                            } else {
                                HandlerThreads.post(2, new m(nVar, listListOf, dVar));
                            }
                        }
                        BLog.i("ResManager", "Cache file success! key:" + cacheEntry2.getFileKey() + ", totalSize:" + defaultResCache.f64287e);
                        Unit unit = Unit.INSTANCE;
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
        }
        String absolutePath = file.getAbsolutePath();
        if (resCallback != null) {
            resCallback.onSuccess(new ResResponse(absolutePath, file));
        }
        TypeIntrinsics.asMutableCollection(bVar.f64299b).remove(resDownloadRequest.getUrl$resmanager_release());
    }
}
