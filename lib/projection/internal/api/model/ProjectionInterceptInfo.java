package com.bilibili.lib.projection.internal.api.model;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.upper.module.tempalte.bean.TagTemplate;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/api/model/ProjectionInterceptInfo.class */
@Keep
public final class ProjectionInterceptInfo {

    @JSONField(name = "intercept_search_machine")
    @Nullable
    private InterceptMachineBean interceptSearchMachine;

    @JSONField(name = "list_ui")
    @Nullable
    private ListUiBean listUi;

    @JSONField(name = "live_info")
    @Nullable
    private LiveInfoBean liveInfo;

    @JSONField(name = "player_ui")
    @Nullable
    private PlayerUiBean playerUi;

    @JSONField(name = "qn")
    @Nullable
    private DefaultQnInfo qn;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/api/model/ProjectionInterceptInfo$ProjectionInterceptType.class */
    public static final class ProjectionInterceptType {
        private static final EnumEntries $ENTRIES;
        private static final ProjectionInterceptType[] $VALUES;
        public static final ProjectionInterceptType Default = new ProjectionInterceptType(TagTemplate.DEFAULT_TAG, 0);
        public static final ProjectionInterceptType OnlyInterceptInList = new ProjectionInterceptType("OnlyInterceptInList", 1);
        public static final ProjectionInterceptType InterceptNotInList = new ProjectionInterceptType("InterceptNotInList", 2);

        private static final /* synthetic */ ProjectionInterceptType[] $values() {
            return new ProjectionInterceptType[]{Default, OnlyInterceptInList, InterceptNotInList};
        }

        static {
            ProjectionInterceptType[] projectionInterceptTypeArr$values = $values();
            $VALUES = projectionInterceptTypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(projectionInterceptTypeArr$values);
        }

        private ProjectionInterceptType(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<ProjectionInterceptType> getEntries() {
            return $ENTRIES;
        }

        public static ProjectionInterceptType valueOf(String str) {
            return (ProjectionInterceptType) Enum.valueOf(ProjectionInterceptType.class, str);
        }

        public static ProjectionInterceptType[] values() {
            return (ProjectionInterceptType[]) $VALUES.clone();
        }
    }

    @Nullable
    public final InterceptMachineBean getInterceptSearchMachine() {
        return this.interceptSearchMachine;
    }

    @Nullable
    public final ListUiBean getListUi() {
        return this.listUi;
    }

    @Nullable
    public final LiveInfoBean getLiveInfo() {
        return this.liveInfo;
    }

    @Nullable
    public final PlayerUiBean getPlayerUi() {
        return this.playerUi;
    }

    @Nullable
    public final DefaultQnInfo getQn() {
        return this.qn;
    }

    public final void setInterceptSearchMachine(@Nullable InterceptMachineBean interceptMachineBean) {
        this.interceptSearchMachine = interceptMachineBean;
    }

    public final void setListUi(@Nullable ListUiBean listUiBean) {
        this.listUi = listUiBean;
    }

    public final void setLiveInfo(@Nullable LiveInfoBean liveInfoBean) {
        this.liveInfo = liveInfoBean;
    }

    public final void setPlayerUi(@Nullable PlayerUiBean playerUiBean) {
        this.playerUi = playerUiBean;
    }

    public final void setQn(@Nullable DefaultQnInfo defaultQnInfo) {
        this.qn = defaultQnInfo;
    }
}
