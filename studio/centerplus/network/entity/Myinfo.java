package com.bilibili.studio.centerplus.network.entity;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.studio.kaleidoscope.sdk.support.SupportCustomFilter;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/network/entity/Myinfo.class */
@Keep
public class Myinfo implements Serializable {
    public boolean activated;
    public boolean banned;
    public int commercial;
    public long deftime;
    public long deftime_end;
    public String deftime_msg;
    public String face;
    public long follower;

    @JSONField(name = "identify_check")
    public IdentifyCheck identifyCheck;
    public int level;
    public long mid;

    @JSONField(name = "staff_qualification_v2")
    public JoinStaffPermission staffQualification;
    public String uname;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/network/entity/Myinfo$IdentifyCheck.class */
    @Keep
    public static class IdentifyCheck implements Serializable {
        public long code;
        public String msg;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/network/entity/Myinfo$JoinStaffPermission.class */
    @Keep
    public static class JoinStaffPermission implements Serializable {

        @JSONField(name = "black")
        public boolean black;

        @JSONField(name = "cnt")
        public boolean cnt;

        @JSONField(name = "is_enterprise_blue")
        public boolean isEnterpriseBlue;

        @JSONField(name = "official_type")
        public int officialVerifyType;

        @JSONField(name = "staff_auth")
        public boolean staffEntry;

        @JSONField(name = "tips")
        public StaffTips tips;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/network/entity/Myinfo$JoinStaffPermission$StaffTips.class */
        @Keep
        public static class StaffTips implements Serializable {

            @JSONField(name = "cnt_empty_tips")
            public List<TipText> cntEmptyTips;

            @JSONField(name = "cnt_remaining_tips")
            public List<TipText> cntRemainingTips;
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/network/entity/Myinfo$JoinStaffPermission$TipText.class */
        @Keep
        public static class TipText implements Serializable {

            @JSONField(name = SupportCustomFilter.CUSTOM_FILTER_HIGHLIGHT)
            public boolean highlight;

            @JSONField(name = "text")
            public String text;
        }
    }
}
