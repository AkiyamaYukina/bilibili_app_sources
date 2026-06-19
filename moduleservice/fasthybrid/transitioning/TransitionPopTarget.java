package com.bilibili.moduleservice.fasthybrid.transitioning;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.bilibili.moduleservice.fasthybrid.transitioning.data.AppletFrame;
import java.util.Arrays;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/moduleservice/fasthybrid/transitioning/TransitionPopTarget.class */
@Keep
public final class TransitionPopTarget implements Parcelable {

    @NotNull
    private String extra;

    @NotNull
    private byte[] targetCapture;

    @NotNull
    private AppletFrame targetFrame;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @JvmField
    @NotNull
    public static final Parcelable.Creator<TransitionPopTarget> CREATOR = new Parcelable.Creator<TransitionPopTarget>() { // from class: com.bilibili.moduleservice.fasthybrid.transitioning.TransitionPopTarget$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TransitionPopTarget createFromParcel(Parcel parcel) {
            return new TransitionPopTarget(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TransitionPopTarget[] newArray(int i7) {
            return new TransitionPopTarget[i7];
        }
    };

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/moduleservice/fasthybrid/transitioning/TransitionPopTarget$Companion.class */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public TransitionPopTarget(@NotNull Parcel parcel) {
        this((AppletFrame) parcel.readParcelable(AppletFrame.class.getClassLoader()), parcel.createByteArray(), parcel.readString());
    }

    public TransitionPopTarget(@NotNull AppletFrame appletFrame, @NotNull byte[] bArr, @NotNull String str) {
        this.targetFrame = appletFrame;
        this.targetCapture = bArr;
        this.extra = str;
    }

    public static /* synthetic */ TransitionPopTarget copy$default(TransitionPopTarget transitionPopTarget, AppletFrame appletFrame, byte[] bArr, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            appletFrame = transitionPopTarget.targetFrame;
        }
        if ((i7 & 2) != 0) {
            bArr = transitionPopTarget.targetCapture;
        }
        if ((i7 & 4) != 0) {
            str = transitionPopTarget.extra;
        }
        return transitionPopTarget.copy(appletFrame, bArr, str);
    }

    @NotNull
    public final AppletFrame component1() {
        return this.targetFrame;
    }

    @NotNull
    public final byte[] component2() {
        return this.targetCapture;
    }

    @NotNull
    public final String component3() {
        return this.extra;
    }

    @NotNull
    public final TransitionPopTarget copy(@NotNull AppletFrame appletFrame, @NotNull byte[] bArr, @NotNull String str) {
        return new TransitionPopTarget(appletFrame, bArr, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransitionPopTarget)) {
            return false;
        }
        TransitionPopTarget transitionPopTarget = (TransitionPopTarget) obj;
        return Intrinsics.areEqual(this.targetFrame, transitionPopTarget.targetFrame) && Intrinsics.areEqual(this.targetCapture, transitionPopTarget.targetCapture) && Intrinsics.areEqual(this.extra, transitionPopTarget.extra);
    }

    @NotNull
    public final String getExtra() {
        return this.extra;
    }

    @NotNull
    public final byte[] getTargetCapture() {
        return this.targetCapture;
    }

    @NotNull
    public final AppletFrame getTargetFrame() {
        return this.targetFrame;
    }

    public int hashCode() {
        int iHashCode = this.targetFrame.hashCode();
        return this.extra.hashCode() + ((Arrays.hashCode(this.targetCapture) + (iHashCode * 31)) * 31);
    }

    public final void setExtra(@NotNull String str) {
        this.extra = str;
    }

    public final void setTargetCapture(@NotNull byte[] bArr) {
        this.targetCapture = bArr;
    }

    public final void setTargetFrame(@NotNull AppletFrame appletFrame) {
        this.targetFrame = appletFrame;
    }

    @NotNull
    public String toString() {
        AppletFrame appletFrame = this.targetFrame;
        String string = Arrays.toString(this.targetCapture);
        String str = this.extra;
        StringBuilder sb = new StringBuilder("TransitionPopTarget(targetFrame=");
        sb.append(appletFrame);
        sb.append(", targetCapture=");
        sb.append(string);
        sb.append(", extra=");
        return C8770a.a(sb, str, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeParcelable(this.targetFrame, i7);
        parcel.writeByteArray(this.targetCapture);
        parcel.writeString(this.extra);
    }
}
