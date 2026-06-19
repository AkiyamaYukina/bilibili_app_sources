package com.bilibili.montage.avinfo;

import androidx.compose.runtime.I0;
import java.util.Arrays;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/avinfo/MontageAVFileInfo.class */
public class MontageAVFileInfo {
    public static final int AV_FILE_TYPE_AUDIO = 1;
    public static final int AV_FILE_TYPE_AUDIOVIDEO = 0;
    public static final int AV_FILE_TYPE_IMAGE = 2;
    public static final int AV_FILE_TYPE_UNKNOWN = -1;
    private MontageAudioStreamInfo[] audioStreamInfos = new MontageAudioStreamInfo[4];
    private long mDataRate;
    private long mDuration;
    private int mNumAudioStream;
    private int mNumVideoStream;
    private int mType;
    private MontageVideoStreamInfo videoStreamInfo;

    public int getAVFileType() {
        return this.mType;
    }

    public int getAudioStreamChannelCount(int i7) {
        MontageAudioStreamInfo montageAudioStreamInfo;
        if (i7 < 0) {
            return 0;
        }
        MontageAudioStreamInfo[] montageAudioStreamInfoArr = this.audioStreamInfos;
        if (i7 >= montageAudioStreamInfoArr.length || i7 >= this.mNumAudioStream || (montageAudioStreamInfo = montageAudioStreamInfoArr[i7]) == null) {
            return 0;
        }
        return montageAudioStreamInfo.channelCount;
    }

    public boolean getAudioStreamCodecSupport(int i7) {
        MontageAudioStreamInfo montageAudioStreamInfo;
        MontageAudioStreamInfo[] montageAudioStreamInfoArr = this.audioStreamInfos;
        if (i7 >= montageAudioStreamInfoArr.length || (montageAudioStreamInfo = montageAudioStreamInfoArr[i7]) == null) {
            return false;
        }
        return Arrays.asList("MP3", "AAC", "PCM", "FLAC").contains(montageAudioStreamInfo.codec);
    }

    public int getAudioStreamCount() {
        return this.mNumAudioStream;
    }

    public long getAudioStreamDuration(int i7) {
        MontageAudioStreamInfo montageAudioStreamInfo;
        if (i7 < 0) {
            return 0L;
        }
        MontageAudioStreamInfo[] montageAudioStreamInfoArr = this.audioStreamInfos;
        if (i7 >= montageAudioStreamInfoArr.length || i7 >= this.mNumAudioStream || (montageAudioStreamInfo = montageAudioStreamInfoArr[i7]) == null) {
            return 0L;
        }
        return montageAudioStreamInfo.duration;
    }

    public int getAudioStreamSampleRate(int i7) {
        MontageAudioStreamInfo montageAudioStreamInfo;
        if (i7 < 0) {
            return 0;
        }
        MontageAudioStreamInfo[] montageAudioStreamInfoArr = this.audioStreamInfos;
        if (i7 >= montageAudioStreamInfoArr.length || i7 >= this.mNumAudioStream || (montageAudioStreamInfo = montageAudioStreamInfoArr[i7]) == null) {
            return 0;
        }
        return montageAudioStreamInfo.sampleRate;
    }

    public long getDataRate() {
        return this.mDataRate;
    }

    public long getDuration() {
        return this.mDuration;
    }

    public int getVideoCodecLevel(int i7) {
        MontageVideoStreamInfo montageVideoStreamInfo;
        if (i7 != 0 || (montageVideoStreamInfo = this.videoStreamInfo) == null) {
            return -99;
        }
        return montageVideoStreamInfo.codecLevel;
    }

    public int getVideoCodecProfile(int i7) {
        MontageVideoStreamInfo montageVideoStreamInfo;
        if (i7 != 0 || (montageVideoStreamInfo = this.videoStreamInfo) == null) {
            return -99;
        }
        return montageVideoStreamInfo.codecProfile;
    }

    public int getVideoStreamCodecType(int i7) {
        MontageVideoStreamInfo montageVideoStreamInfo;
        if (i7 >= this.mNumVideoStream || (montageVideoStreamInfo = this.videoStreamInfo) == null) {
            return 0;
        }
        return montageVideoStreamInfo.videoCodecType;
    }

    public int getVideoStreamColorTranfer(int i7) {
        MontageVideoStreamInfo montageVideoStreamInfo;
        if (i7 != 0 || (montageVideoStreamInfo = this.videoStreamInfo) == null) {
            return 0;
        }
        return montageVideoStreamInfo.colorTranfer;
    }

    public int getVideoStreamComponentBitCount(int i7) {
        MontageVideoStreamInfo montageVideoStreamInfo;
        if (i7 != 0 || (montageVideoStreamInfo = this.videoStreamInfo) == null) {
            return 0;
        }
        return montageVideoStreamInfo.componentBitCount;
    }

    public int getVideoStreamCount() {
        return this.mNumVideoStream;
    }

    public MontageSize getVideoStreamDimension(int i7) {
        MontageVideoStreamInfo montageVideoStreamInfo;
        MontageSize montageSize = new MontageSize();
        if (i7 < this.mNumVideoStream && (montageVideoStreamInfo = this.videoStreamInfo) != null) {
            montageSize.width = montageVideoStreamInfo.imageWidth;
            montageSize.height = montageVideoStreamInfo.imageHeight;
        }
        return montageSize;
    }

    public long getVideoStreamDuration(int i7) {
        MontageVideoStreamInfo montageVideoStreamInfo;
        if (i7 >= this.mNumVideoStream || (montageVideoStreamInfo = this.videoStreamInfo) == null) {
            return 0L;
        }
        return montageVideoStreamInfo.duration;
    }

    public MontageRational getVideoStreamFrameRate(int i7) {
        MontageVideoStreamInfo montageVideoStreamInfo;
        MontageRational montageRational = new MontageRational();
        if (i7 < this.mNumVideoStream && (montageVideoStreamInfo = this.videoStreamInfo) != null) {
            MontageRational montageRational2 = montageVideoStreamInfo.frameRate;
            montageRational.num = montageRational2.num;
            montageRational.den = montageRational2.den;
        }
        return montageRational;
    }

    public MontageRational getVideoStreamPixelAspectRatio(int i7) {
        MontageVideoStreamInfo montageVideoStreamInfo;
        MontageRational montageRational = new MontageRational();
        if (i7 < this.mNumVideoStream && (montageVideoStreamInfo = this.videoStreamInfo) != null) {
            MontageRational montageRational2 = montageVideoStreamInfo.pixelAspectRatio;
            montageRational.den = montageRational2.den;
            montageRational.num = montageRational2.num;
        }
        return montageRational;
    }

    public int getVideoStreamRotation(int i7) {
        MontageVideoStreamInfo montageVideoStreamInfo = this.videoStreamInfo;
        if (montageVideoStreamInfo == null || i7 >= this.mNumVideoStream) {
            return 0;
        }
        return montageVideoStreamInfo.displayRotation;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MontageAVFileInfo{mType=");
        sb.append(this.mType);
        sb.append(", mDuration=");
        sb.append(this.mDuration);
        sb.append(", mDataRate=");
        sb.append(this.mDataRate);
        sb.append(", mNumVideoStream=");
        sb.append(this.mNumVideoStream);
        sb.append(", mNumAudioStream=");
        sb.append(this.mNumAudioStream);
        sb.append(", videoStreamInfo=");
        MontageVideoStreamInfo montageVideoStreamInfo = this.videoStreamInfo;
        sb.append(montageVideoStreamInfo != null ? montageVideoStreamInfo.toString() : "null");
        sb.append(", audioStreamInfos=");
        MontageAudioStreamInfo montageAudioStreamInfo = this.audioStreamInfos[0];
        return I0.b(sb, montageAudioStreamInfo != null ? montageAudioStreamInfo.toString() : "null", '}');
    }
}
