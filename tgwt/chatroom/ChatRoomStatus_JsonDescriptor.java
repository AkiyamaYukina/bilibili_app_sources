package com.bilibili.tgwt.chatroom;

import androidx.core.app.NotificationCompat;
import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/chatroom/ChatRoomStatus_JsonDescriptor.class */
public final class ChatRoomStatus_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f110951a;

    static {
        Class cls = Integer.TYPE;
        f110951a = new PojoPropertyDescriptor[]{new PojoPropertyDescriptor(NotificationCompat.CATEGORY_STATUS, (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor(NotificationCompat.CATEGORY_PROGRESS, (String[]) null, Long.TYPE, (Class) null, 5), new PojoPropertyDescriptor("allow_auto_start", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("had_started", (String[]) null, cls, (Class) null, 5)};
    }

    public ChatRoomStatus_JsonDescriptor() {
        super(ChatRoomStatus.class, f110951a);
    }

    public final Object constructWith(Object[] objArr) {
        Integer num = (Integer) objArr[0];
        int iIntValue = num == null ? 0 : num.intValue();
        Long l7 = (Long) objArr[1];
        long jLongValue = l7 == null ? 0L : l7.longValue();
        Integer num2 = (Integer) objArr[2];
        int iIntValue2 = num2 == null ? 0 : num2.intValue();
        Integer num3 = (Integer) objArr[3];
        return new ChatRoomStatus(iIntValue, iIntValue2, num3 == null ? 0 : num3.intValue(), jLongValue);
    }

    public final Object get(Object obj, int i7) {
        ChatRoomStatus chatRoomStatus = (ChatRoomStatus) obj;
        if (i7 == 0) {
            return Integer.valueOf(chatRoomStatus.d());
        }
        if (i7 == 1) {
            return Long.valueOf(chatRoomStatus.c());
        }
        if (i7 == 2) {
            return Integer.valueOf(chatRoomStatus.a());
        }
        if (i7 != 3) {
            return null;
        }
        return Integer.valueOf(chatRoomStatus.b());
    }
}
