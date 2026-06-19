package com.bilibili.ogv.operation.entrance.filmlist;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/entrance/filmlist/OGVFilmListPage_JsonDescriptor.class */
public final class OGVFilmListPage_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f70026a;

    static {
        Class cls = Integer.TYPE;
        f70026a = new PojoPropertyDescriptor[]{new PojoPropertyDescriptor("id", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("bg_cover", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("cover", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("watched_text", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("percent", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("seasons", (String[]) null, Types.parameterizedType(List.class, new Type[]{OGVFilmListPageItem.class}), (Class) null, 21), new PojoPropertyDescriptor("is_favorite", (String[]) null, Boolean.TYPE, (Class) null, 5), new PojoPropertyDescriptor("share_url", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("share_subtitle", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("square_url", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("topic_link", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("upInfo", (String[]) null, FilmListUpInfo.class, (Class) null, 4), new PojoPropertyDescriptor("report", (String[]) null, Types.parameterizedType(Map.class, new Type[]{String.class, String.class}), (Class) null, 5)};
    }

    public OGVFilmListPage_JsonDescriptor() {
        super(OGVFilmListPage.class, f70026a);
    }

    public final Object constructWith(Object[] objArr) {
        boolean zBooleanValue = false;
        Integer num = (Integer) objArr[0];
        int iIntValue = num == null ? 0 : num.intValue();
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        String str3 = (String) objArr[3];
        String str4 = (String) objArr[4];
        Integer num2 = (Integer) objArr[5];
        int iIntValue2 = num2 == null ? 0 : num2.intValue();
        List list = (List) objArr[6];
        Boolean bool = (Boolean) objArr[7];
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return new OGVFilmListPage(iIntValue, str, str2, str3, str4, iIntValue2, list, zBooleanValue, (String) objArr[8], (String) objArr[9], (String) objArr[10], (String) objArr[11], (FilmListUpInfo) objArr[12], (Map) objArr[13]);
    }

    public final Object get(Object obj, int i7) {
        OGVFilmListPage oGVFilmListPage = (OGVFilmListPage) obj;
        switch (i7) {
            case 0:
                return Integer.valueOf(oGVFilmListPage.f70000a);
            case 1:
                return oGVFilmListPage.f70001b;
            case 2:
                return oGVFilmListPage.f70002c;
            case 3:
                return oGVFilmListPage.f70003d;
            case 4:
                return oGVFilmListPage.f70004e;
            case 5:
                return Integer.valueOf(oGVFilmListPage.f70005f);
            case 6:
                return oGVFilmListPage.f70006g;
            case 7:
                return Boolean.valueOf(oGVFilmListPage.h);
            case 8:
                return oGVFilmListPage.f70007i;
            case 9:
                return oGVFilmListPage.f70008j;
            case 10:
                return oGVFilmListPage.f70009k;
            case 11:
                return oGVFilmListPage.f70010l;
            case 12:
                return oGVFilmListPage.a();
            case 13:
                return oGVFilmListPage.f70012n;
            default:
                return null;
        }
    }
}
