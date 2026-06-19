package com.bilibili.ogv.misc.seasonlist;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/seasonlist/BangumiSeasonListPrevious_JsonDescriptor.class */
public final class BangumiSeasonListPrevious_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f69312a;

    static {
        Class cls = Integer.TYPE;
        f69312a = new PojoPropertyDescriptor[]{new PojoPropertyDescriptor("year", (String[]) null, cls, (Class) null, 3), new PojoPropertyDescriptor("season", (String[]) null, cls, (Class) null, 3), new PojoPropertyDescriptor("list", (String[]) null, Types.parameterizedType(List.class, new Type[]{BangumiBrief.class}), (Class) null, 6), new PojoPropertyDescriptor("scheme", (String[]) null, String.class, (Class) null, 2)};
    }

    public BangumiSeasonListPrevious_JsonDescriptor() {
        super(BangumiSeasonListPrevious.class, f69312a);
    }

    public final Object constructWith(Object[] objArr) {
        BangumiSeasonListPrevious bangumiSeasonListPrevious = new BangumiSeasonListPrevious();
        Object obj = objArr[0];
        if (obj != null) {
            bangumiSeasonListPrevious.f69308a = ((Integer) obj).intValue();
        }
        Object obj2 = objArr[1];
        if (obj2 != null) {
            bangumiSeasonListPrevious.f69309b = ((Integer) obj2).intValue();
        }
        Object obj3 = objArr[2];
        if (obj3 != null) {
            bangumiSeasonListPrevious.f69310c = (List) obj3;
        }
        Object obj4 = objArr[3];
        if (obj4 != null) {
            bangumiSeasonListPrevious.f69311d = (String) obj4;
        }
        return bangumiSeasonListPrevious;
    }

    public final Object get(Object obj, int i7) {
        int i8;
        BangumiSeasonListPrevious bangumiSeasonListPrevious = (BangumiSeasonListPrevious) obj;
        if (i7 == 0) {
            i8 = bangumiSeasonListPrevious.f69308a;
        } else {
            if (i7 != 1) {
                if (i7 == 2) {
                    return bangumiSeasonListPrevious.f69310c;
                }
                if (i7 != 3) {
                    return null;
                }
                return bangumiSeasonListPrevious.f69311d;
            }
            i8 = bangumiSeasonListPrevious.f69309b;
        }
        return Integer.valueOf(i8);
    }
}
