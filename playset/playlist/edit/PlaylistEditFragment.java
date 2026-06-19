package com.bilibili.playset.playlist.edit;

import J3.C2388w;
import J3.C2391x;
import Ns.r;
import android.R;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AlertDialog;
import androidx.compose.material3.C4060i6;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.accounts.x;
import com.bilibili.lib.image2.bean.BitmapTransformation;
import com.bilibili.lib.image2.bean.ImageLoadingListener;
import com.bilibili.lib.image2.bean.ScaleType;
import com.bilibili.lib.image2.bean.ThumbnailUrlTransformStrategy;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.imageviewer.utils.ImageExtentionKt;
import com.bilibili.lib.router.Router;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.ui.BaseToolbarFragment;
import com.bilibili.lib.ui.callback.IBackPress;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.lib.ui.util.NightTheme;
import com.bilibili.magicasakura.widgets.TintCheckBox;
import com.bilibili.magicasakura.widgets.TintProgressDialog;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.playset.api.MultitypeMedia;
import com.bilibili.playset.api.SocializeInfo;
import com.bilibili.playset.api.Upper;
import com.bilibili.playset.playlist.edit.FooterBatchEditView;
import com.bilibili.playset.playlist.edit.PlaylistEditFragment;
import com.bilibili.playset.playlist.entity.SortRecord;
import com.bilibili.playset.playlist.ui.LoadingErrorEmptyView;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ps0.C8351a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/edit/PlaylistEditFragment.class */
@StabilityInferred(parameters = 0)
public final class PlaylistEditFragment extends BaseToolbarFragment implements C8351a.InterfaceC1341a, FooterBatchEditView.b, IBackPress {
    public ListPresenter h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public TintProgressDialog f85251i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public ItemTouchHelper f85252j;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f85256n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f85257o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f85258p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f85259q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f85245b = LazyKt.lazy(new Rs.d(this, 2));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lazy f85246c = LazyKt.lazy(new Ns.c(this, 2));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Lazy f85247d = LazyKt.lazy(new x(this, 2));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Lazy f85248e = LazyKt.lazy(new com.bilibili.ad.adview.videodetail.endpage.cards.j(this, 3));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Lazy f85249f = LazyKt.lazy(new C2388w(8));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Lazy f85250g = LazyKt.lazy(new C2391x(7));

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final CompositeDisposable f85253k = new CompositeDisposable();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public String f85254l = "";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f85255m = -1;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/edit/PlaylistEditFragment$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a extends b {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f85260n = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public c f85261b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TintCheckBox f85262c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final View f85263d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final BiliImageView f85264e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final View f85265f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final TintTextView f85266g;
        public final TintTextView h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final TintTextView f85267i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final TintTextView f85268j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final TintTextView f85269k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final TintTextView f85270l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @NotNull
        public final RelativeLayout f85271m;

        public a(@NotNull View view) {
            super(view);
            TintCheckBox tintCheckBox = (TintCheckBox) this.itemView.findViewById(2131298745);
            this.f85262c = tintCheckBox;
            View viewFindViewById = this.itemView.findViewById(2131304505);
            this.f85263d = viewFindViewById;
            this.f85264e = this.itemView.findViewById(2131304349);
            this.f85265f = this.itemView.findViewById(2131316068);
            this.f85266g = (TintTextView) this.itemView.findViewById(2131314868);
            this.h = (TintTextView) this.itemView.findViewById(2131314871);
            this.f85267i = (TintTextView) this.itemView.findViewById(2131314876);
            this.f85268j = (TintTextView) this.itemView.findViewById(2131314861);
            this.f85269k = (TintTextView) this.itemView.findViewById(2131314872);
            this.f85270l = (TintTextView) this.itemView.findViewById(2131314862);
            ImageView imageView = (ImageView) this.itemView.findViewById(2131304351);
            this.f85271m = (RelativeLayout) this.itemView.findViewById(2131310392);
            imageView.setVisibility(8);
            this.itemView.setOnClickListener(new Ns.n(this, 1));
            tintCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: com.bilibili.playset.playlist.edit.h

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final PlaylistEditFragment.a f85308a;

                {
                    this.f85308a = this;
                }

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z6) {
                    PlaylistEditFragment.c cVar;
                    PlaylistEditFragment.a aVar = this.f85308a;
                    if (aVar.getAdapterPosition() == -1 || (cVar = aVar.f85261b) == null) {
                        return;
                    }
                    cVar.O(aVar.getAdapterPosition(), z6);
                }
            });
            viewFindViewById.setOnTouchListener(new View.OnTouchListener(this) { // from class: com.bilibili.playset.playlist.edit.i

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final PlaylistEditFragment.a f85309a;

                {
                    this.f85309a = this;
                }

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    boolean z6;
                    PlaylistEditFragment.a aVar = this.f85309a;
                    if (motionEvent.getAction() == 0) {
                        if (!aVar.f85272a) {
                            ToastHelper.showToastShort(view2.getContext(), view2.getContext().getString(2131842628));
                        }
                        PlaylistEditFragment.c cVar = aVar.f85261b;
                        if (cVar != null) {
                            cVar.P(aVar);
                        }
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    return z6;
                }
            });
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/edit/PlaylistEditFragment$b.class */
    @StabilityInferred(parameters = 0)
    public static class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f85272a;

        public b(@NotNull View view) {
            super(view);
            this.f85272a = true;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/edit/PlaylistEditFragment$c.class */
    public final class c extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f85273a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final ArrayList<MultitypeMedia> f85274b = new ArrayList<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final PlaylistEditFragment f85275c;

        public c(PlaylistEditFragment playlistEditFragment) {
            this.f85275c = playlistEditFragment;
        }

        public final void N(int i7) {
            O(i7, !this.f85274b.contains(this.f85275c.pf().get(i7)));
            notifyItemChanged(i7, Boolean.TRUE);
        }

        public final void O(int i7, boolean z6) {
            PlaylistEditFragment playlistEditFragment = this.f85275c;
            MultitypeMedia multitypeMedia = playlistEditFragment.pf().get(i7);
            if (z6 && !this.f85274b.contains(multitypeMedia)) {
                this.f85274b.add(multitypeMedia);
            } else if (!z6 && this.f85274b.contains(multitypeMedia)) {
                this.f85274b.remove(multitypeMedia);
            }
            playlistEditFragment.zf();
        }

        public final void P(@NotNull RecyclerView.ViewHolder viewHolder) {
            PlaylistEditFragment playlistEditFragment = this.f85275c;
            playlistEditFragment.sf().add(new SortRecord());
            ItemTouchHelper itemTouchHelper = playlistEditFragment.f85252j;
            if (itemTouchHelper != null) {
                itemTouchHelper.startDrag(viewHolder);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.f85275c.pf().size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemViewType(int i7) {
            return this.f85275c.pf().get(i7).type;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i7) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i7, @NotNull List<Object> list) {
            int itemViewType = getItemViewType(i7);
            PlaylistEditFragment playlistEditFragment = this.f85275c;
            if (itemViewType == 2) {
                MultitypeMedia multitypeMedia = playlistEditFragment.pf().get(i7);
                e eVar = (e) viewHolder;
                boolean z6 = this.f85273a;
                boolean zContains = this.f85274b.contains(multitypeMedia);
                eVar.getClass();
                boolean zIsEmpty = list.isEmpty();
                TintCheckBox tintCheckBox = eVar.f85289c;
                if (!zIsEmpty) {
                    tintCheckBox.setChecked(zContains);
                    return;
                }
                ImageExtentionKt.displayImage$default(eVar.f85291e, multitypeMedia.cover, (ThumbnailUrlTransformStrategy) null, (ImageLoadingListener) null, 0, 0, false, false, (ScaleType) null, (BitmapTransformation) null, false, 1022, (Object) null);
                eVar.f85292f.setVisibility(NightTheme.isNightTheme(eVar.itemView.getContext()) ? 0 : 8);
                tintCheckBox.setVisibility(z6 ? 0 : 8);
                tintCheckBox.setChecked(zContains);
                eVar.f85290d.setVisibility(0);
                String str = multitypeMedia.title;
                TintTextView tintTextView = eVar.f85294i;
                tintTextView.setText(str);
                Upper upper = multitypeMedia.upper;
                eVar.f85295j.setText(upper != null ? upper.name : null);
                SocializeInfo socializeInfo = multitypeMedia.socializeInfo;
                String strValueOf = String.valueOf(socializeInfo != null ? Long.valueOf(socializeInfo.play) : null);
                TintTextView tintTextView2 = eVar.f85296k;
                tintTextView2.setText(strValueOf);
                SocializeInfo socializeInfo2 = multitypeMedia.socializeInfo;
                String strValueOf2 = String.valueOf(socializeInfo2 != null ? Long.valueOf(socializeInfo2.danmaku) : null);
                TintTextView tintTextView3 = eVar.f85297l;
                tintTextView3.setText(strValueOf2);
                SocializeInfo socializeInfo3 = multitypeMedia.socializeInfo;
                if (socializeInfo3 != null) {
                    tintTextView2.setText(com.bilibili.playset.utils.h.a(socializeInfo3.play));
                    tintTextView3.setText(com.bilibili.playset.utils.h.a(socializeInfo3.danmaku));
                }
                eVar.h.setVisibility(8);
                boolean z7 = (multitypeMedia.attr & 1) != 0;
                TintTextView tintTextView4 = eVar.f85293g;
                if (z7) {
                    eVar.f85298m.setVisibility(0);
                    tintTextView4.setVisibility(8);
                    tintTextView.setTextColor(eVar.itemView.getContext().getResources().getColor(R$color.Ga4));
                } else {
                    eVar.f85298m.setVisibility(8);
                    tintTextView4.setVisibility(0);
                    tintTextView.setTextColor(eVar.itemView.getContext().getResources().getColor(R$color.Ga10));
                }
                if (multitypeMedia.totalPage > 1) {
                    tintTextView4.setText(eVar.itemView.getContext().getResources().getString(2131833148, Integer.valueOf(multitypeMedia.totalPage)));
                    return;
                } else {
                    tintTextView4.setText(com.bilibili.playset.utils.a.a(multitypeMedia.duration * 1000));
                    return;
                }
            }
            if (itemViewType == 12) {
                MultitypeMedia multitypeMedia2 = playlistEditFragment.pf().get(i7);
                a aVar = (a) viewHolder;
                boolean z8 = this.f85273a;
                boolean zContains2 = this.f85274b.contains(multitypeMedia2);
                aVar.getClass();
                boolean zIsEmpty2 = list.isEmpty();
                TintCheckBox tintCheckBox2 = aVar.f85262c;
                if (!zIsEmpty2) {
                    tintCheckBox2.setChecked(zContains2);
                    return;
                }
                ImageExtentionKt.displayImage$default(aVar.f85264e, multitypeMedia2.cover, (ThumbnailUrlTransformStrategy) null, (ImageLoadingListener) null, 0, 0, false, false, (ScaleType) null, (BitmapTransformation) null, false, 1022, (Object) null);
                aVar.f85265f.setVisibility(NightTheme.isNightTheme(aVar.itemView.getContext()) ? 0 : 8);
                tintCheckBox2.setVisibility(z8 ? 0 : 8);
                tintCheckBox2.setChecked(zContains2);
                aVar.f85263d.setVisibility(0);
                String str2 = multitypeMedia2.title;
                TintTextView tintTextView5 = aVar.f85267i;
                tintTextView5.setText(str2);
                Upper upper2 = multitypeMedia2.upper;
                aVar.f85268j.setText(upper2 != null ? upper2.name : null);
                SocializeInfo socializeInfo4 = multitypeMedia2.socializeInfo;
                String strValueOf3 = String.valueOf(socializeInfo4 != null ? Long.valueOf(socializeInfo4.play) : null);
                TintTextView tintTextView6 = aVar.f85269k;
                tintTextView6.setText(strValueOf3);
                SocializeInfo socializeInfo5 = multitypeMedia2.socializeInfo;
                String strValueOf4 = String.valueOf(socializeInfo5 != null ? Long.valueOf(socializeInfo5.danmaku) : null);
                TintTextView tintTextView7 = aVar.f85270l;
                tintTextView7.setText(strValueOf4);
                SocializeInfo socializeInfo6 = multitypeMedia2.socializeInfo;
                if (socializeInfo6 != null) {
                    tintTextView6.setText(com.bilibili.playset.utils.h.a(socializeInfo6.play));
                    tintTextView7.setText(com.bilibili.playset.utils.h.a(socializeInfo6.danmaku));
                }
                aVar.h.setVisibility(((2 & multitypeMedia2.attr) == 0 || multitypeMedia2.type != 12) ? 8 : 0);
                boolean z9 = (multitypeMedia2.attr & 1) != 0;
                TintTextView tintTextView8 = aVar.f85266g;
                if (z9) {
                    aVar.f85271m.setVisibility(0);
                    tintTextView8.setVisibility(8);
                    tintTextView5.setTextColor(aVar.itemView.getContext().getResources().getColor(R$color.Ga4));
                } else {
                    aVar.f85271m.setVisibility(8);
                    tintTextView8.setVisibility(0);
                    tintTextView5.setTextColor(aVar.itemView.getContext().getResources().getColor(R$color.Ga10));
                }
                if (multitypeMedia2.totalPage > 1) {
                    tintTextView8.setText(aVar.itemView.getContext().getResources().getString(2131833148, Integer.valueOf(multitypeMedia2.totalPage)));
                    return;
                } else {
                    tintTextView8.setText(com.bilibili.playset.utils.a.a(multitypeMedia2.duration * 1000));
                    return;
                }
            }
            if (itemViewType != 24) {
                return;
            }
            MultitypeMedia multitypeMedia3 = playlistEditFragment.pf().get(i7);
            d dVar = (d) viewHolder;
            boolean z10 = this.f85273a;
            boolean zContains3 = this.f85274b.contains(multitypeMedia3);
            dVar.getClass();
            boolean zIsEmpty3 = list.isEmpty();
            TintCheckBox tintCheckBox3 = dVar.f85278c;
            if (!zIsEmpty3) {
                tintCheckBox3.setChecked(zContains3);
                return;
            }
            ImageExtentionKt.displayImage$default(dVar.f85280e, multitypeMedia3.cover, (ThumbnailUrlTransformStrategy) null, (ImageLoadingListener) null, 0, 0, false, false, (ScaleType) null, (BitmapTransformation) null, false, 1022, (Object) null);
            boolean zIsNightTheme = MultipleThemeUtils.isNightTheme(dVar.itemView.getContext());
            BiliImageView biliImageView = dVar.f85280e;
            if (zIsNightTheme) {
                biliImageView.setColorFilter(dVar.itemView.getResources().getColor(2131099674));
            } else {
                biliImageView.clearColorFilter();
            }
            tintCheckBox3.setVisibility(z10 ? 0 : 8);
            tintCheckBox3.setChecked(zContains3);
            dVar.f85279d.setVisibility(0);
            String str3 = multitypeMedia3.title;
            TintTextView tintTextView9 = dVar.h;
            tintTextView9.setText(str3);
            dVar.f85283i.setText(multitypeMedia3.intro);
            SocializeInfo socializeInfo7 = multitypeMedia3.socializeInfo;
            String strValueOf5 = String.valueOf(socializeInfo7 != null ? Long.valueOf(socializeInfo7.play) : null);
            TintTextView tintTextView10 = dVar.f85284j;
            tintTextView10.setText(strValueOf5);
            SocializeInfo socializeInfo8 = multitypeMedia3.socializeInfo;
            String strValueOf6 = String.valueOf(socializeInfo8 != null ? Long.valueOf(socializeInfo8.danmaku) : null);
            TintTextView tintTextView11 = dVar.f85285k;
            tintTextView11.setText(strValueOf6);
            SocializeInfo socializeInfo9 = multitypeMedia3.socializeInfo;
            if (socializeInfo9 != null) {
                tintTextView10.setText(com.bilibili.playset.utils.h.a(socializeInfo9.play));
                tintTextView11.setText(com.bilibili.playset.utils.h.a(socializeInfo9.danmaku));
            }
            dVar.f85282g.setVisibility(8);
            boolean z11 = (multitypeMedia3.attr & 1) != 0;
            TintTextView tintTextView12 = dVar.f85281f;
            if (z11) {
                dVar.f85286l.setVisibility(0);
                tintTextView12.setVisibility(8);
                tintTextView9.setTextColor(dVar.itemView.getContext().getResources().getColor(R$color.Ga4));
            } else {
                dVar.f85286l.setVisibility(8);
                tintTextView12.setVisibility(0);
                tintTextView9.setTextColor(dVar.itemView.getContext().getResources().getColor(R$color.Ga10));
            }
            if (multitypeMedia3.totalPage > 1) {
                tintTextView12.setText(dVar.itemView.getContext().getResources().getString(2131833148, Integer.valueOf(multitypeMedia3.totalPage)));
            } else {
                tintTextView12.setText(com.bilibili.playset.utils.a.a(multitypeMedia3.duration * 1000));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public final RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i7) {
            RecyclerView.ViewHolder viewHolder;
            boolean z6 = true;
            PlaylistEditFragment playlistEditFragment = this.f85275c;
            if (i7 == 2) {
                int i8 = e.f85287n;
                boolean z7 = playlistEditFragment.f85257o <= 1000;
                e eVar = new e(p.a(viewGroup, 2131499728, viewGroup, false));
                eVar.f85288b = this;
                eVar.f85272a = z7;
                viewHolder = eVar;
            } else if (i7 == 12) {
                int i9 = a.f85260n;
                if (playlistEditFragment.f85257o > 1000) {
                    z6 = false;
                }
                a aVar = new a(p.a(viewGroup, 2131499726, viewGroup, false));
                aVar.f85261b = this;
                aVar.f85272a = z6;
                viewHolder = aVar;
            } else if (i7 != 24) {
                int i10 = e.f85287n;
                boolean z8 = playlistEditFragment.f85257o <= 1000;
                e eVar2 = new e(p.a(viewGroup, 2131499728, viewGroup, false));
                eVar2.f85288b = this;
                eVar2.f85272a = z8;
                viewHolder = eVar2;
            } else {
                int i11 = d.f85276m;
                boolean z9 = playlistEditFragment.f85257o <= 1000;
                d dVar = new d(p.a(viewGroup, 2131499727, viewGroup, false));
                dVar.f85277b = this;
                dVar.f85272a = z9;
                viewHolder = dVar;
            }
            return viewHolder;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/edit/PlaylistEditFragment$d.class */
    @StabilityInferred(parameters = 0)
    public static final class d extends b {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int f85276m = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public c f85277b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TintCheckBox f85278c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final View f85279d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final BiliImageView f85280e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final TintTextView f85281f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final TintTextView f85282g;
        public final TintTextView h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final TintTextView f85283i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final TintTextView f85284j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final TintTextView f85285k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @NotNull
        public final RelativeLayout f85286l;

        public d(@NotNull View view) {
            super(view);
            TintCheckBox tintCheckBox = (TintCheckBox) this.itemView.findViewById(2131298745);
            this.f85278c = tintCheckBox;
            View viewFindViewById = this.itemView.findViewById(2131304505);
            this.f85279d = viewFindViewById;
            this.f85280e = this.itemView.findViewById(2131304604);
            this.f85281f = (TintTextView) this.itemView.findViewById(2131315503);
            this.f85282g = (TintTextView) this.itemView.findViewById(2131315506);
            this.h = (TintTextView) this.itemView.findViewById(2131315511);
            this.f85283i = (TintTextView) this.itemView.findViewById(2131315180);
            this.f85284j = (TintTextView) this.itemView.findViewById(2131315507);
            this.f85285k = (TintTextView) this.itemView.findViewById(2131315497);
            this.f85286l = (RelativeLayout) this.itemView.findViewById(2131310392);
            this.itemView.setOnClickListener(new r(this, 2));
            tintCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: com.bilibili.playset.playlist.edit.j

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final PlaylistEditFragment.d f85310a;

                {
                    this.f85310a = this;
                }

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z6) {
                    PlaylistEditFragment.c cVar;
                    PlaylistEditFragment.d dVar = this.f85310a;
                    if (dVar.getAdapterPosition() == -1 || (cVar = dVar.f85277b) == null) {
                        return;
                    }
                    cVar.O(dVar.getAdapterPosition(), z6);
                }
            });
            viewFindViewById.setOnTouchListener(new View.OnTouchListener(this) { // from class: com.bilibili.playset.playlist.edit.k

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final PlaylistEditFragment.d f85311a;

                {
                    this.f85311a = this;
                }

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    boolean z6;
                    PlaylistEditFragment.d dVar = this.f85311a;
                    if (motionEvent.getAction() == 0) {
                        if (!dVar.f85272a) {
                            ToastHelper.showToastShort(view2.getContext(), view2.getContext().getString(2131842628));
                        }
                        PlaylistEditFragment.c cVar = dVar.f85277b;
                        if (cVar != null) {
                            cVar.P(dVar);
                        }
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    return z6;
                }
            });
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/edit/PlaylistEditFragment$e.class */
    @StabilityInferred(parameters = 0)
    public static final class e extends b {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f85287n = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public c f85288b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TintCheckBox f85289c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final View f85290d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final BiliImageView f85291e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final View f85292f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final TintTextView f85293g;
        public final TintTextView h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final TintTextView f85294i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final TintTextView f85295j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final TintTextView f85296k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final TintTextView f85297l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @NotNull
        public final RelativeLayout f85298m;

        public e(@NotNull View view) {
            super(view);
            TintCheckBox tintCheckBox = (TintCheckBox) this.itemView.findViewById(2131298745);
            this.f85289c = tintCheckBox;
            View viewFindViewById = this.itemView.findViewById(2131304505);
            this.f85290d = viewFindViewById;
            this.f85291e = this.itemView.findViewById(2131304604);
            this.f85292f = this.itemView.findViewById(2131316068);
            this.f85293g = (TintTextView) this.itemView.findViewById(2131315503);
            this.h = (TintTextView) this.itemView.findViewById(2131315506);
            this.f85294i = (TintTextView) this.itemView.findViewById(2131315511);
            this.f85295j = (TintTextView) this.itemView.findViewById(2131315496);
            this.f85296k = (TintTextView) this.itemView.findViewById(2131315507);
            this.f85297l = (TintTextView) this.itemView.findViewById(2131315497);
            ImageView imageView = (ImageView) this.itemView.findViewById(2131304609);
            this.f85298m = (RelativeLayout) this.itemView.findViewById(2131310392);
            imageView.setVisibility(8);
            this.itemView.setOnClickListener(new Nt.a(this, 2));
            tintCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: com.bilibili.playset.playlist.edit.l

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final PlaylistEditFragment.e f85312a;

                {
                    this.f85312a = this;
                }

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z6) {
                    PlaylistEditFragment.c cVar;
                    PlaylistEditFragment.e eVar = this.f85312a;
                    if (eVar.getAdapterPosition() == -1 || (cVar = eVar.f85288b) == null) {
                        return;
                    }
                    cVar.O(eVar.getAdapterPosition(), z6);
                }
            });
            viewFindViewById.setOnTouchListener(new View.OnTouchListener(this) { // from class: com.bilibili.playset.playlist.edit.m

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final PlaylistEditFragment.e f85313a;

                {
                    this.f85313a = this;
                }

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    boolean z6;
                    PlaylistEditFragment.e eVar = this.f85313a;
                    if (motionEvent.getAction() == 0) {
                        if (!eVar.f85272a) {
                            ToastHelper.showToastShort(view2.getContext(), view2.getContext().getString(2131842628));
                        }
                        PlaylistEditFragment.c cVar = eVar.f85288b;
                        if (cVar != null) {
                            cVar.P(eVar);
                        }
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    return z6;
                }
            });
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/edit/PlaylistEditFragment$f.class */
    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlaylistEditFragment f85299a;

        public f(PlaylistEditFragment playlistEditFragment) {
            this.f85299a = playlistEditFragment;
        }

        public final List<MultitypeMedia> a() {
            ArrayList<MultitypeMedia> arrayList = this.f85299a.of().f85274b;
            ArrayList arrayList2 = new ArrayList();
            for (MultitypeMedia multitypeMedia : arrayList) {
                if ((multitypeMedia.attr & 1) == 0) {
                    arrayList2.add(multitypeMedia);
                }
            }
            return arrayList2;
        }
    }

    public static final String mf(PlaylistEditFragment playlistEditFragment) {
        String string;
        ArrayList<MultitypeMedia> arrayList = playlistEditFragment.of().f85274b;
        if (arrayList == null || arrayList.isEmpty()) {
            string = "";
        } else {
            StringBuilder sb = new StringBuilder();
            for (MultitypeMedia multitypeMedia : arrayList) {
                sb.append(multitypeMedia.id);
                sb.append(":");
                sb.append(multitypeMedia.type);
                sb.append(",");
            }
            string = sb.toString();
        }
        return string;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [android.content.DialogInterface$OnClickListener, java.lang.Object] */
    @Override // com.bilibili.playset.playlist.edit.FooterBatchEditView.b
    public final void J7(@NotNull View view) {
        int id = view.getId();
        if (id == 2131307670) {
            xf();
            if (getId() == 0 || of().f85274b.size() <= 0) {
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(requireActivity());
            builder.setMessage(getResources().getString(2131842650));
            builder.setPositiveButton(getString(2131841455), new DialogInterface.OnClickListener(this) { // from class: com.bilibili.playset.playlist.edit.d

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final PlaylistEditFragment f85304a;

                {
                    this.f85304a = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i7) {
                    LifecycleCoroutineScope lifecycleScope;
                    PlaylistEditFragment playlistEditFragment = this.f85304a;
                    dialogInterface.dismiss();
                    if (playlistEditFragment.f85251i == null) {
                        TintProgressDialog tintProgressDialog = new TintProgressDialog(playlistEditFragment.getContext());
                        playlistEditFragment.f85251i = tintProgressDialog;
                        tintProgressDialog.setIndeterminate(true);
                        TintProgressDialog tintProgressDialog2 = playlistEditFragment.f85251i;
                        if (tintProgressDialog2 != null) {
                            tintProgressDialog2.setCancelable(false);
                        }
                        TintProgressDialog tintProgressDialog3 = playlistEditFragment.f85251i;
                        if (tintProgressDialog3 != null) {
                            tintProgressDialog3.setMessage(playlistEditFragment.getResources().getString(2131841551));
                        }
                    }
                    TintProgressDialog tintProgressDialog4 = playlistEditFragment.f85251i;
                    if (tintProgressDialog4 != null) {
                        tintProgressDialog4.show();
                    }
                    LifecycleOwner value = playlistEditFragment.getViewLifecycleOwnerLiveData().getValue();
                    if (value == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(value)) == null) {
                        return;
                    }
                    BuildersKt.launch$default(lifecycleScope, (CoroutineContext) null, (CoroutineStart) null, new PlaylistEditFragment$batchDeleteMedias$1(playlistEditFragment, null), 3, (Object) null);
                }
            });
            builder.setNegativeButton(getString(2131841494), (DialogInterface.OnClickListener) new Object());
            builder.create().show();
            return;
        }
        if (id != 2131307719) {
            if (id == 2131307672) {
                xf();
                wf(1);
                return;
            } else {
                if (id == 2131307673) {
                    xf();
                    wf(2);
                    return;
                }
                return;
            }
        }
        if (view instanceof CheckBox) {
            if (!((CheckBox) view).isChecked()) {
                c cVarOf = of();
                cVarOf.f85274b.clear();
                cVarOf.f85275c.zf();
                cVarOf.notifyDataSetChanged();
                return;
            }
            c cVarOf2 = of();
            cVarOf2.f85274b.clear();
            ArrayList<MultitypeMedia> arrayList = cVarOf2.f85274b;
            PlaylistEditFragment playlistEditFragment = cVarOf2.f85275c;
            arrayList.addAll(playlistEditFragment.pf());
            playlistEditFragment.zf();
            cVarOf2.notifyDataSetChanged();
        }
    }

    @Override // ps0.C8351a.InterfaceC1341a
    public final boolean hasNextPage() {
        ListPresenter listPresenter = this.h;
        ListPresenter listPresenter2 = listPresenter;
        if (listPresenter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
            listPresenter2 = null;
        }
        return listPresenter2.f85241k;
    }

    @Override // ps0.C8351a.InterfaceC1341a
    public final boolean isLoading() {
        ListPresenter listPresenter = this.h;
        ListPresenter listPresenter2 = listPresenter;
        if (listPresenter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
            listPresenter2 = null;
        }
        return listPresenter2.f85242l;
    }

    public final void nf(List<? extends MultitypeMedia> list) {
        if (list.isEmpty()) {
            return;
        }
        LoadingErrorEmptyView loadingErrorEmptyViewRf = rf();
        Iterator it = ((ArrayList) loadingErrorEmptyViewRf.f85513e).iterator();
        while (it.hasNext()) {
            ((LoadingErrorEmptyView.a) it.next()).c();
        }
        if (loadingErrorEmptyViewRf.getVisibility() != 8) {
            loadingErrorEmptyViewRf.animate().alpha(0.0f).setDuration(loadingErrorEmptyViewRf.getResources().getInteger(R.integer.config_mediumAnimTime)).setListener(new us0.e(loadingErrorEmptyViewRf)).start();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((MultitypeMedia) obj).type != 21) {
                arrayList.add(obj);
            }
        }
        pf().addAll(arrayList);
        of().notifyItemRangeInserted(pf().size(), arrayList.size());
    }

    public final c of() {
        return (c) this.f85248e.getValue();
    }

    @Override // com.bilibili.lib.ui.callback.IBackPress
    public final boolean onBackPressed() {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putBoolean("key_result_is_create_folder", this.f85258p);
        ArrayList<SortRecord> arrayListSf = sf();
        if (arrayListSf == null || !arrayListSf.isEmpty()) {
            Iterator<T> it = arrayListSf.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!((SortRecord) it.next()).isInvalid()) {
                    bundle.putParcelableArrayList("sort_record", sf());
                    bundle.putString("api_params_sort_record", CollectionsKt.p(sf(), ",", (CharSequence) null, (CharSequence) null, new g(0), 30));
                    break;
                }
            }
        }
        intent.putExtras(bundle);
        FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 != null) {
            fragmentActivityP3.setResult(-1, intent);
        }
        FragmentActivity fragmentActivityP32 = p3();
        if (fragmentActivityP32 == null) {
            return true;
        }
        fragmentActivityP32.finish();
        return true;
    }

    @Override // com.bilibili.lib.ui.BaseToolbarFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131499723, viewGroup, false);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.f85253k.clear();
        ListPresenter listPresenter = this.h;
        ListPresenter listPresenter2 = listPresenter;
        if (listPresenter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
            listPresenter2 = null;
        }
        listPresenter2.getClass();
        super.onDestroy();
    }

    @Override // com.bilibili.lib.ui.BaseToolbarFragment, com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Bundle bundle2;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null && (bundle2 = arguments.getBundle("params")) != null) {
            String string = bundle2.getString("mTitle");
            String str = string;
            if (string == null) {
                str = "";
            }
            this.f85254l = str;
            this.f85255m = bundle2.getInt("mAttr", -1);
            this.f85256n = bundle2.getLong("playlistId");
            this.f85257o = bundle2.getInt("totalMediaCount");
        }
        setTitle(this.f85254l);
        ((RecyclerView) this.f85245b.getValue()).setLayoutManager(new LinearLayoutManager(getContext()));
        ((RecyclerView) this.f85245b.getValue()).addOnScrollListener(new C8351a(this));
        of().f85273a = true;
        FooterBatchEditView footerBatchEditViewQf = qf();
        FooterBatchEditView.a aVar = new FooterBatchEditView.a();
        aVar.f85228a.add(new FooterBatchEditView.c(2131307670, 2131842571, 2131103372));
        aVar.f85228a.add(new FooterBatchEditView.c(2131307672, 2131842482, 2131103373));
        aVar.f85228a.add(new FooterBatchEditView.c(2131307673, 2131842516, 2131103373));
        footerBatchEditViewQf.setBuilder(aVar);
        qf().a(2131307672, false);
        qf().a(2131307670, false);
        qf().a(2131307673, false);
        qf().setOnTabClickListener(this);
        ((RecyclerView) this.f85245b.getValue()).setAdapter(of());
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new o(new AK0.d(this, 3), new C4060i6(this, 1)));
        this.f85252j = itemTouchHelper;
        itemTouchHelper.attachToRecyclerView((RecyclerView) this.f85245b.getValue());
        this.h = new ListPresenter(this, this.f85256n);
        ListPresenter listPresenter = null;
        rf().n(null);
        ListPresenter listPresenter2 = this.h;
        if (listPresenter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
        } else {
            listPresenter = listPresenter2;
        }
        listPresenter.f();
    }

    public final ArrayList<MultitypeMedia> pf() {
        return (ArrayList) this.f85249f.getValue();
    }

    public final FooterBatchEditView qf() {
        return (FooterBatchEditView) this.f85247d.getValue();
    }

    public final LoadingErrorEmptyView rf() {
        return (LoadingErrorEmptyView) this.f85246c.getValue();
    }

    public final ArrayList<SortRecord> sf() {
        return (ArrayList) this.f85250g.getValue();
    }

    @Nullable
    public final LifecycleCoroutineScope tf() {
        LifecycleOwner value = getViewLifecycleOwnerLiveData().getValue();
        return value != null ? LifecycleOwnerKt.getLifecycleScope(value) : null;
    }

    public final void uf(@NotNull List<? extends MultitypeMedia> list) {
        this.f85259q = list.size();
        pf().clear();
        nf(list);
        if (pf().isEmpty()) {
            rf().j(null);
        }
    }

    public final void vf(@NotNull List<? extends MultitypeMedia> list) {
        pf().removeAll(list);
        of().f85274b.clear();
        of().notifyDataSetChanged();
        if (this.f85259q >= this.f85257o) {
            if (pf().isEmpty()) {
                rf().j(null);
            }
        } else {
            ListPresenter listPresenter = this.h;
            if (listPresenter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
                listPresenter = null;
            }
            listPresenter.e();
        }
    }

    @Override // ps0.C8351a.InterfaceC1341a
    public final void w0() {
        ListPresenter listPresenter = this.h;
        ListPresenter listPresenter2 = listPresenter;
        if (listPresenter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
            listPresenter2 = null;
        }
        listPresenter2.e();
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment, com.bilibili.playset.playlist.edit.FavoriteSingleBottomSheet] */
    public final void wf(int i7) {
        FragmentActivity fragmentActivityP3;
        if (getId() == 0 || of().f85274b.size() <= 0 || (fragmentActivityP3 = p3()) == null || fragmentActivityP3.isFinishing() || fragmentActivityP3.isDestroyed()) {
            return;
        }
        if (!ConnectivityMonitor.getInstance().isNetworkActive()) {
            ToastHelper.showToastShort(p3(), getString(2131841695));
            return;
        }
        boolean zIsLogin = BiliAccounts.get(getContext()).isLogin();
        if (!zIsLogin) {
            Router.Companion.global().with(this).forResult(-1).open("activity://main/login/");
        }
        if (zIsLogin) {
            ?? favoriteSingleBottomSheet = new FavoriteSingleBottomSheet();
            favoriteSingleBottomSheet.f85199b = new f(this);
            Bundle bundle = new Bundle();
            bundle.putString("key_play_list_type", (this.f85255m & 2) == 0 ? "default" : "non-default");
            bundle.putLong("key_media_id", this.f85256n);
            bundle.putInt("key_select_num", of().f85274b.size());
            bundle.putInt("key_op_type", i7);
            favoriteSingleBottomSheet.setArguments(bundle);
            favoriteSingleBottomSheet.show(fragmentActivityP3.getSupportFragmentManager(), FavoriteSingleBottomSheet.class.getName());
        }
    }

    public final void xf() {
        LifecycleCoroutineScope lifecycleScope;
        ArrayList<SortRecord> arrayListSf = sf();
        if (arrayListSf == null || !arrayListSf.isEmpty()) {
            Iterator<T> it = arrayListSf.iterator();
            while (it.hasNext()) {
                if (!((SortRecord) it.next()).isInvalid()) {
                    LifecycleOwner value = getViewLifecycleOwnerLiveData().getValue();
                    if (value == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(value)) == null) {
                        return;
                    }
                    BuildersKt.launch$default(lifecycleScope, (CoroutineContext) null, (CoroutineStart) null, new PlaylistEditFragment$sortMedias$2(this, null), 3, (Object) null);
                    return;
                }
            }
        }
    }

    public final void yf(@NotNull String str) {
        ToastHelper.showToastShort(getContext(), str);
    }

    public final void zf() {
        boolean z6;
        boolean z7;
        qf().setSelectAll(of().f85274b.size() == pf().size());
        qf().a(2131307670, of().f85274b.size() != 0);
        FooterBatchEditView footerBatchEditViewQf = qf();
        if (of().f85274b.size() != 0) {
            Iterator<MultitypeMedia> it = of().f85274b.iterator();
            while (it.hasNext()) {
                if ((it.next().attr & 1) == 0) {
                    z6 = true;
                    break;
                }
            }
            z6 = false;
        } else {
            z6 = false;
        }
        footerBatchEditViewQf.a(2131307672, z6);
        FooterBatchEditView footerBatchEditViewQf2 = qf();
        if (of().f85274b.size() != 0) {
            Iterator<MultitypeMedia> it2 = of().f85274b.iterator();
            while (it2.hasNext()) {
                z7 = true;
                if ((it2.next().attr & 1) == 0) {
                    break;
                }
            }
            z7 = false;
        } else {
            z7 = false;
        }
        footerBatchEditViewQf2.a(2131307673, z7);
    }
}
