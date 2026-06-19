package com.bilibili.ship.theseus.ugc.intro.uplikes;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uplikes/UserList_JsonDescriptor.class */
public final class UserList_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f97698a = {new PojoPropertyDescriptor("list", (String[]) null, Types.parameterizedType(List.class, new Type[]{User.class}), (Class) null, 21), new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 7)};

    public UserList_JsonDescriptor() {
        super(UserList.class, f97698a);
    }

    public final Object constructWith(Object[] objArr) {
        int i7 = 0;
        List list = (List) objArr[0];
        Object obj = objArr[1];
        if (obj == null) {
            i7 = 2;
        }
        return new UserList(list, (String) obj, i7);
    }

    public final Object get(Object obj, int i7) {
        UserList userList = (UserList) obj;
        if (i7 == 0) {
            return userList.f97696a;
        }
        if (i7 != 1) {
            return null;
        }
        return userList.f97697b;
    }
}
