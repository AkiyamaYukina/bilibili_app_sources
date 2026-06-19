package com.bilibili.studio.editor.moudle.templatev2.bean;

import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import androidx.compose.runtime.C4277b;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/templatev2/bean/EditorTemplateTabItemBean.class */
@Keep
public class EditorTemplateTabItemBean implements Serializable {
    public static final long TEMPLATE_ID_BEFORE_REC = -103;
    public static final long TEMPLATE_ID_ORIGINAL = -101;
    public static final long TEMPLATE_ID_RECOMMEND = -102;

    @JSONField(name = "apply_for")
    public int applyFor;

    @JSONField(name = "aspect_ratio")
    public int aspectRatio;

    @Nullable
    @JSONField(name = "badge")
    public String badge;

    @JSONField(name = "bind_material_info")
    public EditorTempalteBindMaterialInfoBean bindMaterialInfo;

    @JSONField(name = "bind_music_info")
    public List<EditorTemplateBindMusicInfo> bindMusicInfo;

    @JSONField(name = "ctime")
    public long cTime;

    @Nullable
    @JSONField(name = "cover")
    public String coverUrl;

    @Nullable
    @JSONField(name = "desc")
    public String desc;
    public int downloadState;

    @Nullable
    @JSONField(name = "download_url")
    public String downloadUrl;

    @Nullable
    @JSONField(name = "download_url_arr")
    public List<EditorTemplateUrlRatio> downloadUrlArr;

    @Nullable
    @JSONField(name = "download_url_horizontal")
    public String downloadUrlHorizontal;

    @Nullable
    @JSONField(name = "download_url_vertical")
    public String downloadUrlVertical;

    @JSONField(name = "effect_cycle")
    public int effectCycle;

    @JSONField(name = "fav")
    public int fav;

    @JSONField(name = "hot")
    public int hot;

    @JSONField(name = "hot_index")
    public int hotIndex;

    @JSONField(name = "id")
    public long id;

    @JSONField(name = "is_bind_music")
    public int isBindMusic;

    @JSONField(name = "is_checkpoint")
    public boolean isCheckPoint;

    @JSONField(name = "is_text_rail")
    public boolean isTextRail;

    @JSONField(name = "mtime")
    public long mTime;

    @JSONField(name = "material_source")
    public long materialSource;

    @Nullable
    @JSONField(name = "name")
    public String name;
    public long originId;

    @Nullable
    @JSONField(name = "player_url")
    public String playUrl;

    @Nullable
    @JSONField(name = "pop_preview_url")
    public String popPreviewUrl;

    @JSONField(name = EditCustomizeSticker.TAG_RANK)
    public int rank;

    @JSONField(name = "rec_music")
    public List<String> recMusicInfo;

    @Nullable
    @JSONField(name = "static_cover")
    public String staticCover;

    @JSONField(name = "stickers_cycle")
    public int stickersCycle;
    public int tabIndex = -1;

    @JSONField(name = "tags")
    public String tags;

    @Nullable
    @JSONField(name = "template_desc")
    public String templateDesc;

    @Nullable
    @JSONField(name = "template_info")
    public String templateInfo;

    @JSONField(name = CaptureSchema.TOPIC_ID)
    public long topicId;

    @JSONField(name = "type")
    public int type;

    @JSONField(name = "use_count")
    public int useCount;

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public EditorTemplateTabItemBean m10146clone() {
        return (EditorTemplateTabItemBean) JSON.parseObject(JSON.toJSONString(this), EditorTemplateTabItemBean.class);
    }

    public boolean equals(Object obj) {
        boolean z6 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditorTemplateTabItemBean)) {
            return false;
        }
        EditorTemplateTabItemBean editorTemplateTabItemBean = (EditorTemplateTabItemBean) obj;
        if (this.id != editorTemplateTabItemBean.id || !Objects.equals(this.downloadUrl, editorTemplateTabItemBean.downloadUrl) || !Objects.equals(this.downloadUrlVertical, editorTemplateTabItemBean.downloadUrlVertical) || !Objects.equals(this.downloadUrlHorizontal, editorTemplateTabItemBean.downloadUrlHorizontal) || !Objects.equals(this.downloadUrlArr, editorTemplateTabItemBean.downloadUrlArr)) {
            z6 = false;
        }
        return z6;
    }

    public long getOriginId() {
        long j7 = this.originId;
        if (j7 <= 0) {
            j7 = this.id;
        }
        return j7;
    }

    @JSONField(serialize = false)
    public boolean isBeforeRecommend() {
        return this.id == -103;
    }

    @JSONField(serialize = false)
    public boolean isOriginalFilm() {
        return this.id == -101;
    }

    @JSONField(serialize = false)
    public boolean isRecommend() {
        return this.id == -102;
    }

    @JSONField(serialize = false)
    public boolean isTemplateBindMusic() {
        boolean z6 = true;
        if (this.isBindMusic != 1) {
            z6 = false;
        }
        return z6;
    }

    @JSONField(serialize = false)
    public boolean isValid() {
        List<EditorTemplateUrlRatio> list;
        return (TextUtils.isEmpty(this.downloadUrl) && TextUtils.isEmpty(this.downloadUrlHorizontal) && TextUtils.isEmpty(this.downloadUrlVertical) && ((list = this.downloadUrlArr) == null || list.isEmpty())) ? false : true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("EditorTemplateTabItemBean{id=");
        sb.append(this.id);
        sb.append(", name='");
        sb.append(this.name);
        sb.append("', downloadState='");
        return C4277b.a(this.downloadState, "'}", sb);
    }

    public void updateData(EditorTemplateTabItemBean editorTemplateTabItemBean) {
        this.id = editorTemplateTabItemBean.id;
        long j7 = editorTemplateTabItemBean.id;
        if (j7 <= 0) {
            j7 = editorTemplateTabItemBean.originId;
            if (j7 <= 0) {
                j7 = this.originId;
            }
        }
        this.originId = j7;
        this.name = editorTemplateTabItemBean.name;
        this.coverUrl = editorTemplateTabItemBean.coverUrl;
        this.popPreviewUrl = editorTemplateTabItemBean.popPreviewUrl;
        this.staticCover = editorTemplateTabItemBean.staticCover;
        this.rank = editorTemplateTabItemBean.rank;
        this.type = editorTemplateTabItemBean.type;
        this.mTime = editorTemplateTabItemBean.mTime;
        this.tags = editorTemplateTabItemBean.tags;
        this.hot = editorTemplateTabItemBean.hot;
        this.hotIndex = editorTemplateTabItemBean.hotIndex;
        this.fav = editorTemplateTabItemBean.fav;
        this.applyFor = editorTemplateTabItemBean.applyFor;
        this.downloadUrl = editorTemplateTabItemBean.downloadUrl;
        this.playUrl = editorTemplateTabItemBean.playUrl;
        this.desc = editorTemplateTabItemBean.desc;
        this.topicId = editorTemplateTabItemBean.topicId;
        this.isCheckPoint = editorTemplateTabItemBean.isCheckPoint;
        this.isTextRail = editorTemplateTabItemBean.isTextRail;
        this.useCount = editorTemplateTabItemBean.useCount;
        this.stickersCycle = editorTemplateTabItemBean.stickersCycle;
        this.effectCycle = editorTemplateTabItemBean.effectCycle;
        this.aspectRatio = editorTemplateTabItemBean.aspectRatio;
        this.badge = editorTemplateTabItemBean.badge;
        this.bindMaterialInfo = editorTemplateTabItemBean.bindMaterialInfo;
        this.materialSource = editorTemplateTabItemBean.materialSource;
        this.downloadUrlHorizontal = editorTemplateTabItemBean.downloadUrlHorizontal;
        this.downloadUrlVertical = editorTemplateTabItemBean.downloadUrlVertical;
        this.downloadUrlArr = editorTemplateTabItemBean.downloadUrlArr;
        this.templateDesc = editorTemplateTabItemBean.templateDesc;
        this.templateInfo = editorTemplateTabItemBean.templateInfo;
        this.isBindMusic = editorTemplateTabItemBean.isBindMusic;
        this.bindMusicInfo = new ArrayList();
        List<EditorTemplateBindMusicInfo> list = editorTemplateTabItemBean.bindMusicInfo;
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<EditorTemplateBindMusicInfo> it = editorTemplateTabItemBean.bindMusicInfo.iterator();
        while (it.hasNext()) {
            this.bindMusicInfo.add(it.next().m10145clone());
        }
    }
}
