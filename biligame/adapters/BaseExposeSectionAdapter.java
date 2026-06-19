package com.bilibili.biligame.adapters;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.EnvironmentCompat;
import com.bilibili.biligame.report.ReportHelper;
import com.bilibili.biligame.widget.viewholder.BaseExposeViewHolder;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.bili.widget.section.adapter.BaseSectionAdapter;
import tv.danmaku.bili.widget.section.holder.BaseViewHolder;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/adapters/BaseExposeSectionAdapter.class */
@StabilityInferred(parameters = 0)
public abstract class BaseExposeSectionAdapter extends BaseSectionAdapter {
    public static final int $stable = 8;

    @NotNull
    public String getExposeId() {
        return "";
    }

    @NotNull
    public String getExposePosition(@NotNull BaseViewHolder baseViewHolder) {
        return "";
    }

    @NotNull
    public String getExposeType() {
        return "";
    }

    public boolean isSelected() {
        return true;
    }

    public boolean isStartExpose(@NotNull BaseViewHolder baseViewHolder) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // 
    public void onViewAttachedToWindow(@NonNull @NotNull BaseViewHolder baseViewHolder) {
        super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.onViewAttachedToWindow(baseViewHolder);
        int adapterPosition = baseViewHolder.getAdapterPosition();
        if (baseViewHolder instanceof BaseExposeViewHolder) {
            BaseExposeViewHolder baseExposeViewHolder = (BaseExposeViewHolder) baseViewHolder;
            if (Intrinsics.areEqual(baseExposeViewHolder.getExposeName(), EnvironmentCompat.MEDIA_UNKNOWN) || !isStartExpose(baseViewHolder)) {
                return;
            }
            if (isSelected()) {
                ReportHelper.getHelperInstance(baseViewHolder.itemView.getContext()).addExposeMap(baseExposeViewHolder.getExposeUuidKey(), TextUtils.isEmpty(getExposeType()) ? ReportHelper.getHelperInstance(baseViewHolder.itemView.getContext()).getPage() : getExposeType(), TextUtils.isEmpty(getExposePosition(baseViewHolder)) ? String.valueOf(adapterPosition) : getExposePosition(baseViewHolder), TextUtils.isEmpty(getExposeId()) ? baseExposeViewHolder.getExposeId() : getExposeId(), baseExposeViewHolder.getExposeName(), baseExposeViewHolder.getExposeAvid(), baseExposeViewHolder.getExposeBvid(), baseExposeViewHolder.getExposeIsAlsent(), baseExposeViewHolder.getExposeFromSpmid(), baseExposeViewHolder.getExposeModule(), baseExposeViewHolder.getExposeExtra());
            } else {
                ReportHelper.getHelperInstance(baseViewHolder.itemView.getContext()).addUnExposeMap(baseExposeViewHolder.getExposeUuidKey(), TextUtils.isEmpty(getExposeType()) ? ReportHelper.getHelperInstance(baseViewHolder.itemView.getContext()).getPage() : getExposeType(), TextUtils.isEmpty(getExposePosition(baseViewHolder)) ? String.valueOf(adapterPosition) : getExposePosition(baseViewHolder), TextUtils.isEmpty(getExposeId()) ? baseExposeViewHolder.getExposeId() : getExposeId(), baseExposeViewHolder.getExposeName(), baseExposeViewHolder.getExposeAvid(), baseExposeViewHolder.getExposeBvid(), baseExposeViewHolder.getExposeIsAlsent(), baseExposeViewHolder.getExposeFromSpmid(), baseExposeViewHolder.getExposeModule(), baseExposeViewHolder.getExposeExtra());
            }
        }
    }
}
