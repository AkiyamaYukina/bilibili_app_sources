package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameGiftDetail.class */
@Keep
public class BiligameGiftDetail implements Serializable {
    public static final String GIFT_TYPE_BOOK = "4";
    public static final String GIFT_TYPE_BOOK_VERSION = "9";

    @JSONField(name = "code_begin_time")
    public String codeBeginTime;

    @JSONField(name = "code_end_time")
    public String codeEndTime;

    @JSONField(name = "extra_info")
    public GiftExtraInfo extraInfo;

    @JSONField(name = "game_base_id")
    public String gameBaseId;

    @JSONField(name = "game_icon")
    public String gameIcon;

    @JSONField(name = "gift_icon_list")
    public List<BiligameGiftIcon> giftIconList;

    @JSONField(name = "gift_info")
    public String giftInfo;

    @JSONField(name = "gift_info_id")
    public String giftInfoId;

    @JSONField(name = "gift_type")
    public String giftType;

    @JSONField(name = "icon")
    public String icon;

    @JSONField(name = "icon_desc")
    public String iconDesc;

    @JSONField(name = "icon_num")
    public String iconNum;

    @JSONField(name = "message")
    public String message;

    @JSONField(name = "name")
    public String name;

    @JSONField(name = "price")
    public String price;

    @JSONField(name = "received")
    public String received;

    @JSONField(name = "remain")
    public int remain;

    @JSONField(name = "stock")
    public String stock;

    @JSONField(name = "use_info")
    public String useInfo;

    @JSONField(name = "use_platform")
    public String usePlatform;

    @JSONField(name = "website_dic")
    public String websiteDic;

    @JSONField(name = "expanded_name")
    public String expandedName = "";

    @JSONField(name = "expired")
    public String expired = "";

    @JSONField(name = "gift_code")
    public String giftCode = "";

    @JSONField(name = "game_name")
    public String gameName = "";

    @JSONField(name = "gift_begin_time")
    public String giftBeginTime = "";

    @JSONField(name = "android_pkg_name")
    public String androidPkgName = "";

    @JSONField(name = "android_pkg_size")
    public String androidPkgSize = "";

    @JSONField(name = "android_pkg_ver")
    public String androidPkgVer = "";

    @JSONField(name = "background_image")
    public String backGroundImage = "";

    @JSONField(name = "gift_vip_type")
    public String giftVipType = "0";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameGiftDetail$GiftExtraInfo.class */
    @Keep
    public static class GiftExtraInfo implements Serializable {

        @JSONField(name = "activity_id")
        public String activityId;

        @JSONField(name = "required_level")
        public int requiredLevel;

        @JSONField(name = "unlocked")
        public boolean unLocked;
    }

    public boolean canTake() {
        return this.remain > 0 && !isReceived();
    }

    public long getEndLongTime() {
        long time;
        try {
            time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA).parse(this.codeEndTime).getTime() + 86400000;
        } catch (Exception e7) {
            e7.printStackTrace();
            time = 0;
        }
        return time;
    }

    public String getItemListText() {
        StringBuilder sb = new StringBuilder();
        List<BiligameGiftIcon> list = this.giftIconList;
        if (list == null || list.isEmpty()) {
            return "";
        }
        for (int i7 = 0; i7 < this.giftIconList.size(); i7++) {
            BiligameGiftIcon biligameGiftIcon = this.giftIconList.get(i7);
            if (i7 != this.giftIconList.size() - 1) {
                sb.append(biligameGiftIcon.iconDesc);
                sb.append("x");
                sb.append(biligameGiftIcon.iconNum);
                sb.append("，");
            } else {
                sb.append(biligameGiftIcon.iconDesc);
                sb.append("x");
                sb.append(biligameGiftIcon.iconNum);
            }
        }
        return sb.toString();
    }

    public boolean isBookVersionGift() {
        return "9".equals(this.giftType);
    }

    public boolean isEarly(long j7) {
        try {
            long time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA).parse(this.codeBeginTime).getTime();
            if (j7 <= 0) {
                j7 = System.currentTimeMillis();
            }
            return time > j7;
        } catch (ParseException e7) {
            e7.printStackTrace();
            return false;
        }
    }

    public boolean isExpired() {
        try {
            return this.expired.equals("1");
        } catch (Exception e7) {
            e7.printStackTrace();
            return false;
        }
    }

    public boolean isReceived() {
        return "1".equals(this.received);
    }

    public boolean isValidGift() {
        return this.remain > 0 && !isReceived();
    }

    public boolean isVipGift() {
        return !"0".equals(this.giftVipType);
    }

    public boolean isVipGiftV2() {
        return "0".equals(this.giftType) || "1".equals(this.giftType);
    }

    public boolean isYearVipGift() {
        return "1".equals(this.giftType);
    }

    public void setReceived(boolean z6) {
        this.received = z6 ? "1" : "0";
    }
}
