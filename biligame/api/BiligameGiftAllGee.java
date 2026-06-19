package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameGiftAllGee.class */
@Keep
public class BiligameGiftAllGee {

    @JSONField(name = "fail_count")
    public int failCount;

    @JSONField(name = "fail_gift_list")
    public List<BiligameGiftDetail> failGiftInfoList;

    @JSONField(name = "gift_info_list")
    public List<BiligameGiftDetail> giftInfoList;
}
