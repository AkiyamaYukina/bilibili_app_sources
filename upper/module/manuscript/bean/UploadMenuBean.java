package com.bilibili.upper.module.manuscript.bean;

import androidx.annotation.Keep;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/bean/UploadMenuBean.class */
@Keep
public class UploadMenuBean extends MenuBean {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/bean/UploadMenuBean$MenuUpConstant.class */
    @Retention(RetentionPolicy.SOURCE)
    @Keep
    public @interface MenuUpConstant {
        public static final int MENU_COMMENT = 3;
        public static final int MENU_DATA = 2;
        public static final int MENU_DELETE = 4;
        public static final int MENU_EDIT = 1;
        public static final int MENU_SELF_VISIBLE = 9;
        public static final int MENU_SUBMIT_RETRY = 8;
        public static final int MENU_UPLOAD_CONTINUE = 7;
        public static final int MENU_UPLOAD_PAUSE = 5;
        public static final int MENU_UPLOAD_RETRY = 6;
    }

    public UploadMenuBean(String str, int i7, int i8) {
        this.name = str;
        this.res = i8;
        this.type = i7;
    }

    public UploadMenuBean(String str, int i7, int i8, int i9, String str2) {
        this(str, i7, i8);
        this.disable = i9;
        this.disable_reason = str2;
    }
}
