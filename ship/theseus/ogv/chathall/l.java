package com.bilibili.ship.theseus.ogv.chathall;

import android.net.Uri;
import com.bilibili.chatroomsdk.ChatRoomMember;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/chathall/l.class */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f91782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ChatHallService f91783b;

    public l(ChatHallService chatHallService, CoroutineScope coroutineScope) {
        this.f91782a = coroutineScope;
        this.f91783b = chatHallService;
    }

    public final void a(ChatRoomMember chatRoomMember) {
        BuildersKt.launch$default(this.f91782a, (CoroutineContext) null, (CoroutineStart) null, new ChatHallService$joinRoom$1$avatarClick$1(this.f91783b, chatRoomMember, null), 3, (Object) null);
    }

    public final void b(String str) {
        ChatHallService chatHallService = this.f91783b;
        chatHallService.f91709f.g();
        BuildersKt.launch$default(this.f91782a, (CoroutineContext) null, (CoroutineStart) null, new ChatHallService$joinRoom$1$imageNoticeClick$1(chatHallService, com.bilibili.ship.theseus.ogv.web.b.a(chatHallService.f91710g, str, !Intrinsics.areEqual(Uri.parse(str).getQueryParameter("openstyle"), "1"), false, null, 12), null), 3, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(java.lang.String r8, kotlin.jvm.functions.Function2 r9) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.chathall.l.c(java.lang.String, kotlin.jvm.functions.Function2):boolean");
    }
}
