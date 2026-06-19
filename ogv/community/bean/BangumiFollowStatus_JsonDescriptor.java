package com.bilibili.ogv.community.bean;

import androidx.core.app.NotificationCompat;
import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/community/bean/BangumiFollowStatus_JsonDescriptor.class */
public final class BangumiFollowStatus_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f67511a;

    static {
        PojoPropertyDescriptor pojoPropertyDescriptor = new PojoPropertyDescriptor(NotificationCompat.CATEGORY_STATUS, (String[]) null, Integer.TYPE, (Class) null, 3);
        PojoPropertyDescriptor pojoPropertyDescriptor2 = new PojoPropertyDescriptor("toast", (String[]) null, String.class, (Class) null, 2);
        Class cls = Boolean.TYPE;
        f67511a = new PojoPropertyDescriptor[]{pojoPropertyDescriptor, pojoPropertyDescriptor2, new PojoPropertyDescriptor("refresh", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("relation", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("reverse_live_res", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("fmid", (String[]) null, Long.TYPE, (Class) null, 7)};
    }

    public BangumiFollowStatus_JsonDescriptor() {
        super(BangumiFollowStatus.class, f67511a);
    }

    public final Object constructWith(Object[] objArr) {
        BangumiFollowStatus bangumiFollowStatus = new BangumiFollowStatus();
        Object obj = objArr[0];
        if (obj != null) {
            bangumiFollowStatus.f67503a = ((Integer) obj).intValue();
        }
        Object obj2 = objArr[1];
        if (obj2 != null) {
            bangumiFollowStatus.f67504b = (String) obj2;
        }
        Object obj3 = objArr[2];
        if (obj3 != null) {
            bangumiFollowStatus.f67505c = ((Boolean) obj3).booleanValue();
        }
        Object obj4 = objArr[3];
        if (obj4 != null) {
            bangumiFollowStatus.f67506d = ((Boolean) obj4).booleanValue();
        }
        Object obj5 = objArr[4];
        if (obj5 != null) {
            bangumiFollowStatus.f67507e = ((Boolean) obj5).booleanValue();
        }
        Object obj6 = objArr[5];
        if (obj6 != null) {
            bangumiFollowStatus.f67508f = ((Long) obj6).longValue();
        }
        return bangumiFollowStatus;
    }

    public final Object get(Object obj, int i7) {
        BangumiFollowStatus bangumiFollowStatus = (BangumiFollowStatus) obj;
        if (i7 == 0) {
            return Integer.valueOf(bangumiFollowStatus.f67503a);
        }
        if (i7 == 1) {
            return bangumiFollowStatus.f67504b;
        }
        if (i7 == 2) {
            return Boolean.valueOf(bangumiFollowStatus.f67505c);
        }
        if (i7 == 3) {
            return Boolean.valueOf(bangumiFollowStatus.f67506d);
        }
        if (i7 == 4) {
            return Boolean.valueOf(bangumiFollowStatus.f67507e);
        }
        if (i7 != 5) {
            return null;
        }
        return Long.valueOf(bangumiFollowStatus.f67508f);
    }
}
