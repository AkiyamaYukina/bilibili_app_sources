package com.bilibili.ship.theseus.ogv.intro.section.bean;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/bean/InteractionHistoryNode_JsonDescriptor.class */
public final class InteractionHistoryNode_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f93541a;

    static {
        Class cls = Long.TYPE;
        f93541a = new PojoPropertyDescriptor[]{new PojoPropertyDescriptor("node_id", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("cid", (String[]) null, cls, (Class) null, 7)};
    }

    public InteractionHistoryNode_JsonDescriptor() {
        super(InteractionHistoryNode.class, f93541a);
    }

    public final Object constructWith(Object[] objArr) {
        int i7 = 0;
        Object obj = objArr[0];
        if (obj == null) {
            i7 = 1;
        }
        Long l7 = (Long) obj;
        long jLongValue = 0;
        long jLongValue2 = l7 == null ? 0L : l7.longValue();
        Object obj2 = objArr[1];
        int i8 = i7;
        if (obj2 == null) {
            i8 = i7 | 2;
        }
        Long l8 = (Long) obj2;
        if (l8 != null) {
            jLongValue = l8.longValue();
        }
        return new InteractionHistoryNode(jLongValue2, jLongValue, i8);
    }

    public final Object get(Object obj, int i7) {
        InteractionHistoryNode interactionHistoryNode = (InteractionHistoryNode) obj;
        if (i7 == 0) {
            return Long.valueOf(interactionHistoryNode.f93539a);
        }
        if (i7 != 1) {
            return null;
        }
        return Long.valueOf(interactionHistoryNode.f93540b);
    }
}
