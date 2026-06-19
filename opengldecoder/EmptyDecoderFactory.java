package com.bilibili.opengldecoder;

import android.content.Context;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import com.bilibili.opengldecoder.IDecoder;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opengldecoder/EmptyDecoderFactory.class */
public class EmptyDecoderFactory extends AbsDecoderFactory {
    @Override // com.bilibili.opengldecoder.AbsDecoderFactory
    public IDecoder build() {
        return new IDecoder(this) { // from class: com.bilibili.opengldecoder.EmptyDecoderFactory.1
            final EmptyDecoderFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // com.bilibili.opengldecoder.IDecoder
            public void backToStart() {
            }

            @Override // com.bilibili.opengldecoder.IDecoder
            public long getCurrentPosition() {
                return 0L;
            }

            @Override // com.bilibili.opengldecoder.IDecoder
            public long getDuration() {
                return 0L;
            }

            @Override // com.bilibili.opengldecoder.IDecoder
            public float getSpeed() {
                return 0.0f;
            }

            @Override // com.bilibili.opengldecoder.IDecoder
            public Point getVideoSize() {
                return null;
            }

            @Override // com.bilibili.opengldecoder.IDecoder
            public void init(Context context, SurfaceTexture surfaceTexture, SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener) {
            }

            @Override // com.bilibili.opengldecoder.IDecoder
            public void pause() {
            }

            @Override // com.bilibili.opengldecoder.IDecoder
            public void release() {
            }

            @Override // com.bilibili.opengldecoder.IDecoder
            public void reset() {
            }

            @Override // com.bilibili.opengldecoder.IDecoder
            public void seekTo(long j7) {
            }

            @Override // com.bilibili.opengldecoder.IDecoder
            public void setDataSource(String str, int i7) {
            }

            @Override // com.bilibili.opengldecoder.IDecoder
            public void setDecoderPrepared(IDecoder.OnDecoderPreparedListener onDecoderPreparedListener) {
            }

            @Override // com.bilibili.opengldecoder.IDecoder
            public void setInfoListener(IMediaPlayer.OnInfoListener onInfoListener) {
            }

            @Override // com.bilibili.opengldecoder.IDecoder
            public void setLoop(boolean z6) {
            }

            @Override // com.bilibili.opengldecoder.IDecoder
            public void setOnCompletionListener(IMediaPlayer.OnCompletionListener onCompletionListener) {
            }

            @Override // com.bilibili.opengldecoder.IDecoder
            public void setOnPreparedListener(IMediaPlayer.OnPreparedListener onPreparedListener) {
            }

            @Override // com.bilibili.opengldecoder.IDecoder
            public void setOnSeekCompleteListener(IMediaPlayer.OnSeekCompleteListener onSeekCompleteListener) {
            }

            @Override // com.bilibili.opengldecoder.IDecoder
            public void setOnVideoSizeChangedListener(IMediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener) {
            }

            @Override // com.bilibili.opengldecoder.IDecoder
            public void setSpeed(float f7) {
            }

            @Override // com.bilibili.opengldecoder.IDecoder
            public void setVolume(float f7, float f8) {
            }

            @Override // com.bilibili.opengldecoder.IDecoder
            public void start() {
            }
        };
    }
}
