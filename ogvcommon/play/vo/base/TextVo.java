package com.bilibili.ogvcommon.play.vo.base;

import Uj0.c;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import androidx.compose.animation.core.I;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.e;
import com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfo;
import com.bapis.bilibili.pgc.gateway.player.v2.TextInfo;
import com.bilibili.bson.adapter.StringIntColorTypeAdapter;
import com.bilibili.bson.common.Bson;
import com.bilibili.ogv.infra.util.i;
import com.bilibili.okretro.call.json.JsonUtilKt;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u5.C8711a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/vo/base/TextVo.class */
@StabilityInferred(parameters = 0)
@Bson
public final class TextVo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("text")
    @NotNull
    private final String f73349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("text_color")
    @JsonAdapter(StringIntColorTypeAdapter.class)
    private final int f73350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("text_color_night")
    @JsonAdapter(StringIntColorTypeAdapter.class)
    @Nullable
    private final Integer f73351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("bg_color")
    @JsonAdapter(StringIntColorTypeAdapter.class)
    @Nullable
    private final Integer f73352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("report")
    @Nullable
    private final ReportVo f73353e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SerializedName("link")
    @Nullable
    private final String f73354f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SerializedName("action_type")
    @Nullable
    private final ActionType f73355g;

    @SerializedName("badge")
    @Nullable
    private final TextVo h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @SerializedName("left_strikethrough_text")
    @Nullable
    private final String f73356i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @SerializedName("simple_text_info")
    @Nullable
    private final TextVo f73357j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @SerializedName("simple_bg_color")
    @JsonAdapter(StringIntColorTypeAdapter.class)
    @Nullable
    private final Integer f73358k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @SerializedName("bg_gradient_color")
    @Nullable
    private final GradientColorVo f73359l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @SerializedName("order_report_params")
    @NotNull
    private final Map<String, String> f73360m;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/vo/base/TextVo$a.class */
    public static final class a {

        /* JADX INFO: renamed from: com.bilibili.ogvcommon.play.vo.base.TextVo$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/vo/base/TextVo$a$a.class */
        public static final class C0464a extends TypeToken<ActionType> {
        }

        @Nullable
        public static TextVo a(@NotNull ButtonInfo buttonInfo) {
            ReportVo reportVo;
            String text;
            TextVo textVo;
            String text2;
            TextVo textVo2;
            TextVo textVo3;
            if (buttonInfo.getDefaultInstanceForType() == buttonInfo) {
                textVo3 = null;
            } else {
                String text3 = buttonInfo.getText();
                if ((text3 == null || text3.length() == 0) && !buttonInfo.hasReport()) {
                    return null;
                }
                String text4 = buttonInfo.getText();
                Integer numB = Uj0.a.b(buttonInfo.getTextColor());
                int iIntValue = numB != null ? numB.intValue() : 0;
                Integer numB2 = Uj0.a.b(buttonInfo.getTextColorNight());
                Integer numB3 = Uj0.a.b(buttonInfo.getBgColor());
                String str = (String) i.a(buttonInfo.getLink());
                String actionType = buttonInfo.getActionType();
                ActionType actionType2 = (actionType == null || actionType.length() == 0) ? null : (ActionType) JsonUtilKt.parseJson(buttonInfo.getActionType(), new C0464a().getType());
                GeneratedMessageLite report = buttonInfo.getReport();
                if (report.getDefaultInstanceForType() == report) {
                    reportVo = null;
                } else {
                    String str2 = (String) i.a(report.getShowEventId());
                    String str3 = (String) i.a(report.getClickEventId());
                    String str4 = (String) i.a(report.getExtends());
                    reportVo = new ReportVo(str2, str3, str4 != null ? (Map) JsonUtilKt.parseJson(str4, new Rl0.a().getType()) : null);
                }
                String leftStrikethroughText = buttonInfo.getLeftStrikethroughText();
                GeneratedMessageLite badgeInfo = buttonInfo.getBadgeInfo();
                if (badgeInfo.getDefaultInstanceForType() == badgeInfo || (text = badgeInfo.getText()) == null || text.length() == 0) {
                    textVo = null;
                } else {
                    String text5 = badgeInfo.getText();
                    Integer numB4 = Uj0.a.b(badgeInfo.getTextColor());
                    int iIntValue2 = numB4 != null ? numB4.intValue() : 0;
                    Integer numB5 = Uj0.a.b(badgeInfo.getBgColor());
                    GeneratedMessageLite bgGradientColor = badgeInfo.getBgGradientColor();
                    textVo = new TextVo(text5, iIntValue2, null, numB5, null, null, null, null, null, null, null, bgGradientColor.getDefaultInstanceForType() == bgGradientColor ? null : new GradientColorVo(Uj0.a.b(bgGradientColor.getStartColor()), Uj0.a.b(bgGradientColor.getEndColor())), null, 6132);
                }
                GeneratedMessageLite simpleTextInfo = buttonInfo.getSimpleTextInfo();
                if (simpleTextInfo.getDefaultInstanceForType() == simpleTextInfo || (text2 = simpleTextInfo.getText()) == null || text2.length() == 0) {
                    textVo2 = null;
                } else {
                    String text6 = simpleTextInfo.getText();
                    Integer numB6 = Uj0.a.b(simpleTextInfo.getTextColor());
                    int iIntValue3 = 0;
                    if (numB6 != null) {
                        iIntValue3 = numB6.intValue();
                    }
                    textVo2 = new TextVo(text6, iIntValue3, Uj0.a.b(simpleTextInfo.getTextColorNight()), null, null, null, null, null, null, null, null, null, null, 8184);
                }
                Integer numB7 = Uj0.a.b(buttonInfo.getSimpleBgColor());
                GeneratedMessageLite bgGradientColor2 = buttonInfo.getBgGradientColor();
                textVo3 = new TextVo(text4, iIntValue, numB2, numB3, reportVo, str, actionType2, textVo, leftStrikethroughText, textVo2, numB7, bgGradientColor2.getDefaultInstanceForType() == bgGradientColor2 ? null : new GradientColorVo(Uj0.a.b(bgGradientColor2.getStartColor()), Uj0.a.b(bgGradientColor2.getEndColor())), buttonInfo.getOrderReportParamsMap());
            }
            return textVo3;
        }

        @Nullable
        public static TextVo b(@NotNull TextInfo textInfo) {
            String text;
            if (textInfo.getDefaultInstanceForType() == textInfo || (text = textInfo.getText()) == null || text.length() == 0) {
                return null;
            }
            String text2 = textInfo.getText();
            Integer numB = Uj0.a.b(textInfo.getTextColor());
            return new TextVo(text2, numB != null ? numB.intValue() : 0, Uj0.a.b(textInfo.getTextColorNight()), null, null, null, null, null, null, null, null, null, null, 8184);
        }
    }

    public TextVo(@NotNull String str, int i7, @Nullable Integer num, @Nullable Integer num2, @Nullable ReportVo reportVo, @Nullable String str2, @Nullable ActionType actionType, @Nullable TextVo textVo, @Nullable String str3, @Nullable TextVo textVo2, @Nullable Integer num3, @Nullable GradientColorVo gradientColorVo, @NotNull Map<String, String> map) {
        this.f73349a = str;
        this.f73350b = i7;
        this.f73351c = num;
        this.f73352d = num2;
        this.f73353e = reportVo;
        this.f73354f = str2;
        this.f73355g = actionType;
        this.h = textVo;
        this.f73356i = str3;
        this.f73357j = textVo2;
        this.f73358k = num3;
        this.f73359l = gradientColorVo;
        this.f73360m = map;
    }

    public /* synthetic */ TextVo(String str, int i7, Integer num, Integer num2, ReportVo reportVo, String str2, ActionType actionType, TextVo textVo, String str3, TextVo textVo2, Integer num3, GradientColorVo gradientColorVo, Map map, int i8) {
        this(str, i7, (i8 & 4) != 0 ? null : num, (i8 & 8) != 0 ? null : num2, (i8 & 16) != 0 ? null : reportVo, (i8 & 32) != 0 ? null : str2, (i8 & 64) != 0 ? null : actionType, (i8 & 128) != 0 ? null : textVo, (i8 & 256) != 0 ? null : str3, (i8 & 512) != 0 ? null : textVo2, (i8 & 1024) != 0 ? null : num3, (i8 & 2048) != 0 ? null : gradientColorVo, (i8 & 4096) != 0 ? MapsKt.emptyMap() : map);
    }

    @Nullable
    public final ActionType a() {
        return this.f73355g;
    }

    @Nullable
    public final Integer b() {
        return this.f73352d;
    }

    @JvmOverloads
    @Nullable
    public final Drawable c(@NotNull Context context, float f7, @NotNull GradientDrawable.Orientation orientation) {
        GradientDrawable gradientDrawable;
        GradientColorVo gradientColorVo = this.f73359l;
        if ((gradientColorVo != null ? gradientColorVo.b() : null) == null || this.f73359l.a() == null) {
            gradientDrawable = null;
            if (this.f73352d != null) {
                gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(c.a(f7, context));
                gradientDrawable.setColor(this.f73352d.intValue());
            }
        } else {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setOrientation(orientation);
            gradientDrawable2.setCornerRadius(c.a(f7, context));
            gradientDrawable2.setColors(new int[]{this.f73359l.b().intValue(), this.f73359l.a().intValue()});
            gradientDrawable = gradientDrawable2;
        }
        return gradientDrawable;
    }

    @Nullable
    public final TextVo d() {
        return this.h;
    }

    @Nullable
    public final GradientColorVo e() {
        return this.f73359l;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextVo)) {
            return false;
        }
        TextVo textVo = (TextVo) obj;
        return Intrinsics.areEqual(this.f73349a, textVo.f73349a) && this.f73350b == textVo.f73350b && Intrinsics.areEqual(this.f73351c, textVo.f73351c) && Intrinsics.areEqual(this.f73352d, textVo.f73352d) && Intrinsics.areEqual(this.f73353e, textVo.f73353e) && Intrinsics.areEqual(this.f73354f, textVo.f73354f) && this.f73355g == textVo.f73355g && Intrinsics.areEqual(this.h, textVo.h) && Intrinsics.areEqual(this.f73356i, textVo.f73356i) && Intrinsics.areEqual(this.f73357j, textVo.f73357j) && Intrinsics.areEqual(this.f73358k, textVo.f73358k) && Intrinsics.areEqual(this.f73359l, textVo.f73359l) && Intrinsics.areEqual(this.f73360m, textVo.f73360m);
    }

    @Nullable
    public final String f() {
        return this.f73356i;
    }

    @Nullable
    public final String g() {
        return this.f73354f;
    }

    @NotNull
    public final Map<String, String> h() {
        return this.f73360m;
    }

    public final int hashCode() {
        int iA = I.a(this.f73350b, this.f73349a.hashCode() * 31, 31);
        Integer num = this.f73351c;
        int iHashCode = 0;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        Integer num2 = this.f73352d;
        int iHashCode3 = num2 == null ? 0 : num2.hashCode();
        ReportVo reportVo = this.f73353e;
        int iHashCode4 = reportVo == null ? 0 : reportVo.hashCode();
        String str = this.f73354f;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        ActionType actionType = this.f73355g;
        int iHashCode6 = actionType == null ? 0 : actionType.hashCode();
        TextVo textVo = this.h;
        int iHashCode7 = textVo == null ? 0 : textVo.hashCode();
        String str2 = this.f73356i;
        int iHashCode8 = str2 == null ? 0 : str2.hashCode();
        TextVo textVo2 = this.f73357j;
        int iHashCode9 = textVo2 == null ? 0 : textVo2.hashCode();
        Integer num3 = this.f73358k;
        int iHashCode10 = num3 == null ? 0 : num3.hashCode();
        GradientColorVo gradientColorVo = this.f73359l;
        if (gradientColorVo != null) {
            iHashCode = gradientColorVo.hashCode();
        }
        return this.f73360m.hashCode() + ((((((((((((((((((((iA + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode) * 31);
    }

    @Nullable
    public final ReportVo i() {
        return this.f73353e;
    }

    @Nullable
    public final Integer j() {
        return this.f73358k;
    }

    @Nullable
    public final TextVo k() {
        return this.f73357j;
    }

    @NotNull
    public final String l() {
        return this.f73349a;
    }

    public final int m() {
        return this.f73350b;
    }

    @Nullable
    public final Integer n() {
        return this.f73351c;
    }

    public final int o(@NotNull Context context) {
        Integer num;
        return (!Cj0.a.a(context) || (num = this.f73351c) == null) ? this.f73350b : num.intValue();
    }

    @NotNull
    public final String toString() {
        String str = this.f73349a;
        int i7 = this.f73350b;
        Integer num = this.f73351c;
        Integer num2 = this.f73352d;
        ReportVo reportVo = this.f73353e;
        String str2 = this.f73354f;
        ActionType actionType = this.f73355g;
        TextVo textVo = this.h;
        String str3 = this.f73356i;
        TextVo textVo2 = this.f73357j;
        Integer num3 = this.f73358k;
        GradientColorVo gradientColorVo = this.f73359l;
        Map<String, String> map = this.f73360m;
        StringBuilder sbA = e.a(i7, "TextVo(text=", str, ", textColor=", ", textColorNight=");
        Ul.a.a(sbA, num, ", backgroundColor=", num2, ", report=");
        sbA.append(reportVo);
        sbA.append(", link=");
        sbA.append(str2);
        sbA.append(", actionType=");
        sbA.append(actionType);
        sbA.append(", badge=");
        sbA.append(textVo);
        sbA.append(", leftStrikeThroughText=");
        sbA.append(str3);
        sbA.append(", simpleTextInfo=");
        sbA.append(textVo2);
        sbA.append(", simpleBgColor=");
        sbA.append(num3);
        sbA.append(", bgGradientColor=");
        sbA.append(gradientColorVo);
        sbA.append(", orderReportParams=");
        return C8711a.a(sbA, map, ")");
    }
}
