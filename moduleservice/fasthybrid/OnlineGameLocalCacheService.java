package com.bilibili.moduleservice.fasthybrid;

import I.E;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/moduleservice/fasthybrid/OnlineGameLocalCacheService.class */
public interface OnlineGameLocalCacheService {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/moduleservice/fasthybrid/OnlineGameLocalCacheService$CachedModInfo.class */
    public static final class CachedModInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f66303a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f66304b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f66305c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final String f66306d;

        public CachedModInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable String str4) {
            this.f66303a = str;
            this.f66304b = str2;
            this.f66305c = str3;
            this.f66306d = str4;
        }

        public static /* synthetic */ CachedModInfo copy$default(CachedModInfo cachedModInfo, String str, String str2, String str3, String str4, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = cachedModInfo.f66303a;
            }
            if ((i7 & 2) != 0) {
                str2 = cachedModInfo.f66304b;
            }
            if ((i7 & 4) != 0) {
                str3 = cachedModInfo.f66305c;
            }
            if ((i7 & 8) != 0) {
                str4 = cachedModInfo.f66306d;
            }
            return cachedModInfo.copy(str, str2, str3, str4);
        }

        @NotNull
        public final String component1() {
            return this.f66303a;
        }

        @NotNull
        public final String component2() {
            return this.f66304b;
        }

        @NotNull
        public final String component3() {
            return this.f66305c;
        }

        @Nullable
        public final String component4() {
            return this.f66306d;
        }

        @NotNull
        public final CachedModInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable String str4) {
            return new CachedModInfo(str, str2, str3, str4);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CachedModInfo)) {
                return false;
            }
            CachedModInfo cachedModInfo = (CachedModInfo) obj;
            return Intrinsics.areEqual(this.f66303a, cachedModInfo.f66303a) && Intrinsics.areEqual(this.f66304b, cachedModInfo.f66304b) && Intrinsics.areEqual(this.f66305c, cachedModInfo.f66305c) && Intrinsics.areEqual(this.f66306d, cachedModInfo.f66306d);
        }

        @NotNull
        public final String getClientId() {
            return this.f66303a;
        }

        @Nullable
        public final String getGrayResName() {
            return this.f66306d;
        }

        @NotNull
        public final String getGroupName() {
            return this.f66304b;
        }

        @NotNull
        public final String getResName() {
            return this.f66305c;
        }

        public int hashCode() {
            int iA = E.a(E.a(this.f66303a.hashCode() * 31, 31, this.f66304b), 31, this.f66305c);
            String str = this.f66306d;
            return iA + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("CachedModInfo(clientId=");
            sb.append(this.f66303a);
            sb.append(", groupName=");
            sb.append(this.f66304b);
            sb.append(", resName=");
            sb.append(this.f66305c);
            sb.append(", grayResName=");
            return C8770a.a(sb, this.f66306d, ")");
        }
    }

    @NotNull
    List<CachedModInfo> getAllLocalCachedModInfos();
}
