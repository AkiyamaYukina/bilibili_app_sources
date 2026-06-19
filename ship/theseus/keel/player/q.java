package com.bilibili.ship.theseus.keel.player;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.player.tangram.basic.WithVideoProgress;
import com.bilibili.player.tangram.basic.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/keel/player/q.class */
@StabilityInferred(parameters = 1)
public final class q<PiecePlayable extends WithVideoProgress & com.bilibili.player.tangram.basic.j> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f91140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f91141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f91142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f91143d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final PiecePlayable f91144e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final d f91145f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final c f91146g;
    public final int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f91147i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f91148j;

    public q(int i7, long j7, long j8, boolean z6, @NotNull PiecePlayable pieceplayable, @Nullable d dVar, @NotNull c cVar, int i8, long j9, long j10) {
        this.f91140a = i7;
        this.f91141b = j7;
        this.f91142c = j8;
        this.f91143d = z6;
        this.f91144e = pieceplayable;
        this.f91145f = dVar;
        this.f91146g = cVar;
        this.h = i8;
        this.f91147i = j9;
        this.f91148j = j10;
    }
}
