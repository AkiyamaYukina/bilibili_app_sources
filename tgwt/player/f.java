package com.bilibili.tgwt.player;

import android.content.Context;
import android.os.Bundle;
import androidx.activity.OnBackPressedDispatcher;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import tv.danmaku.biliplayerv2.IPlayerContainer;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.PlayerParamsV2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/f.class */
@ScopeMetadata("com.bilibili.bangumi.player.commonplayer.utils.di.BangumiScope")
@DaggerGenerated
@QualifierMetadata
public final class f implements Factory<PlayerContainer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yW0.c f111546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yW0.b f111547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yW0.c f111548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yW0.c f111549d;

    public f(yW0.c cVar, yW0.b bVar, yW0.c cVar2, yW0.c cVar3) {
        this.f111546a = cVar;
        this.f111547b = bVar;
        this.f111548c = cVar2;
        this.f111549d = cVar3;
    }

    public final Object get() {
        Context context = (Context) this.f111546a.a;
        PlayerParamsV2 playerParamsV2 = (PlayerParamsV2) this.f111547b.get();
        OnBackPressedDispatcher onBackPressedDispatcher = (OnBackPressedDispatcher) this.f111548c.a;
        CoroutineScope coroutineScope = (CoroutineScope) this.f111549d.a;
        PlayerContainer playerContainerBuild = new IPlayerContainer.Builder().setContext(context).setPlayerParams(playerParamsV2).setControlContainerConfig(MapsKt.emptyMap()).build();
        playerContainerBuild.onCreate((Bundle) null);
        PlayerContainer playerContainer = playerContainerBuild;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new PlayerContainerModule$providePlayerContainer$1(playerContainer, onBackPressedDispatcher, null), 3, (Object) null);
        return (PlayerContainer) Preconditions.checkNotNullFromProvides(playerContainer);
    }
}
