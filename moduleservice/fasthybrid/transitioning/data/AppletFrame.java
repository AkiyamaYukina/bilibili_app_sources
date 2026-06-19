package com.bilibili.moduleservice.fasthybrid.transitioning.data;

import Vn.A;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.animation.core.I;
import androidx.constraintlayout.widget.d;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/moduleservice/fasthybrid/transitioning/data/AppletFrame.class */
@Keep
public final class AppletFrame implements Parcelable {
    private int height;
    private int width;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f66310x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f66311y;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @JvmField
    @NotNull
    public static final Parcelable.Creator<AppletFrame> CREATOR = new Parcelable.Creator<AppletFrame>() { // from class: com.bilibili.moduleservice.fasthybrid.transitioning.data.AppletFrame$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AppletFrame createFromParcel(Parcel parcel) {
            return new AppletFrame(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AppletFrame[] newArray(int i7) {
            return new AppletFrame[i7];
        }
    };

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/moduleservice/fasthybrid/transitioning/data/AppletFrame$Companion.class */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AppletFrame() {
        this(0, 0, 0, 0, 15, null);
    }

    public AppletFrame(int i7, int i8, int i9, int i10) {
        this.f66310x = i7;
        this.f66311y = i8;
        this.width = i9;
        this.height = i10;
    }

    public /* synthetic */ AppletFrame(int i7, int i8, int i9, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i7, (i11 & 2) != 0 ? 0 : i8, (i11 & 4) != 0 ? 0 : i9, (i11 & 8) != 0 ? 0 : i10);
    }

    public AppletFrame(@NotNull Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }

    public static /* synthetic */ AppletFrame copy$default(AppletFrame appletFrame, int i7, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i7 = appletFrame.f66310x;
        }
        if ((i11 & 2) != 0) {
            i8 = appletFrame.f66311y;
        }
        if ((i11 & 4) != 0) {
            i9 = appletFrame.width;
        }
        if ((i11 & 8) != 0) {
            i10 = appletFrame.height;
        }
        return appletFrame.copy(i7, i8, i9, i10);
    }

    public final int component1() {
        return this.f66310x;
    }

    public final int component2() {
        return this.f66311y;
    }

    public final int component3() {
        return this.width;
    }

    public final int component4() {
        return this.height;
    }

    @NotNull
    public final AppletFrame copy(int i7, int i8, int i9, int i10) {
        return new AppletFrame(i7, i8, i9, i10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppletFrame)) {
            return false;
        }
        AppletFrame appletFrame = (AppletFrame) obj;
        return this.f66310x == appletFrame.f66310x && this.f66311y == appletFrame.f66311y && this.width == appletFrame.width && this.height == appletFrame.height;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getX() {
        return this.f66310x;
    }

    public final int getY() {
        return this.f66311y;
    }

    public int hashCode() {
        return Integer.hashCode(this.height) + I.a(this.width, I.a(this.f66311y, Integer.hashCode(this.f66310x) * 31, 31), 31);
    }

    public final void setHeight(int i7) {
        this.height = i7;
    }

    public final void setWidth(int i7) {
        this.width = i7;
    }

    public final void setX(int i7) {
        this.f66310x = i7;
    }

    public final void setY(int i7) {
        this.f66311y = i7;
    }

    @NotNull
    public String toString() {
        return d.a(this.width, this.height, ", height=", ")", A.b(this.f66310x, this.f66311y, "AppletFrame(x=", ", y=", ", width="));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeInt(this.f66310x);
        parcel.writeInt(this.f66311y);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
    }
}
