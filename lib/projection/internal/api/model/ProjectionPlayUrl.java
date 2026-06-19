package com.bilibili.lib.projection.internal.api.model;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.lib.sharewrapper.basic.ThirdPartyExtraBuilder;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/api/model/ProjectionPlayUrl.class */
@Keep
public class ProjectionPlayUrl {

    @JSONField(name = "abtid")
    public int abtid;

    @JSONField(name = "accept_description")
    public List<String> acceptDescription;

    @JSONField(name = "accept_format")
    public String acceptFormat;

    @JSONField(name = "accept_quality")
    public List<Integer> acceptQuality;

    @JSONField(name = "durl")
    public List<DUrl> dUrl;

    @JSONField(name = "fnval")
    public int fnval;

    @JSONField(name = "fnver")
    public int fnver;

    @JSONField(name = "format")
    public String format;

    @JSONField(name = "from")
    public String from;

    @JSONField(name = "live_stream")
    public LiveData liveData;

    @JSONField(name = "live_mobile")
    public LiveMobileInfo liveMobile;

    @JSONField(name = "qn_extras")
    public List<QnExtras> qnExtras;

    @JSONField(name = "quality")
    public int quality;

    @JSONField(name = ThirdPartyExtraBuilder.KEY_RESULT)
    public String result;

    @JSONField(name = "seek_param")
    public String seekParam;

    @JSONField(name = "seek_type")
    public String seekType;

    @JSONField(name = "support_formats")
    public List<Quality> supportQualities;

    @JSONField(name = "timelength")
    public long timeLength;

    @JSONField(name = "video_codecid")
    public int videoCodecid;

    @JSONField(name = "video_project")
    public boolean videoProject;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/api/model/ProjectionPlayUrl$DUrl.class */
    @Keep
    public static class DUrl {
        public long length;
        public int order;
        public long size;
        public String url;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/api/model/ProjectionPlayUrl$LiveData.class */
    @Keep
    public static class LiveData {

        @JSONField(name = "flv")
        public List<String> flv;

        @JSONField(name = "fmp4")
        public List<String> fmp4;

        @JSONField(name = "ts")
        public List<String> ts;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/api/model/ProjectionPlayUrl$LiveMobileInfo.class */
    @Keep
    public static class LiveMobileInfo {

        @JSONField(name = "format")
        public String format;

        @JSONField(name = "stream")
        public String stream;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/api/model/ProjectionPlayUrl$QnExtras.class */
    @Keep
    public static class QnExtras {

        @JSONField(name = "need_login")
        public boolean needLogin;

        @JSONField(name = "need_vip")
        public boolean needVip;
        public int qn;

        @JSONField(name = "yst_only")
        public boolean ystOnly;

        @JSONField(name = "yst_only_text")
        public String ystOnlyText;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/api/model/ProjectionPlayUrl$Quality.class */
    @Keep
    public static class Quality {
        public String description;

        @JSONField(name = "display_desc")
        public String displayDesc;
        public String format;

        @JSONField(name = "new_description")
        public String newDescription;
        public int quality;
        public String superscript;
    }
}
