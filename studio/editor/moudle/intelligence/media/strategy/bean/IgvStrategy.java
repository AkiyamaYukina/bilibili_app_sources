package com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean;

import G0.b;
import androidx.annotation.Keep;
import androidx.room.B;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.Igv;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import com.bilibili.studio.videoeditor.extension.m;
import java.util.List;
import java.util.Set;
import kotlin.Deprecated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import y3.c;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/media/strategy/bean/IgvStrategy.class */
@Keep
public final class IgvStrategy implements Igv {

    @JSONField(deserialize = false, serialize = false)
    @Nullable
    private Set<String> _tags;

    @JSONField(name = "content_name")
    @Nullable
    private String contentName;

    @JSONField(name = "filter_condition")
    @Nullable
    private Igv.FilterCondition filterCondition;

    @JSONField(name = "group_condition")
    @Nullable
    private Igv.GroupCondition groupCondition;

    @JSONField(name = "titan_id")
    @Nullable
    private String peopleId;

    @JSONField(name = "resource_id")
    @Nullable
    private String resourceId;

    @JSONField(name = "strategy_id")
    private long strategyId;

    @JSONField(name = "strategy_name")
    @Nullable
    private String strategyName;

    @JSONField(name = "strategy_type")
    @Nullable
    private String strategyType;

    @Nullable
    private String tag;

    @Nullable
    private String templateId;

    @JSONField(name = "content_text")
    @Nullable
    private List<Igv.ContentText> textList;

    @Nullable
    private List<String> titles;

    @JSONField(name = CaptureSchema.TOPIC_ID)
    private long topicId;
    private long weight;

    @Deprecated(message = "旧版本仍会下发，新版改为使用[textList]")
    public static /* synthetic */ void getTitles$annotations() {
    }

    @Nullable
    public final String getContentName() {
        return this.contentName;
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.Igv
    @Nullable
    public String getContentNameX() {
        return this.contentName;
    }

    @Nullable
    public final Igv.FilterCondition getFilterCondition() {
        return this.filterCondition;
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.Igv
    @Nullable
    public Igv.FilterCondition getFilterConditionX() {
        return this.filterCondition;
    }

    @Nullable
    public final Igv.GroupCondition getGroupCondition() {
        return this.groupCondition;
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.Igv
    @Nullable
    public Igv.GroupCondition getGroupConditionX() {
        return this.groupCondition;
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

    @Nullable
    public final String getResourceId() {
        return this.resourceId;
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.Igv
    public long getResourceIdX() {
        long jB = 0;
        try {
            jB = m.b(this.resourceId, 0L);
        } catch (Exception e7) {
            BLog.e("IgvStrategy", e7);
        }
        return jB;
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.Igv
    @NotNull
    public String getResourceType() {
        return "";
    }

    public final long getStrategyId() {
        return this.strategyId;
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.Igv
    public long getStrategyIdX() {
        return this.strategyId;
    }

    @Nullable
    public final String getStrategyName() {
        return this.strategyName;
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.Igv
    @Nullable
    public String getStrategyNameX() {
        return this.strategyName;
    }

    @Nullable
    public final String getStrategyType() {
        return this.strategyType;
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.Igv
    @Nullable
    public String getStrategyTypeX() {
        return this.strategyType;
    }

    @Nullable
    public final String getTag() {
        return this.tag;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
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
            if (r0 != 0) goto L3c
            r0 = r6
            java.lang.String r0 = r0.tag
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L33
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
            if (r0 == 0) goto L33
            r0 = r7
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Set r0 = kotlin.collections.CollectionsKt.toSet(r0)
            r8 = r0
            r0 = r8
            r7 = r0
            r0 = r8
            if (r0 != 0) goto L37
        L33:
            java.util.Set r0 = kotlin.collections.SetsKt.emptySet()
            r7 = r0
        L37:
            r0 = r6
            r1 = r7
            r0._tags = r1
        L3c:
            r0 = r6
            java.util.Set<java.lang.String> r0 = r0._tags
            r8 = r0
            r0 = r8
            r7 = r0
            r0 = r8
            if (r0 != 0) goto L4b
            java.util.Set r0 = kotlin.collections.SetsKt.emptySet()
            r7 = r0
        L4b:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.IgvStrategy.getTags():java.util.Set");
    }

    @Nullable
    public final String getTemplateId() {
        return this.templateId;
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.Igv
    @Nullable
    public String getTemplateIdX() {
        return this.templateId;
    }

    @Nullable
    public final List<Igv.ContentText> getTextList() {
        return this.textList;
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.Igv
    @Nullable
    public List<Igv.ContentText> getTextListX() {
        return this.textList;
    }

    @Nullable
    public final List<String> getTitles() {
        return this.titles;
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
        return false;
    }

    public final void setContentName(@Nullable String str) {
        this.contentName = str;
    }

    public final void setFilterCondition(@Nullable Igv.FilterCondition filterCondition) {
        this.filterCondition = filterCondition;
    }

    public final void setGroupCondition(@Nullable Igv.GroupCondition groupCondition) {
        this.groupCondition = groupCondition;
    }

    public final void setPeopleId(@Nullable String str) {
        this.peopleId = str;
    }

    public final void setResourceId(@Nullable String str) {
        this.resourceId = str;
    }

    public final void setStrategyId(long j7) {
        this.strategyId = j7;
    }

    public final void setStrategyName(@Nullable String str) {
        this.strategyName = str;
    }

    public final void setStrategyType(@Nullable String str) {
        this.strategyType = str;
    }

    public final void setTag(@Nullable String str) {
        this.tag = str;
    }

    public final void setTemplateId(@Nullable String str) {
        this.templateId = str;
    }

    public final void setTextList(@Nullable List<Igv.ContentText> list) {
        this.textList = list;
    }

    public final void setTitles(@Nullable List<String> list) {
        this.titles = list;
    }

    public final void setTopicId(long j7) {
        this.topicId = j7;
    }

    public final void setWeight(long j7) {
        this.weight = j7;
    }

    @NotNull
    public String toString() {
        String str = this.strategyName;
        String str2 = this.contentName;
        String str3 = this.strategyType;
        String str4 = this.tag;
        Igv.FilterCondition filterCondition = this.filterCondition;
        String source = null;
        Integer numValueOf = filterCondition != null ? Integer.valueOf(filterCondition.getResourceType()) : null;
        Igv.FilterCondition filterCondition2 = this.filterCondition;
        if (filterCondition2 != null) {
            source = filterCondition2.getSource();
        }
        long j7 = this.weight;
        StringBuilder sbA = b.a("策略[名称:", str, ",内容名称:", str2, ", 类型:");
        B.a(str3, ", 标签:", str4, ", 素材类型:", sbA);
        c.a(numValueOf, ", 来源:", source, ", 权重:", sbA);
        return android.support.v4.media.session.a.a(sbA, j7, "]");
    }
}
