package com.bilibili.lib.resmanager.core;

import Ze0.InterfaceC3172a;
import android.text.TextUtils;
import androidx.compose.ui.text.font.x;
import com.alibaba.fastjson.JSON;
import com.bilibili.commons.io.FileUtils;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.resmanager.DownloadBizType;
import com.bilibili.lib.resmanager.ResRequest;
import com.bilibili.lib.resmanager.ResResponse;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/resmanager/core/DefaultResCache.class */
public final class DefaultResCache {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final InterfaceC3172a f64283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f64284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Map<String, CacheEntry> f64285c = new LinkedHashMap(0, 0.75f, true);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ReentrantLock f64286d = new ReentrantLock();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public HashMap<String, Long> f64287e = new HashMap<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public File f64288f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public n f64289g;
    public boolean h;

    public DefaultResCache(@Nullable InterfaceC3172a interfaceC3172a, boolean z6) {
        this.f64283a = interfaceC3172a;
        this.f64284b = z6;
    }

    public final boolean a() {
        ArrayList arrayList;
        ArrayList arrayList2;
        if (!this.h) {
            return false;
        }
        Boolean bool = (Boolean) ConfigManager.Companion.ab().get("resmanager.clean_wild_index", Boolean.TRUE);
        if (bool != null ? bool.booleanValue() : true) {
            this.f64286d.lock();
            try {
                Iterator it = ((LinkedHashMap) this.f64285c).entrySet().iterator();
                arrayList2 = new ArrayList();
                while (it.hasNext()) {
                    CacheEntry cacheEntry = (CacheEntry) ((Map.Entry) it.next()).getValue();
                    File file = this.f64288f;
                    File file2 = file;
                    if (file == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBaseDir");
                        file2 = null;
                    }
                    if (!new File(file2, cacheEntry.getLocation()).exists()) {
                        it.remove();
                        arrayList2.add(cacheEntry);
                    }
                }
            } catch (Throwable th) {
                BLog.e("ResManager", "cleanWildIndex", th);
            } finally {
            }
            if (!arrayList2.isEmpty()) {
                n nVar = this.f64289g;
                if (nVar != null) {
                    nVar.a(arrayList2);
                }
                BLog.w("ResManager", "cleanWildIndex: Wild indexes " + arrayList2 + " has been cleaned!");
                Unit unit = Unit.INSTANCE;
            }
        }
        Boolean bool2 = (Boolean) ConfigManager.Companion.ab().get("resmanager.clean_wild_resource", Boolean.TRUE);
        if (!(bool2 != null ? bool2.booleanValue() : true)) {
            return true;
        }
        File file3 = this.f64288f;
        if (file3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBaseDir");
            file3 = null;
        }
        if (!file3.exists() || !file3.isDirectory()) {
            return true;
        }
        this.f64286d.lock();
        try {
            Collection<CacheEntry> collectionValues = ((LinkedHashMap) this.f64285c).values();
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionValues, 10));
            for (CacheEntry cacheEntry2 : collectionValues) {
                arrayList.add(file3.getAbsolutePath() + File.separator + cacheEntry2.getLocation());
            }
        } catch (Throwable th2) {
            BLog.e("ResManager", "cleanWildResource", th2);
        } finally {
        }
        if (arrayList.isEmpty()) {
            BLog.w("ResManager", "cleanWildResource: cachePaths is empty, skip clean!");
        } else {
            List list = SequencesKt.toList(SequencesKt.filter(FilesKt.walkTopDown(file3), new androidx.room.l(arrayList, 3)));
            if (!list.isEmpty()) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ((File) it2.next()).delete();
                }
                BLog.w("ResManager", "cleanWildResource: Wild resources " + list + " has been cleaned!");
                Unit unit2 = Unit.INSTANCE;
            }
        }
        return true;
    }

    public final void b(@NotNull ResRequest resRequest) {
        String strA = r.a(resRequest);
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        ReentrantLock reentrantLock = this.f64286d;
        reentrantLock.lock();
        try {
            CacheEntry cacheEntry = (CacheEntry) ((LinkedHashMap) this.f64285c).get(strA);
            if (cacheEntry != null && !TextUtils.isEmpty(cacheEntry.getLocation())) {
                c(cacheEntry);
                k(cacheEntry);
                TypeIntrinsics.asMutableMap(this.f64285c).remove(strA);
                n nVar = this.f64289g;
                if (nVar != null) {
                    nVar.a(CollectionsKt.listOf(cacheEntry));
                }
                BLog.i("ResManager", "Delete file success! key:" + cacheEntry.getFileKey());
            }
            if (cacheEntry != null) {
                j(CollectionsKt.listOf(cacheEntry));
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void c(CacheEntry cacheEntry) {
        defpackage.a.b("deleteFileOrDir: location = ", cacheEntry.getLocation(), "ResManager");
        try {
            if (TextUtils.isEmpty(cacheEntry.getLocation())) {
                return;
            }
            String location = cacheEntry.getLocation();
            String str = File.separator;
            if (StringsKt.A(location, str, 0, false, 6) < 0) {
                File file = this.f64288f;
                if (file == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBaseDir");
                    file = null;
                }
                FileUtils.deleteQuietly(new File(file, cacheEntry.getLocation()));
                return;
            }
            String strSubstringBefore = StringsKt.substringBefore(cacheEntry.getLocation(), str, "");
            if (TextUtils.isEmpty(strSubstringBefore)) {
                return;
            }
            File file2 = this.f64288f;
            if (file2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBaseDir");
                file2 = null;
            }
            FileUtils.deleteQuietly(new File(file2, strSubstringBefore));
        } catch (Exception e7) {
            BLog.e("ResManager", "delete file error", e7);
        }
    }

    @Nullable
    public final ResResponse d(@NotNull ResRequest resRequest) {
        String strA = r.a(resRequest);
        ReentrantLock reentrantLock = this.f64286d;
        reentrantLock.lock();
        try {
            CacheEntry cacheEntry = (CacheEntry) ((LinkedHashMap) this.f64285c).get(strA);
            if (cacheEntry != null && !TextUtils.isEmpty(cacheEntry.getLocation())) {
                File file = this.f64288f;
                File file2 = file;
                if (file == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBaseDir");
                    file2 = null;
                }
                File file3 = new File(file2, cacheEntry.getLocation());
                if (file3.exists()) {
                    cacheEntry.setAccessCount(cacheEntry.getAccessCount() + 1);
                    cacheEntry.setAccessTime(System.nanoTime());
                    n nVar = this.f64289g;
                    if (nVar != null) {
                        List listListOf = CollectionsKt.listOf(cacheEntry);
                        GY0.d dVar = new GY0.d(7);
                        if (listListOf.isEmpty()) {
                            dVar.invoke();
                        } else {
                            HandlerThreads.post(2, new m(nVar, listListOf, dVar));
                        }
                    }
                    BLog.i("ResManager", "Fetch file success! url:" + resRequest.getUrl$resmanager_release() + ", key:" + resRequest.getKey$resmanager_release() + ", path:" + file3.getAbsolutePath());
                    return new ResResponse(file3.getAbsolutePath(), file3);
                }
                BLog.i("ResManager", "Fetch file failed, cause file not exist! url:" + resRequest.getUrl$resmanager_release() + ", key:" + resRequest.getKey$resmanager_release());
                b(resRequest);
            }
            BLog.i("ResManager", "Fetch file failed, cause file not exist! url:" + resRequest.getUrl$resmanager_release() + ", key:" + resRequest.getKey$resmanager_release());
            reentrantLock.unlock();
            return null;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final String e(File file) {
        String strA;
        File file2 = this.f64288f;
        File file3 = file2;
        if (file2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBaseDir");
            file3 = null;
        }
        String absolutePath = file3.getAbsolutePath();
        String str = File.separator;
        if (StringsKt.w(absolutePath, str)) {
            File file4 = this.f64288f;
            File file5 = file4;
            if (file4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBaseDir");
                file5 = null;
            }
            strA = file5.getAbsolutePath();
        } else {
            File file6 = this.f64288f;
            File file7 = file6;
            if (file6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBaseDir");
                file7 = null;
            }
            strA = G.p.a(file7.getAbsolutePath(), str);
        }
        String absolutePath2 = file.getAbsolutePath();
        if (StringsKt.Z(absolutePath2, strA)) {
            return StringsKt.b0(absolutePath2, strA);
        }
        return null;
    }

    public final long f(CacheEntry cacheEntry) {
        long size;
        try {
            File file = this.f64288f;
            File file2 = file;
            if (file == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBaseDir");
                file2 = null;
            }
            size = new File(file2, cacheEntry.getLocation()).length();
        } catch (Throwable th) {
            size = cacheEntry.getSize();
        }
        return size;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x039e A[LOOP:3: B:108:0x0399->B:110:0x039e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ba A[Catch: all -> 0x01c1, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x01c1, blocks: (B:56:0x01ac, B:59:0x01ba, B:62:0x01c5, B:64:0x01d5, B:67:0x01e3, B:69:0x01f8, B:71:0x0204, B:89:0x0274, B:91:0x0292, B:93:0x029a, B:95:0x02aa, B:97:0x02de, B:99:0x02eb, B:101:0x0306, B:102:0x0366, B:73:0x021f, B:76:0x023a, B:78:0x0241, B:80:0x0252, B:82:0x0259, B:84:0x0261, B:87:0x026d), top: B:115:0x01ac }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d5 A[Catch: all -> 0x01c1, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x01c1, blocks: (B:56:0x01ac, B:59:0x01ba, B:62:0x01c5, B:64:0x01d5, B:67:0x01e3, B:69:0x01f8, B:71:0x0204, B:89:0x0274, B:91:0x0292, B:93:0x029a, B:95:0x02aa, B:97:0x02de, B:99:0x02eb, B:101:0x0306, B:102:0x0366, B:73:0x021f, B:76:0x023a, B:78:0x0241, B:80:0x0252, B:82:0x0259, B:84:0x0261, B:87:0x026d), top: B:115:0x01ac }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x021f A[Catch: all -> 0x01c1, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x01c1, blocks: (B:56:0x01ac, B:59:0x01ba, B:62:0x01c5, B:64:0x01d5, B:67:0x01e3, B:69:0x01f8, B:71:0x0204, B:89:0x0274, B:91:0x0292, B:93:0x029a, B:95:0x02aa, B:97:0x02de, B:99:0x02eb, B:101:0x0306, B:102:0x0366, B:73:0x021f, B:76:0x023a, B:78:0x0241, B:80:0x0252, B:82:0x0259, B:84:0x0261, B:87:0x026d), top: B:115:0x01ac }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x026d A[Catch: all -> 0x01c1, TRY_ENTER, TryCatch #0 {all -> 0x01c1, blocks: (B:56:0x01ac, B:59:0x01ba, B:62:0x01c5, B:64:0x01d5, B:67:0x01e3, B:69:0x01f8, B:71:0x0204, B:89:0x0274, B:91:0x0292, B:93:0x029a, B:95:0x02aa, B:97:0x02de, B:99:0x02eb, B:101:0x0306, B:102:0x0366, B:73:0x021f, B:76:0x023a, B:78:0x0241, B:80:0x0252, B:82:0x0259, B:84:0x0261, B:87:0x026d), top: B:115:0x01ac }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x029a A[Catch: all -> 0x01c1, TRY_LEAVE, TryCatch #0 {all -> 0x01c1, blocks: (B:56:0x01ac, B:59:0x01ba, B:62:0x01c5, B:64:0x01d5, B:67:0x01e3, B:69:0x01f8, B:71:0x0204, B:89:0x0274, B:91:0x0292, B:93:0x029a, B:95:0x02aa, B:97:0x02de, B:99:0x02eb, B:101:0x0306, B:102:0x0366, B:73:0x021f, B:76:0x023a, B:78:0x0241, B:80:0x0252, B:82:0x0259, B:84:0x0261, B:87:0x026d), top: B:115:0x01ac }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(@org.jetbrains.annotations.NotNull android.content.Context r9) {
        /*
            Method dump skipped, instruction units count: 1029
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.resmanager.core.DefaultResCache.g(android.content.Context):void");
    }

    @Nullable
    public final Boolean h(@NotNull ResRequest resRequest) {
        ReentrantLock reentrantLock = this.f64286d;
        reentrantLock.lock();
        try {
            String strA = r.a(resRequest);
            if (TextUtils.isEmpty(strA)) {
                return Boolean.FALSE;
            }
            CacheEntry cacheEntry = (CacheEntry) ((LinkedHashMap) this.f64285c).get(strA);
            if (cacheEntry == null || TextUtils.isEmpty(cacheEntry.getLocation())) {
                return Boolean.FALSE;
            }
            File file = this.f64288f;
            File file2 = file;
            if (file == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBaseDir");
                file2 = null;
            }
            boolean zExists = new File(file2, cacheEntry.getLocation()).exists();
            reentrantLock.unlock();
            return Boolean.valueOf(zExists);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final List<CacheEntry> i() {
        try {
            File file = this.f64288f;
            File file2 = file;
            if (file == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBaseDir");
                file2 = null;
            }
            File file3 = new File(file2, "journal");
            return !file3.exists() ? CollectionsKt.emptyList() : JSON.parseArray(FileUtils.readFileToString(file3), CacheEntry.class);
        } catch (Exception e7) {
            this.f64287e = new HashMap<>();
            ((LinkedHashMap) this.f64285c).clear();
            File file4 = this.f64288f;
            if (file4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBaseDir");
                file4 = null;
            }
            FileUtils.deleteQuietly(file4);
            BLog.e("ResManager", "loadEntityFromFile", e7);
            return CollectionsKt.emptyList();
        }
    }

    public final void j(List<CacheEntry> list) {
        DownloadBizType downloadBizType;
        InterfaceC3172a interfaceC3172a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            String bizType = ((CacheEntry) obj).getBizType();
            Object obj2 = linkedHashMap.get(bizType);
            Object objA = obj2;
            if (obj2 == null) {
                objA = x.a(linkedHashMap, bizType);
            }
            ((List) objA).add(obj);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            List list2 = (List) entry.getValue();
            DownloadBizType[] downloadBizTypeArrValues = DownloadBizType.values();
            int length = downloadBizTypeArrValues.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    downloadBizType = null;
                    break;
                }
                downloadBizType = downloadBizTypeArrValues[i7];
                if (Intrinsics.areEqual(downloadBizType.name(), str)) {
                    break;
                } else {
                    i7++;
                }
            }
            if (downloadBizType != null && (interfaceC3172a = this.f64283a) != null) {
                List list3 = list2;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    String fileKey = ((CacheEntry) it.next()).getFileKey();
                    String str2 = fileKey;
                    if (fileKey == null) {
                        str2 = "";
                    }
                    arrayList.add(new Ze0.c(str2));
                }
                interfaceC3172a.b(downloadBizType, arrayList);
            }
        }
    }

    public final void k(CacheEntry cacheEntry) {
        Long l7 = this.f64287e.get(cacheEntry.getBizType());
        long jLongValue = (l7 != null ? l7.longValue() : 0L) - f(cacheEntry);
        HashMap<String, Long> map = this.f64287e;
        String bizType = cacheEntry.getBizType();
        long j7 = 0;
        if (jLongValue >= 0) {
            j7 = jLongValue;
        }
        map.put(bizType, Long.valueOf(j7));
    }

    public final void l() {
        InterfaceC3172a interfaceC3172a;
        DownloadBizType downloadBizType;
        ArrayList arrayList = new ArrayList();
        ReentrantLock reentrantLock = this.f64286d;
        reentrantLock.lock();
        try {
            DownloadBizType[] downloadBizTypeArrValues = DownloadBizType.values();
            int length = downloadBizTypeArrValues.length;
            int i7 = 0;
            while (true) {
                interfaceC3172a = this.f64283a;
                if (i7 >= length) {
                    break;
                }
                DownloadBizType downloadBizType2 = downloadBizTypeArrValues[i7];
                if (interfaceC3172a != null) {
                    interfaceC3172a.c(downloadBizType2, this.f64287e.get(downloadBizType2.name()));
                }
                Iterator it = ((LinkedHashMap) this.f64285c).entrySet().iterator();
                while (true) {
                    Long l7 = this.f64287e.get(downloadBizType2.name());
                    if ((l7 != null ? l7.longValue() : 0L) <= downloadBizType2.getMaxSize() || !it.hasNext()) {
                        break;
                    }
                    CacheEntry cacheEntry = (CacheEntry) ((Map.Entry) it.next()).getValue();
                    if (!TextUtils.isEmpty(cacheEntry.getLocation()) && cacheEntry.isCleanable() && Intrinsics.areEqual(downloadBizType2.name(), cacheEntry.getBizType())) {
                        c(cacheEntry);
                        k(cacheEntry);
                        it.remove();
                        arrayList.add(cacheEntry);
                        BLog.w("ResManager", "Trim to size, remove file: key:" + cacheEntry.getFileKey() + ", path:" + cacheEntry.getLocation() + ", accessCount:" + cacheEntry.getAccessCount());
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("statusCode", String.valueOf(0));
                        linkedHashMap.put("type", "remove");
                        Neurons.trackT(false, "res.manager.tracker", linkedHashMap, 1, new AT0.c(8));
                    }
                }
                i7++;
            }
            n nVar = this.f64289g;
            if (nVar != null) {
                nVar.a(arrayList);
            }
            BLog.i("ResManager", "Trim to size success! Current size:" + this.f64287e);
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj : arrayList) {
                String bizType = ((CacheEntry) obj).getBizType();
                Object obj2 = linkedHashMap2.get(bizType);
                Object objA = obj2;
                if (obj2 == null) {
                    objA = x.a(linkedHashMap2, bizType);
                }
                ((List) objA).add(obj);
            }
            for (Map.Entry entry : linkedHashMap2.entrySet()) {
                String str = (String) entry.getKey();
                List list = (List) entry.getValue();
                DownloadBizType[] downloadBizTypeArrValues2 = DownloadBizType.values();
                int length2 = downloadBizTypeArrValues2.length;
                int i8 = 0;
                while (true) {
                    if (i8 >= length2) {
                        downloadBizType = null;
                        break;
                    }
                    downloadBizType = downloadBizTypeArrValues2[i8];
                    if (Intrinsics.areEqual(downloadBizType.name(), str)) {
                        break;
                    } else {
                        i8++;
                    }
                }
                if (downloadBizType != null && interfaceC3172a != null) {
                    List list2 = list;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        String fileKey = ((CacheEntry) it2.next()).getFileKey();
                        String str2 = fileKey;
                        if (fileKey == null) {
                            str2 = "";
                        }
                        arrayList2.add(new Ze0.c(str2));
                    }
                    interfaceC3172a.a(downloadBizType, arrayList2);
                }
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
