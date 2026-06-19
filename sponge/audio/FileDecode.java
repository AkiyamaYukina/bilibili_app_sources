package com.bilibili.sponge.audio;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import com.bilibili.opengldecoder.GLDecoder;
import com.bilibili.opengldecoder.IjkPlayerDecoderFactory;
import com.bilibili.sponge.callback.IFileDecodeCallback;
import javax.microedition.khronos.egl.EGLContext;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sponge/audio/FileDecode.class */
public class FileDecode {
    private AudioTrack mAudioTrack;
    private GLDecoder mDecoder = new GLDecoder();
    private byte[] rawAudioData;
    private boolean videoStarted;

    /* JADX INFO: Access modifiers changed from: private */
    public RawAudioFrame generate(byte[] bArr, int i7, int i8, int i9, int i10, int i11) {
        RawAudioFrame rawAudioFrame = new RawAudioFrame();
        rawAudioFrame.setmSourceType(1);
        rawAudioFrame.setmRawData(bArr);
        rawAudioFrame.setOffset(i7);
        rawAudioFrame.setSize(i8);
        rawAudioFrame.setFreq(i9);
        rawAudioFrame.setmChannel(i10);
        rawAudioFrame.setmSampleRate(i11);
        return rawAudioFrame;
    }

    public void create(Context context) {
        this.mDecoder.create(context);
    }

    public long getCurrentPosition() {
        return this.mDecoder.getCurrentPosition();
    }

    public void init(EGLContext eGLContext, IFileDecodeCallback iFileDecodeCallback) {
        this.mDecoder.init(eGLContext, new IjkPlayerDecoderFactory(false, true), new GLDecoder.GLDecoderListener(this, iFileDecodeCallback) { // from class: com.bilibili.sponge.audio.FileDecode.1
            final FileDecode this$0;
            final IFileDecodeCallback val$decodeCallback;

            {
                this.this$0 = this;
                this.val$decodeCallback = iFileDecodeCallback;
            }

            @Override // com.bilibili.opengldecoder.GLDecoder.GLDecoderListener
            public int onAudioRawData(byte[] bArr, int i7, int i8, int i9, int i10, int i11) {
                if (this.this$0.rawAudioData == null || this.this$0.rawAudioData.length != bArr.length) {
                    this.this$0.rawAudioData = new byte[bArr.length];
                }
                System.arraycopy(bArr, 0, this.this$0.rawAudioData, 0, bArr.length);
                if (this.this$0.mAudioTrack == null) {
                    int i12 = i10 == 1 ? 4 : 12;
                    this.this$0.mAudioTrack = new AudioTrack(3, i9, i12, 2, AudioTrack.getMinBufferSize(i9, i12, 2), 1);
                    this.this$0.mAudioTrack.play();
                }
                this.this$0.mAudioTrack.write(this.this$0.rawAudioData, i7, i8);
                this.val$decodeCallback.onAudioRawDataCapture(this.this$0.generate(bArr, i7, i8, i9, i10, i11));
                return 1;
            }

            @Override // com.bilibili.opengldecoder.GLDecoder.GLDecoderListener
            public void onFrameAvailable(SurfaceTexture surfaceTexture, int i7) {
            }

            @Override // com.bilibili.opengldecoder.GLDecoder.GLDecoderListener
            public void onTextureIdGenerated(int i7) {
                this.val$decodeCallback.onVideoTextureIdGenerate(i7);
            }
        });
    }

    public boolean isVideoStarted() {
        return this.videoStarted;
    }

    public void release() {
        GLDecoder gLDecoder = this.mDecoder;
        if (gLDecoder != null) {
            try {
                gLDecoder.release();
            } catch (InterruptedException e7) {
                e7.printStackTrace();
            }
        }
        AudioTrack audioTrack = this.mAudioTrack;
        if (audioTrack != null) {
            audioTrack.release();
        }
    }

    public void reset() {
        stop();
        this.mDecoder.reset();
    }

    public void seekTo(long j7) {
        this.mDecoder.seekTo(j7);
    }

    public void setDataSource(String str) {
        this.mDecoder.setDataSource(str, 0);
    }

    public void start() {
        this.mDecoder.start();
        this.videoStarted = true;
    }

    public void stop() {
        this.mDecoder.backToStart();
        this.videoStarted = false;
    }
}
