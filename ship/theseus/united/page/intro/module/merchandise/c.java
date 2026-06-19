package com.bilibili.ship.theseus.united.page.intro.module.merchandise;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.adcommon.data.model.SourceContent;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/merchandise/c.class */
@StabilityInferred(parameters = 0)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f100572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f100573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final List<k> f100574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final b f100575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final SourceContent f100576e;

    public c(@Nullable String str, @Nullable String str2, @Nullable List<k> list, @Nullable b bVar, @Nullable SourceContent sourceContent) {
        this.f100572a = str;
        this.f100573b = str2;
        this.f100574c = list;
        this.f100575d = bVar;
        this.f100576e = sourceContent;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f100572a, cVar.f100572a) && Intrinsics.areEqual(this.f100573b, cVar.f100573b) && Intrinsics.areEqual(this.f100574c, cVar.f100574c) && Intrinsics.areEqual(this.f100575d, cVar.f100575d) && Intrinsics.areEqual(this.f100576e, cVar.f100576e);
    }

    public final int hashCode() {
        int iHashCode = 0;
        String str = this.f100572a;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.f100573b;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        List<k> list = this.f100574c;
        int iHashCode4 = list == null ? 0 : list.hashCode();
        b bVar = this.f100575d;
        int iHashCode5 = bVar == null ? 0 : bVar.hashCode();
        SourceContent sourceContent = this.f100576e;
        if (sourceContent != null) {
            iHashCode = sourceContent.hashCode();
        }
        return (((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode;
    }

    @NotNull
    public final String toString() {
        List<k> list = this.f100574c;
        StringBuilder sb = new StringBuilder("MerchandiseCard(cover=");
        sb.append(this.f100572a);
        sb.append(", title=");
        M6.f.a(this.f100573b, ", subtitleList=", ", button=", sb, list);
        sb.append(this.f100575d);
        sb.append(", sourceContent=");
        sb.append(this.f100576e);
        sb.append(")");
        return sb.toString();
    }
}
