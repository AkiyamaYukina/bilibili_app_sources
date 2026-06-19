package com.bilibili.music.podcast.legacy.data;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.music.podcast.legacy.data.SongDetail;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/legacy/data/Song.class */
@Keep
public class Song implements Cloneable {
    public transient SongDetail.SongCate cate;

    @JSONField(name = "coin_num")
    public long coinNum;

    @JSONField(name = "fans")
    public int fans;

    @JSONField(name = "is_collect")
    public int isCollect;

    @JSONField(name = "up_is_follow")
    public int isFollowed;

    @JSONField(name = "is_off")
    public boolean isOff;

    @JSONField(name = "lyric_url")
    public String lyricUrl;

    @JSONField(name = "cover_url")
    public String mCoverUrl;

    @JSONField(name = EditCustomizeSticker.TAG_MID)
    public long mMId;

    @JSONField(name = "id")
    public long mSId;

    @JSONField(name = "title")
    public String mTitle;

    @JSONField(name = "reply_count")
    public long replyCount;

    @JSONField(name = "snum")
    public long shareNum;
    public int songAttr;

    @JSONField(name = "collect_count")
    public long mCollectNum = -1;

    @JSONField(name = "play_count")
    public long mPlayNum = -1;

    @JSONField(name = "intro")
    public String mIntro = "";

    @JSONField(name = "up_img")
    public String mUpAvatarUrl = "";

    @JSONField(name = "up_name")
    public String mUpName = "-";

    @JSONField(name = "ctime_str")
    public String mCTimeDisplay = "-";
    public String author = "";
    public String avid = "";

    @JSONField(name = "is_cacheable")
    public boolean isCachable = true;

    @JSONField(name = "up_cert_info")
    public String certDesc = "";

    public void addCollectCount() {
        this.mCollectNum++;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void collect() {
        this.isCollect = 1;
    }

    public void followUpper() {
        this.isFollowed = 1;
    }

    public boolean hasCollected() {
        boolean z6 = true;
        if (1 != this.isCollect) {
            z6 = false;
        }
        return z6;
    }

    public boolean hasFollowed() {
        boolean z6 = true;
        if (this.isFollowed != 1) {
            z6 = false;
        }
        return z6;
    }

    public void reduceCollectCount() {
        this.mCollectNum = Math.max(0L, this.mCollectNum - 1);
    }

    public void setFollow(boolean z6) {
        if (z6) {
            followUpper();
        } else {
            unFollowUpper();
        }
    }

    public void unCollect() {
        this.isCollect = 0;
    }

    public void unFollowUpper() {
        this.isFollowed = 0;
    }
}
