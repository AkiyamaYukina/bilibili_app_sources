package com.bilibili.tgwt.square;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/square/RoomInfo_JsonDescriptor.class */
public final class RoomInfo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f112091a = {new PojoPropertyDescriptor("recent_watchers", (String[]) null, Types.parameterizedType(List.class, new Type[]{RecentWatcher.class}), (Class) null, 20)};

    public RoomInfo_JsonDescriptor() {
        super(RoomInfo.class, f112091a);
    }

    public final Object constructWith(Object[] objArr) {
        return new RoomInfo((List) objArr[0]);
    }

    public final Object get(Object obj, int i7) {
        RoomInfo roomInfo = (RoomInfo) obj;
        if (i7 != 0) {
            return null;
        }
        return roomInfo.f112090a;
    }
}
