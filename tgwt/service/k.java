package com.bilibili.tgwt.service;

import com.bilibili.chatroom.vo.ChatMessageVo;
import com.bilibili.lib.fileupload.bean.FileUploadInfo;
import com.bilibili.okretro.call.json.JsonUtilKt;
import java.util.Map;
import kotlin.coroutines.CoroutineContext;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/service/k.class */
public final class k extends M90.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChatService f111971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f111972b;

    public k(ChatService chatService, int i7) {
        this.f111971a = chatService;
        this.f111972b = i7;
    }

    public final void onSuccess(FileUploadInfo fileUploadInfo, String str) {
        super.onSuccess(fileUploadInfo, str);
        ChatService chatService = this.f111971a;
        Long roomId = chatService.f111886e.getImmutable().getRoomId();
        if (roomId != null) {
            BuildersKt.launch$default(chatService.f111896o, (CoroutineContext) null, (CoroutineStart) null, new ChatService$sendVoiceMsg$1(chatService, roomId.longValue(), JsonUtilKt.toJson(new ChatMessageVo((String) null, (Map) null, (String) null, (String) null, (String) null, (String) null, (String) null, str, RangesKt.coerceAtMost(this.f111972b, 60), 0L, 639)), null), 3, (Object) null);
        }
    }
}
