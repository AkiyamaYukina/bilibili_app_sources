package com.bilibili.studio.videoeditor.template.bean;

import android.os.Bundle;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/template/bean/BiliActionResponse.class */
@Keep
public class BiliActionResponse {
    public BiliActionResponseData data;
    public int requestCode;
    public int resultCode;
    public boolean success;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/template/bean/BiliActionResponse$BiliActionResponseData.class */
    @Keep
    public static class BiliActionResponseData {
        public int actionType;
        public long duration;
        public Bundle extra;
        public String filePath;

        public String toString() {
            return "BiliActionResponseData{actionType=" + this.actionType + ", filePath='" + this.filePath + "', duration=" + this.duration + ", extra=" + this.extra + '}';
        }
    }

    public BiliActionResponse() {
    }

    public BiliActionResponse(boolean z6, int i7, int i8, BiliActionResponseData biliActionResponseData) {
        this.success = z6;
        this.requestCode = i7;
        this.resultCode = i8;
        this.data = biliActionResponseData;
    }

    public BiliActionResponse(boolean z6, BiliActionResponseData biliActionResponseData) {
        this(z6, 0, 0, biliActionResponseData);
    }

    public String toString() {
        return "BiliActionResponse{success=" + this.success + ", requestCode=" + this.requestCode + ", resultCode=" + this.resultCode + ", data=" + this.data + '}';
    }
}
