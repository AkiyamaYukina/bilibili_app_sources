package com.bilibili.ogv.review.detailpage;

import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.bilibili.live.streaming.source.TextSource;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/detailpage/ReviewResult.class */
@StabilityInferred(parameters = 0)
@Bson
public final class ReviewResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f72306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("share_url")
    @Nullable
    private String f72307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("data")
    @Nullable
    private JsonObject f72308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName(TextSource.CFG_CONTENT)
    @Nullable
    private String f72309d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("need_captcha")
    private boolean f72310e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SerializedName("captcha_url")
    @Nullable
    private String f72311f;

    public ReviewResult() {
        this(0L, null, null, null, false, null, 63);
    }

    public ReviewResult(long j7, String str, JsonObject jsonObject, String str2, boolean z6, String str3, int i7) {
        j7 = (i7 & 1) != 0 ? 0L : j7;
        str = (i7 & 2) != 0 ? null : str;
        jsonObject = (i7 & 4) != 0 ? null : jsonObject;
        str2 = (i7 & 8) != 0 ? null : str2;
        z6 = (i7 & 16) != 0 ? false : z6;
        str3 = (i7 & 32) != 0 ? null : str3;
        this.f72306a = j7;
        this.f72307b = str;
        this.f72308c = jsonObject;
        this.f72309d = str2;
        this.f72310e = z6;
        this.f72311f = str3;
    }

    @Nullable
    public final String a() {
        return this.f72311f;
    }

    @Nullable
    public final String b() {
        return this.f72309d;
    }

    @Nullable
    public final JsonObject c() {
        return this.f72308c;
    }

    public final boolean d() {
        return this.f72310e;
    }

    @Nullable
    public final String e() {
        return this.f72307b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewResult)) {
            return false;
        }
        ReviewResult reviewResult = (ReviewResult) obj;
        return this.f72306a == reviewResult.f72306a && Intrinsics.areEqual(this.f72307b, reviewResult.f72307b) && Intrinsics.areEqual(this.f72308c, reviewResult.f72308c) && Intrinsics.areEqual(this.f72309d, reviewResult.f72309d) && this.f72310e == reviewResult.f72310e && Intrinsics.areEqual(this.f72311f, reviewResult.f72311f);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f72306a);
        String str = this.f72307b;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        JsonObject jsonObject = this.f72308c;
        int iHashCode3 = jsonObject == null ? 0 : jsonObject.hashCode();
        String str2 = this.f72309d;
        int iA = z.a(((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f72310e);
        String str3 = this.f72311f;
        return iA + (str3 == null ? 0 : str3.hashCode());
    }

    @NotNull
    public final String toString() {
        String str = this.f72307b;
        JsonObject jsonObject = this.f72308c;
        String str2 = this.f72309d;
        boolean z6 = this.f72310e;
        String str3 = this.f72311f;
        StringBuilder sb = new StringBuilder("ReviewResult(id=");
        G0.d.a(this.f72306a, ", shareUrl=", str, sb);
        sb.append(", data=");
        sb.append(jsonObject);
        sb.append(", content=");
        sb.append(str2);
        com.bilibili.ad.adview.liveroom.answer.fragment.vm.w.a(", needCaptcha=", ", captchaUrl=", str3, sb, z6);
        sb.append(")");
        return sb.toString();
    }
}
