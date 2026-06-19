package com.bilibili.ship.theseus.united.page.color;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/color/ThemeConfig_JsonDescriptor.class */
public final class ThemeConfig_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f99206a = {new PojoPropertyDescriptor("bg_color", (String[]) null, String.class, (Class) null, 4), new PojoPropertyDescriptor("selected_bg_color", (String[]) null, String.class, (Class) null, 4), new PojoPropertyDescriptor("text_color", (String[]) null, String.class, (Class) null, 4)};

    public ThemeConfig_JsonDescriptor() {
        super(ThemeConfig.class, f99206a);
    }

    public final Object constructWith(Object[] objArr) {
        return new ThemeConfig((String) objArr[0], (String) objArr[1], (String) objArr[2]);
    }

    public final Object get(Object obj, int i7) {
        ThemeConfig themeConfig = (ThemeConfig) obj;
        if (i7 == 0) {
            return themeConfig.f99203a;
        }
        if (i7 == 1) {
            return themeConfig.f99204b;
        }
        if (i7 != 2) {
            return null;
        }
        return themeConfig.f99205c;
    }
}
