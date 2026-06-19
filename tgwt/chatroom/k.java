package com.bilibili.tgwt.chatroom;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ogvvega.tunnel.TargetPath;
import com.bilibili.ogvvega.tunnel.VegaManager;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/chatroom/k.class */
@StabilityInferred(parameters = 0)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Map<Long, TargetPath> f111002a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Map<Long, h> f111003b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ReentrantLock f111004c = new ReentrantLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ReentrantLock f111005d = new ReentrantLock();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Map<Long, Set<Long>> f111006e = new LinkedHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Map<Long, String> f111007f = new LinkedHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final n f111008g = new Object();

    @NotNull
    public final VegaManager h = new VegaManager();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public volatile m f111009i;
}
