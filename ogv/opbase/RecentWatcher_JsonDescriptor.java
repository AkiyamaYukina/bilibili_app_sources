package com.bilibili.ogv.opbase;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/RecentWatcher_JsonDescriptor.class */
public final class RecentWatcher_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f69885a = {new PojoPropertyDescriptor("face", (String[]) null, String.class, (Class) null, 4), new PojoPropertyDescriptor("name", (String[]) null, String.class, (Class) null, 4)};

    public RecentWatcher_JsonDescriptor() {
        super(RecentWatcher.class, f69885a);
    }

    public final Object constructWith(Object[] objArr) {
        return new RecentWatcher((String) objArr[0], (String) objArr[1]);
    }

    public final Object get(Object obj, int i7) {
        RecentWatcher recentWatcher = (RecentWatcher) obj;
        if (i7 == 0) {
            return recentWatcher.a();
        }
        if (i7 != 1) {
            return null;
        }
        return recentWatcher.f69884b;
    }
}
