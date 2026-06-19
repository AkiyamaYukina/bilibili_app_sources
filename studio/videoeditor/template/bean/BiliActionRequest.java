package com.bilibili.studio.videoeditor.template.bean;

import android.os.Bundle;
import androidx.annotation.Keep;
import java.io.Serializable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/template/bean/BiliActionRequest.class */
@Keep
public class BiliActionRequest implements Serializable {
    public int actionType;
    public String catId;
    public Bundle extra;
    public String id;
    public int requestCode;
    public int type;

    public BiliActionRequest() {
    }

    public BiliActionRequest(int i7, int i8, String str, String str2, int i9, Bundle bundle) {
        this.actionType = i7;
        this.type = i8;
        this.id = str;
        this.catId = str2;
        this.requestCode = i9;
        if (bundle != null) {
            this.extra = bundle;
        } else {
            this.extra = new Bundle();
        }
    }

    public BiliActionRequest(int i7, String str, String str2, int i8, Bundle bundle) {
        this(i7, 0, str, str2, i8, bundle);
    }

    public String toString() {
        return "BiliActionRequest{actionType=" + this.actionType + ", type=" + this.type + ", id='" + this.id + "', catId='" + this.catId + "', requestCode=" + this.requestCode + ", extra=" + this.extra + '}';
    }
}
