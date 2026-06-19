package com.bilibili.tgwt.square;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/square/HotRoom_JsonDescriptor.class */
public final class HotRoom_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f112038a = {new PojoPropertyDescriptor("desc", (String[]) null, String.class, (Class) null, 4), new PojoPropertyDescriptor("recent_watchers", (String[]) null, Types.parameterizedType(List.class, new Type[]{RecentWatcher.class}), (Class) null, 20), new PojoPropertyDescriptor("in_room", (String[]) null, Boolean.TYPE, (Class) null, 5)};

    public HotRoom_JsonDescriptor() {
        super(HotRoom.class, f112038a);
    }

    public final Object constructWith(Object[] objArr) {
        boolean zBooleanValue = false;
        String str = (String) objArr[0];
        List list = (List) objArr[1];
        Boolean bool = (Boolean) objArr[2];
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return new HotRoom(str, list, zBooleanValue);
    }

    public final Object get(Object obj, int i7) {
        HotRoom hotRoom = (HotRoom) obj;
        if (i7 == 0) {
            return hotRoom.f112035a;
        }
        if (i7 == 1) {
            return hotRoom.f112036b;
        }
        if (i7 != 2) {
            return null;
        }
        return Boolean.valueOf(hotRoom.f112037c);
    }
}
