package com.bilibili.lib.projection.internal.api;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/api/CloudDevices.class */
@Keep
public final class CloudDevices {

    @JSONField(name = "devices")
    @Nullable
    private List<Device> mDevices;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/api/CloudDevices$Device.class */
    @Keep
    public static final class Device {

        @JSONField(name = "fourk")
        private int mFourk;

        @JSONField(name = "build")
        private int mVersion;

        @JSONField(name = "name")
        @NotNull
        private String mName = "";

        @JSONField(name = "buvid")
        @NotNull
        private String mBuvid = "";

        @JSONField(name = Tm0.a.f24207d)
        @NotNull
        private String mBrand = "";

        @JSONField(name = "model")
        @NotNull
        private String mModel = "";

        @JSONField(name = "mobi_app")
        @NotNull
        private String mobiApp = "";

        @JSONField(name = EditCustomizeSticker.TAG_MID)
        @NotNull
        private String mid = "";

        @NotNull
        public final String getMBrand() {
            return this.mBrand;
        }

        @NotNull
        public final String getMBuvid() {
            return this.mBuvid;
        }

        public final int getMFourk() {
            return this.mFourk;
        }

        @NotNull
        public final String getMModel() {
            return this.mModel;
        }

        @NotNull
        public final String getMName() {
            return this.mName;
        }

        public final int getMVersion() {
            return this.mVersion;
        }

        @NotNull
        public final String getMid() {
            return this.mid;
        }

        @NotNull
        public final String getMobiApp() {
            return this.mobiApp;
        }

        public final void setMBrand(@NotNull String str) {
            this.mBrand = str;
        }

        public final void setMBuvid(@NotNull String str) {
            this.mBuvid = str;
        }

        public final void setMFourk(int i7) {
            this.mFourk = i7;
        }

        public final void setMModel(@NotNull String str) {
            this.mModel = str;
        }

        public final void setMName(@NotNull String str) {
            this.mName = str;
        }

        public final void setMVersion(int i7) {
            this.mVersion = i7;
        }

        public final void setMid(@NotNull String str) {
            this.mid = str;
        }

        public final void setMobiApp(@NotNull String str) {
            this.mobiApp = str;
        }
    }

    @Nullable
    public final List<Device> getMDevices() {
        return this.mDevices;
    }

    public final void setMDevices(@Nullable List<Device> list) {
        this.mDevices = list;
    }
}
