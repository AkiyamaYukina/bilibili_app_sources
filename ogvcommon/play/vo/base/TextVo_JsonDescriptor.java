package com.bilibili.ogvcommon.play.vo.base;

import com.bilibili.bson.adapter.StringIntColorTypeAdapter;
import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import java.lang.reflect.Type;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/vo/base/TextVo_JsonDescriptor.class */
public final class TextVo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f73361a = {new PojoPropertyDescriptor("text", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("text_color", (String[]) null, Integer.TYPE, StringIntColorTypeAdapter.class, 13), new PojoPropertyDescriptor("text_color_night", (String[]) null, Integer.class, StringIntColorTypeAdapter.class, 14), new PojoPropertyDescriptor("bg_color", (String[]) null, Integer.class, StringIntColorTypeAdapter.class, 14), new PojoPropertyDescriptor("report", (String[]) null, ReportVo.class, (Class) null, 6), new PojoPropertyDescriptor("link", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("action_type", (String[]) null, ActionType.class, (Class) null, 6), new PojoPropertyDescriptor("badge", (String[]) null, TextVo.class, (Class) null, 6), new PojoPropertyDescriptor("left_strikethrough_text", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("simple_text_info", (String[]) null, TextVo.class, (Class) null, 6), new PojoPropertyDescriptor("simple_bg_color", (String[]) null, Integer.class, StringIntColorTypeAdapter.class, 14), new PojoPropertyDescriptor("bg_gradient_color", (String[]) null, GradientColorVo.class, (Class) null, 6), new PojoPropertyDescriptor("order_report_params", (String[]) null, Types.parameterizedType(Map.class, new Type[]{String.class, String.class}), (Class) null, 7)};

    public TextVo_JsonDescriptor() {
        super(TextVo.class, f73361a);
    }

    public final Object constructWith(Object[] objArr) {
        int i7 = 0;
        String str = (String) objArr[0];
        Integer num = (Integer) objArr[1];
        int iIntValue = num == null ? 0 : num.intValue();
        Object obj = objArr[2];
        if (obj == null) {
            i7 = 4;
        }
        Integer num2 = (Integer) obj;
        Object obj2 = objArr[3];
        int i8 = i7;
        if (obj2 == null) {
            i8 = i7 | 8;
        }
        Integer num3 = (Integer) obj2;
        Object obj3 = objArr[4];
        int i9 = i8;
        if (obj3 == null) {
            i9 = i8 | 16;
        }
        ReportVo reportVo = (ReportVo) obj3;
        Object obj4 = objArr[5];
        int i10 = i9;
        if (obj4 == null) {
            i10 = i9 | 32;
        }
        String str2 = (String) obj4;
        Object obj5 = objArr[6];
        int i11 = i10;
        if (obj5 == null) {
            i11 = i10 | 64;
        }
        ActionType actionType = (ActionType) obj5;
        Object obj6 = objArr[7];
        int i12 = i11;
        if (obj6 == null) {
            i12 = i11 | 128;
        }
        TextVo textVo = (TextVo) obj6;
        Object obj7 = objArr[8];
        int i13 = i12;
        if (obj7 == null) {
            i13 = i12 | 256;
        }
        String str3 = (String) obj7;
        Object obj8 = objArr[9];
        int i14 = i13;
        if (obj8 == null) {
            i14 = i13 | 512;
        }
        TextVo textVo2 = (TextVo) obj8;
        Object obj9 = objArr[10];
        int i15 = i14;
        if (obj9 == null) {
            i15 = i14 | 1024;
        }
        Integer num4 = (Integer) obj9;
        Object obj10 = objArr[11];
        int i16 = i15;
        if (obj10 == null) {
            i16 = i15 | 2048;
        }
        GradientColorVo gradientColorVo = (GradientColorVo) obj10;
        Object obj11 = objArr[12];
        int i17 = i16;
        if (obj11 == null) {
            i17 = i16 | 4096;
        }
        return new TextVo(str, iIntValue, num2, num3, reportVo, str2, actionType, textVo, str3, textVo2, num4, gradientColorVo, (Map) obj11, i17);
    }

    public final Object get(Object obj, int i7) {
        TextVo textVo = (TextVo) obj;
        switch (i7) {
            case 0:
                return textVo.l();
            case 1:
                return Integer.valueOf(textVo.m());
            case 2:
                return textVo.n();
            case 3:
                return textVo.b();
            case 4:
                return textVo.i();
            case 5:
                return textVo.g();
            case 6:
                return textVo.a();
            case 7:
                return textVo.d();
            case 8:
                return textVo.f();
            case 9:
                return textVo.k();
            case 10:
                return textVo.j();
            case 11:
                return textVo.e();
            case 12:
                return textVo.h();
            default:
                return null;
        }
    }
}
