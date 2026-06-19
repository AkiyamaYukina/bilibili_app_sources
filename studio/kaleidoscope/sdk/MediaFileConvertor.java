package com.bilibili.studio.kaleidoscope.sdk;

import java.util.Hashtable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/MediaFileConvertor.class */
public interface MediaFileConvertor {
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
    public static final int CONVERTOR_ERROR_AUDIO_CREATE_ERROR = 7;
    public static final int CONVERTOR_ERROR_CODE_CANCEL = 1;
    public static final int CONVERTOR_ERROR_CODE_NO_ERROR = 0;
    public static final int CONVERTOR_ERROR_UNKNOWN = 65535;
    public static final int CONVERTOR_ERROR_VIDEO_DECODER_ERROR = 4;
    public static final int CONVERTOR_ERROR_VIDEO_DECODING_ERROR = 5;
    public static final int CONVERTOR_ERROR_VIDEO_DURATION_ZERO = 6;
    public static final int CONVERTOR_ERROR_VIDEO_ENCODER_SETUP_ERROR = 2;
    public static final int CONVERTOR_ERROR_VIDEO_ENCODING_ERROR = 3;
    public static final String CONVERTOR_GOP_SIZE = "gopsize";
    public static final String CONVERTOR_MAX_CACHE_SIZE_IN_MEMORY = "max_cache_size_in_memory";
    public static final String CONVERTOR_NO_AUDIO = "convertor-no-audio";
    public static final String CONVERTOR_NO_VIDEO = "convertor-no-video";
    public static final String CONVERTOR_REVERSE_AUDIO_STREAM = "convertor-reverse-audio";
    public static final String CONVERTOR_SPEED_RATIO = "convertor-speed-ratio";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/MediaFileConvertor$MediaFileConvertorCallback.class */
    public interface MediaFileConvertorCallback {
        void notifyAudioMuteRage(long j7, long j8, long j9);

        void onFinish(long j7, String str, String str2, int i7);

        void onProgress(long j7, float f7);
    }

    void cancelTask(long j7);

    long convertMediaFile(String str, String str2, boolean z6, long j7, long j8, Hashtable<String, Object> hashtable);

    Object getMediaFileConvertor();

    boolean isReleased();

    void release();

    void setMediaFileConvertor(Object obj);

    void setMediaFileConvertorCallback(MediaFileConvertorCallback mediaFileConvertorCallback, boolean z6);
}
