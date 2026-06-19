package com.bilibili.upper.module.template.fragment;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.bilibili.studio.template.data.VideoTemplateBean;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/template/fragment/e.class */
public final class e extends FragmentStateAdapter {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<VideoTemplateBean> f114003j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(TemplateDetailFragment templateDetailFragment, List<? extends VideoTemplateBean> list) {
        super(templateDetailFragment);
        this.f114003j = list;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public final boolean containsItem(long j7) {
        if (j7 == -1) {
            return true;
        }
        int size = this.f114003j.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (j7 == ((long) i7) + ((long) this.f114003j.get(i7).hashCode())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public final Fragment createFragment(int i7) {
        Fragment templatePreviewLoadingFragment;
        if (i7 < this.f114003j.size()) {
            VideoTemplateBean videoTemplateBean = this.f114003j.get(i7);
            templatePreviewLoadingFragment = new TemplatePreviewFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("data", videoTemplateBean);
            templatePreviewLoadingFragment.setArguments(bundle);
        } else {
            templatePreviewLoadingFragment = new TemplatePreviewLoadingFragment();
        }
        return templatePreviewLoadingFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f114003j.size() + 1;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i7) {
        return i7 >= this.f114003j.size() ? -1L : ((long) this.f114003j.get(i7).hashCode()) + ((long) i7);
    }
}
