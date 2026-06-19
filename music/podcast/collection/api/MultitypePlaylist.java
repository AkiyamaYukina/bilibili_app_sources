package com.bilibili.music.podcast.collection.api;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/collection/api/MultitypePlaylist.class */
@Keep
public class MultitypePlaylist {
    public static int STATE_DISLIKE = 2;
    public static int STATE_LIKE = 1;
    public static int STATE_NONE;
    public Info info;
    public List<MultitypeMedia> medias = Collections.emptyList();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/collection/api/MultitypePlaylist$Info.class */
    @Keep
    public static class Info {
        public int attr;

        @Nullable
        public String cover;
        public int cover_type;
        public long ctime;

        @JSONField(name = "fav_state")
        public int favState;
        public long id;

        @Nullable
        public String intro;

        @JSONField(name = "like_state")
        public int likeState;

        @JSONField(name = "media_count")
        public int mediaCount;
        public long mid;
        public long mtime;
        public int pageType;

        @Nullable
        @JSONField(name = "cnt_info")
        public SocializeInfo socializeInfo;

        @Nullable
        public String title;
        public int type;

        @Nullable
        public Upper upper;

        public void downLike() {
            setLike(!isLike());
            SocializeInfo socializeInfo = this.socializeInfo;
            if (socializeInfo == null) {
                return;
            }
            int i7 = socializeInfo.thumb_up - 1;
            socializeInfo.thumb_up = i7;
            if (i7 < 0) {
                socializeInfo.thumb_up = 0;
            }
        }

        public boolean isCover16_9() {
            return this.cover_type == 2;
        }

        public boolean isFavorite() {
            boolean z6 = true;
            if (this.favState != 1) {
                z6 = false;
            }
            return z6;
        }

        public boolean isLike() {
            return this.likeState == MultitypePlaylist.STATE_LIKE;
        }

        public void remove(int i7) {
            this.mediaCount -= i7;
        }

        public void setFavorite(boolean z6) {
            this.favState = z6 ? 1 : 0;
            SocializeInfo socializeInfo = this.socializeInfo;
            if (socializeInfo == null) {
                return;
            }
            if (z6) {
                socializeInfo.collect++;
            } else {
                socializeInfo.collect--;
            }
        }

        public void setLike(boolean z6) {
            this.likeState = z6 ? MultitypePlaylist.STATE_LIKE : MultitypePlaylist.STATE_NONE;
        }

        public void upLike() {
            setLike(!isLike());
            SocializeInfo socializeInfo = this.socializeInfo;
            if (socializeInfo == null) {
                return;
            }
            socializeInfo.thumb_up++;
        }
    }
}
