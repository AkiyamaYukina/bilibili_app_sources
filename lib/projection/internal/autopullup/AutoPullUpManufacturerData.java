package com.bilibili.lib.projection.internal.autopullup;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/autopullup/AutoPullUpManufacturerData.class */
@Keep
public final class AutoPullUpManufacturerData {

    @JSONField(name = "manufacture_list")
    @NotNull
    private List<AutoPullUpManufacturer> manufactureList = new ArrayList();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/autopullup/AutoPullUpManufacturerData$AutoPullUpManufacturer.class */
    @Keep
    public static final class AutoPullUpManufacturer {

        @JSONField(name = "ignore_direct")
        private boolean ignoreDirect;

        @JSONField(name = "opt")
        private boolean opt;

        @JSONField(name = "manufacture")
        @NotNull
        private String manufacture = "";

        @JSONField(name = "cast_service")
        @NotNull
        private String castService = "";

        @JSONField(name = "opt_name")
        @NotNull
        private String optName = "";

        @NotNull
        public final String getCastService() {
            return this.castService;
        }

        public final boolean getIgnoreDirect() {
            return this.ignoreDirect;
        }

        @NotNull
        public final String getManufacture() {
            return this.manufacture;
        }

        public final boolean getOpt() {
            return this.opt;
        }

        @NotNull
        public final String getOptName() {
            return this.optName;
        }

        public final void setCastService(@NotNull String str) {
            this.castService = str;
        }

        public final void setIgnoreDirect(boolean z6) {
            this.ignoreDirect = z6;
        }

        public final void setManufacture(@NotNull String str) {
            this.manufacture = str;
        }

        public final void setOpt(boolean z6) {
            this.opt = z6;
        }

        public final void setOptName(@NotNull String str) {
            this.optName = str;
        }
    }

    @NotNull
    public final List<AutoPullUpManufacturer> getManufactureList() {
        return this.manufactureList;
    }

    public final void setManufactureList(@NotNull List<AutoPullUpManufacturer> list) {
        this.manufactureList = list;
    }
}
