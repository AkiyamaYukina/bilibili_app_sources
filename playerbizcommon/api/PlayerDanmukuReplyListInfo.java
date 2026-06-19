package com.bilibili.playerbizcommon.api;

import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import com.alibaba.fastjson.annotation.JSONField;
import com.alipay.blueshield.IDeviceColorModule;
import com.bilibili.live.streaming.source.TextSource;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.interact.biz.model.comment.CommentItem;
import yi1.c;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/api/PlayerDanmukuReplyListInfo.class */
@Keep
public final class PlayerDanmukuReplyListInfo {

    @JSONField(name = "children")
    @Nullable
    private List<DanmakuElem> children;

    @JSONField(name = "pn")
    private int pageNum;

    @JSONField(name = "ps")
    private int pageSize;

    @JSONField(name = "parent")
    @Nullable
    private DanmakuElem parent;

    @JSONField(name = "reply_placeholder")
    @Nullable
    private String replyPlaceholder;

    @JSONField(name = "total")
    private int total;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/api/PlayerDanmukuReplyListInfo$DanmakuElem.class */
    @Keep
    public static final class DanmakuElem {

        @JSONField(name = "color")
        private int color;

        @JSONField(name = TextSource.CFG_CONTENT)
        @Nullable
        private String content;

        @JSONField(name = "ctime")
        private long ctime;

        @JSONField(name = "fontsize")
        private int fontSize;

        @JSONField(name = "id")
        @Nullable
        private String id;

        @JSONField(name = "id_str")
        @Nullable
        private String idStr;

        @JSONField(name = "like_count")
        private int likeCount;

        @NotNull
        private Bundle mExtras = new Bundle();

        @JSONField(name = "mid_hash")
        @Nullable
        private String midHash;

        @JSONField(name = IDeviceColorModule.EDGE_MODE_KEY)
        private int mode;

        @JSONField(name = "parent_id")
        @Nullable
        private String parentId;

        @JSONField(name = NotificationCompat.CATEGORY_PROGRESS)
        private int progress;

        @JSONField(name = "reply_count")
        private int replyCount;

        @JSONField(name = "root_id")
        @Nullable
        private String rootId;

        @JSONField(name = "user_like")
        private int userLike;

        @NotNull
        public final CommentItem convertCommentItem() {
            CommentItem commentItemA = c.a(this.mode);
            commentItemA.setDmId(this.id);
            commentItemA.setTimeInMilliSeconds(this.progress);
            String str = this.content;
            String str2 = str;
            if (str == null) {
                str2 = "";
            }
            commentItemA.setBody(str2);
            commentItemA.setDamakuSenderHash(this.midHash);
            commentItemA.likes = this.likeCount;
            commentItemA.mReplyCount = this.replyCount;
            boolean z6 = true;
            if (this.userLike != 1) {
                z6 = false;
            }
            commentItemA.mRecommended = z6;
            return commentItemA;
        }

        public final int getColor() {
            return this.color;
        }

        @Nullable
        public final String getContent() {
            return this.content;
        }

        public final long getCtime() {
            return this.ctime;
        }

        public final int getFontSize() {
            return this.fontSize;
        }

        @Nullable
        public final String getId() {
            return this.id;
        }

        @Nullable
        public final String getIdStr() {
            return this.idStr;
        }

        public final int getLikeCount() {
            return this.likeCount;
        }

        @NotNull
        public final Bundle getMExtras() {
            return this.mExtras;
        }

        @Nullable
        public final String getMidHash() {
            return this.midHash;
        }

        public final int getMode() {
            return this.mode;
        }

        @Nullable
        public final String getParentId() {
            return this.parentId;
        }

        public final int getProgress() {
            return this.progress;
        }

        public final int getReplyCount() {
            return this.replyCount;
        }

        @Nullable
        public final String getRootId() {
            return this.rootId;
        }

        public final int getUserLike() {
            return this.userLike;
        }

        public final boolean isUserLike() {
            boolean z6 = true;
            if (this.userLike != 1) {
                z6 = false;
            }
            return z6;
        }

        public final void setColor(int i7) {
            this.color = i7;
        }

        public final void setContent(@Nullable String str) {
            this.content = str;
        }

        public final void setCtime(long j7) {
            this.ctime = j7;
        }

        public final void setFontSize(int i7) {
            this.fontSize = i7;
        }

        public final void setId(@Nullable String str) {
            this.id = str;
        }

        public final void setIdStr(@Nullable String str) {
            this.idStr = str;
        }

        public final void setLikeCount(int i7) {
            this.likeCount = i7;
        }

        public final void setMExtras(@NotNull Bundle bundle) {
            this.mExtras = bundle;
        }

        public final void setMidHash(@Nullable String str) {
            this.midHash = str;
        }

        public final void setMode(int i7) {
            this.mode = i7;
        }

        public final void setParentId(@Nullable String str) {
            this.parentId = str;
        }

        public final void setProgress(int i7) {
            this.progress = i7;
        }

        public final void setReplyCount(int i7) {
            this.replyCount = i7;
        }

        public final void setRootId(@Nullable String str) {
            this.rootId = str;
        }

        public final void setUserLike(int i7) {
            this.userLike = i7;
        }

        public final void setUserLike(boolean z6) {
            this.userLike = z6 ? 1 : 0;
        }
    }

    @Nullable
    public final List<DanmakuElem> getChildren() {
        return this.children;
    }

    public final int getPageNum() {
        return this.pageNum;
    }

    public final int getPageSize() {
        return this.pageSize;
    }

    @Nullable
    public final DanmakuElem getParent() {
        return this.parent;
    }

    @Nullable
    public final String getReplyPlaceholder() {
        return this.replyPlaceholder;
    }

    public final int getTotal() {
        return this.total;
    }

    public final void setChildren(@Nullable List<DanmakuElem> list) {
        this.children = list;
    }

    public final void setPageNum(int i7) {
        this.pageNum = i7;
    }

    public final void setPageSize(int i7) {
        this.pageSize = i7;
    }

    public final void setParent(@Nullable DanmakuElem danmakuElem) {
        this.parent = danmakuElem;
    }

    public final void setReplyPlaceholder(@Nullable String str) {
        this.replyPlaceholder = str;
    }

    public final void setTotal(int i7) {
        this.total = i7;
    }
}
