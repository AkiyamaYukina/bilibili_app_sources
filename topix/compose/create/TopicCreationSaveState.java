package com.bilibili.topix.compose.create;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/compose/create/TopicCreationSaveState.class */
@StabilityInferred(parameters = 0)
@Parcelize
public final class TopicCreationSaveState implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TopicCreationSaveState> CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f112495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f112496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f112497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final TopicType f112498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f112499e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/compose/create/TopicCreationSaveState$a.class */
    public static final class a implements Parcelable.Creator<TopicCreationSaveState> {
        @Override // android.os.Parcelable.Creator
        public final TopicCreationSaveState createFromParcel(Parcel parcel) {
            return new TopicCreationSaveState(parcel.readString(), parcel.readString(), parcel.readString(), TopicType.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final TopicCreationSaveState[] newArray(int i7) {
            return new TopicCreationSaveState[i7];
        }
    }

    public TopicCreationSaveState(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull TopicType topicType, boolean z6) {
        this.f112495a = str;
        this.f112496b = str2;
        this.f112497c = str3;
        this.f112498d = topicType;
        this.f112499e = z6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TopicCreationSaveState)) {
            return false;
        }
        TopicCreationSaveState topicCreationSaveState = (TopicCreationSaveState) obj;
        return Intrinsics.areEqual(this.f112495a, topicCreationSaveState.f112495a) && Intrinsics.areEqual(this.f112496b, topicCreationSaveState.f112496b) && Intrinsics.areEqual(this.f112497c, topicCreationSaveState.f112497c) && this.f112498d == topicCreationSaveState.f112498d && this.f112499e == topicCreationSaveState.f112499e;
    }

    public final int hashCode() {
        int iA = I.E.a(I.E.a(this.f112495a.hashCode() * 31, 31, this.f112496b), 31, this.f112497c);
        return Boolean.hashCode(this.f112499e) + ((this.f112498d.hashCode() + iA) * 31);
    }

    @NotNull
    public final String toString() {
        String str = this.f112495a;
        String str2 = this.f112496b;
        String str3 = this.f112497c;
        TopicType topicType = this.f112498d;
        boolean z6 = this.f112499e;
        StringBuilder sbA = G0.b.a("TopicCreationSaveState(name=", str, ", desc=", str2, ", scene=");
        sbA.append(str3);
        sbA.append(", type=");
        sbA.append(topicType);
        sbA.append(", checkedCoCreation=");
        return androidx.appcompat.app.i.a(sbA, z6, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeString(this.f112495a);
        parcel.writeString(this.f112496b);
        parcel.writeString(this.f112497c);
        parcel.writeString(this.f112498d.name());
        parcel.writeInt(this.f112499e ? 1 : 0);
    }
}
