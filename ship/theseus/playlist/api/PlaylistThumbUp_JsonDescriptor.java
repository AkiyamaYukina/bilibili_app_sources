package com.bilibili.ship.theseus.playlist.api;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/api/PlaylistThumbUp_JsonDescriptor.class */
public final class PlaylistThumbUp_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f95289a;

    static {
        Class cls = Integer.TYPE;
        f95289a = new PojoPropertyDescriptor[]{new PojoPropertyDescriptor("likes", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("dislikes", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("like_state", (String[]) null, cls, (Class) null, 7)};
    }

    public PlaylistThumbUp_JsonDescriptor() {
        super(PlaylistThumbUp.class, f95289a);
    }

    public final Object constructWith(Object[] objArr) {
        Object obj = objArr[0];
        int i7 = obj == null ? 1 : 0;
        Integer num = (Integer) obj;
        int iIntValue = num == null ? 0 : num.intValue();
        Object obj2 = objArr[1];
        int i8 = i7;
        if (obj2 == null) {
            i8 = i7 | 2;
        }
        Integer num2 = (Integer) obj2;
        int iIntValue2 = num2 == null ? 0 : num2.intValue();
        Object obj3 = objArr[2];
        int i9 = i8;
        if (obj3 == null) {
            i9 = i8 | 4;
        }
        Integer num3 = (Integer) obj3;
        return new PlaylistThumbUp(iIntValue, iIntValue2, num3 == null ? 0 : num3.intValue(), i9);
    }

    public final Object get(Object obj, int i7) {
        PlaylistThumbUp playlistThumbUp = (PlaylistThumbUp) obj;
        if (i7 == 0) {
            return Integer.valueOf(playlistThumbUp.f95286a);
        }
        if (i7 == 1) {
            return Integer.valueOf(playlistThumbUp.f95287b);
        }
        if (i7 != 2) {
            return null;
        }
        return Integer.valueOf(playlistThumbUp.f95288c);
    }
}
