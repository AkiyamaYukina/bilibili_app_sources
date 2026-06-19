package com.bilibili.studio.upper.publish;

import android.os.Handler;
import android.os.Message;
import com.bilibili.studio.upper.publish.d;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/upper/publish/b.class */
public final /* synthetic */ class b implements Handler.Callback {
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Comparator] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        List listSortedWith = CollectionsKt.sortedWith(d.f108675b.f10090a.values(), (Comparator) new Object());
        Iterator<d.a> it = d.f108674a.iterator();
        while (it.hasNext()) {
            it.next().a(listSortedWith);
        }
        return true;
    }
}
