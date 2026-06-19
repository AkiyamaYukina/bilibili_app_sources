package com.bilibili.opengldecoder;

import android.content.Context;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.Surface;
import androidx.compose.runtime.snapshots.z;
import com.bilibili.opengldecoder.IDecoder;
import java.util.ArrayList;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IjkLibLoader;
import tv.danmaku.ijk.media.player.IjkMediaAsset;
import tv.danmaku.ijk.media.player.IjkMediaConfigParams;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
import tv.danmaku.ijk.media.player.IjkMediaPlayerItem;
import tv.danmaku.ijk.media.player.utils.IjkUtils;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opengldecoder/IjkPlayer.class */
public class IjkPlayer implements IDecoder {
    private static final int PLAYER_STATUS_BUFFERING = 5;
    private static final int PLAYER_STATUS_COMPLETE = 7;
    private static final int PLAYER_STATUS_ERROR = 6;
    private static final int PLAYER_STATUS_IDLE = 0;
    private static final int PLAYER_STATUS_PAUSE = 4;
    private static final int PLAYER_STATUS_PLAY = 3;
    private static final int PLAYER_STATUS_PREPAREING = 1;
    private static final int PLAYER_STATUS_SWITCH_ITEM = 2;
    private boolean autoStart;
    private IMediaPlayer.OnCompletionListener mCompletionListener;
    private Context mContext;
    private SurfaceTexture.OnFrameAvailableListener mFrameListener;
    private IJKPlayerCallbackListener mListener;
    private IjkMediaPlayerItem mPlayItem;
    private IjkMediaPlayer mPlayer;
    private IMediaPlayer.OnPreparedListener mPreparedListener;
    private SurfaceTexture mSurfaceTexture;
    private IDecoder.OnDecoderPreparedListener onDecoderPreparedListener;
    private IMediaPlayer.OnInfoListener onInfoListener;
    private IMediaPlayer.OnSeekCompleteListener onSeekCompleteListener;
    private IMediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener;
    private boolean rawAudioCallback;
    private boolean videoStarted = false;
    private boolean looping = true;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opengldecoder/IjkPlayer$IJKPlayerCallbackListener.class */
    public interface IJKPlayerCallbackListener {
        int onRawDataWrite(byte[] bArr, int i7, int i8, int i9, int i10, int i11);
    }

    public IjkPlayer(boolean z6, boolean z7) {
        this.autoStart = z6;
        this.rawAudioCallback = z7;
    }

    private IjkMediaPlayerItem createItem(String str, Context context, int i7) {
        IjkMediaAsset.MediaAssertSegment.Builder builder = new IjkMediaAsset.MediaAssertSegment.Builder(str, 0);
        builder.setSize(-1L);
        ArrayList arrayList = new ArrayList();
        arrayList.add(builder.build());
        IjkMediaAsset.MediaAssetStream.Builder builder2 = new IjkMediaAsset.MediaAssetStream.Builder(IjkMediaAsset.StreamType.NORMAL, IjkMediaAsset.VideoCodecType.H264, 16);
        builder2.setMediaAssertSegments(arrayList);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(builder2.build());
        IjkMediaAsset.Builder builder3 = new IjkMediaAsset.Builder(arrayList2, 16, 16);
        IjkMediaConfigParams ijkMediaConfigParamsCreateItemParmas = IjkUtils.createItemParmas();
        ijkMediaConfigParamsCreateItemParmas.mStartOfPostion = i7;
        if (this.rawAudioCallback) {
            ijkMediaConfigParamsCreateItemParmas.mEnableRawData = true;
        }
        IjkMediaPlayerItem ijkMediaPlayerItem = new IjkMediaPlayerItem((IjkLibLoader) null, context, (Looper) null, 0);
        ijkMediaPlayerItem.init(builder3.build(), ijkMediaConfigParamsCreateItemParmas);
        ijkMediaPlayerItem.start();
        return ijkMediaPlayerItem;
    }

    private void createPlayer(Context context) {
        synchronized (this) {
            if (this.mPlayer == null) {
                IjkMediaPlayer ijkMediaPlayer = new IjkMediaPlayer(context);
                this.mPlayer = ijkMediaPlayer;
                ijkMediaPlayer.setAudioStreamType(3);
                this.mPlayer.setOnInfoListener(new IMediaPlayer.OnInfoListener(this) { // from class: com.bilibili.opengldecoder.IjkPlayer.1
                    final IjkPlayer this$0;

                    {
                        this.this$0 = this;
                    }

                    public boolean onInfo(IMediaPlayer iMediaPlayer, int i7, int i8, Bundle bundle) {
                        if (this.this$0.onInfoListener != null) {
                            this.this$0.onInfoListener.onInfo(iMediaPlayer, i7, i8, bundle);
                        }
                        if (i7 != 3) {
                            if (i7 != 10008) {
                                return false;
                            }
                            this.this$0.mFrameListener.onFrameAvailable(this.this$0.mSurfaceTexture);
                            return false;
                        }
                        if (!this.this$0.autoStart && !this.this$0.videoStarted) {
                            this.this$0.mPlayer.pause();
                            this.this$0.mFrameListener.onFrameAvailable(this.this$0.mSurfaceTexture);
                        }
                        if (this.this$0.mPreparedListener == null) {
                            return false;
                        }
                        this.this$0.mPreparedListener.onPrepared(iMediaPlayer);
                        return false;
                    }
                });
                this.mPlayer.setOnCompletionListener(new IMediaPlayer.OnCompletionListener(this) { // from class: com.bilibili.opengldecoder.IjkPlayer.2
                    final IjkPlayer this$0;

                    {
                        this.this$0 = this;
                    }

                    public void onCompletion(IMediaPlayer iMediaPlayer) {
                        if (this.this$0.looping) {
                            iMediaPlayer.start();
                        }
                        if (this.this$0.mCompletionListener != null) {
                            this.this$0.mCompletionListener.onCompletion(iMediaPlayer);
                        }
                    }
                });
                this.mPlayer.setOnPreparedListener(new IMediaPlayer.OnPreparedListener(this) { // from class: com.bilibili.opengldecoder.IjkPlayer.3
                    final IjkPlayer this$0;

                    {
                        this.this$0 = this;
                    }

                    public void onPrepared(IMediaPlayer iMediaPlayer) {
                        if (this.this$0.onDecoderPreparedListener != null) {
                            this.this$0.onDecoderPreparedListener.onDecoderPrepared(iMediaPlayer);
                        }
                    }
                });
                this.mPlayer.setOnVideoSizeChangedListener(new IMediaPlayer.OnVideoSizeChangedListener(this) { // from class: com.bilibili.opengldecoder.IjkPlayer.4
                    final IjkPlayer this$0;

                    {
                        this.this$0 = this;
                    }

                    public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i7, int i8, int i9, int i10) {
                        if (this.this$0.onVideoSizeChangedListener != null) {
                            this.this$0.onVideoSizeChangedListener.onVideoSizeChanged(iMediaPlayer, i7, i8, i9, i10);
                        }
                    }
                });
                this.mPlayer.setOnRawDataWriteListener(new IjkMediaPlayer.OnRawDataWriteListener(this) { // from class: com.bilibili.opengldecoder.IjkPlayer.5
                    final IjkPlayer this$0;

                    {
                        this.this$0 = this;
                    }

                    public int onRawDataWrite(IMediaPlayer iMediaPlayer, byte[] bArr, int i7, int i8, int i9, int i10, int i11) {
                        return this.this$0.mListener != null ? this.this$0.mListener.onRawDataWrite(bArr, i7, i8, i9, i10, i11) : i8;
                    }
                });
                this.mPlayer.setOnSeekCompleteListener(new IMediaPlayer.OnSeekCompleteListener(this) { // from class: com.bilibili.opengldecoder.IjkPlayer.6
                    final IjkPlayer this$0;

                    {
                        this.this$0 = this;
                    }

                    public void onSeekComplete(IMediaPlayer iMediaPlayer) {
                        if (this.this$0.onSeekCompleteListener != null) {
                            this.this$0.onSeekCompleteListener.onSeekComplete(iMediaPlayer);
                        }
                    }
                });
            }
        }
    }

    @Override // com.bilibili.opengldecoder.IDecoder
    public void backToStart() {
        IjkMediaPlayer ijkMediaPlayer = this.mPlayer;
        if (ijkMediaPlayer != null) {
            ijkMediaPlayer.seekTo(0L);
            if (!this.autoStart) {
                this.mPlayer.pause();
            }
        }
        this.videoStarted = false;
    }

    @Override // com.bilibili.opengldecoder.IDecoder
    public long getCurrentPosition() {
        IjkMediaPlayer ijkMediaPlayer = this.mPlayer;
        if (ijkMediaPlayer != null) {
            return ijkMediaPlayer.getCurrentPosition();
        }
        return 0L;
    }

    @Override // com.bilibili.opengldecoder.IDecoder
    public long getDuration() {
        IjkMediaPlayer ijkMediaPlayer = this.mPlayer;
        if (ijkMediaPlayer != null) {
            return ijkMediaPlayer.getDuration();
        }
        return 0L;
    }

    @Override // com.bilibili.opengldecoder.IDecoder
    public float getSpeed() {
        IjkMediaPlayer ijkMediaPlayer = this.mPlayer;
        float speed = 0.0f;
        if (ijkMediaPlayer != null) {
            speed = ijkMediaPlayer.getSpeed(0.0f);
        }
        return speed;
    }

    @Override // com.bilibili.opengldecoder.IDecoder
    public Point getVideoSize() {
        Point point = new Point(0, 0);
        if (this.mPlayer != null) {
            point = new Point(this.mPlayer.getVideoWidth(), this.mPlayer.getVideoHeight());
        }
        return point;
    }

    @Override // com.bilibili.opengldecoder.IDecoder
    public void init(Context context, SurfaceTexture surfaceTexture, SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener) {
        this.mSurfaceTexture = surfaceTexture;
        this.mFrameListener = onFrameAvailableListener;
        this.mContext = context;
        createPlayer(context);
        this.mPlayer.setSurface(new Surface(this.mSurfaceTexture));
    }

    @Override // com.bilibili.opengldecoder.IDecoder
    public void pause() {
        IjkMediaPlayer ijkMediaPlayer = this.mPlayer;
        if (ijkMediaPlayer != null) {
            ijkMediaPlayer.pause();
        }
        this.videoStarted = false;
    }

    @Override // com.bilibili.opengldecoder.IDecoder
    public void release() {
        this.mListener = null;
        this.mContext = null;
        this.mFrameListener = null;
        this.mSurfaceTexture = null;
        reset();
    }

    @Override // com.bilibili.opengldecoder.IDecoder
    public void reset() {
        IjkMediaPlayer ijkMediaPlayer = this.mPlayer;
        if (ijkMediaPlayer != null) {
            ijkMediaPlayer.stop();
            this.mPlayer.reset();
            this.mPlayer.release();
            this.mPlayer.nativeProfileEnd();
            this.mPlayer = null;
        }
        IjkMediaPlayerItem ijkMediaPlayerItem = this.mPlayItem;
        if (ijkMediaPlayerItem != null) {
            ijkMediaPlayerItem.release();
            this.mPlayItem = null;
        }
        this.videoStarted = false;
    }

    @Override // com.bilibili.opengldecoder.IDecoder
    public void seekTo(long j7) {
        IjkMediaPlayer ijkMediaPlayer = this.mPlayer;
        if (ijkMediaPlayer != null) {
            long duration = ijkMediaPlayer.getDuration();
            if (j7 > duration) {
                StringBuilder sbA = z.a(j7, "seek position is ", "bigger than duration: ");
                sbA.append(duration);
                Log.w("IjkPlayer", sbA.toString());
            }
            this.mPlayer.seekTo(j7, true);
        }
    }

    @Override // com.bilibili.opengldecoder.IDecoder
    public void setDataSource(String str, int i7) {
        synchronized (this) {
            if (this.mPlayer != null) {
                IjkMediaPlayerItem ijkMediaPlayerItem = this.mPlayItem;
                if (ijkMediaPlayerItem != null) {
                    ijkMediaPlayerItem.release();
                }
                this.mPlayItem = createItem(str, this.mContext, i7);
                if (this.mPlayer.getIjkMediaPlayerItem() != null) {
                    this.mPlayer.replaceCurrentItem(this.mPlayItem);
                } else {
                    this.mPlayer.setIjkMediaPlayerItem(this.mPlayItem);
                }
                this.mPlayer.prepareAsync();
            }
        }
    }

    @Override // com.bilibili.opengldecoder.IDecoder
    public void setDecoderPrepared(IDecoder.OnDecoderPreparedListener onDecoderPreparedListener) {
        this.onDecoderPreparedListener = onDecoderPreparedListener;
    }

    public void setIjkPlayerListener(IJKPlayerCallbackListener iJKPlayerCallbackListener) {
        this.mListener = iJKPlayerCallbackListener;
    }

    @Override // com.bilibili.opengldecoder.IDecoder
    public void setInfoListener(IMediaPlayer.OnInfoListener onInfoListener) {
        this.onInfoListener = onInfoListener;
    }

    @Override // com.bilibili.opengldecoder.IDecoder
    public void setLoop(boolean z6) {
        this.looping = z6;
    }

    @Override // com.bilibili.opengldecoder.IDecoder
    public void setOnCompletionListener(IMediaPlayer.OnCompletionListener onCompletionListener) {
        this.mCompletionListener = onCompletionListener;
    }

    @Override // com.bilibili.opengldecoder.IDecoder
    public void setOnPreparedListener(IMediaPlayer.OnPreparedListener onPreparedListener) {
        this.mPreparedListener = onPreparedListener;
    }

    @Override // com.bilibili.opengldecoder.IDecoder
    public void setOnSeekCompleteListener(IMediaPlayer.OnSeekCompleteListener onSeekCompleteListener) {
        this.onSeekCompleteListener = onSeekCompleteListener;
    }

    @Override // com.bilibili.opengldecoder.IDecoder
    public void setOnVideoSizeChangedListener(IMediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener) {
        this.onVideoSizeChangedListener = onVideoSizeChangedListener;
    }

    @Override // com.bilibili.opengldecoder.IDecoder
    public void setSpeed(float f7) {
        IjkMediaPlayer ijkMediaPlayer = this.mPlayer;
        if (ijkMediaPlayer != null) {
            ijkMediaPlayer.setSpeed(f7);
        }
    }

    @Override // com.bilibili.opengldecoder.IDecoder
    public void setVolume(float f7, float f8) {
        IjkMediaPlayer ijkMediaPlayer = this.mPlayer;
        if (ijkMediaPlayer != null) {
            ijkMediaPlayer.setVolume(f7, f8);
        }
    }

    @Override // com.bilibili.opengldecoder.IDecoder
    public void start() {
        IjkMediaPlayer ijkMediaPlayer = this.mPlayer;
        if (ijkMediaPlayer != null) {
            ijkMediaPlayer.start();
        }
        this.videoStarted = true;
    }
}
