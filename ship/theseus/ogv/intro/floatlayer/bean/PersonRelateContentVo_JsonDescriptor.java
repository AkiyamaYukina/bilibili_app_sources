package com.bilibili.ship.theseus.ogv.intro.floatlayer.bean;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.live.streaming.source.TextSource;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/bean/PersonRelateContentVo_JsonDescriptor.class */
public final class PersonRelateContentVo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f92876a;

    static {
        Class cls = Long.TYPE;
        PojoPropertyDescriptor pojoPropertyDescriptor = new PojoPropertyDescriptor("id", (String[]) null, cls, (Class) null, 5);
        Class cls2 = Integer.TYPE;
        f92876a = new PojoPropertyDescriptor[]{pojoPropertyDescriptor, new PojoPropertyDescriptor("num", (String[]) null, cls2, (Class) null, 5), new PojoPropertyDescriptor(TextSource.CFG_SIZE, (String[]) null, cls2, (Class) null, 5), new PojoPropertyDescriptor("pt", (String[]) null, cls2, (Class) null, 5), new PojoPropertyDescriptor("total", (String[]) null, cls2, (Class) null, 5), new PojoPropertyDescriptor("has_next", (String[]) null, Boolean.TYPE, (Class) null, 5), new PojoPropertyDescriptor("character_id", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("module_title", (String[]) null, String.class, (Class) null, 4), new PojoPropertyDescriptor("list", (String[]) null, Types.parameterizedType(List.class, new Type[]{PersonRelateSeason.class}), (Class) null, 20)};
    }

    public PersonRelateContentVo_JsonDescriptor() {
        super(PersonRelateContentVo.class, f92876a);
    }

    public final Object constructWith(Object[] objArr) {
        boolean zBooleanValue = false;
        Long l7 = (Long) objArr[0];
        long jLongValue = l7 == null ? 0L : l7.longValue();
        Integer num = (Integer) objArr[1];
        int iIntValue = num == null ? 0 : num.intValue();
        Integer num2 = (Integer) objArr[2];
        int iIntValue2 = num2 == null ? 0 : num2.intValue();
        Integer num3 = (Integer) objArr[3];
        int iIntValue3 = num3 == null ? 0 : num3.intValue();
        Integer num4 = (Integer) objArr[4];
        int iIntValue4 = num4 == null ? 0 : num4.intValue();
        Boolean bool = (Boolean) objArr[5];
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        Long l8 = (Long) objArr[6];
        return new PersonRelateContentVo(jLongValue, iIntValue, iIntValue2, iIntValue3, iIntValue4, zBooleanValue, l8 == null ? 0L : l8.longValue(), (String) objArr[7], (List) objArr[8]);
    }

    public final Object get(Object obj, int i7) {
        PersonRelateContentVo personRelateContentVo = (PersonRelateContentVo) obj;
        switch (i7) {
            case 0:
                return Long.valueOf(personRelateContentVo.f92868a);
            case 1:
                return Integer.valueOf(personRelateContentVo.f92869b);
            case 2:
                return Integer.valueOf(personRelateContentVo.f92870c);
            case 3:
                return Integer.valueOf(personRelateContentVo.f92871d);
            case 4:
                return Integer.valueOf(personRelateContentVo.f92872e);
            case 5:
                return Boolean.valueOf(personRelateContentVo.f92873f);
            case 6:
                return Long.valueOf(personRelateContentVo.f92874g);
            case 7:
                return personRelateContentVo.h;
            case 8:
                return personRelateContentVo.f92875i;
            default:
                return null;
        }
    }
}
