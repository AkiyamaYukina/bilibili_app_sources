package com.bilibili.playset.api;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/api/PlaySetGroup.class */
@Keep
public class PlaySetGroup extends ls0.c<PlaySet> {
    public static final int GROUP_CREATED = 1;
    public static final int GROUP_FAVORITE = 2;
    public static final int GROUP_PURCHASED_SEASON = 4;
    public static final int GROUP_WATCH_LATER = 3;

    @JSONField(deserialize = false, serialize = false)
    public int curPage = 1;

    @JSONField(name = "id")
    public long id;

    @JSONField(deserialize = false, serialize = false)
    public boolean isLoading;

    @JSONField(name = "name")
    public String name;

    @JSONField(name = "mediaListResponse")
    public PlaySetPageData pageData;

    @JSONField(deserialize = false, serialize = false)
    public void addItems(@NonNull List<PlaySet> list) {
        if (this.pageData == null) {
            this.pageData = new PlaySetPageData();
        }
        PlaySetPageData playSetPageData = this.pageData;
        if (playSetPageData.list == null) {
            playSetPageData.list = new ArrayList();
        }
        int size = this.pageData.list.size();
        int i7 = size;
        if (this.pageData.list.get(size - 1) instanceof FootData) {
            i7 = size - 1;
        }
        this.pageData.list.addAll(i7, list);
    }

    @Override // ls0.c
    @JSONField(deserialize = false, serialize = false)
    public int getItemCount() {
        return getItems().size();
    }

    @Override // ls0.c
    @JSONField(deserialize = false, serialize = false)
    public List<PlaySet> getItems() {
        List<PlaySet> list;
        PlaySetPageData playSetPageData = this.pageData;
        return (playSetPageData == null || (list = playSetPageData.list) == null) ? Collections.EMPTY_LIST : list;
    }

    @JSONField(deserialize = false, serialize = false)
    public int getTotalCount() {
        PlaySetPageData playSetPageData = this.pageData;
        if (playSetPageData == null) {
            return 0;
        }
        return playSetPageData.totalCount;
    }

    @JSONField(deserialize = false, serialize = false)
    public void setTotalCount(int i7) {
        if (this.pageData == null) {
            this.pageData = new PlaySetPageData();
        }
        this.pageData.totalCount = i7;
    }
}
