package com.bilibili.montage.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import com.bilibili.montage.avutil.LogSinker;
import com.bilibili.montage.utils.ThreadUtils;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/mediacodec/MediaCodecVideoDecoder.class */
public class MediaCodecVideoDecoder {
    private static final int COLOR_QCOM_FORMATYUV420PackedSemiPlanar32m = 2141391876;
    private static final int DEQUEUE_INPUT_TIMEOUT = 1000;
    private static final int MEDIA_CODEC_TIMEOUT_MS = 2000;
    private static final int MONERR_AGAIN = 1;
    private static final int MONERR_EOF = 2;
    private static final int MONERR_MEDIACODEC_VIDEO_DECODER_RECEIVE_FRAME_ERROR = 214;
    private static final int MONERR_NONE = 0;
    private static final String TAG = "MediaCodecVideoDecoder";
    private int colorRange;
    private int colorStandard;
    private int colorTransfer;
    private boolean hasDecodedFirstFrame;
    private int height;
    private ByteBuffer[] inputBuffers;
    private MediaCodec mediaCodec;
    private MediaFormat mediaFormat;
    private String mime;
    private int outputBufferSize;
    private ByteBuffer[] outputBuffers;
    private int sliceHeight;
    private int stride;
    private int width;
    private MediaCodecRender mediaCodecRender = null;
    private int colorFormat = -1;
    private boolean canFlush = false;
    private boolean useSurface = false;
    private Surface surface = null;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/mediacodec/MediaCodecVideoDecoder$DecodedOutputBuffer.class */
    public static class DecodedOutputBuffer {
        private final int decodeRet;
        private final int flags;
        private final int index;
        private final int offset;
        private final long presentationTimeStampUs;
        private final int size;

        public DecodedOutputBuffer(int i7, int i8, int i9, int i10, int i11, long j7) {
            this.decodeRet = i7;
            this.index = i8;
            this.offset = i9;
            this.size = i10;
            this.flags = i11;
            this.presentationTimeStampUs = j7;
        }
    }

    private boolean configureMediaFormat(byte[] bArr, byte[] bArr2, int i7) {
        Trace.beginSection("MediaCodecVideoDecoder configureMediaFormat");
        try {
            if (bArr != null) {
                this.mediaFormat.setByteBuffer("csd-0", ByteBuffer.wrap(bArr));
            }
            if (bArr2 != null) {
                this.mediaFormat.setByteBuffer("csd-1", ByteBuffer.wrap(bArr2));
            }
            this.mediaFormat.setInteger("rotation-degrees", i7);
            if (this.useSurface) {
                MediaCodecRender mediaCodecRender = new MediaCodecRender();
                this.mediaCodecRender = mediaCodecRender;
                Surface surface = mediaCodecRender.getSurface();
                this.surface = surface;
                if (surface == null) {
                    LogSinker.e(TAG, "Can not init surface");
                    return false;
                }
                this.mediaFormat.setInteger("color-format", 2130708361);
            } else {
                MediaCodecInfo mediaCodecInfoSelectCodec = selectCodec(this.mime);
                if (mediaCodecInfoSelectCodec == null) {
                    Log.e(TAG, "Unable to find an appropriate codec for " + this.mime);
                    return false;
                }
                int iSelectColorFormat = selectColorFormat(mediaCodecInfoSelectCodec, this.mime);
                this.colorFormat = iSelectColorFormat;
                if (iSelectColorFormat < 0) {
                    Trace.endSection();
                    return false;
                }
                this.mediaFormat.setInteger("color-format", iSelectColorFormat);
            }
            LogSinker.i(TAG, "use MediaCodec.createDecoderByType: " + this.mime);
            final boolean[] zArr = new boolean[1];
            zArr[0] = false;
            boolean zRunInWaitLimitTime = ThreadUtils.runInWaitLimitTime(new Runnable(this, zArr) { // from class: com.bilibili.montage.mediacodec.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final MediaCodecVideoDecoder f66340a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final boolean[] f66341b;

                {
                    this.f66340a = this;
                    this.f66341b = zArr;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f66340a.lambda$configureMediaFormat$0(this.f66341b);
                }
            }, 2000L);
            if (!zRunInWaitLimitTime) {
                LogSinker.e(TAG, "Media decode create timeout");
            }
            if (this.mediaCodec == null || !zArr[0] || !zRunInWaitLimitTime) {
                LogSinker.e(TAG, "Can not create media decoder");
                return false;
            }
            LogSinker.i(TAG, "MediaCodec.getName: " + this.mediaCodec.getName());
            LogSinker.i(TAG, "mediaCodec.configure format: " + this.mediaFormat.toString());
            this.mediaCodec.configure(this.mediaFormat, this.surface, (MediaCrypto) null, 0);
            this.mediaCodec.start();
            LogSinker.i(TAG, "mediaCodec.start finished");
            this.outputBuffers = this.mediaCodec.getOutputBuffers();
            this.inputBuffers = this.mediaCodec.getInputBuffers();
            this.outputBufferSize = this.outputBuffers.length;
            this.hasDecodedFirstFrame = false;
            return true;
        } catch (Exception e7) {
            LogSinker.e(TAG, "configureMediaFormat failed " + e7);
            return false;
        } finally {
            Trace.endSection();
        }
    }

    private int dequeueInputBuffer() {
        try {
            try {
                Trace.beginSection("MediaCodecVideoDecoder dequeueInputBuffer");
                int iDequeueInputBuffer = this.mediaCodec.dequeueInputBuffer(1000L);
                Trace.endSection();
                return iDequeueInputBuffer;
            } catch (IllegalStateException e7) {
                LogSinker.e(TAG, "dequeueIntputBuffer failed " + e7);
                Trace.endSection();
                return -2;
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0137, code lost:
    
        com.bilibili.montage.avutil.LogSinker.e(com.bilibili.montage.mediacodec.MediaCodecVideoDecoder.TAG, "Unexpected size change. Configured " + r10.width + com.bilibili.opd.app.core.config.ConfigService.ANY + r10.height + ". New " + r0 + com.bilibili.opd.app.core.config.ConfigService.ANY + r0);
        r0 = new com.bilibili.montage.mediacodec.MediaCodecVideoDecoder.DecodedOutputBuffer(com.bilibili.montage.mediacodec.MediaCodecVideoDecoder.MONERR_MEDIACODEC_VIDEO_DECODER_RECEIVE_FRAME_ERROR, r0, -1, -1, -1, -1);
        android.os.Trace.endSection();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01a7, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.bilibili.montage.mediacodec.MediaCodecVideoDecoder.DecodedOutputBuffer dequeueOutputBuffer(int r11) {
        /*
            Method dump skipped, instruction units count: 984
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.montage.mediacodec.MediaCodecVideoDecoder.dequeueOutputBuffer(int):com.bilibili.montage.mediacodec.MediaCodecVideoDecoder$DecodedOutputBuffer");
    }

    private void dropOutputBuffer(int i7) {
        try {
            this.mediaCodec.releaseOutputBuffer(i7, false);
        } catch (IllegalStateException e7) {
            LogSinker.e(TAG, "dropOutputBuffer failed " + e7);
        }
    }

    private boolean initDecode(String str, int i7, int i8, boolean z6) {
        Trace.beginSection("MediaCodecVideoDecoder initDecode");
        try {
            this.mime = str;
            this.width = i7;
            this.height = i8;
            this.useSurface = z6;
            this.stride = i7;
            this.sliceHeight = i8;
            this.mediaFormat = MediaFormat.createVideoFormat(str, i7, i8);
            LogSinker.i(TAG, "MediaFormat  Format is: " + this.mediaFormat);
            return true;
        } catch (IllegalStateException e7) {
            LogSinker.e(TAG, "initDecode failed " + e7);
            return false;
        } finally {
            Trace.endSection();
        }
    }

    private static boolean isRecognizedFormat(int i7) {
        return i7 == 19 || i7 == 21 || i7 == 2141391872 || i7 == COLOR_QCOM_FORMATYUV420PackedSemiPlanar32m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$configureMediaFormat$0(boolean[] zArr) {
        try {
            this.mediaCodec = MediaCodec.createDecoderByType(this.mime);
            zArr[0] = true;
        } catch (Exception e7) {
            LogSinker.e(TAG, "create mediacodec decode exception" + e7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$release$1() {
        try {
            LogSinker.i(TAG, "Java releaseDecoder on release thread");
            MediaCodec mediaCodec = this.mediaCodec;
            if (mediaCodec != null) {
                mediaCodec.stop();
                this.mediaCodec.release();
            }
            this.mediaCodec = null;
            LogSinker.i(TAG, "Java releaseDecoder on release thread done");
        } catch (Exception e7) {
            LogSinker.e(TAG, "Media decoder release failed " + e7);
        }
    }

    private boolean queueInputBuffer(int i7, int i8, long j7, int i9) {
        try {
            Trace.beginSection("MediaCodecVideoDecoder queueInputBuffer");
            this.inputBuffers[i7].position(0);
            this.inputBuffers[i7].limit(i8);
            this.mediaCodec.queueInputBuffer(i7, 0, i8, j7, i9);
            this.canFlush = true;
            return true;
        } catch (IllegalStateException e7) {
            LogSinker.e(TAG, "queueInputBuffer failed" + e7);
            return false;
        } finally {
            Trace.endSection();
        }
    }

    private void release() {
        Trace.beginSection("MediaCodecVideoDecoder release");
        if (!ThreadUtils.runInWaitLimitTime(new Runnable(this) { // from class: com.bilibili.montage.mediacodec.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MediaCodecVideoDecoder f66339a;

            {
                this.f66339a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f66339a.lambda$release$1();
            }
        }, 2000L)) {
            LogSinker.e(TAG, "Media decoder release timeout");
        }
        MediaCodecRender mediaCodecRender = this.mediaCodecRender;
        if (mediaCodecRender != null) {
            mediaCodecRender.destroy();
        }
        this.mediaFormat = null;
        try {
            ByteBuffer[] byteBufferArr = this.inputBuffers;
            if (byteBufferArr != null) {
                for (ByteBuffer byteBuffer : byteBufferArr) {
                    if (byteBuffer != null) {
                        byteBuffer.clear();
                    }
                }
                this.inputBuffers = null;
            }
        } catch (Exception e7) {
            e7.printStackTrace();
        }
        try {
            ByteBuffer[] byteBufferArr2 = this.outputBuffers;
            if (byteBufferArr2 != null) {
                for (ByteBuffer byteBuffer2 : byteBufferArr2) {
                    if (byteBuffer2 != null) {
                        byteBuffer2.clear();
                    }
                }
                this.outputBuffers = null;
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        LogSinker.i(TAG, "Java releaseDecoder done");
        Trace.endSection();
    }

    private int renderOutputBuffer(int i7, int i8, int i9, int i10) {
        try {
            this.mediaCodec.releaseOutputBuffer(i7, true);
            MediaCodecRender mediaCodecRender = this.mediaCodecRender;
            if (mediaCodecRender != null) {
                return mediaCodecRender.drawToTexture(i8, i9, i10, this.colorStandard, this.colorTransfer) < 0 ? -1 : 0;
            }
            return 0;
        } catch (IllegalStateException e7) {
            LogSinker.e(TAG, "renderOutputBuffer failed " + e7);
            return -2;
        }
    }

    private void reset(int i7, int i8) {
        if (this.canFlush) {
            MediaCodec mediaCodec = this.mediaCodec;
            if (mediaCodec != null) {
                mediaCodec.flush();
            }
            this.width = i7;
            this.height = i8;
            this.hasDecodedFirstFrame = false;
            this.canFlush = false;
        }
    }

    private static MediaCodecInfo selectCodec(String str) {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i7 = 0; i7 < codecCount; i7++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i7);
            if (codecInfoAt.isEncoder()) {
                for (String str2 : codecInfoAt.getSupportedTypes()) {
                    if (str2.equalsIgnoreCase(str)) {
                        return codecInfoAt;
                    }
                }
            }
        }
        return null;
    }

    private static int selectColorFormat(MediaCodecInfo mediaCodecInfo, String str) {
        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
        int i7 = 0;
        while (true) {
            int[] iArr = capabilitiesForType.colorFormats;
            if (i7 >= iArr.length) {
                LogSinker.e(TAG, "couldn't find a good color format for " + mediaCodecInfo.getName() + " / " + str);
                return -1;
            }
            int i8 = iArr[i7];
            if (isRecognizedFormat(i8)) {
                return i8;
            }
            i7++;
        }
    }
}
