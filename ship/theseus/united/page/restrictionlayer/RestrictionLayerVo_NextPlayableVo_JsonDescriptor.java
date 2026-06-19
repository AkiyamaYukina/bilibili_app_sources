package com.bilibili.ship.theseus.united.page.restrictionlayer;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerVo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/RestrictionLayerVo_NextPlayableVo_JsonDescriptor.class */
public final class RestrictionLayerVo_NextPlayableVo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f102697a;

    static {
        PojoPropertyDescriptor pojoPropertyDescriptor = new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 1);
        PojoPropertyDescriptor pojoPropertyDescriptor2 = new PojoPropertyDescriptor("cover", (String[]) null, String.class, (Class) null, 1);
        Class cls = Long.TYPE;
        f102697a = new PojoPropertyDescriptor[]{pojoPropertyDescriptor, pojoPropertyDescriptor2, new PojoPropertyDescriptor("aid", (String[]) null, cls, (Class) null, 1), new PojoPropertyDescriptor("cid", (String[]) null, cls, (Class) null, 1), new PojoPropertyDescriptor("spmid", (String[]) null, String.class, (Class) null, 3), new PojoPropertyDescriptor("report", (String[]) null, ReportVo.class, (Class) null, 3), new PojoPropertyDescriptor("playNextAction", (String[]) null, PlayNextOperationAction.class, (Class) null, 3)};
    }

    public RestrictionLayerVo_NextPlayableVo_JsonDescriptor() {
        super(RestrictionLayerVo.NextPlayableVo.class, f102697a);
    }

    public final Object constructWith(Object[] objArr) {
        int i7 = 0;
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        Long l7 = (Long) objArr[2];
        long jLongValue = l7 == null ? 0L : l7.longValue();
        Long l8 = (Long) objArr[3];
        long jLongValue2 = l8 == null ? 0L : l8.longValue();
        Object obj = objArr[4];
        if (obj == null) {
            i7 = 16;
        }
        String str3 = (String) obj;
        Object obj2 = objArr[5];
        int i8 = i7;
        if (obj2 == null) {
            i8 = i7 | 32;
        }
        ReportVo reportVo = (ReportVo) obj2;
        Object obj3 = objArr[6];
        int i9 = i8;
        if (obj3 == null) {
            i9 = i8 | 64;
        }
        return new RestrictionLayerVo.NextPlayableVo(str, str2, jLongValue, jLongValue2, str3, reportVo, (PlayNextOperationAction) obj3, i9);
    }

    public final Object get(Object obj, int i7) {
        RestrictionLayerVo.NextPlayableVo nextPlayableVo = (RestrictionLayerVo.NextPlayableVo) obj;
        switch (i7) {
            case 0:
                return nextPlayableVo.f102687a;
            case 1:
                return nextPlayableVo.f102688b;
            case 2:
                return Long.valueOf(nextPlayableVo.f102689c);
            case 3:
                return Long.valueOf(nextPlayableVo.f102690d);
            case 4:
                return nextPlayableVo.f102691e;
            case 5:
                return nextPlayableVo.f102692f;
            case 6:
                return nextPlayableVo.f102693g;
            default:
                return null;
        }
    }
}
