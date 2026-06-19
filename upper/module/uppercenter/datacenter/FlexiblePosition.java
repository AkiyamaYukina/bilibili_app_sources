package com.bilibili.upper.module.uppercenter.datacenter;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.live.streaming.source.TextSource;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenter/datacenter/FlexiblePosition.class */
@StabilityInferred(parameters = 0)
@Keep
public final class FlexiblePosition {
    public static final int $stable = 8;

    @JSONField(name = "button")
    @Nullable
    private Button button;

    @JSONField(name = TextSource.CFG_CONTENT)
    @Nullable
    private Content content;

    @JSONField(name = CaptureSchema.JUMP_PARAMS_EXTRA)
    @Nullable
    private Extra extra;

    @JSONField(name = "main_title")
    @Nullable
    private MainTitle mainTitle;

    @JSONField(name = "module_title")
    @Nullable
    private ModuleTitle moduleTitle;

    @JSONField(name = "sub_title")
    @Nullable
    private SubTitle subTitle;

    public FlexiblePosition() {
        this(null, null, null, null, null, null, 63, null);
    }

    public FlexiblePosition(@Nullable ModuleTitle moduleTitle, @Nullable MainTitle mainTitle, @Nullable SubTitle subTitle, @Nullable Content content, @Nullable Button button, @Nullable Extra extra) {
        this.moduleTitle = moduleTitle;
        this.mainTitle = mainTitle;
        this.subTitle = subTitle;
        this.content = content;
        this.button = button;
        this.extra = extra;
    }

    public /* synthetic */ FlexiblePosition(ModuleTitle moduleTitle, MainTitle mainTitle, SubTitle subTitle, Content content, Button button, Extra extra, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : moduleTitle, (i7 & 2) != 0 ? null : mainTitle, (i7 & 4) != 0 ? null : subTitle, (i7 & 8) != 0 ? null : content, (i7 & 16) != 0 ? null : button, (i7 & 32) != 0 ? null : extra);
    }

    public static /* synthetic */ FlexiblePosition copy$default(FlexiblePosition flexiblePosition, ModuleTitle moduleTitle, MainTitle mainTitle, SubTitle subTitle, Content content, Button button, Extra extra, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            moduleTitle = flexiblePosition.moduleTitle;
        }
        if ((i7 & 2) != 0) {
            mainTitle = flexiblePosition.mainTitle;
        }
        if ((i7 & 4) != 0) {
            subTitle = flexiblePosition.subTitle;
        }
        if ((i7 & 8) != 0) {
            content = flexiblePosition.content;
        }
        if ((i7 & 16) != 0) {
            button = flexiblePosition.button;
        }
        if ((i7 & 32) != 0) {
            extra = flexiblePosition.extra;
        }
        return flexiblePosition.copy(moduleTitle, mainTitle, subTitle, content, button, extra);
    }

    @Nullable
    public final ModuleTitle component1() {
        return this.moduleTitle;
    }

    @Nullable
    public final MainTitle component2() {
        return this.mainTitle;
    }

    @Nullable
    public final SubTitle component3() {
        return this.subTitle;
    }

    @Nullable
    public final Content component4() {
        return this.content;
    }

    @Nullable
    public final Button component5() {
        return this.button;
    }

    @Nullable
    public final Extra component6() {
        return this.extra;
    }

    @NotNull
    public final FlexiblePosition copy(@Nullable ModuleTitle moduleTitle, @Nullable MainTitle mainTitle, @Nullable SubTitle subTitle, @Nullable Content content, @Nullable Button button, @Nullable Extra extra) {
        return new FlexiblePosition(moduleTitle, mainTitle, subTitle, content, button, extra);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlexiblePosition)) {
            return false;
        }
        FlexiblePosition flexiblePosition = (FlexiblePosition) obj;
        return Intrinsics.areEqual(this.moduleTitle, flexiblePosition.moduleTitle) && Intrinsics.areEqual(this.mainTitle, flexiblePosition.mainTitle) && Intrinsics.areEqual(this.subTitle, flexiblePosition.subTitle) && Intrinsics.areEqual(this.content, flexiblePosition.content) && Intrinsics.areEqual(this.button, flexiblePosition.button) && Intrinsics.areEqual(this.extra, flexiblePosition.extra);
    }

    @Nullable
    public final Button getButton() {
        return this.button;
    }

    @Nullable
    public final Content getContent() {
        return this.content;
    }

    @Nullable
    public final Extra getExtra() {
        return this.extra;
    }

    @Nullable
    public final MainTitle getMainTitle() {
        return this.mainTitle;
    }

    @Nullable
    public final ModuleTitle getModuleTitle() {
        return this.moduleTitle;
    }

    @Nullable
    public final SubTitle getSubTitle() {
        return this.subTitle;
    }

    public int hashCode() {
        ModuleTitle moduleTitle = this.moduleTitle;
        int iHashCode = 0;
        int iHashCode2 = moduleTitle == null ? 0 : moduleTitle.hashCode();
        MainTitle mainTitle = this.mainTitle;
        int iHashCode3 = mainTitle == null ? 0 : mainTitle.hashCode();
        SubTitle subTitle = this.subTitle;
        int iHashCode4 = subTitle == null ? 0 : subTitle.hashCode();
        Content content = this.content;
        int iHashCode5 = content == null ? 0 : content.hashCode();
        Button button = this.button;
        int iHashCode6 = button == null ? 0 : button.hashCode();
        Extra extra = this.extra;
        if (extra != null) {
            iHashCode = extra.hashCode();
        }
        return (((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode;
    }

    public final void setButton(@Nullable Button button) {
        this.button = button;
    }

    public final void setContent(@Nullable Content content) {
        this.content = content;
    }

    public final void setExtra(@Nullable Extra extra) {
        this.extra = extra;
    }

    public final void setMainTitle(@Nullable MainTitle mainTitle) {
        this.mainTitle = mainTitle;
    }

    public final void setModuleTitle(@Nullable ModuleTitle moduleTitle) {
        this.moduleTitle = moduleTitle;
    }

    public final void setSubTitle(@Nullable SubTitle subTitle) {
        this.subTitle = subTitle;
    }

    @NotNull
    public String toString() {
        return "FlexiblePosition(moduleTitle=" + this.moduleTitle + ", mainTitle=" + this.mainTitle + ", subTitle=" + this.subTitle + ", content=" + this.content + ", button=" + this.button + ", extra=" + this.extra + ")";
    }
}
