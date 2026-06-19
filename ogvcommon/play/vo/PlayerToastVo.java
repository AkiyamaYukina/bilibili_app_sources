package com.bilibili.ogvcommon.play.vo;

import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.pgc.gateway.player.v2.Toast;
import com.bilibili.bson.common.Bson;
import com.bilibili.ogv.infra.util.i;
import com.bilibili.ogvcommon.play.vo.base.ReportVo;
import com.bilibili.ogvcommon.play.vo.base.TextVo;
import com.bilibili.okretro.call.json.JsonUtilKt;
import com.google.gson.annotations.SerializedName;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/vo/PlayerToastVo.class */
@StabilityInferred(parameters = 0)
@Bson
public final class PlayerToastVo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("toast_text")
    @Nullable
    private final TextVo f73325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final TextVo f73326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final ReportVo f73327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f73328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f73329e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/vo/PlayerToastVo$a.class */
    public static final class a {
        @Nullable
        public static PlayerToastVo a(@NotNull Toast toast) {
            TextVo textVo;
            ReportVo reportVo;
            String text;
            Map map = null;
            if (toast.getToastText().getText().length() == 0 && toast.getText().length() == 0) {
                return null;
            }
            if (toast.getToastText().getText().length() > 0) {
                GeneratedMessageLite toastText = toast.getToastText();
                if (toastText.getDefaultInstanceForType() == toastText || (text = toastText.getText()) == null || text.length() == 0) {
                    textVo = null;
                } else {
                    String text2 = toastText.getText();
                    Integer numB = Uj0.a.b(toastText.getTextColor());
                    textVo = new TextVo(text2, numB != null ? numB.intValue() : 0, Uj0.a.b(toastText.getTextColorNight()), null, null, null, null, null, null, null, null, null, null, 8184);
                }
            } else {
                textVo = new TextVo(toast.getText(), -1, null, null, null, null, null, null, null, null, null, null, null, 8188);
            }
            TextVo textVoA = TextVo.a.a(toast.getButton());
            GeneratedMessageLite report = toast.getReport();
            if (report.getDefaultInstanceForType() == report) {
                reportVo = null;
            } else {
                String str = (String) i.a(report.getShowEventId());
                String str2 = (String) i.a(report.getClickEventId());
                String str3 = (String) i.a(report.getExtends());
                if (str3 != null) {
                    map = (Map) JsonUtilKt.parseJson(str3, new Rl0.a().getType());
                }
                reportVo = new ReportVo(str, str2, map);
            }
            return new PlayerToastVo(textVo, textVoA, reportVo, toast.getIcon(), toast.getShowStyleType());
        }
    }

    public PlayerToastVo(@Nullable TextVo textVo, @Nullable TextVo textVo2, @Nullable ReportVo reportVo, @Nullable String str, int i7) {
        this.f73325a = textVo;
        this.f73326b = textVo2;
        this.f73327c = reportVo;
        this.f73328d = str;
        this.f73329e = i7;
    }

    @Nullable
    public final TextVo a() {
        return this.f73325a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayerToastVo)) {
            return false;
        }
        PlayerToastVo playerToastVo = (PlayerToastVo) obj;
        return Intrinsics.areEqual(this.f73325a, playerToastVo.f73325a) && Intrinsics.areEqual(this.f73326b, playerToastVo.f73326b) && Intrinsics.areEqual(this.f73327c, playerToastVo.f73327c) && Intrinsics.areEqual(this.f73328d, playerToastVo.f73328d) && this.f73329e == playerToastVo.f73329e;
    }

    public final int hashCode() {
        TextVo textVo = this.f73325a;
        int iHashCode = 0;
        int iHashCode2 = textVo == null ? 0 : textVo.hashCode();
        TextVo textVo2 = this.f73326b;
        int iHashCode3 = textVo2 == null ? 0 : textVo2.hashCode();
        ReportVo reportVo = this.f73327c;
        int iHashCode4 = reportVo == null ? 0 : reportVo.hashCode();
        String str = this.f73328d;
        if (str != null) {
            iHashCode = str.hashCode();
        }
        return Integer.hashCode(this.f73329e) + (((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode) * 31);
    }

    @NotNull
    public final String toString() {
        TextVo textVo = this.f73325a;
        StringBuilder sb = new StringBuilder("PlayerToastVo(title=");
        sb.append(textVo);
        sb.append(", button=");
        sb.append(this.f73326b);
        sb.append(", report=");
        sb.append(this.f73327c);
        sb.append(", icon=");
        sb.append(this.f73328d);
        sb.append(", showStyleType=");
        return C4277b.a(this.f73329e, ")", sb);
    }
}
