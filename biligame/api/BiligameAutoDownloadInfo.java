package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameAutoDownloadInfo.class */
@Keep
public class BiligameAutoDownloadInfo {

    @JSONField(name = "order_download_list")
    public List<BiligameMainGame> bookList;

    @JSONField(name = "download_push_list")
    public List<BiligameMainGame> pushList;

    @JSONField(name = "game_version_download_list")
    public List<BiligameMainGame> versionDownloadList;
}
