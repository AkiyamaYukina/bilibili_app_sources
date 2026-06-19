package com.bilibili.ship.theseus.cheese.biz.intro.primary;

import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/RelatedCourses.class */
@StabilityInferred(parameters = 0)
@Bson
public final class RelatedCourses {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f89654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f89655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<Item> f89656c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/RelatedCourses$Item.class */
    @StabilityInferred(parameters = 0)
    @Bson
    public static final class Item {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f89657a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f89658b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f89659c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final Map<String, String> f89660d;

        public Item(@NotNull String str, long j7, boolean z6, @NotNull Map<String, String> map) {
            this.f89657a = str;
            this.f89658b = j7;
            this.f89659c = z6;
            this.f89660d = map;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return Intrinsics.areEqual(this.f89657a, item.f89657a) && this.f89658b == item.f89658b && this.f89659c == item.f89659c && Intrinsics.areEqual(this.f89660d, item.f89660d);
        }

        public final int hashCode() {
            return this.f89660d.hashCode() + androidx.compose.animation.z.a(C3554n0.a(this.f89657a.hashCode() * 31, 31, this.f89658b), 31, this.f89659c);
        }

        @NotNull
        public final String toString() {
            return "Item(title=" + this.f89657a + ", seasonId=" + this.f89658b + ", selected=" + this.f89659c + ", report=" + this.f89660d + ")";
        }
    }

    public RelatedCourses(long j7, @NotNull List list, @NotNull String str) {
        this.f89654a = j7;
        this.f89655b = str;
        this.f89656c = list;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RelatedCourses)) {
            return false;
        }
        RelatedCourses relatedCourses = (RelatedCourses) obj;
        return this.f89654a == relatedCourses.f89654a && Intrinsics.areEqual(this.f89655b, relatedCourses.f89655b) && Intrinsics.areEqual(this.f89656c, relatedCourses.f89656c);
    }

    public final int hashCode() {
        return this.f89656c.hashCode() + I.E.a(Long.hashCode(this.f89654a) * 31, 31, this.f89655b);
    }

    @NotNull
    public final String toString() {
        List<Item> list = this.f89656c;
        StringBuilder sb = new StringBuilder("RelatedCourses(id=");
        sb.append(this.f89654a);
        sb.append(", title=");
        return N1.o.a(this.f89655b, ", items=", ")", sb, list);
    }
}
