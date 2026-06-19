package com.bilibili.ogv.misc.roledetail.roledetailapi;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.live.streaming.source.TextSource;
import com.bilibili.ogv.misc.roledetail.roledetailapi.PersonRelateContentVo;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/roledetail/roledetailapi/PersonRelateContentVo_JsonDescriptor.class */
public final class PersonRelateContentVo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f69288a;

    static {
        PojoPropertyDescriptor pojoPropertyDescriptor = new PojoPropertyDescriptor("id", (String[]) null, Long.TYPE, (Class) null, 3);
        Class cls = Integer.TYPE;
        f69288a = new PojoPropertyDescriptor[]{pojoPropertyDescriptor, new PojoPropertyDescriptor(TextSource.CFG_SIZE, (String[]) null, cls, (Class) null, 3), new PojoPropertyDescriptor("total", (String[]) null, cls, (Class) null, 3), new PojoPropertyDescriptor("has_next", (String[]) null, Boolean.TYPE, (Class) null, 7), new PojoPropertyDescriptor("module_title", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("list", (String[]) null, Types.parameterizedType(List.class, new Type[]{PersonRelateContentVo.Season.class}), (Class) null, 18)};
    }

    public PersonRelateContentVo_JsonDescriptor() {
        super(PersonRelateContentVo.class, f69288a);
    }

    public final Object constructWith(Object[] objArr) {
        PersonRelateContentVo personRelateContentVo = new PersonRelateContentVo();
        Object obj = objArr[0];
        if (obj != null) {
            personRelateContentVo.f69275a = ((Long) obj).longValue();
        }
        Object obj2 = objArr[1];
        if (obj2 != null) {
            personRelateContentVo.f69276b = ((Integer) obj2).intValue();
        }
        Object obj3 = objArr[2];
        if (obj3 != null) {
            personRelateContentVo.f69277c = ((Integer) obj3).intValue();
        }
        Object obj4 = objArr[3];
        if (obj4 != null) {
            personRelateContentVo.c(((Boolean) obj4).booleanValue());
        }
        Object obj5 = objArr[4];
        if (obj5 != null) {
            personRelateContentVo.d((String) obj5);
        }
        Object obj6 = objArr[5];
        if (obj6 != null) {
            personRelateContentVo.f69280f = (List) obj6;
        }
        return personRelateContentVo;
    }

    public final Object get(Object obj, int i7) {
        PersonRelateContentVo personRelateContentVo = (PersonRelateContentVo) obj;
        if (i7 == 0) {
            return Long.valueOf(personRelateContentVo.f69275a);
        }
        if (i7 == 1) {
            return Integer.valueOf(personRelateContentVo.f69276b);
        }
        if (i7 == 2) {
            return Integer.valueOf(personRelateContentVo.f69277c);
        }
        if (i7 == 3) {
            return Boolean.valueOf(personRelateContentVo.a());
        }
        if (i7 == 4) {
            return personRelateContentVo.b();
        }
        if (i7 != 5) {
            return null;
        }
        return personRelateContentVo.f69280f;
    }
}
