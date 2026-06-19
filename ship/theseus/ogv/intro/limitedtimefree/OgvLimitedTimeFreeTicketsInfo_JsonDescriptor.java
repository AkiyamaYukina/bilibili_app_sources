package com.bilibili.ship.theseus.ogv.intro.limitedtimefree;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.ship.theseus.ogv.activity.OgvActivityDeliveryResult;
import java.lang.reflect.Type;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/limitedtimefree/OgvLimitedTimeFreeTicketsInfo_JsonDescriptor.class */
public final class OgvLimitedTimeFreeTicketsInfo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f93242a = {new PojoPropertyDescriptor("win_id", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("login", (String[]) null, Boolean.TYPE, (Class) null, 5), new PojoPropertyDescriptor("show_time", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("action", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("url", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("close_type", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("images", (String[]) null, LimitedTimeFreeImages.class, (Class) null, 5), new PojoPropertyDescriptor("title", (String[]) null, LimitedTimeFreeTextInfo.class, (Class) null, 5), new PojoPropertyDescriptor("sub_title", (String[]) null, LimitedTimeFreeTextInfo.class, (Class) null, 5), new PojoPropertyDescriptor("button", (String[]) null, OgvActivityDeliveryResult.Button.class, (Class) null, 5), new PojoPropertyDescriptor("report", (String[]) null, Types.parameterizedType(Map.class, new Type[]{String.class, String.class}), (Class) null, 5)};

    public OgvLimitedTimeFreeTicketsInfo_JsonDescriptor() {
        super(OgvLimitedTimeFreeTicketsInfo.class, f93242a);
    }

    public final Object constructWith(Object[] objArr) {
        boolean zBooleanValue = false;
        String str = (String) objArr[0];
        Boolean bool = (Boolean) objArr[1];
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return new OgvLimitedTimeFreeTicketsInfo(str, zBooleanValue, (String) objArr[2], (String) objArr[3], (String) objArr[4], (String) objArr[5], (LimitedTimeFreeImages) objArr[6], (LimitedTimeFreeTextInfo) objArr[7], (LimitedTimeFreeTextInfo) objArr[8], (OgvActivityDeliveryResult.Button) objArr[9], (Map) objArr[10]);
    }

    public final Object get(Object obj, int i7) {
        OgvLimitedTimeFreeTicketsInfo ogvLimitedTimeFreeTicketsInfo = (OgvLimitedTimeFreeTicketsInfo) obj;
        switch (i7) {
            case 0:
                return ogvLimitedTimeFreeTicketsInfo.f93232a;
            case 1:
                return Boolean.valueOf(ogvLimitedTimeFreeTicketsInfo.a());
            case 2:
                return ogvLimitedTimeFreeTicketsInfo.f93234c;
            case 3:
                return ogvLimitedTimeFreeTicketsInfo.f93235d;
            case 4:
                return ogvLimitedTimeFreeTicketsInfo.f93236e;
            case 5:
                return ogvLimitedTimeFreeTicketsInfo.f93237f;
            case 6:
                return ogvLimitedTimeFreeTicketsInfo.f93238g;
            case 7:
                return ogvLimitedTimeFreeTicketsInfo.h;
            case 8:
                return ogvLimitedTimeFreeTicketsInfo.b();
            case 9:
                return ogvLimitedTimeFreeTicketsInfo.f93240j;
            case 10:
                return ogvLimitedTimeFreeTicketsInfo.f93241k;
            default:
                return null;
        }
    }
}
