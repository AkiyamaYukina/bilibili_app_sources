package com.bilibili.ship.theseus.ogv.intro.followup;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/followup/Upper_JsonDescriptor.class */
public final class Upper_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f93066a = {new PojoPropertyDescriptor(EditCustomizeSticker.TAG_MID, (String[]) null, Long.TYPE, (Class) null, 5), new PojoPropertyDescriptor("attention", (String[]) null, Boolean.TYPE, (Class) null, 5), new PojoPropertyDescriptor("name", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("face", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("official", (String[]) null, OfficialVerify.class, (Class) null, 5), new PojoPropertyDescriptor("vip", (String[]) null, VipInfo.class, (Class) null, 5)};

    public Upper_JsonDescriptor() {
        super(Upper.class, f93066a);
    }

    public final Object constructWith(Object[] objArr) {
        boolean zBooleanValue = false;
        Long l7 = (Long) objArr[0];
        long jLongValue = l7 == null ? 0L : l7.longValue();
        Boolean bool = (Boolean) objArr[1];
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return new Upper(jLongValue, zBooleanValue, (String) objArr[2], (String) objArr[3], (OfficialVerify) objArr[4], (VipInfo) objArr[5]);
    }

    public final Object get(Object obj, int i7) {
        Upper upper = (Upper) obj;
        if (i7 == 0) {
            return Long.valueOf(upper.f93060a);
        }
        if (i7 == 1) {
            return Boolean.valueOf(upper.f93061b);
        }
        if (i7 == 2) {
            return upper.f93062c;
        }
        if (i7 == 3) {
            return upper.f93063d;
        }
        if (i7 == 4) {
            return upper.a();
        }
        if (i7 != 5) {
            return null;
        }
        return upper.f93065f;
    }
}
