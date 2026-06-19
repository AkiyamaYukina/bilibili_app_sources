package com.bilibili.biligame.api.bean.gamedetail;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/gamedetail/GameActCenterInfo.class */
@StabilityInferred(parameters = 0)
@Keep
public final class GameActCenterInfo implements Serializable {
    public static final int $stable = 8;

    @JSONField(name = "downloaded_list")
    @Nullable
    private List<ActivityInfoBean> downloadedList;

    @JSONField(name = "hot_list")
    @Nullable
    private HotActListInfo hotList;

    @JSONField(name = "participating_list")
    @Nullable
    private List<ActivityInfoBean> participatingList;

    @Nullable
    public final List<ActivityInfoBean> getDownloadedList() {
        return this.downloadedList;
    }

    @Nullable
    public final HotActListInfo getHotList() {
        return this.hotList;
    }

    @Nullable
    public final List<ActivityInfoBean> getParticipatingList() {
        return this.participatingList;
    }

    public final void setDownloadedList(@Nullable List<ActivityInfoBean> list) {
        this.downloadedList = list;
    }

    public final void setHotList(@Nullable HotActListInfo hotActListInfo) {
        this.hotList = hotActListInfo;
    }

    public final void setParticipatingList(@Nullable List<ActivityInfoBean> list) {
        this.participatingList = list;
    }
}
