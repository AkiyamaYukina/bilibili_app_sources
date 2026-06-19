package com.bilibili.search2.result.holder.chatgpt.api;

import Di0.C1600d;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.B;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.app.search.v2.GetChatAuthReply;
import com.bilibili.biligame.api.bean.gamedetail.GameDetailContent;
import com.bilibili.search2.api.BaseSearchItem;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/chatgpt/api/SearchChatAuthItem.class */
@StabilityInferred(parameters = 0)
@Keep
public final class SearchChatAuthItem extends BaseSearchItem {
    public static final int $stable = 8;

    @JSONField(name = "display")
    private boolean display;

    @JSONField(name = "icon")
    @Nullable
    private String icon;

    @JSONField(name = "icon_night")
    @Nullable
    private String iconNight;

    @JSONField(name = GameDetailContent.DetailInfo.UI_TYPE_JUMP_LINK)
    @Nullable
    private String jumpLink;

    @JSONField(name = "text_guide")
    @Nullable
    private String textGuide;

    public SearchChatAuthItem() {
        this(false, null, null, null, null, 31, null);
    }

    public SearchChatAuthItem(@NotNull GetChatAuthReply getChatAuthReply) {
        this(false, null, null, null, null, 31, null);
        this.display = getChatAuthReply.getDisplay();
        this.icon = getChatAuthReply.getIcon();
        this.iconNight = getChatAuthReply.getIconNight();
        this.jumpLink = getChatAuthReply.getJumpLink();
        this.textGuide = getChatAuthReply.getTextGuide();
    }

    public SearchChatAuthItem(boolean z6, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.display = z6;
        this.icon = str;
        this.iconNight = str2;
        this.jumpLink = str3;
        this.textGuide = str4;
    }

    public /* synthetic */ SearchChatAuthItem(boolean z6, String str, String str2, String str3, String str4, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? false : z6, (i7 & 2) != 0 ? null : str, (i7 & 4) != 0 ? null : str2, (i7 & 8) != 0 ? null : str3, (i7 & 16) != 0 ? null : str4);
    }

    public static /* synthetic */ SearchChatAuthItem copy$default(SearchChatAuthItem searchChatAuthItem, boolean z6, String str, String str2, String str3, String str4, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z6 = searchChatAuthItem.display;
        }
        if ((i7 & 2) != 0) {
            str = searchChatAuthItem.icon;
        }
        if ((i7 & 4) != 0) {
            str2 = searchChatAuthItem.iconNight;
        }
        if ((i7 & 8) != 0) {
            str3 = searchChatAuthItem.jumpLink;
        }
        if ((i7 & 16) != 0) {
            str4 = searchChatAuthItem.textGuide;
        }
        return searchChatAuthItem.copy(z6, str, str2, str3, str4);
    }

    public final boolean component1() {
        return this.display;
    }

    @Nullable
    public final String component2() {
        return this.icon;
    }

    @Nullable
    public final String component3() {
        return this.iconNight;
    }

    @Nullable
    public final String component4() {
        return this.jumpLink;
    }

    @Nullable
    public final String component5() {
        return this.textGuide;
    }

    @NotNull
    public final SearchChatAuthItem copy(boolean z6, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        return new SearchChatAuthItem(z6, str, str2, str3, str4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchChatAuthItem)) {
            return false;
        }
        SearchChatAuthItem searchChatAuthItem = (SearchChatAuthItem) obj;
        return this.display == searchChatAuthItem.display && Intrinsics.areEqual(this.icon, searchChatAuthItem.icon) && Intrinsics.areEqual(this.iconNight, searchChatAuthItem.iconNight) && Intrinsics.areEqual(this.jumpLink, searchChatAuthItem.jumpLink) && Intrinsics.areEqual(this.textGuide, searchChatAuthItem.textGuide);
    }

    public final boolean getDisplay() {
        return this.display;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final String getIconNight() {
        return this.iconNight;
    }

    @Nullable
    public final String getJumpLink() {
        return this.jumpLink;
    }

    @Nullable
    public final String getTextGuide() {
        return this.textGuide;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.display);
        String str = this.icon;
        int iHashCode2 = 0;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.iconNight;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.jumpLink;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.textGuide;
        if (str4 != null) {
            iHashCode2 = str4.hashCode();
        }
        return (((((((iHashCode * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode2;
    }

    public final void setDisplay(boolean z6) {
        this.display = z6;
    }

    public final void setIcon(@Nullable String str) {
        this.icon = str;
    }

    public final void setIconNight(@Nullable String str) {
        this.iconNight = str;
    }

    public final void setJumpLink(@Nullable String str) {
        this.jumpLink = str;
    }

    public final void setTextGuide(@Nullable String str) {
        this.textGuide = str;
    }

    @NotNull
    public String toString() {
        boolean z6 = this.display;
        String str = this.icon;
        String str2 = this.iconNight;
        String str3 = this.jumpLink;
        String str4 = this.textGuide;
        StringBuilder sbB = C1600d.b("SearchChatAuthItem(display=", ", icon=", str, ", iconNight=", z6);
        B.a(str2, ", jumpLink=", str3, ", textGuide=", sbB);
        return C8770a.a(sbB, str4, ")");
    }
}
