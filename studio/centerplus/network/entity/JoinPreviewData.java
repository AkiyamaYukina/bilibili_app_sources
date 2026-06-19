package com.bilibili.studio.centerplus.network.entity;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.studio.centerplus.network.entity.PreviewData;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/network/entity/JoinPreviewData.class */
@Keep
public class JoinPreviewData {

    @JSONField(name = "charging_pay_info")
    public PreviewData.ChargePayInfo chargingPayInfo;

    @JSONField(name = "common_staff_conf")
    public JoinStaffConf joinStaffConf;

    @JSONField(name = "myinfo")
    public Myinfo myInfo;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/network/entity/JoinPreviewData$JoinStaffConf.class */
    @Keep
    public static class JoinStaffConf implements Serializable {

        @JSONField(name = "max_staff")
        public int maxStaff;

        @JSONField(name = "missions")
        public List<Long> missions;

        @JSONField(name = "titles")
        public List<String> titles;
    }
}
