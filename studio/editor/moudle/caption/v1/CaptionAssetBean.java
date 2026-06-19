package com.bilibili.studio.editor.moudle.caption.v1;

import androidx.annotation.Keep;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/caption/v1/CaptionAssetBean.class */
@Keep
public class CaptionAssetBean implements Cloneable, Serializable {
    public String assetLic;
    public String captionAnimationPackageId;
    public String captionAnimationPackagePath;
    public String captionContextPackageId;
    public String captionContextPackagePath;
    public String captionInAnimationPackageId;
    public String captionInAnimationPackagePath;
    public String captionOutAnimationPackageId;
    public String captionOutAnimationPackagePath;
    public String captionRendererPackageId;
    public String captionRendererPackagePath;
    public String captionStylePackageId;
    public String captionStylePackagePath;
    public String captionTemplateStylePath;

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public CaptionAssetBean m9883clone() {
        try {
            return (CaptionAssetBean) super.clone();
        } catch (CloneNotSupportedException e7) {
            e7.printStackTrace();
            return new CaptionAssetBean();
        }
    }

    public boolean equals(Object obj) {
        boolean z6 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CaptionAssetBean)) {
            return false;
        }
        CaptionAssetBean captionAssetBean = (CaptionAssetBean) obj;
        if (!Objects.equals(this.captionStylePackageId, captionAssetBean.captionStylePackageId) || !Objects.equals(this.captionContextPackageId, captionAssetBean.captionContextPackageId) || !Objects.equals(this.captionAnimationPackageId, captionAssetBean.captionAnimationPackageId) || !Objects.equals(this.captionOutAnimationPackageId, captionAssetBean.captionOutAnimationPackageId) || !Objects.equals(this.captionInAnimationPackageId, captionAssetBean.captionInAnimationPackageId) || !Objects.equals(this.captionRendererPackageId, captionAssetBean.captionRendererPackageId) || !Objects.equals(this.assetLic, captionAssetBean.assetLic) || !Objects.equals(this.captionStylePackagePath, captionAssetBean.captionStylePackagePath) || !Objects.equals(this.captionContextPackagePath, captionAssetBean.captionContextPackagePath) || !Objects.equals(this.captionAnimationPackagePath, captionAssetBean.captionAnimationPackagePath) || !Objects.equals(this.captionOutAnimationPackagePath, captionAssetBean.captionOutAnimationPackagePath) || !Objects.equals(this.captionInAnimationPackagePath, captionAssetBean.captionInAnimationPackagePath) || !Objects.equals(this.captionRendererPackagePath, captionAssetBean.captionRendererPackagePath) || !Objects.equals(this.captionTemplateStylePath, captionAssetBean.captionTemplateStylePath)) {
            z6 = false;
        }
        return z6;
    }

    public int hashCode() {
        return Objects.hash(this.captionStylePackageId, this.captionContextPackageId, this.captionAnimationPackageId, this.captionOutAnimationPackageId, this.captionInAnimationPackageId, this.captionRendererPackageId, this.assetLic, this.captionStylePackagePath, this.captionContextPackagePath, this.captionAnimationPackagePath, this.captionOutAnimationPackagePath, this.captionInAnimationPackagePath, this.captionRendererPackagePath, this.captionTemplateStylePath);
    }
}
