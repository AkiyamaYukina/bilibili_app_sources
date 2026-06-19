package com.bilibili.ship.theseus.playlist.api;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.live.streaming.source.TextSource;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/api/Meta_JsonDescriptor.class */
public final class Meta_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f95212a = {new PojoPropertyDescriptor("quality", (String[]) null, Integer.TYPE, (Class) null, 7), new PojoPropertyDescriptor(TextSource.CFG_SIZE, (String[]) null, Long.TYPE, (Class) null, 7)};

    public Meta_JsonDescriptor() {
        super(Meta.class, f95212a);
    }

    public final Object constructWith(Object[] objArr) {
        int iIntValue = 0;
        Object obj = objArr[0];
        int i7 = obj == null ? 1 : 0;
        Integer num = (Integer) obj;
        if (num != null) {
            iIntValue = num.intValue();
        }
        Object obj2 = objArr[1];
        int i8 = i7;
        if (obj2 == null) {
            i8 = i7 | 2;
        }
        Long l7 = (Long) obj2;
        return new Meta(iIntValue, l7 == null ? 0L : l7.longValue(), i8);
    }

    public final Object get(Object obj, int i7) {
        Meta meta = (Meta) obj;
        if (i7 == 0) {
            return Integer.valueOf(meta.f95210a);
        }
        if (i7 != 1) {
            return null;
        }
        return Long.valueOf(meta.f95211b);
    }
}
