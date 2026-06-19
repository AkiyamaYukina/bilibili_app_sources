package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.biligame.api.bean.gamedetail.RecommendComment;
import com.bilibili.live.streaming.source.TextSource;
import java.util.HashMap;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameMyMessagePage.class */
@Keep
public class BiligameMyMessagePage {
    public static final int STATUS_READ = 1;
    public static final int STATUS_UNREAD = 0;
    public static final int TYPE_COMMENT = 2;
    public static final int TYPE_POST = 1;
    public static final int TYPE_REPLY = 3;

    @JSONField(name = "attestation_display")
    public RecommendComment.AttestationDisplay attestationDisplay;

    @JSONField(name = "attitude_type")
    public int attitudeType;

    @JSONField(name = "comment_id")
    public String commentId;

    @JSONField(name = "comment_no")
    public String commentNo;

    @JSONField(name = TextSource.CFG_CONTENT)
    public String content;

    @Nullable
    @JSONField(name = "emotes")
    public HashMap<String, RecommendComment.CommentEmote> emotes;

    @JSONField(name = "expanded_name")
    public String expandedName;

    @JSONField(name = "game_base_id")
    public int gameBaseId;

    @JSONField(name = "game_name")
    public String gameName;

    @JSONField(name = "is_read")
    public int isRead;

    @Nullable
    @JSONField(name = "jump_urls")
    public HashMap<String, RecommendComment.CommentJumpUrl> jumpUrls;

    @JSONField(name = "message_no")
    public String messageNo;

    @JSONField(name = "message_type")
    public int messageType;

    @JSONField(name = "post_id")
    public String postId;

    @JSONField(name = "post_title")
    public String postTitle;

    @JSONField(name = "publish_time")
    public String publishTime;

    @JSONField(name = "reply_no")
    public String replyNo;

    @JSONField(name = "reply_type")
    public int replyType;

    @JSONField(name = "to_content")
    public String toContent;

    @JSONField(name = "to_user_name")
    public String toUserName;
    public String uid;

    @JSONField(name = "user_face")
    public String userFace;

    @JSONField(name = "user_name")
    public String userName;

    @JSONField(name = "wiki_link")
    public String wikiLink;

    @JSONField(name = "wiki_title")
    public String wikiTitle;

    public boolean equals(Object obj) {
        String str;
        boolean z6 = false;
        if (!(obj instanceof BiligameMyMessagePage) || (str = ((BiligameMyMessagePage) obj).messageNo) == null) {
            return false;
        }
        if (this == obj || this.messageNo.equals(str)) {
            z6 = true;
        }
        return z6;
    }

    public int hashCode() {
        String str = this.messageNo;
        return str != null ? str.hashCode() : super.hashCode();
    }

    public String toString() {
        return "BiligameMyMessagePage{messageNo='" + this.messageNo + "', isRead=" + this.isRead + ", gameBaseId=" + this.gameBaseId + ", gameName='" + this.gameName + "', expandedName='" + this.expandedName + "', replyNo='" + this.replyNo + "', uid='" + this.uid + "', userName='" + this.userName + "', userFace='" + this.userFace + "', publishTime='" + this.publishTime + "', commentNo='" + this.commentNo + "', replyType=" + this.replyType + ", attitudeType=" + this.attitudeType + ", messageType=" + this.messageType + ", postTitle='" + this.postTitle + "', postId='" + this.postId + "', commentId='" + this.commentId + "', wikiTitle='" + this.wikiTitle + "', wikiLink='" + this.wikiLink + "', toUserName='" + this.toUserName + "', toContent='" + this.toContent + "', content='" + this.content + "', emotes=" + this.emotes + '}';
    }
}
