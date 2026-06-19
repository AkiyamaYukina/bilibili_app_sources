package com.bilibili.ogv.infra.legacy.exposure;

import android.graphics.Rect;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.ogv.infra.legacy.exposure.IExposureReporter;
import kotlin.Deprecated;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/legacy/exposure/b.class */
@Deprecated(message = "Migrate to https://info.bilibili.co/pages/viewpage.action?pageId=673191113")
@StabilityInferred(parameters = 0)
public final class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f67885a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Rect f67886b = new Rect();

    public static boolean i(RecyclerView recyclerView, LinearLayoutManager linearLayoutManager, int i7) {
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i7);
        if (viewHolderFindViewHolderForAdapterPosition == null) {
            return false;
        }
        Rect rect = f67886b;
        rect.setEmpty();
        if (!viewHolderFindViewHolderForAdapterPosition.itemView.getGlobalVisibleRect(rect)) {
            return false;
        }
        Pair pairE = d.e(rect);
        int iIntValue = ((Number) pairE.getFirst()).intValue();
        int iIntValue2 = ((Number) pairE.getSecond()).intValue();
        boolean z6 = false;
        if (viewHolderFindViewHolderForAdapterPosition.itemView.getMeasuredWidth() > 0) {
            if (viewHolderFindViewHolderForAdapterPosition.itemView.getMeasuredHeight() <= 0) {
                z6 = false;
            } else {
                float measuredWidth = iIntValue / viewHolderFindViewHolderForAdapterPosition.itemView.getMeasuredWidth();
                float measuredHeight = iIntValue2 / viewHolderFindViewHolderForAdapterPosition.itemView.getMeasuredHeight();
                int measuredWidth2 = viewHolderFindViewHolderForAdapterPosition.itemView.getMeasuredWidth();
                float measuredHeight2 = (iIntValue * iIntValue2) / (viewHolderFindViewHolderForAdapterPosition.itemView.getMeasuredHeight() * measuredWidth2);
                if (linearLayoutManager.getOrientation() == 0) {
                    if (measuredHeight < 0.5f) {
                        return false;
                    }
                    boolean z7 = false;
                    if (measuredHeight2 >= 0.5f) {
                        z7 = true;
                    }
                    return z7;
                }
                if (measuredWidth < 0.5f) {
                    return false;
                }
                z6 = false;
                if (measuredHeight2 >= 0.5f) {
                    z6 = true;
                }
            }
        }
        return z6;
    }

    @Override // com.bilibili.ogv.infra.legacy.exposure.f
    public final void b(@NotNull RecyclerView recyclerView, @NotNull IExposureReporter.ReporterCheckerType reporterCheckerType) {
        IExposureReporter iExposureReporter;
        int i7;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && (iExposureReporter = (IExposureReporter) recyclerView.getAdapter()) != null) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            if (iFindFirstVisibleItemPosition == -1 || iFindLastVisibleItemPosition == -1 || iFindFirstVisibleItemPosition > iFindLastVisibleItemPosition) {
                return;
            }
            for (int i8 = iFindFirstVisibleItemPosition; !iExposureReporter.ve(i8, reporterCheckerType); i8++) {
                if (i8 == iFindLastVisibleItemPosition) {
                    return;
                }
            }
            while (true) {
                i7 = iFindLastVisibleItemPosition;
                if (iFindFirstVisibleItemPosition > iFindLastVisibleItemPosition) {
                    break;
                }
                if (i(recyclerView, linearLayoutManager, iFindFirstVisibleItemPosition)) {
                    i7 = iFindLastVisibleItemPosition;
                    break;
                }
                iFindFirstVisibleItemPosition++;
            }
            while (i7 >= iFindFirstVisibleItemPosition && !i(recyclerView, linearLayoutManager, i7)) {
                i7--;
            }
            if (i7 >= iFindFirstVisibleItemPosition && iFindFirstVisibleItemPosition <= i7) {
                while (iFindFirstVisibleItemPosition < linearLayoutManager.getItemCount()) {
                    if (iExposureReporter.ve(iFindFirstVisibleItemPosition, reporterCheckerType)) {
                        iExposureReporter.Xa(iFindFirstVisibleItemPosition, reporterCheckerType, linearLayoutManager.getChildAt(iFindFirstVisibleItemPosition));
                    }
                    if (iFindFirstVisibleItemPosition == i7) {
                        return;
                    } else {
                        iFindFirstVisibleItemPosition++;
                    }
                }
            }
        }
    }
}
