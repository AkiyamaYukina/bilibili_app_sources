package com.bilibili.ship.theseus.ogv.tabpage;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/tabpage/ActivityTab.class */
@StabilityInferred(parameters = 0)
@Bson
public final class ActivityTab {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("show_name")
    @Nullable
    private final String f94549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("picurl")
    @Nullable
    private final String f94550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("picurl_selected")
    @Nullable
    private final String f94551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f94552d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Type f94553e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SerializedName("title")
    @Nullable
    private final String f94554f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SerializedName("act_ext")
    @Nullable
    private final TabActivityExtensionField f94555g;

    @SerializedName("report")
    @Nullable
    private final Map<String, String> h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/tabpage/ActivityTab$Type.class */
    public static final class Type implements com.bilibili.bson.adapter.a<String> {
        private static final EnumEntries $ENTRIES;
        private static final Type[] $VALUES;
        public static final Type CHAT_HALL = new Type("CHAT_HALL", 0, "520001");
        public static final Type WEB = new Type("WEB", 1, "520002");

        @NotNull
        private final String value;

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{CHAT_HALL, WEB};
        }

        static {
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(typeArr$values);
        }

        private Type(String str, int i7, String str2) {
            this.value = str2;
        }

        @NotNull
        public static EnumEntries<Type> getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        @NotNull
        public String getValue() {
            return this.value;
        }
    }

    public ActivityTab() {
        throw null;
    }

    public ActivityTab(String str, String str2, String str3, String str4, Type type, String str5, TabActivityExtensionField tabActivityExtensionField, Map map, int i7) {
        type = (i7 & 16) != 0 ? Type.WEB : type;
        this.f94549a = str;
        this.f94550b = str2;
        this.f94551c = str3;
        this.f94552d = str4;
        this.f94553e = type;
        this.f94554f = str5;
        this.f94555g = tabActivityExtensionField;
        this.h = map;
    }

    @Nullable
    public final TabActivityExtensionField a() {
        return this.f94555g;
    }

    @Nullable
    public final String b() {
        return this.f94554f;
    }

    @Nullable
    public final String c() {
        return this.f94550b;
    }

    @Nullable
    public final String d() {
        return this.f94551c;
    }

    @Nullable
    public final Map<String, String> e() {
        return this.h;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTab)) {
            return false;
        }
        ActivityTab activityTab = (ActivityTab) obj;
        return Intrinsics.areEqual(this.f94549a, activityTab.f94549a) && Intrinsics.areEqual(this.f94550b, activityTab.f94550b) && Intrinsics.areEqual(this.f94551c, activityTab.f94551c) && Intrinsics.areEqual(this.f94552d, activityTab.f94552d) && this.f94553e == activityTab.f94553e && Intrinsics.areEqual(this.f94554f, activityTab.f94554f) && Intrinsics.areEqual(this.f94555g, activityTab.f94555g) && Intrinsics.areEqual(this.h, activityTab.h);
    }

    @Nullable
    public final String f() {
        return this.f94549a;
    }

    public final int hashCode() {
        String str = this.f94549a;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.f94550b;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.f94551c;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.f94552d;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        int iHashCode6 = this.f94553e.hashCode();
        String str5 = this.f94554f;
        int iHashCode7 = str5 == null ? 0 : str5.hashCode();
        TabActivityExtensionField tabActivityExtensionField = this.f94555g;
        int iHashCode8 = tabActivityExtensionField == null ? 0 : tabActivityExtensionField.hashCode();
        Map<String, String> map = this.h;
        if (map != null) {
            iHashCode = map.hashCode();
        }
        return ((((((iHashCode6 + (((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31)) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode;
    }

    @NotNull
    public final String toString() {
        String str = this.f94549a;
        String str2 = this.f94550b;
        String str3 = this.f94551c;
        String str4 = this.f94554f;
        TabActivityExtensionField tabActivityExtensionField = this.f94555g;
        Map<String, String> map = this.h;
        StringBuilder sbA = G0.b.a("ActivityTab(showName=", str, ", picUrl=", str2, ", picUrlSelected=");
        sbA.append(str3);
        sbA.append(", link=");
        sbA.append(this.f94552d);
        sbA.append(", type=");
        sbA.append(this.f94553e);
        sbA.append(", chatNum=");
        sbA.append(str4);
        sbA.append(", activityExtensionField=");
        sbA.append(tabActivityExtensionField);
        sbA.append(", reportData=");
        sbA.append(map);
        sbA.append(")");
        return sbA.toString();
    }
}
