package com.bilibili.lib.projection.internal.projectionitem;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.C3554n0;
import com.bilibili.lib.projection.internal.api.model.ProjectionQualityInfo;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionItem;
import com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem;
import com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionPlayableItem;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/projectionitem/ProjectionPlayableItemData.class */
public final class ProjectionPlayableItemData implements StandardProjectionPlayableItem {

    @NotNull
    public static final a CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f63516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ProjectionQualityInfo f63517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ArrayList<ProjectionQualityInfo> f63518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f63519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final StandardProjectionItem f63520e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/projectionitem/ProjectionPlayableItemData$a.class */
    public static final class a implements Parcelable.Creator<ProjectionPlayableItemData> {
        @Override // android.os.Parcelable.Creator
        public final ProjectionPlayableItemData createFromParcel(Parcel parcel) {
            return new ProjectionPlayableItemData(parcel.readString(), (ProjectionQualityInfo) parcel.readParcelable(ProjectionQualityInfo.class.getClassLoader()), parcel.createTypedArrayList(ProjectionQualityInfo.CREATOR), parcel.readLong(), (StandardProjectionItem) parcel.readParcelable(IProjectionItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ProjectionPlayableItemData[] newArray(int i7) {
            return new ProjectionPlayableItemData[i7];
        }
    }

    public ProjectionPlayableItemData(@NotNull String str, @NotNull ProjectionQualityInfo projectionQualityInfo, @NotNull ArrayList<ProjectionQualityInfo> arrayList, long j7, @NotNull StandardProjectionItem standardProjectionItem) {
        this.f63516a = str;
        this.f63517b = projectionQualityInfo;
        this.f63518c = arrayList;
        this.f63519d = j7;
        this.f63520e = standardProjectionItem;
    }

    @Override // com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionPlayableItem
    @NotNull
    public final ProjectionQualityInfo F0() {
        return this.f63517b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProjectionPlayableItemData)) {
            return false;
        }
        ProjectionPlayableItemData projectionPlayableItemData = (ProjectionPlayableItemData) obj;
        return Intrinsics.areEqual(this.f63516a, projectionPlayableItemData.f63516a) && Intrinsics.areEqual(this.f63517b, projectionPlayableItemData.f63517b) && Intrinsics.areEqual(this.f63518c, projectionPlayableItemData.f63518c) && this.f63519d == projectionPlayableItemData.f63519d && Intrinsics.areEqual(this.f63520e, projectionPlayableItemData.f63520e);
    }

    @Override // com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionPlayableItem
    public final long getDuration() {
        return this.f63519d;
    }

    @Override // com.bilibili.lib.projection.internal.projectionitem.base.IProjectionPlayableItem
    public final IProjectionItem getRawItem() {
        return this.f63520e;
    }

    @Override // com.bilibili.lib.projection.internal.projectionitem.base.CompatProjectionPlayableItem, com.bilibili.lib.projection.internal.projectionitem.base.IProjectionPlayableItem
    @NotNull
    public final StandardProjectionItem getRawItem() {
        return this.f63520e;
    }

    @Override // com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionPlayableItem
    @NotNull
    public final ArrayList<ProjectionQualityInfo> getSupportQualities() {
        return this.f63518c;
    }

    public final int hashCode() {
        return this.f63520e.hashCode() + C3554n0.a(Uu.a.a((this.f63517b.hashCode() + (this.f63516a.hashCode() * 31)) * 31, 31, this.f63518c), 31, this.f63519d);
    }

    @NotNull
    public final String toString() {
        return "ProjectionPlayableItemData(projectionUrl=" + this.f63516a + ", currentQualityInfo=" + this.f63517b + ", supportQualities=" + this.f63518c + ", duration=" + this.f63519d + ", rawItem=" + this.f63520e + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeString(this.f63516a);
        parcel.writeParcelable(this.f63517b, i7);
        parcel.writeTypedList(this.f63518c);
        parcel.writeLong(this.f63519d);
        parcel.writeParcelable(this.f63520e, i7);
    }

    @Override // com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionPlayableItem
    @NotNull
    public final String x() {
        return this.f63516a;
    }
}
