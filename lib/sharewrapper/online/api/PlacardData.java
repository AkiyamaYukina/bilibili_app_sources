package com.bilibili.lib.sharewrapper.online.api;

import androidx.annotation.Keep;
import com.bilibili.bson.common.Bson;
import com.bilibili.lib.sharewrapper.online.api.ShareChannels;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/online/api/PlacardData.class */
@Bson
@Keep
public class PlacardData {

    @SerializedName("channels")
    public ArrayList<ShareChannels.ChannelItem> channelItems;

    @SerializedName("link")
    public String link;
}
