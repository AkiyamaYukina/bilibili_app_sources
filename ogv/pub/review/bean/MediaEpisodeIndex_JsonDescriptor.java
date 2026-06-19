package com.bilibili.ogv.pub.review.bean;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/review/bean/MediaEpisodeIndex_JsonDescriptor.class */
public final class MediaEpisodeIndex_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f71694a = {new PojoPropertyDescriptor("id", (String[]) null, Integer.TYPE, (Class) null, 1), new PojoPropertyDescriptor("index", (String[]) null, String.class, (Class) null, 0), new PojoPropertyDescriptor("index_show", (String[]) null, String.class, (Class) null, 4), new PojoPropertyDescriptor("play_index_show", (String[]) null, String.class, (Class) null, 4)};

    public MediaEpisodeIndex_JsonDescriptor() {
        super(MediaEpisodeIndex.class, f71694a);
    }

    public final Object constructWith(Object[] objArr) {
        int iIntValue = 0;
        Integer num = (Integer) objArr[0];
        if (num != null) {
            iIntValue = num.intValue();
        }
        return new MediaEpisodeIndex(iIntValue, (String) objArr[1], (String) objArr[2], (String) objArr[3]);
    }

    public final Object get(Object obj, int i7) {
        MediaEpisodeIndex mediaEpisodeIndex = (MediaEpisodeIndex) obj;
        if (i7 == 0) {
            return Integer.valueOf(mediaEpisodeIndex.f71690a);
        }
        if (i7 == 1) {
            return mediaEpisodeIndex.f71691b;
        }
        if (i7 == 2) {
            return mediaEpisodeIndex.a();
        }
        if (i7 != 3) {
            return null;
        }
        return mediaEpisodeIndex.b();
    }
}
