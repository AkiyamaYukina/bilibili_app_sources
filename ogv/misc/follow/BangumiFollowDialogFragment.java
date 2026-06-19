package com.bilibili.ogv.misc.follow;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.magicasakura.widgets.TintImageView;
import com.bilibili.ogvcommon.deprecated.bottomsheet.BangumiBottomSheet;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qk0.i;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/follow/BangumiFollowDialogFragment.class */
@StabilityInferred(parameters = 0)
public final class BangumiFollowDialogFragment extends DialogFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public RecyclerView f69017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public ArrayList<BangumiBottomSheet.SheetItem> f69018c = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final a f69019d = new a(this);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f69020e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f69021f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public i f69022g;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/follow/BangumiFollowDialogFragment$a.class */
    public final class a extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public List<BangumiBottomSheet.SheetItem> f69023a = CollectionsKt.emptyList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public i f69024b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public Integer f69025c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final BangumiFollowDialogFragment f69026d;

        /* JADX INFO: renamed from: com.bilibili.ogv.misc.follow.BangumiFollowDialogFragment$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/follow/BangumiFollowDialogFragment$a$a.class */
        public final class C0422a extends RecyclerView.ViewHolder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @Nullable
            public final TintImageView f69027a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @Nullable
            public final TextView f69028b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @Nullable
            public final ImageView f69029c;

            public C0422a(@Nullable View view) {
                super(view);
                this.f69027a = (TintImageView) view.findViewById(2131302505);
                this.f69028b = (TextView) view.findViewById(2131310583);
                this.f69029c = (ImageView) view.findViewById(2131304393);
            }
        }

        public a(BangumiFollowDialogFragment bangumiFollowDialogFragment) {
            this.f69026d = bangumiFollowDialogFragment;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.f69023a.size();
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x00e9  */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onBindViewHolder(@org.jetbrains.annotations.NotNull final androidx.recyclerview.widget.RecyclerView.ViewHolder r9, int r10) {
            /*
                Method dump skipped, instruction units count: 272
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.misc.follow.BangumiFollowDialogFragment.a.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public final RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i7) {
            BangumiFollowDialogFragment bangumiFollowDialogFragment = this.f69026d;
            bangumiFollowDialogFragment.getClass();
            return new C0422a(LayoutInflater.from(bangumiFollowDialogFragment.getContext()).inflate(2131499582, viewGroup, false));
        }
    }

    public BangumiFollowDialogFragment() {
        new Rect();
        this.f69021f = -1;
    }

    @Override // androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.f69018c.clear();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f69018c = arguments.getParcelableArrayList("sheet_item_list");
            this.f69020e = arguments.getBoolean("sheet_item_show_check_icon");
            this.f69021f = arguments.getInt("sheet_item_show_current_sheet_item_id", -1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Context contextRequireContext = requireContext();
        View viewInflate = layoutInflater.inflate(2131501118, viewGroup, false);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(contextRequireContext);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(2131308035);
        this.f69017b = recyclerView;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(linearLayoutManager);
        }
        RecyclerView recyclerView2 = this.f69017b;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.f69019d);
        }
        a aVar = this.f69019d;
        aVar.f69023a = this.f69018c;
        aVar.notifyDataSetChanged();
        a aVar2 = this.f69019d;
        aVar2.f69025c = Integer.valueOf(this.f69021f);
        aVar2.notifyDataSetChanged();
        a aVar3 = this.f69019d;
        aVar3.f69024b = this.f69022g;
        aVar3.notifyDataSetChanged();
        return viewInflate;
    }
}
