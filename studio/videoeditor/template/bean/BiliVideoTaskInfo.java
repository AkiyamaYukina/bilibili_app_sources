package com.bilibili.studio.videoeditor.template.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.lib.sharewrapper.basic.ThirdPartyExtraBuilder;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/template/bean/BiliVideoTaskInfo.class */
@Keep
public class BiliVideoTaskInfo implements Serializable, Parcelable {
    public static final Parcelable.Creator<BiliVideoTaskInfo> CREATOR = new Object();

    @JSONField(name = "des_file_path")
    public String desFilePath;

    @JSONField(name = "src_file_path")
    public String srcFilePath;

    @JSONField(name = "tasks")
    public List<Task> tasks;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/template/bean/BiliVideoTaskInfo$Task.class */
    @Keep
    public static class Task implements Serializable, Parcelable {
        public static final Parcelable.Creator<Task> CREATOR = new Object();

        @JSONField(name = "ai_task_id")
        public String aiTaskId;

        @JSONField(name = "code")
        public int code;

        @JSONField(name = "message")
        public String msg;

        @JSONField(name = ThirdPartyExtraBuilder.KEY_RESULT)
        public boolean result;

        @JSONField(name = "type")
        public int type;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/template/bean/BiliVideoTaskInfo$Task$a.class */
        public final class a implements Parcelable.Creator<Task> {
            @Override // android.os.Parcelable.Creator
            public final Task createFromParcel(Parcel parcel) {
                return new Task(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final Task[] newArray(int i7) {
                return new Task[i7];
            }
        }

        public Task() {
            this.type = 0;
            this.result = false;
            this.code = 0;
            this.msg = "";
            this.aiTaskId = "";
        }

        public Task(Parcel parcel) {
            boolean z6 = false;
            this.type = 0;
            this.result = false;
            this.code = 0;
            this.msg = "";
            this.aiTaskId = "";
            this.type = parcel.readInt();
            this.result = parcel.readInt() == 1 ? true : z6;
            this.code = parcel.readInt();
            this.msg = parcel.readString();
            this.aiTaskId = parcel.readString();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i7) {
            parcel.writeInt(this.type);
            parcel.writeInt(this.result ? 1 : 0);
            parcel.writeInt(this.code);
            parcel.writeString(this.msg);
            parcel.writeString(this.aiTaskId);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/template/bean/BiliVideoTaskInfo$a.class */
    public final class a implements Parcelable.Creator<BiliVideoTaskInfo> {
        @Override // android.os.Parcelable.Creator
        public final BiliVideoTaskInfo createFromParcel(Parcel parcel) {
            return new BiliVideoTaskInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final BiliVideoTaskInfo[] newArray(int i7) {
            return new BiliVideoTaskInfo[i7];
        }
    }

    public BiliVideoTaskInfo() {
        this.srcFilePath = "";
        this.desFilePath = "";
        this.tasks = new ArrayList();
    }

    public BiliVideoTaskInfo(Parcel parcel) {
        this.srcFilePath = "";
        this.desFilePath = "";
        this.tasks = new ArrayList();
        this.srcFilePath = parcel.readString();
        this.desFilePath = parcel.readString();
        parcel.readTypedList(this.tasks, Task.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i7) {
        parcel.writeString(this.srcFilePath);
        parcel.writeString(this.desFilePath);
        parcel.writeTypedList(this.tasks);
    }
}
