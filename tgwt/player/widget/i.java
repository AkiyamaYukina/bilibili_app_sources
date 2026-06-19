package com.bilibili.tgwt.player.widget;

import android.content.Context;
import com.bilibili.bangumi.logic.page.detail.service.BangumiPlayerContainerService;
import com.bilibili.tgwt.chatroom.ChatRoomManagerService;
import com.bilibili.tgwt.service.ChatService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/widget/i.class */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
public final class i implements Factory<PlayerChatPopupLayer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yW0.c f111824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yW0.b f111825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yW0.a f111826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yW0.b f111827d;

    public i(yW0.a aVar, yW0.b bVar, yW0.b bVar2, yW0.c cVar) {
        this.f111824a = cVar;
        this.f111825b = bVar;
        this.f111826c = aVar;
        this.f111827d = bVar2;
    }

    public final Object get() {
        return new PlayerChatPopupLayer((Context) this.f111824a.a, (BangumiPlayerContainerService) this.f111825b.get(), (ChatService) this.f111826c.get(), (ChatRoomManagerService) this.f111827d.get());
    }
}
