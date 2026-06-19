package com.bilibili.ship.theseus.united.page.restrictionlayer;

import com.bilibili.bson.adapter.StringIntColorTypeAdapter;
import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/TextVo_JsonDescriptor.class */
public final class TextVo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f102722a = {new PojoPropertyDescriptor("text", (String[]) null, String.class, (Class) null, 1), new PojoPropertyDescriptor("text_color", (String[]) null, Integer.TYPE, StringIntColorTypeAdapter.class, 13), new PojoPropertyDescriptor("text_color_night", (String[]) null, Integer.class, StringIntColorTypeAdapter.class, 14), new PojoPropertyDescriptor("bg_color", (String[]) null, Integer.class, StringIntColorTypeAdapter.class, 14), new PojoPropertyDescriptor("bg_color_night", (String[]) null, Integer.class, StringIntColorTypeAdapter.class, 14), new PojoPropertyDescriptor("frame_color", (String[]) null, Integer.class, StringIntColorTypeAdapter.class, 14), new PojoPropertyDescriptor("icon", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("report", (String[]) null, ReportVo.class, (Class) null, 6), new PojoPropertyDescriptor("link", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("action", (String[]) null, s.class, (Class) null, 2), new PojoPropertyDescriptor("badge_info", (String[]) null, TextVo.class, (Class) null, 6), new PojoPropertyDescriptor("font_size", (String[]) null, Integer.class, (Class) null, 6), new PojoPropertyDescriptor("left_strikethrough_text", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("simple_text_info", (String[]) null, TextVo.class, (Class) null, 6), new PojoPropertyDescriptor("bg_gradient_color", (String[]) null, GradientColorVo.class, (Class) null, 6), new PojoPropertyDescriptor("tips_link", (String[]) null, String.class, (Class) null, 2)};

    public TextVo_JsonDescriptor() {
        super(TextVo.class, f102722a);
    }

    public final Object constructWith(Object[] objArr) {
        char c7 = 0;
        String str = (String) objArr[0];
        Integer num = (Integer) objArr[1];
        int iIntValue = num == null ? 0 : num.intValue();
        Object obj = objArr[2];
        if (obj == null) {
            c7 = 4;
        }
        Integer numValueOf = (Integer) obj;
        Object obj2 = objArr[3];
        int i7 = c7;
        if (obj2 == null) {
            i7 = c7 | '\b';
        }
        Integer num2 = (Integer) obj2;
        Object obj3 = objArr[4];
        int i8 = i7;
        if (obj3 == null) {
            i8 = i7 | 16;
        }
        Integer num3 = (Integer) obj3;
        Object obj4 = objArr[5];
        int i9 = i8;
        if (obj4 == null) {
            i9 = i8 | 32;
        }
        Integer num4 = (Integer) obj4;
        Object obj5 = objArr[6];
        int i10 = i9;
        if (obj5 == null) {
            i10 = i9 | 64;
        }
        String str2 = (String) obj5;
        Object obj6 = objArr[7];
        int i11 = i10;
        if (obj6 == null) {
            i11 = i10 | 128;
        }
        ReportVo reportVo = (ReportVo) obj6;
        Object obj7 = objArr[8];
        int i12 = i11;
        if (obj7 == null) {
            i12 = i11 | 256;
        }
        String str3 = (String) obj7;
        Object obj8 = objArr[9];
        int i13 = i12;
        if (obj8 == null) {
            i13 = i12 | 512;
        }
        s sVar = (s) obj8;
        Object obj9 = objArr[10];
        int i14 = i13;
        if (obj9 == null) {
            i14 = i13 | 1024;
        }
        TextVo textVo = (TextVo) obj9;
        Object obj10 = objArr[11];
        int i15 = i14;
        if (obj10 == null) {
            i15 = i14 | 2048;
        }
        Integer num5 = (Integer) obj10;
        Object obj11 = objArr[12];
        int i16 = i15;
        if (obj11 == null) {
            i16 = i15 | 4096;
        }
        String str4 = (String) obj11;
        Object obj12 = objArr[13];
        int i17 = i16;
        if (obj12 == null) {
            i17 = i16 | 8192;
        }
        TextVo textVo2 = (TextVo) obj12;
        Object obj13 = objArr[14];
        int i18 = i17;
        if (obj13 == null) {
            i18 = i17 | 16384;
        }
        GradientColorVo gradientColorVo = (GradientColorVo) obj13;
        Object obj14 = objArr[15];
        int i19 = i18;
        if (obj14 == null) {
            i19 = i18 | 32768;
        }
        String str5 = (String) obj14;
        if ((i19 & 4) != 0) {
            numValueOf = Integer.valueOf(iIntValue);
        }
        Integer num6 = num2;
        if ((i19 & 8) != 0) {
            num6 = null;
        }
        if ((i19 & 16) != 0) {
            num3 = num6;
        }
        if ((i19 & 32) != 0) {
            num4 = null;
        }
        if ((i19 & 64) != 0) {
            str2 = null;
        }
        if ((i19 & 128) != 0) {
            reportVo = null;
        }
        if ((i19 & 256) != 0) {
            str3 = null;
        }
        if ((i19 & 512) != 0) {
            sVar = null;
        }
        if ((i19 & 1024) != 0) {
            textVo = null;
        }
        if ((i19 & 2048) != 0) {
            num5 = null;
        }
        if ((i19 & 4096) != 0) {
            str4 = null;
        }
        if ((i19 & 8192) != 0) {
            textVo2 = null;
        }
        if ((i19 & 16384) != 0) {
            gradientColorVo = null;
        }
        if ((i19 & 32768) != 0) {
            str5 = null;
        }
        return new TextVo(str, iIntValue, numValueOf, num6, num3, num4, str2, reportVo, str3, sVar, textVo, num5, str4, textVo2, gradientColorVo, str5);
    }

    public final Object get(Object obj, int i7) {
        TextVo textVo = (TextVo) obj;
        switch (i7) {
            case 0:
                return textVo.f102705a;
            case 1:
                return Integer.valueOf(textVo.n());
            case 2:
                return textVo.o();
            case 3:
                return textVo.b();
            case 4:
                return textVo.c();
            case 5:
                return textVo.h();
            case 6:
                return textVo.i();
            case 7:
                return textVo.l();
            case 8:
                return textVo.k();
            case 9:
                return textVo.f102713j;
            case 10:
                return textVo.e();
            case 11:
                return textVo.g();
            case 12:
                return textVo.j();
            case 13:
                return textVo.m();
            case 14:
                return textVo.f();
            case 15:
                return textVo.f102719p;
            default:
                return null;
        }
    }
}
