package com.bilibili.ship.theseus.ogv.chathall.bean;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.chatroomsdk.ChatMsg;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/chathall/bean/ActionData_JsonDescriptor.class */
public final class ActionData_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f91737a = {new PojoPropertyDescriptor("action_type", (String[]) null, Integer.TYPE, (Class) null, 5), new PojoPropertyDescriptor("action_message", (String[]) null, ChatMsg.class, (Class) null, 4)};

    public ActionData_JsonDescriptor() {
        super(ActionData.class, f91737a);
    }

    public final Object constructWith(Object[] objArr) {
        int iIntValue = 0;
        Integer num = (Integer) objArr[0];
        if (num != null) {
            iIntValue = num.intValue();
        }
        return new ActionData(iIntValue, (ChatMsg) objArr[1]);
    }

    public final Object get(Object obj, int i7) {
        ActionData actionData = (ActionData) obj;
        if (i7 == 0) {
            return Integer.valueOf(actionData.b());
        }
        if (i7 != 1) {
            return null;
        }
        return actionData.a();
    }
}
