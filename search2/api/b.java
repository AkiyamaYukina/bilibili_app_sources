package com.bilibili.search2.api;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.B;
import com.bapis.bilibili.polymer.app.search.v1.SaleInfo;
import com.bilibili.search2.api.SearchBangumiItem;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/b.class */
@StabilityInferred(parameters = 0)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f86293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f86294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f86295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Tag f86296d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final String f86297e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final SearchBangumiItem.PurchaseButton f86298f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final String f86299g;

    @Nullable
    public final String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final String f86300i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f86301j;

    public b() {
        this(0);
    }

    public b(int i7) {
        this.f86293a = null;
        this.f86294b = null;
        this.f86295c = null;
        this.f86296d = null;
        this.f86297e = null;
        this.f86298f = null;
        this.f86299g = null;
        this.h = null;
        this.f86300i = null;
        this.f86301j = false;
    }

    public b(@NotNull SaleInfo saleInfo) {
        this(0);
        this.f86293a = saleInfo.getIcon();
        this.f86294b = saleInfo.getIconNight();
        this.f86295c = saleInfo.getTitle();
        this.f86296d = new Tag(saleInfo.getLabel());
        this.f86297e = saleInfo.getDesc();
        this.f86298f = new SearchBangumiItem.PurchaseButton(saleInfo.getButton());
        this.f86299g = saleInfo.getVipStatus();
        this.h = saleInfo.getVipType();
        this.f86300i = saleInfo.getTipsId();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f86293a, bVar.f86293a) && Intrinsics.areEqual(this.f86294b, bVar.f86294b) && Intrinsics.areEqual(this.f86295c, bVar.f86295c) && Intrinsics.areEqual(this.f86296d, bVar.f86296d) && Intrinsics.areEqual(this.f86297e, bVar.f86297e) && Intrinsics.areEqual(this.f86298f, bVar.f86298f) && Intrinsics.areEqual(this.f86299g, bVar.f86299g) && Intrinsics.areEqual(this.h, bVar.h) && Intrinsics.areEqual(this.f86300i, bVar.f86300i) && this.f86301j == bVar.f86301j;
    }

    public final int hashCode() {
        int iHashCode = 0;
        String str = this.f86293a;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.f86294b;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.f86295c;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        Tag tag = this.f86296d;
        int iHashCode5 = tag == null ? 0 : tag.hashCode();
        String str4 = this.f86297e;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        SearchBangumiItem.PurchaseButton purchaseButton = this.f86298f;
        int iHashCode7 = purchaseButton == null ? 0 : purchaseButton.hashCode();
        String str5 = this.f86299g;
        int iHashCode8 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.h;
        int iHashCode9 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.f86300i;
        if (str7 != null) {
            iHashCode = str7.hashCode();
        }
        return Boolean.hashCode(this.f86301j) + (((((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode) * 31);
    }

    @NotNull
    public final String toString() {
        boolean z6 = this.f86301j;
        StringBuilder sb = new StringBuilder("SaleInfo(icon=");
        sb.append(this.f86293a);
        sb.append(", iconNight=");
        sb.append(this.f86294b);
        sb.append(", title=");
        sb.append(this.f86295c);
        sb.append(", label=");
        sb.append(this.f86296d);
        sb.append(", desc=");
        sb.append(this.f86297e);
        sb.append(", button=");
        sb.append(this.f86298f);
        sb.append(", vipStatus=");
        sb.append(this.f86299g);
        sb.append(", vipType=");
        sb.append(this.h);
        sb.append(", tipsId=");
        return B.c(this.f86300i, ", isExposed=", ")", sb, z6);
    }
}
