package com.bilibili.tgwt.chatroom;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.chatroomsdk.ChatMsg;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/chatroom/ChatGuestPureEnjoyMsgInfo_JsonDescriptor.class */
public final class ChatGuestPureEnjoyMsgInfo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f110872a = {new PojoPropertyDescriptor("has_next", (String[]) null, Boolean.TYPE, (Class) null, 5), new PojoPropertyDescriptor("next_seq_id", (String[]) null, Long.TYPE, (Class) null, 5), new PojoPropertyDescriptor("msg_list", (String[]) null, Types.parameterizedType(List.class, new Type[]{ChatMsg.class}), (Class) null, 21)};

    public ChatGuestPureEnjoyMsgInfo_JsonDescriptor() {
        super(ChatGuestPureEnjoyMsgInfo.class, f110872a);
    }

    public final Object constructWith(Object[] objArr) {
        boolean zBooleanValue = false;
        Boolean bool = (Boolean) objArr[0];
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        Long l7 = (Long) objArr[1];
        return new ChatGuestPureEnjoyMsgInfo(l7 == null ? 0L : l7.longValue(), zBooleanValue, (List) objArr[2]);
    }

    public final Object get(Object obj, int i7) {
        ChatGuestPureEnjoyMsgInfo chatGuestPureEnjoyMsgInfo = (ChatGuestPureEnjoyMsgInfo) obj;
        if (i7 == 0) {
            return Boolean.valueOf(chatGuestPureEnjoyMsgInfo.f110869a);
        }
        if (i7 == 1) {
            return Long.valueOf(chatGuestPureEnjoyMsgInfo.f110870b);
        }
        if (i7 != 2) {
            return null;
        }
        return chatGuestPureEnjoyMsgInfo.f110871c;
    }
}
