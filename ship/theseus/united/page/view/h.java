package com.bilibili.ship.theseus.united.page.view;

import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/view/h.class */
@StabilityInferred(parameters = 1)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final n f104086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final p f104087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f104088c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final r f104089d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final f f104090e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final l f104091f;

    public h(n nVar, p pVar, r rVar, f fVar, l lVar) {
        this.f104086a = nVar;
        this.f104087b = pVar;
        this.f104089d = rVar;
        this.f104090e = fVar;
        this.f104091f = lVar;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.areEqual(this.f104086a, hVar.f104086a) && Intrinsics.areEqual(this.f104087b, hVar.f104087b) && this.f104088c == hVar.f104088c && Intrinsics.areEqual(this.f104089d, hVar.f104089d) && Intrinsics.areEqual(this.f104090e, hVar.f104090e) && Intrinsics.areEqual(this.f104091f, hVar.f104091f);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f104086a.f104103a);
        int iHashCode2 = 0;
        p pVar = this.f104087b;
        int iA = z.a(((iHashCode * 31) + (pVar == null ? 0 : pVar.hashCode())) * 31, 31, this.f104088c);
        r rVar = this.f104089d;
        int iHashCode3 = rVar == null ? 0 : rVar.hashCode();
        f fVar = this.f104090e;
        int iHashCode4 = fVar == null ? 0 : fVar.hashCode();
        l lVar = this.f104091f;
        if (lVar != null) {
            iHashCode2 = Boolean.hashCode(lVar.f104098a);
        }
        return ((((iA + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode2;
    }

    @NotNull
    public final String toString() {
        return "Config(online=" + this.f104086a + ", playerIcon=" + this.f104087b + ", showDmChest=" + this.f104088c + ", storyEntrance=" + this.f104089d + ", bgPlayNotice=" + this.f104090e + ", immersion=" + this.f104091f + ")";
    }
}
