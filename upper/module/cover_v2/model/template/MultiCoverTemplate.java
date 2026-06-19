package com.bilibili.upper.module.cover_v2.model.template;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/model/template/MultiCoverTemplate.class */
@StabilityInferred(parameters = 0)
@Keep
public final class MultiCoverTemplate {
    public static final int $stable = 8;

    @NotNull
    public static final a Companion = new Object();
    public static final int ID_DEFAULT = -10086;

    @SerializedName("coverUrl")
    @Nullable
    private String coverUrl;

    @SerializedName("definition")
    @Nullable
    private MultiCoverTemplateDefinition definition;
    private boolean isDownloaded;
    private boolean isDownloading;
    private boolean isFailed;

    @SerializedName("name")
    @Nullable
    private String name;

    @SerializedName("packageUrl")
    @Nullable
    private String packageUrl;

    @SerializedName("templateMaterials")
    @Nullable
    private Map<String, String> templateMaterials;

    @SerializedName("id")
    private int id = -10086;

    @Nullable
    private String backgroundPath = "";

    @SerializedName("categoryId")
    @NotNull
    private String categoryId = "";

    @SerializedName("categoryName")
    @NotNull
    private String categoryName = "";

    @Nullable
    private String selectTabName = "none";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/model/template/MultiCoverTemplate$a.class */
    public static final class a {
    }

    @Nullable
    public final String getBackgroundPath() {
        return this.backgroundPath;
    }

    @NotNull
    public final String getCategoryId() {
        return this.categoryId;
    }

    @NotNull
    public final String getCategoryName() {
        return this.categoryName;
    }

    @Nullable
    public final String getCoverUrl() {
        return this.coverUrl;
    }

    @Nullable
    public final MultiCoverTemplateDefinition getDefinition() {
        return this.definition;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getPackageUrl() {
        return this.packageUrl;
    }

    @Nullable
    public final String getSelectTabName() {
        return this.selectTabName;
    }

    @Nullable
    public final Map<String, String> getTemplateMaterials() {
        return this.templateMaterials;
    }

    public final boolean isDownloaded() {
        return this.isDownloaded;
    }

    public final boolean isDownloading() {
        return this.isDownloading;
    }

    public final boolean isFailed() {
        return this.isFailed;
    }

    public final void setBackgroundPath(@Nullable String str) {
        this.backgroundPath = str;
    }

    public final void setCategoryId(@NotNull String str) {
        this.categoryId = str;
    }

    public final void setCategoryName(@NotNull String str) {
        this.categoryName = str;
    }

    public final void setCoverUrl(@Nullable String str) {
        this.coverUrl = str;
    }

    public final void setDefinition(@Nullable MultiCoverTemplateDefinition multiCoverTemplateDefinition) {
        this.definition = multiCoverTemplateDefinition;
    }

    public final void setDownloaded(boolean z6) {
        this.isDownloaded = z6;
    }

    public final void setDownloading(boolean z6) {
        this.isDownloading = z6;
    }

    public final void setFailed(boolean z6) {
        this.isFailed = z6;
    }

    public final void setId(int i7) {
        this.id = i7;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setPackageUrl(@Nullable String str) {
        this.packageUrl = str;
    }

    public final void setSelectTabName(@Nullable String str) {
        this.selectTabName = str;
    }

    public final void setTemplateMaterials(@Nullable Map<String, String> map) {
        this.templateMaterials = map;
    }
}
