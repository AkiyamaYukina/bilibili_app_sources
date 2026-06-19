package com.bilibili.tgwt.chatroom;

import androidx.core.app.NotificationCompat;
import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/chatroom/ChatRoomState_JsonDescriptor.class */
public final class ChatRoomState_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f110946a;

    static {
        Class cls = Long.TYPE;
        PojoPropertyDescriptor pojoPropertyDescriptor = new PojoPropertyDescriptor("room_id", (String[]) null, cls, (Class) null, 5);
        Class cls2 = Integer.TYPE;
        f110946a = new PojoPropertyDescriptor[]{pojoPropertyDescriptor, new PojoPropertyDescriptor(NotificationCompat.CATEGORY_STATUS, (String[]) null, cls2, (Class) null, 5), new PojoPropertyDescriptor(NotificationCompat.CATEGORY_PROGRESS, (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("season_id", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("episode_id", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("init_sequence_id", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("latest_seq_id", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("enter_id", (String[]) null, String.class, (Class) null, 7), new PojoPropertyDescriptor("is_new", (String[]) null, cls2, (Class) null, 7), new PojoPropertyDescriptor("tip", (String[]) null, String.class, (Class) null, 7), new PojoPropertyDescriptor("report_time", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("room_mode", (String[]) null, cls2, (Class) null, 7)};
    }

    public ChatRoomState_JsonDescriptor() {
        super(ChatRoomState.class, f110946a);
    }

    public final Object constructWith(Object[] objArr) {
        Long l7 = (Long) objArr[0];
        long jLongValue = 0;
        long jLongValue2 = l7 == null ? 0L : l7.longValue();
        Integer num = (Integer) objArr[1];
        int iIntValue = num == null ? 0 : num.intValue();
        Long l8 = (Long) objArr[2];
        long jLongValue3 = l8 == null ? 0L : l8.longValue();
        Long l9 = (Long) objArr[3];
        long jLongValue4 = l9 == null ? 0L : l9.longValue();
        Long l10 = (Long) objArr[4];
        long jLongValue5 = l10 == null ? 0L : l10.longValue();
        Object obj = objArr[5];
        int i7 = obj == null ? 32 : 0;
        Long l11 = (Long) obj;
        long jLongValue6 = l11 == null ? 0L : l11.longValue();
        Object obj2 = objArr[6];
        int i8 = i7;
        if (obj2 == null) {
            i8 = i7 | 64;
        }
        Long l12 = (Long) obj2;
        long jLongValue7 = l12 == null ? 0L : l12.longValue();
        Object obj3 = objArr[7];
        int i9 = i8;
        if (obj3 == null) {
            i9 = i8 | 128;
        }
        String str = (String) obj3;
        Object obj4 = objArr[8];
        int i10 = i9;
        if (obj4 == null) {
            i10 = i9 | 256;
        }
        Integer num2 = (Integer) obj4;
        int iIntValue2 = num2 == null ? 0 : num2.intValue();
        Object obj5 = objArr[9];
        int i11 = i10;
        if (obj5 == null) {
            i11 = i10 | 512;
        }
        String str2 = (String) obj5;
        Object obj6 = objArr[10];
        int i12 = i11;
        if (obj6 == null) {
            i12 = i11 | 1024;
        }
        Long l13 = (Long) obj6;
        if (l13 != null) {
            jLongValue = l13.longValue();
        }
        Object obj7 = objArr[11];
        if (obj7 == null) {
            i12 |= 2048;
        }
        Integer num3 = (Integer) obj7;
        return new ChatRoomState(str, iIntValue, jLongValue2, iIntValue2, num3 == null ? 0 : num3.intValue(), jLongValue3, jLongValue4, jLongValue5, jLongValue6, str2, i12, jLongValue7, jLongValue);
    }

    public final Object get(Object obj, int i7) {
        ChatRoomState chatRoomState = (ChatRoomState) obj;
        switch (i7) {
            case 0:
                return Long.valueOf(chatRoomState.d());
            case 1:
                return Integer.valueOf(chatRoomState.k());
            case 2:
                return Long.valueOf(chatRoomState.g());
            case 3:
                return Long.valueOf(chatRoomState.j());
            case 4:
                return Long.valueOf(chatRoomState.c());
            case 5:
                return Long.valueOf(chatRoomState.f());
            case 6:
                return Long.valueOf(chatRoomState.e());
            case 7:
                return chatRoomState.b();
            case 8:
                return Integer.valueOf(chatRoomState.m());
            case 9:
                return chatRoomState.l();
            case 10:
                return Long.valueOf(chatRoomState.h());
            case 11:
                return Integer.valueOf(chatRoomState.i());
            default:
                return null;
        }
    }
}
