package com.bilibili.montage.avutil;

import R0.k;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bilibili.montage.avinfo.MontageImageInfo;
import com.bilibili.montage.avinfo.MontageRational;
import com.bilibili.montage.avinfo.MontageVideoFrameInfo;
import com.bilibili.montage.timeline.MontageTimeline;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.HashMap;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/avutil/MontageMediaFileVideoRetriever.class */
public class MontageMediaFileVideoRetriever {
    private static final int NVS_MEDIA_FILE_VIDEO_RETRIEVER_ERROR_CODE_NO_CANCEL = 1;
    private static final int NVS_MEDIA_FILE_VIDEO_RETRIEVER_ERROR_CODE_NO_ERROR = 0;
    private static final int NVS_MEDIA_FILE_VIDEO_RETRIEVER_ERROR_UNKNOWN = 65535;
    private static final int NVS_MEDIA_FILE_VIDEO_RETRIEVER_ERROR_VIDEO_DECODER_ERROR = 4;
    private static final int NVS_MEDIA_FILE_VIDEO_RETRIEVER_ERROR_VIDEO_DECODING_ERROR = 5;
    private static final int NVS_MEDIA_FILE_VIDEO_RETRIEVER_ERROR_VIDEO_ENCODE_SETUP_ERROR = 2;
    private static final int NVS_MEDIA_FILE_VIDEO_RETRIEVER_ERROR_VIDEO_ENCODING_ERROR = 3;
    private static final String TAG = "MontageMediaFileVideoRetriever";
    private EventHandler mEventHandler;
    private HandlerThread mHandlerThread;
    private MontageImageGrabber mImageGrabber = null;
    private final MontageRational proxyScale = new MontageRational(1, 1);
    private Handler mCallbackHanlder = null;
    private MeidaFileVideoRetrieverCallback mVideoRetrieverCallback = null;
    private HashMap<String, MontageTimeline> mFileToTimeline = new HashMap<>();
    private final IMeidaFileVideoRetrieverCallback mMediaFileVideoRetrieverCallback = new AnonymousClass1(this);
    private final MontageImageInfo.IExecuteCallback mExecuteCallback = new MontageImageInfo.IExecuteCallback(this) { // from class: com.bilibili.montage.avutil.MontageMediaFileVideoRetriever.2
        final MontageMediaFileVideoRetriever this$0;

        {
            this.this$0 = this;
        }

        @Override // com.bilibili.montage.avinfo.MontageImageInfo.IExecuteCallback
        public void onExecuteCallback(int i7, int i8, int i9, Object obj) {
            this.this$0.handleCallback(i7, i8, i9, obj);
        }
    };

    /* JADX INFO: renamed from: com.bilibili.montage.avutil.MontageMediaFileVideoRetriever$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/avutil/MontageMediaFileVideoRetriever$1.class */
    public class AnonymousClass1 implements IMeidaFileVideoRetrieverCallback {
        final MontageMediaFileVideoRetriever this$0;

        public AnonymousClass1(MontageMediaFileVideoRetriever montageMediaFileVideoRetriever) {
            this.this$0 = montageMediaFileVideoRetriever;
        }

        @Override // com.bilibili.montage.avutil.MontageMediaFileVideoRetriever.IMeidaFileVideoRetrieverCallback
        public void notifyFinsih(long j7, int i7) {
            synchronized (this) {
                if (this.this$0.mVideoRetrieverCallback != null) {
                    if (this.this$0.mCallbackHanlder == null) {
                        this.this$0.mCallbackHanlder.post(new Runnable(this, j7, i7) { // from class: com.bilibili.montage.avutil.MontageMediaFileVideoRetriever.1.4
                            final AnonymousClass1 this$1;
                            final int val$errorType;
                            final long val$taskId;

                            {
                                this.this$1 = this;
                                this.val$taskId = j7;
                                this.val$errorType = i7;
                            }

                            @Override // java.lang.Runnable
                            public void run() {
                                this.this$1.this$0.mVideoRetrieverCallback.notifyFinsih(this.val$taskId, this.val$errorType);
                            }
                        });
                    } else {
                        this.this$0.mVideoRetrieverCallback.notifyFinsih(j7, i7);
                    }
                }
            }
        }

        @Override // com.bilibili.montage.avutil.MontageMediaFileVideoRetriever.IMeidaFileVideoRetrieverCallback
        public void notifyProgress(long j7, float f7) {
            synchronized (this) {
                if (this.this$0.mVideoRetrieverCallback != null) {
                    if (this.this$0.mCallbackHanlder == null) {
                        this.this$0.mCallbackHanlder.post(new Runnable(this, j7, f7) { // from class: com.bilibili.montage.avutil.MontageMediaFileVideoRetriever.1.3
                            final AnonymousClass1 this$1;
                            final float val$progress;
                            final long val$taskId;

                            {
                                this.this$1 = this;
                                this.val$taskId = j7;
                                this.val$progress = f7;
                            }

                            @Override // java.lang.Runnable
                            public void run() {
                                this.this$1.this$0.mVideoRetrieverCallback.notifyProgress(this.val$taskId, this.val$progress);
                            }
                        });
                    } else {
                        this.this$0.mVideoRetrieverCallback.notifyProgress(j7, f7);
                    }
                }
            }
        }

        @Override // com.bilibili.montage.avutil.MontageMediaFileVideoRetriever.IMeidaFileVideoRetrieverCallback
        public void notifySengmentData(long j7, MontageVideoFrameInfo montageVideoFrameInfo, ByteBuffer byteBuffer) {
            synchronized (this) {
                if (this.this$0.mVideoRetrieverCallback != null) {
                    if (this.this$0.mCallbackHanlder == null) {
                        this.this$0.mCallbackHanlder.post(new Runnable(this, j7, montageVideoFrameInfo, byteBuffer) { // from class: com.bilibili.montage.avutil.MontageMediaFileVideoRetriever.1.2
                            final AnonymousClass1 this$1;
                            final ByteBuffer val$data;
                            final long val$taskId;
                            final MontageVideoFrameInfo val$videoFrameInfo;

                            {
                                this.this$1 = this;
                                this.val$taskId = j7;
                                this.val$videoFrameInfo = montageVideoFrameInfo;
                                this.val$data = byteBuffer;
                            }

                            @Override // java.lang.Runnable
                            public void run() {
                                this.this$1.this$0.mVideoRetrieverCallback.notifySengmentData(this.val$taskId, this.val$videoFrameInfo, this.val$data);
                            }
                        });
                    } else {
                        this.this$0.mVideoRetrieverCallback.notifySengmentData(j7, montageVideoFrameInfo, byteBuffer);
                    }
                }
            }
        }

        @Override // com.bilibili.montage.avutil.MontageMediaFileVideoRetriever.IMeidaFileVideoRetrieverCallback
        public void notifySengmentData(long j7, ByteBuffer byteBuffer, int i7, int i8, int i9, int i10) {
            synchronized (this) {
                if (this.this$0.mVideoRetrieverCallback != null) {
                    if (this.this$0.mCallbackHanlder == null) {
                        this.this$0.mCallbackHanlder.post(new Runnable(this, j7, byteBuffer, i7, i8, i9, i10) { // from class: com.bilibili.montage.avutil.MontageMediaFileVideoRetriever.1.1
                            final AnonymousClass1 this$1;
                            final ByteBuffer val$data;
                            final int val$height;
                            final int val$rotation;
                            final long val$taskId;
                            final int val$videoFrameSize;
                            final int val$width;

                            {
                                this.this$1 = this;
                                this.val$taskId = j7;
                                this.val$data = byteBuffer;
                                this.val$width = i7;
                                this.val$height = i8;
                                this.val$rotation = i9;
                                this.val$videoFrameSize = i10;
                            }

                            @Override // java.lang.Runnable
                            public void run() {
                                this.this$1.this$0.mVideoRetrieverCallback.notifySengmentData(this.val$taskId, this.val$data, this.val$width, this.val$height, this.val$rotation, this.val$videoFrameSize);
                            }
                        });
                    } else {
                        this.this$0.mVideoRetrieverCallback.notifySengmentData(j7, byteBuffer, i7, i8, i9, i10);
                    }
                }
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/avutil/MontageMediaFileVideoRetriever$EventHandler.class */
    public static class EventHandler extends Handler {
        private final WeakReference<MontageMediaFileVideoRetriever> mVideoRetriever;

        public EventHandler(MontageMediaFileVideoRetriever montageMediaFileVideoRetriever, Looper looper) {
            super(looper);
            this.mVideoRetriever = new WeakReference<>(montageMediaFileVideoRetriever);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            MontageMediaFileVideoRetriever montageMediaFileVideoRetriever = this.mVideoRetriever.get();
            if (montageMediaFileVideoRetriever == null) {
                LogSinker.w(MontageMediaFileVideoRetriever.TAG, "MontageMediaFileVideoRetriever went away with unhandled events");
            } else {
                montageMediaFileVideoRetriever.handleCallback(message.what, message.arg1, message.arg2, message.obj);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/avutil/MontageMediaFileVideoRetriever$IMeidaFileVideoRetrieverCallback.class */
    public interface IMeidaFileVideoRetrieverCallback extends MontageImageInfo.IGrabImageCallback {
        void notifyFinsih(long j7, int i7);

        void notifyProgress(long j7, float f7);

        void notifySengmentData(long j7, MontageVideoFrameInfo montageVideoFrameInfo, ByteBuffer byteBuffer);

        void notifySengmentData(long j7, ByteBuffer byteBuffer, int i7, int i8, int i9, int i10);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/avutil/MontageMediaFileVideoRetriever$MeidaFileVideoRetrieverCallback.class */
    public interface MeidaFileVideoRetrieverCallback {
        void notifyFinsih(long j7, int i7);

        void notifyProgress(long j7, float f7);

        void notifySengmentData(long j7, MontageVideoFrameInfo montageVideoFrameInfo, ByteBuffer byteBuffer);

        void notifySengmentData(long j7, ByteBuffer byteBuffer, int i7, int i8, int i9, int i10);
    }

    public MontageMediaFileVideoRetriever() {
        HandlerThread handlerThread = new HandlerThread("native-MontageMediaFileVideoRetriever-message-thread");
        this.mHandlerThread = handlerThread;
        handlerThread.start();
        this.mEventHandler = new EventHandler(this, this.mHandlerThread.getLooper());
        LogSinker.i(TAG, "MontageMediaFileVideoRetriever construct");
    }

    public void cancelTask(long j7) {
        MontageImageGrabber montageImageGrabber = this.mImageGrabber;
        if (montageImageGrabber != null) {
            montageImageGrabber.cancelTask(j7);
        }
    }

    public long decodeVideoSegment(String str, long j7, long j8, int i7, int i8, int i9, int i10) {
        MontageTimeline montageTimelineCreateSingleVideoClipTimeline;
        String strB = k.b(i8, str);
        if (this.mFileToTimeline.containsKey(strB)) {
            montageTimelineCreateSingleVideoClipTimeline = this.mFileToTimeline.get(strB);
        } else {
            montageTimelineCreateSingleVideoClipTimeline = MontageTimelineHelper.createSingleVideoClipTimeline(str, i8);
            this.mFileToTimeline.put(strB, montageTimelineCreateSingleVideoClipTimeline);
        }
        if (this.mImageGrabber == null) {
            this.mImageGrabber = new MontageImageGrabber(null, this.mExecuteCallback);
        }
        return this.mImageGrabber.grabImageFromTimelineAsync(montageTimelineCreateSingleVideoClipTimeline, j7, j8, 2, this.proxyScale, i9, i10, this.mMediaFileVideoRetrieverCallback, false, true);
    }

    public void handleCallback(int i7, int i8, int i9, Object obj) {
        IMeidaFileVideoRetrieverCallback iMeidaFileVideoRetrieverCallback;
        MontageImageInfo montageImageInfo = (MontageImageInfo) obj;
        if (montageImageInfo == null || (iMeidaFileVideoRetrieverCallback = (IMeidaFileVideoRetrieverCallback) montageImageInfo.callback) == null) {
            return;
        }
        if (i7 != 6) {
            if (i7 != 7) {
                return;
            }
            if (i8 == 0) {
                iMeidaFileVideoRetrieverCallback.notifyProgress(montageImageInfo.taskId, i9 / 100.0f);
                return;
            } else {
                if (i8 != 1) {
                    return;
                }
                iMeidaFileVideoRetrieverCallback.notifyProgress(montageImageInfo.taskId, 1.0f);
                iMeidaFileVideoRetrieverCallback.notifyFinsih(montageImageInfo.taskId, 0);
                return;
            }
        }
        if (i8 == 0) {
            iMeidaFileVideoRetrieverCallback.notifySengmentData(montageImageInfo.taskId, montageImageInfo.data, montageImageInfo.width, montageImageInfo.height, montageImageInfo.rotation, montageImageInfo.size);
            iMeidaFileVideoRetrieverCallback.notifySengmentData(montageImageInfo.taskId, MontageImageInfo.generateMontageVideoFrameInfo(montageImageInfo), montageImageInfo.data);
            return;
        }
        if (i8 == 1) {
            iMeidaFileVideoRetrieverCallback.notifyFinsih(montageImageInfo.taskId, 65535);
            return;
        }
        if (i8 == 3) {
            iMeidaFileVideoRetrieverCallback.notifyFinsih(montageImageInfo.taskId, 1);
            return;
        }
        if (i8 == 4) {
            iMeidaFileVideoRetrieverCallback.notifyFinsih(montageImageInfo.taskId, 5);
        } else if (i8 == 5) {
            iMeidaFileVideoRetrieverCallback.notifyFinsih(montageImageInfo.taskId, 65535);
        } else {
            if (i8 != 6) {
                return;
            }
            iMeidaFileVideoRetrieverCallback.notifyFinsih(montageImageInfo.taskId, 65535);
        }
    }

    public boolean isReleased() {
        return this.mImageGrabber == null;
    }

    public void release() {
        MontageImageGrabber montageImageGrabber = this.mImageGrabber;
        if (montageImageGrabber != null) {
            montageImageGrabber.destroy();
        }
        HandlerThread handlerThread = this.mHandlerThread;
        if (handlerThread != null) {
            handlerThread.quit();
            this.mHandlerThread = null;
        }
        this.mEventHandler = null;
        this.mImageGrabber = null;
        LogSinker.i(TAG, "release");
    }

    public void setMeidaFileVideoRetrieverCallback(MeidaFileVideoRetrieverCallback meidaFileVideoRetrieverCallback, Handler handler) {
        this.mVideoRetrieverCallback = meidaFileVideoRetrieverCallback;
        this.mCallbackHanlder = handler;
        if (meidaFileVideoRetrieverCallback == null || handler != null) {
            return;
        }
        this.mCallbackHanlder = new Handler(Looper.getMainLooper());
    }
}
