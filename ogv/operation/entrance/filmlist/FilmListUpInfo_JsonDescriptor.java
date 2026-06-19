package com.bilibili.ogv.operation.entrance.filmlist;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/entrance/filmlist/FilmListUpInfo_JsonDescriptor.class */
public final class FilmListUpInfo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f69987a = {new PojoPropertyDescriptor(EditCustomizeSticker.TAG_MID, (String[]) null, Long.TYPE, (Class) null, 5), new PojoPropertyDescriptor("uname", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("avatar", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("is_follow", (String[]) null, Boolean.TYPE, (Class) null, 5)};

    public FilmListUpInfo_JsonDescriptor() {
        super(FilmListUpInfo.class, f69987a);
    }

    public final Object constructWith(Object[] objArr) {
        Long l7 = (Long) objArr[0];
        long jLongValue = l7 == null ? 0L : l7.longValue();
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        Boolean bool = (Boolean) objArr[3];
        return new FilmListUpInfo(jLongValue, str, str2, bool == null ? false : bool.booleanValue());
    }

    public final Object get(Object obj, int i7) {
        FilmListUpInfo filmListUpInfo = (FilmListUpInfo) obj;
        if (i7 == 0) {
            return Long.valueOf(filmListUpInfo.f69983a);
        }
        if (i7 == 1) {
            return filmListUpInfo.f69984b;
        }
        if (i7 == 2) {
            return filmListUpInfo.f69985c;
        }
        if (i7 != 3) {
            return null;
        }
        return Boolean.valueOf(filmListUpInfo.f69986d);
    }
}
