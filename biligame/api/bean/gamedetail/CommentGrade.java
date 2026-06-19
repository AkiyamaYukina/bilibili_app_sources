package com.bilibili.biligame.api.bean.gamedetail;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/gamedetail/CommentGrade.class */
@Keep
public class CommentGrade {

    @JSONField(name = "comment_number")
    public int commentNumber;

    @JSONField(name = "dim_grade_list")
    public List<String> dimGradeList;
    public String gameBaseId;

    @JSONField(name = "grade")
    public double grade;

    @JSONField(name = "recent_grade")
    public double recentGrade;

    @JSONField(name = "recent_grade_title")
    public String recentGradeTitle;

    @JSONField(name = "star_number_list")
    public List<String> starNumberList;

    @JSONField(name = "valid_comment_number")
    public int validCommentNumber;
}
