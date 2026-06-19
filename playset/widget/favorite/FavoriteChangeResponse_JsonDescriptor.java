package com.bilibili.playset.widget.favorite;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/widget/favorite/FavoriteChangeResponse_JsonDescriptor.class */
public final class FavoriteChangeResponse_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f85682a = {new PojoPropertyDescriptor("prompt", (String[]) null, Boolean.TYPE, (Class) null, 5), new PojoPropertyDescriptor("toast_msg", (String[]) null, String.class, (Class) null, 5)};

    public FavoriteChangeResponse_JsonDescriptor() {
        super(FavoriteChangeResponse.class, f85682a);
    }

    public final Object constructWith(Object[] objArr) {
        boolean zBooleanValue = false;
        Boolean bool = (Boolean) objArr[0];
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return new FavoriteChangeResponse(zBooleanValue, (String) objArr[1]);
    }

    public final Object get(Object obj, int i7) {
        FavoriteChangeResponse favoriteChangeResponse = (FavoriteChangeResponse) obj;
        if (i7 == 0) {
            return Boolean.valueOf(favoriteChangeResponse.getPrompt());
        }
        if (i7 != 1) {
            return null;
        }
        return favoriteChangeResponse.getToastMsg();
    }
}
