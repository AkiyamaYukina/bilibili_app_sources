package com.bilibili.studio.videoeditor.capturev3.data;

import androidx.annotation.Keep;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/data/CaptureCrossYearInfo.class */
@Keep
public class CaptureCrossYearInfo implements Serializable {
    public List<CrossYearBean> imageShotInfos = new ArrayList();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/data/CaptureCrossYearInfo$CrossYearBean.class */
    @Keep
    public static class CrossYearBean implements Serializable {
        public boolean hitShot;
        public long hitTimestamp;
        public String shotImagePath;

        public CrossYearBean() {
        }

        public CrossYearBean(boolean z6, String str, long j7) {
            this.hitShot = z6;
            this.shotImagePath = str;
            this.hitTimestamp = j7;
        }
    }
}
