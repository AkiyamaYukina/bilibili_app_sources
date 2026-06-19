package com.bilibili.ship.theseus.united.page.restrictionlayer;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/TaskParamVo_JsonDescriptor.class */
public final class TaskParamVo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f102704a;

    static {
        Class cls = Long.TYPE;
        f102704a = new PojoPropertyDescriptor[]{new PojoPropertyDescriptor("activity_id", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("task_type", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("tips_id", (String[]) null, cls, (Class) null, 5)};
    }

    public TaskParamVo_JsonDescriptor() {
        super(TaskParamVo.class, f102704a);
    }

    public final Object constructWith(Object[] objArr) {
        Long l7 = (Long) objArr[0];
        long jLongValue = l7 == null ? 0L : l7.longValue();
        String str = (String) objArr[1];
        Long l8 = (Long) objArr[2];
        return new TaskParamVo(jLongValue, str, l8 == null ? 0L : l8.longValue());
    }

    public final Object get(Object obj, int i7) {
        TaskParamVo taskParamVo = (TaskParamVo) obj;
        if (i7 == 0) {
            return Long.valueOf(taskParamVo.f102701a);
        }
        if (i7 == 1) {
            return taskParamVo.f102702b;
        }
        if (i7 != 2) {
            return null;
        }
        return Long.valueOf(taskParamVo.f102703c);
    }
}
