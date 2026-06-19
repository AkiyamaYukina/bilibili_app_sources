package com.bilibili.search2.api;

import Ps0.C2784e;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.app.translation.v1.TranslationBusiness;
import com.bapis.bilibili.polymer.app.search.v1.ReasonStyle;
import com.bapis.bilibili.polymer.app.search.v1.SearchVideoCard;
import com.bapis.bilibili.polymer.app.search.v1.ThreePoint;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchVideoItem.class */
@StabilityInferred(parameters = 0)
@Keep
public final class SearchVideoItem extends BaseSearchItem implements com.bilibili.search2.api.oversea.a {
    public static final int $stable = 8;

    @Nullable
    private String area;

    @JSONField(name = "author")
    @Nullable
    private String author;

    @JSONField(name = "author_prefix")
    @Nullable
    private String authorPrefix;

    @JSONField(name = "badges")
    @Nullable
    private List<? extends Tag> badges;

    @JSONField(name = "badges_v2")
    @Nullable
    private List<? extends Tag> badgesV2;

    @Nullable
    private C2784e chargeLabel;
    private boolean comment43ExpEnable;

    @JSONField(name = "cover_badge")
    @Nullable
    private Tag coverBadge;

    @JSONField(name = "danmaku")
    private long danmaku;

    @JSONField(name = "desc")
    @Nullable
    private String desc;

    @JSONField(name = EditCustomizeSticker.TAG_DURATION)
    @Nullable
    private String duration;

    @Nullable
    private String eventId;

    @JSONField(name = "face")
    @Nullable
    private String face;

    @Nullable
    private SearchTimeAxisItem foldingTimeLine;

    @JSONField(name = "full_text")
    @Nullable
    private SearchVideoFullTextItem fullText;
    private int fullTextBackgroundType;
    private int fullTextLines;
    private int fullTextPrefix;
    private boolean fullTextShowLike;

    @NotNull
    private String highlightTag;

    @JSONField(name = "icon_type")
    private int iconType;

    @JSONField(name = EditCustomizeSticker.TAG_MID)
    private long mid;

    @JSONField(name = "new_rec_tags_v2")
    @Nullable
    private List<? extends Tag> newRecTagsV2;

    @JSONField(name = "play")
    private long play;

    @JSONField(name = "quality_tags")
    @Nullable
    private List<? extends Tag> qualityTags;

    @JSONField(deserialize = false, serialize = false)
    @Nullable
    private String shareTitle;

    @JSONField(name = "short_ogv_info")
    @Nullable
    private IaaInfo shortOgvInfo;

    @JSONField(name = "show_card_desc_1")
    @Nullable
    private String show_card_desc_1;

    @JSONField(name = "show_card_desc_2")
    @Nullable
    private String show_card_desc_2;
    private int tagHighlightOption;

    @JSONField(name = "view_content")
    @Nullable
    private String viewContent;

    public SearchVideoItem() {
        this.highlightTag = "";
    }

    public SearchVideoItem(@NotNull SearchVideoCard searchVideoCard, int i7, boolean z6, int i8, int i9, int i10, int i11) {
        this.highlightTag = "";
        this.play = searchVideoCard.getPlay();
        this.danmaku = searchVideoCard.getDanmaku();
        this.author = searchVideoCard.getAuthor();
        this.authorPrefix = searchVideoCard.getAuthorPrefix();
        this.desc = searchVideoCard.getDesc();
        this.duration = searchVideoCard.getDuration();
        ArrayList arrayList = new ArrayList();
        Iterator it = searchVideoCard.getBadgesList().iterator();
        while (it.hasNext()) {
            arrayList.add(new Tag((ReasonStyle) it.next()));
        }
        if (!arrayList.isEmpty()) {
            this.badges = arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = searchVideoCard.getBadgesV2List().iterator();
        while (it2.hasNext()) {
            arrayList2.add(new Tag((ReasonStyle) it2.next()));
        }
        if (!arrayList2.isEmpty()) {
            this.badgesV2 = arrayList2;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = searchVideoCard.getQualityTagsList().iterator();
        while (it3.hasNext()) {
            arrayList3.add(new Tag((ReasonStyle) it3.next()));
        }
        if (!arrayList3.isEmpty()) {
            this.qualityTags = arrayList3;
        }
        this.mid = searchVideoCard.getMid();
        this.show_card_desc_1 = searchVideoCard.getShowCardDesc1();
        this.show_card_desc_2 = searchVideoCard.getShowCardDesc2();
        this.comment43ExpEnable = z6;
        this.fullTextPrefix = i9;
        if (searchVideoCard.hasFullText()) {
            this.fullText = new SearchVideoFullTextItem(searchVideoCard.getFullText(), z6, this.fullTextPrefix == 2);
        }
        this.fullTextBackgroundType = i8;
        this.fullTextLines = i10 == 0 ? 2 : 1;
        this.fullTextShowLike = i11 == 1;
        setTitle(searchVideoCard.getTitle());
        setCover(searchVideoCard.getCover());
        if (searchVideoCard.hasRcmdReason()) {
            setRecommendReason(new BaseSearchItem.RecommendReason(searchVideoCard.getRcmdReason()));
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it4 = searchVideoCard.getThreePointList().iterator();
        while (it4.hasNext()) {
            arrayList4.add(new BaseSearchItem.ThreePointItem((ThreePoint) it4.next()));
        }
        if (!arrayList4.isEmpty()) {
            setThreePoints(arrayList4);
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it5 = searchVideoCard.getNewRecTagsList().iterator();
        while (it5.hasNext()) {
            arrayList5.add(new Tag((ReasonStyle) it5.next()));
        }
        if (!arrayList5.isEmpty()) {
            setNewRecTags(arrayList5);
        }
        if (searchVideoCard.hasShare()) {
            setShare(new BaseSearchItem.Share(searchVideoCard.getShare()));
        }
        if (searchVideoCard.hasCardBusinessBadge()) {
            setBusinessBadge(new CardBusinessBadge(searchVideoCard.getCardBusinessBadge()));
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it6 = searchVideoCard.getNewRecTagsV2List().iterator();
        while (it6.hasNext()) {
            arrayList6.add(new Tag((ReasonStyle) it6.next()));
        }
        if (!arrayList6.isEmpty()) {
            this.newRecTagsV2 = arrayList6;
        }
        if (searchVideoCard.hasFeedback()) {
            setFeedback(new BaseSearchItem.Feedback(searchVideoCard.getFeedback()));
        }
        if (searchVideoCard.hasFoldingTimeLine() && (searchVideoCard.getFoldingTimeLine().getHangStyleSinal() == 1 || searchVideoCard.getFoldingTimeLine().getHangStyleSinal() == 2)) {
            SearchTimeAxisItem searchTimeAxisItem = new SearchTimeAxisItem(searchVideoCard.getFoldingTimeLine());
            this.foldingTimeLine = searchTimeAxisItem;
            searchTimeAxisItem.setColor(1);
        }
        this.viewContent = searchVideoCard.getViewContent();
        this.iconType = searchVideoCard.getIconType();
        if (searchVideoCard.hasChargingLabel()) {
            this.chargeLabel = new C2784e(searchVideoCard.getChargingLabel());
        }
        List highlightTagsList = searchVideoCard.getHighlightTagsList();
        String strP = "";
        if (highlightTagsList != null) {
            strP = CollectionsKt.p(highlightTagsList, " ", (CharSequence) null, (CharSequence) null, (Function1) null, 62);
            if (strP == null) {
                strP = "";
            }
        }
        this.highlightTag = strP;
        this.tagHighlightOption = i7;
        if (searchVideoCard.hasCoverBadge()) {
            this.coverBadge = new Tag(searchVideoCard.getCoverBadge());
        }
        if (searchVideoCard.hasShortOgvInfo()) {
            this.shortOgvInfo = new IaaInfo(searchVideoCard.getShortOgvInfo());
        }
        this.face = searchVideoCard.getFace();
        setTranslatedTitle(searchVideoCard.getTranslatedTitle());
        setTranslatedStatus(searchVideoCard.getTranslationStatus());
    }

    public /* synthetic */ SearchVideoItem(SearchVideoCard searchVideoCard, int i7, boolean z6, int i8, int i9, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(searchVideoCard, i7, z6, (i12 & 8) != 0 ? 0 : i8, (i12 & 16) != 0 ? 0 : i9, (i12 & 32) != 0 ? 0 : i10, (i12 & 64) != 0 ? 0 : i11);
    }

    @Override // com.bilibili.search2.api.oversea.a
    @NotNull
    public /* bridge */ /* synthetic */ List getAllItems() {
        return super.getAllItems();
    }

    @Nullable
    public final String getArea() {
        return this.area;
    }

    @Nullable
    public final String getAuthor() {
        return this.author;
    }

    @Nullable
    public final String getAuthorPrefix() {
        return this.authorPrefix;
    }

    @Nullable
    public final List<Tag> getBadges() {
        return this.badges;
    }

    @Nullable
    public final List<Tag> getBadgesV2() {
        return this.badgesV2;
    }

    @Nullable
    public final C2784e getChargeLabel() {
        return this.chargeLabel;
    }

    public final boolean getComment43ExpEnable() {
        return this.comment43ExpEnable;
    }

    @Nullable
    public final Tag getCoverBadge() {
        return this.coverBadge;
    }

    public final long getDanmaku() {
        return this.danmaku;
    }

    @Nullable
    public final String getDesc() {
        return this.desc;
    }

    @Nullable
    public final String getDuration() {
        return this.duration;
    }

    @Nullable
    public final String getEventId() {
        return this.eventId;
    }

    @Nullable
    public final String getFace() {
        return this.face;
    }

    @Nullable
    public final SearchTimeAxisItem getFoldingTimeLine() {
        return this.foldingTimeLine;
    }

    @Nullable
    public final SearchVideoFullTextItem getFullText() {
        return this.fullText;
    }

    public final int getFullTextBackgroundType() {
        return this.fullTextBackgroundType;
    }

    public final int getFullTextLines() {
        return this.fullTextLines;
    }

    public final int getFullTextPrefix() {
        return this.fullTextPrefix;
    }

    public final boolean getFullTextShowLike() {
        return this.fullTextShowLike;
    }

    @NotNull
    public final String getHighlightTag() {
        return this.highlightTag;
    }

    public final int getIconType() {
        return this.iconType;
    }

    public final long getMid() {
        return this.mid;
    }

    @Nullable
    public final List<Tag> getNewRecTagsV2() {
        return this.newRecTagsV2;
    }

    public final long getPlay() {
        return this.play;
    }

    @Nullable
    public final List<Tag> getQualityTags() {
        return this.qualityTags;
    }

    @Nullable
    public final String getShareTitle() {
        return this.shareTitle;
    }

    @Nullable
    public final IaaInfo getShortOgvInfo() {
        return this.shortOgvInfo;
    }

    @Nullable
    public final String getShow_card_desc_1() {
        return this.show_card_desc_1;
    }

    @Nullable
    public final String getShow_card_desc_2() {
        return this.show_card_desc_2;
    }

    @Override // com.bilibili.search2.api.oversea.a
    @NotNull
    public List getSubItems() {
        return CollectionsKt.emptyList();
    }

    public final int getTagHighlightOption() {
        return this.tagHighlightOption;
    }

    @Override // com.bilibili.search2.api.oversea.a
    @NotNull
    public com.bilibili.search2.api.oversea.c getTranslateRequestParam() {
        TranslationBusiness translationBusiness = TranslationBusiness.TRANS_BIZ_ARC;
        String param = getParam();
        String str = param;
        if (param == null) {
            str = "";
        }
        return new com.bilibili.search2.api.oversea.c(translationBusiness, str);
    }

    @Nullable
    public final String getViewContent() {
        return this.viewContent;
    }

    public final boolean hasFullText() {
        SearchVideoFullTextItem searchVideoFullTextItem = this.fullText;
        return searchVideoFullTextItem != null && searchVideoFullTextItem.isValid();
    }

    public final boolean hasTimeAxis() {
        SearchTimeAxisItem searchTimeAxisItem = this.foldingTimeLine;
        boolean z6 = false;
        if (searchTimeAxisItem != null) {
            z6 = false;
            if (searchTimeAxisItem.isFoldingValid()) {
                z6 = true;
            }
        }
        return z6;
    }

    public final void setArea(@Nullable String str) {
        this.area = str;
    }

    public final void setAuthor(@Nullable String str) {
        this.author = str;
    }

    public final void setAuthorPrefix(@Nullable String str) {
        this.authorPrefix = str;
    }

    public final void setBadges(@Nullable List<? extends Tag> list) {
        this.badges = list;
    }

    public final void setBadgesV2(@Nullable List<? extends Tag> list) {
        this.badgesV2 = list;
    }

    public final void setChargeLabel(@Nullable C2784e c2784e) {
        this.chargeLabel = c2784e;
    }

    public final void setComment43ExpEnable(boolean z6) {
        this.comment43ExpEnable = z6;
    }

    public final void setCoverBadge(@Nullable Tag tag) {
        this.coverBadge = tag;
    }

    public final void setDanmaku(long j7) {
        this.danmaku = j7;
    }

    public final void setDesc(@Nullable String str) {
        this.desc = str;
    }

    public final void setDuration(@Nullable String str) {
        this.duration = str;
    }

    public final void setEventId(@Nullable String str) {
        this.eventId = str;
    }

    public final void setFace(@Nullable String str) {
        this.face = str;
    }

    public final void setFoldingTimeLine(@Nullable SearchTimeAxisItem searchTimeAxisItem) {
        this.foldingTimeLine = searchTimeAxisItem;
    }

    public final void setFullText(@Nullable SearchVideoFullTextItem searchVideoFullTextItem) {
        this.fullText = searchVideoFullTextItem;
    }

    public final void setFullTextBackgroundType(int i7) {
        this.fullTextBackgroundType = i7;
    }

    public final void setFullTextLines(int i7) {
        this.fullTextLines = i7;
    }

    public final void setFullTextPrefix(int i7) {
        this.fullTextPrefix = i7;
    }

    public final void setFullTextShowLike(boolean z6) {
        this.fullTextShowLike = z6;
    }

    public final void setHighlightTag(@NotNull String str) {
        this.highlightTag = str;
    }

    public final void setIconType(int i7) {
        this.iconType = i7;
    }

    public final void setMid(long j7) {
        this.mid = j7;
    }

    public final void setNewRecTagsV2(@Nullable List<? extends Tag> list) {
        this.newRecTagsV2 = list;
    }

    public final void setPlay(long j7) {
        this.play = j7;
    }

    public final void setQualityTags(@Nullable List<? extends Tag> list) {
        this.qualityTags = list;
    }

    public final void setShareTitle(@Nullable String str) {
        this.shareTitle = str;
    }

    public final void setShortOgvInfo(@Nullable IaaInfo iaaInfo) {
        this.shortOgvInfo = iaaInfo;
    }

    public final void setShow_card_desc_1(@Nullable String str) {
        this.show_card_desc_1 = str;
    }

    public final void setShow_card_desc_2(@Nullable String str) {
        this.show_card_desc_2 = str;
    }

    public final void setTagHighlightOption(int i7) {
        this.tagHighlightOption = i7;
    }

    public final void setViewContent(@Nullable String str) {
        this.viewContent = str;
    }

    public final boolean timeAxisTransparentBg() {
        boolean z6 = true;
        if (this.fullTextBackgroundType != 1) {
            z6 = false;
        }
        return z6;
    }
}
