package com.bilibili.studio.editor.moudle.editormain.ui.fragments.record.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import py0.a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/record/bean/RecordVoiceCategory.class */
@Keep
public final class RecordVoiceCategory implements Serializable {

    @JSONField(name = "children")
    @Nullable
    private List<FxData> children;

    @JSONField(name = "id")
    private int id;

    @JSONField(name = "name")
    @Nullable
    private String name;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/record/bean/RecordVoiceCategory$CatInfo.class */
    @Keep
    public static final class CatInfo {

        @JSONField(name = "cat_id")
        private int catId;

        @JSONField(name = "cat_name")
        @Nullable
        private String catName;

        public final int getCatId() {
            return this.catId;
        }

        @Nullable
        public final String getCatName() {
            return this.catName;
        }

        public final void setCatId(int i7) {
            this.catId = i7;
        }

        public final void setCatName(@Nullable String str) {
            this.catName = str;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/record/bean/RecordVoiceCategory$FxData.class */
    @Keep
    public static final class FxData {
        private boolean applying;

        @JSONField(name = "cat_infos")
        @Nullable
        private List<CatInfo> catInfos;

        @JSONField(name = "cover")
        @Nullable
        private String cover;

        @JSONField(name = "download_url_v2")
        @Nullable
        private String downloadUrl;

        @JSONField(name = "id")
        @Nullable
        private String id;

        @JSONField(name = "name")
        @Nullable
        private String name;

        @JSONField(name = "nameCH")
        @Nullable
        private String nameCH;

        @JSONField(name = "source_type")
        private int sourceTyp;

        @Nullable
        private a voiceInfoData;

        public final boolean getApplying() {
            return this.applying;
        }

        @Nullable
        public final List<CatInfo> getCatInfos() {
            return this.catInfos;
        }

        @Nullable
        public final String getCover() {
            return this.cover;
        }

        @Nullable
        public final String getDownloadUrl() {
            return this.downloadUrl;
        }

        @Nullable
        public final String getId() {
            return this.id;
        }

        @Nullable
        public final String getName() {
            return this.name;
        }

        @Nullable
        public final String getNameCH() {
            return this.nameCH;
        }

        public final int getSourceTyp() {
            return this.sourceTyp;
        }

        @Nullable
        public final a getVoiceInfoData() {
            return this.voiceInfoData;
        }

        public final void setApplying(boolean z6) {
            this.applying = z6;
        }

        public final void setCatInfos(@Nullable List<CatInfo> list) {
            this.catInfos = list;
        }

        public final void setCover(@Nullable String str) {
            this.cover = str;
        }

        public final void setDownloadUrl(@Nullable String str) {
            this.downloadUrl = str;
        }

        public final void setId(@Nullable String str) {
            this.id = str;
        }

        public final void setName(@Nullable String str) {
            this.name = str;
        }

        public final void setNameCH(@Nullable String str) {
            this.nameCH = str;
        }

        public final void setSourceTyp(int i7) {
            this.sourceTyp = i7;
        }

        public final void setVoiceInfoData(@Nullable a aVar) {
            this.voiceInfoData = aVar;
        }
    }

    @Nullable
    public final List<FxData> getChildren() {
        return this.children;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final void setChildren(@Nullable List<FxData> list) {
        this.children = list;
    }

    public final void setId(int i7) {
        this.id = i7;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }
}
