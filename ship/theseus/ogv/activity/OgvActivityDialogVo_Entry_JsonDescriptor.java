package com.bilibili.ship.theseus.ogv.activity;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.ship.theseus.ogv.activity.OgvActivityDialogVo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvActivityDialogVo_Entry_JsonDescriptor.class */
public final class OgvActivityDialogVo_Entry_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f91376a = {new PojoPropertyDescriptor("text", (String[]) null, OgvActivityTextVo.class, (Class) null, 1), new PojoPropertyDescriptor("code", (String[]) null, String.class, (Class) null, 0), new PojoPropertyDescriptor("link", (String[]) null, String.class, (Class) null, 0), new PojoPropertyDescriptor("action", (String[]) null, ActivityDialogActionType.class, (Class) null, 0)};

    public OgvActivityDialogVo_Entry_JsonDescriptor() {
        super(OgvActivityDialogVo.Entry.class, f91376a);
    }

    public final Object constructWith(Object[] objArr) {
        return new OgvActivityDialogVo.Entry((ActivityDialogActionType) objArr[3], (OgvActivityTextVo) objArr[0], (String) objArr[1], (String) objArr[2]);
    }

    public final Object get(Object obj, int i7) {
        OgvActivityDialogVo.Entry entry = (OgvActivityDialogVo.Entry) obj;
        if (i7 == 0) {
            return entry.f91372a;
        }
        if (i7 == 1) {
            return entry.f91373b;
        }
        if (i7 == 2) {
            return entry.f91374c;
        }
        if (i7 != 3) {
            return null;
        }
        return entry.f91375d;
    }
}
