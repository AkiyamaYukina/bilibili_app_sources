package com.bilibili.ship.theseus.united.page.restrictionlayer;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/VipFreeOperationAction_JsonDescriptor.class */
public final class VipFreeOperationAction_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f102725a = {new PojoPropertyDescriptor("report", (String[]) null, ReportVo.class, (Class) null, 0), new PojoPropertyDescriptor("task_param", (String[]) null, TaskParamVo.class, (Class) null, 0)};

    public VipFreeOperationAction_JsonDescriptor() {
        super(VipFreeOperationAction.class, f102725a);
    }

    public final Object constructWith(Object[] objArr) {
        return new VipFreeOperationAction((ReportVo) objArr[0], (TaskParamVo) objArr[1]);
    }

    public final Object get(Object obj, int i7) {
        VipFreeOperationAction vipFreeOperationAction = (VipFreeOperationAction) obj;
        if (i7 == 0) {
            return vipFreeOperationAction.f102723a;
        }
        if (i7 != 1) {
            return null;
        }
        return vipFreeOperationAction.f102724b;
    }
}
