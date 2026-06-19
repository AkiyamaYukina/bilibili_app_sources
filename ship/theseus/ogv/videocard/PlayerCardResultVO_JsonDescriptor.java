package com.bilibili.ship.theseus.ogv.videocard;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videocard/PlayerCardResultVO_JsonDescriptor.class */
public final class PlayerCardResultVO_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f94670a = {new PojoPropertyDescriptor("season_id", (String[]) null, Long.TYPE, (Class) null, 5), new PojoPropertyDescriptor("action_type", (String[]) null, Integer.TYPE, (Class) null, 5), new PojoPropertyDescriptor("toast_msg", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("card_list", (String[]) null, Types.parameterizedType(List.class, new Type[]{PlayerCardVO.class}), (Class) null, 20)};

    public PlayerCardResultVO_JsonDescriptor() {
        super(PlayerCardResultVO.class, f94670a);
    }

    public final Object constructWith(Object[] objArr) {
        int iIntValue = 0;
        Long l7 = (Long) objArr[0];
        long jLongValue = l7 == null ? 0L : l7.longValue();
        Integer num = (Integer) objArr[1];
        if (num != null) {
            iIntValue = num.intValue();
        }
        return new PlayerCardResultVO(iIntValue, jLongValue, (String) objArr[2], (List) objArr[3]);
    }

    public final Object get(Object obj, int i7) {
        PlayerCardResultVO playerCardResultVO = (PlayerCardResultVO) obj;
        if (i7 == 0) {
            return Long.valueOf(playerCardResultVO.b());
        }
        if (i7 == 1) {
            return Integer.valueOf(playerCardResultVO.d());
        }
        if (i7 == 2) {
            return playerCardResultVO.c();
        }
        if (i7 != 3) {
            return null;
        }
        return playerCardResultVO.a();
    }
}
