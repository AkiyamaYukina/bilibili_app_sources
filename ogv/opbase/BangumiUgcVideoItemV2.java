package com.bilibili.ogv.opbase;

import G0.b;
import androidx.annotation.Keep;
import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.C4690e;
import androidx.paging.M;
import androidx.room.B;
import bf.a;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.ad.adview.liveroom.answer.fragment.vm.v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z4.d;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/BangumiUgcVideoItemV2.class */
@StabilityInferred(parameters = 0)
@Keep
public final class BangumiUgcVideoItemV2 {
    public static final int $stable = 8;
    private boolean badgepay;

    @Nullable
    private String cover;
    private int danmaku;
    private long duration;
    private int favourite;

    @JSONField(name = "goto")
    @Nullable
    private String jumpTo;

    @Nullable
    private String name;

    @Nullable
    private String pageName;

    @Nullable
    private String param;
    private int play;

    @JSONField(name = "cover_left_icon_1")
    private int playedNumIconType;

    @JSONField(name = "cover_left_text_1")
    @Nullable
    private String playedNumText;
    private int reply;
    private int rid;

    @Nullable
    private String rname;

    @Nullable
    private String title;
    private int ugc_pay;

    @Nullable
    private String uri;

    public BangumiUgcVideoItemV2() {
        this(null, null, null, null, null, null, 0, 0, 0, 0, 0, null, 0, false, null, 0L, null, 0, 262143, null);
    }

    public BangumiUgcVideoItemV2(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, int i7, int i8, int i9, int i10, int i11, @Nullable String str7, int i12, boolean z6, @Nullable String str8, long j7, @Nullable String str9, int i13) {
        this.title = str;
        this.cover = str2;
        this.uri = str3;
        this.param = str4;
        this.jumpTo = str5;
        this.name = str6;
        this.play = i7;
        this.danmaku = i8;
        this.reply = i9;
        this.favourite = i10;
        this.rid = i11;
        this.rname = str7;
        this.ugc_pay = i12;
        this.badgepay = z6;
        this.pageName = str8;
        this.duration = j7;
        this.playedNumText = str9;
        this.playedNumIconType = i13;
    }

    public /* synthetic */ BangumiUgcVideoItemV2(String str, String str2, String str3, String str4, String str5, String str6, int i7, int i8, int i9, int i10, int i11, String str7, int i12, boolean z6, String str8, long j7, String str9, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : str4, (i14 & 16) != 0 ? null : str5, (i14 & 32) != 0 ? null : str6, (i14 & 64) != 0 ? 0 : i7, (i14 & 128) != 0 ? 0 : i8, (i14 & 256) != 0 ? 0 : i9, (i14 & 512) != 0 ? 0 : i10, (i14 & 1024) != 0 ? 0 : i11, (i14 & 2048) != 0 ? null : str7, (i14 & 4096) != 0 ? 0 : i12, (i14 & 8192) != 0 ? false : z6, (i14 & 16384) != 0 ? null : str8, (i14 & 32768) != 0 ? 0L : j7, (i14 & 65536) != 0 ? null : str9, (i14 & 131072) != 0 ? 1 : i13);
    }

    public static /* synthetic */ BangumiUgcVideoItemV2 copy$default(BangumiUgcVideoItemV2 bangumiUgcVideoItemV2, String str, String str2, String str3, String str4, String str5, String str6, int i7, int i8, int i9, int i10, int i11, String str7, int i12, boolean z6, String str8, long j7, String str9, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = bangumiUgcVideoItemV2.title;
        }
        if ((i14 & 2) != 0) {
            str2 = bangumiUgcVideoItemV2.cover;
        }
        if ((i14 & 4) != 0) {
            str3 = bangumiUgcVideoItemV2.uri;
        }
        if ((i14 & 8) != 0) {
            str4 = bangumiUgcVideoItemV2.param;
        }
        if ((i14 & 16) != 0) {
            str5 = bangumiUgcVideoItemV2.jumpTo;
        }
        if ((i14 & 32) != 0) {
            str6 = bangumiUgcVideoItemV2.name;
        }
        if ((i14 & 64) != 0) {
            i7 = bangumiUgcVideoItemV2.play;
        }
        if ((i14 & 128) != 0) {
            i8 = bangumiUgcVideoItemV2.danmaku;
        }
        if ((i14 & 256) != 0) {
            i9 = bangumiUgcVideoItemV2.reply;
        }
        if ((i14 & 512) != 0) {
            i10 = bangumiUgcVideoItemV2.favourite;
        }
        if ((i14 & 1024) != 0) {
            i11 = bangumiUgcVideoItemV2.rid;
        }
        if ((i14 & 2048) != 0) {
            str7 = bangumiUgcVideoItemV2.rname;
        }
        if ((i14 & 4096) != 0) {
            i12 = bangumiUgcVideoItemV2.ugc_pay;
        }
        if ((i14 & 8192) != 0) {
            z6 = bangumiUgcVideoItemV2.badgepay;
        }
        if ((i14 & 16384) != 0) {
            str8 = bangumiUgcVideoItemV2.pageName;
        }
        if ((i14 & 32768) != 0) {
            j7 = bangumiUgcVideoItemV2.duration;
        }
        if ((i14 & 65536) != 0) {
            str9 = bangumiUgcVideoItemV2.playedNumText;
        }
        if ((i14 & 131072) != 0) {
            i13 = bangumiUgcVideoItemV2.playedNumIconType;
        }
        return bangumiUgcVideoItemV2.copy(str, str2, str3, str4, str5, str6, i7, i8, i9, i10, i11, str7, i12, z6, str8, j7, str9, i13);
    }

    @Nullable
    public final String component1() {
        return this.title;
    }

    public final int component10() {
        return this.favourite;
    }

    public final int component11() {
        return this.rid;
    }

    @Nullable
    public final String component12() {
        return this.rname;
    }

    public final int component13() {
        return this.ugc_pay;
    }

    public final boolean component14() {
        return this.badgepay;
    }

    @Nullable
    public final String component15() {
        return this.pageName;
    }

    public final long component16() {
        return this.duration;
    }

    @Nullable
    public final String component17() {
        return this.playedNumText;
    }

    public final int component18() {
        return this.playedNumIconType;
    }

    @Nullable
    public final String component2() {
        return this.cover;
    }

    @Nullable
    public final String component3() {
        return this.uri;
    }

    @Nullable
    public final String component4() {
        return this.param;
    }

    @Nullable
    public final String component5() {
        return this.jumpTo;
    }

    @Nullable
    public final String component6() {
        return this.name;
    }

    public final int component7() {
        return this.play;
    }

    public final int component8() {
        return this.danmaku;
    }

    public final int component9() {
        return this.reply;
    }

    @NotNull
    public final BangumiUgcVideoItemV2 copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, int i7, int i8, int i9, int i10, int i11, @Nullable String str7, int i12, boolean z6, @Nullable String str8, long j7, @Nullable String str9, int i13) {
        return new BangumiUgcVideoItemV2(str, str2, str3, str4, str5, str6, i7, i8, i9, i10, i11, str7, i12, z6, str8, j7, str9, i13);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BangumiUgcVideoItemV2)) {
            return false;
        }
        BangumiUgcVideoItemV2 bangumiUgcVideoItemV2 = (BangumiUgcVideoItemV2) obj;
        return Intrinsics.areEqual(this.title, bangumiUgcVideoItemV2.title) && Intrinsics.areEqual(this.cover, bangumiUgcVideoItemV2.cover) && Intrinsics.areEqual(this.uri, bangumiUgcVideoItemV2.uri) && Intrinsics.areEqual(this.param, bangumiUgcVideoItemV2.param) && Intrinsics.areEqual(this.jumpTo, bangumiUgcVideoItemV2.jumpTo) && Intrinsics.areEqual(this.name, bangumiUgcVideoItemV2.name) && this.play == bangumiUgcVideoItemV2.play && this.danmaku == bangumiUgcVideoItemV2.danmaku && this.reply == bangumiUgcVideoItemV2.reply && this.favourite == bangumiUgcVideoItemV2.favourite && this.rid == bangumiUgcVideoItemV2.rid && Intrinsics.areEqual(this.rname, bangumiUgcVideoItemV2.rname) && this.ugc_pay == bangumiUgcVideoItemV2.ugc_pay && this.badgepay == bangumiUgcVideoItemV2.badgepay && Intrinsics.areEqual(this.pageName, bangumiUgcVideoItemV2.pageName) && this.duration == bangumiUgcVideoItemV2.duration && Intrinsics.areEqual(this.playedNumText, bangumiUgcVideoItemV2.playedNumText) && this.playedNumIconType == bangumiUgcVideoItemV2.playedNumIconType;
    }

    public final boolean getBadgepay() {
        return this.badgepay;
    }

    @Nullable
    public final String getCover() {
        return this.cover;
    }

    public final int getDanmaku() {
        return this.danmaku;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final int getFavourite() {
        return this.favourite;
    }

    @Nullable
    public final String getJumpTo() {
        return this.jumpTo;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getPageName() {
        return this.pageName;
    }

    @Nullable
    public final String getParam() {
        return this.param;
    }

    public final int getPlay() {
        return this.play;
    }

    public final int getPlayedNumIconType() {
        return this.playedNumIconType;
    }

    @Nullable
    public final String getPlayedNumText() {
        return this.playedNumText;
    }

    public final int getReply() {
        return this.reply;
    }

    public final int getRid() {
        return this.rid;
    }

    @Nullable
    public final String getRname() {
        return this.rname;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final int getUgc_pay() {
        return this.ugc_pay;
    }

    @Nullable
    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.cover;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.uri;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.param;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.jumpTo;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.name;
        int iA = I.a(this.rid, I.a(this.favourite, I.a(this.reply, I.a(this.danmaku, I.a(this.play, ((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str6 == null ? 0 : str6.hashCode())) * 31, 31), 31), 31), 31), 31);
        String str7 = this.rname;
        int iA2 = z.a(I.a(this.ugc_pay, (iA + (str7 == null ? 0 : str7.hashCode())) * 31, 31), 31, this.badgepay);
        String str8 = this.pageName;
        int iA3 = C3554n0.a((iA2 + (str8 == null ? 0 : str8.hashCode())) * 31, 31, this.duration);
        String str9 = this.playedNumText;
        return Integer.hashCode(this.playedNumIconType) + ((iA3 + (str9 == null ? 0 : str9.hashCode())) * 31);
    }

    public final void setBadgepay(boolean z6) {
        this.badgepay = z6;
    }

    public final void setCover(@Nullable String str) {
        this.cover = str;
    }

    public final void setDanmaku(int i7) {
        this.danmaku = i7;
    }

    public final void setDuration(long j7) {
        this.duration = j7;
    }

    public final void setFavourite(int i7) {
        this.favourite = i7;
    }

    public final void setJumpTo(@Nullable String str) {
        this.jumpTo = str;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setPageName(@Nullable String str) {
        this.pageName = str;
    }

    public final void setParam(@Nullable String str) {
        this.param = str;
    }

    public final void setPlay(int i7) {
        this.play = i7;
    }

    public final void setPlayedNumIconType(int i7) {
        this.playedNumIconType = i7;
    }

    public final void setPlayedNumText(@Nullable String str) {
        this.playedNumText = str;
    }

    public final void setReply(int i7) {
        this.reply = i7;
    }

    public final void setRid(int i7) {
        this.rid = i7;
    }

    public final void setRname(@Nullable String str) {
        this.rname = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setUgc_pay(int i7) {
        this.ugc_pay = i7;
    }

    public final void setUri(@Nullable String str) {
        this.uri = str;
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.cover;
        String str3 = this.uri;
        String str4 = this.param;
        String str5 = this.jumpTo;
        String str6 = this.name;
        int i7 = this.play;
        int i8 = this.danmaku;
        int i9 = this.reply;
        int i10 = this.favourite;
        int i11 = this.rid;
        String str7 = this.rname;
        int i12 = this.ugc_pay;
        boolean z6 = this.badgepay;
        String str8 = this.pageName;
        long j7 = this.duration;
        String str9 = this.playedNumText;
        int i13 = this.playedNumIconType;
        StringBuilder sbA = b.a("BangumiUgcVideoItemV2(title=", str, ", cover=", str2, ", uri=");
        B.a(str3, ", param=", str4, ", jumpTo=", sbA);
        B.a(str5, ", name=", str6, ", play=", sbA);
        C4690e.a(i7, i8, ", danmaku=", ", reply=", sbA);
        C4690e.a(i9, i10, ", favourite=", ", rid=", sbA);
        M.a(i11, ", rname=", str7, ", ugc_pay=", sbA);
        d.a(", badgepay=", ", pageName=", i12, z6, sbA);
        v.a(j7, str8, ", duration=", sbA);
        a.a(i13, ", playedNumText=", str9, ", playedNumIconType=", sbA);
        sbA.append(")");
        return sbA.toString();
    }
}
