package com.bilibili.ship.theseus.playlist.api;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/api/FavoriteButtonStr_JsonDescriptor.class */
public final class FavoriteButtonStr_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f95202a = {new PojoPropertyDescriptor("select_ed", (String[]) null, String.class, (Class) null, 7), new PojoPropertyDescriptor("un_select", (String[]) null, String.class, (Class) null, 7)};

    public FavoriteButtonStr_JsonDescriptor() {
        super(FavoriteButtonStr.class, f95202a);
    }

    public final Object constructWith(Object[] objArr) {
        int i7 = 0;
        Object obj = objArr[0];
        if (obj == null) {
            i7 = 1;
        }
        String str = (String) obj;
        Object obj2 = objArr[1];
        int i8 = i7;
        if (obj2 == null) {
            i8 = i7 | 2;
        }
        return new FavoriteButtonStr(str, (String) obj2, i8);
    }

    public final Object get(Object obj, int i7) {
        FavoriteButtonStr favoriteButtonStr = (FavoriteButtonStr) obj;
        if (i7 == 0) {
            return favoriteButtonStr.a();
        }
        if (i7 != 1) {
            return null;
        }
        return favoriteButtonStr.b();
    }
}
