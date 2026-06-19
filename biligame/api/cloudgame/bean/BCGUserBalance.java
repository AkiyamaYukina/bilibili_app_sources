package com.bilibili.biligame.api.cloudgame.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/cloudgame/bean/BCGUserBalance.class */
@StabilityInferred(parameters = 0)
@Keep
public final class BCGUserBalance {
    public static final int $stable = 8;

    @JSONField(name = "available_seconds")
    private long availableSeconds;

    @JSONField(name = "game_pass_benefits")
    @Nullable
    private List<Benefits> benefits;

    @JSONField(name = "benefits")
    @Nullable
    private List<Benefits> benefitsV2;

    @JSONField(name = "game_pass_remain_period_text")
    @Nullable
    private String gamePassRemainPeriodText;

    @JSONField(name = "game_pass_selling_guide")
    @Nullable
    private GamePassSellingGuide gamePassSellingGuide;

    @JSONField(name = "growth_plan_entrance")
    @Nullable
    private GrowthPlanEntrance growthPlanEntrance;

    @JSONField(name = "game_pass_expire_at")
    @Nullable
    private String gamePassExpireAt = "";

    @JSONField(name = "game_pass_expire_at_text")
    @Nullable
    private String gamePassExpireAtText = "";

    @JSONField(name = "rule_description")
    @Nullable
    private String ruleDescription = "";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/cloudgame/bean/BCGUserBalance$Benefits.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class Benefits {
        public static final int $stable = 8;

        @JSONField(name = "name")
        @Nullable
        private String name = "";

        @JSONField(name = "image")
        @Nullable
        private String image = "";

        @Nullable
        public final String getImage() {
            return this.image;
        }

        @Nullable
        public final String getName() {
            return this.name;
        }

        public final void setImage(@Nullable String str) {
            this.image = str;
        }

        public final void setName(@Nullable String str) {
            this.name = str;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/cloudgame/bean/BCGUserBalance$GrowthPlanEntrance.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class GrowthPlanEntrance {
        public static final int $stable = 8;

        @JSONField(name = "button_text")
        @Nullable
        private String buttonText;

        @JSONField(name = "icon")
        @Nullable
        private String icon;

        @JSONField(name = "jump_url")
        @Nullable
        private String jumpUrl;

        @JSONField(name = "sub_title")
        @Nullable
        private String subTitle;

        @JSONField(name = "title")
        @Nullable
        private String title;

        @Nullable
        public final String getButtonText() {
            return this.buttonText;
        }

        @Nullable
        public final String getIcon() {
            return this.icon;
        }

        @Nullable
        public final String getJumpUrl() {
            return this.jumpUrl;
        }

        @Nullable
        public final String getSubTitle() {
            return this.subTitle;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        public final void setButtonText(@Nullable String str) {
            this.buttonText = str;
        }

        public final void setIcon(@Nullable String str) {
            this.icon = str;
        }

        public final void setJumpUrl(@Nullable String str) {
            this.jumpUrl = str;
        }

        public final void setSubTitle(@Nullable String str) {
            this.subTitle = str;
        }

        public final void setTitle(@Nullable String str) {
            this.title = str;
        }
    }

    public final long getAvailableSeconds() {
        return this.availableSeconds;
    }

    @Nullable
    public final List<Benefits> getBenefits() {
        return this.benefits;
    }

    @Nullable
    public final List<Benefits> getBenefitsV2() {
        return this.benefitsV2;
    }

    @Nullable
    public final String getGamePassExpireAt() {
        return this.gamePassExpireAt;
    }

    @Nullable
    public final String getGamePassExpireAtText() {
        return this.gamePassExpireAtText;
    }

    @Nullable
    public final String getGamePassRemainPeriodText() {
        return this.gamePassRemainPeriodText;
    }

    @Nullable
    public final GamePassSellingGuide getGamePassSellingGuide() {
        return this.gamePassSellingGuide;
    }

    @Nullable
    public final GrowthPlanEntrance getGrowthPlanEntrance() {
        return this.growthPlanEntrance;
    }

    @Nullable
    public final String getRuleDescription() {
        return this.ruleDescription;
    }

    public final void setAvailableSeconds(long j7) {
        this.availableSeconds = j7;
    }

    public final void setBenefits(@Nullable List<Benefits> list) {
        this.benefits = list;
    }

    public final void setBenefitsV2(@Nullable List<Benefits> list) {
        this.benefitsV2 = list;
    }

    public final void setGamePassExpireAt(@Nullable String str) {
        this.gamePassExpireAt = str;
    }

    public final void setGamePassExpireAtText(@Nullable String str) {
        this.gamePassExpireAtText = str;
    }

    public final void setGamePassRemainPeriodText(@Nullable String str) {
        this.gamePassRemainPeriodText = str;
    }

    public final void setGamePassSellingGuide(@Nullable GamePassSellingGuide gamePassSellingGuide) {
        this.gamePassSellingGuide = gamePassSellingGuide;
    }

    public final void setGrowthPlanEntrance(@Nullable GrowthPlanEntrance growthPlanEntrance) {
        this.growthPlanEntrance = growthPlanEntrance;
    }

    public final void setRuleDescription(@Nullable String str) {
        this.ruleDescription = str;
    }
}
