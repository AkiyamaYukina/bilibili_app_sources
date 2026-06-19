package com.bilibili.ship.theseus.united.page.tab;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/TabControl_JsonDescriptor.class */
public final class TabControl_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f103130a;

    static {
        Class cls = Boolean.TYPE;
        f103130a = new PojoPropertyDescriptor[]{new PojoPropertyDescriptor("limit", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("disable", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("disable_click_tip", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("disable_alpha", (String[]) null, Float.TYPE, (Class) null, 7)};
    }

    public TabControl_JsonDescriptor() {
        super(TabControl.class, f103130a);
    }

    public final Object constructWith(Object[] objArr) {
        int i7 = 0;
        Boolean bool = (Boolean) objArr[0];
        boolean zBooleanValue = bool == null ? false : bool.booleanValue();
        Boolean bool2 = (Boolean) objArr[1];
        boolean zBooleanValue2 = bool2 == null ? false : bool2.booleanValue();
        String str = (String) objArr[2];
        Object obj = objArr[3];
        if (obj == null) {
            i7 = 8;
        }
        Float f7 = (Float) obj;
        return new TabControl(f7 == null ? 0.0f : f7.floatValue(), i7, str, zBooleanValue, zBooleanValue2);
    }

    public final Object get(Object obj, int i7) {
        TabControl tabControl = (TabControl) obj;
        if (i7 == 0) {
            return Boolean.valueOf(tabControl.e());
        }
        if (i7 == 1) {
            return Boolean.valueOf(tabControl.b());
        }
        if (i7 == 2) {
            return tabControl.d();
        }
        if (i7 != 3) {
            return null;
        }
        return Float.valueOf(tabControl.c());
    }
}
