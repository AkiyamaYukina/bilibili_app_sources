package com.bilibili.studio.comm.material.bean;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.C3269h;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import g.C7207a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/comm/material/bean/MaterialCollectBean.class */
@Keep
public class MaterialCollectBean implements Serializable {
    public static int DRAFT_JSON = 2;
    public static int FASTVIDEO = 1;
    public static int INTELLIGENCE = 1;
    public static int MATERIAL_ADD = 0;
    public static int MATERIAL_DELETE = 1;
    public static int NORMAL = 0;
    public static int NO_LIMITED = 2;
    public static int PICTURE = 0;
    public static int VIDEO = 1;

    @JSONField(name = "archive_type")
    public int archiveType;

    @JSONField(name = "common_param")
    public CommonParam commonParam;

    @JSONField(name = "fast_video")
    public int fastVideo;

    @Nullable
    @JSONField(name = "first_entrance")
    public String firstEntrance;

    @JSONField(name = "material_list")
    public List<MaterialInfo> materialList = new ArrayList();

    @JSONField(name = "material_used")
    public List<MaterialUsed> materialUsed = new ArrayList();

    @Nullable
    @JSONField(name = "project_info")
    public ProjectInfo projectInfo = new ProjectInfo();

    @Nullable
    @JSONField(name = "archive_info")
    public ArchiveData archiveInfo = new ArchiveData();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/comm/material/bean/MaterialCollectBean$ArchiveData.class */
    @Keep
    public static class ArchiveData implements Serializable {
        public String aid;

        @JSONField(name = "archive_title")
        public String archiveTitle;

        @NonNull
        public String toString() {
            StringBuilder sb = new StringBuilder("ArchiveData{aid='");
            sb.append(this.aid);
            sb.append("', archiveTitle='");
            return C8770a.a(sb, this.archiveTitle, "'}");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/comm/material/bean/MaterialCollectBean$CommonParam.class */
    @Keep
    public static class CommonParam implements Serializable {

        @JSONField(name = "first_entrance")
        public String firstEntrance;
        public String platform;

        @JSONField(name = "product_name")
        public String productName;

        @JSONField(name = "send_channel")
        public String sendChannel;

        @JSONField(name = "send_type")
        public String sendType;

        @JSONField(name = "track_id")
        public String trackId;

        @NonNull
        public String toString() {
            StringBuilder sb = new StringBuilder("CommonParam{platform='");
            sb.append(this.platform);
            sb.append("', productName='");
            sb.append(this.productName);
            sb.append("', firstEntrance='");
            sb.append(this.firstEntrance);
            sb.append("', sendChannel='");
            sb.append(this.sendChannel);
            sb.append("', sendType='");
            sb.append(this.sendType);
            sb.append("', trackId='");
            return C8770a.a(sb, this.trackId, "'}");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/comm/material/bean/MaterialCollectBean$MaterialInfo.class */
    @Keep
    public static class MaterialInfo implements Serializable {
        public long duration;

        @JSONField(name = EditCustomizeSticker.TAG_PATH)
        public String filePath;
        public int height;

        @JSONField(name = "material_id")
        public String materialId;

        @JSONField(name = "material_label")
        public String materialLabel;

        @JSONField(name = "material_type")
        public int materialType;

        @JSONField(name = "upos_uri")
        public String uposUri;
        public int width;

        public boolean isVideo() {
            boolean z6 = true;
            if (this.materialType != 1) {
                z6 = false;
            }
            return z6;
        }

        @NonNull
        public String toString() {
            StringBuilder sb = new StringBuilder("MaterialInfo{materialId='");
            sb.append(this.materialId);
            sb.append("', materialType=");
            sb.append(this.materialType);
            sb.append(", filePath='");
            sb.append(this.filePath);
            sb.append("', duration=");
            sb.append(this.duration);
            sb.append(", width=");
            sb.append(this.width);
            sb.append(", height=");
            sb.append(this.height);
            sb.append(", materialLabel='");
            sb.append(this.materialLabel);
            sb.append("', uposUri='");
            return C8770a.a(sb, this.uposUri, "'}");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/comm/material/bean/MaterialCollectBean$MaterialUsed.class */
    @Keep
    public static class MaterialUsed implements Serializable {

        @JSONField(name = "material_id")
        public String materialId;

        @JSONField(name = "used_type")
        public int usedType;

        public MaterialUsed() {
        }

        public MaterialUsed(String str) {
            this.materialId = str;
            this.usedType = MaterialCollectBean.MATERIAL_ADD;
        }

        public MaterialUsed(String str, int i7) {
            this.materialId = str;
            this.usedType = i7;
        }

        @NonNull
        public String toString() {
            StringBuilder sb = new StringBuilder("MaterialUsed{materialId='");
            sb.append(this.materialId);
            sb.append("', usedType=");
            return C3269h.a(sb, this.usedType, '}');
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/comm/material/bean/MaterialCollectBean$MediaClip.class */
    @Keep
    public static class MediaClip implements Serializable {

        @JSONField(name = "in_point")
        public long inPoint;

        @JSONField(name = "material_id")
        public String materialId;

        @JSONField(name = "out_point")
        public long outPoint;

        @JSONField(name = "trim_in")
        public long trimIn;

        @JSONField(name = "trim_out")
        public long trimOut;

        public MediaClip() {
        }

        public MediaClip(String str, long j7, long j8, long j9, long j10) {
            this.materialId = str;
            this.inPoint = j7;
            this.outPoint = j8;
            this.trimIn = j9;
            this.trimOut = j10;
        }

        @NonNull
        public String toString() {
            StringBuilder sb = new StringBuilder("MediaClip{materialId='");
            sb.append(this.materialId);
            sb.append("', inPoint=");
            sb.append(this.inPoint);
            sb.append(", outPoint=");
            sb.append(this.outPoint);
            sb.append(", trimIn=");
            sb.append(this.trimIn);
            sb.append(", trimOut=");
            return C7207a.a(sb, this.trimOut, '}');
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/comm/material/bean/MaterialCollectBean$ProjectInfo.class */
    @Keep
    public static class ProjectInfo implements Serializable {
        public long duration;

        @JSONField(name = "resolution_type")
        public String resolutionType;

        @JSONField(name = "size_height")
        public int sizeHeight;

        @JSONField(name = "size_width")
        public int sizeWidth;

        @JSONField(name = "video_num")
        public long videoNum = 0;

        @JSONField(name = "image_num")
        public long imageNum = 0;

        @JSONField(name = "main_track")
        public List<MediaClip> mainTrack = new ArrayList();

        @NonNull
        public String toString() {
            StringBuilder sb = new StringBuilder("ProjectInfo{mainTrack=");
            sb.append(this.mainTrack);
            sb.append(", resolutionType='");
            sb.append(this.resolutionType);
            sb.append("', sizeWidth=");
            sb.append(this.sizeWidth);
            sb.append(", sizeHeight=");
            sb.append(this.sizeHeight);
            sb.append(", duration=");
            return C7207a.a(sb, this.duration, '}');
        }
    }

    public Map<Integer, List<MaterialInfo>> splitMaterialList() {
        if (this.materialList == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (MaterialInfo materialInfo : this.materialList) {
            int i7 = materialInfo.materialType;
            if (i7 == PICTURE || i7 == VIDEO) {
                List list = (List) map.get(Integer.valueOf(i7));
                List arrayList = list;
                if (list == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(materialInfo);
                map.put(Integer.valueOf(i7), arrayList);
            }
        }
        return map;
    }

    @NonNull
    public String toString() {
        return "MaterialCollectBean{materialList=" + this.materialList + ", materialUsed=" + this.materialUsed + ", projectInfo=" + this.projectInfo + ", archiveInfo=" + this.archiveInfo + ", firstEntrance='" + this.firstEntrance + ", fastVideo=" + this.fastVideo + ", archiveType=" + this.archiveType + ", commonParam=" + this.commonParam + '}';
    }
}
