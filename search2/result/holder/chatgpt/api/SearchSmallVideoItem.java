package com.bilibili.search2.result.holder.chatgpt.api;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.broadcast.message.main.ReasonStyle;
import com.bapis.bilibili.broadcast.message.main.VideoCard;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.api.Tag;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/chatgpt/api/SearchSmallVideoItem.class */
@StabilityInferred(parameters = 0)
@Keep
public final class SearchSmallVideoItem extends BaseSearchItem {
    public static final int $stable = 8;

    @JSONField(name = "author")
    @Nullable
    private String author;

    @JSONField(name = "badges")
    @Nullable
    private List<? extends Tag> badges;

    @JSONField(name = "desc")
    @Nullable
    private String desc;

    @JSONField(name = EditCustomizeSticker.TAG_DURATION)
    @Nullable
    private String duration;

    @JSONField(name = "icon_type")
    private int iconType;

    @JSONField(name = "new_rec_tags")
    @Nullable
    private List<? extends Tag> recTags;

    @JSONField(name = "show_card_desc_2")
    @Nullable
    private String showCardDesc2;

    @JSONField(name = "view_content")
    @Nullable
    private String viewContent;

    public SearchSmallVideoItem(@NotNull VideoCard videoCard) {
        this.author = videoCard.getAuthor();
        this.desc = videoCard.getDesc();
        this.duration = videoCard.getDuration();
        ArrayList arrayList = new ArrayList();
        Iterator it = videoCard.getBadgesList().iterator();
        while (it.hasNext()) {
            arrayList.add(new Tag((ReasonStyle) it.next()));
        }
        if (!arrayList.isEmpty()) {
            this.badges = arrayList;
        }
        this.showCardDesc2 = videoCard.getShowCardDesc2();
        setTitle(videoCard.getTitle());
        setCover(videoCard.getCover());
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = videoCard.getNewRecTagsList().iterator();
        while (it2.hasNext()) {
            arrayList2.add(new Tag((ReasonStyle) it2.next()));
        }
        if (!arrayList2.isEmpty()) {
            this.recTags = arrayList2;
        }
        this.viewContent = videoCard.getViewContent();
        this.iconType = videoCard.getIconType();
    }

    @Nullable
    public final String getAuthor() {
        return this.author;
    }

    @Nullable
    public final List<Tag> getBadges() {
        return this.badges;
    }

    @Nullable
    public final String getDesc() {
        return this.desc;
    }

    @Nullable
    public final String getDuration() {
        return this.duration;
    }

    public final int getIconType() {
        return this.iconType;
    }

    @Nullable
    public final List<Tag> getRecTags() {
        return this.recTags;
    }

    @Nullable
    public final String getShowCardDesc2() {
        return this.showCardDesc2;
    }

    @Nullable
    public final String getViewContent() {
        return this.viewContent;
    }

    public final void setAuthor(@Nullable String str) {
        this.author = str;
    }

    public final void setBadges(@Nullable List<? extends Tag> list) {
        this.badges = list;
    }

    public final void setDesc(@Nullable String str) {
        this.desc = str;
    }

    public final void setDuration(@Nullable String str) {
        this.duration = str;
    }

    public final void setIconType(int i7) {
        this.iconType = i7;
    }

    public final void setRecTags(@Nullable List<? extends Tag> list) {
        this.recTags = list;
    }

    public final void setShowCardDesc2(@Nullable String str) {
        this.showCardDesc2 = str;
    }

    public final void setViewContent(@Nullable String str) {
        this.viewContent = str;
    }
}
