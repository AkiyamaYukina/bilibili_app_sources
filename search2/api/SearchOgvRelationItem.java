package com.bilibili.search2.api;

import Ps0.C2782c;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.polymer.app.search.v1.CardLayout;
import com.bapis.bilibili.polymer.app.search.v1.SearchOgvRelationCard;
import dt0.InterfaceC6844g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchOgvRelationItem.class */
@StabilityInferred(parameters = 0)
@Keep
public final class SearchOgvRelationItem extends BaseSearchItem implements InterfaceC6844g {
    public static final int $stable = 8;

    @JSONField(name = "ogv_card_ui")
    @Nullable
    private TopGameUiData bgUI;

    @NotNull
    private C2782c cardLayoutUI;

    @JSONField(name = "is_new_style")
    private int isNewStyle;

    @JSONField(name = "more_search_type")
    private int moreSearchType;

    @JSONField(name = "more_text")
    @Nullable
    private String more_text;

    @JSONField(name = "more_url")
    @Nullable
    private String more_url;

    @JSONField(name = "sale_info")
    @Nullable
    private b saleInfo;

    @JSONField(name = "special_bg_color")
    @Nullable
    private String special_bg_color;

    @JSONField(name = "items")
    @Nullable
    private List<DetailsRelationItem> videos;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchOgvRelationItem$DetailsRelationItem.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class DetailsRelationItem extends BaseSearchItem {
        public static final int $stable = 8;

        @JSONField(name = "cover_left_text")
        @Nullable
        private String cover_left_text;

        @JSONField(name = "cover_left_text_v2")
        @Nullable
        private String cover_left_text_v2;

        @JSONField
        private int iconType;
        private int isNewStyle;

        @Nullable
        private String modulePos;

        @JSONField(name = "cover_badge_style")
        @Nullable
        private Tag ogvTag;

        @JSONField(name = "cover_badge_style_v2")
        @Nullable
        private Tag ogvTagV2;

        @JSONField(name = "view_content")
        @Nullable
        private String viewContent;

        public DetailsRelationItem(@NotNull com.bapis.bilibili.polymer.app.search.v1.DetailsRelationItem detailsRelationItem, @Nullable String str) {
            this.cover_left_text = detailsRelationItem.getCoverLeftText();
            this.modulePos = detailsRelationItem.getModulePos();
            if (detailsRelationItem.hasCoverBadgeStyle()) {
                this.ogvTag = new Tag(detailsRelationItem.getCoverBadgeStyle());
            }
            if (detailsRelationItem.hasCoverBadgeStyleV2()) {
                this.ogvTagV2 = new Tag(detailsRelationItem.getCoverBadgeStyleV2());
            }
            setTitle(detailsRelationItem.getTitle());
            setCover(detailsRelationItem.getCover());
            setGoTo(detailsRelationItem.getGoto());
            setParam(detailsRelationItem.getParam());
            setUri(detailsRelationItem.getUri());
            setServerPagePos(detailsRelationItem.getPosition());
            this.cover_left_text_v2 = detailsRelationItem.getCoverLeftTextV2();
            setTrackId(str);
            this.viewContent = detailsRelationItem.getViewContent();
            this.iconType = detailsRelationItem.getIconType();
        }

        @Override // com.bilibili.search2.api.BaseSearchItem
        @NotNull
        public BaseSearchItem cloneFatherParam(@NotNull BaseSearchItem baseSearchItem) {
            String subGoto = getSubGoto();
            String subGoto2 = subGoto;
            if (subGoto == null) {
                subGoto2 = baseSearchItem.getSubGoto();
            }
            setSubGoto(subGoto2);
            return super.cloneFatherParam(baseSearchItem);
        }

        @Nullable
        public final String getCover_left_text() {
            return this.cover_left_text;
        }

        @Nullable
        public final String getCover_left_text_v2() {
            return this.cover_left_text_v2;
        }

        public final int getIconType() {
            return this.iconType;
        }

        @Nullable
        public final String getModulePos() {
            return this.modulePos;
        }

        @Nullable
        public final Tag getOgvTag() {
            return this.ogvTag;
        }

        @Nullable
        public final Tag getOgvTagV2() {
            return this.ogvTagV2;
        }

        @Nullable
        public final String getViewContent() {
            return this.viewContent;
        }

        public final int isNewStyle() {
            return this.isNewStyle;
        }

        public final boolean isNewStyleExp() {
            int i7 = this.isNewStyle;
            boolean z6 = true;
            if (i7 != 1) {
                z6 = i7 == 2;
            }
            return z6;
        }

        public final void setCover_left_text(@Nullable String str) {
            this.cover_left_text = str;
        }

        public final void setCover_left_text_v2(@Nullable String str) {
            this.cover_left_text_v2 = str;
        }

        public final void setIconType(int i7) {
            this.iconType = i7;
        }

        public final void setModulePos(@Nullable String str) {
            this.modulePos = str;
        }

        public final void setNewStyle(int i7) {
            this.isNewStyle = i7;
        }

        public final void setOgvTag(@Nullable Tag tag) {
            this.ogvTag = tag;
        }

        public final void setOgvTagV2(@Nullable Tag tag) {
            this.ogvTagV2 = tag;
        }

        public final void setViewContent(@Nullable String str) {
            this.viewContent = str;
        }
    }

    public SearchOgvRelationItem() {
        this.cardLayoutUI = new C2782c(0);
    }

    public SearchOgvRelationItem(@NotNull SearchOgvRelationCard searchOgvRelationCard, @Nullable String str) {
        this.cardLayoutUI = new C2782c(0);
        this.special_bg_color = searchOgvRelationCard.getSpecialBgColor();
        this.more_text = searchOgvRelationCard.getMoreText();
        this.more_url = searchOgvRelationCard.getMoreUrl();
        ArrayList arrayList = new ArrayList();
        Iterator it = searchOgvRelationCard.getItemsList().iterator();
        while (it.hasNext()) {
            arrayList.add(new DetailsRelationItem((com.bapis.bilibili.polymer.app.search.v1.DetailsRelationItem) it.next(), str));
        }
        this.videos = arrayList;
        setTitle(searchOgvRelationCard.getTitle());
        setCover(searchOgvRelationCard.getCover());
        this.isNewStyle = searchOgvRelationCard.getIsNewStyle();
        if (searchOgvRelationCard.hasOgvCardUi()) {
            this.bgUI = new TopGameUiData(searchOgvRelationCard.getOgvCardUi());
        }
        this.moreSearchType = searchOgvRelationCard.getMoreSearchType();
        if (searchOgvRelationCard.hasCardLayout()) {
            CardLayout cardLayout = searchOgvRelationCard.getCardLayout();
            C2782c c2782c = new C2782c(0);
            c2782c.f19180a = cardLayout.getColumn();
            this.cardLayoutUI = c2782c;
        }
        if (searchOgvRelationCard.hasSaleInfo()) {
            this.saleInfo = new b(searchOgvRelationCard.getSaleInfo());
        }
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    public void afterInit() {
        super.afterInit();
        List<DetailsRelationItem> list = this.videos;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((DetailsRelationItem) it.next()).cloneFatherParam(this);
            }
        }
    }

    @Override // dt0.InterfaceC6844g
    public void deliverLocalPagePos(int i7) {
        List<DetailsRelationItem> list = this.videos;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((DetailsRelationItem) it.next()).setLocalPagePos(i7);
            }
        }
    }

    @Nullable
    public final TopGameUiData getBgUI() {
        return this.bgUI;
    }

    @NotNull
    public final C2782c getCardLayoutUI() {
        return this.cardLayoutUI;
    }

    public final int getMoreSearchType() {
        return this.moreSearchType;
    }

    @Nullable
    public final String getMore_text() {
        return this.more_text;
    }

    @Nullable
    public final String getMore_url() {
        return this.more_url;
    }

    @Nullable
    public final b getSaleInfo() {
        return this.saleInfo;
    }

    @Nullable
    public final String getSpecial_bg_color() {
        return this.special_bg_color;
    }

    @Nullable
    public final List<DetailsRelationItem> getVideos() {
        return this.videos;
    }

    public final int isNewStyle() {
        return this.isNewStyle;
    }

    public final boolean isNewStyleExp() {
        int i7 = this.isNewStyle;
        boolean z6 = true;
        if (i7 != 1) {
            z6 = i7 == 2;
        }
        return z6;
    }

    public final void setBgUI(@Nullable TopGameUiData topGameUiData) {
        this.bgUI = topGameUiData;
    }

    public final void setCardLayoutUI(@NotNull C2782c c2782c) {
        this.cardLayoutUI = c2782c;
    }

    public final void setMoreSearchType(int i7) {
        this.moreSearchType = i7;
    }

    public final void setMore_text(@Nullable String str) {
        this.more_text = str;
    }

    public final void setMore_url(@Nullable String str) {
        this.more_url = str;
    }

    public final void setNewStyle(int i7) {
        this.isNewStyle = i7;
    }

    public final void setSaleInfo(@Nullable b bVar) {
        this.saleInfo = bVar;
    }

    public final void setSpecial_bg_color(@Nullable String str) {
        this.special_bg_color = str;
    }

    public final void setVideos(@Nullable List<DetailsRelationItem> list) {
        this.videos = list;
    }
}
