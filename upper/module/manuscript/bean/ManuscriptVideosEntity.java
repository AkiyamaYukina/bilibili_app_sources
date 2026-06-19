package com.bilibili.upper.module.manuscript.bean;

import androidx.annotation.Keep;
import java.util.ArrayList;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/bean/ManuscriptVideosEntity.class */
@Keep
public class ManuscriptVideosEntity {
    public ManuscriptVideosPageEntity page;
    public long selectedCid;
    public ArrayList<ManuscriptVideoDetailsEntity> videos;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/bean/ManuscriptVideosEntity$ManuscriptVideoDetailsEntity.class */
    @Keep
    public static class ManuscriptVideoDetailsEntity {
        public long cid;
        public int index;
        public int xcode_state;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/bean/ManuscriptVideosEntity$ManuscriptVideosPageEntity.class */
    @Keep
    public static class ManuscriptVideosPageEntity {
        public long pn;
        public long ps;
        public long total;
    }
}
