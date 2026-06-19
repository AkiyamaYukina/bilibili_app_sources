package com.bilibili.studio.module.tuwen.model;

import G0.b;
import androidx.annotation.Keep;
import androidx.paging.M;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.ad.adview.liveroom.answer.fragment.vm.v;
import com.bilibili.lib.sharewrapper.basic.ThirdPartyExtraBuilder;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import z4.c;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/module/tuwen/model/BCutVideoTaskInfo.class */
@Keep
public final class BCutVideoTaskInfo {

    @JSONField(name = "src_file_path")
    @NotNull
    private String srcFilePath = "";

    @JSONField(name = "des_file_path")
    @NotNull
    private String desFilePath = "";

    @JSONField(name = "tasks")
    @NotNull
    private final ArrayList<Task> tasks = new ArrayList<>();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/module/tuwen/model/BCutVideoTaskInfo$Task.class */
    @Keep
    public static final class Task {

        @NotNull
        public static final a Companion = new Object();
        public static final int TYPE_DETECT_LOCAL = 4;
        public static final int TYPE_DETECT_REMOTE = 3;
        public static final int TYPE_PLAY_STYLE_3D = 2;
        public static final int TYPE_PLAY_STYLE_AI = 1;
        public static final int TYPE_REVERSE = 5;
        public static final int TYPE_UNDEFINE = 0;

        @JSONField(name = "code")
        private int code;

        @JSONField(name = "cost_time")
        private long costTime;

        @JSONField(name = ThirdPartyExtraBuilder.KEY_RESULT)
        private boolean result;

        @JSONField(name = "type")
        private int type;

        @JSONField(name = "message")
        @NotNull
        private String msg = "";

        @JSONField(name = "ai_task_id")
        @NotNull
        private String aiTaskId = "";

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/module/tuwen/model/BCutVideoTaskInfo$Task$a.class */
        public static final class a {
        }

        @NotNull
        public final String getAiTaskId() {
            return this.aiTaskId;
        }

        public final int getCode() {
            return this.code;
        }

        public final long getCostTime() {
            return this.costTime;
        }

        @NotNull
        public final String getMsg() {
            return this.msg;
        }

        public final boolean getResult() {
            return this.result;
        }

        public final int getType() {
            return this.type;
        }

        public final void setAiTaskId(@NotNull String str) {
            this.aiTaskId = str;
        }

        public final void setCode(int i7) {
            this.code = i7;
        }

        public final void setCostTime(long j7) {
            this.costTime = j7;
        }

        public final void setMsg(@NotNull String str) {
            this.msg = str;
        }

        public final void setResult(boolean z6) {
            this.result = z6;
        }

        public final void setType(int i7) {
            this.type = i7;
        }

        @NotNull
        public String toString() {
            int i7 = this.type;
            boolean z6 = this.result;
            int i8 = this.code;
            String str = this.msg;
            String str2 = this.aiTaskId;
            long j7 = this.costTime;
            StringBuilder sbA = c.a(i7, "Task(type=", ", result=", ", code=", z6);
            M.a(i8, ", msg='", str, "', aiTaskId='", sbA);
            v.a(j7, str2, "', costTime=", sbA);
            sbA.append("毫秒')");
            return sbA.toString();
        }
    }

    @NotNull
    public final String getDesFilePath() {
        return this.desFilePath;
    }

    @NotNull
    public final String getSrcFilePath() {
        return this.srcFilePath;
    }

    @NotNull
    public final ArrayList<Task> getTasks() {
        return this.tasks;
    }

    public final void setDesFilePath(@NotNull String str) {
        this.desFilePath = str;
    }

    public final void setSrcFilePath(@NotNull String str) {
        this.srcFilePath = str;
    }

    @NotNull
    public String toString() {
        String str = this.srcFilePath;
        String str2 = this.desFilePath;
        ArrayList<Task> arrayList = this.tasks;
        StringBuilder sbA = b.a("TaskInfo(srcFilePath='", str, "', desFilePath='", str2, "', tasks=");
        sbA.append(arrayList);
        sbA.append(")");
        return sbA.toString();
    }
}
