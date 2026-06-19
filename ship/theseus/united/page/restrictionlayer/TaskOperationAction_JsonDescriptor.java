package com.bilibili.ship.theseus.united.page.restrictionlayer;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/TaskOperationAction_JsonDescriptor.class */
public final class TaskOperationAction_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f102700a = {new PojoPropertyDescriptor("report", (String[]) null, ReportVo.class, (Class) null, 0), new PojoPropertyDescriptor("task_param", (String[]) null, TaskParamVo.class, (Class) null, 0)};

    public TaskOperationAction_JsonDescriptor() {
        super(TaskOperationAction.class, f102700a);
    }

    public final Object constructWith(Object[] objArr) {
        return new TaskOperationAction((ReportVo) objArr[0], (TaskParamVo) objArr[1]);
    }

    public final Object get(Object obj, int i7) {
        TaskOperationAction taskOperationAction = (TaskOperationAction) obj;
        if (i7 == 0) {
            return taskOperationAction.f102698a;
        }
        if (i7 != 1) {
            return null;
        }
        return taskOperationAction.f102699b;
    }
}
