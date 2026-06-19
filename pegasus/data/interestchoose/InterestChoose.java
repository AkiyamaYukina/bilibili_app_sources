package com.bilibili.pegasus.data.interestchoose;

import G0.d;
import Vn.A;
import X1.C3082l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.compose.foundation.C3554n0;
import androidx.media3.common.util.C4638g;
import androidx.room.B;
import cf.b;
import cf.f;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/data/interestchoose/InterestChoose.class */
@Parcelize
public final class InterestChoose implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<InterestChoose> CREATOR = new Object();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @SerializedName("select_num_limit")
    @Nullable
    private final Integer f77371A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @SerializedName("select_num_min_limit")
    @Nullable
    private final Integer f77372B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @SerializedName("max_items_show_count")
    @Nullable
    private final Integer f77373C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("interest_popup_logic_exp")
    private final int f77374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("style")
    private final int f77375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("unique_id")
    private final long f77376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("strategy")
    @Nullable
    private final String f77377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("items")
    @Nullable
    private final List<InterestChooseItem> f77378e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SerializedName("mixed_sections")
    @Nullable
    private final List<InterestChooseMixedSection> f77379f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SerializedName("genders")
    @Nullable
    private final List<InterestChooseGender> f77380g;

    @SerializedName("ages")
    @Nullable
    private final List<InterestChooseAge> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @SerializedName("title")
    @Nullable
    private final String f77381i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @SerializedName("subpage_title")
    @Nullable
    private final String f77382j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @SerializedName("thirdpage_title")
    @Nullable
    private final String f77383k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @SerializedName("gender_title")
    @Nullable
    private final String f77384l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @SerializedName("age_title")
    @Nullable
    private final String f77385m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @SerializedName("interest_title")
    @Nullable
    private final String f77386n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @SerializedName("sub_title")
    @Nullable
    private final String f77387o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @SerializedName("subpage_subtitle")
    @Nullable
    private final String f77388p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @SerializedName("thirdpage_subtitle")
    @Nullable
    private final String f77389q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @SerializedName("confirm_text")
    @Nullable
    private final String f77390r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @SerializedName("subpage_confirm_text")
    @Nullable
    private final String f77391s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @SerializedName("thirdpage_confirm_text")
    @Nullable
    private final String f77392t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @SerializedName("confirm_out_text")
    @Nullable
    private final String f77393u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @SerializedName("confirm_next_text")
    @Nullable
    private final String f77394v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @SerializedName("subpage_next_text")
    @Nullable
    private final String f77395w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @SerializedName("cancel_text")
    @Nullable
    private final String f77396x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @SerializedName("disable_action_open_homepage")
    private final boolean f77397y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @SerializedName("disable_refresh_after_submit")
    private final boolean f77398z;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/data/interestchoose/InterestChoose$a.class */
    public static final class a implements Parcelable.Creator<InterestChoose> {
        @Override // android.os.Parcelable.Creator
        public final InterestChoose createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            int i7 = parcel.readInt();
            int i8 = parcel.readInt();
            long j7 = parcel.readLong();
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                int i9 = parcel.readInt();
                arrayList = new ArrayList(i9);
                int iA = 0;
                while (true) {
                    int i10 = iA;
                    if (i10 == i9) {
                        break;
                    }
                    iA = b.a(InterestChooseItem.CREATOR, parcel, arrayList, i10, 1);
                }
            } else {
                arrayList = null;
            }
            if (parcel.readInt() != 0) {
                int i11 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i11);
                int iA2 = 0;
                while (true) {
                    int i12 = iA2;
                    arrayList2 = arrayList5;
                    if (i12 == i11) {
                        break;
                    }
                    iA2 = b.a(InterestChooseMixedSection.CREATOR, parcel, arrayList5, i12, 1);
                }
            } else {
                arrayList2 = null;
            }
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i13);
                int iA3 = 0;
                while (true) {
                    int i14 = iA3;
                    arrayList3 = arrayList6;
                    if (i14 == i13) {
                        break;
                    }
                    iA3 = b.a(InterestChooseGender.CREATOR, parcel, arrayList6, i14, 1);
                }
            } else {
                arrayList3 = null;
            }
            if (parcel.readInt() != 0) {
                int i15 = parcel.readInt();
                arrayList4 = new ArrayList(i15);
                int iA4 = 0;
                while (true) {
                    int i16 = iA4;
                    if (i16 == i15) {
                        break;
                    }
                    iA4 = b.a(InterestChooseAge.CREATOR, parcel, arrayList4, i16, 1);
                }
            } else {
                arrayList4 = null;
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            String string17 = parcel.readString();
            boolean z6 = true;
            boolean z7 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                z6 = false;
            }
            return new InterestChoose(i7, i8, j7, string, arrayList, arrayList2, arrayList3, arrayList4, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, string16, string17, z7, z6, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final InterestChoose[] newArray(int i7) {
            return new InterestChoose[i7];
        }
    }

    public InterestChoose() {
        this(0);
    }

    public /* synthetic */ InterestChoose(int i7) {
        this(0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null);
    }

    public InterestChoose(int i7, int i8, long j7, @Nullable String str, @Nullable List<InterestChooseItem> list, @Nullable List<InterestChooseMixedSection> list2, @Nullable List<InterestChooseGender> list3, @Nullable List<InterestChooseAge> list4, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, boolean z6, boolean z7, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
        this.f77374a = i7;
        this.f77375b = i8;
        this.f77376c = j7;
        this.f77377d = str;
        this.f77378e = list;
        this.f77379f = list2;
        this.f77380g = list3;
        this.h = list4;
        this.f77381i = str2;
        this.f77382j = str3;
        this.f77383k = str4;
        this.f77384l = str5;
        this.f77385m = str6;
        this.f77386n = str7;
        this.f77387o = str8;
        this.f77388p = str9;
        this.f77389q = str10;
        this.f77390r = str11;
        this.f77391s = str12;
        this.f77392t = str13;
        this.f77393u = str14;
        this.f77394v = str15;
        this.f77395w = str16;
        this.f77396x = str17;
        this.f77397y = z6;
        this.f77398z = z7;
        this.f77371A = num;
        this.f77372B = num2;
        this.f77373C = num3;
    }

    public static InterestChoose a(InterestChoose interestChoose, List list, List list2, List list3, int i7) {
        int i8 = interestChoose.f77374a;
        int i9 = interestChoose.f77375b;
        long j7 = interestChoose.f77376c;
        String str = interestChoose.f77377d;
        if ((i7 & 16) != 0) {
            list = interestChoose.f77378e;
        }
        List<InterestChooseMixedSection> list4 = interestChoose.f77379f;
        if ((i7 & 64) != 0) {
            list2 = interestChoose.f77380g;
        }
        if ((i7 & 128) != 0) {
            list3 = interestChoose.h;
        }
        String str2 = interestChoose.f77381i;
        String str3 = interestChoose.f77382j;
        String str4 = interestChoose.f77383k;
        String str5 = interestChoose.f77384l;
        String str6 = interestChoose.f77385m;
        String str7 = interestChoose.f77386n;
        String str8 = interestChoose.f77387o;
        String str9 = interestChoose.f77388p;
        String str10 = interestChoose.f77389q;
        String str11 = interestChoose.f77390r;
        String str12 = interestChoose.f77391s;
        String str13 = interestChoose.f77392t;
        String str14 = interestChoose.f77393u;
        String str15 = interestChoose.f77394v;
        String str16 = interestChoose.f77395w;
        String str17 = interestChoose.f77396x;
        boolean z6 = interestChoose.f77397y;
        boolean z7 = interestChoose.f77398z;
        Integer num = interestChoose.f77371A;
        Integer num2 = interestChoose.f77372B;
        Integer num3 = interestChoose.f77373C;
        interestChoose.getClass();
        return new InterestChoose(i8, i9, j7, str, list, list4, list2, list3, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, z6, z7, num, num2, num3);
    }

    @Nullable
    public final Integer A() {
        return this.f77372B;
    }

    @Nullable
    public final String B() {
        return this.f77377d;
    }

    public final int D() {
        return this.f77375b;
    }

    @Nullable
    public final String F() {
        return this.f77387o;
    }

    @Nullable
    public final String G() {
        return this.f77391s;
    }

    @Nullable
    public final String H() {
        return this.f77395w;
    }

    @Nullable
    public final String I() {
        return this.f77388p;
    }

    @Nullable
    public final String J() {
        return this.f77382j;
    }

    @Nullable
    public final String K() {
        return this.f77392t;
    }

    @Nullable
    public final String L() {
        return this.f77389q;
    }

    @Nullable
    public final String M() {
        return this.f77383k;
    }

    public final long O() {
        return this.f77376c;
    }

    @Nullable
    public final String b() {
        return this.f77385m;
    }

    @Nullable
    public final List<InterestChooseAge> c() {
        return this.h;
    }

    @Nullable
    public final String d() {
        return this.f77396x;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterestChoose)) {
            return false;
        }
        InterestChoose interestChoose = (InterestChoose) obj;
        return this.f77374a == interestChoose.f77374a && this.f77375b == interestChoose.f77375b && this.f77376c == interestChoose.f77376c && Intrinsics.areEqual(this.f77377d, interestChoose.f77377d) && Intrinsics.areEqual(this.f77378e, interestChoose.f77378e) && Intrinsics.areEqual(this.f77379f, interestChoose.f77379f) && Intrinsics.areEqual(this.f77380g, interestChoose.f77380g) && Intrinsics.areEqual(this.h, interestChoose.h) && Intrinsics.areEqual(this.f77381i, interestChoose.f77381i) && Intrinsics.areEqual(this.f77382j, interestChoose.f77382j) && Intrinsics.areEqual(this.f77383k, interestChoose.f77383k) && Intrinsics.areEqual(this.f77384l, interestChoose.f77384l) && Intrinsics.areEqual(this.f77385m, interestChoose.f77385m) && Intrinsics.areEqual(this.f77386n, interestChoose.f77386n) && Intrinsics.areEqual(this.f77387o, interestChoose.f77387o) && Intrinsics.areEqual(this.f77388p, interestChoose.f77388p) && Intrinsics.areEqual(this.f77389q, interestChoose.f77389q) && Intrinsics.areEqual(this.f77390r, interestChoose.f77390r) && Intrinsics.areEqual(this.f77391s, interestChoose.f77391s) && Intrinsics.areEqual(this.f77392t, interestChoose.f77392t) && Intrinsics.areEqual(this.f77393u, interestChoose.f77393u) && Intrinsics.areEqual(this.f77394v, interestChoose.f77394v) && Intrinsics.areEqual(this.f77395w, interestChoose.f77395w) && Intrinsics.areEqual(this.f77396x, interestChoose.f77396x) && this.f77397y == interestChoose.f77397y && this.f77398z == interestChoose.f77398z && Intrinsics.areEqual(this.f77371A, interestChoose.f77371A) && Intrinsics.areEqual(this.f77372B, interestChoose.f77372B) && Intrinsics.areEqual(this.f77373C, interestChoose.f77373C);
    }

    @Nullable
    public final String getTitle() {
        return this.f77381i;
    }

    @Nullable
    public final String h() {
        return this.f77393u;
    }

    public final int hashCode() {
        int iA = C3554n0.a(I.a(this.f77375b, Integer.hashCode(this.f77374a) * 31, 31), 31, this.f77376c);
        String str = this.f77377d;
        int iHashCode = str == null ? 0 : str.hashCode();
        List<InterestChooseItem> list = this.f77378e;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        List<InterestChooseMixedSection> list2 = this.f77379f;
        int iHashCode3 = list2 == null ? 0 : list2.hashCode();
        List<InterestChooseGender> list3 = this.f77380g;
        int iHashCode4 = list3 == null ? 0 : list3.hashCode();
        List<InterestChooseAge> list4 = this.h;
        int iHashCode5 = list4 == null ? 0 : list4.hashCode();
        String str2 = this.f77381i;
        int iHashCode6 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.f77382j;
        int iHashCode7 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.f77383k;
        int iHashCode8 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.f77384l;
        int iHashCode9 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.f77385m;
        int iHashCode10 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.f77386n;
        int iHashCode11 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.f77387o;
        int iHashCode12 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.f77388p;
        int iHashCode13 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.f77389q;
        int iHashCode14 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.f77390r;
        int iHashCode15 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.f77391s;
        int iHashCode16 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.f77392t;
        int iHashCode17 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.f77393u;
        int iHashCode18 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.f77394v;
        int iHashCode19 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.f77395w;
        int iHashCode20 = str16 == null ? 0 : str16.hashCode();
        String str17 = this.f77396x;
        int iA2 = z.a(z.a((((((((((((((((((((((((((((((((((((((((((iA + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + (str17 == null ? 0 : str17.hashCode())) * 31, 31, this.f77397y), 31, this.f77398z);
        Integer num = this.f77371A;
        int iHashCode21 = num == null ? 0 : num.hashCode();
        Integer num2 = this.f77372B;
        int iHashCode22 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.f77373C;
        return ((((iA2 + iHashCode21) * 31) + iHashCode22) * 31) + (num3 == null ? 0 : num3.hashCode());
    }

    @Nullable
    public final String i() {
        return this.f77390r;
    }

    @Nullable
    public final String j() {
        return this.f77394v;
    }

    public final boolean m() {
        return this.f77397y;
    }

    public final boolean n() {
        return this.f77398z;
    }

    @Nullable
    public final String o() {
        return this.f77384l;
    }

    @Nullable
    public final List<InterestChooseGender> q() {
        return this.f77380g;
    }

    public final int r() {
        return this.f77374a;
    }

    @Nullable
    public final String s() {
        return this.f77386n;
    }

    @NotNull
    public final String toString() {
        int i7 = this.f77374a;
        int i8 = this.f77375b;
        long j7 = this.f77376c;
        String str = this.f77377d;
        List<InterestChooseItem> list = this.f77378e;
        List<InterestChooseMixedSection> list2 = this.f77379f;
        List<InterestChooseGender> list3 = this.f77380g;
        List<InterestChooseAge> list4 = this.h;
        String str2 = this.f77381i;
        String str3 = this.f77382j;
        String str4 = this.f77383k;
        String str5 = this.f77384l;
        String str6 = this.f77385m;
        String str7 = this.f77386n;
        String str8 = this.f77387o;
        String str9 = this.f77388p;
        String str10 = this.f77389q;
        String str11 = this.f77390r;
        String str12 = this.f77391s;
        String str13 = this.f77392t;
        String str14 = this.f77393u;
        String str15 = this.f77394v;
        String str16 = this.f77395w;
        String str17 = this.f77396x;
        boolean z6 = this.f77397y;
        boolean z7 = this.f77398z;
        Integer num = this.f77371A;
        Integer num2 = this.f77372B;
        Integer num3 = this.f77373C;
        StringBuilder sbB = A.b(i7, i8, "InterestChoose(interestPopupLogicExp=", ", style=", ", uniqueId=");
        d.a(j7, ", strategy=", str, sbB);
        C3082l.b(", items=", ", mixedSections=", sbB, list, list2);
        C3082l.b(", genders=", ", ages=", sbB, list3, list4);
        B.a(", title=", str2, ", subpageTitle=", str3, sbB);
        B.a(", thirdpageTitle=", str4, ", genderTitle=", str5, sbB);
        B.a(", ageTitle=", str6, ", interestTitle=", str7, sbB);
        B.a(", subTitle=", str8, ", subpageSubtitle=", str9, sbB);
        B.a(", thirdpageSubtitle=", str10, ", confirmText=", str11, sbB);
        B.a(", subpageConfirmText=", str12, ", thirdpageConfirmText=", str13, sbB);
        B.a(", confirmOutText=", str14, ", confirmTextNext=", str15, sbB);
        B.a(", subpageNextText=", str16, ", cancelText=", str17, sbB);
        C4638g.b(", disableActionOpenHomePage=", ", disableRefreshAfterSubmit=", sbB, z6, z7);
        sbB.append(", selectNumLimit=");
        sbB.append(num);
        sbB.append(", selectNumMinLimit=");
        sbB.append(num2);
        sbB.append(", maxItemsShowCount=");
        sbB.append(num3);
        sbB.append(")");
        return sbB.toString();
    }

    @Nullable
    public final List<InterestChooseItem> u() {
        return this.f77378e;
    }

    @Nullable
    public final Integer v() {
        return this.f77373C;
    }

    @Nullable
    public final List<InterestChooseMixedSection> w() {
        return this.f77379f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeInt(this.f77374a);
        parcel.writeInt(this.f77375b);
        parcel.writeLong(this.f77376c);
        parcel.writeString(this.f77377d);
        List<InterestChooseItem> list = this.f77378e;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = cf.a.a(parcel, 1, list);
            while (itA.hasNext()) {
                ((InterestChooseItem) itA.next()).writeToParcel(parcel, i7);
            }
        }
        List<InterestChooseMixedSection> list2 = this.f77379f;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = cf.a.a(parcel, 1, list2);
            while (itA2.hasNext()) {
                ((InterestChooseMixedSection) itA2.next()).writeToParcel(parcel, i7);
            }
        }
        List<InterestChooseGender> list3 = this.f77380g;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA3 = cf.a.a(parcel, 1, list3);
            while (itA3.hasNext()) {
                ((InterestChooseGender) itA3.next()).writeToParcel(parcel, i7);
            }
        }
        List<InterestChooseAge> list4 = this.h;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA4 = cf.a.a(parcel, 1, list4);
            while (itA4.hasNext()) {
                ((InterestChooseAge) itA4.next()).writeToParcel(parcel, i7);
            }
        }
        parcel.writeString(this.f77381i);
        parcel.writeString(this.f77382j);
        parcel.writeString(this.f77383k);
        parcel.writeString(this.f77384l);
        parcel.writeString(this.f77385m);
        parcel.writeString(this.f77386n);
        parcel.writeString(this.f77387o);
        parcel.writeString(this.f77388p);
        parcel.writeString(this.f77389q);
        parcel.writeString(this.f77390r);
        parcel.writeString(this.f77391s);
        parcel.writeString(this.f77392t);
        parcel.writeString(this.f77393u);
        parcel.writeString(this.f77394v);
        parcel.writeString(this.f77395w);
        parcel.writeString(this.f77396x);
        parcel.writeInt(this.f77397y ? 1 : 0);
        parcel.writeInt(this.f77398z ? 1 : 0);
        Integer num = this.f77371A;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            f.a(parcel, 1, num);
        }
        Integer num2 = this.f77372B;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            f.a(parcel, 1, num2);
        }
        Integer num3 = this.f77373C;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            f.a(parcel, 1, num3);
        }
    }

    @Nullable
    public final Integer z() {
        return this.f77371A;
    }
}
