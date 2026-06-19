package com.bilibili.ship.theseus.playlist.api;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/api/FolderFavorite.class */
@StabilityInferred(parameters = 1)
@Bson
public final class FolderFavorite {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f95203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f95204b;

    public FolderFavorite() {
        this(null, null, 3);
    }

    public FolderFavorite(String str, String str2, int i7) {
        str = (i7 & 1) != 0 ? "" : str;
        str2 = (i7 & 2) != 0 ? "" : str2;
        this.f95203a = str;
        this.f95204b = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FolderFavorite)) {
            return false;
        }
        FolderFavorite folderFavorite = (FolderFavorite) obj;
        return Intrinsics.areEqual(this.f95203a, folderFavorite.f95203a) && Intrinsics.areEqual(this.f95204b, folderFavorite.f95204b);
    }

    public final int hashCode() {
        return this.f95204b.hashCode() + (this.f95203a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("FolderFavorite(jumpLink=");
        sb.append(this.f95203a);
        sb.append(", toastMsg=");
        return C8770a.a(sb, this.f95204b, ")");
    }
}
