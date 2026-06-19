package com.bilibili.ship.theseus.playlist.api;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/api/ListResponse_JsonDescriptor.class */
public final class ListResponse_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f95209a = {new PojoPropertyDescriptor("media_list", (String[]) null, Types.parameterizedType(List.class, new Type[]{MultiTypeMedia.class}), (Class) null, 23), new PojoPropertyDescriptor("has_more", (String[]) null, Boolean.TYPE, (Class) null, 7), new PojoPropertyDescriptor("total_count", (String[]) null, Integer.TYPE, (Class) null, 7)};

    public ListResponse_JsonDescriptor() {
        super(ListResponse.class, f95209a);
    }

    public final Object constructWith(Object[] objArr) {
        Object obj = objArr[0];
        int i7 = obj == null ? 1 : 0;
        List list = (List) obj;
        Object obj2 = objArr[1];
        int i8 = i7;
        if (obj2 == null) {
            i8 = i7 | 2;
        }
        Boolean bool = (Boolean) obj2;
        boolean zBooleanValue = bool == null ? false : bool.booleanValue();
        Object obj3 = objArr[2];
        int i9 = i8;
        if (obj3 == null) {
            i9 = i8 | 4;
        }
        Integer num = (Integer) obj3;
        return new ListResponse(list, num == null ? 0 : num.intValue(), i9, zBooleanValue);
    }

    public final Object get(Object obj, int i7) {
        ListResponse listResponse = (ListResponse) obj;
        if (i7 == 0) {
            return listResponse.f95206a;
        }
        if (i7 == 1) {
            return Boolean.valueOf(listResponse.f95207b);
        }
        if (i7 != 2) {
            return null;
        }
        return Integer.valueOf(listResponse.f95208c);
    }
}
