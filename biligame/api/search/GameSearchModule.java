package com.bilibili.biligame.api.search;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/search/GameSearchModule.class */
@StabilityInferred(parameters = 0)
@Parcelize
@Keep
public final class GameSearchModule implements Parcelable {
    private boolean isShow;

    @Nullable
    private String moduleCode;
    private int position;

    @NotNull
    public static final Parcelable.Creator<GameSearchModule> CREATOR = new Object();
    public static final int $stable = 8;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/search/GameSearchModule$a.class */
    public static final class a implements Parcelable.Creator<GameSearchModule> {
        @Override // android.os.Parcelable.Creator
        public final GameSearchModule createFromParcel(Parcel parcel) {
            return new GameSearchModule(parcel.readInt() != 0, parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final GameSearchModule[] newArray(int i7) {
            return new GameSearchModule[i7];
        }
    }

    public GameSearchModule() {
        this(false, null, 0, 7, null);
    }

    public GameSearchModule(boolean z6, @Nullable String str, int i7) {
        this.isShow = z6;
        this.moduleCode = str;
        this.position = i7;
    }

    public /* synthetic */ GameSearchModule(boolean z6, String str, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? false : z6, (i8 & 2) != 0 ? null : str, (i8 & 4) != 0 ? 0 : i7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Nullable
    public final String getModuleCode() {
        return this.moduleCode;
    }

    public final int getPosition() {
        return this.position;
    }

    public final boolean isShow() {
        return this.isShow;
    }

    public final void setModuleCode(@Nullable String str) {
        this.moduleCode = str;
    }

    public final void setPosition(int i7) {
        this.position = i7;
    }

    public final void setShow(boolean z6) {
        this.isShow = z6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeInt(this.isShow ? 1 : 0);
        parcel.writeString(this.moduleCode);
        parcel.writeInt(this.position);
    }
}
