package com.bilibili.topix.compose.create;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.topix.model.TopicCreationResult;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/compose/create/E.class */
@StabilityInferred(parameters = 0)
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final TopicCreationResult f112461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Throwable f112462b;

    public E(@Nullable TopicCreationResult topicCreationResult, @Nullable Throwable th) {
        this.f112461a = topicCreationResult;
        this.f112462b = th;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e7 = (E) obj;
        return Intrinsics.areEqual(this.f112461a, e7.f112461a) && Intrinsics.areEqual(this.f112462b, e7.f112462b);
    }

    public final int hashCode() {
        int iHashCode = 0;
        TopicCreationResult topicCreationResult = this.f112461a;
        int iHashCode2 = topicCreationResult == null ? 0 : topicCreationResult.hashCode();
        Throwable th = this.f112462b;
        if (th != null) {
            iHashCode = th.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    @NotNull
    public final String toString() {
        return "TopicCreateState(result=" + this.f112461a + ", error=" + this.f112462b + ")";
    }
}
