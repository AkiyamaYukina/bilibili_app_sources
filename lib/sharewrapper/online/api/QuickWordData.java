package com.bilibili.lib.sharewrapper.online.api;

import androidx.annotation.Keep;
import com.bilibili.bson.common.Bson;
import com.bilibili.lib.sharewrapper.online.api.ShareChannels;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/online/api/QuickWordData.class */
@Bson
@Keep
public class QuickWordData {

    @SerializedName("channel")
    public ShareChannels.ChannelItem channelItem;
    public String link;
    public String word;
}
