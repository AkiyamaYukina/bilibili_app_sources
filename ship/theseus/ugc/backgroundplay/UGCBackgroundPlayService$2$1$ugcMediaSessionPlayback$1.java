package com.bilibili.ship.theseus.ugc.backgroundplay;

import Lq0.b;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import com.bilibili.playerbizcommon.features.background.a;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/backgroundplay/UGCBackgroundPlayService$2$1$ugcMediaSessionPlayback$1.class */
public final class UGCBackgroundPlayService$2$1$ugcMediaSessionPlayback$1 implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f96318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f96319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UGCBackgroundPlayService f96320c;

    public UGCBackgroundPlayService$2$1$ugcMediaSessionPlayback$1(b bVar, UGCBackgroundPlayService uGCBackgroundPlayService) {
        this.f96319b = bVar;
        this.f96320c = uGCBackgroundPlayService;
        this.f96318a = bVar;
    }

    @Override // Lq0.b
    public final boolean a() {
        return this.f96318a.a();
    }

    @Override // Lq0.b
    public final boolean b() {
        return this.f96318a.b();
    }

    @Override // Lq0.b
    public final void c(String str, Bundle bundle) {
        boolean zAreEqual = Intrinsics.areEqual(str, "com.bilibili.player.music.notification.like");
        UGCBackgroundPlayService uGCBackgroundPlayService = this.f96320c;
        if (zAreEqual) {
            UGCBackgroundPlayService.a(uGCBackgroundPlayService, uGCBackgroundPlayService.f96306e.j() ? "2" : "1");
            BuildersKt.launch$default(uGCBackgroundPlayService.f96302a, (CoroutineContext) null, (CoroutineStart) null, new UGCBackgroundPlayService$2$1$ugcMediaSessionPlayback$1$onCustomAction$1(uGCBackgroundPlayService, null), 3, (Object) null);
        } else if (Intrinsics.areEqual(str, "com.bilibili.player.music.notification.favorite")) {
            UGCBackgroundPlayService.a(uGCBackgroundPlayService, uGCBackgroundPlayService.f96306e.i() ? "9" : "8");
            BuildersKt.launch$default(uGCBackgroundPlayService.f96302a, (CoroutineContext) null, (CoroutineStart) null, new UGCBackgroundPlayService$2$1$ugcMediaSessionPlayback$1$onCustomAction$2(uGCBackgroundPlayService, null), 3, (Object) null);
        } else {
            this.f96319b.c(str, bundle);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // Lq0.b
    public final void d() {
        this.f96318a.d();
    }

    @Override // Lq0.b
    public final void e() {
        this.f96318a.e();
    }

    @Override // Lq0.b
    public final boolean enableLike() {
        return this.f96318a.enableLike();
    }

    @Override // Lq0.b
    public final void f(MediaSessionCompat mediaSessionCompat) {
        this.f96318a.f(mediaSessionCompat);
    }

    @Override // Lq0.b
    public final void g(MediaSessionCompat mediaSessionCompat, int i7) {
        this.f96318a.g(mediaSessionCompat, i7);
    }

    @Override // Lq0.b
    public final boolean getLikeState() {
        return this.f96318a.getLikeState();
    }

    @Override // Lq0.b
    public final void h(a aVar) {
        this.f96318a.h(aVar);
    }

    @Override // Lq0.b
    public final void i() {
        this.f96318a.i();
    }

    @Override // Lq0.b
    public final void j() {
        this.f96318a.j();
    }

    @Override // Lq0.b
    public final a k() {
        return this.f96318a.k();
    }

    @Override // Lq0.b
    public final void l(MediaSessionCompat mediaSessionCompat) {
        this.f96318a.l(mediaSessionCompat);
    }

    @Override // Lq0.b
    public final void m(long j7) {
        this.f96318a.m(j7);
    }

    @Override // Lq0.b
    public final void onPause() {
        this.f96318a.onPause();
    }

    @Override // Lq0.b
    public final void onPlay() {
        this.f96318a.onPlay();
    }

    @Override // Lq0.b
    public final void onRelease() {
        this.f96318a.onRelease();
    }

    @Override // Lq0.b
    public final void onStop() {
        this.f96318a.onStop();
    }
}
