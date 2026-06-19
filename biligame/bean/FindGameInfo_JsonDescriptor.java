package com.bilibili.biligame.bean;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/bean/FindGameInfo_JsonDescriptor.class */
public final class FindGameInfo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f62229a;

    static {
        Class cls = Integer.TYPE;
        f62229a = new PojoPropertyDescriptor[]{new PojoPropertyDescriptor("is_fall_back_query", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("page_number", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("page_size", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("total_count", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("list", (String[]) null, Types.parameterizedType(List.class, new Type[]{FindGameItemInfo.class}), (Class) null, 18)};
    }

    public FindGameInfo_JsonDescriptor() {
        super(FindGameInfo.class, f62229a);
    }

    public final Object constructWith(Object[] objArr) {
        FindGameInfo findGameInfo = new FindGameInfo();
        Object obj = objArr[0];
        if (obj != null) {
            findGameInfo.e(((Integer) obj).intValue());
        }
        Object obj2 = objArr[1];
        if (obj2 != null) {
            findGameInfo.f(((Integer) obj2).intValue());
        }
        Object obj3 = objArr[2];
        if (obj3 != null) {
            findGameInfo.g(((Integer) obj3).intValue());
        }
        Object obj4 = objArr[3];
        if (obj4 != null) {
            findGameInfo.h(((Integer) obj4).intValue());
        }
        Object obj5 = objArr[4];
        if (obj5 != null) {
            findGameInfo.f62228e = (List) obj5;
        }
        return findGameInfo;
    }

    public final Object get(Object obj, int i7) {
        int iD;
        FindGameInfo findGameInfo = (FindGameInfo) obj;
        if (i7 == 0) {
            iD = findGameInfo.d();
        } else if (i7 == 1) {
            iD = findGameInfo.a();
        } else if (i7 == 2) {
            iD = findGameInfo.b();
        } else {
            if (i7 != 3) {
                if (i7 != 4) {
                    return null;
                }
                return findGameInfo.f62228e;
            }
            iD = findGameInfo.c();
        }
        return Integer.valueOf(iD);
    }
}
