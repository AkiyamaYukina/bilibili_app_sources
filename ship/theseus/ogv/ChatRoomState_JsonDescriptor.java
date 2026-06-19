package com.bilibili.ship.theseus.ogv;

import androidx.core.app.NotificationCompat;
import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/ChatRoomState_JsonDescriptor.class */
public final class ChatRoomState_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f91222a;

    static {
        Class cls = Long.TYPE;
        f91222a = new PojoPropertyDescriptor[]{new PojoPropertyDescriptor("room_id", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor(NotificationCompat.CATEGORY_STATUS, (String[]) null, Integer.TYPE, (Class) null, 5), new PojoPropertyDescriptor(NotificationCompat.CATEGORY_PROGRESS, (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("season_id", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("episode_id", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("init_sequence_id", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("enter_id", (String[]) null, String.class, (Class) null, 7), new PojoPropertyDescriptor("tip", (String[]) null, String.class, (Class) null, 7), new PojoPropertyDescriptor("report_time", (String[]) null, cls, (Class) null, 7)};
    }

    public ChatRoomState_JsonDescriptor() {
        super(ChatRoomState.class, f91222a);
    }

    public final Object constructWith(Object[] objArr) {
        int i7 = 0;
        Long l7 = (Long) objArr[0];
        long jLongValue = l7 == null ? 0L : l7.longValue();
        Integer num = (Integer) objArr[1];
        int iIntValue = num == null ? 0 : num.intValue();
        Long l8 = (Long) objArr[2];
        long jLongValue2 = l8 == null ? 0L : l8.longValue();
        Long l9 = (Long) objArr[3];
        long jLongValue3 = l9 == null ? 0L : l9.longValue();
        Long l10 = (Long) objArr[4];
        long jLongValue4 = l10 == null ? 0L : l10.longValue();
        Object obj = objArr[5];
        if (obj == null) {
            i7 = 32;
        }
        Long l11 = (Long) obj;
        long jLongValue5 = l11 == null ? 0L : l11.longValue();
        Object obj2 = objArr[6];
        int i8 = i7;
        if (obj2 == null) {
            i8 = i7 | 64;
        }
        String str = (String) obj2;
        Object obj3 = objArr[7];
        int i9 = i8;
        if (obj3 == null) {
            i9 = i8 | 128;
        }
        String str2 = (String) obj3;
        Object obj4 = objArr[8];
        int i10 = i9;
        if (obj4 == null) {
            i10 = i9 | 256;
        }
        Long l12 = (Long) obj4;
        return new ChatRoomState(jLongValue, iIntValue, jLongValue2, jLongValue3, jLongValue4, jLongValue5, str, str2, l12 == null ? 0L : l12.longValue(), i10);
    }

    public final Object get(Object obj, int i7) {
        ChatRoomState chatRoomState = (ChatRoomState) obj;
        switch (i7) {
            case 0:
                return Long.valueOf(chatRoomState.c());
            case 1:
                return Integer.valueOf(chatRoomState.h());
            case 2:
                return Long.valueOf(chatRoomState.e());
            case 3:
                return Long.valueOf(chatRoomState.g());
            case 4:
                return Long.valueOf(chatRoomState.b());
            case 5:
                return Long.valueOf(chatRoomState.d());
            case 6:
                return chatRoomState.a();
            case 7:
                return chatRoomState.i();
            case 8:
                return Long.valueOf(chatRoomState.f());
            default:
                return null;
        }
    }
}
