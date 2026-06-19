package com.bilibili.studio.comm.material.bean;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.collection.C3269h;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/comm/material/bean/MaterialControlConfig.class */
@Keep
public class MaterialControlConfig {
    public static int DEFAULT_LIMIT_DAY = 3;
    public static int MATERIAL_NUM = 999;
    public static int MATERIAL_TOTAL_SIZE = 300;
    public static int NO_LIMITED = 2;

    @JSONField(name = "fast_video")
    public int fastVideo;

    @JSONField(name = "first_entrance")
    public List<String> firstEntrance;

    @JSONField(name = "limit_day")
    public int limitDay;

    @JSONField(name = "material_img_num")
    public int materialImgNum;

    @JSONField(name = "material_label")
    public List<String> materialLabel;

    @JSONField(name = "material_total_size")
    public int materialTotalSize;

    @JSONField(name = "material_type")
    public int materialType;

    @JSONField(name = "material_video_num")
    public int materialVideoNum;

    @JSONField(name = "record_limit_day")
    public int recordLimitDay;

    public MaterialControlConfig() {
        int i7 = MATERIAL_NUM;
        this.materialImgNum = i7;
        this.materialVideoNum = i7;
        int i8 = NO_LIMITED;
        this.materialType = i8;
        this.materialTotalSize = MATERIAL_TOTAL_SIZE;
        this.fastVideo = i8;
        int i9 = DEFAULT_LIMIT_DAY;
        this.limitDay = i9;
        this.recordLimitDay = i9;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("MaterialControlConfig{materialImgNum=");
        sb.append(this.materialImgNum);
        sb.append(", materialVideoNum=");
        sb.append(this.materialVideoNum);
        sb.append(", materialType=");
        sb.append(this.materialType);
        sb.append(", materialTotalSize=");
        sb.append(this.materialTotalSize);
        sb.append(", materialLabel=");
        sb.append(this.materialLabel);
        sb.append(", firstEntrance=");
        sb.append(this.firstEntrance);
        sb.append(", fastVideo=");
        sb.append(this.fastVideo);
        sb.append(", limitDay=");
        sb.append(this.limitDay);
        sb.append(", recordLimitDay=");
        return C3269h.a(sb, this.recordLimitDay, '}');
    }
}
