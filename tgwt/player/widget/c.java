package com.bilibili.tgwt.player.widget;

import com.bilibili.tgwt.service.ChatService;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/widget/c.class */
@DaggerGenerated
@QualifierMetadata
public final class c implements rW0.b<ChatVoiceModeEmoticonWidget> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yW0.a f111799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f111800b;

    public c(yW0.a aVar, b bVar) {
        this.f111799a = aVar;
        this.f111800b = bVar;
    }

    public final void injectMembers(Object obj) {
        ChatVoiceModeEmoticonWidget chatVoiceModeEmoticonWidget = (ChatVoiceModeEmoticonWidget) obj;
        chatVoiceModeEmoticonWidget.setChatService((ChatService) this.f111799a.get());
        chatVoiceModeEmoticonWidget.setChatVoiceModeEmoticonFunctionWidgetProvider(this.f111800b);
    }
}
