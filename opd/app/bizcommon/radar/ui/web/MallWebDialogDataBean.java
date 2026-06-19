package com.bilibili.opd.app.bizcommon.radar.ui.web;

import G0.b;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.opd.app.bizcommon.radar.data.RadarTriggerContent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/ui/web/MallWebDialogDataBean.class */
@StabilityInferred(parameters = 0)
@Keep
public final class MallWebDialogDataBean implements Parcelable {

    @Nullable
    private RadarTriggerContent content;

    @Nullable
    private String dismissCallbackId;

    @Nullable
    private String messageTypeDialog;

    @Nullable
    private String shareCallbackId;

    @Nullable
    private String url;

    @NotNull
    public static final a CREATOR = new Object();
    public static final int $stable = 8;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/ui/web/MallWebDialogDataBean$a.class */
    public static final class a implements Parcelable.Creator<MallWebDialogDataBean> {
        @Override // android.os.Parcelable.Creator
        public final MallWebDialogDataBean createFromParcel(Parcel parcel) {
            return new MallWebDialogDataBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final MallWebDialogDataBean[] newArray(int i7) {
            return new MallWebDialogDataBean[i7];
        }
    }

    public MallWebDialogDataBean() {
        this(null, null, null, null, null, 31, null);
    }

    public MallWebDialogDataBean(@NotNull Parcel parcel) {
        this(parcel.readString(), parcel.readString(), (RadarTriggerContent) parcel.readParcelable(RadarTriggerContent.class.getClassLoader()), parcel.readString(), parcel.readString());
    }

    public MallWebDialogDataBean(@Nullable String str, @Nullable String str2, @Nullable RadarTriggerContent radarTriggerContent, @Nullable String str3, @Nullable String str4) {
        this.url = str;
        this.messageTypeDialog = str2;
        this.content = radarTriggerContent;
        this.dismissCallbackId = str3;
        this.shareCallbackId = str4;
    }

    public /* synthetic */ MallWebDialogDataBean(String str, String str2, RadarTriggerContent radarTriggerContent, String str3, String str4, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? "" : str, (i7 & 2) != 0 ? "" : str2, (i7 & 4) != 0 ? new RadarTriggerContent(null, null, null, null, null, 0L, 0L, null, null, null, 0, 0, null, false, 0L, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 3, null) : radarTriggerContent, (i7 & 8) != 0 ? null : str3, (i7 & 16) != 0 ? null : str4);
    }

    public static /* synthetic */ MallWebDialogDataBean copy$default(MallWebDialogDataBean mallWebDialogDataBean, String str, String str2, RadarTriggerContent radarTriggerContent, String str3, String str4, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = mallWebDialogDataBean.url;
        }
        if ((i7 & 2) != 0) {
            str2 = mallWebDialogDataBean.messageTypeDialog;
        }
        if ((i7 & 4) != 0) {
            radarTriggerContent = mallWebDialogDataBean.content;
        }
        if ((i7 & 8) != 0) {
            str3 = mallWebDialogDataBean.dismissCallbackId;
        }
        if ((i7 & 16) != 0) {
            str4 = mallWebDialogDataBean.shareCallbackId;
        }
        return mallWebDialogDataBean.copy(str, str2, radarTriggerContent, str3, str4);
    }

    @Nullable
    public final String component1() {
        return this.url;
    }

    @Nullable
    public final String component2() {
        return this.messageTypeDialog;
    }

    @Nullable
    public final RadarTriggerContent component3() {
        return this.content;
    }

    @Nullable
    public final String component4() {
        return this.dismissCallbackId;
    }

    @Nullable
    public final String component5() {
        return this.shareCallbackId;
    }

    @NotNull
    public final MallWebDialogDataBean copy(@Nullable String str, @Nullable String str2, @Nullable RadarTriggerContent radarTriggerContent, @Nullable String str3, @Nullable String str4) {
        return new MallWebDialogDataBean(str, str2, radarTriggerContent, str3, str4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MallWebDialogDataBean)) {
            return false;
        }
        MallWebDialogDataBean mallWebDialogDataBean = (MallWebDialogDataBean) obj;
        return Intrinsics.areEqual(this.url, mallWebDialogDataBean.url) && Intrinsics.areEqual(this.messageTypeDialog, mallWebDialogDataBean.messageTypeDialog) && Intrinsics.areEqual(this.content, mallWebDialogDataBean.content) && Intrinsics.areEqual(this.dismissCallbackId, mallWebDialogDataBean.dismissCallbackId) && Intrinsics.areEqual(this.shareCallbackId, mallWebDialogDataBean.shareCallbackId);
    }

    @Nullable
    public final RadarTriggerContent getContent() {
        return this.content;
    }

    @Nullable
    public final String getDismissCallbackId() {
        return this.dismissCallbackId;
    }

    @Nullable
    public final String getMessageTypeDialog() {
        return this.messageTypeDialog;
    }

    @Nullable
    public final String getShareCallbackId() {
        return this.shareCallbackId;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.url;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.messageTypeDialog;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        RadarTriggerContent radarTriggerContent = this.content;
        int iHashCode4 = radarTriggerContent == null ? 0 : radarTriggerContent.hashCode();
        String str3 = this.dismissCallbackId;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.shareCallbackId;
        if (str4 != null) {
            iHashCode = str4.hashCode();
        }
        return (((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode;
    }

    public final void setContent(@Nullable RadarTriggerContent radarTriggerContent) {
        this.content = radarTriggerContent;
    }

    public final void setDismissCallbackId(@Nullable String str) {
        this.dismissCallbackId = str;
    }

    public final void setMessageTypeDialog(@Nullable String str) {
        this.messageTypeDialog = str;
    }

    public final void setShareCallbackId(@Nullable String str) {
        this.shareCallbackId = str;
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }

    @NotNull
    public String toString() {
        String str = this.url;
        String str2 = this.messageTypeDialog;
        RadarTriggerContent radarTriggerContent = this.content;
        String str3 = this.dismissCallbackId;
        String str4 = this.shareCallbackId;
        StringBuilder sbA = b.a("MallWebDialogDataBean(url=", str, ", messageTypeDialog=", str2, ", content=");
        sbA.append(radarTriggerContent);
        sbA.append(", dismissCallbackId=");
        sbA.append(str3);
        sbA.append(", shareCallbackId=");
        return C8770a.a(sbA, str4, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeString(this.url);
        parcel.writeString(this.messageTypeDialog);
        parcel.writeParcelable(this.content, i7);
        parcel.writeString(this.dismissCallbackId);
        parcel.writeString(this.shareCallbackId);
    }
}
