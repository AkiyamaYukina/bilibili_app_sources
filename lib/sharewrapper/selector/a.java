package com.bilibili.lib.sharewrapper.selector;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.lib.sharewrapper.selector.ISharePlatformSelector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/selector/a.class */
public final class a extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public ISharePlatformSelector.OnItemClickListener f64455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<SharePlatform> f64456b = new ArrayList();

    /* JADX INFO: renamed from: com.bilibili.lib.sharewrapper.selector.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/selector/a$a.class */
    public final class ViewOnClickListenerC0356a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SharePlatform f64457a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f64458b;

        public ViewOnClickListenerC0356a(a aVar, SharePlatform sharePlatform) {
            this.f64458b = aVar;
            this.f64457a = sharePlatform;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ISharePlatformSelector.OnItemClickListener onItemClickListener = this.f64458b.f64455a;
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(this.f64457a);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/selector/a$b.class */
    public static final class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SharePlatformView f64459a;

        public b(View view) {
            super(view);
            this.f64459a = (SharePlatformView) view.findViewById(2131297531);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        List<SharePlatform> list = this.f64456b;
        return list == null ? 0 : ((ArrayList) list).size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        b bVar = (b) viewHolder;
        SharePlatform sharePlatform = (SharePlatform) ((ArrayList) this.f64456b).get(i7);
        bVar.getClass();
        int i8 = sharePlatform.iconId;
        SharePlatformView sharePlatformView = bVar.f64459a;
        sharePlatformView.setTopIcon(i8);
        sharePlatformView.setText(sharePlatform.titleId);
        bVar.itemView.setOnClickListener(new ViewOnClickListenerC0356a(this, sharePlatform));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        return new b(p.a(viewGroup, 2131496564, viewGroup, false));
    }
}
