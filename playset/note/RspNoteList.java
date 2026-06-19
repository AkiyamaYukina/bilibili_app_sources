package com.bilibili.playset.note;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.live.streaming.source.TextSource;
import com.bilibili.opd.app.bizcommon.context.provider.MallProviderParamsHelper;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/note/RspNoteList.class */
@Keep
public class RspNoteList {

    @Nullable
    @JSONField(name = "list")
    public List<NoteBean> list;

    @Nullable
    @JSONField(name = MallProviderParamsHelper.ActiveProviderParams.URI_QUERY_PAGE)
    public Page page;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/note/RspNoteList$NoteBean.class */
    @Keep
    public static class NoteBean implements Parcelable {
        public static final Parcelable.Creator<NoteBean> CREATOR = new Object();

        @Nullable
        @JSONField(name = "arc")
        public ARC arc;

        @JSONField(name = "audit_status")
        public int auditStatus;

        @JSONField(name = "cvid")
        public long cvid;

        @Nullable
        @JSONField(name = "message")
        public String message;

        @JSONField(name = "note_id")
        public long noteId;

        @Nullable
        @JSONField(name = "summary")
        public String summary;

        @Nullable
        @JSONField(name = "title")
        public String title;

        @Nullable
        @JSONField(name = "mtime")
        public String updateTime;

        @Nullable
        @JSONField(name = "web_url")
        public String webUrl;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/note/RspNoteList$NoteBean$ARC.class */
        @Keep
        public static class ARC implements Parcelable {
            public static final Parcelable.Creator<ARC> CREATOR = new Object();

            @JSONField(name = "aid")
            public long aid;

            @Nullable
            @JSONField(name = "bvid")
            public String bvid;

            @Nullable
            @JSONField(name = "pic")
            public String cover;

            @Nullable
            @JSONField(name = "desc")
            public String desc;

            @JSONField(name = "oid")
            public long oid;

            @JSONField(name = "oid_type")
            public int oidType;

            @JSONField(name = NotificationCompat.CATEGORY_STATUS)
            public int status;

            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/note/RspNoteList$NoteBean$ARC$a.class */
            public final class a implements Parcelable.Creator<ARC> {
                @Override // android.os.Parcelable.Creator
                public final ARC createFromParcel(Parcel parcel) {
                    return new ARC(parcel);
                }

                @Override // android.os.Parcelable.Creator
                public final ARC[] newArray(int i7) {
                    return new ARC[i7];
                }
            }

            public ARC() {
            }

            public ARC(Parcel parcel) {
                this.oid = parcel.readLong();
                this.aid = parcel.readLong();
                this.bvid = parcel.readString();
                this.cover = parcel.readString();
                this.desc = parcel.readString();
                this.status = parcel.readInt();
                this.oidType = parcel.readInt();
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i7) {
                parcel.writeLong(this.oid);
                parcel.writeLong(this.aid);
                parcel.writeString(this.bvid);
                parcel.writeString(this.cover);
                parcel.writeString(this.desc);
                parcel.writeInt(this.status);
                parcel.writeInt(this.oidType);
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/note/RspNoteList$NoteBean$a.class */
        public final class a implements Parcelable.Creator<NoteBean> {
            @Override // android.os.Parcelable.Creator
            public final NoteBean createFromParcel(Parcel parcel) {
                return new NoteBean(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final NoteBean[] newArray(int i7) {
                return new NoteBean[i7];
            }
        }

        public NoteBean() {
        }

        public NoteBean(Parcel parcel) {
            this.noteId = parcel.readLong();
            this.title = parcel.readString();
            this.summary = parcel.readString();
            this.auditStatus = parcel.readInt();
            this.updateTime = parcel.readString();
            this.message = parcel.readString();
            this.cvid = parcel.readLong();
            this.arc = (ARC) parcel.readParcelable(ARC.class.getClassLoader());
            this.webUrl = parcel.readString();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean isValid() {
            ARC arc = this.arc;
            boolean z6 = false;
            if (arc != null) {
                z6 = false;
                if (arc.status == 0) {
                    z6 = true;
                }
            }
            return z6;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeLong(this.noteId);
            parcel.writeString(this.title);
            parcel.writeString(this.summary);
            parcel.writeInt(this.auditStatus);
            parcel.writeString(this.updateTime);
            parcel.writeString(this.message);
            parcel.writeLong(this.cvid);
            parcel.writeParcelable(this.arc, i7);
            parcel.writeString(this.webUrl);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/note/RspNoteList$Page.class */
    @Keep
    public static class Page {

        @JSONField(name = "num")
        public int num;

        @JSONField(name = TextSource.CFG_SIZE)
        public int size;

        @JSONField(name = "total")
        public int total;
    }
}
