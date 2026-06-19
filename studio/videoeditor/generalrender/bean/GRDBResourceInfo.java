package com.bilibili.studio.videoeditor.generalrender.bean;

import androidx.annotation.Keep;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/generalrender/bean/GRDBResourceInfo.class */
@Keep
public final class GRDBResourceInfo extends GRResourceInfo {

    @Nullable
    private String probeString;

    @Nullable
    private String profile;
    private int resolution;

    @Nullable
    public final String getProbeString() {
        return this.probeString;
    }

    @Nullable
    public final String getProfile() {
        return this.profile;
    }

    public final int getResolution() {
        return this.resolution;
    }

    public final void setProbeString(@Nullable String str) {
        this.probeString = str;
    }

    public final void setProfile(@Nullable String str) {
        this.profile = str;
    }

    public final void setResolution(int i7) {
        this.resolution = i7;
    }
}
