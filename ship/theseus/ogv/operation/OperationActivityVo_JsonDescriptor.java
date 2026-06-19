package com.bilibili.ship.theseus.ogv.operation;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.ogv.infra.gson.DurationFromMillisTypeAdapter;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.time.Duration;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/operation/OperationActivityVo_JsonDescriptor.class */
public final class OperationActivityVo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f94078a = {new PojoPropertyDescriptor("position", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("style_type", (String[]) null, UIStyle.class, (Class) null, 7), new PojoPropertyDescriptor("show_choice", (String[]) null, ShowTime.class, (Class) null, 7), new PojoPropertyDescriptor("show_duration", (String[]) null, Duration.class, DurationFromMillisTypeAdapter.class, 15), new PojoPropertyDescriptor("title", (String[]) null, OperationTextVo.class, (Class) null, 4), new PojoPropertyDescriptor("subtitle", (String[]) null, OperationTextVo.class, (Class) null, 4), new PojoPropertyDescriptor("countdown", (String[]) null, OperationCountdownVo.class, (Class) null, 4), new PojoPropertyDescriptor("button", (String[]) null, OperationTextVo.class, (Class) null, 4), new PojoPropertyDescriptor("close_button", (String[]) null, OperationTextVo.class, (Class) null, 4), new PojoPropertyDescriptor("banner", (String[]) null, OperationImageVo.class, (Class) null, 4), new PojoPropertyDescriptor("icon", (String[]) null, OperationImageVo.class, (Class) null, 4), new PojoPropertyDescriptor("icon_tag", (String[]) null, OperationTextVo.class, (Class) null, 4), new PojoPropertyDescriptor("event_ids", (String[]) null, OperationReportEvents.class, (Class) null, 4), new PojoPropertyDescriptor("track_params", (String[]) null, Types.parameterizedType(Map.class, new Type[]{String.class, String.class}), (Class) null, 7), new PojoPropertyDescriptor("extra_params", (String[]) null, Types.parameterizedType(Map.class, new Type[]{String.class, String.class}), (Class) null, 7), new PojoPropertyDescriptor("click_target", (String[]) null, OgvClickTarget.class, (Class) null, 4)};

    public OperationActivityVo_JsonDescriptor() {
        super(OperationActivityVo.class, f94078a);
    }

    public final Object constructWith(Object[] objArr) {
        int i7 = 0;
        String str = (String) objArr[0];
        Object obj = objArr[1];
        if (obj == null) {
            i7 = 2;
        }
        UIStyle uIStyle = (UIStyle) obj;
        Object obj2 = objArr[2];
        int i8 = i7;
        if (obj2 == null) {
            i8 = i7 | 4;
        }
        ShowTime showTime = (ShowTime) obj2;
        Object obj3 = objArr[3];
        int i9 = i8;
        if (obj3 == null) {
            i9 = i8 | 8;
        }
        Duration duration = (Duration) obj3;
        long j7 = duration != null ? duration.unbox-impl() : 0L;
        OperationTextVo operationTextVo = (OperationTextVo) objArr[4];
        OperationTextVo operationTextVo2 = (OperationTextVo) objArr[5];
        OperationCountdownVo operationCountdownVo = (OperationCountdownVo) objArr[6];
        OperationTextVo operationTextVo3 = (OperationTextVo) objArr[7];
        OperationTextVo operationTextVo4 = (OperationTextVo) objArr[8];
        OperationImageVo operationImageVo = (OperationImageVo) objArr[9];
        OperationImageVo operationImageVo2 = (OperationImageVo) objArr[10];
        OperationTextVo operationTextVo5 = (OperationTextVo) objArr[11];
        OperationReportEvents operationReportEvents = (OperationReportEvents) objArr[12];
        Object obj4 = objArr[13];
        int i10 = i9;
        if (obj4 == null) {
            i10 = i9 | 8192;
        }
        Map map = (Map) obj4;
        Object obj5 = objArr[14];
        int i11 = i10;
        if (obj5 == null) {
            i11 = i10 | 16384;
        }
        return new OperationActivityVo(str, uIStyle, showTime, j7, operationTextVo, operationTextVo2, operationCountdownVo, operationTextVo3, operationTextVo4, operationImageVo, operationImageVo2, operationTextVo5, operationReportEvents, map, (Map) obj5, (OgvClickTarget) objArr[15], i11);
    }

    public final Object get(Object obj, int i7) {
        OperationActivityVo operationActivityVo = (OperationActivityVo) obj;
        switch (i7) {
            case 0:
                return operationActivityVo.f94061a;
            case 1:
                return operationActivityVo.f94062b;
            case 2:
                return operationActivityVo.e();
            case 3:
                return Duration.box-impl(operationActivityVo.f94064d);
            case 4:
                return operationActivityVo.f94065e;
            case 5:
                return operationActivityVo.f94066f;
            case 6:
                return operationActivityVo.f94067g;
            case 7:
                return operationActivityVo.h;
            case 8:
                return operationActivityVo.f94068i;
            case 9:
                return operationActivityVo.f94069j;
            case 10:
                return operationActivityVo.f94070k;
            case 11:
                return operationActivityVo.f94071l;
            case 12:
                return operationActivityVo.c();
            case 13:
                return operationActivityVo.d();
            case 14:
                return operationActivityVo.f94074o;
            case 15:
                return operationActivityVo.f94075p;
            default:
                return null;
        }
    }
}
