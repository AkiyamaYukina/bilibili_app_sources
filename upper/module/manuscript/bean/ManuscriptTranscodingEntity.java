package com.bilibili.upper.module.manuscript.bean;

import androidx.annotation.Keep;
import java.util.ArrayList;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/bean/ManuscriptTranscodingEntity.class */
@Keep
public class ManuscriptTranscodingEntity {
    public long cid;
    public String fail_tip;
    public int mockProgress = 60;
    public String title;
    public ArrayList<TranscodingDetailsEntity> transcode_list;
    public int xcode_state;
    public String xcode_tip;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/bean/ManuscriptTranscodingEntity$TranscodingDetailsEntity.class */
    @Keep
    public static class TranscodingDetailsEntity {
        public long completed_at;
        public long estimated_time;
        public String failure_reason;
        public String resolution;
        public long start_time;
        public String status;
        public long time_now;
    }
}
