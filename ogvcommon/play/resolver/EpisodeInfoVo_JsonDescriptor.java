package com.bilibili.ogvcommon.play.resolver;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/resolver/EpisodeInfoVo_JsonDescriptor.class */
public final class EpisodeInfoVo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f73215a;

    static {
        Class cls = Long.TYPE;
        f73215a = new PojoPropertyDescriptor[]{new PojoPropertyDescriptor("ep_id", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("cid", (String[]) null, cls, (Class) null, 1), new PojoPropertyDescriptor("aid", (String[]) null, cls, (Class) null, 1), new PojoPropertyDescriptor("ep_status", (String[]) null, Integer.TYPE, (Class) null, 5), new PojoPropertyDescriptor("season_info", (String[]) null, SeasonInfoVo.class, (Class) null, 4), new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 2), new PojoPropertyDescriptor("long_title", (String[]) null, String.class, (Class) null, 6)};
    }

    public EpisodeInfoVo_JsonDescriptor() {
        super(EpisodeInfoVo.class, f73215a);
    }

    public final Object constructWith(Object[] objArr) {
        char c7 = 0;
        Long l7 = (Long) objArr[0];
        long jLongValue = l7 == null ? 0L : l7.longValue();
        Long l8 = (Long) objArr[1];
        long jLongValue2 = l8 == null ? 0L : l8.longValue();
        Long l9 = (Long) objArr[2];
        long jLongValue3 = l9 == null ? 0L : l9.longValue();
        Integer num = (Integer) objArr[3];
        int iIntValue = num == null ? 0 : num.intValue();
        SeasonInfoVo seasonInfoVo = (SeasonInfoVo) objArr[4];
        Object obj = objArr[5];
        if (obj == null) {
            c7 = ' ';
        }
        String str = (String) obj;
        Object obj2 = objArr[6];
        int i7 = c7;
        if (obj2 == null) {
            i7 = c7 | '@';
        }
        String str2 = (String) obj2;
        String str3 = (i7 & 32) != 0 ? null : str;
        if ((i7 & 64) != 0) {
            str2 = null;
        }
        return new EpisodeInfoVo(jLongValue, jLongValue2, jLongValue3, iIntValue, seasonInfoVo, str3, str2);
    }

    public final Object get(Object obj, int i7) {
        EpisodeInfoVo episodeInfoVo = (EpisodeInfoVo) obj;
        switch (i7) {
            case 0:
                return Long.valueOf(episodeInfoVo.a());
            case 1:
                return Long.valueOf(episodeInfoVo.f73209b);
            case 2:
                return Long.valueOf(episodeInfoVo.f73210c);
            case 3:
                return Integer.valueOf(episodeInfoVo.b());
            case 4:
                return episodeInfoVo.d();
            case 5:
                return episodeInfoVo.f73213f;
            case 6:
                return episodeInfoVo.c();
            default:
                return null;
        }
    }
}
