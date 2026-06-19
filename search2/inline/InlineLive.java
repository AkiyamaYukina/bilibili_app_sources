package com.bilibili.search2.inline;

import androidx.annotation.Keep;
import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.GravityCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.media3.exoplayer.C4690e;
import androidx.paging.M;
import androidx.room.B;
import cf.n;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.app.translation.v1.TranslationBusiness;
import com.bapis.bilibili.polymer.app.search.v1.SearchInlineData;
import com.bilibili.ad.adview.liveroom.answer.fragment.vm.v;
import com.bilibili.app.comm.list.common.api.model.PlayerArgs;
import com.bilibili.app.comm.list.common.data.InlineThreePointPanel;
import com.bilibili.app.comm.list.common.data.SharePlane;
import com.bilibili.app.comm.list.common.inline.view.RightTopLiveBadge;
import com.bilibili.search2.api.oversea.a;
import com.bilibili.search2.api.oversea.c;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/inline/InlineLive.class */
@StabilityInferred(parameters = 0)
@Keep
public final class InlineLive implements a {
    public static final int $stable = 8;

    @JSONField(name = "args")
    @Nullable
    private Args args;

    @JSONField(name = "avatar")
    @Nullable
    private Avatar avatar;

    @JSONField(name = "can_play")
    private int canPlay;

    @JSONField(name = "card_goto")
    @Nullable
    private String cardGoto;

    @JSONField(name = "card_type")
    @Nullable
    private String cardType;

    @JSONField(name = "cover")
    @Nullable
    private String cover;

    @JSONField(name = "cover_left_icon_1")
    private int coverLeftIcon1;

    @JSONField(name = "cover_left_text_1")
    @Nullable
    private String coverLeftText1;

    @JSONField(name = "cover_left_text_2")
    @Nullable
    private String coverLeftText2;

    @JSONField(name = "disable_danmu")
    private boolean disableDanmaku;

    /* JADX INFO: renamed from: goto, reason: not valid java name */
    @JSONField(name = "goto")
    @Nullable
    private String f38goto;

    @JSONField(name = "hide_danmu_switch")
    private boolean hideDanmakuSwitch;

    @JSONField(name = "is_atten")
    private boolean isAtten;

    @JSONField(name = "official_icon")
    private int officialIcon;

    @JSONField(name = "official_icon_v2")
    private int officialIconV2;

    @JSONField(name = "param")
    @Nullable
    private String param;

    @JSONField(name = "player_args")
    @Nullable
    private PlayerArgs playerArgs;

    @JSONField(name = "right_top_live_badge")
    @Nullable
    private RightTopLiveBadge rightTopLiveBadge;

    @JSONField(name = "share_plane")
    @Nullable
    private SharePlane sharePlane;

    @JSONField(name = "three_point_meta")
    @Nullable
    private InlineThreePointPanel threePointMeta;

    @JSONField(name = "title")
    @Nullable
    private String title;

    @JSONField(name = "traffic_config")
    @Nullable
    private TrafficConfig trafficConfig;

    @JSONField(name = "translated_status")
    private long translatedStatus;

    @JSONField(name = "translated_title")
    @Nullable
    private String translatedTitle;

    @JSONField(name = EditCustomizeSticker.TAG_URI)
    @Nullable
    private String uri;

    public InlineLive() {
        this(null, null, 0, null, null, null, 0, null, null, null, 0, 0, null, null, null, null, null, 0L, null, false, null, null, null, false, false, 33554431, null);
    }

    public InlineLive(@NotNull SearchInlineData searchInlineData) {
        this(null, null, 0, null, null, null, 0, null, null, null, 0, 0, null, null, null, null, null, 0L, null, false, null, null, null, false, false, 33554431, null);
        if (searchInlineData.hasArgs()) {
            this.args = new Args(searchInlineData.getArgs());
        }
        if (searchInlineData.hasAvatar()) {
            this.avatar = new Avatar(searchInlineData.getAvatar());
        }
        this.canPlay = searchInlineData.getCanPlay();
        this.cardGoto = searchInlineData.getCardGoto();
        this.cardType = searchInlineData.getCardType();
        this.cover = searchInlineData.getCover();
        this.coverLeftIcon1 = searchInlineData.getCoverLeftIcon1();
        this.coverLeftText1 = searchInlineData.getCoverLeftText1();
        this.coverLeftText2 = searchInlineData.getCoverLeftText2();
        this.f38goto = searchInlineData.getGoto();
        this.officialIcon = searchInlineData.getOfficialIcon();
        this.officialIconV2 = searchInlineData.getOfficialIconV2();
        this.param = searchInlineData.getParam();
        if (searchInlineData.hasPlayerArgs()) {
            this.playerArgs = new PlayerArgs(searchInlineData.getPlayerArgs());
        }
        if (searchInlineData.hasRightTopLiveBadge()) {
            this.rightTopLiveBadge = new RightTopLiveBadge(searchInlineData.getRightTopLiveBadge());
        }
        setTitle(searchInlineData.getTitle());
        this.uri = searchInlineData.getUri();
        this.isAtten = searchInlineData.getIsAtten();
        if (searchInlineData.hasTrafficConfig()) {
            this.trafficConfig = new TrafficConfig(searchInlineData.getTrafficConfig());
        }
        if (searchInlineData.hasThreePointMeta()) {
            this.threePointMeta = new InlineThreePointPanel(searchInlineData.getThreePointMeta());
        }
        if (searchInlineData.hasSharePlane()) {
            this.sharePlane = new SharePlane(searchInlineData.getSharePlane());
        }
        setTranslatedTitle(searchInlineData.getTranslatedTitle());
        this.disableDanmaku = searchInlineData.getDisableDanmaku();
        this.hideDanmakuSwitch = searchInlineData.getHideDanmakuSwitch();
    }

    public InlineLive(@Nullable Args args, @Nullable Avatar avatar, int i7, @Nullable String str, @Nullable String str2, @Nullable String str3, int i8, @Nullable String str4, @Nullable String str5, @Nullable String str6, int i9, int i10, @Nullable String str7, @Nullable PlayerArgs playerArgs, @Nullable RightTopLiveBadge rightTopLiveBadge, @Nullable String str8, @Nullable String str9, long j7, @Nullable String str10, boolean z6, @Nullable TrafficConfig trafficConfig, @Nullable InlineThreePointPanel inlineThreePointPanel, @Nullable SharePlane sharePlane, boolean z7, boolean z8) {
        this.args = args;
        this.avatar = avatar;
        this.canPlay = i7;
        this.cardGoto = str;
        this.cardType = str2;
        this.cover = str3;
        this.coverLeftIcon1 = i8;
        this.coverLeftText1 = str4;
        this.coverLeftText2 = str5;
        this.f38goto = str6;
        this.officialIcon = i9;
        this.officialIconV2 = i10;
        this.param = str7;
        this.playerArgs = playerArgs;
        this.rightTopLiveBadge = rightTopLiveBadge;
        this.title = str8;
        this.translatedTitle = str9;
        this.translatedStatus = j7;
        this.uri = str10;
        this.isAtten = z6;
        this.trafficConfig = trafficConfig;
        this.threePointMeta = inlineThreePointPanel;
        this.sharePlane = sharePlane;
        this.disableDanmaku = z7;
        this.hideDanmakuSwitch = z8;
    }

    public /* synthetic */ InlineLive(Args args, Avatar avatar, int i7, String str, String str2, String str3, int i8, String str4, String str5, String str6, int i9, int i10, String str7, PlayerArgs playerArgs, RightTopLiveBadge rightTopLiveBadge, String str8, String str9, long j7, String str10, boolean z6, TrafficConfig trafficConfig, InlineThreePointPanel inlineThreePointPanel, SharePlane sharePlane, boolean z7, boolean z8, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : args, (i11 & 2) != 0 ? null : avatar, (i11 & 4) != 0 ? 0 : i7, (i11 & 8) != 0 ? null : str, (i11 & 16) != 0 ? null : str2, (i11 & 32) != 0 ? null : str3, (i11 & 64) != 0 ? 0 : i8, (i11 & 128) != 0 ? null : str4, (i11 & 256) != 0 ? null : str5, (i11 & 512) != 0 ? null : str6, (i11 & 1024) != 0 ? 0 : i9, (i11 & 2048) != 0 ? 0 : i10, (i11 & 4096) != 0 ? null : str7, (i11 & 8192) != 0 ? null : playerArgs, (i11 & 16384) != 0 ? null : rightTopLiveBadge, (i11 & 32768) != 0 ? null : str8, (i11 & 65536) != 0 ? null : str9, (i11 & 131072) != 0 ? 0L : j7, (i11 & 262144) != 0 ? null : str10, (i11 & AccessibilityNodeInfoCompat.ACTION_COLLAPSE) != 0 ? false : z6, (i11 & AccessibilityNodeInfoCompat.ACTION_DISMISS) != 0 ? null : trafficConfig, (i11 & AccessibilityNodeInfoCompat.ACTION_SET_TEXT) != 0 ? null : inlineThreePointPanel, (i11 & 4194304) != 0 ? null : sharePlane, (i11 & GravityCompat.RELATIVE_LAYOUT_DIRECTION) != 0 ? false : z7, (i11 & 16777216) != 0 ? false : z8);
    }

    public static /* synthetic */ InlineLive copy$default(InlineLive inlineLive, Args args, Avatar avatar, int i7, String str, String str2, String str3, int i8, String str4, String str5, String str6, int i9, int i10, String str7, PlayerArgs playerArgs, RightTopLiveBadge rightTopLiveBadge, String str8, String str9, long j7, String str10, boolean z6, TrafficConfig trafficConfig, InlineThreePointPanel inlineThreePointPanel, SharePlane sharePlane, boolean z7, boolean z8, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            args = inlineLive.args;
        }
        if ((i11 & 2) != 0) {
            avatar = inlineLive.avatar;
        }
        if ((i11 & 4) != 0) {
            i7 = inlineLive.canPlay;
        }
        if ((i11 & 8) != 0) {
            str = inlineLive.cardGoto;
        }
        if ((i11 & 16) != 0) {
            str2 = inlineLive.cardType;
        }
        if ((i11 & 32) != 0) {
            str3 = inlineLive.cover;
        }
        if ((i11 & 64) != 0) {
            i8 = inlineLive.coverLeftIcon1;
        }
        if ((i11 & 128) != 0) {
            str4 = inlineLive.coverLeftText1;
        }
        if ((i11 & 256) != 0) {
            str5 = inlineLive.coverLeftText2;
        }
        if ((i11 & 512) != 0) {
            str6 = inlineLive.f38goto;
        }
        if ((i11 & 1024) != 0) {
            i9 = inlineLive.officialIcon;
        }
        if ((i11 & 2048) != 0) {
            i10 = inlineLive.officialIconV2;
        }
        if ((i11 & 4096) != 0) {
            str7 = inlineLive.param;
        }
        if ((i11 & 8192) != 0) {
            playerArgs = inlineLive.playerArgs;
        }
        if ((i11 & 16384) != 0) {
            rightTopLiveBadge = inlineLive.rightTopLiveBadge;
        }
        if ((i11 & 32768) != 0) {
            str8 = inlineLive.title;
        }
        if ((i11 & 65536) != 0) {
            str9 = inlineLive.translatedTitle;
        }
        if ((i11 & 131072) != 0) {
            j7 = inlineLive.translatedStatus;
        }
        if ((i11 & 262144) != 0) {
            str10 = inlineLive.uri;
        }
        if ((524288 & i11) != 0) {
            z6 = inlineLive.isAtten;
        }
        if ((i11 & AccessibilityNodeInfoCompat.ACTION_DISMISS) != 0) {
            trafficConfig = inlineLive.trafficConfig;
        }
        if ((i11 & AccessibilityNodeInfoCompat.ACTION_SET_TEXT) != 0) {
            inlineThreePointPanel = inlineLive.threePointMeta;
        }
        if ((i11 & 4194304) != 0) {
            sharePlane = inlineLive.sharePlane;
        }
        if ((i11 & GravityCompat.RELATIVE_LAYOUT_DIRECTION) != 0) {
            z7 = inlineLive.disableDanmaku;
        }
        if ((i11 & 16777216) != 0) {
            z8 = inlineLive.hideDanmakuSwitch;
        }
        return inlineLive.copy(args, avatar, i7, str, str2, str3, i8, str4, str5, str6, i9, i10, str7, playerArgs, rightTopLiveBadge, str8, str9, j7, str10, z6, trafficConfig, inlineThreePointPanel, sharePlane, z7, z8);
    }

    @Nullable
    public final Args component1() {
        return this.args;
    }

    @Nullable
    public final String component10() {
        return this.f38goto;
    }

    public final int component11() {
        return this.officialIcon;
    }

    public final int component12() {
        return this.officialIconV2;
    }

    @Nullable
    public final String component13() {
        return this.param;
    }

    @Nullable
    public final PlayerArgs component14() {
        return this.playerArgs;
    }

    @Nullable
    public final RightTopLiveBadge component15() {
        return this.rightTopLiveBadge;
    }

    @Nullable
    public final String component16() {
        return this.title;
    }

    @Nullable
    public final String component17() {
        return this.translatedTitle;
    }

    public final long component18() {
        return this.translatedStatus;
    }

    @Nullable
    public final String component19() {
        return this.uri;
    }

    @Nullable
    public final Avatar component2() {
        return this.avatar;
    }

    public final boolean component20() {
        return this.isAtten;
    }

    @Nullable
    public final TrafficConfig component21() {
        return this.trafficConfig;
    }

    @Nullable
    public final InlineThreePointPanel component22() {
        return this.threePointMeta;
    }

    @Nullable
    public final SharePlane component23() {
        return this.sharePlane;
    }

    public final boolean component24() {
        return this.disableDanmaku;
    }

    public final boolean component25() {
        return this.hideDanmakuSwitch;
    }

    public final int component3() {
        return this.canPlay;
    }

    @Nullable
    public final String component4() {
        return this.cardGoto;
    }

    @Nullable
    public final String component5() {
        return this.cardType;
    }

    @Nullable
    public final String component6() {
        return this.cover;
    }

    public final int component7() {
        return this.coverLeftIcon1;
    }

    @Nullable
    public final String component8() {
        return this.coverLeftText1;
    }

    @Nullable
    public final String component9() {
        return this.coverLeftText2;
    }

    @NotNull
    public final InlineLive copy(@Nullable Args args, @Nullable Avatar avatar, int i7, @Nullable String str, @Nullable String str2, @Nullable String str3, int i8, @Nullable String str4, @Nullable String str5, @Nullable String str6, int i9, int i10, @Nullable String str7, @Nullable PlayerArgs playerArgs, @Nullable RightTopLiveBadge rightTopLiveBadge, @Nullable String str8, @Nullable String str9, long j7, @Nullable String str10, boolean z6, @Nullable TrafficConfig trafficConfig, @Nullable InlineThreePointPanel inlineThreePointPanel, @Nullable SharePlane sharePlane, boolean z7, boolean z8) {
        return new InlineLive(args, avatar, i7, str, str2, str3, i8, str4, str5, str6, i9, i10, str7, playerArgs, rightTopLiveBadge, str8, str9, j7, str10, z6, trafficConfig, inlineThreePointPanel, sharePlane, z7, z8);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InlineLive)) {
            return false;
        }
        InlineLive inlineLive = (InlineLive) obj;
        return Intrinsics.areEqual(this.args, inlineLive.args) && Intrinsics.areEqual(this.avatar, inlineLive.avatar) && this.canPlay == inlineLive.canPlay && Intrinsics.areEqual(this.cardGoto, inlineLive.cardGoto) && Intrinsics.areEqual(this.cardType, inlineLive.cardType) && Intrinsics.areEqual(this.cover, inlineLive.cover) && this.coverLeftIcon1 == inlineLive.coverLeftIcon1 && Intrinsics.areEqual(this.coverLeftText1, inlineLive.coverLeftText1) && Intrinsics.areEqual(this.coverLeftText2, inlineLive.coverLeftText2) && Intrinsics.areEqual(this.f38goto, inlineLive.f38goto) && this.officialIcon == inlineLive.officialIcon && this.officialIconV2 == inlineLive.officialIconV2 && Intrinsics.areEqual(this.param, inlineLive.param) && Intrinsics.areEqual(this.playerArgs, inlineLive.playerArgs) && Intrinsics.areEqual(this.rightTopLiveBadge, inlineLive.rightTopLiveBadge) && Intrinsics.areEqual(this.title, inlineLive.title) && Intrinsics.areEqual(this.translatedTitle, inlineLive.translatedTitle) && this.translatedStatus == inlineLive.translatedStatus && Intrinsics.areEqual(this.uri, inlineLive.uri) && this.isAtten == inlineLive.isAtten && Intrinsics.areEqual(this.trafficConfig, inlineLive.trafficConfig) && Intrinsics.areEqual(this.threePointMeta, inlineLive.threePointMeta) && Intrinsics.areEqual(this.sharePlane, inlineLive.sharePlane) && this.disableDanmaku == inlineLive.disableDanmaku && this.hideDanmakuSwitch == inlineLive.hideDanmakuSwitch;
    }

    @Override // com.bilibili.search2.api.oversea.a
    @NotNull
    public /* bridge */ /* synthetic */ List getAllItems() {
        return super.getAllItems();
    }

    @Nullable
    public final Args getArgs() {
        return this.args;
    }

    @Nullable
    public final Avatar getAvatar() {
        return this.avatar;
    }

    public final int getCanPlay() {
        return this.canPlay;
    }

    @Nullable
    public final String getCardGoto() {
        return this.cardGoto;
    }

    @Nullable
    public final String getCardType() {
        return this.cardType;
    }

    @Nullable
    public final String getCover() {
        return this.cover;
    }

    public final int getCoverLeftIcon1() {
        return this.coverLeftIcon1;
    }

    @Nullable
    public final String getCoverLeftText1() {
        return this.coverLeftText1;
    }

    @Nullable
    public final String getCoverLeftText2() {
        return this.coverLeftText2;
    }

    public final boolean getDisableDanmaku() {
        return this.disableDanmaku;
    }

    @Nullable
    public final String getGoto() {
        return this.f38goto;
    }

    public final boolean getHideDanmakuSwitch() {
        return this.hideDanmakuSwitch;
    }

    public final int getOfficialIcon() {
        return this.officialIcon;
    }

    public final int getOfficialIconV2() {
        return this.officialIconV2;
    }

    @Nullable
    public final String getParam() {
        return this.param;
    }

    @Nullable
    public final PlayerArgs getPlayerArgs() {
        return this.playerArgs;
    }

    @Nullable
    public final RightTopLiveBadge getRightTopLiveBadge() {
        return this.rightTopLiveBadge;
    }

    @Nullable
    public final SharePlane getSharePlane() {
        return this.sharePlane;
    }

    @Override // com.bilibili.search2.api.oversea.a
    @NotNull
    public List getSubItems() {
        return CollectionsKt.emptyList();
    }

    @Nullable
    public final InlineThreePointPanel getThreePointMeta() {
        return this.threePointMeta;
    }

    @Override // com.bilibili.search2.api.oversea.a
    @Nullable
    public String getTitle() {
        return this.title;
    }

    @Nullable
    public final TrafficConfig getTrafficConfig() {
        return this.trafficConfig;
    }

    @Override // com.bilibili.search2.api.oversea.a
    @NotNull
    public c getTranslateRequestParam() {
        TranslationBusiness translationBusiness = TranslationBusiness.TRANS_BIZ_LIVE;
        String str = this.param;
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        return new c(translationBusiness, str2);
    }

    @Override // com.bilibili.search2.api.oversea.a
    public long getTranslatedStatus() {
        return this.translatedStatus;
    }

    @Override // com.bilibili.search2.api.oversea.a
    @Nullable
    public String getTranslatedTitle() {
        return this.translatedTitle;
    }

    @Nullable
    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        Args args = this.args;
        int iHashCode = args == null ? 0 : args.hashCode();
        Avatar avatar = this.avatar;
        int iA = I.a(this.canPlay, ((iHashCode * 31) + (avatar == null ? 0 : avatar.hashCode())) * 31, 31);
        String str = this.cardGoto;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.cardType;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.cover;
        int iA2 = I.a(this.coverLeftIcon1, (((((iA + iHashCode2) * 31) + iHashCode3) * 31) + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        String str4 = this.coverLeftText1;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.coverLeftText2;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.f38goto;
        int iA3 = I.a(this.officialIconV2, I.a(this.officialIcon, (((((iA2 + iHashCode4) * 31) + iHashCode5) * 31) + (str6 == null ? 0 : str6.hashCode())) * 31, 31), 31);
        String str7 = this.param;
        int iHashCode6 = str7 == null ? 0 : str7.hashCode();
        PlayerArgs playerArgs = this.playerArgs;
        int iHashCode7 = playerArgs == null ? 0 : playerArgs.hashCode();
        RightTopLiveBadge rightTopLiveBadge = this.rightTopLiveBadge;
        int iHashCode8 = rightTopLiveBadge == null ? 0 : rightTopLiveBadge.hashCode();
        String str8 = this.title;
        int iHashCode9 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.translatedTitle;
        int iA4 = C3554n0.a((((((((((iA3 + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (str9 == null ? 0 : str9.hashCode())) * 31, 31, this.translatedStatus);
        String str10 = this.uri;
        int iA5 = z.a((iA4 + (str10 == null ? 0 : str10.hashCode())) * 31, 31, this.isAtten);
        TrafficConfig trafficConfig = this.trafficConfig;
        int iHashCode10 = trafficConfig == null ? 0 : trafficConfig.hashCode();
        InlineThreePointPanel inlineThreePointPanel = this.threePointMeta;
        int iHashCode11 = inlineThreePointPanel == null ? 0 : inlineThreePointPanel.hashCode();
        SharePlane sharePlane = this.sharePlane;
        return Boolean.hashCode(this.hideDanmakuSwitch) + z.a((((((iA5 + iHashCode10) * 31) + iHashCode11) * 31) + (sharePlane == null ? 0 : sharePlane.hashCode())) * 31, 31, this.disableDanmaku);
    }

    public final boolean isAtten() {
        return this.isAtten;
    }

    public final void setArgs(@Nullable Args args) {
        this.args = args;
    }

    public final void setAtten(boolean z6) {
        this.isAtten = z6;
    }

    public final void setAvatar(@Nullable Avatar avatar) {
        this.avatar = avatar;
    }

    public final void setCanPlay(int i7) {
        this.canPlay = i7;
    }

    public final void setCardGoto(@Nullable String str) {
        this.cardGoto = str;
    }

    public final void setCardType(@Nullable String str) {
        this.cardType = str;
    }

    public final void setCover(@Nullable String str) {
        this.cover = str;
    }

    public final void setCoverLeftIcon1(int i7) {
        this.coverLeftIcon1 = i7;
    }

    public final void setCoverLeftText1(@Nullable String str) {
        this.coverLeftText1 = str;
    }

    public final void setCoverLeftText2(@Nullable String str) {
        this.coverLeftText2 = str;
    }

    public final void setDisableDanmaku(boolean z6) {
        this.disableDanmaku = z6;
    }

    public final void setGoto(@Nullable String str) {
        this.f38goto = str;
    }

    public final void setHideDanmakuSwitch(boolean z6) {
        this.hideDanmakuSwitch = z6;
    }

    public final void setOfficialIcon(int i7) {
        this.officialIcon = i7;
    }

    public final void setOfficialIconV2(int i7) {
        this.officialIconV2 = i7;
    }

    public final void setParam(@Nullable String str) {
        this.param = str;
    }

    public final void setPlayerArgs(@Nullable PlayerArgs playerArgs) {
        this.playerArgs = playerArgs;
    }

    public final void setRightTopLiveBadge(@Nullable RightTopLiveBadge rightTopLiveBadge) {
        this.rightTopLiveBadge = rightTopLiveBadge;
    }

    public final void setSharePlane(@Nullable SharePlane sharePlane) {
        this.sharePlane = sharePlane;
    }

    public final void setThreePointMeta(@Nullable InlineThreePointPanel inlineThreePointPanel) {
        this.threePointMeta = inlineThreePointPanel;
    }

    public void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setTrafficConfig(@Nullable TrafficConfig trafficConfig) {
        this.trafficConfig = trafficConfig;
    }

    @Override // com.bilibili.search2.api.oversea.a
    public void setTranslatedStatus(long j7) {
        this.translatedStatus = j7;
    }

    @Override // com.bilibili.search2.api.oversea.a
    public void setTranslatedTitle(@Nullable String str) {
        this.translatedTitle = str;
    }

    public final void setUri(@Nullable String str) {
        this.uri = str;
    }

    @NotNull
    public String toString() {
        Args args = this.args;
        Avatar avatar = this.avatar;
        int i7 = this.canPlay;
        String str = this.cardGoto;
        String str2 = this.cardType;
        String str3 = this.cover;
        int i8 = this.coverLeftIcon1;
        String str4 = this.coverLeftText1;
        String str5 = this.coverLeftText2;
        String str6 = this.f38goto;
        int i9 = this.officialIcon;
        int i10 = this.officialIconV2;
        String str7 = this.param;
        PlayerArgs playerArgs = this.playerArgs;
        RightTopLiveBadge rightTopLiveBadge = this.rightTopLiveBadge;
        String str8 = this.title;
        String str9 = this.translatedTitle;
        long j7 = this.translatedStatus;
        String str10 = this.uri;
        boolean z6 = this.isAtten;
        TrafficConfig trafficConfig = this.trafficConfig;
        InlineThreePointPanel inlineThreePointPanel = this.threePointMeta;
        SharePlane sharePlane = this.sharePlane;
        boolean z7 = this.disableDanmaku;
        boolean z8 = this.hideDanmakuSwitch;
        StringBuilder sb = new StringBuilder("InlineLive(args=");
        sb.append(args);
        sb.append(", avatar=");
        sb.append(avatar);
        sb.append(", canPlay=");
        M.a(i7, ", cardGoto=", str, ", cardType=", sb);
        B.a(str2, ", cover=", str3, ", coverLeftIcon1=", sb);
        M.a(i8, ", coverLeftText1=", str4, ", coverLeftText2=", sb);
        B.a(str5, ", goto=", str6, ", officialIcon=", sb);
        C4690e.a(i9, i10, ", officialIconV2=", ", param=", sb);
        sb.append(str7);
        sb.append(", playerArgs=");
        sb.append(playerArgs);
        sb.append(", rightTopLiveBadge=");
        sb.append(rightTopLiveBadge);
        sb.append(", title=");
        sb.append(str8);
        sb.append(", translatedTitle=");
        v.a(j7, str9, ", translatedStatus=", sb);
        n.a(", uri=", str10, ", isAtten=", sb, z6);
        sb.append(", trafficConfig=");
        sb.append(trafficConfig);
        sb.append(", threePointMeta=");
        sb.append(inlineThreePointPanel);
        sb.append(", sharePlane=");
        sb.append(sharePlane);
        sb.append(", disableDanmaku=");
        sb.append(z7);
        sb.append(", hideDanmakuSwitch=");
        sb.append(z8);
        sb.append(")");
        return sb.toString();
    }
}
