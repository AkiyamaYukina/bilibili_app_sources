package com.bilibili.tgwt.chatroom;

import androidx.core.app.NotificationCompat;
import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.chatroomsdk.ChatRoomMember;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/chatroom/ChatRoomFullInfo_JsonDescriptor.class */
public final class ChatRoomFullInfo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f110886a;

    static {
        Class cls = Long.TYPE;
        PojoPropertyDescriptor pojoPropertyDescriptor = new PojoPropertyDescriptor("room_id", (String[]) null, cls, (Class) null, 5);
        PojoPropertyDescriptor pojoPropertyDescriptor2 = new PojoPropertyDescriptor("oid", (String[]) null, cls, (Class) null, 5);
        PojoPropertyDescriptor pojoPropertyDescriptor3 = new PojoPropertyDescriptor("sub_id", (String[]) null, cls, (Class) null, 5);
        Class cls2 = Integer.TYPE;
        f110886a = new PojoPropertyDescriptor[]{pojoPropertyDescriptor, pojoPropertyDescriptor2, pojoPropertyDescriptor3, new PojoPropertyDescriptor("is_open", (String[]) null, cls2, (Class) null, 5), new PojoPropertyDescriptor(EditCustomizeSticker.TAG_MID, (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("members", (String[]) null, Types.parameterizedType(List.class, new Type[]{ChatRoomMember.class}), (Class) null, 21), new PojoPropertyDescriptor("limit_count", (String[]) null, cls2, (Class) null, 5), new PojoPropertyDescriptor("member_count", (String[]) null, cls2, (Class) null, 5), new PojoPropertyDescriptor("member_count_desc_v2", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("full_mc_desc", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("half_mc_desc", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("desc", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor(NotificationCompat.CATEGORY_STATUS, (String[]) null, ChatRoomStatus.class, (Class) null, 4)};
    }

    public ChatRoomFullInfo_JsonDescriptor() {
        super(ChatRoomFullInfo.class, f110886a);
    }

    public final Object constructWith(Object[] objArr) {
        int iIntValue = 0;
        Long l7 = (Long) objArr[0];
        long jLongValue = l7 == null ? 0L : l7.longValue();
        Long l8 = (Long) objArr[1];
        long jLongValue2 = l8 == null ? 0L : l8.longValue();
        Long l9 = (Long) objArr[2];
        long jLongValue3 = l9 == null ? 0L : l9.longValue();
        Integer num = (Integer) objArr[3];
        int iIntValue2 = num == null ? 0 : num.intValue();
        Long l10 = (Long) objArr[4];
        long jLongValue4 = l10 == null ? 0L : l10.longValue();
        List list = (List) objArr[5];
        Integer num2 = (Integer) objArr[6];
        int iIntValue3 = num2 == null ? 0 : num2.intValue();
        Integer num3 = (Integer) objArr[7];
        if (num3 != null) {
            iIntValue = num3.intValue();
        }
        return new ChatRoomFullInfo(jLongValue, jLongValue2, jLongValue3, iIntValue2, jLongValue4, list, iIntValue3, iIntValue, (String) objArr[8], (String) objArr[9], (String) objArr[10], (String) objArr[11], (String) objArr[12], (ChatRoomStatus) objArr[13]);
    }

    public final Object get(Object obj, int i7) {
        ChatRoomFullInfo chatRoomFullInfo = (ChatRoomFullInfo) obj;
        switch (i7) {
            case 0:
                return Long.valueOf(chatRoomFullInfo.e());
            case 1:
                return Long.valueOf(chatRoomFullInfo.l());
            case 2:
                return Long.valueOf(chatRoomFullInfo.b());
            case 3:
                return Integer.valueOf(chatRoomFullInfo.j());
            case 4:
                return Long.valueOf(chatRoomFullInfo.k());
            case 5:
                return chatRoomFullInfo.i();
            case 6:
                return Integer.valueOf(chatRoomFullInfo.f());
            case 7:
                return Integer.valueOf(chatRoomFullInfo.g());
            case 8:
                return chatRoomFullInfo.h();
            case 9:
                return chatRoomFullInfo.c();
            case 10:
                return chatRoomFullInfo.d();
            case 11:
                return chatRoomFullInfo.n();
            case 12:
                return chatRoomFullInfo.a();
            case 13:
                return chatRoomFullInfo.m();
            default:
                return null;
        }
    }
}
