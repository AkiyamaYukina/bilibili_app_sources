package com.bilibili.upper.module.manuscript.bean;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/bean/BtnBean.class */
@Keep
public class BtnBean {
    public int bgRes;
    public int disable;
    public String name;
    public int txtColorRes;
    public int type;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/bean/BtnBean$BtnConstant.class */
    @Retention(RetentionPolicy.SOURCE)
    @Keep
    public @interface BtnConstant {
        public static final int BTN_APPEAL = 11;
        public static final int BTN_ASSOCIATE_JOIN = 13;
        public static final int BTN_COMMENT = 9;
        public static final int BTN_DATA = 6;
        public static final int BTN_DELETE = 10;
        public static final int BTN_EDIT = 7;
        public static final int BTN_MANUSCRIPT_QUERY_PROGRESS = 14;
        public static final int BTN_MORE = 8;
        public static final int BTN_SHARE = 5;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/bean/BtnBean$UploadBtnConstant.class */
    @Retention(RetentionPolicy.SOURCE)
    @Keep
    public @interface UploadBtnConstant {
        public static final int BTN_PAUSE = 1;
        public static final int BTN_RESUME = 2;
        public static final int BTN_RETRY_SUBMIT = 4;
        public static final int BTN_RETRY_UPLOAD = 3;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/bean/BtnBean$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f113577a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BtnBean(@NonNull a aVar) {
        this("查询进度", 14, 0);
        aVar.getClass();
        this.bgRes = aVar.f113577a;
        this.txtColorRes = 2131102728;
    }

    public BtnBean(String str, int i7) {
        this.disable = 0;
        this.bgRes = 2131241242;
        this.txtColorRes = 2131104241;
        this.name = str;
        this.type = i7;
    }

    public BtnBean(String str, int i7, int i8) {
        this(str, i7);
        this.disable = i8;
    }
}
