package com.bilibili.ogv.misc.follow.api.entity;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/follow/api/entity/UpdateFollowRqEntity.class */
@StabilityInferred(parameters = 0)
@Keep
public final class UpdateFollowRqEntity {
    public static final int $stable = 8;

    @NotNull
    public static final a Companion = new Object();
    private static final int MAX_MOVE_SIZE = 30;
    private int nextSegment;

    @NotNull
    private List<Segment> segments;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/follow/api/entity/UpdateFollowRqEntity$Segment.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class Segment {
        public static final int $stable = 8;

        @NotNull
        private List<String> ids = new ArrayList();
        private boolean requset;
        private boolean success;

        @NotNull
        public final List<String> getIds() {
            return this.ids;
        }

        public final boolean getRequset() {
            return this.requset;
        }

        public final boolean getSuccess() {
            return this.success;
        }

        public final void setIds(@NotNull List<String> list) {
            this.ids = list;
        }

        public final void setRequset(boolean z6) {
            this.requset = z6;
        }

        public final void setSuccess(boolean z6) {
            this.success = z6;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/follow/api/entity/UpdateFollowRqEntity$a.class */
    public static final class a {
    }

    private UpdateFollowRqEntity() {
        this.segments = CollectionsKt.emptyList();
        this.nextSegment = -1;
    }

    public /* synthetic */ UpdateFollowRqEntity(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Nullable
    public final Segment current() {
        return (Segment) CollectionsKt.getOrNull(this.segments, this.nextSegment);
    }

    public final int getNextSegment() {
        return this.nextSegment;
    }

    @NotNull
    public final List<Segment> getSegments() {
        return this.segments;
    }

    public final boolean hasNext() {
        boolean z6 = true;
        if (this.nextSegment >= this.segments.size() - 1) {
            z6 = false;
        }
        return z6;
    }

    public final boolean isPartSuccess() {
        Iterator<T> it = this.segments.iterator();
        while (it.hasNext()) {
            if (((Segment) it.next()).getSuccess()) {
                return true;
            }
        }
        return false;
    }

    public final boolean isSuccess() {
        boolean z6;
        Iterator<T> it = this.segments.iterator();
        boolean z7 = true;
        boolean success = true;
        while (true) {
            z6 = success;
            if (!it.hasNext()) {
                break;
            }
            success = z6 & ((Segment) it.next()).getSuccess();
        }
        if (this.segments.isEmpty() || !z6) {
            z7 = false;
        }
        return z7;
    }

    public final void markCurrentFail() {
        Segment segmentCurrent = current();
        if (segmentCurrent != null) {
            segmentCurrent.setSuccess(false);
        }
    }

    public final void markCurrentSuccess() {
        Segment segmentCurrent = current();
        if (segmentCurrent != null) {
            segmentCurrent.setSuccess(true);
        }
    }

    @Nullable
    public final Segment next() {
        int i7 = this.nextSegment + 1;
        this.nextSegment = i7;
        return (Segment) CollectionsKt.getOrNull(this.segments, i7);
    }

    public final void setNextSegment(int i7) {
        this.nextSegment = i7;
    }

    public final void setSegments(@NotNull List<Segment> list) {
        this.segments = list;
    }
}
