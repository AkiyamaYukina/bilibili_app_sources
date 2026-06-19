package com.bilibili.studio.editor.moudle.aistory.bean;

import X1.C3081k;
import androidx.annotation.Keep;
import androidx.compose.animation.z;
import c6.N;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/aistory/bean/AiFrameResultBean.class */
@Keep
public final class AiFrameResultBean {

    @Nullable
    private String filePath;
    private boolean isDefaultTagEnable;

    @NotNull
    private AiFrameTagStatus resultStatus;

    @Nullable
    private List<String> tagList;

    @Nullable
    private String uploadUrl;

    public AiFrameResultBean() {
        this(null, false, null, null, null, 31, null);
    }

    public AiFrameResultBean(@Nullable String str, boolean z6, @NotNull AiFrameTagStatus aiFrameTagStatus, @Nullable String str2, @Nullable List<String> list) {
        this.filePath = str;
        this.isDefaultTagEnable = z6;
        this.resultStatus = aiFrameTagStatus;
        this.uploadUrl = str2;
        this.tagList = list;
    }

    public /* synthetic */ AiFrameResultBean(String str, boolean z6, AiFrameTagStatus aiFrameTagStatus, String str2, List list, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? true : z6, (i7 & 4) != 0 ? AiFrameTagStatus.DEFAULT : aiFrameTagStatus, (i7 & 8) != 0 ? null : str2, (i7 & 16) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AiFrameResultBean copy$default(AiFrameResultBean aiFrameResultBean, String str, boolean z6, AiFrameTagStatus aiFrameTagStatus, String str2, List list, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = aiFrameResultBean.filePath;
        }
        if ((i7 & 2) != 0) {
            z6 = aiFrameResultBean.isDefaultTagEnable;
        }
        if ((i7 & 4) != 0) {
            aiFrameTagStatus = aiFrameResultBean.resultStatus;
        }
        if ((i7 & 8) != 0) {
            str2 = aiFrameResultBean.uploadUrl;
        }
        if ((i7 & 16) != 0) {
            list = aiFrameResultBean.tagList;
        }
        return aiFrameResultBean.copy(str, z6, aiFrameTagStatus, str2, list);
    }

    @Nullable
    public final String component1() {
        return this.filePath;
    }

    public final boolean component2() {
        return this.isDefaultTagEnable;
    }

    @NotNull
    public final AiFrameTagStatus component3() {
        return this.resultStatus;
    }

    @Nullable
    public final String component4() {
        return this.uploadUrl;
    }

    @Nullable
    public final List<String> component5() {
        return this.tagList;
    }

    @NotNull
    public final AiFrameResultBean copy(@Nullable String str, boolean z6, @NotNull AiFrameTagStatus aiFrameTagStatus, @Nullable String str2, @Nullable List<String> list) {
        return new AiFrameResultBean(str, z6, aiFrameTagStatus, str2, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AiFrameResultBean)) {
            return false;
        }
        AiFrameResultBean aiFrameResultBean = (AiFrameResultBean) obj;
        return Intrinsics.areEqual(this.filePath, aiFrameResultBean.filePath) && this.isDefaultTagEnable == aiFrameResultBean.isDefaultTagEnable && this.resultStatus == aiFrameResultBean.resultStatus && Intrinsics.areEqual(this.uploadUrl, aiFrameResultBean.uploadUrl) && Intrinsics.areEqual(this.tagList, aiFrameResultBean.tagList);
    }

    @Nullable
    public final String getFilePath() {
        return this.filePath;
    }

    @NotNull
    public final AiFrameTagStatus getResultStatus() {
        return this.resultStatus;
    }

    @Nullable
    public final List<String> getTagList() {
        return this.tagList;
    }

    @Nullable
    public final String getUploadUrl() {
        return this.uploadUrl;
    }

    public int hashCode() {
        String str = this.filePath;
        int iHashCode = 0;
        int iA = z.a((str == null ? 0 : str.hashCode()) * 31, 31, this.isDefaultTagEnable);
        int iHashCode2 = this.resultStatus.hashCode();
        String str2 = this.uploadUrl;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        List<String> list = this.tagList;
        if (list != null) {
            iHashCode = list.hashCode();
        }
        return ((((iHashCode2 + iA) * 31) + iHashCode3) * 31) + iHashCode;
    }

    public final boolean isDefaultTagEnable() {
        return this.isDefaultTagEnable;
    }

    public final void setDefaultTagEnable(boolean z6) {
        this.isDefaultTagEnable = z6;
    }

    public final void setFilePath(@Nullable String str) {
        this.filePath = str;
    }

    public final void setResultStatus(@NotNull AiFrameTagStatus aiFrameTagStatus) {
        this.resultStatus = aiFrameTagStatus;
    }

    public final void setTagList(@Nullable List<String> list) {
        this.tagList = list;
    }

    public final void setUploadUrl(@Nullable String str) {
        this.uploadUrl = str;
    }

    @NotNull
    public String toString() {
        String str = this.filePath;
        boolean z6 = this.isDefaultTagEnable;
        AiFrameTagStatus aiFrameTagStatus = this.resultStatus;
        String str2 = this.uploadUrl;
        List<String> list = this.tagList;
        StringBuilder sbB = C3081k.b("AiFrameResultBean(filePath=", str, ", isDefaultTagEnable=", ", resultStatus=", z6);
        sbB.append(aiFrameTagStatus);
        sbB.append(", uploadUrl=");
        sbB.append(str2);
        sbB.append(", tagList=");
        return N.a(sbB, ")", list);
    }
}
