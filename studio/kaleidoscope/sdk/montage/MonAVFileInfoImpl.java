package com.bilibili.studio.kaleidoscope.sdk.montage;

import androidx.annotation.NonNull;
import com.bilibili.montage.avinfo.MontageAVFileInfo;
import com.bilibili.studio.kaleidoscope.sdk.AVFileInfo;
import com.bilibili.studio.kaleidoscope.sdk.Rational;
import com.bilibili.studio.kaleidoscope.sdk.Size;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonAVFileInfoImpl.class */
public final class MonAVFileInfoImpl implements AVFileInfo {
    private static final String TAG = "Mon.AVFI.Impl";
    private MontageAVFileInfo mMontageAVFileInfo;

    public MonAVFileInfoImpl() {
        this.mMontageAVFileInfo = new MontageAVFileInfo();
    }

    private MonAVFileInfoImpl(@NonNull MontageAVFileInfo montageAVFileInfo) {
        this.mMontageAVFileInfo = montageAVFileInfo;
    }

    @NonNull
    public static AVFileInfo box(@NonNull MontageAVFileInfo montageAVFileInfo) {
        return new MonAVFileInfoImpl(montageAVFileInfo);
    }

    @NonNull
    public static MontageAVFileInfo unbox(@NonNull AVFileInfo aVFileInfo) {
        return (MontageAVFileInfo) aVFileInfo.getAVFileInfo();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AVFileInfo
    public Object getAVFileInfo() {
        return this.mMontageAVFileInfo;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AVFileInfo
    public int getAVFileType() {
        MontageAVFileInfo montageAVFileInfo = this.mMontageAVFileInfo;
        return montageAVFileInfo == null ? 0 : montageAVFileInfo.getAVFileType();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AVFileInfo
    public boolean getAudioStreamCodecSupport(int i7) {
        MontageAVFileInfo montageAVFileInfo = this.mMontageAVFileInfo;
        return montageAVFileInfo == null ? false : montageAVFileInfo.getAudioStreamCodecSupport(i7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AVFileInfo
    public int getAudioStreamCount() {
        MontageAVFileInfo montageAVFileInfo = this.mMontageAVFileInfo;
        return montageAVFileInfo == null ? 0 : montageAVFileInfo.getAudioStreamCount();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AVFileInfo
    public long getAudioStreamDuration(int i7) {
        MontageAVFileInfo montageAVFileInfo = this.mMontageAVFileInfo;
        return montageAVFileInfo == null ? 0L : montageAVFileInfo.getAudioStreamDuration(i7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AVFileInfo
    public int getAudioStreamSampleRate(int i7) {
        MontageAVFileInfo montageAVFileInfo = this.mMontageAVFileInfo;
        return montageAVFileInfo == null ? 0 : montageAVFileInfo.getAudioStreamSampleRate(i7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AVFileInfo
    public long getDataRate() {
        MontageAVFileInfo montageAVFileInfo = this.mMontageAVFileInfo;
        return montageAVFileInfo == null ? 0L : montageAVFileInfo.getDataRate();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AVFileInfo
    public long getDuration() {
        MontageAVFileInfo montageAVFileInfo = this.mMontageAVFileInfo;
        return montageAVFileInfo == null ? 0L : montageAVFileInfo.getDuration();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AVFileInfo
    public int getVideoStreamCodecType(int i7) {
        MontageAVFileInfo montageAVFileInfo = this.mMontageAVFileInfo;
        return montageAVFileInfo == null ? 0 : montageAVFileInfo.getVideoStreamCodecType(i7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AVFileInfo
    public int getVideoStreamColorTranfer(int i7) {
        MontageAVFileInfo montageAVFileInfo = this.mMontageAVFileInfo;
        return montageAVFileInfo == null ? 0 : montageAVFileInfo.getVideoStreamColorTranfer(i7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AVFileInfo
    public int getVideoStreamComponentBitCount(int i7) {
        MontageAVFileInfo montageAVFileInfo = this.mMontageAVFileInfo;
        return montageAVFileInfo == null ? 0 : montageAVFileInfo.getVideoStreamComponentBitCount(i7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AVFileInfo
    public int getVideoStreamCount() {
        return this.mMontageAVFileInfo.getVideoStreamCount();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AVFileInfo
    @NonNull
    public Size getVideoStreamDimension(int i7) {
        return MonSizeImpl.box(this.mMontageAVFileInfo.getVideoStreamDimension(i7));
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AVFileInfo
    public long getVideoStreamDuration(int i7) {
        MontageAVFileInfo montageAVFileInfo = this.mMontageAVFileInfo;
        return montageAVFileInfo == null ? 0L : montageAVFileInfo.getVideoStreamDuration(i7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AVFileInfo
    @NonNull
    public Rational getVideoStreamFrameRate(int i7) {
        return MonRationalImpl.box(this.mMontageAVFileInfo.getVideoStreamFrameRate(i7));
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AVFileInfo
    public int getVideoStreamRotation(int i7) {
        MontageAVFileInfo montageAVFileInfo = this.mMontageAVFileInfo;
        return montageAVFileInfo == null ? 0 : montageAVFileInfo.getVideoStreamRotation(i7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AVFileInfo
    public void setAVFileInfo(Object obj) {
        this.mMontageAVFileInfo = (MontageAVFileInfo) obj;
    }
}
