package com.bilibili.studio.module.tuwen.model;

import G0.b;
import ID.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/module/tuwen/model/PbTemplateResult.class */
public final class PbTemplateResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f108630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public List<PbMaterialError> f108631b;

    public PbTemplateResult() {
        this(false, 1, null);
    }

    public PbTemplateResult(boolean z6) {
        this.f108630a = z6;
        this.f108631b = new ArrayList();
    }

    public /* synthetic */ PbTemplateResult(boolean z6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? true : z6);
    }

    public final void addMaterialError(@NotNull PbMaterialError pbMaterialError) {
        List<PbMaterialError> list = this.f108631b;
        if (list != null) {
            list.add(pbMaterialError);
        }
    }

    public final boolean getPbCompleteSuccess() {
        return this.f108630a;
    }

    @NotNull
    public final List<PbMaterialError> getPbMaterialErrorList() {
        return this.f108631b;
    }

    public final void setPbCompleteSuccess(boolean z6) {
        this.f108630a = z6;
    }

    public final void setPbMaterialErrorList(@NotNull List<PbMaterialError> list) {
        this.f108631b = list;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i7 = 0;
        for (Object obj : this.f108631b) {
            if (i7 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            PbMaterialError pbMaterialError = (PbMaterialError) obj;
            if (i7 == 0) {
                a.b(this.f108631b.size(), "错误数: ", ", ", sb);
            }
            String materialId = pbMaterialError.getMaterialId();
            String materialType = pbMaterialError.getMaterialType();
            String errorMsg = pbMaterialError.getErrorMsg();
            StringBuilder sbA = b.a(" - 素材ID:", materialId, ", 素材类型: ", materialType, ", 错误信息: ");
            sbA.append(errorMsg);
            sb.append(sbA.toString());
            i7++;
        }
        return sb.toString();
    }
}
