package com.bilibili.studio.videoeditor.capturev3.services;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.lib.sharewrapper.basic.ThirdPartyExtraBuilder;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/services/FtVideoUrlInfoBean.class */
@Keep
public class FtVideoUrlInfoBean {

    @JSONField(name = "abtid")
    public long abtid;

    @JSONField(name = "accept_description")
    public List<String> acceptDescription;

    @JSONField(name = "accept_format")
    public String acceptFormat;

    @JSONField(name = "accept_quality")
    public List<Integer> acceptQuality;

    @JSONField(name = "durl")
    public List<HashMap> dUrl;

    @JSONField(name = "fnval")
    public long fnval;

    @JSONField(name = "fnver")
    public long fnver;

    @JSONField(name = "format")
    public String format;

    @JSONField(name = "from")
    public String from;

    @JSONField(name = "quality")
    public String quality;

    @JSONField(name = ThirdPartyExtraBuilder.KEY_RESULT)
    public String result;

    @JSONField(name = "seek_param")
    public String seekParam;

    @JSONField(name = "seek_type")
    public String seekType;

    @JSONField(name = "timelength")
    public String timeLength;

    @JSONField(name = "video_codecid")
    public long videoCodecid;

    @JSONField(name = "video_project")
    public boolean videoProject;
}
