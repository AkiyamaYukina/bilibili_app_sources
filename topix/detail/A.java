package com.bilibili.topix.detail;

import androidx.appcompat.app.i;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bus.IIdentifiedData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/detail/A.class */
@StabilityInferred(parameters = 0)
public final class A implements IIdentifiedData<Long> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f112599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f112600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f112601c;

    public A() {
        this(0L, 0L, false);
    }

    public A(long j7, long j8, boolean z6) {
        this.f112599a = j7;
        this.f112600b = j8;
        this.f112601c = z6;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a7 = (A) obj;
        return this.f112599a == a7.f112599a && this.f112600b == a7.f112600b && this.f112601c == a7.f112601c;
    }

    public final Object getId() {
        return Long.valueOf(this.f112599a);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f112601c) + C3554n0.a(Long.hashCode(this.f112599a) * 31, 31, this.f112600b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("TopicLikeUpdateMessage(topicId=");
        sb.append(this.f112599a);
        sb.append(", likeNum=");
        sb.append(this.f112600b);
        sb.append(", isLike=");
        return i.a(sb, this.f112601c, ")");
    }
}
