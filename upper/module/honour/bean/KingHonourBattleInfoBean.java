package com.bilibili.upper.module.honour.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/honour/bean/KingHonourBattleInfoBean.class */
@Keep
public class KingHonourBattleInfoBean {

    @JSONField(name = "today_surplus")
    public int todaySurplus;

    @JSONField(name = "valor")
    public List<KingHonourGameBean> valor;
}
