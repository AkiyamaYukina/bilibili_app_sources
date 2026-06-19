package com.bilibili.lib.sharewrapper.online.api;

import androidx.annotation.Keep;
import com.bilibili.biligame.api.bean.gamedetail.GameDetailContent;
import com.bilibili.bson.common.Bson;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/online/api/ShareChannels.class */
@Bson
@Keep
public final class ShareChannels {

    @SerializedName("above_channels")
    @Nullable
    private ArrayList<ChannelItem> aboveChannels;

    @SerializedName("below_channels")
    @Nullable
    private ArrayList<ChannelItem> belowChannels;

    @SerializedName("copy_link")
    @Nullable
    private String copyLink;

    @SerializedName(CaptureSchema.JUMP_PARAMS_EXTRA)
    @Nullable
    private ChannelExtra extra;

    @SerializedName(GameDetailContent.DetailInfo.UI_TYPE_JUMP_LINK)
    @Nullable
    private String jumpLink;

    @Nullable
    private String picture;

    @SerializedName("system_channels")
    @Nullable
    private ArrayList<ChannelItem> systemChannels;

    @Nullable
    private String text;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/online/api/ShareChannels$ChannelExtra.class */
    @Bson
    @Keep
    public static final class ChannelExtra {

        @SerializedName("quick_message_on")
        private boolean messageOn;

        public final boolean getMessageOn() {
            return this.messageOn;
        }

        public final void setMessageOn(boolean z6) {
            this.messageOn = z6;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/online/api/ShareChannels$ChannelItem.class */
    @Bson
    @Keep
    public static final class ChannelItem {

        @Nullable
        private String category;

        @SerializedName(GameDetailContent.DetailInfo.UI_TYPE_JUMP_LINK)
        @Nullable
        private String jumpLink;

        @Nullable
        private String level;

        @Nullable
        private String name;

        @Nullable
        private String picture;

        @SerializedName("share_channel")
        @Nullable
        private String shareChannel;

        @Nullable
        private ArrayList<MenuStatusItem> statusList;

        @Nullable
        private String tag;

        @Nullable
        private String title = "";

        @Nullable
        public final String getCategory() {
            return this.category;
        }

        @Nullable
        public final String getJumpLink() {
            return this.jumpLink;
        }

        @Nullable
        public final String getLevel() {
            return this.level;
        }

        @Nullable
        public final String getName() {
            return this.name;
        }

        @Nullable
        public final String getPicture() {
            return this.picture;
        }

        @Nullable
        public final String getShareChannel() {
            return this.shareChannel;
        }

        @Nullable
        public final ArrayList<MenuStatusItem> getStatusList() {
            return this.statusList;
        }

        @Nullable
        public final String getTag() {
            return this.tag;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        public final void setCategory(@Nullable String str) {
            this.category = str;
        }

        public final void setJumpLink(@Nullable String str) {
            this.jumpLink = str;
        }

        public final void setLevel(@Nullable String str) {
            this.level = str;
        }

        public final void setName(@Nullable String str) {
            this.name = str;
        }

        public final void setPicture(@Nullable String str) {
            this.picture = str;
        }

        public final void setShareChannel(@Nullable String str) {
            this.shareChannel = str;
        }

        public final void setStatusList(@Nullable ArrayList<MenuStatusItem> arrayList) {
            this.statusList = arrayList;
        }

        public final void setTag(@Nullable String str) {
            this.tag = str;
        }

        public final void setTitle(@Nullable String str) {
            this.title = str;
        }
    }

    @Nullable
    public final ArrayList<ChannelItem> getAboveChannels() {
        return this.aboveChannels;
    }

    @Nullable
    public final ArrayList<ChannelItem> getBelowChannels() {
        return this.belowChannels;
    }

    @Nullable
    public final String getCopyLink() {
        return this.copyLink;
    }

    @Nullable
    public final ChannelExtra getExtra() {
        return this.extra;
    }

    @Nullable
    public final String getJumpLink() {
        return this.jumpLink;
    }

    @Nullable
    public final String getPicture() {
        return this.picture;
    }

    @Nullable
    public final ArrayList<ChannelItem> getSystemChannels() {
        return this.systemChannels;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean isEmpty() {
        /*
            r2 = this;
            r0 = r2
            java.util.ArrayList<com.bilibili.lib.sharewrapper.online.api.ShareChannels$ChannelItem> r0 = r0.aboveChannels
            r5 = r0
            r0 = 1
            r4 = r0
            r0 = r5
            if (r0 == 0) goto L13
            r0 = r5
            boolean r0 = r0.isEmpty()
            r3 = r0
            goto L15
        L13:
            r0 = 1
            r3 = r0
        L15:
            r0 = r3
            if (r0 == 0) goto L4c
            r0 = r2
            java.util.ArrayList<com.bilibili.lib.sharewrapper.online.api.ShareChannels$ChannelItem> r0 = r0.belowChannels
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L2a
            r0 = r5
            boolean r0 = r0.isEmpty()
            r3 = r0
            goto L2c
        L2a:
            r0 = 1
            r3 = r0
        L2c:
            r0 = r3
            if (r0 == 0) goto L4c
            r0 = r2
            java.util.ArrayList<com.bilibili.lib.sharewrapper.online.api.ShareChannels$ChannelItem> r0 = r0.systemChannels
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L41
            r0 = r5
            boolean r0 = r0.isEmpty()
            r3 = r0
            goto L43
        L41:
            r0 = 1
            r3 = r0
        L43:
            r0 = r3
            if (r0 == 0) goto L4c
            r0 = r4
            r3 = r0
            goto L4e
        L4c:
            r0 = 0
            r3 = r0
        L4e:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.sharewrapper.online.api.ShareChannels.isEmpty():boolean");
    }

    public final void setAboveChannels(@Nullable ArrayList<ChannelItem> arrayList) {
        this.aboveChannels = arrayList;
    }

    public final void setBelowChannels(@Nullable ArrayList<ChannelItem> arrayList) {
        this.belowChannels = arrayList;
    }

    public final void setCopyLink(@Nullable String str) {
        this.copyLink = str;
    }

    public final void setExtra(@Nullable ChannelExtra channelExtra) {
        this.extra = channelExtra;
    }

    public final void setJumpLink(@Nullable String str) {
        this.jumpLink = str;
    }

    public final void setPicture(@Nullable String str) {
        this.picture = str;
    }

    public final void setSystemChannels(@Nullable ArrayList<ChannelItem> arrayList) {
        this.systemChannels = arrayList;
    }

    public final void setText(@Nullable String str) {
        this.text = str;
    }
}
