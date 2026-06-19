package com.bilibili.tgwt.player.widget;

import android.content.Context;
import com.bilibili.tgwt.service.ChatService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/widget/b.class */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
public final class b implements Factory<ChatVoiceModeEmoticonFunctionWidget> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yW0.c f111797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yW0.a f111798b;

    public b(yW0.c cVar, yW0.a aVar) {
        this.f111797a = cVar;
        this.f111798b = aVar;
    }

    public final Object get() {
        return new ChatVoiceModeEmoticonFunctionWidget((Context) this.f111797a.a, (ChatService) this.f111798b.get());
    }
}
