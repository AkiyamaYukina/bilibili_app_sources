package com.bilibili.playset.dialog;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.lib.theme.R$color;
import com.bilibili.playset.dialog.CheckInBottomSheet;
import com.bilibili.playset.dialog.OperateItem;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/dialog/CheckInBottomSheet.class */
@StabilityInferred(parameters = 0)
public final class CheckInBottomSheet extends BottomSheetDialogFragment {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final ArrayList<OperateItem> f84701g = CollectionsKt.arrayListOf(new OperateItem[]{new OperateItem(-1, 2131842601, 14), new OperateItem(-1, 2131842486, 15), new OperateItem(-1, 2131842632, 16)});

    @NotNull
    public static final ArrayList<OperateItem> h = CollectionsKt.arrayListOf(new OperateItem[]{new OperateItem(-1, 2131842486, 15), new OperateItem(-1, 2131842584, 17)});

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public RecyclerView f84702b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public b f84705e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public ArrayList<OperateItem> f84703c = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final a f84704d = new a(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f84706f = true;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/dialog/CheckInBottomSheet$a.class */
    public final class a extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public b f84708b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final CheckInBottomSheet f84710d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public ArrayList<OperateItem> f84707a = new ArrayList<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f84709c = true;

        /* JADX INFO: renamed from: com.bilibili.playset.dialog.CheckInBottomSheet$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/dialog/CheckInBottomSheet$a$a.class */
        public final class C0569a extends RecyclerView.ViewHolder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @Nullable
            public TextView f84711a;

            public C0569a() {
                throw null;
            }
        }

        public a(CheckInBottomSheet checkInBottomSheet) {
            this.f84710d = checkInBottomSheet;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.f84707a.size();
        }

        /* JADX WARN: Type inference failed for: r0v11, types: [androidx.fragment.app.Fragment, com.bilibili.playset.dialog.CheckInBottomSheet] */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(@NotNull final RecyclerView.ViewHolder viewHolder, int i7) {
            Resources resources;
            final OperateItem operateItem = this.f84707a.get(i7);
            if (viewHolder instanceof C0569a) {
                C0569a c0569a = (C0569a) viewHolder;
                TextView textView = c0569a.f84711a;
                final ?? r02 = this.f84710d;
                if (textView != null) {
                    Context context = r02.getContext();
                    textView.setText((context == null || (resources = context.getResources()) == null) ? null : resources.getString(operateItem.f84713b));
                }
                if (this.f84709c || operateItem.f84714c != 16) {
                    TextView textView2 = c0569a.f84711a;
                    if (textView2 != null) {
                        textView2.setTextColor(ContextCompat.getColor(viewHolder.itemView.getContext(), R$color.Ga10));
                    }
                } else {
                    TextView textView3 = c0569a.f84711a;
                    if (textView3 != null) {
                        textView3.setTextColor(ContextCompat.getColor(viewHolder.itemView.getContext(), R$color.Ga4));
                    }
                }
                viewHolder.itemView.setOnClickListener(new View.OnClickListener(r02, this, viewHolder, operateItem) { // from class: hs0.a

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final CheckInBottomSheet f121419a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final CheckInBottomSheet.a f121420b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final RecyclerView.ViewHolder f121421c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final OperateItem f121422d;

                    {
                        this.f121419a = r02;
                        this.f121420b = this;
                        this.f121421c = viewHolder;
                        this.f121422d = operateItem;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        CheckInBottomSheet checkInBottomSheet = this.f121419a;
                        CheckInBottomSheet.a aVar = this.f121420b;
                        RecyclerView.ViewHolder viewHolder2 = this.f121421c;
                        OperateItem operateItem2 = this.f121422d;
                        checkInBottomSheet.dismissAllowingStateLoss();
                        CheckInBottomSheet.b bVar = aVar.f84708b;
                        if (bVar != null) {
                            View view2 = viewHolder2.itemView;
                            bVar.h(operateItem2.f84714c);
                        }
                    }
                });
            }
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, com.bilibili.playset.dialog.CheckInBottomSheet$a$a] */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public final RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i7) {
            View viewInflate = LayoutInflater.from(this.f84710d.getContext()).inflate(2131499704, viewGroup, false);
            ?? viewHolder = new RecyclerView.ViewHolder(viewInflate);
            viewHolder.f84711a = (TextView) viewInflate.findViewById(2131310583);
            return viewHolder;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/dialog/CheckInBottomSheet$b.class */
    public interface b {
        void h(int i7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(@Nullable Bundle bundle) {
        super/*androidx.fragment.app.DialogFragment*/.onCreate(bundle);
        this.f84703c.clear();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f84703c = arguments.getParcelableArrayList("itemList");
            boolean z6 = true;
            if (arguments.getInt("canCancel") != 1) {
                z6 = false;
            }
            this.f84706f = z6;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View viewInflate = layoutInflater.inflate(2131499695, viewGroup, false);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        TextView textView = (TextView) viewInflate.findViewById(2131309705);
        if (textView != null) {
            textView.setOnClickListener(new Ug.a(this, 4));
        }
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(2131308035);
        this.f84702b = recyclerView;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(linearLayoutManager);
        }
        RecyclerView recyclerView2 = this.f84702b;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.f84704d);
        }
        a aVar = this.f84704d;
        ArrayList<OperateItem> arrayList = this.f84703c;
        boolean z6 = this.f84706f;
        aVar.f84707a = arrayList;
        aVar.f84709c = z6;
        aVar.notifyDataSetChanged();
        this.f84704d.notifyDataSetChanged();
        return viewInflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super/*androidx.fragment.app.Fragment*/.onViewCreated(view, bundle);
        if (bundle != null) {
            dismiss();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void show(@NotNull FragmentManager fragmentManager, @Nullable String str) {
        try {
            super/*androidx.fragment.app.DialogFragment*/.show(fragmentManager, str);
        } catch (IllegalStateException e7) {
        }
    }
}
