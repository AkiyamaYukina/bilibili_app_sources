package com.bilibili.ogvcommon.play.resolver;

import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfo;
import com.bapis.bilibili.pgc.gateway.player.v2.Dialog;
import com.bapis.bilibili.pgc.gateway.player.v2.PlayViewBusinessInfo;
import com.bapis.bilibili.pgc.gateway.player.v2.Toast;
import com.bapis.bilibili.pgc.gateway.player.v2.UserStatus;
import com.bapis.bilibili.pgc.gateway.player.v2.ViewInfo;
import com.bapis.bilibili.pgc.gateway.player.v2.WatchProgress;
import com.bilibili.bson.common.Bson;
import com.bilibili.ogvcommon.play.vo.BangumiVipBarVo;
import com.bilibili.ogvcommon.play.vo.LimitDialogVo;
import com.bilibili.ogvcommon.play.vo.PlayerToastVo;
import com.bilibili.ogvcommon.play.vo.PopWinVo;
import com.bilibili.ogvcommon.play.vo.base.GradientColorVo;
import com.bilibili.ogvcommon.play.vo.base.ReportVo;
import com.bilibili.ogvcommon.play.vo.base.TextVo;
import com.bilibili.okretro.call.json.JsonUtilKt;
import com.google.gson.annotations.SerializedName;
import com.google.protobuf.GeneratedMessageLite;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/resolver/ViewInfoExtraVo.class */
@StabilityInferred(parameters = 0)
@Bson
public final class ViewInfoExtraVo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("dialog")
    @Nullable
    private final LimitDialogVo f73237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final EndPage f73238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final PlayerToastVo f73239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final PopWinVo f73240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("try_watch_prompt_bar")
    @Nullable
    private final BangumiVipBarVo f73241e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f73242f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f73243g;
    public final boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @SerializedName("ext_dialog")
    @NotNull
    private final Map<String, LimitDialogVo> f73244i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @SerializedName("ext_toast")
    @NotNull
    private final Map<String, PlayerToastVo> f73245j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final Watermark f73246k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f73247l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public final EpisodeInfoVo f73248m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final EpUserStatus f73249n;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/resolver/ViewInfoExtraVo$a.class */
    public static final class a {
        @Nullable
        public static ViewInfoExtraVo a(@NotNull ViewInfo viewInfo, @NotNull PlayViewBusinessInfo playViewBusinessInfo) {
            PopWinVo popWinVo;
            ReportVo reportVo;
            BangumiVipBarVo bangumiVipBarVo;
            EpisodeInfoVo episodeInfoVo;
            ViewInfoExtraVo viewInfoExtraVo;
            if (viewInfo.getDefaultInstanceForType() == viewInfo) {
                viewInfoExtraVo = null;
            } else {
                LimitDialogVo limitDialogVoA = LimitDialogVo.a.a(viewInfo.getDialog());
                PlayerToastVo playerToastVoA = PlayerToastVo.a.a(viewInfo.getToast());
                LimitDialogVo limitDialogVoA2 = LimitDialogVo.a.a(viewInfo.getEndPage().getDialog());
                EndPage endPage = limitDialogVoA2 != null ? new EndPage(limitDialogVoA2) : null;
                GeneratedMessageLite popWin = viewInfo.getPopWin();
                if (popWin.getDefaultInstanceForType() == popWin) {
                    popWinVo = null;
                } else {
                    String cover = popWin.getCover();
                    TextVo textVoB = TextVo.a.b(popWin.getPopTitle());
                    TextVo textVoB2 = TextVo.a.b(popWin.getSubtitle());
                    List couponList = popWin.getCouponList();
                    List buttonList = popWin.getButtonList();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = buttonList.iterator();
                    while (it.hasNext()) {
                        TextVo textVoA = TextVo.a.a((ButtonInfo) it.next());
                        if (textVoA != null) {
                            arrayList.add(textVoA);
                        }
                    }
                    TextVo textVoA2 = TextVo.a.a(popWin.getBottomDesc());
                    String popType = popWin.getPopType();
                    PopWinVo.Type type = PopWinVo.Type.COUPON;
                    if (!Intrinsics.areEqual(popType, type.getValue())) {
                        type = PopWinVo.Type.COMMON;
                    }
                    popWinVo = new PopWinVo(cover, textVoB, textVoB2, couponList, arrayList, textVoA2, type);
                }
                GeneratedMessageLite tryWatchPromptBar = viewInfo.getTryWatchPromptBar();
                if (tryWatchPromptBar.getDefaultInstanceForType() == tryWatchPromptBar) {
                    bangumiVipBarVo = null;
                } else {
                    TextVo textVoB3 = TextVo.a.b(tryWatchPromptBar.getTitle());
                    TextVo textVoB4 = TextVo.a.b(tryWatchPromptBar.getSubTitle());
                    String subTitleIcon = tryWatchPromptBar.getSubTitleIcon();
                    String bgImage = tryWatchPromptBar.getBgImage();
                    GeneratedMessageLite bgGradientColor = tryWatchPromptBar.getBgGradientColor();
                    GradientColorVo gradientColorVo = bgGradientColor.getDefaultInstanceForType() == bgGradientColor ? null : new GradientColorVo(Uj0.a.b(bgGradientColor.getStartColor()), Uj0.a.b(bgGradientColor.getEndColor()));
                    List buttonList2 = tryWatchPromptBar.getButtonList();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = buttonList2.iterator();
                    while (it2.hasNext()) {
                        TextVo textVoA3 = TextVo.a.a((ButtonInfo) it2.next());
                        if (textVoA3 != null) {
                            arrayList2.add(textVoA3);
                        }
                    }
                    GeneratedMessageLite report = tryWatchPromptBar.getReport();
                    if (report.getDefaultInstanceForType() == report) {
                        reportVo = null;
                    } else {
                        String str = (String) com.bilibili.ogv.infra.util.i.a(report.getShowEventId());
                        String str2 = (String) com.bilibili.ogv.infra.util.i.a(report.getClickEventId());
                        String str3 = (String) com.bilibili.ogv.infra.util.i.a(report.getExtends());
                        reportVo = new ReportVo(str, str2, str3 != null ? (Map) JsonUtilKt.parseJson(str3, new Rl0.a().getType()) : null);
                    }
                    String fullScreenIpIcon = tryWatchPromptBar.getFullScreenIpIcon();
                    GeneratedMessageLite fullScreenBgGradientColor = tryWatchPromptBar.getFullScreenBgGradientColor();
                    bangumiVipBarVo = new BangumiVipBarVo(textVoB3, textVoB4, subTitleIcon, bgImage, gradientColorVo, arrayList2, reportVo, fullScreenIpIcon, fullScreenBgGradientColor.getDefaultInstanceForType() == fullScreenBgGradientColor ? null : new GradientColorVo(Uj0.a.b(fullScreenBgGradientColor.getStartColor()), Uj0.a.b(fullScreenBgGradientColor.getEndColor())));
                    if (!bangumiVipBarVo.i()) {
                        bangumiVipBarVo = null;
                    }
                }
                boolean isPreview = playViewBusinessInfo.getIsPreview();
                boolean z6 = playViewBusinessInfo.getDrmTechTypeValue() > 0;
                boolean isDrm = playViewBusinessInfo.getIsDrm();
                Map extDialogMap = viewInfo.getExtDialogMap();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : extDialogMap.entrySet()) {
                    String styleType = ((Dialog) entry.getValue()).getStyleType();
                    if (styleType != null && styleType.length() != 0) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap.size()));
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    linkedHashMap2.put(entry2.getKey(), LimitDialogVo.a.a((Dialog) entry2.getValue()));
                }
                Map extToastMap = viewInfo.getExtToastMap();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Map.Entry entry3 : extToastMap.entrySet()) {
                    String text = ((Toast) entry3.getValue()).getToastText().getText();
                    if (text != null && text.length() != 0) {
                        linkedHashMap3.put(entry3.getKey(), entry3.getValue());
                    }
                }
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap3.size()));
                for (Map.Entry entry4 : linkedHashMap3.entrySet()) {
                    linkedHashMap4.put(entry4.getKey(), PlayerToastVo.a.a((Toast) entry4.getValue()));
                }
                GeneratedMessageLite recordInfo = playViewBusinessInfo.getRecordInfo();
                Watermark watermark = recordInfo.getDefaultInstanceForType() == recordInfo ? null : new Watermark(recordInfo.getRecordIcon(), recordInfo.getRecord());
                boolean isLivePre = playViewBusinessInfo.getIsLivePre();
                GeneratedMessageLite episodeInfo = playViewBusinessInfo.getEpisodeInfo();
                if (episodeInfo.getDefaultInstanceForType() == episodeInfo) {
                    episodeInfoVo = null;
                } else {
                    long epId = episodeInfo.getEpId();
                    long cid = episodeInfo.getCid();
                    long aid = episodeInfo.getAid();
                    int epStatus = episodeInfo.getEpStatus();
                    GeneratedMessageLite seasonInfo = episodeInfo.getSeasonInfo();
                    episodeInfoVo = new EpisodeInfoVo(epId, cid, aid, epStatus, seasonInfo.getDefaultInstanceForType() == seasonInfo ? null : new SeasonInfoVo(seasonInfo.getSeasonId(), seasonInfo.getSeasonType()), episodeInfo.getTitle(), episodeInfo.getLongTitle());
                }
                UserStatus userStatus = playViewBusinessInfo.getUserStatus();
                boolean payCheck = userStatus.getPayCheck();
                boolean sponsor = userStatus.getSponsor();
                WatchProgress watchProgress = userStatus.getWatchProgress();
                long lastEpId = watchProgress.getLastEpId();
                String lastEpIndex = watchProgress.getLastEpIndex();
                Duration.Companion companion = Duration.Companion;
                viewInfoExtraVo = new ViewInfoExtraVo(limitDialogVoA, endPage, playerToastVoA, popWinVo, bangumiVipBarVo, isPreview, z6, isDrm, linkedHashMap2, linkedHashMap4, watermark, isLivePre, episodeInfoVo, new EpUserStatus(payCheck, sponsor, new SeasonWatchProgress(lastEpId, lastEpIndex, DurationKt.toDuration(watchProgress.getProgress(), DurationUnit.SECONDS), watchProgress.getLastPlayCid())));
            }
            return viewInfoExtraVo;
        }
    }

    public ViewInfoExtraVo(@Nullable LimitDialogVo limitDialogVo, @Nullable EndPage endPage, @Nullable PlayerToastVo playerToastVo, @Nullable PopWinVo popWinVo, @Nullable BangumiVipBarVo bangumiVipBarVo, boolean z6, boolean z7, boolean z8, @NotNull Map<String, LimitDialogVo> map, @NotNull Map<String, PlayerToastVo> map2, @Nullable Watermark watermark, boolean z9, @Nullable EpisodeInfoVo episodeInfoVo, @NotNull EpUserStatus epUserStatus) {
        this.f73237a = limitDialogVo;
        this.f73238b = endPage;
        this.f73239c = playerToastVo;
        this.f73240d = popWinVo;
        this.f73241e = bangumiVipBarVo;
        this.f73242f = z6;
        this.f73243g = z7;
        this.h = z8;
        this.f73244i = map;
        this.f73245j = map2;
        this.f73246k = watermark;
        this.f73247l = z9;
        this.f73248m = episodeInfoVo;
        this.f73249n = epUserStatus;
    }

    @NotNull
    public final Map<String, LimitDialogVo> a() {
        return this.f73244i;
    }

    @NotNull
    public final Map<String, PlayerToastVo> b() {
        return this.f73245j;
    }

    @Nullable
    public final LimitDialogVo c() {
        return this.f73237a;
    }

    @Nullable
    public final BangumiVipBarVo d() {
        return this.f73241e;
    }

    public final boolean e() {
        LimitDialogVo limitDialogVo = this.f73237a;
        return (limitDialogVo == null || limitDialogVo.f73303a == LimitDialogVo.LimitDialogType.NONE) ? false : true;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewInfoExtraVo)) {
            return false;
        }
        ViewInfoExtraVo viewInfoExtraVo = (ViewInfoExtraVo) obj;
        return Intrinsics.areEqual(this.f73237a, viewInfoExtraVo.f73237a) && Intrinsics.areEqual(this.f73238b, viewInfoExtraVo.f73238b) && Intrinsics.areEqual(this.f73239c, viewInfoExtraVo.f73239c) && Intrinsics.areEqual(this.f73240d, viewInfoExtraVo.f73240d) && Intrinsics.areEqual(this.f73241e, viewInfoExtraVo.f73241e) && this.f73242f == viewInfoExtraVo.f73242f && this.f73243g == viewInfoExtraVo.f73243g && this.h == viewInfoExtraVo.h && Intrinsics.areEqual(this.f73244i, viewInfoExtraVo.f73244i) && Intrinsics.areEqual(this.f73245j, viewInfoExtraVo.f73245j) && Intrinsics.areEqual(this.f73246k, viewInfoExtraVo.f73246k) && this.f73247l == viewInfoExtraVo.f73247l && Intrinsics.areEqual(this.f73248m, viewInfoExtraVo.f73248m) && Intrinsics.areEqual(this.f73249n, viewInfoExtraVo.f73249n);
    }

    public final int hashCode() {
        LimitDialogVo limitDialogVo = this.f73237a;
        int iHashCode = limitDialogVo == null ? 0 : limitDialogVo.hashCode();
        EndPage endPage = this.f73238b;
        int iHashCode2 = endPage == null ? 0 : endPage.hashCode();
        PlayerToastVo playerToastVo = this.f73239c;
        int iHashCode3 = playerToastVo == null ? 0 : playerToastVo.hashCode();
        PopWinVo popWinVo = this.f73240d;
        int iHashCode4 = popWinVo == null ? 0 : popWinVo.hashCode();
        BangumiVipBarVo bangumiVipBarVo = this.f73241e;
        int iA = J2.g.a(J2.g.a(z.a(z.a(z.a(((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (bangumiVipBarVo == null ? 0 : bangumiVipBarVo.hashCode())) * 31, 31, this.f73242f), 31, this.f73243g), 31, this.h), this.f73244i, 31), this.f73245j, 31);
        Watermark watermark = this.f73246k;
        int iA2 = z.a((iA + (watermark == null ? 0 : watermark.hashCode())) * 31, 31, this.f73247l);
        EpisodeInfoVo episodeInfoVo = this.f73248m;
        return this.f73249n.hashCode() + ((iA2 + (episodeInfoVo == null ? 0 : episodeInfoVo.hashCode())) * 31);
    }

    @NotNull
    public final String toString() {
        return "ViewInfoExtraVo(limitDialog=" + this.f73237a + ", endPage=" + this.f73238b + ", toast=" + this.f73239c + ", popWin=" + this.f73240d + ", vipBar=" + this.f73241e + ", isPreview=" + this.f73242f + ", isDrm=" + this.f73243g + ", isDrmEp=" + this.h + ", extDialog=" + this.f73244i + ", extToast=" + this.f73245j + ", watermark=" + this.f73246k + ", isPreLive=" + this.f73247l + ", episodeInfo=" + this.f73248m + ", userStatus=" + this.f73249n + ")";
    }
}
