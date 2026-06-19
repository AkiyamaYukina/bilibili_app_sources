package com.bilibili.search2.api;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.polymer.app.search.v1.Badge2;
import com.bapis.bilibili.polymer.app.search.v1.ChannelLabel;
import com.bapis.bilibili.polymer.app.search.v1.SearchNewChannelCard;
import com.bilibili.commons.StringUtils;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import dt0.InterfaceC6844g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchNewChannel.class */
@StabilityInferred(parameters = 0)
@Keep
public final class SearchNewChannel extends BaseSearchItem implements InterfaceC6844g {
    public static final int $stable = 8;

    @JSONField(name = "channel_button")
    @Nullable
    private TextButton button;

    @JSONField(name = "design_type")
    @Nullable
    private String designType;

    @JSONField(name = "id")
    private long id;

    @JSONField(name = "items")
    @Nullable
    private List<ChannelMixedItem> items;

    @JSONField(name = "channel_label1")
    @Nullable
    private TextLabel labelOne;

    @JSONField(name = "channel_label2")
    @Nullable
    private TextLabel labelTwo;

    @JSONField(name = "type_icon")
    @Nullable
    private String typeIcon;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchNewChannel$ChannelMixedItem.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class ChannelMixedItem extends BaseSearchItem {
        public static final int $stable = 8;

        @JSONField(name = "badge2")
        @Nullable
        private Badge badge;

        @JSONField(name = "cover_left_icon_1")
        private int coverLeftIcon;

        @JSONField(name = "cover_left_text_1")
        @Nullable
        private String coverLeftText;

        @JSONField(name = "id")
        private long id;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchNewChannel$ChannelMixedItem$Badge.class */
        @StabilityInferred(parameters = 0)
        @Keep
        public static final class Badge {
            public static final int $stable = 8;

            @JSONField(name = "bg_cover")
            @Nullable
            private String bgCover;

            @JSONField(name = "text")
            @Nullable
            private String text;

            public Badge() {
            }

            public Badge(@NotNull Badge2 badge2) {
                this.bgCover = badge2.getBgCover();
                this.text = badge2.getText();
            }

            @Nullable
            public final String getBgCover() {
                return this.bgCover;
            }

            @Nullable
            public final String getText() {
                return this.text;
            }

            public final void setBgCover(@Nullable String str) {
                this.bgCover = str;
            }

            public final void setText(@Nullable String str) {
                this.text = str;
            }
        }

        public ChannelMixedItem() {
        }

        public ChannelMixedItem(@NotNull com.bapis.bilibili.polymer.app.search.v1.ChannelMixedItem channelMixedItem) {
            this.id = channelMixedItem.getId();
            this.coverLeftIcon = channelMixedItem.getCoverLeftIcon1();
            this.coverLeftText = channelMixedItem.getCoverLeftText1();
            if (channelMixedItem.hasBadge()) {
                this.badge = new Badge(channelMixedItem.getBadge());
            }
            setTitle(channelMixedItem.getTitle());
            setCover(channelMixedItem.getCover());
            setUri(channelMixedItem.getUri());
            setGoTo(channelMixedItem.getGoto());
            setParam(channelMixedItem.getParam());
        }

        @Nullable
        public final Badge getBadge() {
            return this.badge;
        }

        public final int getCoverLeftIcon() {
            return this.coverLeftIcon;
        }

        @Nullable
        public final String getCoverLeftText() {
            return this.coverLeftText;
        }

        public final long getId() {
            return this.id;
        }

        public final void setBadge(@Nullable Badge badge) {
            this.badge = badge;
        }

        public final void setCoverLeftIcon(int i7) {
            this.coverLeftIcon = i7;
        }

        public final void setCoverLeftText(@Nullable String str) {
            this.coverLeftText = str;
        }

        public final void setId(long j7) {
            this.id = j7;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchNewChannel$TextButton.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class TextButton {
        public static final int $stable = 8;

        @JSONField(name = "text")
        @Nullable
        private String text;

        @JSONField(name = EditCustomizeSticker.TAG_URI)
        @Nullable
        private String uri;

        public TextButton() {
        }

        public TextButton(@NotNull ChannelLabel channelLabel) {
            this.text = channelLabel.getText();
            this.uri = channelLabel.getUri();
        }

        public final boolean canShow() {
            return (StringUtils.isEmpty(this.text) || StringUtils.isEmpty(this.uri)) ? false : true;
        }

        @Nullable
        public final String getText() {
            return this.text;
        }

        @Nullable
        public final String getUri() {
            return this.uri;
        }

        public final void setText(@Nullable String str) {
            this.text = str;
        }

        public final void setUri(@Nullable String str) {
            this.uri = str;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchNewChannel$TextLabel.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class TextLabel {
        public static final int $stable = 8;

        @JSONField(name = "icon_type")
        private int iconType;

        @JSONField(name = "text")
        @Nullable
        private String text;

        @JSONField(name = EditCustomizeSticker.TAG_URI)
        @Nullable
        private String uri;

        public TextLabel() {
        }

        public TextLabel(@NotNull ChannelLabel channelLabel) {
            this.text = channelLabel.getText();
            this.uri = channelLabel.getUri();
            this.iconType = channelLabel.getIconType();
        }

        public final boolean canShow() {
            return (StringUtils.isEmpty(this.text) || StringUtils.isEmpty(this.uri)) ? false : true;
        }

        public final int getIconType() {
            return this.iconType;
        }

        @Nullable
        public final String getText() {
            return this.text;
        }

        @Nullable
        public final String getUri() {
            return this.uri;
        }

        public final void setIconType(int i7) {
            this.iconType = i7;
        }

        public final void setText(@Nullable String str) {
            this.text = str;
        }

        public final void setUri(@Nullable String str) {
            this.uri = str;
        }
    }

    public SearchNewChannel() {
    }

    public SearchNewChannel(@NotNull SearchNewChannelCard searchNewChannelCard) {
        this.id = searchNewChannelCard.getId();
        this.typeIcon = searchNewChannelCard.getTypeIcon();
        if (searchNewChannelCard.hasChannelLabel1()) {
            this.labelOne = new TextLabel(searchNewChannelCard.getChannelLabel1());
        }
        if (searchNewChannelCard.hasChannelLabel2()) {
            this.labelTwo = new TextLabel(searchNewChannelCard.getChannelLabel2());
        }
        if (searchNewChannelCard.hasChannelButton()) {
            this.button = new TextButton(searchNewChannelCard.getChannelButton());
        }
        this.designType = searchNewChannelCard.getDesignType();
        ArrayList arrayList = new ArrayList();
        Iterator it = searchNewChannelCard.getItemsList().iterator();
        while (it.hasNext()) {
            arrayList.add(new ChannelMixedItem((com.bapis.bilibili.polymer.app.search.v1.ChannelMixedItem) it.next()));
        }
        if (!arrayList.isEmpty()) {
            this.items = arrayList;
        }
        setTitle(searchNewChannelCard.getTitle());
        setCover(searchNewChannelCard.getCover());
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    public void afterInit() {
        super.afterInit();
        List<ChannelMixedItem> list = this.items;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((ChannelMixedItem) it.next()).cloneFatherParam(this);
            }
        }
    }

    @Override // dt0.InterfaceC6844g
    public void deliverLocalPagePos(int i7) {
        List<ChannelMixedItem> list = this.items;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((ChannelMixedItem) it.next()).setLocalPagePos(i7);
            }
        }
    }

    @Nullable
    public final TextButton getButton() {
        return this.button;
    }

    @Nullable
    public final String getDesignType() {
        return this.designType;
    }

    public final long getId() {
        return this.id;
    }

    @Nullable
    public final List<ChannelMixedItem> getItems() {
        return this.items;
    }

    @Nullable
    public final TextLabel getLabelOne() {
        return this.labelOne;
    }

    @Nullable
    public final TextLabel getLabelTwo() {
        return this.labelTwo;
    }

    @Nullable
    public final String getTypeIcon() {
        return this.typeIcon;
    }

    public final boolean isValid() {
        return Intrinsics.areEqual("channel", this.designType) || Intrinsics.areEqual("archive", this.designType);
    }

    public final void setButton(@Nullable TextButton textButton) {
        this.button = textButton;
    }

    public final void setDesignType(@Nullable String str) {
        this.designType = str;
    }

    public final void setId(long j7) {
        this.id = j7;
    }

    public final void setItems(@Nullable List<ChannelMixedItem> list) {
        this.items = list;
    }

    public final void setLabelOne(@Nullable TextLabel textLabel) {
        this.labelOne = textLabel;
    }

    public final void setLabelTwo(@Nullable TextLabel textLabel) {
        this.labelTwo = textLabel;
    }

    public final void setTypeIcon(@Nullable String str) {
        this.typeIcon = str;
    }
}
