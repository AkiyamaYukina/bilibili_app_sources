package com.bilibili.ship.theseus.united.page.restrictionlayer;

import Pj0.e;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.e0;
import com.bapis.bilibili.playershared.BottomDisplay;
import com.bapis.bilibili.playershared.Dialog;
import com.bapis.bilibili.playershared.GuideStyle;
import com.bapis.bilibili.playershared.TextInfo;
import com.bilibili.bson.common.Bson;
import com.bilibili.okretro.call.json.JsonUtilKt;
import com.bilibili.ship.theseus.united.page.restrictionlayer.TextVo;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.protobuf.GeneratedMessageLite;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/RestrictionLayerVo.class */
@StabilityInferred(parameters = 0)
@Bson
public final class RestrictionLayerVo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("style_type")
    @Nullable
    private final Style f102667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("backgroundInfo")
    @Nullable
    private final BackgroundVo f102668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final TextVo f102669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("sub_title")
    @Nullable
    private final TextVo f102670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final ImageVo f102671e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final List<TextVo> f102672f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final ReportVo f102673g;

    @SerializedName("bottom_display")
    @NotNull
    private final List<BottomDisplayVo> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @SerializedName("is_hide_more_btn")
    private final boolean f102674i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @SerializedName("ext_data")
    @Nullable
    private final Extra f102675j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @SerializedName("hide_button_on_half")
    private final boolean f102676k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @SerializedName("deliver_win_id")
    @Nullable
    private final String f102677l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f102678m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public final NextPlayableVo f102679n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f102680o;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/RestrictionLayerVo$BottomDisplayVo.class */
    @StabilityInferred(parameters = 0)
    @Bson
    public static final class BottomDisplayVo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final TextVo f102681a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f102682b;

        public BottomDisplayVo(@NotNull TextVo textVo, @NotNull String str) {
            this.f102681a = textVo;
            this.f102682b = str;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BottomDisplayVo)) {
                return false;
            }
            BottomDisplayVo bottomDisplayVo = (BottomDisplayVo) obj;
            return Intrinsics.areEqual(this.f102681a, bottomDisplayVo.f102681a) && Intrinsics.areEqual(this.f102682b, bottomDisplayVo.f102682b);
        }

        public final int hashCode() {
            return this.f102682b.hashCode() + (this.f102681a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "BottomDisplayVo(title=" + this.f102681a + ", icon=" + this.f102682b + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/RestrictionLayerVo$Extra.class */
    @StabilityInferred(parameters = 0)
    @Bson
    public static final class Extra {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final PlayListVo f102683a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final BannerVo f102684b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final ChargingExtVo f102685c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final QRCode f102686d;

        public Extra(@Nullable PlayListVo playListVo, @Nullable BannerVo bannerVo, @Nullable ChargingExtVo chargingExtVo, @Nullable QRCode qRCode) {
            this.f102683a = playListVo;
            this.f102684b = bannerVo;
            this.f102685c = chargingExtVo;
            this.f102686d = qRCode;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Extra)) {
                return false;
            }
            Extra extra = (Extra) obj;
            return Intrinsics.areEqual(this.f102683a, extra.f102683a) && Intrinsics.areEqual(this.f102684b, extra.f102684b) && Intrinsics.areEqual(this.f102685c, extra.f102685c) && Intrinsics.areEqual(this.f102686d, extra.f102686d);
        }

        public final int hashCode() {
            int iHashCode = 0;
            PlayListVo playListVo = this.f102683a;
            int iHashCode2 = playListVo == null ? 0 : playListVo.f102622a.hashCode();
            BannerVo bannerVo = this.f102684b;
            int iHashCode3 = bannerVo == null ? 0 : bannerVo.hashCode();
            ChargingExtVo chargingExtVo = this.f102685c;
            int iHashCode4 = chargingExtVo == null ? 0 : Boolean.hashCode(chargingExtVo.f102514a);
            QRCode qRCode = this.f102686d;
            if (qRCode != null) {
                iHashCode = qRCode.hashCode();
            }
            return (((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode;
        }

        @NotNull
        public final String toString() {
            return "Extra(playListInfo=" + this.f102683a + ", banner=" + this.f102684b + ", chargingExt=" + this.f102685c + ", qrCode=" + this.f102686d + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/RestrictionLayerVo$NextPlayableVo.class */
    @StabilityInferred(parameters = 0)
    @Bson
    public static final class NextPlayableVo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f102687a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f102688b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f102689c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f102690d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final String f102691e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final ReportVo f102692f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public final PlayNextOperationAction f102693g;

        public NextPlayableVo(String str, String str2, long j7, long j8, String str3, ReportVo reportVo, PlayNextOperationAction playNextOperationAction, int i7) {
            str3 = (i7 & 16) != 0 ? "" : str3;
            reportVo = (i7 & 32) != 0 ? new ReportVo("", "player.player.try-over.autoplay.click", MapsKt.mapOf(TuplesKt.to("btn_type", "1"))) : reportVo;
            playNextOperationAction = (i7 & 64) != 0 ? new PlayNextOperationAction(0, 8, j7, j8, str3) : playNextOperationAction;
            this.f102687a = str;
            this.f102688b = str2;
            this.f102689c = j7;
            this.f102690d = j8;
            this.f102691e = str3;
            this.f102692f = reportVo;
            this.f102693g = playNextOperationAction;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NextPlayableVo)) {
                return false;
            }
            NextPlayableVo nextPlayableVo = (NextPlayableVo) obj;
            return Intrinsics.areEqual(this.f102687a, nextPlayableVo.f102687a) && Intrinsics.areEqual(this.f102688b, nextPlayableVo.f102688b) && this.f102689c == nextPlayableVo.f102689c && this.f102690d == nextPlayableVo.f102690d && Intrinsics.areEqual(this.f102691e, nextPlayableVo.f102691e) && Intrinsics.areEqual(this.f102692f, nextPlayableVo.f102692f) && Intrinsics.areEqual(this.f102693g, nextPlayableVo.f102693g);
        }

        public final int hashCode() {
            int iA = I.E.a(C3554n0.a(C3554n0.a(I.E.a(this.f102687a.hashCode() * 31, 31, this.f102688b), 31, this.f102689c), 31, this.f102690d), 31, this.f102691e);
            return this.f102693g.hashCode() + ((this.f102692f.hashCode() + iA) * 31);
        }

        @NotNull
        public final String toString() {
            return "NextPlayableVo(title=" + this.f102687a + ", cover=" + this.f102688b + ", aid=" + this.f102689c + ", cid=" + this.f102690d + ", spmid=" + this.f102691e + ", report=" + this.f102692f + ", playNextAction=" + this.f102693g + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/RestrictionLayerVo$Style.class */
    public static final class Style implements com.bilibili.bson.adapter.a<Integer> {
        private static final EnumEntries $ENTRIES;
        private static final Style[] $VALUES;
        private final int value;
        public static final Style STYLE_UNKNOWN = new Style("STYLE_UNKNOWN", 0, 0);
        public static final Style HORIZONTAL_IMAGE = new Style("HORIZONTAL_IMAGE", 1, 1);
        public static final Style VERTICAL_TEXT = new Style("VERTICAL_TEXT", 2, 2);
        public static final Style SIMPLE_TEXT = new Style("SIMPLE_TEXT", 3, 3);
        public static final Style CHARGING_TEXT = new Style("CHARGING_TEXT", 4, 4);
        public static final Style UNIVERSAL_INTERCEPT = new Style("UNIVERSAL_INTERCEPT", 5, 5);
        public static final Style MSG_ATTACH_QR_CODE = new Style("MSG_ATTACH_QR_CODE", 6, 6);
        public static final Style CHARGING_TEXT_WITH_NEXT_PLAYABLE = new Style("CHARGING_TEXT_WITH_NEXT_PLAYABLE", 7, -4);

        private static final /* synthetic */ Style[] $values() {
            return new Style[]{STYLE_UNKNOWN, HORIZONTAL_IMAGE, VERTICAL_TEXT, SIMPLE_TEXT, CHARGING_TEXT, UNIVERSAL_INTERCEPT, MSG_ATTACH_QR_CODE, CHARGING_TEXT_WITH_NEXT_PLAYABLE};
        }

        static {
            Style[] styleArr$values = $values();
            $VALUES = styleArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(styleArr$values);
        }

        private Style(String str, int i7, int i8) {
            this.value = i8;
        }

        @NotNull
        public static EnumEntries<Style> getEntries() {
            return $ENTRIES;
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) $VALUES.clone();
        }

        @NotNull
        /* JADX INFO: renamed from: getValue, reason: merged with bridge method [inline-methods] */
        public Integer m9595getValue() {
            return Integer.valueOf(this.value);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/RestrictionLayerVo$a.class */
    public static final class a {

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerVo$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/RestrictionLayerVo$a$a.class */
        public static final class C1108a extends TypeToken<Style> {
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/RestrictionLayerVo$a$b.class */
        public static final class b extends TypeToken<Extra> {
        }

        @Nullable
        public static RestrictionLayerVo a(@NotNull Dialog dialog) {
            RestrictionLayerVo restrictionLayerVo;
            BottomDisplayVo bottomDisplayVo;
            TextVo textVo;
            String text;
            if (dialog.getDefaultInstanceForType() == dialog) {
                restrictionLayerVo = null;
            } else {
                if (dialog.getStyleType() == GuideStyle.UNRECOGNIZED) {
                    return null;
                }
                Style style = dialog.getStyleType() == GuideStyle.STYLE_UNKNOWN ? null : (Style) JsonUtilKt.parseJson((JsonElement) new JsonPrimitive(Integer.valueOf(dialog.getStyleType().getNumber())), new C1108a().getType());
                TextInfo title = dialog.getTitle();
                String text2 = title.getText();
                TextVo textVo2 = (text2 == null || text2.length() == 0) ? null : (TextVo) JsonUtilKt.parseJson(Pj0.e.a(title), new TextVo.a.C1109a().getType());
                TextInfo subtitle = dialog.getSubtitle();
                String text3 = subtitle.getText();
                TextVo textVo3 = (text3 == null || text3.length() == 0) ? null : (TextVo) JsonUtilKt.parseJson(Pj0.e.a(subtitle), new TextVo.a.C1109a().getType());
                GeneratedMessageLite backgroundInfo = dialog.getBackgroundInfo();
                BackgroundVo backgroundVo = (backgroundInfo == null || backgroundInfo.getDefaultInstanceForType() == backgroundInfo) ? null : (BackgroundVo) JsonUtilKt.parseJson(Pj0.e.a(backgroundInfo), new C6377b().getType());
                String str = (String) com.bilibili.ogv.infra.util.i.a(dialog.getImage().getUrl());
                ImageVo imageVo = str != null ? new ImageVo(str) : null;
                List<GeneratedMessageLite> buttonList = dialog.getButtonList();
                ArrayList arrayList = new ArrayList();
                for (GeneratedMessageLite generatedMessageLite : buttonList) {
                    if (generatedMessageLite.getDefaultInstanceForType() == generatedMessageLite || (text = generatedMessageLite.getText()) == null || text.length() == 0) {
                        textVo = null;
                    } else {
                        e.a aVar = Pj0.e.f18940a;
                        textVo = (TextVo) JsonUtilKt.parseJson(new Pj0.d(generatedMessageLite, true), new O().getType());
                    }
                    if (textVo != null) {
                        arrayList.add(textVo);
                    }
                }
                GeneratedMessageLite report = dialog.getReport();
                ReportVo reportVo = report.getDefaultInstanceForType() == report ? null : (ReportVo) JsonUtilKt.parseJson(Pj0.e.a(report), new E().getType());
                List<BottomDisplay> bottomDisplayList = dialog.getBottomDisplayList();
                ArrayList arrayList2 = new ArrayList();
                for (BottomDisplay bottomDisplay : bottomDisplayList) {
                    String text4 = bottomDisplay.getTitle().getText();
                    if (text4 == null || text4.length() == 0) {
                        bottomDisplayVo = null;
                    } else {
                        TextInfo title2 = bottomDisplay.getTitle();
                        String text5 = title2.getText();
                        bottomDisplayVo = new BottomDisplayVo((text5 == null || text5.length() == 0) ? null : (TextVo) JsonUtilKt.parseJson(Pj0.e.a(title2), new TextVo.a.C1109a().getType()), bottomDisplay.getIcon());
                    }
                    if (bottomDisplayVo != null) {
                        arrayList2.add(bottomDisplayVo);
                    }
                }
                restrictionLayerVo = new RestrictionLayerVo(style, backgroundVo, textVo2, textVo3, imageVo, arrayList, reportVo, arrayList2, dialog.getIsHideMoreBtn() == 1, (Extra) JsonUtilKt.parseJson(Pj0.e.a(dialog.getExtData()), new b().getType()), dialog.getHideButtonOnHalf() == 1, dialog.getDeliverWinId(), dialog.getConditionsMap(), null, 0L, 24576);
            }
            return restrictionLayerVo;
        }
    }

    public RestrictionLayerVo() {
        throw null;
    }

    public RestrictionLayerVo(Style style, BackgroundVo backgroundVo, TextVo textVo, TextVo textVo2, ImageVo imageVo, List list, ReportVo reportVo, List list2, boolean z6, Extra extra, boolean z7, String str, Map map, NextPlayableVo nextPlayableVo, long j7) {
        this.f102667a = style;
        this.f102668b = backgroundVo;
        this.f102669c = textVo;
        this.f102670d = textVo2;
        this.f102671e = imageVo;
        this.f102672f = list;
        this.f102673g = reportVo;
        this.h = list2;
        this.f102674i = z6;
        this.f102675j = extra;
        this.f102676k = z7;
        this.f102677l = str;
        this.f102678m = map;
        this.f102679n = nextPlayableVo;
        this.f102680o = j7;
    }

    public /* synthetic */ RestrictionLayerVo(Style style, BackgroundVo backgroundVo, TextVo textVo, TextVo textVo2, ImageVo imageVo, List list, ReportVo reportVo, List list2, boolean z6, Extra extra, boolean z7, String str, Map map, NextPlayableVo nextPlayableVo, long j7, int i7) {
        this(style, backgroundVo, textVo, textVo2, imageVo, list, reportVo, list2, z6, extra, z7, str, map, (i7 & 8192) != 0 ? null : nextPlayableVo, (i7 & 16384) != 0 ? Duration.Companion.getZERO-UwyO8pc() : j7);
    }

    public static RestrictionLayerVo a(RestrictionLayerVo restrictionLayerVo, Style style, List list, ReportVo reportVo, NextPlayableVo nextPlayableVo, long j7, int i7) {
        if ((i7 & 1) != 0) {
            style = restrictionLayerVo.f102667a;
        }
        BackgroundVo backgroundVo = restrictionLayerVo.f102668b;
        TextVo textVo = restrictionLayerVo.f102669c;
        TextVo textVo2 = restrictionLayerVo.f102670d;
        ImageVo imageVo = restrictionLayerVo.f102671e;
        if ((i7 & 32) != 0) {
            list = restrictionLayerVo.f102672f;
        }
        if ((i7 & 64) != 0) {
            reportVo = restrictionLayerVo.f102673g;
        }
        List<BottomDisplayVo> list2 = restrictionLayerVo.h;
        boolean z6 = restrictionLayerVo.f102674i;
        Extra extra = restrictionLayerVo.f102675j;
        boolean z7 = restrictionLayerVo.f102676k;
        String str = (i7 & 2048) != 0 ? restrictionLayerVo.f102677l : null;
        Map<String, String> map = restrictionLayerVo.f102678m;
        if ((i7 & 8192) != 0) {
            nextPlayableVo = restrictionLayerVo.f102679n;
        }
        if ((i7 & 16384) != 0) {
            j7 = restrictionLayerVo.f102680o;
        }
        restrictionLayerVo.getClass();
        return new RestrictionLayerVo(style, backgroundVo, textVo, textVo2, imageVo, list, reportVo, list2, z6, extra, z7, str, map, nextPlayableVo, j7);
    }

    @Nullable
    public final BackgroundVo b() {
        return this.f102668b;
    }

    @NotNull
    public final List<BottomDisplayVo> c() {
        return this.h;
    }

    public final boolean d() {
        return this.f102676k;
    }

    @Nullable
    public final String e() {
        return this.f102677l;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RestrictionLayerVo)) {
            return false;
        }
        RestrictionLayerVo restrictionLayerVo = (RestrictionLayerVo) obj;
        return this.f102667a == restrictionLayerVo.f102667a && Intrinsics.areEqual(this.f102668b, restrictionLayerVo.f102668b) && Intrinsics.areEqual(this.f102669c, restrictionLayerVo.f102669c) && Intrinsics.areEqual(this.f102670d, restrictionLayerVo.f102670d) && Intrinsics.areEqual(this.f102671e, restrictionLayerVo.f102671e) && Intrinsics.areEqual(this.f102672f, restrictionLayerVo.f102672f) && Intrinsics.areEqual(this.f102673g, restrictionLayerVo.f102673g) && Intrinsics.areEqual(this.h, restrictionLayerVo.h) && this.f102674i == restrictionLayerVo.f102674i && Intrinsics.areEqual(this.f102675j, restrictionLayerVo.f102675j) && this.f102676k == restrictionLayerVo.f102676k && Intrinsics.areEqual(this.f102677l, restrictionLayerVo.f102677l) && Intrinsics.areEqual(this.f102678m, restrictionLayerVo.f102678m) && Intrinsics.areEqual(this.f102679n, restrictionLayerVo.f102679n) && Duration.equals-impl0(this.f102680o, restrictionLayerVo.f102680o);
    }

    @Nullable
    public final Extra f() {
        return this.f102675j;
    }

    public final boolean g() {
        return this.f102674i;
    }

    @Nullable
    public final Style h() {
        return this.f102667a;
    }

    public final int hashCode() {
        Style style = this.f102667a;
        int iHashCode = style == null ? 0 : style.hashCode();
        BackgroundVo backgroundVo = this.f102668b;
        int iHashCode2 = backgroundVo == null ? 0 : backgroundVo.hashCode();
        TextVo textVo = this.f102669c;
        int iHashCode3 = textVo == null ? 0 : textVo.hashCode();
        TextVo textVo2 = this.f102670d;
        int iHashCode4 = textVo2 == null ? 0 : textVo2.hashCode();
        ImageVo imageVo = this.f102671e;
        int iA = e0.a(((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (imageVo == null ? 0 : imageVo.f102563a.hashCode())) * 31, 31, this.f102672f);
        ReportVo reportVo = this.f102673g;
        int iA2 = androidx.compose.animation.z.a(e0.a((iA + (reportVo == null ? 0 : reportVo.hashCode())) * 31, 31, this.h), 31, this.f102674i);
        Extra extra = this.f102675j;
        int iA3 = androidx.compose.animation.z.a((iA2 + (extra == null ? 0 : extra.hashCode())) * 31, 31, this.f102676k);
        String str = this.f102677l;
        int iA4 = J2.g.a((iA3 + (str == null ? 0 : str.hashCode())) * 31, this.f102678m, 31);
        NextPlayableVo nextPlayableVo = this.f102679n;
        return Duration.hashCode-impl(this.f102680o) + ((iA4 + (nextPlayableVo == null ? 0 : nextPlayableVo.hashCode())) * 31);
    }

    @Nullable
    public final TextVo i() {
        return this.f102670d;
    }

    @NotNull
    public final String toString() {
        Style style = this.f102667a;
        BackgroundVo backgroundVo = this.f102668b;
        TextVo textVo = this.f102670d;
        List<TextVo> list = this.f102672f;
        List<BottomDisplayVo> list2 = this.h;
        boolean z6 = this.f102674i;
        Extra extra = this.f102675j;
        boolean z7 = this.f102676k;
        String str = this.f102677l;
        Map<String, String> map = this.f102678m;
        String str2 = Duration.toString-impl(this.f102680o);
        StringBuilder sb = new StringBuilder("RestrictionLayerVo(style=");
        sb.append(style);
        sb.append(", background=");
        sb.append(backgroundVo);
        sb.append(", title=");
        sb.append(this.f102669c);
        sb.append(", subtitle=");
        sb.append(textVo);
        sb.append(", image=");
        sb.append(this.f102671e);
        sb.append(", buttons=");
        sb.append(list);
        sb.append(", report=");
        sb.append(this.f102673g);
        sb.append(", bottomDisplay=");
        sb.append(list2);
        sb.append(", hidesMoreButton=");
        sb.append(z6);
        sb.append(", extData=");
        sb.append(extra);
        sb.append(", buttonHiddenWhenHalfScreen=");
        O4.a.d(", deliverWinId=", str, ", conditions=", sb, z7);
        sb.append(map);
        sb.append(", nextPlayable=");
        sb.append(this.f102679n);
        sb.append(", countdown=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
