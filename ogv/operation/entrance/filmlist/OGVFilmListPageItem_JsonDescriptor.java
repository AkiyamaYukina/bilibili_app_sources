package com.bilibili.ogv.operation.entrance.filmlist;

import com.alipay.alipaysecuritysdk.common.config.Constant;
import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import java.lang.reflect.Type;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/entrance/filmlist/OGVFilmListPageItem_JsonDescriptor.class */
public final class OGVFilmListPageItem_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f70025a = {new PojoPropertyDescriptor("season_id", (String[]) null, Long.TYPE, (Class) null, 5), new PojoPropertyDescriptor("cover", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("link", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("styles", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("rank_label", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("celebrities", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("button_text", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("percent", (String[]) null, Integer.TYPE, (Class) null, 5), new PojoPropertyDescriptor("rating_score", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor(Constant.IN_KEY_REASON, (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("follow", (String[]) null, Boolean.TYPE, (Class) null, 5), new PojoPropertyDescriptor("report", (String[]) null, Types.parameterizedType(Map.class, new Type[]{String.class, String.class}), (Class) null, 5)};

    public OGVFilmListPageItem_JsonDescriptor() {
        super(OGVFilmListPageItem.class, f70025a);
    }

    public final Object constructWith(Object[] objArr) {
        boolean zBooleanValue = false;
        Long l7 = (Long) objArr[0];
        long jLongValue = l7 == null ? 0L : l7.longValue();
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        String str3 = (String) objArr[3];
        String str4 = (String) objArr[4];
        String str5 = (String) objArr[5];
        String str6 = (String) objArr[6];
        String str7 = (String) objArr[7];
        Integer num = (Integer) objArr[8];
        int iIntValue = num == null ? 0 : num.intValue();
        String str8 = (String) objArr[9];
        String str9 = (String) objArr[10];
        Boolean bool = (Boolean) objArr[11];
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return new OGVFilmListPageItem(jLongValue, str, str2, str3, str4, str5, str6, str7, iIntValue, str8, str9, zBooleanValue, (Map) objArr[12]);
    }

    public final Object get(Object obj, int i7) {
        OGVFilmListPageItem oGVFilmListPageItem = (OGVFilmListPageItem) obj;
        switch (i7) {
            case 0:
                return Long.valueOf(oGVFilmListPageItem.f70013a);
            case 1:
                return oGVFilmListPageItem.f70014b;
            case 2:
                return oGVFilmListPageItem.f70015c;
            case 3:
                return oGVFilmListPageItem.f70016d;
            case 4:
                return oGVFilmListPageItem.f70017e;
            case 5:
                return oGVFilmListPageItem.f70018f;
            case 6:
                return oGVFilmListPageItem.f70019g;
            case 7:
                return oGVFilmListPageItem.h;
            case 8:
                return Integer.valueOf(oGVFilmListPageItem.f70020i);
            case 9:
                return oGVFilmListPageItem.f70021j;
            case 10:
                return oGVFilmListPageItem.f70022k;
            case 11:
                return Boolean.valueOf(oGVFilmListPageItem.a());
            case 12:
                return oGVFilmListPageItem.f70024m;
            default:
                return null;
        }
    }
}
