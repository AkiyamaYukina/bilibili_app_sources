package com.bilibili.biligame.api.bean.gamedetail;

import androidx.annotation.Keep;
import com.bilibili.biligame.api.bean.BiligameVideoInfo;
import java.util.ArrayList;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/gamedetail/BiligameVideo.class */
@Keep
public class BiligameVideo {
    public String gameName;
    public int numPages;
    public int numResults;
    public ArrayList<BiligameVideoInfo> videoList;
}
