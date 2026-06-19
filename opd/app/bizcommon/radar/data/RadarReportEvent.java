package com.bilibili.opd.app.bizcommon.radar.data;

import G0.b;
import I.E;
import a5.C3188c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.animation.C3353d;
import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.B;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.api.base.Config;
import com.bilibili.base.MainThread;
import com.bilibili.opd.app.bizcommon.radar.data.RadarReportEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/data/RadarReportEvent.class */
@StabilityInferred(parameters = 0)
@Keep
public final class RadarReportEvent implements Parcelable {

    @Nullable
    private String eventName;

    @Nullable
    private JSONObject extra;

    @JSONField(deserialize = false, serialize = false)
    private boolean homeEvent;

    @Nullable
    private String isSamePage;
    private int isWeb;

    @Nullable
    private String pvend;

    @Nullable
    private String pvstart;

    @NotNull
    private String timestamp;

    @JSONField(deserialize = false, serialize = false)
    @Nullable
    private Function1<? super Boolean, Unit> triggerResultCallback;

    @JSONField(deserialize = false, serialize = false)
    @Nullable
    private Function1<? super Integer, Unit> triggerResultCodeCallback;

    @NotNull
    private String uuid;
    private boolean visitedHomePage;

    @NotNull
    public static final a CREATOR = new Object();
    public static final int $stable = 8;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/data/RadarReportEvent$a.class */
    public static final class a implements Parcelable.Creator<RadarReportEvent> {
        @Override // android.os.Parcelable.Creator
        public final RadarReportEvent createFromParcel(Parcel parcel) {
            return new RadarReportEvent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final RadarReportEvent[] newArray(int i7) {
            return new RadarReportEvent[i7];
        }
    }

    public RadarReportEvent() {
        this(null, null, null, null, false, 0, null, null, null, false, null, null, 4095, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RadarReportEvent(@NotNull Parcel parcel) {
        JSONObject object;
        String string = parcel.readString();
        string = string == null ? "" : string;
        String string2 = parcel.readString();
        string2 = string2 == null ? "" : string2;
        String string3 = parcel.readString();
        string3 = string3 == null ? "" : string3;
        try {
            object = JSON.parseObject(parcel.readString());
        } catch (Exception e7) {
            String str = "Parcelable:read error-:" + e7 + "-" + e7.getMessage();
            if (Config.isDebuggable()) {
                BLog.d("nov_test", str == null ? "null" : str);
            }
            object = null;
        }
        boolean z6 = parcel.readInt() == 1;
        int i7 = parcel.readInt();
        String string4 = parcel.readString();
        String str2 = string4 == null ? "" : string4;
        String string5 = parcel.readString();
        String str3 = string5 == null ? "" : string5;
        String string6 = parcel.readString();
        this(string, string2, string3, object, z6, i7, str2, str3, string6 == null ? "" : string6, parcel.readInt() == 1, null, null, 3072, null);
    }

    public RadarReportEvent(@Nullable String str, @NotNull String str2, @NotNull String str3, @Nullable JSONObject jSONObject, boolean z6, int i7, @Nullable String str4, @Nullable String str5, @Nullable String str6, boolean z7, @Nullable Function1<? super Boolean, Unit> function1, @Nullable Function1<? super Integer, Unit> function12) {
        this.eventName = str;
        this.timestamp = str2;
        this.uuid = str3;
        this.extra = jSONObject;
        this.visitedHomePage = z6;
        this.isWeb = i7;
        this.isSamePage = str4;
        this.pvstart = str5;
        this.pvend = str6;
        this.homeEvent = z7;
        this.triggerResultCallback = function1;
        this.triggerResultCodeCallback = function12;
    }

    public /* synthetic */ RadarReportEvent(String str, String str2, String str3, JSONObject jSONObject, boolean z6, int i7, String str4, String str5, String str6, boolean z7, Function1 function1, Function1 function12, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? "" : str, (i8 & 2) != 0 ? "" : str2, (i8 & 4) != 0 ? "" : str3, (i8 & 8) != 0 ? null : jSONObject, (i8 & 16) != 0 ? false : z6, (i8 & 32) != 0 ? 0 : i7, (i8 & 64) != 0 ? null : str4, (i8 & 128) != 0 ? "" : str5, (i8 & 256) != 0 ? "" : str6, (i8 & 512) != 0 ? false : z7, (i8 & 1024) != 0 ? null : function1, (i8 & 2048) != 0 ? null : function12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RadarReportEvent copy$default(RadarReportEvent radarReportEvent, String str, String str2, String str3, JSONObject jSONObject, boolean z6, int i7, String str4, String str5, String str6, boolean z7, Function1 function1, Function1 function12, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = radarReportEvent.eventName;
        }
        if ((i8 & 2) != 0) {
            str2 = radarReportEvent.timestamp;
        }
        if ((i8 & 4) != 0) {
            str3 = radarReportEvent.uuid;
        }
        if ((i8 & 8) != 0) {
            jSONObject = radarReportEvent.extra;
        }
        if ((i8 & 16) != 0) {
            z6 = radarReportEvent.visitedHomePage;
        }
        if ((i8 & 32) != 0) {
            i7 = radarReportEvent.isWeb;
        }
        if ((i8 & 64) != 0) {
            str4 = radarReportEvent.isSamePage;
        }
        if ((i8 & 128) != 0) {
            str5 = radarReportEvent.pvstart;
        }
        if ((i8 & 256) != 0) {
            str6 = radarReportEvent.pvend;
        }
        if ((i8 & 512) != 0) {
            z7 = radarReportEvent.homeEvent;
        }
        if ((i8 & 1024) != 0) {
            function1 = radarReportEvent.triggerResultCallback;
        }
        if ((i8 & 2048) != 0) {
            function12 = radarReportEvent.triggerResultCodeCallback;
        }
        return radarReportEvent.copy(str, str2, str3, jSONObject, z6, i7, str4, str5, str6, z7, function1, function12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit dispatchTriggerResultCode$lambda$0(Function1 function1, int i7, Function1 function12) {
        if (function1 != null) {
            boolean z6 = true;
            if (i7 != 1) {
                z6 = false;
            }
            function1.invoke(Boolean.valueOf(z6));
        }
        if (function12 != null) {
            function12.invoke(Integer.valueOf(i7));
        }
        return Unit.INSTANCE;
    }

    @Nullable
    public final String component1() {
        return this.eventName;
    }

    public final boolean component10() {
        return this.homeEvent;
    }

    @Nullable
    public final Function1<Boolean, Unit> component11() {
        return this.triggerResultCallback;
    }

    @Nullable
    public final Function1<Integer, Unit> component12() {
        return this.triggerResultCodeCallback;
    }

    @NotNull
    public final String component2() {
        return this.timestamp;
    }

    @NotNull
    public final String component3() {
        return this.uuid;
    }

    @Nullable
    public final JSONObject component4() {
        return this.extra;
    }

    public final boolean component5() {
        return this.visitedHomePage;
    }

    public final int component6() {
        return this.isWeb;
    }

    @Nullable
    public final String component7() {
        return this.isSamePage;
    }

    @Nullable
    public final String component8() {
        return this.pvstart;
    }

    @Nullable
    public final String component9() {
        return this.pvend;
    }

    @NotNull
    public final RadarReportEvent copy(@Nullable String str, @NotNull String str2, @NotNull String str3, @Nullable JSONObject jSONObject, boolean z6, int i7, @Nullable String str4, @Nullable String str5, @Nullable String str6, boolean z7, @Nullable Function1<? super Boolean, Unit> function1, @Nullable Function1<? super Integer, Unit> function12) {
        return new RadarReportEvent(str, str2, str3, jSONObject, z6, i7, str4, str5, str6, z7, function1, function12);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final void dispatchTriggerResult(boolean z6) {
        dispatchTriggerResultCode(z6 ? 1 : 0);
    }

    public final void dispatchTriggerResultCode(final int i7) {
        final Function1<? super Boolean, Unit> function1 = this.triggerResultCallback;
        final Function1<? super Integer, Unit> function12 = this.triggerResultCodeCallback;
        if (function1 == null && function12 == null) {
            return;
        }
        this.triggerResultCallback = null;
        this.triggerResultCodeCallback = null;
        MainThread.runOnMainThread(new Function0(function1, i7, function12) { // from class: en0.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Function1 f117347a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f117348b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Function1 f117349c;

            {
                this.f117347a = function1;
                this.f117348b = i7;
                this.f117349c = function12;
            }

            public final Object invoke() {
                return RadarReportEvent.dispatchTriggerResultCode$lambda$0(this.f117347a, this.f117348b, this.f117349c);
            }
        });
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RadarReportEvent)) {
            return false;
        }
        RadarReportEvent radarReportEvent = (RadarReportEvent) obj;
        return Intrinsics.areEqual(this.eventName, radarReportEvent.eventName) && Intrinsics.areEqual(this.timestamp, radarReportEvent.timestamp) && Intrinsics.areEqual(this.uuid, radarReportEvent.uuid) && Intrinsics.areEqual(this.extra, radarReportEvent.extra) && this.visitedHomePage == radarReportEvent.visitedHomePage && this.isWeb == radarReportEvent.isWeb && Intrinsics.areEqual(this.isSamePage, radarReportEvent.isSamePage) && Intrinsics.areEqual(this.pvstart, radarReportEvent.pvstart) && Intrinsics.areEqual(this.pvend, radarReportEvent.pvend) && this.homeEvent == radarReportEvent.homeEvent && Intrinsics.areEqual(this.triggerResultCallback, radarReportEvent.triggerResultCallback) && Intrinsics.areEqual(this.triggerResultCodeCallback, radarReportEvent.triggerResultCodeCallback);
    }

    @Nullable
    public final String getEventName() {
        return this.eventName;
    }

    @Nullable
    public final JSONObject getExtra() {
        return this.extra;
    }

    public final boolean getHomeEvent() {
        return this.homeEvent;
    }

    @Nullable
    public final String getPvend() {
        return this.pvend;
    }

    @Nullable
    public final String getPvstart() {
        return this.pvstart;
    }

    @NotNull
    public final String getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    public final Function1<Boolean, Unit> getTriggerResultCallback() {
        return this.triggerResultCallback;
    }

    @Nullable
    public final Function1<Integer, Unit> getTriggerResultCodeCallback() {
        return this.triggerResultCodeCallback;
    }

    @NotNull
    public final String getUuid() {
        return this.uuid;
    }

    public final boolean getVisitedHomePage() {
        return this.visitedHomePage;
    }

    public int hashCode() {
        String str = this.eventName;
        int iA = E.a(E.a((str == null ? 0 : str.hashCode()) * 31, 31, this.timestamp), 31, this.uuid);
        JSONObject jSONObject = this.extra;
        int iA2 = I.a(this.isWeb, z.a((iA + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31, 31, this.visitedHomePage), 31);
        String str2 = this.isSamePage;
        int iHashCode = str2 == null ? 0 : str2.hashCode();
        String str3 = this.pvstart;
        int iHashCode2 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.pvend;
        int iA3 = z.a((((((iA2 + iHashCode) * 31) + iHashCode2) * 31) + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.homeEvent);
        Function1<? super Boolean, Unit> function1 = this.triggerResultCallback;
        int iHashCode3 = function1 == null ? 0 : function1.hashCode();
        Function1<? super Integer, Unit> function12 = this.triggerResultCodeCallback;
        return ((iA3 + iHashCode3) * 31) + (function12 == null ? 0 : function12.hashCode());
    }

    @Nullable
    public final String isSamePage() {
        return this.isSamePage;
    }

    public final int isWeb() {
        return this.isWeb;
    }

    public final void setEventName(@Nullable String str) {
        this.eventName = str;
    }

    public final void setExtra(@Nullable JSONObject jSONObject) {
        this.extra = jSONObject;
    }

    public final void setHomeEvent(boolean z6) {
        this.homeEvent = z6;
    }

    public final void setPvend(@Nullable String str) {
        this.pvend = str;
    }

    public final void setPvstart(@Nullable String str) {
        this.pvstart = str;
    }

    public final void setSamePage(@Nullable String str) {
        this.isSamePage = str;
    }

    public final void setTimestamp(@NotNull String str) {
        this.timestamp = str;
    }

    public final void setTriggerResultCallback(@Nullable Function1<? super Boolean, Unit> function1) {
        this.triggerResultCallback = function1;
    }

    public final void setTriggerResultCodeCallback(@Nullable Function1<? super Integer, Unit> function1) {
        this.triggerResultCodeCallback = function1;
    }

    public final void setUuid(@NotNull String str) {
        this.uuid = str;
    }

    public final void setVisitedHomePage(boolean z6) {
        this.visitedHomePage = z6;
    }

    public final void setWeb(int i7) {
        this.isWeb = i7;
    }

    @NotNull
    public String toString() {
        String str = this.eventName;
        String str2 = this.timestamp;
        String str3 = this.uuid;
        JSONObject jSONObject = this.extra;
        boolean z6 = this.visitedHomePage;
        int i7 = this.isWeb;
        String str4 = this.isSamePage;
        String str5 = this.pvstart;
        String str6 = this.pvend;
        boolean z7 = this.homeEvent;
        Function1<? super Boolean, Unit> function1 = this.triggerResultCallback;
        Function1<? super Integer, Unit> function12 = this.triggerResultCodeCallback;
        StringBuilder sbA = b.a("RadarReportEvent(eventName=", str, ", timestamp=", str2, ", uuid=");
        sbA.append(str3);
        sbA.append(", extra=");
        sbA.append(jSONObject);
        sbA.append(", visitedHomePage=");
        C3353d.b(", isWeb=", ", isSamePage=", i7, z6, sbA);
        B.a(str4, ", pvstart=", str5, ", pvend=", sbA);
        C3188c.a(str6, ", homeEvent=", ", triggerResultCallback=", sbA, z7);
        sbA.append(function1);
        sbA.append(", triggerResultCodeCallback=");
        sbA.append(function12);
        sbA.append(")");
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeString(this.eventName);
        parcel.writeString(this.timestamp);
        parcel.writeString(this.uuid);
        JSONObject jSONObject = this.extra;
        parcel.writeString(jSONObject != null ? jSONObject.toJSONString() : null);
        parcel.writeInt(this.visitedHomePage ? 1 : 0);
        parcel.writeInt(this.isWeb);
        parcel.writeString(this.isSamePage);
        parcel.writeString(this.pvstart);
        parcel.writeString(this.pvend);
        parcel.writeInt(this.homeEvent ? 1 : 0);
    }
}
