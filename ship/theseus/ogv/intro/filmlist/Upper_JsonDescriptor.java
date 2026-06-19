package com.bilibili.ship.theseus.ogv.intro.filmlist;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.lib.accountinfo.model.OfficialVerify;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/filmlist/Upper_JsonDescriptor.class */
public final class Upper_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f92683a = {new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("face", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("official_verify", (String[]) null, OfficialVerify.class, (Class) null, 5), new PojoPropertyDescriptor(EditCustomizeSticker.TAG_MID, (String[]) null, Long.TYPE, (Class) null, 5)};

    public Upper_JsonDescriptor() {
        super(Upper.class, f92683a);
    }

    public final Object constructWith(Object[] objArr) {
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        OfficialVerify officialVerify = (OfficialVerify) objArr[2];
        Long l7 = (Long) objArr[3];
        return new Upper(str, str2, officialVerify, l7 == null ? 0L : l7.longValue());
    }

    public final Object get(Object obj, int i7) {
        Upper upper = (Upper) obj;
        if (i7 == 0) {
            return upper.f92679a;
        }
        if (i7 == 1) {
            return upper.f92680b;
        }
        if (i7 == 2) {
            return upper.f92681c;
        }
        if (i7 != 3) {
            return null;
        }
        return Long.valueOf(upper.f92682d);
    }
}
