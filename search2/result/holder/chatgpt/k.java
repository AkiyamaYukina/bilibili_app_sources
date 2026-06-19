package com.bilibili.search2.result.holder.chatgpt;

import Bl.A;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.bean.IThumbnailSizeController;
import com.bilibili.lib.image2.bean.ScaleType;
import com.bilibili.lib.image2.bean.ThumbUrlTransformStrategyUtils;
import com.bilibili.search2.result.holder.chatgpt.api.DisclaimerItem;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/chatgpt/k.class */
@StabilityInferred(parameters = 0)
public final class k extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<DisclaimerItem> f88023a = new ArrayList();

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return ((ArrayList) this.f88023a).size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i7) {
        if (viewHolder instanceof m) {
            m mVar = (m) viewHolder;
            DisclaimerItem disclaimerItem = (DisclaimerItem) ((ArrayList) this.f88023a).get(i7);
            mVar.getClass();
            BiliImageLoader biliImageLoader = BiliImageLoader.INSTANCE;
            A a7 = mVar.f88026a;
            biliImageLoader.with(a7.a.getContext()).url(disclaimerItem.f87973a).placeholderImageResId(2131239923, ScaleType.FIT_XY).thumbnailUrlTransformStrategy(ThumbUrlTransformStrategyUtils.stylingStrategy$default("search-normal-fill-android", (IThumbnailSizeController) null, 2, (Object) null)).into(a7.c);
            a7.b.setText(disclaimerItem.f87974b);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public final RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i7) {
        return new m(A.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
    }
}
