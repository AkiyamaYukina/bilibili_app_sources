package com.bilibili.upper.module.manuscript.bean;

import androidx.annotation.Keep;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/bean/UploadStatePanel.class */
@Retention(RetentionPolicy.SOURCE)
@Keep
public @interface UploadStatePanel {
    public static final int STATE_NORMAL = 0;
    public static final int STATE_SLOWLY = 1004;
    public static final int STATE_SUBMIT_FAIL = 1003;
    public static final int STATE_UNDEFINE = -1;
    public static final int STATE_UPLOAD_FAIL = 1001;
    public static final int STATE_UPLOAD_PAUSE = 1002;
    public static final int STATE_UPLOAD_PENDING = 1006;
    public static final int STATE_UPLOAD_PROGRESS = 1000;
    public static final int STATE_WAITE_NET = 1005;
}
