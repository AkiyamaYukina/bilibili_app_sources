package com.bilibili.relation;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.relation.api.AttentionGroup;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/W.class */
public abstract class W {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/W$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a extends W {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f85983a;

        public a(@NotNull String str) {
            this.f85983a = str;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f85983a, ((a) obj).f85983a);
        }

        public final int hashCode() {
            return this.f85983a.hashCode();
        }

        @NotNull
        public final String toString() {
            return C8770a.a(new StringBuilder("Error(message="), this.f85983a, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/W$b.class */
    @StabilityInferred(parameters = 0)
    public static final class b extends W {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final List<AttentionGroup> f85984a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final AttentionGroup f85985b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final String f85986c;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@NotNull List<? extends AttentionGroup> list, @Nullable AttentionGroup attentionGroup, @Nullable String str) {
            this.f85984a = list;
            this.f85985b = attentionGroup;
            this.f85986c = str;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f85984a, bVar.f85984a) && Intrinsics.areEqual(this.f85985b, bVar.f85985b) && Intrinsics.areEqual(this.f85986c, bVar.f85986c);
        }

        public final int hashCode() {
            int iHashCode = this.f85984a.hashCode();
            int iHashCode2 = 0;
            AttentionGroup attentionGroup = this.f85985b;
            int iHashCode3 = attentionGroup == null ? 0 : attentionGroup.hashCode();
            String str = this.f85986c;
            if (str != null) {
                iHashCode2 = str.hashCode();
            }
            return (((iHashCode * 31) + iHashCode3) * 31) + iHashCode2;
        }

        @NotNull
        public final String toString() {
            StringBuilder sbA = K7.M.a("GroupList(groups=", ", defaultGroup=", this.f85984a);
            sbA.append(this.f85985b);
            sbA.append(", specialGroupId=");
            return C8770a.a(sbA, this.f85986c, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/W$c.class */
    @StabilityInferred(parameters = 1)
    public static final class c extends W {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f85987a = new W();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -2117911401;
        }

        @NotNull
        public final String toString() {
            return "Loading";
        }
    }
}
