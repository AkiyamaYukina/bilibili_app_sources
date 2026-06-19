package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.biligame.api.call.KeySign;
import com.bilibili.live.streaming.source.TextSource;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameGameInfo.class */
@Keep
public class BiligameGameInfo {

    @JSONField(name = "game_module_activity")
    public ActivityInfo gameActivity;

    @JSONField(name = "game_module_dynamic")
    public DynamicInfo gameDynamic;

    @JSONField(name = "game_module_forum")
    public ForumInfo gameForum;

    @JSONField(name = "game_module_gift")
    public GiftInfo gameGift;

    @JSONField(name = "game_module_live")
    public LiveInfo gameLive;

    @JSONField(name = "game_module_news")
    public NewsInfo gameNews;

    @JSONField(name = "game_module_article")
    public List<StrategyInfo> gameStrategy;

    @JSONField(name = "game_module_wiki")
    public WikiInfo gameWiki;

    @JSONField(name = "game_module_recent_action")
    public List<ActionInfo> recentAction;

    @JSONField(name = "show_strategy_tab_v3")
    public boolean showStrategyTabV2;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameGameInfo$ActionInfo.class */
    @Keep
    public static class ActionInfo {

        @JSONField(name = "action")
        public String action;

        @JSONField(name = "action_time")
        public long actionTime;

        @JSONField(name = KeySign.UID)
        public String uid;

        @JSONField(name = "user_face")
        public String userFace;

        @JSONField(name = "user_name")
        public String userName;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameGameInfo$ActivityInfo.class */
    @Keep
    public static class ActivityInfo {
        public static final int TYPE_ACTIVITY_DAILY = 2;
        public static final int TYPE_ACTIVITY_SPECIAL = 1;

        @JSONField(name = "begin_time")
        public String beginTime;

        @JSONField(name = "id")
        public String id;

        @JSONField(name = "jump_url")
        public String jumpUrl;

        @JSONField(name = "title")
        public String title;

        @JSONField(name = "type")
        public int type;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameGameInfo$DynamicInfo.class */
    @Keep
    public static class DynamicInfo {

        @JSONField(name = TextSource.CFG_CONTENT)
        public String content;

        @JSONField(name = KeySign.UID)
        public long uid;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameGameInfo$ForumInfo.class */
    @Keep
    public static class ForumInfo {

        @JSONField(name = "id")
        public String id;

        @JSONField(name = "title")
        public String title;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameGameInfo$GiftInfo.class */
    @Keep
    public static class GiftInfo {

        @JSONField(name = "count")
        public int count;

        @JSONField(name = "title")
        public String title;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameGameInfo$LiveInfo.class */
    @Keep
    public static class LiveInfo {

        @JSONField(name = "is_show_more")
        public int isShowMore;

        @JSONField(name = "live_id")
        public String liveId;

        @JSONField(name = "live_name")
        public String liveName;

        @JSONField(name = "online")
        public int online;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameGameInfo$NewsInfo.class */
    @Keep
    public static class NewsInfo {

        @JSONField(name = "news_id")
        public String newsId;

        @JSONField(name = "title")
        public String title;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameGameInfo$StrategyInfo.class */
    @Keep
    public static class StrategyInfo {

        @JSONField(name = "article_id")
        public String articleId;

        @JSONField(name = "av_id")
        public String avId;

        @JSONField(name = "bv_id")
        public String bvId;

        @JSONField(name = "content_type")
        public int contentType;

        @JSONField(name = "cover_image")
        public String coverImage;

        @JSONField(name = "strategy_id")
        public String strategyId;

        @JSONField(name = "title")
        public String title;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameGameInfo$WikiInfo.class */
    @Keep
    public static class WikiInfo {

        @JSONField(name = "wiki_link")
        public String link;

        @JSONField(name = "new_wiki_link")
        public String newLink;

        @JSONField(name = "title")
        public String title;
    }
}
