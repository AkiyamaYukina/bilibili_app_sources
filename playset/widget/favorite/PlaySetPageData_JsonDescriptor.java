package com.bilibili.playset.widget.favorite;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/widget/favorite/PlaySetPageData_JsonDescriptor.class */
public final class PlaySetPageData_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f85733a = {new PojoPropertyDescriptor("count", (String[]) null, Integer.TYPE, (Class) null, 5), new PojoPropertyDescriptor("list", (String[]) null, Types.parameterizedType(List.class, new Type[]{PlaySet.class}), (Class) null, 20), new PojoPropertyDescriptor("season", (String[]) null, PlaySeason.class, (Class) null, 4), new PojoPropertyDescriptor("has_more", (String[]) null, Boolean.TYPE, (Class) null, 5)};

    public PlaySetPageData_JsonDescriptor() {
        super(PlaySetPageData.class, f85733a);
    }

    public final Object constructWith(Object[] objArr) {
        boolean zBooleanValue = false;
        Integer num = (Integer) objArr[0];
        int iIntValue = num == null ? 0 : num.intValue();
        List list = (List) objArr[1];
        PlaySeason playSeason = (PlaySeason) objArr[2];
        Boolean bool = (Boolean) objArr[3];
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return new PlaySetPageData(iIntValue, list, playSeason, zBooleanValue);
    }

    public final Object get(Object obj, int i7) {
        PlaySetPageData playSetPageData = (PlaySetPageData) obj;
        if (i7 == 0) {
            return Integer.valueOf(playSetPageData.getTotalCount());
        }
        if (i7 == 1) {
            return playSetPageData.getList();
        }
        if (i7 == 2) {
            return playSetPageData.getSeason();
        }
        if (i7 != 3) {
            return null;
        }
        return Boolean.valueOf(playSetPageData.getHasMore());
    }
}
