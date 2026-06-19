package com.bilibili.music.podcast.legacy.data;

import B0.b;
import G0.d;
import I.E;
import androidx.annotation.Keep;
import androidx.compose.animation.C3353d;
import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.compose.foundation.C3554n0;
import androidx.room.B;
import bf.a;
import cf.i;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.ad.adview.pegasus.banner.topview.res.n;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/legacy/data/ContributionPage.class */
@Keep
public final class ContributionPage {

    @Nullable
    private ArrayList<Contribution> list;
    private int pageNum;
    private int pages;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/legacy/data/ContributionPage$Contribution.class */
    @Keep
    public static final class Contribution {

        @JSONField(name = "music_type_name")
        @Nullable
        private String category;

        @JSONField(name = "coin_num")
        private long coinNum;

        @JSONField(name = "collection_num")
        private long collectNum;

        @JSONField(name = "comment_num")
        private long commentNum;

        @JSONField(name = "is_cooper")
        private int contributor;

        @JSONField(name = "cooper_status")
        private int contributorStatus;

        @JSONField(name = "cover_url")
        @NotNull
        private String coverUrl;

        @Nullable
        private String ctime;

        @JSONField(name = "song_id")
        private long id;

        @Nullable
        private String intro;
        private boolean isOff;
        private long mid;

        @JSONField(name = "play_num")
        private long playNum;

        @Nullable
        private String reason;
        private int status;

        @NotNull
        private String title;

        public Contribution() {
            this(0L, null, null, null, null, 0L, 0L, 0L, 0L, false, 0, 0L, null, null, 0, 0, 65535, null);
        }

        public Contribution(long j7, @NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4, long j8, long j9, long j10, long j11, boolean z6, int i7, long j12, @Nullable String str5, @Nullable String str6, int i8, int i9) {
            this.id = j7;
            this.title = str;
            this.coverUrl = str2;
            this.intro = str3;
            this.ctime = str4;
            this.playNum = j8;
            this.collectNum = j9;
            this.commentNum = j10;
            this.coinNum = j11;
            this.isOff = z6;
            this.status = i7;
            this.mid = j12;
            this.reason = str5;
            this.category = str6;
            this.contributor = i8;
            this.contributorStatus = i9;
        }

        public /* synthetic */ Contribution(long j7, String str, String str2, String str3, String str4, long j8, long j9, long j10, long j11, boolean z6, int i7, long j12, String str5, String str6, int i8, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? 0L : j7, (i10 & 2) != 0 ? "" : str, (i10 & 4) != 0 ? "" : str2, (i10 & 8) != 0 ? "" : str3, (i10 & 16) != 0 ? "" : str4, (i10 & 32) != 0 ? 0L : j8, (i10 & 64) != 0 ? 0L : j9, (i10 & 128) != 0 ? 0L : j10, (i10 & 256) != 0 ? 0L : j11, (i10 & 512) != 0 ? false : z6, (i10 & 1024) != 0 ? 2 : i7, (i10 & 2048) != 0 ? 0L : j12, (i10 & 4096) != 0 ? "" : str5, (i10 & 8192) != 0 ? "" : str6, (i10 & 16384) != 0 ? 0 : i8, (i10 & 32768) != 0 ? 0 : i9);
        }

        public static /* synthetic */ Contribution copy$default(Contribution contribution, long j7, String str, String str2, String str3, String str4, long j8, long j9, long j10, long j11, boolean z6, int i7, long j12, String str5, String str6, int i8, int i9, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j7 = contribution.id;
            }
            if ((i10 & 2) != 0) {
                str = contribution.title;
            }
            if ((i10 & 4) != 0) {
                str2 = contribution.coverUrl;
            }
            if ((i10 & 8) != 0) {
                str3 = contribution.intro;
            }
            if ((i10 & 16) != 0) {
                str4 = contribution.ctime;
            }
            if ((i10 & 32) != 0) {
                j8 = contribution.playNum;
            }
            if ((i10 & 64) != 0) {
                j9 = contribution.collectNum;
            }
            if ((i10 & 128) != 0) {
                j10 = contribution.commentNum;
            }
            if ((i10 & 256) != 0) {
                j11 = contribution.coinNum;
            }
            if ((i10 & 512) != 0) {
                z6 = contribution.isOff;
            }
            if ((i10 & 1024) != 0) {
                i7 = contribution.status;
            }
            if ((i10 & 2048) != 0) {
                j12 = contribution.mid;
            }
            if ((i10 & 4096) != 0) {
                str5 = contribution.reason;
            }
            if ((i10 & 8192) != 0) {
                str6 = contribution.category;
            }
            if ((i10 & 16384) != 0) {
                i8 = contribution.contributor;
            }
            if ((i10 & 32768) != 0) {
                i9 = contribution.contributorStatus;
            }
            return contribution.copy(j7, str, str2, str3, str4, j8, j9, j10, j11, z6, i7, j12, str5, str6, i8, i9);
        }

        public final long component1() {
            return this.id;
        }

        public final boolean component10() {
            return this.isOff;
        }

        public final int component11() {
            return this.status;
        }

        public final long component12() {
            return this.mid;
        }

        @Nullable
        public final String component13() {
            return this.reason;
        }

        @Nullable
        public final String component14() {
            return this.category;
        }

        public final int component15() {
            return this.contributor;
        }

        public final int component16() {
            return this.contributorStatus;
        }

        @NotNull
        public final String component2() {
            return this.title;
        }

        @NotNull
        public final String component3() {
            return this.coverUrl;
        }

        @Nullable
        public final String component4() {
            return this.intro;
        }

        @Nullable
        public final String component5() {
            return this.ctime;
        }

        public final long component6() {
            return this.playNum;
        }

        public final long component7() {
            return this.collectNum;
        }

        public final long component8() {
            return this.commentNum;
        }

        public final long component9() {
            return this.coinNum;
        }

        @NotNull
        public final Contribution copy(long j7, @NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4, long j8, long j9, long j10, long j11, boolean z6, int i7, long j12, @Nullable String str5, @Nullable String str6, int i8, int i9) {
            return new Contribution(j7, str, str2, str3, str4, j8, j9, j10, j11, z6, i7, j12, str5, str6, i8, i9);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Contribution)) {
                return false;
            }
            Contribution contribution = (Contribution) obj;
            return this.id == contribution.id && Intrinsics.areEqual(this.title, contribution.title) && Intrinsics.areEqual(this.coverUrl, contribution.coverUrl) && Intrinsics.areEqual(this.intro, contribution.intro) && Intrinsics.areEqual(this.ctime, contribution.ctime) && this.playNum == contribution.playNum && this.collectNum == contribution.collectNum && this.commentNum == contribution.commentNum && this.coinNum == contribution.coinNum && this.isOff == contribution.isOff && this.status == contribution.status && this.mid == contribution.mid && Intrinsics.areEqual(this.reason, contribution.reason) && Intrinsics.areEqual(this.category, contribution.category) && this.contributor == contribution.contributor && this.contributorStatus == contribution.contributorStatus;
        }

        @Nullable
        public final String getCategory() {
            return this.category;
        }

        public final long getCoinNum() {
            return this.coinNum;
        }

        public final long getCollectNum() {
            return this.collectNum;
        }

        public final long getCommentNum() {
            return this.commentNum;
        }

        public final int getContributor() {
            return this.contributor;
        }

        public final int getContributorStatus() {
            return this.contributorStatus;
        }

        @NotNull
        public final String getCoverUrl() {
            return this.coverUrl;
        }

        @Nullable
        public final String getCtime() {
            return this.ctime;
        }

        public final long getId() {
            return this.id;
        }

        @Nullable
        public final String getIntro() {
            return this.intro;
        }

        public final long getMid() {
            return this.mid;
        }

        public final long getPlayNum() {
            return this.playNum;
        }

        @Nullable
        public final String getReason() {
            return this.reason;
        }

        public final int getStatus() {
            return this.status;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iA = E.a(E.a(Long.hashCode(this.id) * 31, 31, this.title), 31, this.coverUrl);
            String str = this.intro;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.ctime;
            int iA2 = C3554n0.a(I.a(this.status, z.a(C3554n0.a(C3554n0.a(C3554n0.a(C3554n0.a((((iA + iHashCode) * 31) + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.playNum), 31, this.collectNum), 31, this.commentNum), 31, this.coinNum), 31, this.isOff), 31), 31, this.mid);
            String str3 = this.reason;
            int iHashCode2 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.category;
            return Integer.hashCode(this.contributorStatus) + I.a(this.contributor, (((iA2 + iHashCode2) * 31) + (str4 == null ? 0 : str4.hashCode())) * 31, 31);
        }

        public final boolean isContributor() {
            boolean z6 = true;
            if (this.contributor != 1) {
                z6 = false;
            }
            return z6;
        }

        public final boolean isOff() {
            return this.isOff;
        }

        public final void setCategory(@Nullable String str) {
            this.category = str;
        }

        public final void setCoinNum(long j7) {
            this.coinNum = j7;
        }

        public final void setCollectNum(long j7) {
            this.collectNum = j7;
        }

        public final void setCommentNum(long j7) {
            this.commentNum = j7;
        }

        public final void setContributor(int i7) {
            this.contributor = i7;
        }

        public final void setContributorStatus(int i7) {
            this.contributorStatus = i7;
        }

        public final void setCoverUrl(@NotNull String str) {
            this.coverUrl = str;
        }

        public final void setCtime(@Nullable String str) {
            this.ctime = str;
        }

        public final void setId(long j7) {
            this.id = j7;
        }

        public final void setIntro(@Nullable String str) {
            this.intro = str;
        }

        public final void setMid(long j7) {
            this.mid = j7;
        }

        public final void setOff(boolean z6) {
            this.isOff = z6;
        }

        public final void setPlayNum(long j7) {
            this.playNum = j7;
        }

        public final void setReason(@Nullable String str) {
            this.reason = str;
        }

        public final void setStatus(int i7) {
            this.status = i7;
        }

        public final void setTitle(@NotNull String str) {
            this.title = str;
        }

        @NotNull
        public String toString() {
            long j7 = this.id;
            String str = this.title;
            String str2 = this.coverUrl;
            String str3 = this.intro;
            String str4 = this.ctime;
            long j8 = this.playNum;
            long j9 = this.collectNum;
            long j10 = this.commentNum;
            long j11 = this.coinNum;
            boolean z6 = this.isOff;
            int i7 = this.status;
            long j12 = this.mid;
            String str5 = this.reason;
            String str6 = this.category;
            int i8 = this.contributor;
            int i9 = this.contributorStatus;
            StringBuilder sbA = n.a(j7, "Contribution(id=", ", title=", str);
            B.a(", coverUrl=", str2, ", intro=", str3, sbA);
            b.b(", ctime=", str4, ", playNum=", sbA);
            sbA.append(j8);
            J1.z.a(j9, ", collectNum=", ", commentNum=", sbA);
            sbA.append(j10);
            J1.z.a(j11, ", coinNum=", ", isOff=", sbA);
            C3353d.b(", status=", ", mid=", i7, z6, sbA);
            d.a(j12, ", reason=", str5, sbA);
            a.a(i8, ", category=", str6, ", contributor=", sbA);
            return i.a(i9, ", contributorStatus=", ")", sbA);
        }
    }

    public ContributionPage() {
        this(0, 0, null, 7, null);
    }

    public ContributionPage(int i7, int i8, @Nullable ArrayList<Contribution> arrayList) {
        this.pageNum = i7;
        this.pages = i8;
        this.list = arrayList;
    }

    public /* synthetic */ ContributionPage(int i7, int i8, ArrayList arrayList, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? 0 : i7, (i9 & 2) != 0 ? 0 : i8, (i9 & 4) != 0 ? new ArrayList() : arrayList);
    }

    @Nullable
    public final ArrayList<Contribution> getList() {
        return this.list;
    }

    public final int getPageNum() {
        return this.pageNum;
    }

    public final int getPages() {
        return this.pages;
    }

    public final void setList(@Nullable ArrayList<Contribution> arrayList) {
        this.list = arrayList;
    }

    public final void setPageNum(int i7) {
        this.pageNum = i7;
    }

    public final void setPages(int i7) {
        this.pages = i7;
    }
}
