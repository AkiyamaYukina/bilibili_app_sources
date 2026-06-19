package com.bilibili.ogv.pub.community;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/community/Celebrity_JsonDescriptor.class */
public final class Celebrity_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f71505a;

    static {
        Class cls = Long.TYPE;
        f71505a = new PojoPropertyDescriptor[]{new PojoPropertyDescriptor("id", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("name", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("role", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("avatar", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("short_desc", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("desc", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("character_avatar", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("link", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor(EditCustomizeSticker.TAG_MID, (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("is_follow", (String[]) null, Boolean.TYPE, (Class) null, 5)};
    }

    public Celebrity_JsonDescriptor() {
        super(Celebrity.class, f71505a);
    }

    public final Object constructWith(Object[] objArr) {
        boolean zBooleanValue = false;
        Long l7 = (Long) objArr[0];
        long jLongValue = l7 == null ? 0L : l7.longValue();
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        String str3 = (String) objArr[3];
        String str4 = (String) objArr[4];
        String str5 = (String) objArr[5];
        String str6 = (String) objArr[6];
        String str7 = (String) objArr[7];
        Long l8 = (Long) objArr[8];
        long jLongValue2 = l8 == null ? 0L : l8.longValue();
        Boolean bool = (Boolean) objArr[9];
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return new Celebrity(jLongValue, str, str2, str3, str4, str5, str6, str7, jLongValue2, zBooleanValue);
    }

    public final Object get(Object obj, int i7) {
        Celebrity celebrity = (Celebrity) obj;
        switch (i7) {
            case 0:
                return Long.valueOf(celebrity.f71496a);
            case 1:
                return celebrity.f71497b;
            case 2:
                return celebrity.f71498c;
            case 3:
                return celebrity.f71499d;
            case 4:
                return celebrity.f71500e;
            case 5:
                return celebrity.f71501f;
            case 6:
                return celebrity.f71502g;
            case 7:
                return celebrity.h;
            case 8:
                return Long.valueOf(celebrity.f71503i);
            case 9:
                return Boolean.valueOf(celebrity.f71504j);
            default:
                return null;
        }
    }
}
