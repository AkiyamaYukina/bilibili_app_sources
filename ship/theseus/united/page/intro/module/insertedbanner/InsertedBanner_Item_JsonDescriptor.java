package com.bilibili.ship.theseus.united.page.intro.module.insertedbanner;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.ship.theseus.united.page.intro.module.insertedbanner.InsertedBanner;
import java.lang.reflect.Type;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/insertedbanner/InsertedBanner_Item_JsonDescriptor.class */
public final class InsertedBanner_Item_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f100165a = {new PojoPropertyDescriptor("cover", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("url", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("jump_type", (String[]) null, InsertedBanner.Item.NavigationType.class, (Class) null, 7), new PojoPropertyDescriptor("report", (String[]) null, Types.parameterizedType(Map.class, new Type[]{String.class, String.class}), (Class) null, 5)};

    public InsertedBanner_Item_JsonDescriptor() {
        super(InsertedBanner.Item.class, f100165a);
    }

    public final Object constructWith(Object[] objArr) {
        int i7 = 0;
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        Object obj = objArr[2];
        if (obj == null) {
            i7 = 4;
        }
        return new InsertedBanner.Item(str, str2, (InsertedBanner.Item.NavigationType) obj, (Map) objArr[3], i7);
    }

    public final Object get(Object obj, int i7) {
        InsertedBanner.Item item = (InsertedBanner.Item) obj;
        if (i7 == 0) {
            return item.f100151a;
        }
        if (i7 == 1) {
            return item.f100152b;
        }
        if (i7 == 2) {
            return item.a();
        }
        if (i7 != 3) {
            return null;
        }
        return item.f100154d;
    }
}
