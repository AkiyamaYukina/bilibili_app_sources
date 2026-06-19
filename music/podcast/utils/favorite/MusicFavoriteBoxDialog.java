package com.bilibili.music.podcast.utils.favorite;

import E2.C1612a;
import G.p;
import Lg0.f;
import Lg0.g;
import android.R;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.activity.ComponentDialog;
import androidx.collection.LongSparseArray;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.exoplayer.analytics.U;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bapis.bilibili.app.listener.v1.FavFolderAction;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.magicasakura.widgets.TintCheckBox;
import com.bilibili.moduleservice.account.AccountService;
import com.bilibili.music.podcast.collection.data.FavFolderItem;
import com.bilibili.music.podcast.data.MusicPagerReportData;
import com.bilibili.music.podcast.data.MusicPlayVideo;
import com.bilibili.music.podcast.utils.favorite.MusicFavoriteBoxDialog;
import com.bilibili.music.podcast.utils.favorite.MusicFavoriteHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.LoadingImageView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/utils/favorite/MusicFavoriteBoxDialog.class */
public final class MusicFavoriteBoxDialog extends ComponentDialog implements View.OnClickListener {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f66970m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f66971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public MusicPlayVideo f66972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f66973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f66974d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public MusicFavoriteHelper.b f66975e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final b f66976f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public c f66977g;
    public int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Lazy f66978i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Lazy f66979j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Lazy f66980k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Lazy f66981l;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/utils/favorite/MusicFavoriteBoxDialog$a.class */
    public static final class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final TextView f66982a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final TextView f66983b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final TextView f66984c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final TintCheckBox f66985d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final View f66986e;

        public a(@NotNull View view) {
            super(view);
            this.f66982a = (TextView) view.findViewById(2131308958);
            this.f66983b = (TextView) view.findViewById(2131308733);
            this.f66984c = (TextView) view.findViewById(2131316151);
            this.f66985d = (TintCheckBox) view.findViewById(2131301442);
            this.f66986e = view.findViewById(2131311969);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/utils/favorite/MusicFavoriteBoxDialog$b.class */
    public static final class b extends RecyclerView.Adapter<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public MusicFavoriteBoxDialog f66987a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public ArrayList<FavFolderItem> f66988b = new ArrayList<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final ArrayList<FavFolderItem> f66989c = new ArrayList<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final LongSparseArray<Boolean> f66990d = new LongSparseArray<>(0, 1, null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f66991e;

        @NotNull
        public final List<FavFolderItem> N() {
            ArrayList arrayList = new ArrayList();
            int size = this.f66988b.size();
            for (int i7 = 0; i7 < size; i7++) {
                FavFolderItem favFolderItem = this.f66988b.get(i7);
                if (this.f66990d.get(favFolderItem.getId(), Boolean.FALSE).booleanValue()) {
                    arrayList.add(favFolderItem);
                }
            }
            return arrayList;
        }

        public final long O(int i7) {
            FavFolderItem favFolderItem = (FavFolderItem) CollectionsKt.getOrNull(this.f66988b, i7);
            return favFolderItem != null ? favFolderItem.getId() : 0L;
        }

        @NotNull
        public final List<FavFolderItem> P() {
            ArrayList arrayList = new ArrayList();
            int size = this.f66988b.size();
            for (int i7 = 0; i7 < size; i7++) {
                FavFolderItem favFolderItem = this.f66988b.get(i7);
                boolean zBooleanValue = this.f66990d.get(favFolderItem.getId(), Boolean.FALSE).booleanValue();
                if (favFolderItem.hasCurrentVideo() != zBooleanValue && zBooleanValue) {
                    arrayList.add(favFolderItem);
                }
            }
            return arrayList;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.f66988b.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
            final a aVar = (a) viewHolder;
            FavFolderItem favFolderItem = this.f66988b.get(i7);
            aVar.itemView.setOnClickListener(this.f66987a);
            String title = favFolderItem.getTitle();
            String strA = title;
            if ((title != null ? title.length() : 0) > 15) {
                strA = p.a(title != null ? title.substring(0, 14) : null, "…");
            }
            aVar.f66982a.setText(strA);
            aVar.f66983b.setText(favFolderItem.isPublic() ? 2131842623 : 2131842513);
            TextView textView = aVar.f66984c;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            U.a(new Object[]{Integer.valueOf(favFolderItem.getCount())}, 1, aVar.f66983b.getContext().getString(2131826237), textView);
            Boolean bool = this.f66990d.get(favFolderItem.getId());
            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
            if (this.f66991e) {
                zBooleanValue = false;
            }
            TintCheckBox tintCheckBox = aVar.f66985d;
            tintCheckBox.setChecked(zBooleanValue);
            tintCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this, aVar) { // from class: com.bilibili.music.podcast.utils.favorite.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final MusicFavoriteBoxDialog.b f67001a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final MusicFavoriteBoxDialog.a f67002b;

                {
                    this.f67001a = this;
                    this.f67002b = aVar;
                }

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z6) {
                    MusicFavoriteBoxDialog.b bVar = this.f67001a;
                    bVar.f66990d.put(bVar.O(this.f67002b.getAdapterPosition()), Boolean.valueOf(z6));
                }
            });
            aVar.f66986e.setVisibility(i7 < this.f66988b.size() - 1 ? 0 : 8);
            aVar.itemView.setTag(tintCheckBox);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
            return new a(p.a(viewGroup, 2131495094, viewGroup, false));
        }
    }

    public MusicFavoriteBoxDialog(@NotNull Context context) {
        super(context, 2131886161);
        this.f66971a = context;
        requestWindowFeature(1);
        Window window = getWindow();
        if (window != null) {
            window.setSoftInputMode(51);
        }
        this.f66973c = -1L;
        this.f66976f = new b();
        this.f66978i = LazyKt.lazy(new NL.a(this, 1));
        this.f66979j = LazyKt.lazy(new f(this, 2));
        this.f66980k = LazyKt.lazy(new com.bilibili.app.gemini.player.widget.progress.a(this));
        this.f66981l = LazyKt.lazy(new g(this, 2));
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        Function0<Unit> function0;
        super.dismiss();
        MusicFavoriteHelper.b bVar = this.f66975e;
        if (bVar == null || !bVar.f66998c.element || (function0 = bVar.f66999d) == null) {
            return;
        }
        function0.invoke();
    }

    public final long j() {
        MusicPlayVideo musicPlayVideo = this.f66972b;
        return musicPlayVideo != null ? musicPlayVideo.getOid() : -1L;
    }

    public final void k(String str) {
        AccountService accountService = (AccountService) w8.d.a(BLRouter.INSTANCE, AccountService.class, "default");
        if (accountService != null) {
            accountService.logout(str);
        }
        ToastHelper.showToastLong(this.f66971a.getApplicationContext(), 2131841670);
    }

    public final void l() {
        if (BiliAccounts.get(this.f66971a).isLogin()) {
            LoadingImageView loadingImageView = (LoadingImageView) this.f66981l.getValue();
            if (loadingImageView != null) {
                loadingImageView.setVisibility(0);
                loadingImageView.setRefreshing();
            }
            BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new MusicFavoriteBoxDialog$updateFavBoxList$1(this, null), 3, (Object) null);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View view) {
        Object next;
        int id = view.getId();
        if (id == 2131307839) {
            Map mapCreateMapBuilder = MapsKt.createMapBuilder();
            mapCreateMapBuilder.put("button_name", "new");
            MusicFavoriteHelper.b bVar = this.f66975e;
            String str = "";
            if (bVar != null) {
                MusicPagerReportData musicPagerReportDataA = bVar.a();
                str = "";
                if (musicPagerReportDataA != null) {
                    str = musicPagerReportDataA.f66424c;
                    if (str == null) {
                        str = "";
                    }
                }
            }
            mapCreateMapBuilder.put("spmid", str);
            mapCreateMapBuilder.put(GameCardButton.extraAvid, String.valueOf(j()));
            mapCreateMapBuilder.put("cid", String.valueOf(this.f66973c));
            mapCreateMapBuilder.put("type", "3");
            Neurons.reportClick(false, "community.public-community.collect-panel.button.click", MapsKt.build(mapCreateMapBuilder));
            Context context = view.getContext();
            c cVar = this.f66977g;
            Fragment fragmentA = cVar != null ? cVar.a() : null;
            int i7 = this.h;
            if (context == null && fragmentA == null) {
                return;
            }
            RouteRequest.Builder builder = new RouteRequest.Builder(Uri.parse("bilibili://podcast/favorite/create").buildUpon().build());
            builder.requestCode(i7);
            if (fragmentA != null) {
                BLRouter.routeTo(builder.build(), fragmentA);
                return;
            } else {
                if (context != null) {
                    BLRouter.routeTo(builder.build(), context);
                    return;
                }
                return;
            }
        }
        if (id != 2131297905) {
            Object tag = view.getTag();
            if (tag instanceof CheckBox) {
                ((CheckBox) tag).setChecked(!r0.isChecked());
                return;
            }
            return;
        }
        b bVar2 = this.f66976f;
        ArrayList arrayList = new ArrayList();
        for (FavFolderItem favFolderItem : (ArrayList) bVar2.P()) {
            arrayList.add(FavFolderAction.newBuilder().setFid(favFolderItem.getId()).setFolderType(favFolderItem.getType()).setAction(FavFolderAction.Action.ADD).build());
        }
        ArrayList<FavFolderItem> arrayList2 = new ArrayList();
        int size = bVar2.f66988b.size();
        for (int i8 = 0; i8 < size; i8++) {
            FavFolderItem favFolderItem2 = bVar2.f66988b.get(i8);
            boolean zBooleanValue = bVar2.f66990d.get(favFolderItem2.getId(), Boolean.FALSE).booleanValue();
            if (favFolderItem2.hasCurrentVideo() != zBooleanValue && !zBooleanValue) {
                arrayList2.add(favFolderItem2);
            }
        }
        for (FavFolderItem favFolderItem3 : arrayList2) {
            arrayList.add(FavFolderAction.newBuilder().setFid(favFolderItem3.getId()).setFolderType(favFolderItem3.getType()).setAction(FavFolderAction.Action.DEL).build());
        }
        ArrayList arrayList3 = (ArrayList) bVar2.N();
        Iterator it = arrayList3.iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (((FavFolderItem) next).isDefault()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        int size2 = next != null ? arrayList3.size() - 1 : arrayList3.size();
        Map mapCreateMapBuilder2 = MapsKt.createMapBuilder();
        MusicFavoriteHelper.b bVar3 = this.f66975e;
        String str2 = "";
        if (bVar3 != null) {
            MusicPagerReportData musicPagerReportDataA2 = bVar3.a();
            str2 = "";
            if (musicPagerReportDataA2 != null) {
                str2 = musicPagerReportDataA2.f66424c;
                if (str2 == null) {
                    str2 = "";
                }
            }
        }
        mapCreateMapBuilder2.put("spmid", str2);
        mapCreateMapBuilder2.put(GameCardButton.extraAvid, String.valueOf(j()));
        mapCreateMapBuilder2.put("cid", String.valueOf(this.f66973c));
        C1612a.c(size2, "type", "3", "plnum", mapCreateMapBuilder2);
        mapCreateMapBuilder2.put("action_type", "complete");
        mapCreateMapBuilder2.put("is_drag_select", "0");
        FavFolderItem favFolderItem4 = (FavFolderItem) CollectionsKt.getOrNull(this.f66976f.f66988b, 0);
        Object obj = "0";
        if (favFolderItem4 != null) {
            obj = "0";
            if (favFolderItem4.hasCurrentVideo()) {
                obj = "1";
            }
        }
        mapCreateMapBuilder2.put("is_default_select", obj);
        Neurons.reportClick(false, "community.public-community.collect-panel.complete.click", MapsKt.build(mapCreateMapBuilder2));
        MusicFavoriteHelper.b bVar4 = this.f66975e;
        if (bVar4 != null) {
            List<FavFolderItem> listN = bVar2.N();
            MusicFavoriteHelper.a aVar = bVar4.f66996a.f66993b;
            if (aVar != null) {
                aVar.b(listN);
            }
        }
        if (!arrayList.isEmpty()) {
            BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new MusicFavoriteBoxDialog$commitChange$3(arrayList, this, null), 3, (Object) null);
            return;
        }
        MusicFavoriteHelper.b bVar5 = this.f66975e;
        if (bVar5 != null) {
            bVar5.f66998c.element = true;
        }
        dismiss();
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131499496);
        View view = (View) this.f66978i.getValue();
        if (view != null) {
            view.setOnClickListener(this);
        }
        View view2 = (View) this.f66980k.getValue();
        if (view2 != null) {
            view2.setOnClickListener(this);
        }
        RecyclerView recyclerView = (RecyclerView) this.f66979j.getValue();
        LinearLayoutManager linearLayoutManager = null;
        RecyclerView.LayoutManager layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        if (layoutManager instanceof LinearLayoutManager) {
            linearLayoutManager = (LinearLayoutManager) layoutManager;
        }
        if (linearLayoutManager != null) {
            linearLayoutManager.setSmoothScrollbarEnabled(true);
        }
        RecyclerView recyclerView2 = (RecyclerView) this.f66979j.getValue();
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.f66976f);
        }
        this.f66976f.f66987a = this;
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public final void onStart() {
        super.onStart();
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -2);
            window.setGravity(80);
            window.setBackgroundDrawableResource(R.color.transparent);
        }
    }
}
