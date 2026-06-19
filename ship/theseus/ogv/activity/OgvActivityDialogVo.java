package com.bilibili.ship.theseus.ogv.activity;

import I.E;
import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u5.C8711a;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvActivityDialogVo.class */
@StabilityInferred(parameters = 0)
@Bson
public final class OgvActivityDialogVo implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("win_id")
    @NotNull
    private final String f91362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("bg_img")
    @Nullable
    private final String f91363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("login")
    private final boolean f91364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final ActivityDialogActionType f91365d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("url")
    @Nullable
    private final String f91366e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f91367f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SerializedName("showTime")
    @NotNull
    private final ActivityDialogShowOccasion f91368g;

    @Nullable
    public final Entry h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final Entry f91369i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final String f91370j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f91371k;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvActivityDialogVo$Entry.class */
    @StabilityInferred(parameters = 1)
    @Bson
    public static final class Entry implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final OgvActivityTextVo f91372a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final String f91373b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final String f91374c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final ActivityDialogActionType f91375d;

        public Entry(@Nullable ActivityDialogActionType activityDialogActionType, @NotNull OgvActivityTextVo ogvActivityTextVo, @Nullable String str, @Nullable String str2) {
            this.f91372a = ogvActivityTextVo;
            this.f91373b = str;
            this.f91374c = str2;
            this.f91375d = activityDialogActionType;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            return Intrinsics.areEqual(this.f91372a, entry.f91372a) && Intrinsics.areEqual(this.f91373b, entry.f91373b) && Intrinsics.areEqual(this.f91374c, entry.f91374c) && this.f91375d == entry.f91375d;
        }

        @Override // com.bilibili.ship.theseus.ogv.activity.d
        @Nullable
        public final ActivityDialogActionType getAction() {
            return this.f91375d;
        }

        @Override // com.bilibili.ship.theseus.ogv.activity.d
        @Nullable
        public final String getCode() {
            return this.f91373b;
        }

        @Override // com.bilibili.ship.theseus.ogv.activity.d
        @Nullable
        public final String getLink() {
            return this.f91374c;
        }

        public final int hashCode() {
            int iHashCode = this.f91372a.hashCode();
            int iHashCode2 = 0;
            String str = this.f91373b;
            int iHashCode3 = str == null ? 0 : str.hashCode();
            String str2 = this.f91374c;
            int iHashCode4 = str2 == null ? 0 : str2.hashCode();
            ActivityDialogActionType activityDialogActionType = this.f91375d;
            if (activityDialogActionType != null) {
                iHashCode2 = activityDialogActionType.hashCode();
            }
            return (((((iHashCode * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode2;
        }

        @NotNull
        public final String toString() {
            return "Entry(text=" + this.f91372a + ", code=" + this.f91373b + ", link=" + this.f91374c + ", action=" + this.f91375d + ")";
        }
    }

    public OgvActivityDialogVo() {
        throw null;
    }

    public OgvActivityDialogVo(String str, String str2, boolean z6, ActivityDialogActionType activityDialogActionType, String str3, Map map, ActivityDialogShowOccasion activityDialogShowOccasion, Entry entry, Entry entry2, String str4, Map map2, int i7) {
        map = (i7 & 32) != 0 ? MapsKt.emptyMap() : map;
        activityDialogShowOccasion = (i7 & 64) != 0 ? ActivityDialogShowOccasion.IMMEDIATE : activityDialogShowOccasion;
        this.f91362a = str;
        this.f91363b = str2;
        this.f91364c = z6;
        this.f91365d = activityDialogActionType;
        this.f91366e = str3;
        this.f91367f = map;
        this.f91368g = activityDialogShowOccasion;
        this.h = entry;
        this.f91369i = entry2;
        this.f91370j = str4;
        this.f91371k = map2;
    }

    @NotNull
    public final String a() {
        return this.f91362a;
    }

    @Nullable
    public final String b() {
        return this.f91363b;
    }

    @NotNull
    public final ActivityDialogShowOccasion c() {
        return this.f91368g;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OgvActivityDialogVo)) {
            return false;
        }
        OgvActivityDialogVo ogvActivityDialogVo = (OgvActivityDialogVo) obj;
        return Intrinsics.areEqual(this.f91362a, ogvActivityDialogVo.f91362a) && Intrinsics.areEqual(this.f91363b, ogvActivityDialogVo.f91363b) && this.f91364c == ogvActivityDialogVo.f91364c && this.f91365d == ogvActivityDialogVo.f91365d && Intrinsics.areEqual(this.f91366e, ogvActivityDialogVo.f91366e) && Intrinsics.areEqual(this.f91367f, ogvActivityDialogVo.f91367f) && this.f91368g == ogvActivityDialogVo.f91368g && Intrinsics.areEqual(this.h, ogvActivityDialogVo.h) && Intrinsics.areEqual(this.f91369i, ogvActivityDialogVo.f91369i) && Intrinsics.areEqual(this.f91370j, ogvActivityDialogVo.f91370j) && Intrinsics.areEqual(this.f91371k, ogvActivityDialogVo.f91371k);
    }

    @Override // com.bilibili.ship.theseus.ogv.activity.d
    @Nullable
    public final ActivityDialogActionType getAction() {
        return this.f91365d;
    }

    @Override // com.bilibili.ship.theseus.ogv.activity.d
    @Nullable
    public final String getLink() {
        return this.f91366e;
    }

    @Override // com.bilibili.ship.theseus.ogv.activity.d
    public final boolean getNeedLogin() {
        return this.f91364c;
    }

    public final int hashCode() {
        int iHashCode = this.f91362a.hashCode();
        String str = this.f91363b;
        int iA = z.a(((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31, 31, this.f91364c);
        ActivityDialogActionType activityDialogActionType = this.f91365d;
        int iHashCode2 = activityDialogActionType == null ? 0 : activityDialogActionType.hashCode();
        String str2 = this.f91366e;
        int iA2 = J2.g.a((((iA + iHashCode2) * 31) + (str2 == null ? 0 : str2.hashCode())) * 31, this.f91367f, 31);
        int iHashCode3 = this.f91368g.hashCode();
        Entry entry = this.h;
        int iHashCode4 = entry == null ? 0 : entry.hashCode();
        Entry entry2 = this.f91369i;
        return this.f91371k.hashCode() + E.a((((((iHashCode3 + iA2) * 31) + iHashCode4) * 31) + (entry2 == null ? 0 : entry2.hashCode())) * 31, 31, this.f91370j);
    }

    @NotNull
    public final String toString() {
        String str = this.f91362a;
        String str2 = this.f91363b;
        boolean z6 = this.f91364c;
        String str3 = this.f91366e;
        Map<String, String> map = this.f91367f;
        ActivityDialogShowOccasion activityDialogShowOccasion = this.f91368g;
        String strA = C8770a.a(new StringBuilder("CloseType(value="), this.f91370j, ")");
        Map<String, String> map2 = this.f91371k;
        StringBuilder sbA = G0.b.a("OgvActivityDialogVo(id=", str, ", image=", str2, ", needLogin=");
        sbA.append(z6);
        sbA.append(", action=");
        sbA.append(this.f91365d);
        sbA.append(", link=");
        sbA.append(str3);
        sbA.append(", report=");
        sbA.append(map);
        sbA.append(", showOccasion=");
        sbA.append(activityDialogShowOccasion);
        sbA.append(", function=");
        sbA.append(this.h);
        sbA.append(", rule=");
        sbA.append(this.f91369i);
        sbA.append(", closeType=");
        sbA.append(strA);
        sbA.append(", conditions=");
        return C8711a.a(sbA, map2, ")");
    }
}
