package com.bilibili.upper.module.manuscript.bean;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/bean/RemoteMenuBean.class */
@Keep
public class RemoteMenuBean extends MenuBean {
    public String icon;

    @Nullable
    public String url;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/bean/RemoteMenuBean$MenuConstant.class */
    @Retention(RetentionPolicy.SOURCE)
    @Keep
    public @interface MenuConstant {
        public static final int MENU_AUTHOR_JOIN_UP = 12;
        public static final int MENU_CHAPTER = 11;
        public static final int MENU_COMMENT = 1;
        public static final int MENU_DATA = 2;
        public static final int MENU_DELETE = 4;
        public static final int MENU_EDIT = 0;
        public static final int MENU_FLY = 8;
        public static final int MENU_SELF_VISIBLE = 9;
        public static final int MENU_SHARE = 3;
        public static final int MENU_TRANSFER_DANMU = 10;
    }
}
