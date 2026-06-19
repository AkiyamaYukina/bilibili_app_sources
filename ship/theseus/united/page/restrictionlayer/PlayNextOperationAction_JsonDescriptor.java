package com.bilibili.ship.theseus.united.page.restrictionlayer;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/PlayNextOperationAction_JsonDescriptor.class */
public final class PlayNextOperationAction_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f102628a;

    static {
        Class cls = Long.TYPE;
        f102628a = new PojoPropertyDescriptor[]{new PojoPropertyDescriptor("aid", (String[]) null, cls, (Class) null, 1), new PojoPropertyDescriptor("cid", (String[]) null, cls, (Class) null, 1), new PojoPropertyDescriptor("fromSpmid", (String[]) null, String.class, (Class) null, 3), new PojoPropertyDescriptor("trigger", (String[]) null, com.bilibili.ship.theseus.united.report.b.class, (Class) null, 3)};
    }

    public PlayNextOperationAction_JsonDescriptor() {
        super(PlayNextOperationAction.class, f102628a);
    }

    public final Object constructWith(Object[] objArr) {
        Long l7 = (Long) objArr[0];
        long jLongValue = l7 == null ? 0L : l7.longValue();
        Long l8 = (Long) objArr[1];
        long jLongValue2 = l8 == null ? 0L : l8.longValue();
        Object obj = objArr[2];
        int i7 = obj == null ? 4 : 0;
        String str = (String) obj;
        Object obj2 = objArr[3];
        int i8 = i7;
        if (obj2 == null) {
            i8 = i7 | 8;
        }
        com.bilibili.ship.theseus.united.report.b bVar = (com.bilibili.ship.theseus.united.report.b) obj2;
        return new PlayNextOperationAction(bVar != null ? bVar.f104838a : 0, i8, jLongValue, jLongValue2, str);
    }

    public final Object get(Object obj, int i7) {
        PlayNextOperationAction playNextOperationAction = (PlayNextOperationAction) obj;
        if (i7 == 0) {
            return Long.valueOf(playNextOperationAction.f102624a);
        }
        if (i7 == 1) {
            return Long.valueOf(playNextOperationAction.f102625b);
        }
        if (i7 == 2) {
            return playNextOperationAction.f102626c;
        }
        if (i7 != 3) {
            return null;
        }
        return new com.bilibili.ship.theseus.united.report.b(playNextOperationAction.f102627d);
    }
}
