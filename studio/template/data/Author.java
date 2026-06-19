package com.bilibili.studio.template.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/template/data/Author.class */
@Keep
public final class Author implements Parcelable {

    @NotNull
    public static final a CREATOR = new Object();

    @JSONField(name = "face")
    @Nullable
    private String face;

    @JSONField(name = EditCustomizeSticker.TAG_MID)
    private long mid;

    @JSONField(name = "name")
    @Nullable
    private String name;

    @JSONField(name = "notice")
    @Nullable
    private String notice;

    @JSONField(name = "up_from")
    private int upFrom;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/template/data/Author$a.class */
    public static final class a implements Parcelable.Creator<Author> {
        @Override // android.os.Parcelable.Creator
        public final Author createFromParcel(Parcel parcel) {
            return new Author(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final Author[] newArray(int i7) {
            return new Author[i7];
        }
    }

    public Author() {
    }

    public Author(@NotNull Parcel parcel) {
        this();
        this.face = parcel.readString();
        this.mid = parcel.readLong();
        this.name = parcel.readString();
        this.notice = parcel.readString();
        this.upFrom = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String getFace() {
        return this.face;
    }

    public final long getMid() {
        return this.mid;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getNotice() {
        return this.notice;
    }

    public final int getUpFrom() {
        return this.upFrom;
    }

    public final void setFace(@Nullable String str) {
        this.face = str;
    }

    public final void setMid(long j7) {
        this.mid = j7;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setNotice(@Nullable String str) {
        this.notice = str;
    }

    public final void setUpFrom(int i7) {
        this.upFrom = i7;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeString(this.face);
        parcel.writeLong(this.mid);
        parcel.writeString(this.name);
        parcel.writeString(this.notice);
        parcel.writeInt(this.upFrom);
    }
}
