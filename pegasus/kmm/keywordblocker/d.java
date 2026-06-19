package com.bilibili.pegasus.kmm.keywordblocker;

import K7.M;
import androidx.compose.animation.z;
import java.util.List;
import kntr.kotlin.native.ObjCExportAll;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/kmm/keywordblocker/d.class */
@ObjCExportAll(kind = ObjCExportAll.Kind.PROPERTY)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<a> f78261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final KeywordBlockPageStatus f78262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f78263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f78264d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final a f78265e;

    /* JADX WARN: Multi-variable type inference failed */
    public d(@NotNull List<? extends a> list, @NotNull KeywordBlockPageStatus keywordBlockPageStatus, @Nullable String str, boolean z6, @Nullable a aVar) {
        this.f78261a = list;
        this.f78262b = keywordBlockPageStatus;
        this.f78263c = str;
        this.f78264d = z6;
        this.f78265e = aVar;
    }

    public static d a(d dVar, List list, KeywordBlockPageStatus keywordBlockPageStatus, String str, boolean z6, a aVar, int i7) {
        if ((i7 & 1) != 0) {
            list = dVar.f78261a;
        }
        if ((i7 & 2) != 0) {
            keywordBlockPageStatus = dVar.f78262b;
        }
        if ((i7 & 4) != 0) {
            str = dVar.f78263c;
        }
        if ((i7 & 8) != 0) {
            z6 = dVar.f78264d;
        }
        if ((i7 & 16) != 0) {
            aVar = dVar.f78265e;
        }
        dVar.getClass();
        return new d(list, keywordBlockPageStatus, str, z6, aVar);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.f78261a, dVar.f78261a) && this.f78262b == dVar.f78262b && Intrinsics.areEqual(this.f78263c, dVar.f78263c) && this.f78264d == dVar.f78264d && Intrinsics.areEqual(this.f78265e, dVar.f78265e);
    }

    public final int hashCode() {
        int iHashCode = this.f78261a.hashCode();
        int iHashCode2 = this.f78262b.hashCode();
        String str = this.f78263c;
        int iA = z.a((((iHashCode2 + (iHashCode * 31)) * 31) + (str == null ? 0 : str.hashCode())) * 31, 31, this.f78264d);
        a aVar = this.f78265e;
        return iA + (aVar == null ? 0 : aVar.hashCode());
    }

    @NotNull
    public final String toString() {
        StringBuilder sbA = M.a("KeywordBlockerState(list=", ", status=", this.f78261a);
        sbA.append(this.f78262b);
        sbA.append(", previewWord=");
        sbA.append(this.f78263c);
        sbA.append(", canAdd=");
        sbA.append(this.f78264d);
        sbA.append(", toUpdateKeyword=");
        sbA.append(this.f78265e);
        sbA.append(")");
        return sbA.toString();
    }
}
