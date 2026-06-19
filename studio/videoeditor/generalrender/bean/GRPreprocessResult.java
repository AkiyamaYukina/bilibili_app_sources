package com.bilibili.studio.videoeditor.generalrender.bean;

import androidx.annotation.Keep;
import b6.c;
import com.alibaba.fastjson.annotation.JSONCreator;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.lib.sharewrapper.basic.ThirdPartyExtraBuilder;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/generalrender/bean/GRPreprocessResult.class */
@Keep
public final class GRPreprocessResult {

    @Nullable
    private final List<Clip> clips;

    @Nullable
    private final List<String> pathList;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/generalrender/bean/GRPreprocessResult$Clip.class */
    @Keep
    public static final class Clip {

        @JSONField(name = "src_file_path")
        @NotNull
        private String srcFilePath = "";

        @JSONField(name = "des_file_path")
        @NotNull
        private String desFilePath = "";

        @JSONField(name = "tasks")
        @NotNull
        private final ArrayList<Task> tasks = new ArrayList<>();

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
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/generalrender/bean/GRPreprocessResult$Task.class */
    @Keep
    public static final class Task {

        @JSONField(name = "code")
        private int code;

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

        @NotNull
        public final String getAiTaskId() {
            return this.aiTaskId;
        }

        public final int getCode() {
            return this.code;
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

        public final void setMsg(@NotNull String str) {
            this.msg = str;
        }

        public final void setResult(boolean z6) {
            this.result = z6;
        }

        public final void setType(int i7) {
            this.type = i7;
        }
    }

    @JSONCreator
    public GRPreprocessResult(@JSONField(name = "paths") @Nullable List<String> list, @JSONField(name = "clips") @Nullable List<Clip> list2) {
        this.pathList = list;
        this.clips = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GRPreprocessResult copy$default(GRPreprocessResult gRPreprocessResult, List list, List list2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            list = gRPreprocessResult.pathList;
        }
        if ((i7 & 2) != 0) {
            list2 = gRPreprocessResult.clips;
        }
        return gRPreprocessResult.copy(list, list2);
    }

    @Nullable
    public final List<String> component1() {
        return this.pathList;
    }

    @Nullable
    public final List<Clip> component2() {
        return this.clips;
    }

    @NotNull
    public final GRPreprocessResult copy(@JSONField(name = "paths") @Nullable List<String> list, @JSONField(name = "clips") @Nullable List<Clip> list2) {
        return new GRPreprocessResult(list, list2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GRPreprocessResult)) {
            return false;
        }
        GRPreprocessResult gRPreprocessResult = (GRPreprocessResult) obj;
        return Intrinsics.areEqual(this.pathList, gRPreprocessResult.pathList) && Intrinsics.areEqual(this.clips, gRPreprocessResult.clips);
    }

    @Nullable
    public final List<Clip> getClips() {
        return this.clips;
    }

    @Nullable
    public final List<String> getPathList() {
        return this.pathList;
    }

    public int hashCode() {
        List<String> list = this.pathList;
        int iHashCode = 0;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        List<Clip> list2 = this.clips;
        if (list2 != null) {
            iHashCode = list2.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    @NotNull
    public String toString() {
        return c.a("GRPreprocessResult(pathList=", ", clips=", ")", this.pathList, this.clips);
    }
}
