package com.bilibili.search2.api;

import Ps0.C2794o;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.polymer.app.search.v1.ReasonStyle;
import com.bapis.bilibili.polymer.app.search.v1.SearchSpecialCard;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchSpecialItem.class */
@StabilityInferred(parameters = 0)
@Keep
public final class SearchSpecialItem extends BaseSearchItem {
    public static final int $stable = 8;

    @JSONField(name = "badge")
    @Nullable
    private String badge;

    @JSONField(name = "desc")
    @Nullable
    private String desc;

    @JSONField(name = "new_rec_tags_v2")
    @Nullable
    private List<? extends Tag> newRecTagsV2;

    @Nullable
    private C2794o reserveInfo;

    public SearchSpecialItem() {
    }

    public SearchSpecialItem(@NotNull SearchSpecialCard searchSpecialCard) {
        this.badge = searchSpecialCard.getBadge();
        this.desc = searchSpecialCard.getDesc();
        setTitle(searchSpecialCard.getTitle());
        setCover(searchSpecialCard.getCover());
        ArrayList arrayList = new ArrayList();
        Iterator it = searchSpecialCard.getNewRecTagsList().iterator();
        while (it.hasNext()) {
            arrayList.add(new Tag((ReasonStyle) it.next()));
        }
        if (!arrayList.isEmpty()) {
            setNewRecTags(arrayList);
        }
        if (searchSpecialCard.hasCardBusinessBadge()) {
            setBusinessBadge(new CardBusinessBadge(searchSpecialCard.getCardBusinessBadge()));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = searchSpecialCard.getNewRecTagsV2List().iterator();
        while (it2.hasNext()) {
            arrayList2.add(new Tag((ReasonStyle) it2.next()));
        }
        if (!arrayList2.isEmpty()) {
            this.newRecTagsV2 = arrayList2;
        }
        if (searchSpecialCard.hasReserveInfo()) {
            this.reserveInfo = new C2794o(searchSpecialCard.getReserveInfo());
        }
    }

    @Nullable
    public final String getBadge() {
        return this.badge;
    }

    @Nullable
    public final String getDesc() {
        return this.desc;
    }

    @Nullable
    public final List<Tag> getNewRecTagsV2() {
        return this.newRecTagsV2;
    }

    @Nullable
    public final C2794o getReserveInfo() {
        return this.reserveInfo;
    }

    public final boolean hasOrderButton() {
        C2794o c2794o = this.reserveInfo;
        return (c2794o == null || TextUtils.isEmpty(c2794o.f19228b)) ? false : true;
    }

    public final void setBadge(@Nullable String str) {
        this.badge = str;
    }

    public final void setDesc(@Nullable String str) {
        this.desc = str;
    }

    public final void setNewRecTagsV2(@Nullable List<? extends Tag> list) {
        this.newRecTagsV2 = list;
    }

    public final void setReserveInfo(@Nullable C2794o c2794o) {
        this.reserveInfo = c2794o;
    }
}
