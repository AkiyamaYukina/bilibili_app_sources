package com.bilibili.ship.theseus.united.page.view;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/view/Translation_JsonDescriptor.class */
public final class Translation_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f104035a = {new PojoPropertyDescriptor("translation_status", (String[]) null, Integer.TYPE, (Class) null, 5), new PojoPropertyDescriptor("cur_language", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("arc_language", (String[]) null, String.class, (Class) null, 5)};

    public Translation_JsonDescriptor() {
        super(Translation.class, f104035a);
    }

    public final Object constructWith(Object[] objArr) {
        int iIntValue = 0;
        Integer num = (Integer) objArr[0];
        if (num != null) {
            iIntValue = num.intValue();
        }
        return new Translation(iIntValue, (String) objArr[1], (String) objArr[2]);
    }

    public final Object get(Object obj, int i7) {
        Translation translation = (Translation) obj;
        if (i7 == 0) {
            return Integer.valueOf(translation.f104032a);
        }
        if (i7 == 1) {
            return translation.f104033b;
        }
        if (i7 != 2) {
            return null;
        }
        return translation.f104034c;
    }
}
