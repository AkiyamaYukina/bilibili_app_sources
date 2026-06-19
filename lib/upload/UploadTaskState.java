package com.bilibili.lib.upload;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/upload/UploadTaskState.class */
public class UploadTaskState {
    public String auth_;
    public String biz_id_;
    public String init_upload_bucket_;
    public String init_upload_key_;
    public String meta_upos_uri_;
    public String task_id_;
    public String task_meta_profile_;
    public String task_path_;
    public String task_profile_;
    public String task_upload_id_;
    public String task_upos_uri_;
    public int task_fd_ = -1;
    public UPLOAD_STAGE cur_stage_ = UPLOAD_STAGE.INIT;
    public long task_file_size_ = -1;
    public int chunk_size_ = 0;
    public long uploaded_bytes_ = 0;
    public UPLOAD_STATUS_STATE status_state_ = UPLOAD_STATUS_STATE.UPLOAD_STATUS_INIT;
    public long create_time_s_ = 0;
    public long mid_ = 0;
    public long context_id_ = 0;
    public int is_free_traffic_ = 0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/upload/UploadTaskState$UPLOAD_STAGE.class */
    public enum UPLOAD_STAGE {
        INIT,
        PRE_TRANSENCODING,
        PRE_UPLOAD,
        INIT_UPLOAD,
        CHUNK_UPLOAD,
        MERGE_UPLOAD
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/upload/UploadTaskState$UPLOAD_STATUS_STATE.class */
    public enum UPLOAD_STATUS_STATE {
        UPLOAD_STATUS_INIT,
        UPLOAD_STATUS_STARTED,
        UPLOAD_STATUS_PAUSED,
        UPLOAD_STATUS_RESUMED,
        UPLOAD_STATUS_CANCELED,
        UPLOAD_STATUS_SUCCESSED,
        UPLOAD_STATUS_FAILED
    }

    static {
        UploadLibLoader.getInstance().loadLibrariesOnce();
    }

    public String toString() {
        return "task_id:" + this.task_id_ + " task_path:" + this.task_path_ + " task_fd:" + this.task_fd_ + " cur_stage_:" + this.cur_stage_.toString() + " upos_uri:" + this.task_upos_uri_ + " file_size:" + this.task_file_size_ + " upload_id:" + this.task_upload_id_ + " chunk_size:" + this.chunk_size_ + " profile:" + this.task_profile_ + " biz_id:" + this.biz_id_ + " meta_upos_uri:" + this.meta_upos_uri_ + " uploaded_bytes:" + this.uploaded_bytes_ + " auth:" + this.auth_ + " status_state_:" + this.status_state_.toString() + " create_time_s_:" + this.create_time_s_ + " init_upload_key_:" + this.init_upload_key_ + " init_upload_bucket_:" + this.init_upload_bucket_ + " task_meta_profile_:" + this.task_meta_profile_ + " mid:" + this.mid_ + " context_id:" + this.context_id_ + " is_free_traffic:" + this.is_free_traffic_;
    }
}
