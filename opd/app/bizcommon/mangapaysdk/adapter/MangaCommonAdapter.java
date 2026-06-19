package com.bilibili.opd.app.bizcommon.mangapaysdk.adapter;

import I.E;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.animation.z;
import androidx.core.content.ContextCompat;
import androidx.core.content.d;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.lib.theme.R$color;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.opd.app.bizcommon.mangapaysdk.adapter.MangaCommonAdapter;
import com.bilibili.opd.app.bizcommon.mangapaysdk.view.MangaPayFragment;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/adapter/MangaCommonAdapter.class */
public final class MangaCommonAdapter extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public MangaPayFragment f74008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public List<b> f74009b = CollectionsKt.emptyList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f74010c = -1;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/adapter/MangaCommonAdapter$MangaRVItemHolderType.class */
    public static final class MangaRVItemHolderType {
        private static final EnumEntries $ENTRIES;
        private static final MangaRVItemHolderType[] $VALUES;
        public static final MangaRVItemHolderType Unknown = new MangaRVItemHolderType("Unknown", 0);
        public static final MangaRVItemHolderType ChargingLevelType = new MangaRVItemHolderType("ChargingLevelType", 1);
        public static final MangaRVItemHolderType MoreLevelType = new MangaRVItemHolderType("MoreLevelType", 2);
        public static final MangaRVItemHolderType BulkLevelSubsequentType = new MangaRVItemHolderType("BulkLevelSubsequentType", 3);

        private static final /* synthetic */ MangaRVItemHolderType[] $values() {
            return new MangaRVItemHolderType[]{Unknown, ChargingLevelType, MoreLevelType, BulkLevelSubsequentType};
        }

        static {
            MangaRVItemHolderType[] mangaRVItemHolderTypeArr$values = $values();
            $VALUES = mangaRVItemHolderTypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(mangaRVItemHolderTypeArr$values);
        }

        private MangaRVItemHolderType(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<MangaRVItemHolderType> getEntries() {
            return $ENTRIES;
        }

        public static MangaRVItemHolderType valueOf(String str) {
            return (MangaRVItemHolderType) Enum.valueOf(MangaRVItemHolderType.class, str);
        }

        public static MangaRVItemHolderType[] values() {
            return (MangaRVItemHolderType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/adapter/MangaCommonAdapter$MangaRVType.class */
    public static final class MangaRVType {
        private static final EnumEntries $ENTRIES;
        private static final MangaRVType[] $VALUES;
        public static final MangaRVType BuyCollectionType = new MangaRVType("BuyCollectionType", 0, "buyCollection");
        public static final MangaRVType PayLevelType = new MangaRVType("PayLevelType", 1, "payLevel");

        @NotNull
        private final String type;

        private static final /* synthetic */ MangaRVType[] $values() {
            return new MangaRVType[]{BuyCollectionType, PayLevelType};
        }

        static {
            MangaRVType[] mangaRVTypeArr$values = $values();
            $VALUES = mangaRVTypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(mangaRVTypeArr$values);
        }

        private MangaRVType(String str, int i7, String str2) {
            this.type = str2;
        }

        @NotNull
        public static EnumEntries<MangaRVType> getEntries() {
            return $ENTRIES;
        }

        public static MangaRVType valueOf(String str) {
            return (MangaRVType) Enum.valueOf(MangaRVType.class, str);
        }

        public static MangaRVType[] values() {
            return (MangaRVType[]) $VALUES.clone();
        }

        @NotNull
        public final String getType() {
            return this.type;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/adapter/MangaCommonAdapter$a.class */
    public final class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final View f74011a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final LinearLayout f74012b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final TextView f74013c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final TextView f74014d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public final TextView f74015e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public final View f74016f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public final TextView f74017g;

        @NotNull
        public MangaRVItemHolderType h;

        /* JADX INFO: renamed from: com.bilibili.opd.app.bizcommon.mangapaysdk.adapter.MangaCommonAdapter$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/adapter/MangaCommonAdapter$a$a.class */
        public static final /* synthetic */ class C0468a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int[] f74018a;

            static {
                int[] iArr = new int[MangaRVItemHolderType.values().length];
                try {
                    iArr[MangaRVItemHolderType.ChargingLevelType.ordinal()] = 1;
                } catch (NoSuchFieldError e7) {
                }
                try {
                    iArr[MangaRVItemHolderType.BulkLevelSubsequentType.ordinal()] = 2;
                } catch (NoSuchFieldError e8) {
                }
                try {
                    iArr[MangaRVItemHolderType.MoreLevelType.ordinal()] = 3;
                } catch (NoSuchFieldError e9) {
                }
                f74018a = iArr;
            }
        }

        public a(@NotNull View view) {
            super(view);
            this.f74011a = view;
            this.f74012b = (LinearLayout) view.findViewById(2131316902);
            this.f74013c = (TextView) view.findViewById(2131316931);
            this.f74014d = (TextView) view.findViewById(2131316927);
            this.f74015e = (TextView) view.findViewById(2131316932);
            this.f74016f = view.findViewById(2131316942);
            this.f74017g = (TextView) view.findViewById(2131316945);
            this.h = MangaRVItemHolderType.Unknown;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/adapter/MangaCommonAdapter$b.class */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f74019a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final MangaRVItemHolderType f74020b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f74021c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final Object f74022d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final String f74023e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final String f74024f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f74025g;

        @NotNull
        public final String h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public final String f74026i;

        public b() {
            this(false, null, 0, null, null, null, false, null, BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKY_RESULT_ROTATE);
        }

        public b(boolean z6, MangaRVItemHolderType mangaRVItemHolderType, int i7, Object obj, String str, String str2, boolean z7, String str3, int i8) {
            z6 = (i8 & 1) != 0 ? false : z6;
            mangaRVItemHolderType = (i8 & 2) != 0 ? MangaRVItemHolderType.Unknown : mangaRVItemHolderType;
            i7 = (i8 & 4) != 0 ? -1 : i7;
            obj = (i8 & 8) != 0 ? null : obj;
            str = (i8 & 16) != 0 ? "" : str;
            str2 = (i8 & 32) != 0 ? "" : str2;
            z7 = (i8 & 64) != 0 ? false : z7;
            str3 = (i8 & 128) != 0 ? "" : str3;
            this.f74019a = z6;
            this.f74020b = mangaRVItemHolderType;
            this.f74021c = i7;
            this.f74022d = obj;
            this.f74023e = str;
            this.f74024f = str2;
            this.f74025g = z7;
            this.h = str3;
            this.f74026i = "";
        }

        public final boolean equals(@Nullable Object obj) {
            Object obj2;
            if (this == obj) {
                return true;
            }
            if (!Intrinsics.areEqual(b.class, obj != null ? obj.getClass() : null)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f74020b == bVar.f74020b && (obj2 = this.f74022d) != null && obj2.equals(bVar.f74022d) && Intrinsics.areEqual(this.f74023e, bVar.f74023e) && Intrinsics.areEqual(this.f74024f, bVar.f74024f) && this.f74025g == bVar.f74025g && Intrinsics.areEqual(this.h, bVar.h) && Intrinsics.areEqual(this.f74026i, bVar.f74026i);
        }

        public final int hashCode() {
            int iHashCode = this.f74020b.hashCode();
            Object obj = this.f74022d;
            return this.f74026i.hashCode() + E.a(z.a(E.a(E.a(((iHashCode * 31) + (obj != null ? obj.hashCode() : 0)) * 31, 31, this.f74023e), 31, this.f74024f), 31, this.f74025g), 31, this.h);
        }

        @NotNull
        public final String toString() {
            StringBuilder sbB = d.b("MangaCommonAdapterData(isSelected=", ", showType=", this.f74019a);
            sbB.append(this.f74020b);
            sbB.append(", showWidth=");
            sbB.append(this.f74021c);
            sbB.append(", raw=");
            sbB.append(this.f74022d);
            sbB.append(", bCoinText=");
            sbB.append(this.f74023e);
            sbB.append(", bCoinContent=");
            sbB.append(this.f74024f);
            sbB.append(", isShowRecommendTag=");
            sbB.append(this.f74025g);
            sbB.append(", subsequentText=");
            sbB.append(this.h);
            sbB.append(", jumpSchema=");
            return C8770a.a(sbB, this.f74026i, ")");
        }
    }

    public static int P(List list) {
        int size = list.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                i7 = -1;
                break;
            }
            if (((b) list.get(i7)).f74019a) {
                break;
            }
            i7++;
        }
        if (i7 < 0) {
            i7 = 0;
        }
        return i7;
    }

    @Nullable
    public final Object N() {
        if (this.f74010c < 0) {
            this.f74010c = P(this.f74009b);
        }
        int size = this.f74009b.size();
        int i7 = this.f74010c;
        if (i7 < 0 || i7 >= size) {
            return null;
        }
        return this.f74009b.get(i7).f74022d;
    }

    public final void O(@Nullable List<b> list) {
        List<b> list2 = list;
        if (list2.isEmpty()) {
            int size = this.f74009b.size();
            this.f74009b = CollectionsKt.emptyList();
            notifyItemRangeRemoved(0, size);
            return;
        }
        if (this.f74010c < 0) {
            this.f74010c = P(list);
        }
        List<b> list3 = this.f74009b;
        if (list.size() == list3.size()) {
            int size2 = list2.size();
            for (int i7 = 0; i7 < size2; i7++) {
                if (Intrinsics.areEqual(list.get(i7), list3.get(i7))) {
                }
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((b) it.next()).f74019a = false;
            }
            list.get(this.f74010c).f74019a = true;
            this.f74009b = list;
            notifyItemRangeChanged(0, list.size());
            return;
        }
        this.f74009b = list;
        int size3 = list.size() - this.f74009b.size();
        int iP = P(list);
        this.f74010c = iP;
        list.get(iP).f74019a = true;
        if (size3 < 0) {
            notifyItemRangeRemoved(list.size(), size3);
            notifyItemRangeChanged(0, list.size());
        } else if (size3 == 0) {
            notifyItemRangeChanged(0, list.size());
        } else {
            notifyItemRangeInserted(this.f74009b.size(), size3);
            notifyItemRangeChanged(0, this.f74009b.size());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f74009b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        final a aVar = (a) viewHolder;
        if (i7 < 0 || i7 >= this.f74009b.size()) {
            return;
        }
        final b bVar = this.f74009b.get(i7);
        if (bVar.f74019a) {
            aVar.f74011a.setBackground(ContextCompat.getDrawable(aVar.itemView.getContext(), 2131241754));
            TextView textView = aVar.f74013c;
            if (textView != null) {
                textView.setTextColor(ContextCompat.getColor(aVar.itemView.getContext(), R$color.Pi5));
            }
            TextView textView2 = aVar.f74014d;
            if (textView2 != null) {
                textView2.setTextColor(ContextCompat.getColor(aVar.itemView.getContext(), R$color.Pi5));
            }
            TextView textView3 = aVar.f74015e;
            if (textView3 != null) {
                textView3.setTextColor(ContextCompat.getColor(aVar.itemView.getContext(), R$color.Pi5));
            }
            TextView textView4 = aVar.f74017g;
            if (textView4 != null) {
                textView4.setTextColor(ContextCompat.getColor(aVar.itemView.getContext(), R$color.Pi5));
            }
            Drawable drawable = ContextCompat.getDrawable(aVar.itemView.getContext(), 2131241753);
            if (drawable != null) {
                drawable.setTint(ContextCompat.getColor(aVar.itemView.getContext(), R$color.Pi5));
            }
            View view = aVar.f74016f;
            if (view != null) {
                view.setBackground(drawable);
            }
        } else {
            aVar.f74011a.setBackground(ContextCompat.getDrawable(aVar.itemView.getContext(), 2131241749));
            TextView textView5 = aVar.f74013c;
            if (textView5 != null) {
                textView5.setTextColor(ContextCompat.getColor(aVar.itemView.getContext(), R$color.Ga5));
            }
            TextView textView6 = aVar.f74014d;
            if (textView6 != null) {
                textView6.setTextColor(ContextCompat.getColor(aVar.itemView.getContext(), R$color.Ga5));
            }
            TextView textView7 = aVar.f74015e;
            if (textView7 != null) {
                textView7.setTextColor(ContextCompat.getColor(aVar.itemView.getContext(), R$color.Ga5));
            }
            TextView textView8 = aVar.f74017g;
            if (textView8 != null) {
                textView8.setTextColor(ContextCompat.getColor(aVar.itemView.getContext(), R$color.Ga5));
            }
            Drawable drawable2 = ContextCompat.getDrawable(aVar.itemView.getContext(), 2131241753);
            if (drawable2 != null) {
                drawable2.setTint(ContextCompat.getColor(aVar.itemView.getContext(), R$color.Ga3));
            }
            View view2 = aVar.f74016f;
            if (view2 != null) {
                view2.setBackground(drawable2);
            }
        }
        MangaRVItemHolderType mangaRVItemHolderType = bVar.f74020b;
        aVar.h = mangaRVItemHolderType;
        int i8 = a.C0468a.f74018a[mangaRVItemHolderType.ordinal()];
        int i9 = 8;
        if (i8 == 1) {
            LinearLayout linearLayout = aVar.f74012b;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            TextView textView9 = aVar.f74015e;
            if (textView9 != null) {
                textView9.setVisibility(0);
            }
            TextView textView10 = aVar.f74017g;
            if (textView10 != null) {
                textView10.setVisibility(8);
            }
        } else if (i8 == 2 || i8 == 3) {
            LinearLayout linearLayout2 = aVar.f74012b;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
            }
            TextView textView11 = aVar.f74015e;
            if (textView11 != null) {
                textView11.setVisibility(8);
            }
            TextView textView12 = aVar.f74017g;
            if (textView12 != null) {
                textView12.setVisibility(0);
            }
        } else {
            aVar.f74011a.setVisibility(8);
            LinearLayout linearLayout3 = aVar.f74012b;
            if (linearLayout3 != null) {
                linearLayout3.setVisibility(8);
            }
            TextView textView13 = aVar.f74015e;
            if (textView13 != null) {
                textView13.setVisibility(8);
            }
            TextView textView14 = aVar.f74017g;
            if (textView14 != null) {
                textView14.setVisibility(8);
            }
            BLog.d("MangaCommonAdapter", "InChargeLevelHolder switchLayoutTo..... Unknown????? type: " + mangaRVItemHolderType);
        }
        TextView textView15 = aVar.f74017g;
        if (textView15 != null) {
            textView15.setText(bVar.h);
        }
        TextView textView16 = aVar.f74013c;
        if (textView16 != null) {
            textView16.setText(bVar.f74023e);
        }
        TextView textView17 = aVar.f74015e;
        if (textView17 != null) {
            textView17.setText(bVar.f74024f);
        }
        int i10 = bVar.f74021c;
        if (i10 > 0) {
            ViewGroup.LayoutParams layoutParams = aVar.f74011a.getLayoutParams();
            layoutParams.width = i10;
            aVar.f74011a.setLayoutParams(layoutParams);
        }
        View view3 = aVar.f74016f;
        if (view3 != null) {
            if (bVar.f74025g) {
                i9 = 0;
            }
            view3.setVisibility(i9);
        }
        aVar.itemView.setOnClickListener(new View.OnClickListener(this, aVar, bVar) { // from class: Wm0.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MangaCommonAdapter f26927a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final MangaCommonAdapter.a f26928b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final MangaCommonAdapter.b f26929c;

            {
                this.f26927a = this;
                this.f26928b = aVar;
                this.f26929c = bVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                MangaCommonAdapter mangaCommonAdapter = this.f26927a;
                MangaCommonAdapter.a aVar2 = this.f26928b;
                MangaCommonAdapter.b bVar2 = this.f26929c;
                MangaPayFragment mangaPayFragment = mangaCommonAdapter.f74008a;
                if (mangaPayFragment != null) {
                    mangaPayFragment.yf(aVar2.getBindingAdapterPosition(), bVar2);
                }
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        return new a(p.a(viewGroup, 2131500912, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        a aVar = (a) viewHolder;
        super.onViewAttachedToWindow(aVar);
        MangaPayFragment mangaPayFragment = this.f74008a;
        if (mangaPayFragment != null && aVar.h == MangaRVItemHolderType.MoreLevelType && mangaPayFragment.f74097V) {
            mangaPayFragment.f74097V = false;
            mangaPayFragment.pf().l(MangaPayFragment.nf(mangaPayFragment, null, true, true, true, 1));
        }
    }
}
