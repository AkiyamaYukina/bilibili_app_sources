package com.bilibili.studio.centerplus.network.entity;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/network/entity/DialogFrequencyConfig.class */
@Keep
public class DialogFrequencyConfig {

    @JSONField(name = "dialogFrequencyConfig")
    private List<DialogFrequencyConfigDTO> dialogFrequencyConfig;

    @JSONField(name = "dialogInfo")
    private List<DialogInfoDTO> dialogInfo;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/network/entity/DialogFrequencyConfig$DialogFrequencyConfigDTO.class */
    @Keep
    public static class DialogFrequencyConfigDTO {

        @JSONField(name = "cycleDays")
        private Integer cycleDays;

        @JSONField(name = "dialogType")
        private Integer dialogType;

        @JSONField(name = "displayIntervalDays")
        private Integer displayIntervalDays;

        @JSONField(name = "maxCycleFrequency")
        private Integer maxCycleFrequency;

        @JSONField(name = "maxDailyFrequency")
        private Integer maxDailyFrequency;

        public Integer getCycleDays() {
            return this.cycleDays;
        }

        public Integer getDialogType() {
            return this.dialogType;
        }

        public Integer getDisplayIntervalDays() {
            return this.displayIntervalDays;
        }

        public Integer getMaxCycleFrequency() {
            return this.maxCycleFrequency;
        }

        public Integer getMaxDailyFrequency() {
            return this.maxDailyFrequency;
        }

        public void setCycleDays(Integer num) {
            this.cycleDays = num;
        }

        public void setDialogType(Integer num) {
            this.dialogType = num;
        }

        public void setDisplayIntervalDays(Integer num) {
            this.displayIntervalDays = num;
        }

        public void setMaxCycleFrequency(Integer num) {
            this.maxCycleFrequency = num;
        }

        public void setMaxDailyFrequency(Integer num) {
            this.maxDailyFrequency = num;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/network/entity/DialogFrequencyConfig$DialogInfoDTO.class */
    @Keep
    public static class DialogInfoDTO {

        @JSONField(name = "dialogBtnCancel")
        private String dialogBtnCancel;

        @JSONField(name = "dialogBtnConfirm")
        private String dialogBtnConfirm;

        @JSONField(name = "dialogText")
        private String dialogText;

        @JSONField(name = "dialogType")
        private Integer dialogType;

        public String getDialogBtnCancel() {
            return this.dialogBtnCancel;
        }

        public String getDialogBtnConfirm() {
            return this.dialogBtnConfirm;
        }

        public String getDialogText() {
            return this.dialogText;
        }

        public Integer getDialogType() {
            return this.dialogType;
        }

        public void setDialogBtnCancel(String str) {
            this.dialogBtnCancel = str;
        }

        public void setDialogBtnConfirm(String str) {
            this.dialogBtnConfirm = str;
        }

        public void setDialogText(String str) {
            this.dialogText = str;
        }

        public void setDialogType(Integer num) {
            this.dialogType = num;
        }
    }

    public List<DialogFrequencyConfigDTO> getDialogFrequencyConfig() {
        return this.dialogFrequencyConfig;
    }

    public List<DialogInfoDTO> getDialogInfo() {
        return this.dialogInfo;
    }

    public void setDialogFrequencyConfig(List<DialogFrequencyConfigDTO> list) {
        this.dialogFrequencyConfig = list;
    }

    public void setDialogInfo(List<DialogInfoDTO> list) {
        this.dialogInfo = list;
    }
}
