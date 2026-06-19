package com.bilibili.biligame.api.user;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/user/GameBenefitTag.class */
@StabilityInferred(parameters = 0)
@Keep
public final class GameBenefitTag {
    public static final int $stable = 8;

    @JSONField(name = "benefit_type")
    private int benefitType;

    @JSONField(name = "land_page")
    @Nullable
    private String landPage;
    private int position;

    @JSONField(name = "sub_title")
    @Nullable
    private String subTitle;

    @Nullable
    private String title;

    public final int getBenefitType() {
        return this.benefitType;
    }

    @Nullable
    public final String getLandPage() {
        return this.landPage;
    }

    public final int getPosition() {
        return this.position;
    }

    @Nullable
    public final String getSubTitle() {
        return this.subTitle;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final void setBenefitType(int i7) {
        this.benefitType = i7;
    }

    public final void setLandPage(@Nullable String str) {
        this.landPage = str;
    }

    public final void setPosition(int i7) {
        this.position = i7;
    }

    public final void setSubTitle(@Nullable String str) {
        this.subTitle = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }
}
