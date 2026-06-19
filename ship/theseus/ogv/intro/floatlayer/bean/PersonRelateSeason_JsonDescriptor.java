package com.bilibili.ship.theseus.ogv.intro.floatlayer.bean;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.ship.theseus.ogv.playviewextra.OgvBadgeInfo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/bean/PersonRelateSeason_JsonDescriptor.class */
public final class PersonRelateSeason_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f92888a;

    static {
        PojoPropertyDescriptor pojoPropertyDescriptor = new PojoPropertyDescriptor("cover", (String[]) null, String.class, (Class) null, 5);
        Class cls = Integer.TYPE;
        f92888a = new PojoPropertyDescriptor[]{pojoPropertyDescriptor, new PojoPropertyDescriptor("media_id", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("season_id", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("link", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("badge", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("badge_type", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("badge_info", (String[]) null, OgvBadgeInfo.class, (Class) null, 6), new PojoPropertyDescriptor("index_show", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("is_finish", (String[]) null, Boolean.TYPE, (Class) null, 5), new PojoPropertyDescriptor("season_type", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("order", (String[]) null, String.class, (Class) null, 5)};
    }

    public PersonRelateSeason_JsonDescriptor() {
        super(PersonRelateSeason.class, f92888a);
    }

    public final Object constructWith(Object[] objArr) {
        int iIntValue = 0;
        String str = (String) objArr[0];
        Integer num = (Integer) objArr[1];
        int iIntValue2 = num == null ? 0 : num.intValue();
        Integer num2 = (Integer) objArr[2];
        int iIntValue3 = num2 == null ? 0 : num2.intValue();
        String str2 = (String) objArr[3];
        String str3 = (String) objArr[4];
        String str4 = (String) objArr[5];
        Integer num3 = (Integer) objArr[6];
        int iIntValue4 = num3 == null ? 0 : num3.intValue();
        Object obj = objArr[7];
        int i7 = obj == null ? 128 : 0;
        OgvBadgeInfo ogvBadgeInfo = (OgvBadgeInfo) obj;
        String str5 = (String) objArr[8];
        Boolean bool = (Boolean) objArr[9];
        boolean zBooleanValue = bool == null ? false : bool.booleanValue();
        Integer num4 = (Integer) objArr[10];
        if (num4 != null) {
            iIntValue = num4.intValue();
        }
        return new PersonRelateSeason(str, iIntValue2, iIntValue3, str2, str3, str4, iIntValue4, ogvBadgeInfo, str5, zBooleanValue, iIntValue, (String) objArr[11], i7);
    }

    public final Object get(Object obj, int i7) {
        PersonRelateSeason personRelateSeason = (PersonRelateSeason) obj;
        switch (i7) {
            case 0:
                return personRelateSeason.f92877a;
            case 1:
                return Integer.valueOf(personRelateSeason.f92878b);
            case 2:
                return Integer.valueOf(personRelateSeason.f92879c);
            case 3:
                return personRelateSeason.f92880d;
            case 4:
                return personRelateSeason.f92881e;
            case 5:
                return personRelateSeason.f92882f;
            case 6:
                return Integer.valueOf(personRelateSeason.f92883g);
            case 7:
                return personRelateSeason.h;
            case 8:
                return personRelateSeason.f92884i;
            case 9:
                return Boolean.valueOf(personRelateSeason.f92885j);
            case 10:
                return Integer.valueOf(personRelateSeason.f92886k);
            case 11:
                return personRelateSeason.f92887l;
            default:
                return null;
        }
    }
}
