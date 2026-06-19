package com.bilibili.playset.widget.favorite;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bilibili.api.BiliApiException;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.magicasakura.widgets.TintCheckBox;
import com.bilibili.moduleservice.account.AccountService;
import com.bilibili.playset.widget.favorite.FavoriteDialog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.bili.widget.LoadingImageView;
import tv.danmaku.bili.widget.RecyclerView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/widget/favorite/FavoriteDialog$updateFavBoxList$1.class */
public final class FavoriteDialog$updateFavBoxList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final BiliAccounts $account;
    int label;
    final FavoriteDialog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavoriteDialog$updateFavBoxList$1(BiliAccounts biliAccounts, FavoriteDialog favoriteDialog, Continuation<? super FavoriteDialog$updateFavBoxList$1> continuation) {
        super(2, continuation);
        this.$account = biliAccounts;
        this.this$0 = favoriteDialog;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FavoriteDialog$updateFavBoxList$1(this.$account, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        int i7;
        boolean z6;
        String name;
        boolean z7;
        List<PlaySet> list;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i8 = this.label;
        if (i8 == 0) {
            ResultKt.throwOnFailure(obj);
            f fVar = f.f85754a;
            long jMid = this.$account.mid();
            FavoriteDialog favoriteDialog = this.this$0;
            long j7 = favoriteDialog.f85696n;
            int i9 = favoriteDialog.f85697o;
            Map<String, String> map = favoriteDialog.f85685b.f85712i;
            this.label = 1;
            Object objE = fVar.e(jMid, j7, i9, true, map, this);
            obj2 = objE;
            if (objE == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            obj2 = ((Result) obj).unbox-impl();
        }
        FavoriteDialog favoriteDialog2 = this.this$0;
        if (Result.isSuccess-impl(obj2)) {
            PlaySetPageData playSetPageData = (PlaySetPageData) obj2;
            int i10 = FavoriteDialog.f85683u;
            LoadingImageView loadingImageView = favoriteDialog2.f85690g;
            if (loadingImageView != null) {
                loadingImageView.setRefreshComplete();
                loadingImageView.setVisibility(8);
            }
            List mutableList = (playSetPageData == null || (list = playSetPageData.getList()) == null) ? null : CollectionsKt.toMutableList(list);
            List list2 = mutableList;
            if (list2 == null || list2.isEmpty()) {
                LoadingImageView loadingImageView2 = favoriteDialog2.f85690g;
                if (loadingImageView2 != null) {
                    if (!loadingImageView2.isShown()) {
                        loadingImageView2.setVisibility(0);
                    }
                    loadingImageView2.setRefreshError();
                    loadingImageView2.showEmptyTips();
                }
            } else {
                ArrayList arrayList = new ArrayList();
                if (((ArrayList) favoriteDialog2.f85695m.f85724b).size() > 0) {
                    Iterator it = mutableList.iterator();
                    boolean z8 = false;
                    while (true) {
                        z6 = z8;
                        if (!it.hasNext()) {
                            break;
                        }
                        PlaySet playSet = (PlaySet) it.next();
                        Iterator it2 = ((ArrayList) favoriteDialog2.f85695m.f85724b).iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                ((ArrayList) favoriteDialog2.f85695m.f85725c).add(0, playSet);
                                z7 = true;
                                break;
                            }
                            if (((PlaySet) it2.next()).getId() == playSet.getId()) {
                                z7 = z8;
                                break;
                            }
                        }
                        Iterator it3 = ((ArrayList) favoriteDialog2.f85695m.f85725c).iterator();
                        while (true) {
                            z8 = z7;
                            if (it3.hasNext()) {
                                if (((PlaySet) it3.next()).getId() == playSet.getId()) {
                                    arrayList.add(playSet);
                                }
                            }
                        }
                    }
                } else {
                    z6 = false;
                }
                mutableList.removeAll(arrayList);
                mutableList.addAll(0, favoriteDialog2.f85695m.f85725c);
                FavoriteDialog.c cVar = favoriteDialog2.f85695m;
                ((ArrayList) cVar.f85724b).clear();
                ((ArrayList) cVar.f85724b).addAll(mutableList);
                if (((ArrayList) cVar.f85724b).isEmpty()) {
                    PlaySet playSet2 = new PlaySet();
                    playSet2.setTitle(favoriteDialog2.getContext().getString(2131842611));
                    ((ArrayList) cVar.f85724b).add(playSet2);
                }
                for (PlaySet playSet3 : (ArrayList) cVar.f85724b) {
                    if (((LinkedHashMap) cVar.f85726d).get(Long.valueOf(playSet3.getId())) == null || playSet3.hasCurrentVideo()) {
                        cVar.f85726d.put(Long.valueOf(playSet3.getId()), Boolean.valueOf(playSet3.hasCurrentVideo()));
                    }
                }
                if (cVar.f85727e) {
                    Map<Long, Boolean> map2 = cVar.f85726d;
                    PlaySet playSet4 = (PlaySet) CollectionsKt.getOrNull(cVar.f85724b, 0);
                    map2.put(Long.valueOf(playSet4 != null ? playSet4.getId() : 0L), Boolean.FALSE);
                }
                if (z6) {
                    FavoriteDialog.c cVar2 = favoriteDialog2.f85695m;
                    Map<Long, Boolean> map3 = cVar2.f85726d;
                    PlaySet playSet5 = (PlaySet) CollectionsKt.getOrNull(cVar2.f85724b, 0);
                    map3.put(Long.valueOf(playSet5 != null ? playSet5.getId() : 0L), Boolean.TRUE);
                    cVar2.notifyDataSetChanged();
                    RecyclerView recyclerView = favoriteDialog2.f85689f;
                    if (recyclerView != null) {
                        recyclerView.smoothScrollToPosition(0);
                    }
                } else {
                    favoriteDialog2.f85695m.notifyDataSetChanged();
                }
                PlaySeason season = playSetPageData.getSeason();
                if (season == null || (name = season.getName()) == null || !(!StringsKt.isBlank(name)) || season.getId() == -1 || !favoriteDialog2.f85685b.h) {
                    favoriteDialog2.f85698p = -1L;
                    TintCheckBox tintCheckBox = favoriteDialog2.h;
                    if (tintCheckBox != null) {
                        tintCheckBox.setVisibility(8);
                    }
                    View view = favoriteDialog2.f85693k;
                    if (view != null) {
                        view.setVisibility(8);
                    }
                } else {
                    favoriteDialog2.f85698p = season.getId();
                    String strA = G.p.a(favoriteDialog2.f85684a.getString(2131846948), season.getName());
                    TintCheckBox tintCheckBox2 = favoriteDialog2.h;
                    if (tintCheckBox2 != null) {
                        tintCheckBox2.setText(strA);
                        tintCheckBox2.setChecked(false);
                        tintCheckBox2.setVisibility(0);
                    }
                    View view2 = favoriteDialog2.f85693k;
                    if (view2 != null) {
                        view2.setVisibility(0);
                    }
                }
                Map mapCreateMapBuilder = MapsKt.createMapBuilder();
                mapCreateMapBuilder.put("spmid", favoriteDialog2.f85685b.f85714k);
                mapCreateMapBuilder.put(GameCardButton.extraAvid, String.valueOf(favoriteDialog2.f85685b.f85705a));
                mapCreateMapBuilder.put("cid", String.valueOf(favoriteDialog2.f85685b.f85706b));
                mapCreateMapBuilder.put("type", favoriteDialog2.o());
                View view3 = favoriteDialog2.f85691i;
                mapCreateMapBuilder.put("is_later_show", (view3 == null || view3.getVisibility() != 0) ? "0" : "1");
                TintCheckBox tintCheckBox3 = favoriteDialog2.h;
                mapCreateMapBuilder.put("is_drag_show", (tintCheckBox3 == null || tintCheckBox3.getVisibility() != 0) ? "0" : "1");
                mapCreateMapBuilder.put("is_drag_select", favoriteDialog2.f85699q ? "1" : "0");
                PlaySet playSet6 = (PlaySet) CollectionsKt.getOrNull(favoriteDialog2.f85695m.f85724b, 0);
                Object obj3 = "0";
                if (playSet6 != null) {
                    obj3 = "0";
                    if (playSet6.hasCurrentVideo()) {
                        obj3 = "1";
                    }
                }
                mapCreateMapBuilder.put("is_default_select", obj3);
                Neurons.reportExposure$default(false, "community.public-community.collect-panel.0.show", MapsKt.build(mapCreateMapBuilder), (List) null, 8, (Object) null);
            }
        }
        FavoriteDialog favoriteDialog3 = this.this$0;
        BiliApiException biliApiException = Result.exceptionOrNull-impl(obj2);
        if (biliApiException != null) {
            int i11 = FavoriteDialog.f85683u;
            LoadingImageView loadingImageView3 = favoriteDialog3.f85690g;
            if (loadingImageView3 != null) {
                loadingImageView3.setRefreshComplete();
                loadingImageView3.setVisibility(8);
            }
            LoadingImageView loadingImageView4 = favoriteDialog3.f85690g;
            if (loadingImageView4 != null) {
                if (!loadingImageView4.isShown()) {
                    loadingImageView4.setVisibility(0);
                }
                loadingImageView4.setRefreshError();
            }
            if (!((ArrayList) favoriteDialog3.f85695m.f85724b).isEmpty()) {
                ((ArrayList) favoriteDialog3.f85695m.f85724b).clear();
                favoriteDialog3.f85695m.notifyDataSetChanged();
            }
            boolean z9 = biliApiException instanceof BiliApiException;
            if (z9 && ((i7 = biliApiException.mCode) == -2 || i7 == -101)) {
                Context context = favoriteDialog3.getContext();
                AccountService accountService = (AccountService) w8.d.a(BLRouter.INSTANCE, AccountService.class, "default");
                if (accountService != null) {
                    accountService.logout("FavoriteDialog_boxListCallback_onError");
                }
                ToastHelper.showToastLong(context, 2131847429);
                favoriteDialog3.dismiss();
            } else {
                String message = biliApiException.getMessage();
                if (!z9 || TextUtils.isEmpty(message)) {
                    ToastHelper.showToastShort(favoriteDialog3.getContext(), 2131845516);
                } else {
                    ToastHelper.showToastShort(favoriteDialog3.getContext(), message);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
