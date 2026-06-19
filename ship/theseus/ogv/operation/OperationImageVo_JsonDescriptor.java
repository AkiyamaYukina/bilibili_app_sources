package com.bilibili.ship.theseus.ogv.operation;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import java.lang.reflect.Type;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/operation/OperationImageVo_JsonDescriptor.class */
public final class OperationImageVo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f94102a = {new PojoPropertyDescriptor("url", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("event_ids", (String[]) null, OperationReportEvents.class, (Class) null, 6), new PojoPropertyDescriptor("track_params", (String[]) null, Types.parameterizedType(Map.class, new Type[]{String.class, String.class}), (Class) null, 7), new PojoPropertyDescriptor("extra_params", (String[]) null, Types.parameterizedType(Map.class, new Type[]{String.class, String.class}), (Class) null, 7), new PojoPropertyDescriptor("click_target", (String[]) null, OgvClickTarget.class, (Class) null, 6)};

    public OperationImageVo_JsonDescriptor() {
        super(OperationImageVo.class, f94102a);
    }

    public final Object constructWith(Object[] objArr) {
        int i7 = 0;
        String str = (String) objArr[0];
        Object obj = objArr[1];
        if (obj == null) {
            i7 = 2;
        }
        OperationReportEvents operationReportEvents = (OperationReportEvents) obj;
        Object obj2 = objArr[2];
        int i8 = i7;
        if (obj2 == null) {
            i8 = i7 | 4;
        }
        Map map = (Map) obj2;
        Object obj3 = objArr[3];
        int i9 = i8;
        if (obj3 == null) {
            i9 = i8 | 8;
        }
        Map map2 = (Map) obj3;
        Object obj4 = objArr[4];
        int i10 = i9;
        if (obj4 == null) {
            i10 = i9 | 16;
        }
        return new OperationImageVo(str, operationReportEvents, map, map2, (OgvClickTarget) obj4, i10);
    }

    public final Object get(Object obj, int i7) {
        OperationImageVo operationImageVo = (OperationImageVo) obj;
        if (i7 == 0) {
            return operationImageVo.f94097a;
        }
        if (i7 == 1) {
            return operationImageVo.a();
        }
        if (i7 == 2) {
            return operationImageVo.b();
        }
        if (i7 == 3) {
            return operationImageVo.f94100d;
        }
        if (i7 != 4) {
            return null;
        }
        return operationImageVo.f94101e;
    }
}
