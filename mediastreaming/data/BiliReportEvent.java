package com.bilibili.mediastreaming.data;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/data/BiliReportEvent.class */
@Keep
public final class BiliReportEvent extends BiliConnectStats {

    @NotNull
    private String blpEncoderName = "";

    @NotNull
    private String blpWorkMode = "";

    @NotNull
    private String blpStatus = "";

    @NotNull
    private String blpPacketType = "";

    @NotNull
    private String blpLogMessage = "";

    @NotNull
    private String blpVideoEncodeType = "";

    @NotNull
    private String blpVideoEncodeImplementationName = "";

    @NotNull
    private String blpVideoEncodeResolution = "";

    @NotNull
    private String blpVideoEncodeSetupBitrate = "";

    @NotNull
    private String blpAudioEncodeType = "";

    @NotNull
    private String blpAudioEncodeProfile = "";

    @NotNull
    private String blpAudioEncodeImplementationName = "";

    @NotNull
    private String blpAudioEncodeSetupBitrate = "";

    @NotNull
    private String blpAudioEncodeSamplerate = "";

    @NotNull
    private String blpAudioEncodeChannels = "";

    @NotNull
    public final String getBlpAudioEncodeChannels() {
        return this.blpAudioEncodeChannels;
    }

    @NotNull
    public final String getBlpAudioEncodeImplementationName() {
        return this.blpAudioEncodeImplementationName;
    }

    @NotNull
    public final String getBlpAudioEncodeProfile() {
        return this.blpAudioEncodeProfile;
    }

    @NotNull
    public final String getBlpAudioEncodeSamplerate() {
        return this.blpAudioEncodeSamplerate;
    }

    @NotNull
    public final String getBlpAudioEncodeSetupBitrate() {
        return this.blpAudioEncodeSetupBitrate;
    }

    @NotNull
    public final String getBlpAudioEncodeType() {
        return this.blpAudioEncodeType;
    }

    @NotNull
    public final String getBlpEncoderName() {
        return this.blpEncoderName;
    }

    @NotNull
    public final String getBlpLogMessage() {
        return this.blpLogMessage;
    }

    @NotNull
    public final String getBlpPacketType() {
        return this.blpPacketType;
    }

    @NotNull
    public final String getBlpStatus() {
        return this.blpStatus;
    }

    @NotNull
    public final String getBlpVideoEncodeImplementationName() {
        return this.blpVideoEncodeImplementationName;
    }

    @NotNull
    public final String getBlpVideoEncodeResolution() {
        return this.blpVideoEncodeResolution;
    }

    @NotNull
    public final String getBlpVideoEncodeSetupBitrate() {
        return this.blpVideoEncodeSetupBitrate;
    }

    @NotNull
    public final String getBlpVideoEncodeType() {
        return this.blpVideoEncodeType;
    }

    @NotNull
    public final String getBlpWorkMode() {
        return this.blpWorkMode;
    }

    public final void setBlpAudioEncodeChannels(@NotNull String str) {
        this.blpAudioEncodeChannels = str;
    }

    public final void setBlpAudioEncodeImplementationName(@NotNull String str) {
        this.blpAudioEncodeImplementationName = str;
    }

    public final void setBlpAudioEncodeProfile(@NotNull String str) {
        this.blpAudioEncodeProfile = str;
    }

    public final void setBlpAudioEncodeSamplerate(@NotNull String str) {
        this.blpAudioEncodeSamplerate = str;
    }

    public final void setBlpAudioEncodeSetupBitrate(@NotNull String str) {
        this.blpAudioEncodeSetupBitrate = str;
    }

    public final void setBlpAudioEncodeType(@NotNull String str) {
        this.blpAudioEncodeType = str;
    }

    public final void setBlpEncoderName(@NotNull String str) {
        this.blpEncoderName = str;
    }

    public final void setBlpLogMessage(@NotNull String str) {
        this.blpLogMessage = str;
    }

    public final void setBlpPacketType(@NotNull String str) {
        this.blpPacketType = str;
    }

    public final void setBlpStatus(@NotNull String str) {
        this.blpStatus = str;
    }

    public final void setBlpVideoEncodeImplementationName(@NotNull String str) {
        this.blpVideoEncodeImplementationName = str;
    }

    public final void setBlpVideoEncodeResolution(@NotNull String str) {
        this.blpVideoEncodeResolution = str;
    }

    public final void setBlpVideoEncodeSetupBitrate(@NotNull String str) {
        this.blpVideoEncodeSetupBitrate = str;
    }

    public final void setBlpVideoEncodeType(@NotNull String str) {
        this.blpVideoEncodeType = str;
    }

    public final void setBlpWorkMode(@NotNull String str) {
        this.blpWorkMode = str;
    }
}
