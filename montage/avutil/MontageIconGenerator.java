package com.bilibili.montage.avutil;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bilibili.montage.avinfo.MontageImageInfo;
import com.bilibili.montage.avinfo.MontageRational;
import com.bilibili.montage.avinfo.MontageVideoResolution;
import com.bilibili.montage.timeline.MontageTimeline;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/avutil/MontageIconGenerator.class */
public class MontageIconGenerator {
    public static final int GET_ICON_FLAGS_HDR_TONEMAPPING_SUPPORT = 8;
    public static final int GET_ICON_FLAGS_KEY_FRAME = 1;
    private static final String TAG = "MontageIconGenerator";
    private IconCallback mCallback;
    private EventHandler mEventHandler;
    private HandlerThread mHandlerThread;
    private MontageImageGrabber mImageGrabber = null;
    private MontageRational proxyScale = new MontageRational(1, 1);
    private HashMap<String, MontageTimeline> mFileToTimeline = new HashMap<>();
    private IIconCallback mIconCallback = new IIconCallback(this) { // from class: com.bilibili.montage.avutil.MontageIconGenerator.1
        final MontageIconGenerator this$0;

        {
            this.this$0 = this;
        }

        @Override // com.bilibili.montage.avutil.MontageIconGenerator.IIconCallback
        public void onIconReady(Bitmap bitmap, long j7, long j8) {
            if (this.this$0.mCallback != null) {
                this.this$0.mCallback.onIconReady(bitmap, j7, j8);
            }
        }
    };

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/avutil/MontageIconGenerator$EventHandler.class */
    public static class EventHandler extends Handler {
        private final WeakReference<MontageIconGenerator> mWeakGenerator;

        public EventHandler(MontageIconGenerator montageIconGenerator, Looper looper) {
            super(looper);
            this.mWeakGenerator = new WeakReference<>(montageIconGenerator);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            MontageIconGenerator montageIconGenerator = this.mWeakGenerator.get();
            if (montageIconGenerator == null) {
                LogSinker.w(MontageIconGenerator.TAG, "MontageIconGenerator went away with unhandled events");
            } else {
                montageIconGenerator.handleCallback(message.what, message.arg1, message.arg2, message.obj);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/avutil/MontageIconGenerator$IIconCallback.class */
    public interface IIconCallback extends MontageImageInfo.IGrabImageCallback {
        void onIconReady(Bitmap bitmap, long j7, long j8);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/avutil/MontageIconGenerator$IconCallback.class */
    public interface IconCallback {
        void onIconReady(Bitmap bitmap, long j7, long j8);
    }

    public MontageIconGenerator() {
        HandlerThread handlerThread = new HandlerThread("native-iconGen-message-thread");
        this.mHandlerThread = handlerThread;
        handlerThread.start();
        this.mEventHandler = new EventHandler(this, this.mHandlerThread.getLooper());
    }

    public static MontageRational calculateInSampleSize(int i7, int i8, int i9) {
        return (i7 <= 0 || i8 <= 0 || i9 <= 0) ? new MontageRational(1, 1) : new MontageRational(i9, Math.min(i7, i8));
    }

    public void cancelTask(long j7) {
        MontageImageGrabber montageImageGrabber = this.mImageGrabber;
        if (montageImageGrabber != null) {
            montageImageGrabber.cancelTask(j7);
        }
    }

    public long getIcon(String str, long j7, int i7) {
        return getIcon(str, j7, 160, i7);
    }

    public long getIcon(String str, long j7, int i7, int i8) {
        MontageTimeline montageTimeline;
        if (this.mFileToTimeline.containsKey(str)) {
            montageTimeline = this.mFileToTimeline.get(str);
        } else {
            MontageTimeline montageTimelineCreateSingleVideoClipTimeline = MontageTimelineHelper.createSingleVideoClipTimeline(str, -1);
            this.mFileToTimeline.put(str, montageTimelineCreateSingleVideoClipTimeline);
            montageTimeline = montageTimelineCreateSingleVideoClipTimeline;
        }
        MontageVideoResolution videoRes = montageTimeline.getVideoRes();
        this.proxyScale = calculateInSampleSize(videoRes.imageWidth, videoRes.imageHeight, i7);
        if (this.mImageGrabber == null) {
            this.mImageGrabber = new MontageImageGrabber(this.mEventHandler, null);
        }
        return this.mImageGrabber.grabImageFromTimelineAsync(montageTimeline, j7, j7, 2, this.proxyScale, 0, i8, this.mIconCallback, false, false);
    }

    public Bitmap getIconFromCache(String str, long j7, int i7) {
        return getIconFromCache(str, j7, 160, i7);
    }

    public Bitmap getIconFromCache(String str, long j7, int i7, int i8) {
        return null;
    }

    public void handleCallback(int i7, int i8, int i9, Object obj) {
        IIconCallback iIconCallback;
        MontageImageInfo montageImageInfo = (MontageImageInfo) obj;
        if (montageImageInfo == null || (iIconCallback = (IIconCallback) montageImageInfo.callback) == null || i7 != 6) {
            return;
        }
        switch (i8) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                iIconCallback.onIconReady(montageImageInfo.bitmap, montageImageInfo.timestamp, montageImageInfo.taskId);
                break;
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

    public void setIconCallback(IconCallback iconCallback) {
        this.mCallback = iconCallback;
    }
}
