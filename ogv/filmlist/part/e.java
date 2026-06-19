package com.bilibili.ogv.filmlist.part;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ogv.filmlist.favorite.CreateFavoriteModel$invoke$1;
import com.bilibili.ogv.operation3.module.followable.CreateFollowUpperModel$invoke$1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xj0.C8982c;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/filmlist/part/e.class */
@StabilityInferred(parameters = 0)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final C8982c f67762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final C8982c f67763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final C8982c f67764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final C8982c f67765d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final C8982c f67766e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final C8982c f67767f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final CreateFavoriteModel$invoke$1 f67768g;

    @Nullable
    public final CreateFollowUpperModel$invoke$1 h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ogv.filmlist.share.c f67769i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ogv.filmlist.guide.b f67770j;

    public e(@NotNull C8982c c8982c, @NotNull C8982c c8982c2, @NotNull C8982c c8982c3, @NotNull C8982c c8982c4, @NotNull C8982c c8982c5, @NotNull C8982c c8982c6, @NotNull CreateFavoriteModel$invoke$1 createFavoriteModel$invoke$1, @Nullable CreateFollowUpperModel$invoke$1 createFollowUpperModel$invoke$1, @NotNull com.bilibili.ogv.filmlist.share.c cVar, @NotNull com.bilibili.ogv.filmlist.guide.b bVar) {
        this.f67762a = c8982c;
        this.f67763b = c8982c2;
        this.f67764c = c8982c3;
        this.f67765d = c8982c4;
        this.f67766e = c8982c5;
        this.f67767f = c8982c6;
        this.f67768g = createFavoriteModel$invoke$1;
        this.h = createFollowUpperModel$invoke$1;
        this.f67769i = cVar;
        this.f67770j = bVar;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.areEqual(this.f67762a, eVar.f67762a) && Intrinsics.areEqual(this.f67763b, eVar.f67763b) && Intrinsics.areEqual(this.f67764c, eVar.f67764c) && Intrinsics.areEqual(this.f67765d, eVar.f67765d) && Intrinsics.areEqual(this.f67766e, eVar.f67766e) && Intrinsics.areEqual(this.f67767f, eVar.f67767f) && Intrinsics.areEqual(this.f67768g, eVar.f67768g) && Intrinsics.areEqual(this.h, eVar.h) && Intrinsics.areEqual(this.f67769i, eVar.f67769i) && Intrinsics.areEqual(this.f67770j, eVar.f67770j);
    }

    public final int hashCode() {
        int iHashCode = this.f67762a.hashCode();
        int iHashCode2 = this.f67763b.hashCode();
        int iHashCode3 = this.f67764c.hashCode();
        int iHashCode4 = this.f67765d.hashCode();
        int iHashCode5 = this.f67766e.hashCode();
        int iHashCode6 = this.f67767f.hashCode();
        int iHashCode7 = this.f67768g.hashCode();
        CreateFollowUpperModel$invoke$1 createFollowUpperModel$invoke$1 = this.h;
        return this.f67770j.hashCode() + ((this.f67769i.hashCode() + ((((iHashCode7 + ((iHashCode6 + ((iHashCode5 + ((iHashCode4 + ((iHashCode3 + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31) + (createFollowUpperModel$invoke$1 == null ? 0 : createFollowUpperModel$invoke$1.hashCode())) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "FilmListModels(favorite=" + this.f67762a + ", followUpper=" + this.f67763b + ", share=" + this.f67764c + ", comment=" + this.f67765d + ", square=" + this.f67766e + ", upProfile=" + this.f67767f + ", favoriteModel=" + this.f67768g + ", followUpperModel=" + this.h + ", filmListShareModel=" + this.f67769i + ", filmListGuideModel=" + this.f67770j + ")";
    }
}
