package com.bilibili.mini.player.biz;

import android.os.Bundle;
import androidx.annotation.MainThread;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sh0.InterfaceC8593b;
import tv.danmaku.biliplayerv2.service.Video;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mini/player/biz/d.class */
public interface d {
    static /* synthetic */ void d(d dVar, int i7, int i8, boolean z6, int i9, int i10) {
        if ((i10 & 1) != 0) {
            i7 = -1;
        }
        if ((i10 & 2) != 0) {
            i8 = 4;
        }
        if ((i10 & 16) != 0) {
            i9 = 0;
        }
        dVar.c(i7, i8, i9, z6, false);
    }

    @MainThread
    @NotNull
    Bundle b();

    @MainThread
    void c(int i7, int i8, int i9, boolean z6, boolean z7);

    @MainThread
    void e();

    @MainThread
    void f(@NotNull Class<? extends Video.PlayableParams> cls, @NotNull InterfaceC8593b interfaceC8593b);

    @MainThread
    void g(@NotNull List<? extends Video.PlayableParams> list);

    @MainThread
    void h(@Nullable Integer num);

    @MainThread
    void i(@NotNull Bundle bundle);
}
