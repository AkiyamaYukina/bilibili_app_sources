package com.bilibili.ship.theseus.united.page.view;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.playerbizcommon.IVideoLikeRouteService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/view/StatData_JsonDescriptor.class */
public final class StatData_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f104026a;

    static {
        Class cls = Long.TYPE;
        f104026a = new PojoPropertyDescriptor[]{new PojoPropertyDescriptor("coin", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("danmaku", (String[]) null, StatInfoData.class, (Class) null, 5), new PojoPropertyDescriptor("fav", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor(IVideoLikeRouteService.ACTION_LIKE, (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("reply", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("share", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("vt", (String[]) null, StatInfoData.class, (Class) null, 5), new PojoPropertyDescriptor("follow", (String[]) null, cls, (Class) null, 5)};
    }

    public StatData_JsonDescriptor() {
        super(StatData.class, f104026a);
    }

    public final Object constructWith(Object[] objArr) {
        Long l7 = (Long) objArr[0];
        long jLongValue = l7 == null ? 0L : l7.longValue();
        StatInfoData statInfoData = (StatInfoData) objArr[1];
        Long l8 = (Long) objArr[2];
        long jLongValue2 = l8 == null ? 0L : l8.longValue();
        Long l9 = (Long) objArr[3];
        long jLongValue3 = l9 == null ? 0L : l9.longValue();
        Long l10 = (Long) objArr[4];
        long jLongValue4 = l10 == null ? 0L : l10.longValue();
        Long l11 = (Long) objArr[5];
        long jLongValue5 = l11 == null ? 0L : l11.longValue();
        StatInfoData statInfoData2 = (StatInfoData) objArr[6];
        Long l12 = (Long) objArr[7];
        return new StatData(jLongValue, statInfoData, jLongValue2, jLongValue3, jLongValue4, jLongValue5, statInfoData2, l12 == null ? 0L : l12.longValue());
    }

    public final Object get(Object obj, int i7) {
        StatData statData = (StatData) obj;
        switch (i7) {
            case 0:
                return Long.valueOf(statData.f104019a);
            case 1:
                return statData.f104020b;
            case 2:
                return Long.valueOf(statData.f104021c);
            case 3:
                return Long.valueOf(statData.f104022d);
            case 4:
                return Long.valueOf(statData.f104023e);
            case 5:
                return Long.valueOf(statData.f104024f);
            case 6:
                return statData.b();
            case 7:
                return Long.valueOf(statData.h);
            default:
                return null;
        }
    }
}
