package com.bilibili.ship.theseus.ogv.operation;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u5.C8711a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/operation/OgvClickTarget.class */
@StabilityInferred(parameters = 0)
@Bson
public final class OgvClickTarget {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f94054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final OgvActionType f94055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ActionArouseType f94056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f94057d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f94058e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/operation/OgvClickTarget$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f94059a;

        static {
            int[] iArr = new int[OgvActionType.values().length];
            try {
                iArr[OgvActionType.LINK.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            f94059a = iArr;
        }
    }

    public OgvClickTarget() {
        this(null, null, null, null, null, 31);
    }

    public OgvClickTarget(String str, OgvActionType ogvActionType, ActionArouseType actionArouseType, Map map, Map map2, int i7) {
        str = (i7 & 1) != 0 ? "" : str;
        ogvActionType = (i7 & 2) != 0 ? null : ogvActionType;
        actionArouseType = (i7 & 4) != 0 ? ActionArouseType.NEW_PAGE : actionArouseType;
        map = (i7 & 8) != 0 ? MapsKt.emptyMap() : map;
        map2 = (i7 & 16) != 0 ? MapsKt.emptyMap() : map2;
        this.f94054a = str;
        this.f94055b = ogvActionType;
        this.f94056c = actionArouseType;
        this.f94057d = map;
        this.f94058e = map2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OgvClickTarget)) {
            return false;
        }
        OgvClickTarget ogvClickTarget = (OgvClickTarget) obj;
        return Intrinsics.areEqual(this.f94054a, ogvClickTarget.f94054a) && this.f94055b == ogvClickTarget.f94055b && this.f94056c == ogvClickTarget.f94056c && Intrinsics.areEqual(this.f94057d, ogvClickTarget.f94057d) && Intrinsics.areEqual(this.f94058e, ogvClickTarget.f94058e);
    }

    public final int hashCode() {
        int iHashCode = 0;
        String str = this.f94054a;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        OgvActionType ogvActionType = this.f94055b;
        if (ogvActionType != null) {
            iHashCode = ogvActionType.hashCode();
        }
        return this.f94058e.hashCode() + J2.g.a((this.f94056c.hashCode() + (((iHashCode2 * 31) + iHashCode) * 31)) * 31, this.f94057d, 31);
    }

    @NotNull
    public final String toString() {
        Map<String, String> map = this.f94057d;
        Map<String, String> map2 = this.f94058e;
        StringBuilder sb = new StringBuilder("OgvClickTarget(link=");
        sb.append(this.f94054a);
        sb.append(", actionType=");
        sb.append(this.f94055b);
        sb.append(", actionArouseType=");
        sb.append(this.f94056c);
        sb.append(", actionParams=");
        sb.append(map);
        sb.append(", orderReportParams=");
        return C8711a.a(sb, map2, ")");
    }
}
