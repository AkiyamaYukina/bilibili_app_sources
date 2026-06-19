package com.bilibili.ship.theseus.ogv.season;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/season/OgvSeasonRights_JsonDescriptor.class */
public final class OgvSeasonRights_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f94494a;

    static {
        Class cls = Boolean.TYPE;
        f94494a = new PojoPropertyDescriptor[]{new PojoPropertyDescriptor("allow_bp", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("allow_download", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("only_vip_download", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("area_limit", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("allow_review", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("is_cover_show", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("can_watch", (String[]) null, cls, (Class) null, 5)};
    }

    public OgvSeasonRights_JsonDescriptor() {
        super(OgvSeasonRights.class, f94494a);
    }

    public final Object constructWith(Object[] objArr) {
        Boolean bool = (Boolean) objArr[0];
        boolean zBooleanValue = bool == null ? false : bool.booleanValue();
        Boolean bool2 = (Boolean) objArr[1];
        boolean zBooleanValue2 = bool2 == null ? false : bool2.booleanValue();
        Boolean bool3 = (Boolean) objArr[2];
        boolean zBooleanValue3 = bool3 == null ? false : bool3.booleanValue();
        Boolean bool4 = (Boolean) objArr[3];
        boolean zBooleanValue4 = bool4 == null ? false : bool4.booleanValue();
        Boolean bool5 = (Boolean) objArr[4];
        boolean zBooleanValue5 = bool5 == null ? false : bool5.booleanValue();
        Boolean bool6 = (Boolean) objArr[5];
        boolean zBooleanValue6 = bool6 == null ? false : bool6.booleanValue();
        Boolean bool7 = (Boolean) objArr[6];
        return new OgvSeasonRights(zBooleanValue, zBooleanValue2, zBooleanValue3, zBooleanValue4, zBooleanValue5, zBooleanValue6, bool7 == null ? false : bool7.booleanValue());
    }

    public final Object get(Object obj, int i7) {
        boolean zA;
        OgvSeasonRights ogvSeasonRights = (OgvSeasonRights) obj;
        switch (i7) {
            case 0:
                zA = ogvSeasonRights.a();
                break;
            case 1:
                zA = ogvSeasonRights.b();
                break;
            case 2:
                zA = ogvSeasonRights.f();
                break;
            case 3:
                zA = ogvSeasonRights.d();
                break;
            case 4:
                zA = ogvSeasonRights.c();
                break;
            case 5:
                zA = ogvSeasonRights.g();
                break;
            case 6:
                zA = ogvSeasonRights.e();
                break;
            default:
                return null;
        }
        return Boolean.valueOf(zA);
    }
}
