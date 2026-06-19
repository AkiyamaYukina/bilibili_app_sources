package com.bilibili.ship.theseus.ogv.operation;

import com.bilibili.bson.adapter.FirstFromListAdapter;
import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.tencent.map.geolocation.TencentLocation;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/operation/OperationTextVo_JsonDescriptor.class */
public final class OperationTextVo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f94115a = {new PojoPropertyDescriptor("code", (String[]) null, String.class, (Class) null, 7), new PojoPropertyDescriptor("text", (String[]) null, String.class, (Class) null, 7), new PojoPropertyDescriptor("text_color", (String[]) null, String.class, FirstFromListAdapter.class, 14), new PojoPropertyDescriptor("bg_color", (String[]) null, Types.parameterizedType(List.class, new Type[]{String.class}), (Class) null, 23), new PojoPropertyDescriptor(TencentLocation.EXTRA_DIRECTION, (String[]) null, OgvColorDirection.class, (Class) null, 7), new PojoPropertyDescriptor("event_ids", (String[]) null, OperationReportEvents.class, (Class) null, 6), new PojoPropertyDescriptor("track_params", (String[]) null, Types.parameterizedType(Map.class, new Type[]{String.class, String.class}), (Class) null, 7), new PojoPropertyDescriptor("extra_params", (String[]) null, Types.parameterizedType(Map.class, new Type[]{String.class, String.class}), (Class) null, 7), new PojoPropertyDescriptor("click_target", (String[]) null, OgvClickTarget.class, (Class) null, 6)};

    public OperationTextVo_JsonDescriptor() {
        super(OperationTextVo.class, f94115a);
    }

    public final Object constructWith(Object[] objArr) {
        int i7 = 0;
        Object obj = objArr[0];
        if (obj == null) {
            i7 = 1;
        }
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
        List list = (List) obj4;
        Object obj5 = objArr[4];
        int i11 = i10;
        if (obj5 == null) {
            i11 = i10 | 16;
        }
        OgvColorDirection ogvColorDirection = (OgvColorDirection) obj5;
        Object obj6 = objArr[5];
        int i12 = i11;
        if (obj6 == null) {
            i12 = i11 | 32;
        }
        OperationReportEvents operationReportEvents = (OperationReportEvents) obj6;
        Object obj7 = objArr[6];
        int i13 = i12;
        if (obj7 == null) {
            i13 = i12 | 64;
        }
        Map map = (Map) obj7;
        Object obj8 = objArr[7];
        int i14 = i13;
        if (obj8 == null) {
            i14 = i13 | 128;
        }
        Map map2 = (Map) obj8;
        Object obj9 = objArr[8];
        int i15 = i14;
        if (obj9 == null) {
            i15 = i14 | 256;
        }
        return new OperationTextVo(str, str2, str3, list, ogvColorDirection, operationReportEvents, map, map2, (OgvClickTarget) obj9, i15);
    }

    public final Object get(Object obj, int i7) {
        OperationTextVo operationTextVo = (OperationTextVo) obj;
        switch (i7) {
            case 0:
                return operationTextVo.f94106a;
            case 1:
                return operationTextVo.f94107b;
            case 2:
                return operationTextVo.g();
            case 3:
                return operationTextVo.d();
            case 4:
                return operationTextVo.c();
            case 5:
                return operationTextVo.e();
            case 6:
                return operationTextVo.f();
            case 7:
                return operationTextVo.h;
            case 8:
                return operationTextVo.f94113i;
            default:
                return null;
        }
    }
}
