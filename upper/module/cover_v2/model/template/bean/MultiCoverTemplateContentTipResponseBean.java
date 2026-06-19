package com.bilibili.upper.module.cover_v2.model.template.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.lib.sharewrapper.basic.ThirdPartyExtraBuilder;
import com.bilibili.live.streaming.source.TextSource;
import java.io.Serializable;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/model/template/bean/MultiCoverTemplateContentTipResponseBean.class */
@StabilityInferred(parameters = 0)
@Keep
public final class MultiCoverTemplateContentTipResponseBean implements Serializable {
    public static final int $stable = 8;

    @JSONField(name = "auth")
    @Nullable
    private Integer auth;

    @JSONField(name = "hover_content")
    @Nullable
    private String hoverContent;

    @JSONField(name = "top_bar")
    @Nullable
    private TopBarDTO topBar;

    @JSONField(name = "type_content")
    @Nullable
    private TypeContentDTO typeContent;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/model/template/bean/MultiCoverTemplateContentTipResponseBean$TopBarDTO.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class TopBarDTO implements Serializable {
        public static final int $stable = 8;

        @JSONField(name = TextSource.CFG_CONTENT)
        @Nullable
        private String content;

        @JSONField(name = "url")
        @Nullable
        private String url;

        @JSONField(name = "url_content")
        @Nullable
        private String urlContent;

        @Nullable
        public final String getContent() {
            return this.content;
        }

        @Nullable
        public final String getUrl() {
            return this.url;
        }

        @Nullable
        public final String getUrlContent() {
            return this.urlContent;
        }

        public final void setContent(@Nullable String str) {
            this.content = str;
        }

        public final void setUrl(@Nullable String str) {
            this.url = str;
        }

        public final void setUrlContent(@Nullable String str) {
            this.urlContent = str;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/model/template/bean/MultiCoverTemplateContentTipResponseBean$TypeContentDTO.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class TypeContentDTO implements Serializable {
        public static final int $stable = 8;

        @JSONField(name = "contents")
        @Nullable
        private List<String> contents;

        @JSONField(name = "image_contents")
        @Nullable
        private List<ImageContentsDTO> imageContents;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/model/template/bean/MultiCoverTemplateContentTipResponseBean$TypeContentDTO$ImageContentsDTO.class */
        @StabilityInferred(parameters = 0)
        @Keep
        public static final class ImageContentsDTO implements Serializable {
            public static final int $stable = 8;

            @JSONField(name = "image_subtitle")
            @Nullable
            private List<String> imageSubtitle;

            @JSONField(name = "image_title")
            @Nullable
            private String imageTitle;

            @JSONField(name = ThirdPartyExtraBuilder.SHARE_PARAMS_IMAGE_URL)
            @Nullable
            private List<String> imageUrl;

            @Nullable
            public final List<String> getImageSubtitle() {
                return this.imageSubtitle;
            }

            @Nullable
            public final String getImageTitle() {
                return this.imageTitle;
            }

            @Nullable
            public final List<String> getImageUrl() {
                return this.imageUrl;
            }

            public final void setImageSubtitle(@Nullable List<String> list) {
                this.imageSubtitle = list;
            }

            public final void setImageTitle(@Nullable String str) {
                this.imageTitle = str;
            }

            public final void setImageUrl(@Nullable List<String> list) {
                this.imageUrl = list;
            }
        }

        @Nullable
        public final List<String> getContents() {
            return this.contents;
        }

        @Nullable
        public final List<ImageContentsDTO> getImageContents() {
            return this.imageContents;
        }

        public final void setContents(@Nullable List<String> list) {
            this.contents = list;
        }

        public final void setImageContents(@Nullable List<ImageContentsDTO> list) {
            this.imageContents = list;
        }
    }

    @Nullable
    public final Integer getAuth() {
        return this.auth;
    }

    @Nullable
    public final String getHoverContent() {
        return this.hoverContent;
    }

    @Nullable
    public final TopBarDTO getTopBar() {
        return this.topBar;
    }

    @Nullable
    public final TypeContentDTO getTypeContent() {
        return this.typeContent;
    }

    public final void setAuth(@Nullable Integer num) {
        this.auth = num;
    }

    public final void setHoverContent(@Nullable String str) {
        this.hoverContent = str;
    }

    public final void setTopBar(@Nullable TopBarDTO topBarDTO) {
        this.topBar = topBarDTO;
    }

    public final void setTypeContent(@Nullable TypeContentDTO typeContentDTO) {
        this.typeContent = typeContentDTO;
    }
}
