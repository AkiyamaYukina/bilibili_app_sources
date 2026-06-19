package com.bilibili.biligame.api.bean.gamedetail;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/gamedetail/CommentClassification.class */
@Keep
public class CommentClassification implements Serializable {

    @JSONField(name = "comment_number")
    public int commentCount;
    public String name;
    public int type;

    public boolean equals(Object obj) {
        boolean z6 = false;
        if (obj instanceof CommentClassification) {
            if (this == obj) {
                return true;
            }
            CommentClassification commentClassification = (CommentClassification) obj;
            z6 = false;
            if (this.type == commentClassification.type) {
                z6 = false;
                if (this.name.equals(commentClassification.name)) {
                    z6 = true;
                }
            }
        }
        return z6;
    }
}
