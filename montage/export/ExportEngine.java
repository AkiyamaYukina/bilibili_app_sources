package com.bilibili.montage.export;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bilibili.live.streaming.LiveConstants;
import com.bilibili.montage.avinfo.MontageRational;
import com.bilibili.montage.avutil.LogSinker;
import com.bilibili.montage.timeline.MontageTimeline;
import com.bilibili.studio.videoeditor.ms.transition.TransitionInfo;
import com.bilibili.studio.videoeditor.nvsstreaming.EditNvsTimelineInfoBase;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/export/ExportEngine.class */
public class ExportEngine {
    public static final String COMPILE_AUDIO_ENCODER_NAME_AAC = "aac";
    public static final int COMPILE_ENCODE_PROFILE_BASELINE = 1;
    public static final int COMPILE_ENCODE_PROFILE_HIGH = 3;
    public static final int COMPILE_ENCODE_PROFILE_MAIN = 2;
    public static final int COMPILE_FLAG_BUDDY_HOST_VIDEO_FRAME = 32;
    public static final int COMPILE_FLAG_BUDDY_ORIGIN_VIDEO_FRAME = 8192;
    public static final int COMPILE_FLAG_DISABLE_ALIGN_VIDEO_SIZE = 256;
    public static final int COMPILE_FLAG_DISABLE_HARDWARE_ENCODER = 1;
    public static final int COMPILE_FLAG_DISABLE_MEDIA_MUXER = 16;
    public static final int COMPILE_FLAG_DISABLE_PRELOADER_ON_SOURCE = 64;
    public static final int COMPILE_FLAG_DONT_USE_INPUT_SURFACE = 2;
    public static final int COMPILE_FLAG_IGNORE_TIMELINE_VIDEO_SIZE = 2048;
    public static final int COMPILE_FLAG_LOW_PIPELINE_SIZE = 4096;
    public static final int COMPILE_FLAG_ONLY_AUDIO = 8;
    public static final int COMPILE_FLAG_ONLY_VIDEO = 4;
    public static final int COMPILE_FLAG_SKIP_VIDEO_TRANSCODE = 32768;
    public static final int COMPILE_FLAG_TRUNCATE_AUDIO_STREAM = 128;
    public static final int COMPILE_FLAG_USE_SOFTWARE_AUDIO_ENCODER = 1024;
    public static final int COMPILE_FLAG_VARIABLE_FRAME_RATE_ENABLE = 16384;
    public static final String COMPILE_SOFTWARE_ENCODER_MODE_ABR = "abr";
    public static final String COMPILE_SOFTWARE_ENCODER_MODE_CRF = "crf";
    public static final String COMPILE_SOFTWARE_ENCODER_PRESET_FAST = "fast";
    public static final String COMPILE_SOFTWARE_ENCODER_PRESET_FASTER = "faster";
    public static final String COMPILE_SOFTWARE_ENCODER_PRESET_MEDIUM = "medium";
    public static final String COMPILE_SOFTWARE_ENCODER_PRESET_PLACEBO = "placebo";
    public static final String COMPILE_SOFTWARE_ENCODER_PRESET_SLOW = "slow";
    public static final String COMPILE_SOFTWARE_ENCODER_PRESET_SLOWER = "slower";
    public static final String COMPILE_SOFTWARE_ENCODER_PRESET_SUPERFAST = "superfast";
    public static final String COMPILE_SOFTWARE_ENCODER_PRESET_ULTRAFAST = "ultrafast";
    public static final String COMPILE_SOFTWARE_ENCODER_PRESET_VERYFAST = "veryfast";
    public static final String COMPILE_SOFTWARE_ENCODER_PRESET_VERYSLOW = "veryslow";
    public static final String COMPILE_VIDEO_ENCODER_NAME_H264 = "avc";
    public static final String COMPILE_VIDEO_ENCODER_NAME_H265 = "hevc";
    public static final int ENCODER_TYPE_HARDWARE = 0;
    public static final int ENCODER_TYPE_SOFTWARE = 1;
    public static final int EXPORT_AUDIO_DECODING_ERROR = 12;
    public static final int EXPORT_CANCELATION = 1;
    public static final int EXPORT_ENCODER_RETRY_ERROR = 11;
    public static final int EXPORT_ENCODING_ERROR = 3;
    public static final int EXPORT_FILE_NOT_EXIST_ERROR = 14;
    public static final int EXPORT_FILE_PERMISSION_DENIED_ERROR = 17;
    public static final int EXPORT_INVALID_PARAMETER_ERROR = 6;
    public static final int EXPORT_MUXING_ERROR = 5;
    public static final int EXPORT_NOT_SUPPORT_CODEC_ERROR = 18;
    public static final int EXPORT_NO_AVSTREAMING_ERROR = 10;
    public static final int EXPORT_NO_DISK_SPACE_ERROR = 13;
    public static final int EXPORT_NO_ERROR = 0;
    public static final int EXPORT_RENDER_ENGINE_ERROR = 7;
    public static final int EXPORT_RENDER_INIT_ERROR = 15;
    public static final int EXPORT_SETUP_DECODER_ERROR = 9;
    public static final int EXPORT_SETUP_ENCODER_ERROR = 2;
    public static final int EXPORT_SETUP_MUXER_ERROR = 8;
    public static final int EXPORT_TEXTURECONVERT_INIT_ERROR = 16;
    public static final int EXPORT_VIDEO_DECODING_ERROR = 4;
    public static final int FILL_MODE_PRESERVE_ASPECT_CROP = 1;
    public static final int FILL_MODE_PRESERVE_ASPECT_FIT = 2;
    public static final int FILL_MODE_STRETCH = 0;
    private static final float H265_TO_H264_RATIO = 0.67f;
    private static final float HDR_TO_H264_RATIO = 1.5f;
    public static final int MONTAGE_EXPORT_COMPLETED = 1;
    public static final int MONTAGE_EXPORT_ERROR = 4;
    public static final int MONTAGE_EXPORT_HARDWARE_ENCODER = 2;
    public static final int MONTAGE_EXPORT_MESSAGE = 2;
    public static final int MONTAGE_EXPORT_PROGRESS = 0;
    public static final int MONTAGE_EXPORT_SKIP_TRANSCODE = 3;
    private static final String TAG = "ExportEngine";
    private static final Map<Integer, String> mErrorInfo;
    private boolean isHardwareEncoder;
    private boolean isSkipTranscode;
    private String mActionID;
    private ExportConfig mConfig;
    private long mEndTime;
    private int mErrorCode;
    private String mErrorMessage;
    private AtomicReference<EventHandler> mEventHandler;
    private IExportCallback mExportCallback;
    private HandlerThread mHandlerThread;
    private long mNativeEngine;
    private final Object mNativeLock;
    private long mStartTime;
    private MontageTimeline mTimeline;
    private String videoEncoderName;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/export/ExportEngine$EventHandler.class */
    public static class EventHandler extends Handler {
        private final WeakReference<ExportEngine> mWeakEngine;

        public EventHandler(ExportEngine exportEngine, Looper looper) {
            super(looper);
            this.mWeakEngine = new WeakReference<>(exportEngine);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            ExportEngine exportEngine = this.mWeakEngine.get();
            if (exportEngine == null) {
                LogSinker.w(ExportEngine.TAG, "ExportEngine went away with unhandled events");
                return;
            }
            int i7 = message.what;
            long jLongValue = 0;
            boolean z6 = true;
            if (i7 == 2) {
                int i8 = message.arg1;
                if (i8 == 0) {
                    IExportCallback iExportCallback = exportEngine.mExportCallback;
                    String str = exportEngine.mActionID;
                    MontageTimeline montageTimeline = exportEngine.mTimeline;
                    Object obj = message.obj;
                    iExportCallback.onCompileProgress(str, montageTimeline, obj != null ? ((Float) obj).floatValue() : 0.0f);
                    return;
                }
                if (i8 != 1) {
                    if (i8 == 2) {
                        exportEngine.isHardwareEncoder = message.arg2 != 0;
                        Object obj2 = message.obj;
                        if (obj2 != null) {
                            exportEngine.videoEncoderName = ((String) obj2).equals("hevc") ? "hevc" : "avc";
                            return;
                        }
                        return;
                    }
                    if (i8 != 3) {
                        return;
                    }
                    if (message.arg2 == 0) {
                        z6 = false;
                    }
                    exportEngine.isSkipTranscode = z6;
                    LogSinker.i(ExportEngine.TAG, "Catch isSkipTranscode: " + exportEngine.isSkipTranscode);
                    return;
                }
                ExportResult exportResult = new ExportResult();
                exportResult.actionID = exportEngine.mActionID;
                exportResult.timeline = exportEngine.mTimeline;
                exportResult.isHardwareEncoder = exportEngine.isHardwareEncoder;
                exportResult.errorType = exportEngine.mErrorCode;
                exportResult.errorInfo = exportEngine.mErrorMessage;
                Object obj3 = message.obj;
                if (obj3 != null) {
                    jLongValue = ((Long) obj3).longValue();
                }
                exportResult.costTime = jLongValue;
                exportResult.isSkipTranscode = exportEngine.isSkipTranscode;
                exportEngine.mExportCallback.onCompileCompleted(exportResult);
                LogSinker.w(ExportEngine.TAG, "onCompileCompleted error_code: " + exportEngine.mErrorCode + ", error_info: " + exportEngine.mErrorMessage + ", isHardwareEncoder:" + exportEngine.isHardwareEncoder + ", cost time:" + exportResult.costTime + ", isSkipTranscode:" + exportResult.isSkipTranscode);
                return;
            }
            if (i7 != 4) {
                return;
            }
            switch (message.arg1) {
                case 1:
                    if (exportEngine.mErrorCode == 0) {
                        exportEngine.mErrorCode = message.arg1;
                        Object obj4 = message.obj;
                        exportEngine.mErrorMessage = obj4 != null ? (String) obj4 : (String) ExportEngine.mErrorInfo.get(Integer.valueOf(message.arg1));
                        LogSinker.e(ExportEngine.TAG, "engine.mErrorMessage: " + exportEngine.mErrorMessage);
                        return;
                    }
                    return;
                case 2:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                    break;
                case 3:
                    if (exportEngine.isHardwareEncoder && exportEngine.mErrorCode == 0) {
                        exportEngine.mEventHandler.set(null);
                        exportEngine.destroyNativeEngine();
                        if ("hevc" == exportEngine.videoEncoderName) {
                            exportEngine.mConfig.videoEncoderName = "avc";
                            if (exportEngine.mConfig.videoHdrColorTransfer == null || exportEngine.mConfig.videoHdrColorTransfer.equals("none")) {
                                exportEngine.mConfig.videoBitrate = (int) (exportEngine.mConfig.videoBitrate / ExportEngine.H265_TO_H264_RATIO);
                            } else {
                                LogSinker.i(ExportEngine.TAG, "[hdr] videoHdrColorTransfer is " + exportEngine.mConfig.videoHdrColorTransfer);
                                exportEngine.mConfig.videoBitrate = (int) (((float) exportEngine.mConfig.videoBitrate) / ExportEngine.HDR_TO_H264_RATIO);
                            }
                            LogSinker.i(ExportEngine.TAG, "HwEncoder Failed Switch To h264Encoder:");
                        } else {
                            exportEngine.mConfig.videoEncoderType = 1;
                            LogSinker.i(ExportEngine.TAG, "HwEncoder Failed Switch To SwEncoder:");
                        }
                        exportEngine.mEventHandler.set(new EventHandler(exportEngine, exportEngine.mHandlerThread.getLooper()));
                        exportEngine.createNativeEngine();
                        ExportResult exportResult2 = new ExportResult();
                        exportResult2.actionID = exportEngine.mActionID;
                        exportResult2.timeline = exportEngine.mTimeline;
                        exportResult2.isHardwareEncoder = true;
                        exportResult2.errorType = 11;
                        exportResult2.errorInfo = (String) ExportEngine.mErrorInfo.get(11);
                        exportResult2.costTime = 0L;
                        exportResult2.isSkipTranscode = exportEngine.isSkipTranscode;
                        exportEngine.mExportCallback.onCompileCompleted(exportResult2);
                        return;
                    }
                    break;
                case 11:
                default:
                    return;
            }
            LogSinker.e(ExportEngine.TAG, "export error code = " + message.arg1);
            exportEngine.mExportCallback.onCompileFailed(exportEngine.mActionID, exportEngine.mTimeline, message.arg1);
            if (exportEngine.mErrorCode == 0) {
                exportEngine.stop();
            }
            if (exportEngine.mErrorCode == 0) {
                exportEngine.mErrorCode = message.arg1;
                Object obj5 = message.obj;
                exportEngine.mErrorMessage = obj5 != null ? (String) obj5 : (String) ExportEngine.mErrorInfo.get(Integer.valueOf(message.arg1));
                LogSinker.e(ExportEngine.TAG, "engine.mErrorMessage: " + exportEngine.mErrorMessage);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/export/ExportEngine$ExportConfig.class */
    public static class ExportConfig {
        public String outputFilePath;
        public String videoCacheFilePath;
        public int compileFlag = 12;
        public int fillMode = 0;
        public int videoEncoderType = 0;
        public int width = 0;
        public int height = 0;
        public MontageRational frameRate = new MontageRational(30, 1);
        public int gopSize = 120;
        public int videoBitrate = 1500000;
        public boolean optimizeForNetworkUse = true;
        public String videoEncoderName = "avc";
        public int videoEncoderProfile = 1;
        public int audioBitrate = LiveConstants.AUDIO_BITRATE_128;
        public int sampleRate = EditNvsTimelineInfoBase.DEFAULT_SAMPLE_RATE;
        public int nbChannel = 2;
        public boolean enableLosslessAudio = false;
        public String softwareEncoderPreset = ExportEngine.COMPILE_SOFTWARE_ENCODER_PRESET_FASTER;
        public int softwareEncoderCRF = 23;
        public int softwareEncoderCRFBitrateMax = 63;
        public String softwareEncoderMode = ExportEngine.COMPILE_SOFTWARE_ENCODER_MODE_CRF;
        public String audioEncoderName = ExportEngine.COMPILE_AUDIO_ENCODER_NAME_AAC;
        public long videoCacheFileDuration = TransitionInfo.DEFAULT_DURATION;
        public boolean enableBreakpointContinuation = false;
        public String creationTime = null;
        public boolean useOperatingRate = false;
        public String videoHdrColorTransfer = "none";
        public boolean videoEncoderSupportAlphaChannel = false;
        public String metadataDescription = null;
        public String fileMetadata = null;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/export/ExportEngine$ExportResult.class */
    public static class ExportResult {
        public String actionID;
        public long costTime;
        public String errorInfo;
        public int errorType;
        public int flags;
        public boolean isHardwareEncoder;
        public boolean isSkipTranscode;
        public MontageTimeline timeline;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/export/ExportEngine$IExportCallback.class */
    public interface IExportCallback {
        void onCompileCompleted(ExportResult exportResult);

        void onCompileFailed(String str, MontageTimeline montageTimeline, int i7);

        void onCompileProgress(String str, MontageTimeline montageTimeline, float f7);
    }

    static {
        HashMap map = new HashMap();
        mErrorInfo = map;
        map.put(0, "No error");
        map.put(1, "User cancelled");
        map.put(2, "Encoder setup failed");
        map.put(3, "Encoding error");
        map.put(4, "Video decoding error");
        map.put(5, "Muxing error");
        map.put(6, "Invalid argument");
        map.put(7, "RenderEngine error");
        map.put(8, "Muxer setup failed");
        map.put(9, "Decoder setup failed");
        map.put(10, "Invalid audio and video streaming");
        map.put(11, "Phone hardware error, switch to software");
        map.put(12, "Audio decoding error");
        map.put(13, "No space left on device");
        map.put(14, "file not exist");
        map.put(15, "render engine init error");
        map.put(16, "texture convert init error");
        map.put(17, "file permission denied");
        map.put(18, "not support codec");
    }

    private ExportEngine() {
        this.mEventHandler = null;
        this.mTimeline = null;
        this.mConfig = null;
        this.isHardwareEncoder = true;
        this.isSkipTranscode = false;
        this.videoEncoderName = "avc";
        this.mErrorCode = 0;
        this.mErrorMessage = "";
        this.mNativeEngine = 0L;
        this.mNativeLock = new Object();
        this.mActionID = "";
        this.mExportCallback = new IExportCallback(this) { // from class: com.bilibili.montage.export.ExportEngine.1
            final ExportEngine this$0;

            {
                this.this$0 = this;
            }

            @Override // com.bilibili.montage.export.ExportEngine.IExportCallback
            public void onCompileCompleted(ExportResult exportResult) {
                LogSinker.i(ExportEngine.TAG, "onCompileCompleted errorType:" + exportResult.errorType + ", errorInfo:" + exportResult.errorInfo + ", isHardwareEncoder:" + exportResult.isHardwareEncoder + ", cost time:" + exportResult.costTime + ", isSkipTranscode:" + exportResult.isSkipTranscode);
            }

            @Override // com.bilibili.montage.export.ExportEngine.IExportCallback
            public void onCompileFailed(String str, MontageTimeline montageTimeline, int i7) {
                LogSinker.e(ExportEngine.TAG, "onCompileFailed, error:" + i7);
            }

            @Override // com.bilibili.montage.export.ExportEngine.IExportCallback
            public void onCompileProgress(String str, MontageTimeline montageTimeline, float f7) {
            }
        };
    }

    public ExportEngine(MontageTimeline montageTimeline, IExportCallback iExportCallback, ExportConfig exportConfig, long j7, long j8, String str) {
        this.mEventHandler = null;
        this.mTimeline = null;
        this.mConfig = null;
        this.isHardwareEncoder = true;
        this.isSkipTranscode = false;
        this.videoEncoderName = "avc";
        this.mErrorCode = 0;
        this.mErrorMessage = "";
        this.mNativeEngine = 0L;
        this.mNativeLock = new Object();
        this.mActionID = "";
        this.mExportCallback = new IExportCallback(this) { // from class: com.bilibili.montage.export.ExportEngine.1
            final ExportEngine this$0;

            {
                this.this$0 = this;
            }

            @Override // com.bilibili.montage.export.ExportEngine.IExportCallback
            public void onCompileCompleted(ExportResult exportResult) {
                LogSinker.i(ExportEngine.TAG, "onCompileCompleted errorType:" + exportResult.errorType + ", errorInfo:" + exportResult.errorInfo + ", isHardwareEncoder:" + exportResult.isHardwareEncoder + ", cost time:" + exportResult.costTime + ", isSkipTranscode:" + exportResult.isSkipTranscode);
            }

            @Override // com.bilibili.montage.export.ExportEngine.IExportCallback
            public void onCompileFailed(String str2, MontageTimeline montageTimeline2, int i7) {
                LogSinker.e(ExportEngine.TAG, "onCompileFailed, error:" + i7);
            }

            @Override // com.bilibili.montage.export.ExportEngine.IExportCallback
            public void onCompileProgress(String str2, MontageTimeline montageTimeline2, float f7) {
            }
        };
        if (montageTimeline == null || exportConfig == null) {
            return;
        }
        this.mActionID = str;
        this.mExportCallback = iExportCallback;
        HandlerThread handlerThread = new HandlerThread("native-export-message-thread");
        this.mHandlerThread = handlerThread;
        handlerThread.start();
        this.mEventHandler = new AtomicReference<>(new EventHandler(this, this.mHandlerThread.getLooper()));
        this.mTimeline = montageTimeline;
        this.mConfig = exportConfig;
        this.mStartTime = j7;
        this.mEndTime = j8;
        createNativeEngine();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createNativeEngine() {
        synchronized (this.mNativeLock) {
            long jNativeSetup = nativeSetup(new WeakReference(this), this.mTimeline, this.mConfig, this.mStartTime, this.mEndTime);
            this.mNativeEngine = jNativeSetup;
            if (0 == jNativeSetup) {
                this.mEventHandler.get().sendMessage(this.mEventHandler.get().obtainMessage(4, 6, 0, null));
                this.mEventHandler.get().sendMessage(this.mEventHandler.get().obtainMessage(2, 1, 0, null));
            } else {
                nativeInit(jNativeSetup);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destroyNativeEngine() {
        synchronized (this.mNativeLock) {
            long j7 = this.mNativeEngine;
            if (0 != j7) {
                nativeDestroy(j7);
                this.mNativeEngine = 0L;
            }
        }
    }

    private native void nativeCancel(long j7);

    private native void nativeDestroy(long j7);

    private native void nativeInit(long j7);

    private static native void nativeSetAuroraResPath(String str);

    private native long nativeSetup(Object obj, MontageTimeline montageTimeline, ExportConfig exportConfig, long j7, long j8);

    private native void nativeStop(long j7);

    private static void postEventFromNative(Object obj, int i7, int i8, int i9, Object obj2) {
        ExportEngine exportEngine;
        if (obj == null || (exportEngine = (ExportEngine) ((WeakReference) obj).get()) == null || exportEngine.mEventHandler.get() == null) {
            return;
        }
        exportEngine.mEventHandler.get().sendMessage(exportEngine.mEventHandler.get().obtainMessage(i7, i8, i9, obj2));
    }

    public static void setAuroraResPath(String str) {
        nativeSetAuroraResPath(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stop() {
        synchronized (this.mNativeLock) {
            long j7 = this.mNativeEngine;
            if (0 != j7) {
                nativeStop(j7);
            }
        }
    }

    public void cancel() {
        synchronized (this.mNativeLock) {
            long j7 = this.mNativeEngine;
            if (0 != j7) {
                nativeCancel(j7);
            }
        }
    }

    public void destroy() {
        destroyNativeEngine();
        HandlerThread handlerThread = this.mHandlerThread;
        if (handlerThread != null) {
            handlerThread.quit();
            this.mHandlerThread = null;
        }
        AtomicReference<EventHandler> atomicReference = this.mEventHandler;
        if (atomicReference != null) {
            atomicReference.set(null);
            this.mEventHandler = null;
        }
    }

    public String getActionID() {
        return this.mActionID;
    }
}
