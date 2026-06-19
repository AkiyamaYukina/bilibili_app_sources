package com.bilibili.opd.app.bizcommon.hybridruntime.neul;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/hybridruntime/neul/NeulConfig.class */
@Keep
public final class NeulConfig implements Parcelable {

    @NotNull
    public static final a CREATOR = new Object();

    @JSONField(name = "mall_neul_enable")
    private int mallNeulEnable;

    @Nullable
    private Boolean neulOpen;

    @JSONField(name = "speedPageUrls")
    @Nullable
    private ArrayList<String> speedPageUrls;

    @JSONField(name = "testNeulUrls")
    @Nullable
    private ArrayList<String> testNeulUrls;

    @JSONField(name = "timeout")
    private int timeout;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/hybridruntime/neul/NeulConfig$a.class */
    public static final class a implements Parcelable.Creator<NeulConfig> {
        @Override // android.os.Parcelable.Creator
        public final NeulConfig createFromParcel(Parcel parcel) {
            return new NeulConfig(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final NeulConfig[] newArray(int i7) {
            return new NeulConfig[i7];
        }
    }

    public NeulConfig() {
        this.timeout = 2000;
    }

    public NeulConfig(@NotNull Parcel parcel) {
        this();
        Object value = parcel.readValue(Boolean.TYPE.getClassLoader());
        this.neulOpen = value instanceof Boolean ? (Boolean) value : null;
        ArrayList<String> arrayList = new ArrayList<>();
        this.speedPageUrls = arrayList;
        parcel.readStringList(arrayList);
        List<String> list = this.testNeulUrls;
        if (list != null) {
            parcel.readStringList(list);
        }
        this.timeout = parcel.readInt();
        this.mallNeulEnable = parcel.readInt();
    }

    public NeulConfig(boolean z6) {
        this();
        this.neulOpen = Boolean.valueOf(z6);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean available() {
        /*
            r3 = this;
            r0 = r3
            java.util.ArrayList<java.lang.String> r0 = r0.speedPageUrls
            r8 = r0
            r0 = 1
            r7 = r0
            r0 = r8
            if (r0 == 0) goto L1b
            r0 = r8
            int r0 = r0.size()
            if (r0 <= 0) goto L1b
            r0 = 1
            r4 = r0
            goto L1d
        L1b:
            r0 = 0
            r4 = r0
        L1d:
            r0 = r4
            r5 = r0
            r0 = r4
            if (r0 != 0) goto L3f
            r0 = r3
            java.util.ArrayList<java.lang.String> r0 = r0.testNeulUrls
            r8 = r0
            r0 = r4
            r5 = r0
            r0 = r8
            if (r0 == 0) goto L3f
            r0 = r8
            int r0 = r0.size()
            if (r0 <= 0) goto L3d
            r0 = 1
            r5 = r0
            goto L3f
        L3d:
            r0 = 0
            r5 = r0
        L3f:
            r0 = r5
            if (r0 == 0) goto L6b
            r0 = r3
            int r0 = r0.mallNeulEnable
            r1 = 1
            if (r0 != r1) goto L6b
            r0 = r3
            java.lang.Boolean r0 = r0.neulOpen
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L5f
            r0 = r8
            boolean r0 = r0.booleanValue()
            r6 = r0
            goto L61
        L5f:
            r0 = 0
            r6 = r0
        L61:
            r0 = r6
            if (r0 == 0) goto L6b
            r0 = r7
            r6 = r0
            goto L6d
        L6b:
            r0 = 0
            r6 = r0
        L6d:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.hybridruntime.neul.NeulConfig.available():boolean");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int getMallNeulEnable() {
        return this.mallNeulEnable;
    }

    @Nullable
    public final Boolean getNeulOpen() {
        return this.neulOpen;
    }

    @Nullable
    public final ArrayList<String> getSpeedPageUrls() {
        return this.speedPageUrls;
    }

    @Nullable
    public final ArrayList<String> getTestNeulUrls() {
        return this.testNeulUrls;
    }

    public final int getTimeout() {
        return this.timeout;
    }

    public final void setMallNeulEnable(int i7) {
        this.mallNeulEnable = i7;
    }

    public final void setNeulOpen(@Nullable Boolean bool) {
        this.neulOpen = bool;
    }

    public final void setSpeedPageUrls(@Nullable ArrayList<String> arrayList) {
        this.speedPageUrls = arrayList;
    }

    public final void setTestNeulUrls(@Nullable ArrayList<String> arrayList) {
        this.testNeulUrls = arrayList;
    }

    public final void setTimeout(int i7) {
        this.timeout = i7;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeValue(this.neulOpen);
        ArrayList<String> arrayList = this.speedPageUrls;
        if (arrayList != null) {
            parcel.writeStringList(arrayList);
        }
        ArrayList<String> arrayList2 = this.testNeulUrls;
        if (arrayList2 != null) {
            parcel.writeStringList(arrayList2);
        }
        parcel.writeInt(this.timeout);
        parcel.writeInt(this.mallNeulEnable);
    }
}
