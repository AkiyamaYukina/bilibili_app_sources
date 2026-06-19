package com.bilibili.ship.theseus.ogv.chathall.bean;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/chathall/bean/ChatHallInfo_JsonDescriptor.class */
public final class ChatHallInfo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f91744a = {new PojoPropertyDescriptor("room_id", (String[]) null, Long.TYPE, (Class) null, 5), new PojoPropertyDescriptor("back_img", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("tag_desc", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("desc_tip", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("desc_link", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("pendant", (String[]) null, RoomPendant.class, (Class) null, 0)};

    public ChatHallInfo_JsonDescriptor() {
        super(ChatHallInfo.class, f91744a);
    }

    public final Object constructWith(Object[] objArr) {
        Long l7 = (Long) objArr[0];
        return new ChatHallInfo(l7 == null ? 0L : l7.longValue(), (String) objArr[1], (String) objArr[2], (String) objArr[3], (String) objArr[4], (RoomPendant) objArr[5]);
    }

    public final Object get(Object obj, int i7) {
        ChatHallInfo chatHallInfo = (ChatHallInfo) obj;
        if (i7 == 0) {
            return Long.valueOf(chatHallInfo.d());
        }
        if (i7 == 1) {
            return chatHallInfo.c();
        }
        if (i7 == 2) {
            return chatHallInfo.e();
        }
        if (i7 == 3) {
            return chatHallInfo.b();
        }
        if (i7 == 4) {
            return chatHallInfo.a();
        }
        if (i7 != 5) {
            return null;
        }
        return chatHallInfo.f91743f;
    }
}
