package com.bilibili.ogv.pub.sponsor;

import androidx.core.app.NotificationCompat;
import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/sponsor/BangumiSponsorResult_JsonDescriptor.class */
public final class BangumiSponsorResult_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f71802a;

    static {
        Class cls = Integer.TYPE;
        f71802a = new PojoPropertyDescriptor[]{new PojoPropertyDescriptor(NotificationCompat.CATEGORY_STATUS, (String[]) null, cls, (Class) null, 3), new PojoPropertyDescriptor("exp", (String[]) null, cls, (Class) null, 3), new PojoPropertyDescriptor("point", (String[]) null, cls, (Class) null, 3), new PojoPropertyDescriptor("pendant_day", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("pendant_day_text", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("pendants", (String[]) null, Types.parameterizedType(List.class, new Type[]{BangumiPendant.class}), (Class) null, 2), new PojoPropertyDescriptor("point_activity", (String[]) null, BangumiSponsorEvent.class, (Class) null, 6)};
    }

    public BangumiSponsorResult_JsonDescriptor() {
        super(BangumiSponsorResult.class, f71802a);
    }

    public final Object constructWith(Object[] objArr) {
        BangumiSponsorResult bangumiSponsorResult = new BangumiSponsorResult();
        Object obj = objArr[0];
        if (obj != null) {
            bangumiSponsorResult.f71796f = ((Integer) obj).intValue();
        }
        Object obj2 = objArr[1];
        if (obj2 != null) {
            bangumiSponsorResult.f71797g = ((Integer) obj2).intValue();
        }
        Object obj3 = objArr[2];
        if (obj3 != null) {
            bangumiSponsorResult.h = ((Integer) obj3).intValue();
        }
        Object obj4 = objArr[3];
        if (obj4 != null) {
            bangumiSponsorResult.f71798i = ((Integer) obj4).intValue();
        }
        Object obj5 = objArr[4];
        if (obj5 != null) {
            bangumiSponsorResult.f71799j = (String) obj5;
        }
        Object obj6 = objArr[5];
        if (obj6 != null) {
            bangumiSponsorResult.f71800k = (List) obj6;
        }
        Object obj7 = objArr[6];
        if (obj7 != null) {
            bangumiSponsorResult.f71801l = (BangumiSponsorEvent) obj7;
        }
        return bangumiSponsorResult;
    }

    public final Object get(Object obj, int i7) {
        int i8;
        BangumiSponsorResult bangumiSponsorResult = (BangumiSponsorResult) obj;
        switch (i7) {
            case 0:
                i8 = bangumiSponsorResult.f71796f;
                break;
            case 1:
                i8 = bangumiSponsorResult.f71797g;
                break;
            case 2:
                i8 = bangumiSponsorResult.h;
                break;
            case 3:
                i8 = bangumiSponsorResult.f71798i;
                break;
            case 4:
                return bangumiSponsorResult.f71799j;
            case 5:
                return bangumiSponsorResult.f71800k;
            case 6:
                return bangumiSponsorResult.f71801l;
            default:
                return null;
        }
        return Integer.valueOf(i8);
    }
}
