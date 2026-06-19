package com.bilibili.lib.projection.internal.api.model;

import androidx.annotation.Keep;
import androidx.media3.exoplayer.analytics.B;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.lib.projection.internal.widget.fullscreen.newui.interf.ShowBubbleType;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.google.gson.Gson;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/api/model/ProjectionOperationConfig.class */
@Keep
public final class ProjectionOperationConfig {

    @JSONField(name = "device_banner")
    @Nullable
    private DeviceBannerConfig deviceBanner;

    @JSONField(name = "dot")
    @Nullable
    private DotConfig dot;

    @JSONField(name = "proj_bubble")
    @Nullable
    private ProjButtonBubbleConfig projButtonBubble;

    @JSONField(name = "proj_page")
    @Nullable
    private ControlPageConfig projPage;

    @JSONField(name = "third_bubble")
    @Nullable
    private ThirdProjBubbleConfig thirdProjBubble;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/api/model/ProjectionOperationConfig$ControlPageConfig.class */
    @Keep
    public static final class ControlPageConfig {

        @JSONField(name = "dynamic_pic")
        @Nullable
        private String dynamicPic;

        @JSONField(name = "id")
        @Nullable
        private String id;

        @JSONField(name = "repeat")
        private int repeat = 1;

        @JSONField(name = "static_pic")
        @Nullable
        private String staticPic;

        @JSONField(name = "title")
        @Nullable
        private String title;

        @JSONField(name = "url")
        @Nullable
        private String url;

        @Nullable
        public final String getDynamicPic() {
            return this.dynamicPic;
        }

        @Nullable
        public final String getId() {
            return this.id;
        }

        public final int getRepeat() {
            return this.repeat;
        }

        @Nullable
        public final String getStaticPic() {
            return this.staticPic;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        @Nullable
        public final String getUrl() {
            return this.url;
        }

        public final void setDynamicPic(@Nullable String str) {
            this.dynamicPic = str;
        }

        public final void setId(@Nullable String str) {
            this.id = str;
        }

        public final void setRepeat(int i7) {
            this.repeat = i7;
        }

        public final void setStaticPic(@Nullable String str) {
            this.staticPic = str;
        }

        public final void setTitle(@Nullable String str) {
            this.title = str;
        }

        public final void setUrl(@Nullable String str) {
            this.url = str;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/api/model/ProjectionOperationConfig$DeviceBannerConfig.class */
    @Keep
    public static final class DeviceBannerConfig {

        @JSONField(name = "dark_expand")
        @Nullable
        private String darkExpand;

        @JSONField(name = "dark_fold")
        @Nullable
        private String darkFold;

        @JSONField(name = "id")
        @Nullable
        private String id;

        @JSONField(name = "light_expand")
        @Nullable
        private String lightExpand;

        @JSONField(name = "light_fold")
        @Nullable
        private String lightFold;

        @JSONField(name = "third_party_desc")
        @Nullable
        private String thirdPartyDesc;

        @JSONField(name = "title")
        @Nullable
        private String title;

        @JSONField(name = "track_params")
        @Nullable
        private String trackParams;

        @JSONField(name = "url")
        @Nullable
        private String url;

        @Nullable
        public final String getDarkExpand() {
            return this.darkExpand;
        }

        @Nullable
        public final String getDarkFold() {
            return this.darkFold;
        }

        @Nullable
        public final String getId() {
            return this.id;
        }

        @Nullable
        public final String getLightExpand() {
            return this.lightExpand;
        }

        @Nullable
        public final String getLightFold() {
            return this.lightFold;
        }

        @Nullable
        public final String getThirdPartyDesc() {
            return this.thirdPartyDesc;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        @Nullable
        public final String getTrackParams() {
            return this.trackParams;
        }

        @Nullable
        public final String getUrl() {
            return this.url;
        }

        public final void setDarkExpand(@Nullable String str) {
            this.darkExpand = str;
        }

        public final void setDarkFold(@Nullable String str) {
            this.darkFold = str;
        }

        public final void setId(@Nullable String str) {
            this.id = str;
        }

        public final void setLightExpand(@Nullable String str) {
            this.lightExpand = str;
        }

        public final void setLightFold(@Nullable String str) {
            this.lightFold = str;
        }

        public final void setThirdPartyDesc(@Nullable String str) {
            this.thirdPartyDesc = str;
        }

        public final void setTitle(@Nullable String str) {
            this.title = str;
        }

        public final void setTrackParams(@Nullable String str) {
            this.trackParams = str;
        }

        public final void setUrl(@Nullable String str) {
            this.url = str;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/api/model/ProjectionOperationConfig$DotConfig.class */
    @Keep
    public static final class DotConfig {

        @JSONField(name = "code")
        @Nullable
        private String code;

        @JSONField(name = "id")
        @Nullable
        private String id;

        @JSONField(name = "show")
        @Nullable
        private Boolean show;

        @Nullable
        public final String getCode() {
            return this.code;
        }

        @Nullable
        public final String getId() {
            return this.id;
        }

        @Nullable
        public final Boolean getShow() {
            return this.show;
        }

        public final void setCode(@Nullable String str) {
            this.code = str;
        }

        public final void setId(@Nullable String str) {
            this.id = str;
        }

        public final void setShow(@Nullable Boolean bool) {
            this.show = bool;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/api/model/ProjectionOperationConfig$NewThirdProjBubbleConfig.class */
    @Keep
    public static final class NewThirdProjBubbleConfig {

        @JSONField(name = "desc")
        @Nullable
        private String desc;

        @JSONField(name = EditCustomizeSticker.TAG_DURATION)
        @Nullable
        private Integer duration;

        @JSONField(name = "id")
        @Nullable
        private String id;

        @JSONField(name = "position")
        @Nullable
        private Integer position;

        @JSONField(name = "scene")
        @Nullable
        private Integer scene;

        @JSONField(name = "title")
        @Nullable
        private String title;

        @Nullable
        public final String getDesc() {
            return this.desc;
        }

        @Nullable
        public final Integer getDuration() {
            return this.duration;
        }

        @Nullable
        public final String getId() {
            return this.id;
        }

        @Nullable
        public final Integer getPosition() {
            return this.position;
        }

        @Nullable
        public final Integer getScene() {
            return this.scene;
        }

        @NotNull
        public final ShowBubbleType getShowBubbleType() {
            Integer num = this.position;
            return (num != null && num.intValue() == 1) ? ShowBubbleType.SwitchDevice : (num != null && num.intValue() == 2) ? ShowBubbleType.Damaku : (num != null && num.intValue() == 3) ? ShowBubbleType.Speed : (num != null && num.intValue() == 4) ? ShowBubbleType.Quality : ShowBubbleType.Unknown;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        public final void setDesc(@Nullable String str) {
            this.desc = str;
        }

        public final void setDuration(@Nullable Integer num) {
            this.duration = num;
        }

        public final void setId(@Nullable String str) {
            this.id = str;
        }

        public final void setPosition(@Nullable Integer num) {
            this.position = num;
        }

        public final void setScene(@Nullable Integer num) {
            this.scene = num;
        }

        public final void setTitle(@Nullable String str) {
            this.title = str;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/api/model/ProjectionOperationConfig$OttDevice.class */
    @Keep
    public static final class OttDevice {

        @JSONField(name = "channel")
        @Nullable
        private String channel;

        @JSONField(name = "device_buvid")
        @Nullable
        private String deviceBuvid;

        @JSONField(name = "device_model")
        @Nullable
        private String deviceModel;

        @JSONField(name = "device_name")
        @Nullable
        private String deviceName;

        @JSONField(name = "device_type")
        @Nullable
        private Integer deviceType;

        @JSONField(name = "drainage")
        @Nullable
        private String drainage;

        @JSONField(name = "ott_version")
        @Nullable
        private String ottVersion;

        @JSONField(name = "player_mode")
        @Nullable
        private Integer playerMode;

        @JSONField(name = "product_form")
        @Nullable
        private String productForm;

        @Nullable
        public final String getChannel() {
            return this.channel;
        }

        @Nullable
        public final String getDeviceBuvid() {
            return this.deviceBuvid;
        }

        @Nullable
        public final String getDeviceModel() {
            return this.deviceModel;
        }

        @Nullable
        public final String getDeviceName() {
            return this.deviceName;
        }

        @Nullable
        public final Integer getDeviceType() {
            return this.deviceType;
        }

        @Nullable
        public final String getDrainage() {
            return this.drainage;
        }

        @Nullable
        public final String getOttVersion() {
            return this.ottVersion;
        }

        @Nullable
        public final Integer getPlayerMode() {
            return this.playerMode;
        }

        @Nullable
        public final String getProductForm() {
            return this.productForm;
        }

        public final void setChannel(@Nullable String str) {
            this.channel = str;
        }

        public final void setDeviceBuvid(@Nullable String str) {
            this.deviceBuvid = str;
        }

        public final void setDeviceModel(@Nullable String str) {
            this.deviceModel = str;
        }

        public final void setDeviceName(@Nullable String str) {
            this.deviceName = str;
        }

        public final void setDeviceType(@Nullable Integer num) {
            this.deviceType = num;
        }

        public final void setDrainage(@Nullable String str) {
            this.drainage = str;
        }

        public final void setOttVersion(@Nullable String str) {
            this.ottVersion = str;
        }

        public final void setPlayerMode(@Nullable Integer num) {
            this.playerMode = num;
        }

        public final void setProductForm(@Nullable String str) {
            this.productForm = str;
        }

        @NotNull
        public final String toJson() {
            String json;
            try {
                json = new Gson().toJson(this, OttDevice.class);
            } catch (Exception e7) {
                B.a("OttDevice json parse error, exception is: ", e7);
                json = "";
            }
            return json;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/api/model/ProjectionOperationConfig$ProjButtonBubbleConfig.class */
    @Keep
    public static final class ProjButtonBubbleConfig {

        @JSONField(name = "desc")
        @Nullable
        private String desc;

        @JSONField(name = "id")
        @Nullable
        private String id;

        @JSONField(name = "pic")
        @Nullable
        private String pic;

        @JSONField(name = "show_guide")
        @Nullable
        private Boolean showGuide;

        @JSONField(name = "title")
        @Nullable
        private String title;

        @Nullable
        public final String getDesc() {
            return this.desc;
        }

        @Nullable
        public final String getId() {
            return this.id;
        }

        @Nullable
        public final String getPic() {
            return this.pic;
        }

        @Nullable
        public final Boolean getShowGuide() {
            return this.showGuide;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        public final void setDesc(@Nullable String str) {
            this.desc = str;
        }

        public final void setId(@Nullable String str) {
            this.id = str;
        }

        public final void setPic(@Nullable String str) {
            this.pic = str;
        }

        public final void setShowGuide(@Nullable Boolean bool) {
            this.showGuide = bool;
        }

        public final void setTitle(@Nullable String str) {
            this.title = str;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/api/model/ProjectionOperationConfig$ThirdProjBubbleConfig.class */
    @Keep
    public static final class ThirdProjBubbleConfig {

        @JSONField(name = "desc")
        @Nullable
        private String desc;

        @JSONField(name = "id")
        @Nullable
        private String id;

        @JSONField(name = "list")
        @Nullable
        private List<NewThirdProjBubbleConfig> list;

        @JSONField(name = "pic")
        @Nullable
        private String pic;

        @JSONField(name = "title")
        @Nullable
        private String title;

        @Nullable
        public final String getDesc() {
            return this.desc;
        }

        @Nullable
        public final String getId() {
            return this.id;
        }

        @Nullable
        public final List<NewThirdProjBubbleConfig> getList() {
            return this.list;
        }

        @Nullable
        public final String getPic() {
            return this.pic;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        public final void setDesc(@Nullable String str) {
            this.desc = str;
        }

        public final void setId(@Nullable String str) {
            this.id = str;
        }

        public final void setList(@Nullable List<NewThirdProjBubbleConfig> list) {
            this.list = list;
        }

        public final void setPic(@Nullable String str) {
            this.pic = str;
        }

        public final void setTitle(@Nullable String str) {
            this.title = str;
        }
    }

    @Nullable
    public final DeviceBannerConfig getDeviceBanner() {
        return this.deviceBanner;
    }

    @Nullable
    public final DotConfig getDot() {
        return this.dot;
    }

    @Nullable
    public final ProjButtonBubbleConfig getProjButtonBubble() {
        return this.projButtonBubble;
    }

    @Nullable
    public final ControlPageConfig getProjPage() {
        return this.projPage;
    }

    @Nullable
    public final ThirdProjBubbleConfig getThirdProjBubble() {
        return this.thirdProjBubble;
    }

    public final void setDeviceBanner(@Nullable DeviceBannerConfig deviceBannerConfig) {
        this.deviceBanner = deviceBannerConfig;
    }

    public final void setDot(@Nullable DotConfig dotConfig) {
        this.dot = dotConfig;
    }

    public final void setProjButtonBubble(@Nullable ProjButtonBubbleConfig projButtonBubbleConfig) {
        this.projButtonBubble = projButtonBubbleConfig;
    }

    public final void setProjPage(@Nullable ControlPageConfig controlPageConfig) {
        this.projPage = controlPageConfig;
    }

    public final void setThirdProjBubble(@Nullable ThirdProjBubbleConfig thirdProjBubbleConfig) {
        this.thirdProjBubble = thirdProjBubbleConfig;
    }
}
