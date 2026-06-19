package com.bilibili.biligame.api.cloudgame.bean;

import android.text.TextUtils;
import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/cloudgame/bean/MicroGameDetail.class */
@Keep
public class MicroGameDetail implements Serializable {

    @JSONField(name = "client_backup_url")
    public String clientBackupUrl;

    @JSONField(name = "client_build")
    public int clientBuild;

    @JSONField(name = "client_md5")
    public String clientMD5;

    @JSONField(name = "client_size")
    public long clientSize;

    @JSONField(name = "client_url")
    public String clientUrl;

    @JSONField(name = "client_version")
    public String clientVersion;

    @JSONField(name = "game_base_id")
    public int gameBaseId;

    @JSONField(name = "game_profile_id")
    public int gameProfileId;

    @JSONField(name = "id")
    public int id;

    @JSONField(name = "package_name")
    public String packageName = "";

    public boolean equals(Object obj) {
        boolean z6 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MicroGameDetail microGameDetail = (MicroGameDetail) obj;
        if (this.gameBaseId != microGameDetail.gameBaseId || this.clientBuild != microGameDetail.clientBuild || !TextUtils.equals(this.clientVersion, microGameDetail.clientVersion) || !TextUtils.equals(this.clientUrl, microGameDetail.clientUrl) || !TextUtils.equals(this.clientBackupUrl, microGameDetail.clientBackupUrl) || !TextUtils.equals(this.clientMD5, microGameDetail.clientMD5) || this.clientSize != microGameDetail.clientSize || !TextUtils.equals(this.packageName, microGameDetail.packageName)) {
            z6 = false;
        }
        return z6;
    }
}
