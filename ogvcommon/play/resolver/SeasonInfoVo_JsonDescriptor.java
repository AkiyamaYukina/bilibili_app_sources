package com.bilibili.ogvcommon.play.resolver;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/resolver/SeasonInfoVo_JsonDescriptor.class */
public final class SeasonInfoVo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f73222a = {new PojoPropertyDescriptor("season_id", (String[]) null, Long.TYPE, (Class) null, 5), new PojoPropertyDescriptor("season_type", (String[]) null, Integer.TYPE, (Class) null, 5)};

    public SeasonInfoVo_JsonDescriptor() {
        super(SeasonInfoVo.class, f73222a);
    }

    public final Object constructWith(Object[] objArr) {
        int iIntValue = 0;
        Long l7 = (Long) objArr[0];
        long jLongValue = l7 == null ? 0L : l7.longValue();
        Integer num = (Integer) objArr[1];
        if (num != null) {
            iIntValue = num.intValue();
        }
        return new SeasonInfoVo(jLongValue, iIntValue);
    }

    public final Object get(Object obj, int i7) {
        SeasonInfoVo seasonInfoVo = (SeasonInfoVo) obj;
        if (i7 == 0) {
            return Long.valueOf(seasonInfoVo.a());
        }
        if (i7 != 1) {
            return null;
        }
        return Integer.valueOf(seasonInfoVo.b());
    }
}
