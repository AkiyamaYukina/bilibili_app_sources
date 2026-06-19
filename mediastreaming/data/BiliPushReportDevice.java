package com.bilibili.mediastreaming.data;

import androidx.annotation.Keep;
import com.bilibili.live.streaming.BAVEnviron;
import com.bilibili.mediastreaming.BiliPushDevice;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/data/BiliPushReportDevice.class */
@Keep
public final class BiliPushReportDevice {

    @NotNull
    private String deviceName;

    @NotNull
    private String glRenderer;

    @NotNull
    private String glVendor;

    @NotNull
    private String glVersion;
    private boolean isBt2020PqSupported;
    private boolean isGLES31Supported;
    private boolean isHDREncodeSupported;
    private boolean isSMPTE2086MetadataSupported;

    @NotNull
    private String manufacturer;

    @NotNull
    private String socModel;

    public BiliPushReportDevice() {
        BiliPushDevice biliPushDevice = BiliPushDevice.INSTANCE;
        this.manufacturer = biliPushDevice.getDeviceManufacturer();
        this.deviceName = biliPushDevice.getDeviceName();
        String sOCModel = biliPushDevice.getSOCModel();
        this.socModel = sOCModel == null ? biliPushDevice.getCPUName() : sOCModel;
        BAVEnviron bAVEnviron = BAVEnviron.INSTANCE;
        this.isBt2020PqSupported = bAVEnviron.isBt2020PqSupported();
        this.isSMPTE2086MetadataSupported = bAVEnviron.isSMPTE2086MetadataSupported();
        this.isHDREncodeSupported = bAVEnviron.isHDREncodeSupported();
        this.isGLES31Supported = bAVEnviron.isGLES31Supported();
        this.glRenderer = bAVEnviron.getGl_renderer();
        this.glVendor = bAVEnviron.getGl_vendor();
        this.glVersion = bAVEnviron.getGl_version();
    }

    @NotNull
    public final String getDeviceName() {
        return this.deviceName;
    }

    @NotNull
    public final String getGlRenderer() {
        return this.glRenderer;
    }

    @NotNull
    public final String getGlVendor() {
        return this.glVendor;
    }

    @NotNull
    public final String getGlVersion() {
        return this.glVersion;
    }

    @NotNull
    public final String getManufacturer() {
        return this.manufacturer;
    }

    @NotNull
    public final String getSocModel() {
        return this.socModel;
    }

    public final boolean isBt2020PqSupported() {
        return this.isBt2020PqSupported;
    }

    public final boolean isGLES31Supported() {
        return this.isGLES31Supported;
    }

    public final boolean isHDREncodeSupported() {
        return this.isHDREncodeSupported;
    }

    public final boolean isSMPTE2086MetadataSupported() {
        return this.isSMPTE2086MetadataSupported;
    }

    public final void setBt2020PqSupported(boolean z6) {
        this.isBt2020PqSupported = z6;
    }

    public final void setDeviceName(@NotNull String str) {
        this.deviceName = str;
    }

    public final void setGLES31Supported(boolean z6) {
        this.isGLES31Supported = z6;
    }

    public final void setGlRenderer(@NotNull String str) {
        this.glRenderer = str;
    }

    public final void setGlVendor(@NotNull String str) {
        this.glVendor = str;
    }

    public final void setGlVersion(@NotNull String str) {
        this.glVersion = str;
    }

    public final void setHDREncodeSupported(boolean z6) {
        this.isHDREncodeSupported = z6;
    }

    public final void setManufacturer(@NotNull String str) {
        this.manufacturer = str;
    }

    public final void setSMPTE2086MetadataSupported(boolean z6) {
        this.isSMPTE2086MetadataSupported = z6;
    }

    public final void setSocModel(@NotNull String str) {
        this.socModel = str;
    }
}
