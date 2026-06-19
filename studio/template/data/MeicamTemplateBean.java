package com.bilibili.studio.template.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/template/data/MeicamTemplateBean.class */
@Parcelize
@Keep
public final class MeicamTemplateBean implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MeicamTemplateBean> CREATOR = new Object();

    @Nullable
    private String templateId;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/template/data/MeicamTemplateBean$a.class */
    public static final class a implements Parcelable.Creator<MeicamTemplateBean> {
        @Override // android.os.Parcelable.Creator
        public final MeicamTemplateBean createFromParcel(Parcel parcel) {
            return new MeicamTemplateBean(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MeicamTemplateBean[] newArray(int i7) {
            return new MeicamTemplateBean[i7];
        }
    }

    public MeicamTemplateBean() {
        this(null, 1, null);
    }

    public MeicamTemplateBean(@Nullable String str) {
        this.templateId = str;
    }

    public /* synthetic */ MeicamTemplateBean(String str, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? "" : str);
    }

    public static /* synthetic */ MeicamTemplateBean copy$default(MeicamTemplateBean meicamTemplateBean, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = meicamTemplateBean.templateId;
        }
        return meicamTemplateBean.copy(str);
    }

    @Nullable
    public final String component1() {
        return this.templateId;
    }

    @NotNull
    public final MeicamTemplateBean copy(@Nullable String str) {
        return new MeicamTemplateBean(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MeicamTemplateBean) && Intrinsics.areEqual(this.templateId, ((MeicamTemplateBean) obj).templateId);
    }

    @Nullable
    public final String getTemplateId() {
        return this.templateId;
    }

    public int hashCode() {
        String str = this.templateId;
        return str == null ? 0 : str.hashCode();
    }

    public final void setTemplateId(@Nullable String str) {
        this.templateId = str;
    }

    @NotNull
    public String toString() {
        return android.support.v4.media.a.a("MeicamTemplateBean(templateId=", this.templateId, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeString(this.templateId);
    }
}
