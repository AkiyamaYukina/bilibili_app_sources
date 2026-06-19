package com.bilibili.playset;

import Cg0.C1516a;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.alipay.alipaysecuritysdk.api.service.ServiceManager;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.blrouter.RouteRequestKt;
import com.bilibili.lib.image2.bean.BitmapTransformation;
import com.bilibili.lib.image2.bean.ImageLoadingListener;
import com.bilibili.lib.image2.bean.ScaleType;
import com.bilibili.lib.image2.bean.ThumbnailUrlTransformStrategy;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.imageviewer.utils.ImageExtentionKt;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.router.Router;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.BaseToolbarActivity;
import com.bilibili.lib.ui.util.NightTheme;
import com.bilibili.lib.ui.util.StatusBarCompat;
import com.bilibili.magicasakura.widgets.TintAppBarLayout;
import com.bilibili.magicasakura.widgets.TintProgressDialog;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.playerbizcommon.IVideoLikeRouteService;
import com.bilibili.playset.MultiTypeListDetailActivity;
import com.bilibili.playset.api.MultitypeMedia;
import com.bilibili.playset.api.MultitypePlaylist;
import com.bilibili.playset.api.PlaySetService;
import com.bilibili.playset.api.SocializeInfo;
import com.bilibili.playset.api.Upper;
import com.bilibili.playset.collection.enums.CollectionTypeEnum;
import com.bilibili.playset.constants.FolderGroupEnum;
import com.bilibili.playset.dialog.OperateItem;
import com.bilibili.playset.dialog.PlaylistDetailBottomSheet;
import com.bilibili.playset.playlist.entity.SortRecord;
import com.bilibili.playset.playlist.helper.MultiTypeShareHelper;
import com.bilibili.playset.playlist.helper.b;
import com.bilibili.playset.playlist.ui.ExpandableTextView;
import com.bilibili.playset.playlist.ui.LoadingErrorEmptyView;
import com.bilibili.playset.playlist.viewmodels.PlaylistViewModel;
import com.bilibili.pvtracker.IPvTracker;
import com.bilibili.pvtracker.PageViewTracker;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.bilibili.upper.module.aistory.test.base.BaseThemeStyleFragment;
import com.bilibili.upper.module.aistory.test.fragment.AIStoryVideoStyleFragment;
import com.bilibili.upper.module.aistory.test.fragment.VideoThemeStyleFragment;
import com.bilibili.upper.module.contribute.picker.model.MaterialChooseShareViewModel;
import com.bilibili.upper.module.contribute.picker.ui.MaterialChooseFragment;
import com.google.android.material.appbar.AppBarLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.RecyclerView;
import tv.danmaku.bili.widget.dialog.CommonDialogUtilsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/MultiTypeListDetailActivity.class */
@StabilityInferred(parameters = 0)
public final class MultiTypeListDetailActivity extends BaseToolbarActivity implements View.OnClickListener, PlaylistDetailBottomSheet.c, MultiTypeShareHelper.a, IPvTracker {

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public static final int f83895o1 = 0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    @NotNull
    public final Lazy f83911S;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    @Nullable
    public TintProgressDialog f83917X0;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public PlaylistViewModel f83919Y0;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    @Nullable
    public os0.r f83921Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    @Nullable
    public E f83923a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    @Nullable
    public LinearLayoutManager f83924b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    @Nullable
    public List<? extends MultitypeMedia> f83926c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    @Nullable
    public MultitypePlaylist.Info f83927d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    @Nullable
    public MultitypeMedia f83928e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    @Nullable
    public Long f83929f1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    @Nullable
    public Boolean f83932i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public boolean f83933j1;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f83896D = 1;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @NotNull
    public final Lazy f83897E = LazyKt.lazy(new Ty0.c(this, 3));

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @NotNull
    public final Lazy f83898F = LazyKt.lazy(new C1516a(this, 2));

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    @NotNull
    public final Lazy f83899G = LazyKt.lazy(new com.bilibili.biligame.ui.discover2.act.c(this, 4));

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    @NotNull
    public final Lazy f83900H = LazyKt.lazy(new I90.D(this, 4));

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    @NotNull
    public final Lazy f83901I = LazyKt.lazy(new Tx.e(this, 2));

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    @NotNull
    public final Lazy f83902J = LazyKt.lazy(new com.bilibili.biligame.widget.user.dialog.h(this, 3));

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    @NotNull
    public final Lazy f83903K = LazyKt.lazy(new Tx0.b(this, 4));

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    @NotNull
    public final Lazy f83904L = LazyKt.lazy(new bB.b(this, 2));

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    @NotNull
    public final Lazy f83905M = LazyKt.lazy(new com.bilibili.lib.fasthybrid.packages.b(this, 2));

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    @NotNull
    public final Lazy f83906N = LazyKt.lazy(new com.bilibili.bililive.room.ui.roomv3.tab.interaction.u(this, 3));

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    @NotNull
    public final Lazy f83907O = LazyKt.lazy(new LR0.b(this, 4));

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    @NotNull
    public final Lazy f83908P = LazyKt.lazy(new com.bilibili.bplus.followinglist.page.campus.topic.b(this, 1));

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    @NotNull
    public final Lazy f83909Q = LazyKt.lazy(new IF.b(this, 3));

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    @NotNull
    public final Lazy f83910R = LazyKt.lazy(new IF0.a(this, 1));

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    @NotNull
    public final Lazy f83912T = LazyKt.lazy(new Function0(this) { // from class: com.bilibili.playset.K

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MultiTypeListDetailActivity f83880a;

        {
            this.f83880a = this;
        }

        public final Object invoke() {
            int i7 = MultiTypeListDetailActivity.f83895o1;
            return (LinearLayout) this.f83880a.findViewById(2131309150);
        }
    });

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    @NotNull
    public final Lazy f83913U = LazyKt.lazy(new com.bilibili.app.comment3.utils.I(this, 4));

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    @NotNull
    public final Lazy f83914V = LazyKt.lazy(new I90.k(this, 4));

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    @NotNull
    public final Lazy f83915W = LazyKt.lazy(new I90.l(this, 5));

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    @NotNull
    public final Lazy f83916X = LazyKt.lazy(new Za.a(this, 4));

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    @NotNull
    public final Lazy f83918Y = LazyKt.lazy(new I90.o(this, 2));

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    @NotNull
    public final Lazy f83920Z = LazyKt.lazy(new I90.p(this, 6));

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @NotNull
    public final Lazy f83922a0 = LazyKt.lazy(new I90.q(this, 4));

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @NotNull
    public final Lazy f83925c0 = LazyKt.lazy(new I90.r(this, 2));

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final Lazy f83937p0 = LazyKt.lazy(new com.bilibili.mediastreaming.audio.track.E(this, 1));

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final Lazy f83938r0 = LazyKt.lazy(new com.bilibili.ad.adview.pegasus.holders.inline.card136.composeview.b(this, 2));

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    @NotNull
    public final Lazy f83939v0 = LazyKt.lazy(new I90.v(this, 4));

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public boolean f83930g1 = true;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public boolean f83931h1 = true;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    @NotNull
    public final Lazy f83934k1 = LazyKt.lazy(new I90.x(this, 5));

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    @NotNull
    public final Lazy f83935l1 = LazyKt.lazy(new Up0.B(this, 4));

    @NotNull
    public final Lazy m1 = LazyKt.lazy(new Up0.C(this, 4));

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    @NotNull
    public final Lazy f83936n1 = LazyKt.lazy(LazyThreadSafetyMode.NONE, new I90.C(this, 4));

    public MultiTypeListDetailActivity() {
        final int i7 = 1;
        this.f83911S = LazyKt.lazy(new Function0(this, i7) { // from class: IF0.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f10177a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f10178b;

            {
                this.f10177a = i7;
                this.f10178b = this;
            }

            public final Object invoke() {
                Object obj = this.f10178b;
                switch (this.f10177a) {
                    case 0:
                        VideoThemeStyleFragment videoThemeStyleFragment = new VideoThemeStyleFragment();
                        ((BaseThemeStyleFragment) videoThemeStyleFragment).b = new AIStoryVideoStyleFragment.a((AIStoryVideoStyleFragment) obj);
                        return videoThemeStyleFragment;
                    case 1:
                        int i8 = MultiTypeListDetailActivity.f83895o1;
                        return (LinearLayout) ((MultiTypeListDetailActivity) obj).findViewById(2131309137);
                    case 2:
                        return new ViewModelProvider((MaterialChooseFragment) obj).get(MaterialChooseShareViewModel.class);
                    default:
                        return Integer.valueOf(((LazyStaggeredGridState) obj).c());
                }
            }
        });
    }

    public final void Q6(boolean z6) {
        SocializeInfo socializeInfo;
        U6().setSelected(z6);
        MultitypePlaylist.Info info = this.f83927d1;
        if (info == null || (socializeInfo = info.socializeInfo) == null) {
            return;
        }
        socializeInfo.collect += z6 ? 1 : -1;
        TextView textView = (TextView) this.f83914V.getValue();
        int i7 = socializeInfo.collect;
        textView.setText(i7 <= 0 ? getString(2131846948) : String.valueOf(i7));
    }

    @Override // com.bilibili.playset.playlist.helper.MultiTypeShareHelper.a
    public final void Q9() {
        SocializeInfo socializeInfo;
        ((PlaySetService) ServiceGenerator.createService(PlaySetService.class)).reportShareCount(X6(), 11, this.f83896D).enqueue();
        com.bilibili.playset.playlist.helper.b.a(X6(), BiliAccounts.get(this).mid());
        MultitypePlaylist.Info info = this.f83927d1;
        if (info == null || (socializeInfo = info.socializeInfo) == null) {
            return;
        }
        socializeInfo.share++;
        TextView textView = (TextView) this.f83915W.getValue();
        int i7 = socializeInfo.share;
        textView.setText(i7 <= 0 ? getText(2131841574) : com.bilibili.playset.utils.h.a(i7));
    }

    public final void R6(boolean z6) {
        SocializeInfo socializeInfo;
        ((ImageView) this.f83916X.getValue()).setSelected(z6);
        MultitypePlaylist.Info info = this.f83927d1;
        if (info == null || (socializeInfo = info.socializeInfo) == null) {
            return;
        }
        socializeInfo.thumb_up += z6 ? 1 : -1;
        TextView textView = (TextView) this.f83913U.getValue();
        int i7 = socializeInfo.thumb_up;
        textView.setText(i7 <= 0 ? getString(2131841358) : String.valueOf(i7));
    }

    public final Bundle S6() {
        Bundle bundle = new Bundle();
        BiliAccounts biliAccounts = BiliAccounts.get(this);
        MultitypePlaylist.Info info = this.f83927d1;
        if (info != null) {
            String str = (biliAccounts == null || biliAccounts.mid() != info.mid) ? "guest" : "creator";
            String str2 = (info.attr & 1) == 0 ? ServiceManager.DEFAULT_APP_NAME : "private";
            bundle.putString("visitor_status", str);
            bundle.putString("public_status", str2);
        }
        bundle.putLong("playlist_id", X6());
        return bundle;
    }

    public final long T6() {
        Upper upper;
        MultitypePlaylist.Info info = this.f83927d1;
        long j7 = (info == null || (upper = info.upper) == null) ? 0L : upper.mid;
        long jLongValue = j7;
        if (j7 == 0) {
            jLongValue = ((Number) this.m1.getValue()).longValue();
        }
        return jLongValue;
    }

    public final ImageView U6() {
        return (ImageView) this.f83918Y.getValue();
    }

    public final LinearLayout V6() {
        return (LinearLayout) this.f83922a0.getValue();
    }

    public final long X6() {
        return ((Number) this.f83935l1.getValue()).longValue();
    }

    public final ExpandableTextView Y6() {
        return (ExpandableTextView) this.f83907O.getValue();
    }

    public final LoadingErrorEmptyView a7() {
        return (LoadingErrorEmptyView) this.f83939v0.getValue();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    public final void b7() {
        Router.Companion.global().with(this).forResult(1001).open("activity://main/login/");
    }

    public final boolean c7() {
        return BiliAccounts.get(this).isLogin();
    }

    public final boolean d7(long j7) {
        return c7() && j7 == BiliAccounts.get(this).mid();
    }

    public final void e7(boolean z6) {
        PlaylistViewModel playlistViewModel = this.f83919Y0;
        PlaylistViewModel playlistViewModel2 = playlistViewModel;
        if (playlistViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlaylistViewModel");
            playlistViewModel2 = null;
        }
        long jX6 = X6();
        long jLongValue = ((Number) this.m1.getValue()).longValue();
        playlistViewModel2.f85538s = z6;
        playlistViewModel2.f85522b = z6 ? 1 : playlistViewModel2.f85522b;
        playlistViewModel2.f85523c = z6 ? 1 : playlistViewModel2.f85523c;
        if (z6) {
            playlistViewModel2.f85531l.setValue(1);
        }
        if (z6) {
            ((PlaySetService) ServiceGenerator.createService(PlaySetService.class)).getFullAmountIds(jX6, playlistViewModel2.f85523c).enqueue(new com.bilibili.playset.playlist.viewmodels.j(playlistViewModel2, z6, jX6, jLongValue));
            ((PlaySetService) ServiceGenerator.createService(PlaySetService.class)).getPlaylistBasicInfo(jX6).enqueue(new com.bilibili.playset.playlist.viewmodels.k(playlistViewModel2, z6));
            return;
        }
        playlistViewModel2.I0(jX6, jLongValue, z6);
        int i7 = playlistViewModel2.f85525e;
        if (i7 <= 1 || playlistViewModel2.f85524d > i7 || playlistViewModel2.f85539t.size() - playlistViewModel2.f85522b >= 5) {
            return;
        }
        ((PlaySetService) ServiceGenerator.createService(PlaySetService.class)).getFullAmountIds(jX6, playlistViewModel2.f85523c).enqueue(new com.bilibili.playset.playlist.viewmodels.m(playlistViewModel2));
    }

    public final void g7(boolean z6, boolean z7, boolean z8) {
        ((LinearLayout) this.f83910R.getValue()).setEnabled(z6);
        ((ImageView) this.f83916X.getValue()).setEnabled(z6);
        ((TextView) this.f83913U.getValue()).setEnabled(z6);
        U6().setEnabled(z7);
        ((TextView) this.f83914V.getValue()).setEnabled(z7);
        ((ImageView) this.f83920Z.getValue()).setEnabled(z8);
        ((TextView) this.f83915W.getValue()).setEnabled(z8);
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        return "playlist.playlist-detail.0.0.pv";
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @Nullable
    public final Bundle getPvExtra() {
        return S6();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v15, types: [android.content.DialogInterface$OnClickListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v27, types: [android.content.DialogInterface$OnClickListener, java.lang.Object] */
    @Override // com.bilibili.playset.dialog.PlaylistDetailBottomSheet.c
    public final void h(int i7) {
        switch (i7) {
            case 1:
                Router.RouterProxy routerProxyWith = Router.Companion.global().with(this).with("id", String.valueOf(X6()));
                MultitypePlaylist.Info info = this.f83927d1;
                Router.RouterProxy routerProxyWith2 = routerProxyWith.with("title", info != null ? info.title : null);
                MultitypePlaylist.Info info2 = this.f83927d1;
                Router.RouterProxy routerProxyWith3 = routerProxyWith2.with("intro", info2 != null ? info2.intro : null);
                MultitypePlaylist.Info info3 = this.f83927d1;
                Router.RouterProxy routerProxyWith4 = routerProxyWith3.with("cover", info3 != null ? info3.cover : null);
                MultitypePlaylist.Info info4 = this.f83927d1;
                Router.RouterProxy routerProxyWith5 = routerProxyWith4.with("cover_type", info4 != null ? String.valueOf(info4.cover_type) : null);
                MultitypePlaylist.Info info5 = this.f83927d1;
                Router.RouterProxy routerProxyWith6 = routerProxyWith5.with("is_default", String.valueOf(info5 != null && ((info5.attr >> 1) & 1) == 0));
                MultitypePlaylist.Info info6 = this.f83927d1;
                boolean z6 = false;
                if (info6 != null) {
                    z6 = false;
                    if ((info6.attr & 1) == 1) {
                        z6 = true;
                    }
                }
                routerProxyWith6.with("private", String.valueOf(z6)).forResult(1001).open("activity://playset/box/edit");
                b.a aVar = b.a.f85324a;
                aVar.a("playlist.playlist-detail.PLmanage-more.*.click");
                aVar.c("manage", "1");
                b.a.b();
                break;
            case 2:
                ToastHelper.showToastShort(getApplicationContext(), getString(2131842589));
                break;
            case 4:
                new AlertDialog.Builder(this).setTitle("").setMessage(getString(2131842604)).setNegativeButton(2131841494, (DialogInterface.OnClickListener) new Object()).setPositiveButton(2131841445, new DialogInterface.OnClickListener(this) { // from class: com.bilibili.playset.J

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final MultiTypeListDetailActivity f83878a;

                    {
                        this.f83878a = this;
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i8) {
                        MultiTypeListDetailActivity multiTypeListDetailActivity = this.f83878a;
                        int i9 = MultiTypeListDetailActivity.f83895o1;
                        multiTypeListDetailActivity.getClass();
                        b.a aVar2 = b.a.f85324a;
                        aVar2.a("playlist.playlist-detail.PLmanage-more.*.click");
                        aVar2.c("manage", "2");
                        b.a.b();
                        PlaylistViewModel playlistViewModel = multiTypeListDetailActivity.f83919Y0;
                        PlaylistViewModel playlistViewModel2 = playlistViewModel;
                        if (playlistViewModel == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mPlaylistViewModel");
                            playlistViewModel2 = null;
                        }
                        long jX6 = multiTypeListDetailActivity.X6();
                        playlistViewModel2.f85534o.setValue(-1);
                        com.bilibili.playset.api.m.a(String.valueOf(jX6), new com.bilibili.playset.playlist.viewmodels.h(playlistViewModel2));
                        dialogInterface.dismiss();
                    }
                }).show();
                break;
            case 5:
                if (!c7()) {
                    b7();
                } else {
                    Router.Companion.global().with(this).open("bilibili://browser?url=" + Uri.encode("https://www.bilibili.com/appeal/?playlistId=" + X6()));
                    b.a aVar2 = b.a.f85324a;
                    aVar2.a("playlist.playlist-detail.PLmanage-more.*.click");
                    aVar2.c("manage", "3");
                    b.a.b();
                }
                break;
            case 6:
                MultitypeMedia multitypeMedia = this.f83928e1;
                if (multitypeMedia != null) {
                    PlaylistViewModel playlistViewModel = this.f83919Y0;
                    if (playlistViewModel == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mPlaylistViewModel");
                        playlistViewModel = null;
                    }
                    playlistViewModel.K0(multitypeMedia.type, multitypeMedia.id, X6(), multitypeMedia.getKey());
                }
                break;
            case 7:
                if (!c7()) {
                    b7();
                } else {
                    final int i8 = 0;
                    BLRouter.routeTo(new RouteRequest.Builder(Uri.parse("bilibili://music/playlist/manage")).requestCode(2).extras(new Function1(this, i8) { // from class: com.bilibili.playset.F

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final int f83859a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final Object f83860b;

                        {
                            this.f83859a = i8;
                            this.f83860b = this;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:24:0x013c  */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object invoke(java.lang.Object r8) {
                            /*
                                Method dump skipped, instruction units count: 408
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.F.invoke(java.lang.Object):java.lang.Object");
                        }
                    }).build(), this);
                }
                break;
            case 8:
                new AlertDialog.Builder(this).setTitle("").setMessage(getString(2131842576)).setNegativeButton(2131841494, (DialogInterface.OnClickListener) new Object()).setPositiveButton(2131841455, new DialogInterface.OnClickListener(this) { // from class: com.bilibili.playset.H

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final MultiTypeListDetailActivity f83869a;

                    {
                        this.f83869a = this;
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i9) {
                        MultiTypeListDetailActivity multiTypeListDetailActivity = this.f83869a;
                        int i10 = MultiTypeListDetailActivity.f83895o1;
                        multiTypeListDetailActivity.getClass();
                        b.a aVar3 = b.a.f85324a;
                        aVar3.a("playlist.playlist-detail.PLmanage-more.*.click");
                        aVar3.c("manage", "5");
                        b.a.b();
                        PlaylistViewModel playlistViewModel2 = multiTypeListDetailActivity.f83919Y0;
                        PlaylistViewModel playlistViewModel3 = playlistViewModel2;
                        if (playlistViewModel2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mPlaylistViewModel");
                            playlistViewModel3 = null;
                        }
                        playlistViewModel3.J0(multiTypeListDetailActivity.X6());
                        dialogInterface.dismiss();
                    }
                }).show();
                break;
            case 9:
                MultitypeMedia multitypeMedia2 = this.f83928e1;
                if (multitypeMedia2 != null) {
                    if (multitypeMedia2.getCardType() == CollectionTypeEnum.SEASON) {
                        String key = multitypeMedia2.getKey();
                        long j7 = multitypeMedia2.id;
                        PlaylistViewModel playlistViewModel2 = this.f83919Y0;
                        if (playlistViewModel2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mPlaylistViewModel");
                            playlistViewModel2 = null;
                        }
                        playlistViewModel2.K0(21, j7, X6(), key);
                    } else if (multitypeMedia2.season != null) {
                        String key2 = multitypeMedia2.getKey();
                        MultitypeMedia multitypeMedia3 = multitypeMedia2.season;
                        long j8 = multitypeMedia3 != null ? multitypeMedia3.id : 0L;
                        PlaylistViewModel playlistViewModel3 = this.f83919Y0;
                        if (playlistViewModel3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mPlaylistViewModel");
                            playlistViewModel3 = null;
                        }
                        playlistViewModel3.K0(21, j8, X6(), key2);
                    }
                }
                break;
        }
    }

    public final void i7(int i7) {
        boolean z6 = (i7 & 1) == 0;
        boolean z7 = ((i7 >> 1) & 1) == 0;
        boolean zD7 = d7(T6());
        if (z7) {
            ((LinearLayout) this.f83908P.getValue()).setVisibility(8);
            ((RelativeLayout) this.f83909Q.getValue()).setLayoutParams(new AppBarLayout.LayoutParams(-1, ListExtentionsKt.toPx(40.0f)));
            return;
        }
        ((LinearLayout) this.f83908P.getValue()).setVisibility(0);
        if (z6) {
            g7(true, !zD7, true);
        } else {
            g7(true, false, false);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i7, int i8, @Nullable Intent intent) {
        long[] longArrayExtra;
        List<? extends MultitypeMedia> list;
        Integer numValueOf;
        int i9;
        super.onActivityResult(i7, i8, intent);
        if (i7 == 1001 && i8 == -1) {
            e7(true);
            return;
        }
        if (i7 == 1002 && i8 == -1) {
            if (intent != null) {
                String stringExtra = intent.getStringExtra("title");
                String stringExtra2 = intent.getStringExtra("intro");
                if (intent.getBooleanExtra("private", false)) {
                    MultitypePlaylist.Info info = this.f83927d1;
                    numValueOf = null;
                    if (info != null) {
                        i9 = info.attr | 1;
                        numValueOf = Integer.valueOf(i9);
                    }
                } else {
                    MultitypePlaylist.Info info2 = this.f83927d1;
                    numValueOf = null;
                    if (info2 != null) {
                        i9 = info2.attr & (-2);
                        numValueOf = Integer.valueOf(i9);
                    }
                }
                MultitypePlaylist.Info info3 = this.f83927d1;
                if (info3 != null) {
                    info3.title = stringExtra;
                }
                if (info3 != null) {
                    info3.intro = stringExtra2;
                }
                if (numValueOf != null) {
                    i7(numValueOf.intValue());
                    MultitypePlaylist.Info info4 = this.f83927d1;
                    if (info4 != null) {
                        info4.attr = numValueOf.intValue();
                    }
                }
                ((TintTextView) this.f83905M.getValue()).setText(stringExtra);
                if (TextUtils.isEmpty(stringExtra2)) {
                    Y6().setVisibility(8);
                    return;
                } else {
                    Y6().setVisibility(0);
                    Y6().setOriginText(new ExpandableTextView.d(stringExtra2));
                    return;
                }
            }
            return;
        }
        if (i7 != 2 || i8 != -1) {
            if (i7 != 4 || i8 != -1 || intent == null || (longArrayExtra = intent.getLongArrayExtra("removedIds")) == null || (list = this.f83926c1) == null) {
                return;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (ArraysKt.contains(longArrayExtra, ((MultitypeMedia) it.next()).id)) {
                    e7(true);
                }
            }
            return;
        }
        if (intent == null) {
            e7(true);
            return;
        }
        this.f83933j1 = intent.getBooleanExtra("key_result_is_create_folder", false);
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("sort_record");
        setResult(-1, intent);
        if (parcelableArrayListExtra != null && !parcelableArrayListExtra.isEmpty()) {
            Iterator it2 = parcelableArrayListExtra.iterator();
            while (it2.hasNext()) {
                if (!((SortRecord) it2.next()).isInvalid()) {
                    PlaylistViewModel playlistViewModel = this.f83919Y0;
                    if (playlistViewModel == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mPlaylistViewModel");
                        playlistViewModel = null;
                    }
                    final int i10 = 0;
                    playlistViewModel.L0(X6(), CollectionsKt.p(parcelableArrayListExtra, ",", (CharSequence) null, (CharSequence) null, new Function1(i10) { // from class: com.bilibili.playset.q

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final int f85610a;

                        {
                            this.f85610a = i10;
                        }

                        public final Object invoke(Object obj) {
                            switch (this.f85610a) {
                                case 0:
                                    int i11 = MultiTypeListDetailActivity.f83895o1;
                                    return ((SortRecord) obj).toString();
                                default:
                                    z01.s sVar = (z01.s) obj;
                                    return Boolean.valueOf(!sVar.d && sVar.e);
                            }
                        }
                    }, 30));
                    return;
                }
            }
        }
        e7(true);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View view) throws Throwable {
        MultitypePlaylist.Info info;
        Upper upper;
        Integer numValueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (numValueOf != null && numValueOf.intValue() == 2131309100) {
            MultitypePlaylist.Info info2 = this.f83927d1;
            if (info2 == null || (upper = info2.upper) == null) {
                return;
            }
            Router.Companion.global().with(this).with(EditCustomizeSticker.TAG_MID, String.valueOf(upper.mid)).with("name", upper.name).open("activity://main/authorspace");
            return;
        }
        int i7 = 2;
        if (numValueOf != null && numValueOf.intValue() == 2131309143) {
            if (!c7()) {
                b7();
                return;
            }
            boolean zIsSelected = ((ImageView) this.f83916X.getValue()).isSelected();
            Long l7 = this.f83929f1;
            if (l7 != null) {
                final long jLongValue = l7.longValue();
                PlaylistViewModel playlistViewModel = this.f83919Y0;
                if (playlistViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPlaylistViewModel");
                    playlistViewModel = null;
                }
                final long jX6 = X6();
                int i8 = !zIsSelected ? 1 : 2;
                final String strCurrentPolarisActionId = PageViewTracker.getInstance().currentPolarisActionId();
                playlistViewModel.getClass();
                final int i9 = i8;
                com.bilibili.playset.api.t.a(new Function1(i9, jX6, jLongValue, strCurrentPolarisActionId) { // from class: com.bilibili.playset.playlist.viewmodels.e

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final long f85573a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final int f85574b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final long f85575c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final String f85576d;

                    {
                        this.f85573a = jX6;
                        this.f85574b = i9;
                        this.f85575c = jLongValue;
                        this.f85576d = strCurrentPolarisActionId;
                    }

                    public final Object invoke(Object obj) {
                        PlaySetService playSetService = (PlaySetService) ServiceGenerator.createService(PlaySetService.class);
                        String str = this.f85576d;
                        return playSetService.likePlaylist(this.f85573a, this.f85574b, 11, this.f85575c, "playlist.playlist-detail.0.0", "playlist.playlist-video-detail.0.0", str, (String) obj);
                    }
                }, "collection_thunmbup", new com.bilibili.playset.playlist.viewmodels.l(i8, playlistViewModel));
                long jX62 = X6();
                b.a aVar = b.a.f85324a;
                aVar.a("playlist.playlist-detail.PLlike.0.click");
                aVar.c(IVideoLikeRouteService.ACTION_LIKE, zIsSelected ? "2" : "1");
                aVar.c("playlist_id", String.valueOf(jX62));
                String strCurrentPolarisActionId2 = PageViewTracker.getInstance().currentPolarisActionId();
                String str = strCurrentPolarisActionId2;
                if (strCurrentPolarisActionId2 == null) {
                    str = "";
                }
                aVar.c("action_id", str);
                b.a.b();
                return;
            }
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == 2131309137) {
            if (!c7()) {
                b7();
                return;
            }
            if (!U6().isEnabled()) {
                ToastHelper.showToastShort(this, 2131842594);
                return;
            }
            Neurons.reportClick(false, "playlist.playlist-detail.PLfavorite.0.click", MapsKt.mapOf(new Pair("favoritePL", U6().isSelected() ? "2" : "1")));
            if (U6().isSelected()) {
                Q6(false);
                PlaylistViewModel playlistViewModel2 = this.f83919Y0;
                PlaylistViewModel playlistViewModel3 = playlistViewModel2;
                if (playlistViewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPlaylistViewModel");
                    playlistViewModel3 = null;
                }
                long jX63 = X6();
                String strCurrentPolarisActionId3 = PageViewTracker.getInstance().currentPolarisActionId();
                playlistViewModel3.getClass();
                ((PlaySetService) ServiceGenerator.createService(PlaySetService.class)).unFavPlaySet(jX63, "playlist.playlist-detail.0.0", "playlist.playlist-video-detail.0.0", strCurrentPolarisActionId3).enqueue(new com.bilibili.playset.playlist.viewmodels.n(playlistViewModel3));
            } else {
                Q6(true);
                PlaylistViewModel playlistViewModel4 = this.f83919Y0;
                PlaylistViewModel playlistViewModel5 = playlistViewModel4;
                if (playlistViewModel4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPlaylistViewModel");
                    playlistViewModel5 = null;
                }
                final long jX64 = X6();
                final String strCurrentPolarisActionId4 = PageViewTracker.getInstance().currentPolarisActionId();
                playlistViewModel5.getClass();
                com.bilibili.playset.api.t.a(new Function1(jX64, strCurrentPolarisActionId4) { // from class: com.bilibili.playset.playlist.viewmodels.d

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final long f85571a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final String f85572b;

                    {
                        this.f85571a = jX64;
                        this.f85572b = strCurrentPolarisActionId4;
                    }

                    public final Object invoke(Object obj) {
                        PlaySetService playSetService = (PlaySetService) ServiceGenerator.createService(PlaySetService.class);
                        String str2 = this.f85572b;
                        return playSetService.favPlaylist(this.f85571a, "playlist.playlist-detail.0.0", "playlist.playlist-video-detail.0.0", str2, (String) obj);
                    }
                }, "collection_favorite", new com.bilibili.playset.playlist.viewmodels.i(playlistViewModel5));
            }
            if (Intrinsics.areEqual(this.f83932i1, Boolean.TRUE)) {
                Intent intent = new Intent();
                intent.putExtra("playlistId", X6());
                intent.putExtra("is_delete", false);
                intent.putExtra("key_result_is_create_folder", this.f83933j1);
                if (U6().isSelected()) {
                    setResult(-1, null);
                    return;
                } else {
                    setResult(-1, intent);
                    return;
                }
            }
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == 2131309150) {
            if (!((ImageView) this.f83920Z.getValue()).isEnabled()) {
                ToastHelper.showToastShort(this, 2131842564);
                return;
            }
            if (!c7()) {
                b7();
                return;
            }
            MultitypePlaylist.Info info3 = this.f83927d1;
            if (info3 != null) {
                ((MultiTypeShareHelper) this.f83934k1.getValue()).a(info3);
                return;
            }
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == 2131310413) {
            Neurons.reportClick$default(false, "playlist.playlist-detail.playall-button.0.click", (Map) null, 4, (Object) null);
            Router.Companion.global().with(this).forResult(4).open(Uri.parse("bilibili://music/playlist/playpage/" + X6()).buildUpon().appendQueryParameter("from_spmid", "playlist.playlist-detail.0.0").appendQueryParameter("page_type", "3").build());
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == 2131304412) {
            Neurons.reportClick$default(false, "playlist.playlist-detail.search.0.click", (Map) null, 4, (Object) null);
            BLRouter.routeTo$default(RouteRequestKt.toRouteRequest("bilibili://music/search2?media_id=" + X6()), (Context) null, 2, (Object) null);
            return;
        }
        if (numValueOf == null || numValueOf.intValue() != 2131304411 || getSupportFragmentManager() == null || (info = this.f83927d1) == null) {
            return;
        }
        Upper upper2 = info.upper;
        if (!d7(upper2 != null ? upper2.mid : 0L)) {
            i7 = 0;
        } else if (!this.f83930g1) {
            i7 = 1;
        }
        ArrayList<OperateItem> arrayList = PlaylistDetailBottomSheet.f84715e;
        PlaylistDetailBottomSheet playlistDetailBottomSheetA = PlaylistDetailBottomSheet.a.a(i7);
        playlistDetailBottomSheetA.show(getSupportFragmentManager(), "PlaylistDetailBottomSheet");
        playlistDetailBottomSheetA.f84727d.f84729b = this;
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.lifecycle.Observer, java.lang.Object] */
    @Override // com.bilibili.lib.ui.BaseToolbarActivity, com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131499721);
        this.f83919Y0 = (PlaylistViewModel) new ViewModelProvider(this).get(PlaylistViewModel.class);
        ensureToolbar();
        showBackButton();
        StatusBarCompat.immersiveStatusBar(this);
        Toolbar toolbar = this.mToolbar;
        if (toolbar != null) {
            toolbar.setPadding(toolbar.getPaddingLeft(), StatusBarCompat.getStatusBarHeight(this) + toolbar.getPaddingTop(), toolbar.getPaddingRight(), toolbar.getPaddingBottom());
        }
        ((TintAppBarLayout) this.f83897E.getValue()).addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener(this) { // from class: com.bilibili.playset.y

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MultiTypeListDetailActivity f85833a;

            {
                this.f85833a = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:8:0x005b  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onOffsetChanged(com.google.android.material.appbar.AppBarLayout r5, int r6) {
                /*
                    r4 = this;
                    int r0 = com.bilibili.playset.MultiTypeListDetailActivity.f83895o1
                    r8 = r0
                    r0 = r5
                    int r0 = r0.getTotalScrollRange()
                    r8 = r0
                    r0 = r6
                    int r0 = java.lang.Math.abs(r0)
                    float r0 = (float) r0
                    r1 = r8
                    float r1 = (float) r1
                    float r0 = r0 / r1
                    r7 = r0
                    r0 = r4
                    com.bilibili.playset.MultiTypeListDetailActivity r0 = r0.f85833a
                    r11 = r0
                    r0 = r11
                    kotlin.Lazy r0 = r0.f83901I
                    java.lang.Object r0 = r0.getValue()
                    android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
                    r1 = 1065353216(0x3f800000, float:1.0)
                    r2 = r7
                    float r1 = r1 - r2
                    r0.setAlpha(r1)
                    r0 = r11
                    kotlin.Lazy r0 = r0.f83898F
                    java.lang.Object r0 = r0.getValue()
                    com.bilibili.magicasakura.widgets.TintTextView r0 = (com.bilibili.magicasakura.widgets.TintTextView) r0
                    r10 = r0
                    r0 = r7
                    r1 = 1065353216(0x3f800000, float:1.0)
                    int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                    if (r0 != 0) goto L66
                    r0 = r11
                    com.bilibili.playset.api.MultitypePlaylist$Info r0 = r0.f83927d1
                    r5 = r0
                    r0 = r5
                    if (r0 == 0) goto L5b
                    r0 = r5
                    java.lang.String r0 = r0.title
                    r9 = r0
                    r0 = r9
                    r5 = r0
                    r0 = r9
                    if (r0 != 0) goto L69
                L5b:
                    r0 = r11
                    r1 = 2131842504(0x7f1155c8, float:1.9318346E38)
                    java.lang.String r0 = r0.getString(r1)
                    r5 = r0
                    goto L69
                L66:
                    java.lang.String r0 = ""
                    r5 = r0
                L69:
                    r0 = r10
                    r1 = r5
                    r0.setText(r1)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.C6007y.onOffsetChanged(com.google.android.material.appbar.AppBarLayout, int):void");
            }
        });
        ImageView imageView = (ImageView) a7().findViewById(2131301895);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
        marginLayoutParams.topMargin = ListExtentionsKt.toPx(-180.0f);
        imageView.setLayoutParams(marginLayoutParams);
        ((TextView) this.f83904L.getValue()).setCompoundDrawablePadding(4);
        ((ImageView) this.f83925c0.getValue()).setAlpha(NightTheme.isNightTheme(this) ? 0.7f : 1.0f);
        ((View) this.f83903K.getValue()).setVisibility(NightTheme.isNightTheme(this) ? 0 : 8);
        os0.r rVar = new os0.r(this);
        this.f83921Z0 = rVar;
        long jX6 = X6();
        boolean zD7 = d7(T6());
        rVar.f124970e = Long.valueOf(jX6);
        rVar.f124971f = Boolean.valueOf(zD7);
        this.f83924b1 = new LinearLayoutManager(this);
        ((RecyclerView) this.f83938r0.getValue()).setLayoutManager(this.f83924b1);
        ((RecyclerView) this.f83938r0.getValue()).addOnScrollListener((com.bilibili.playset.playlist.helper.a) this.f83936n1.getValue());
        ((RecyclerView) this.f83938r0.getValue()).setAdapter(this.f83921Z0);
        os0.r rVar2 = this.f83921Z0;
        if (rVar2 != null) {
            rVar2.f124967b = new N(this);
        }
        ((RecyclerView) this.f83938r0.getValue()).addOnScrollListener(new O(this));
        ((TintTextView) this.f83906N.getValue()).setOnClickListener(this);
        ((LinearLayout) this.f83910R.getValue()).setOnClickListener(this);
        ((LinearLayout) this.f83911S.getValue()).setOnClickListener(this);
        ((LinearLayout) this.f83912T.getValue()).setOnClickListener(this);
        V6().setOnClickListener(this);
        ((ImageView) this.f83899G.getValue()).setOnClickListener(this);
        ((ImageView) this.f83900H.getValue()).setOnClickListener(this);
        e7(true);
        PlaylistViewModel playlistViewModel = this.f83919Y0;
        PlaylistViewModel playlistViewModel2 = playlistViewModel;
        if (playlistViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlaylistViewModel");
            playlistViewModel2 = null;
        }
        playlistViewModel2.f85531l.observe(this, new com.bilibili.bplus.followinglist.page.campus.alumnae.f(this, 1));
        PlaylistViewModel playlistViewModel3 = this.f83919Y0;
        PlaylistViewModel playlistViewModel4 = playlistViewModel3;
        if (playlistViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlaylistViewModel");
            playlistViewModel4 = null;
        }
        playlistViewModel4.f85532m.observe(this, (Observer<? super Integer>) new Object());
        PlaylistViewModel playlistViewModel5 = this.f83919Y0;
        PlaylistViewModel playlistViewModel6 = playlistViewModel5;
        if (playlistViewModel5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlaylistViewModel");
            playlistViewModel6 = null;
        }
        playlistViewModel6.f85526f.observe(this, new Observer(this) { // from class: com.bilibili.playset.v

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MultiTypeListDetailActivity f85661a;

            {
                this.f85661a = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                ArrayList arrayList = (ArrayList) obj;
                MultiTypeListDetailActivity multiTypeListDetailActivity = this.f85661a;
                multiTypeListDetailActivity.f83926c1 = arrayList;
                com.bilibili.playset.playlist.helper.a aVar = (com.bilibili.playset.playlist.helper.a) multiTypeListDetailActivity.f83936n1.getValue();
                aVar.f85322b = -1;
                aVar.f85323c = -1;
                os0.r rVar3 = multiTypeListDetailActivity.f83921Z0;
                if (rVar3 != null) {
                    rVar3.f124968c = multiTypeListDetailActivity.d7(multiTypeListDetailActivity.T6());
                }
                os0.r rVar4 = multiTypeListDetailActivity.f83921Z0;
                if (rVar4 != null) {
                    PlaylistViewModel playlistViewModel7 = multiTypeListDetailActivity.f83919Y0;
                    PlaylistViewModel playlistViewModel8 = playlistViewModel7;
                    if (playlistViewModel7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mPlaylistViewModel");
                        playlistViewModel8 = null;
                    }
                    if (playlistViewModel8.f85538s) {
                        rVar4.f124966a.clear();
                    }
                    rVar4.f124966a.addAll(arrayList);
                    rVar4.notifyDataSetChanged();
                }
                os0.r rVar5 = multiTypeListDetailActivity.f83921Z0;
                if (rVar5 != null) {
                    rVar5.notifyDataSetChanged();
                }
            }
        });
        PlaylistViewModel playlistViewModel7 = this.f83919Y0;
        PlaylistViewModel playlistViewModel8 = playlistViewModel7;
        if (playlistViewModel7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlaylistViewModel");
            playlistViewModel8 = null;
        }
        playlistViewModel8.f85527g.observe(this, new Observer(this) { // from class: com.bilibili.playset.z

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MultiTypeListDetailActivity f85834a;

            {
                this.f85834a = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                MultitypePlaylist.Info info = (MultitypePlaylist.Info) obj;
                MultiTypeListDetailActivity multiTypeListDetailActivity = this.f85834a;
                multiTypeListDetailActivity.f83927d1 = info;
                multiTypeListDetailActivity.i7(info.attr);
                multiTypeListDetailActivity.f83930g1 = ((info.attr >> 1) & 1) == 0;
                if (info.cover_type == 12) {
                    ImageExtentionKt.displayImage$default((BiliImageView) multiTypeListDetailActivity.f83902J.getValue(), info.cover, (ThumbnailUrlTransformStrategy) null, (ImageLoadingListener) null, CommonDialogUtilsKt.dp2px(72, multiTypeListDetailActivity), CommonDialogUtilsKt.dp2px(72, multiTypeListDetailActivity), false, false, ScaleType.FIT_CENTER, (BitmapTransformation) null, false, 870, (Object) null);
                } else {
                    ImageExtentionKt.displayImage$default((BiliImageView) multiTypeListDetailActivity.f83902J.getValue(), info.cover, (ThumbnailUrlTransformStrategy) null, (ImageLoadingListener) null, CommonDialogUtilsKt.dp2px(128, multiTypeListDetailActivity), CommonDialogUtilsKt.dp2px(72, multiTypeListDetailActivity), false, false, ScaleType.CENTER_CROP, (BitmapTransformation) null, false, 870, (Object) null);
                }
                ((TintTextView) multiTypeListDetailActivity.f83905M.getValue()).setText(info.title);
                if (TextUtils.isEmpty(info.intro)) {
                    multiTypeListDetailActivity.Y6().setVisibility(8);
                } else {
                    multiTypeListDetailActivity.Y6().setVisibility(0);
                    multiTypeListDetailActivity.Y6().setOriginText(new ExpandableTextView.d(info.intro));
                }
                SocializeInfo socializeInfo = info.socializeInfo;
                Integer numValueOf = null;
                Integer numValueOf2 = socializeInfo != null ? Integer.valueOf(socializeInfo.thumb_up) : null;
                SocializeInfo socializeInfo2 = info.socializeInfo;
                Integer numValueOf3 = socializeInfo2 != null ? Integer.valueOf(socializeInfo2.collect) : null;
                SocializeInfo socializeInfo3 = info.socializeInfo;
                if (socializeInfo3 != null) {
                    numValueOf = Integer.valueOf(socializeInfo3.share);
                }
                int i7 = info.likeState;
                int i8 = info.favState;
                if (multiTypeListDetailActivity.c7() && multiTypeListDetailActivity.f83931h1) {
                    multiTypeListDetailActivity.f83931h1 = false;
                    multiTypeListDetailActivity.f83932i1 = Boolean.valueOf(info.favState > 0);
                }
                if (numValueOf2 != null) {
                    ((TextView) multiTypeListDetailActivity.f83913U.getValue()).setText(numValueOf2.intValue() <= 0 ? multiTypeListDetailActivity.getText(2131841358) : com.bilibili.playset.utils.h.a(numValueOf2.intValue()));
                }
                if (numValueOf3 != null) {
                    ((TextView) multiTypeListDetailActivity.f83914V.getValue()).setText(numValueOf3.intValue() <= 0 ? multiTypeListDetailActivity.getText(2131846948) : com.bilibili.playset.utils.h.a(numValueOf3.intValue()));
                }
                if (numValueOf != null) {
                    ((TextView) multiTypeListDetailActivity.f83915W.getValue()).setText(numValueOf.intValue() <= 0 ? multiTypeListDetailActivity.getText(2131841574) : com.bilibili.playset.utils.h.a(numValueOf.intValue()));
                }
                ((ImageView) multiTypeListDetailActivity.f83916X.getValue()).setSelected(i7 > 0);
                boolean zD72 = multiTypeListDetailActivity.d7(multiTypeListDetailActivity.T6());
                if (zD72) {
                    if ((info.attr & 2) == 0) {
                        com.bilibili.playset.utils.g.a(multiTypeListDetailActivity, FolderGroupEnum.DEFAULT);
                    } else {
                        com.bilibili.playset.utils.g.a(multiTypeListDetailActivity, FolderGroupEnum.CREATED);
                    }
                } else if (i8 > 0) {
                    com.bilibili.playset.utils.g.a(multiTypeListDetailActivity, FolderGroupEnum.COLLECTED);
                }
                if (zD72) {
                    multiTypeListDetailActivity.U6().setEnabled(false);
                } else {
                    multiTypeListDetailActivity.U6().setEnabled(true);
                    multiTypeListDetailActivity.U6().setSelected(i8 > 0);
                }
                ((TintTextView) multiTypeListDetailActivity.f83937p0.getValue()).setText(multiTypeListDetailActivity.getString(2131842579, new Object[]{Integer.valueOf(info.mediaCount)}));
                Upper upper = info.upper;
                if (upper != null) {
                    multiTypeListDetailActivity.f83929f1 = Long.valueOf(upper.mid);
                    ((TintTextView) multiTypeListDetailActivity.f83906N.getValue()).setText(multiTypeListDetailActivity.getString(2131842495, new Object[]{upper.name}));
                    MultitypePlaylist.Info info2 = multiTypeListDetailActivity.f83927d1;
                    if (info2 != null) {
                        Long l7 = multiTypeListDetailActivity.f83929f1;
                        boolean zD73 = multiTypeListDetailActivity.d7(l7 != null ? l7.longValue() : 0L);
                        os0.r rVar3 = multiTypeListDetailActivity.f83921Z0;
                        if ((rVar3 == null || zD73 != rVar3.f124968c) && rVar3 != null) {
                            rVar3.notifyDataSetChanged();
                        }
                        if (!zD73) {
                            ((TextView) multiTypeListDetailActivity.f83904L.getValue()).setVisibility(8);
                        } else if (((info2.attr >> 6) & 1) == 1) {
                            ((TextView) multiTypeListDetailActivity.f83904L.getValue()).setVisibility(0);
                        }
                    }
                }
                PageViewTracker.getInstance().setExtra(multiTypeListDetailActivity, "playlist.playlist-detail.0.0.pv", multiTypeListDetailActivity.S6());
            }
        });
        PlaylistViewModel playlistViewModel9 = this.f83919Y0;
        PlaylistViewModel playlistViewModel10 = playlistViewModel9;
        if (playlistViewModel9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlaylistViewModel");
            playlistViewModel10 = null;
        }
        playlistViewModel10.h.observe(this, new Observer(this) { // from class: com.bilibili.playset.B

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MultiTypeListDetailActivity f83846a;

            {
                this.f83846a = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                int i7 = MultiTypeListDetailActivity.f83895o1;
                MultiTypeListDetailActivity multiTypeListDetailActivity = this.f83846a;
                if (!zBooleanValue) {
                    ToastHelper.showToastShort(multiTypeListDetailActivity, 2131841697);
                } else {
                    multiTypeListDetailActivity.R6(true);
                    ToastHelper.showToastShort(multiTypeListDetailActivity, 2131842461);
                }
            }
        });
        PlaylistViewModel playlistViewModel11 = this.f83919Y0;
        PlaylistViewModel playlistViewModel12 = playlistViewModel11;
        if (playlistViewModel11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlaylistViewModel");
            playlistViewModel12 = null;
        }
        playlistViewModel12.f85528i.observe(this, new Observer(this) { // from class: com.bilibili.playset.w

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MultiTypeListDetailActivity f85665a;

            {
                this.f85665a = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                int i7 = MultiTypeListDetailActivity.f83895o1;
                MultiTypeListDetailActivity multiTypeListDetailActivity = this.f85665a;
                if (!zBooleanValue) {
                    ToastHelper.showToastShort(multiTypeListDetailActivity, 2131842612);
                } else {
                    multiTypeListDetailActivity.R6(false);
                    ToastHelper.showToastShort(multiTypeListDetailActivity, 2131842492);
                }
            }
        });
        PlaylistViewModel playlistViewModel13 = this.f83919Y0;
        PlaylistViewModel playlistViewModel14 = playlistViewModel13;
        if (playlistViewModel13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlaylistViewModel");
            playlistViewModel14 = null;
        }
        playlistViewModel14.f85529j.observe(this, new com.bilibili.bplus.followinglist.page.campus.alumnae.e(this, 1));
        PlaylistViewModel playlistViewModel15 = this.f83919Y0;
        PlaylistViewModel playlistViewModel16 = playlistViewModel15;
        if (playlistViewModel15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlaylistViewModel");
            playlistViewModel16 = null;
        }
        playlistViewModel16.f85530k.observe(this, new Observer(this) { // from class: com.bilibili.playset.x

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MultiTypeListDetailActivity f85823a;

            {
                this.f85823a = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                int i7 = MultiTypeListDetailActivity.f83895o1;
                MultiTypeListDetailActivity multiTypeListDetailActivity = this.f85823a;
                if (zBooleanValue) {
                    ToastHelper.showToastShort(multiTypeListDetailActivity, 2131842571);
                } else {
                    multiTypeListDetailActivity.Q6(true);
                }
            }
        });
        PlaylistViewModel playlistViewModel17 = this.f83919Y0;
        PlaylistViewModel playlistViewModel18 = playlistViewModel17;
        if (playlistViewModel17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlaylistViewModel");
            playlistViewModel18 = null;
        }
        playlistViewModel18.f85533n.observe(this, new Observer(this) { // from class: com.bilibili.playset.A

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MultiTypeListDetailActivity f83842a;

            {
                this.f83842a = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                MultitypeMedia multitypeMedia;
                MultitypeMedia multitypeMedia2;
                ArrayList<MultitypeMedia> arrayList;
                ArrayList<MultitypeMedia> arrayList2;
                MultitypeMedia next;
                Bundle bundle2 = (Bundle) obj;
                int i7 = MultiTypeListDetailActivity.f83895o1;
                int i8 = bundle2.getInt("loading_status");
                MultiTypeListDetailActivity multiTypeListDetailActivity = this.f83842a;
                if (i8 != -3) {
                    if (i8 != -2) {
                        if (i8 != -1) {
                            return;
                        }
                        multiTypeListDetailActivity.f83917X0 = TintProgressDialog.show(multiTypeListDetailActivity, null, multiTypeListDetailActivity.getResources().getString(2131842520), true, false);
                        return;
                    } else {
                        TintProgressDialog tintProgressDialog = multiTypeListDetailActivity.f83917X0;
                        if (tintProgressDialog != null) {
                            tintProgressDialog.dismiss();
                        }
                        ToastHelper.showToastShort(multiTypeListDetailActivity, 2131846937);
                        return;
                    }
                }
                TintProgressDialog tintProgressDialog2 = multiTypeListDetailActivity.f83917X0;
                if (tintProgressDialog2 != null) {
                    tintProgressDialog2.dismiss();
                }
                ToastHelper.showToastShort(multiTypeListDetailActivity, 2131842571);
                String string = bundle2.getString("data_key");
                os0.r rVar3 = multiTypeListDetailActivity.f83921Z0;
                if (rVar3 == null || (arrayList2 = rVar3.f124966a) == null) {
                    multitypeMedia = null;
                } else {
                    Iterator<MultitypeMedia> it = arrayList2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        } else {
                            next = it.next();
                            if (Intrinsics.areEqual(next.getKey(), string)) {
                                break;
                            }
                        }
                    }
                    multitypeMedia = next;
                }
                if (multitypeMedia == null) {
                    return;
                }
                os0.r rVar4 = multiTypeListDetailActivity.f83921Z0;
                int iIndexOf = -1;
                if (rVar4 != null) {
                    ArrayList<MultitypeMedia> arrayList3 = rVar4.f124966a;
                    iIndexOf = -1;
                    if (arrayList3 != null) {
                        iIndexOf = arrayList3.indexOf(multitypeMedia);
                    }
                }
                int i9 = bundle2.getInt("media_type");
                if (iIndexOf >= 0) {
                    os0.r rVar5 = multiTypeListDetailActivity.f83921Z0;
                    if (iIndexOf >= ((rVar5 == null || (arrayList = rVar5.f124966a) == null) ? 0 : arrayList.size())) {
                        return;
                    }
                    TintTextView tintTextView = (TintTextView) multiTypeListDetailActivity.f83937p0.getValue();
                    MultitypePlaylist.Info info = multiTypeListDetailActivity.f83927d1;
                    tintTextView.setText(multiTypeListDetailActivity.getString(2131842579, new Object[]{Integer.valueOf(info != null ? info.mediaCount : 0)}));
                    if (multitypeMedia.type == 21 || (multitypeMedia2 = multitypeMedia.season) == null) {
                        MultitypePlaylist.Info info2 = multiTypeListDetailActivity.f83927d1;
                        if (info2 != null) {
                            info2.remove(1);
                        }
                        TintTextView tintTextView2 = (TintTextView) multiTypeListDetailActivity.f83937p0.getValue();
                        MultitypePlaylist.Info info3 = multiTypeListDetailActivity.f83927d1;
                        int i10 = 0;
                        if (info3 != null) {
                            i10 = info3.mediaCount;
                        }
                        tintTextView2.setText(multiTypeListDetailActivity.getString(2131842579, new Object[]{Integer.valueOf(i10)}));
                        os0.r rVar6 = multiTypeListDetailActivity.f83921Z0;
                        if (rVar6 != null) {
                            rVar6.f124966a.remove(iIndexOf);
                            rVar6.notifyItemRemoved(iIndexOf);
                        }
                    } else if (i9 != 21) {
                        os0.r rVar7 = multiTypeListDetailActivity.f83921Z0;
                        if (rVar7 != null && iIndexOf >= 0 && iIndexOf < rVar7.f124966a.size()) {
                            rVar7.f124966a.set(iIndexOf, multitypeMedia2);
                            rVar7.notifyItemChanged(iIndexOf);
                        }
                    } else {
                        multitypeMedia.season = null;
                        os0.r rVar8 = multiTypeListDetailActivity.f83921Z0;
                        if (rVar8 != null) {
                            rVar8.notifyItemChanged(iIndexOf);
                        }
                    }
                    os0.r rVar9 = multiTypeListDetailActivity.f83921Z0;
                    if (rVar9 == null || rVar9.f124966a.size() != 0) {
                        return;
                    }
                    multiTypeListDetailActivity.V6().setVisibility(8);
                    ((RelativeLayout) multiTypeListDetailActivity.f83909Q.getValue()).setVisibility(8);
                }
            }
        });
        PlaylistViewModel playlistViewModel19 = this.f83919Y0;
        PlaylistViewModel playlistViewModel20 = playlistViewModel19;
        if (playlistViewModel19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlaylistViewModel");
            playlistViewModel20 = null;
        }
        playlistViewModel20.f85534o.observe(this, new Observer(this) { // from class: com.bilibili.playset.r

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MultiTypeListDetailActivity f85612a;

            {
                this.f85612a = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                int iIntValue = ((Integer) obj).intValue();
                int i7 = MultiTypeListDetailActivity.f83895o1;
                MultiTypeListDetailActivity multiTypeListDetailActivity = this.f85612a;
                if (iIntValue == -2) {
                    TintProgressDialog tintProgressDialog = multiTypeListDetailActivity.f83917X0;
                    if (tintProgressDialog != null) {
                        tintProgressDialog.dismiss();
                    }
                    ToastHelper.showToastShort(multiTypeListDetailActivity, 2131841692);
                    return;
                }
                if (iIntValue == -1) {
                    multiTypeListDetailActivity.f83917X0 = TintProgressDialog.show(multiTypeListDetailActivity, null, multiTypeListDetailActivity.getResources().getString(2131842520), true, false);
                    return;
                }
                if (iIntValue != 1) {
                    return;
                }
                TintProgressDialog tintProgressDialog2 = multiTypeListDetailActivity.f83917X0;
                if (tintProgressDialog2 != null) {
                    tintProgressDialog2.dismiss();
                }
                ToastHelper.showToastShort(multiTypeListDetailActivity, 2131841480);
                Intent intent = new Intent();
                intent.putExtra("playlistId", multiTypeListDetailActivity.X6());
                intent.putExtra("is_delete", true);
                intent.putExtra("key_result_is_create_folder", multiTypeListDetailActivity.f83933j1);
                multiTypeListDetailActivity.setResult(-1, intent);
                multiTypeListDetailActivity.finish();
            }
        });
        PlaylistViewModel playlistViewModel21 = this.f83919Y0;
        PlaylistViewModel playlistViewModel22 = playlistViewModel21;
        if (playlistViewModel21 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlaylistViewModel");
            playlistViewModel22 = null;
        }
        playlistViewModel22.f85535p.observe(this, new Observer(this) { // from class: com.bilibili.playset.t

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MultiTypeListDetailActivity f85614a;

            {
                this.f85614a = this;
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                String str = (String) obj;
                int i7 = MultiTypeListDetailActivity.f83895o1;
                int iHashCode = str.hashCode();
                MultiTypeListDetailActivity multiTypeListDetailActivity = this.f85614a;
                switch (iHashCode) {
                    case -1867169789:
                        if (str.equals("success")) {
                            TintProgressDialog tintProgressDialog = multiTypeListDetailActivity.f83917X0;
                            if (tintProgressDialog != null) {
                                tintProgressDialog.dismiss();
                            }
                            ToastHelper.showToastShort(multiTypeListDetailActivity, multiTypeListDetailActivity.getString(2131841348));
                            multiTypeListDetailActivity.e7(true);
                            ((RecyclerView) multiTypeListDetailActivity.f83938r0.getValue()).scrollToPosition(0);
                            return;
                        }
                        break;
                    case -1313911455:
                        if (str.equals("timeout")) {
                            TintProgressDialog tintProgressDialog2 = multiTypeListDetailActivity.f83917X0;
                            if (tintProgressDialog2 != null) {
                                tintProgressDialog2.dismiss();
                            }
                            ToastHelper.showToastShort(multiTypeListDetailActivity, multiTypeListDetailActivity.getString(2131841420));
                            return;
                        }
                        break;
                    case 336650556:
                        if (str.equals("loading")) {
                            multiTypeListDetailActivity.f83917X0 = TintProgressDialog.show(multiTypeListDetailActivity, null, multiTypeListDetailActivity.getResources().getString(2131842520), true, false);
                            return;
                        }
                        break;
                    case 1296933515:
                        if (str.equals("neterror")) {
                            TintProgressDialog tintProgressDialog3 = multiTypeListDetailActivity.f83917X0;
                            if (tintProgressDialog3 != null) {
                                tintProgressDialog3.dismiss();
                            }
                            ToastHelper.showToastShort(multiTypeListDetailActivity, multiTypeListDetailActivity.getString(2131842483));
                            return;
                        }
                        break;
                }
                TintProgressDialog tintProgressDialog4 = multiTypeListDetailActivity.f83917X0;
                if (tintProgressDialog4 != null) {
                    tintProgressDialog4.dismiss();
                }
                ToastHelper.showToastShort(multiTypeListDetailActivity, str);
            }
        });
        PlaylistViewModel playlistViewModel23 = this.f83919Y0;
        if (playlistViewModel23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlaylistViewModel");
            playlistViewModel23 = null;
        }
        playlistViewModel23.f85536q.observe(this, new Observer(this) { // from class: com.bilibili.playset.u

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MultiTypeListDetailActivity f85642a;

            {
                this.f85642a = this;
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [com.bilibili.playset.E] */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                ((Boolean) obj).getClass();
                int i7 = MultiTypeListDetailActivity.f83895o1;
                MultiTypeListDetailActivity multiTypeListDetailActivity = this.f85642a;
                multiTypeListDetailActivity.a7().removeCallbacks(multiTypeListDetailActivity.f83923a1);
                multiTypeListDetailActivity.f83923a1 = new Runnable(multiTypeListDetailActivity) { // from class: com.bilibili.playset.E

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final MultiTypeListDetailActivity f83854a;

                    {
                        this.f83854a = multiTypeListDetailActivity;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        MultiTypeListDetailActivity multiTypeListDetailActivity2 = this.f83854a;
                        int i8 = MultiTypeListDetailActivity.f83895o1;
                        multiTypeListDetailActivity2.e7(true);
                    }
                };
                multiTypeListDetailActivity.a7().postDelayed(multiTypeListDetailActivity.f83923a1, 300L);
            }
        });
    }

    @Override // com.bilibili.lib.ui.BaseToolbarActivity, com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onDestroy() {
        a7().removeCallbacks(this.f83923a1);
        PlaylistViewModel playlistViewModel = this.f83919Y0;
        PlaylistViewModel playlistViewModel2 = playlistViewModel;
        if (playlistViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlaylistViewModel");
            playlistViewModel2 = null;
        }
        playlistViewModel2.f85537r.clear();
        super.onDestroy();
    }

    @Override // com.bilibili.lib.ui.BaseToolbarActivity
    public final boolean shouldTintBackground() {
        return false;
    }

    @Override // com.bilibili.lib.ui.BaseToolbarActivity
    public final boolean shouldTintIcon() {
        return false;
    }

    @Override // com.bilibili.lib.ui.BaseToolbarActivity
    public final boolean shouldTintTitle() {
        return false;
    }

    @Override // com.bilibili.lib.ui.BaseToolbarActivity
    public final void tintSystemBar() {
        StatusBarCompat.tintStatusBar(this, getResources().getColor(2131100706));
    }
}
