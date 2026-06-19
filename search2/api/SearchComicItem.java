package com.bilibili.search2.api;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.polymer.app.search.v1.SearchComicCard;
import com.bapis.bilibili.polymer.app.search.v1.ThreePoint;
import com.bilibili.commons.StringUtils;
import com.bilibili.search2.api.BaseSearchItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchComicItem.class */
@StabilityInferred(parameters = 0)
@Keep
public final class SearchComicItem extends BaseSearchItem {
    public static final int $stable = 8;

    @JSONField(name = "badge")
    @Nullable
    private String badge;

    @JSONField(name = "cid")
    private long cid;

    @JSONField(deserialize = false, serialize = false)
    @NotNull
    private final ArrayList<String> clickEpisode = new ArrayList<>();

    @JSONField(name = "comic_url")
    @Nullable
    private String comicUrl;

    @JSONField(name = "episodes_new")
    @Nullable
    private List<EpisodeNew> episodesNew;

    @JSONField(name = "follow_button")
    @Nullable
    private FollowButtonV2 followButton;

    @JSONField(name = "is_attend")
    private int isAttend;
    private boolean isFromComicPage;
    private int itemOffset;

    @JSONField(name = "name")
    @Nullable
    private String name;

    @Nullable
    private String ogvAggregateTitle;

    @JSONField(name = "rec_tag")
    @Nullable
    private Tag recTag;

    @JSONField(name = "rec_text")
    @Nullable
    private String recText;
    private int scrollPosition;

    @JSONField(name = "selection_style")
    @Nullable
    private String selectionStyle;

    @JSONField(deserialize = false, serialize = false)
    @Nullable
    private String shareTitle;

    @JSONField(name = "style")
    @Nullable
    private String style;

    public SearchComicItem() {
    }

    public SearchComicItem(@NotNull SearchComicCard searchComicCard) {
        this.name = searchComicCard.getName();
        this.style = searchComicCard.getStyle();
        this.comicUrl = searchComicCard.getComicUrl();
        this.badge = searchComicCard.getBadge();
        setTitle(searchComicCard.getTitle());
        setCover(searchComicCard.getCover());
        this.cid = searchComicCard.getCid();
        this.selectionStyle = searchComicCard.getSelectionStyle();
        this.isAttend = searchComicCard.getIsAttend();
        if (searchComicCard.hasFollowButton()) {
            this.followButton = new FollowButtonV2(searchComicCard.getFollowButton());
        }
        if (searchComicCard.hasRecTag()) {
            this.recTag = new Tag(searchComicCard.getRecTag());
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = searchComicCard.getEpisodesNewList().iterator();
        while (it.hasNext()) {
            arrayList.add(new EpisodeNew((com.bapis.bilibili.polymer.app.search.v1.EpisodeNew) it.next()));
        }
        if (!arrayList.isEmpty()) {
            this.episodesNew = arrayList;
        }
        this.recText = searchComicCard.getRecText();
        if (searchComicCard.hasShare()) {
            setShare(new BaseSearchItem.Share(searchComicCard.getShare()));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = searchComicCard.getThreePointList().iterator();
        while (it2.hasNext()) {
            arrayList2.add(new BaseSearchItem.ThreePointItem((ThreePoint) it2.next()));
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        setThreePoints(arrayList2);
    }

    public final void clickEpisode(@Nullable String str) {
        this.clickEpisode.add(str);
    }

    @Nullable
    public final String getBadge() {
        return this.badge;
    }

    public final long getCid() {
        return this.cid;
    }

    @NotNull
    public final ArrayList<String> getClickEpisode() {
        return this.clickEpisode;
    }

    @Nullable
    public final String getComicUrl() {
        return this.comicUrl;
    }

    @Nullable
    public final List<EpisodeNew> getEpisodesNew() {
        return this.episodesNew;
    }

    @Nullable
    public final FollowButtonV2 getFollowButton() {
        return this.followButton;
    }

    public final int getItemOffset() {
        return this.itemOffset;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getOgvAggregateTitle() {
        return this.ogvAggregateTitle;
    }

    @Nullable
    public final Tag getRecTag() {
        return this.recTag;
    }

    @Nullable
    public final String getRecText() {
        return this.recText;
    }

    public final int getScrollPosition() {
        return this.scrollPosition;
    }

    @Nullable
    public final String getSelectionStyle() {
        return this.selectionStyle;
    }

    @Nullable
    public final String getShareTitle() {
        return this.shareTitle;
    }

    @Nullable
    public final String getStyle() {
        return this.style;
    }

    public final boolean hasFollowTextFromNetwork() {
        FollowButtonV2 followButtonV2 = this.followButton;
        boolean z6 = false;
        if (followButtonV2 != null) {
            FollowButtonTexts texts = followButtonV2.getTexts();
            z6 = false;
            if (texts != null) {
                z6 = false;
                if (!StringUtils.isEmpty(texts.getSelected())) {
                    z6 = false;
                    if (!StringUtils.isEmpty(texts.getUnselect())) {
                        z6 = true;
                    }
                }
            }
        }
        return z6;
    }

    public final int isAttend() {
        return this.isAttend;
    }

    public final boolean isAttended() {
        boolean z6 = true;
        if (this.isAttend != 1) {
            z6 = false;
        }
        return z6;
    }

    public final boolean isFromComicPage() {
        return this.isFromComicPage;
    }

    public final void setAttend(int i7) {
        this.isAttend = i7;
    }

    public final void setBadge(@Nullable String str) {
        this.badge = str;
    }

    public final void setCid(long j7) {
        this.cid = j7;
    }

    public final void setComicUrl(@Nullable String str) {
        this.comicUrl = str;
    }

    public final void setEpisodesNew(@Nullable List<EpisodeNew> list) {
        this.episodesNew = list;
    }

    public final void setFollowButton(@Nullable FollowButtonV2 followButtonV2) {
        this.followButton = followButtonV2;
    }

    public final void setFromComicPage(boolean z6) {
        this.isFromComicPage = z6;
    }

    public final void setItemOffset(int i7) {
        this.itemOffset = i7;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setOgvAggregateTitle(@Nullable String str) {
        this.ogvAggregateTitle = str;
    }

    public final void setRecTag(@Nullable Tag tag) {
        this.recTag = tag;
    }

    public final void setRecText(@Nullable String str) {
        this.recText = str;
    }

    public final void setScrollPosition(int i7) {
        this.scrollPosition = i7;
    }

    public final void setSelectionStyle(@Nullable String str) {
        this.selectionStyle = str;
    }

    public final void setShareTitle(@Nullable String str) {
        this.shareTitle = str;
    }

    public final void setStyle(@Nullable String str) {
        this.style = str;
    }
}
