package com.bilibili.biligame.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.biligame.theme.BiligameHomeTheme;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/bean/GameCenterBottomTabConfig.class */
@StabilityInferred(parameters = 0)
@Keep
public final class GameCenterBottomTabConfig implements Serializable {
    public static final int $stable = 8;

    @NotNull
    public static final a Companion = new Object();

    @NotNull
    public static final String TAB_TYPE_ACT = "activity";

    @JSONField(name = "background_color")
    @Nullable
    private String backgroundColorStr;

    @JSONField(name = "bubble")
    @Nullable
    private GameCenterBottomTabConfigBubble bubble;

    @JSONField(name = "config_id")
    @Nullable
    private String configId;

    @JSONField(name = "highlight_color")
    @Nullable
    private String highlightColorStr;

    @JSONField(name = "highlight_icon")
    @Nullable
    private String highlightIcon;

    @JSONField(name = "icon")
    @Nullable
    private String icon;

    @JSONField(name = "label")
    @Nullable
    private GameCenterBottomTabConfigLabel label;

    @Nullable
    private BiligameHomeTheme mTheme;

    @JSONField(name = "name")
    @Nullable
    private String name;

    @JSONField(name = "text_color")
    @Nullable
    private String normalColorStr;

    @JSONField(name = "tab_text")
    @Nullable
    private String tabText;

    @JSONField(name = "target_tab_name")
    @Nullable
    private String targetTabName;

    @JSONField(name = "target_tab_type")
    @Nullable
    private String targetTabType;

    @JSONField(name = "type")
    @Nullable
    private String type;

    @JSONField(name = "url")
    @Nullable
    private String url;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/bean/GameCenterBottomTabConfig$a.class */
    public static final class a {
    }

    @Nullable
    public final String getBackgroundColorStr() {
        return this.backgroundColorStr;
    }

    @Nullable
    public final GameCenterBottomTabConfigBubble getBubble() {
        return this.bubble;
    }

    @Nullable
    public final String getConfigId() {
        return this.configId;
    }

    @Nullable
    public final String getHighlightColorStr() {
        return this.highlightColorStr;
    }

    @Nullable
    public final String getHighlightIcon() {
        return this.highlightIcon;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final GameCenterBottomTabConfigLabel getLabel() {
        return this.label;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getNormalColorStr() {
        return this.normalColorStr;
    }

    @Nullable
    public final String getTabText() {
        return this.tabText;
    }

    @Nullable
    public final String getTargetTabName() {
        return this.targetTabName;
    }

    @Nullable
    public final String getTargetTabType() {
        return this.targetTabType;
    }

    @Nullable
    public final BiligameHomeTheme getTheme() {
        if (this.mTheme == null && Intrinsics.areEqual(this.type, TAB_TYPE_ACT)) {
            BiligameHomeTheme biligameHomeTheme = new BiligameHomeTheme();
            biligameHomeTheme.setBackgroundColorStr(this.backgroundColorStr);
            biligameHomeTheme.setHighlightColorStr(this.highlightColorStr);
            biligameHomeTheme.setNormalColorStr(this.normalColorStr);
            this.mTheme = biligameHomeTheme;
        }
        return this.mTheme;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public final void setBackgroundColorStr(@Nullable String str) {
        this.backgroundColorStr = str;
    }

    public final void setBubble(@Nullable GameCenterBottomTabConfigBubble gameCenterBottomTabConfigBubble) {
        this.bubble = gameCenterBottomTabConfigBubble;
    }

    public final void setConfigId(@Nullable String str) {
        this.configId = str;
    }

    public final void setHighlightColorStr(@Nullable String str) {
        this.highlightColorStr = str;
    }

    public final void setHighlightIcon(@Nullable String str) {
        this.highlightIcon = str;
    }

    public final void setIcon(@Nullable String str) {
        this.icon = str;
    }

    public final void setLabel(@Nullable GameCenterBottomTabConfigLabel gameCenterBottomTabConfigLabel) {
        this.label = gameCenterBottomTabConfigLabel;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setNormalColorStr(@Nullable String str) {
        this.normalColorStr = str;
    }

    public final void setTabText(@Nullable String str) {
        this.tabText = str;
    }

    public final void setTargetTabName(@Nullable String str) {
        this.targetTabName = str;
    }

    public final void setTargetTabType(@Nullable String str) {
        this.targetTabType = str;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }
}
