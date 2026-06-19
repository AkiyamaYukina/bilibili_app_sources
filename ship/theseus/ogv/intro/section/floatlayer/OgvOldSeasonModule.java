package com.bilibili.ship.theseus.ogv.intro.section.floatlayer;

import K7.O;
import a5.C3188c;
import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.B;
import com.bilibili.bson.common.Bson;
import com.bilibili.okretro.call.json.JsonUtilKt;
import com.bilibili.ship.theseus.ogv.intro.section.bean.BgInfo;
import com.bilibili.ship.theseus.ogv.intro.section.bean.MoreLeft;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/floatlayer/OgvOldSeasonModule.class */
@StabilityInferred(parameters = 0)
@Bson
@JsonAdapter(WholeJsonHolderAdapterFactory.class)
public final class OgvOldSeasonModule implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("style")
    @NotNull
    private final Type f93595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f93596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("title")
    @NotNull
    private final String f93597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f93598d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("more_left")
    @NotNull
    private final MoreLeft f93599e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SerializedName("more_bottom_desc")
    @NotNull
    private final String f93600f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f93601g;

    @SerializedName("can_ord_desc")
    private final boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @SerializedName("module_style")
    @Nullable
    private final ModuleStyle f93602i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @SerializedName("data")
    @Nullable
    private final JsonObject f93603j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final String f93604k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @SerializedName("bg_info")
    @Nullable
    private final BgInfo f93605l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public final transient Object f93606m;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/floatlayer/OgvOldSeasonModule$ModuleStyle.class */
    @StabilityInferred(parameters = 0)
    @Bson
    public static final class ModuleStyle {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final String f93607a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("day_color")
        @Nullable
        private final String f93608b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("night_color")
        @Nullable
        private final String f93609c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @SerializedName("line")
        private final boolean f93610d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f93611e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @SerializedName("show_pages")
        @NotNull
        private final List<String> f93612f;

        public ModuleStyle(@Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull List list, boolean z6, boolean z7) {
            this.f93607a = str;
            this.f93608b = str2;
            this.f93609c = str3;
            this.f93610d = z6;
            this.f93611e = z7;
            this.f93612f = list;
        }

        @Nullable
        public final String a() {
            return this.f93608b;
        }

        public final boolean b() {
            return this.f93610d;
        }

        @Nullable
        public final String c() {
            return this.f93609c;
        }

        @NotNull
        public final List<String> d() {
            return this.f93612f;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ModuleStyle)) {
                return false;
            }
            ModuleStyle moduleStyle = (ModuleStyle) obj;
            return Intrinsics.areEqual(this.f93607a, moduleStyle.f93607a) && Intrinsics.areEqual(this.f93608b, moduleStyle.f93608b) && Intrinsics.areEqual(this.f93609c, moduleStyle.f93609c) && this.f93610d == moduleStyle.f93610d && this.f93611e == moduleStyle.f93611e && Intrinsics.areEqual(this.f93612f, moduleStyle.f93612f);
        }

        public final int hashCode() {
            int iHashCode = 0;
            String str = this.f93607a;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.f93608b;
            int iHashCode3 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.f93609c;
            if (str3 != null) {
                iHashCode = str3.hashCode();
            }
            return this.f93612f.hashCode() + z.a(z.a(((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode) * 31, 31, this.f93610d), 31, this.f93611e);
        }

        @NotNull
        public final String toString() {
            String str = this.f93608b;
            String str2 = this.f93609c;
            boolean z6 = this.f93610d;
            List<String> list = this.f93612f;
            StringBuilder sb = new StringBuilder("ModuleStyle(desc=");
            B.a(this.f93607a, ", dayColor=", str, ", nightColor=", sb);
            C3188c.a(str2, ", hasLine=", ", hidden=", sb, z6);
            return O.b(sb, this.f93611e, ", showPages=", list, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/floatlayer/OgvOldSeasonModule$StylePositive.class */
    @StabilityInferred(parameters = 0)
    @Bson
    public static final class StylePositive {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final List<OgvEpisode> f93613a;

        public StylePositive(@NotNull List<OgvEpisode> list) {
            this.f93613a = list;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StylePositive) && Intrinsics.areEqual(this.f93613a, ((StylePositive) obj).f93613a);
        }

        public final int hashCode() {
            return this.f93613a.hashCode();
        }

        @NotNull
        public final String toString() {
            return com.bapis.bilibili.account.interfaces.v1.k.a("StylePositive(episodes=", ")", this.f93613a);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/floatlayer/OgvOldSeasonModule$Type.class */
    public static final class Type implements com.bilibili.bson.adapter.a<String> {
        private static final EnumEntries $ENTRIES;
        private static final Type[] $VALUES;

        @NotNull
        private final String value;
        public static final Type EP_LIST = new Type("EP_LIST", 0, "positive");
        public static final Type SECTION_LIST = new Type("SECTION_LIST", 1, "section");
        public static final Type RELATE_LIST = new Type("RELATE_LIST", 2, "relate");

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{EP_LIST, SECTION_LIST, RELATE_LIST};
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/floatlayer/OgvOldSeasonModule$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f93614a;

        static {
            int[] iArr = new int[Type.values().length];
            try {
                iArr[Type.EP_LIST.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[Type.SECTION_LIST.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[Type.RELATE_LIST.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f93614a = iArr;
        }
    }

    public OgvOldSeasonModule() {
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public OgvOldSeasonModule(Type type, long j7, String str, String str2, MoreLeft moreLeft, String str3, Map map, boolean z6, ModuleStyle moduleStyle, JsonObject jsonObject, String str4, BgInfo bgInfo, int i7) throws NoWhenBranchMatchedException {
        java.lang.reflect.Type type2;
        type = (i7 & 1) != 0 ? Type.EP_LIST : type;
        this.f93595a = type;
        this.f93596b = j7;
        this.f93597c = str;
        this.f93598d = str2;
        this.f93599e = moreLeft;
        this.f93600f = str3;
        this.f93601g = map;
        this.h = z6;
        this.f93602i = moduleStyle;
        this.f93603j = jsonObject;
        this.f93604k = str4;
        this.f93605l = bgInfo;
        int i8 = a.f93614a[type.ordinal()];
        if (i8 == 1) {
            type2 = StylePositive.class;
        } else {
            if (i8 != 2 && i8 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            type2 = OgvOldPrevueSection.class;
        }
        this.f93606m = Intrinsics.areEqual(type2, JsonObject.class) ? jsonObject : jsonObject != null ? JsonUtilKt.parseJson((JsonElement) jsonObject, type2) : null;
    }

    @Nullable
    public final BgInfo a() {
        return this.f93605l;
    }

    @Nullable
    public final JsonObject b() {
        return this.f93603j;
    }

    @Nullable
    public final ModuleStyle c() {
        return this.f93602i;
    }

    @NotNull
    public final String d() {
        return this.f93597c;
    }

    @NotNull
    public final Type e() {
        return this.f93595a;
    }

    @NotNull
    public final String f() {
        return this.f93600f;
    }

    @NotNull
    public final MoreLeft g() {
        return this.f93599e;
    }

    public final boolean h() {
        return this.h;
    }
}
