package com.bilibili.live.streaming;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/LiveConstants.class */
public final class LiveConstants {
    public static final int AUDIO_BITRATE_128 = 128000;
    public static final int AUDIO_BITRATE_96 = 96000;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int FIT_FORCE = 4;
    public static final int FIT_HEIGHT = 6;
    public static final int FIT_INNER = 2;
    public static final int FIT_NOFIT = 1;
    public static final int FIT_OUTER = 3;
    public static final int FIT_WIDTH = 5;
    public static final int MAIN_SOURCE = 0;

    @NotNull
    public static final String NETWORK_TEST_CODEC = "NetworkTestEncoder";

    @NotNull
    public static final String NORMAL_VIDEO_CODEC = "VideoEncoder";

    @NotNull
    public static final String PURE_VOICE_VIDEO_CODEC = "VoiceVideoEncoder";
    public static final int RENDER_OUTPUT = 1;
    public static final int RENDER_PREVIEW = 2;
    public static final int SECOND_SOURCE = 1;
    public static final int VIDEO_BITRATE_1200 = 1200000;
    public static final int VIDEO_BITRATE_1600 = 1600000;
    public static final int VIDEO_BITRATE_2400 = 2400000;
    public static final int VIDEO_BITRATE_3000 = 3000000;
    public static final int VIDEO_BITRATE_5000 = 5000000;
    public static final int VIDEO_BITRATE_800 = 800000;
    public static final int VIDEO_BITRATE_8000 = 8000000;

    @NotNull
    public static final String VIDEO_CODEC_AVC = "avc";

    @NotNull
    public static final String VIDEO_CODEC_HEVC = "hevc";
    public static final int VIDEO_RESOLUTION_TYPE_1080_1920 = 6;
    public static final int VIDEO_RESOLUTION_TYPE_1280_720 = 5;
    public static final int VIDEO_RESOLUTION_TYPE_1920_1080 = 7;
    public static final int VIDEO_RESOLUTION_TYPE_360_640 = 0;
    public static final int VIDEO_RESOLUTION_TYPE_540_960 = 1;
    public static final int VIDEO_RESOLUTION_TYPE_640_360 = 3;
    public static final int VIDEO_RESOLUTION_TYPE_720_1280 = 2;
    public static final int VIDEO_RESOLUTION_TYPE_960_540 = 4;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/LiveConstants$AudioBitRate.class */
    @Target({ElementType.TYPE_USE})
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.TYPE})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface AudioBitRate {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/LiveConstants$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/LiveConstants$FitMode.class */
    @Target({ElementType.PARAMETER, ElementType.TYPE_USE})
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.TYPE, AnnotationTarget.VALUE_PARAMETER})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface FitMode {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/LiveConstants$SourcePriority.class */
    @Target({ElementType.PARAMETER, ElementType.TYPE_USE})
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.TYPE, AnnotationTarget.VALUE_PARAMETER})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface SourcePriority {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/LiveConstants$VideoBitRate.class */
    @Target({ElementType.TYPE_USE})
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.TYPE})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface VideoBitRate {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/LiveConstants$VideoCodecType.class */
    @Target({ElementType.PARAMETER, ElementType.TYPE_USE})
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.TYPE, AnnotationTarget.VALUE_PARAMETER})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface VideoCodecType {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/LiveConstants$VideoResolution.class */
    @Target({ElementType.TYPE_USE})
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.TYPE})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface VideoResolution {
    }
}
