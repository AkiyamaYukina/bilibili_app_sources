package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameGiftList.class */
@Keep
public class BiligameGiftList {
    public List<BiligameGift> list;

    @JSONField(name = "other_gifts")
    public List<BiligameGift> otherGifts;

    @JSONField(name = "page_number")
    public int pageNum;

    @JSONField(name = "page_size")
    public int pageSize;

    @JSONField(name = "played_game_gifts")
    public List<BiligameGift> playedGameGifts;
}
