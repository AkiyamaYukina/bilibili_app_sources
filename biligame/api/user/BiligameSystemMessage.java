package com.bilibili.biligame.api.user;

import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.biligame.api.BiligameGiftIcon;
import com.bilibili.biligame.api.BiligameHotGame;
import com.bilibili.live.streaming.source.TextSource;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/user/BiligameSystemMessage.class */
@Keep
public class BiligameSystemMessage extends BiligameHotGame {
    public static final int TYPE_AUTO_BOOK = 4;
    public static final int TYPE_CODE = 1;
    public static final int TYPE_GAME_CODE = 2;
    public static final int TYPE_NO_CODE = 0;
    public static final int TYPE_TEXT = 3;

    @JSONField(name = "code")
    public String code;

    @JSONField(name = TextSource.CFG_CONTENT)
    public String content;

    @JSONField(name = "gift_icon_list")
    public List<BiligameGiftIcon> giftIconList;

    @JSONField(name = "gift_num")
    public int giftNum;

    @JSONField(name = "hot_rank")
    public int hotRank;

    @JSONField(name = "id")
    public String id;

    @JSONField(name = "message_link")
    public String messageLink;

    @JSONField(name = "message_no")
    public String messageNo;

    @JSONField(name = NotificationCompat.CATEGORY_STATUS)
    public int status;

    @JSONField(name = "test_status")
    public int testStatus = 0;

    @JSONField(name = "push_time")
    public String time;

    @JSONField(name = "title")
    public String title;

    @JSONField(name = "type")
    public int type;

    @JSONField(name = "video_image")
    public String videoImage;

    @Override // com.bilibili.biligame.api.BiligameHotGame
    public boolean equals(Object obj) {
        String str;
        boolean z6 = false;
        if (!(obj instanceof BiligameSystemMessage) || (str = ((BiligameSystemMessage) obj).id) == null) {
            return false;
        }
        if (this == obj || this.id.equals(str)) {
            z6 = true;
        }
        return z6;
    }

    @Override // com.bilibili.biligame.api.BiligameHotGame
    public int hashCode() {
        String str = this.id;
        return str != null ? str.hashCode() : super.hashCode();
    }
}
