package com.bilibili.upper.module.tempalte.view.entrance.bean;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/tempalte/view/entrance/bean/EntranceItemBean.class */
@Keep
public class EntranceItemBean {
    public String desc;
    public String gradientEnd;
    public String gradientStart;
    public String icon;
    public String routeUrl;
    public String title;
    public int type;

    public EntranceItemBean(String str, String str2, String str3, int i7) {
        this(str, str2, str3, "", i7, "", "");
    }

    public EntranceItemBean(String str, String str2, String str3, String str4, int i7) {
        this(str, str2, str3, str4, i7, "", "");
    }

    public EntranceItemBean(String str, String str2, String str3, String str4, int i7, String str5, String str6) {
        this.icon = str;
        this.title = str2;
        this.desc = str3;
        this.routeUrl = str4;
        this.type = i7;
        this.gradientStart = str5;
        this.gradientEnd = str6;
    }
}
