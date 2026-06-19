package com.bilibili.upper.module.manuscript.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.bilibili.upper.api.bean.manuscript.ArcAudit;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/bean/AuditReason.class */
public final class AuditReason {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f113565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f113566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f113567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f113568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f113569e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f113570f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f113571g;
    public int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List<ViolationPic> f113572i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArcAudit.ProblemDetail.RejectVideoExplain f113573j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f113574k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f113575l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f113576m;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/bean/AuditReason$ViolationPic.class */
    @Keep
    public static class ViolationPic implements Parcelable {
        public static final Parcelable.Creator<ViolationPic> CREATOR = new Object();
        public String timeStr;
        public String url;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/bean/AuditReason$ViolationPic$a.class */
        public final class a implements Parcelable.Creator<ViolationPic> {
            @Override // android.os.Parcelable.Creator
            public final ViolationPic createFromParcel(Parcel parcel) {
                return new ViolationPic(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final ViolationPic[] newArray(int i7) {
                return new ViolationPic[i7];
            }
        }

        public ViolationPic() {
        }

        public ViolationPic(Parcel parcel) {
            this.url = parcel.readString();
            this.timeStr = parcel.readString();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i7) {
            parcel.writeString(this.url);
            parcel.writeString(this.timeStr);
        }
    }
}
