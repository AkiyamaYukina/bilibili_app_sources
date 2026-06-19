package com.bilibili.opd.app.bizcommon.hybridruntime.web;

import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/hybridruntime/web/WebToolbarButtonBean.class */
@Keep
public class WebToolbarButtonBean {

    @JSONField(name = "action")
    public String action;

    @JSONField(name = "buttonType")
    public String buttonType;

    @JSONField(name = "icon")
    public String icon;

    @JSONField(name = "iconRatio")
    public double iconRatio;

    @JSONField(name = NotificationCompat.CATEGORY_MESSAGE)
    public String msg;
}
