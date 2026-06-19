package com.bilibili.biligame.business.pegasus.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.biligame.api.BiligameMainGame;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/pegasus/bean/GamePegasusNoticeBean.class */
@StabilityInferred(parameters = 0)
@Keep
public final class GamePegasusNoticeBean {
    public static final int $stable = 8;

    @JSONField(name = "small_game_remain_notice_game_list")
    @Nullable
    private List<PanelMainGame> smallGameNoticeGameList;

    @JSONField(name = "start_test_game_notice_game_list")
    @Nullable
    private List<PanelMainGame> testNoticeGameList;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/pegasus/bean/GamePegasusNoticeBean$PanelMainGame.class */
    @StabilityInferred(parameters = 0)
    public static final class PanelMainGame extends BiligameMainGame {
        public static final int $stable = 8;

        @JSONField(name = "ab_test_group")
        @Nullable
        private String abTestGroup;

        @JSONField(name = "notice_id")
        @Nullable
        private String noticeId;

        @Nullable
        public final String getAbTestGroup() {
            return this.abTestGroup;
        }

        @Nullable
        public final String getNoticeId() {
            return this.noticeId;
        }

        public final void setAbTestGroup(@Nullable String str) {
            this.abTestGroup = str;
        }

        public final void setNoticeId(@Nullable String str) {
            this.noticeId = str;
        }
    }

    @Nullable
    public final List<PanelMainGame> getSmallGameNoticeGameList() {
        return this.smallGameNoticeGameList;
    }

    @Nullable
    public final List<PanelMainGame> getTestNoticeGameList() {
        return this.testNoticeGameList;
    }

    public final void setSmallGameNoticeGameList(@Nullable List<PanelMainGame> list) {
        this.smallGameNoticeGameList = list;
    }

    public final void setTestNoticeGameList(@Nullable List<PanelMainGame> list) {
        this.testNoticeGameList = list;
    }
}
