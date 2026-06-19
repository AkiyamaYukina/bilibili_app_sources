package com.bilibili.ogv.misc.roledetail.roledetailapi;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.ogv.misc.roledetail.roledetailapi.PersonInfoVo;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/roledetail/roledetailapi/PersonInfoVo_JsonDescriptor.class */
public final class PersonInfoVo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f69273a = {new PojoPropertyDescriptor("avatar", (String[]) null, String.class, (Class) null, 2), new PojoPropertyDescriptor("bg_img", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("evaluate", (String[]) null, String.class, (Class) null, 2), new PojoPropertyDescriptor("id", (String[]) null, Long.TYPE, (Class) null, 3), new PojoPropertyDescriptor("name", (String[]) null, String.class, (Class) null, 2), new PojoPropertyDescriptor("origin_name", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("orders", (String[]) null, Types.parameterizedType(List.class, new Type[]{PersonInfoVo.Order.class}), (Class) null, 18)};

    public PersonInfoVo_JsonDescriptor() {
        super(PersonInfoVo.class, f69273a);
    }

    public final Object constructWith(Object[] objArr) {
        PersonInfoVo personInfoVo = new PersonInfoVo();
        Object obj = objArr[0];
        if (obj != null) {
            personInfoVo.f69264a = (String) obj;
        }
        Object obj2 = objArr[1];
        if (obj2 != null) {
            personInfoVo.c((String) obj2);
        }
        Object obj3 = objArr[2];
        if (obj3 != null) {
            personInfoVo.f69266c = (String) obj3;
        }
        Object obj4 = objArr[3];
        if (obj4 != null) {
            personInfoVo.f69267d = ((Long) obj4).longValue();
        }
        Object obj5 = objArr[4];
        if (obj5 != null) {
            personInfoVo.f69268e = (String) obj5;
        }
        Object obj6 = objArr[5];
        if (obj6 != null) {
            personInfoVo.d((String) obj6);
        }
        Object obj7 = objArr[6];
        if (obj7 != null) {
            personInfoVo.f69270g = (List) obj7;
        }
        return personInfoVo;
    }

    public final Object get(Object obj, int i7) {
        PersonInfoVo personInfoVo = (PersonInfoVo) obj;
        switch (i7) {
            case 0:
                return personInfoVo.f69264a;
            case 1:
                return personInfoVo.a();
            case 2:
                return personInfoVo.f69266c;
            case 3:
                return Long.valueOf(personInfoVo.f69267d);
            case 4:
                return personInfoVo.f69268e;
            case 5:
                return personInfoVo.b();
            case 6:
                return personInfoVo.f69270g;
            default:
                return null;
        }
    }
}
