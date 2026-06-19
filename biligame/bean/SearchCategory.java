package com.bilibili.biligame.bean;

import W60.F;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import cf.l;
import com.bilibili.ad.adview.pegasus.banner.topview.res.n;
import com.bilibili.search2.api.SearchBangumiItem;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/bean/SearchCategory.class */
@StabilityInferred(parameters = 0)
@Keep
public final class SearchCategory {
    public static final int $stable = 8;
    private long categoryId;

    @NotNull
    private String gameStatusList;
    private int gradeSection;
    private boolean hidePartGame;
    private int publishTimeSection;
    private int sortType;

    @NotNull
    private String tagIdList;

    public SearchCategory() {
        this(0L, null, 0, null, 0, 0, false, SearchBangumiItem.TYPE_FULLNET_BANGUMI, null);
    }

    public SearchCategory(long j7, @NotNull String str, int i7, @NotNull String str2, int i8, int i9, boolean z6) {
        this.categoryId = j7;
        this.tagIdList = str;
        this.sortType = i7;
        this.gameStatusList = str2;
        this.publishTimeSection = i8;
        this.gradeSection = i9;
        this.hidePartGame = z6;
    }

    public /* synthetic */ SearchCategory(long j7, String str, int i7, String str2, int i8, int i9, boolean z6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0L : j7, (i10 & 2) != 0 ? "0" : str, (i10 & 4) != 0 ? 0 : i7, (i10 & 8) != 0 ? "0,1,2" : str2, (i10 & 16) != 0 ? 0 : i8, (i10 & 32) != 0 ? 0 : i9, (i10 & 64) != 0 ? true : z6);
    }

    public final long getCategoryId() {
        return this.categoryId;
    }

    @NotNull
    public final String getGameStatusList() {
        return this.gameStatusList;
    }

    public final int getGradeSection() {
        return this.gradeSection;
    }

    public final boolean getHidePartGame() {
        return this.hidePartGame;
    }

    public final int getPublishTimeSection() {
        return this.publishTimeSection;
    }

    public final int getSortType() {
        return this.sortType;
    }

    @NotNull
    public final String getTagIdList() {
        return this.tagIdList;
    }

    public final void setCategoryId(long j7) {
        this.categoryId = j7;
    }

    public final void setGameStatusList(@NotNull String str) {
        this.gameStatusList = str;
    }

    public final void setGradeSection(int i7) {
        this.gradeSection = i7;
    }

    public final void setHidePartGame(boolean z6) {
        this.hidePartGame = z6;
    }

    public final void setPublishTimeSection(int i7) {
        this.publishTimeSection = i7;
    }

    public final void setSortType(int i7) {
        this.sortType = i7;
    }

    public final void setTagIdList(@NotNull String str) {
        this.tagIdList = str;
    }

    @NotNull
    public String toString() {
        long j7 = this.categoryId;
        String str = this.tagIdList;
        int i7 = this.sortType;
        String str2 = this.gameStatusList;
        int i8 = this.publishTimeSection;
        int i9 = this.gradeSection;
        boolean z6 = this.hidePartGame;
        StringBuilder sbA = n.a(j7, "SearchCategory(categoryId=", ", tagIdList='", str);
        l.a(i7, "', sortType=", ", gameStatusList='", str2, sbA);
        F.b(i8, i9, "', publishTimeSection=", ", gradeSection=", sbA);
        sbA.append(", hidePartGame=");
        sbA.append(z6);
        sbA.append(")");
        return sbA.toString();
    }
}
