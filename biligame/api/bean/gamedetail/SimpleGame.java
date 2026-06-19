package com.bilibili.biligame.api.bean.gamedetail;

import android.text.TextUtils;
import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.biligame.api.BiligameTag;
import com.bilibili.biligame.card.GameCardButton;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/gamedetail/SimpleGame.class */
@Keep
public class SimpleGame {

    @JSONField(name = "android_book_link")
    public String bookLink;

    @JSONField(name = "expanded_name")
    public String expandedName;

    @JSONField(name = "game_base_id")
    public int gameBaseId;

    @JSONField(name = "game_name")
    public String gameName;

    @JSONField(name = "game_name_v2")
    public String gameNameV2;

    @JSONField(name = "android_game_status")
    public int gameStatus;

    @JSONField(name = "grade")
    public double grade;
    public String icon;

    @JSONField(name = "name")
    public String name;

    @JSONField(name = "postfix_list")
    public ArrayList<String> postfixList = new ArrayList<>();

    @JSONField(name = "android_skip_detail_link")
    public String protocolLink;

    @JSONField(name = "small_game_link")
    public String smallGameLink;

    @JSONField(name = GameCardButton.extraParamSource)
    public int source;

    @JSONField(name = "tag_list")
    public List<BiligameTag> tagList;

    @JSONField(name = "title")
    public String title;

    public String getGameName() {
        return !TextUtils.isEmpty(this.name) ? this.name : !TextUtils.isEmpty(this.gameName) ? this.gameName : !TextUtils.isEmpty(this.title) ? this.title : "";
    }

    public String getNewGameNameV2() {
        return !TextUtils.isEmpty(this.gameNameV2) ? this.gameNameV2 : getGameName();
    }

    public ArrayList<String> getPostfixList() {
        return this.postfixList;
    }
}
