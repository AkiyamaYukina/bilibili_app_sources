package com.bilibili.ogv.opbase;

import com.bilibili.bson.adapter.StringIntColorTypeAdapter;
import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/BannerStyle_JsonDescriptor.class */
public final class BannerStyle_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f69689a;

    static {
        PojoPropertyDescriptor pojoPropertyDescriptor = new PojoPropertyDescriptor("top_color", (String[]) null, String.class, (Class) null, 4);
        PojoPropertyDescriptor pojoPropertyDescriptor2 = new PojoPropertyDescriptor("tab_text_select_color", (String[]) null, Integer.class, StringIntColorTypeAdapter.class, 12);
        PojoPropertyDescriptor pojoPropertyDescriptor3 = new PojoPropertyDescriptor("tab_text_unselect_color", (String[]) null, Integer.class, StringIntColorTypeAdapter.class, 12);
        Class cls = Boolean.TYPE;
        f69689a = new PojoPropertyDescriptor[]{pojoPropertyDescriptor, pojoPropertyDescriptor2, pojoPropertyDescriptor3, new PojoPropertyDescriptor("status_bar_color_type", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("pinned", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("bg_color", (String[]) null, String.class, (Class) null, 4), new PojoPropertyDescriptor("text_title_color", (String[]) null, String.class, (Class) null, 4), new PojoPropertyDescriptor("text_content_color", (String[]) null, String.class, (Class) null, 4), new PojoPropertyDescriptor("text_highlight_color", (String[]) null, String.class, (Class) null, 4), new PojoPropertyDescriptor("split_line_color", (String[]) null, String.class, (Class) null, 4), new PojoPropertyDescriptor("bg_mask_color", (String[]) null, String.class, (Class) null, 4), new PojoPropertyDescriptor("bg_mask_start_color", (String[]) null, String.class, (Class) null, 4), new PojoPropertyDescriptor("bg_mask_end_color", (String[]) null, String.class, (Class) null, 4)};
    }

    public BannerStyle_JsonDescriptor() {
        super(BannerStyle.class, f69689a);
    }

    public final Object constructWith(Object[] objArr) {
        boolean zBooleanValue = false;
        String str = (String) objArr[0];
        Integer num = (Integer) objArr[1];
        Integer num2 = (Integer) objArr[2];
        Boolean bool = (Boolean) objArr[3];
        boolean zBooleanValue2 = bool == null ? false : bool.booleanValue();
        Boolean bool2 = (Boolean) objArr[4];
        if (bool2 != null) {
            zBooleanValue = bool2.booleanValue();
        }
        return new BannerStyle(str, num, num2, zBooleanValue2, zBooleanValue, (String) objArr[5], (String) objArr[6], (String) objArr[7], (String) objArr[8], (String) objArr[9], (String) objArr[10], (String) objArr[11], (String) objArr[12]);
    }

    public final Object get(Object obj, int i7) {
        boolean zM;
        BannerStyle bannerStyle = (BannerStyle) obj;
        switch (i7) {
            case 0:
                return bannerStyle.l();
            case 1:
                return bannerStyle.g();
            case 2:
                return bannerStyle.h();
            case 3:
                zM = bannerStyle.m();
                break;
            case 4:
                zM = bannerStyle.e();
                break;
            case 5:
                return bannerStyle.a();
            case 6:
                return bannerStyle.k();
            case 7:
                return bannerStyle.i();
            case 8:
                return bannerStyle.j();
            case 9:
                return bannerStyle.f();
            case 10:
                return bannerStyle.b();
            case 11:
                return bannerStyle.d();
            case 12:
                return bannerStyle.c();
            default:
                return null;
        }
        return Boolean.valueOf(zM);
    }
}
