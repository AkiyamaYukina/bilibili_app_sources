package com.bilibili.ship.theseus.ogv.intro.livereserve;

import I.E;
import J2.g;
import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.B;
import c6.P;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/livereserve/OgvLiveReserveVo.class */
@StabilityInferred(parameters = 0)
@Bson
public final class OgvLiveReserveVo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f93285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f93286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f93287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f93288d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("click_button")
    @NotNull
    private final String f93289e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f93290f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f93291g;

    @SerializedName("reserve_status")
    private final boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @SerializedName("toast")
    @Nullable
    private final String f93292i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @SerializedName(alternate = {"action_type"}, value = "active_type")
    @NotNull
    private final JumpType f93293j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f93294k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @SerializedName("live_status")
    private final boolean f93295l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/livereserve/OgvLiveReserveVo$JumpType.class */
    public static final class JumpType implements com.bilibili.bson.adapter.a<Integer> {
        private static final EnumEntries $ENTRIES;
        private static final JumpType[] $VALUES;
        private final int value;
        public static final JumpType UNKNOWN = new JumpType("UNKNOWN", 0, 0);
        public static final JumpType OPEN_URL = new JumpType("OPEN_URL", 1, 1);
        public static final JumpType REFRESH = new JumpType("REFRESH", 2, 2);
        public static final JumpType HALF_SCREEN = new JumpType("HALF_SCREEN", 3, 3);

        private static final /* synthetic */ JumpType[] $values() {
            return new JumpType[]{UNKNOWN, OPEN_URL, REFRESH, HALF_SCREEN};
        }

        static {
            JumpType[] jumpTypeArr$values = $values();
            $VALUES = jumpTypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(jumpTypeArr$values);
        }

        private JumpType(String str, int i7, int i8) {
            this.value = i8;
        }

        @NotNull
        public static EnumEntries<JumpType> getEntries() {
            return $ENTRIES;
        }

        public static JumpType valueOf(String str) {
            return (JumpType) Enum.valueOf(JumpType.class, str);
        }

        public static JumpType[] values() {
            return (JumpType[]) $VALUES.clone();
        }

        @NotNull
        /* JADX INFO: renamed from: getValue, reason: merged with bridge method [inline-methods] */
        public Integer m9044getValue() {
            return Integer.valueOf(this.value);
        }
    }

    public OgvLiveReserveVo() {
        throw null;
    }

    public OgvLiveReserveVo(long j7, String str, String str2, String str3, String str4, String str5, boolean z6, boolean z7, String str6, JumpType jumpType, Map map, boolean z8, int i7) {
        jumpType = (i7 & 512) != 0 ? JumpType.UNKNOWN : jumpType;
        this.f93285a = j7;
        this.f93286b = str;
        this.f93287c = str2;
        this.f93288d = str3;
        this.f93289e = str4;
        this.f93290f = str5;
        this.f93291g = z6;
        this.h = z7;
        this.f93292i = str6;
        this.f93293j = jumpType;
        this.f93294k = map;
        this.f93295l = z8;
    }

    @NotNull
    public final JumpType a() {
        return this.f93293j;
    }

    @NotNull
    public final String b() {
        return this.f93289e;
    }

    public final boolean c() {
        return this.f93295l;
    }

    public final boolean d() {
        return this.h;
    }

    @Nullable
    public final String e() {
        return this.f93292i;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OgvLiveReserveVo)) {
            return false;
        }
        OgvLiveReserveVo ogvLiveReserveVo = (OgvLiveReserveVo) obj;
        return this.f93285a == ogvLiveReserveVo.f93285a && Intrinsics.areEqual(this.f93286b, ogvLiveReserveVo.f93286b) && Intrinsics.areEqual(this.f93287c, ogvLiveReserveVo.f93287c) && Intrinsics.areEqual(this.f93288d, ogvLiveReserveVo.f93288d) && Intrinsics.areEqual(this.f93289e, ogvLiveReserveVo.f93289e) && Intrinsics.areEqual(this.f93290f, ogvLiveReserveVo.f93290f) && this.f93291g == ogvLiveReserveVo.f93291g && this.h == ogvLiveReserveVo.h && Intrinsics.areEqual(this.f93292i, ogvLiveReserveVo.f93292i) && this.f93293j == ogvLiveReserveVo.f93293j && Intrinsics.areEqual(this.f93294k, ogvLiveReserveVo.f93294k) && this.f93295l == ogvLiveReserveVo.f93295l;
    }

    public final int hashCode() {
        int iA = z.a(z.a(E.a(E.a(E.a(E.a(E.a(Long.hashCode(this.f93285a) * 31, 31, this.f93286b), 31, this.f93287c), 31, this.f93288d), 31, this.f93289e), 31, this.f93290f), 31, this.f93291g), 31, this.h);
        String str = this.f93292i;
        return Boolean.hashCode(this.f93295l) + g.a((this.f93293j.hashCode() + ((iA + (str == null ? 0 : str.hashCode())) * 31)) * 31, this.f93294k, 31);
    }

    @NotNull
    public final String toString() {
        String str = this.f93289e;
        boolean z6 = this.h;
        String str2 = this.f93292i;
        JumpType jumpType = this.f93293j;
        Map<String, String> map = this.f93294k;
        boolean z7 = this.f93295l;
        StringBuilder sb = new StringBuilder("OgvLiveReserveVo(reserveId=");
        sb.append(this.f93285a);
        sb.append(", icon=");
        sb.append(this.f93286b);
        sb.append(", nightIcon=");
        sb.append(this.f93287c);
        sb.append(", title=");
        B.a(this.f93288d, ", buttonTitle=", str, ", link=", sb);
        sb.append(this.f93290f);
        sb.append(", followVideoIsReserveLive=");
        P.a(", reserved=", ", reservedLiveToast=", sb, this.f93291g, z6);
        sb.append(str2);
        sb.append(", actionType=");
        sb.append(jumpType);
        sb.append(", report=");
        sb.append(map);
        sb.append(", liveStarted=");
        sb.append(z7);
        sb.append(")");
        return sb.toString();
    }
}
