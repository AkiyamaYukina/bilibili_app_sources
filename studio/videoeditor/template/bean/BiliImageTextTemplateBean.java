package com.bilibili.studio.videoeditor.template.bean;

import androidx.annotation.Keep;
import com.bilibili.adcommon.utils.c;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/template/bean/BiliImageTextTemplateBean.class */
@Keep
public class BiliImageTextTemplateBean {
    public String compiledVideoPath;
    public String draftId;
    public BiliEditorBean editor;
    public long id;
    public Long playId;
    public String playStyleFrom;
    public String playStyleId;
    public String sendChannel;
    public String templateABTest;
    public String templatePageFrom;
    public String templateSubmissionFrom;
    public int templateType;
    public String videoTemplate;

    public BiliImageTextTemplateBean() {
        this.playStyleFrom = "";
        this.playStyleId = "";
        this.templateSubmissionFrom = "";
        this.playId = 0L;
    }

    public BiliImageTextTemplateBean(long j7, String str, String str2, BiliEditorBean biliEditorBean, int i7, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Long l7) {
        this.playStyleFrom = "";
        this.playStyleId = "";
        this.templateSubmissionFrom = "";
        this.id = j7;
        this.draftId = str;
        this.compiledVideoPath = str2;
        this.editor = biliEditorBean;
        this.templateType = i7;
        this.videoTemplate = str3;
        this.sendChannel = str4;
        this.templateABTest = str5;
        this.templatePageFrom = str6;
        this.playStyleFrom = str7;
        this.playStyleId = str8;
        this.templateSubmissionFrom = str9;
        this.playId = l7;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BiliImageTextTemplateBean{id=");
        sb.append(this.id);
        sb.append(", draftId='");
        sb.append(this.draftId);
        sb.append("', compiledVideoPath='");
        sb.append(this.compiledVideoPath);
        sb.append("', editor=");
        sb.append(this.editor);
        sb.append(", templateType=");
        sb.append(this.templateType);
        sb.append(", videoTemplate='");
        sb.append(this.videoTemplate);
        sb.append("', sendChannel='");
        sb.append(this.sendChannel);
        sb.append("', templateABTest='");
        sb.append(this.templateABTest);
        sb.append("', templatePageFrom='");
        sb.append(this.templatePageFrom);
        sb.append("', playStyleFrom='");
        sb.append(this.playStyleFrom);
        sb.append("', playStyleId='");
        sb.append(this.playStyleId);
        sb.append("', templateSubmissionFrom='");
        sb.append(this.templateSubmissionFrom);
        sb.append("', playId='");
        return c.a(sb, this.playId, "'}");
    }
}
