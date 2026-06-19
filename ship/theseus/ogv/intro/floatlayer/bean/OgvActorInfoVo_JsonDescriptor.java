package com.bilibili.ship.theseus.ogv.intro.floatlayer.bean;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/bean/OgvActorInfoVo_JsonDescriptor.class */
public final class OgvActorInfoVo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f92846a = {new PojoPropertyDescriptor("avatar", (String[]) null, String.class, (Class) null, 1), new PojoPropertyDescriptor("bg_img", (String[]) null, String.class, (Class) null, 1), new PojoPropertyDescriptor("evaluate", (String[]) null, String.class, (Class) null, 1), new PojoPropertyDescriptor("id", (String[]) null, Long.TYPE, (Class) null, 1), new PojoPropertyDescriptor("job_info", (String[]) null, String.class, (Class) null, 1), new PojoPropertyDescriptor("name", (String[]) null, String.class, (Class) null, 1), new PojoPropertyDescriptor("origin_name", (String[]) null, String.class, (Class) null, 1), new PojoPropertyDescriptor("orders", (String[]) null, Types.parameterizedType(List.class, new Type[]{Order.class}), (Class) null, 17)};

    public OgvActorInfoVo_JsonDescriptor() {
        super(OgvActorInfoVo.class, f92846a);
    }

    public final Object constructWith(Object[] objArr) {
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        String str3 = (String) objArr[2];
        Long l7 = (Long) objArr[3];
        return new OgvActorInfoVo(l7 == null ? 0L : l7.longValue(), str, str2, str3, (String) objArr[4], (String) objArr[5], (String) objArr[6], (List) objArr[7]);
    }

    public final Object get(Object obj, int i7) {
        OgvActorInfoVo ogvActorInfoVo = (OgvActorInfoVo) obj;
        switch (i7) {
            case 0:
                return ogvActorInfoVo.f92839a;
            case 1:
                return ogvActorInfoVo.f92840b;
            case 2:
                return ogvActorInfoVo.f92841c;
            case 3:
                return Long.valueOf(ogvActorInfoVo.f92842d);
            case 4:
                return ogvActorInfoVo.f92843e;
            case 5:
                return ogvActorInfoVo.f92844f;
            case 6:
                return ogvActorInfoVo.f92845g;
            case 7:
                return ogvActorInfoVo.h;
            default:
                return null;
        }
    }
}
