package com.bilibili.upper.module.uppercenter.datacenter;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.B;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.search2.api.SearchBangumiItem;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenter/datacenter/DataCenterBean.class */
@StabilityInferred(parameters = 0)
@Keep
public final class DataCenterBean {
    public static final int $stable = 8;

    @JSONField(name = "addition")
    @Nullable
    private UpArchiveStatAddition addition;

    @JSONField(name = "aid")
    @Nullable
    private String avid;

    @JSONField(name = "cid")
    @Nullable
    private String cid;

    @JSONField(name = "diagnose_suggestion")
    @Nullable
    private Diagnose diagnose;

    @JSONField(name = "flexible_position")
    @Nullable
    private FlexiblePosition flexibility;

    @JSONField(name = "limit")
    @Nullable
    private LimitInfo limitInfo;

    @JSONField(name = "stats")
    @Nullable
    private List<UpArchiveState> state;

    public DataCenterBean() {
        this(null, null, null, null, null, null, null, SearchBangumiItem.TYPE_FULLNET_BANGUMI, null);
    }

    public DataCenterBean(@Nullable UpArchiveStatAddition upArchiveStatAddition, @Nullable List<UpArchiveState> list, @Nullable FlexiblePosition flexiblePosition, @Nullable Diagnose diagnose, @Nullable String str, @Nullable String str2, @Nullable LimitInfo limitInfo) {
        this.addition = upArchiveStatAddition;
        this.state = list;
        this.flexibility = flexiblePosition;
        this.diagnose = diagnose;
        this.avid = str;
        this.cid = str2;
        this.limitInfo = limitInfo;
    }

    public /* synthetic */ DataCenterBean(UpArchiveStatAddition upArchiveStatAddition, List list, FlexiblePosition flexiblePosition, Diagnose diagnose, String str, String str2, LimitInfo limitInfo, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : upArchiveStatAddition, (i7 & 2) != 0 ? null : list, (i7 & 4) != 0 ? null : flexiblePosition, (i7 & 8) != 0 ? null : diagnose, (i7 & 16) != 0 ? null : str, (i7 & 32) != 0 ? null : str2, (i7 & 64) != 0 ? null : limitInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DataCenterBean copy$default(DataCenterBean dataCenterBean, UpArchiveStatAddition upArchiveStatAddition, List list, FlexiblePosition flexiblePosition, Diagnose diagnose, String str, String str2, LimitInfo limitInfo, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            upArchiveStatAddition = dataCenterBean.addition;
        }
        if ((i7 & 2) != 0) {
            list = dataCenterBean.state;
        }
        if ((i7 & 4) != 0) {
            flexiblePosition = dataCenterBean.flexibility;
        }
        if ((i7 & 8) != 0) {
            diagnose = dataCenterBean.diagnose;
        }
        if ((i7 & 16) != 0) {
            str = dataCenterBean.avid;
        }
        if ((i7 & 32) != 0) {
            str2 = dataCenterBean.cid;
        }
        if ((i7 & 64) != 0) {
            limitInfo = dataCenterBean.limitInfo;
        }
        return dataCenterBean.copy(upArchiveStatAddition, list, flexiblePosition, diagnose, str, str2, limitInfo);
    }

    @Nullable
    public final UpArchiveStatAddition component1() {
        return this.addition;
    }

    @Nullable
    public final List<UpArchiveState> component2() {
        return this.state;
    }

    @Nullable
    public final FlexiblePosition component3() {
        return this.flexibility;
    }

    @Nullable
    public final Diagnose component4() {
        return this.diagnose;
    }

    @Nullable
    public final String component5() {
        return this.avid;
    }

    @Nullable
    public final String component6() {
        return this.cid;
    }

    @Nullable
    public final LimitInfo component7() {
        return this.limitInfo;
    }

    @NotNull
    public final DataCenterBean copy(@Nullable UpArchiveStatAddition upArchiveStatAddition, @Nullable List<UpArchiveState> list, @Nullable FlexiblePosition flexiblePosition, @Nullable Diagnose diagnose, @Nullable String str, @Nullable String str2, @Nullable LimitInfo limitInfo) {
        return new DataCenterBean(upArchiveStatAddition, list, flexiblePosition, diagnose, str, str2, limitInfo);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataCenterBean)) {
            return false;
        }
        DataCenterBean dataCenterBean = (DataCenterBean) obj;
        return Intrinsics.areEqual(this.addition, dataCenterBean.addition) && Intrinsics.areEqual(this.state, dataCenterBean.state) && Intrinsics.areEqual(this.flexibility, dataCenterBean.flexibility) && Intrinsics.areEqual(this.diagnose, dataCenterBean.diagnose) && Intrinsics.areEqual(this.avid, dataCenterBean.avid) && Intrinsics.areEqual(this.cid, dataCenterBean.cid) && Intrinsics.areEqual(this.limitInfo, dataCenterBean.limitInfo);
    }

    @Nullable
    public final UpArchiveStatAddition getAddition() {
        return this.addition;
    }

    @Nullable
    public final String getAvid() {
        return this.avid;
    }

    @Nullable
    public final String getCid() {
        return this.cid;
    }

    @Nullable
    public final Diagnose getDiagnose() {
        return this.diagnose;
    }

    @Nullable
    public final FlexiblePosition getFlexibility() {
        return this.flexibility;
    }

    @Nullable
    public final LimitInfo getLimitInfo() {
        return this.limitInfo;
    }

    @Nullable
    public final List<UpArchiveState> getState() {
        return this.state;
    }

    public int hashCode() {
        UpArchiveStatAddition upArchiveStatAddition = this.addition;
        int iHashCode = 0;
        int iHashCode2 = upArchiveStatAddition == null ? 0 : upArchiveStatAddition.hashCode();
        List<UpArchiveState> list = this.state;
        int iHashCode3 = list == null ? 0 : list.hashCode();
        FlexiblePosition flexiblePosition = this.flexibility;
        int iHashCode4 = flexiblePosition == null ? 0 : flexiblePosition.hashCode();
        Diagnose diagnose = this.diagnose;
        int iHashCode5 = diagnose == null ? 0 : diagnose.hashCode();
        String str = this.avid;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        String str2 = this.cid;
        int iHashCode7 = str2 == null ? 0 : str2.hashCode();
        LimitInfo limitInfo = this.limitInfo;
        if (limitInfo != null) {
            iHashCode = limitInfo.hashCode();
        }
        return (((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode;
    }

    public final void setAddition(@Nullable UpArchiveStatAddition upArchiveStatAddition) {
        this.addition = upArchiveStatAddition;
    }

    public final void setAvid(@Nullable String str) {
        this.avid = str;
    }

    public final void setCid(@Nullable String str) {
        this.cid = str;
    }

    public final void setDiagnose(@Nullable Diagnose diagnose) {
        this.diagnose = diagnose;
    }

    public final void setFlexibility(@Nullable FlexiblePosition flexiblePosition) {
        this.flexibility = flexiblePosition;
    }

    public final void setLimitInfo(@Nullable LimitInfo limitInfo) {
        this.limitInfo = limitInfo;
    }

    public final void setState(@Nullable List<UpArchiveState> list) {
        this.state = list;
    }

    @NotNull
    public String toString() {
        UpArchiveStatAddition upArchiveStatAddition = this.addition;
        List<UpArchiveState> list = this.state;
        FlexiblePosition flexiblePosition = this.flexibility;
        Diagnose diagnose = this.diagnose;
        String str = this.avid;
        String str2 = this.cid;
        LimitInfo limitInfo = this.limitInfo;
        StringBuilder sb = new StringBuilder("DataCenterBean(addition=");
        sb.append(upArchiveStatAddition);
        sb.append(", state=");
        sb.append(list);
        sb.append(", flexibility=");
        sb.append(flexiblePosition);
        sb.append(", diagnose=");
        sb.append(diagnose);
        sb.append(", avid=");
        B.a(str, ", cid=", str2, ", limitInfo=", sb);
        sb.append(limitInfo);
        sb.append(")");
        return sb.toString();
    }
}
