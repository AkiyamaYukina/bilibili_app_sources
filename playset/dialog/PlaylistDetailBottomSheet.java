package com.bilibili.playset.dialog;

import CR.g;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.playset.dialog.OperateItem;
import com.bilibili.playset.dialog.PlaylistDetailBottomSheet;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/dialog/PlaylistDetailBottomSheet.class */
@StabilityInferred(parameters = 0)
public final class PlaylistDetailBottomSheet extends BottomSheetDialogFragment {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final ArrayList<OperateItem> f84715e = CollectionsKt.arrayListOf(new OperateItem[]{new OperateItem(2131238502, 2131842642, 1), new OperateItem(2131238499, 2131842462, 7), new OperateItem(2131238497, 2131842567, 8), new OperateItem(2131238501, 2131841356, 4), new OperateItem(2131238504, 2131846932, 5)});

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final ArrayList<OperateItem> f84716f = CollectionsKt.arrayListOf(new OperateItem[]{new OperateItem(2131238502, 2131842642, 1), new OperateItem(2131238499, 2131842462, 7), new OperateItem(2131238497, 2131842567, 8), new OperateItem(2131238504, 2131846932, 5)});

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final ArrayList<OperateItem> f84717g = CollectionsKt.arrayListOf(new OperateItem[]{new OperateItem(2131238504, 2131846932, 5)});

    @NotNull
    public static final ArrayList<OperateItem> h = CollectionsKt.arrayListOf(new OperateItem[]{new OperateItem(2131238503, 2131842571, 6)});

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final ArrayList<OperateItem> f84718i = CollectionsKt.arrayListOf(new OperateItem[]{new OperateItem(2131238503, 2131842571, 9)});

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final ArrayList<OperateItem> f84719j = CollectionsKt.arrayListOf(new OperateItem[]{new OperateItem(2131238503, 2131842586, 6), new OperateItem(2131238503, 2131842615, 9)});

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final ArrayList<OperateItem> f84720k = CollectionsKt.arrayListOf(new OperateItem[]{new OperateItem(2131238503, 2131842571, 6)});

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final ArrayList<OperateItem> f84721l = CollectionsKt.arrayListOf(new OperateItem[]{new OperateItem(2131238501, 2131842585, 10)});

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final ArrayList<OperateItem> f84722m = CollectionsKt.arrayListOf(new OperateItem[]{new OperateItem(2131238503, 2131842571, 11)});

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final ArrayList<OperateItem> f84723n = CollectionsKt.arrayListOf(new OperateItem[]{new OperateItem(2131238501, 2131842571, 12)});

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public static final ArrayList<OperateItem> f84724o = CollectionsKt.arrayListOf(new OperateItem[]{new OperateItem(2131238501, 2131842571, 13)});

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public RecyclerView f84725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public ArrayList<OperateItem> f84726c = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final b f84727d = new b(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/dialog/PlaylistDetailBottomSheet$a.class */
    public static final class a {
        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.fragment.app.Fragment, com.bilibili.playset.dialog.PlaylistDetailBottomSheet] */
        @NotNull
        public static PlaylistDetailBottomSheet a(int i7) {
            ArrayList<OperateItem> arrayList;
            ?? playlistDetailBottomSheet = new PlaylistDetailBottomSheet();
            Bundle bundle = new Bundle();
            switch (i7) {
                case 0:
                    arrayList = PlaylistDetailBottomSheet.f84717g;
                    break;
                case 1:
                    arrayList = PlaylistDetailBottomSheet.f84715e;
                    break;
                case 2:
                    arrayList = PlaylistDetailBottomSheet.f84716f;
                    break;
                case 3:
                    arrayList = PlaylistDetailBottomSheet.h;
                    break;
                case 4:
                    arrayList = PlaylistDetailBottomSheet.f84720k;
                    break;
                case 5:
                    arrayList = PlaylistDetailBottomSheet.f84719j;
                    break;
                case 6:
                    arrayList = PlaylistDetailBottomSheet.f84718i;
                    break;
                case 7:
                    arrayList = PlaylistDetailBottomSheet.f84721l;
                    break;
                case 8:
                    arrayList = PlaylistDetailBottomSheet.f84722m;
                    break;
                case 9:
                    arrayList = PlaylistDetailBottomSheet.f84723n;
                    break;
                case 10:
                    arrayList = PlaylistDetailBottomSheet.f84724o;
                    break;
                default:
                    arrayList = null;
                    break;
            }
            bundle.putSerializable("itemList", arrayList);
            playlistDetailBottomSheet.setArguments(bundle);
            return playlistDetailBottomSheet;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/dialog/PlaylistDetailBottomSheet$b.class */
    public final class b extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public ArrayList<OperateItem> f84728a = new ArrayList<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public c f84729b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final PlaylistDetailBottomSheet f84730c;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/dialog/PlaylistDetailBottomSheet$b$a.class */
        public final class a extends RecyclerView.ViewHolder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @Nullable
            public ImageView f84731a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @Nullable
            public TextView f84732b;

            public a() {
                throw null;
            }
        }

        public b(PlaylistDetailBottomSheet playlistDetailBottomSheet) {
            this.f84730c = playlistDetailBottomSheet;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.f84728a.size();
        }

        /* JADX WARN: Type inference failed for: r0v12, types: [androidx.fragment.app.Fragment, com.bilibili.playset.dialog.PlaylistDetailBottomSheet] */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(@NotNull final RecyclerView.ViewHolder viewHolder, int i7) {
            Resources resources;
            final OperateItem operateItem = this.f84728a.get(i7);
            if (viewHolder instanceof a) {
                a aVar = (a) viewHolder;
                ImageView imageView = aVar.f84731a;
                final ?? r02 = this.f84730c;
                if (imageView != null) {
                    Context context = r02.getContext();
                    imageView.setImageDrawable((context == null || (resources = context.getResources()) == null) ? null : resources.getDrawable(operateItem.f84712a));
                }
                TextView textView = aVar.f84732b;
                if (textView != null) {
                    Context context2 = r02.getContext();
                    String string = null;
                    if (context2 != null) {
                        Resources resources2 = context2.getResources();
                        string = null;
                        if (resources2 != null) {
                            string = resources2.getString(operateItem.f84713b);
                        }
                    }
                    textView.setText(string);
                }
                viewHolder.itemView.setOnClickListener(new View.OnClickListener(r02, this, viewHolder, operateItem) { // from class: hs0.g

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final PlaylistDetailBottomSheet f121462a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final PlaylistDetailBottomSheet.b f121463b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final RecyclerView.ViewHolder f121464c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final OperateItem f121465d;

                    {
                        this.f121462a = r02;
                        this.f121463b = this;
                        this.f121464c = viewHolder;
                        this.f121465d = operateItem;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        PlaylistDetailBottomSheet playlistDetailBottomSheet = this.f121462a;
                        PlaylistDetailBottomSheet.b bVar = this.f121463b;
                        RecyclerView.ViewHolder viewHolder2 = this.f121464c;
                        OperateItem operateItem2 = this.f121465d;
                        playlistDetailBottomSheet.dismissAllowingStateLoss();
                        PlaylistDetailBottomSheet.c cVar = bVar.f84729b;
                        if (cVar != null) {
                            View view2 = viewHolder2.itemView;
                            cVar.h(operateItem2.f84714c);
                        }
                    }
                });
            }
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, com.bilibili.playset.dialog.PlaylistDetailBottomSheet$b$a] */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public final RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i7) {
            View viewInflate = LayoutInflater.from(this.f84730c.getContext()).inflate(2131499706, viewGroup, false);
            ?? viewHolder = new RecyclerView.ViewHolder(viewInflate);
            viewHolder.f84731a = (ImageView) viewInflate.findViewById(2131302505);
            viewHolder.f84732b = (TextView) viewInflate.findViewById(2131310583);
            return viewHolder;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/dialog/PlaylistDetailBottomSheet$c.class */
    public interface c {
        void h(int i7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(@Nullable Bundle bundle) {
        super/*androidx.fragment.app.DialogFragment*/.onCreate(bundle);
        if (bundle != null) {
            dismissAllowingStateLoss();
            return;
        }
        this.f84726c.clear();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f84726c = arguments.getParcelableArrayList("itemList");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View viewInflate = layoutInflater.inflate(2131499695, viewGroup, false);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        TextView textView = (TextView) viewInflate.findViewById(2131309705);
        if (textView != null) {
            textView.setOnClickListener(new g(this, 5));
        }
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(2131308035);
        this.f84725b = recyclerView;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(linearLayoutManager);
        }
        RecyclerView recyclerView2 = this.f84725b;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.f84727d);
        }
        b bVar = this.f84727d;
        bVar.f84728a = this.f84726c;
        bVar.notifyDataSetChanged();
        this.f84727d.notifyDataSetChanged();
        return viewInflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void show(@NotNull FragmentManager fragmentManager, @Nullable String str) {
        try {
            super/*androidx.fragment.app.DialogFragment*/.show(fragmentManager, str);
        } catch (IllegalStateException e7) {
        }
    }
}
