package com.bilibili.biligame.beantri;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/beantri/BiligameModuleTri.class */
@StabilityInferred(parameters = 0)
@Keep
public final class BiligameModuleTri implements Parcelable {

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
    private List<BiligameModuleTri> subModule;

    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/beantri/BiligameModuleTri$CREATOR.class */
    public static final class CREATOR implements Parcelable.Creator<BiligameModuleTri> {
        private CREATOR() {
        }

        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ BiligameModuleTri create$default(CREATOR creator, String str, boolean z6, int i7, List list, String str2, int i8, Object obj) {
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
        public final BiligameModuleTri create(@NotNull String str, boolean z6, int i7, @Nullable List<BiligameModuleTri> list, @Nullable String str2) {
            BiligameModuleTri biligameModuleTri = new BiligameModuleTri();
            biligameModuleTri.setCode(str);
            biligameModuleTri.setShowStatus(z6 ? 1 : 0);
            biligameModuleTri.setPosition(i7);
            biligameModuleTri.setSubModule(list);
            biligameModuleTri.setExtraConfig(str2);
            return biligameModuleTri;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public BiligameModuleTri createFromParcel(@NotNull Parcel parcel) {
            return new BiligameModuleTri(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public BiligameModuleTri[] newArray(int i7) {
            return new BiligameModuleTri[i7];
        }
    }

    public BiligameModuleTri() {
    }

    public BiligameModuleTri(@NotNull Parcel parcel) {
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
    public final List<BiligameModuleTri> getSubModule() {
        return this.subModule;
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

    public final void setSubModule(@Nullable List<BiligameModuleTri> list) {
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
