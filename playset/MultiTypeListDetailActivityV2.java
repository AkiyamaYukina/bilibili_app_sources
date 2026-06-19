package com.bilibili.playset;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.text.font.C4496a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.math.MathUtils;
import androidx.core.view.OneShotPreDrawListener;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.alipay.alipaysecuritysdk.api.service.ServiceManager;
import com.bilibili.app.comm.list.common.router.LoginScopeKt;
import com.bilibili.app.comm.list.common.widget.bottomsheet.ListBottomSheetDialogV2;
import com.bilibili.app.comm.list.widget.statement.ErrorState;
import com.bilibili.app.comm.list.widget.statement.PlaceHolderState;
import com.bilibili.app.comm.list.widget.statement.StatePageKt;
import com.bilibili.app.comm.list.widget.text.MessageString;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.app.comm.list.widget.utils.PaddingUtilsKt;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import com.bilibili.chatroomsdk.ChatRoomMember;
import com.bilibili.droid.ScreenUtil;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.blrouter.RouteRequestKt;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.performance.EntryPointKt;
import com.bilibili.lib.router.Router;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.BaseToolbarActivity;
import com.bilibili.lib.ui.util.StatusBarCompat;
import com.bilibili.magicasakura.widgets.TintAppBarLayout;
import com.bilibili.magicasakura.widgets.TintImageView;
import com.bilibili.magicasakura.widgets.TintProgressDialog;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.mobile.BLMobileHumanActionNative;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.playerbizcommon.IVideoLikeRouteService;
import com.bilibili.playset.InterfaceC5992n;
import com.bilibili.playset.api.MultitypePlaylist;
import com.bilibili.playset.api.PlaySetService;
import com.bilibili.playset.api.SocializeInfo;
import com.bilibili.playset.api.Upper;
import com.bilibili.playset.collection.enums.CollectionTypeEnum;
import com.bilibili.playset.constants.FolderGroupEnum;
import com.bilibili.playset.dialog.PlaylistDetailBottomSheet;
import com.bilibili.playset.playlist.adapters.FavFooterItem$Companion$LoadMoreType;
import com.bilibili.playset.playlist.entity.SortRecord;
import com.bilibili.playset.playlist.helper.MultiTypeShareHelper;
import com.bilibili.playset.playlist.helper.b;
import com.bilibili.playset.playlist.viewmodels.PlaylistViewModelV2;
import com.bilibili.pvtracker.IPvTracker;
import com.bilibili.pvtracker.PageViewTracker;
import com.google.android.material.appbar.AppBarLayout;
import com.mall.ui.page.home.plantseeds.viewmodel.MallHomeTabPageFeedsViewModel;
import com.mall.ui.page.shop.call.VideoCallFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import os0.C8259e;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.widget.RecyclerView;
import ys0.C9083b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/MultiTypeListDetailActivityV2.class */
@StabilityInferred(parameters = 0)
public final class MultiTypeListDetailActivityV2 extends BaseToolbarActivity implements View.OnClickListener, PlaylistDetailBottomSheet.c, MultiTypeShareHelper.a, IPvTracker {

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public static final int f83940l1 = 0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    @NotNull
    public final Lazy f83946I;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    @Nullable
    public com.bilibili.playset.api.d f83962X0;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    @Nullable
    public MultitypePlaylist.Info f83964Y0;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    @Nullable
    public Long f83966Z0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @Nullable
    public TintProgressDialog f83967a0;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public boolean f83969b1;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public PlaylistViewModelV2 f83970c0;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    @Nullable
    public Boolean f83972d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public boolean f83973e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public boolean f83974f1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    public com.bilibili.playset.playlist.adapters.a f83980p0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @Nullable
    public Z f83981r0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    @Nullable
    public LinearLayoutManager f83982v0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f83941D = 1;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @NotNull
    public final Lazy f83942E = LazyKt.lazy(new LY0.b(this, 4));

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @NotNull
    public final Lazy f83943F = LazyKt.lazy(new LZ.e(this, 5));

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    @NotNull
    public final Lazy f83944G = LazyKt.lazy(new bG.b(this, 5));

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    @NotNull
    public final Lazy f83945H = LazyKt.lazy(new com.bilibili.bplus.followinglist.page.opus.i(this, 1));

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    @NotNull
    public final Lazy f83947J = LazyKt.lazy(new com.bilibili.gripper.container.ad.adextra.e(this, 1));

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    @NotNull
    public final Lazy f83948K = LazyKt.lazy(new II0.n(this, 3));

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    @NotNull
    public final Lazy f83949L = LazyKt.lazy(new com.bilibili.bililive.room.ui.chronosguidecard.view.j(this, 1));

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    @NotNull
    public final Lazy f83950M = LazyKt.lazy(new com.bilibili.bplus.followinglist.page.opus.l(this, 3));

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    @NotNull
    public final Lazy f83951N = LazyKt.lazy(new com.bilibili.bplus.followinglist.page.opus.m(this, 2));

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    @NotNull
    public final Lazy f83952O = LazyKt.lazy(new NC.b(this, 7));

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    @NotNull
    public final Lazy f83953P = LazyKt.lazy(new LY0.c(this, 8));

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    @NotNull
    public final Lazy f83954Q = LazyKt.lazy(new R9.a(this, 6));

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    @NotNull
    public final Lazy f83955R = LazyKt.lazy(new R9.b(this, 3));

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    @NotNull
    public final Lazy f83956S = LazyKt.lazy(new Cr.m(this, 5));

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    @NotNull
    public final Lazy f83957T = LazyKt.lazy(new com.bilibili.bililive.room.ui.chronosguidecard.g(this, 3));

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    @NotNull
    public final Lazy f83958U = LazyKt.lazy(new com.bilibili.gripper.container.ad.adextra.a(this, 2));

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    @NotNull
    public final Lazy f83959V = LazyKt.lazy(new com.bilibili.bililive.biz.entryEffect.uam.d(this, 4));

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    @NotNull
    public final Lazy f83960W = LazyKt.lazy(new com.bilibili.bplus.followinglist.page.nologin.a(this, 3));

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    @NotNull
    public final Lazy f83961X = LazyKt.lazy(new LZ.d(this, 6));

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    @NotNull
    public final Lazy f83963Y = LazyKt.lazy(new II0.a(this, 2));

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    @NotNull
    public final Lazy f83965Z = LazyKt.lazy(new II0.b(this, 2));

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public boolean f83968a1 = true;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public boolean f83971c1 = true;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    @NotNull
    public final Lazy f83975g1 = LazyKt.lazy(new com.bilibili.ad.adview.pegasus.holders.inline.player.egg.tragger.slide.l(this, 3));

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    @NotNull
    public final Lazy f83976h1 = LazyKt.lazy(new com.bilibili.gripper.container.ad.adextra.d(this, 1));

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    @NotNull
    public final Lazy f83977i1 = LazyKt.lazy(new com.bilibili.bililive.biz.interact.chatroom.widget.label.e(this, 3));

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    @NotNull
    public final Lazy f83978j1 = LazyKt.lazy(new Cr.D(this, 5));

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    @NotNull
    public final Lazy f83979k1 = LazyKt.lazy(LazyThreadSafetyMode.NONE, new com.bilibili.app.authorspace.ui.pages.Z(this, 2));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/MultiTypeListDetailActivityV2$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f83983a;

        static {
            int[] iArr = new int[CollectionTypeEnum.values().length];
            try {
                iArr[CollectionTypeEnum.UGC.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[CollectionTypeEnum.OGV.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[CollectionTypeEnum.OGV_V2.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f83983a = iArr;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/MultiTypeListDetailActivityV2$b.class */
    public static final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TintTextView f83984a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MultiTypeListDetailActivityV2 f83985b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f83986c;

        public b(TintTextView tintTextView, TintTextView tintTextView2, MultiTypeListDetailActivityV2 multiTypeListDetailActivityV2, String str) {
            this.f83984a = tintTextView2;
            this.f83985b = multiTypeListDetailActivityV2;
            this.f83986c = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            CharSequence charSequenceAppend;
            int i7;
            if (this.f83984a.getLineCount() > 2) {
                MultiTypeListDetailActivityV2 multiTypeListDetailActivityV2 = this.f83985b;
                if (!multiTypeListDetailActivityV2.f83974f1) {
                    multiTypeListDetailActivityV2.f83974f1 = false;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C4496a.a("…", this.f83985b.getString(2131841473)));
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(ContextCompat.getColor(this.f83985b, R$color.Text1)), 1, spannableStringBuilder.length(), 33);
                    spannableStringBuilder.setSpan(new c(this.f83984a, this.f83986c, this.f83985b), 1, spannableStringBuilder.length(), 33);
                    TintTextView tintTextView = this.f83984a;
                    String str = this.f83986c;
                    Layout layout = tintTextView.getLayout();
                    if (layout == null) {
                        charSequenceAppend = str;
                    } else {
                        charSequenceAppend = str;
                        if (layout.getLineCount() > 2) {
                            int lineStart = layout.getLineStart(1);
                            int lineEnd = layout.getLineEnd(1);
                            TextPaint paint = tintTextView.getPaint();
                            float desiredWidth = spannableStringBuilder.length() <= 1 ? Layout.getDesiredWidth("  ", 0, 2, paint) : Layout.getDesiredWidth(spannableStringBuilder, 0, spannableStringBuilder.length(), paint);
                            int iClamp = MathUtils.clamp(lineEnd, 0, str.length());
                            do {
                                i7 = iClamp - 1;
                                if (i7 < lineStart) {
                                    break;
                                } else {
                                    iClamp = i7;
                                }
                            } while (layout.getWidth() - Layout.getDesiredWidth(str, lineStart, i7, paint) < desiredWidth);
                            charSequenceAppend = new SpannableStringBuilder(str.subSequence(0, MathUtils.clamp(i7, 0, str.length()))).append((CharSequence) spannableStringBuilder);
                        }
                    }
                    tintTextView.setText(charSequenceAppend);
                    return;
                }
            }
            this.f83985b.f83974f1 = true;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/MultiTypeListDetailActivityV2$c.class */
    public static final class c extends ClickableSpan {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TintTextView f83987a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f83988b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final MultiTypeListDetailActivityV2 f83989c;

        public c(TintTextView tintTextView, String str, MultiTypeListDetailActivityV2 multiTypeListDetailActivityV2) {
            this.f83987a = tintTextView;
            this.f83988b = str;
            this.f83989c = multiTypeListDetailActivityV2;
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view) {
            this.f83987a.setMaxLines(Integer.MAX_VALUE);
            this.f83987a.setText(this.f83988b);
            this.f83989c.f83974f1 = true;
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public final void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(ContextCompat.getColor(this.f83989c, R$color.Text1));
            textPaint.setUnderlineText(false);
        }
    }

    public MultiTypeListDetailActivityV2() {
        final int i7 = 0;
        this.f83946I = LazyKt.lazy(new Function0(this, i7) { // from class: com.bilibili.playset.X

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f84029a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f84030b;

            {
                this.f84029a = i7;
                this.f84030b = this;
            }

            public final Object invoke() {
                Object obj = this.f84030b;
                switch (this.f84029a) {
                    case 0:
                        int i8 = MultiTypeListDetailActivityV2.f83940l1;
                        return (TintImageView) ((MultiTypeListDetailActivityV2) obj).findViewById(2131304411);
                    default:
                        View view = ((VideoCallFragment) obj).c;
                        return view != null ? view.findViewById(2131307155) : null;
                }
            }
        });
    }

    public static void y7(MultiTypeListDetailActivityV2 multiTypeListDetailActivityV2, PlaceHolderState.LoadingHolder loadingHolder, ErrorState errorState, a70.G g7, int i7) {
        if ((i7 & 1) != 0) {
            loadingHolder = PlaceHolderState.ErrorHolder.INSTANCE;
        }
        if ((i7 & 2) != 0) {
            errorState = new ErrorState.OtherError(0, (MessageString) null, (MessageString) null, (MessageString) null, false, 31, (DefaultConstructorMarker) null);
        }
        if ((i7 & 4) != 0) {
            g7 = new Zj.p(multiTypeListDetailActivityV2, 2);
        }
        ListExtentionsKt.visible(multiTypeListDetailActivityV2.e7());
        final PlaceHolderState.LoadingHolder loadingHolder2 = loadingHolder;
        final ErrorState errorState2 = errorState;
        final a70.G g8 = g7;
        multiTypeListDetailActivityV2.e7().setContent(ComposableLambdaKt.composableLambdaInstance(1323872860, true, new Function2(loadingHolder2, errorState2, g8) { // from class: com.bilibili.playset.g0

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PlaceHolderState f85072a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final ErrorState f85073b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Function0 f85074c;

            {
                this.f85072a = loadingHolder2;
                this.f85073b = errorState2;
                this.f85074c = g8;
            }

            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i8 = MultiTypeListDetailActivityV2.f83940l1;
                if (composer.shouldExecute((iIntValue & 3) != 2, 1 & iIntValue)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1323872860, iIntValue, -1, "com.bilibili.playset.MultiTypeListDetailActivityV2.showErrorView.<anonymous> (MultiTypeListDetailActivityV2.kt:1377)");
                    }
                    StatePageKt.StatePage(this.f85072a, this.f85073b, this.f85074c, composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            }
        }));
    }

    public final void Q6(boolean z6) {
        SocializeInfo socializeInfo;
        Y6().setImageTintList(z6 ? R$color.Brand_pink : R$color.Ga6);
        MultitypePlaylist.Info info = this.f83964Y0;
        if (info == null || (socializeInfo = info.socializeInfo) == null) {
            return;
        }
        socializeInfo.collect += z6 ? 1 : -1;
        TextView textView = (TextView) this.f83956S.getValue();
        int i7 = socializeInfo.collect;
        textView.setText(i7 <= 0 ? getString(2131846948) : String.valueOf(i7));
    }

    @Override // com.bilibili.playset.playlist.helper.MultiTypeShareHelper.a
    public final void Q9() {
        SocializeInfo socializeInfo;
        ((PlaySetService) ServiceGenerator.createService(PlaySetService.class)).reportShareCount(b7(), 11, this.f83941D).enqueue();
        com.bilibili.playset.playlist.helper.b.a(b7(), BiliAccounts.get(this).mid());
        MultitypePlaylist.Info info = this.f83964Y0;
        if (info == null || (socializeInfo = info.socializeInfo) == null) {
            return;
        }
        socializeInfo.share++;
        TextView textView = (TextView) this.f83957T.getValue();
        int i7 = socializeInfo.share;
        textView.setText(i7 <= 0 ? getText(2131841574) : com.bilibili.playset.utils.h.a(i7));
    }

    public final void R6(boolean z6) {
        SocializeInfo socializeInfo;
        a7().setSelected(z6);
        a7().setImageTintList(z6 ? R$color.Brand_pink : R$color.Ga6);
        MultitypePlaylist.Info info = this.f83964Y0;
        if (info == null || (socializeInfo = info.socializeInfo) == null) {
            return;
        }
        socializeInfo.thumb_up += z6 ? 1 : -1;
        TextView textView = (TextView) this.f83955R.getValue();
        int i7 = socializeInfo.thumb_up;
        textView.setText(i7 <= 0 ? getString(2131841358) : String.valueOf(i7));
    }

    public final void S6(int i7) {
        MultitypePlaylist.Info info = this.f83964Y0;
        if (info != null) {
            info.remove(1);
        }
        TintTextView tintTextView = (TintTextView) this.f83961X.getValue();
        MultitypePlaylist.Info info2 = this.f83964Y0;
        tintTextView.setText(getString(2131842579, new Object[]{Integer.valueOf(info2 != null ? info2.mediaCount : 0)}));
        com.bilibili.playset.playlist.adapters.a aVar = this.f83980p0;
        if (aVar != null) {
            ((ArrayList) aVar.f124955c).remove(i7);
            aVar.submitList(CollectionsKt.toList(aVar.f124955c));
        }
    }

    public final void T6(com.bilibili.playset.api.c cVar) {
        PlaylistViewModelV2 playlistViewModelV2 = this.f83970c0;
        PlaylistViewModelV2 playlistViewModelV22 = playlistViewModelV2;
        if (playlistViewModelV2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlaylistViewModel");
            playlistViewModelV22 = null;
        }
        long jB7 = b7();
        MutableLiveData<Bundle> mutableLiveData = playlistViewModelV22.f85550l;
        Bundle bundle = new Bundle();
        bundle.putInt("loading_status", -1);
        mutableLiveData.setValue(bundle);
        String strA = vg.E.a(cVar.l(), cVar.k(), ":");
        ((PlaySetService) playlistViewModelV22.f85562x.getValue()).deleteFavorites(strA, Long.valueOf(jB7)).enqueue(new com.bilibili.playset.playlist.viewmodels.r(playlistViewModelV22, strA));
    }

    public final Bundle U6() {
        Bundle bundle = new Bundle();
        BiliAccounts biliAccounts = BiliAccounts.get(this);
        MultitypePlaylist.Info info = this.f83964Y0;
        if (info != null) {
            String str = (biliAccounts == null || biliAccounts.mid() != info.mid) ? "guest" : "creator";
            String str2 = (info.attr & 1) == 0 ? ServiceManager.DEFAULT_APP_NAME : "private";
            bundle.putString("visitor_status", str);
            bundle.putString("public_status", str2);
        }
        bundle.putString("action_id", PageViewTracker.getInstance().currentPolarisActionId());
        bundle.putLong("playlist_id", b7());
        return bundle;
    }

    public final long V6() {
        Upper upper;
        MultitypePlaylist.Info info = this.f83964Y0;
        long j7 = (info == null || (upper = info.upper) == null) ? 0L : upper.mid;
        long jLongValue = j7;
        if (j7 == 0) {
            jLongValue = ((Number) this.f83977i1.getValue()).longValue();
        }
        return jLongValue;
    }

    public final ConstraintLayout X6() {
        return (ConstraintLayout) this.f83947J.getValue();
    }

    public final TintImageView Y6() {
        return (TintImageView) this.f83959V.getValue();
    }

    public final TintImageView a7() {
        return (TintImageView) this.f83958U.getValue();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    public final long b7() {
        return ((Number) this.f83976h1.getValue()).longValue();
    }

    public final TintTextView c7() {
        return (TintTextView) this.f83950M.getValue();
    }

    public final RecyclerView d7() {
        return (RecyclerView) this.f83963Y.getValue();
    }

    public final ComposeView e7() {
        return (ComposeView) this.f83965Z.getValue();
    }

    public final void g7() {
        com.bilibili.playset.editor.utils.g.b(this, b7(), this.f83964Y0, null);
        b.a aVar = b.a.f85324a;
        aVar.a("playlist.playlist-detail.PLmanage-more.*.click");
        aVar.c("manage", "1");
        b.a.b();
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        return "playlist.playlist-detail.0.0.pv";
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @Nullable
    public final Bundle getPvExtra() {
        return U6();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [android.content.DialogInterface$OnClickListener, java.lang.Object] */
    @Override // com.bilibili.playset.dialog.PlaylistDetailBottomSheet.c
    public final void h(int i7) {
        if (i7 == 1) {
            g7();
            return;
        }
        if (i7 == 2) {
            ToastHelper.showToastShort(getApplicationContext(), getString(2131842589));
            return;
        }
        Lifecycle lifecycle = null;
        if (i7 == 4) {
            BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new MultiTypeListDetailActivityV2$deleteFolder$1(this, null), 3, (Object) null);
            return;
        }
        if (i7 == 5) {
            if (n7()) {
                j7();
                return;
            } else {
                i7();
                return;
            }
        }
        if (i7 != 7) {
            if (i7 != 8) {
                return;
            }
            new AlertDialog.Builder(this).setTitle("").setMessage(getString(2131842576)).setNegativeButton(2131841494, (DialogInterface.OnClickListener) new Object()).setPositiveButton(2131841455, new DialogInterface.OnClickListener(this) { // from class: com.bilibili.playset.f0

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final MultiTypeListDetailActivityV2 f85065a;

                {
                    this.f85065a = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    MultiTypeListDetailActivityV2 multiTypeListDetailActivityV2 = this.f85065a;
                    int i9 = MultiTypeListDetailActivityV2.f83940l1;
                    multiTypeListDetailActivityV2.getClass();
                    b.a aVar = b.a.f85324a;
                    aVar.a("playlist.playlist-detail.PLmanage-more.*.click");
                    aVar.c("manage", "5");
                    b.a.b();
                    PlaylistViewModelV2 playlistViewModelV2 = multiTypeListDetailActivityV2.f83970c0;
                    PlaylistViewModelV2 playlistViewModelV22 = playlistViewModelV2;
                    if (playlistViewModelV2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mPlaylistViewModel");
                        playlistViewModelV22 = null;
                    }
                    playlistViewModelV22.K0(multiTypeListDetailActivityV2.b7());
                    dialogInterface.dismiss();
                }
            }).show();
        } else {
            if (EntryPointKt.getMemleakOptEnable()) {
                lifecycle = getLifecycle();
            }
            LoginScopeKt.loginRequire$default(false, lifecycle, (RouteRequest) null, 0L, new LT0.a(this, 3), 13, (Object) null);
        }
    }

    public final void i7() {
        Router.Companion.global().with(this).forResult(1001).open("activity://main/login/");
    }

    public final void j7() {
        Router.Companion.global().with(this).open("bilibili://browser?url=" + Uri.encode("https://www.bilibili.com/appeal/?playlistId=" + b7()));
        b.a aVar = b.a.f85324a;
        aVar.a("playlist.playlist-detail.PLmanage-more.*.click");
        aVar.c("manage", "3");
        b.a.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k7() {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.MultiTypeListDetailActivityV2.k7():void");
    }

    public final boolean n7() {
        return BiliAccounts.get(this).isLogin();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i7, int i8, @Nullable Intent intent) {
        long[] longArrayExtra;
        com.bilibili.playset.api.d dVar;
        List<com.bilibili.playset.api.c> listD;
        Integer numValueOf;
        int i9;
        super.onActivityResult(i7, i8, intent);
        if (i7 == 1001 && i8 == -1) {
            s7(true);
            return;
        }
        if (i7 != 1002 || i8 != -1) {
            if (i7 != 2 || i8 != -1) {
                if (i7 != 4 || i8 != -1 || intent == null || (longArrayExtra = intent.getLongArrayExtra("removedIds")) == null || (dVar = this.f83962X0) == null || (listD = dVar.d()) == null) {
                    return;
                }
                Iterator<T> it = listD.iterator();
                while (it.hasNext()) {
                    if (ArraysKt.contains(longArrayExtra, ((com.bilibili.playset.api.c) it.next()).k())) {
                        s7(true);
                    }
                }
                return;
            }
            if (intent == null) {
                s7(true);
                return;
            }
            this.f83973e1 = intent.getBooleanExtra("key_result_is_create_folder", false);
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("sort_record");
            setResult(-1, intent);
            if (parcelableArrayListExtra != null && !parcelableArrayListExtra.isEmpty()) {
                Iterator it2 = parcelableArrayListExtra.iterator();
                while (it2.hasNext()) {
                    if (!((SortRecord) it2.next()).isInvalid()) {
                        PlaylistViewModelV2 playlistViewModelV2 = this.f83970c0;
                        if (playlistViewModelV2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mPlaylistViewModel");
                            playlistViewModelV2 = null;
                        }
                        playlistViewModelV2.N0(b7(), CollectionsKt.p(parcelableArrayListExtra, ",", (CharSequence) null, (CharSequence) null, new com.bilibili.bililive.room.ui.chronosguidecard.view.k(1), 30));
                        return;
                    }
                }
            }
            s7(true);
            return;
        }
        if (intent != null) {
            String stringExtra = intent.getStringExtra("title");
            String stringExtra2 = intent.getStringExtra("intro");
            if (intent.getBooleanExtra("private", false)) {
                MultitypePlaylist.Info info = this.f83964Y0;
                numValueOf = null;
                if (info != null) {
                    i9 = info.attr | 1;
                    numValueOf = Integer.valueOf(i9);
                }
            } else {
                MultitypePlaylist.Info info2 = this.f83964Y0;
                numValueOf = null;
                if (info2 != null) {
                    i9 = info2.attr & (-2);
                    numValueOf = Integer.valueOf(i9);
                }
            }
            MultitypePlaylist.Info info3 = this.f83964Y0;
            if (info3 != null) {
                info3.title = stringExtra;
            }
            if (info3 != null) {
                info3.intro = stringExtra2;
            }
            if (numValueOf != null) {
                boolean z6 = (numValueOf.intValue() & 1) == 0;
                boolean zQ7 = q7(V6());
                if (z6) {
                    w7(true, !zQ7, true);
                } else {
                    w7(true, false, false);
                }
                MultitypePlaylist.Info info4 = this.f83964Y0;
                if (info4 != null) {
                    info4.attr = numValueOf.intValue();
                }
            }
            ((TintTextView) this.f83948K.getValue()).setText(stringExtra);
            if (TextUtils.isEmpty(stringExtra2)) {
                c7().setVisibility(8);
            } else {
                c7().setVisibility(0);
                v7(c7(), stringExtra2);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View view) {
        Integer numValueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (numValueOf != null && numValueOf.intValue() == 2131309143) {
            if (!n7()) {
                i7();
                return;
            }
            boolean zIsSelected = a7().isSelected();
            Long l7 = this.f83966Z0;
            if (l7 != null) {
                final long jLongValue = l7.longValue();
                PlaylistViewModelV2 playlistViewModelV2 = this.f83970c0;
                if (playlistViewModelV2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPlaylistViewModel");
                    playlistViewModelV2 = null;
                }
                final long jB7 = b7();
                int i7 = !zIsSelected ? 1 : 2;
                final String strCurrentPolarisActionId = PageViewTracker.getInstance().currentPolarisActionId();
                playlistViewModelV2.getClass();
                final int i8 = i7;
                com.bilibili.playset.api.t.a(new Function1(i8, jB7, jLongValue, strCurrentPolarisActionId) { // from class: com.bilibili.playset.playlist.viewmodels.o

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final long f85594a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final int f85595b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final long f85596c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final String f85597d;

                    {
                        this.f85594a = jB7;
                        this.f85595b = i8;
                        this.f85596c = jLongValue;
                        this.f85597d = strCurrentPolarisActionId;
                    }

                    public final Object invoke(Object obj) {
                        PlaySetService playSetService = (PlaySetService) ServiceGenerator.createService(PlaySetService.class);
                        String str = this.f85597d;
                        return playSetService.likePlaylist(this.f85594a, this.f85595b, 11, this.f85596c, "playlist.playlist-detail.0.0", "playlist.playlist-video-detail.0.0", str, (String) obj);
                    }
                }, "collection_thunmbup", new com.bilibili.playset.playlist.viewmodels.v(i7, playlistViewModelV2));
                long jB72 = b7();
                b.a aVar = b.a.f85324a;
                aVar.a("playlist.playlist-detail.PLlike.0.click");
                aVar.c(IVideoLikeRouteService.ACTION_LIKE, zIsSelected ? "2" : "1");
                aVar.c("playlist_id", String.valueOf(jB72));
                String strCurrentPolarisActionId2 = PageViewTracker.getInstance().currentPolarisActionId();
                aVar.c("action_id", strCurrentPolarisActionId2 != null ? strCurrentPolarisActionId2 : "");
                b.a.b();
                return;
            }
            return;
        }
        if (numValueOf == null || numValueOf.intValue() != 2131309137) {
            if (numValueOf != null && numValueOf.intValue() == 2131309150) {
                if (!((TintImageView) this.f83960W.getValue()).isEnabled()) {
                    ToastHelper.showToastShort(this, 2131842564);
                    return;
                }
                if (!n7()) {
                    i7();
                    return;
                }
                MultitypePlaylist.Info info = this.f83964Y0;
                if (info != null) {
                    ((MultiTypeShareHelper) this.f83975g1.getValue()).a(info);
                    return;
                }
                return;
            }
            if (numValueOf != null && numValueOf.intValue() == 2131304412) {
                Neurons.reportClick$default(false, "playlist.playlist-detail.search.0.click", (Map) null, 4, (Object) null);
                BLRouter.routeTo$default(RouteRequestKt.toRouteRequest("bilibili://music/search2?media_id=" + b7()), (Context) null, 2, (Object) null);
                return;
            }
            if (numValueOf != null && numValueOf.intValue() == 2131317352) {
                Lifecycle lifecycle = null;
                if (EntryPointKt.getMemleakOptEnable()) {
                    lifecycle = getLifecycle();
                }
                LoginScopeKt.loginRequire$default(false, lifecycle, (RouteRequest) null, 0L, new LT0.a(this, 3), 13, (Object) null);
                return;
            }
            if (numValueOf != null && numValueOf.intValue() == 2131304411) {
                getSupportFragmentManager();
                MultitypePlaylist.Info info2 = this.f83964Y0;
                if (info2 != null) {
                    Upper upper = info2.upper;
                    ListBottomSheetDialogV2.hf(new ListBottomSheetDialogV2(), getSupportFragmentManager(), (String) null, q7(upper != null ? upper.mid : 0L) ? this.f83968a1 ? new ArrayList(CollectionsKt.listOf(new com.bilibili.app.comm.list.common.widget.bottomsheet.l[]{new com.bilibili.app.comm.list.common.widget.bottomsheet.l(getString(2131842557), (String) null, 2131242379, R$color.Text1, false, new IH.n(this, 5), BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_HAND_DET_SCORE_THRESHOLD), new com.bilibili.app.comm.list.common.widget.bottomsheet.l(getString(2131842642), (String) null, 2131238937, R$color.Text1, true, new II.c(this, 6), 74)})) : new ArrayList(CollectionsKt.listOf(new com.bilibili.app.comm.list.common.widget.bottomsheet.l[]{new com.bilibili.app.comm.list.common.widget.bottomsheet.l(getString(2131842503), getString(2131842553), 2131238720, R$color.Text1, false, new R60.b(this, 4), 104), new com.bilibili.app.comm.list.common.widget.bottomsheet.l(getString(2131842557), (String) null, 2131242379, R$color.Text1, false, new a70.e(this, 2), BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_HAND_DET_SCORE_THRESHOLD), new com.bilibili.app.comm.list.common.widget.bottomsheet.l(getString(2131842642), (String) null, 2131238937, R$color.Text1, true, new Y9.m(this, 3), 74), new com.bilibili.app.comm.list.common.widget.bottomsheet.l(getString(2131842585), (String) null, 2131239016, R$color.Text1, false, new Function0(this) { // from class: com.bilibili.playset.V

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final MultiTypeListDetailActivityV2 f84027a;

                        {
                            this.f84027a = this;
                        }

                        public final Object invoke() {
                            int i9 = MultiTypeListDetailActivityV2.f83940l1;
                            MultiTypeListDetailActivityV2 multiTypeListDetailActivityV2 = this.f84027a;
                            multiTypeListDetailActivityV2.getClass();
                            BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(multiTypeListDetailActivityV2), (CoroutineContext) null, (CoroutineStart) null, new MultiTypeListDetailActivityV2$deleteFolder$1(multiTypeListDetailActivityV2, null), 3, (Object) null);
                            return Unit.INSTANCE;
                        }
                    }, BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_HAND_DET_SCORE_THRESHOLD)})) : new ArrayList(CollectionsKt.listOf(new com.bilibili.app.comm.list.common.widget.bottomsheet.l(getString(2131846932), (String) null, 2131239041, R$color.Text1, false, new IH.j(this, 3), BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_HAND_DET_SCORE_THRESHOLD))), (String) null, 24);
                    return;
                }
                return;
            }
            return;
        }
        if (!n7()) {
            i7();
            return;
        }
        if (!Y6().isEnabled()) {
            ToastHelper.showToastShort(this, 2131842594);
            return;
        }
        Pair pair = TuplesKt.to("favoritePL", Y6().isSelected() ? "2" : "1");
        String strCurrentPolarisActionId3 = PageViewTracker.getInstance().currentPolarisActionId();
        Neurons.reportClick(false, "playlist.playlist-detail.PLfavorite.0.click", MapsKt.mapOf(new Pair[]{pair, TuplesKt.to("action_id", strCurrentPolarisActionId3 != null ? strCurrentPolarisActionId3 : "")}));
        if (Y6().isSelected()) {
            Q6(false);
            PlaylistViewModelV2 playlistViewModelV22 = this.f83970c0;
            PlaylistViewModelV2 playlistViewModelV23 = playlistViewModelV22;
            if (playlistViewModelV22 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlaylistViewModel");
                playlistViewModelV23 = null;
            }
            long jB73 = b7();
            String strCurrentPolarisActionId4 = PageViewTracker.getInstance().currentPolarisActionId();
            playlistViewModelV23.getClass();
            ((PlaySetService) ServiceGenerator.createService(PlaySetService.class)).unFavPlaySet(jB73, "playlist.playlist-detail.0.0", "playlist.playlist-video-detail.0.0", strCurrentPolarisActionId4).enqueue(new com.bilibili.playset.playlist.viewmodels.w(playlistViewModelV23));
        } else {
            Q6(true);
            PlaylistViewModelV2 playlistViewModelV24 = this.f83970c0;
            PlaylistViewModelV2 playlistViewModelV25 = playlistViewModelV24;
            if (playlistViewModelV24 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlaylistViewModel");
                playlistViewModelV25 = null;
            }
            final long jB74 = b7();
            final String strCurrentPolarisActionId5 = PageViewTracker.getInstance().currentPolarisActionId();
            playlistViewModelV25.getClass();
            com.bilibili.playset.api.t.a(new Function1(jB74, strCurrentPolarisActionId5) { // from class: com.bilibili.playset.playlist.viewmodels.p

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final long f85598a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f85599b;

                {
                    this.f85598a = jB74;
                    this.f85599b = strCurrentPolarisActionId5;
                }

                public final Object invoke(Object obj) {
                    PlaySetService playSetService = (PlaySetService) ServiceGenerator.createService(PlaySetService.class);
                    String str = this.f85599b;
                    return playSetService.favPlaylist(this.f85598a, "playlist.playlist-detail.0.0", "playlist.playlist-video-detail.0.0", str, (String) obj);
                }
            }, "collection_favorite", new com.bilibili.playset.playlist.viewmodels.t(playlistViewModelV25));
        }
        if (Intrinsics.areEqual(this.f83972d1, Boolean.TRUE)) {
            Intent intent = new Intent();
            intent.putExtra("playlistId", b7());
            intent.putExtra("is_delete", false);
            intent.putExtra("key_result_is_create_folder", this.f83973e1);
            if (Y6().isSelected()) {
                setResult(-1, null);
            } else {
                setResult(-1, intent);
            }
        }
    }

    @Override // com.bilibili.lib.ui.BaseToolbarActivity, com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131500917);
        this.f83970c0 = (PlaylistViewModelV2) new ViewModelProvider(this).get(PlaylistViewModelV2.class);
        ensureToolbar();
        showBackButton();
        StatusBarCompat.immersiveStatusBar(this);
        Toolbar toolbar = this.mToolbar;
        if (toolbar != null) {
            toolbar.setPadding(toolbar.getPaddingLeft(), StatusBarCompat.getStatusBarHeight(this) + toolbar.getPaddingTop(), toolbar.getPaddingRight(), toolbar.getPaddingBottom());
        }
        PaddingUtilsKt.setPaddingTop((TintAppBarLayout) this.f83942E.getValue(), StatusBarCompat.getStatusBarHeight(this) + ((TintAppBarLayout) this.f83942E.getValue()).getPaddingTop());
        ((TintAppBarLayout) this.f83942E.getValue()).addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener(this) { // from class: com.bilibili.playset.P

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MultiTypeListDetailActivityV2 f83996a;

            {
                this.f83996a = this;
            }

            public final void onOffsetChanged(AppBarLayout appBarLayout, int i7) {
                int i8 = MultiTypeListDetailActivityV2.f83940l1;
                this.f83996a.X6().setAlpha(1.0f - (Math.abs(i7) / (appBarLayout.getTotalScrollRange() > 0 ? appBarLayout.getTotalScrollRange() : 1)));
            }
        });
        ListExtentionsKt.gone((TintTextView) this.f83943F.getValue());
        this.f83980p0 = new com.bilibili.playset.playlist.adapters.a(new C5989l0(this), new IH.c(this, 4));
        this.f83982v0 = new LinearLayoutManager(this);
        d7().setLayoutManager(this.f83982v0);
        d7().addOnScrollListener((com.bilibili.playset.playlist.helper.a) this.f83979k1.getValue());
        d7().setAdapter(this.f83980p0);
        d7().setItemAnimator(null);
        d7().addItemDecoration(new C9083b(R$color.Ga2, ListExtentionsKt.toPx(0.5f), ListExtentionsKt.toPx(12), 80, true));
        d7().addOnScrollListener(new Hi.a(new IH.d(this, 5)));
        ((TintTextView) this.f83949L.getValue()).setOnClickListener(this);
        ((LinearLayout) this.f83952O.getValue()).setOnClickListener(this);
        ((LinearLayout) this.f83953P.getValue()).setOnClickListener(this);
        ((LinearLayout) this.f83954Q.getValue()).setOnClickListener(this);
        ((TintImageView) this.f83944G.getValue()).setOnClickListener(this);
        ((TintImageView) this.f83945H.getValue()).setOnClickListener(this);
        ((TintImageView) this.f83946I.getValue()).setOnClickListener(this);
        k7();
        s7(true);
        PlaylistViewModelV2 playlistViewModelV2 = this.f83970c0;
        PlaylistViewModelV2 playlistViewModelV22 = playlistViewModelV2;
        if (playlistViewModelV2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlaylistViewModel");
            playlistViewModelV22 = null;
        }
        final int i7 = 0;
        playlistViewModelV22.f85548j.observe(this, new Observer(this, i7) { // from class: com.bilibili.playset.h0

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f85079a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f85080b;

            {
                this.f85079a = i7;
                this.f85080b = this;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) throws NoWhenBranchMatchedException {
                List<com.bilibili.playset.api.c> listD;
                Object obj2 = this.f85080b;
                switch (this.f85079a) {
                    case 0:
                        int iIntValue = ((Integer) obj).intValue();
                        int i8 = MultiTypeListDetailActivityV2.f83940l1;
                        MultiTypeListDetailActivityV2 multiTypeListDetailActivityV2 = (MultiTypeListDetailActivityV2) obj2;
                        if (iIntValue == 0) {
                            ListExtentionsKt.gone(multiTypeListDetailActivityV2.e7());
                            ListExtentionsKt.visible(multiTypeListDetailActivityV2.X6());
                            break;
                        } else if (iIntValue == 1) {
                            multiTypeListDetailActivityV2.x7(InterfaceC5992n.c.f85104a);
                            multiTypeListDetailActivityV2.w7(false, false, false);
                            com.bilibili.playset.api.d dVar = multiTypeListDetailActivityV2.f83962X0;
                            if (dVar == null || (listD = dVar.d()) == null || !(!listD.isEmpty())) {
                            }
                            break;
                        } else if (iIntValue == 2) {
                            multiTypeListDetailActivityV2.x7(InterfaceC5992n.b.f85103a);
                            ListExtentionsKt.visible(multiTypeListDetailActivityV2.X6());
                            break;
                        } else if (iIntValue == 3) {
                            if (ConnectivityMonitor.getInstance().isNetworkActive()) {
                                multiTypeListDetailActivityV2.x7(InterfaceC5992n.e.f85106a);
                            } else {
                                multiTypeListDetailActivityV2.x7(InterfaceC5992n.d.f85105a);
                            }
                            multiTypeListDetailActivityV2.w7(false, false, false);
                            ListExtentionsKt.visible(multiTypeListDetailActivityV2.X6());
                            break;
                        } else if (iIntValue == 4) {
                            multiTypeListDetailActivityV2.x7(InterfaceC5992n.a.f85102a);
                            ListExtentionsKt.visible(multiTypeListDetailActivityV2.X6());
                            break;
                        }
                        break;
                    default:
                        List list = (List) obj;
                        List list2 = com.mall.ui.page.home.plantseeds.viewmodel.a.r;
                        int iHashCode = list.hashCode();
                        List list3 = com.mall.ui.page.home.plantseeds.viewmodel.a.r;
                        boolean zAreEqual = Intrinsics.areEqual(list, list3);
                        StringBuilder sb = new StringBuilder("FakeMallHomeTabPageFeedsViewModel=>");
                        com.mall.ui.page.home.plantseeds.viewmodel.a aVar = (com.mall.ui.page.home.plantseeds.viewmodel.a) obj2;
                        sb.append(aVar);
                        sb.append("=>pageLoadMoreLiveData==>");
                        sb.append(iHashCode);
                        sb.append(" ==> change=");
                        sb.append(true ^ zAreEqual);
                        BLog.i("MALL_TAB3", "[__BottomFeeds]=>" + sb.toString());
                        if (!Intrinsics.areEqual(list, list3)) {
                            ((MallHomeTabPageFeedsViewModel) aVar).h.setValue(list);
                        }
                        ((MallHomeTabPageFeedsViewModel) aVar).f = 3;
                        break;
                }
            }
        });
        PlaylistViewModelV2 playlistViewModelV23 = this.f83970c0;
        PlaylistViewModelV2 playlistViewModelV24 = playlistViewModelV23;
        if (playlistViewModelV23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlaylistViewModel");
            playlistViewModelV24 = null;
        }
        playlistViewModelV24.f85549k.observe(this, new Observer(this) { // from class: com.bilibili.playset.U

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MultiTypeListDetailActivityV2 f84026a;

            {
                this.f84026a = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                int iIntValue = ((Integer) obj).intValue();
                MultiTypeListDetailActivityV2 multiTypeListDetailActivityV2 = this.f84026a;
                if (iIntValue == 1) {
                    com.bilibili.playset.playlist.adapters.a aVar = multiTypeListDetailActivityV2.f83980p0;
                    if (aVar != null) {
                        aVar.f85196g.f124939b = FavFooterItem$Companion$LoadMoreType.LOAD_MORE_STATUS_GONE;
                        aVar.P();
                        return;
                    }
                    return;
                }
                if (iIntValue == 2) {
                    com.bilibili.playset.playlist.adapters.a aVar2 = multiTypeListDetailActivityV2.f83980p0;
                    if (aVar2 != null) {
                        aVar2.f85196g.f124939b = FavFooterItem$Companion$LoadMoreType.LOAD_MORE_STATUS_GONE;
                        aVar2.P();
                        return;
                    }
                    return;
                }
                if (iIntValue != 3) {
                    int i8 = MultiTypeListDetailActivityV2.f83940l1;
                    return;
                }
                com.bilibili.playset.playlist.adapters.a aVar3 = multiTypeListDetailActivityV2.f83980p0;
                if (aVar3 != null) {
                    aVar3.f85196g.f124939b = FavFooterItem$Companion$LoadMoreType.LOAD_MORE_CLEAN_INVALID;
                    aVar3.P();
                }
            }
        });
        PlaylistViewModelV2 playlistViewModelV25 = this.f83970c0;
        PlaylistViewModelV2 playlistViewModelV26 = playlistViewModelV25;
        if (playlistViewModelV25 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlaylistViewModel");
            playlistViewModelV26 = null;
        }
        playlistViewModelV26.f85543d.observe(this, new Observer(this) { // from class: com.bilibili.playset.S

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MultiTypeListDetailActivityV2 f84024a;

            {
                this.f84024a = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                com.bilibili.playset.api.d dVar = (com.bilibili.playset.api.d) obj;
                MultiTypeListDetailActivityV2 multiTypeListDetailActivityV2 = this.f84024a;
                multiTypeListDetailActivityV2.f83962X0 = dVar;
                com.bilibili.playset.playlist.helper.a aVar = (com.bilibili.playset.playlist.helper.a) multiTypeListDetailActivityV2.f83979k1.getValue();
                aVar.f85322b = -1;
                aVar.f85323c = -1;
                com.bilibili.playset.playlist.adapters.a aVar2 = multiTypeListDetailActivityV2.f83980p0;
                if (aVar2 != null) {
                    aVar2.f124957e = multiTypeListDetailActivityV2.q7(multiTypeListDetailActivityV2.V6());
                }
                com.bilibili.playset.playlist.adapters.a aVar3 = multiTypeListDetailActivityV2.f83980p0;
                if (aVar3 != null) {
                    PlaylistViewModelV2 playlistViewModelV27 = multiTypeListDetailActivityV2.f83970c0;
                    PlaylistViewModelV2 playlistViewModelV28 = playlistViewModelV27;
                    if (playlistViewModelV27 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mPlaylistViewModel");
                        playlistViewModelV28 = null;
                    }
                    boolean z6 = playlistViewModelV28.f85555q;
                    FavFooterItem$Companion$LoadMoreType favFooterItem$Companion$LoadMoreType = dVar.f84072g;
                    if (z6) {
                        ((ArrayList) aVar3.f124955c).clear();
                    }
                    List<com.bilibili.playset.api.c> listD = dVar.d();
                    C8259e c8259e = aVar3.f85196g;
                    if (listD != null) {
                        int iIndexOf = ((ArrayList) aVar3.f124955c).indexOf(c8259e);
                        if (iIndexOf >= 0) {
                            ((ArrayList) aVar3.f124955c).remove(iIndexOf);
                        }
                        ((ArrayList) aVar3.f124955c).addAll(listD);
                        c8259e.f124939b = favFooterItem$Companion$LoadMoreType;
                        ((ArrayList) aVar3.f124955c).add(c8259e);
                    } else {
                        int iIndexOf2 = ((ArrayList) aVar3.f124955c).indexOf(c8259e);
                        if (iIndexOf2 >= 0) {
                            ((ArrayList) aVar3.f124955c).remove(iIndexOf2);
                        }
                        c8259e.f124939b = favFooterItem$Companion$LoadMoreType;
                        ((ArrayList) aVar3.f124955c).add(c8259e);
                    }
                    aVar3.submitList(CollectionsKt.toList(aVar3.f124955c));
                }
            }
        });
        PlaylistViewModelV2 playlistViewModelV27 = this.f83970c0;
        PlaylistViewModelV2 playlistViewModelV28 = playlistViewModelV27;
        if (playlistViewModelV27 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlaylistViewModel");
            playlistViewModelV28 = null;
        }
        playlistViewModelV28.f85544e.observe(this, new Observer(this) { // from class: com.bilibili.playset.Y

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MultiTypeListDetailActivityV2 f84031a;

            {
                this.f84031a = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                final MultitypePlaylist.Info info = (MultitypePlaylist.Info) obj;
                final MultiTypeListDetailActivityV2 multiTypeListDetailActivityV2 = this.f84031a;
                multiTypeListDetailActivityV2.f83964Y0 = info;
                boolean z6 = (info.attr & 1) == 0;
                boolean zQ7 = multiTypeListDetailActivityV2.q7(multiTypeListDetailActivityV2.V6());
                if (z6) {
                    multiTypeListDetailActivityV2.w7(true, !zQ7, true);
                } else {
                    multiTypeListDetailActivityV2.w7(true, false, false);
                }
                multiTypeListDetailActivityV2.f83968a1 = ((info.attr >> 1) & 1) == 0;
                multiTypeListDetailActivityV2.f83969b1 = info.isKidPlaylist;
                ((TintTextView) multiTypeListDetailActivityV2.f83948K.getValue()).setText(info.title);
                View viewFindViewById = multiTypeListDetailActivityV2.findViewById(2131321841);
                if (info.isKidPlaylist) {
                    if (viewFindViewById != null) {
                        viewFindViewById.setVisibility(0);
                    }
                    String config = ConfigManager.Companion.getConfig("space.kid_playlist_tag_name", "");
                    String str = config;
                    if (config.length() == 0) {
                        str = "宝贝片单";
                    }
                    TextView textView = (TextView) multiTypeListDetailActivityV2.findViewById(2131321842);
                    if (textView != null) {
                        textView.setText(str);
                    }
                    if (viewFindViewById != null) {
                        final int i8 = 0;
                        viewFindViewById.setOnClickListener(new View.OnClickListener(i8, info, multiTypeListDetailActivityV2) { // from class: com.bilibili.playset.a0

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final int f84033a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final Object f84034b;

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            public final Object f84035c;

                            {
                                this.f84033a = i8;
                                this.f84034b = info;
                                this.f84035c = multiTypeListDetailActivityV2;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (this.f84033a) {
                                    case 0:
                                        MultitypePlaylist.Info info2 = (MultitypePlaylist.Info) this.f84034b;
                                        MultiTypeListDetailActivityV2 multiTypeListDetailActivityV22 = (MultiTypeListDetailActivityV2) this.f84035c;
                                        int i9 = MultiTypeListDetailActivityV2.f83940l1;
                                        String str2 = info2.kidPlaylistDesc;
                                        if (str2 != null && str2.length() != 0) {
                                            Router.Companion.global().with(multiTypeListDetailActivityV22).open("bilibili://browser?url=" + Uri.encode(info2.kidPlaylistDesc));
                                            break;
                                        }
                                        break;
                                    default:
                                        ChatRoomMember chatRoomMember = (ChatRoomMember) this.f84034b;
                                        jV.o oVar = (jV.o) this.f84035c;
                                        if (!chatRoomMember.isRobotMember()) {
                                            com.bilibili.ship.theseus.ogv.chathall.l lVar = oVar.b;
                                            view.getContext();
                                            lVar.a(chatRoomMember);
                                            Neurons.reportClick(false, "main.public-community.watch-together.im-head.click", oVar.c.a);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                    }
                } else if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(8);
                }
                if (TextUtils.isEmpty(info.intro)) {
                    multiTypeListDetailActivityV2.c7().setVisibility(8);
                } else {
                    multiTypeListDetailActivityV2.c7().setVisibility(0);
                    multiTypeListDetailActivityV2.v7(multiTypeListDetailActivityV2.c7(), info.intro);
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
                int i9 = info.likeState;
                int i10 = info.favState;
                if (multiTypeListDetailActivityV2.n7() && multiTypeListDetailActivityV2.f83971c1) {
                    multiTypeListDetailActivityV2.f83971c1 = false;
                    multiTypeListDetailActivityV2.f83972d1 = Boolean.valueOf(info.favState > 0);
                }
                if (numValueOf2 != null) {
                    ((TextView) multiTypeListDetailActivityV2.f83955R.getValue()).setText(numValueOf2.intValue() <= 0 ? multiTypeListDetailActivityV2.getText(2131841358) : com.bilibili.playset.utils.h.a(numValueOf2.intValue()));
                }
                if (numValueOf3 != null) {
                    ((TextView) multiTypeListDetailActivityV2.f83956S.getValue()).setText(numValueOf3.intValue() <= 0 ? multiTypeListDetailActivityV2.getText(2131846948) : com.bilibili.playset.utils.h.a(numValueOf3.intValue()));
                }
                if (numValueOf != null) {
                    ((TextView) multiTypeListDetailActivityV2.f83957T.getValue()).setText(numValueOf.intValue() <= 0 ? multiTypeListDetailActivityV2.getText(2131841574) : com.bilibili.playset.utils.h.a(numValueOf.intValue()));
                }
                multiTypeListDetailActivityV2.a7().setSelected(i9 > 0);
                multiTypeListDetailActivityV2.a7().setImageTintList(i9 > 0 ? R$color.Brand_pink : R$color.Ga6);
                boolean zQ72 = multiTypeListDetailActivityV2.q7(multiTypeListDetailActivityV2.V6());
                if (zQ72) {
                    if ((info.attr & 2) == 0) {
                        com.bilibili.playset.utils.g.a(multiTypeListDetailActivityV2, FolderGroupEnum.DEFAULT);
                    } else {
                        com.bilibili.playset.utils.g.a(multiTypeListDetailActivityV2, FolderGroupEnum.CREATED);
                    }
                } else if (i10 > 0) {
                    com.bilibili.playset.utils.g.a(multiTypeListDetailActivityV2, FolderGroupEnum.COLLECTED);
                }
                if (zQ72) {
                    multiTypeListDetailActivityV2.Y6().setEnabled(false);
                    multiTypeListDetailActivityV2.Y6().setImageTintList(R$color.Ga4);
                } else {
                    multiTypeListDetailActivityV2.Y6().setEnabled(true);
                    multiTypeListDetailActivityV2.Y6().setImageTintList(R$color.Ga6);
                    multiTypeListDetailActivityV2.Y6().setImageTintList(i10 > 0 ? R$color.Brand_pink : R$color.Ga6);
                    ListExtentionsKt.gone((TintImageView) multiTypeListDetailActivityV2.f83945H.getValue());
                }
                ((TintTextView) multiTypeListDetailActivityV2.f83961X.getValue()).setText(multiTypeListDetailActivityV2.getString(2131842579, new Object[]{Integer.valueOf(info.mediaCount)}));
                Upper upper = info.upper;
                if (upper != null) {
                    multiTypeListDetailActivityV2.f83966Z0 = Long.valueOf(upper.mid);
                    ((TintTextView) multiTypeListDetailActivityV2.f83949L.getValue()).setText(multiTypeListDetailActivityV2.getString(2131842495, new Object[]{upper.name}));
                    if (multiTypeListDetailActivityV2.f83964Y0 != null) {
                        Long l7 = multiTypeListDetailActivityV2.f83966Z0;
                        boolean zQ73 = multiTypeListDetailActivityV2.q7(l7 != null ? l7.longValue() : 0L);
                        com.bilibili.playset.playlist.adapters.a aVar = multiTypeListDetailActivityV2.f83980p0;
                        if ((aVar == null || zQ73 != aVar.f124957e) && aVar != null) {
                            aVar.notifyDataSetChanged();
                        }
                    }
                }
                PageViewTracker.getInstance().setExtra(multiTypeListDetailActivityV2, "playlist.playlist-detail.0.0.pv", multiTypeListDetailActivityV2.U6());
            }
        });
        PlaylistViewModelV2 playlistViewModelV29 = this.f83970c0;
        PlaylistViewModelV2 playlistViewModelV210 = playlistViewModelV29;
        if (playlistViewModelV29 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlaylistViewModel");
            playlistViewModelV210 = null;
        }
        playlistViewModelV210.f85545f.observe(this, new Observer(this) { // from class: com.bilibili.playset.T

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MultiTypeListDetailActivityV2 f84025a;

            {
                this.f84025a = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                int i8 = MultiTypeListDetailActivityV2.f83940l1;
                MultiTypeListDetailActivityV2 multiTypeListDetailActivityV2 = this.f84025a;
                if (!zBooleanValue) {
                    ToastHelper.showToastShort(multiTypeListDetailActivityV2, 2131841697);
                } else {
                    multiTypeListDetailActivityV2.R6(true);
                    ToastHelper.showToastShort(multiTypeListDetailActivityV2, 2131842461);
                }
            }
        });
        PlaylistViewModelV2 playlistViewModelV211 = this.f83970c0;
        PlaylistViewModelV2 playlistViewModelV212 = playlistViewModelV211;
        if (playlistViewModelV211 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlaylistViewModel");
            playlistViewModelV212 = null;
        }
        playlistViewModelV212.f85546g.observe(this, new com.bilibili.app.authorspace.ui.pages.game.f(this, 1));
        PlaylistViewModelV2 playlistViewModelV213 = this.f83970c0;
        PlaylistViewModelV2 playlistViewModelV214 = playlistViewModelV213;
        if (playlistViewModelV213 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlaylistViewModel");
            playlistViewModelV214 = null;
        }
        playlistViewModelV214.h.observe(this, new Observer(this) { // from class: com.bilibili.playset.Q

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MultiTypeListDetailActivityV2 f84019a;

            {
                this.f84019a = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:9:0x0039  */
            @Override // androidx.lifecycle.Observer
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onChanged(java.lang.Object r4) {
                /*
                    r3 = this;
                    r0 = r4
                    com.bilibili.playset.playlist.viewmodels.b r0 = (com.bilibili.playset.playlist.viewmodels.b) r0
                    r4 = r0
                    int r0 = com.bilibili.playset.MultiTypeListDetailActivityV2.f83940l1
                    r5 = r0
                    r0 = r4
                    boolean r0 = r0.f85569a
                    r6 = r0
                    r0 = r3
                    com.bilibili.playset.MultiTypeListDetailActivityV2 r0 = r0.f84019a
                    r8 = r0
                    r0 = r6
                    if (r0 == 0) goto L22
                    r0 = r8
                    r1 = 2131846674(0x7f116612, float:1.9326804E38)
                    com.bilibili.droid.ToastHelper.showToastShort(r0, r1)
                    goto L4d
                L22:
                    r0 = r4
                    java.lang.Throwable r0 = r0.f85570b
                    r4 = r0
                    r0 = r4
                    if (r0 == 0) goto L39
                    r0 = r4
                    java.lang.String r0 = r0.getMessage()
                    r7 = r0
                    r0 = r7
                    r4 = r0
                    r0 = r7
                    if (r0 != 0) goto L41
                L39:
                    r0 = r8
                    r1 = 2131845879(0x7f1162f7, float:1.9325191E38)
                    java.lang.String r0 = r0.getString(r1)
                    r4 = r0
                L41:
                    r0 = r8
                    r1 = r4
                    com.bilibili.droid.ToastHelper.showToastShort(r0, r1)
                    r0 = r8
                    r1 = 0
                    r0.Q6(r1)
                L4d:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.Q.onChanged(java.lang.Object):void");
            }
        });
        PlaylistViewModelV2 playlistViewModelV215 = this.f83970c0;
        PlaylistViewModelV2 playlistViewModelV216 = playlistViewModelV215;
        if (playlistViewModelV215 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlaylistViewModel");
            playlistViewModelV216 = null;
        }
        playlistViewModelV216.f85547i.observe(this, new com.bilibili.bililive.room.ui.roomv3.vertical.business.h(this, 1));
        PlaylistViewModelV2 playlistViewModelV217 = this.f83970c0;
        PlaylistViewModelV2 playlistViewModelV218 = playlistViewModelV217;
        if (playlistViewModelV217 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlaylistViewModel");
            playlistViewModelV218 = null;
        }
        playlistViewModelV218.f85550l.observe(this, new com.bilibili.bililive.room.ui.roomv3.vertical.business.b(this, 1));
        PlaylistViewModelV2 playlistViewModelV219 = this.f83970c0;
        PlaylistViewModelV2 playlistViewModelV220 = playlistViewModelV219;
        if (playlistViewModelV219 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlaylistViewModel");
            playlistViewModelV220 = null;
        }
        playlistViewModelV220.f85551m.observe(this, new com.bilibili.app.authorspace.ui.pages.d(this, 1));
        PlaylistViewModelV2 playlistViewModelV221 = this.f83970c0;
        PlaylistViewModelV2 playlistViewModelV222 = playlistViewModelV221;
        if (playlistViewModelV221 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlaylistViewModel");
            playlistViewModelV222 = null;
        }
        playlistViewModelV222.f85552n.observe(this, new Observer(this) { // from class: com.bilibili.playset.i0

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MultiTypeListDetailActivityV2 f85085a;

            {
                this.f85085a = this;
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                String str = (String) obj;
                int i8 = MultiTypeListDetailActivityV2.f83940l1;
                int iHashCode = str.hashCode();
                MultiTypeListDetailActivityV2 multiTypeListDetailActivityV2 = this.f85085a;
                switch (iHashCode) {
                    case -1867169789:
                        if (str.equals("success")) {
                            TintProgressDialog tintProgressDialog = multiTypeListDetailActivityV2.f83967a0;
                            if (tintProgressDialog != null) {
                                tintProgressDialog.dismiss();
                            }
                            ToastHelper.showToastShort(multiTypeListDetailActivityV2, multiTypeListDetailActivityV2.getString(2131841348));
                            multiTypeListDetailActivityV2.s7(true);
                            multiTypeListDetailActivityV2.d7().scrollToPosition(0);
                            return;
                        }
                        break;
                    case -1313911455:
                        if (str.equals("timeout")) {
                            TintProgressDialog tintProgressDialog2 = multiTypeListDetailActivityV2.f83967a0;
                            if (tintProgressDialog2 != null) {
                                tintProgressDialog2.dismiss();
                            }
                            ToastHelper.showToastShort(multiTypeListDetailActivityV2, multiTypeListDetailActivityV2.getString(2131841420));
                            return;
                        }
                        break;
                    case 336650556:
                        if (str.equals("loading")) {
                            multiTypeListDetailActivityV2.f83967a0 = TintProgressDialog.show(multiTypeListDetailActivityV2, null, multiTypeListDetailActivityV2.getResources().getString(2131842520), true, false);
                            return;
                        }
                        break;
                    case 1296933515:
                        if (str.equals("neterror")) {
                            TintProgressDialog tintProgressDialog3 = multiTypeListDetailActivityV2.f83967a0;
                            if (tintProgressDialog3 != null) {
                                tintProgressDialog3.dismiss();
                            }
                            ToastHelper.showToastShort(multiTypeListDetailActivityV2, multiTypeListDetailActivityV2.getString(2131842483));
                            return;
                        }
                        break;
                }
                TintProgressDialog tintProgressDialog4 = multiTypeListDetailActivityV2.f83967a0;
                if (tintProgressDialog4 != null) {
                    tintProgressDialog4.dismiss();
                }
                ToastHelper.showToastShort(multiTypeListDetailActivityV2, str);
            }
        });
        PlaylistViewModelV2 playlistViewModelV223 = this.f83970c0;
        PlaylistViewModelV2 playlistViewModelV224 = playlistViewModelV223;
        if (playlistViewModelV223 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlaylistViewModel");
            playlistViewModelV224 = null;
        }
        playlistViewModelV224.f85553o.observe(this, new Observer(this) { // from class: com.bilibili.playset.W

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MultiTypeListDetailActivityV2 f84028a;

            {
                this.f84028a = this;
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [com.bilibili.playset.Z] */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                ((Boolean) obj).getClass();
                int i8 = MultiTypeListDetailActivityV2.f83940l1;
                MultiTypeListDetailActivityV2 multiTypeListDetailActivityV2 = this.f84028a;
                multiTypeListDetailActivityV2.e7().removeCallbacks(multiTypeListDetailActivityV2.f83981r0);
                multiTypeListDetailActivityV2.f83981r0 = new Runnable(multiTypeListDetailActivityV2) { // from class: com.bilibili.playset.Z

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final MultiTypeListDetailActivityV2 f84032a;

                    {
                        this.f84032a = multiTypeListDetailActivityV2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        MultiTypeListDetailActivityV2 multiTypeListDetailActivityV22 = this.f84032a;
                        int i9 = MultiTypeListDetailActivityV2.f83940l1;
                        multiTypeListDetailActivityV22.s7(true);
                    }
                };
                multiTypeListDetailActivityV2.e7().postDelayed(multiTypeListDetailActivityV2.f83981r0, 300L);
            }
        });
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new MultiTypeListDetailActivityV2$subscribeDataObservers$1(this, null), 3, (Object) null);
    }

    @Override // com.bilibili.lib.ui.BaseToolbarActivity, com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onDestroy() {
        e7().removeCallbacks(this.f83981r0);
        PlaylistViewModelV2 playlistViewModelV2 = this.f83970c0;
        PlaylistViewModelV2 playlistViewModelV22 = playlistViewModelV2;
        if (playlistViewModelV2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlaylistViewModel");
            playlistViewModelV22 = null;
        }
        playlistViewModelV22.getClass();
        super.onDestroy();
    }

    public final boolean q7(long j7) {
        return n7() && j7 == BiliAccounts.get(this).mid();
    }

    public final void s7(boolean z6) {
        PlaylistViewModelV2 playlistViewModelV2 = this.f83970c0;
        PlaylistViewModelV2 playlistViewModelV22 = playlistViewModelV2;
        if (playlistViewModelV2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlaylistViewModel");
            playlistViewModelV22 = null;
        }
        long jB7 = b7();
        ((Number) this.f83977i1.getValue()).longValue();
        if (playlistViewModelV22.f85557s || z6) {
            playlistViewModelV22.f85555q = z6;
            playlistViewModelV22.f85541b = z6 ? 1 : playlistViewModelV22.f85541b;
            playlistViewModelV22.f85542c = z6 ? 1 : playlistViewModelV22.f85542c;
            if (z6) {
                playlistViewModelV22.f85548j.setValue(1);
            }
            if (!z6) {
                playlistViewModelV22.L0(jB7);
            } else {
                playlistViewModelV22.L0(jB7);
                ((PlaySetService) ServiceGenerator.createService(PlaySetService.class)).getPlaylistBasicInfo(jB7).enqueue(new com.bilibili.playset.playlist.viewmodels.u(playlistViewModelV22, z6));
            }
        }
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

    public final void v7(TintTextView tintTextView, String str) {
        if (str == null || StringsKt.isBlank(str)) {
            return;
        }
        tintTextView.setText(str);
        tintTextView.setMovementMethod(LinkMovementMethod.getInstance());
        tintTextView.measure(View.MeasureSpec.makeMeasureSpec(ScreenUtil.getScreenWidth(this) - ListExtentionsKt.toPx(40), BLMobileHumanActionNative.BL_MOBILE_DETECT_TONGUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        OneShotPreDrawListener.add(tintTextView, new b(tintTextView, tintTextView, this, str));
    }

    public final void w7(boolean z6, boolean z7, boolean z8) {
        ((LinearLayout) this.f83952O.getValue()).setEnabled(z6);
        a7().setEnabled(z6);
        ((TextView) this.f83955R.getValue()).setEnabled(z6);
        Y6().setEnabled(z7);
        Y6().setImageTintList(z7 ? R$color.Ga6 : R$color.Ga4);
        ((TextView) this.f83956S.getValue()).setEnabled(z7);
        ((TintImageView) this.f83960W.getValue()).setEnabled(z8);
        ((TintImageView) this.f83960W.getValue()).setImageTintList(z8 ? R$color.Ga6 : R$color.Ga4);
        ((TextView) this.f83957T.getValue()).setEnabled(z8);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void x7(@NotNull InterfaceC5992n interfaceC5992n) throws NoWhenBranchMatchedException {
        List<com.bilibili.playset.api.c> listD;
        com.bilibili.playset.api.d dVar = this.f83962X0;
        if (dVar == null || (listD = dVar.d()) == null || !(!listD.isEmpty())) {
            if (Intrinsics.areEqual(interfaceC5992n, InterfaceC5992n.b.f85103a)) {
                y7(this, null, new ErrorState.Empty(0, (MessageString) null, (MessageString) null, (MessageString) null, false, 31, (DefaultConstructorMarker) null), null, 5);
                return;
            }
            if (Intrinsics.areEqual(interfaceC5992n, InterfaceC5992n.c.f85104a)) {
                y7(this, PlaceHolderState.LoadingHolder.INSTANCE, null, null, 6);
                return;
            }
            if (Intrinsics.areEqual(interfaceC5992n, InterfaceC5992n.d.f85105a)) {
                y7(this, null, new ErrorState.NetworkError(0, (MessageString) null, new MessageString.ResourceString(2131841407), new MessageString.ResourceString(2131841467), false, 19, (DefaultConstructorMarker) null), null, 5);
            } else if (Intrinsics.areEqual(interfaceC5992n, InterfaceC5992n.e.f85106a)) {
                y7(this, null, new ErrorState.OtherError(0, (MessageString) null, new MessageString.ResourceString(2131841412), new MessageString.ResourceString(2131841467), false, 19, (DefaultConstructorMarker) null), null, 5);
            } else {
                if (!Intrinsics.areEqual(interfaceC5992n, InterfaceC5992n.a.f85102a)) {
                    throw new NoWhenBranchMatchedException();
                }
                y7(this, null, new ErrorState.Empty(0, (MessageString) null, new MessageString.ResourceString(2131842469), new MessageString.ResourceString(2131842519), true, 3, (DefaultConstructorMarker) null), new a70.G(this, 1), 1);
            }
        }
    }
}
