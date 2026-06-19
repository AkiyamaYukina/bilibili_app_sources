package com.bilibili.pegasus.components.interest.ui.common;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.pegasus.components.interest.ui.reporter.InterestPageCloseReason;
import com.bilibili.pegasus.components.interest.ui.reporter.InterestPageType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/common/j.class */
@StabilityInferred(parameters = 1)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final InterestPageType f76397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final InterestPageCloseReason f76398b;

    public j() {
        this((InterestPageType) null, 3);
    }

    public /* synthetic */ j(InterestPageType interestPageType, int i7) {
        this((i7 & 1) != 0 ? null : interestPageType, InterestPageCloseReason.THREE_POINT);
    }

    public j(@Nullable InterestPageType interestPageType, @NotNull InterestPageCloseReason interestPageCloseReason) {
        this.f76397a = interestPageType;
        this.f76398b = interestPageCloseReason;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f76397a == jVar.f76397a && this.f76398b == jVar.f76398b;
    }

    public final int hashCode() {
        InterestPageType interestPageType = this.f76397a;
        return this.f76398b.hashCode() + ((interestPageType == null ? 0 : interestPageType.hashCode()) * 31);
    }

    @NotNull
    public final String toString() {
        return "InterestSkipState(pageType=" + this.f76397a + ", closeType=" + this.f76398b + ")";
    }
}
