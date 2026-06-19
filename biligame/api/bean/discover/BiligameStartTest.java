package com.bilibili.biligame.api.bean.discover;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/discover/BiligameStartTest.class */
@Keep
public class BiligameStartTest {

    @JSONField(name = "future_list")
    public List<BiligameBetaGame> futureList;

    @JSONField(name = "history_list")
    public List<BiligameBetaGame> historyList;
}
