package com.bilibili.biligame.api.bean.gamedetail;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/gamedetail/GameDetailModule.class */
@StabilityInferred(parameters = 0)
@Keep
public final class GameDetailModule implements Parcelable {

    @JSONField(name = "module_code")
    @Nullable
    private String code;

    @JSONField(name = "customized_config")
    @Nullable
    private String extraConfig;

    @JSONField(name = "seq")
    private int position;

    @JSONField(name = "show_status")
    private int showStatus;

    @JSONField(name = "sub_list")
    @Nullable
    private List<GameDetailModule> subModule;

    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/gamedetail/GameDetailModule$CREATOR.class */
    public static final class CREATOR implements Parcelable.Creator<GameDetailModule> {
        private CREATOR() {
        }

        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ GameDetailModule create$default(CREATOR creator, String str, boolean z6, int i7, List list, String str2, int i8, Object obj) {
            if ((i8 & 2) != 0) {
                z6 = true;
            }
            if ((i8 & 4) != 0) {
                i7 = 0;
            }
            if ((i8 & 8) != 0) {
                list = null;
            }
            if ((i8 & 16) != 0) {
                str2 = null;
            }
            return creator.create(str, z6, i7, list, str2);
        }

        @NotNull
        public final GameDetailModule create(@NotNull String str, boolean z6, int i7, @Nullable List<GameDetailModule> list, @Nullable String str2) {
            GameDetailModule gameDetailModule = new GameDetailModule();
            gameDetailModule.setCode(str);
            gameDetailModule.setShowStatus(z6 ? 1 : 0);
            gameDetailModule.setPosition(i7);
            gameDetailModule.setSubModule(list);
            gameDetailModule.setExtraConfig(str2);
            return gameDetailModule;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public GameDetailModule createFromParcel(@NotNull Parcel parcel) {
            return new GameDetailModule(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public GameDetailModule[] newArray(int i7) {
            return new GameDetailModule[i7];
        }
    }

    public GameDetailModule() {
    }

    public GameDetailModule(@NotNull Parcel parcel) {
        this();
        this.showStatus = parcel.readInt();
        this.code = parcel.readString();
        this.position = parcel.readInt();
        this.extraConfig = parcel.readString();
        this.subModule = parcel.createTypedArrayList(CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(GameDetailModule.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        GameDetailModule gameDetailModule = (GameDetailModule) obj;
        return this.showStatus == gameDetailModule.showStatus && Intrinsics.areEqual(this.code, gameDetailModule.code) && this.position == gameDetailModule.position && Intrinsics.areEqual(this.extraConfig, gameDetailModule.extraConfig) && Intrinsics.areEqual(this.subModule, gameDetailModule.subModule);
    }

    @Nullable
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final String getExtraConfig() {
        return this.extraConfig;
    }

    public final int getPosition() {
        return this.position;
    }

    public final int getShowStatus() {
        return this.showStatus;
    }

    @Nullable
    public final List<GameDetailModule> getSubModule() {
        return this.subModule;
    }

    public int hashCode() {
        int i7 = this.showStatus;
        String str = this.code;
        int iHashCode = 0;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        int i8 = this.position;
        String str2 = this.extraConfig;
        int iHashCode3 = str2 != null ? str2.hashCode() : 0;
        List<GameDetailModule> list = this.subModule;
        if (list != null) {
            iHashCode = list.hashCode();
        }
        return (((((((i7 * 31) + iHashCode2) * 31) + i8) * 31) + iHashCode3) * 31) + iHashCode;
    }

    public final boolean isShow() {
        boolean z6 = true;
        if (this.showStatus != 1) {
            z6 = false;
        }
        return z6;
    }

    public final void setCode(@Nullable String str) {
        this.code = str;
    }

    public final void setExtraConfig(@Nullable String str) {
        this.extraConfig = str;
    }

    public final void setPosition(int i7) {
        this.position = i7;
    }

    public final void setShowStatus(int i7) {
        this.showStatus = i7;
    }

    public final void setSubModule(@Nullable List<GameDetailModule> list) {
        this.subModule = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeInt(this.showStatus);
        parcel.writeString(this.code);
        parcel.writeInt(this.position);
        parcel.writeString(this.extraConfig);
        parcel.writeTypedList(this.subModule);
    }
}
