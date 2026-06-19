package com.bilibili.pegasus.channelv3.movie.detail;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.app.interfaces.v1.Cast;
import com.bapis.bilibili.app.interfaces.v1.MediaDetailReply;
import com.bapis.bilibili.app.interfaces.v1.Overview;
import com.bapis.bilibili.app.interfaces.v1.Staff;
import com.bapis.bilibili.app.interfaces.v1.n0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/detail/d.class */
@StabilityInferred(parameters = 0)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final b f75367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final g f75368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final f f75369c;

    /* JADX WARN: Type inference failed for: r0v17, types: [com.bilibili.pegasus.channelv3.movie.detail.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [com.bilibili.pegasus.channelv3.movie.detail.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v41, types: [com.bilibili.pegasus.channelv3.movie.detail.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.bilibili.pegasus.channelv3.movie.detail.f, java.lang.Object] */
    public d(@NotNull MediaDetailReply mediaDetailReply) {
        if (mediaDetailReply.hasCast()) {
            Cast cast = mediaDetailReply.getCast();
            ?? obj = new Object();
            obj.f75362b = "";
            List<n0> personList = cast.getPersonList();
            ArrayList arrayList = new ArrayList();
            for (n0 n0Var : personList) {
                ?? obj2 = new Object();
                obj2.f75370a = "";
                obj2.f75371b = "";
                obj2.f75372c = "";
                obj2.f75370a = n0Var.getRealName();
                obj2.f75371b = n0Var.getSquareUrl();
                obj2.f75372c = n0Var.getCharacter();
                obj2.f75373d = n0Var.getPersonId();
                arrayList.add(obj2);
            }
            obj.f75361a = arrayList;
            obj.f75362b = cast.getTitle();
            this.f75367a = obj;
        }
        if (mediaDetailReply.hasStaff()) {
            Staff staff = mediaDetailReply.getStaff();
            ?? obj3 = new Object();
            obj3.f75377a = "";
            obj3.f75378b = "";
            obj3.f75377a = staff.getTitle();
            obj3.f75378b = staff.getText();
            this.f75368b = obj3;
        }
        if (mediaDetailReply.hasOverview()) {
            Overview overview = mediaDetailReply.getOverview();
            ?? obj4 = new Object();
            obj4.f75375a = "";
            obj4.f75376b = "";
            obj4.f75375a = overview.getTitle();
            obj4.f75376b = overview.getText();
            this.f75369c = obj4;
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(d.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.f75367a, dVar.f75367a) && Intrinsics.areEqual(this.f75368b, dVar.f75368b) && Intrinsics.areEqual(this.f75369c, dVar.f75369c);
    }

    public final int hashCode() {
        int iHashCode = 0;
        b bVar = this.f75367a;
        int iHashCode2 = bVar != null ? bVar.hashCode() : 0;
        g gVar = this.f75368b;
        int iHashCode3 = gVar != null ? gVar.hashCode() : 0;
        f fVar = this.f75369c;
        if (fVar != null) {
            iHashCode = fVar.hashCode();
        }
        return (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
    }
}
