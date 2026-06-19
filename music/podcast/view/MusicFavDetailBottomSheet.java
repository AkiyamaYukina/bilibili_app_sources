package com.bilibili.music.podcast.view;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.music.podcast.view.MusicFavDetailBottomSheet;
import com.bilibili.playset.dialog.OperateItem;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/MusicFavDetailBottomSheet.class */
public final class MusicFavDetailBottomSheet extends BottomSheetDialogFragment {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final ArrayList<OperateItem> f67085e = CollectionsKt.arrayListOf(new OperateItem[]{new OperateItem(2131238503, 2131842571, 6)});

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public RecyclerView f67086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public ArrayList<OperateItem> f67087c = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final a f67088d = new a(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/MusicFavDetailBottomSheet$a.class */
    public final class a extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public ArrayList<OperateItem> f67089a = new ArrayList<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public b f67090b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final MusicFavDetailBottomSheet f67091c;

        /* JADX INFO: renamed from: com.bilibili.music.podcast.view.MusicFavDetailBottomSheet$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/MusicFavDetailBottomSheet$a$a.class */
        public final class C0386a extends RecyclerView.ViewHolder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @Nullable
            public ImageView f67092a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @Nullable
            public TextView f67093b;

            public C0386a() {
                throw null;
            }
        }

        public a(MusicFavDetailBottomSheet musicFavDetailBottomSheet) {
            this.f67091c = musicFavDetailBottomSheet;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.f67089a.size();
        }

        /* JADX WARN: Type inference failed for: r0v12, types: [androidx.fragment.app.Fragment, com.bilibili.music.podcast.view.MusicFavDetailBottomSheet] */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(@NotNull final RecyclerView.ViewHolder viewHolder, int i7) {
            Resources resources;
            final OperateItem operateItem = this.f67089a.get(i7);
            if (viewHolder instanceof C0386a) {
                C0386a c0386a = (C0386a) viewHolder;
                ImageView imageView = c0386a.f67092a;
                final ?? r02 = this.f67091c;
                if (imageView != null) {
                    Context context = r02.getContext();
                    imageView.setImageDrawable((context == null || (resources = context.getResources()) == null) ? null : resources.getDrawable(operateItem.f84712a));
                }
                TextView textView = c0386a.f67093b;
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
                viewHolder.itemView.setOnClickListener(new View.OnClickListener(r02, this, viewHolder, operateItem) { // from class: com.bilibili.music.podcast.view.h

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final MusicFavDetailBottomSheet f67237a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final MusicFavDetailBottomSheet.a f67238b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final RecyclerView.ViewHolder f67239c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final OperateItem f67240d;

                    {
                        this.f67237a = r02;
                        this.f67238b = this;
                        this.f67239c = viewHolder;
                        this.f67240d = operateItem;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MusicFavDetailBottomSheet musicFavDetailBottomSheet = this.f67237a;
                        MusicFavDetailBottomSheet.a aVar = this.f67238b;
                        RecyclerView.ViewHolder viewHolder2 = this.f67239c;
                        OperateItem operateItem2 = this.f67240d;
                        musicFavDetailBottomSheet.dismissAllowingStateLoss();
                        MusicFavDetailBottomSheet.b bVar = aVar.f67090b;
                        if (bVar != null) {
                            View view2 = viewHolder2.itemView;
                            bVar.h(operateItem2.f84714c);
                        }
                    }
                });
            }
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, com.bilibili.music.podcast.view.MusicFavDetailBottomSheet$a$a] */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public final RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i7) {
            View viewInflate = LayoutInflater.from(this.f67091c.getContext()).inflate(2131499706, viewGroup, false);
            ?? viewHolder = new RecyclerView.ViewHolder(viewInflate);
            viewHolder.f67092a = (ImageView) viewInflate.findViewById(2131302505);
            viewHolder.f67093b = (TextView) viewInflate.findViewById(2131310583);
            return viewHolder;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/MusicFavDetailBottomSheet$b.class */
    public interface b {
        void h(int i7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(@Nullable Bundle bundle) {
        super/*androidx.fragment.app.DialogFragment*/.onCreate(bundle);
        this.f67087c.clear();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f67087c = arguments.getParcelableArrayList("upperCardDetailList");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View viewInflate = layoutInflater.inflate(2131499695, viewGroup, false);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        TextView textView = (TextView) viewInflate.findViewById(2131309705);
        if (textView != null) {
            textView.setOnClickListener(new IS.b(this, 2));
        }
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(2131308035);
        this.f67086b = recyclerView;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(linearLayoutManager);
        }
        RecyclerView recyclerView2 = this.f67086b;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.f67088d);
        }
        a aVar = this.f67088d;
        aVar.f67089a = this.f67087c;
        aVar.notifyDataSetChanged();
        this.f67088d.notifyDataSetChanged();
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
