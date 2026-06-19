package com.bilibili.studio.module.tuwen.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/module/tuwen/model/BCutVideoDetectBean.class */
@Keep
public final class BCutVideoDetectBean implements Serializable, Parcelable {

    @NotNull
    public static final a CREATOR = new Object();
    private boolean canReplace;

    @Nullable
    private float[] detectAvatarRect;
    private float detectAvatarRoll;
    private int detectMode;

    @NotNull
    private String id;
    private float originalVideoHeight;
    private float originalVideoWidth;

    @NotNull
    private String path;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/module/tuwen/model/BCutVideoDetectBean$a.class */
    public static final class a implements Parcelable.Creator<BCutVideoDetectBean> {
        @Override // android.os.Parcelable.Creator
        public final BCutVideoDetectBean createFromParcel(Parcel parcel) {
            return new BCutVideoDetectBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final BCutVideoDetectBean[] newArray(int i7) {
            return new BCutVideoDetectBean[i7];
        }
    }

    public BCutVideoDetectBean() {
        this.id = "";
        this.path = "";
    }

    public BCutVideoDetectBean(@NotNull Parcel parcel) {
        this();
        String string = parcel.readString();
        this.id = string == null ? "" : string;
        String string2 = parcel.readString();
        this.path = string2 == null ? "" : string2;
        this.detectMode = parcel.readInt();
        this.originalVideoWidth = parcel.readFloat();
        this.originalVideoHeight = parcel.readFloat();
        this.detectAvatarRect = parcel.createFloatArray();
        this.detectAvatarRoll = parcel.readFloat();
        this.canReplace = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final boolean getCanReplace() {
        return this.canReplace;
    }

    @Nullable
    public final float[] getDetectAvatarRect() {
        return this.detectAvatarRect;
    }

    public final float getDetectAvatarRoll() {
        return this.detectAvatarRoll;
    }

    public final int getDetectMode() {
        return this.detectMode;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final float getOriginalVideoHeight() {
        return this.originalVideoHeight;
    }

    public final float getOriginalVideoWidth() {
        return this.originalVideoWidth;
    }

    @NotNull
    public final String getPath() {
        return this.path;
    }

    public final void setCanReplace(boolean z6) {
        this.canReplace = z6;
    }

    public final void setDetectAvatarRect(@Nullable float[] fArr) {
        this.detectAvatarRect = fArr;
    }

    public final void setDetectAvatarRoll(float f7) {
        this.detectAvatarRoll = f7;
    }

    public final void setDetectMode(int i7) {
        this.detectMode = i7;
    }

    public final void setId(@NotNull String str) {
        this.id = str;
    }

    public final void setOriginalVideoHeight(float f7) {
        this.originalVideoHeight = f7;
    }

    public final void setOriginalVideoWidth(float f7) {
        this.originalVideoWidth = f7;
    }

    public final void setPath(@NotNull String str) {
        this.path = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeString(this.id);
        parcel.writeString(this.path);
        parcel.writeInt(this.detectMode);
        parcel.writeFloat(this.originalVideoWidth);
        parcel.writeFloat(this.originalVideoHeight);
        parcel.writeFloatArray(this.detectAvatarRect);
        parcel.writeFloat(this.detectAvatarRoll);
        parcel.writeByte(this.canReplace ? (byte) 1 : (byte) 0);
    }
}
