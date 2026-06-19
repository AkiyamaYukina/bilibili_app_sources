package com.bilibili.upper.module.honour.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/honour/bean/KingHonourGameBean.class */
@Keep
public class KingHonourGameBean {

    @JSONField(name = "assist_cnt")
    public String assistCnt;

    @JSONField(name = "branch_evaluate")
    public int branchEvaluate;

    @JSONField(name = "branch_evaluate_name")
    public String branchEvaluateName;

    @JSONField(name = "dead_cnt")
    public String deadCnt;

    @JSONField(name = "desk_id")
    public Long deskId;

    @JSONField(name = "desk_seq")
    public Long deskSeq;

    @JSONField(name = "game_result")
    public String gameResult;

    @JSONField(name = "game_time")
    public String gameTime;

    @JSONField(name = "game_year")
    public int gameYear;

    @JSONField(name = "hero_icon")
    public String heroIcon;

    @JSONField(name = "hero_id")
    public String heroId;

    @JSONField(name = "hero_name")
    public String heroName;

    @JSONField(name = "kill_cnt")
    public String killCnt;

    @JSONField(name = "lose_mvp")
    public String loseMvp;

    @JSONField(name = "mvp_cnt")
    public String mvpCnt;

    @JSONField(name = "hero_penta_kill_cnt")
    public int pentaKillCnt;

    @JSONField(name = "hero_quadra_kill_cnt")
    public int quadraKillCnt;

    @JSONField(name = "relay_entity")
    public Long relayEntity;

    @JSONField(name = "repo_state")
    public int repoState;

    @JSONField(name = "top_flag")
    public int topFlag;

    @JSONField(name = "hero_triple_kill_cnt")
    public int tripleKillCnt;

    @JSONField(name = "used_time")
    public int usedTime;

    @JSONField(name = "valor_type")
    public int valorType;

    @JSONField(name = "version")
    public long version;
}
