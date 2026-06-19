package com.bilibili.search2.result.base;

import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.DiffUtil;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.result.all.AbstractC6048b;
import com.bilibili.search2.result.all.C6047a;
import com.bilibili.search2.result.bangumi.C6066f;
import dt0.AbstractC6843f;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/w.class */
@StabilityInferred(parameters = 0)
public abstract class w<VH extends AbstractC6843f<BaseSearchItem>> extends AbstractC6048b<VH, BaseSearchItem> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Function1<Boolean, Unit> f87668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public s f87669c = new s(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f87670d;

    /* JADX WARN: Multi-variable type inference failed */
    public w(@Nullable Function1<? super Boolean, Unit> function1) {
        this.f87668b = function1;
    }

    @Override // com.bilibili.search2.result.all.AbstractC6048b
    /* JADX INFO: renamed from: T */
    public void O(@NotNull VH vh, int i7) {
        if (vh instanceof C6066f) {
            ((C6066f) vh).f87417u = this.f87670d;
        }
        super.O(vh, i7);
    }

    @NotNull
    public Set<Integer> U() {
        return SetsKt.emptySet();
    }

    public final void V() {
        int iIndexOf = this.f87275a.indexOf(this.f87669c);
        if (iIndexOf >= 0) {
            BLog.v("SearchResultFooterAdapter", "notifyFooterChanged = " + this.f87669c.f87607a);
            notifyItemChanged(iIndexOf);
        }
    }

    @Override // com.bilibili.search2.result.all.AbstractC6048b, androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    /* JADX INFO: renamed from: W */
    public AbstractC6843f onCreateViewHolder(int i7, @NotNull ViewGroup viewGroup) {
        return i7 == 1091444754 ? SearchFooterHolder.f87530c.create(viewGroup) : (AbstractC6843f) P(i7, viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: X */
    public void onViewAttachedToWindow(@NotNull VH vh) {
        super.onViewAttachedToWindow(vh);
        vh.attachToWindow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public final void Y(@NotNull List<BaseSearchItem> list, boolean z6, boolean z7) {
        boolean z8;
        if (list.isEmpty()) {
            return;
        }
        int i7 = 1;
        if (this.f87670d) {
            z8 = true;
            break;
        }
        List<BaseSearchItem> list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            for (BaseSearchItem baseSearchItem : list2) {
                if (Intrinsics.areEqual("recommend_tips", baseSearchItem.getGoTo()) || Intrinsics.areEqual("hot_recommend", baseSearchItem.getGoTo())) {
                    z8 = true;
                    break;
                }
            }
        }
        z8 = false;
        this.f87670d = z8;
        BaseSearchItem baseSearchItem2 = (BaseSearchItem) CollectionsKt.lastOrNull(list);
        s sVar = new s(baseSearchItem2 != null ? baseSearchItem2.getTrackId() : null);
        this.f87669c = sVar;
        if (!z6) {
            i7 = 0;
        } else if (z7) {
            i7 = 3;
        }
        sVar.f87607a = i7;
        list.add(sVar);
        List<V> list3 = this.f87275a;
        this.f87275a = list;
        DiffUtil.calculateDiff(new C6047a(this, list3)).dispatchUpdatesTo(this);
    }
}
