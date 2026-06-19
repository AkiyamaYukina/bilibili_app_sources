package com.bilibili.biligame.api.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.biligame.utils.NumUtils;
import com.bilibili.biligame.utils.Utils;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/BiligameTestInfo.class */
@StabilityInferred(parameters = 0)
@Keep
public final class BiligameTestInfo implements Parcelable, Serializable {

    @JSONField(name = "end_test_time")
    @Nullable
    private String endTestTime;

    @JSONField(name = "game_base_id")
    private int gameBaseId;

    @JSONField(name = "is_precise_time")
    private int preciseTime;

    @JSONField(name = "start_test_time")
    @Nullable
    private String startTestTime;

    @JSONField(name = "start_test_type")
    @Nullable
    private String testType;

    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/BiligameTestInfo$CREATOR.class */
    public static final class CREATOR implements Parcelable.Creator<BiligameTestInfo> {
        private CREATOR() {
        }

        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public BiligameTestInfo createFromParcel(@NotNull Parcel parcel) {
            return new BiligameTestInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public BiligameTestInfo[] newArray(int i7) {
            return new BiligameTestInfo[i7];
        }
    }

    public BiligameTestInfo() {
    }

    public BiligameTestInfo(@NotNull Parcel parcel) {
        this();
        this.gameBaseId = parcel.readInt();
        this.startTestTime = parcel.readString();
        this.endTestTime = parcel.readString();
        this.preciseTime = parcel.readInt();
        this.testType = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String getEndDate() {
        long j7 = NumUtils.parseLong(this.endTestTime);
        if (j7 <= 0) {
            return null;
        }
        return Utils.formatDate(j7, "yyyy/MM/dd");
    }

    @Nullable
    public final String getEndTestTime() {
        return this.endTestTime;
    }

    @Nullable
    public final String getEndTime() {
        long j7 = NumUtils.parseLong(this.endTestTime);
        if (j7 <= 0) {
            return null;
        }
        int i7 = this.preciseTime;
        if (i7 == 0 || i7 == 2) {
            return Utils.formatDate(j7, "HH:mm:ss");
        }
        return null;
    }

    public final int getGameBaseId() {
        return this.gameBaseId;
    }

    public final int getPreciseTime() {
        return this.preciseTime;
    }

    @Nullable
    public final String getStartDate() {
        long j7 = NumUtils.parseLong(this.startTestTime);
        if (j7 <= 0) {
            return null;
        }
        return Utils.formatDate(j7, "yyyy/MM/dd");
    }

    @Nullable
    public final String getStartTestTime() {
        return this.startTestTime;
    }

    @Nullable
    public final String getStartTime() {
        long j7 = NumUtils.parseLong(this.startTestTime);
        if (j7 <= 0) {
            return null;
        }
        int i7 = this.preciseTime;
        if (i7 == 0 || i7 == 2) {
            return Utils.formatDate(j7, "HH:mm:ss");
        }
        return null;
    }

    @Nullable
    public final String getTestType() {
        return this.testType;
    }

    public final void setEndTestTime(@Nullable String str) {
        this.endTestTime = str;
    }

    public final void setGameBaseId(int i7) {
        this.gameBaseId = i7;
    }

    public final void setPreciseTime(int i7) {
        this.preciseTime = i7;
    }

    public final void setStartTestTime(@Nullable String str) {
        this.startTestTime = str;
    }

    public final void setTestType(@Nullable String str) {
        this.testType = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeInt(this.gameBaseId);
        parcel.writeString(this.startTestTime);
        parcel.writeString(this.endTestTime);
        parcel.writeInt(this.preciseTime);
        parcel.writeString(this.testType);
    }
}
