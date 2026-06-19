package com.bilibili.biligame.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/bean/FindGameTags.class */
@StabilityInferred(parameters = 0)
@Keep
public final class FindGameTags {
    public static final int $stable = 8;

    @JSONField(name = "category_list")
    @Nullable
    private List<SiftTag> categoryList;

    @JSONField(name = "condition_seq_list")
    @Nullable
    private List<String> conditionSeqList;

    @JSONField(name = "game_status_list")
    @Nullable
    private List<GameStatus> gameStatusList;

    @JSONField(name = "grade_list")
    @Nullable
    private List<GradeType> gradeList;

    @JSONField(name = "publish_time_list")
    @Nullable
    private List<PublishTime> publishTimeList;

    @JSONField(name = "sort_type_list")
    @Nullable
    private List<SortType> sortTypeList;

    @JSONField(name = "tag_list")
    @Nullable
    private List<SiftTag> tagList;

    @Nullable
    public final List<SiftTag> getCategoryList() {
        return this.categoryList;
    }

    @Nullable
    public final List<String> getConditionSeqList() {
        return this.conditionSeqList;
    }

    @Nullable
    public final List<GameStatus> getGameStatusList() {
        return this.gameStatusList;
    }

    @Nullable
    public final List<GradeType> getGradeList() {
        return this.gradeList;
    }

    @Nullable
    public final List<PublishTime> getPublishTimeList() {
        return this.publishTimeList;
    }

    @Nullable
    public final List<SortType> getSortTypeList() {
        return this.sortTypeList;
    }

    @Nullable
    public final List<SiftTag> getTagList() {
        return this.tagList;
    }

    public final void setCategoryList(@Nullable List<SiftTag> list) {
        this.categoryList = list;
    }

    public final void setConditionSeqList(@Nullable List<String> list) {
        this.conditionSeqList = list;
    }

    public final void setGameStatusList(@Nullable List<GameStatus> list) {
        this.gameStatusList = list;
    }

    public final void setGradeList(@Nullable List<GradeType> list) {
        this.gradeList = list;
    }

    public final void setPublishTimeList(@Nullable List<PublishTime> list) {
        this.publishTimeList = list;
    }

    public final void setSortTypeList(@Nullable List<SortType> list) {
        this.sortTypeList = list;
    }

    public final void setTagList(@Nullable List<SiftTag> list) {
        this.tagList = list;
    }
}
