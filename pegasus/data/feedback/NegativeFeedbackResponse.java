package com.bilibili.pegasus.data.feedback;

import androidx.annotation.Keep;
import com.bapis.bilibili.account.interfaces.v1.k;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/data/feedback/NegativeFeedbackResponse.class */
@Keep
public final class NegativeFeedbackResponse {

    @SerializedName("three_point_v5")
    @Nullable
    private final List<ThreePointV5> threePointV5;

    public NegativeFeedbackResponse() {
        this(null, 1, null);
    }

    public NegativeFeedbackResponse(@Nullable List<ThreePointV5> list) {
        this.threePointV5 = list;
    }

    public /* synthetic */ NegativeFeedbackResponse(List list, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NegativeFeedbackResponse copy$default(NegativeFeedbackResponse negativeFeedbackResponse, List list, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            list = negativeFeedbackResponse.threePointV5;
        }
        return negativeFeedbackResponse.copy(list);
    }

    @Nullable
    public final List<ThreePointV5> component1() {
        return this.threePointV5;
    }

    @NotNull
    public final NegativeFeedbackResponse copy(@Nullable List<ThreePointV5> list) {
        return new NegativeFeedbackResponse(list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NegativeFeedbackResponse) && Intrinsics.areEqual(this.threePointV5, ((NegativeFeedbackResponse) obj).threePointV5);
    }

    @Nullable
    public final List<ThreePointV5> getThreePointV5() {
        return this.threePointV5;
    }

    public int hashCode() {
        List<ThreePointV5> list = this.threePointV5;
        return list == null ? 0 : list.hashCode();
    }

    @NotNull
    public String toString() {
        return k.a("NegativeFeedbackResponse(threePointV5=", ")", this.threePointV5);
    }
}
