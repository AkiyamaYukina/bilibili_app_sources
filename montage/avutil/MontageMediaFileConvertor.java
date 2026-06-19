package com.bilibili.montage.avutil;

import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.Hashtable;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/avutil/MontageMediaFileConvertor.class */
public class MontageMediaFileConvertor {
    public static final String CONVERTOR_AUDIO_BITRATE = "audio bitrate";
    public static final String CONVERTOR_AUDIO_CHANNEL_MAP = "convertor-audio-channel-map";
    public static final String CONVERTOR_AUDIO_ENCODER_NAME = "audio encoder name";
    public static final String CONVERTOR_BITRATE = "bitrate";
    public static final String CONVERTOR_CUSTOM_AUDIO_CHANNEL = "custom-audio-channel";
    public static final String CONVERTOR_CUSTOM_AUDIO_PCM_FILE = "custom-audio-pcm-file";
    public static final String CONVERTOR_CUSTOM_AUDIO_SAMPLE_RATE = "custom-audio-sample-rate";
    public static final String CONVERTOR_CUSTOM_VIDEO_FRAME_RATE = "custom-video-frame-rate";
    public static final String CONVERTOR_CUSTOM_VIDEO_HEIGHT = "custom-video-height";
    public static final String CONVERTOR_DETECTED_AUDIO_MUTE_FACTOR = "detected_audio_mute";
    public static final String CONVERTOR_DISABLE_HARDWARE_VIDEO_DECODER = "disable_hardware_video_decoder";
    public static final String CONVERTOR_ENABLE_HDR = "enable hdr";
    public static final int CONVERTOR_ERROR_AUDIO_ERROR = 7;
    public static final int CONVERTOR_ERROR_CODE_CANCEL = 1;
    public static final int CONVERTOR_ERROR_CODE_NO_ERROR = 0;
    public static final int CONVERTOR_ERROR_INIT_EXPORTER_ERROR = 11;
    public static final int CONVERTOR_ERROR_INVALID_PARAMETER_ERROR = 9;
    public static final int CONVERTOR_ERROR_OTHER_EXPORT_ERROR = 12;
    public static final int CONVERTOR_ERROR_OTHER_REMUX_ERROR = 13;
    public static final int CONVERTOR_ERROR_PARSE_FILE_ERROR = 10;
    public static final int CONVERTOR_ERROR_REACH_EOF_ERROR = 8;
    public static final int CONVERTOR_ERROR_TERMINAL_ERROR = 14;
    public static final int CONVERTOR_ERROR_UNKNOWN = 65535;
    public static final int CONVERTOR_ERROR_VIDEO_DECODER_ERROR = 4;
    public static final int CONVERTOR_ERROR_VIDEO_DECODING_ERROR = 5;
    public static final int CONVERTOR_ERROR_VIDEO_ENCODER_SETUP_ERROR = 2;
    public static final int CONVERTOR_ERROR_VIDEO_ENCODING_ERROR = 3;
    public static final int CONVERTOR_ERROR_VIDEO_ERROR = 6;
    public static final String CONVERTOR_GOP_SIZE = "gopsize";
    public static final String CONVERTOR_MAX_CACHE_SIZE_IN_MEMORY = "max_cache_size_in_memory";
    public static final int CONVERTOR_MESSAGE_COMPLETED = 1;
    public static final int CONVERTOR_MESSAGE_PROGRESS = 0;
    public static final String CONVERTOR_NO_AUDIO = "convertor-no-audio";
    public static final String CONVERTOR_NO_VIDEO = "convertor-no-video";
    public static final String CONVERTOR_REVERSE_AUDIO_STREAM = "convertor-reverse-audio";
    public static final int MONTAGE_CONVERTOR_ERROR = 9;
    public static final int MONTAGE_CONVERTOR_MESSAGE = 8;
    private static final String TAG = "MontageMediaFileConvertor";
    private long mNativeMediaConvertor;
    private AtomicReference<MediaFileConvertorCallback> mCallback = new AtomicReference<>(null);
    private AtomicReference<Handler> mCallbackHandler = new AtomicReference<>(null);
    private Set<Long> taskSet = new TreeSet();
    private ReentrantLock taskSetLock = new ReentrantLock();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/avutil/MontageMediaFileConvertor$ConvertorTask.class */
    public static class ConvertorTask {
        String dstUrl;
        long id;
        String srcUrl;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/avutil/MontageMediaFileConvertor$MediaFileConvertorCallback.class */
    public interface MediaFileConvertorCallback {
        void notifyAudioMuteRage(long j7, long j8, long j9);

        void onFinish(long j7, String str, String str2, int i7);

        void onProgress(long j7, float f7);
    }

    public MontageMediaFileConvertor() {
        this.mNativeMediaConvertor = 0L;
        this.mNativeMediaConvertor = nativeInit(new WeakReference(this));
    }

    private native void nativeCancelTask(long j7, long j8);

    private native void nativeClose(long j7);

    private native long nativeConvertMediaFile(long j7, String str, String str2, boolean z6, long j8, long j9, Object obj);

    private native long nativeInit(Object obj);

    private static native void nativeSetAuroraResPath(String str);

    private static void postEventFromNative(Object obj, int i7, int i8, int i9, Object obj2) {
        if (obj == null || obj2 == null) {
            return;
        }
        MontageMediaFileConvertor montageMediaFileConvertor = (MontageMediaFileConvertor) ((WeakReference) obj).get();
        ConvertorTask convertorTask = (ConvertorTask) obj2;
        if (montageMediaFileConvertor != null) {
            if (i7 != 8) {
                if (i7 == 9 && i8 != 0) {
                    montageMediaFileConvertor.notifyFinish(convertorTask.id, convertorTask.srcUrl, convertorTask.dstUrl, i8);
                    return;
                }
                return;
            }
            if (i8 == 0) {
                montageMediaFileConvertor.notifyProgress(convertorTask.id, i9 / 100.0f);
            } else {
                if (i8 != 1) {
                    return;
                }
                montageMediaFileConvertor.notifyFinish(convertorTask.id, convertorTask.srcUrl, convertorTask.dstUrl, 0);
            }
        }
    }

    public static void setAuroraResPath(String str) {
        nativeSetAuroraResPath(str);
    }

    public void cancelTask(long j7) {
        synchronized (this) {
            if (!isReleased()) {
                nativeCancelTask(this.mNativeMediaConvertor, j7);
            }
        }
    }

    public long convertMediaFile(String str, String str2, boolean z6, long j7, long j8, Hashtable<String, Object> hashtable) {
        long jNativeConvertMediaFile;
        synchronized (this) {
            jNativeConvertMediaFile = nativeConvertMediaFile(this.mNativeMediaConvertor, str, str2, z6, j7, j8, hashtable);
            this.taskSetLock.lock();
            this.taskSet.add(Long.valueOf(jNativeConvertMediaFile));
            this.taskSetLock.unlock();
        }
        return jNativeConvertMediaFile;
    }

    public void finalize() throws Throwable {
        release();
        super.finalize();
    }

    public boolean isReleased() {
        return this.mNativeMediaConvertor == 0;
    }

    public void notifyFinish(long j7, String str, String str2, int i7) {
        this.taskSetLock.lock();
        if (!this.taskSet.contains(Long.valueOf(j7))) {
            this.taskSetLock.unlock();
            return;
        }
        this.taskSet.remove(Long.valueOf(j7));
        this.taskSetLock.unlock();
        MediaFileConvertorCallback mediaFileConvertorCallback = this.mCallback.get();
        Handler handler = this.mCallbackHandler.get();
        if (mediaFileConvertorCallback != null) {
            if (handler != null) {
                handler.post(new Runnable(this, mediaFileConvertorCallback, j7, str, str2, i7) { // from class: com.bilibili.montage.avutil.MontageMediaFileConvertor.2
                    final MontageMediaFileConvertor this$0;
                    final MediaFileConvertorCallback val$callback;
                    final String val$dstUrl;
                    final int val$eventCode;
                    final String val$srcUrl;
                    final long val$taskId;

                    {
                        this.this$0 = this;
                        this.val$callback = mediaFileConvertorCallback;
                        this.val$taskId = j7;
                        this.val$srcUrl = str;
                        this.val$dstUrl = str2;
                        this.val$eventCode = i7;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        this.val$callback.onFinish(this.val$taskId, this.val$srcUrl, this.val$dstUrl, this.val$eventCode);
                    }
                });
            } else {
                mediaFileConvertorCallback.onFinish(j7, str, str2, i7);
            }
        }
    }

    public void notifyProgress(long j7, float f7) {
        MediaFileConvertorCallback mediaFileConvertorCallback = this.mCallback.get();
        Handler handler = this.mCallbackHandler.get();
        if (mediaFileConvertorCallback != null) {
            if (handler != null) {
                handler.post(new Runnable(this, mediaFileConvertorCallback, j7, f7) { // from class: com.bilibili.montage.avutil.MontageMediaFileConvertor.1
                    final MontageMediaFileConvertor this$0;
                    final MediaFileConvertorCallback val$callback;
                    final float val$progress;
                    final long val$taskId;

                    {
                        this.this$0 = this;
                        this.val$callback = mediaFileConvertorCallback;
                        this.val$taskId = j7;
                        this.val$progress = f7;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        this.val$callback.onProgress(this.val$taskId, this.val$progress);
                    }
                });
            } else {
                mediaFileConvertorCallback.onProgress(j7, f7);
            }
        }
    }

    public void release() {
        synchronized (this) {
            if (!isReleased()) {
                nativeClose(this.mNativeMediaConvertor);
                this.mCallback.set(null);
                this.mNativeMediaConvertor = 0L;
            }
        }
    }

    public void setMediaFileConvertorCallback(MediaFileConvertorCallback mediaFileConvertorCallback, Handler handler) {
        this.mCallback.set(mediaFileConvertorCallback);
        this.mCallbackHandler.set(handler);
        if (mediaFileConvertorCallback == null || handler != null) {
            return;
        }
        this.mCallbackHandler.set(new Handler(Looper.getMainLooper()));
    }

    public void setMediaFileConvertorCallback(MediaFileConvertorCallback mediaFileConvertorCallback, boolean z6) {
        this.mCallback.set(mediaFileConvertorCallback);
        if (mediaFileConvertorCallback == null || !z6) {
            return;
        }
        this.mCallbackHandler.set(new Handler(Looper.getMainLooper()));
    }
}
