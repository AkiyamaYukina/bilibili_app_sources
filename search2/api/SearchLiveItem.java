package com.bilibili.search2.api;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.app.translation.v1.TranslationBusiness;
import com.bapis.bilibili.polymer.app.search.v1.SearchLiveCard;
import com.bapis.bilibili.polymer.app.search.v1.ThreePoint;
import com.bilibili.app.comm.list.common.inline.view.RightTopLiveBadge;
import com.bilibili.droid.StringUtil;
import com.bilibili.search2.api.BaseSearchItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchLiveItem.class */
@StabilityInferred(parameters = 0)
@Keep
public final class SearchLiveItem extends BaseSearchItem implements com.bilibili.search2.api.oversea.a {
    public static final int $stable = 8;

    @JSONField(name = "badge")
    @Nullable
    private String badge;

    @JSONField(name = "card_left_icon")
    private int cardLeftIcon;

    @JSONField(name = "card_left_text")
    @Nullable
    private String cardLeftText;

    @JSONField(name = "live_link")
    @Nullable
    private String liveLink;

    @JSONField(name = "name")
    @Nullable
    private String name;

    @JSONField(name = "online")
    private int online;

    @JSONField(name = "right_top_live_badge")
    @Nullable
    private RightTopLiveBadge rightTopLiveBadge;

    @JSONField(name = "show_card_desc_2")
    @Nullable
    private String showCardDesc2;

    public SearchLiveItem() {
    }

    public SearchLiveItem(@NotNull SearchLiveCard searchLiveCard) {
        this.name = searchLiveCard.getName();
        this.online = searchLiveCard.getOnline();
        this.badge = searchLiveCard.getBadge();
        this.liveLink = searchLiveCard.getLiveLink();
        this.cardLeftText = searchLiveCard.getCardLeftText();
        this.cardLeftIcon = searchLiveCard.getCardLeftIcon();
        setTitle(searchLiveCard.getTitle());
        setCover(searchLiveCard.getCover());
        if (searchLiveCard.hasRcmdReason()) {
            setRecommendReason(new BaseSearchItem.RecommendReason(searchLiveCard.getRcmdReason()));
        }
        if (searchLiveCard.hasRightTopLiveBadge()) {
            this.rightTopLiveBadge = new RightTopLiveBadge(searchLiveCard.getRightTopLiveBadge());
        }
        this.showCardDesc2 = searchLiveCard.getShowCardDesc2();
        if (searchLiveCard.hasFeedback()) {
            setFeedback(new BaseSearchItem.Feedback(searchLiveCard.getFeedback()));
        }
        setTranslatedTitle(searchLiveCard.getTranslatedTitle());
        setTranslatedStatus(searchLiveCard.getTranslationStatus());
        if (searchLiveCard.getThreePointList().isEmpty()) {
            return;
        }
        List threePointList = searchLiveCard.getThreePointList();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(threePointList, 10));
        Iterator it = threePointList.iterator();
        while (it.hasNext()) {
            arrayList.add(new BaseSearchItem.ThreePointItem((ThreePoint) it.next()));
        }
        setThreePoints(arrayList);
    }

    @Override // com.bilibili.search2.api.oversea.a
    @NotNull
    public /* bridge */ /* synthetic */ List getAllItems() {
        return super.getAllItems();
    }

    @Nullable
    public final String getBadge() {
        return this.badge;
    }

    public final int getCardLeftIcon() {
        return this.cardLeftIcon;
    }

    @Nullable
    public final String getCardLeftText() {
        return this.cardLeftText;
    }

    @Nullable
    public final String getJumpUri() {
        return StringUtil.isNotBlank(this.liveLink) ? this.liveLink : getUri();
    }

    @Nullable
    public final String getLiveLink() {
        return this.liveLink;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final int getOnline() {
        return this.online;
    }

    @Nullable
    public final RightTopLiveBadge getRightTopLiveBadge() {
        return this.rightTopLiveBadge;
    }

    @Nullable
    public final String getShowCardDesc2() {
        return this.showCardDesc2;
    }

    @Override // com.bilibili.search2.api.oversea.a
    @NotNull
    public List getSubItems() {
        return CollectionsKt.emptyList();
    }

    @Override // com.bilibili.search2.api.oversea.a
    @NotNull
    public com.bilibili.search2.api.oversea.c getTranslateRequestParam() {
        TranslationBusiness translationBusiness = TranslationBusiness.TRANS_BIZ_LIVE;
        String param = getParam();
        String str = param;
        if (param == null) {
            str = "";
        }
        return new com.bilibili.search2.api.oversea.c(translationBusiness, str);
    }

    public final void setBadge(@Nullable String str) {
        this.badge = str;
    }

    public final void setCardLeftIcon(int i7) {
        this.cardLeftIcon = i7;
    }

    public final void setCardLeftText(@Nullable String str) {
        this.cardLeftText = str;
    }

    public final void setLiveLink(@Nullable String str) {
        this.liveLink = str;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setOnline(int i7) {
        this.online = i7;
    }

    public final void setRightTopLiveBadge(@Nullable RightTopLiveBadge rightTopLiveBadge) {
        this.rightTopLiveBadge = rightTopLiveBadge;
    }

    public final void setShowCardDesc2(@Nullable String str) {
        this.showCardDesc2 = str;
    }
}
