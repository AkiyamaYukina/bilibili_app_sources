package com.bilibili.upper.module.honour.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/honour/bean/KingHonourAccountBean.class */
@Keep
public class KingHonourAccountBean {

    @JSONField(name = "is_bind")
    public boolean isBind;

    @JSONField(name = "is_scence_grant")
    public boolean isScenceGrant;

    @JSONField(name = "bind_info")
    public MinProgramBean programBean;

    @JSONField(name = "video_url")
    public String videoUrl;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/honour/bean/KingHonourAccountBean$MinProgramBean.class */
    @Keep
    public static class MinProgramBean implements Serializable {

        @JSONField(name = "base_path")
        public String basePath;
        public String code;
        public String face;

        @JSONField(name = "game_auth_scene")
        public String gameAuthScene;

        @JSONField(name = "game_id_list")
        public String gameIdList;

        @JSONField(name = "live_plat_id")
        public String livePlatId;

        @JSONField(name = "name")
        public String nickName;

        @JSONField(name = "origin_id")
        public String originId;
        public String sign;
        public String timestamp;
    }
}
