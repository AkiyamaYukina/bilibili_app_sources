package com.bilibili.ogv.pub.community;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/community/MediaInfo_JsonDescriptor.class */
public final class MediaInfo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f71523a;

    static {
        Class cls = Long.TYPE;
        f71523a = new PojoPropertyDescriptor[]{new PojoPropertyDescriptor("season_id", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("media_type", (String[]) null, Integer.TYPE, (Class) null, 5), new PojoPropertyDescriptor("media_id", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("cover", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("season_title", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("type_name", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("areas", (String[]) null, Types.parameterizedType(List.class, new Type[]{Area.class}), (Class) null, 21), new PojoPropertyDescriptor("publish", (String[]) null, Publish.class, (Class) null, 5), new PojoPropertyDescriptor("media_badge_info", (String[]) null, BangumiBadgeInfo.class, (Class) null, 4), new PojoPropertyDescriptor("alias", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("origin_name", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("styles", (String[]) null, Types.parameterizedType(List.class, new Type[]{Style.class}), (Class) null, 21), new PojoPropertyDescriptor("celebrity", (String[]) null, Types.parameterizedType(List.class, new Type[]{Celebrity.class}), (Class) null, 21), new PojoPropertyDescriptor("actor", (String[]) null, Actor.class, (Class) null, 4), new PojoPropertyDescriptor("staff", (String[]) null, Staff.class, (Class) null, 4), new PojoPropertyDescriptor("evaluate", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("link_url", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("score", (String[]) null, Float.class, (Class) null, 4)};
    }

    public MediaInfo_JsonDescriptor() {
        super(MediaInfo.class, f71523a);
    }

    public final Object constructWith(Object[] objArr) {
        int iIntValue = 0;
        Long l7 = (Long) objArr[0];
        long jLongValue = l7 == null ? 0L : l7.longValue();
        Integer num = (Integer) objArr[1];
        if (num != null) {
            iIntValue = num.intValue();
        }
        Long l8 = (Long) objArr[2];
        return new MediaInfo(jLongValue, iIntValue, l8 == null ? 0L : l8.longValue(), (String) objArr[3], (String) objArr[4], (String) objArr[5], (List) objArr[6], (Publish) objArr[7], (BangumiBadgeInfo) objArr[8], (String) objArr[9], (String) objArr[10], (List) objArr[11], (List) objArr[12], (Actor) objArr[13], (Staff) objArr[14], (String) objArr[15], (String) objArr[16], (Float) objArr[17]);
    }

    public final Object get(Object obj, int i7) {
        MediaInfo mediaInfo = (MediaInfo) obj;
        switch (i7) {
            case 0:
                return Long.valueOf(mediaInfo.f71506a);
            case 1:
                return Integer.valueOf(mediaInfo.f71507b);
            case 2:
                return Long.valueOf(mediaInfo.f71508c);
            case 3:
                return mediaInfo.f71509d;
            case 4:
                return mediaInfo.f71510e;
            case 5:
                return mediaInfo.f71511f;
            case 6:
                return mediaInfo.f71512g;
            case 7:
                return mediaInfo.h;
            case 8:
                return mediaInfo.f71513i;
            case 9:
                return mediaInfo.f71514j;
            case 10:
                return mediaInfo.f71515k;
            case 11:
                return mediaInfo.f71516l;
            case 12:
                return mediaInfo.a();
            case 13:
                return mediaInfo.f71518n;
            case 14:
                return mediaInfo.f71519o;
            case 15:
                return mediaInfo.f71520p;
            case 16:
                return mediaInfo.f71521q;
            case 17:
                return mediaInfo.f71522r;
            default:
                return null;
        }
    }
}
