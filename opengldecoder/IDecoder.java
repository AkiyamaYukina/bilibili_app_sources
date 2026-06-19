package com.bilibili.opengldecoder;

import android.content.Context;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opengldecoder/IDecoder.class */
public interface IDecoder {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opengldecoder/IDecoder$OnDecoderPreparedListener.class */
    public interface OnDecoderPreparedListener {
        void onDecoderPrepared(IMediaPlayer iMediaPlayer);
    }

    void backToStart();

    long getCurrentPosition();

    long getDuration();

    float getSpeed();

    Point getVideoSize();

    void init(Context context, SurfaceTexture surfaceTexture, SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener);

    void pause();

    void release();

    void reset();

    void seekTo(long j7);

    void setDataSource(String str, int i7);

    void setDecoderPrepared(OnDecoderPreparedListener onDecoderPreparedListener);

    void setInfoListener(IMediaPlayer.OnInfoListener onInfoListener);

    void setLoop(boolean z6);

    void setOnCompletionListener(IMediaPlayer.OnCompletionListener onCompletionListener);

    void setOnPreparedListener(IMediaPlayer.OnPreparedListener onPreparedListener);

    void setOnSeekCompleteListener(IMediaPlayer.OnSeekCompleteListener onSeekCompleteListener);

    void setOnVideoSizeChangedListener(IMediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener);

    void setSpeed(float f7);

    void setVolume(float f7, float f8);

    void start();
}
