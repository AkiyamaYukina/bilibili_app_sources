package com.bilibili.studio.videoeditor.media.performance;

import androidx.annotation.Keep;
import com.bilibili.studio.videoeditor.media.performance.BeautifyConfigV1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/media/performance/BeautifyTemplate.class */
@Keep
public class BeautifyTemplate {
    public int backCameraTemplateId;
    public int frontCameraTemplateId;
    public int grade;
    public boolean isConfigured;
    public List<TemplateParams> templateParamsList = new ArrayList();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/media/performance/BeautifyTemplate$TemplateParams.class */
    @Keep
    public static class TemplateParams {
        public BeautifyConfigV1.BeautifyParams beautifyParams;
        public int id;
        public String name;
    }
}
