package com.bilibili.ship.theseus.ogv.videopiece;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.adcommon.data.model.AdBrandData;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videopiece/c.class */
@StabilityInferred(parameters = 1)
public final class c {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videopiece/c$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final AdBrandData f94812b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f94811a = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f94813c = 0;

        public a(AdBrandData adBrandData) {
            this.f94812b = adBrandData;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f94811a == aVar.f94811a && Intrinsics.areEqual(this.f94812b, aVar.f94812b) && this.f94813c == aVar.f94813c;
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f94811a);
            return Integer.hashCode(this.f94813c) + ((this.f94812b.hashCode() + (iHashCode * 31)) * 31);
        }

        @NotNull
        public final String toString() {
            boolean z6 = this.f94811a;
            int i7 = this.f94813c;
            StringBuilder sbB = androidx.core.content.d.b("MessageTrigger(isTriggered=", ", brandData=", z6);
            sbB.append(this.f94812b);
            sbB.append(", count=");
            sbB.append(i7);
            sbB.append(")");
            return sbB.toString();
        }
    }

    public static boolean a(c cVar, long j7, AdBrandData adBrandData) {
        cVar.getClass();
        long j8 = Duration.getInWholeMilliseconds-impl(j7);
        String startTime = adBrandData.getStartTime();
        Long longOrNull = startTime != null ? StringsKt.toLongOrNull(startTime) : null;
        String endTime = adBrandData.getEndTime();
        Long longOrNull2 = null;
        if (endTime != null) {
            longOrNull2 = StringsKt.toLongOrNull(endTime);
        }
        boolean z6 = false;
        if (longOrNull != null) {
            if (longOrNull2 == null) {
                z6 = false;
            } else {
                long jLongValue = longOrNull.longValue();
                long jLongValue2 = longOrNull2.longValue();
                z6 = false;
                if (jLongValue - 500 <= j8) {
                    z6 = false;
                    if (j8 <= jLongValue2 + 500) {
                        z6 = true;
                    }
                }
            }
        }
        return z6;
    }
}
