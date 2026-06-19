package com.bilibili.studio.centerplus.ui.dialog;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/ui/dialog/a.class */
public interface a {

    /* JADX INFO: renamed from: com.bilibili.studio.centerplus.ui.dialog.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/ui/dialog/a$a.class */
    public static final class C1183a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final String f105273a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final String f105274b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final String f105275c;

        public C1183a(@Nullable String str, @Nullable String str2, @Nullable String str3) {
            this.f105273a = str;
            this.f105274b = str2;
            this.f105275c = str3;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1183a)) {
                return false;
            }
            C1183a c1183a = (C1183a) obj;
            return Intrinsics.areEqual(this.f105273a, c1183a.f105273a) && Intrinsics.areEqual(this.f105274b, c1183a.f105274b) && Intrinsics.areEqual(this.f105275c, c1183a.f105275c);
        }

        public final int hashCode() {
            int iHashCode = 0;
            String str = this.f105273a;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.f105274b;
            int iHashCode3 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.f105275c;
            if (str3 != null) {
                iHashCode = str3.hashCode();
            }
            return (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("DraftBeanInfo(coverPath=");
            sb.append(this.f105273a);
            sb.append(", coverPic=");
            sb.append(this.f105274b);
            sb.append(", duration=");
            return C8770a.a(sb, this.f105275c, ")");
        }
    }

    @Nullable
    default C1183a Mb() {
        return null;
    }

    default void jb() {
    }

    default void o8() {
    }
}
