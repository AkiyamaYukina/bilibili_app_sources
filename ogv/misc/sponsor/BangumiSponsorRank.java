package com.bilibili.ogv.misc.sponsor;

import androidx.compose.ui.graphics.f0;
import com.bilibili.bangumi.data.page.sponsor.BangumiSponsorMineRank;
import com.bilibili.bangumi.data.page.sponsor.BangumiSponsorRankUser;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/sponsor/BangumiSponsorRank.class */
@Bson
public class BangumiSponsorRank {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f69333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("mine")
    public BangumiSponsorMineRank f69334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<BangumiSponsorRankUser> f69335c;

    public final boolean equals(Object obj) {
        boolean zEquals = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BangumiSponsorRank)) {
            return false;
        }
        BangumiSponsorRank bangumiSponsorRank = (BangumiSponsorRank) obj;
        BangumiSponsorMineRank bangumiSponsorMineRank = this.f69334b;
        if (bangumiSponsorMineRank != null) {
            if (!bangumiSponsorMineRank.equals(bangumiSponsorRank.f69334b)) {
                return false;
            }
        } else if (bangumiSponsorRank.f69334b != null) {
            return false;
        }
        List<BangumiSponsorRankUser> list = this.f69335c;
        List<BangumiSponsorRankUser> list2 = bangumiSponsorRank.f69335c;
        if (list != null) {
            zEquals = list.equals(list2);
        } else if (list2 != null) {
            zEquals = false;
        }
        return zEquals;
    }

    public final int hashCode() {
        int i7 = this.f69333a;
        BangumiSponsorMineRank bangumiSponsorMineRank = this.f69334b;
        int iHashCode = 0;
        int iHashCode2 = bangumiSponsorMineRank != null ? bangumiSponsorMineRank.hashCode() : 0;
        List<BangumiSponsorRankUser> list = this.f69335c;
        if (list != null) {
            iHashCode = list.hashCode();
        }
        return (((i7 * 31) + iHashCode2) * 31) + iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BangumiSponsorRank{, myRank=");
        sb.append(this.f69334b);
        sb.append(", mLists=");
        return f0.a(sb, this.f69335c, '}');
    }
}
