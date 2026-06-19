package com.bilibili.playerbizcommon.features.ai;

import dq0.InterfaceC6831b;
import javax.inject.Named;
import javax.inject.Singleton;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/ai/a.class */
@Singleton
@Named("player_ai_translation_store")
public final class a implements InterfaceC6831b {
    @Override // dq0.InterfaceC6831b
    @Nullable
    public final String a() {
        PlayerMultiLangStore.f79562a.getClass();
        return PlayerMultiLangStore.h;
    }
}
