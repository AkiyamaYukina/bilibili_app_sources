package com.bilibili.playset.note;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.lib.accountinfo.model.PendantInfo;
import com.bilibili.lib.accountinfo.model.VipUserInfo;
import com.bilibili.live.streaming.source.TextSource;
import com.bilibili.opd.app.bizcommon.context.provider.MallProviderParamsHelper;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/note/RspNoteListByOid.class */
@Keep
public class RspNoteListByOid {

    @Nullable
    @JSONField(name = "list")
    public List<Note> list;

    @JSONField(name = "message")
    public String message;

    @Nullable
    @JSONField(name = MallProviderParamsHelper.ActiveProviderParams.URI_QUERY_PAGE)
    public Page page;

    @JSONField(name = "show_public_note")
    public boolean showPublicNote = true;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/note/RspNoteListByOid$Note.class */
    @Keep
    public static class Note {
        public static final int CANCEL_RECOMMEND = 2;
        public static final int CONFIRM_RECOMMEND = 1;

        @Nullable
        @JSONField(name = "author")
        public Author author;

        @JSONField(name = "cvid")
        public long cvid;

        @JSONField(name = "has_like")
        public boolean isRecommended;

        @Nullable
        @JSONField(name = "pubtime")
        public String pubtime;

        @JSONField(name = "likes")
        public int recommendAmount;

        @Nullable
        @JSONField(name = "summary")
        public String summary;

        @Nullable
        @JSONField(name = "web_url")
        public String webUrl;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/note/RspNoteListByOid$Note$Author.class */
        @Keep
        public static class Author {

            @Nullable
            @JSONField(name = "face")
            public String face;

            @JSONField(name = "level")
            public int level = -1;

            @JSONField(name = EditCustomizeSticker.TAG_MID)
            public long mid;

            @Nullable
            @JSONField(name = "name")
            public String name;

            @Nullable
            @JSONField(name = "pendant")
            public PendantInfo pendant;

            @Nullable
            @JSONField(name = "vip_info")
            public VipUserInfo vipUserInfo;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/note/RspNoteListByOid$Page.class */
    @Keep
    public static class Page {

        @JSONField(name = "num")
        public int num;

        @JSONField(name = TextSource.CFG_SIZE)
        public int size;

        @JSONField(name = "total")
        public int total;
    }
}
