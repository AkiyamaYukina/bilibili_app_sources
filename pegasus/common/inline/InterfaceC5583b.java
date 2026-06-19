package com.bilibili.pegasus.common.inline;

import com.bilibili.pegasus.data.base.BasePegasusPlayerData;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.pegasus.common.inline.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/common/inline/b.class */
public interface InterfaceC5583b<T extends BasePegasusPlayerData> {
    boolean S();

    void a(boolean z6);

    void c(long j7, boolean z6);

    boolean d();

    @Nullable
    T getData();

    float getPlaySpeed();

    int getPlayerState();

    boolean isFavorite();

    void setPlaySpeed(float f7);

    long w();
}
