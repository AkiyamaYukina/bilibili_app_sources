package com.bilibili.search2.result.holder.chatgpt.api;

import androidx.annotation.Keep;
import androidx.compose.animation.C3353d;
import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.O;
import androidx.room.B;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.broadcast.message.main.ChatResult;
import com.bapis.bilibili.polymer.app.search.v1.SearchChatGPTCard;
import com.bapis.bilibili.polymer.app.search.v1.SearchQACard;
import com.bilibili.lib.sharewrapper.basic.ThirdPartyExtraBuilder;
import com.bilibili.search2.api.BaseSearchItem;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/chatgpt/api/SearchChatGptItem.class */
@StabilityInferred(parameters = 0)
@Keep
public final class SearchChatGptItem extends BaseSearchItem {
    public static final int $stable = 8;

    @JSONField(name = "auto_expand")
    private boolean autoExpand;

    @JSONField(name = "background_light")
    @Nullable
    private String backgroundLight;

    @JSONField(name = "background_night")
    @Nullable
    private String backgroundNight;

    @JSONField(name = "beta_text")
    @Nullable
    private String betaText;

    @JSONField(name = "beta_text_color")
    @Nullable
    private BaseSearchItem.Colors betaTextColor;

    @JSONField(name = ThirdPartyExtraBuilder.KEY_RESULT)
    @Nullable
    private SearchChatResultItem chatResultItem;
    private int currentState;

    @JSONField(name = "disclaimer")
    @Nullable
    private Disclaimers disclaimer;

    @JSONField(name = "loading_icon_light")
    @Nullable
    private List<String> loadingIconLight;

    @JSONField(name = "loading_icon_night")
    @Nullable
    private List<String> loadingIconNight;

    @JSONField(name = "session_id")
    @Nullable
    private String sessionId;
    private int timeAbnormal;
    private boolean waitTimeout;

    public SearchChatGptItem() {
        this(null, null, null, null, null, null, null, null, false, 0, false, 0, null, 8191, null);
    }

    public SearchChatGptItem(@NotNull SearchChatGPTCard searchChatGPTCard) {
        this(null, null, null, null, null, null, null, null, false, 0, false, 0, null, 8191, null);
        this.sessionId = searchChatGPTCard.getSessionId();
        this.loadingIconLight = searchChatGPTCard.getLoadingIconLightList();
        this.loadingIconNight = searchChatGPTCard.getLoadingIconNightList();
        this.backgroundLight = searchChatGPTCard.getBackgroundLight();
        this.backgroundNight = searchChatGPTCard.getBackgroundNight();
        this.betaText = searchChatGPTCard.getBetaText();
        if (searchChatGPTCard.hasBetaTextColor()) {
            this.betaTextColor = new BaseSearchItem.Colors(searchChatGPTCard.getBetaTextColor());
        }
        if (searchChatGPTCard.hasDisclaimer()) {
            Disclaimers disclaimers = new Disclaimers(searchChatGPTCard.getDisclaimer());
            List<String> list = this.loadingIconLight;
            disclaimers.f87977c = list != null ? (String) CollectionsKt.getOrNull(list, 4) : null;
            List<String> list2 = this.loadingIconNight;
            disclaimers.f87978d = list2 != null ? (String) CollectionsKt.getOrNull(list2, 4) : null;
            this.disclaimer = disclaimers;
        }
        setTitle(searchChatGPTCard.getTitle());
        this.autoExpand = searchChatGPTCard.getAutoExpand();
        if (searchChatGPTCard.hasFeedback()) {
            setFeedback(new BaseSearchItem.Feedback(searchChatGPTCard.getFeedback()));
        }
    }

    public SearchChatGptItem(@NotNull SearchQACard searchQACard) {
        this(null, null, null, null, null, null, null, null, false, 0, false, 0, null, 8191, null);
        this.sessionId = searchQACard.getSessionId();
        this.loadingIconLight = searchQACard.getLoadingIconLightList();
        this.loadingIconNight = searchQACard.getLoadingIconNightList();
        this.backgroundLight = searchQACard.getBackgroundLight();
        this.backgroundNight = searchQACard.getBackgroundNight();
        this.betaText = searchQACard.getBetaText();
        if (searchQACard.hasBetaTextColor()) {
            this.betaTextColor = new BaseSearchItem.Colors(searchQACard.getBetaTextColor());
        }
        if (searchQACard.hasDisclaimer()) {
            Disclaimers disclaimers = new Disclaimers(searchQACard.getDisclaimer());
            List<String> list = this.loadingIconLight;
            disclaimers.f87977c = list != null ? (String) CollectionsKt.getOrNull(list, 4) : null;
            List<String> list2 = this.loadingIconNight;
            disclaimers.f87978d = list2 != null ? (String) CollectionsKt.getOrNull(list2, 4) : null;
            this.disclaimer = disclaimers;
        }
        setTitle(searchQACard.getTitle());
        this.autoExpand = searchQACard.getAutoExpand();
        ChatResult result = searchQACard.getResult();
        this.chatResultItem = result != null ? new SearchChatResultItem(result) : null;
        this.currentState = 2;
        if (searchQACard.hasFeedback()) {
            setFeedback(new BaseSearchItem.Feedback(searchQACard.getFeedback()));
        }
    }

    public SearchChatGptItem(@Nullable String str, @Nullable List<String> list, @Nullable List<String> list2, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable BaseSearchItem.Colors colors, @Nullable Disclaimers disclaimers, boolean z6, int i7, boolean z7, int i8, @Nullable SearchChatResultItem searchChatResultItem) {
        this.sessionId = str;
        this.loadingIconLight = list;
        this.loadingIconNight = list2;
        this.backgroundLight = str2;
        this.backgroundNight = str3;
        this.betaText = str4;
        this.betaTextColor = colors;
        this.disclaimer = disclaimers;
        this.autoExpand = z6;
        this.currentState = i7;
        this.waitTimeout = z7;
        this.timeAbnormal = i8;
        this.chatResultItem = searchChatResultItem;
    }

    public /* synthetic */ SearchChatGptItem(String str, List list, List list2, String str2, String str3, String str4, BaseSearchItem.Colors colors, Disclaimers disclaimers, boolean z6, int i7, boolean z7, int i8, SearchChatResultItem searchChatResultItem, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? null : str, (i9 & 2) != 0 ? null : list, (i9 & 4) != 0 ? null : list2, (i9 & 8) != 0 ? null : str2, (i9 & 16) != 0 ? null : str3, (i9 & 32) != 0 ? null : str4, (i9 & 64) != 0 ? null : colors, (i9 & 128) != 0 ? null : disclaimers, (i9 & 256) != 0 ? false : z6, (i9 & 512) != 0 ? 0 : i7, (i9 & 1024) != 0 ? false : z7, (i9 & 2048) != 0 ? 2 : i8, (i9 & 4096) != 0 ? null : searchChatResultItem);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchChatGptItem copy$default(SearchChatGptItem searchChatGptItem, String str, List list, List list2, String str2, String str3, String str4, BaseSearchItem.Colors colors, Disclaimers disclaimers, boolean z6, int i7, boolean z7, int i8, SearchChatResultItem searchChatResultItem, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = searchChatGptItem.sessionId;
        }
        if ((i9 & 2) != 0) {
            list = searchChatGptItem.loadingIconLight;
        }
        if ((i9 & 4) != 0) {
            list2 = searchChatGptItem.loadingIconNight;
        }
        if ((i9 & 8) != 0) {
            str2 = searchChatGptItem.backgroundLight;
        }
        if ((i9 & 16) != 0) {
            str3 = searchChatGptItem.backgroundNight;
        }
        if ((i9 & 32) != 0) {
            str4 = searchChatGptItem.betaText;
        }
        if ((i9 & 64) != 0) {
            colors = searchChatGptItem.betaTextColor;
        }
        if ((i9 & 128) != 0) {
            disclaimers = searchChatGptItem.disclaimer;
        }
        if ((i9 & 256) != 0) {
            z6 = searchChatGptItem.autoExpand;
        }
        if ((i9 & 512) != 0) {
            i7 = searchChatGptItem.currentState;
        }
        if ((i9 & 1024) != 0) {
            z7 = searchChatGptItem.waitTimeout;
        }
        if ((i9 & 2048) != 0) {
            i8 = searchChatGptItem.timeAbnormal;
        }
        if ((i9 & 4096) != 0) {
            searchChatResultItem = searchChatGptItem.chatResultItem;
        }
        return searchChatGptItem.copy(str, list, list2, str2, str3, str4, colors, disclaimers, z6, i7, z7, i8, searchChatResultItem);
    }

    @Nullable
    public final String component1() {
        return this.sessionId;
    }

    public final int component10() {
        return this.currentState;
    }

    public final boolean component11() {
        return this.waitTimeout;
    }

    public final int component12() {
        return this.timeAbnormal;
    }

    @Nullable
    public final SearchChatResultItem component13() {
        return this.chatResultItem;
    }

    @Nullable
    public final List<String> component2() {
        return this.loadingIconLight;
    }

    @Nullable
    public final List<String> component3() {
        return this.loadingIconNight;
    }

    @Nullable
    public final String component4() {
        return this.backgroundLight;
    }

    @Nullable
    public final String component5() {
        return this.backgroundNight;
    }

    @Nullable
    public final String component6() {
        return this.betaText;
    }

    @Nullable
    public final BaseSearchItem.Colors component7() {
        return this.betaTextColor;
    }

    @Nullable
    public final Disclaimers component8() {
        return this.disclaimer;
    }

    public final boolean component9() {
        return this.autoExpand;
    }

    @NotNull
    public final SearchChatGptItem copy(@Nullable String str, @Nullable List<String> list, @Nullable List<String> list2, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable BaseSearchItem.Colors colors, @Nullable Disclaimers disclaimers, boolean z6, int i7, boolean z7, int i8, @Nullable SearchChatResultItem searchChatResultItem) {
        return new SearchChatGptItem(str, list, list2, str2, str3, str4, colors, disclaimers, z6, i7, z7, i8, searchChatResultItem);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchChatGptItem)) {
            return false;
        }
        SearchChatGptItem searchChatGptItem = (SearchChatGptItem) obj;
        return Intrinsics.areEqual(this.sessionId, searchChatGptItem.sessionId) && Intrinsics.areEqual(this.loadingIconLight, searchChatGptItem.loadingIconLight) && Intrinsics.areEqual(this.loadingIconNight, searchChatGptItem.loadingIconNight) && Intrinsics.areEqual(this.backgroundLight, searchChatGptItem.backgroundLight) && Intrinsics.areEqual(this.backgroundNight, searchChatGptItem.backgroundNight) && Intrinsics.areEqual(this.betaText, searchChatGptItem.betaText) && Intrinsics.areEqual(this.betaTextColor, searchChatGptItem.betaTextColor) && Intrinsics.areEqual(this.disclaimer, searchChatGptItem.disclaimer) && this.autoExpand == searchChatGptItem.autoExpand && this.currentState == searchChatGptItem.currentState && this.waitTimeout == searchChatGptItem.waitTimeout && this.timeAbnormal == searchChatGptItem.timeAbnormal && Intrinsics.areEqual(this.chatResultItem, searchChatGptItem.chatResultItem);
    }

    public final boolean getAutoExpand() {
        return this.autoExpand;
    }

    @Nullable
    public final String getBackgroundLight() {
        return this.backgroundLight;
    }

    @Nullable
    public final String getBackgroundNight() {
        return this.backgroundNight;
    }

    @Nullable
    public final String getBetaText() {
        return this.betaText;
    }

    @Nullable
    public final BaseSearchItem.Colors getBetaTextColor() {
        return this.betaTextColor;
    }

    @Nullable
    public final SearchChatResultItem getChatResultItem() {
        return this.chatResultItem;
    }

    public final int getCurrentState() {
        return this.currentState;
    }

    @Nullable
    public final Disclaimers getDisclaimer() {
        return this.disclaimer;
    }

    @Nullable
    public final String getLoadingIcon(boolean z6, int i7) {
        String str;
        int size = 0;
        if (z6) {
            List<String> list = this.loadingIconNight;
            int size2 = 0;
            if (list != null) {
                size2 = list.size();
            }
            str = null;
            if (size2 > i7) {
                List<String> list2 = this.loadingIconNight;
                str = null;
                if (list2 != null) {
                    str = list2.get(i7);
                }
            }
        } else {
            List<String> list3 = this.loadingIconLight;
            if (list3 != null) {
                size = list3.size();
            }
            str = null;
            if (size > i7) {
                List<String> list4 = this.loadingIconLight;
                str = null;
                if (list4 != null) {
                    str = list4.get(i7);
                }
            }
        }
        return str;
    }

    @Nullable
    public final List<String> getLoadingIconLight() {
        return this.loadingIconLight;
    }

    @Nullable
    public final List<String> getLoadingIconNight() {
        return this.loadingIconNight;
    }

    @Nullable
    public final String getSessionId() {
        return this.sessionId;
    }

    public final int getTimeAbnormal() {
        return this.timeAbnormal;
    }

    public final boolean getWaitTimeout() {
        return this.waitTimeout;
    }

    public int hashCode() {
        String str = this.sessionId;
        int iHashCode = str == null ? 0 : str.hashCode();
        List<String> list = this.loadingIconLight;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        List<String> list2 = this.loadingIconNight;
        int iHashCode3 = list2 == null ? 0 : list2.hashCode();
        String str2 = this.backgroundLight;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.backgroundNight;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.betaText;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        BaseSearchItem.Colors colors = this.betaTextColor;
        int iHashCode7 = colors == null ? 0 : colors.hashCode();
        Disclaimers disclaimers = this.disclaimer;
        int iA = I.a(this.timeAbnormal, z.a(I.a(this.currentState, z.a(((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (disclaimers == null ? 0 : disclaimers.hashCode())) * 31, 31, this.autoExpand), 31), 31, this.waitTimeout), 31);
        SearchChatResultItem searchChatResultItem = this.chatResultItem;
        return iA + (searchChatResultItem == null ? 0 : searchChatResultItem.hashCode());
    }

    public final boolean isCanLoad() {
        int i7 = this.currentState;
        boolean z6 = true;
        if (i7 == 1 || i7 == 4) {
            z6 = false;
        }
        return z6;
    }

    public final void setAutoExpand(boolean z6) {
        this.autoExpand = z6;
    }

    public final void setBackgroundLight(@Nullable String str) {
        this.backgroundLight = str;
    }

    public final void setBackgroundNight(@Nullable String str) {
        this.backgroundNight = str;
    }

    public final void setBetaText(@Nullable String str) {
        this.betaText = str;
    }

    public final void setBetaTextColor(@Nullable BaseSearchItem.Colors colors) {
        this.betaTextColor = colors;
    }

    public final void setChatResultItem(@Nullable SearchChatResultItem searchChatResultItem) {
        this.chatResultItem = searchChatResultItem;
    }

    public final void setCurrentState(int i7) {
        this.currentState = i7;
    }

    public final void setDisclaimer(@Nullable Disclaimers disclaimers) {
        this.disclaimer = disclaimers;
    }

    public final void setLoadingIconLight(@Nullable List<String> list) {
        this.loadingIconLight = list;
    }

    public final void setLoadingIconNight(@Nullable List<String> list) {
        this.loadingIconNight = list;
    }

    public final void setSessionId(@Nullable String str) {
        this.sessionId = str;
    }

    public final void setTimeAbnormal(int i7) {
        this.timeAbnormal = i7;
    }

    public final void setWaitTimeout(boolean z6) {
        this.waitTimeout = z6;
    }

    @NotNull
    public String toString() {
        String str = this.sessionId;
        List<String> list = this.loadingIconLight;
        List<String> list2 = this.loadingIconNight;
        String str2 = this.backgroundLight;
        String str3 = this.backgroundNight;
        String str4 = this.betaText;
        BaseSearchItem.Colors colors = this.betaTextColor;
        Disclaimers disclaimers = this.disclaimer;
        boolean z6 = this.autoExpand;
        int i7 = this.currentState;
        boolean z7 = this.waitTimeout;
        int i8 = this.timeAbnormal;
        SearchChatResultItem searchChatResultItem = this.chatResultItem;
        StringBuilder sbB = I01.b.b("SearchChatGptItem(sessionId=", str, ", loadingIconLight=", ", loadingIconNight=", list);
        O.b(", backgroundLight=", str2, ", backgroundNight=", sbB, list2);
        B.a(str3, ", betaText=", str4, ", betaTextColor=", sbB);
        sbB.append(colors);
        sbB.append(", disclaimer=");
        sbB.append(disclaimers);
        sbB.append(", autoExpand=");
        C3353d.b(", currentState=", ", waitTimeout=", i7, z6, sbB);
        C3353d.b(", timeAbnormal=", ", chatResultItem=", i8, z7, sbB);
        sbB.append(searchChatResultItem);
        sbB.append(")");
        return sbB.toString();
    }
}
