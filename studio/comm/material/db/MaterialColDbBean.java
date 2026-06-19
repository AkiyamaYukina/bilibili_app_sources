package com.bilibili.studio.comm.material.db;

import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.JSON;
import com.bilibili.adcommon.utils.a;
import com.bilibili.studio.comm.material.bean.MaterialCollectBean;
import com.bilibili.studio.comm.material.bean.MaterialUploadBean;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/comm/material/db/MaterialColDbBean.class */
@Keep
public class MaterialColDbBean {
    public long mid = 0;
    public String aid = "";
    public long createTime = 0;
    public long updateTime = 0;
    public String mainData = "";
    public String uploadData = "";

    @Nullable
    public static MaterialColDbBean convertToDbBean(MaterialCollectBean materialCollectBean, MaterialUploadBean materialUploadBean) {
        MaterialCollectBean.ArchiveData archiveData = materialCollectBean.archiveInfo;
        if (archiveData == null || TextUtils.isEmpty(archiveData.aid)) {
            return null;
        }
        MaterialColDbBean materialColDbBean = new MaterialColDbBean();
        materialColDbBean.aid = materialCollectBean.archiveInfo.aid;
        materialColDbBean.mid = a.a();
        materialColDbBean.createTime = System.currentTimeMillis();
        materialColDbBean.updateTime = System.currentTimeMillis();
        materialColDbBean.mainData = JSON.toJSONString(materialCollectBean);
        materialColDbBean.uploadData = JSON.toJSONString(materialUploadBean);
        return materialColDbBean;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("MaterialColDbBean{mid=");
        sb.append(this.mid);
        sb.append(", aid='");
        sb.append(this.aid);
        sb.append("', createTime=");
        sb.append(this.createTime);
        sb.append(", updateTime=");
        sb.append(this.updateTime);
        sb.append(", mainData='");
        sb.append(this.mainData);
        sb.append("', uploadData='");
        return C8770a.a(sb, this.uploadData, "'}");
    }
}
