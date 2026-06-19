package com.bilibili.teenagersmode.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bus.IInterProcData;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/model/TeenagerTimeLockStatusRefresh.class */
@StabilityInferred(parameters = 0)
@Parcelize
public final class TeenagerTimeLockStatusRefresh implements IInterProcData {

    @NotNull
    public static final Parcelable.Creator<TeenagerTimeLockStatusRefresh> CREATOR = new a();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/model/TeenagerTimeLockStatusRefresh$a.class */
    public static final class a implements Parcelable.Creator<TeenagerTimeLockStatusRefresh> {
        @Override // android.os.Parcelable.Creator
        public final TeenagerTimeLockStatusRefresh createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new TeenagerTimeLockStatusRefresh();
        }

        @Override // android.os.Parcelable.Creator
        public final TeenagerTimeLockStatusRefresh[] newArray(int i7) {
            return new TeenagerTimeLockStatusRefresh[i7];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeInt(1);
    }
}
