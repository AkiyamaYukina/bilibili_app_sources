package com.bilibili.studio.kaleidoscope.sdk;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bilibili.studio.kaleidoscope.sdk.extension.StreamingContextEx;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/StreamingContext.class */
public interface StreamingContext extends Ex<StreamingContextEx> {
    public static final int ASSET_PACKAGE_ASPECT_RATIO_16v9 = 1;
    public static final int ASSET_PACKAGE_ASPECT_RATIO_18v9 = 32;
    public static final int ASSET_PACKAGE_ASPECT_RATIO_1v1 = 2;
    public static final int ASSET_PACKAGE_ASPECT_RATIO_3v4 = 16;
    public static final int ASSET_PACKAGE_ASPECT_RATIO_4v3 = 8;
    public static final int ASSET_PACKAGE_ASPECT_RATIO_9v16 = 4;
    public static final int ASSET_PACKAGE_ASPECT_RATIO_9v18 = 64;
    public static final int AV_FILEINFO_EXTRA_INFO = 1;
    public static final int AV_FILEINFO_EXTRA_NULL = 0;
    public static final int AV_FILEINFO_EXTRA_PIXELFORMAT = 1;
    public static final int AV_FILEINFO_EXTRA_VIDEO_CODEC_ID = 2;
    public static final int BUFFER_IMAGE_ROTATION_0 = 0;
    public static final int BUFFER_IMAGE_ROTATION_180 = 2;
    public static final int BUFFER_IMAGE_ROTATION_270 = 3;
    public static final int BUFFER_IMAGE_ROTATION_90 = 1;
    public static final int CAMERA_FLASH_MODE_AUTO = 4;
    public static final int CAMERA_FLASH_MODE_OFF = 1;
    public static final int CAMERA_FLASH_MODE_ON = 2;
    public static final int CAMERA_FLASH_MODE_TORCH = 8;
    public static final int CAPTURE_DEVICE_ERROR_SERVER_DIED = 2;
    public static final int CAPTURE_DEVICE_ERROR_UNKNOWN = 1;
    public static final int CLEAR_CACHE_FLAG_AVFILE_INFO = 8;
    public static final int CLEAR_CACHE_FLAG_AVFILE_KEYFRAME_INFO = 16;
    public static final int CLEAR_CACHE_FLAG_CAPTION_FONT_INFO = 32;
    public static final int CLEAR_CACHE_FLAG_ICON_ENGINE = 2;
    public static final int CLEAR_CACHE_FLAG_STREAMING_ENGINE = 1;
    public static final int CLEAR_CACHE_FLAG_WAVEFORM_ENGINE = 4;
    public static final String COMPILE_AUDIO_BITRATE = "audio bitrate";
    public static final String COMPILE_AUDIO_ENCODER_NAME = "audio encoder name";
    public static final String COMPILE_BITRATE = "bitrate";
    public static final int COMPILE_BITRATE_GRADE_HIGH = 2;
    public static final int COMPILE_BITRATE_GRADE_LOW = 0;
    public static final int COMPILE_BITRATE_GRADE_MEDIUM = 1;
    public static final String COMPILE_CREATION_TIME = "creation time";
    public static final int COMPILE_ENCODE_PROFILE_BASELINE = 1;
    public static final int COMPILE_ENCODE_PROFILE_HIGH = 3;
    public static final int COMPILE_ENCODE_PROFILE_MAIN = 2;
    public static final int COMPILE_ERROR_TYPE_Cancelation = 1;
    public static final int COMPILE_ERROR_TYPE_ENCODER_RETRY_ERROR = 11;
    public static final int COMPILE_ERROR_TYPE_MUXING_ERROR = 5;
    public static final int COMPILE_ERROR_TYPE_NO_ERROR = 0;
    public static final int COMPILE_ERROR_TYPE_VIDEO_DECODING_ERROR = 4;
    public static final int COMPILE_ERROR_TYPE_VIDEO_ENCODER_SETUP_ERROR = 2;
    public static final int COMPILE_ERROR_TYPE_VIDEO_ENCODING_ERROR = 3;
    public static final String COMPILE_FILE_META_DATA = "file metadata";
    public static final String COMPILE_FPS = "fps";
    public static final String COMPILE_GOP_SIZE = "gopsize";
    public static final String COMPILE_LOSSLESS_AUDIO = "lossless audio";
    public static final String COMPILE_METADATADESCRIPTION = "metadata description";
    public static final String COMPILE_OPTIMIZE_FOR_NETWORK_USE = "optimize-for-network-use";
    public static final String COMPILE_SOFTWARE_ENCODER_CRF = "software encorder crf";
    public static final String COMPILE_SOFTWARE_ENCODER_CRF_BITRATE_MAX = "software encorder crf bitrate max";
    public static final String COMPILE_SOFTWARE_ENCODER_MODE = "software encorder mode";
    public static final String COMPILE_SOFTWARE_ENCODER_PRESET = "software encorder preset";
    public static final String COMPILE_USE_OPERATING_RATE = "use operating rate";
    public static final String COMPILE_VIDEO_CACHE_FILE_DURATION = "cache file duration";
    public static final String COMPILE_VIDEO_CACHE_FILE_PATH = "cache file path";
    public static final String COMPILE_VIDEO_ENABLE_BREAKPOINT_CONTINUATION = "enable breakpoint continuation";
    public static final String COMPILE_VIDEO_ENCODER_NAME = "video encoder name";
    public static final String COMPILE_VIDEO_ENCODER_PROFILE = "encorder profile";
    public static final String COMPILE_VIDEO_ENCODER_SUPPORT_ALPHA_CHANNEL = "alpha channel supported";
    public static final String COMPILE_VIDEO_HDR_COLOR_TRANSFER = "encorder color transfer";
    public static final int COMPILE_VIDEO_RESOLUTION_GRADE_1080 = 3;
    public static final int COMPILE_VIDEO_RESOLUTION_GRADE_2160 = 4;
    public static final int COMPILE_VIDEO_RESOLUTION_GRADE_360 = 0;
    public static final int COMPILE_VIDEO_RESOLUTION_GRADE_480 = 1;
    public static final int COMPILE_VIDEO_RESOLUTION_GRADE_720 = 2;
    public static final int COMPILE_VIDEO_RESOLUTION_GRADE_CUSTOM = 256;
    public static final int CREATE_TIMELINE_FLAG_DONT_ADD_DEFAULT_VIDEO_TRANSITION = 16;
    public static final int CREATE_TIMELINE_FLAG_LONGEST_DURATION_CONSIDER_ALL_TRACKS = 1;
    public static final int CREATE_TIMELINE_FLAG_SYANC_AUDIO_VIDEO_TRANS_ON_VIDEO_TRACK = 2;
    public static final int CREATE_TIMELINE_FLAG_USE_MIPMAP = 4;
    public static final int CREATE_TIMELINE_FLAG_VARIANT_IMAGE_SIZE = 8;
    public static final int DEBUG_LEVEL_DEBUG = 3;
    public static final int DEBUG_LEVEL_ERROR = 1;
    public static final int DEBUG_LEVEL_NONE = 0;
    public static final int DEBUG_LEVEL_WARNING = 2;
    public static final int HDR_CAPABILITY_FLAG_SUPPORTED_BY_EDITING = 2;
    public static final int HDR_CAPABILITY_FLAG_SUPPORTED_BY_EXPORTER = 4;
    public static final int HDR_CAPABILITY_FLAG_SUPPORTED_BY_IMPORTER = 1;
    public static final int HDR_CAPABILITY_FLAG_SUPPORTED_BY_LIVEWINDOW = 8;
    public static final int HUMAN_DETECTION_DATA_TYPE_CUSTOM_AVATAR = 5;
    public static final int HUMAN_DETECTION_DATA_TYPE_FAKE_FACE = 0;
    public static final int HUMAN_DETECTION_DATA_TYPE_MAKEUP = 1;
    public static final int HUMAN_DETECTION_DATA_TYPE_MAKEUP2 = 6;
    public static final int HUMAN_DETECTION_DATA_TYPE_PE106 = 3;
    public static final int HUMAN_DETECTION_DATA_TYPE_PE240 = 4;
    public static final int HUMAN_DETECTION_DATA_TYPE_SKIN_COLOR = 2;
    public static final int HUMAN_DETECTION_FEATURE_AVATAR_EXPRESSION = 4;
    public static final int HUMAN_DETECTION_FEATURE_EXTRA = 128;
    public static final int HUMAN_DETECTION_FEATURE_EYEBALL_LANDMARK = 4096;
    public static final int HUMAN_DETECTION_FEATURE_FACE_ACTION = 2;
    public static final int HUMAN_DETECTION_FEATURE_FACE_LANDMARK = 1;
    public static final int HUMAN_DETECTION_FEATURE_HAND_ACTION = 1024;
    public static final int HUMAN_DETECTION_FEATURE_HAND_BONE = 2048;
    public static final int HUMAN_DETECTION_FEATURE_HAND_LANDMARK = 512;
    public static final int HUMAN_DETECTION_FEATURE_IMAGE_MODE = 16;
    public static final int HUMAN_DETECTION_FEATURE_MULTI_DETECT = 8192;
    public static final int HUMAN_DETECTION_FEATURE_MULTI_THREAD = 32;
    public static final int HUMAN_DETECTION_FEATURE_SEGMENTATION_BACKGROUND = 256;
    public static final int HUMAN_DETECTION_FEATURE_SEGMENTATION_HALF_BODY = 65536;
    public static final int HUMAN_DETECTION_FEATURE_SEGMENTATION_SKY = 16384;
    public static final int HUMAN_DETECTION_FEATURE_SEMI_IMAGE_MODE = 32768;
    public static final int HUMAN_DETECTION_FEATURE_SINGLE_THREAD = 64;
    public static final int HUMAN_DETECTION_FEATURE_VIDEO_MODE = 8;
    public static final String RECORD_BITRATE = "bitrate";
    public static final String RECORD_CUSTOM_VIDEO_SIZE = "custom height";
    public static final String RECORD_GOP_SIZE = "gopsize";
    public static final int STREAMING_CONTEXT_FLAG_ASYNC_ENGINE_STATE = 16;
    public static final int STREAMING_CONTEXT_FLAG_ASYNC_INITIALIZED = 64;
    public static final int STREAMING_CONTEXT_FLAG_COMPACT_MEMORY_MODE = 2;
    public static final int STREAMING_CONTEXT_FLAG_DISABLE_CAPTURE = 2048;
    public static final int STREAMING_CONTEXT_FLAG_ENABLE_HDR_DISPLAY_WHEN_SUPPORTED = 65536;
    public static final int STREAMING_CONTEXT_FLAG_ENABLE_MAX_CACHE_CAPTION_LIMIT = 1024;
    public static final int STREAMING_CONTEXT_FLAG_INTERRUPT_STOP_FOR_INTERNAL_STOP = 262144;
    public static final int STREAMING_CONTEXT_FLAG_NEED_GIF_MOTION = 8192;
    public static final int STREAMING_CONTEXT_FLAG_NO_HARDWARE_VIDEO_READER = 8;
    public static final int STREAMING_CONTEXT_FLAG_PLAYBACK_DROP_FRAME_MODE = 4096;
    public static final int STREAMING_CONTEXT_FLAG_SUPPORT_16K_EDIT = 128;
    public static final int STREAMING_CONTEXT_FLAG_SUPPORT_4K_EDIT = 1;
    public static final int STREAMING_CONTEXT_FLAG_SUPPORT_8K_EDIT = 4;
    public static final int STREAMING_CONTEXT_FLAG_USE_SYSTEM_IMAGE_READER = 512;
    public static final int STREAMING_CONTEXT_VIDEO_DECODER_WITHOUT_SURFACE_TEXTURE = 32;
    public static final int STREAMING_ENGINE_CAPTURE_FLAG_CAPTURE_BUDDY_HOST_VIDEO_FRAME = 32;
    public static final int STREAMING_ENGINE_CAPTURE_FLAG_DISABLE_FLIP_FOR_FRONT_CAMERA = 2048;
    public static final int STREAMING_ENGINE_CAPTURE_FLAG_DONT_CAPTURE_AUDIO = 16;
    public static final int STREAMING_ENGINE_CAPTURE_FLAG_DONT_USE_SYSTEM_RECORDER = 4;
    public static final int STREAMING_ENGINE_CAPTURE_FLAG_ENABLE_TAKE_PICTURE = 8192;
    public static final int STREAMING_ENGINE_CAPTURE_FLAG_FACE_ACTION_WITH_PARTICLE = 256;
    public static final int STREAMING_ENGINE_CAPTURE_FLAG_GRAB_CAPTURED_VIDEO_FRAME = 1;
    public static final int STREAMING_ENGINE_CAPTURE_FLAG_INPUT_ASPECT_RATIO_USED = 4096;
    public static final int STREAMING_ENGINE_CAPTURE_FLAG_LOW_PIPELINE_SIZE = 512;
    public static final int STREAMING_ENGINE_CAPTURE_FLAG_STRICT_PREVIEW_VIDEO_SIZE = 8;
    public static final int STREAMING_ENGINE_COMPILE_FLAG_BUDDY_HOST_VIDEO_FRAME = 32;
    public static final int STREAMING_ENGINE_COMPILE_FLAG_BUDDY_ORIGIN_VIDEO_FRAME = 8192;
    public static final int STREAMING_ENGINE_COMPILE_FLAG_DISABLE_ALIGN_VIDEO_SIZE = 256;
    public static final int STREAMING_ENGINE_COMPILE_FLAG_DISABLE_HARDWARE_ENCODER = 1;
    public static final int STREAMING_ENGINE_COMPILE_FLAG_DISABLE_MEDIA_MUXER = 16;
    public static final int STREAMING_ENGINE_COMPILE_FLAG_DISABLE_PRELOADER_ON_SOURCE = 64;
    public static final int STREAMING_ENGINE_COMPILE_FLAG_DONT_USE_INPUT_SURFACE = 2;
    public static final int STREAMING_ENGINE_COMPILE_FLAG_IGNORE_TIMELINE_VIDEO_SIZE = 2048;
    public static final int STREAMING_ENGINE_COMPILE_FLAG_LOW_PIPELINE_SIZE = 4096;
    public static final int STREAMING_ENGINE_COMPILE_FLAG_ONLY_AUDIO = 8;
    public static final int STREAMING_ENGINE_COMPILE_FLAG_ONLY_VIDEO = 4;
    public static final int STREAMING_ENGINE_COMPILE_FLAG_SKIP_VIDEO_TRANSCODE = 32768;
    public static final int STREAMING_ENGINE_COMPILE_FLAG_TRUNCATE_AUDIO_STREAM = 128;
    public static final int STREAMING_ENGINE_COMPILE_FLAG_USE_SOFTWARE_AUDIO_ENCODER = 1024;
    public static final int STREAMING_ENGINE_COMPILE_FLAG_VARIABLE_FRAME_RATE_ENABLE = 16384;
    public static final int STREAMING_ENGINE_HARDWARE_ERROR_TYPE_VIDEO_DECODER_SETUP_ERROR = 2;
    public static final int STREAMING_ENGINE_HARDWARE_ERROR_TYPE_VIDEO_DECODING_ERROR = 3;
    public static final int STREAMING_ENGINE_HARDWARE_ERROR_TYPE_VIDEO_ENCODER_SETUP_ERROR = 0;
    public static final int STREAMING_ENGINE_HARDWARE_ERROR_TYPE_VIDEO_ENCODING_ERROR = 1;
    public static final int STREAMING_ENGINE_INTERRUPT_STOP = 4;
    public static final int STREAMING_ENGINE_PLAYBACK_EXCEPTION_TYPE_MEDIA_FILE_ERROR = 0;
    public static final int STREAMING_ENGINE_PLAYBACK_FLAG_AUTO_CACHE_ALL_CAF_FRAMES = 128;
    public static final int STREAMING_ENGINE_PLAYBACK_FLAG_BUDDY_HOST_VIDEO_FRAME = 32;
    public static final int STREAMING_ENGINE_PLAYBACK_FLAG_BUDDY_ORIGIN_VIDEO_FRAME = 2048;
    public static final int STREAMING_ENGINE_PLAYBACK_FLAG_DISABLE_DROP_FRAME_MODE = 16384;
    public static final int STREAMING_ENGINE_PLAYBACK_FLAG_DISABLE_FIXED_PREROLL_TIME = 16;
    public static final int STREAMING_ENGINE_PLAYBACK_FLAG_DISABLE_PRELOADER_ON_SOURCE = 64;
    public static final int STREAMING_ENGINE_PLAYBACK_FLAG_LOW_PIPELINE_SIZE = 8;
    public static final int STREAMING_ENGINE_PLAYBACK_FLAG_SPEED_COMP_MODE = 512;
    public static final int STREAMING_ENGINE_PLAYBACK_FLAG_VARIABLE_FRAME_RATE_ENABLE = 4096;
    public static final int STREAMING_ENGINE_RECORDING_FLAG_DISABLE_HARDWARE_ENCODER = 4;
    public static final int STREAMING_ENGINE_RECORDING_FLAG_DISABLE_MEDIA_MUXER = 128;
    public static final int STREAMING_ENGINE_RECORDING_FLAG_DONT_USE_INPUT_SURFACE = 64;
    public static final int STREAMING_ENGINE_RECORDING_FLAG_FLIP_HORIZONTALLY = 512;
    public static final int STREAMING_ENGINE_RECORDING_FLAG_IGNORE_VIDEO_ROTATION = 32;
    public static final int STREAMING_ENGINE_RECORDING_FLAG_ONLY_RECORD_VIDEO = 16;
    public static final int STREAMING_ENGINE_RECORDING_FLAG_RECORDING_WITHOUT_FX = 256;
    public static final int STREAMING_ENGINE_RECORDING_FLAG_SOFTWARE_VIDEO_INTRA_FRAME_ONLY_FAST_STOP = 8;
    public static final int STREAMING_ENGINE_RECORDING_FLAG_VIDEO_INTRA_FRAME_ONLY = 2;
    public static final int STREAMING_ENGINE_SEEK_FLAG_BUDDY_HOST_VIDEO_FRAME = 16;
    public static final int STREAMING_ENGINE_SEEK_FLAG_BUDDY_ORIGIN_VIDEO_FRAME = 256;
    public static final int STREAMING_ENGINE_SEEK_FLAG_NOT_CONNECT_TO_LIVEWINDOW = 128;
    public static final int STREAMING_ENGINE_SEEK_FLAG_SHOW_ANIMATED_STICKER_POSTER = 4;
    public static final int STREAMING_ENGINE_SEEK_FLAG_SHOW_CAPTION_POSTER = 2;
    public static final int STREAMING_ENGINE_SEND_BUFFER_FLAG_ONLY_FOR_BUDDY = 2;
    public static final int STREAMING_ENGINE_SEND_BUFFER_FLAG_ONLY_FOR_GRAB = 1;
    public static final int STREAMING_ENGINE_STATE_CAPTUREPREVIEW = 1;
    public static final int STREAMING_ENGINE_STATE_CAPTURERECORDING = 2;
    public static final int STREAMING_ENGINE_STATE_COMPILE = 5;
    public static final int STREAMING_ENGINE_STATE_PLAYBACK = 3;
    public static final int STREAMING_ENGINE_STATE_SEEKING = 4;
    public static final int STREAMING_ENGINE_STATE_STOPPED = 0;
    public static final int STREAMING_ENGINE_STOP_FLAG_ASYNC = 2;
    public static final int STREAMING_ENGINE_STOP_FLAG_FORCE_STOP_COMPILATION = 1;
    public static final int VIDEO_CAPTURE_RESOLUTION_GRADE_EXTREMELY_HIGH = 4;
    public static final int VIDEO_CAPTURE_RESOLUTION_GRADE_HIGH = 2;
    public static final int VIDEO_CAPTURE_RESOLUTION_GRADE_LOW = 0;
    public static final int VIDEO_CAPTURE_RESOLUTION_GRADE_MEDIUM = 1;
    public static final int VIDEO_CAPTURE_RESOLUTION_GRADE_SUPER_HIGH = 3;
    public static final int VIDEO_FRAME_RECEIVER_FLAG_FORCE_RGBA_FORMAT = 1;
    public static final int VIDEO_PREVIEW_SIZEMODE_FULLSIZE = 0;
    public static final int VIDEO_PREVIEW_SIZEMODE_LIVEWINDOW_SIZE = 1;
    public static final int VIDEO_STABILIZATION_MODE_AUTO = 1;
    public static final int VIDEO_STABILIZATION_MODE_OFF = 0;
    public static final int VIDEO_STABILIZATION_MODE_STANDARD = 2;
    public static final int VIDEO_STABILIZATION_MODE_SUPER = 3;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/StreamingContext$CompileCallback.class */
    public interface CompileCallback {
        void onCompileFailed(Timeline timeline);

        void onCompileFinished(Timeline timeline);

        void onCompileProgress(@Nullable Timeline timeline, int i7);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/StreamingContext$CompileCallback2.class */
    public interface CompileCallback2 {
        void onCompileCompleted(Timeline timeline, boolean z6);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/StreamingContext$CompileCallback3.class */
    public interface CompileCallback3 {
        void onCompileCompleted(@Nullable String str, @Nullable Timeline timeline, boolean z6, int i7, String str2, int i8);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/StreamingContext$CompileFloatProgressCallback.class */
    public interface CompileFloatProgressCallback {
        void onCompileFloatProgress(@Nullable Timeline timeline, float f7);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/StreamingContext$ErrorLogTraceCallback.class */
    public interface ErrorLogTraceCallback {
        void logTrace(int i7, String str, Map<String, String> map, boolean z6, List<String> list);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/StreamingContext$EventCallback.class */
    public interface EventCallback {
        void trackEvent(String str, Hashtable<String, String> hashtable, boolean z6);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/StreamingContext$HardwareErrorCallback.class */
    public interface HardwareErrorCallback {
        void onHardwareError(int i7, String str);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/StreamingContext$ImageGrabberCallback.class */
    public interface ImageGrabberCallback {
        void onImageGrabbedArrived(Bitmap bitmap, long j7);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/StreamingContext$PlaybackCallback.class */
    public interface PlaybackCallback {
        void onPlaybackEOF(@Nullable Timeline timeline);

        void onPlaybackPreloadingCompletion(@Nullable Timeline timeline);

        void onPlaybackStopped(@Nullable Timeline timeline);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/StreamingContext$PlaybackCallback2.class */
    public interface PlaybackCallback2 {
        void onPlaybackTimelinePosition(@Nullable Timeline timeline, long j7);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/StreamingContext$PlaybackDelayCallback.class */
    public interface PlaybackDelayCallback {
        void onPlaybackDelayed(Timeline timeline, long j7, boolean z6);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/StreamingContext$PlaybackExceptionCallback.class */
    public interface PlaybackExceptionCallback {
        void onPlaybackException(Timeline timeline, int i7, String str);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/StreamingContext$SdkVersion.class */
    public interface SdkVersion {
        int getMajorVersion();

        int getMinorVersion();

        int getRevisionNumber();

        Object getSdkVersion();

        void setMajorVersion(int i7);

        void setMinorVersion(int i7);

        void setRevisionNumber(int i7);

        void setSdkVersion(Object obj);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/StreamingContext$SeekingCallback.class */
    public interface SeekingCallback {
        void onSeekingTimelinePosition(@Nullable Timeline timeline, long j7);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/StreamingContext$StreamingEngineCallback.class */
    public interface StreamingEngineCallback {
        void onFirstVideoFramePresented(Timeline timeline);

        void onStreamingEngineStateChanged(int i7);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/StreamingContext$TemplateFootageInfo.class */
    public interface TemplateFootageInfo {
        String getFilePath();

        String getFootageId();

        Object getTemplateFootageInfo();

        void setFilePath(String str);

        void setFootageId(String str);

        void setTemplateFootageInfo(Object obj);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/StreamingContext$TimelineTimestampCallback.class */
    public interface TimelineTimestampCallback {
        void onTimestampOutOfRange(Timeline timeline);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/StreamingContext$a.class */
    public interface a {
    }

    Timeline asTimeline(Object obj);

    void clearCachedResources(boolean z6);

    void clearCachedResources(boolean z6, int i7);

    void close();

    boolean compileTimeline(Timeline timeline, long j7, long j8, String str, int i7, int i8, int i9);

    boolean compileTimeline(Timeline timeline, long j7, long j8, String str, int i7, int i8, int i9, String str2);

    boolean connectTimelineWithLiveWindow(Timeline timeline, LiveWindow liveWindow);

    boolean connectTimelineWithLiveWindowExt(Timeline timeline, LiveWindowExt liveWindowExt);

    void connectTimelineWithSurfaceTexture(Timeline timeline, SurfaceTexture surfaceTexture);

    StreamingContext createAuxiliaryStreamingContext(int i7);

    LiveWindow createLiveWindow(Context context);

    LiveWindowExt createLiveWindowExt(Context context);

    @Nullable
    Timeline createTimeline(@NonNull VideoResolution videoResolution, @NonNull Rational rational, @NonNull AudioResolution audioResolution);

    @Nullable
    Timeline createTimeline(@NonNull VideoResolution videoResolution, @NonNull Rational rational, @NonNull AudioResolution audioResolution, int i7);

    @Nullable
    Timeline createTimeline(String str, List<TemplateFootageInfo> list);

    VideoFrameRetriever createVideoFrameRetriever(String str);

    void destoryAuxiliaryStreamingContext(StreamingContext streamingContext);

    void destroyPlayer(Timeline timeline);

    int detectVideoFileKeyframeInterval(String str);

    @Nullable
    AVFileInfo getAVFileInfo(@Nullable String str);

    AVFileInfo getAVFileInfo(String str, int i7);

    AssetPackageManager getAssetPackageManager();

    float getColorGainForSDRToHDR();

    Hashtable<String, Object> getCompileConfigurations();

    int getCustomCompileVideoHeight();

    int getEngineHDRCaps();

    List<String> getExportTaskID();

    StreamingContext getInstance();

    SdkVersion getSdkVersion();

    Object getStreamingContext();

    int getStreamingEngineState();

    long getTimelineCurrentPosition(Timeline timeline);

    Bitmap grabImageFromTimeline(Timeline timeline, long j7, Rational rational);

    boolean grabImageFromTimelineAsync(Timeline timeline, long j7, Rational rational, int i7);

    StreamingContext init(Context context, String str, int i7);

    boolean isPlaybackPaused();

    boolean isSdkAuthorised();

    boolean pauseCompiling();

    boolean pausePlayback();

    boolean playbackTimeline(Timeline timeline, long j7, long j8, int i7, boolean z6, int i8);

    String registerFontByFilePath(String str);

    boolean removeExportTaskID(String str);

    boolean removeTimeline(Timeline timeline);

    boolean resumeCompiling();

    boolean resumePlayback();

    boolean seek(Timeline timeline, long j7, int i7, int i8);

    boolean seekTimeline(Timeline timeline, long j7, int i7, int i8);

    void setAuroraResourcePath(String str);

    void setColorGainForSDRToHDR(@FloatRange(from = 1.0d, to = 10.0d) float f7);

    void setCompileCallback(CompileCallback compileCallback);

    void setCompileCallback2(CompileCallback2 compileCallback2);

    void setCompileCallback3(CompileCallback3 compileCallback3);

    void setCompileCallback4(a aVar);

    void setCompileConfigurations(Hashtable<String, Object> hashtable);

    void setCompileFloatProgressCallback(CompileFloatProgressCallback compileFloatProgressCallback);

    void setCustomCompileVideoHeight(int i7);

    void setDebugLevel(int i7);

    void setErrorLogTraceCallback(ErrorLogTraceCallback errorLogTraceCallback);

    void setEventCallback(EventCallback eventCallback);

    void setEventExtraInfo(Map<String, String> map);

    void setHardwareErrorCallback(HardwareErrorCallback hardwareErrorCallback);

    void setImageGrabberCallback(ImageGrabberCallback imageGrabberCallback);

    void setLogFilePath(String str);

    void setMaxAudioReaderCount(int i7);

    void setMaxImageReaderCount(int i7);

    void setMaxReaderCount(int i7);

    void setMediaCodecIconReaderEnabled(String str, boolean z6);

    void setPlaybackCallback(PlaybackCallback playbackCallback);

    void setPlaybackCallback2(PlaybackCallback2 playbackCallback2);

    void setPlaybackDelayCallback(PlaybackDelayCallback playbackDelayCallback);

    void setPlaybackExceptionCallback(PlaybackExceptionCallback playbackExceptionCallback);

    void setSaveDebugMessagesToFile(boolean z6);

    void setSeekingCallback(SeekingCallback seekingCallback);

    void setStreamingContext(Object obj);

    void setStreamingEngineCallback(StreamingEngineCallback streamingEngineCallback);

    void setTimelineTimestampCallback(TimelineTimestampCallback timelineTimestampCallback);

    void stop();

    void stop(int i7);

    void updateTimeline(Timeline timeline);
}
