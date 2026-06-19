package com.bilibili.ship.theseus.united.page.intro.module.insertedbanner;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.ship.theseus.united.page.intro.module.insertedbanner.InsertedBanner;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/insertedbanner/InsertedBanner_JsonDescriptor.class */
public final class InsertedBanner_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f100166a = {new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("item", (String[]) null, Types.parameterizedType(List.class, new Type[]{InsertedBanner.Item.class}), (Class) null, 21), new PojoPropertyDescriptor("show_style", (String[]) null, InsertedBanner.Style.class, (Class) null, 7)};

    public InsertedBanner_JsonDescriptor() {
        super(InsertedBanner.class, f100166a);
    }

    public final Object constructWith(Object[] objArr) {
        int i7 = 0;
        String str = (String) objArr[0];
        List list = (List) objArr[1];
        Object obj = objArr[2];
        if (obj == null) {
            i7 = 4;
        }
        return new InsertedBanner(str, list, (InsertedBanner.Style) obj, i7);
    }

    public final Object get(Object obj, int i7) {
        InsertedBanner insertedBanner = (InsertedBanner) obj;
        if (i7 == 0) {
            return insertedBanner.f100148a;
        }
        if (i7 == 1) {
            return insertedBanner.a();
        }
        if (i7 != 2) {
            return null;
        }
        return insertedBanner.b();
    }
}
