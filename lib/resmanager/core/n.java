package com.bilibili.lib.resmanager.core;

import androidx.annotation.AnyThread;
import com.bilibili.droid.thread.HandlerThreads;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/resmanager/core/n.class */
@AnyThread
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ResDatabase f64324a;

    public n(@NotNull ResDatabase resDatabase) {
        this.f64324a = resDatabase;
    }

    public final void a(@NotNull final List<CacheEntry> list) {
        if (list.isEmpty()) {
            return;
        }
        HandlerThreads.post(2, new Runnable(this, list) { // from class: com.bilibili.lib.resmanager.core.k

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final n f64316a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final List f64317b;

            {
                this.f64316a = this;
                this.f64317b = list;
            }

            @Override // java.lang.Runnable
            public final void run() {
                n nVar = this.f64316a;
                List list2 = this.f64317b;
                try {
                    c cVarE = nVar.f64324a.e();
                    List list3 = list2;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        String fileKey = ((CacheEntry) it.next()).getFileKey();
                        if (fileKey != null) {
                            arrayList.add(fileKey);
                        }
                    }
                    cVarE.b(arrayList);
                    BLog.i("ResManager", "deleteToDb success: list = " + list2);
                } catch (Throwable th) {
                    BLog.e("ResManager", "deleteToDb failed: list = " + list2, th);
                }
            }
        });
    }

    @NotNull
    public final List<CacheEntry> b() {
        List<CacheEntry> listEmptyList;
        try {
            List<g> listA = this.f64324a.e().a();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listA, 10));
            Iterator<T> it = listA.iterator();
            while (true) {
                listEmptyList = arrayList;
                if (!it.hasNext()) {
                    break;
                }
                arrayList.add(h.b((g) it.next()));
            }
        } catch (Throwable th) {
            BLog.e("ResManager", "getAll", th);
            listEmptyList = CollectionsKt.emptyList();
        }
        return listEmptyList;
    }
}
