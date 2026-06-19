package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameVersionPage.class */
@Keep
public class BiligameVersionPage<E> {
    public List<E> list;

    @JSONField(name = "re_version")
    public String version;
}
