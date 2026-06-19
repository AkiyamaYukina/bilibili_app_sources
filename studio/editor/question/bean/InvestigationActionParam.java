package com.bilibili.studio.editor.question.bean;

import Di0.C1600d;
import I.E;
import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONCreator;
import com.alibaba.fastjson.annotation.JSONField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/question/bean/InvestigationActionParam.class */
@Keep
public final class InvestigationActionParam {

    @NotNull
    private final String containerType;

    @Nullable
    private final InvestigationDetail data;

    @NotNull
    private final String handleType;
    private final boolean matched;

    @JSONCreator
    public InvestigationActionParam(@JSONField(name = "matched") boolean z6, @JSONField(name = "container_type") @NotNull String str, @JSONField(name = "handle_type") @NotNull String str2, @JSONField(name = "data") @Nullable InvestigationDetail investigationDetail) {
        this.matched = z6;
        this.containerType = str;
        this.handleType = str2;
        this.data = investigationDetail;
    }

    public static /* synthetic */ InvestigationActionParam copy$default(InvestigationActionParam investigationActionParam, boolean z6, String str, String str2, InvestigationDetail investigationDetail, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z6 = investigationActionParam.matched;
        }
        if ((i7 & 2) != 0) {
            str = investigationActionParam.containerType;
        }
        if ((i7 & 4) != 0) {
            str2 = investigationActionParam.handleType;
        }
        if ((i7 & 8) != 0) {
            investigationDetail = investigationActionParam.data;
        }
        return investigationActionParam.copy(z6, str, str2, investigationDetail);
    }

    public final boolean component1() {
        return this.matched;
    }

    @NotNull
    public final String component2() {
        return this.containerType;
    }

    @NotNull
    public final String component3() {
        return this.handleType;
    }

    @Nullable
    public final InvestigationDetail component4() {
        return this.data;
    }

    @NotNull
    public final InvestigationActionParam copy(@JSONField(name = "matched") boolean z6, @JSONField(name = "container_type") @NotNull String str, @JSONField(name = "handle_type") @NotNull String str2, @JSONField(name = "data") @Nullable InvestigationDetail investigationDetail) {
        return new InvestigationActionParam(z6, str, str2, investigationDetail);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvestigationActionParam)) {
            return false;
        }
        InvestigationActionParam investigationActionParam = (InvestigationActionParam) obj;
        return this.matched == investigationActionParam.matched && Intrinsics.areEqual(this.containerType, investigationActionParam.containerType) && Intrinsics.areEqual(this.handleType, investigationActionParam.handleType) && Intrinsics.areEqual(this.data, investigationActionParam.data);
    }

    @NotNull
    public final String getContainerType() {
        return this.containerType;
    }

    @Nullable
    public final InvestigationDetail getData() {
        return this.data;
    }

    @NotNull
    public final String getHandleType() {
        return this.handleType;
    }

    public final boolean getMatched() {
        return this.matched;
    }

    public int hashCode() {
        int iA = E.a(E.a(Boolean.hashCode(this.matched) * 31, 31, this.containerType), 31, this.handleType);
        InvestigationDetail investigationDetail = this.data;
        return iA + (investigationDetail == null ? 0 : investigationDetail.hashCode());
    }

    @NotNull
    public String toString() {
        boolean z6 = this.matched;
        String str = this.containerType;
        String str2 = this.handleType;
        InvestigationDetail investigationDetail = this.data;
        StringBuilder sbB = C1600d.b("InvestigationActionParam(matched=", ", containerType=", str, ", handleType=", z6);
        sbB.append(str2);
        sbB.append(", data=");
        sbB.append(investigationDetail);
        sbB.append(")");
        return sbB.toString();
    }
}
