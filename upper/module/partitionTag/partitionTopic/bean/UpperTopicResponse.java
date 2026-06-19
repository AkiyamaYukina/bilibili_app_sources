package com.bilibili.upper.module.partitionTag.partitionTopic.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.B;
import com.bilibili.upper.api.bean.topic.UpperPublishTopicBean;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitionTopic/bean/UpperTopicResponse.class */
@StabilityInferred(parameters = 0)
@Keep
public final class UpperTopicResponse {
    public static final int $stable = 8;

    @Nullable
    private final List<UpperPublishTopicBean.Topic> addedSection;

    @Nullable
    private final String errorMsg;
    private final boolean isFirst;
    private final boolean success;

    public UpperTopicResponse(boolean z6, @Nullable List<? extends UpperPublishTopicBean.Topic> list, @Nullable String str, boolean z7) {
        this.success = z6;
        this.addedSection = list;
        this.errorMsg = str;
        this.isFirst = z7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpperTopicResponse copy$default(UpperTopicResponse upperTopicResponse, boolean z6, List list, String str, boolean z7, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z6 = upperTopicResponse.success;
        }
        if ((i7 & 2) != 0) {
            list = upperTopicResponse.addedSection;
        }
        if ((i7 & 4) != 0) {
            str = upperTopicResponse.errorMsg;
        }
        if ((i7 & 8) != 0) {
            z7 = upperTopicResponse.isFirst;
        }
        return upperTopicResponse.copy(z6, list, str, z7);
    }

    public final boolean component1() {
        return this.success;
    }

    @Nullable
    public final List<UpperPublishTopicBean.Topic> component2() {
        return this.addedSection;
    }

    @Nullable
    public final String component3() {
        return this.errorMsg;
    }

    public final boolean component4() {
        return this.isFirst;
    }

    @NotNull
    public final UpperTopicResponse copy(boolean z6, @Nullable List<? extends UpperPublishTopicBean.Topic> list, @Nullable String str, boolean z7) {
        return new UpperTopicResponse(z6, list, str, z7);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpperTopicResponse)) {
            return false;
        }
        UpperTopicResponse upperTopicResponse = (UpperTopicResponse) obj;
        return this.success == upperTopicResponse.success && Intrinsics.areEqual(this.addedSection, upperTopicResponse.addedSection) && Intrinsics.areEqual(this.errorMsg, upperTopicResponse.errorMsg) && this.isFirst == upperTopicResponse.isFirst;
    }

    @Nullable
    public final List<UpperPublishTopicBean.Topic> getAddedSection() {
        return this.addedSection;
    }

    @Nullable
    public final String getErrorMsg() {
        return this.errorMsg;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.success);
        List<UpperPublishTopicBean.Topic> list = this.addedSection;
        int iHashCode2 = 0;
        int iHashCode3 = list == null ? 0 : list.hashCode();
        String str = this.errorMsg;
        if (str != null) {
            iHashCode2 = str.hashCode();
        }
        return Boolean.hashCode(this.isFirst) + (((((iHashCode * 31) + iHashCode3) * 31) + iHashCode2) * 31);
    }

    public final boolean isFirst() {
        return this.isFirst;
    }

    @NotNull
    public String toString() {
        boolean z6 = this.success;
        List<UpperPublishTopicBean.Topic> list = this.addedSection;
        String str = this.errorMsg;
        boolean z7 = this.isFirst;
        StringBuilder sb = new StringBuilder("UpperTopicResponse(success=");
        sb.append(z6);
        sb.append(", addedSection=");
        sb.append(list);
        sb.append(", errorMsg=");
        return B.c(str, ", isFirst=", ")", sb, z7);
    }
}
