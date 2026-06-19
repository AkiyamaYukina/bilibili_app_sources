package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/CloudGameInfo.class */
@Keep
public class CloudGameInfo implements Serializable {
    public static final String FROM_UI_DETAIL = "gameDetail";
    public static final int ORIENTATION_LANDSCAPE = 2;
    public static final int ORIENTATION_PORTRAIT = 1;
    public static final String PROVIDER_HAIMA = "HAIMA";
    public static final String PROVIDER_WEIER = "WEIER";
    public static final int SHOW_ALL = 2;
    public static final int SHOW_UNDOWNLOAD = 1;
    public static final int STATUS_CROWDED = 3;
    public static final int STATUS_IDLE = 1;
    public static final int STATUS_NORMAL = 2;

    @JSONField(name = "channel_name")
    public String channelName;
    public String description;

    @JSONField(name = "foreign_game_id")
    public String foreignGameId;
    public String fromUI;

    @JSONField(name = "game_base_id")
    public int gameBaseId;

    @JSONField(name = "game_name")
    public String gameName;

    @JSONField(name = "game_provider_type")
    public String gameProviderType;

    @JSONField(name = "load_status")
    public int loadStatus;

    @JSONField(name = "load_status_text")
    public String loadStatusText;
    public boolean maintaining;

    @JSONField(name = "recommend_channel")
    public Boolean recommendChannel;
    public String scene;

    @JSONField(name = "show_download")
    public Boolean showDownload;

    @JSONField(name = "support_micro_client")
    public boolean supportMicroClient;
    public String uuid;

    @JSONField(name = "priority")
    public int priority = -1;

    @JSONField(name = "vip_channel")
    public boolean vipChannel = false;

    @JSONField(name = "queue_size")
    public int queueSize = -1;

    @JSONField(name = "screen_type")
    public int orientation = 2;

    @JSONField(name = "show_entrance_type")
    public int showEntrance = 1;

    @JSONField(name = "cooperation_mode")
    public int cooperationMode = -1;
    public int localPriority = -1;

    public boolean isFromDetail() {
        return FROM_UI_DETAIL.equals(this.fromUI);
    }

    public boolean isSameService(CloudGameInfo cloudGameInfo) {
        if (cloudGameInfo == null) {
            return false;
        }
        boolean z6 = false;
        if (cloudGameInfo.gameProviderType.equals(this.gameProviderType)) {
            z6 = false;
            if (cloudGameInfo.priority == this.priority) {
                z6 = true;
            }
        }
        return z6;
    }
}
