package com.bilibili.bililive.listplayer.video.model;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/bililive/listplayer/video/model/PegasusEndMask.class */
@Keep
public class PegasusEndMask {

    @Nullable
    @JSONField(name = "avatar")
    public Avatar avatar;

    @Nullable
    @JSONField(name = "button")
    public Button button;

    @JSONField(name = "from")
    public int from;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/bililive/listplayer/video/model/PegasusEndMask$Avatar.class */
    @Keep
    public static class Avatar {

        @Nullable
        @JSONField(name = "cover")
        public String cover;

        @Nullable
        @JSONField(name = NotificationCompat.CATEGORY_EVENT)
        public String event;

        @Nullable
        @JSONField(name = "event_v2")
        public String eventV2;

        @Nullable
        @JSONField(name = "text")
        public String text;

        @Nullable
        @JSONField(name = EditCustomizeSticker.TAG_URI)
        public String uri;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/bililive/listplayer/video/model/PegasusEndMask$Button.class */
    @Keep
    public static class Button {

        @Nullable
        @JSONField(name = NotificationCompat.CATEGORY_EVENT)
        public String event;

        @Nullable
        @JSONField(name = "event_v2")
        public String eventV2;

        @JSONField(name = "param")
        public long param;

        @JSONField(name = "selected")
        public int selected;

        @Nullable
        @JSONField(name = "text")
        public String text;

        @JSONField(name = "type")
        public int type;
    }
}
