package com.bilibili.ship.theseus.ogv.operation;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/operation/OperationReportEvents_JsonDescriptor.class */
public final class OperationReportEvents_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f94105a = {new PojoPropertyDescriptor("show", (String[]) null, String.class, (Class) null, 4), new PojoPropertyDescriptor("click", (String[]) null, String.class, (Class) null, 4)};

    public OperationReportEvents_JsonDescriptor() {
        super(OperationReportEvents.class, f94105a);
    }

    public final Object constructWith(Object[] objArr) {
        return new OperationReportEvents((String) objArr[0], (String) objArr[1]);
    }

    public final Object get(Object obj, int i7) {
        OperationReportEvents operationReportEvents = (OperationReportEvents) obj;
        if (i7 == 0) {
            return operationReportEvents.f94103a;
        }
        if (i7 != 1) {
            return null;
        }
        return operationReportEvents.f94104b;
    }
}
