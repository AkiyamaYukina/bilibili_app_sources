package com.bilibili.playset.widget.favorite;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/widget/favorite/PlaySeason_JsonDescriptor.class */
public final class PlaySeason_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f85732a = {new PojoPropertyDescriptor("id", (String[]) null, Long.TYPE, (Class) null, 5), new PojoPropertyDescriptor("name", (String[]) null, String.class, (Class) null, 5)};

    public PlaySeason_JsonDescriptor() {
        super(PlaySeason.class, f85732a);
    }

    public final Object constructWith(Object[] objArr) {
        Long l7 = (Long) objArr[0];
        return new PlaySeason(l7 == null ? 0L : l7.longValue(), (String) objArr[1]);
    }

    public final Object get(Object obj, int i7) {
        PlaySeason playSeason = (PlaySeason) obj;
        if (i7 == 0) {
            return Long.valueOf(playSeason.getId());
        }
        if (i7 != 1) {
            return null;
        }
        return playSeason.getName();
    }
}
