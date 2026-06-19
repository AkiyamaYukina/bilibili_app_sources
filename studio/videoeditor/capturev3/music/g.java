package com.bilibili.studio.videoeditor.capturev3.music;

import AB0.a;
import android.content.Intent;
import com.bilibili.studio.videoeditor.capturev3.fragment.IndependentCaptureFragment;
import com.bilibili.studio.videoeditor.capturev3.music.bean.MusicInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/music/g.class */
public interface g<T extends AB0.a> {
    void a();

    void b();

    void c(@Nullable Intent intent);

    void d();

    @NotNull
    T e();

    void f(int i7, boolean z6);

    void g(@Nullable MusicInfo musicInfo);

    void h(@NotNull IndependentCaptureFragment independentCaptureFragment);

    void release();

    void seekTo(long j7);

    void setPlaySpeed(float f7);
}
