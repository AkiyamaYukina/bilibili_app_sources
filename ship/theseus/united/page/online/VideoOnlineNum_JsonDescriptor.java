package com.bilibili.ship.theseus.united.page.online;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/online/VideoOnlineNum_JsonDescriptor.class */
public final class VideoOnlineNum_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f102107a = {new PojoPropertyDescriptor("online_show", (String[]) null, Boolean.TYPE, (Class) null, 7)};

    public VideoOnlineNum_JsonDescriptor() {
        super(VideoOnlineNum.class, f102107a);
    }

    public final Object constructWith(Object[] objArr) {
        boolean zBooleanValue = false;
        Object obj = objArr[0];
        int i7 = obj == null ? 1 : 0;
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return new VideoOnlineNum(zBooleanValue, i7);
    }

    public final Object get(Object obj, int i7) {
        VideoOnlineNum videoOnlineNum = (VideoOnlineNum) obj;
        if (i7 != 0) {
            return null;
        }
        return Boolean.valueOf(videoOnlineNum.a());
    }
}
