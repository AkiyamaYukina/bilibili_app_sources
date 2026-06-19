package com.bilibili.biligame.api.cloudgame.bean;

import android.text.TextUtils;
import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/cloudgame/bean/MicroGameInfo.class */
@Keep
public class MicroGameInfo implements Serializable {

    @JSONField(name = "cooperation_mode")
    public int cooperationMode;

    @JSONField(name = "description")
    public String description;

    @JSONField(name = "foreign_game_id")
    public String foreignGameId;

    @JSONField(name = "game_base_id")
    public int gameBaseId;

    @JSONField(name = "game_provider_type")
    public String gameProviderType;

    @JSONField(name = "last_update_owner")
    public String lastUpdateOwner;

    @JSONField(name = "micro_client_detail")
    public MicroGameDetail microClientDetail;

    @JSONField(name = "screen_type")
    public int screenType;

    @JSONField(name = "sdk_type")
    public int sdkType;

    @JSONField(name = "show_download")
    public boolean showDownload;

    @JSONField(name = "show_entrance_type")
    public int showEntranceType;

    @JSONField(name = "support_micro_client")
    public boolean supportMicroClient;

    private boolean objEquals(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public boolean equals(Object obj) {
        boolean z6 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MicroGameInfo microGameInfo = (MicroGameInfo) obj;
        if (this.gameBaseId != microGameInfo.gameBaseId || this.cooperationMode != microGameInfo.cooperationMode || this.supportMicroClient != microGameInfo.supportMicroClient || !TextUtils.equals(this.gameProviderType, microGameInfo.gameProviderType) || !objEquals(this.microClientDetail, microGameInfo.microClientDetail)) {
            z6 = false;
        }
        return z6;
    }
}
