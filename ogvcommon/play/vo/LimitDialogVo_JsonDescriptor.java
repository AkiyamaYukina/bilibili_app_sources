package com.bilibili.ogvcommon.play.vo;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.ogvcommon.play.vo.LimitDialogVo;
import com.bilibili.ogvcommon.play.vo.base.ImageVo;
import com.bilibili.ogvcommon.play.vo.base.ReportVo;
import com.bilibili.ogvcommon.play.vo.base.TextVo;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/vo/LimitDialogVo_JsonDescriptor.class */
public final class LimitDialogVo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f73323a = {new PojoPropertyDescriptor("type", (String[]) null, LimitDialogVo.LimitDialogType.class, (Class) null, 7), new PojoPropertyDescriptor("style_type", (String[]) null, LimitDialogVo.DialogStyleType.class, (Class) null, 6), new PojoPropertyDescriptor("config", (String[]) null, LimitDialogVo.ConfigVo.class, (Class) null, 7), new PojoPropertyDescriptor("title", (String[]) null, TextVo.class, (Class) null, 6), new PojoPropertyDescriptor("sub_title", (String[]) null, TextVo.class, (Class) null, 6), new PojoPropertyDescriptor("desc", (String[]) null, TextVo.class, (Class) null, 6), new PojoPropertyDescriptor("image", (String[]) null, ImageVo.class, (Class) null, 6), new PojoPropertyDescriptor("buttons", (String[]) null, Types.parameterizedType(List.class, new Type[]{TextVo.class}), (Class) null, 23), new PojoPropertyDescriptor("report", (String[]) null, ReportVo.class, (Class) null, 6), new PojoPropertyDescriptor("bottom_display", (String[]) null, Types.parameterizedType(List.class, new Type[]{LimitDialogVo.BottomDisplayVo.class}), (Class) null, 23), new PojoPropertyDescriptor("play_list", (String[]) null, Types.parameterizedType(List.class, new Type[]{LimitDialogVo.PlayListVo.class}), (Class) null, 23)};

    public LimitDialogVo_JsonDescriptor() {
        super(LimitDialogVo.class, f73323a);
    }

    public final Object constructWith(Object[] objArr) {
        int i7 = 0;
        Object obj = objArr[0];
        if (obj == null) {
            i7 = 1;
        }
        LimitDialogVo.LimitDialogType limitDialogType = (LimitDialogVo.LimitDialogType) obj;
        Object obj2 = objArr[1];
        int i8 = i7;
        if (obj2 == null) {
            i8 = i7 | 2;
        }
        LimitDialogVo.DialogStyleType dialogStyleType = (LimitDialogVo.DialogStyleType) obj2;
        Object obj3 = objArr[2];
        int i9 = i8;
        if (obj3 == null) {
            i9 = i8 | 4;
        }
        LimitDialogVo.ConfigVo configVo = (LimitDialogVo.ConfigVo) obj3;
        Object obj4 = objArr[3];
        int i10 = i9;
        if (obj4 == null) {
            i10 = i9 | 8;
        }
        TextVo textVo = (TextVo) obj4;
        Object obj5 = objArr[4];
        int i11 = i10;
        if (obj5 == null) {
            i11 = i10 | 16;
        }
        TextVo textVo2 = (TextVo) obj5;
        Object obj6 = objArr[5];
        int i12 = i11;
        if (obj6 == null) {
            i12 = i11 | 32;
        }
        TextVo textVo3 = (TextVo) obj6;
        Object obj7 = objArr[6];
        int i13 = i12;
        if (obj7 == null) {
            i13 = i12 | 64;
        }
        ImageVo imageVo = (ImageVo) obj7;
        Object obj8 = objArr[7];
        int i14 = i13;
        if (obj8 == null) {
            i14 = i13 | 128;
        }
        List list = (List) obj8;
        Object obj9 = objArr[8];
        int i15 = i14;
        if (obj9 == null) {
            i15 = i14 | 256;
        }
        ReportVo reportVo = (ReportVo) obj9;
        Object obj10 = objArr[9];
        int i16 = i15;
        if (obj10 == null) {
            i16 = i15 | 512;
        }
        List list2 = (List) obj10;
        Object obj11 = objArr[10];
        int i17 = i16;
        if (obj11 == null) {
            i17 = i16 | 1024;
        }
        return new LimitDialogVo(limitDialogType, dialogStyleType, configVo, textVo, textVo2, textVo3, imageVo, list, reportVo, list2, (List) obj11, i17);
    }

    public final Object get(Object obj, int i7) {
        LimitDialogVo limitDialogVo = (LimitDialogVo) obj;
        switch (i7) {
            case 0:
                return limitDialogVo.f73303a;
            case 1:
                return limitDialogVo.b();
            case 2:
                return limitDialogVo.f73305c;
            case 3:
                return limitDialogVo.f73306d;
            case 4:
                return limitDialogVo.d();
            case 5:
                return limitDialogVo.f73308f;
            case 6:
                return limitDialogVo.c();
            case 7:
                return limitDialogVo.h;
            case 8:
                return limitDialogVo.f73310i;
            case 9:
                return limitDialogVo.a();
            case 10:
                return limitDialogVo.f73312k;
            default:
                return null;
        }
    }
}
