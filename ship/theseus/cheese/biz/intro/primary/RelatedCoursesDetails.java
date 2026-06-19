package com.bilibili.ship.theseus.cheese.biz.intro.primary;

import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.analytics.C4665g;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/RelatedCoursesDetails.class */
@StabilityInferred(parameters = 0)
@Bson
public final class RelatedCoursesDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f89661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<Item> f89662b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/RelatedCoursesDetails$Item.class */
    @StabilityInferred(parameters = 0)
    @Bson
    public static final class Item {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f89663a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Price f89664b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final Price f89665c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @SerializedName("is_paid")
        private final boolean f89666d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final String f89667e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f89668f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public final String f89669g;
        public final boolean h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public final String f89670i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        public final String f89671j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NotNull
        public final Map<String, String> f89672k;

        public Item(@NotNull String str, @NotNull Price price, @NotNull Price price2, boolean z6, @NotNull String str2, long j7, @NotNull String str3, boolean z7, @NotNull String str4, @NotNull String str5, @NotNull Map<String, String> map) {
            this.f89663a = str;
            this.f89664b = price;
            this.f89665c = price2;
            this.f89666d = z6;
            this.f89667e = str2;
            this.f89668f = j7;
            this.f89669g = str3;
            this.h = z7;
            this.f89670i = str4;
            this.f89671j = str5;
            this.f89672k = map;
        }

        public final boolean a() {
            return this.f89666d;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return Intrinsics.areEqual(this.f89663a, item.f89663a) && Intrinsics.areEqual(this.f89664b, item.f89664b) && Intrinsics.areEqual(this.f89665c, item.f89665c) && this.f89666d == item.f89666d && Intrinsics.areEqual(this.f89667e, item.f89667e) && this.f89668f == item.f89668f && Intrinsics.areEqual(this.f89669g, item.f89669g) && this.h == item.h && Intrinsics.areEqual(this.f89670i, item.f89670i) && Intrinsics.areEqual(this.f89671j, item.f89671j) && Intrinsics.areEqual(this.f89672k, item.f89672k);
        }

        public final int hashCode() {
            int iHashCode = this.f89663a.hashCode();
            return this.f89672k.hashCode() + I.E.a(I.E.a(androidx.compose.animation.z.a(I.E.a(C3554n0.a(I.E.a(androidx.compose.animation.z.a((this.f89665c.hashCode() + ((this.f89664b.hashCode() + (iHashCode * 31)) * 31)) * 31, 31, this.f89666d), 31, this.f89667e), 31, this.f89668f), 31, this.f89669g), 31, this.h), 31, this.f89670i), 31, this.f89671j);
        }

        @NotNull
        public final String toString() {
            boolean z6 = this.f89666d;
            Map<String, String> map = this.f89672k;
            StringBuilder sb = new StringBuilder("Item(epCountDesc=");
            sb.append(this.f89663a);
            sb.append(", originPriceModel=");
            sb.append(this.f89664b);
            sb.append(", salePriceModel=");
            sb.append(this.f89665c);
            sb.append(", owned=");
            sb.append(z6);
            sb.append(", seasonCover=");
            sb.append(this.f89667e);
            sb.append(", seasonId=");
            sb.append(this.f89668f);
            sb.append(", seasonTitle=");
            sb.append(this.f89669g);
            sb.append(", selected=");
            sb.append(this.h);
            sb.append(", viewsDesc=");
            sb.append(this.f89670i);
            sb.append(", tab=");
            return C4665g.a(sb, this.f89671j, ", report=", map, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/RelatedCoursesDetails$Price.class */
    @StabilityInferred(parameters = 1)
    @Bson
    public static final class Price {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f89673a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f89674b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f89675c;

        public Price(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            this.f89673a = str;
            this.f89674b = str2;
            this.f89675c = str3;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Price)) {
                return false;
            }
            Price price = (Price) obj;
            return Intrinsics.areEqual(this.f89673a, price.f89673a) && Intrinsics.areEqual(this.f89674b, price.f89674b) && Intrinsics.areEqual(this.f89675c, price.f89675c);
        }

        public final int hashCode() {
            return this.f89675c.hashCode() + I.E.a(this.f89673a.hashCode() * 31, 31, this.f89674b);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Price(price=");
            sb.append(this.f89673a);
            sb.append(", priceSuffixText=");
            sb.append(this.f89674b);
            sb.append(", priceUnit=");
            return C8770a.a(sb, this.f89675c, ")");
        }
    }

    public RelatedCoursesDetails(@NotNull String str, @NotNull List<Item> list) {
        this.f89661a = str;
        this.f89662b = list;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RelatedCoursesDetails)) {
            return false;
        }
        RelatedCoursesDetails relatedCoursesDetails = (RelatedCoursesDetails) obj;
        return Intrinsics.areEqual(this.f89661a, relatedCoursesDetails.f89661a) && Intrinsics.areEqual(this.f89662b, relatedCoursesDetails.f89662b);
    }

    public final int hashCode() {
        return this.f89662b.hashCode() + (this.f89661a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        List<Item> list = this.f89662b;
        return N1.o.a(this.f89661a, ", combineList=", ")", new StringBuilder("RelatedCoursesDetails(title="), list);
    }
}
