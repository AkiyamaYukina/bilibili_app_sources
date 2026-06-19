package com.bilibili.ogvcommon.play.vo.base;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import java.lang.reflect.Type;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/vo/base/ReportVo_JsonDescriptor.class */
public final class ReportVo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f73348a = {new PojoPropertyDescriptor("show_event_id", (String[]) null, String.class, (Class) null, 4), new PojoPropertyDescriptor("click_event_id", (String[]) null, String.class, (Class) null, 4), new PojoPropertyDescriptor("extends", (String[]) null, Types.parameterizedType(Map.class, new Type[]{String.class, String.class}), (Class) null, 4)};

    public ReportVo_JsonDescriptor() {
        super(ReportVo.class, f73348a);
    }

    public final Object constructWith(Object[] objArr) {
        return new ReportVo((String) objArr[0], (String) objArr[1], (Map) objArr[2]);
    }

    public final Object get(Object obj, int i7) {
        ReportVo reportVo = (ReportVo) obj;
        if (i7 == 0) {
            return reportVo.c();
        }
        if (i7 == 1) {
            return reportVo.a();
        }
        if (i7 != 2) {
            return null;
        }
        return reportVo.b();
    }
}
