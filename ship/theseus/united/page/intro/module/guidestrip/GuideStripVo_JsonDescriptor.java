package com.bilibili.ship.theseus.united.page.intro.module.guidestrip;

import com.bilibili.bson.adapter.StringIntColorTypeAdapter;
import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import java.lang.reflect.Type;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/guidestrip/GuideStripVo_JsonDescriptor.class */
public final class GuideStripVo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f100093a;

    static {
        PojoPropertyDescriptor pojoPropertyDescriptor = new PojoPropertyDescriptor("icon", (String[]) null, String.class, (Class) null, 5);
        PojoPropertyDescriptor pojoPropertyDescriptor2 = new PojoPropertyDescriptor("icon_night", (String[]) null, String.class, (Class) null, 5);
        PojoPropertyDescriptor pojoPropertyDescriptor3 = new PojoPropertyDescriptor("text", (String[]) null, String.class, (Class) null, 5);
        PojoPropertyDescriptor pojoPropertyDescriptor4 = new PojoPropertyDescriptor("text_extra", (String[]) null, String.class, (Class) null, 5);
        Class cls = Integer.TYPE;
        f100093a = new PojoPropertyDescriptor[]{pojoPropertyDescriptor, pojoPropertyDescriptor2, pojoPropertyDescriptor3, pojoPropertyDescriptor4, new PojoPropertyDescriptor("text_color", (String[]) null, cls, StringIntColorTypeAdapter.class, 13), new PojoPropertyDescriptor("text_color_night", (String[]) null, cls, StringIntColorTypeAdapter.class, 13), new PojoPropertyDescriptor("bg_color", (String[]) null, cls, StringIntColorTypeAdapter.class, 13), new PojoPropertyDescriptor("bg_color_night", (String[]) null, cls, StringIntColorTypeAdapter.class, 13), new PojoPropertyDescriptor("url_text", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("url", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("type", (String[]) null, HonorType.class, (Class) null, 7), new PojoPropertyDescriptor("honor_jump_type", (String[]) null, HonorJumpType.class, (Class) null, 7), new PojoPropertyDescriptor("report", (String[]) null, Types.parameterizedType(Map.class, new Type[]{String.class, String.class}), (Class) null, 5), new PojoPropertyDescriptor("end_icon", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("profession_ext", (String[]) null, ProfessionHonorExtend.class, (Class) null, 4)};
    }

    public GuideStripVo_JsonDescriptor() {
        super(GuideStripVo.class, f100093a);
    }

    public final Object constructWith(Object[] objArr) {
        int i7 = 0;
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        String str3 = (String) objArr[2];
        String str4 = (String) objArr[3];
        Integer num = (Integer) objArr[4];
        int iIntValue = num == null ? 0 : num.intValue();
        Integer num2 = (Integer) objArr[5];
        int iIntValue2 = num2 == null ? 0 : num2.intValue();
        Integer num3 = (Integer) objArr[6];
        int iIntValue3 = num3 == null ? 0 : num3.intValue();
        Integer num4 = (Integer) objArr[7];
        int iIntValue4 = num4 == null ? 0 : num4.intValue();
        String str5 = (String) objArr[8];
        String str6 = (String) objArr[9];
        Object obj = objArr[10];
        if (obj == null) {
            i7 = 1024;
        }
        HonorType honorType = (HonorType) obj;
        Object obj2 = objArr[11];
        int i8 = i7;
        if (obj2 == null) {
            i8 = i7 | 2048;
        }
        return new GuideStripVo(str, str2, str3, str4, iIntValue, iIntValue2, iIntValue3, iIntValue4, str5, str6, honorType, (HonorJumpType) obj2, (Map) objArr[12], (String) objArr[13], (ProfessionHonorExtend) objArr[14], i8);
    }

    public final Object get(Object obj, int i7) {
        GuideStripVo guideStripVo = (GuideStripVo) obj;
        switch (i7) {
            case 0:
                return guideStripVo.f100079a;
            case 1:
                return guideStripVo.f100080b;
            case 2:
                return guideStripVo.d();
            case 3:
                return guideStripVo.c();
            case 4:
                return Integer.valueOf(guideStripVo.f100083e);
            case 5:
                return Integer.valueOf(guideStripVo.f100084f);
            case 6:
                return Integer.valueOf(guideStripVo.f100085g);
            case 7:
                return Integer.valueOf(guideStripVo.h);
            case 8:
                return guideStripVo.a();
            case 9:
                return guideStripVo.f100087j;
            case 10:
                return guideStripVo.f100088k;
            case 11:
                return guideStripVo.f100089l;
            case 12:
                return guideStripVo.b();
            case 13:
                return guideStripVo.f100091n;
            case 14:
                return guideStripVo.f100092o;
            default:
                return null;
        }
    }
}
