package com.bilibili.upper.module.honour.utils;

import com.bilibili.upper.module.honour.bean.KingHonourDownloadBean;
import com.bilibili.upper.module.honour.utils.b;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import q4.M;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/honour/utils/g.class */
public final /* synthetic */ class g implements b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f113349a;

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Comparator] */
    @Override // com.bilibili.upper.module.honour.utils.b.a
    public void a(List list) {
        BLog.e("KingHonourManager", "download success");
        ArrayList arrayList = new ArrayList();
        Iterator it = CollectionsKt.sortedWith(list, (Comparator) new Object()).iterator();
        while (it.hasNext()) {
            arrayList.add(((KingHonourDownloadBean) it.next()).getUrl());
        }
        String str = (String) CollectionsKt.firstOrNull(arrayList);
        M.b("download video url is ", str, "KingHonourManager");
        ((i) this.f113349a).invoke(str, Boolean.TRUE);
    }
}
