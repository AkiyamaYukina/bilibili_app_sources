package com.bilibili.ship.theseus.ogv.operation;

import com.bilibili.bson.adapter.FirstFromListAdapter;
import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.ogv.infra.gson.DurationFromMillisTypeAdapter;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.time.Duration;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/operation/OperationCountdownVo_JsonDescriptor.class */
public final class OperationCountdownVo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f94096a = {new PojoPropertyDescriptor("countdown_cost", (String[]) null, Duration.class, DurationFromMillisTypeAdapter.class, 13), new PojoPropertyDescriptor("countdown_duration", (String[]) null, Duration.class, DurationFromMillisTypeAdapter.class, 13), new PojoPropertyDescriptor("text_color", (String[]) null, c.class, FirstFromListAdapter.class, 14), new PojoPropertyDescriptor("event_ids", (String[]) null, OperationReportEvents.class, (Class) null, 6), new PojoPropertyDescriptor("track_params", (String[]) null, Types.parameterizedType(Map.class, new Type[]{String.class, String.class}), (Class) null, 7), new PojoPropertyDescriptor("extra_params", (String[]) null, Types.parameterizedType(Map.class, new Type[]{String.class, String.class}), (Class) null, 7), new PojoPropertyDescriptor("click_target", (String[]) null, OgvClickTarget.class, (Class) null, 6)};

    public OperationCountdownVo_JsonDescriptor() {
        super(OperationCountdownVo.class, f94096a);
    }

    public final Object constructWith(Object[] objArr) {
        int i7 = 0;
        long j7 = ((Duration) objArr[0]).unbox-impl();
        long j8 = ((Duration) objArr[1]).unbox-impl();
        Object obj = objArr[2];
        if (obj == null) {
            i7 = 4;
        }
        c cVar = (c) obj;
        Object obj2 = objArr[3];
        int i8 = i7;
        if (obj2 == null) {
            i8 = i7 | 8;
        }
        OperationReportEvents operationReportEvents = (OperationReportEvents) obj2;
        Object obj3 = objArr[4];
        int i9 = i8;
        if (obj3 == null) {
            i9 = i8 | 16;
        }
        Map map = (Map) obj3;
        Object obj4 = objArr[5];
        int i10 = i9;
        if (obj4 == null) {
            i10 = i9 | 32;
        }
        Map map2 = (Map) obj4;
        Object obj5 = objArr[6];
        int i11 = i10;
        if (obj5 == null) {
            i11 = i10 | 64;
        }
        return new OperationCountdownVo(j7, j8, cVar, operationReportEvents, map, map2, (OgvClickTarget) obj5, i11);
    }

    public final Object get(Object obj, int i7) {
        OperationCountdownVo operationCountdownVo = (OperationCountdownVo) obj;
        switch (i7) {
            case 0:
                return Duration.box-impl(operationCountdownVo.f94089a);
            case 1:
                return Duration.box-impl(operationCountdownVo.f94090b);
            case 2:
                return operationCountdownVo.f94091c;
            case 3:
                return operationCountdownVo.a();
            case 4:
                return operationCountdownVo.b();
            case 5:
                return operationCountdownVo.f94094f;
            case 6:
                return operationCountdownVo.f94095g;
            default:
                return null;
        }
    }
}
