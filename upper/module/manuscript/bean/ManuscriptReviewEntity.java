package com.bilibili.upper.module.manuscript.bean;

import androidx.annotation.Keep;
import com.bilibili.upper.api.bean.manuscript.ArcAudit;
import com.bilibili.upper.api.bean.manuscript.VideoViolationPic;
import java.util.ArrayList;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/bean/ManuscriptReviewEntity.class */
@Keep
public class ManuscriptReviewEntity {
    public int aegis_state;
    public long aid;
    public int app_appeal_state;
    public String app_appeal_url;
    public AppealEntity appeal;
    public AuditProcessEntity audit_process;
    public int is_interactive;
    public int limited_open;
    public MusicTortEntity music_tort;
    public int political_editable;
    public int political_media;
    public ProblemDetailBean problemDetailBean;
    public ArrayList<ProblemDetailEntity> problem_detail;
    public long state;
    public int state_panel;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/bean/ManuscriptReviewEntity$AppealEntity.class */
    @Keep
    public static class AppealEntity {
        public String jump_url;
        public int open_apid;
        public String reject;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/bean/ManuscriptReviewEntity$AuditProcessEntity.class */
    @Keep
    public static class AuditProcessEntity {
        public int archive_audit;
        public int business_audit;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/bean/ManuscriptReviewEntity$LinkEntity.class */
    @Keep
    public static class LinkEntity {

        /* JADX INFO: renamed from: app, reason: collision with root package name */
        public String f113578app;
        public String web;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/bean/ManuscriptReviewEntity$MusicTortEntity.class */
    @Keep
    public static class MusicTortEntity {
        public String community_pack_url;
        public ArrayList<VideosEntity> videos;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/bean/ManuscriptReviewEntity$PictureEntity.class */
    @Keep
    public static class PictureEntity {
        public String time;
        public String url;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/bean/ManuscriptReviewEntity$ProblemDetailEntity.class */
    @Keep
    public static class ProblemDetailEntity {
        public long index;
        public String modify_advise;
        public ArrayList<VideoViolationPic> picture_data;
        public String problem_description;
        public String problem_description_title;
        public String reject_reason;
        public long reject_reason_id;
        public String reject_reason_url;
        public ArcAudit.ProblemDetail.RejectVideoExplain reject_video_explain;
        public String type;
        public String violation_position;
        public String violation_time;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/bean/ManuscriptReviewEntity$RejectVideoExplainEntity.class */
    @Keep
    public static class RejectVideoExplainEntity {
        public LinkEntity link;
        public String title;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/bean/ManuscriptReviewEntity$VideosEntity.class */
    @Keep
    public static class VideosEntity {
        public long cid;
        public int index;
        public String problem_description;
        public String problem_description_title;
        public String reject_reason;
        public String title;
    }
}
