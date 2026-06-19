package com.bilibili.studio.upper.service;

import com.bapis.bilibili.broadcast.message.archive.VideoDataReply;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/upper/service/d.class */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f108690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public c f108691b;

    public d(long j7) {
        this.f108690a = j7;
    }

    public abstract void a();

    public abstract void b(@NotNull VideoDataReply videoDataReply);
}
