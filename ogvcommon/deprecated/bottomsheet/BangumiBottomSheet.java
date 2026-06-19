package com.bilibili.ogvcommon.deprecated.bottomsheet;

import I.E;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.magicasakura.widgets.TintImageView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/deprecated/bottomsheet/BangumiBottomSheet.class */
@Deprecated(message = "Legacy tool")
@StabilityInferred(parameters = 0)
public final class BangumiBottomSheet extends BottomSheetDialogFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public RecyclerView f73179b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f73182e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public b f73184g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public ArrayList<SheetItem> f73180c = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final a f73181d = new a(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f73183f = -1;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/deprecated/bottomsheet/BangumiBottomSheet$SheetItem.class */
    @StabilityInferred(parameters = 0)
    @Parcelize
    public static final class SheetItem implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<SheetItem> CREATOR = new Object();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f73185a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f73186b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f73187c;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/deprecated/bottomsheet/BangumiBottomSheet$SheetItem$a.class */
        public static final class a implements Parcelable.Creator<SheetItem> {
            @Override // android.os.Parcelable.Creator
            public final SheetItem createFromParcel(Parcel parcel) {
                return new SheetItem(parcel.readInt(), parcel.readString(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final SheetItem[] newArray(int i7) {
                return new SheetItem[i7];
            }
        }

        @JvmOverloads
        public SheetItem(int i7, @NotNull String str, int i8) {
            this.f73185a = i7;
            this.f73186b = str;
            this.f73187c = i8;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SheetItem)) {
                return false;
            }
            SheetItem sheetItem = (SheetItem) obj;
            return this.f73185a == sheetItem.f73185a && Intrinsics.areEqual(this.f73186b, sheetItem.f73186b) && this.f73187c == sheetItem.f73187c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f73187c) + E.a(Integer.hashCode(this.f73185a) * 31, 31, this.f73186b);
        }

        @NotNull
        public final String toString() {
            return C4277b.a(this.f73187c, ")", bilibili.live.app.service.resolver.a.b(this.f73185a, "SheetItem(id=", ", text=", this.f73186b, ", resId="));
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i7) {
            parcel.writeInt(this.f73185a);
            parcel.writeString(this.f73186b);
            parcel.writeInt(this.f73187c);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/deprecated/bottomsheet/BangumiBottomSheet$a.class */
    public final class a extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public List<SheetItem> f73188a = CollectionsKt.emptyList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public b f73189b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public Integer f73190c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final BangumiBottomSheet f73191d;

        /* JADX INFO: renamed from: com.bilibili.ogvcommon.deprecated.bottomsheet.BangumiBottomSheet$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/deprecated/bottomsheet/BangumiBottomSheet$a$a.class */
        public final class C0462a extends RecyclerView.ViewHolder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public TintImageView f73192a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public TextView f73193b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @NotNull
            public ImageView f73194c;

            public C0462a() {
                throw null;
            }
        }

        public a(BangumiBottomSheet bangumiBottomSheet) {
            this.f73191d = bangumiBottomSheet;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.f73188a.size();
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x009d  */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onBindViewHolder(@org.jetbrains.annotations.NotNull final androidx.recyclerview.widget.RecyclerView.ViewHolder r9, int r10) {
            /*
                r8 = this;
                r0 = r8
                java.util.List<com.bilibili.ogvcommon.deprecated.bottomsheet.BangumiBottomSheet$SheetItem> r0 = r0.f73188a
                r1 = r10
                java.lang.Object r0 = r0.get(r1)
                com.bilibili.ogvcommon.deprecated.bottomsheet.BangumiBottomSheet$SheetItem r0 = (com.bilibili.ogvcommon.deprecated.bottomsheet.BangumiBottomSheet.SheetItem) r0
                r12 = r0
                r0 = r9
                boolean r0 = r0 instanceof com.bilibili.ogvcommon.deprecated.bottomsheet.BangumiBottomSheet.a.C0462a
                if (r0 == 0) goto Lba
                r0 = r9
                com.bilibili.ogvcommon.deprecated.bottomsheet.BangumiBottomSheet$a$a r0 = (com.bilibili.ogvcommon.deprecated.bottomsheet.BangumiBottomSheet.a.C0462a) r0
                r11 = r0
                r0 = r11
                android.widget.TextView r0 = r0.f73193b
                r1 = r12
                java.lang.String r1 = r1.f73186b
                r0.setText(r1)
                r0 = r12
                int r0 = r0.f73187c
                if (r0 <= 0) goto L57
                r0 = r11
                com.bilibili.magicasakura.widgets.TintImageView r0 = r0.f73192a
                r1 = 0
                r0.setVisibility(r1)
                r0 = r11
                com.bilibili.magicasakura.widgets.TintImageView r0 = r0.f73192a
                r1 = r12
                int r1 = r1.f73187c
                r0.setImageResource(r1)
                r0 = r11
                com.bilibili.magicasakura.widgets.TintImageView r0 = r0.f73192a
                int r1 = com.bilibili.lib.theme.R$color.Pi5
                r0.setImageTintList(r1)
                r0 = r11
                com.bilibili.magicasakura.widgets.TintImageView r0 = r0.f73192a
                r0.tint()
                goto L67
            L57:
                r0 = r11
                com.bilibili.magicasakura.widgets.TintImageView r0 = r0.f73192a
                r1 = 8
                r0.setVisibility(r1)
                r0 = r11
                com.bilibili.magicasakura.widgets.TintImageView r0 = r0.f73192a
                r0.tint()
            L67:
                r0 = r8
                com.bilibili.ogvcommon.deprecated.bottomsheet.BangumiBottomSheet r0 = r0.f73191d
                r13 = r0
                r0 = r13
                boolean r0 = r0.f73182e
                if (r0 == 0) goto L9d
                r0 = r8
                java.lang.Integer r0 = r0.f73190c
                r14 = r0
                r0 = r12
                int r0 = r0.f73185a
                r10 = r0
                r0 = r14
                if (r0 != 0) goto L89
                goto L9d
            L89:
                r0 = r14
                int r0 = r0.intValue()
                r1 = r10
                if (r0 != r1) goto L9d
                r0 = r11
                android.widget.ImageView r0 = r0.f73194c
                r1 = 0
                r0.setVisibility(r1)
                goto La6
            L9d:
                r0 = r11
                android.widget.ImageView r0 = r0.f73194c
                r1 = 8
                r0.setVisibility(r1)
            La6:
                r0 = r9
                android.view.View r0 = r0.itemView
                Ol0.b r1 = new Ol0.b
                r2 = r1
                r3 = r13
                r4 = r8
                r5 = r12
                r6 = r9
                r2.<init>(r3, r4, r5, r6)
                r0.setOnClickListener(r1)
            Lba:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogvcommon.deprecated.bottomsheet.BangumiBottomSheet.a.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, com.bilibili.ogvcommon.deprecated.bottomsheet.BangumiBottomSheet$a$a] */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public final RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i7) {
            View viewInflate = LayoutInflater.from(this.f73191d.getContext()).inflate(2131499582, viewGroup, false);
            ?? viewHolder = new RecyclerView.ViewHolder(viewInflate);
            viewHolder.f73192a = (TintImageView) viewInflate.findViewById(2131302505);
            viewHolder.f73193b = (TextView) viewInflate.findViewById(2131310583);
            viewHolder.f73194c = (ImageView) viewInflate.findViewById(2131304393);
            return viewHolder;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/deprecated/bottomsheet/BangumiBottomSheet$b.class */
    public interface b {
        void a(int i7, @NotNull View view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(@Nullable Bundle bundle) {
        super/*androidx.fragment.app.DialogFragment*/.onCreate(bundle);
        this.f73180c.clear();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f73180c = arguments.getParcelableArrayList("sheet_item_list");
            this.f73182e = arguments.getBoolean("sheet_item_show_check_icon");
            this.f73183f = arguments.getInt("sheet_item_show_current_sheet_item_id", -1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        BottomSheetBehavior behavior;
        View viewInflate = layoutInflater.inflate(2131499581, viewGroup, false);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        BottomSheetDialog dialog = getDialog();
        BottomSheetDialog bottomSheetDialog = dialog instanceof BottomSheetDialog ? dialog : null;
        if (bottomSheetDialog != null && (behavior = bottomSheetDialog.getBehavior()) != null) {
            behavior.setState(3);
        }
        TextView textView = (TextView) viewInflate.findViewById(2131309705);
        if (textView != null) {
            textView.setOnClickListener(new Ol0.a(0, this));
        }
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(2131308035);
        this.f73179b = recyclerView;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(linearLayoutManager);
        }
        RecyclerView recyclerView2 = this.f73179b;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.f73181d);
        }
        a aVar = this.f73181d;
        aVar.f73188a = this.f73180c;
        aVar.notifyDataSetChanged();
        a aVar2 = this.f73181d;
        aVar2.f73190c = Integer.valueOf(this.f73183f);
        aVar2.notifyDataSetChanged();
        a aVar3 = this.f73181d;
        aVar3.f73189b = this.f73184g;
        aVar3.notifyDataSetChanged();
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
