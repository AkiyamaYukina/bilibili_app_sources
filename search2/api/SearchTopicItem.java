package com.bilibili.search2.api;

import Ps0.W;
import Ps0.X;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.O;
import androidx.room.B;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.polymer.app.search.v1.ReasonStyle;
import com.bapis.bilibili.polymer.app.search.v1.SearchSubjectCard;
import com.bapis.bilibili.polymer.app.search.v1.TopicItem;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.search2.api.BaseSearchItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchTopicItem.class */
@StabilityInferred(parameters = 0)
@Keep
public final class SearchTopicItem extends BaseSearchItem {
    public static final int $stable = 8;

    @JSONField(name = "badges")
    @Nullable
    private List<Tag> badges;

    @JSONField(name = "desc")
    @Nullable
    private String desc;

    @JSONField(name = "hot_text")
    @Nullable
    private String hotText;

    @JSONField(name = "id")
    @Nullable
    private Long id;

    @JSONField(name = "items")
    @Nullable
    private List<W> items;

    @JSONField(name = "more_text")
    @Nullable
    private String moreText;

    @JSONField(name = "more_url")
    @Nullable
    private String moreUrl;

    @JSONField(name = "topic_type")
    @Nullable
    private String topicType;

    @Nullable
    private X watchButton;

    public SearchTopicItem() {
        this(null, null, null, null, null, null, null, null, null, BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKY_RESULT_ROTATE, null);
    }

    public SearchTopicItem(@NotNull SearchSubjectCard searchSubjectCard) {
        this(null, null, null, null, null, null, null, null, null, BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKY_RESULT_ROTATE, null);
        ArrayList arrayList = new ArrayList();
        Iterator it = searchSubjectCard.getBadgesList().iterator();
        while (it.hasNext()) {
            arrayList.add(new Tag((ReasonStyle) it.next()));
        }
        if (!arrayList.isEmpty()) {
            this.badges = arrayList;
        }
        setCover(searchSubjectCard.getCover());
        setTitle(searchSubjectCard.getTitle());
        this.desc = searchSubjectCard.getDesc();
        this.hotText = searchSubjectCard.getHotText();
        this.id = Long.valueOf(searchSubjectCard.getId());
        this.moreText = searchSubjectCard.getMoreText();
        this.moreUrl = searchSubjectCard.getMoreUrl();
        this.topicType = searchSubjectCard.getTopicType();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = searchSubjectCard.getItemsList().iterator();
        while (it2.hasNext()) {
            arrayList2.add(new W((TopicItem) it2.next()));
        }
        if (!arrayList2.isEmpty()) {
            this.items = arrayList2;
        }
        if (searchSubjectCard.hasFeedback()) {
            setFeedback(new BaseSearchItem.Feedback(searchSubjectCard.getFeedback()));
        }
        if (searchSubjectCard.getButton() != null) {
            this.watchButton = new X(searchSubjectCard.getButton());
        }
    }

    public SearchTopicItem(@Nullable List<Tag> list, @Nullable String str, @Nullable String str2, @Nullable Long l7, @Nullable List<W> list2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable X x6) {
        this.badges = list;
        this.desc = str;
        this.hotText = str2;
        this.id = l7;
        this.items = list2;
        this.moreText = str3;
        this.moreUrl = str4;
        this.topicType = str5;
        this.watchButton = x6;
    }

    public /* synthetic */ SearchTopicItem(List list, String str, String str2, Long l7, List list2, String str3, String str4, String str5, X x6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : list, (i7 & 2) != 0 ? null : str, (i7 & 4) != 0 ? null : str2, (i7 & 8) != 0 ? 0L : l7, (i7 & 16) != 0 ? null : list2, (i7 & 32) != 0 ? null : str3, (i7 & 64) != 0 ? null : str4, (i7 & 128) != 0 ? null : str5, (i7 & 256) != 0 ? null : x6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchTopicItem copy$default(SearchTopicItem searchTopicItem, List list, String str, String str2, Long l7, List list2, String str3, String str4, String str5, X x6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            list = searchTopicItem.badges;
        }
        if ((i7 & 2) != 0) {
            str = searchTopicItem.desc;
        }
        if ((i7 & 4) != 0) {
            str2 = searchTopicItem.hotText;
        }
        if ((i7 & 8) != 0) {
            l7 = searchTopicItem.id;
        }
        if ((i7 & 16) != 0) {
            list2 = searchTopicItem.items;
        }
        if ((i7 & 32) != 0) {
            str3 = searchTopicItem.moreText;
        }
        if ((i7 & 64) != 0) {
            str4 = searchTopicItem.moreUrl;
        }
        if ((i7 & 128) != 0) {
            str5 = searchTopicItem.topicType;
        }
        if ((i7 & 256) != 0) {
            x6 = searchTopicItem.watchButton;
        }
        return searchTopicItem.copy(list, str, str2, l7, list2, str3, str4, str5, x6);
    }

    @Nullable
    public final List<Tag> component1() {
        return this.badges;
    }

    @Nullable
    public final String component2() {
        return this.desc;
    }

    @Nullable
    public final String component3() {
        return this.hotText;
    }

    @Nullable
    public final Long component4() {
        return this.id;
    }

    @Nullable
    public final List<W> component5() {
        return this.items;
    }

    @Nullable
    public final String component6() {
        return this.moreText;
    }

    @Nullable
    public final String component7() {
        return this.moreUrl;
    }

    @Nullable
    public final String component8() {
        return this.topicType;
    }

    @Nullable
    public final X component9() {
        return this.watchButton;
    }

    @NotNull
    public final SearchTopicItem copy(@Nullable List<Tag> list, @Nullable String str, @Nullable String str2, @Nullable Long l7, @Nullable List<W> list2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable X x6) {
        return new SearchTopicItem(list, str, str2, l7, list2, str3, str4, str5, x6);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchTopicItem)) {
            return false;
        }
        SearchTopicItem searchTopicItem = (SearchTopicItem) obj;
        return Intrinsics.areEqual(this.badges, searchTopicItem.badges) && Intrinsics.areEqual(this.desc, searchTopicItem.desc) && Intrinsics.areEqual(this.hotText, searchTopicItem.hotText) && Intrinsics.areEqual(this.id, searchTopicItem.id) && Intrinsics.areEqual(this.items, searchTopicItem.items) && Intrinsics.areEqual(this.moreText, searchTopicItem.moreText) && Intrinsics.areEqual(this.moreUrl, searchTopicItem.moreUrl) && Intrinsics.areEqual(this.topicType, searchTopicItem.topicType) && Intrinsics.areEqual(this.watchButton, searchTopicItem.watchButton);
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
    public final String getHotText() {
        return this.hotText;
    }

    @Nullable
    public final Long getId() {
        return this.id;
    }

    @Nullable
    public final List<W> getItems() {
        return this.items;
    }

    @Nullable
    public final String getMoreText() {
        return this.moreText;
    }

    @Nullable
    public final String getMoreUrl() {
        return this.moreUrl;
    }

    @NotNull
    public final String getTextType() {
        List<W> list = this.items;
        int iMin = 0;
        if (list != null) {
            if (list.isEmpty()) {
                iMin = 0;
            } else {
                List<W> list2 = this.items;
                int size = 0;
                if (list2 != null) {
                    size = list2.size();
                }
                iMin = Math.min(size, 2);
            }
        }
        return String.valueOf(iMin);
    }

    @Nullable
    public final String getTopicType() {
        return this.topicType;
    }

    @Nullable
    public final X getWatchButton() {
        return this.watchButton;
    }

    public int hashCode() {
        List<Tag> list = this.badges;
        int iHashCode = 0;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        String str = this.desc;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.hotText;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        Long l7 = this.id;
        int iHashCode5 = l7 == null ? 0 : l7.hashCode();
        List<W> list2 = this.items;
        int iHashCode6 = list2 == null ? 0 : list2.hashCode();
        String str3 = this.moreText;
        int iHashCode7 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.moreUrl;
        int iHashCode8 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.topicType;
        int iHashCode9 = str5 == null ? 0 : str5.hashCode();
        X x6 = this.watchButton;
        if (x6 != null) {
            iHashCode = x6.hashCode();
        }
        return (((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode;
    }

    public final void setBadges(@Nullable List<Tag> list) {
        this.badges = list;
    }

    public final void setDesc(@Nullable String str) {
        this.desc = str;
    }

    public final void setHotText(@Nullable String str) {
        this.hotText = str;
    }

    public final void setId(@Nullable Long l7) {
        this.id = l7;
    }

    public final void setItems(@Nullable List<W> list) {
        this.items = list;
    }

    public final void setMoreText(@Nullable String str) {
        this.moreText = str;
    }

    public final void setMoreUrl(@Nullable String str) {
        this.moreUrl = str;
    }

    public final void setTopicType(@Nullable String str) {
        this.topicType = str;
    }

    public final void setWatchButton(@Nullable X x6) {
        this.watchButton = x6;
    }

    @NotNull
    public String toString() {
        List<Tag> list = this.badges;
        String str = this.desc;
        String str2 = this.hotText;
        Long l7 = this.id;
        List<W> list2 = this.items;
        String str3 = this.moreText;
        String str4 = this.moreUrl;
        String str5 = this.topicType;
        X x6 = this.watchButton;
        StringBuilder sb = new StringBuilder("SearchTopicItem(badges=");
        sb.append(list);
        sb.append(", desc=");
        sb.append(str);
        sb.append(", hotText=");
        sb.append(str2);
        sb.append(", id=");
        sb.append(l7);
        sb.append(", items=");
        O.b(", moreText=", str3, ", moreUrl=", sb, list2);
        B.a(str4, ", topicType=", str5, ", watchButton=", sb);
        sb.append(x6);
        sb.append(")");
        return sb.toString();
    }
}
