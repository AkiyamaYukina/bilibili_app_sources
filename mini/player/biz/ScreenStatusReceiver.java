package com.bilibili.mini.player.biz;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.compose.foundation.Q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.collection.Collections;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mini/player/biz/ScreenStatusReceiver.class */
public final class ScreenStatusReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f66033b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Collections.SafeIteratorList<ScreenStatusListener> f66034a = Q.b();

    public final void addOnScreenStatusListener(@NotNull ScreenStatusListener screenStatusListener) {
        this.f66034a.add(screenStatusListener);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, tv.danmaku.biliplayerv2.collection.Collections$IteratorAction] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, tv.danmaku.biliplayerv2.collection.Collections$IteratorAction] */
    @Override // android.content.BroadcastReceiver
    public void onReceive(@Nullable Context context, @Nullable Intent intent) {
        String action;
        if (context == null || intent == null || (action = intent.getAction()) == null) {
            return;
        }
        if (Intrinsics.areEqual(action, "android.intent.action.SCREEN_OFF")) {
            this.f66034a.forEach((Collections.IteratorAction) new Object());
        } else if (Intrinsics.areEqual(action, "android.intent.action.SCREEN_ON")) {
            this.f66034a.forEach((Collections.IteratorAction) new Object());
        }
    }

    public final void removeOnScreenStatusListener(@NotNull ScreenStatusListener screenStatusListener) {
        this.f66034a.remove(screenStatusListener);
    }
}
