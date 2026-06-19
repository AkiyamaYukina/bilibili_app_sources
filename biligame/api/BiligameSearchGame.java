package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.biligame.api.bean.gamedetail.GameDetailContent;
import com.bilibili.biligame.report.ReportExtra;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameSearchGame.class */
@Keep
public class BiligameSearchGame extends BiligameMainGame {

    @JSONField(name = "background_image")
    public String backgroundImage;

    @JSONField(name = "big_card_url")
    public String bigCardUrl;

    @JSONField(name = "bullet_comment_switch")
    public List<Integer> bulletCommentSwitch;

    @JSONField(name = "entrance_list")
    public List<Integer> entranceList;

    @JSONField(name = "entrance_name_list")
    public List<Entrance> entranceNameList;

    @JSONField(name = GameDetailContent.DetailInfo.UI_TYPE_OFFICIAL_ACCOUNT)
    public long officialAccount;

    @Nullable
    public ReportExtra reportExtra;

    @JSONField(name = "video_info")
    public GameVideoInfo videoInfo;

    @JSONField(name = "website")
    public String website;

    @JSONField(name = "gift_num")
    public int giftNum = 0;

    @JSONField(name = "show_style")
    public int showStyle = 0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameSearchGame$Entrance.class */
    @Keep
    public static class Entrance {

        @JSONField(name = "id")
        public int id;

        @JSONField(name = "name")
        public String name;
    }
}
