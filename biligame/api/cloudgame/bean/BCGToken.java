package com.bilibili.biligame.api.cloudgame.bean;

import android.text.TextUtils;
import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.biligame.api.cloudgame.bean.BCGUserBalance;
import com.tencent.connect.common.Constants;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/cloudgame/bean/BCGToken.class */
@Keep
public class BCGToken {
    public static final String SCHEDULE_STATUS_BLOCK = "BLOCK";
    public static final String SCHEDULE_STATUS_QUEUEING = "QUEUEING";
    public static final String SCHEDULE_STATUS_SUCCESS = "SUCCESS";

    @JSONField(name = Constants.PARAM_ACCESS_TOKEN)
    public String accessToken;

    @JSONField(name = "account_balance_seconds")
    public Long accountBalanceSeconds;

    @JSONField(name = "game_pass_benefits")
    public List<BCGUserBalance.Benefits> benefits;
    public String buvid;

    @JSONField(name = "credentials")
    public BCGCredentials credentials;

    @JSONField(name = "foreign_game_id")
    public String foreignGameId;

    @JSONField(name = "foreign_session_id")
    public String foreignSessionId;

    @JSONField(name = "game_pass_expire_at")
    public String gamePassExpireAt;

    @JSONField(name = "game_pass_expire_at_text")
    public String gamePassExpireAtText;

    @JSONField(name = "game_pass_remain_period_text")
    public String gamePassRemainPeriodText;

    @JSONField(name = "game_pass_selling_guide")
    public GamePassSellingGuide gamePassSellingGuide;

    @JSONField(name = "game_provider_type")
    public String gameProviderType;

    @JSONField(name = "growth_plan_entrance")
    public BCGUserBalance.GrowthPlanEntrance growthPlanEntrance;

    @JSONField(name = "keepalive_timeout")
    public int keepAliveTimeout;

    @JSONField(name = "kicked_games")
    public List<BCGRunningGame> kickedGamesList;

    @JSONField(name = "priority")
    public int priority = 0;

    @JSONField(name = "queue_state")
    public BCGQueueState queueState;

    @JSONField(name = "running_games")
    public List<BCGRunningGame> runningGamesList;

    @JSONField(name = "schedule_status")
    public String scheduleStatus;

    @JSONField(name = "session_id")
    public String sessionId;

    public boolean isUserVipStatusChange(BCGToken bCGToken) {
        if (bCGToken == null) {
            return false;
        }
        String str = this.gamePassExpireAt;
        String str2 = bCGToken.gamePassExpireAt;
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            return false;
        }
        return !TextUtils.equals(str, str2);
    }

    public boolean isVip() {
        return !TextUtils.isEmpty(this.gamePassExpireAt);
    }
}
