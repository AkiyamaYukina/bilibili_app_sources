package com.bilibili.studio.centerplus.util;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bilibili.studio.centerplus.util.i;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/util/j.class */
public final class j implements DefaultLifecycleObserver {
    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner) {
        int iHashCode = lifecycleOwner.hashCode();
        i.b bVar = new i.b(iHashCode);
        i.f105298a.add(bVar);
        i.f105299b = bVar;
        bilibili.live.app.service.resolver.c.a(iHashCode, "register, onCreate, ", "UpperContributeContext");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        i.b bVarRemove;
        int iHashCode = lifecycleOwner.hashCode();
        Iterator<i.b> it = i.f105298a.iterator();
        int i7 = 0;
        while (true) {
            if (!it.hasNext()) {
                i7 = -1;
                break;
            } else if (it.next().f105300a == iHashCode) {
                break;
            } else {
                i7++;
            }
        }
        if (i7 >= 0) {
            CopyOnWriteArrayList<i.b> copyOnWriteArrayList = i.f105298a;
            if (i7 < copyOnWriteArrayList.size() && (bVarRemove = copyOnWriteArrayList.remove(i7)) != null) {
                Iterator<Map.Entry<Object, i.a>> it2 = bVarRemove.f105301b.entrySet().iterator();
                while (it2.hasNext()) {
                    it2.next().getValue().release();
                }
                bVarRemove.f105301b.clear();
            }
        }
        i.f105299b = (i.b) CollectionsKt.lastOrNull(i.f105298a);
        bilibili.live.app.service.resolver.c.a(iHashCode, "register, onDestroy, ", "UpperContributeContext");
    }
}
