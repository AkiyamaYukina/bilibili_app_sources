package com.bilibili.opd.app.bizcommon.radar.data;

import G0.b;
import I.E;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.EnvironmentCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/data/RadarTriggerEvent.class */
@StabilityInferred(parameters = 0)
@Keep
public final class RadarTriggerEvent implements Parcelable {

    @Nullable
    private String eventName;

    @Nullable
    private RadarTriggerContent messageContent;

    @NotNull
    private String messageType;

    @NotNull
    public static final a CREATOR = new Object();
    public static final int $stable = 8;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/data/RadarTriggerEvent$a.class */
    public static final class a implements Parcelable.Creator<RadarTriggerEvent> {
        @Override // android.os.Parcelable.Creator
        public final RadarTriggerEvent createFromParcel(Parcel parcel) {
            return new RadarTriggerEvent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final RadarTriggerEvent[] newArray(int i7) {
            return new RadarTriggerEvent[i7];
        }
    }

    public RadarTriggerEvent() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RadarTriggerEvent(@NotNull Parcel parcel) {
        String string = parcel.readString();
        String str = string == null ? "" : string;
        String string2 = parcel.readString();
        this(str, string2 != null ? string2 : "", (RadarTriggerContent) parcel.readParcelable(RadarTriggerContent.class.getClassLoader()));
    }

    public RadarTriggerEvent(@Nullable String str, @NotNull String str2, @Nullable RadarTriggerContent radarTriggerContent) {
        this.eventName = str;
        this.messageType = str2;
        this.messageContent = radarTriggerContent;
    }

    public /* synthetic */ RadarTriggerEvent(String str, String str2, RadarTriggerContent radarTriggerContent, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? "" : str, (i7 & 2) != 0 ? EnvironmentCompat.MEDIA_UNKNOWN : str2, (i7 & 4) != 0 ? null : radarTriggerContent);
    }

    public static /* synthetic */ RadarTriggerEvent copy$default(RadarTriggerEvent radarTriggerEvent, String str, String str2, RadarTriggerContent radarTriggerContent, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = radarTriggerEvent.eventName;
        }
        if ((i7 & 2) != 0) {
            str2 = radarTriggerEvent.messageType;
        }
        if ((i7 & 4) != 0) {
            radarTriggerContent = radarTriggerEvent.messageContent;
        }
        return radarTriggerEvent.copy(str, str2, radarTriggerContent);
    }

    @Nullable
    public final String component1() {
        return this.eventName;
    }

    @NotNull
    public final String component2() {
        return this.messageType;
    }

    @Nullable
    public final RadarTriggerContent component3() {
        return this.messageContent;
    }

    @NotNull
    public final RadarTriggerEvent copy(@Nullable String str, @NotNull String str2, @Nullable RadarTriggerContent radarTriggerContent) {
        return new RadarTriggerEvent(str, str2, radarTriggerContent);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RadarTriggerEvent)) {
            return false;
        }
        RadarTriggerEvent radarTriggerEvent = (RadarTriggerEvent) obj;
        return Intrinsics.areEqual(this.eventName, radarTriggerEvent.eventName) && Intrinsics.areEqual(this.messageType, radarTriggerEvent.messageType) && Intrinsics.areEqual(this.messageContent, radarTriggerEvent.messageContent);
    }

    @Nullable
    public final String getEventName() {
        return this.eventName;
    }

    @Nullable
    public final RadarTriggerContent getMessageContent() {
        return this.messageContent;
    }

    @NotNull
    public final String getMessageType() {
        return this.messageType;
    }

    public int hashCode() {
        String str = this.eventName;
        int iA = E.a((str == null ? 0 : str.hashCode()) * 31, 31, this.messageType);
        RadarTriggerContent radarTriggerContent = this.messageContent;
        return iA + (radarTriggerContent == null ? 0 : radarTriggerContent.hashCode());
    }

    public final void setEventName(@Nullable String str) {
        this.eventName = str;
    }

    public final void setMessageContent(@Nullable RadarTriggerContent radarTriggerContent) {
        this.messageContent = radarTriggerContent;
    }

    public final void setMessageType(@NotNull String str) {
        this.messageType = str;
    }

    @NotNull
    public String toString() {
        String str = this.eventName;
        String str2 = this.messageType;
        RadarTriggerContent radarTriggerContent = this.messageContent;
        StringBuilder sbA = b.a("RadarTriggerEvent(eventName=", str, ", messageType=", str2, ", messageContent=");
        sbA.append(radarTriggerContent);
        sbA.append(")");
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeString(this.eventName);
        parcel.writeString(this.messageType);
        parcel.writeParcelable(this.messageContent, i7);
    }
}
