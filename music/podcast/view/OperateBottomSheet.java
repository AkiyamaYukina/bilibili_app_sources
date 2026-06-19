package com.bilibili.music.podcast.view;

import Vn.A;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.animation.core.I;
import androidx.compose.runtime.C4277b;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bF0.AbstractC4957a3;
import com.bapis.bilibili.app.listener.v1.MenuDeleteReq;
import com.bapis.bilibili.app.listener.v1.MenuSubscribeReq;
import com.bapis.bilibili.app.listener.v1.MusicMoss;
import com.bilibili.base.SharedPreferencesHelper;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.MutableBundleLike;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.moss.api.CallOptions;
import com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment;
import com.bilibili.music.podcast.data.MainFavMusicMenu;
import com.bilibili.music.podcast.fragment.MainFavMenuFragment;
import com.bilibili.music.podcast.view.OperateBottomSheet;
import com.bilibili.upper.module.contribute.picker.v3.fragment.AlbumCurrentFragment;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import gi0.C7334o;
import gi0.C7335p;
import gi0.C7336q;
import gi0.C7338s;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mi0.InterfaceC8001b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/OperateBottomSheet.class */
public final class OperateBottomSheet extends BottomSheetDialogFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public RecyclerView f67156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public ArrayList<OperateItem> f67157c = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final a f67158d = new a(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/OperateBottomSheet$OperateItem.class */
    public static final class OperateItem implements Parcelable {

        @NotNull
        public static final a CREATOR = new Object();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f67159a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f67160b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f67161c;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/OperateBottomSheet$OperateItem$a.class */
        public static final class a implements Parcelable.Creator<OperateItem> {
            @Override // android.os.Parcelable.Creator
            public final OperateItem createFromParcel(Parcel parcel) {
                return new OperateItem(parcel.readInt(), parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final OperateItem[] newArray(int i7) {
                return new OperateItem[i7];
            }
        }

        public OperateItem(int i7, int i8, int i9) {
            this.f67159a = i7;
            this.f67160b = i8;
            this.f67161c = i9;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OperateItem)) {
                return false;
            }
            OperateItem operateItem = (OperateItem) obj;
            return this.f67159a == operateItem.f67159a && this.f67160b == operateItem.f67160b && this.f67161c == operateItem.f67161c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f67161c) + I.a(this.f67160b, Integer.hashCode(this.f67159a) * 31, 31);
        }

        @NotNull
        public final String toString() {
            return C4277b.a(this.f67161c, ")", A.b(this.f67159a, this.f67160b, "OperateItem(resId=", ", textId=", ", command="));
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i7) {
            parcel.writeInt(this.f67159a);
            parcel.writeInt(this.f67160b);
            parcel.writeInt(this.f67161c);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/OperateBottomSheet$a.class */
    public final class a extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public ArrayList<OperateItem> f67162a = new ArrayList<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public C7338s f67163b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final OperateBottomSheet f67164c;

        /* JADX INFO: renamed from: com.bilibili.music.podcast.view.OperateBottomSheet$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/OperateBottomSheet$a$a.class */
        public final class C0387a extends RecyclerView.ViewHolder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @Nullable
            public ImageView f67165a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @Nullable
            public TextView f67166b;

            public C0387a() {
                throw null;
            }
        }

        public a(OperateBottomSheet operateBottomSheet) {
            this.f67164c = operateBottomSheet;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.f67162a.size();
        }

        /* JADX WARN: Type inference failed for: r0v12, types: [androidx.fragment.app.Fragment, com.bilibili.music.podcast.view.OperateBottomSheet] */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(@NotNull final RecyclerView.ViewHolder viewHolder, int i7) {
            Resources resources;
            final OperateItem operateItem = this.f67162a.get(i7);
            if (viewHolder instanceof C0387a) {
                C0387a c0387a = (C0387a) viewHolder;
                ImageView imageView = c0387a.f67165a;
                final ?? r02 = this.f67164c;
                if (imageView != null) {
                    Context context = r02.getContext();
                    imageView.setImageDrawable((context == null || (resources = context.getResources()) == null) ? null : resources.getDrawable(operateItem.f67159a));
                }
                TextView textView = c0387a.f67166b;
                if (textView != null) {
                    Context context2 = r02.getContext();
                    String string = null;
                    if (context2 != null) {
                        Resources resources2 = context2.getResources();
                        string = null;
                        if (resources2 != null) {
                            string = resources2.getString(operateItem.f67160b);
                        }
                    }
                    textView.setText(string);
                }
                viewHolder.itemView.setOnClickListener(new View.OnClickListener(r02, this, viewHolder, operateItem) { // from class: com.bilibili.music.podcast.view.w

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final OperateBottomSheet f67330a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final OperateBottomSheet.a f67331b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final RecyclerView.ViewHolder f67332c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final OperateBottomSheet.OperateItem f67333d;

                    {
                        this.f67330a = r02;
                        this.f67331b = this;
                        this.f67332c = viewHolder;
                        this.f67333d = operateItem;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        OperateBottomSheet operateBottomSheet = this.f67330a;
                        OperateBottomSheet.a aVar = this.f67331b;
                        RecyclerView.ViewHolder viewHolder2 = this.f67332c;
                        OperateBottomSheet.OperateItem operateItem2 = this.f67333d;
                        operateBottomSheet.dismissAllowingStateLoss();
                        C7338s c7338s = aVar.f67163b;
                        if (c7338s != null) {
                            View view2 = viewHolder2.itemView;
                            int i8 = operateItem2.f67161c;
                            InterfaceC8001b interfaceC8001b = c7338s.f120354b;
                            C7334o c7334o = c7338s.f120353a;
                            if (i8 == 1) {
                                MainFavMusicMenu mainFavMusicMenu = (MainFavMusicMenu) interfaceC8001b;
                                MainFavMenuFragment mainFavMenuFragment = c7334o.f120328c;
                                if (mainFavMenuFragment != null) {
                                    long id = mainFavMusicMenu.getId();
                                    String title = mainFavMusicMenu.getTitle();
                                    if (title == null) {
                                        title = "";
                                    }
                                    String desc = mainFavMusicMenu.getDesc();
                                    if (desc == null) {
                                        desc = "";
                                    }
                                    BLRouter.routeTo(new RouteRequest.Builder("bilibili://music/menu/edit").extras(new Function1(id, title, desc, mainFavMusicMenu.isPublic(), mainFavMusicMenu.isDefault()) { // from class: Qi0.e

                                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                                        public final long f19956a;

                                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                                        public final String f19957b;

                                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                                        public final String f19958c;

                                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                                        public final boolean f19959d;

                                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                                        public final boolean f19960e;

                                        {
                                            this.f19956a = id;
                                            this.f19957b = title;
                                            this.f19958c = desc;
                                            this.f19959d = z;
                                            this.f19960e = z;
                                        }

                                        public final Object invoke(Object obj) {
                                            MutableBundleLike mutableBundleLike = (MutableBundleLike) obj;
                                            mutableBundleLike.put("key_menu_id", String.valueOf(this.f19956a));
                                            mutableBundleLike.put("key_name", this.f19957b);
                                            mutableBundleLike.put("key_desc", this.f19958c);
                                            mutableBundleLike.put("key_is_public", String.valueOf(this.f19959d));
                                            mutableBundleLike.put("key_is_default", String.valueOf(this.f19960e));
                                            return Unit.INSTANCE;
                                        }
                                    }).requestCode(42).build(), mainFavMenuFragment);
                                    return;
                                }
                                return;
                            }
                            if (i8 == 2) {
                                MainFavMusicMenu mainFavMusicMenu2 = (MainFavMusicMenu) interfaceC8001b;
                                c7334o.getClass();
                                long id2 = mainFavMusicMenu2.getId();
                                C7335p c7335p = new C7335p(c7334o, mainFavMusicMenu2);
                                new MusicMoss((String) null, 0, (CallOptions) null, 7, (DefaultConstructorMarker) null).menuDelete(MenuDeleteReq.newBuilder().setId(id2).build(), new com.bilibili.music.podcast.moss.d(c7335p, c7335p));
                                return;
                            }
                            if (i8 != 3) {
                                return;
                            }
                            MainFavMusicMenu mainFavMusicMenu3 = (MainFavMusicMenu) interfaceC8001b;
                            c7334o.getClass();
                            MenuSubscribeReq.SubscribeAction subscribeAction = MenuSubscribeReq.SubscribeAction.DEL;
                            long id3 = mainFavMusicMenu3.getId();
                            C7336q c7336q = new C7336q(c7334o, mainFavMusicMenu3);
                            new MusicMoss((String) null, 0, (CallOptions) null, 7, (DefaultConstructorMarker) null).menuSubscribe(MenuSubscribeReq.newBuilder().setAction(subscribeAction).setTargetId(id3).build(), new com.bilibili.music.podcast.moss.d(c7336q, c7336q));
                        }
                    }
                });
            }
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, com.bilibili.music.podcast.view.OperateBottomSheet$a$a] */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public final RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i7) {
            View viewInflate = LayoutInflater.from(this.f67164c.getContext()).inflate(2131499532, viewGroup, false);
            ?? viewHolder = new RecyclerView.ViewHolder(viewInflate);
            viewHolder.f67165a = (ImageView) viewInflate.findViewById(2131302505);
            viewHolder.f67166b = (TextView) viewInflate.findViewById(2131310583);
            return viewHolder;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(@Nullable Bundle bundle) {
        ArrayList<OperateItem> parcelableArrayList;
        super/*androidx.fragment.app.DialogFragment*/.onCreate(bundle);
        this.f67157c.clear();
        Bundle arguments = getArguments();
        if (arguments == null || (parcelableArrayList = arguments.getParcelableArrayList("item_list")) == null) {
            return;
        }
        this.f67157c = parcelableArrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View viewInflate = layoutInflater.inflate(2131499518, viewGroup, false);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        TextView textView = (TextView) viewInflate.findViewById(2131309705);
        if (textView != null) {
            final int i7 = 0;
            textView.setOnClickListener(new View.OnClickListener(i7, this) { // from class: com.bilibili.music.podcast.view.v

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f67328a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final androidx_fragment_app_Fragment f67329b;

                {
                    this.f67328a = i7;
                    this.f67329b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (this.f67328a) {
                        case 0:
                            ((OperateBottomSheet) this.f67329b).dismiss();
                            break;
                        default:
                            AlbumCurrentFragment albumCurrentFragment = this.f67329b;
                            AbstractC4957a3 abstractC4957a3 = albumCurrentFragment.h;
                            AbstractC4957a3 abstractC4957a32 = abstractC4957a3;
                            if (abstractC4957a3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                abstractC4957a32 = null;
                            }
                            abstractC4957a32.f55359A.setVisibility(8);
                            new SharedPreferencesHelper(albumCurrentFragment.getApplicationContext()).setBoolean("display_submission_tip1", false);
                            break;
                    }
                }
            });
        }
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(2131308035);
        this.f67156b = recyclerView;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(linearLayoutManager);
        }
        RecyclerView recyclerView2 = this.f67156b;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.f67158d);
        }
        a aVar = this.f67158d;
        aVar.f67162a = this.f67157c;
        aVar.notifyDataSetChanged();
        this.f67158d.notifyDataSetChanged();
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
