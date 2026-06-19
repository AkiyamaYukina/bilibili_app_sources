package com.bilibili.search2.result.base;

import I.E;
import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.polymer.app.search.v1.CategorySort;
import com.bapis.bilibili.polymer.app.search.v1.UserSort;
import com.bapis.bilibili.polymer.app.search.v1.UserType;
import com.bilibili.search2.api.SearchOgvClusterRelationItem;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/x.class */
@StabilityInferred(parameters = 1)
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f87671a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f87672b = 0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/x$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a extends x {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final String f87673c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final String f87674d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f87675e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public final String f87676f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public final String f87677g;

        @NotNull
        public final String h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f87678i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f87679j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @Nullable
        public final CategorySort f87680k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @Nullable
        public final Map<String, String> f87681l;

        public a(@Nullable String str, @NotNull String str2, long j7, @Nullable String str3, @NotNull String str4, @NotNull String str5, boolean z6, int i7, @Nullable CategorySort categorySort, @Nullable Map<String, String> map) {
            this.f87673c = str;
            this.f87674d = str2;
            this.f87675e = j7;
            this.f87676f = str3;
            this.f87677g = str4;
            this.h = str5;
            this.f87678i = z6;
            this.f87679j = i7;
            this.f87680k = categorySort;
            this.f87681l = map;
        }

        @Override // com.bilibili.search2.result.base.x
        public final boolean a() {
            return this.f87678i;
        }

        @Override // com.bilibili.search2.result.base.x
        public final int b() {
            return this.f87679j;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f87673c, aVar.f87673c) && Intrinsics.areEqual(this.f87674d, aVar.f87674d) && this.f87675e == aVar.f87675e && Intrinsics.areEqual(this.f87676f, aVar.f87676f) && Intrinsics.areEqual(this.f87677g, aVar.f87677g) && Intrinsics.areEqual(this.h, aVar.h) && this.f87678i == aVar.f87678i && this.f87679j == aVar.f87679j && this.f87680k == aVar.f87680k && Intrinsics.areEqual(this.f87681l, aVar.f87681l);
        }

        public final int hashCode() {
            int iHashCode = 0;
            String str = this.f87673c;
            int iA = C3554n0.a(E.a((str == null ? 0 : str.hashCode()) * 31, 31, this.f87674d), 31, this.f87675e);
            String str2 = this.f87676f;
            int iA2 = I.a(this.f87679j, z.a(E.a(E.a((iA + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f87677g), 31, this.h), 31, this.f87678i), 31);
            CategorySort categorySort = this.f87680k;
            int iHashCode2 = categorySort == null ? 0 : categorySort.hashCode();
            Map<String, String> map = this.f87681l;
            if (map != null) {
                iHashCode = map.hashCode();
            }
            return ((iA2 + iHashCode2) * 31) + iHashCode;
        }

        @NotNull
        public final String toString() {
            return "SearchColumnParams(next=" + this.f87673c + ", keyword=" + this.f87674d + ", categoryId=" + this.f87675e + ", orderType=" + this.f87676f + ", fromSeid=" + this.f87677g + ", fromSource=" + this.h + ", reset=" + this.f87678i + ", version=" + this.f87679j + ", sort=" + this.f87680k + ", filterMap=" + this.f87681l + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/x$b.class */
    @StabilityInferred(parameters = 1)
    public static final class b extends x {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final String f87682c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f87683d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f87684e;

        public b(@Nullable String str, int i7, boolean z6) {
            this.f87682c = str;
            this.f87683d = i7;
            this.f87684e = z6;
        }

        @Override // com.bilibili.search2.result.base.x
        public final boolean a() {
            return this.f87684e;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            bVar.getClass();
            return Intrinsics.areEqual(this.f87682c, bVar.f87682c) && this.f87683d == bVar.f87683d && Intrinsics.areEqual("totalrank", "totalrank") && this.f87684e == bVar.f87684e;
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(4);
            String str = this.f87682c;
            return Boolean.hashCode(this.f87684e) + ((((Integer.hashCode(20) + I.a(this.f87683d, ((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31) - 576395920) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("SearchLiveParams(type=4, keyword=");
            sb.append(this.f87682c);
            sb.append(", pageNum=");
            sb.append(this.f87683d);
            sb.append(", pageSize=20, order=totalrank, reset=");
            return androidx.appcompat.app.i.a(sb, this.f87684e, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/x$c.class */
    @StabilityInferred(parameters = 1)
    public static final class c extends x {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final String f87685c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final String f87686d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final String f87687e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final SearchOgvClusterRelationItem.Sort f87688f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f87689g;
        public final int h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public final String f87690i = "ogv_cluster_card_landing_page_search";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f87691j;

        public c(String str, String str2, String str3, SearchOgvClusterRelationItem.Sort sort, boolean z6, int i7, boolean z7) {
            this.f87685c = str;
            this.f87686d = str2;
            this.f87687e = str3;
            this.f87688f = sort;
            this.f87689g = z6;
            this.h = i7;
            this.f87691j = z7;
        }

        @Override // com.bilibili.search2.result.base.x
        public final boolean a() {
            return this.f87689g;
        }

        @Override // com.bilibili.search2.result.base.x
        public final int b() {
            return this.h;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f87685c, cVar.f87685c) && Intrinsics.areEqual(this.f87686d, cVar.f87686d) && Intrinsics.areEqual(this.f87687e, cVar.f87687e) && this.f87688f == cVar.f87688f && this.f87689g == cVar.f87689g && this.h == cVar.h && Intrinsics.areEqual(this.f87690i, cVar.f87690i) && this.f87691j == cVar.f87691j;
        }

        public final int hashCode() {
            String str = this.f87685c;
            return Boolean.hashCode(this.f87691j) + E.a(I.a(this.h, z.a((this.f87688f.hashCode() + E.a(E.a((str == null ? 0 : str.hashCode()) * 31, 31, this.f87686d), 31, this.f87687e)) * 31, 31, this.f87689g), 31), 31, this.f87690i);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("SearchOgvAggregateParams(next=");
            sb.append(this.f87685c);
            sb.append(", keyword=");
            sb.append(this.f87686d);
            sb.append(", firstExtraWord=");
            sb.append(this.f87687e);
            sb.append(", order=");
            sb.append(this.f87688f);
            sb.append(", reset=");
            sb.append(this.f87689g);
            sb.append(", version=");
            sb.append(this.h);
            sb.append(", fromSource=");
            sb.append(this.f87690i);
            sb.append(", firstQuest=");
            return androidx.appcompat.app.i.a(sb, this.f87691j, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/x$d.class */
    @StabilityInferred(parameters = 1)
    public static final class d extends x {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final String f87692c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final String f87693d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f87694e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f87695f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f87696g;

        public d(@Nullable String str, @NotNull String str2, int i7, boolean z6, int i8) {
            this.f87692c = str;
            this.f87693d = str2;
            this.f87694e = i7;
            this.f87695f = z6;
            this.f87696g = i8;
        }

        @Override // com.bilibili.search2.result.base.x
        public final boolean a() {
            return this.f87695f;
        }

        @Override // com.bilibili.search2.result.base.x
        public final int b() {
            return this.f87696g;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.areEqual(this.f87692c, dVar.f87692c) && Intrinsics.areEqual(this.f87693d, dVar.f87693d) && this.f87694e == dVar.f87694e && this.f87695f == dVar.f87695f && this.f87696g == dVar.f87696g;
        }

        public final int hashCode() {
            String str = this.f87692c;
            return Integer.hashCode(this.f87696g) + z.a(I.a(this.f87694e, E.a((str == null ? 0 : str.hashCode()) * 31, 31, this.f87693d), 31), 31, this.f87695f);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("SearchOgvParams(next=");
            sb.append(this.f87692c);
            sb.append(", keyword=");
            sb.append(this.f87693d);
            sb.append(", type=");
            sb.append(this.f87694e);
            sb.append(", reset=");
            sb.append(this.f87695f);
            sb.append(", version=");
            return C4277b.a(this.f87696g, ")", sb);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/x$e.class */
    @StabilityInferred(parameters = 0)
    public static final class e extends x {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f87697c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f87698d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public final String f87699e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public final String f87700f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public final String f87701g;
        public final boolean h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f87702i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @Nullable
        public final UserSort f87703j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @Nullable
        public final UserType f87704k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @Nullable
        public final Map<String, String> f87705l;

        public e(@NotNull String str, int i7, @Nullable String str2, @Nullable String str3, @Nullable String str4, boolean z6, int i8, @Nullable UserSort userSort, @Nullable UserType userType, @Nullable Map map) {
            this.f87697c = str;
            this.f87698d = i7;
            this.f87699e = str2;
            this.f87700f = str3;
            this.f87701g = str4;
            this.h = z6;
            this.f87702i = i8;
            this.f87703j = userSort;
            this.f87704k = userType;
            this.f87705l = map;
        }

        @Override // com.bilibili.search2.result.base.x
        public final boolean a() {
            return this.h;
        }

        @Override // com.bilibili.search2.result.base.x
        public final int b() {
            return this.f87702i;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Intrinsics.areEqual(this.f87697c, eVar.f87697c) && this.f87698d == eVar.f87698d && Intrinsics.areEqual(this.f87699e, eVar.f87699e) && Intrinsics.areEqual(this.f87700f, eVar.f87700f) && Intrinsics.areEqual(this.f87701g, eVar.f87701g) && Intrinsics.areEqual((Object) null, (Object) null) && this.h == eVar.h && this.f87702i == eVar.f87702i && this.f87703j == eVar.f87703j && this.f87704k == eVar.f87704k && Intrinsics.areEqual(this.f87705l, eVar.f87705l);
        }

        public final int hashCode() {
            int iA = I.a(this.f87698d, this.f87697c.hashCode() * 31, 31);
            String str = this.f87699e;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.f87700f;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.f87701g;
            int iA2 = I.a(this.f87702i, z.a((((((iA + iHashCode) * 31) + iHashCode2) * 31) + (str3 == null ? 0 : str3.hashCode())) * 961, 31, this.h), 31);
            UserSort userSort = this.f87703j;
            int iHashCode3 = userSort == null ? 0 : userSort.hashCode();
            UserType userType = this.f87704k;
            int iHashCode4 = userType == null ? 0 : userType.hashCode();
            Map<String, String> map = this.f87705l;
            return ((((iA2 + iHashCode3) * 31) + iHashCode4) * 31) + (map == null ? 0 : map.hashCode());
        }

        @NotNull
        public final String toString() {
            return "SearchUserParams(keyword=" + this.f87697c + ", parseType=" + this.f87698d + ", userTypeString=" + this.f87699e + ", orderType=" + this.f87700f + ", ascend=" + this.f87701g + ", next=null, reset=" + this.h + ", version=" + this.f87702i + ", sort=" + this.f87703j + ", userType=" + this.f87704k + ", filterMap=" + this.f87705l + ")";
        }
    }

    public boolean a() {
        return this.f87671a;
    }

    public int b() {
        return this.f87672b;
    }
}
