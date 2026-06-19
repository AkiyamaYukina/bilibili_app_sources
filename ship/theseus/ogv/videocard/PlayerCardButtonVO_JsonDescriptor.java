package com.bilibili.ship.theseus.ogv.videocard;

import com.bilibili.bson.adapter.StringIntColorTypeAdapter;
import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videocard/PlayerCardButtonVO_JsonDescriptor.class */
public final class PlayerCardButtonVO_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f94665a;

    static {
        PojoPropertyDescriptor pojoPropertyDescriptor = new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 5);
        Class cls = Integer.TYPE;
        f94665a = new PojoPropertyDescriptor[]{pojoPropertyDescriptor, new PojoPropertyDescriptor("start_color", (String[]) null, cls, StringIntColorTypeAdapter.class, 15), new PojoPropertyDescriptor("end_color", (String[]) null, cls, StringIntColorTypeAdapter.class, 15)};
    }

    public PlayerCardButtonVO_JsonDescriptor() {
        super(PlayerCardButtonVO.class, f94665a);
    }

    public final Object constructWith(Object[] objArr) {
        String str = (String) objArr[0];
        Object obj = objArr[1];
        int i7 = obj == null ? 2 : 0;
        Integer num = (Integer) obj;
        int iIntValue = num == null ? 0 : num.intValue();
        Object obj2 = objArr[2];
        int i8 = i7;
        if (obj2 == null) {
            i8 = i7 | 4;
        }
        Integer num2 = (Integer) obj2;
        return new PlayerCardButtonVO(str, iIntValue, num2 == null ? 0 : num2.intValue(), i8);
    }

    public final Object get(Object obj, int i7) {
        int iB;
        PlayerCardButtonVO playerCardButtonVO = (PlayerCardButtonVO) obj;
        if (i7 == 0) {
            return playerCardButtonVO.c();
        }
        if (i7 == 1) {
            iB = playerCardButtonVO.b();
        } else {
            if (i7 != 2) {
                return null;
            }
            iB = playerCardButtonVO.a();
        }
        return Integer.valueOf(iB);
    }
}
