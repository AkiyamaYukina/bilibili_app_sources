package com.bilibili.module.vip.mall;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.live.streaming.source.TextSource;
import com.bilibili.module.vip.mall.VipPayResultInfo;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/mall/VipPayResultInfo_VipPayResultDialogContentInfo_JsonDescriptor.class */
public final class VipPayResultInfo_VipPayResultDialogContentInfo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f66242a = {new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 2), new PojoPropertyDescriptor(TextSource.CFG_CONTENT, (String[]) null, String.class, (Class) null, 2), new PojoPropertyDescriptor("left_button", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("left_link", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("right_button", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("right_link", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("top_image", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("corner_mark", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("follow", (String[]) null, Boolean.TYPE, (Class) null, 7), new PojoPropertyDescriptor("gift_title", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("gift_list", (String[]) null, Types.parameterizedType(List.class, new Type[]{VipPayGift.class}), (Class) null, 22)};

    public VipPayResultInfo_VipPayResultDialogContentInfo_JsonDescriptor() {
        super(VipPayResultInfo.VipPayResultDialogContentInfo.class, f66242a);
    }

    public final Object constructWith(Object[] objArr) {
        boolean zBooleanValue = false;
        Object obj = objArr[0];
        int i7 = obj == null ? 1 : 0;
        String str = (String) obj;
        Object obj2 = objArr[1];
        int i8 = i7;
        if (obj2 == null) {
            i8 = i7 | 2;
        }
        String str2 = (String) obj2;
        Object obj3 = objArr[2];
        int i9 = i8;
        if (obj3 == null) {
            i9 = i8 | 4;
        }
        String str3 = (String) obj3;
        Object obj4 = objArr[3];
        int i10 = i9;
        if (obj4 == null) {
            i10 = i9 | 8;
        }
        String str4 = (String) obj4;
        Object obj5 = objArr[4];
        int i11 = i10;
        if (obj5 == null) {
            i11 = i10 | 16;
        }
        String str5 = (String) obj5;
        Object obj6 = objArr[5];
        int i12 = i11;
        if (obj6 == null) {
            i12 = i11 | 32;
        }
        String str6 = (String) obj6;
        String str7 = (String) objArr[6];
        Object obj7 = objArr[7];
        int i13 = i12;
        if (obj7 == null) {
            i13 = i12 | 128;
        }
        String str8 = (String) obj7;
        Object obj8 = objArr[8];
        int i14 = i13;
        if (obj8 == null) {
            i14 = i13 | 256;
        }
        Boolean bool = (Boolean) obj8;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        Object obj9 = objArr[9];
        int i15 = i14;
        if (obj9 == null) {
            i15 = i14 | 512;
        }
        String str9 = (String) obj9;
        Object obj10 = objArr[10];
        return new VipPayResultInfo.VipPayResultDialogContentInfo(str, str2, zBooleanValue, str3, str4, str5, str6, (List) obj10, str7, obj10 == null ? i15 | 1024 : i15, str8, str9);
    }

    public final Object get(Object obj, int i7) {
        VipPayResultInfo.VipPayResultDialogContentInfo vipPayResultDialogContentInfo = (VipPayResultInfo.VipPayResultDialogContentInfo) obj;
        switch (i7) {
            case 0:
                return vipPayResultDialogContentInfo.f66231a;
            case 1:
                return vipPayResultDialogContentInfo.f66232b;
            case 2:
                return vipPayResultDialogContentInfo.g();
            case 3:
                return vipPayResultDialogContentInfo.f();
            case 4:
                return vipPayResultDialogContentInfo.i();
            case 5:
                return vipPayResultDialogContentInfo.h();
            case 6:
                return vipPayResultDialogContentInfo.e();
            case 7:
                return vipPayResultDialogContentInfo.a();
            case 8:
                return Boolean.valueOf(vipPayResultDialogContentInfo.b());
            case 9:
                return vipPayResultDialogContentInfo.d();
            case 10:
                return vipPayResultDialogContentInfo.c();
            default:
                return null;
        }
    }
}
