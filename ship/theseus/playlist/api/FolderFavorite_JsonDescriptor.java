package com.bilibili.ship.theseus.playlist.api;

import com.bilibili.biligame.api.bean.gamedetail.GameDetailContent;
import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/api/FolderFavorite_JsonDescriptor.class */
public final class FolderFavorite_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f95205a = {new PojoPropertyDescriptor(GameDetailContent.DetailInfo.UI_TYPE_JUMP_LINK, (String[]) null, String.class, (Class) null, 7), new PojoPropertyDescriptor("toast_msg", (String[]) null, String.class, (Class) null, 7)};

    public FolderFavorite_JsonDescriptor() {
        super(FolderFavorite.class, f95205a);
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
        return new FolderFavorite(str, (String) obj2, i8);
    }

    public final Object get(Object obj, int i7) {
        FolderFavorite folderFavorite = (FolderFavorite) obj;
        if (i7 == 0) {
            return folderFavorite.f95203a;
        }
        if (i7 != 1) {
            return null;
        }
        return folderFavorite.f95204b;
    }
}
