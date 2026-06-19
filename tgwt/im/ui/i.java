package com.bilibili.tgwt.im.ui;

import android.content.Context;
import com.bilibili.tgwt.service.ChatService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/i.class */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
public final class i implements Factory<ChatVoiceEmotionDialog> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yW0.c f111302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yW0.a f111303b;

    public i(yW0.c cVar, yW0.a aVar) {
        this.f111302a = cVar;
        this.f111303b = aVar;
    }

    public final Object get() {
        return new ChatVoiceEmotionDialog((Context) this.f111302a.a, (ChatService) this.f111303b.get());
    }
}
