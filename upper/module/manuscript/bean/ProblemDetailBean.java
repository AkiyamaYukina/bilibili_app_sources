package com.bilibili.upper.module.manuscript.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/bean/ProblemDetailBean.class */
@Keep
public class ProblemDetailBean implements Parcelable {
    public static final Parcelable.Creator<ProblemDetailBean> CREATOR = new Object();
    public long aid;
    public int appealState;
    public String appealUrl;
    public String auditList;
    public String coverUrl;
    public String errorMsg;
    public int isOwner;
    public int limitState;
    public int limitedOpen;
    public String modifyAdvice;
    public String problemDescription;
    public String problemDescriptionTitle;
    public String rejectURL;
    public int source;
    public long state;
    public String stateInfo;
    public int statePanel;
    public String title;
    public String violationPics;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/bean/ProblemDetailBean$a.class */
    public final class a implements Parcelable.Creator<ProblemDetailBean> {
        @Override // android.os.Parcelable.Creator
        public final ProblemDetailBean createFromParcel(Parcel parcel) {
            return new ProblemDetailBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ProblemDetailBean[] newArray(int i7) {
            return new ProblemDetailBean[i7];
        }
    }

    public ProblemDetailBean() {
    }

    public ProblemDetailBean(Parcel parcel) {
        this.rejectURL = parcel.readString();
        this.statePanel = parcel.readInt();
        this.limitState = parcel.readInt();
        this.source = parcel.readInt();
        this.errorMsg = parcel.readString();
        this.aid = parcel.readLong();
        this.appealUrl = parcel.readString();
        this.appealState = parcel.readInt();
        this.isOwner = parcel.readInt();
        this.auditList = parcel.readString();
        this.modifyAdvice = parcel.readString();
        this.problemDescription = parcel.readString();
        this.problemDescriptionTitle = parcel.readString();
        this.violationPics = parcel.readString();
        this.coverUrl = parcel.readString();
        this.stateInfo = parcel.readString();
        this.title = parcel.readString();
        this.state = parcel.readLong();
        this.limitedOpen = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean isLimit() {
        boolean z6 = true;
        if (this.limitState != 1) {
            z6 = false;
        }
        return z6;
    }

    public boolean isOwner() {
        boolean z6 = true;
        if (this.isOwner != 1) {
            z6 = false;
        }
        return z6;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.rejectURL);
        parcel.writeInt(this.statePanel);
        parcel.writeInt(this.limitState);
        parcel.writeInt(this.source);
        parcel.writeString(this.errorMsg);
        parcel.writeLong(this.aid);
        parcel.writeString(this.appealUrl);
        parcel.writeInt(this.appealState);
        parcel.writeInt(this.isOwner);
        parcel.writeString(this.auditList);
        parcel.writeString(this.modifyAdvice);
        parcel.writeString(this.problemDescription);
        parcel.writeString(this.problemDescriptionTitle);
        parcel.writeString(this.violationPics);
        parcel.writeString(this.coverUrl);
        parcel.writeString(this.stateInfo);
        parcel.writeString(this.title);
        parcel.writeLong(this.state);
        parcel.writeInt(this.limitedOpen);
    }
}
