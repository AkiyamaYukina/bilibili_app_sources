package com.bilibili.ship.theseus.united.page.restrictionlayer;

import com.bilibili.bson.adapter.JsonInStringTypeAdapterFactory;
import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import java.lang.reflect.Type;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/ReportVo_JsonDescriptor.class */
public final class ReportVo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f102635a = {new PojoPropertyDescriptor("show_event_id", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("click_event_id", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("extends", (String[]) null, Types.parameterizedType(Map.class, new Type[]{String.class, String.class}), JsonInStringTypeAdapterFactory.class, 13)};

    public ReportVo_JsonDescriptor() {
        super(ReportVo.class, f102635a);
    }

    public final Object constructWith(Object[] objArr) {
        return new ReportVo((String) objArr[0], (String) objArr[1], (Map) objArr[2]);
    }

    public final Object get(Object obj, int i7) {
        ReportVo reportVo = (ReportVo) obj;
        if (i7 == 0) {
            return reportVo.d();
        }
        if (i7 == 1) {
            return reportVo.b();
        }
        if (i7 != 2) {
            return null;
        }
        return reportVo.c();
    }
}
