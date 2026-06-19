package com.bilibili.studio.videoeditor.ms.transition;

import androidx.annotation.Keep;
import androidx.collection.C3269h;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/ms/transition/TransitionData.class */
@Keep
public class TransitionData {
    public List<TransitionBean> trans;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/ms/transition/TransitionData$TransitionBean.class */
    @Keep
    public static class TransitionBean implements Cloneable {
        public String cover;

        @JSONField(name = "download_url")
        public String downloadUrl;

        @JSONField(name = "download_url_aurora")
        public String downloadUrlAurora;
        public int id;
        public String name;

        @JSONField(name = "overlap")
        public int overlap;
        public int rank;

        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public TransitionBean m10484clone() {
            TransitionBean transitionBean = new TransitionBean();
            transitionBean.id = this.id;
            transitionBean.name = this.name;
            transitionBean.cover = this.cover;
            transitionBean.downloadUrl = this.downloadUrl;
            transitionBean.downloadUrlAurora = this.downloadUrlAurora;
            transitionBean.rank = this.rank;
            transitionBean.overlap = this.overlap;
            return transitionBean;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("TransitionBean{id=");
            sb.append(this.id);
            sb.append(", name='");
            sb.append(this.name);
            sb.append("', cover='");
            sb.append(this.cover);
            sb.append("', downloadUrl='");
            sb.append(this.downloadUrl);
            sb.append("', downloadUrlAurora='");
            sb.append(this.downloadUrlAurora);
            sb.append("', rank=");
            sb.append(this.rank);
            sb.append(", overlap=");
            return C3269h.a(sb, this.overlap, '}');
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/ms/transition/TransitionData$TransitionTabBean.class */
    @Keep
    public static class TransitionTabBean {
        public List<TransitionBean> children;
        public long id;
        public String name;
        public int rank;
    }
}
