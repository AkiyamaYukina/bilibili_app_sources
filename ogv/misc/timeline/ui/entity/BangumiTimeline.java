package com.bilibili.ogv.misc.timeline.ui.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/ui/entity/BangumiTimeline.class */
@StabilityInferred(parameters = 0)
@Bson
public final class BangumiTimeline implements Parcelable {

    @JvmField
    @NotNull
    public static final Parcelable.Creator<BangumiTimeline> CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f69521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public String f69522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("cover")
    @Nullable
    private String f69523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("square_cover")
    @Nullable
    private String f69524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f69525e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f69526f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f69527g;

    @Nullable
    public String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public String f69528i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public String f69529j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f69530k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @SerializedName("delay")
    private boolean f69531l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f69532m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public String f69533n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public String f69534o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @SerializedName("episode_id")
    @Nullable
    private String f69535p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public String f69536q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f69537r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public List<TimelineTag> f69538s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public Map<String, String> f69539t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public transient boolean f69540u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final transient int f69541v;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/ui/entity/BangumiTimeline$TimelineTag.class */
    @StabilityInferred(parameters = 0)
    @Bson
    public static final class TimelineTag implements Parcelable {

        @NotNull
        public static final a CREATOR = new Object();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public String f69542a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f69543b;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/ui/entity/BangumiTimeline$TimelineTag$a.class */
        public static final class a implements Parcelable.Creator<TimelineTag> {
            @Override // android.os.Parcelable.Creator
            public final TimelineTag createFromParcel(Parcel parcel) {
                TimelineTag timelineTag = new TimelineTag();
                String string = parcel.readString();
                String str = string;
                if (string == null) {
                    str = "";
                }
                timelineTag.f69542a = str;
                timelineTag.f69543b = parcel.readInt();
                return timelineTag;
            }

            @Override // android.os.Parcelable.Creator
            public final TimelineTag[] newArray(int i7) {
                return new TimelineTag[i7];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i7) {
            parcel.writeString(this.f69542a);
            parcel.writeInt(this.f69543b);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/ui/entity/BangumiTimeline$a.class */
    public static final class a implements Parcelable.Creator<BangumiTimeline> {
        @Override // android.os.Parcelable.Creator
        public final BangumiTimeline createFromParcel(Parcel parcel) {
            return new BangumiTimeline(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final BangumiTimeline[] newArray(int i7) {
            return new BangumiTimeline[i7];
        }
    }

    public BangumiTimeline() {
        this.f69538s = CollectionsKt.emptyList();
        this.f69540u = true;
    }

    public BangumiTimeline(@NotNull Parcel parcel) {
        this.f69538s = CollectionsKt.emptyList();
        this.f69540u = true;
        this.f69541v = parcel.readInt();
        this.f69521a = parcel.readLong();
        this.f69522b = parcel.readString();
        this.f69523c = parcel.readString();
        this.f69524d = parcel.readString();
        this.f69525e = parcel.readInt();
        this.f69526f = parcel.readByte() != 0;
        this.f69527g = parcel.readInt();
        this.h = parcel.readString();
        this.f69528i = parcel.readString();
        this.f69529j = parcel.readString();
        this.f69530k = parcel.readLong();
        this.f69531l = parcel.readByte() != 0;
        this.f69532m = parcel.readInt();
        this.f69533n = parcel.readString();
        this.f69534o = parcel.readString();
        this.f69535p = parcel.readString();
        this.f69540u = parcel.readByte() != 0;
        this.f69536q = parcel.readString();
        this.f69537r = parcel.readInt();
        List<TimelineTag> listCreateTypedArrayList = parcel.createTypedArrayList(TimelineTag.CREATOR);
        this.f69538s = listCreateTypedArrayList == null ? CollectionsKt.emptyList() : listCreateTypedArrayList;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        parcel.readMap(linkedHashMap, BangumiTimeline.class.getClassLoader());
        this.f69539t = linkedHashMap;
    }

    @Nullable
    public final String a() {
        return this.f69523c;
    }

    @Nullable
    public final String b() {
        return this.f69535p;
    }

    public final long c() {
        return this.f69530k * ((long) 1000);
    }

    @Nullable
    public final String d() {
        return this.f69524d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean h() {
        return this.f69531l;
    }

    public final void i(@Nullable String str) {
        this.f69523c = str;
    }

    public final void j(boolean z6) {
        this.f69531l = z6;
    }

    public final void m(@Nullable String str) {
        this.f69535p = str;
    }

    public final void n(@Nullable String str) {
        this.f69524d = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeInt(this.f69541v);
        parcel.writeLong(this.f69521a);
        parcel.writeString(this.f69522b);
        parcel.writeString(this.f69523c);
        parcel.writeString(this.f69524d);
        parcel.writeInt(this.f69525e);
        parcel.writeByte(this.f69526f ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f69527g);
        parcel.writeString(this.h);
        parcel.writeString(this.f69528i);
        parcel.writeString(this.f69529j);
        parcel.writeLong(this.f69530k);
        parcel.writeByte(this.f69531l ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f69532m);
        parcel.writeString(this.f69533n);
        parcel.writeString(this.f69534o);
        parcel.writeString(this.f69535p);
        parcel.writeByte(this.f69540u ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f69536q);
        parcel.writeInt(this.f69537r);
        parcel.writeTypedList(this.f69538s);
        parcel.writeMap(this.f69539t);
    }
}
