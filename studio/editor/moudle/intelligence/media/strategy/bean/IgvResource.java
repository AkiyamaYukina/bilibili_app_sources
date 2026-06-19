package com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean;

import G0.b;
import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.Igv;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.SerialName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y3.c;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/media/strategy/bean/IgvResource.class */
@Keep
public final class IgvResource implements Igv {

    @JSONField(deserialize = false, serialize = false)
    @Nullable
    private Set<String> _tags;
    private int force;

    @JSONField(name = "content_generation_detail")
    @Nullable
    private ContentGenerationConfig generationConfig;

    @JSONField(name = "hot_score")
    private float hotScore;

    @JSONField(name = "interest_score")
    private float interestScore;

    @JSONField(name = "titan_id")
    @Nullable
    private String peopleId;

    @JSONField(name = "resource_id")
    private long resourceId;

    @JSONField(name = "resource_name")
    @Nullable
    private String resourceName;

    @JSONField(name = CaptureSchema.TOPIC_ID)
    private long topicId;
    private long weight;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/media/strategy/bean/IgvResource$ContentGenerationConfig.class */
    @Keep
    public static final class ContentGenerationConfig {

        @JSONField(name = "material")
        @Nullable
        private Material material;

        @JSONField(name = "text")
        @Nullable
        private List<Igv.ContentText> textList;

        @Nullable
        public final Material getMaterial() {
            return this.material;
        }

        @Nullable
        public final List<Igv.ContentText> getTextList() {
            return this.textList;
        }

        public final void setMaterial(@Nullable Material material) {
            this.material = material;
        }

        public final void setTextList(@Nullable List<Igv.ContentText> list) {
            this.textList = list;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/media/strategy/bean/IgvResource$Material.class */
    @Keep
    public static final class Material {

        @JSONField(name = "content_name")
        @Nullable
        private String contentName;

        @JSONField(name = "content_type")
        @Nullable
        private String contentType;

        @JSONField(name = "filter_condition")
        @Nullable
        private Igv.FilterCondition filterCondition;

        @JSONField(name = "group_condition")
        @Nullable
        private Igv.GroupCondition groupCondition;

        @JSONField(name = "tag")
        @Nullable
        private String tag;

        @JSONField(name = EditCustomizeSticker.TAG_TEMPLATE_ID)
        @Nullable
        private String templateId;

        @Nullable
        public final String getContentName() {
            return this.contentName;
        }

        @Nullable
        public final String getContentType() {
            return this.contentType;
        }

        @Nullable
        public final Igv.FilterCondition getFilterCondition() {
            return this.filterCondition;
        }

        @Nullable
        public final Igv.GroupCondition getGroupCondition() {
            return this.groupCondition;
        }

        @Nullable
        public final String getTag() {
            return this.tag;
        }

        @Nullable
        public final String getTemplateId() {
            return this.templateId;
        }

        public final void setContentName(@Nullable String str) {
            this.contentName = str;
        }

        public final void setContentType(@Nullable String str) {
            this.contentType = str;
        }

        public final void setFilterCondition(@Nullable Igv.FilterCondition filterCondition) {
            this.filterCondition = filterCondition;
        }

        public final void setGroupCondition(@Nullable Igv.GroupCondition groupCondition) {
            this.groupCondition = groupCondition;
        }

        public final void setTag(@Nullable String str) {
            this.tag = str;
        }

        public final void setTemplateId(@Nullable String str) {
            this.templateId = str;
        }
    }

    @SerialName("is_force")
    public static /* synthetic */ void getForce$annotations() {
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.Igv
    @Nullable
    public String getContentNameX() {
        Material material;
        ContentGenerationConfig contentGenerationConfig = this.generationConfig;
        return (contentGenerationConfig == null || (material = contentGenerationConfig.getMaterial()) == null) ? null : material.getContentName();
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.Igv
    @Nullable
    public Igv.FilterCondition getFilterConditionX() {
        Material material;
        ContentGenerationConfig contentGenerationConfig = this.generationConfig;
        return (contentGenerationConfig == null || (material = contentGenerationConfig.getMaterial()) == null) ? null : material.getFilterCondition();
    }

    public final int getForce() {
        return this.force;
    }

    @Nullable
    public final ContentGenerationConfig getGenerationConfig() {
        return this.generationConfig;
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.Igv
    @Nullable
    public Igv.GroupCondition getGroupConditionX() {
        Material material;
        ContentGenerationConfig contentGenerationConfig = this.generationConfig;
        return (contentGenerationConfig == null || (material = contentGenerationConfig.getMaterial()) == null) ? null : material.getGroupCondition();
    }

    public final float getHotScore() {
        return this.hotScore;
    }

    public final float getInterestScore() {
        return this.interestScore;
    }

    @Nullable
    public final String getPeopleId() {
        return this.peopleId;
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.Igv
    @Nullable
    public String getPeopleIdX() {
        return this.peopleId;
    }

    public final long getResourceId() {
        return this.resourceId;
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.Igv
    public long getResourceIdX() {
        return this.resourceId;
    }

    @Nullable
    public final String getResourceName() {
        return this.resourceName;
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.Igv
    @NotNull
    public String getResourceType() {
        return this.force == 1 ? "强插供给" : this.interestScore > 0.0f ? "兴趣偏向" : "热门兜底";
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.Igv
    public long getStrategyIdX() {
        return 0L;
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.Igv
    @Nullable
    public String getStrategyNameX() {
        return this.resourceName;
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.Igv
    @Nullable
    public String getStrategyTypeX() {
        Material material;
        ContentGenerationConfig contentGenerationConfig = this.generationConfig;
        return (contentGenerationConfig == null || (material = contentGenerationConfig.getMaterial()) == null) ? null : material.getContentType();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Set<java.lang.String> getTags() {
        /*
            r6 = this;
            r0 = r6
            java.util.Set<java.lang.String> r0 = r0._tags
            if (r0 != 0) goto L4e
            r0 = r6
            com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.IgvResource$ContentGenerationConfig r0 = r0.generationConfig
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L45
            r0 = r7
            com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.IgvResource$Material r0 = r0.getMaterial()
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L45
            r0 = r7
            java.lang.String r0 = r0.getTag()
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L45
            r0 = r7
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = r1
            r3 = 0
            java.lang.String r4 = ","
            r2[r3] = r4
            r2 = 0
            r3 = 6
            java.util.List r0 = kotlin.text.StringsKt.R(r0, r1, r2, r3)
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L45
            r0 = r7
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Set r0 = kotlin.collections.CollectionsKt.toSet(r0)
            r8 = r0
            r0 = r8
            r7 = r0
            r0 = r8
            if (r0 != 0) goto L49
        L45:
            java.util.Set r0 = kotlin.collections.SetsKt.emptySet()
            r7 = r0
        L49:
            r0 = r6
            r1 = r7
            r0._tags = r1
        L4e:
            r0 = r6
            java.util.Set<java.lang.String> r0 = r0._tags
            r8 = r0
            r0 = r8
            r7 = r0
            r0 = r8
            if (r0 != 0) goto L5d
            java.util.Set r0 = kotlin.collections.SetsKt.emptySet()
            r7 = r0
        L5d:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.IgvResource.getTags():java.util.Set");
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.Igv
    @Nullable
    public String getTemplateIdX() {
        Material material;
        ContentGenerationConfig contentGenerationConfig = this.generationConfig;
        return (contentGenerationConfig == null || (material = contentGenerationConfig.getMaterial()) == null) ? null : material.getTemplateId();
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.Igv
    @Nullable
    public List<Igv.ContentText> getTextListX() {
        ContentGenerationConfig contentGenerationConfig = this.generationConfig;
        return contentGenerationConfig != null ? contentGenerationConfig.getTextList() : null;
    }

    public final long getTopicId() {
        return this.topicId;
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.Igv
    public long getTopicIdX() {
        return this.topicId;
    }

    public final long getWeight() {
        return this.weight;
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.Igv
    public long getWeightX() {
        return this.weight;
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.Igv
    public boolean isAbChild() {
        return true;
    }

    public final void setForce(int i7) {
        this.force = i7;
    }

    public final void setGenerationConfig(@Nullable ContentGenerationConfig contentGenerationConfig) {
        this.generationConfig = contentGenerationConfig;
    }

    public final void setHotScore(float f7) {
        this.hotScore = f7;
    }

    public final void setInterestScore(float f7) {
        this.interestScore = f7;
    }

    public final void setPeopleId(@Nullable String str) {
        this.peopleId = str;
    }

    public final void setResourceId(long j7) {
        this.resourceId = j7;
    }

    public final void setResourceName(@Nullable String str) {
        this.resourceName = str;
    }

    public final void setTopicId(long j7) {
        this.topicId = j7;
    }

    public final void setWeight(long j7) {
        this.weight = j7;
    }

    @NotNull
    public String toString() {
        Material material;
        String str = this.resourceName;
        String contentNameX = getContentNameX();
        ContentGenerationConfig contentGenerationConfig = this.generationConfig;
        String source = null;
        String contentType = (contentGenerationConfig == null || (material = contentGenerationConfig.getMaterial()) == null) ? null : material.getContentType();
        Set<String> tags = getTags();
        Igv.FilterCondition filterConditionX = getFilterConditionX();
        Integer numValueOf = filterConditionX != null ? Integer.valueOf(filterConditionX.getResourceType()) : null;
        Igv.FilterCondition filterConditionX2 = getFilterConditionX();
        if (filterConditionX2 != null) {
            source = filterConditionX2.getSource();
        }
        long j7 = this.weight;
        StringBuilder sbA = b.a("供给[名称:", str, ",内容名称:", contentNameX, ", 类型:");
        sbA.append(contentType);
        sbA.append(", 标签:");
        sbA.append(tags);
        sbA.append(", 素材类型:");
        c.a(numValueOf, ", 来源:", source, ", 权重:", sbA);
        return android.support.v4.media.session.a.a(sbA, j7, "]");
    }
}
