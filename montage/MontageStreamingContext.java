package com.bilibili.montage;

import G.p;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.util.Pair;
import c6.P;
import c6.Q;
import com.bilibili.montage.avinfo.MontageAVFileInfo;
import com.bilibili.montage.avinfo.MontageAudioResolution;
import com.bilibili.montage.avinfo.MontageRational;
import com.bilibili.montage.avinfo.MontageVideoResolution;
import com.bilibili.montage.avutil.LogSinker;
import com.bilibili.montage.avutil.MontageImageGrabber;
import com.bilibili.montage.avutil.MontageMediaFileConvertor;
import com.bilibili.montage.avutil.MontageParseFile;
import com.bilibili.montage.avutil.MontageVideoFrameRetriever;
import com.bilibili.montage.export.ExportEngine;
import com.bilibili.montage.player.PreviewPlayer;
import com.bilibili.montage.timeline.MontageTimeline;
import com.bilibili.montage.utils.MontageFileUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/MontageStreamingContext.class */
public class MontageStreamingContext {
    private static final String AB_RELEASE_GRABBER_IN_CLEAR_CACHE = "montage.destroy_grabber_in_clear_cache";
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
    public static final String COMPILE_VIDEO_ENCODER_PROFILE_HIGH = "encoder_profile_high";
    public static final String COMPILE_VIDEO_ENCODER_PROFILE_HIGH_BLACK_LIST = "montage.encoder_profile_high";
    public static final String COMPILE_VIDEO_ENCODER_SUPPORT_ALPHA_CHANNEL = "alpha channel supported";
    public static final String COMPILE_VIDEO_HDR_COLOR_TRANSFER = "encorder color transfer";
    public static final int COMPILE_VIDEO_RESOLUTION_GRADE_1080 = 3;
    public static final int COMPILE_VIDEO_RESOLUTION_GRADE_2160 = 4;
    public static final int COMPILE_VIDEO_RESOLUTION_GRADE_360 = 0;
    public static final int COMPILE_VIDEO_RESOLUTION_GRADE_480 = 1;
    public static final int COMPILE_VIDEO_RESOLUTION_GRADE_720 = 2;
    public static final int COMPILE_VIDEO_RESOLUTION_GRADE_CUSTOM = 256;
    public static final int CREATE_TIMELINE_FLAG_CAPTION_COMPATIBLE_MODE = 32;
    public static final int CREATE_TIMELINE_FLAG_DONT_ADD_DEFAULT_VIDEO_TRANSITION = 16;
    public static final int CREATE_TIMELINE_FLAG_LONGEST_DURATION_CONSIDER_ALL_TRACKS = 1;
    public static final int CREATE_TIMELINE_FLAG_STRONG_TIMELINE = 64;
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
    public static final int LOG_TRACE_LEVEL_ERROR = 2;
    public static final int LOG_TRACE_LEVEL_INFO = 0;
    public static final int LOG_TRACE_LEVEL_WARNING = 1;
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
    public static final int STREAMING_ENGINE_STATE_PLAYPAUSED = 6;
    public static final int STREAMING_ENGINE_STATE_SEEKING = 4;
    public static final int STREAMING_ENGINE_STATE_STOPPED = 0;
    public static final int STREAMING_ENGINE_STOP_FLAG_ASYNC = 2;
    public static final int STREAMING_ENGINE_STOP_FLAG_DESTORY_PLAYER = 8;
    public static final int STREAMING_ENGINE_STOP_FLAG_FORCE_STOP_COMPILATION = 1;
    private static final String TAG = "MontageStreamingContext";
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
    private static EventCallback mEventCallbk;
    private static final ReadWriteLock mEventCallbkLock;
    private static MontageGlobalSetting mGlobalSetting;
    private static final ReadWriteLock mGlobalSettingCallbkLock;
    private static MontageLogTraceCallback mLogTraceCallback;
    private static final ReadWriteLock mLogTraceCallbkLock;
    private static MontageStreamingContext sInst;
    private MontageAssetPackageManager mAssetPackageMgr;
    private CompileCallback mCompileCallback;
    private CompileCallback2 mCompileCallback2;
    private CompileCallback3 mCompileCallback3;
    private CompileCallback4 mCompileCallback4;
    private CompileFloatProgressCallback mCompileFloatProgressCallbk;
    private Context mContext;
    private MontageTimeline mCurExportTimeline;
    private MontageTimeline mCurPlayTimeline;
    private Hashtable<String, Object> mExportConfig;
    private HardwareErrorCallback mHardwareErrorCallbk;
    private ImageGrabberCallback mImageGrabberCallback;
    private Handler mMainHandler;
    private PlaybackCallback mPlayCallback;
    private PlaybackCallback2 mPlayCallback2;
    private PlaybackExceptionCallback mPlaybackExceptionCallback;
    private String mResourcePath;
    private SeekingCallback mSeekCallback;
    private StreamingEngineCallback mStreamingEngineCallback;
    private TimelineTimestampCallback mTimelineStampCallbk;
    private boolean logFileOn = true;
    private String logFilePath = "";
    private int lastIntExportProgress = -1;
    private MontageGlobalSetting mGlobalSetting1 = new MontageGlobalSetting(this) { // from class: com.bilibili.montage.MontageStreamingContext.1
        final MontageStreamingContext this$0;

        {
            this.this$0 = this;
        }

        @Override // com.bilibili.montage.MontageStreamingContext.MontageGlobalSetting
        public boolean getAB(String str, boolean z6) {
            return z6;
        }

        @Override // com.bilibili.montage.MontageStreamingContext.MontageGlobalSetting
        public String getConfig(String str, String str2) {
            return str2;
        }

        @Override // com.bilibili.montage.MontageStreamingContext.MontageGlobalSetting
        public String getDeviceDecision(String str, String str2) {
            return str2;
        }
    };
    private HashMap<MontageTimeline, PreviewPlayer> mTimelineToPlayer = new HashMap<>();
    private HashMap<MontageTimeline, ExportEngine> mTimelineToExport = new HashMap<>();
    private int mExportVideoHeight = 1080;
    private MontageImageGrabber mImageGrabber = null;
    private MontageParseFile mParseFile = null;
    private int mCurState = 6;
    private long mCurPos = 0;
    private boolean mEngineAvailable = false;
    ArrayList<MontageStreamingContext> mSubContexts = new ArrayList<>();
    private final PreviewPlayer.IPlaybackCallback mPlayerPlayCallback = new AnonymousClass2(this);
    private final ExportEngine.IExportCallback mExportEngineCallback = new AnonymousClass3(this);
    private final MontageImageGrabber.ICoverImageCallback mCoverImageCallback = new AnonymousClass4(this);
    private long cSelf = nativeNewContext();

    /* JADX INFO: renamed from: com.bilibili.montage.MontageStreamingContext$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/MontageStreamingContext$2.class */
    public class AnonymousClass2 implements PreviewPlayer.IPlaybackCallback {
        final MontageStreamingContext this$0;

        public AnonymousClass2(MontageStreamingContext montageStreamingContext) {
            this.this$0 = montageStreamingContext;
        }

        @Override // com.bilibili.montage.player.PreviewPlayer.IPlaybackCallback
        public void onPlaybackEOF(MontageTimeline montageTimeline) {
            synchronized (this) {
                this.this$0.mCurState = 6;
                LogSinker.i(MontageStreamingContext.TAG, String.format("Mon.Java onPlaybackEOF, mCurState is %d", Integer.valueOf(this.this$0.mCurState)));
                if (this.this$0.mMainHandler == null) {
                    return;
                }
                this.this$0.mMainHandler.post(new Runnable(this, montageTimeline) { // from class: com.bilibili.montage.MontageStreamingContext.2.5
                    final AnonymousClass2 this$1;
                    final MontageTimeline val$timeline;

                    {
                        this.this$1 = this;
                        this.val$timeline = montageTimeline;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        if (this.this$1.this$0.mPlayCallback == null) {
                            return;
                        }
                        this.this$1.this$0.mPlayCallback.onPlaybackEOF(this.val$timeline);
                        this.this$1.this$0.mPlayCallback.onPlaybackStopped(this.val$timeline);
                    }
                });
            }
        }

        @Override // com.bilibili.montage.player.PreviewPlayer.IPlaybackCallback
        public void onPlaybackError(MontageTimeline montageTimeline, int i7, String str) {
            if (this.this$0.mMainHandler == null) {
                return;
            }
            this.this$0.mMainHandler.post(new Runnable(this, montageTimeline, i7, str) { // from class: com.bilibili.montage.MontageStreamingContext.2.6
                final AnonymousClass2 this$1;
                final int val$errorCode;
                final String val$errorMessage;
                final MontageTimeline val$timeline;

                {
                    this.this$1 = this;
                    this.val$timeline = montageTimeline;
                    this.val$errorCode = i7;
                    this.val$errorMessage = str;
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (this.this$1.this$0.mPlaybackExceptionCallback != null) {
                        this.this$1.this$0.mPlaybackExceptionCallback.onPlaybackException(this.val$timeline, this.val$errorCode, this.val$errorMessage);
                    }
                }
            });
        }

        @Override // com.bilibili.montage.player.PreviewPlayer.IPlaybackCallback
        public void onPlaybackFirstFrame(MontageTimeline montageTimeline) {
            if (this.this$0.mMainHandler == null) {
                return;
            }
            this.this$0.mMainHandler.post(new Runnable(this, montageTimeline) { // from class: com.bilibili.montage.MontageStreamingContext.2.2
                final AnonymousClass2 this$1;
                final MontageTimeline val$timeline;

                {
                    this.this$1 = this;
                    this.val$timeline = montageTimeline;
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (this.this$1.this$0.mStreamingEngineCallback != null) {
                        this.this$1.this$0.mStreamingEngineCallback.onFirstVideoFramePresented(this.val$timeline);
                    }
                }
            });
        }

        @Override // com.bilibili.montage.player.PreviewPlayer.IPlaybackCallback
        public void onPlaybackPosition(MontageTimeline montageTimeline, long j7) {
            synchronized (this) {
                if (this.this$0.mCurState != 3) {
                    return;
                }
                if (this.this$0.mMainHandler == null) {
                    return;
                }
                this.this$0.mMainHandler.post(new Runnable(this, montageTimeline, j7) { // from class: com.bilibili.montage.MontageStreamingContext.2.3
                    final AnonymousClass2 this$1;
                    final long val$timePoint;
                    final MontageTimeline val$timeline;

                    {
                        this.this$1 = this;
                        this.val$timeline = montageTimeline;
                        this.val$timePoint = j7;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        if (this.this$1.this$0.mPlayCallback2 == null || this.this$1.this$0.mCurState != 3) {
                            return;
                        }
                        this.this$1.this$0.mPlayCallback2.onPlaybackTimelinePosition(this.val$timeline, this.val$timePoint);
                    }
                });
            }
        }

        @Override // com.bilibili.montage.player.PreviewPlayer.IPlaybackCallback
        public void onPlaybackPrepared(MontageTimeline montageTimeline) {
            synchronized (this) {
                if (this.this$0.mMainHandler != null && this.this$0.mCurState == 3) {
                    this.this$0.mMainHandler.post(new Runnable(this, montageTimeline) { // from class: com.bilibili.montage.MontageStreamingContext.2.1
                        final AnonymousClass2 this$1;
                        final MontageTimeline val$timeline;

                        {
                            this.this$1 = this;
                            this.val$timeline = montageTimeline;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            if (this.this$1.this$0.mCurState == 3 && this.this$1.this$0.mPlayCallback != null) {
                                this.this$1.this$0.mPlayCallback.onPlaybackPreloadingCompletion(this.val$timeline);
                            }
                        }
                    });
                }
            }
        }

        @Override // com.bilibili.montage.player.PreviewPlayer.IPlaybackCallback
        public void onPlaybackStopped(MontageTimeline montageTimeline) {
            synchronized (this) {
                this.this$0.mCurState = 6;
                LogSinker.i(MontageStreamingContext.TAG, String.format("Mon.Java onPlaybackStopped, mCurState is %d", Integer.valueOf(this.this$0.mCurState)));
                if (this.this$0.mMainHandler == null) {
                    return;
                }
                this.this$0.mMainHandler.post(new Runnable(this, montageTimeline) { // from class: com.bilibili.montage.MontageStreamingContext.2.4
                    final AnonymousClass2 this$1;
                    final MontageTimeline val$timeline;

                    {
                        this.this$1 = this;
                        this.val$timeline = montageTimeline;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        if (this.this$1.this$0.mPlayCallback == null) {
                            return;
                        }
                        this.this$1.this$0.mPlayCallback.onPlaybackStopped(this.val$timeline);
                    }
                });
            }
        }

        @Override // com.bilibili.montage.player.PreviewPlayer.IPlaybackCallback
        public void onSeekCompleted(MontageTimeline montageTimeline) {
            synchronized (this) {
                PreviewPlayer previewPlayer = (PreviewPlayer) this.this$0.mTimelineToPlayer.get(montageTimeline);
                if (previewPlayer != null) {
                    int playerState = previewPlayer.getPlayerState();
                    if (playerState == 2) {
                        this.this$0.mCurState = 3;
                    } else if (playerState == 3 || playerState != 4) {
                        this.this$0.mCurState = 6;
                    } else {
                        this.this$0.mCurState = 6;
                    }
                }
                LogSinker.i(MontageStreamingContext.TAG, String.format("Mon.Java onSeekCompleted, mCurState is %d", Integer.valueOf(this.this$0.mCurState)));
                this.this$0.postSeekingPosition(montageTimeline);
            }
        }
    }

    /* JADX INFO: renamed from: com.bilibili.montage.MontageStreamingContext$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/MontageStreamingContext$3.class */
    public class AnonymousClass3 implements ExportEngine.IExportCallback {
        final MontageStreamingContext this$0;

        public AnonymousClass3(MontageStreamingContext montageStreamingContext) {
            this.this$0 = montageStreamingContext;
        }

        @Override // com.bilibili.montage.export.ExportEngine.IExportCallback
        public void onCompileCompleted(ExportEngine.ExportResult exportResult) {
            synchronized (this) {
                if (exportResult.errorType != 11) {
                    this.this$0.mCurState = 6;
                }
                LogSinker.i(MontageStreamingContext.TAG, String.format("Mon.Java onCompileCompleted, mCurState is %d", Integer.valueOf(this.this$0.mCurState)));
                if (this.this$0.mMainHandler == null) {
                    return;
                }
                this.this$0.mMainHandler.post(new Runnable(this, exportResult) { // from class: com.bilibili.montage.MontageStreamingContext.3.2
                    final AnonymousClass3 this$1;
                    final ExportEngine.ExportResult val$result;

                    {
                        this.this$1 = this;
                        this.val$result = exportResult;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        LogSinker.i(MontageStreamingContext.TAG, "[MainLooper] receive onCompileCompleted error_info: " + this.val$result.errorInfo + ", isHardwareEncoder:" + this.val$result.isHardwareEncoder);
                        if (this.this$1.this$0.mCompileCallback != null) {
                            this.this$1.this$0.mCompileCallback.onCompileFinished(this.val$result.timeline);
                        }
                        if (this.this$1.this$0.mCompileCallback2 != null) {
                            CompileCallback2 compileCallback2 = this.this$1.this$0.mCompileCallback2;
                            ExportEngine.ExportResult exportResult2 = this.val$result;
                            MontageTimeline montageTimeline = exportResult2.timeline;
                            boolean z6 = true;
                            if (exportResult2.errorType != 1) {
                                z6 = false;
                            }
                            compileCallback2.onCompileCompleted(montageTimeline, z6);
                        }
                        if (this.this$1.this$0.mCompileCallback3 != null) {
                            CompileCallback3 compileCallback3 = this.this$1.this$0.mCompileCallback3;
                            ExportEngine.ExportResult exportResult3 = this.val$result;
                            compileCallback3.onCompileCompleted(exportResult3.actionID, exportResult3.timeline, exportResult3.isHardwareEncoder, exportResult3.errorType, exportResult3.errorInfo, 0);
                        }
                        if (this.this$1.this$0.mCompileCallback4 != null) {
                            this.this$1.this$0.mCompileCallback4.onCompileCompleted(this.val$result);
                        }
                    }
                });
                LogSinker.i(MontageStreamingContext.TAG, "Mon.Java post onCompileCompleted to MainLooper");
            }
        }

        @Override // com.bilibili.montage.export.ExportEngine.IExportCallback
        public void onCompileFailed(String str, MontageTimeline montageTimeline, int i7) {
            synchronized (this) {
                LogSinker.i(MontageStreamingContext.TAG, String.format("Mon.Java onCompileFailed, mCurState is %d", Integer.valueOf(this.this$0.mCurState)));
                if (this.this$0.mMainHandler == null) {
                    return;
                }
                this.this$0.mMainHandler.post(new Runnable(this, montageTimeline) { // from class: com.bilibili.montage.MontageStreamingContext.3.3
                    final AnonymousClass3 this$1;
                    final MontageTimeline val$timeline;

                    {
                        this.this$1 = this;
                        this.val$timeline = montageTimeline;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        if (this.this$1.this$0.mCompileCallback != null) {
                            this.this$1.this$0.mCompileCallback.onCompileFailed(this.val$timeline);
                        }
                    }
                });
            }
        }

        @Override // com.bilibili.montage.export.ExportEngine.IExportCallback
        public void onCompileProgress(String str, MontageTimeline montageTimeline, float f7) {
            synchronized (this) {
                if (this.this$0.mCurState != 5) {
                    LogSinker.i(MontageStreamingContext.TAG, String.format("Mon.Java onCompileProgress, mCurState is %d", Integer.valueOf(this.this$0.mCurState)));
                    this.this$0.mCurState = 5;
                }
                if (this.this$0.mMainHandler == null) {
                    return;
                }
                this.this$0.mMainHandler.post(new Runnable(this, f7, montageTimeline) { // from class: com.bilibili.montage.MontageStreamingContext.3.1
                    final AnonymousClass3 this$1;
                    final float val$progress;
                    final MontageTimeline val$timeline;

                    {
                        this.this$1 = this;
                        this.val$progress = f7;
                        this.val$timeline = montageTimeline;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        int i7;
                        if (this.this$1.this$0.mCompileCallback != null && (i7 = (int) this.val$progress) != this.this$1.this$0.lastIntExportProgress) {
                            this.this$1.this$0.mCompileCallback.onCompileProgress(this.val$timeline, i7);
                            this.this$1.this$0.lastIntExportProgress = i7;
                        }
                        if (this.this$1.this$0.mCompileFloatProgressCallbk != null) {
                            this.this$1.this$0.mCompileFloatProgressCallbk.onCompileFloatProgress(this.val$timeline, this.val$progress);
                        }
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: com.bilibili.montage.MontageStreamingContext$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/MontageStreamingContext$4.class */
    public class AnonymousClass4 implements MontageImageGrabber.ICoverImageCallback {
        final MontageStreamingContext this$0;

        public AnonymousClass4(MontageStreamingContext montageStreamingContext) {
            this.this$0 = montageStreamingContext;
        }

        @Override // com.bilibili.montage.avutil.MontageImageGrabber.ICoverImageCallback
        public void onImageGrabbedArrived(Bitmap bitmap, long j7) {
            synchronized (this) {
                if (this.this$0.mMainHandler == null) {
                    return;
                }
                this.this$0.mMainHandler.post(new Runnable(this, bitmap, j7) { // from class: com.bilibili.montage.MontageStreamingContext.4.1
                    final AnonymousClass4 this$1;
                    final Bitmap val$image;
                    final long val$timestamp;

                    {
                        this.this$1 = this;
                        this.val$image = bitmap;
                        this.val$timestamp = j7;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        if (this.this$1.this$0.mImageGrabberCallback != null) {
                            this.this$1.this$0.mImageGrabberCallback.onImageGrabbedArrived(this.val$image, this.val$timestamp);
                        }
                    }
                });
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/MontageStreamingContext$CompileCallback.class */
    public interface CompileCallback {
        void onCompileFailed(MontageTimeline montageTimeline);

        void onCompileFinished(MontageTimeline montageTimeline);

        void onCompileProgress(MontageTimeline montageTimeline, int i7);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/MontageStreamingContext$CompileCallback2.class */
    public interface CompileCallback2 {
        void onCompileCompleted(MontageTimeline montageTimeline, boolean z6);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/MontageStreamingContext$CompileCallback3.class */
    public interface CompileCallback3 {
        void onCompileCompleted(String str, MontageTimeline montageTimeline, boolean z6, int i7, String str2, int i8);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/MontageStreamingContext$CompileCallback4.class */
    public interface CompileCallback4 {
        void onCompileCompleted(ExportEngine.ExportResult exportResult);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/MontageStreamingContext$CompileFloatProgressCallback.class */
    public interface CompileFloatProgressCallback {
        void onCompileFloatProgress(MontageTimeline montageTimeline, float f7);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/MontageStreamingContext$EventCallback.class */
    public interface EventCallback {
        void trackEvent(String str, Hashtable<String, String> hashtable, boolean z6);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/MontageStreamingContext$HardwareErrorCallback.class */
    public interface HardwareErrorCallback {
        void onHardwareError(int i7, String str);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/MontageStreamingContext$ImageGrabberCallback.class */
    public interface ImageGrabberCallback {
        void onImageGrabbedArrived(Bitmap bitmap, long j7);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/MontageStreamingContext$MontageGlobalSetting.class */
    public interface MontageGlobalSetting {
        boolean getAB(String str, boolean z6);

        String getConfig(String str, String str2);

        String getDeviceDecision(String str, String str2);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/MontageStreamingContext$MontageLogTraceCallback.class */
    public interface MontageLogTraceCallback {
        void logTrace(int i7, String str, Map<String, String> map, boolean z6, List<String> list);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/MontageStreamingContext$PlaybackCallback.class */
    public interface PlaybackCallback {
        void onPlaybackEOF(MontageTimeline montageTimeline);

        void onPlaybackPreloadingCompletion(MontageTimeline montageTimeline);

        void onPlaybackStopped(MontageTimeline montageTimeline);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/MontageStreamingContext$PlaybackCallback2.class */
    public interface PlaybackCallback2 {
        void onPlaybackTimelinePosition(MontageTimeline montageTimeline, long j7);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/MontageStreamingContext$PlaybackDelayCallback.class */
    public interface PlaybackDelayCallback {
        void onPlaybackDelayed(MontageTimeline montageTimeline, long j7, boolean z6);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/MontageStreamingContext$PlaybackExceptionCallback.class */
    public interface PlaybackExceptionCallback {
        void onPlaybackException(MontageTimeline montageTimeline, int i7, String str);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/MontageStreamingContext$SdkVersion.class */
    public static class SdkVersion {
        public int majorVersion;
        public int minorVersion;
        public int revisionNumber;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/MontageStreamingContext$SeekingCallback.class */
    public interface SeekingCallback {
        void onSeekingTimelinePosition(MontageTimeline montageTimeline, long j7);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/MontageStreamingContext$StreamingEngineCallback.class */
    public interface StreamingEngineCallback {
        void onFirstVideoFramePresented(MontageTimeline montageTimeline);

        void onStreamingEngineStateChanged(int i7);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/MontageStreamingContext$TimelineTimestampCallback.class */
    public interface TimelineTimestampCallback {
        void onTimestampOutOfRange(MontageTimeline montageTimeline);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/MontageStreamingContext$templateFootageInfo.class */
    public static class templateFootageInfo {
        public String filePath;
        public String footageId;
        public String reverseFilePath;
    }

    static {
        SystemLoader.setup();
        mEventCallbkLock = new ReentrantReadWriteLock();
        mGlobalSettingCallbkLock = new ReentrantReadWriteLock();
        mLogTraceCallbkLock = new ReentrantReadWriteLock();
        mGlobalSetting = null;
        mLogTraceCallback = null;
    }

    private MontageStreamingContext() {
    }

    public static MontageLoaderStatus checkLoaderStatus() {
        return SystemLoader.getLoaderStatus();
    }

    private void clear() {
        this.mEngineAvailable = false;
        MontageImageGrabber montageImageGrabber = this.mImageGrabber;
        if (montageImageGrabber != null) {
            montageImageGrabber.destroy();
            this.mImageGrabber = null;
        }
        removeAllTimeline();
    }

    public static void close() {
        if (sInst != null) {
            Trace.beginSection("MSC close");
            LogSinker.i(TAG, "Mon.JAVA.close");
            Iterator<MontageStreamingContext> it = sInst.mSubContexts.iterator();
            while (it.hasNext()) {
                it.next().clear();
            }
            LogSinker.dump();
            MontageFileUtils.setContext(null);
            sInst.mSubContexts.clear();
            sInst.clear();
            sInst.nativeDeInitEngine();
            sInst.cSelf = 0L;
            sInst = null;
            Trace.endSection();
        }
    }

    private void configLogFile() {
        nativeConfigLogFile(this.logFileOn, this.logFilePath);
    }

    private void destroyPlayer(MontageTimeline montageTimeline, boolean z6) {
        PreviewPlayer previewPlayer = this.mTimelineToPlayer.get(montageTimeline);
        if (previewPlayer != null) {
            if (z6) {
                previewPlayer.saveLastFrameToLiveWindow();
            }
            previewPlayer.destroy();
            this.mCurState = 6;
        }
        this.mTimelineToPlayer.remove(montageTimeline);
    }

    private static boolean executeGetABFromNative(String str, boolean z6) {
        ReadWriteLock readWriteLock = mGlobalSettingCallbkLock;
        readWriteLock.readLock().lock();
        MontageGlobalSetting montageGlobalSetting = mGlobalSetting;
        boolean ab = montageGlobalSetting != null ? montageGlobalSetting.getAB(str, z6) : false;
        readWriteLock.readLock().unlock();
        return ab;
    }

    private static String executeGetConfigFromNative(String str, String str2) {
        ReadWriteLock readWriteLock = mGlobalSettingCallbkLock;
        readWriteLock.readLock().lock();
        MontageGlobalSetting montageGlobalSetting = mGlobalSetting;
        String config = montageGlobalSetting != null ? montageGlobalSetting.getConfig(str, str2) : "";
        readWriteLock.readLock().unlock();
        return config;
    }

    public static String executeGetDeviceDecision(String str, String str2) {
        return executeGetDeviceDecisionFromNative(str, str2);
    }

    private static String executeGetDeviceDecisionFromNative(String str, String str2) {
        ReadWriteLock readWriteLock = mGlobalSettingCallbkLock;
        readWriteLock.readLock().lock();
        MontageGlobalSetting montageGlobalSetting = mGlobalSetting;
        String deviceDecision = montageGlobalSetting != null ? montageGlobalSetting.getDeviceDecision(str, str2) : "";
        readWriteLock.readLock().unlock();
        return deviceDecision;
    }

    public static void executeLogTraceFromNative(int i7, String str, Map<String, String> map, boolean z6, List<String> list) {
        ReadWriteLock readWriteLock = mLogTraceCallbkLock;
        readWriteLock.readLock().lock();
        MontageLogTraceCallback montageLogTraceCallback = mLogTraceCallback;
        if (montageLogTraceCallback != null) {
            montageLogTraceCallback.logTrace(i7, str, map, z6, list);
        }
        readWriteLock.readLock().unlock();
    }

    public static MontageStreamingContext getInstance() {
        return sInst;
    }

    public static SdkVersion getSdkVersion() {
        return nativeGetSdkVersion();
    }

    public static String getSdkVersionString() {
        return nativeGetSdkVersionString();
    }

    private int getVideoEncoderProfile() {
        MontageGlobalSetting montageGlobalSetting = mGlobalSetting;
        if (montageGlobalSetting == null) {
            return 1;
        }
        return (!montageGlobalSetting.getAB(COMPILE_VIDEO_ENCODER_PROFILE_HIGH, false) || mGlobalSetting.getConfig(COMPILE_VIDEO_ENCODER_PROFILE_HIGH_BLACK_LIST, "").contains(Build.MODEL)) ? 1 : 3;
    }

    public static MontageStreamingContext init(Context context, String str, int i7) {
        LogSinker.i(TAG, "Mon.JAVA.MontageStreamingContext, flags: " + i7);
        Trace.beginSection("MSC init");
        if (sInst == null) {
            MontageStreamingContext montageStreamingContext = new MontageStreamingContext();
            sInst = montageStreamingContext;
            montageStreamingContext.nativeInitEngine();
            MontageStreamingContext montageStreamingContext2 = sInst;
            montageStreamingContext2.mAssetPackageMgr = montageStreamingContext2.nativeGetAssetPackageMgr(montageStreamingContext2.cSelf);
        }
        MontageStreamingContext montageStreamingContext3 = sInst;
        if (montageStreamingContext3.mContext == null) {
            montageStreamingContext3.mContext = context;
            MontageFileUtils.setContext(context);
        }
        MontageStreamingContext montageStreamingContext4 = sInst;
        if (montageStreamingContext4.mMainHandler == null) {
            montageStreamingContext4.mMainHandler = new Handler(sInst.mContext.getMainLooper());
        }
        sInst.mEngineAvailable = true;
        Trace.endSection();
        return sInst;
    }

    public static boolean isMainThread() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static MontageLoaderStatus loadMontageSDKLibraries() {
        return SystemLoader.loadMontageSDKLibraries();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.bilibili.montage.export.ExportEngine.ExportConfig meicamExportConfigToMontage(com.bilibili.montage.timeline.MontageTimeline r6, java.lang.String r7, int r8, int r9, java.util.Hashtable<java.lang.String, java.lang.Object> r10, int r11) {
        /*
            Method dump skipped, instruction units count: 1725
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.montage.MontageStreamingContext.meicamExportConfigToMontage(com.bilibili.montage.timeline.MontageTimeline, java.lang.String, int, int, java.util.Hashtable, int):com.bilibili.montage.export.ExportEngine$ExportConfig");
    }

    private native void nativeClearCachedResources(long j7, boolean z6, int i7);

    private static native void nativeConfigLogFile(boolean z6, String str);

    private native MontageTimeline nativeCreateTimeline(long j7, MontageVideoResolution montageVideoResolution, MontageRational montageRational, MontageAudioResolution montageAudioResolution, int i7);

    private native void nativeDeInitEngine();

    private native int nativeDetectVideoFileKeyframeInterval(long j7, String str);

    private native MontageAssetPackageManager nativeGetAssetPackageMgr(long j7);

    private static native SdkVersion nativeGetSdkVersion();

    private static native String nativeGetSdkVersionString();

    private native long nativeGetTimelineCurrentPosition(long j7, MontageTimeline montageTimeline);

    private native Bitmap nativeGrabImageAtTime(long j7, long j8);

    private native void nativeInitEngine();

    private native long nativeNewContext();

    private native String nativeRegisterFontByFilePath(long j7, String str);

    private native void nativeRemoveTimeline(long j7, MontageTimeline montageTimeline);

    private native boolean nativeSeekTimeline(long j7, MontageTimeline montageTimeline, long j8);

    private static native void nativeSetDebugLevel(int i7);

    private static native void nativeSetEventCallback(boolean z6);

    private native void nativeSetEventExtraInfo(Map<String, String> map);

    private static native void nativeSetGlobalSetting(boolean z6);

    private static native void nativeSetLogTraceCallback(boolean z6);

    private static native void nativeSetResourcePath(String str);

    private boolean pause(MontageTimeline montageTimeline) {
        boolean z6 = true;
        if (montageTimeline == null || !montageTimeline.isValid()) {
            if (montageTimeline != null) {
                z6 = false;
            }
            LogSinker.e(TAG, "Mon.Java. pause, timeline==null: " + z6 + ", timeline valid: " + (montageTimeline == null ? false : montageTimeline.isValid()));
            return false;
        }
        PreviewPlayer previewPlayer = this.mTimelineToPlayer.get(montageTimeline);
        if (previewPlayer == null) {
            LogSinker.e(TAG, "Mon.Java. seek, player is null");
            return false;
        }
        previewPlayer.pausePlayback();
        if (this.mCurState != 3) {
            return true;
        }
        postStopped(montageTimeline);
        return true;
    }

    private static void postEventFromNative(String str, Hashtable<String, String> hashtable, boolean z6) {
        ReadWriteLock readWriteLock = mEventCallbkLock;
        readWriteLock.readLock();
        EventCallback eventCallback = mEventCallbk;
        if (eventCallback != null) {
            eventCallback.trackEvent(str, hashtable, z6);
        }
        readWriteLock.readLock();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postSeekingPosition(MontageTimeline montageTimeline) {
        Handler handler = this.mMainHandler;
        if (handler == null) {
            return;
        }
        handler.post(new Runnable(this, montageTimeline) { // from class: com.bilibili.montage.MontageStreamingContext.6
            final MontageStreamingContext this$0;
            final MontageTimeline val$timeline;

            {
                this.this$0 = this;
                this.val$timeline = montageTimeline;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.this$0.mSeekCallback == null) {
                    return;
                }
                this.this$0.mSeekCallback.onSeekingTimelinePosition(this.val$timeline, this.this$0.mCurPos);
            }
        });
    }

    private void postStopped(MontageTimeline montageTimeline) {
        this.mCurState = 6;
        if (isMainThread()) {
            PlaybackCallback playbackCallback = this.mPlayCallback;
            if (playbackCallback != null) {
                playbackCallback.onPlaybackStopped(montageTimeline);
                return;
            }
            return;
        }
        Handler handler = this.mMainHandler;
        if (handler == null) {
            return;
        }
        handler.post(new Runnable(this, montageTimeline) { // from class: com.bilibili.montage.MontageStreamingContext.5
            final MontageStreamingContext this$0;
            final MontageTimeline val$timeline;

            {
                this.this$0 = this;
                this.val$timeline = montageTimeline;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.this$0.mPlayCallback == null) {
                    return;
                }
                this.this$0.mPlayCallback.onPlaybackStopped(this.val$timeline);
            }
        });
    }

    private void removeAllTimeline() {
        HashSet hashSet = new HashSet();
        Iterator<MontageTimeline> it = this.mTimelineToPlayer.keySet().iterator();
        while (it.hasNext()) {
            hashSet.add(it.next());
        }
        Iterator<MontageTimeline> it2 = this.mTimelineToExport.keySet().iterator();
        while (it2.hasNext()) {
            hashSet.add(it2.next());
        }
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            removeTimeline((MontageTimeline) it3.next());
        }
        hashSet.clear();
    }

    private boolean seekInner(MontageTimeline montageTimeline, long j7) {
        Trace.beginSection("MSC seekTimeline");
        PreviewPlayer previewPlayer = this.mTimelineToPlayer.get(montageTimeline);
        if (previewPlayer == null) {
            LogSinker.e(TAG, "Mon.Java. seek, player is null");
            return false;
        }
        this.mCurPos = j7;
        if (previewPlayer.getCurrentPosition() == j7) {
            LogSinker.w(TAG, "Mon.Java. seek, player pos alreay there");
            postSeekingPosition(montageTimeline);
            return false;
        }
        this.mCurState = 4;
        nativeSeekTimeline(this.cSelf, montageTimeline, j7);
        boolean zSeekTimelinePosition = previewPlayer.seekTimelinePosition(j7);
        Trace.endSection();
        return zSeekTimelinePosition;
    }

    public static void setDebugLevel(int i7) {
        nativeSetDebugLevel(i7);
    }

    public static void setEventCallback(EventCallback eventCallback) {
        ReadWriteLock readWriteLock = mEventCallbkLock;
        readWriteLock.writeLock();
        mEventCallbk = eventCallback;
        if (eventCallback != null) {
            nativeSetEventCallback(true);
        } else {
            nativeSetEventCallback(false);
        }
        readWriteLock.writeLock();
    }

    public static void setGlobalSetting(MontageGlobalSetting montageGlobalSetting) {
        ReadWriteLock readWriteLock = mGlobalSettingCallbkLock;
        readWriteLock.writeLock().lock();
        mGlobalSetting = montageGlobalSetting;
        if (montageGlobalSetting != null) {
            nativeSetGlobalSetting(true);
        } else {
            nativeSetGlobalSetting(false);
        }
        readWriteLock.writeLock().unlock();
    }

    public static void setLogFilePath(String str) {
        if (str == null) {
            LogSinker.e(TAG, "Mon.Java. setLogFilePath, filePath==null: " + (str == null));
            return;
        }
        if (sInst != null) {
            String strConcat = str;
            if (!str.endsWith("/")) {
                strConcat = str.concat("/");
            }
            sInst.logFilePath = p.a(strConcat, "montage");
            sInst.configLogFile();
        }
    }

    public static void setLogTraceCallback(MontageLogTraceCallback montageLogTraceCallback) {
        ReadWriteLock readWriteLock = mLogTraceCallbkLock;
        readWriteLock.writeLock().lock();
        mLogTraceCallback = montageLogTraceCallback;
        if (montageLogTraceCallback != null) {
            nativeSetLogTraceCallback(true);
        } else {
            nativeSetLogTraceCallback(false);
        }
        readWriteLock.writeLock().unlock();
    }

    public static void setSaveDebugMessagesToFile(boolean z6) {
        MontageStreamingContext montageStreamingContext = sInst;
        if (montageStreamingContext != null) {
            montageStreamingContext.logFileOn = z6;
            montageStreamingContext.configLogFile();
        }
    }

    private void stopCompile() {
        ExportEngine exportEngine = this.mTimelineToExport.get(this.mCurExportTimeline);
        if (exportEngine != null) {
            exportEngine.destroy();
        }
        this.mTimelineToExport.remove(this.mCurExportTimeline);
        this.mCurExportTimeline = null;
    }

    private Pair<Integer, String> translateExportError(int i7) {
        Pair<Integer, String> pair = new Pair<>(0, "no info");
        switch (i7) {
            case 0:
                pair = new Pair<>(0, "no error");
                break;
            case 1:
                pair = new Pair<>(1, "user cancelled");
                break;
            case 2:
                pair = new Pair<>(2, "encode setup error");
                break;
            case 3:
                pair = new Pair<>(3, "encoding error");
                break;
            case 4:
                pair = new Pair<>(4, "decoding error");
                break;
            case 5:
                pair = new Pair<>(5, "muxing error");
                break;
            case 6:
            case 7:
            case 8:
                pair = new Pair<>(Integer.valueOf(i7), "muxing error");
                break;
        }
        return pair;
    }

    public void clearCachedResources(boolean z6) {
        if (this.mImageGrabber == null || !executeGetABFromNative(AB_RELEASE_GRABBER_IN_CLEAR_CACHE, false)) {
            return;
        }
        this.mImageGrabber.destroy();
        this.mImageGrabber = null;
    }

    public void clearCachedResources(boolean z6, int i7) {
        if (this.mImageGrabber != null && executeGetABFromNative(AB_RELEASE_GRABBER_IN_CLEAR_CACHE, false)) {
            this.mImageGrabber.destroy();
            this.mImageGrabber = null;
        }
        MontageStreamingContext montageStreamingContext = sInst;
        if (montageStreamingContext != null) {
            nativeClearCachedResources(montageStreamingContext.cSelf, z6, i7);
        }
    }

    public boolean compileTimeline(MontageTimeline montageTimeline, long j7, long j8, String str, int i7, int i8, int i9, String str2) {
        if (montageTimeline != null && montageTimeline.isValid() && str != null) {
            return compileTimeline(montageTimeline, j7, j8, str, i7, i8, this.mExportConfig, i9, str2);
        }
        boolean z6 = true;
        boolean z7 = montageTimeline == null;
        boolean zIsValid = montageTimeline == null ? false : montageTimeline.isValid();
        if (str != null) {
            z6 = false;
        }
        StringBuilder sbA = Q.a("Mon.Java. compileTimeline, timeline==null: ", ", timeline valid: ", ", outputFilePath==null: ", z7, zIsValid);
        sbA.append(z6);
        LogSinker.e(TAG, sbA.toString());
        return false;
    }

    public boolean compileTimeline(MontageTimeline montageTimeline, long j7, long j8, String str, int i7, int i8, Hashtable<String, Object> hashtable, int i9, String str2) {
        if (montageTimeline == null || !montageTimeline.isValid() || str == null || hashtable == null || this.mResourcePath == null) {
            boolean z6 = montageTimeline == null;
            boolean zIsValid = montageTimeline == null ? false : montageTimeline.isValid();
            boolean z7 = str == null;
            boolean z8 = hashtable == null;
            boolean z9 = this.mResourcePath == null;
            StringBuilder sbA = Q.a("Mon.Java. compileTimeline, timeline==null: ", ", timeline valid: ", ", outputFilePath==null: ", z6, zIsValid);
            P.a(", compileConfigurations==null: ", ", mResourcePath==null: ", sbA, z7, z8);
            sbA.append(z9);
            LogSinker.e(TAG, sbA.toString());
            return false;
        }
        Trace.beginSection("MSC compileTimeline");
        this.mCurState = 5;
        ExportEngine.setAuroraResPath(this.mResourcePath);
        ExportEngine.ExportConfig exportConfigMeicamExportConfigToMontage = meicamExportConfigToMontage(montageTimeline, str, i7, i8, hashtable, i9);
        ExportEngine exportEngine = this.mTimelineToExport.get(montageTimeline);
        if (exportEngine != null) {
            exportEngine.destroy();
            LogSinker.i(TAG, "Mon.Java. compileTimeline, destroy previous ExportEngine");
        }
        LogSinker.i(TAG, "Mon.Java. compileTimeline " + montageTimeline.toString());
        this.mTimelineToExport.put(montageTimeline, new ExportEngine(montageTimeline, this.mExportEngineCallback, exportConfigMeicamExportConfigToMontage, j7, j8, str2));
        this.mCurExportTimeline = montageTimeline;
        Trace.endSection();
        return true;
    }

    public boolean connectTimelineWithLiveWindow(MontageTimeline montageTimeline, MontageLiveWindow montageLiveWindow) {
        boolean z6 = true;
        if (montageTimeline == null || !montageTimeline.isValid() || montageLiveWindow == null) {
            boolean z7 = montageTimeline == null;
            boolean zIsValid = montageTimeline == null ? false : montageTimeline.isValid();
            if (montageLiveWindow != null) {
                z6 = false;
            }
            StringBuilder sbA = Q.a("Mon.Java. connectTimelineWithLiveWindow, timeline==null: ", ", timeline valid: ", ", liveWindow==null: ", z7, zIsValid);
            sbA.append(z6);
            LogSinker.e(TAG, sbA.toString());
            return false;
        }
        PreviewPlayer previewPlayer = this.mTimelineToPlayer.get(montageTimeline);
        PreviewPlayer previewPlayer2 = previewPlayer;
        if (previewPlayer == null) {
            previewPlayer2 = new PreviewPlayer(montageTimeline, this.mPlayerPlayCallback);
            previewPlayer2.showLastFrameOfLiveWindow(true);
            this.mTimelineToPlayer.put(montageTimeline, previewPlayer2);
        }
        montageLiveWindow.setTimeline(montageTimeline);
        return previewPlayer2.connectLiveWindow(montageLiveWindow);
    }

    public boolean connectTimelineWithLiveWindowExt(MontageTimeline montageTimeline, MontageLiveWindowExt montageLiveWindowExt) {
        if (montageTimeline != null && montageTimeline.isValid() && montageLiveWindowExt != null) {
            PreviewPlayer previewPlayer = this.mTimelineToPlayer.get(montageTimeline);
            PreviewPlayer previewPlayer2 = previewPlayer;
            if (previewPlayer == null) {
                previewPlayer2 = new PreviewPlayer(montageTimeline, this.mPlayerPlayCallback);
                this.mTimelineToPlayer.put(montageTimeline, previewPlayer2);
            }
            montageLiveWindowExt.setTimeline(montageTimeline);
            return previewPlayer2.connectLiveWindow(montageLiveWindowExt);
        }
        boolean z6 = true;
        boolean z7 = montageTimeline == null;
        boolean zIsValid = montageTimeline == null ? false : montageTimeline.isValid();
        if (montageLiveWindowExt != null) {
            z6 = false;
        }
        StringBuilder sbA = Q.a("Mon.Java. connectTimelineWithLiveWindowExt, timeline==null: ", ", timeline valid: ", ", liveWindow==null: ", z7, zIsValid);
        sbA.append(z6);
        LogSinker.e(TAG, sbA.toString());
        return false;
    }

    public boolean connectTimelineWithSurfaceTexture(MontageTimeline montageTimeline, SurfaceTexture surfaceTexture) {
        return connectTimelineWithSurfaceTexture(montageTimeline, surfaceTexture, new MontageRational(1, 1));
    }

    public boolean connectTimelineWithSurfaceTexture(MontageTimeline montageTimeline, SurfaceTexture surfaceTexture, MontageRational montageRational) {
        if (montageTimeline != null && montageTimeline.isValid() && surfaceTexture != null) {
            PreviewPlayer previewPlayer = this.mTimelineToPlayer.get(montageTimeline);
            PreviewPlayer previewPlayer2 = previewPlayer;
            if (previewPlayer == null) {
                previewPlayer2 = new PreviewPlayer(montageTimeline, this.mPlayerPlayCallback);
                this.mTimelineToPlayer.put(montageTimeline, previewPlayer2);
            }
            return previewPlayer2.connectSurfaceTexture(surfaceTexture);
        }
        boolean z6 = true;
        boolean z7 = montageTimeline == null;
        boolean zIsValid = montageTimeline == null ? false : montageTimeline.isValid();
        if (surfaceTexture != null) {
            z6 = false;
        }
        StringBuilder sbA = Q.a("Mon.Java. connectTimelineWithSurfaceTexture, timeline==null: ", ", timeline valid: ", ", SurfaceTexture==null: ", z7, zIsValid);
        sbA.append(z6);
        LogSinker.e(TAG, sbA.toString());
        return false;
    }

    public MontageStreamingContext createAuxiliaryStreamingContext(int i7) {
        if (sInst == null) {
            return null;
        }
        MontageStreamingContext montageStreamingContext = new MontageStreamingContext();
        montageStreamingContext.mContext = this.mContext;
        montageStreamingContext.mMainHandler = new Handler(Looper.getMainLooper());
        montageStreamingContext.mResourcePath = this.mResourcePath;
        montageStreamingContext.mPlayCallback = this.mPlayCallback;
        montageStreamingContext.mPlayCallback2 = this.mPlayCallback2;
        montageStreamingContext.mExportVideoHeight = this.mExportVideoHeight;
        montageStreamingContext.mExportConfig = this.mExportConfig;
        montageStreamingContext.mCompileCallback = this.mCompileCallback;
        montageStreamingContext.mCompileCallback2 = this.mCompileCallback2;
        montageStreamingContext.mCompileCallback3 = this.mCompileCallback3;
        montageStreamingContext.mCompileFloatProgressCallbk = this.mCompileFloatProgressCallbk;
        montageStreamingContext.mHardwareErrorCallbk = this.mHardwareErrorCallbk;
        montageStreamingContext.mCurPos = 0L;
        montageStreamingContext.mEngineAvailable = true;
        montageStreamingContext.mSeekCallback = this.mSeekCallback;
        montageStreamingContext.mTimelineStampCallbk = this.mTimelineStampCallbk;
        this.mSubContexts.add(montageStreamingContext);
        LogSinker.i(TAG, "Mon.Java. aux streamContext created: " + montageStreamingContext.toString());
        return montageStreamingContext;
    }

    public MontageTimeline createTimeline(MontageVideoResolution montageVideoResolution, MontageRational montageRational, MontageAudioResolution montageAudioResolution) {
        return createTimeline(montageVideoResolution, montageRational, montageAudioResolution, 0);
    }

    public MontageTimeline createTimeline(MontageVideoResolution montageVideoResolution, MontageRational montageRational, MontageAudioResolution montageAudioResolution, int i7) {
        String str;
        if (montageVideoResolution != null && montageRational != null && montageAudioResolution != null && (str = this.mResourcePath) != null) {
            PreviewPlayer.setAuroraResPath(str);
            return nativeCreateTimeline(this.cSelf, montageVideoResolution, montageRational, montageAudioResolution, i7);
        }
        boolean z6 = false;
        boolean z7 = montageVideoResolution == null;
        boolean z8 = montageRational == null;
        boolean z9 = montageAudioResolution == null;
        if (this.mResourcePath == null) {
            z6 = true;
        }
        StringBuilder sbA = Q.a("Mon.Java. createTimeline, videoEditRes==null: ", ", videoFps==null: ", ", audioEditRes==null: ", z7, z8);
        sbA.append(z9);
        sbA.append(", mResourcePath==null: ");
        sbA.append(z6);
        LogSinker.e(TAG, sbA.toString());
        return null;
    }

    public MontageTimeline createTimeline(String str, List<templateFootageInfo> list) {
        return null;
    }

    public MontageVideoFrameRetriever createVideoFrameRetriever(String str) {
        return new MontageVideoFrameRetriever(str);
    }

    public void destoryAuxiliaryStreamingContext(MontageStreamingContext montageStreamingContext) {
        if (montageStreamingContext != null) {
            LogSinker.i(TAG, "Mon.Java. aux streamContext destroyed: " + montageStreamingContext.toString());
            montageStreamingContext.clear();
            this.mSubContexts.remove(montageStreamingContext);
            montageStreamingContext.cSelf = 0L;
        }
    }

    public void destroyPlayer(MontageTimeline montageTimeline) {
        destroyPlayer(montageTimeline, true);
    }

    public int detectVideoFileKeyframeInterval(String str) {
        if (str != null) {
            return nativeDetectVideoFileKeyframeInterval(this.cSelf, str);
        }
        LogSinker.e(TAG, "Mon.Java. detectVideoFileKeyframeInterval, videoFilePath is null");
        return 0;
    }

    public MontageAVFileInfo getAVFileInfo(String str) {
        if (this.mParseFile == null) {
            this.mParseFile = new MontageParseFile();
        }
        return this.mParseFile.getAVFileInfo(str);
    }

    public MontageAssetPackageManager getAssetPackageManager() {
        return this.mAssetPackageMgr;
    }

    public Hashtable<String, Object> getCompileConfigurations() {
        return this.mExportConfig;
    }

    public int getCustomCompileVideoHeight() {
        return this.mExportVideoHeight;
    }

    public int getEngineHDRCaps() {
        return 1;
    }

    public List<String> getExportTaskID() {
        ArrayList arrayList = null;
        for (ExportEngine exportEngine : this.mTimelineToExport.values()) {
            ArrayList arrayList2 = arrayList;
            if (arrayList == null) {
                arrayList2 = new ArrayList();
            }
            String actionID = exportEngine.getActionID();
            arrayList = arrayList2;
            if (actionID != null) {
                arrayList2.add(actionID);
                arrayList = arrayList2;
            }
        }
        return arrayList;
    }

    public int getStreamingEngineState() {
        int i7 = this.mCurState;
        if (i7 == 5 || i7 == 4) {
            LogSinker.v(TAG, String.format("Mon.Java getStreamingEngineState, mCurState is %d", Integer.valueOf(i7)));
            return this.mCurState;
        }
        PreviewPlayer previewPlayer = this.mTimelineToPlayer.get(this.mCurPlayTimeline);
        if (this.mCurPlayTimeline != null && previewPlayer != null) {
            return previewPlayer.getPlayerState() != 2 ? 0 : 3;
        }
        LogSinker.i(TAG, "Mon.Java getStreamingEngineState, player is null");
        return 0;
    }

    public long getTimelineCurrentPosition(MontageTimeline montageTimeline) {
        if (montageTimeline != null && montageTimeline.isValid()) {
            PreviewPlayer previewPlayer = this.mTimelineToPlayer.get(montageTimeline);
            if (previewPlayer == null) {
                return 0L;
            }
            return previewPlayer.getCurrentPosition();
        }
        boolean zIsValid = false;
        boolean z6 = montageTimeline == null;
        if (montageTimeline != null) {
            zIsValid = montageTimeline.isValid();
        }
        LogSinker.e(TAG, "Mon.Java. getTimelineCurrentPosition, timeline==null: " + z6 + ", timeline valid: " + zIsValid);
        return 0L;
    }

    public Bitmap grabImageFromTimeline(MontageTimeline montageTimeline, long j7, MontageRational montageRational) {
        MontageImageGrabber.setAuroraResPath(this.mResourcePath);
        MontageRational montageRational2 = montageRational;
        if (montageRational == null) {
            montageRational2 = new MontageRational(1, 1);
        }
        if (this.mImageGrabber == null) {
            this.mImageGrabber = new MontageImageGrabber(null, null);
        }
        return this.mImageGrabber.grabImageFromTimeline(montageTimeline, j7, true, false, montageRational2);
    }

    public boolean grabImageFromTimelineAsync(MontageTimeline montageTimeline, long j7, MontageRational montageRational, int i7) {
        MontageImageGrabber.setAuroraResPath(this.mResourcePath);
        MontageRational montageRational2 = montageRational;
        if (montageRational == null) {
            montageRational2 = new MontageRational(1, 1);
        }
        if (this.mImageGrabber == null) {
            this.mImageGrabber = new MontageImageGrabber(null, null);
        }
        return this.mImageGrabber.grabImageFromTimelineAsync(montageTimeline, j7, montageRational2, i7, this.mCoverImageCallback);
    }

    public boolean isSdkAuthorised() {
        return true;
    }

    public boolean pausePlayback() {
        LogSinker.i(TAG, String.format("Mon.Java pausePlayback, mCurState is %d", Integer.valueOf(this.mCurState)));
        int i7 = this.mCurState;
        return (i7 == 3 || i7 == 4) ? pause(this.mCurPlayTimeline) : i7 == 6;
    }

    public boolean playbackTimeline(MontageTimeline montageTimeline, long j7, long j8, int i7, boolean z6, int i8) {
        boolean z7 = true;
        if (montageTimeline == null || !montageTimeline.isValid()) {
            if (montageTimeline != null) {
                z7 = false;
            }
            LogSinker.e(TAG, "Mon.Java. playbackTimeline, timeline==null: " + z7 + ", timeline valid: " + (montageTimeline == null ? false : montageTimeline.isValid()));
            return false;
        }
        PreviewPlayer previewPlayer = this.mTimelineToPlayer.get(montageTimeline);
        if (previewPlayer == null) {
            return false;
        }
        Trace.beginSection("MSC playbackTimeline");
        previewPlayer.setPlayBackFlag(i8);
        previewPlayer.updateTimeline(montageTimeline);
        int i9 = this.mCurState;
        boolean z8 = true;
        if (i9 != 3) {
            if (i9 == 4 || i9 == 6) {
                nativeSeekTimeline(this.cSelf, montageTimeline, j7);
                boolean zPlaybackTimeline = previewPlayer.playbackTimeline(j7, j8);
                z8 = zPlaybackTimeline;
                if (zPlaybackTimeline) {
                    this.mCurState = 3;
                    this.mCurPlayTimeline = montageTimeline;
                    PreviewPlayer.IPlaybackCallback iPlaybackCallback = this.mPlayerPlayCallback;
                    z8 = zPlaybackTimeline;
                    if (iPlaybackCallback != null) {
                        iPlaybackCallback.onPlaybackPrepared(montageTimeline);
                        z8 = zPlaybackTimeline;
                    }
                }
            } else {
                z8 = false;
            }
        }
        LogSinker.i(TAG, String.format("Mon.Java playbackTimeline, mCurState is %d", Integer.valueOf(this.mCurState)));
        Trace.endSection();
        return z8;
    }

    public String registerFontByFilePath(String str) {
        return nativeRegisterFontByFilePath(this.cSelf, str);
    }

    public boolean removeExportTaskID(String str) {
        String actionID;
        if (str == null) {
            return false;
        }
        for (MontageTimeline montageTimeline : this.mTimelineToExport.keySet()) {
            ExportEngine exportEngine = this.mTimelineToExport.get(montageTimeline);
            if (exportEngine != null && (actionID = exportEngine.getActionID()) != null && actionID.equals(str)) {
                exportEngine.destroy();
                this.mTimelineToExport.remove(montageTimeline);
                if (this.mCurExportTimeline != montageTimeline) {
                    return true;
                }
                this.mCurExportTimeline = null;
                this.mCurState = 6;
                return true;
            }
        }
        return false;
    }

    public boolean removeTimeline(MontageTimeline montageTimeline) {
        if (montageTimeline == null || !montageTimeline.isValid()) {
            boolean zIsValid = false;
            boolean z6 = montageTimeline == null;
            if (montageTimeline != null) {
                zIsValid = montageTimeline.isValid();
            }
            LogSinker.e(TAG, "Mon.Java. removeTimeline, timeline==null: " + z6 + ", timeline valid: " + zIsValid);
            return true;
        }
        LogSinker.i(TAG, String.format("Mon.Java removeTimeline, mCurState is %d", Integer.valueOf(this.mCurState)));
        PreviewPlayer previewPlayer = this.mTimelineToPlayer.get(montageTimeline);
        if (previewPlayer != null) {
            previewPlayer.destroy();
        }
        this.mTimelineToPlayer.remove(montageTimeline);
        if (this.mCurPlayTimeline == montageTimeline) {
            this.mCurPlayTimeline = null;
            this.mCurState = 6;
        }
        ExportEngine exportEngine = this.mTimelineToExport.get(montageTimeline);
        if (exportEngine != null) {
            exportEngine.destroy();
        }
        this.mTimelineToExport.remove(montageTimeline);
        if (this.mCurExportTimeline == montageTimeline) {
            this.mCurExportTimeline = null;
            this.mCurState = 6;
        }
        nativeRemoveTimeline(this.cSelf, montageTimeline);
        LogSinker.i(TAG, String.format("Mon.Java removeTimeline end,mCurState is %d", Integer.valueOf(this.mCurState)));
        return true;
    }

    public String resourcePath() {
        return this.mResourcePath;
    }

    public boolean resumePlayback() {
        boolean z6;
        PreviewPlayer previewPlayer;
        LogSinker.i(TAG, String.format("Mon.Java resumePlayback, mCurState is %d", Integer.valueOf(this.mCurState)));
        int i7 = this.mCurState;
        if (i7 != 3) {
            z6 = false;
            if ((i7 == 4 || i7 == 6) && (previewPlayer = this.mTimelineToPlayer.get(this.mCurPlayTimeline)) != null) {
                boolean zResumePlayback = previewPlayer.resumePlayback();
                z6 = zResumePlayback;
                if (zResumePlayback) {
                    z6 = zResumePlayback;
                    if (4 != this.mCurState) {
                        this.mCurState = 3;
                        z6 = zResumePlayback;
                    }
                }
            }
        } else {
            z6 = true;
        }
        return z6;
    }

    public boolean seek(MontageTimeline montageTimeline, long j7, int i7, int i8) {
        boolean zSeekInner = false;
        if (montageTimeline != null && montageTimeline.isValid()) {
            LogSinker.v(TAG, String.format("Mon.Java seek, mCurState is %d", Integer.valueOf(this.mCurState)));
            int i9 = this.mCurState;
            if (i9 == 3 || i9 == 4 || i9 == 6) {
                zSeekInner = seekInner(montageTimeline, j7);
            }
            return zSeekInner;
        }
        LogSinker.e(TAG, "Mon.Java. seek, timeline==null: " + (montageTimeline == null) + ", timeline valid: " + (montageTimeline == null ? false : montageTimeline.isValid()));
        return false;
    }

    public boolean seekTimeline(MontageTimeline montageTimeline, long j7, int i7, int i8) {
        boolean zSeekInner = false;
        if (montageTimeline == null || !montageTimeline.isValid()) {
            LogSinker.e(TAG, "Mon.Java. seekTimeline, timeline==null: " + (montageTimeline == null) + ", timeline valid: " + (montageTimeline == null ? false : montageTimeline.isValid()));
            return false;
        }
        int i9 = this.mCurState;
        if (i9 == 3 || i9 == 4 || i9 == 6) {
            updateTimeline(montageTimeline);
            pause(montageTimeline);
            zSeekInner = seekInner(montageTimeline, j7);
        }
        return zSeekInner;
    }

    public void setColorGainForSDRToHDR(float f7) {
    }

    public void setCompileCallback(CompileCallback compileCallback) {
        this.mCompileCallback = compileCallback;
    }

    public void setCompileCallback2(CompileCallback2 compileCallback2) {
        this.mCompileCallback2 = compileCallback2;
    }

    public void setCompileCallback3(CompileCallback3 compileCallback3) {
        this.mCompileCallback3 = compileCallback3;
    }

    public void setCompileCallback4(CompileCallback4 compileCallback4) {
        this.mCompileCallback4 = compileCallback4;
    }

    public void setCompileConfigurations(Hashtable<String, Object> hashtable) {
        if (hashtable != null) {
            this.mExportConfig = hashtable;
            return;
        }
        LogSinker.e(TAG, "Mon.Java. setCompileConfigurations, compileConfigurations==null: " + (hashtable == null));
    }

    public void setCompileFloatProgressCallback(CompileFloatProgressCallback compileFloatProgressCallback) {
        this.mCompileFloatProgressCallbk = compileFloatProgressCallback;
    }

    public void setCustomCompileVideoHeight(int i7) {
        this.mExportVideoHeight = i7;
    }

    public void setEventExtraInfo(Map<String, String> map) {
        nativeSetEventExtraInfo(map);
    }

    public void setHardwareErrorCallback(HardwareErrorCallback hardwareErrorCallback) {
        this.mHardwareErrorCallbk = hardwareErrorCallback;
    }

    public void setImageGrabberCallback(ImageGrabberCallback imageGrabberCallback) {
        this.mImageGrabberCallback = imageGrabberCallback;
    }

    public void setMaxAudioReaderCount(int i7) {
    }

    public void setMaxImageReaderCount(int i7) {
    }

    public void setMaxReaderCount(int i7) {
    }

    public void setMediaCodecIconReaderEnabled(boolean z6) {
    }

    public void setPlaybackCallback(PlaybackCallback playbackCallback) {
        this.mPlayCallback = playbackCallback;
    }

    public void setPlaybackCallback2(PlaybackCallback2 playbackCallback2) {
        this.mPlayCallback2 = playbackCallback2;
    }

    public void setPlaybackDelayCallback(PlaybackDelayCallback playbackDelayCallback) {
    }

    public void setPlaybackExceptionCallback(PlaybackExceptionCallback playbackExceptionCallback) {
        this.mPlaybackExceptionCallback = playbackExceptionCallback;
    }

    public void setResourcePath(String str) {
        if (str == null) {
            LogSinker.e(TAG, "Mon.Java. setResourcePath, resourcePath is null");
            return;
        }
        String strConcat = str;
        if (!str.endsWith("/")) {
            strConcat = str.concat("/");
        }
        this.mResourcePath = strConcat;
        nativeSetResourcePath(strConcat);
        MontageMediaFileConvertor.setAuroraResPath(strConcat);
        MontageImageGrabber.setAuroraResPath(this.mResourcePath);
    }

    public void setSeekingCallback(SeekingCallback seekingCallback) {
        this.mSeekCallback = seekingCallback;
    }

    public void setStreamingEngineCallback(StreamingEngineCallback streamingEngineCallback) {
        this.mStreamingEngineCallback = streamingEngineCallback;
    }

    public void setTimelineTimestampCallback(TimelineTimestampCallback timelineTimestampCallback) {
        this.mTimelineStampCallbk = timelineTimestampCallback;
    }

    public void stop() {
        stop(0);
    }

    public void stop(int i7) {
        ExportEngine exportEngine;
        LogSinker.i(TAG, String.format("Mon.Java stop, mCurState is %d, %d", Integer.valueOf(this.mCurState), Integer.valueOf(i7)));
        int i8 = this.mCurState;
        if (i8 == 3 || i8 == 4) {
            PreviewPlayer previewPlayer = this.mTimelineToPlayer.get(this.mCurPlayTimeline);
            if (previewPlayer != null && previewPlayer.pausePlayback()) {
                postStopped(this.mCurPlayTimeline);
            }
        } else if (i8 == 5 && (exportEngine = this.mTimelineToExport.get(this.mCurExportTimeline)) != null) {
            exportEngine.cancel();
            this.mCurState = 6;
        }
        if ((i7 & 8) != 0) {
            destroyPlayer(this.mCurExportTimeline, false);
            this.mCurPlayTimeline = null;
        }
    }

    public void updateTimeline(MontageTimeline montageTimeline) {
        if (montageTimeline != null && montageTimeline.isValid()) {
            PreviewPlayer previewPlayer = this.mTimelineToPlayer.get(montageTimeline);
            if (previewPlayer == null) {
                return;
            }
            previewPlayer.updateTimeline(montageTimeline);
            return;
        }
        boolean zIsValid = false;
        boolean z6 = montageTimeline == null;
        if (montageTimeline != null) {
            zIsValid = montageTimeline.isValid();
        }
        LogSinker.e(TAG, "Mon.Java. updateTimeline, timeline==null: " + z6 + ", timeline valid: " + zIsValid);
    }
}
