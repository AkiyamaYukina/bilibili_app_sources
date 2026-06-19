package com.bilibili.ship.theseus.united.page.playviewextra;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.ship.theseus.united.page.playviewextra.PromptBarVo;
import com.bilibili.ship.theseus.united.page.restrictionlayer.GradientColorVo;
import com.bilibili.ship.theseus.united.page.restrictionlayer.ReportVo;
import com.bilibili.ship.theseus.united.page.restrictionlayer.TextVo;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playviewextra/PromptBarVo_JsonDescriptor.class */
public final class PromptBarVo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f102410a = {new PojoPropertyDescriptor("title", (String[]) null, TextVo.class, (Class) null, 2), new PojoPropertyDescriptor("sub_title", (String[]) null, TextVo.class, (Class) null, 6), new PojoPropertyDescriptor("sub_title_icon", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("bg_image", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("bg_gradient_color", (String[]) null, GradientColorVo.class, (Class) null, 4), new PojoPropertyDescriptor("button", (String[]) null, Types.parameterizedType(List.class, new Type[]{TextVo.class}), (Class) null, 23), new PojoPropertyDescriptor("report", (String[]) null, ReportVo.class, (Class) null, 2), new PojoPropertyDescriptor("full_screen_ip_icon", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("full_screen_bg_gradient_color", (String[]) null, GradientColorVo.class, (Class) null, 4), new PojoPropertyDescriptor("prompt_bar_type", (String[]) null, PromptBarVo.Type.class, (Class) null, 7), new PojoPropertyDescriptor("prompt_bar_style", (String[]) null, PromptBarVo.Style.class, (Class) null, 7), new PojoPropertyDescriptor("benefit_infos", (String[]) null, Types.parameterizedType(List.class, new Type[]{PromptBarVo.BenefitInfo.class}), (Class) null, 21), new PojoPropertyDescriptor("end_time", (String[]) null, Long.TYPE, (Class) null, 5), new PojoPropertyDescriptor("show_on_paywall", (String[]) null, Boolean.TYPE, (Class) null, 5)};

    public PromptBarVo_JsonDescriptor() {
        super(PromptBarVo.class, f102410a);
    }

    public final Object constructWith(Object[] objArr) {
        boolean zBooleanValue = false;
        Object obj = objArr[0];
        int i7 = obj == null ? 1 : 0;
        TextVo textVo = (TextVo) obj;
        Object obj2 = objArr[1];
        int i8 = i7;
        if (obj2 == null) {
            i8 = i7 | 2;
        }
        TextVo textVo2 = (TextVo) obj2;
        Object obj3 = objArr[2];
        int i9 = i8;
        if (obj3 == null) {
            i9 = i8 | 4;
        }
        String str = (String) obj3;
        Object obj4 = objArr[3];
        int i10 = i9;
        if (obj4 == null) {
            i10 = i9 | 8;
        }
        String str2 = (String) obj4;
        GradientColorVo gradientColorVo = (GradientColorVo) objArr[4];
        Object obj5 = objArr[5];
        int i11 = i10;
        if (obj5 == null) {
            i11 = i10 | 32;
        }
        List list = (List) obj5;
        Object obj6 = objArr[6];
        int i12 = i11;
        if (obj6 == null) {
            i12 = i11 | 64;
        }
        ReportVo reportVo = (ReportVo) obj6;
        String str3 = (String) objArr[7];
        GradientColorVo gradientColorVo2 = (GradientColorVo) objArr[8];
        Object obj7 = objArr[9];
        int i13 = i12;
        if (obj7 == null) {
            i13 = i12 | 512;
        }
        PromptBarVo.Type type = (PromptBarVo.Type) obj7;
        Object obj8 = objArr[10];
        int i14 = i13;
        if (obj8 == null) {
            i14 = i13 | 1024;
        }
        PromptBarVo.Style style = (PromptBarVo.Style) obj8;
        List list2 = (List) objArr[11];
        Long l7 = (Long) objArr[12];
        long jLongValue = l7 == null ? 0L : l7.longValue();
        Boolean bool = (Boolean) objArr[13];
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return new PromptBarVo(textVo, textVo2, str, str2, gradientColorVo, list, reportVo, str3, gradientColorVo2, type, style, list2, jLongValue, zBooleanValue, i14);
    }

    public final Object get(Object obj, int i7) {
        PromptBarVo promptBarVo = (PromptBarVo) obj;
        switch (i7) {
            case 0:
                return promptBarVo.f102394a;
            case 1:
                return promptBarVo.j();
            case 2:
                return promptBarVo.k();
            case 3:
                return promptBarVo.c();
            case 4:
                return promptBarVo.b();
            case 5:
                return promptBarVo.d();
            case 6:
                return promptBarVo.f102400g;
            case 7:
                return promptBarVo.g();
            case 8:
                return promptBarVo.f();
            case 9:
                return promptBarVo.l();
            case 10:
                return promptBarVo.i();
            case 11:
                return promptBarVo.a();
            case 12:
                return Long.valueOf(promptBarVo.e());
            case 13:
                return Boolean.valueOf(promptBarVo.h());
            default:
                return null;
        }
    }
}
