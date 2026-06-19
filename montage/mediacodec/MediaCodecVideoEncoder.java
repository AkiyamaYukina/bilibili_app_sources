package com.bilibili.montage.mediacodec;

import NI.k;
import W60.F;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import androidx.media3.common.util.C4638g;
import com.bilibili.live.streaming.encoder.BiliPushAVCodecUtils;
import com.bilibili.montage.avutil.LogSinker;
import com.bilibili.montage.utils.ThreadUtils;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/mediacodec/MediaCodecVideoEncoder.class */
public class MediaCodecVideoEncoder {
    private static final int MEDIA_CODEC_ENCODE_ERROR = -1000;
    private static final int MEDIA_CODEC_ENCODE_NO_ERROR = 0;
    private static final int MEDIA_CODEC_TIMEOUT_MS = 2000;
    private static final String TAG = "MediaCodecVideoEncoder";
    private Handler handler;
    private HandlerThread handlerThread;
    private Surface inputSurface;
    private MediaCodec mediaCodec;
    private boolean isBaselineProfile = true;
    private String encoderCodecName = null;
    private boolean error = false;
    private long nativeAddress = 0;
    private final MediaCodec.Callback mediaCodecCallback = new MediaCodec.Callback(this) { // from class: com.bilibili.montage.mediacodec.MediaCodecVideoEncoder.1
        final MediaCodecVideoEncoder this$0;

        {
            this.this$0 = this;
        }

        @Override // android.media.MediaCodec.Callback
        public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
            LogSinker.e(MediaCodecVideoEncoder.TAG, "onError: " + codecException);
            this.this$0.error = true;
            MediaCodecVideoEncoder mediaCodecVideoEncoder = this.this$0;
            mediaCodecVideoEncoder.nativeOnEncodedFrame(mediaCodecVideoEncoder.nativeAddress, -1000, null, null);
        }

        @Override // android.media.MediaCodec.Callback
        public void onInputBufferAvailable(MediaCodec mediaCodec, int i7) {
            this.this$0.inputBuffers.offer(Integer.valueOf(i7));
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputBufferAvailable(MediaCodec mediaCodec, int i7, MediaCodec.BufferInfo bufferInfo) {
            if (i7 == -2) {
                LogSinker.i(MediaCodecVideoEncoder.TAG, "Output format changed: " + mediaCodec.getOutputFormat());
                return;
            }
            if (i7 == -3) {
                LogSinker.i(MediaCodecVideoEncoder.TAG, "Output buffers changed");
                return;
            }
            if (i7 == -1) {
                return;
            }
            if (i7 < 0) {
                LogSinker.e(MediaCodecVideoEncoder.TAG, "Unexpected result from encoder.dequeueOutputBuffer: " + i7);
                this.this$0.error = true;
            }
            if (this.this$0.error) {
                MediaCodecVideoEncoder mediaCodecVideoEncoder = this.this$0;
                mediaCodecVideoEncoder.nativeOnEncodedFrame(mediaCodecVideoEncoder.nativeAddress, -1000, null, null);
                return;
            }
            try {
                ByteBuffer byteBufferDuplicate = this.this$0.mediaCodec.getOutputBuffer(i7).duplicate();
                byteBufferDuplicate.position(bufferInfo.offset);
                byteBufferDuplicate.limit(bufferInfo.offset + bufferInfo.size);
                MediaCodecVideoEncoder mediaCodecVideoEncoder2 = this.this$0;
                mediaCodecVideoEncoder2.nativeOnEncodedFrame(mediaCodecVideoEncoder2.nativeAddress, 0, byteBufferDuplicate.slice(), bufferInfo);
                this.this$0.mediaCodec.releaseOutputBuffer(i7, false);
            } catch (Exception e7) {
                LogSinker.e(MediaCodecVideoEncoder.TAG, "getInputBuffer failed" + e7);
                this.this$0.error = true;
                MediaCodecVideoEncoder mediaCodecVideoEncoder3 = this.this$0;
                mediaCodecVideoEncoder3.nativeOnEncodedFrame(mediaCodecVideoEncoder3.nativeAddress, -1000, null, null);
            }
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        }
    };
    private final ConcurrentLinkedQueue<Integer> inputBuffers = new ConcurrentLinkedQueue<>();

    private String getCodecName(MediaCodec mediaCodec) {
        String name;
        String str = "";
        String str2 = str;
        try {
            name = mediaCodec.getName();
            StringBuilder sb = new StringBuilder("Codec Name: ");
            sb.append(name);
            str2 = name;
            str = name;
            LogSinker.i(TAG, sb.toString());
        } catch (Error e7) {
            e = e7;
            LogSinker.e(TAG, "Error codec name: " + e.getMessage());
            name = str;
        } catch (Exception e8) {
            e = e8;
            str = str2;
            LogSinker.e(TAG, "Error codec name: " + e.getMessage());
            name = str;
        }
        return name;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initEncode$0(String str, boolean[] zArr) {
        try {
            this.mediaCodec = MediaCodec.createEncoderByType(str);
            zArr[0] = true;
        } catch (Exception e7) {
            LogSinker.e(TAG, "create mediacodec encode exception" + e7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$release$1() {
        try {
            LogSinker.i(TAG, "Java releaseEncoder on release thread");
            MediaCodec mediaCodec = this.mediaCodec;
            if (mediaCodec != null) {
                mediaCodec.stop();
                this.mediaCodec.release();
            }
            this.mediaCodec = null;
            LogSinker.i(TAG, "Java releaseEncoder on release thread done");
        } catch (Exception e7) {
            LogSinker.e(TAG, "Media encoder release failed, e: " + e7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeOnEncodedFrame(long j7, int i7, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo);

    public int dequeueInputBuffer() {
        Integer numPoll;
        try {
            if (this.inputBuffers.isEmpty() || (numPoll = this.inputBuffers.poll()) == null) {
                return -1;
            }
            if (this.error) {
                return -1000;
            }
            return numPoll.intValue();
        } catch (Exception e7) {
            LogSinker.e(TAG, "dequeueInputBuffer failed" + e7);
            return -1000;
        }
    }

    public String getCodecName() {
        return this.encoderCodecName;
    }

    public ByteBuffer getInputBuffer(int i7) {
        try {
            return this.mediaCodec.getInputBuffer(i7);
        } catch (Exception e7) {
            LogSinker.e(TAG, "getInputBuffer failed" + e7);
            return null;
        }
    }

    public boolean initEncode(long j7, int i7, int i8, int i9, int i10, int i11, int i12, boolean z6, boolean z7, boolean z8, int i13, int i14) {
        MediaFormat mediaFormatCreateHDRMediaFormat;
        String str;
        final boolean[] zArr;
        boolean zRunInWaitLimitTime;
        MediaCodec mediaCodec;
        Trace.beginSection("MediaCodecVideoEncoder initEncode");
        StringBuilder sb = new StringBuilder("Java initEncode:  : ");
        sb.append(i7);
        sb.append(" x ");
        sb.append(i8);
        F.b(i9, i10, ". @   bitrate: ", "  Fps: ", sb);
        F.b(i11, i12, "  iFrameInterval: ", " encoderProfile:", sb);
        C4638g.b(" encoderH265:", " hdr:", sb, z8, z7);
        sb.append(" qpmin:");
        sb.append(i13);
        sb.append(" qpmax:");
        sb.append(i14);
        LogSinker.i(TAG, sb.toString());
        try {
            try {
                this.nativeAddress = j7;
                String str2 = BiliPushAVCodecUtils.HEVC_MIME;
                if (z7) {
                    mediaFormatCreateHDRMediaFormat = MediaCodecUtils.createHDRMediaFormat(i7, i8, i9, i10, i11, i13, i14);
                    str = str2;
                } else {
                    if (!z8) {
                        str2 = BiliPushAVCodecUtils.AVC_MIME;
                    }
                    MediaFormat mediaFormatCreateSDRMediaFormat = MediaCodecUtils.createSDRMediaFormat(i7, i8, i9, i10, i11, i12, z6, str2, i13, i14);
                    mediaFormatCreateHDRMediaFormat = mediaFormatCreateSDRMediaFormat;
                    str = str2;
                    if (mediaFormatCreateSDRMediaFormat.containsKey("profile")) {
                        mediaFormatCreateHDRMediaFormat = mediaFormatCreateSDRMediaFormat;
                        str = str2;
                        if (mediaFormatCreateSDRMediaFormat.getInteger("profile") != 1) {
                            this.isBaselineProfile = false;
                            str = str2;
                            mediaFormatCreateHDRMediaFormat = mediaFormatCreateSDRMediaFormat;
                        }
                    }
                }
                LogSinker.i(TAG, "encoder format: " + mediaFormatCreateHDRMediaFormat);
                zArr = new boolean[1];
                zArr[0] = false;
                final String str3 = str;
                zRunInWaitLimitTime = ThreadUtils.runInWaitLimitTime(new Runnable(this, str3, zArr) { // from class: com.bilibili.montage.mediacodec.c

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final MediaCodecVideoEncoder f66342a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final String f66343b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final boolean[] f66344c;

                    {
                        this.f66342a = this;
                        this.f66343b = str3;
                        this.f66344c = zArr;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f66342a.lambda$initEncode$0(this.f66343b, this.f66344c);
                    }
                }, 2000L);
                if (!zRunInWaitLimitTime) {
                    LogSinker.e(TAG, "Media encode create timeout");
                }
                mediaCodec = this.mediaCodec;
            } catch (Exception e7) {
                LogSinker.e(TAG, "initEncode failed" + e7);
            }
            if (mediaCodec == null || !zArr[0] || !zRunInWaitLimitTime) {
                LogSinker.e(TAG, "Can not create media encoder");
                return false;
            }
            mediaCodec.configure(mediaFormatCreateHDRMediaFormat, (Surface) null, (MediaCrypto) null, 1);
            this.encoderCodecName = getCodecName(this.mediaCodec);
            if (!z7) {
                this.inputSurface = this.mediaCodec.createInputSurface();
            }
            HandlerThread handlerThread = new HandlerThread("MediaCodecEncodeThread");
            this.handlerThread = handlerThread;
            handlerThread.start();
            Handler handler = new Handler(this.handlerThread.getLooper());
            this.handler = handler;
            this.mediaCodec.setCallback(this.mediaCodecCallback, handler);
            this.mediaCodec.start();
            return true;
        } finally {
            Trace.endSection();
        }
    }

    public boolean isH264BaseLineProfile() {
        return this.isBaselineProfile;
    }

    public void queueEndOfStream(int i7) {
        Trace.beginSection("MediaCodecVideoEncoder queueEndOfStream");
        try {
            this.mediaCodec.queueInputBuffer(i7, 0, 0, 0L, 4);
        } catch (IllegalStateException e7) {
            LogSinker.e(TAG, "signalEndOfInputStream failed" + e7);
        }
        Trace.endSection();
    }

    public boolean queueInputBuffer(int i7, int i8, long j7, int i9) {
        try {
            this.mediaCodec.queueInputBuffer(i7, 0, i8, j7, i9);
            return true;
        } catch (Exception e7) {
            LogSinker.e(TAG, "queueInputBuffer failed" + e7);
            return false;
        }
    }

    public void release() {
        Trace.beginSection("MediaCodecVideoEncoder release");
        LogSinker.i(TAG, "Java releaseEncoder");
        try {
            this.handler.removeCallbacksAndMessages(null);
            this.handlerThread.interrupt();
            this.handlerThread.quit();
        } catch (Exception e7) {
            LogSinker.e(TAG, "HandlerThread release failed, e: " + e7);
        }
        if (!ThreadUtils.runInWaitLimitTime(new k(this, 2), 2000L)) {
            LogSinker.e(TAG, "Media encode release timeout");
        }
        Surface surface = this.inputSurface;
        if (surface != null) {
            surface.release();
            this.inputSurface = null;
        }
        LogSinker.i(TAG, "Java releaseEncoder done");
        Trace.endSection();
    }

    public void reset(int i7, int i8) {
        if (this.mediaCodec == null) {
            throw new RuntimeException("Incorrect reset call for non-initialized encode.");
        }
        Trace.beginSection("MediaCodecVideoEncoder reset");
        LogSinker.i(TAG, "Java reset: " + i7 + " x " + i8);
        try {
            this.mediaCodec.flush();
            this.mediaCodec.start();
        } catch (Exception e7) {
            LogSinker.e(TAG, "reset failed" + e7);
        }
        LogSinker.i(TAG, "Java resetEncoder done");
        Trace.endSection();
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0018 -> B:4:0x000d). Please report as a decompilation issue!!! */
    public void signalEndOfInputStream() {
        Trace.beginSection("MediaCodecVideoEncoder signalEndOfInputStream");
        try {
            try {
                this.mediaCodec.signalEndOfInputStream();
            } catch (IllegalStateException e7) {
                LogSinker.e(TAG, "signalEndOfInputStream failed" + e7);
            }
        } finally {
            Trace.endSection();
        }
    }
}
