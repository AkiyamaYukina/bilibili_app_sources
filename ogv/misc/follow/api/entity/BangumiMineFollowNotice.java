package com.bilibili.ogv.misc.follow.api.entity;

import com.bilibili.bson.common.Bson;
import com.bilibili.ogvcommon.play.vo.base.ReportVo;
import com.google.gson.annotations.SerializedName;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/follow/api/entity/BangumiMineFollowNotice.class */
@Bson
public final class BangumiMineFollowNotice {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f69108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f69109b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f69110c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("button_name")
    public String f69111d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("button_link")
    public String f69112e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ReportVo f69113f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SerializedName("order_report_params")
    public Map<String, String> f69114g;

    public final boolean equals(Object obj) {
        boolean zEquals = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || BangumiMineFollowNotice.class != obj.getClass()) {
            return false;
        }
        BangumiMineFollowNotice bangumiMineFollowNotice = (BangumiMineFollowNotice) obj;
        if (this.f69108a != bangumiMineFollowNotice.f69108a) {
            return false;
        }
        String str = this.f69109b;
        if (str != null) {
            if (!str.equals(bangumiMineFollowNotice.f69109b)) {
                return false;
            }
        } else if (bangumiMineFollowNotice.f69109b != null) {
            return false;
        }
        String str2 = this.f69110c;
        if (str2 != null) {
            if (!str2.equals(bangumiMineFollowNotice.f69110c)) {
                return false;
            }
        } else if (bangumiMineFollowNotice.f69110c != null) {
            return false;
        }
        String str3 = this.f69111d;
        if (str3 != null) {
            if (!str3.equals(bangumiMineFollowNotice.f69111d)) {
                return false;
            }
        } else if (bangumiMineFollowNotice.f69111d != null) {
            return false;
        }
        String str4 = this.f69112e;
        if (str4 != null) {
            if (!str4.equals(bangumiMineFollowNotice.f69112e)) {
                return false;
            }
        } else if (bangumiMineFollowNotice.f69112e != null) {
            return false;
        }
        ReportVo reportVo = this.f69113f;
        ReportVo reportVo2 = bangumiMineFollowNotice.f69113f;
        if (reportVo != null) {
            zEquals = reportVo.equals(reportVo2);
        } else if (reportVo2 != null) {
            zEquals = false;
        }
        return zEquals;
    }

    public final int hashCode() {
        int i7 = this.f69108a;
        String str = this.f69109b;
        int iHashCode = 0;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.f69110c;
        int iHashCode3 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.f69111d;
        int iHashCode4 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.f69112e;
        int iHashCode5 = str4 != null ? str4.hashCode() : 0;
        ReportVo reportVo = this.f69113f;
        if (reportVo != null) {
            iHashCode = reportVo.hashCode();
        }
        return (((((((((i7 * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode;
    }
}
