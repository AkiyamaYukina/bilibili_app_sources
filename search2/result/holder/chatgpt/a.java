package com.bilibili.search2.result.holder.chatgpt;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bilibili.app.comm.list.widget.opus.A;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.result.holder.chatgpt.api.SearchChatResultItem;
import dt0.AbstractC6843f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/chatgpt/a.class */
@StabilityInferred(parameters = 0)
public abstract class a<T extends BaseSearchItem> extends AbstractC6843f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public JU.m f87971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public MutableLiveData<A> f87972b;

    public a(@NotNull View view) {
        super(view);
        ListExtentionsKt.invisible(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q0(@Nullable BaseSearchItem baseSearchItem, @Nullable SearchChatResultItem.Bubble bubble, @NotNull JW0.g gVar, @NotNull h hVar, @NotNull i iVar) {
        Fragment fragment = getFragment();
        if (fragment != null && bubble != null) {
            bubble.setNodeSize(1);
            bubble.bind(fragment, getBindingAdapterPosition(), gVar, hVar, iVar);
        }
        Observer<? super A> observer = this.f87971a;
        MutableLiveData<A> mutableLiveData = this.f87972b;
        if (observer != null && mutableLiveData != null) {
            mutableLiveData.removeObserver(observer);
        }
        JU.m mVar = new JU.m(1, this);
        this.f87971a = mVar;
        Fragment fragment2 = getFragment();
        if (bubble != null && fragment2 != null) {
            bubble.getProgressiveItemLiveData().observe(fragment2, mVar);
            this.f87972b = bubble.getProgressiveItemLiveData();
        }
        super.bindData(baseSearchItem, true);
    }
}
