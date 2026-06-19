package com.bilibili.lib.resmanager.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/resmanager/core/m.class */
public final /* synthetic */ class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f64321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f64322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function0 f64323c;

    public /* synthetic */ m(n nVar, List list, Function0 function0) {
        this.f64321a = nVar;
        this.f64322b = list;
        this.f64323c = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n nVar = this.f64321a;
        List list = this.f64322b;
        Function0 function0 = this.f64323c;
        try {
            c cVarE = nVar.f64324a.e();
            List list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(h.a((CacheEntry) it.next()));
            }
            cVarE.c(arrayList);
            BLog.i("ResManager", "updateToDb success: list = " + list);
            function0.invoke();
        } catch (Throwable th) {
            BLog.e("ResManager", "updateToDb failed: list = " + list, th);
        }
    }
}
