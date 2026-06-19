package com.bilibili.live.streaming.encoder;

import Vn.A;
import androidx.compose.runtime.C4277b;
import androidx.media3.exoplayer.C4690e;
import androidx.room.B;
import com.bilibili.live.streaming.gl.BEGLSurface;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.montage.export.ExportEngine;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/encoder/EncoderConfig.class */
public final class EncoderConfig {

    @NotNull
    private String mimeType = "";
    private int width = -1;
    private int height = -1;
    private boolean useBiliHEVC = true;
    private boolean filterProfileLevel = true;
    private int frameRate = -1;
    private int videoBitRate = -1;
    private int iFrameInterval = -1;

    @NotNull
    private BEGLSurface.RenderMode renderMode = BEGLSurface.RenderMode.SDR_SRGB;

    @NotNull
    private InputMode inputMode = InputMode.Surface;
    private boolean useFixEncoder = true;
    private int bFrameDelayFrames = 2;
    private int sampleRateInHz = -1;
    private int channelCount = -1;
    private int audioBitRate = -1;
    private int audioDepth = -1;
    private int signalEndTimeOutMs = BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_PREPROCESS_MAX_SIZE;

    @NotNull
    private final VideoEncoderInfo videoEncoderInfo = new VideoEncoderInfo();

    @NotNull
    private final AudioEncoderInfo audioEncoderInfo = new AudioEncoderInfo();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/encoder/EncoderConfig$AudioEncoderInfo.class */
    public static final class AudioEncoderInfo {

        @NotNull
        private String codecType = ExportEngine.COMPILE_AUDIO_ENCODER_NAME_AAC;

        @NotNull
        private String codecName = "";

        @NotNull
        private String codecProfile = "";

        @NotNull
        public final String getCodecName() {
            return this.codecName;
        }

        @NotNull
        public final String getCodecProfile() {
            return this.codecProfile;
        }

        @NotNull
        public final String getCodecType() {
            return this.codecType;
        }

        public final void setCodecName(@NotNull String str) {
            this.codecName = str;
        }

        public final void setCodecProfile(@NotNull String str) {
            this.codecProfile = str;
        }

        public final void setCodecType(@NotNull String str) {
            this.codecType = str;
        }

        @NotNull
        public String toString() {
            String str = this.codecType;
            String str2 = this.codecName;
            return C8770a.a(G0.b.a("AudioEncoderInfo(codecType='", str, "', codecName='", str2, "', codecProfile='"), this.codecProfile, "')");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/encoder/EncoderConfig$InputMode.class */
    public static final class InputMode {
        private static final EnumEntries $ENTRIES;
        private static final InputMode[] $VALUES;
        public static final InputMode Surface = new InputMode("Surface", 0);
        public static final InputMode ByteBuffer = new InputMode("ByteBuffer", 1);

        private static final /* synthetic */ InputMode[] $values() {
            return new InputMode[]{Surface, ByteBuffer};
        }

        static {
            InputMode[] inputModeArr$values = $values();
            $VALUES = inputModeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(inputModeArr$values);
        }

        private InputMode(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<InputMode> getEntries() {
            return $ENTRIES;
        }

        public static InputMode valueOf(String str) {
            return (InputMode) Enum.valueOf(InputMode.class, str);
        }

        public static InputMode[] values() {
            return (InputMode[]) $VALUES.clone();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/encoder/EncoderConfig$VideoEncoderInfo.class */
    public static final class VideoEncoderInfo {
        private boolean bFrameEnable;

        @NotNull
        private String codecName = "";

        @NotNull
        private String codecType = "avc";

        @NotNull
        private String codecProfile = "";

        @NotNull
        private String codecLevel = "";

        public final boolean getBFrameEnable() {
            return this.bFrameEnable;
        }

        @NotNull
        public final String getCodecLevel() {
            return this.codecLevel;
        }

        @NotNull
        public final String getCodecName() {
            return this.codecName;
        }

        @NotNull
        public final String getCodecProfile() {
            return this.codecProfile;
        }

        @NotNull
        public final String getCodecType() {
            return this.codecType;
        }

        public final void setBFrameEnable(boolean z6) {
            this.bFrameEnable = z6;
        }

        public final void setCodecLevel(@NotNull String str) {
            this.codecLevel = str;
        }

        public final void setCodecName(@NotNull String str) {
            this.codecName = str;
        }

        public final void setCodecProfile(@NotNull String str) {
            this.codecProfile = str;
        }

        public final void setCodecType(@NotNull String str) {
            this.codecType = str;
        }

        @NotNull
        public String toString() {
            String str = this.codecName;
            String str2 = this.codecType;
            String str3 = this.codecProfile;
            String str4 = this.codecLevel;
            boolean z6 = this.bFrameEnable;
            StringBuilder sbA = G0.b.a("VideoEncoderInfo(codecName='", str, "', codecType='", str2, "', codecProfile='");
            B.a(str3, "', codecLevel='", str4, "', bFrameEnable=", sbA);
            return androidx.appcompat.app.i.a(sbA, z6, ")");
        }
    }

    public final int getAudioBitRate() {
        return this.audioBitRate;
    }

    public final int getAudioDepth() {
        return this.audioDepth;
    }

    @NotNull
    public final AudioEncoderInfo getAudioEncoderInfo() {
        return this.audioEncoderInfo;
    }

    public final int getBFrameDelayFrames() {
        return this.bFrameDelayFrames;
    }

    public final int getChannelCount() {
        return this.channelCount;
    }

    public final boolean getFilterProfileLevel() {
        return this.filterProfileLevel;
    }

    public final int getFrameRate() {
        return this.frameRate;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getIFrameInterval() {
        return this.iFrameInterval;
    }

    @NotNull
    public final InputMode getInputMode() {
        return this.inputMode;
    }

    @NotNull
    public final String getMimeType() {
        return this.mimeType;
    }

    @NotNull
    public final BEGLSurface.RenderMode getRenderMode() {
        return this.renderMode;
    }

    public final int getSampleRateInHz() {
        return this.sampleRateInHz;
    }

    public final int getSignalEndTimeOutMs() {
        return this.signalEndTimeOutMs;
    }

    public final boolean getUseBiliHEVC() {
        return this.useBiliHEVC;
    }

    public final boolean getUseFixEncoder() {
        return this.useFixEncoder;
    }

    public final int getVideoBitRate() {
        return this.videoBitRate;
    }

    @NotNull
    public final VideoEncoderInfo getVideoEncoderInfo() {
        return this.videoEncoderInfo;
    }

    public final int getWidth() {
        return this.width;
    }

    public final void setAudioBitRate(int i7) {
        this.audioBitRate = i7;
    }

    public final void setAudioDepth(int i7) {
        this.audioDepth = i7;
    }

    public final void setBFrameDelayFrames(int i7) {
        this.bFrameDelayFrames = i7;
    }

    public final void setChannelCount(int i7) {
        this.channelCount = i7;
    }

    public final void setFilterProfileLevel(boolean z6) {
        this.filterProfileLevel = z6;
    }

    public final void setFrameRate(int i7) {
        this.frameRate = i7;
    }

    public final void setHeight(int i7) {
        this.height = i7;
    }

    public final void setIFrameInterval(int i7) {
        this.iFrameInterval = i7;
    }

    public final void setInputMode(@NotNull InputMode inputMode) {
        this.inputMode = inputMode;
    }

    public final void setMimeType(@NotNull String str) {
        this.mimeType = str;
    }

    public final void setRenderMode(@NotNull BEGLSurface.RenderMode renderMode) {
        this.renderMode = renderMode;
    }

    public final void setSampleRateInHz(int i7) {
        this.sampleRateInHz = i7;
    }

    public final void setSignalEndTimeOutMs(int i7) {
        this.signalEndTimeOutMs = i7;
    }

    public final void setUseBiliHEVC(boolean z6) {
        this.useBiliHEVC = z6;
    }

    public final void setUseFixEncoder(boolean z6) {
        this.useFixEncoder = z6;
    }

    public final void setVideoBitRate(int i7) {
        this.videoBitRate = i7;
    }

    public final void setWidth(int i7) {
        this.width = i7;
    }

    @NotNull
    public String toString() {
        int i7 = this.width;
        int i8 = this.height;
        int i9 = this.frameRate;
        int i10 = this.iFrameInterval;
        int i11 = this.videoBitRate;
        int i12 = this.sampleRateInHz;
        int i13 = this.channelCount;
        int i14 = this.audioBitRate;
        int i15 = this.audioDepth;
        StringBuilder sbB = A.b(i7, i8, "video :", "x", "@");
        C4690e.a(i9, i10, "fps ", "s ", sbB);
        C4690e.a(i11, i12, " v-bit, audio :", " Hz, ", sbB);
        C4690e.a(i13, i14, " channels, ", " kbps, ", sbB);
        return C4277b.a(i15, " a-bit", sbB);
    }
}
