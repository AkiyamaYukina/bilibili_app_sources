package com.bilibili.ogv.misc.follow.api.entity;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/follow/api/entity/FollowMovableList_JsonDescriptor.class */
public final class FollowMovableList_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f69126a = {new PojoPropertyDescriptor("movable_list", (String[]) null, Types.parameterizedType(List.class, new Type[]{Long.class}), (Class) null, 23)};

    public FollowMovableList_JsonDescriptor() {
        super(FollowMovableList.class, f69126a);
    }

    public final Object constructWith(Object[] objArr) {
        FollowMovableList followMovableList = new FollowMovableList();
        Object obj = objArr[0];
        if (obj != null) {
            followMovableList.b((List) obj);
        }
        return followMovableList;
    }

    public final Object get(Object obj, int i7) {
        FollowMovableList followMovableList = (FollowMovableList) obj;
        if (i7 != 0) {
            return null;
        }
        return followMovableList.a();
    }
}
