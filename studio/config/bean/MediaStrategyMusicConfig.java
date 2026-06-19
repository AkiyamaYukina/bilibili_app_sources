package com.bilibili.studio.config.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/config/bean/MediaStrategyMusicConfig.class */
@Keep
public class MediaStrategyMusicConfig {

    @JSONField(name = "default")
    private int defaultNum;

    @JSONField(name = "high")
    private int highNum;

    @JSONField(name = "low")
    private int lowNum;

    @JSONField(name = "middle")
    private int middleNum;

    public int getDefaultNum() {
        return this.defaultNum;
    }

    public int getHighNum() {
        return this.highNum;
    }

    public int getLowNum() {
        return this.lowNum;
    }

    public int getMiddleNum() {
        return this.middleNum;
    }

    public void setDefaultNum(int i7) {
        this.defaultNum = i7;
    }

    public void setHighNum(int i7) {
        this.highNum = i7;
    }

    public void setLowNum(int i7) {
        this.lowNum = i7;
    }

    public void setMiddleNum(int i7) {
        this.middleNum = i7;
    }
}
