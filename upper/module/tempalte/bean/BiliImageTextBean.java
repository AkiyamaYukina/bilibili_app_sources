package com.bilibili.upper.module.tempalte.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.I0;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import com.bilibili.studio.videoeditor.template.bean.BiliImageTextExtra;
import com.bilibili.studio.videoeditor.template.bean.BiliMaterialInfo;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/tempalte/bean/BiliImageTextBean.class */
@Keep
public class BiliImageTextBean {

    @JSONField(name = "apply_for")
    public int applyFor;

    @JSONField(name = "author")
    public BiliAuthorBean author;

    @JSONField(name = "badge")
    public String badge;

    @JSONField(name = "bind_material_info")
    public BiliMaterialInfo bindMaterialInfo;

    @JSONField(name = "biz_from")
    public int bizFrom;

    @JSONField(name = "ctime")
    public long cTime;

    @JSONField(name = "cat_id")
    public long catId;

    @JSONField(name = "cat_ids")
    public List<Long> catIdList;

    @JSONField(name = "cat_infos")
    public List<BiliCategoryInfoBean> catInfoList;

    @JSONField(name = "cover")
    public String cover;

    @JSONField(name = "default_length")
    public long defaultLength;

    @JSONField(name = "download_url")
    public String downloadUrl;

    @JSONField(name = "extra_")
    public BiliImageTextExtra extra;

    @JSONField(name = "fav")
    public String fav;

    @JSONField(name = "hot")
    public int hot;

    @JSONField(name = "id")
    public long id;

    @JSONField(name = "mtime")
    public long mTime;

    @JSONField(name = "material_fill_page")
    public int materialFillPage;

    @JSONField(name = "max_rows")
    public long maxRows;

    @JSONField(name = "max_word_count")
    public long maxWordCount;

    @JSONField(name = "max_words")
    public long maxWords;

    @JSONField(name = "min_rows")
    public long minRows;

    @JSONField(name = "min_words")
    public long minWords;

    @JSONField(name = "musicians")
    public String musicians;

    @JSONField(name = "name")
    public String name;

    @JSONField(name = "picked")
    public int picked;

    @JSONField(name = "playurl")
    public String playUrl;

    @JSONField(name = "pop_preview_url")
    public String popPreviewUrl;

    @JSONField(name = "preview_url")
    public String previewUrl;

    @JSONField(name = EditCustomizeSticker.TAG_RANK)
    public int rank;

    @JSONField(name = "sdk_type")
    public String sdkType;

    @JSONField(name = "static_cover")
    public String staticCover;

    @JSONField(name = "tags")
    public String tags;

    @JSONField(name = "template_desc")
    public String templateDesc;

    @JSONField(name = "template_from")
    public int templateFrom;

    @JSONField(name = "template_info")
    public String templateInfo;

    @JSONField(name = "template_type")
    public int templateType;

    @JSONField(name = "text_template_info")
    public String textTemplateInfo;

    @JSONField(name = CaptureSchema.TOPIC_ID)
    public long topicId;

    @JSONField(name = "type")
    public int type;

    @JSONField(name = "up_from")
    public long upFrom;

    @JSONField(name = "use_count")
    public long useCount;

    @JSONField(name = "sdk_tag")
    public boolean useMonSdk = false;

    public String toString() {
        StringBuilder sb = new StringBuilder("BiliImageTextBean{applyFor=");
        sb.append(this.applyFor);
        sb.append(", author=");
        sb.append(this.author);
        sb.append(", catId=");
        sb.append(this.catId);
        sb.append(", badge='");
        sb.append(this.badge);
        sb.append("', bindMaterialInfo=");
        sb.append(this.bindMaterialInfo);
        sb.append(", bizFrom=");
        sb.append(this.bizFrom);
        sb.append(", catIdList=");
        sb.append(this.catIdList);
        sb.append(", catInfoList=");
        sb.append(this.catInfoList);
        sb.append(", cover='");
        sb.append(this.cover);
        sb.append("', cTime=");
        sb.append(this.cTime);
        sb.append(", defaultLength=");
        sb.append(this.defaultLength);
        sb.append(", downloadUrl='");
        sb.append(this.downloadUrl);
        sb.append("', extra=");
        sb.append(this.extra);
        sb.append(", fav='");
        sb.append(this.fav);
        sb.append("', hot=");
        sb.append(this.hot);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", materialFillPage=");
        sb.append(this.materialFillPage);
        sb.append(", maxRows=");
        sb.append(this.maxRows);
        sb.append(", maxWordCount=");
        sb.append(this.maxWordCount);
        sb.append(", maxWords=");
        sb.append(this.maxWords);
        sb.append(", minRows=");
        sb.append(this.minRows);
        sb.append(", minWords=");
        sb.append(this.minWords);
        sb.append(", mTime=");
        sb.append(this.mTime);
        sb.append(", musicians='");
        sb.append(this.musicians);
        sb.append("', name='");
        sb.append(this.name);
        sb.append("', picked=");
        sb.append(this.picked);
        sb.append(", playUrl='");
        sb.append(this.playUrl);
        sb.append("', popPreviewUrl='");
        sb.append(this.popPreviewUrl);
        sb.append("', previewUrl='");
        sb.append(this.previewUrl);
        sb.append("', rank=");
        sb.append(this.rank);
        sb.append(", staticCover='");
        sb.append(this.staticCover);
        sb.append("', tags='");
        sb.append(this.tags);
        sb.append("', templateDesc='");
        sb.append(this.templateDesc);
        sb.append("', templateFrom=");
        sb.append(this.templateFrom);
        sb.append(", templateInfo='");
        sb.append(this.templateInfo);
        sb.append("', templateType=");
        sb.append(this.templateType);
        sb.append(", textTemplateInfo='");
        sb.append(this.textTemplateInfo);
        sb.append("', type=");
        sb.append(this.type);
        sb.append(", upFrom=");
        sb.append(this.upFrom);
        sb.append(", useCount=");
        sb.append(this.useCount);
        sb.append(", topicId=");
        sb.append(this.topicId);
        sb.append(", useMonSdk=");
        sb.append(this.useMonSdk);
        sb.append(", sdkType=");
        return I0.b(sb, this.sdkType, '}');
    }
}
