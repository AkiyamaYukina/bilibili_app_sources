package com.bilibili.studio.editor.moudle.editormain.ui;

import By0.A;
import By0.A0;
import By0.A1;
import By0.B;
import By0.B0;
import By0.B1;
import By0.C1438a;
import By0.C1440a1;
import By0.C1443b1;
import By0.C1449d1;
import By0.C1452e1;
import By0.C1453f;
import By0.C1455f1;
import By0.C1459h;
import By0.C1462i;
import By0.C1464i1;
import By0.C1465j;
import By0.C1466j0;
import By0.C1467j1;
import By0.C1468k;
import By0.C1469k0;
import By0.C1470k1;
import By0.C1471l;
import By0.C1473l1;
import By0.C1474m;
import By0.C1475m0;
import By0.C1476m1;
import By0.C1477n;
import By0.C1480o;
import By0.C1481o0;
import By0.C1485p1;
import By0.C1487q0;
import By0.C1488q1;
import By0.C1494t;
import By0.C1498u0;
import By0.C1499u1;
import By0.C1502v1;
import By0.C1505w1;
import By0.C1508x1;
import By0.C1510y0;
import By0.C1511z;
import By0.D0;
import By0.E0;
import By0.E1;
import By0.F0;
import By0.H0;
import By0.H1;
import By0.I0;
import By0.J0;
import By0.K0;
import By0.L;
import By0.L0;
import By0.L1;
import By0.M0;
import By0.M1;
import By0.N;
import By0.N0;
import By0.O;
import By0.O0;
import By0.O1;
import By0.P0;
import By0.T;
import By0.U;
import By0.U1;
import By0.W0;
import By0.X1;
import By0.Y0;
import By0.Z0;
import By0.r;
import By0.y1;
import By0.z1;
import Dy0.C1606b;
import Dy0.C1607c;
import Dy0.C1608d;
import Ex0.n;
import Fm0.RunnableC1895c;
import Hy0.t;
import Ky0.k0;
import Ly0.C2542a;
import Ly0.C2543b;
import Ly0.E;
import Mx0.a;
import NI.l;
import Pb.F;
import Py0.k;
import RB0.b;
import TB0.C2868b;
import TB0.C2890w;
import TB0.C2891x;
import TB0.C2892y;
import TB0.l0;
import UC0.n;
import XY0.j;
import Z50.c;
import a70.I;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.C4448z;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewbinding.ViewBinding;
import androidx.window.layout.WindowInfoTracker;
import androidx.window.layout.WindowInfoTrackerImpl;
import bE0.C4943c;
import bolts.Continuation;
import bolts.Task;
import com.bapis.bilibili.im.interfaces.v1.HasLikeState;
import com.bapis.bilibili.live.play_gateway.KGetMasterPlayQualityResp;
import com.bapis.bilibili.live.play_gateway.KPlayStyle;
import com.bilibili.ad.adview.pegasus.holders.inline.card149.FeedAdHolder149;
import com.bilibili.ad.adview.search.card147.AdSearchGoodsView;
import com.bilibili.adcommon.data.model.SubCardModule;
import com.bilibili.adcommon.utils.ext.JSONObjectCreator;
import com.bilibili.api.rights.medal.IMedalConfigProvider;
import com.bilibili.app.authorspace.ui.nft.ui.activity.SpaceNftOverviewActivity;
import com.bilibili.app.comm.list.widget.statement.ErrorState;
import com.bilibili.app.comm.list.widget.statement.PlaceHolderState;
import com.bilibili.app.comm.list.widget.text.MessageString;
import com.bilibili.app.comment3.CommentFloatingWebViewType;
import com.bilibili.app.comment3.action.ReportAction;
import com.bilibili.app.comment3.data.model.CommentItem;
import com.bilibili.app.comment3.ui.holder.handle.CommentContentRichTextHandler;
import com.bilibili.app.comment3.ui.holder.handle.b0;
import com.bilibili.app.comment3.ui.holder.m;
import com.bilibili.base.BiliContext;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import com.bilibili.biligame.compose.ExposerKt;
import com.bilibili.biligame.share.FeedSharePanel;
import com.bilibili.biligame.ui.homecontainer.v2.HomeContainerFragmentV2;
import com.bilibili.biligame.ui.homecontainer.v2.HomeContainerToolbarV2;
import com.bilibili.biligame.ui.strategy.DetailStrategyFragment;
import com.bilibili.bililive.biz.rank.online.entrance.LiveHighEnergyEntranceRankWidgetV2;
import com.bilibili.bililive.biz.revenuePlay.starKnight.ILiveStarKnightPendant;
import com.bilibili.bililive.biz.uicommon.medal.LiveMedalInfo;
import com.bilibili.bililive.infra.arch.jetpack.liveData.SafeMutableLiveData;
import com.bilibili.bililive.infra.log.LiveLog;
import com.bilibili.bililive.infra.log.LiveLogDelegate;
import com.bilibili.bililive.infra.trace.LiveReporter;
import com.bilibili.bililive.room.biz.multiscreen.LiveMultiScreenInfo;
import com.bilibili.bililive.room.biz.pk.LiveRoomPKViewModel;
import com.bilibili.bililive.room.ui.roomv3.player.LiveRoomPlayerViewModel;
import com.bilibili.bililive.shared.router.LiveRouterHelper;
import com.bilibili.bililive.videoliveplayer.ui.roomv3.panel.LiveOpenRankParam;
import com.bilibili.bplus.followinglist.interaction.DyInteractionListFragment;
import com.bilibili.bplus.followinglist.page.opus.z;
import com.bilibili.bplus.im.business.message.GptTextContent;
import com.bilibili.bplus.im.business.model.BaseTypedMessage;
import com.bilibili.bplus.im.communication.BaseConversationListFragment;
import com.bilibili.bplus.im.communication.HomeCommunicationFragment;
import com.bilibili.bplus.im.communication.widget.HomeLoadingView;
import com.bilibili.bplus.im.communication.widget.IMMainNotificationView;
import com.bilibili.bplus.im.conversation.ConversationActivity;
import com.bilibili.bplus.im.entity.ChatMessage;
import com.bilibili.bus.Violet;
import com.bilibili.compose.utils.ModifierUtilsKt;
import com.bilibili.digital.card.page.card.cardmodule.web.FeaturePanelService;
import com.bilibili.droid.BundleUtil;
import com.bilibili.droid.CpuUtils;
import com.bilibili.droid.ScreenUtil;
import com.bilibili.droid.ToastHelper;
import com.bilibili.gripper.api.ad.biz.following.AdDynamicSceneType;
import com.bilibili.gripper.api.ad.biz.following.IAdFollowingSourceContentWrapper;
import com.bilibili.lib.arch.lifecycle.Resource;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blconfig.Contract;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.MutableBundleLike;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.editor.UpperEditorBehavior;
import com.bilibili.lib.fasthybrid.GlobalConfig;
import com.bilibili.lib.fasthybrid.biz.kids.KidsBiz;
import com.bilibili.lib.moss.api.BusinessException;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.performance.EntryPointKt;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.PermissionsChecker;
import com.bilibili.lib.v8.spdlog.SpdLog;
import com.bilibili.opd.app.bizcommon.hybridruntime.KFCHybridV2;
import com.bilibili.pegasus.api.modelv2.DescButton;
import com.bilibili.pegasus.card.j0;
import com.bilibili.studio.editor.asr.zip2ai.AsrZip2AiTask;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo;
import com.bilibili.studio.editor.moudle.clip.ui.BiliEditorSortFragment;
import com.bilibili.studio.editor.moudle.danmaku.setting.ui.BiliEditorDanmakuSettingFragment;
import com.bilibili.studio.editor.moudle.editormain.constans.EngineInitResult;
import com.bilibili.studio.editor.moudle.editormain.track.beans.BiliEditorMaterialMultiInfo;
import com.bilibili.studio.editor.moudle.editormain.track.material.addview.BiliEditorMaterialAddView;
import com.bilibili.studio.editor.moudle.editormain.track.material.foldetrack.BiliEditorMaterialFoldTrackView;
import com.bilibili.studio.editor.moudle.editormain.track.material.multitrack.BiliEditorMaterialPanelTrackView;
import com.bilibili.studio.editor.moudle.editormain.track.material.multitrack.data.PanelTrackMode;
import com.bilibili.studio.editor.moudle.editormain.ui.BiliEditorMainActivity;
import com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.batchedit.BiliEditorCaptionEditFragmentV3;
import com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.batchedit.BiliEditorStickerBatchEditFragmentV3;
import com.bilibili.studio.editor.moudle.editormain.ui.fragments.clip.BiliEditorSortFragmentV3;
import com.bilibili.studio.editor.moudle.editormain.ui.fragments.clip.BiliEditorSpeedFragmentV3;
import com.bilibili.studio.editor.moudle.editormain.ui.fragments.danmaku.BiliEditorDanmakuSettingFragmentV3;
import com.bilibili.studio.editor.moudle.editormain.ui.fragments.music.ui.BiliEditorMusicListFragmentV3;
import com.bilibili.studio.editor.moudle.editormain.ui.fragments.picture.BiliEditorPictureFragmentV3;
import com.bilibili.studio.editor.moudle.editormain.ui.fragments.record.fragment.BiliMainEditorRecordFragment;
import com.bilibili.studio.editor.moudle.editormain.ui.fragments.sticker.BiliEditorStickerListFragment;
import com.bilibili.studio.editor.moudle.editormain.ui.fragments.template.BiliEditorTemplateFragmentV5;
import com.bilibili.studio.editor.moudle.editormain.ui.fragments.transition.BiliEditorTransitionFragmentV2;
import com.bilibili.studio.editor.moudle.editormain.ui.panels.BiliEditorMainPanel;
import com.bilibili.studio.editor.moudle.editormain.ui.panels.control.MainPanelMaterialTrackType;
import com.bilibili.studio.editor.moudle.editormain.ui.widget.EditorPreviewDashedLineView;
import com.bilibili.studio.editor.moudle.editormain.uistate.mainpanel.MainPanelMaterialEditableFoldTrackUiState;
import com.bilibili.studio.editor.moudle.editormain.uistate.mainpanel.MainPanelMaterialFoldTrackUiState;
import com.bilibili.studio.editor.moudle.editormain.uistate.topbtn.TopBtnNextType;
import com.bilibili.studio.editor.moudle.editormain.usecase.captionmodule.EditorCaptionUseCase;
import com.bilibili.studio.editor.moudle.home.presenter.a;
import com.bilibili.studio.editor.moudle.home.ui.InfoDialogV2;
import com.bilibili.studio.editor.moudle.templatev2.BiliEditTemplateBaseFragment;
import com.bilibili.studio.editor.repository.data.BiliEditorStickerInfo;
import com.bilibili.studio.editor.timeline.UpperEngineScene;
import com.bilibili.studio.editor.timeline.UpperLiveWindowExt;
import com.bilibili.studio.editor.timeline.k;
import com.bilibili.studio.material.util.UtilsKt;
import com.bilibili.studio.template.widget.EditorCircleProgressView;
import com.bilibili.studio.template.widget.EditorDownloadProgressDialog;
import com.bilibili.studio.videoeditor.D;
import com.bilibili.studio.videoeditor.G;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import com.bilibili.studio.videoeditor.common.intent.a;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.bilibili.studio.videoeditor.event.EventFinishEdit;
import com.bilibili.studio.videoeditor.exception.FileNotExistedError;
import com.bilibili.studio.videoeditor.extension.FragmentExtKt;
import com.bilibili.studio.videoeditor.gamemaker.GameSchemeBean;
import com.bilibili.studio.videoeditor.generalrender.parsexml.base.ThreadUtils;
import com.bilibili.studio.videoeditor.help.compiler.sdk.i;
import com.bilibili.studio.videoeditor.ms.transition.TransitionInfo;
import com.bilibili.studio.videoeditor.template.BiliTemplateEngineManager;
import com.bilibili.studio.videoeditor.util.C6645s;
import com.bilibili.studio.videoeditor.util.ResolutionType;
import com.bilibili.topix.topixset.TopixSetActivity;
import com.bilibili.upper.module.contribute.up.mds.MoodDailySignTransmitActivity;
import com.bilibili.video.story.StoryDetail;
import com.bilibili.video.story.StoryVideoFragment;
import com.bilibili.xpref.Xpref;
import com.mall.common.extension.MallKtExtensionKt;
import com.mall.data.page.home.bean.plantseeds.MallHomePageFeedsBean;
import com.mall.data.page.home.data.plantseeds.remote.MallHomeTabPageDataRemoteSource;
import com.mall.ui.page.detail.MallDyDetailFragment;
import com.mall.ui.page.feeds.MallStoryFeedsFragment;
import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import ih0.C7577d;
import ih0.C7578e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kntr.app.game.gamebind.bean.UnbindRoleItem;
import kntr.app.mall.product.details.page.ui.components.D2;
import kntr.app.mall.product.details.page.ui.components.g5;
import kntr.app.tribee.steam.viewmodel.b;
import kntr.base.imageloader.p;
import kntr.base.log.KLog_androidKt;
import kntr.common.dionysus.playing.common.ijk.behavior.IJKPlayOrPauseBehaviorKt;
import kntr.common.dionysus.playing.common.ijk.behavior.IJKVideoSizeBehaviorKt;
import kntr.common.dionysus.playing.common.ijk.behavior.IJKVideoStateBehaviorKt;
import kntr.common.dionysus.vod.ijk.behavior.PositionBehaviorKt;
import kntr.common.dionysus.vod.ijk.behavior.QualityBehaviorsKt;
import kntr.common.dionysus.vod.ijk.behavior.SeekBehaviorKt;
import kntr.common.dionysus.vod.ijk.behavior.VolumeBehaviorKt;
import kntr.common.dionysus.vod.ijk.d;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import lB0.a;
import lB0.a$b;
import nw0.C8145a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import ow0.HandlerC8270a;
import px0.b;
import q4.M;
import retrofit2.Response;
import rx.Single;
import rx.schedulers.Schedulers;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.fullscreen.state.U;
import tv.danmaku.bili.ui.main2.mineV3.flowredux.MineUserCenterViewModel3;
import tv.danmaku.bili.ui.main2.mineV3.flowredux.f;
import vm0.d;
import xw0.InterfaceC9010a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/BiliEditorMainActivity.class */
@AndroidEntryPoint
public final class BiliEditorMainActivity extends i<dz0.c, C2868b> implements InterfaceC9010a {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final int f106268Y = 0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    @Nullable
    public U1 f106273M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    @Nullable
    public E1 f106274N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    @Nullable
    public L0 f106275O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    @Nullable
    public C1455f1 f106276P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    @Nullable
    public T f106277Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    @Nullable
    public U f106278R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    @Nullable
    public a.a f106279S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    @Nullable
    public a.a f106280T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    @Nullable
    public WindowInfoTrackerImpl f106281U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f106282V;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    @NotNull
    public final C1464i1 f106269I = new Object();

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    @NotNull
    public final X1 f106270J = new Object();

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    @NotNull
    public final C1481o0 f106271K = new C1481o0();

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    @NotNull
    public final H1 f106272L = new H1(new I(this, 3), new com.bilibili.app.authorspace.ui.pages.game.g(this, 4));

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public boolean f106283W = true;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    @NotNull
    public final a f106284X = new a(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/BiliEditorMainActivity$a.class */
    public static final class a implements b.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiliEditorMainActivity f106285a;

        public a(BiliEditorMainActivity biliEditorMainActivity) {
            this.f106285a = biliEditorMainActivity;
        }

        @Override // px0.b.d
        public final boolean a(MotionEvent motionEvent) {
            BiliEditorMainActivity biliEditorMainActivity = this.f106285a;
            T t7 = biliEditorMainActivity.f106277Q;
            b.d dVarA = null;
            Fragment fragmentB = t7 != null ? t7.b() : null;
            T t8 = biliEditorMainActivity.f106277Q;
            if (t8 != null) {
                dVarA = t8.a();
            }
            if (fragmentB != null && dVarA == null) {
                return true;
            }
            BiliEditorMainActivity.X6(biliEditorMainActivity, true, motionEvent, fragmentB instanceof BiliEditTemplateBaseFragment, dVarA);
            return true;
        }

        @Override // px0.b.d
        public final void b() {
            BiliEditorMainActivity biliEditorMainActivity = this.f106285a;
            T t7 = biliEditorMainActivity.f106277Q;
            b.d dVarA = t7 != null ? t7.a() : null;
            dz0.c cVar = ((Yv0.b) biliEditorMainActivity).B;
            k.b bVarL = null;
            if (cVar != null) {
                dz0.h hVar = cVar.e;
                bVarL = null;
                if (hVar != null) {
                    k kVar = hVar.v;
                    bVarL = null;
                    if (kVar != null) {
                        bVarL = kVar.l();
                    }
                }
            }
            if (dVarA == null && bVarL != null) {
                bVarL.b();
            }
        }

        @Override // px0.b.d
        public final void c() {
            BiliEditorMainActivity biliEditorMainActivity = this.f106285a;
            T t7 = biliEditorMainActivity.f106277Q;
            b.d dVarA = t7 != null ? t7.a() : null;
            dz0.c cVar = ((Yv0.b) biliEditorMainActivity).B;
            k.b bVarL = null;
            if (cVar != null) {
                dz0.h hVar = cVar.e;
                bVarL = null;
                if (hVar != null) {
                    k kVar = hVar.v;
                    bVarL = null;
                    if (kVar != null) {
                        bVarL = kVar.l();
                    }
                }
            }
            if (dVarA == null && bVarL != null) {
                bVarL.c();
            }
        }

        @Override // px0.b.d
        public final void d(float f7) {
            BiliEditorMainActivity biliEditorMainActivity = this.f106285a;
            T t7 = biliEditorMainActivity.f106277Q;
            b.d dVarA = t7 != null ? t7.a() : null;
            dz0.c cVar = ((Yv0.b) biliEditorMainActivity).B;
            k.b bVarL = null;
            if (cVar != null) {
                dz0.h hVar = cVar.e;
                bVarL = null;
                if (hVar != null) {
                    k kVar = hVar.v;
                    bVarL = null;
                    if (kVar != null) {
                        bVarL = kVar.l();
                    }
                }
            }
            if (dVarA == null && bVarL != null) {
                bVarL.d(f7);
            }
        }

        @Override // px0.b.d
        public final boolean e(MotionEvent motionEvent) {
            BiliEditorMainActivity biliEditorMainActivity = this.f106285a;
            T t7 = biliEditorMainActivity.f106277Q;
            b.d dVarA = null;
            Fragment fragmentB = t7 != null ? t7.b() : null;
            T t8 = biliEditorMainActivity.f106277Q;
            if (t8 != null) {
                dVarA = t8.a();
            }
            if (fragmentB != null && dVarA == null) {
                return true;
            }
            BiliEditorMainActivity.X6(biliEditorMainActivity, false, motionEvent, fragmentB instanceof BiliEditTemplateBaseFragment, dVarA);
            return true;
        }

        @Override // px0.b.d
        public final void f(float f7, float f8) {
            BiliEditorMainActivity biliEditorMainActivity = this.f106285a;
            T t7 = biliEditorMainActivity.f106277Q;
            b.d dVarA = t7 != null ? t7.a() : null;
            dz0.c cVar = ((Yv0.b) biliEditorMainActivity).B;
            k.b bVarL = null;
            if (cVar != null) {
                dz0.h hVar = cVar.e;
                bVarL = null;
                if (hVar != null) {
                    k kVar = hVar.v;
                    bVarL = null;
                    if (kVar != null) {
                        bVarL = kVar.l();
                    }
                }
            }
            if (dVarA == null && bVarL != null) {
                bVarL.f(f7, f8);
            }
        }

        @Override // px0.b.d
        public final void g(float f7) {
            BiliEditorMainActivity biliEditorMainActivity = this.f106285a;
            T t7 = biliEditorMainActivity.f106277Q;
            b.d dVarA = t7 != null ? t7.a() : null;
            dz0.c cVar = ((Yv0.b) biliEditorMainActivity).B;
            k.b bVarL = null;
            if (cVar != null) {
                dz0.h hVar = cVar.e;
                bVarL = null;
                if (hVar != null) {
                    k kVar = hVar.v;
                    bVarL = null;
                    if (kVar != null) {
                        bVarL = kVar.l();
                    }
                }
            }
            if (dVarA == null && bVarL != null) {
                bVarL.g(f7);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/BiliEditorMainActivity$b.class */
    public static final /* synthetic */ class b implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function1 f106286a;

        public b(Function1 function1) {
            this.f106286a = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            boolean zAreEqual = false;
            if (obj instanceof Observer) {
                zAreEqual = false;
                if (obj instanceof FunctionAdapter) {
                    zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
            }
            return zAreEqual;
        }

        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f106286a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f106286a.invoke(obj);
        }
    }

    public static final void X6(BiliEditorMainActivity biliEditorMainActivity, boolean z6, MotionEvent motionEvent, boolean z7, b.d dVar) {
        C2891x c2891x;
        dz0.c cVar;
        dz0.h hVar;
        C2542a c2542a;
        if (motionEvent == null) {
            biliEditorMainActivity.getClass();
            return;
        }
        C2868b c2868b = (C2868b) ((Yv0.b) biliEditorMainActivity).C;
        if (c2868b == null || (c2891x = c2868b.f23744f) == null) {
            return;
        }
        UpperLiveWindowExt upperLiveWindowExt = c2891x.f24044g;
        RelativeLayout relativeLayout = c2891x.h;
        if (relativeLayout == null || (cVar = ((Yv0.b) biliEditorMainActivity).B) == null || (hVar = cVar.e) == null || (c2542a = hVar.d) == null) {
            return;
        }
        com.bilibili.studio.editor.timeline.i iVar = c2542a.f14914a.f4833c;
        Set<String> set = Yw0.c.f29324a;
        CaptionInfo captionInfoB = Yw0.c.b(iVar, relativeLayout, upperLiveWindowExt, motionEvent.getX(), motionEvent.getY());
        if (captionInfoB != null && dVar != null) {
            if (z6 && dVar.a(motionEvent)) {
                return;
            }
            if (!z6 && dVar.e(motionEvent)) {
                return;
            }
        }
        BiliEditorStickerInfo biliEditorStickerInfoC = (z7 || captionInfoB != null) ? null : Yw0.c.c(iVar, relativeLayout, upperLiveWindowExt, motionEvent.getX(), motionEvent.getY());
        if (captionInfoB == null && biliEditorStickerInfoC == null) {
            return;
        }
        String str = z7 ? "模板页" : "主页面";
        EditorCaptionUseCase editorCaptionUseCase = c2542a.f14916c;
        C2543b c2543b = editorCaptionUseCase.h;
        c2543b.getClass();
        Object obj = captionInfoB == null ? biliEditorStickerInfoC : captionInfoB;
        Ly0.I i7 = c2543b.f14921d.f18128e;
        if (i7 != null) {
            i7.invoke(obj, Boolean.valueOf(z6));
        }
        E e7 = editorCaptionUseCase.f107137g;
        if (captionInfoB != null) {
            e7.getClass();
            E.p(captionInfoB, z6, str);
            e7.q("文字");
        }
        if (biliEditorStickerInfoC != null) {
            e7.q("贴纸");
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    public final void P6(@Nullable Bundle bundle) throws NoWhenBranchMatchedException, IOException {
        Lifecycle lifecycle = getLifecycle();
        this.f106269I.getClass();
        String[] strArr = PermissionsChecker.STORAGE_WITH_AUDIO_PERMISSIONS;
        if (PermissionsChecker.checkSelfPermissions(this, strArr)) {
            Y6(bundle);
            Unit unit = Unit.INSTANCE;
        } else {
            PermissionsChecker.onPermissionResult(17, strArr, new int[0]);
            PermissionsChecker.grantPermission((Activity) this, lifecycle, strArr, 17, Build.VERSION.SDK_INT >= 33 ? 2131842408 : 2131850707, getString(((Boolean) zw0.b.f130951b.getValue()).booleanValue() ? 2131842197 : 2131841864));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ViewBinding R6() {
        return C2868b.inflate(getLayoutInflater());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Yv0.c S6() {
        return new ViewModelProvider(this).get(dz0.c.class);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [By0.E1, By0.a] */
    public final void Y6(Bundle bundle) throws NoWhenBranchMatchedException, IOException {
        EngineInitResult engineInitResult;
        dz0.g gVar;
        ez0.e eVar;
        dz0.g gVar2;
        ez0.f fVar;
        dz0.g gVar3;
        ez0.c cVar;
        final L0 l02;
        dz0.g gVar4;
        ez0.d dVar;
        final C1455f1 c1455f1;
        dz0.g gVar5;
        ez0.b bVar;
        dz0.g gVar6;
        ez0.a aVar;
        final T t7;
        ConstraintLayout constraintLayout;
        D d7;
        int i7;
        this.f106282V = true;
        dz0.c cVar2 = ((Yv0.b) this).B;
        if (cVar2 != null) {
            n nVar = cVar2.d.a;
            nVar.getClass();
            try {
                n.s();
                Xz0.h.b();
                UpperEditorBehavior.b.a().c(nVar.f4838i, nVar.f4844o);
                nVar.h();
                engineInitResult = EngineInitResult.INIT_SUCCESS;
            } catch (FileNotExistedError e7) {
                BLog.e("StreamingRepository", e7.getMessage());
                engineInitResult = EngineInitResult.FAIL_NO_RESOURCE;
            } catch (NullPointerException e8) {
                BLog.e("StreamingRepository", "onCreate start ms init sdk streamingContext null");
                engineInitResult = EngineInitResult.FAIL_LOW_VERSION;
            } catch (UnsatisfiedLinkError e9) {
                M.b("onCreate start ms init sdk error: ", e9.getLocalizedMessage(), "StreamingRepository");
                engineInitResult = EngineInitResult.FAIL_X86;
            }
        } else {
            engineInitResult = null;
        }
        if (engineInitResult == null) {
            BLog.e("BiliEditorMainActivity", "finish() onActivityCreate resultCode==null");
            finish();
            return;
        }
        EngineInitResult engineInitResult2 = EngineInitResult.INIT_SUCCESS;
        final C1481o0 c1481o0 = this.f106271K;
        if (engineInitResult != engineInitResult2) {
            c1481o0.getClass();
            if (engineInitResult != engineInitResult2) {
                int i8 = C1481o0.a.f1292a[engineInitResult.ordinal()];
                if (i8 == 1) {
                    i7 = CpuUtils.isX86(this) ? 2131841817 : 2131856215;
                } else if (i8 == 2) {
                    i7 = 2131842023;
                } else if (i8 == 3) {
                    i7 = 2131841921;
                } else {
                    if (i8 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i7 = 0;
                }
                C6645s.b(this, i7, null);
                return;
            }
            return;
        }
        C2868b c2868b = (C2868b) ((Yv0.b) this).C;
        if (c2868b == null) {
            BLog.e("BiliEditorMainActivity", "finish() onViewInit binding == null");
            finish();
        } else {
            this.f106270J.getClass();
            if (bundle != null) {
                String string = bundle.getString("edit_customize");
                String str = string;
                if (string == null) {
                    str = "";
                }
                try {
                    d7 = (D) Class.forName(str).newInstance();
                    try {
                        d7.setContext(this);
                    } catch (ClassNotFoundException e10) {
                        e = e10;
                        e.printStackTrace();
                    } catch (IllegalAccessException e11) {
                        e = e11;
                        e.printStackTrace();
                    } catch (InstantiationException e12) {
                        e = e12;
                        e.printStackTrace();
                    } catch (NullPointerException e13) {
                        e = e13;
                        e.printStackTrace();
                    }
                } catch (ClassNotFoundException e14) {
                    e = e14;
                    d7 = null;
                } catch (IllegalAccessException e15) {
                    e = e15;
                    d7 = null;
                } catch (InstantiationException e16) {
                    e = e16;
                    d7 = null;
                } catch (NullPointerException e17) {
                    e = e17;
                    d7 = null;
                }
                D e18 = d7;
                if (d7 == null) {
                    e18 = new com.bilibili.studio.videoeditor.E(this);
                }
                G.b().f108864a = e18;
            }
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            l0 l0Var = c2868b.f23740b;
            C1464i1 c1464i1 = this.f106269I;
            C2891x c2891x = c2868b.f23744f;
            this.f106277Q = new T(supportFragmentManager, c1464i1, c2891x, l0Var);
            this.f106273M = new U1(c2868b.h, c2868b.f23745g, new z(this, 2));
            this.f106274N = new C1438a(c2891x);
            c2891x.f24039b.setOnCommonTouchListener(this.f106284X);
            this.f106275O = new L0(c2868b.f23741c);
            this.f106276P = new C1455f1(c2868b.f23743e, new com.bilibili.biligame.ui.feed.dialog.backguide.e(this, 3));
            this.f106278R = new U(c2868b);
            C2868b c2868b2 = (C2868b) ((Yv0.b) this).C;
            if (c2868b2 != null && (constraintLayout = c2868b2.f23739a) != null) {
                constraintLayout.addOnLayoutChangeListener(new f(this, constraintLayout));
            }
            dz0.c cVar3 = ((Yv0.b) this).B;
            if (cVar3 != null && (gVar6 = cVar3.c) != null && (aVar = gVar6.f) != null && (t7 = this.f106277Q) != null) {
                final int i9 = 0;
                aVar.a.observe(this, new T.b(new Function1(t7, i9) { // from class: By0.e

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f1229a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Object f1230b;

                    {
                        this.f1229a = i9;
                        this.f1230b = t7;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:16:0x00a3  */
                    /* JADX WARN: Removed duplicated region for block: B:215:0x054c  */
                    /* JADX WARN: Type inference failed for: r1v58, types: [com.bilibili.lib.image2.bean.ScaleType, java.lang.Object] */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object invoke(java.lang.Object r11) {
                        /*
                            Method dump skipped, instruction units count: 2452
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: By0.C1450e.invoke(java.lang.Object):java.lang.Object");
                    }
                }));
                final int i10 = 0;
                aVar.b.observe(this, new T.b(new Function1(t7, i10) { // from class: By0.g

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f1239a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Object f1240b;

                    {
                        this.f1239a = i10;
                        this.f1240b = t7;
                    }

                    public final Object invoke(Object obj) {
                        switch (this.f1239a) {
                            case 0:
                                if (((Dy0.u) obj) != null) {
                                    ((T) this.f1240b).getClass();
                                }
                                return Unit.INSTANCE;
                            default:
                                LiveMedalInfo liveMedalInfo = (LiveMedalInfo) obj;
                                IMedalConfigProvider medalConfigProvider = ((sB.a) this.f1240b).getMedalConfigProvider();
                                Drawable medalIconDrawable$default = null;
                                if (medalConfigProvider != null) {
                                    medalIconDrawable$default = IMedalConfigProvider.getMedalIconDrawable$default(medalConfigProvider, liveMedalInfo, (Function1) null, 2, (Object) null);
                                }
                                return medalIconDrawable$default;
                        }
                    }
                }));
                final int i11 = 0;
                aVar.c.observe(this, new T.b(new Function1(t7, i11) { // from class: By0.s

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f1313a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Object f1314b;

                    {
                        this.f1313a = i11;
                        this.f1314b = t7;
                    }

                    public final Object invoke(Object obj) {
                        switch (this.f1313a) {
                            case 0:
                                Dy0.E e19 = (Dy0.E) obj;
                                if (e19 != null) {
                                    T t8 = (T) this.f1314b;
                                    t8.getClass();
                                    boolean z6 = e19.f3261a;
                                    FragmentManager fragmentManager = t8.f1156b;
                                    if (z6) {
                                        BiliEditTemplateBaseFragment biliEditTemplateBaseFragment = (BiliEditTemplateBaseFragment) fragmentManager.findFragmentByTag("BiliEditTemplateBaseFragment");
                                        if (biliEditTemplateBaseFragment != null) {
                                            t8.h(biliEditTemplateBaseFragment, "BiliEditTemplateBaseFragment", null);
                                        }
                                        t8.j(T.g(e19.f3264d), new BiliEditorTemplateFragmentV5(), "BiliEditTemplateBaseFragment", e19.f3263c);
                                    } else if (e19.f3262b) {
                                        Runnable runnable = e19.f3263c;
                                        BiliEditTemplateBaseFragment biliEditTemplateBaseFragment2 = (BiliEditTemplateBaseFragment) fragmentManager.findFragmentByTag("BiliEditTemplateBaseFragment");
                                        if (biliEditTemplateBaseFragment2 != null) {
                                            t8.h(biliEditTemplateBaseFragment2, "BiliEditTemplateBaseFragment", runnable);
                                        }
                                    } else {
                                        BiliEditTemplateBaseFragment biliEditTemplateBaseFragment3 = (BiliEditTemplateBaseFragment) fragmentManager.findFragmentByTag("BiliEditTemplateBaseFragment");
                                        if (biliEditTemplateBaseFragment3 != null) {
                                            C1447d c1447d = t8.f1159e;
                                            if (!c1447d.f1225d.isEmpty()) {
                                                c1447d.f1225d.remove("BiliEditTemplateBaseFragment");
                                            }
                                            biliEditTemplateBaseFragment3.f105692j = false;
                                            fragmentManager.beginTransaction().remove(biliEditTemplateBaseFragment3).commitAllowingStateLoss();
                                        }
                                    }
                                }
                                break;
                            case 1:
                                ((MutableBundleLike) obj).put("groupId", String.valueOf(((BT.i) this.f1314b).b()));
                                break;
                            case 2:
                                ((GraphicsLayerScope) obj).setRotationX(((kntr.common.datetime.picker.core.i) this.f1314b).a);
                                break;
                            default:
                                int iIntValue = ((Integer) obj).intValue();
                                defpackage.a.a(iIntValue, "RealNameEvent=>", "fastHybrid");
                                x60.j jVar = (x60.j) this.f1314b;
                                jVar.c.d(X50.q.b("type", KFCHybridV2.Configuration.SYSTEM_DOMAIN, NotificationCompat.CATEGORY_EVENT, "onRealNameAuthenticationChanged").put("data", new JSONObject().put("value", iIntValue)), "");
                                KidsBiz.Companion.getClass();
                                if (iIntValue == 0) {
                                    try {
                                        GlobalConfig.a.getClass();
                                        if (!GlobalConfig.f()) {
                                            t90.p.t(Single.create(new x60.b()).subscribeOn(Schedulers.io()).subscribe(new x60.e(new WI0.I0(3)), new x60.f()), jVar.e);
                                            break;
                                        }
                                    } catch (Exception e20) {
                                        e20.printStackTrace();
                                    }
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                final int i12 = 0;
                aVar.d.observe(this, new T.b(new Function1(t7, i12) { // from class: By0.w

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f1337a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Object f1338b;

                    {
                        this.f1337a = i12;
                        this.f1338b = t7;
                    }

                    public final Object invoke(Object obj) {
                        BiliEditTemplateBaseFragment biliEditTemplateBaseFragment;
                        switch (this.f1337a) {
                            case 0:
                                Dy0.D d8 = (Dy0.D) obj;
                                if (d8 != null && (biliEditTemplateBaseFragment = (BiliEditTemplateBaseFragment) ((T) this.f1338b).f1156b.findFragmentByTag("BiliEditTemplateBaseFragment")) != null) {
                                    biliEditTemplateBaseFragment.wf(d8.f3259a);
                                }
                                break;
                            default:
                                ((MutableState) this.f1338b).setValue((String) obj);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                final int i13 = 0;
                aVar.e.observe(this, new T.b(new Function1(t7, i13) { // from class: By0.x

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f1343a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Object f1344b;

                    {
                        this.f1343a = i13;
                        this.f1344b = t7;
                    }

                    public final Object invoke(Object obj) {
                        switch (this.f1343a) {
                            case 0:
                                Dy0.F f7 = (Dy0.F) obj;
                                if (f7 != null) {
                                    T t8 = (T) this.f1344b;
                                    t8.getClass();
                                    if (f7.f3265a) {
                                        t8.j(T.g(f7.f3267c), new BiliEditorTransitionFragmentV2(), "BiliEditorTransitionFragmentV2", f7.f3266b);
                                    } else {
                                        t8.h((BiliEditorTransitionFragmentV2) t8.f1156b.findFragmentByTag("BiliEditorTransitionFragmentV2"), "BiliEditorTransitionFragmentV2", f7.f3266b);
                                    }
                                }
                                break;
                            default:
                                ((MutableState) this.f1344b).setValue((String) obj);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                final int i14 = 0;
                aVar.f.observe(this, new T.b(new Function1(t7, i14) { // from class: By0.y

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f1348a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Object f1349b;

                    {
                        this.f1348a = i14;
                        this.f1349b = t7;
                    }

                    public final Object invoke(Object obj) {
                        SafeMutableLiveData safeMutableLiveData;
                        boolean z6 = false;
                        Object obj2 = this.f1349b;
                        switch (this.f1348a) {
                            case 0:
                                Dy0.p pVar = (Dy0.p) obj;
                                T t8 = (T) obj2;
                                if (pVar == null || !pVar.f3335a) {
                                    t8.h(t8.f1156b.findFragmentByTag("BiliEditorMusicListFragmentV3"), "BiliEditorMusicListFragmentV3", pVar.f3336b);
                                } else {
                                    t8.getClass();
                                    Bundle bundle2 = new Bundle();
                                    BiliEditorMusicListFragmentV3 biliEditorMusicListFragmentV3 = new BiliEditorMusicListFragmentV3();
                                    biliEditorMusicListFragmentV3.setArguments(bundle2);
                                    t8.j(T.g(pVar.f3337c), biliEditorMusicListFragmentV3, "BiliEditorMusicListFragmentV3", pVar.f3336b);
                                }
                                return Unit.INSTANCE;
                            case 1:
                                ((b60.V) obj2).invoke();
                                return Unit.INSTANCE;
                            case 2:
                                ((MutableState) obj2).setValue((String) obj);
                                return Unit.INSTANCE;
                            case 3:
                                com.bilibili.bililive.room.ui.roomv3.player.controller.widget.a aVar2 = (com.bilibili.bililive.room.ui.roomv3.player.controller.widget.a) obj2;
                                if (aVar2.g == null) {
                                    aVar2.g = new AK.c(aVar2.i(), aVar2.h(aVar2.i().L1().d));
                                }
                                AK.c cVar4 = aVar2.g;
                                if (cVar4 != null) {
                                    cVar4.c();
                                }
                                LiveRoomPlayerViewModel liveRoomPlayerViewModel = aVar2.f;
                                if (liveRoomPlayerViewModel != null && (safeMutableLiveData = liveRoomPlayerViewModel.K) != null) {
                                    safeMutableLiveData.setValue(Boolean.TRUE);
                                }
                                LiveReporter.reportClick$default("live.live-room-detail.subtitle_button.0.click", (Map) null, false, 6, (Object) null);
                                LiveLog.Companion companion = LiveLog.Companion;
                                if (companion.matchLevel(3)) {
                                    String str2 = "LiveAITextWidget clicked" == 0 ? "" : "LiveAITextWidget clicked";
                                    LiveLogDelegate logDelegate = companion.getLogDelegate();
                                    if (logDelegate != null) {
                                        LiveLogDelegate.onLog$default(logDelegate, 3, "LiveAITextSettingWidget", str2, (Throwable) null, 8, (Object) null);
                                    }
                                    BLog.i("LiveAITextSettingWidget", str2);
                                }
                                return Unit.INSTANCE;
                            case 4:
                                MutableBundleLike mutableBundleLike = (MutableBundleLike) obj;
                                int i15 = HomeCommunicationFragment.G;
                                HomeCommunicationFragment homeCommunicationFragment = (HomeCommunicationFragment) obj2;
                                homeCommunicationFragment.getClass();
                                mutableBundleLike.put("conversation_type", String.valueOf(1));
                                mutableBundleLike.put("reciveid", String.valueOf(((BaseConversationListFragment) homeCommunicationFragment).i));
                                mutableBundleLike.put("systemMsg_type", String.valueOf(7));
                                Bundle bundle3 = new Bundle();
                                bundle3.putParcelable("conversation", null);
                                mutableBundleLike.put(BundleUtil.KEY_DEFAULT_EXTRA_BUNDLE, bundle3);
                                return null;
                            default:
                                if (((Pair) obj).getSecond() == ((com.bilibili.lib.fasthybrid.game.engine.ability.impl.audio.i) obj2)) {
                                    z6 = true;
                                }
                                return Boolean.valueOf(z6);
                        }
                    }
                }));
                aVar.g.observe(this, new T.b(new C1511z(t7, 0)));
                aVar.h.observe(this, new T.b(new B(t7, 0)));
                final int i15 = 0;
                aVar.i.observe(this, new T.b(new Function1(t7, i15) { // from class: By0.C

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f1050a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Object f1051b;

                    {
                        this.f1050a = i15;
                        this.f1051b = t7;
                    }

                    public final Object invoke(Object obj) {
                        List list;
                        switch (this.f1050a) {
                            case 0:
                                Dy0.A a7 = (Dy0.A) obj;
                                if (a7 != null) {
                                    T t8 = (T) this.f1051b;
                                    t8.getClass();
                                    if (a7.f3243a) {
                                        t8.j(T.g(a7.f3245c), new BiliEditorSpeedFragmentV3(), "BiliEditorSpeedFragmentV3", a7.f3244b);
                                    } else {
                                        t8.h((BiliEditorSpeedFragmentV3) t8.f1156b.findFragmentByTag("BiliEditorSpeedFragmentV3"), "BiliEditorSpeedFragmentV3", a7.f3244b);
                                    }
                                }
                                break;
                            case 1:
                                long jLongValue = ((Long) obj).longValue();
                                com.bilibili.app.comment3.ui.holder.m mVar = (com.bilibili.app.comment3.ui.holder.m) this.f1051b;
                                if (com.bilibili.app.comment3.utils.a.b(mVar.itemView.getContext(), (Function0) null, 2)) {
                                    mVar.t0(jLongValue);
                                }
                                break;
                            case 2:
                                Placeable.PlacementScope.placeRelative$default((Placeable.PlacementScope) obj, (Placeable) this.f1051b, 0, 0, 0.0f, 4, null);
                                break;
                            case 3:
                                ((LiveRoomPKViewModel) this.f1051b).n.setValue((List) obj);
                                break;
                            case 4:
                                com.bilibili.bplus.im.setting.q qVar = (com.bilibili.bplus.im.setting.q) obj;
                                HomeCommunicationFragment homeCommunicationFragment = (HomeCommunicationFragment) this.f1051b;
                                if (homeCommunicationFragment.z != null && !homeCommunicationFragment.isDetached()) {
                                    com.bilibili.bplus.im.communication.g1 g1Var = homeCommunicationFragment.z;
                                    if (!Intrinsics.areEqual(g1Var.c, qVar)) {
                                        boolean z6 = g1Var.c == null;
                                        g1Var.c = qVar;
                                        if (z6) {
                                            g1Var.notifyItemInserted(0);
                                        } else if (qVar == null) {
                                            g1Var.notifyItemRemoved(0);
                                        } else {
                                            g1Var.notifyItemChanged(0);
                                        }
                                        com.bilibili.bplus.im.setting.q qVar2 = g1Var.c;
                                        if (qVar2 != null && (list = qVar2.b) != null && (!list.isEmpty()) && !g1Var.f) {
                                            g1Var.f = true;
                                            for (com.bilibili.bplus.im.setting.s sVar : g1Var.c.b) {
                                                String strD = com.bilibili.bplus.im.setting.r.d(sVar.a);
                                                if (!StringsKt.isBlank(strD)) {
                                                    vT.b.o(sVar.h.a, strD);
                                                }
                                            }
                                        }
                                    }
                                }
                                break;
                            default:
                                if (Intrinsics.areEqual((kntr.base.imageloader.p) obj, p.d.a)) {
                                    ((tv.danmaku.bili.ui.main2.mineV2.ui.p0) this.f1051b).invoke();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                final int i16 = 0;
                aVar.j.observe(this, new T.b(new Function1(t7, i16) { // from class: By0.D

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f1056a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Object f1057b;

                    {
                        this.f1056a = i16;
                        this.f1057b = t7;
                    }

                    public final Object invoke(Object obj) {
                        switch (this.f1056a) {
                            case 0:
                                Dy0.z zVar = (Dy0.z) obj;
                                if (zVar != null) {
                                    T t8 = (T) this.f1057b;
                                    t8.getClass();
                                    if (zVar.f3363a) {
                                        BiliEditorSortFragmentV3 biliEditorSortFragmentV3 = new BiliEditorSortFragmentV3();
                                        biliEditorSortFragmentV3.setArguments(new Bundle());
                                        Bundle arguments = biliEditorSortFragmentV3.getArguments();
                                        if (arguments != null) {
                                            Integer num = zVar.f3366d;
                                            arguments.putInt("track_select_status", num != null ? num.intValue() : -1);
                                        }
                                        t8.j(T.g(zVar.f3365c), biliEditorSortFragmentV3, "BiliEditorSortFragmentV3", zVar.f3364b);
                                    } else {
                                        t8.h((BiliEditorSortFragment) t8.f1156b.findFragmentByTag("BiliEditorSortFragmentV3"), "BiliEditorSortFragmentV3", zVar.f3364b);
                                    }
                                }
                                break;
                            case 1:
                                ((b60.V) this.f1057b).invoke();
                                break;
                            case 2:
                                ThreadUtils.runOnUiThread(new com.bilibili.bililive.room.ui.roomv3.player.controller.widget.f((com.bilibili.bililive.room.ui.roomv3.player.controller.widget.g) this.f1057b, ((Integer) obj).intValue()));
                                break;
                            default:
                                com.bilibili.bplus.im.setting.p pVar = (com.bilibili.bplus.im.setting.p) obj;
                                HomeCommunicationFragment homeCommunicationFragment = (HomeCommunicationFragment) this.f1057b;
                                if (homeCommunicationFragment.z != null && !homeCommunicationFragment.isDetached()) {
                                    com.bilibili.bplus.im.communication.g1 g1Var = homeCommunicationFragment.z;
                                    if (!Intrinsics.areEqual(g1Var.d, pVar)) {
                                        g1Var.d = pVar;
                                        if (g1Var.c != null) {
                                            g1Var.notifyItemChanged(0);
                                        }
                                    }
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                final int i17 = 0;
                aVar.k.observe(this, new T.b(new Function1(t7, i17) { // from class: By0.p

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f1296a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Object f1297b;

                    {
                        this.f1296a = i17;
                        this.f1297b = t7;
                    }

                    public final Object invoke(Object obj) {
                        switch (this.f1296a) {
                            case 0:
                                Dy0.t tVar = (Dy0.t) obj;
                                T t8 = (T) this.f1297b;
                                t8.getClass();
                                if (tVar.f3349a) {
                                    t8.j(T.g(tVar.f3351c), new BiliEditorPictureFragmentV3(), "BiliEditorPictureFragmentV3", tVar.f3350b);
                                } else {
                                    t8.h(t8.f("BiliEditorPictureFragmentV3"), "BiliEditorPictureFragmentV3", tVar.f3350b);
                                }
                                break;
                            case 1:
                                ((b60.L) this.f1297b).invoke();
                                break;
                            case 2:
                                ((DetailStrategyFragment) this.f1297b).loadData();
                                break;
                            default:
                                ((MallDyDetailFragment) this.f1297b).yf((String) obj);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                aVar.l.observe(this, new T.b(new A(t7, 0)));
                aVar.m.observe(this, new T.b(new L(t7, 0)));
                final int i18 = 0;
                aVar.n.observe(this, new T.b(new Function1(t7, i18) { // from class: By0.M

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f1114a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Object f1115b;

                    {
                        this.f1114a = i18;
                        this.f1115b = t7;
                    }

                    public final Object invoke(Object obj) {
                        switch (this.f1114a) {
                            case 0:
                                Dy0.i iVar = (Dy0.i) obj;
                                T t8 = (T) this.f1115b;
                                if (iVar != null && iVar.f3306a) {
                                    t8.getClass();
                                    if (iVar.f3307b <= TransitionInfo.DEFAULT_DURATION) {
                                        Context context = ((TB0.l0) t8.f1201a).f23866c.getContext();
                                        ToastHelper.showToastShort(context, context.getString(2131850564));
                                    } else {
                                        BiliEditorDanmakuSettingFragment.a aVar2 = iVar.f3309d;
                                        if (aVar2 != null) {
                                            BiliEditorDanmakuSettingFragmentV3 biliEditorDanmakuSettingFragmentV3 = new BiliEditorDanmakuSettingFragmentV3();
                                            biliEditorDanmakuSettingFragmentV3.f106094e = aVar2;
                                            t8.j(T.g(iVar.f3310e), biliEditorDanmakuSettingFragmentV3, "BiliEditorDanmakuSettingFragmentV3", iVar.f3308c);
                                        }
                                    }
                                } else if (iVar != null && !iVar.f3306a) {
                                    Fragment fragmentFindFragmentByTag = t8.f1156b.findFragmentByTag("BiliEditorDanmakuSettingFragmentV3");
                                    BiliEditorDanmakuSettingFragment biliEditorDanmakuSettingFragment = fragmentFindFragmentByTag instanceof BiliEditorDanmakuSettingFragment ? (BiliEditorDanmakuSettingFragment) fragmentFindFragmentByTag : null;
                                    if (biliEditorDanmakuSettingFragment != null) {
                                        t8.h(biliEditorDanmakuSettingFragment, "BiliEditorDanmakuSettingFragmentV3", iVar.f3308c);
                                    }
                                }
                                break;
                            default:
                                ((kntr.app.ad.biz.videodetail.pausedpage.ui.imagegallery.G) this.f1115b).h.invoke((String) obj);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                aVar.o.observe(this, new T.b(new N(t7, 0)));
                aVar.p.observe(this, new T.b(new O(t7, 0)));
                final int i19 = 0;
                aVar.q.observe(this, new T.b(new Function1(t7, i19) { // from class: By0.P

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f1132a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Object f1133b;

                    {
                        this.f1132a = i19;
                        this.f1133b = t7;
                    }

                    public final Object invoke(Object obj) {
                        int i20;
                        String str2;
                        Unit unit;
                        String str3;
                        SafeMutableLiveData safeMutableLiveData;
                        SafeMutableLiveData safeMutableLiveData2;
                        xE.a aVarQ;
                        switch (this.f1132a) {
                            case 0:
                                C1608d c1608d = (C1608d) obj;
                                if (c1608d != null) {
                                    T t8 = (T) this.f1133b;
                                    t8.getClass();
                                    if (!c1608d.f3277a) {
                                        t8.h((BiliEditorCaptionEditFragmentV3) t8.f1156b.findFragmentByTag("BiliEditorCaptionEditFragmentV2"), "BiliEditorCaptionEditFragmentV2", c1608d.f3282f);
                                    } else if (c1608d.f3278b != null) {
                                        Bundle bundle2 = new Bundle();
                                        BiliEditorCaptionEditFragmentV3 biliEditorCaptionEditFragmentV3 = new BiliEditorCaptionEditFragmentV3();
                                        bundle2.putInt("item_asr_type", c1608d.f3280d);
                                        bundle2.putInt("item_init_index", c1608d.f3279c);
                                        biliEditorCaptionEditFragmentV3.setArguments(bundle2);
                                        biliEditorCaptionEditFragmentV3.f106315E = c1608d.f3281e;
                                        t8.j(T.g(c1608d.f3283g), biliEditorCaptionEditFragmentV3, "BiliEditorCaptionEditFragmentV2", c1608d.f3282f);
                                    } else {
                                        BLog.e("BottomFragmentUiManager", "updateAsrMultiEditFragmentUiState error arg");
                                    }
                                }
                                break;
                            case 1:
                                com.bilibili.bililive.room.ui.roomv3.player.controller.widget.s sVar = (com.bilibili.bililive.room.ui.roomv3.player.controller.widget.s) this.f1133b;
                                TK.f fVar2 = sVar.f;
                                if (fVar2 == null || !fVar2.c0()) {
                                    boolean zP = sVar.p();
                                    boolean z6 = !zP;
                                    if (zP) {
                                        HH.H h = sVar.h;
                                        if (h != null) {
                                            h.I(2131854036);
                                        }
                                        i20 = 0;
                                    } else {
                                        HH.H h7 = sVar.h;
                                        i20 = 1;
                                        if (h7 != null) {
                                            h7.I(2131854172);
                                            i20 = 1;
                                        }
                                    }
                                    HH.H h8 = sVar.h;
                                    if (h8 != null && (aVarQ = h8.Q()) != null) {
                                        aVarQ.X5(zP);
                                    }
                                    HH.H h9 = sVar.h;
                                    if (h9 != null) {
                                        h9.E = Boolean.FALSE;
                                    }
                                    LiveLog.Companion companion = LiveLog.Companion;
                                    if (companion.matchLevel(3)) {
                                        try {
                                            HH.H h10 = sVar.h;
                                            str2 = "[live-danmaku-opt-danmaku]LiveDanmuOptionsWidget 更新isForceOpenDanmaku:" + (h10 != null ? h10.E : null);
                                        } catch (Exception e19) {
                                            BLog.e("LiveLog", "getLogMessage", e19);
                                            str2 = null;
                                        }
                                        String str4 = str2;
                                        if (str2 == null) {
                                            str4 = "";
                                        }
                                        LiveLogDelegate logDelegate = companion.getLogDelegate();
                                        if (logDelegate != null) {
                                            LiveLogDelegate.onLog$default(logDelegate, 3, "LiveDanmuOptionsWidget", str4, (Throwable) null, 8, (Object) null);
                                        }
                                        BLog.i("LiveDanmuOptionsWidget", str4);
                                    }
                                    HH.H h11 = sVar.h;
                                    if (h11 != null) {
                                        h11.H(zP);
                                    }
                                    HH.H h12 = sVar.h;
                                    if (h12 != null && (safeMutableLiveData2 = h12.t) != null) {
                                        safeMutableLiveData2.setValue(Boolean.valueOf(z6));
                                    }
                                    HH.H h13 = sVar.h;
                                    if (h13 != null && (safeMutableLiveData = h13.N) != null) {
                                        safeMutableLiveData.setValue(Boolean.valueOf(z6));
                                    }
                                    HH.H h14 = sVar.h;
                                    if (h14 != null) {
                                        h14.Y(z6);
                                    }
                                    LiveRoomPlayerViewModel liveRoomPlayerViewModel = sVar.g;
                                    if (liveRoomPlayerViewModel != null) {
                                        liveRoomPlayerViewModel.M0(new Object[]{4, Integer.valueOf(i20)});
                                    }
                                    LiveLog.Companion companion2 = LiveLog.Companion;
                                    if (companion2.matchLevel(3)) {
                                        str3 = "LiveDanmuOptionsWidget clicked";
                                        str3 = str3 == null ? "" : "LiveDanmuOptionsWidget clicked";
                                        LiveLogDelegate logDelegate2 = companion2.getLogDelegate();
                                        if (logDelegate2 != null) {
                                            LiveLogDelegate.onLog$default(logDelegate2, 3, "LiveDanmuOptionsWidget", str3, (Throwable) null, 8, (Object) null);
                                        }
                                        BLog.i("LiveDanmuOptionsWidget", str3);
                                    }
                                    unit = Unit.INSTANCE;
                                } else {
                                    ToastHelper.showToastLong(BiliContext.application(), 2131854077);
                                    unit = Unit.INSTANCE;
                                }
                                break;
                            case 2:
                                IntSize intSize = (IntSize) obj;
                                MutableFloatState mutableFloatState = (MutableFloatState) this.f1133b;
                                if (mutableFloatState.getFloatValue() != ((int) (intSize.m3976unboximpl() & 4294967295L))) {
                                    KLog_androidKt.getKLog().i("AdPausedPagePreviewTrace", "overlay bottom measured size " + mutableFloatState.getFloatValue() + " -> " + ((int) (intSize.m3976unboximpl() & 4294967295L)));
                                }
                                mutableFloatState.setFloatValue((int) (intSize.m3976unboximpl() & 4294967295L));
                                break;
                            case 3:
                                v81.a.f((u81.a) this.f1133b, (String) obj);
                                break;
                            default:
                                Context context = (Context) this.f1133b;
                                if (Intrinsics.areEqual((kntr.base.imageloader.p) obj, p.d.a)) {
                                    SharedPreferences.Editor editorEdit = Xpref.getDefaultSharedPreferences(context).edit();
                                    editorEdit.putBoolean("key_vip_label_gif_shown", true);
                                    editorEdit.apply();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                final int i20 = 0;
                aVar.r.observe(this, new T.b(new Function1(t7, i20) { // from class: By0.Q

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f1139a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Object f1140b;

                    {
                        this.f1139a = i20;
                        this.f1140b = t7;
                    }

                    public final Object invoke(Object obj) {
                        ErrorState.NetworkError otherError;
                        switch (this.f1139a) {
                            case 0:
                                Dy0.B b7 = (Dy0.B) obj;
                                if (b7 != null) {
                                    T t8 = (T) this.f1140b;
                                    t8.getClass();
                                    if (b7.f3246a) {
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putInt("entrance_source", b7.f3249d);
                                        bundle2.putString("item_init_index", b7.f3250e);
                                        bundle2.putBoolean("batch_is_edit", b7.f3251f);
                                        BiliEditorStickerBatchEditFragmentV3 biliEditorStickerBatchEditFragmentV3 = new BiliEditorStickerBatchEditFragmentV3();
                                        biliEditorStickerBatchEditFragmentV3.setArguments(bundle2);
                                        biliEditorStickerBatchEditFragmentV3.f106347C = b7.f3252g;
                                        t8.j(T.g(b7.f3253i), biliEditorStickerBatchEditFragmentV3, "BiliEditorStickerBatchEditFragment", b7.h);
                                    } else {
                                        t8.h((BiliEditorStickerBatchEditFragmentV3) t8.f1156b.findFragmentByTag("BiliEditorStickerBatchEditFragment"), "BiliEditorStickerBatchEditFragment", b7.h);
                                    }
                                }
                                break;
                            case 1:
                                Resource resource = (Resource) obj;
                                int i21 = DyInteractionListFragment.a.a[resource.getStatus().ordinal()];
                                DyInteractionListFragment dyInteractionListFragment = (DyInteractionListFragment) this.f1140b;
                                if (i21 == 1) {
                                    List list = (List) resource.getData();
                                    if (list != null) {
                                        if (dyInteractionListFragment.nf().e) {
                                            ((ArrayList) dyInteractionListFragment.l).clear();
                                        }
                                        ((ArrayList) dyInteractionListFragment.l).addAll(list);
                                        com.bilibili.bplus.followinglist.interaction.e eVar2 = dyInteractionListFragment.k;
                                        if (eVar2 != null) {
                                            eVar2.notifyDataSetChanged();
                                        }
                                    }
                                    DyInteractionListFragment.mf(dyInteractionListFragment, (PlaceHolderState.LoadingHolder) null, new ErrorState.Empty(0, (MessageString) null, new MessageString.ResourceString(2131842781), (MessageString) null, false, 27, (DefaultConstructorMarker) null), 1);
                                } else if (i21 == 2) {
                                    BusinessException error = resource.getError();
                                    String message = error instanceof BusinessException ? error.getMessage() : null;
                                    if (ConnectivityMonitor.getInstance().isNetworkActive()) {
                                        otherError = new ErrorState.OtherError(0, (MessageString) null, message == null ? new MessageString.ResourceString(2131841381) : new MessageString.a(message), (MessageString) null, false, 27, (DefaultConstructorMarker) null);
                                    } else {
                                        otherError = new ErrorState.NetworkError(0, (MessageString) null, message == null ? new MessageString.ResourceString(2131842950) : new MessageString.a(message), (MessageString) null, false, 27, (DefaultConstructorMarker) null);
                                    }
                                    DyInteractionListFragment.mf(dyInteractionListFragment, (PlaceHolderState.LoadingHolder) null, otherError, 1);
                                }
                                break;
                            default:
                                IntSize intSize = (IntSize) obj;
                                MutableFloatState mutableFloatState = (MutableFloatState) this.f1140b;
                                if (mutableFloatState.getFloatValue() != ((int) (intSize.m3976unboximpl() & 4294967295L))) {
                                    KLog_androidKt.getKLog().i("AdPausedPagePreviewTrace", "overlay compliance measured size " + mutableFloatState.getFloatValue() + " -> " + ((int) (intSize.m3976unboximpl() & 4294967295L)));
                                }
                                mutableFloatState.setFloatValue((int) (intSize.m3976unboximpl() & 4294967295L));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                aVar.s.observe(this, new T.b(new Function1(t7, this) { // from class: By0.S

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final T f1150a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final BiliEditorMainActivity f1151b;

                    {
                        this.f1150a = t7;
                        this.f1151b = this;
                    }

                    public final Object invoke(Object obj) {
                        Dy0.w wVar = (Dy0.w) obj;
                        if (wVar != null) {
                            T t8 = this.f1150a;
                            t8.getClass();
                            if (wVar.f3353a) {
                                GeneratedComponentManagerHolder generatedComponentManagerHolder = this.f1151b;
                                Lifecycle lifecycle = generatedComponentManagerHolder.getLifecycle();
                                final F f7 = new F(0, t8, wVar);
                                final G g7 = new G(generatedComponentManagerHolder, 0);
                                t8.f1157c.getClass();
                                PermissionsChecker.grantPermission((Activity) generatedComponentManagerHolder, lifecycle, new String[]{"android.permission.RECORD_AUDIO"}, 19, 2131842416, generatedComponentManagerHolder.getString(2131842141)).continueWith(new Continuation(f7, g7) { // from class: By0.h1

                                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                                    public final F f1248a;

                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                    public final G f1249b;

                                    {
                                        this.f1248a = f7;
                                        this.f1249b = g7;
                                    }

                                    @Override // bolts.Continuation
                                    public final Object then(Task task) {
                                        if (task.isCancelled() || task.isFaulted()) {
                                            this.f1249b.invoke();
                                            return null;
                                        }
                                        this.f1248a.invoke();
                                        return null;
                                    }
                                }, Task.UI_THREAD_EXECUTOR);
                            } else {
                                Fragment fragmentFindFragmentByTag = t8.f1156b.findFragmentByTag("BiliMainEditorRecordFragment");
                                t8.h(fragmentFindFragmentByTag instanceof BiliMainEditorRecordFragment ? (BiliMainEditorRecordFragment) fragmentFindFragmentByTag : null, "BiliMainEditorRecordFragment", wVar.f3355c);
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }));
                aVar.t.observe(this, new T.b(new C1453f(t7, this)));
                aVar.u.observe(this, new T.b(new C1459h(t7, this)));
                aVar.v.observe(this, new T.b(new C1462i(t7, this)));
                aVar.w.observe(this, new T.b(new C1465j(t7, this)));
                aVar.x.observe(this, new T.b(new C1468k(t7, this)));
                aVar.y.observe(this, new T.b(new C1471l(t7, this)));
                aVar.z.observe(this, new T.b(new C1474m(t7, 0)));
                aVar.A.observe(this, new T.b(new C1477n(t7, 0)));
                aVar.B.observe(this, new T.b(new C1480o(t7, 0)));
                final int i21 = 0;
                aVar.C.observe(this, new T.b(new Function1(t7, i21) { // from class: By0.q

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f1302a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Object f1303b;

                    {
                        this.f1302a = i21;
                        this.f1303b = t7;
                    }

                    public final Object invoke(Object obj) {
                        switch (this.f1302a) {
                            case 0:
                                Dy0.C c7 = (Dy0.C) obj;
                                T t8 = (T) this.f1303b;
                                if (c7 != null && c7.f3254a) {
                                    t8.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putInt("argus_page_from", c7.f3255b);
                                    bundle2.putString("argus_select_sticker", c7.f3256c);
                                    BiliEditorStickerListFragment biliEditorStickerListFragment = new BiliEditorStickerListFragment();
                                    biliEditorStickerListFragment.setArguments(bundle2);
                                    t8.j(T.g(c7.f3258e), biliEditorStickerListFragment, "BiliEditorStickerListFragment", c7.f3257d);
                                } else if (c7 != null && !c7.f3254a) {
                                    t8.h((BiliEditorStickerListFragment) t8.f("BiliEditorStickerListFragment"), "BiliEditorStickerListFragment", c7.f3257d);
                                }
                                return Unit.INSTANCE;
                            default:
                                StoryVideoFragment storyVideoFragment = (StoryVideoFragment) this.f1303b;
                                storyVideoFragment.k.g1();
                                StoryDetail storyDetailO0 = storyVideoFragment.k.O0();
                                if (storyDetailO0 != null) {
                                    Violet violet = Violet.INSTANCE;
                                    long aid = storyDetailO0.getAid();
                                    long cid = storyDetailO0.getCid();
                                    StoryDetail.Stat stat = storyDetailO0.getStat();
                                    violet.sendMsg(new zJ0.b(aid, cid, stat != null ? stat.getShare() : 0));
                                }
                                return Boolean.FALSE;
                        }
                    }
                }));
                aVar.D.observe(this, new T.b(new r(t7, 0)));
                aVar.E.observe(this, new T.b(new C1494t(t7, 0)));
                final int i22 = 0;
                aVar.F.observe(this, new T.b(new Function1(t7, i22) { // from class: By0.u

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f1325a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Object f1326b;

                    {
                        this.f1325a = i22;
                        this.f1326b = t7;
                    }

                    public final Object invoke(Object obj) {
                        switch (this.f1325a) {
                            case 0:
                                Function1<Fragment, Unit> function1 = ((C1607c) obj).f3276a;
                                C1447d c1447d = ((T) this.f1326b).f1159e;
                                String strA = c1447d.a();
                                Fragment fragment = null;
                                if (strA != null) {
                                    Fragment fragmentFindFragmentByTag = c1447d.f1222a.findFragmentByTag(strA);
                                    if (FragmentExtKt.isFragmentActive(fragmentFindFragmentByTag)) {
                                        fragment = fragmentFindFragmentByTag;
                                    }
                                }
                                function1.invoke(fragment);
                                break;
                            case 1:
                                ((MutableState) this.f1326b).setValue((String) obj);
                                break;
                            case 2:
                                CommentItem.MenuItem.Action action = (CommentItem.MenuItem.Action) obj;
                                com.bilibili.app.comment3.ui.holder.m mVar = (com.bilibili.app.comment3.ui.holder.m) this.f1326b;
                                Nj.g gVar7 = (Nj.g) mVar.f.getValue();
                                if (gVar7 != null) {
                                    int i23 = m.a.a[action.ordinal()];
                                    if (i23 == 1) {
                                        mVar.r0(gVar7.k, CommentFloatingWebViewType.COIN_GUESS_EDIT, "menu_edit_deadline");
                                    } else if (i23 != 2) {
                                        long j7 = gVar7.a;
                                        if (i23 == 3) {
                                            mVar.t0(j7);
                                        } else if (i23 == 4) {
                                            new ReportAction.j(j7).a(mVar.q0(), false);
                                            BLRouter.routeTo$default(new RouteRequest.Builder(Uri.parse("bilibili://user_center/feedback")).build(), (Context) null, 2, (Object) null);
                                        }
                                    } else {
                                        mVar.s0(gVar7);
                                    }
                                }
                                break;
                            default:
                                ((MutableIntState) this.f1326b).setIntValue(((Integer) obj).intValue());
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                final int i23 = 0;
                aVar.G.observe(this, new T.b(new Function1(t7, i23) { // from class: By0.v

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f1331a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Object f1332b;

                    {
                        this.f1331a = i23;
                        this.f1332b = t7;
                    }

                    public final Object invoke(Object obj) {
                        Object obj2 = this.f1332b;
                        switch (this.f1331a) {
                            case 0:
                                ((C1606b) obj).f3275a.invoke(Boolean.valueOf(((T) obj2).f1159e.f1224c));
                                return Unit.INSTANCE;
                            case 1:
                                ((MutableState) obj2).setValue((String) obj);
                                return Unit.INSTANCE;
                            case 2:
                                Boolean bool = (Boolean) obj;
                                int i24 = HomeCommunicationFragment.G;
                                HomeCommunicationFragment homeCommunicationFragment = (HomeCommunicationFragment) obj2;
                                homeCommunicationFragment.getClass();
                                BLog.i("im-home", "onPageVisibilityChanged: " + bool);
                                homeCommunicationFragment.w = bool.booleanValue();
                                return null;
                            default:
                                int iIntValue = ((Integer) obj).intValue();
                                DescButton descButton = ((j0.a) obj2).q0().descButton;
                                if (descButton != null) {
                                    descButton.selected = iIntValue;
                                }
                                return Unit.INSTANCE;
                        }
                    }
                }));
            }
            dz0.c cVar4 = ((Yv0.b) this).B;
            if (cVar4 != null && (gVar5 = cVar4.c) != null && (bVar = gVar5.e) != null) {
                c1481o0.getClass();
                bVar.a.observe(this, new C1481o0.b(new j(2, c1481o0, this)));
                final int i24 = 0;
                bVar.b.observe(this, new C1481o0.b(new Function1(i24, c1481o0, this) { // from class: By0.l0

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f1270a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Object f1271b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final Object f1272c;

                    {
                        this.f1270a = i24;
                        this.f1271b = c1481o0;
                        this.f1272c = this;
                    }

                    public final Object invoke(Object obj) {
                        switch (this.f1270a) {
                            case 0:
                                Ey0.i iVar = (Ey0.i) obj;
                                if (iVar != null) {
                                    FragmentManager supportFragmentManager2 = ((BiliEditorMainActivity) this.f1272c).getSupportFragmentManager();
                                    ((C1481o0) this.f1271b).getClass();
                                    if (iVar.f4869a && supportFragmentManager2.findFragmentByTag("InfoDialogV2") == null) {
                                        String str2 = iVar.f4870b;
                                        if (!TextUtils.isEmpty(str2)) {
                                            String str3 = iVar.f4871c;
                                            if (!TextUtils.isEmpty(str3) && !supportFragmentManager2.isDestroyed()) {
                                                InfoDialogV2 infoDialogV2 = new InfoDialogV2();
                                                infoDialogV2.f107264b = str2;
                                                infoDialogV2.f107265c = str3;
                                                infoDialogV2.show(supportFragmentManager2, "InfoDialogV2");
                                            }
                                        }
                                    }
                                }
                                break;
                            default:
                                long jPositionInWindow = LayoutCoordinatesKt.positionInWindow((LayoutCoordinates) obj);
                                MutableFloatState mutableFloatState = (MutableFloatState) this.f1271b;
                                float floatValue = mutableFloatState.getFloatValue();
                                int i25 = (int) (jPositionInWindow >> 32);
                                float fIntBitsToFloat = Float.intBitsToFloat(i25);
                                MutableFloatState mutableFloatState2 = (MutableFloatState) this.f1272c;
                                if (floatValue != fIntBitsToFloat || mutableFloatState2.getFloatValue() != Float.intBitsToFloat((int) (jPositionInWindow & 4294967295L))) {
                                    KLog_androidKt.getKLog().i("AdPausedPagePreviewTrace", "overlay origin in window " + Float.intBitsToFloat(i25) + "," + Float.intBitsToFloat((int) (jPositionInWindow & 4294967295L)));
                                }
                                mutableFloatState.setFloatValue(Float.intBitsToFloat(i25));
                                mutableFloatState2.setFloatValue(Float.intBitsToFloat((int) (jPositionInWindow & 4294967295L)));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                bVar.d.observe(this, new C1481o0.b(new C1475m0(c1481o0, this)));
                final int i25 = 0;
                bVar.l.observe(this, new C1481o0.b(new Function1(i25, c1481o0, this) { // from class: By0.n0

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f1283a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Object f1284b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final Object f1285c;

                    {
                        this.f1283a = i25;
                        this.f1284b = c1481o0;
                        this.f1285c = this;
                    }

                    public final Object invoke(Object obj) {
                        switch (this.f1283a) {
                            case 0:
                                Ey0.a aVar2 = (Ey0.a) obj;
                                if (aVar2 != null) {
                                    ((C1481o0) this.f1284b).getClass();
                                    if (aVar2.f4853a) {
                                        GeneratedComponentManagerHolder generatedComponentManagerHolder = (BiliEditorMainActivity) this.f1285c;
                                        int i26 = aVar2.f4854b;
                                        if (i26 != 0) {
                                            ToastHelper.showToastShort(generatedComponentManagerHolder, i26);
                                        } else {
                                            String str2 = aVar2.f4855c;
                                            if (!TextUtils.isEmpty(str2)) {
                                                ToastHelper.showToastShort(generatedComponentManagerHolder, str2);
                                            }
                                        }
                                    }
                                }
                                break;
                            default:
                                P51.a aVar3 = (P51.a) obj;
                                boolean z6 = ((kntr.common.dionysus.vod.ijk.d) this.f1284b) instanceof d.b;
                                kntr.common.dionysus.vod.common.n nVar2 = (kntr.common.dionysus.vod.common.n) this.f1285c;
                                if (z6) {
                                    aVar3.a(new kntr.common.dionysus.vod.ijk.behavior.b(nVar2));
                                    aVar3.a(new QualityBehaviorsKt.switchQualityBehavior.1(nVar2));
                                    aVar3.a(QualityBehaviorsKt.runningQualityBehavior.1.a);
                                }
                                aVar3.a(kntr.common.dionysus.playing.common.ijk.behavior.a.a);
                                aVar3.a(kntr.common.dionysus.vod.ijk.behavior.a.a);
                                aVar3.a(PositionBehaviorKt.positionBehavior.1.a);
                                aVar3.a(SeekBehaviorKt.withSeekActions.1.a);
                                aVar3.a(new IJKPlayOrPauseBehaviorKt.ijkPlayOrPauseBehavior.1(nVar2));
                                aVar3.a(new kntr.common.dionysus.vod.ijk.behavior.d(nVar2));
                                aVar3.a(IJKVideoStateBehaviorKt.ijkVideoStateBehavior.1.a);
                                aVar3.a(IJKVideoSizeBehaviorKt.ijkVideoSizeBehavior.1.a);
                                aVar3.a(new VolumeBehaviorKt.volumeBehavior.1(nVar2));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                final int i26 = 0;
                bVar.m.observe(this, new C1481o0.b(new Function1(c1481o0, i26) { // from class: By0.W

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f1183a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Object f1184b;

                    {
                        this.f1183a = i26;
                        this.f1184b = c1481o0;
                    }

                    public final Object invoke(Object obj) {
                        com.bilibili.bililive.room.biz.player.quality.scenequality.d dVar2;
                        com.bilibili.bililive.room.biz.player.quality.scenequality.a aVarM;
                        Unit unit;
                        KGetMasterPlayQualityResp kGetMasterPlayQualityRespVd;
                        int i27;
                        String str2;
                        Unit unit2;
                        String str3;
                        SafeMutableLiveData safeMutableLiveData;
                        SafeMutableLiveData safeMutableLiveData2;
                        xE.a aVarQ;
                        com.mall.videodetail.vd.mall.goods.f fVar2;
                        switch (this.f1183a) {
                            case 0:
                                Ey0.a aVar2 = (Ey0.a) obj;
                                if (aVar2 != null) {
                                    ((C1481o0) this.f1184b).getClass();
                                    if (!aVar2.f4853a) {
                                        ToastHelper.cancel();
                                    }
                                }
                                break;
                            case 1:
                                T9.k kVar = (T9.k) this.f1184b;
                                FeedAdHolder149 feedAdHolder149 = ((T9.m) kVar).e;
                                if (feedAdHolder149 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("mAbility");
                                    feedAdHolder149 = null;
                                }
                                feedAdHolder149.l0(kVar.getBindingAdapterPosition());
                                break;
                            case 2:
                                KPlayStyle kPlayStyle = (KPlayStyle) obj;
                                if (kPlayStyle == null || (aVarM = (dVar2 = (com.bilibili.bililive.room.biz.player.quality.scenequality.d) this.f1184b).M()) == null || (kGetMasterPlayQualityRespVd = aVarM.vd()) == null) {
                                    unit = Unit.INSTANCE;
                                } else {
                                    com.bilibili.bililive.room.biz.player.quality.scenequality.e.a(kPlayStyle, kGetMasterPlayQualityRespVd, dVar2.L(), dVar2.N());
                                    unit = Unit.INSTANCE;
                                }
                                break;
                            case 3:
                                com.bilibili.bililive.room.ui.roomv3.player.controller.widget.w wVar = (com.bilibili.bililive.room.ui.roomv3.player.controller.widget.w) this.f1184b;
                                TK.f fVar3 = wVar.i;
                                if (fVar3 == null || !fVar3.c0()) {
                                    boolean zO = wVar.o();
                                    boolean z6 = !zO;
                                    if (zO) {
                                        HH.H h = wVar.k;
                                        if (h != null) {
                                            h.I(2131854036);
                                        }
                                        i27 = 0;
                                    } else {
                                        HH.H h7 = wVar.k;
                                        i27 = 1;
                                        if (h7 != null) {
                                            h7.I(2131854172);
                                            i27 = 1;
                                        }
                                    }
                                    HH.H h8 = wVar.k;
                                    if (h8 != null && (aVarQ = h8.Q()) != null) {
                                        aVarQ.X5(zO);
                                    }
                                    HH.H h9 = wVar.k;
                                    if (h9 != null) {
                                        h9.E = Boolean.FALSE;
                                    }
                                    LiveLog.Companion companion = LiveLog.Companion;
                                    if (companion.matchLevel(3)) {
                                        try {
                                            HH.H h10 = wVar.k;
                                            str2 = "[live-danmaku-opt-danmaku]LiveDanmuOptionsWidget 更新isForceOpenDanmaku:" + (h10 != null ? h10.E : null);
                                        } catch (Exception e19) {
                                            BLog.e("LiveLog", "getLogMessage", e19);
                                            str2 = null;
                                        }
                                        String str4 = str2;
                                        if (str2 == null) {
                                            str4 = "";
                                        }
                                        LiveLogDelegate logDelegate = companion.getLogDelegate();
                                        if (logDelegate != null) {
                                            LiveLogDelegate.onLog$default(logDelegate, 3, "LiveDanmuOptionsWidgetV2", str4, (Throwable) null, 8, (Object) null);
                                        }
                                        BLog.i("LiveDanmuOptionsWidgetV2", str4);
                                    }
                                    HH.H h11 = wVar.k;
                                    if (h11 != null) {
                                        h11.H(zO);
                                    }
                                    HH.H h12 = wVar.k;
                                    if (h12 != null && (safeMutableLiveData2 = h12.t) != null) {
                                        safeMutableLiveData2.setValue(Boolean.valueOf(z6));
                                    }
                                    HH.H h13 = wVar.k;
                                    if (h13 != null && (safeMutableLiveData = h13.N) != null) {
                                        safeMutableLiveData.setValue(Boolean.valueOf(z6));
                                    }
                                    HH.H h14 = wVar.k;
                                    if (h14 != null) {
                                        h14.Y(z6);
                                    }
                                    LiveRoomPlayerViewModel liveRoomPlayerViewModel = wVar.j;
                                    if (liveRoomPlayerViewModel != null) {
                                        liveRoomPlayerViewModel.M0(new Object[]{4, Integer.valueOf(i27)});
                                    }
                                    LiveLog.Companion companion2 = LiveLog.Companion;
                                    if (companion2.matchLevel(3)) {
                                        str3 = "LiveDanmuOptionsWidget clicked";
                                        str3 = str3 == null ? "" : "LiveDanmuOptionsWidget clicked";
                                        LiveLogDelegate logDelegate2 = companion2.getLogDelegate();
                                        if (logDelegate2 != null) {
                                            LiveLogDelegate.onLog$default(logDelegate2, 3, "LiveDanmuOptionsWidgetV2", str3, (Throwable) null, 8, (Object) null);
                                        }
                                        BLog.i("LiveDanmuOptionsWidgetV2", str3);
                                    }
                                    unit2 = Unit.INSTANCE;
                                } else {
                                    ToastHelper.showToastLong(BiliContext.application(), 2131854077);
                                    unit2 = Unit.INSTANCE;
                                }
                                break;
                            case 4:
                                C7577d c7577d = ((C7578e) obj).f121724g;
                                if (c7577d != null && (fVar2 = ((com.mall.videodetail.vd.mall.goods.j) this.f1184b).d) != null) {
                                    fVar2.invoke(c7577d);
                                }
                                break;
                            case 5:
                                Placeable.PlacementScope.placeRelative$default((Placeable.PlacementScope) obj, (Placeable) this.f1184b, 0, 0, 0.0f, 4, null);
                                break;
                            default:
                                ((sF.b) this.f1184b).h.setValue((LiveMultiScreenInfo) obj);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                bVar.e.observe(this, new C1481o0.b(new Function1(c1481o0, this) { // from class: By0.X

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final C1481o0 f1188a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final BiliEditorMainActivity f1189b;

                    {
                        this.f1188a = c1481o0;
                        this.f1189b = this;
                    }

                    public final Object invoke(Object obj) {
                        Ey0.o oVar = (Ey0.o) obj;
                        if (oVar != null) {
                            this.f1188a.getClass();
                            if (oVar.f4887a) {
                                GeneratedComponentManagerHolder generatedComponentManagerHolder = this.f1189b;
                                AlertDialog alertDialogCreate = new AlertDialog.Builder(generatedComponentManagerHolder).setMessage(oVar.f4888b).setCancelable(false).setPositiveButton(generatedComponentManagerHolder.getResources().getString(2131842260), (DialogInterface.OnClickListener) null).create();
                                alertDialogCreate.show();
                                fA0.a.a(alertDialogCreate);
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }));
                bVar.g.observe(this, new C1481o0.b(new Function1(c1481o0, this) { // from class: By0.Y

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final C1481o0 f1192a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final BiliEditorMainActivity f1193b;

                    {
                        this.f1192a = c1481o0;
                        this.f1193b = this;
                    }

                    public final Object invoke(Object obj) {
                        Ey0.b bVar2 = (Ey0.b) obj;
                        if (bVar2 != null && bVar2.f4856a) {
                            this.f1192a.getClass();
                            AlertDialog.Builder negativeButton = new AlertDialog.Builder(this.f1193b).setMessage(2131841944).setCancelable(false).setNegativeButton(2131842224, (DialogInterface.OnClickListener) null);
                            final A50.F f7 = bVar2.f4857b;
                            negativeButton.setPositiveButton(2131841776, new DialogInterface.OnClickListener(f7) { // from class: By0.f0

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final A50.F f1236a;

                                {
                                    this.f1236a = f7;
                                }

                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i27) {
                                    A50.F f8 = this.f1236a;
                                    if (f8 != null) {
                                        f8.invoke();
                                    }
                                }
                            }).create().show();
                        }
                        return Unit.INSTANCE;
                    }
                }));
                final int i27 = 0;
                bVar.h.observe(this, new C1481o0.b(new Function1(i27, c1481o0, this) { // from class: By0.Z

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f1196a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Object f1197b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final Object f1198c;

                    {
                        this.f1196a = i27;
                        this.f1197b = c1481o0;
                        this.f1198c = this;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v13, types: [androidx.fragment.app.FragmentActivity, com.bilibili.studio.editor.moudle.editormain.ui.BiliEditorMainActivity, java.lang.Object] */
                    public final Object invoke(Object obj) {
                        EditorDownloadProgressDialog editorDownloadProgressDialog;
                        EditorCircleProgressView editorCircleProgressView;
                        switch (this.f1196a) {
                            case 0:
                                Ey0.h hVar = (Ey0.h) obj;
                                if (hVar != null) {
                                    C1481o0 c1481o02 = (C1481o0) this.f1197b;
                                    c1481o02.getClass();
                                    ?? r02 = (BiliEditorMainActivity) this.f1198c;
                                    int i28 = hVar.f4865a;
                                    if (i28 == 1) {
                                        EditorDownloadProgressDialog editorDownloadProgressDialog2 = new EditorDownloadProgressDialog();
                                        editorDownloadProgressDialog2.f108659g = hVar.f4866b;
                                        editorDownloadProgressDialog2.h = 2131104206;
                                        editorDownloadProgressDialog2.setCancelable(false);
                                        editorDownloadProgressDialog2.f108656d = hVar.f4868d;
                                        editorDownloadProgressDialog2.f108657e = new C1445c0(c1481o02, r02);
                                        if (c1481o02.f1291b != null) {
                                            c1481o02.b(r02);
                                        }
                                        c1481o02.f1291b = editorDownloadProgressDialog2;
                                        if (!editorDownloadProgressDialog2.isAdded()) {
                                            FragmentTransaction fragmentTransactionBeginTransaction = r02.getSupportFragmentManager().beginTransaction();
                                            fragmentTransactionBeginTransaction.add(2131301677, editorDownloadProgressDialog2, "LoadingProgressDialog");
                                            fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
                                        }
                                    } else if (i28 == 2) {
                                        c1481o02.b(r02);
                                    } else if (i28 == 3 && (editorDownloadProgressDialog = c1481o02.f1291b) != null && editorDownloadProgressDialog.isAdded() && (editorCircleProgressView = c1481o02.f1291b.f108654b) != null) {
                                        editorCircleProgressView.setProgress(hVar.f4867c);
                                    }
                                }
                                break;
                            default:
                                ((MutableState) this.f1198c).setValue(Dp.m3878boximpl(((Density) this.f1197b).mo1268toDpu2uoSUM((int) (((LayoutCoordinates) obj).mo3153getSizeYbymL2g() >> 32))));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                final int i28 = 0;
                bVar.j.observe(this, new C1481o0.b(new Function1(i28, c1481o0, this) { // from class: By0.a0

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f1202a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Object f1203b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final Object f1204c;

                    {
                        this.f1202a = i28;
                        this.f1203b = c1481o0;
                        this.f1204c = this;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:25:0x0184  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object invoke(java.lang.Object r7) {
                        /*
                            Method dump skipped, instruction units count: 732
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: By0.C1439a0.invoke(java.lang.Object):java.lang.Object");
                    }
                }));
                final int i29 = 0;
                bVar.i.observe(this, new C1481o0.b(new Function1(i29, c1481o0, this) { // from class: By0.b0

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f1210a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Object f1211b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final Object f1212c;

                    {
                        this.f1210a = i29;
                        this.f1211b = c1481o0;
                        this.f1212c = this;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:8:0x0064  */
                    /* JADX WARN: Type inference failed for: r0v19, types: [com.bilibili.studio.videoeditor.widgets.confirmdialog.BiliEditorConfirmDialog$a, java.lang.Object] */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object invoke(java.lang.Object r8) {
                        /*
                            Method dump skipped, instruction units count: 313
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: By0.C1442b0.invoke(java.lang.Object):java.lang.Object");
                    }
                }));
                bVar.k.observe(this, new C1481o0.b(new C1466j0(this, 0)));
                bVar.p.observe(this, new C1481o0.b(new C1469k0(0, c1481o0, this)));
                bVar.c.observe(this, new b(new com.bilibili.biligame.ui.feed.i(this, 1)));
                bVar.f.observe(this, new b(new com.bilibili.ship.theseus.ogv.intro.livereserve.c(this, 1)));
                bVar.n.observe(this, new b(new com.bilibili.bililive.room.ui.common.hybrid.d(this, 1)));
                final int i30 = 0;
                bVar.o.observe(this, new b(new Function1(this, i30) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.c

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f106291a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Object f106292b;

                    {
                        this.f106291a = i30;
                        this.f106292b = this;
                    }

                    public final Object invoke(Object obj) {
                        Object obj2 = this.f106292b;
                        switch (this.f106291a) {
                            case 0:
                                Ey0.d dVar2 = (Ey0.d) obj;
                                int i31 = BiliEditorMainActivity.f106268Y;
                                if (dVar2.f4859a == 1) {
                                    BLRouter.routeTo(new RouteRequest.Builder(Uri.parse("activity://uper/question/")).data(Uri.parse(dVar2.f4860b)).build(), (BiliEditorMainActivity) obj2);
                                }
                                break;
                            default:
                                List list = (List) obj2;
                                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    Placeable.PlacementScope.place$default(placementScope, (Placeable) it.next(), 0, 0, 0.0f, 4, null);
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
            }
            dz0.c cVar5 = ((Yv0.b) this).B;
            if (cVar5 != null && (gVar4 = cVar5.c) != null && (dVar = gVar4.d) != null && (c1455f1 = this.f106276P) != null) {
                dVar.a.observe(this, new C1455f1.a(new M0(c1455f1, 0)));
                dVar.b.observe(this, new C1455f1.a(new Z0(c1455f1, 0)));
                dVar.c.observe(this, new C1455f1.a(new C1440a1(c1455f1, 0)));
                dVar.d.observe(this, new C1455f1.a(new C1443b1(c1455f1, 0)));
                final int i31 = 0;
                dVar.e.observe(this, new C1455f1.a(new Function1(c1455f1, i31) { // from class: By0.c1

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f1220a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Object f1221b;

                    {
                        this.f1220a = i31;
                        this.f1221b = c1455f1;
                    }

                    public final Object invoke(Object obj) {
                        switch (this.f1220a) {
                            case 0:
                                Gy0.m mVar = (Gy0.m) obj;
                                if (mVar != null) {
                                    C2890w c2890w = (C2890w) ((C1455f1) this.f1221b).f1201a;
                                    int visibility = c2890w.f24024g.getVisibility();
                                    int i32 = mVar.f7476a;
                                    if (visibility != i32) {
                                        c2890w.f24024g.setVisibility(i32);
                                    }
                                    c2890w.f24024g.setOnClickListener(mVar.f7480e);
                                    c2890w.f24024g.setOnTouchListener(mVar.f7479d);
                                    if (mVar.f7477b) {
                                        c2890w.f24024g.setImageDrawable(ContextCompat.getDrawable(c2890w.f24024g.getContext(), mVar.f7478c));
                                    } else {
                                        c2890w.f24024g.setVisibility(0);
                                        c2890w.f24024g.setImageResource(2131234893);
                                    }
                                }
                                break;
                            case 1:
                                FeaturePanelService featurePanelService = (FeaturePanelService) this.f1221b;
                                List list = (List) featurePanelService.g.getValue();
                                ((LazyGridScope) obj).items(list.size(), null, null, new com.bilibili.digital.card.page.card.cardmodule.web.n(list), ComposableLambdaKt.composableLambdaInstance(-1117249557, true, new com.bilibili.digital.card.page.card.cardmodule.web.o(list, featurePanelService)));
                                break;
                            default:
                                ((Function0) this.f1221b).invoke();
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                dVar.f.observe(this, new C1455f1.a(new C1449d1(c1455f1, 0)));
                dVar.g.observe(this, new C1455f1.a(new C1452e1(c1455f1, 0)));
                dVar.h.observe(this, new C1455f1.a(new N0(c1455f1, 0)));
                dVar.i.observe(this, new C1455f1.a(new O0(c1455f1, 0)));
                dVar.j.observe(this, new C1455f1.a(new P0(c1455f1, 0)));
                dVar.k.observe(this, new C1455f1.a(new W0(c1455f1, 0)));
                final int i32 = 0;
                dVar.m.observe(this, new C1455f1.a(new Function1(c1455f1, i32) { // from class: By0.X0

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f1190a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Object f1191b;

                    {
                        this.f1190a = i32;
                        this.f1191b = c1455f1;
                    }

                    public final Object invoke(Object obj) {
                        String str2;
                        EG.a aVarV;
                        Object obj2 = this.f1191b;
                        switch (this.f1190a) {
                            case 0:
                                Gy0.a aVar2 = (Gy0.a) obj;
                                C1455f1 c1455f12 = (C1455f1) obj2;
                                if (aVar2 == null) {
                                    c1455f12.getClass();
                                } else {
                                    Object obj3 = c1455f12.f1201a;
                                    if (aVar2.f7448a) {
                                        C2890w c2890w = (C2890w) obj3;
                                        c2890w.f24028l.setVisibility(0);
                                        c2890w.f24028l.setOnClickListener(new S0(aVar2, 0));
                                        boolean z6 = aVar2.f7449b;
                                        c2890w.f24021d.setImageResource(z6 ? 2131243854 : 2131243853);
                                        c2890w.f24031o.setText(z6 ? 2131842143 : 2131841860);
                                    } else {
                                        ((C2890w) obj3).f24028l.setVisibility(8);
                                    }
                                }
                                return Unit.INSTANCE;
                            case 1:
                                LiveLog.Companion companion = LiveLog.Companion;
                                TK.f fVar2 = (TK.f) obj2;
                                fVar2.getClass();
                                if (companion.matchLevel(3)) {
                                    try {
                                        str2 = "registerOnP0Task liveStatus:" + fVar2.getLiveStatus();
                                    } catch (Exception e19) {
                                        BLog.e("LiveLog", "getLogMessage", e19);
                                        str2 = null;
                                    }
                                    String str3 = str2;
                                    if (str2 == null) {
                                        str3 = "";
                                    }
                                    LiveLogDelegate logDelegate = companion.getLogDelegate();
                                    if (logDelegate != null) {
                                        LiveLogDelegate.onLog$default(logDelegate, 3, "LiveTimeShiftViewModel", str3, (Throwable) null, 8, (Object) null);
                                    }
                                    BLog.i("LiveTimeShiftViewModel", str3);
                                    break;
                                }
                                if (fVar2.getLiveStatus() == 1) {
                                    fVar2.B = Boolean.FALSE;
                                    if (fVar2.w()) {
                                        fVar2.z.run();
                                    }
                                    if (!fVar2.w() && (aVarV = fVar2.V()) != null) {
                                        aVarV.Ee(0);
                                    }
                                }
                                return Unit.INSTANCE;
                            case 2:
                                Map map = (Map) obj2;
                                int iIntValue = ((Integer) obj).intValue();
                                Map mapCreateMapBuilder = MapsKt.createMapBuilder();
                                mapCreateMapBuilder.putAll(map);
                                mapCreateMapBuilder.put("endpage", String.valueOf(iIntValue));
                                Neurons.reportExposure$default(false, "sqzz.dressing.rebuild.guide.show", MapsKt.build(mapCreateMapBuilder), (List) null, 8, (Object) null);
                                return Unit.INSTANCE;
                            case 3:
                                int i33 = TopixSetActivity.G;
                                TopixSetActivity topixSetActivity = (TopixSetActivity) obj2;
                                ToastHelper.showToast(topixSetActivity, ((C4943c) obj).a(topixSetActivity.getResources()), 0);
                                return Unit.INSTANCE;
                            case 4:
                                ((Function1) obj2).invoke(new b.i(((Boolean) obj).booleanValue()));
                                return Unit.INSTANCE;
                            default:
                                return ((tv.danmaku.bili.inner.p) obj2).h.a(((tv.danmaku.bili.fullscreen.state.z) obj).a);
                        }
                    }
                }));
                dVar.l.observe(this, new C1455f1.a(new Y0(c1455f1, 0)));
            }
            dz0.c cVar6 = ((Yv0.b) this).B;
            if (cVar6 != null && (gVar3 = cVar6.c) != null && (cVar = gVar3.c) != null && (l02 = this.f106275O) != null) {
                final int i33 = 0;
                cVar.a.observe(this, new L0.a(new Function1(l02, i33) { // from class: By0.p0

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f1298a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Object f1299b;

                    {
                        this.f1298a = i33;
                        this.f1299b = l02;
                    }

                    public final Object invoke(Object obj) throws JSONException {
                        String str2;
                        Object obj2 = this.f1299b;
                        switch (this.f1298a) {
                            case 0:
                                Fy0.p pVar = (Fy0.p) obj;
                                if (pVar != null) {
                                    BiliEditorMainPanel biliEditorMainPanel = ((L0) obj2).f1110b;
                                    ViewGroup.LayoutParams layoutParams = biliEditorMainPanel.getLayoutParams();
                                    layoutParams.height = pVar.f6506a;
                                    biliEditorMainPanel.setLayoutParams(layoutParams);
                                }
                                break;
                            case 1:
                                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                                LiveLog.Companion companion = LiveLog.Companion;
                                TF.b bVar2 = (TF.b) obj2;
                                bVar2.getClass();
                                if (companion.matchLevel(3)) {
                                    try {
                                        str2 = "block status=" + zBooleanValue;
                                    } catch (Exception e19) {
                                        BLog.e("LiveLog", "getLogMessage", e19);
                                        str2 = null;
                                    }
                                    String str3 = str2 != null ? str2 : "";
                                    LiveLogDelegate logDelegate = companion.getLogDelegate();
                                    if (logDelegate != null) {
                                        LiveLogDelegate.onLog$default(logDelegate, 3, "LiveRoomStarKnightPendantViewModel", str3, (Throwable) null, 8, (Object) null);
                                    }
                                    BLog.i("LiveRoomStarKnightPendantViewModel", str3);
                                }
                                ((ILiveStarKnightPendant) bVar2.h.getValue()).updateEntrance(!zBooleanValue);
                                break;
                            case 2:
                                Boolean bool = (Boolean) obj;
                                Z50.c cVar7 = (Z50.c) obj2;
                                cVar7.getClass();
                                KProperty[] kPropertyArr = Z50.c.u;
                                KProperty kProperty = kPropertyArr[0];
                                c.c cVar8 = cVar7.p;
                                cVar8.setValue(cVar7, kPropertyArr[0], TuplesKt.to(((Pair) cVar8.getValue(cVar7, kProperty)).getFirst(), bool));
                                SpdLog spdLog = (SpdLog) cVar7.k.getValue();
                                if (spdLog != null) {
                                    spdLog.sys(bool.booleanValue() ? "bl.onAudioInterruptionBegin" : "bl.onAudioInterruptionEnd");
                                }
                                JSONObject jSONObjectA = androidx.constraintlayout.compose.I.a("type", KFCHybridV2.Configuration.SYSTEM_DOMAIN);
                                jSONObjectA.put(NotificationCompat.CATEGORY_EVENT, bool.booleanValue() ? "onAudioInterruptionBegin" : "onAudioInterruptionEnd");
                                Unit unit = Unit.INSTANCE;
                                cVar7.e.d(jSONObjectA, "");
                                break;
                            case 3:
                                ((Integer) obj).intValue();
                                com.bilibili.bililive.room.ui.roomv3.player.controller.widget.Y y6 = (com.bilibili.bililive.room.ui.roomv3.player.controller.widget.Y) obj2;
                                FrameLayout frameLayout = y6.g;
                                FrameLayout frameLayout2 = frameLayout;
                                if (frameLayout == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("mContainer");
                                    frameLayout2 = null;
                                }
                                frameLayout2.setVisibility(0);
                                com.bilibili.bililive.room.ui.roomv3.ranks.D d8 = y6.h;
                                if (d8 == null || !d8.q()) {
                                    LiveHighEnergyEntranceRankWidgetV2 liveHighEnergyEntranceRankWidgetV2 = y6.e;
                                    if (liveHighEnergyEntranceRankWidgetV2 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("mRankLayout");
                                        liveHighEnergyEntranceRankWidgetV2 = null;
                                    }
                                    liveHighEnergyEntranceRankWidgetV2.isShowRankRecyclerView(true);
                                } else {
                                    LiveHighEnergyEntranceRankWidgetV2 liveHighEnergyEntranceRankWidgetV22 = y6.e;
                                    if (liveHighEnergyEntranceRankWidgetV22 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("mRankLayout");
                                        liveHighEnergyEntranceRankWidgetV22 = null;
                                    }
                                    liveHighEnergyEntranceRankWidgetV22.isShowRankRecyclerView(false);
                                }
                                break;
                            case 4:
                                UnbindRoleItem unbindRoleItem = (UnbindRoleItem) obj;
                                String str4 = (String) obj2;
                                w01.c.b("game-ball.steam-setting.game-account-setting.game-binding-list.show", MapsKt.mapOf(new Pair[]{TuplesKt.to("sourcefrom", str4 != null ? str4 : ""), TuplesKt.to("spmid_from", h01.p.a()), TuplesKt.to("game_id", String.valueOf(unbindRoleItem.getGameBaseId())), TuplesKt.to("game_name", unbindRoleItem.getGameName())}));
                                break;
                            default:
                                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
                                Rect rectBoundsInWindow$default = LayoutCoordinatesKt.boundsInWindow$default(layoutCoordinates, false, 1, null);
                                ((D2) obj2).b(new g5(RectKt.m2494Rect0a9Yr6o(layoutCoordinates.mo3162windowToLocalMKHz9U(rectBoundsInWindow$default.m2491getTopLeftF1C5BW0()), layoutCoordinates.mo3162windowToLocalMKHz9U(rectBoundsInWindow$default.m2485getBottomRightF1C5BW0())), new Rect(0.0f, 0.0f, (int) (layoutCoordinates.mo3153getSizeYbymL2g() >> 32), (int) (layoutCoordinates.mo3153getSizeYbymL2g() & 4294967295L))));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                cVar.b.observe(this, new L0.a(new Function1(l02) { // from class: By0.r0

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final L0 f1310a;

                    {
                        this.f1310a = l02;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:27:0x0133  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object invoke(java.lang.Object r9) {
                        /*
                            Method dump skipped, instruction units count: 678
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: By0.C1489r0.invoke(java.lang.Object):java.lang.Object");
                    }
                }));
                cVar.c.observe(this, new L0.a(new C1498u0(l02, 0)));
                final int i34 = 0;
                cVar.d.observe(this, new L0.a(new Function1(l02, i34) { // from class: By0.v0

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f1333a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Object f1334b;

                    {
                        this.f1333a = i34;
                        this.f1334b = l02;
                    }

                    public final Object invoke(Object obj) {
                        Object obj2 = this.f1334b;
                        switch (this.f1333a) {
                            case 0:
                                Fy0.c cVar7 = (Fy0.c) obj;
                                L0 l03 = (L0) obj2;
                                if (cVar7 != null && !cVar7.f6472b) {
                                    l03.b(cVar7);
                                } else if (cVar7 != null && cVar7.f6472b) {
                                    if (cVar7.f6473c == MainPanelMaterialTrackType.TRACK_CAPTION_MULTI) {
                                        BiliEditorMaterialPanelTrackView biliEditorMaterialPanelTrackView = l03.f1110b.f107075i.e;
                                        if (biliEditorMaterialPanelTrackView == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("materialTrackTopMultiView");
                                            biliEditorMaterialPanelTrackView = null;
                                        }
                                        BiliEditorMaterialPanelTrackView.i(biliEditorMaterialPanelTrackView, cVar7.f6475e);
                                    }
                                }
                                return Unit.INSTANCE;
                            case 1:
                                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
                                com.bilibili.biligame.compose.c cVar8 = ExposerKt.a;
                                Rect rectBoundsInWindow$default = LayoutCoordinatesKt.boundsInWindow$default(layoutCoordinates, false, 1, null);
                                ((com.bilibili.biligame.compose.g) obj2).b(new com.bilibili.biligame.compose.l(RectKt.m2494Rect0a9Yr6o(layoutCoordinates.mo3162windowToLocalMKHz9U(rectBoundsInWindow$default.m2491getTopLeftF1C5BW0()), layoutCoordinates.mo3162windowToLocalMKHz9U(rectBoundsInWindow$default.m2485getBottomRightF1C5BW0())), new Rect(0.0f, 0.0f, (int) (layoutCoordinates.mo3153getSizeYbymL2g() >> 32), (int) (layoutCoordinates.mo3153getSizeYbymL2g() & 4294967295L))));
                                return Unit.INSTANCE;
                            case 2:
                                int i35 = HomeLoadingView.c;
                                return ModifierUtilsKt.clickableNoInteraction$default((Modifier) obj, false, new Ef.k((HomeLoadingView) obj2, 1), 1, (Object) null);
                            default:
                                ((MutableState) obj2).setValue(LayoutCoordinatesKt.boundsInWindow$default((LayoutCoordinates) obj, false, 1, null));
                                return Unit.INSTANCE;
                        }
                    }
                }));
                final int i35 = 0;
                cVar.e.observe(this, new L0.a(new Function1(l02, i35) { // from class: By0.w0

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f1339a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Object f1340b;

                    {
                        this.f1339a = i35;
                        this.f1340b = l02;
                    }

                    public final Object invoke(Object obj) {
                        com.bilibili.bililive.room.ui.roomv3.ranks.D d8;
                        String str2;
                        switch (this.f1339a) {
                            case 0:
                                Fy0.c cVar7 = (Fy0.c) obj;
                                L0 l03 = (L0) this.f1340b;
                                if (cVar7 != null && !cVar7.f6472b) {
                                    l03.b(cVar7);
                                } else if (cVar7 != null && cVar7.f6472b) {
                                    if (cVar7.f6473c == MainPanelMaterialTrackType.TRACK_AUDIO_MULTI) {
                                        BiliEditorMaterialPanelTrackView biliEditorMaterialPanelTrackView = l03.f1110b.f107075i.f;
                                        BiliEditorMaterialPanelTrackView biliEditorMaterialPanelTrackView2 = biliEditorMaterialPanelTrackView;
                                        if (biliEditorMaterialPanelTrackView == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("materialTrackBottomMultiView");
                                            biliEditorMaterialPanelTrackView2 = null;
                                        }
                                        BiliEditorMaterialPanelTrackView.i(biliEditorMaterialPanelTrackView2, cVar7.f6475e);
                                    }
                                }
                                break;
                            default:
                                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                                LiveLog.Companion companion = LiveLog.Companion;
                                com.bilibili.bililive.room.ui.roomv3.player.controller.widget.Y y6 = (com.bilibili.bililive.room.ui.roomv3.player.controller.widget.Y) this.f1340b;
                                String str3 = y6.j;
                                if (companion.matchLevel(3)) {
                                    try {
                                        com.bilibili.bililive.room.ui.roomv3.ranks.D d9 = y6.h;
                                        str2 = "[Popularity] showPanel top popularity clicked on Land , onlineDisplayable:" + zBooleanValue + ", isClickable:" + (d9 != null ? Boolean.valueOf(((com.bilibili.bililive.room.ui.roomv3.base.viewmodel.f) d9).c.d(2001)) : null);
                                    } catch (Exception e19) {
                                        BLog.e("LiveLog", "getLogMessage", e19);
                                        str2 = null;
                                    }
                                    String str4 = str2;
                                    if (str2 == null) {
                                        str4 = "";
                                    }
                                    LiveLogDelegate logDelegate = companion.getLogDelegate();
                                    if (logDelegate != null) {
                                        LiveLogDelegate.onLog$default(logDelegate, 3, str3, str4, (Throwable) null, 8, (Object) null);
                                    }
                                    BLog.i(str3, str4);
                                }
                                if (zBooleanValue && (d8 = y6.h) != null && ((com.bilibili.bililive.room.ui.roomv3.base.viewmodel.f) d8).c.d(2001)) {
                                    LiveRouterHelper.openRoomRankPanel(new LiveOpenRankParam());
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                cVar.f.observe(this, new L0.a(new Function1(l02) { // from class: By0.x0

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final L0 f1345a;

                    {
                        this.f1345a = l02;
                    }

                    public final Object invoke(Object obj) {
                        final BiliEditorMaterialMultiInfo biliEditorMaterialMultiInfo;
                        Fy0.g gVar7 = (Fy0.g) obj;
                        if (gVar7 != null) {
                            xy0.a aVar2 = this.f1345a.f1110b.f107075i;
                            aVar2.getClass();
                            BiliEditorMaterialMultiInfo biliEditorMaterialMultiInfo2 = gVar7.f6483a;
                            if (biliEditorMaterialMultiInfo2 != null && (biliEditorMaterialMultiInfo = gVar7.f6484b) != null) {
                                BiliEditorMaterialPanelTrackView biliEditorMaterialPanelTrackView = aVar2.f;
                                BiliEditorMaterialPanelTrackView biliEditorMaterialPanelTrackView2 = biliEditorMaterialPanelTrackView;
                                if (biliEditorMaterialPanelTrackView == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("materialTrackBottomMultiView");
                                    biliEditorMaterialPanelTrackView2 = null;
                                }
                                int i36 = BiliEditorMaterialPanelTrackView.f106221i;
                                biliEditorMaterialPanelTrackView2.getClass();
                                biliEditorMaterialPanelTrackView2.post(new RunnableC1895c(biliEditorMaterialPanelTrackView2, biliEditorMaterialMultiInfo2));
                                final BiliEditorMaterialPanelTrackView biliEditorMaterialPanelTrackView3 = biliEditorMaterialPanelTrackView2;
                                final boolean z6 = true;
                                final boolean z7 = true;
                                biliEditorMaterialPanelTrackView2.post(new Runnable(biliEditorMaterialPanelTrackView3, biliEditorMaterialMultiInfo, z6, z7) { // from class: Vx0.b

                                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                                    public final BiliEditorMaterialPanelTrackView f26008a;

                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                    public final BiliEditorMaterialMultiInfo f26009b;

                                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                                    public final boolean f26010c;

                                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                                    public final boolean f26011d;

                                    {
                                        this.f26008a = biliEditorMaterialPanelTrackView3;
                                        this.f26009b = biliEditorMaterialMultiInfo;
                                        this.f26010c = z6;
                                        this.f26011d = z7;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        BiliEditorMaterialPanelTrackView biliEditorMaterialPanelTrackView4 = this.f26008a;
                                        BiliEditorMaterialMultiInfo biliEditorMaterialMultiInfo3 = this.f26009b;
                                        boolean z8 = this.f26010c;
                                        boolean z9 = this.f26011d;
                                        Wx0.b bVar2 = biliEditorMaterialPanelTrackView4.f106228c;
                                        if (bVar2.f27422e.contains(biliEditorMaterialMultiInfo3)) {
                                            BLog.e("materialNew already in mMaterialList");
                                        } else {
                                            long inPoint = biliEditorMaterialMultiInfo3.getInPoint();
                                            long outPoint = biliEditorMaterialMultiInfo3.getOutPoint();
                                            Mx0.a aVar3 = Mx0.a.f16457j;
                                            int iE = a.C0086a.e(inPoint);
                                            int iE2 = a.C0086a.e(outPoint);
                                            CopyOnWriteArrayList<Gx0.b> copyOnWriteArrayList = bVar2.f27421d;
                                            e eVar2 = bVar2.f27419b;
                                            Gx0.b bVarA = e.a(iE, iE2, copyOnWriteArrayList);
                                            eVar2.e(bVar2.f27418a.getViewHeight(), bVar2.f27421d);
                                            Mx0.a aVar4 = Mx0.a.f16457j;
                                            biliEditorMaterialMultiInfo3.setLeftPos(a.C0086a.e(biliEditorMaterialMultiInfo3.getInPoint()));
                                            biliEditorMaterialMultiInfo3.setRightPos(a.C0086a.e(biliEditorMaterialMultiInfo3.getOutPoint()));
                                            biliEditorMaterialMultiInfo3.setTopPos(bVarA.f7443b);
                                            biliEditorMaterialMultiInfo3.setBottomPos(bVarA.f7444c);
                                            biliEditorMaterialMultiInfo3.setTrackIndex(bVar2.f27421d.indexOf(bVarA));
                                            bVarA.f7442a.add(biliEditorMaterialMultiInfo3);
                                            bVar2.f27422e.add(biliEditorMaterialMultiInfo3);
                                            bVar2.b();
                                            biliEditorMaterialPanelTrackView4.b();
                                            CopyOnWriteArrayList<Gx0.b> copyOnWriteArrayList2 = biliEditorMaterialPanelTrackView4.f106228c.f27421d;
                                            int size = copyOnWriteArrayList2.size();
                                            int trackIndex = biliEditorMaterialMultiInfo3.getTrackIndex();
                                            if (trackIndex < 0 || trackIndex >= size) {
                                                BLog.e("notifyItemChanged: material.trackIndex !in 0 until mTrackList.size");
                                            } else {
                                                e eVar3 = biliEditorMaterialPanelTrackView4.f106226a;
                                                Gx0.b bVar3 = copyOnWriteArrayList2.get(biliEditorMaterialMultiInfo3.getTrackIndex());
                                                eVar3.getClass();
                                                e.c(biliEditorMaterialMultiInfo3, bVar3);
                                                biliEditorMaterialPanelTrackView4.k();
                                                biliEditorMaterialPanelTrackView4.f106229d.f28385r.getClass();
                                            }
                                            if (biliEditorMaterialPanelTrackView4.f106227b.f27433g == PanelTrackMode.MODE_NORMAL && z8 && biliEditorMaterialPanelTrackView4.c(biliEditorMaterialMultiInfo3)) {
                                                biliEditorMaterialPanelTrackView4.j(biliEditorMaterialMultiInfo3, 0);
                                            }
                                            biliEditorMaterialPanelTrackView4.g();
                                        }
                                        if (z9) {
                                            BiliEditorMaterialPanelTrackView.i(biliEditorMaterialPanelTrackView4, biliEditorMaterialMultiInfo3);
                                        }
                                    }
                                });
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }));
                cVar.g.observe(this, new L0.a(new C1510y0(l02, 0)));
                final int i36 = 0;
                cVar.h.observe(this, new L0.a(new Function1(l02, i36) { // from class: By0.z0

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f1356a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Object f1357b;

                    {
                        this.f1356a = i36;
                        this.f1357b = l02;
                    }

                    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                    public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
                        boolean z6 = false;
                        Object obj2 = this.f1357b;
                        switch (this.f1356a) {
                            case 0:
                                MainPanelMaterialFoldTrackUiState mainPanelMaterialFoldTrackUiState = (MainPanelMaterialFoldTrackUiState) obj;
                                if (mainPanelMaterialFoldTrackUiState != null) {
                                    BiliEditorMainPanel biliEditorMainPanel = ((L0) obj2).f1110b;
                                    MainPanelMaterialTrackType mainPanelMaterialTrackType = MainPanelMaterialTrackType.TRACK_CAPTION_FOLD;
                                    xy0.a aVar2 = biliEditorMainPanel.f107075i;
                                    aVar2.getClass();
                                    BiliEditorMaterialAddView biliEditorMaterialAddView = aVar2.a;
                                    BiliEditorMaterialAddView biliEditorMaterialAddView2 = biliEditorMaterialAddView;
                                    if (biliEditorMaterialAddView == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("materialTopAddView");
                                        biliEditorMaterialAddView2 = null;
                                    }
                                    biliEditorMaterialAddView2.setVisibility(8);
                                    BiliEditorMaterialFoldTrackView biliEditorMaterialFoldTrackView = aVar2.c;
                                    BiliEditorMaterialFoldTrackView biliEditorMaterialFoldTrackView2 = biliEditorMaterialFoldTrackView;
                                    if (biliEditorMaterialFoldTrackView == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("materialTrackTopFoldView");
                                        biliEditorMaterialFoldTrackView2 = null;
                                    }
                                    biliEditorMaterialFoldTrackView2.setVisibility(mainPanelMaterialFoldTrackUiState.f107121b ? 0 : 8);
                                    BiliEditorMaterialPanelTrackView biliEditorMaterialPanelTrackView = aVar2.e;
                                    BiliEditorMaterialPanelTrackView biliEditorMaterialPanelTrackView2 = biliEditorMaterialPanelTrackView;
                                    if (biliEditorMaterialPanelTrackView == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("materialTrackTopMultiView");
                                        biliEditorMaterialPanelTrackView2 = null;
                                    }
                                    biliEditorMaterialPanelTrackView2.setVisibility(8);
                                    BiliEditorMaterialFoldTrackView biliEditorMaterialFoldTrackView3 = aVar2.g;
                                    BiliEditorMaterialFoldTrackView biliEditorMaterialFoldTrackView4 = biliEditorMaterialFoldTrackView3;
                                    if (biliEditorMaterialFoldTrackView3 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("materialEditableTopFoldTrackView");
                                        biliEditorMaterialFoldTrackView4 = null;
                                    }
                                    biliEditorMaterialFoldTrackView4.setVisibility(8);
                                    BiliEditorMaterialFoldTrackView biliEditorMaterialFoldTrackView5 = aVar2.c;
                                    BiliEditorMaterialFoldTrackView biliEditorMaterialFoldTrackView6 = biliEditorMaterialFoldTrackView5;
                                    if (biliEditorMaterialFoldTrackView5 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("materialTrackTopFoldView");
                                        biliEditorMaterialFoldTrackView6 = null;
                                    }
                                    biliEditorMaterialFoldTrackView6.b(mainPanelMaterialFoldTrackUiState, mainPanelMaterialTrackType, false);
                                    BiliEditorMaterialFoldTrackView biliEditorMaterialFoldTrackView7 = aVar2.c;
                                    BiliEditorMaterialFoldTrackView biliEditorMaterialFoldTrackView8 = biliEditorMaterialFoldTrackView7;
                                    if (biliEditorMaterialFoldTrackView7 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("materialTrackTopFoldView");
                                        biliEditorMaterialFoldTrackView8 = null;
                                    }
                                    biliEditorMaterialFoldTrackView8.c(mainPanelMaterialFoldTrackUiState.f107123d, mainPanelMaterialFoldTrackUiState.f107122c);
                                    BiliEditorMaterialFoldTrackView biliEditorMaterialFoldTrackView9 = aVar2.c;
                                    if (biliEditorMaterialFoldTrackView9 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("materialTrackTopFoldView");
                                        biliEditorMaterialFoldTrackView9 = null;
                                    }
                                    biliEditorMaterialFoldTrackView9.setOnMaterialTouchListener(new xy0.b(mainPanelMaterialFoldTrackUiState));
                                }
                                return Unit.INSTANCE;
                            case 1:
                                int i37 = SpaceNftOverviewActivity.H1;
                                ((SpaceNftOverviewActivity) obj2).T6((Integer) null, (String) obj);
                                return Unit.INSTANCE;
                            case 2:
                                TextView textView = (TextView) obj2;
                                MallKtExtensionKt.gone(textView);
                                return Unit.INSTANCE;
                            default:
                                if (((Pair) obj).getSecond() == ((Z50.l) obj2)) {
                                    z6 = true;
                                }
                                return Boolean.valueOf(z6);
                        }
                    }
                }));
                cVar.i.observe(this, new L0.a(new B0(0, cVar, l02)));
                final int i37 = 0;
                cVar.j.observe(this, new L0.a(new Function1(l02, i37) { // from class: By0.C0

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f1052a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Object f1053b;

                    {
                        this.f1052a = i37;
                        this.f1053b = l02;
                    }

                    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                    public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
                        int iNextIndex;
                        long jD;
                        Object obj2 = this.f1053b;
                        switch (this.f1052a) {
                            case 0:
                                MainPanelMaterialEditableFoldTrackUiState mainPanelMaterialEditableFoldTrackUiState = (MainPanelMaterialEditableFoldTrackUiState) obj;
                                if (mainPanelMaterialEditableFoldTrackUiState != null) {
                                    L0 l03 = (L0) obj2;
                                    l03.getClass();
                                    MainPanelMaterialEditableFoldTrackUiState.UpdateMode updateMode = MainPanelMaterialEditableFoldTrackUiState.UpdateMode.ALL;
                                    BiliEditorMainPanel biliEditorMainPanel = l03.f1110b;
                                    MainPanelMaterialEditableFoldTrackUiState.UpdateMode updateMode2 = mainPanelMaterialEditableFoldTrackUiState.f107119f;
                                    if (updateMode2 == updateMode) {
                                        List<BiliEditorMaterialMultiInfo> list = mainPanelMaterialEditableFoldTrackUiState.f107115b;
                                        xy0.a aVar2 = biliEditorMainPanel.f107075i;
                                        BiliEditorMaterialAddView biliEditorMaterialAddView = aVar2.a;
                                        BiliEditorMaterialAddView biliEditorMaterialAddView2 = biliEditorMaterialAddView;
                                        if (biliEditorMaterialAddView == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("materialTopAddView");
                                            biliEditorMaterialAddView2 = null;
                                        }
                                        biliEditorMaterialAddView2.setVisibility(8);
                                        BiliEditorMaterialAddView biliEditorMaterialAddView3 = aVar2.b;
                                        BiliEditorMaterialAddView biliEditorMaterialAddView4 = biliEditorMaterialAddView3;
                                        if (biliEditorMaterialAddView3 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("materialBottomAddView");
                                            biliEditorMaterialAddView4 = null;
                                        }
                                        biliEditorMaterialAddView4.setVisibility(8);
                                        BiliEditorMaterialFoldTrackView biliEditorMaterialFoldTrackView = aVar2.c;
                                        BiliEditorMaterialFoldTrackView biliEditorMaterialFoldTrackView2 = biliEditorMaterialFoldTrackView;
                                        if (biliEditorMaterialFoldTrackView == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("materialTrackTopFoldView");
                                            biliEditorMaterialFoldTrackView2 = null;
                                        }
                                        biliEditorMaterialFoldTrackView2.setVisibility(8);
                                        BiliEditorMaterialFoldTrackView biliEditorMaterialFoldTrackView3 = aVar2.d;
                                        BiliEditorMaterialFoldTrackView biliEditorMaterialFoldTrackView4 = biliEditorMaterialFoldTrackView3;
                                        if (biliEditorMaterialFoldTrackView3 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("materialTrackBottomFoldView");
                                            biliEditorMaterialFoldTrackView4 = null;
                                        }
                                        biliEditorMaterialFoldTrackView4.setVisibility(8);
                                        BiliEditorMaterialPanelTrackView biliEditorMaterialPanelTrackView = aVar2.e;
                                        BiliEditorMaterialPanelTrackView biliEditorMaterialPanelTrackView2 = biliEditorMaterialPanelTrackView;
                                        if (biliEditorMaterialPanelTrackView == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("materialTrackTopMultiView");
                                            biliEditorMaterialPanelTrackView2 = null;
                                        }
                                        biliEditorMaterialPanelTrackView2.setVisibility(8);
                                        BiliEditorMaterialPanelTrackView biliEditorMaterialPanelTrackView3 = aVar2.f;
                                        BiliEditorMaterialPanelTrackView biliEditorMaterialPanelTrackView4 = biliEditorMaterialPanelTrackView3;
                                        if (biliEditorMaterialPanelTrackView3 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("materialTrackBottomMultiView");
                                            biliEditorMaterialPanelTrackView4 = null;
                                        }
                                        biliEditorMaterialPanelTrackView4.setVisibility(8);
                                        BiliEditorMaterialFoldTrackView biliEditorMaterialFoldTrackView5 = aVar2.g;
                                        BiliEditorMaterialFoldTrackView biliEditorMaterialFoldTrackView6 = biliEditorMaterialFoldTrackView5;
                                        if (biliEditorMaterialFoldTrackView5 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("materialEditableTopFoldTrackView");
                                            biliEditorMaterialFoldTrackView6 = null;
                                        }
                                        biliEditorMaterialFoldTrackView6.setVisibility(0);
                                        BiliEditorMaterialFoldTrackView biliEditorMaterialFoldTrackView7 = aVar2.h;
                                        BiliEditorMaterialFoldTrackView biliEditorMaterialFoldTrackView8 = biliEditorMaterialFoldTrackView7;
                                        if (biliEditorMaterialFoldTrackView7 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("materialEditableBottomFoldTrackView");
                                            biliEditorMaterialFoldTrackView8 = null;
                                        }
                                        biliEditorMaterialFoldTrackView8.setVisibility(8);
                                        BiliEditorMaterialFoldTrackView biliEditorMaterialFoldTrackView9 = aVar2.g;
                                        BiliEditorMaterialFoldTrackView biliEditorMaterialFoldTrackView10 = biliEditorMaterialFoldTrackView9;
                                        if (biliEditorMaterialFoldTrackView9 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("materialEditableTopFoldTrackView");
                                            biliEditorMaterialFoldTrackView10 = null;
                                        }
                                        biliEditorMaterialFoldTrackView10.a(MainPanelMaterialTrackType.TRACK_CAPTION_FOLD);
                                        BiliEditorMaterialFoldTrackView biliEditorMaterialFoldTrackView11 = aVar2.g;
                                        BiliEditorMaterialFoldTrackView biliEditorMaterialFoldTrackView12 = biliEditorMaterialFoldTrackView11;
                                        if (biliEditorMaterialFoldTrackView11 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("materialEditableTopFoldTrackView");
                                            biliEditorMaterialFoldTrackView12 = null;
                                        }
                                        biliEditorMaterialFoldTrackView12.setOnMaterialTouchListener(mainPanelMaterialEditableFoldTrackUiState.f107117d);
                                        BiliEditorMaterialFoldTrackView biliEditorMaterialFoldTrackView13 = aVar2.g;
                                        if (biliEditorMaterialFoldTrackView13 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("materialEditableTopFoldTrackView");
                                            biliEditorMaterialFoldTrackView13 = null;
                                        }
                                        biliEditorMaterialFoldTrackView13.c(list, mainPanelMaterialEditableFoldTrackUiState.f107116c);
                                    } else {
                                        int i38 = BiliEditorMainPanel.a.f107080b[updateMode2.ordinal()];
                                        BiliEditorMaterialMultiInfo biliEditorMaterialMultiInfo = mainPanelMaterialEditableFoldTrackUiState.f107118e;
                                        if (i38 != 1) {
                                            if (i38 != 2) {
                                                if (i38 != 3) {
                                                    if (i38 == 4) {
                                                        biliEditorMainPanel.f107073f.d();
                                                    }
                                                } else if (biliEditorMaterialMultiInfo != null) {
                                                    biliEditorMainPanel.f107073f.setMaterialSelected(biliEditorMaterialMultiInfo);
                                                }
                                            } else if (biliEditorMaterialMultiInfo != null) {
                                                BiliEditorMaterialFoldTrackView biliEditorMaterialFoldTrackView14 = biliEditorMainPanel.f107073f;
                                                Tx0.h hVar = biliEditorMaterialFoldTrackView14.f106200b;
                                                boolean zRemove = hVar.f24339b.remove(biliEditorMaterialMultiInfo);
                                                if (zRemove && Intrinsics.areEqual(biliEditorMaterialMultiInfo, hVar.f24340c)) {
                                                    hVar.b(null, true);
                                                }
                                                if (zRemove) {
                                                    biliEditorMaterialFoldTrackView14.d();
                                                }
                                            }
                                        } else if (biliEditorMaterialMultiInfo != null) {
                                            BiliEditorMaterialFoldTrackView biliEditorMaterialFoldTrackView15 = biliEditorMainPanel.f107073f;
                                            Tx0.h hVar2 = biliEditorMaterialFoldTrackView15.f106200b;
                                            if (hVar2.f24339b.contains(biliEditorMaterialMultiInfo)) {
                                                BLog.e("MaterialFoldTrackDataControl", "materialNew already in mMaterialList");
                                            } else {
                                                Mx0.a aVar3 = Mx0.a.f16457j;
                                                int iE = a.C0086a.e(biliEditorMaterialMultiInfo.getInPoint());
                                                int iE2 = a.C0086a.e(biliEditorMaterialMultiInfo.getOutPoint());
                                                biliEditorMaterialMultiInfo.setLeftPos(iE);
                                                biliEditorMaterialMultiInfo.setRightPos(iE2);
                                                List<BiliEditorMaterialMultiInfo> list2 = hVar2.f24339b;
                                                ListIterator<BiliEditorMaterialMultiInfo> listIterator = list2.listIterator(list2.size());
                                                while (true) {
                                                    if (listIterator.hasPrevious()) {
                                                        if (hVar2.h.compare(listIterator.previous(), biliEditorMaterialMultiInfo) <= 0) {
                                                            iNextIndex = listIterator.nextIndex();
                                                        }
                                                    } else {
                                                        iNextIndex = -1;
                                                    }
                                                }
                                                if (iNextIndex < 0) {
                                                    hVar2.f24339b.add(0, biliEditorMaterialMultiInfo);
                                                } else {
                                                    hVar2.f24339b.add(iNextIndex + 1, biliEditorMaterialMultiInfo);
                                                }
                                            }
                                            biliEditorMaterialFoldTrackView15.setMaterialSelected(biliEditorMaterialMultiInfo);
                                            biliEditorMaterialFoldTrackView15.d();
                                        }
                                    }
                                }
                                return Unit.INSTANCE;
                            case 1:
                                String str2 = (String) obj;
                                FragmentActivity fragmentActivity = (FragmentActivity) obj2;
                                rQ.b.a(fragmentActivity.getSupportFragmentManager(), "ReserveShareRender");
                                if (str2 != null) {
                                    ToastHelper.showToastShort(fragmentActivity, str2);
                                }
                                return Unit.INSTANCE;
                            case 2:
                                MutableBundleLike mutableBundleLike = (MutableBundleLike) obj;
                                int i39 = IMMainNotificationView.j;
                                wU.a aVar4 = (wU.a) obj2;
                                mutableBundleLike.put("type", String.valueOf(aVar4.c));
                                mutableBundleLike.put("KEY_NOTICE_COUNT", String.valueOf(aVar4.a));
                                mutableBundleLike.put("KEY_TOTAL_UNREAD_MESSAGE_COUNT", String.valueOf(aVar4.b));
                                return null;
                            default:
                                DrawScope drawScope = (DrawScope) obj;
                                ImageBitmap imageBitmap = (ImageBitmap) obj2;
                                if (imageBitmap.getHeight() < Float.intBitsToFloat((int) (drawScope.mo2935getSizeNHjbRc() & 4294967295L))) {
                                    jD = IntSize.m3967constructorimpl((((long) imageBitmap.getWidth()) << 32) | (4294967295L & ((long) imageBitmap.getHeight())));
                                } else {
                                    jD = androidx.compose.ui.unit.b.d(drawScope.mo2935getSizeNHjbRc());
                                }
                                float fCoerceAtLeast = RangesKt.coerceAtLeast(Float.intBitsToFloat((int) (drawScope.mo2935getSizeNHjbRc() >> 32)) - imageBitmap.getWidth(), 0.0f);
                                drawScope.getDrawContext().getTransform().translate(fCoerceAtLeast, 0.0f);
                                try {
                                    DrawScope.m2900drawImageAZ2fEMs$default(drawScope, imageBitmap, 0L, 0L, 0L, jD, 0.0f, null, null, 0, 0, 1006, null);
                                    drawScope.getDrawContext().getTransform().translate(-fCoerceAtLeast, 0.0f);
                                    return Unit.INSTANCE;
                                } catch (Throwable th) {
                                    drawScope.getDrawContext().getTransform().translate(-fCoerceAtLeast, 0.0f);
                                    throw th;
                                }
                        }
                    }
                }));
                cVar.k.observe(this, new L0.a(new A0(l02, 0)));
                cVar.l.observe(this, new L0.a(new D0(l02, 0)));
                cVar.m.observe(this, new L0.a(new E0(l02, 0)));
                cVar.n.observe(this, new L0.a(new F0(l02, 0)));
                final int i38 = 0;
                cVar.p.observe(this, new L0.a(new Function1(l02, i38) { // from class: By0.G0

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f1078a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Object f1079b;

                    {
                        this.f1078a = i38;
                        this.f1079b = l02;
                    }

                    public final Object invoke(Object obj) {
                        Object obj2 = this.f1079b;
                        switch (this.f1078a) {
                            case 0:
                                Fy0.o oVar = (Fy0.o) obj;
                                if (oVar != null) {
                                    ((L0) obj2).f1110b.f107068a.setVideoMode(oVar.f6505a);
                                }
                                return Unit.INSTANCE;
                            case 1:
                                Pair pair = (Pair) obj;
                                int i39 = MoodDailySignTransmitActivity.J;
                                if (pair != null && ((Number) pair.getFirst()).intValue() == -1) {
                                    MoodDailySignTransmitActivity moodDailySignTransmitActivity = (MoodDailySignTransmitActivity) obj2;
                                    moodDailySignTransmitActivity.getClass();
                                    ToastHelper.showToastShort(moodDailySignTransmitActivity, 2131850700);
                                    moodDailySignTransmitActivity.finish();
                                }
                                Unit unit = Unit.INSTANCE;
                                return unit;
                            default:
                                ((MutableState) obj2).setValue(Boolean.valueOf(!((Boolean) obj).booleanValue()));
                                return Unit.INSTANCE;
                        }
                    }
                }));
                cVar.q.observe(this, new L0.a(new H0(l02, 0)));
                cVar.r.observe(this, new L0.a(new I0(l02, 0)));
                cVar.s.observe(this, new L0.a(new J0(l02, 0)));
                cVar.t.observe(this, new L0.a(new K0(l02, 0)));
                cVar.u.observe(this, new L0.a(new C1487q0(l02, 0)));
                final int i39 = 0;
                cVar.v.observe(this, new L0.a(new Function1(l02, i39) { // from class: By0.s0

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f1315a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Object f1316b;

                    {
                        this.f1315a = i39;
                        this.f1316b = l02;
                    }

                    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                    /* JADX WARN: Removed duplicated region for block: B:113:0x0376  */
                    /* JADX WARN: Removed duplicated region for block: B:16:0x00a6  */
                    /* JADX WARN: Removed duplicated region for block: B:51:0x01ca  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0067  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object invoke(java.lang.Object r9) throws kotlin.NoWhenBranchMatchedException {
                        /*
                            Method dump skipped, instruction units count: 1161
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: By0.C1492s0.invoke(java.lang.Object):java.lang.Object");
                    }
                }));
                final int i40 = 0;
                cVar.w.observe(this, new L0.a(new Function1(l02, i40) { // from class: By0.t0

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f1321a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Object f1322b;

                    {
                        this.f1321a = i40;
                        this.f1322b = l02;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:8:0x0055  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object invoke(java.lang.Object r9) {
                        /*
                            Method dump skipped, instruction units count: 337
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: By0.C1495t0.invoke(java.lang.Object):java.lang.Object");
                    }
                }));
            }
            dz0.c cVar7 = ((Yv0.b) this).B;
            if (cVar7 != null && (gVar2 = cVar7.c) != null && (fVar = gVar2.a) != null) {
                final U1 u12 = this.f106273M;
                if (u12 != null) {
                    fVar.a.observe(this, new U1.a(new Function1(u12) { // from class: By0.I1

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final U1 f1094a;

                        {
                            this.f1094a = u12;
                        }

                        public final Object invoke(Object obj) {
                            Iy0.h hVar = (Iy0.h) obj;
                            if (hVar != null) {
                                C2892y c2892y = (C2892y) this.f1094a.f1201a;
                                c2892y.h.setVisibility(hVar.f10536a);
                                c2892y.h.setBackgroundResource(hVar.f10537b);
                            }
                            return Unit.INSTANCE;
                        }
                    }));
                    fVar.b.observe(this, new U1.a(new L1(u12, 0)));
                    fVar.c.observe(this, new U1.a(new M1(u12, 0)));
                    fVar.d.observe(this, new U1.a(new Function1(u12, this) { // from class: By0.N1

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final U1 f1124a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final BiliEditorMainActivity f1125b;

                        {
                            this.f1124a = u12;
                            this.f1125b = this;
                        }

                        public final Object invoke(Object obj) {
                            Iy0.e eVar2 = (Iy0.e) obj;
                            if (eVar2 != null) {
                                U1 u13 = this.f1124a;
                                u13.getClass();
                                boolean z6 = eVar2.f10526a;
                                ResolutionType resolutionType = eVar2.f10527b;
                                if (z6) {
                                    ((C2892y) u13.f1201a).f24061e.setText(resolutionType.getDesc());
                                } else {
                                    ToastHelper.showToastShort(this.f1125b, 2131841791);
                                    u13.f1171b.b(resolutionType);
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }));
                    fVar.e.observe(this, new U1.a(new O1(u12, 0)));
                    final int i41 = 0;
                    fVar.f.observe(this, new U1.a(new Function1(i41, u12, this) { // from class: By0.P1

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final int f1136a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final Object f1137b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final Object f1138c;

                        {
                            this.f1136a = i41;
                            this.f1137b = u12;
                            this.f1138c = this;
                        }

                        public final Object invoke(Object obj) {
                            switch (this.f1136a) {
                                case 0:
                                    final Iy0.b bVar2 = (Iy0.b) obj;
                                    if (bVar2 != null) {
                                        final U1 u13 = (U1) this.f1137b;
                                        u13.getClass();
                                        boolean z6 = bVar2.f10511a;
                                        Object obj2 = u13.f1201a;
                                        if (z6) {
                                            ((C2892y) obj2).f24060d.setVisibility(0);
                                        } else {
                                            ((C2892y) obj2).f24060d.setVisibility(8);
                                        }
                                        C2892y c2892y = (C2892y) obj2;
                                        c2892y.f24060d.setOnClickListener(new View.OnClickListener(u13, bVar2) { // from class: By0.Q1

                                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                                            public final U1 f1144a;

                                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                                            public final Iy0.b f1145b;

                                            {
                                                this.f1144a = u13;
                                                this.f1145b = bVar2;
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                bz0.f fVar2;
                                                U1 u14 = this.f1144a;
                                                Iy0.b bVar3 = this.f1145b;
                                                if (com.bilibili.studio.videoeditor.util.V.c() || ((Boolean) u14.f1172c.invoke()).booleanValue() || (fVar2 = bVar3.f10512b) == null) {
                                                    return;
                                                }
                                                fVar2.invoke();
                                            }
                                        });
                                        c2892y.f24064i.setOnClickListener(new View.OnClickListener(u13, bVar2) { // from class: By0.R1

                                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                                            public final U1 f1148a;

                                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                                            public final Iy0.b f1149b;

                                            {
                                                this.f1148a = u13;
                                                this.f1149b = bVar2;
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                Nx.d dVar2;
                                                U1 u14 = this.f1148a;
                                                Iy0.b bVar3 = this.f1149b;
                                                if (com.bilibili.studio.videoeditor.util.V.c() || ((Boolean) u14.f1172c.invoke()).booleanValue() || (dVar2 = bVar3.f10513c) == null) {
                                                    return;
                                                }
                                                dVar2.invoke();
                                            }
                                        });
                                        c2892y.f24058b.setOnClickListener(new View.OnClickListener(u13, bVar2) { // from class: By0.S1

                                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                                            public final U1 f1154a;

                                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                                            public final Iy0.b f1155b;

                                            {
                                                this.f1154a = u13;
                                                this.f1155b = bVar2;
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                Pa.U u7;
                                                U1 u14 = this.f1154a;
                                                Iy0.b bVar3 = this.f1155b;
                                                if (com.bilibili.studio.videoeditor.util.V.c() || ((Boolean) u14.f1172c.invoke()).booleanValue() || (u7 = bVar3.f10516f) == null) {
                                                    return;
                                                }
                                                u7.invoke();
                                            }
                                        });
                                        if (bVar2.f10514d) {
                                            final int i42 = 0;
                                            c2892y.f24059c.setOnClickListener(new View.OnClickListener(i42, u13, bVar2) { // from class: By0.T1

                                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                                public final int f1164a;

                                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                public final Object f1165b;

                                                /* JADX INFO: renamed from: c, reason: collision with root package name */
                                                public final Object f1166c;

                                                {
                                                    this.f1164a = i42;
                                                    this.f1165b = u13;
                                                    this.f1166c = bVar2;
                                                }

                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    Wu0.b bVar3;
                                                    switch (this.f1164a) {
                                                        case 0:
                                                            U1 u14 = (U1) this.f1165b;
                                                            Iy0.b bVar4 = (Iy0.b) this.f1166c;
                                                            if (!com.bilibili.studio.videoeditor.util.V.c() && !((Boolean) u14.f1172c.invoke()).booleanValue() && (bVar3 = bVar4.f10515e) != null) {
                                                                bVar3.invoke();
                                                            }
                                                            break;
                                                        default:
                                                            b0.a aVar2 = (b0.a) this.f1165b;
                                                            Nj.W w7 = (Nj.W) this.f1166c;
                                                            com.bilibili.app.comment3.ui.holder.handle.P p7 = aVar2.b;
                                                            if (p7 != null) {
                                                                p7.invoke(w7);
                                                            }
                                                            break;
                                                    }
                                                }
                                            });
                                            c2892y.f24059c.setVisibility(0);
                                            c2892y.f24059c.post(new J1(u13, (BiliEditorMainActivity) this.f1138c));
                                        } else {
                                            c2892y.f24059c.setVisibility(8);
                                        }
                                    }
                                    break;
                                default:
                                    f.a aVar2 = (f.a) this.f1137b;
                                    List list = aVar2.b;
                                    ((LazyListScope) obj).items(list.size(), new tv.danmaku.bili.ui.main2.mineV3.p(new kntr.app.game.steam.l(1), list), new tv.danmaku.bili.ui.main2.mineV3.q(list), ComposableLambdaKt.composableLambdaInstance(2039820996, true, new tv.danmaku.bili.ui.main2.mineV3.r(list, aVar2, (MineUserCenterViewModel3) this.f1138c)));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }));
                }
                final int i42 = 0;
                fVar.g.observe(this, new b(new Function1(this, i42) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.b

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f106289a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Object f106290b;

                    {
                        this.f106289a = i42;
                        this.f106290b = this;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v13, types: [android.app.Activity, android.content.Context, com.bilibili.studio.editor.moudle.editormain.ui.BiliEditorMainActivity] */
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    public final Object invoke(Object obj) throws IOException {
                        D d8;
                        EditVideoInfo editVideoInfo;
                        String strValueOf;
                        String jumpParam;
                        int i43 = 2;
                        Object obj2 = this.f106290b;
                        switch (this.f106289a) {
                            case 0:
                                Iy0.d dVar2 = (Iy0.d) obj;
                                int i44 = BiliEditorMainActivity.f106268Y;
                                TopBtnNextType topBtnNextType = dVar2 != null ? dVar2.f10522a : null;
                                ?? r02 = (BiliEditorMainActivity) obj2;
                                if (topBtnNextType != TopBtnNextType.TYPE_RETURN_DATA) {
                                    TopBtnNextType topBtnNextType2 = null;
                                    if (dVar2 != null) {
                                        topBtnNextType2 = dVar2.f10522a;
                                    }
                                    if (topBtnNextType2 == TopBtnNextType.TYPE_CUSTOM_ROUTE) {
                                        r02.f106270J.getClass();
                                        if (dVar2.f10525d != null && (d8 = G.b().f108864a) != 0) {
                                            d8.setEditContext(r02);
                                            Y0.c.c("finishActivityByEditCustomize use customise action result=", "VideoEditorRepository", d8.onEditVideoFinish(dVar2.f10525d, dVar2.f10523b));
                                        }
                                    }
                                } else if (r02.f106273M != null && (editVideoInfo = dVar2.f10525d) != null) {
                                    boolean z6 = dVar2.f10523b;
                                    if (!z6) {
                                        i43 = 1;
                                    }
                                    CaptureSchema.MissionInfo missionInfo = editVideoInfo.getMissionInfo();
                                    if (missionInfo != null) {
                                        jumpParam = missionInfo.getJumpParam();
                                        strValueOf = String.valueOf(missionInfo.getBgmId());
                                    } else {
                                        strValueOf = "";
                                        jumpParam = "";
                                    }
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putInt("edit_type", i43);
                                    bundle2.putString("edit_bgm_sid", strValueOf);
                                    bundle2.putString("JUMP_PARAMS", jumpParam);
                                    if (z6) {
                                        com.bilibili.studio.videoeditor.help.compiler.sdk.i iVarA = i.a.a(r02.getApplicationContext());
                                        iVarA.c(editVideoInfo.getMuxInfo(r02.getApplicationContext()));
                                        iVarA.h();
                                    } else {
                                        String str2 = dVar2.f10524c;
                                        if (str2 == null) {
                                            str2 = "";
                                        }
                                        bundle2.putString("edit_video_file", str2);
                                    }
                                    Lazy<com.bilibili.studio.videoeditor.common.intent.a> lazy = com.bilibili.studio.videoeditor.common.intent.a.f109426c;
                                    a.C1206a.a().c(r02, "edit_video_info", editVideoInfo);
                                    bundle2.putBoolean("edit_video_info", true);
                                    Intent intent = new Intent();
                                    intent.putExtra("param_control", bundle2);
                                    r02.setResult(-1, intent);
                                    Contract contractAb = ConfigManager.Companion.ab();
                                    Boolean bool = Boolean.TRUE;
                                    if (Intrinsics.areEqual(contractAb.get("bgthread_ui_access_detect_enable", bool), bool)) {
                                        Thread threadCurrentThread = Thread.currentThread();
                                        if (!androidx.appcompat.app.n.a(threadCurrentThread)) {
                                            IllegalStateException illegalStateException = new IllegalStateException(F.b("Activity.finish() called from non-UI thread: ", threadCurrentThread, ", 请联系 Jackin"));
                                            Neurons.trackT(false, "app.bgthread.ui.access", MapsKt.mapOf(new Pair[]{TuplesKt.to("stacktrace", Pb.G.b("Activity.finish() called from non-UI thread: ", threadCurrentThread, "BgThreadUIAccess", illegalStateException, illegalStateException)), TuplesKt.to("threadName", threadCurrentThread.getName())}), 1, new AT0.c(8));
                                        }
                                    }
                                    r02.finish();
                                }
                                return Unit.INSTANCE;
                            case 1:
                                TextView textView = (TextView) obj;
                                textView.setText(((MallHomePageFeedsBean) obj2).getTitle());
                                textView.setMaxLines(2);
                                textView.getPaint().setFakeBoldText(true);
                                return Unit.INSTANCE;
                            case 2:
                                return ((Long) obj2) + UtilsKt.DOT + ((Integer) obj).intValue();
                            default:
                                ((MutableState) obj2).setValue(IntSize.m3964boximpl(((IntSize) obj).m3976unboximpl()));
                                return Unit.INSTANCE;
                        }
                    }
                }));
                fVar.h.observe(this, new b(new com.bilibili.biligame.ui.feed.h(this, 2)));
            }
            dz0.c cVar8 = ((Yv0.b) this).B;
            if (cVar8 != null && (gVar = cVar8.c) != null && (eVar = gVar.b) != null) {
                final E1 e19 = this.f106274N;
                if (e19 != null) {
                    eVar.a.observe(this, new E1.a(new C1467j1(e19, 0)));
                    final int i43 = 0;
                    eVar.b.observe(this, new E1.a(new Function1(e19, i43) { // from class: By0.C1

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final int f1054a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final Object f1055b;

                        {
                            this.f1054a = i43;
                            this.f1055b = e19;
                        }

                        public final Object invoke(Object obj) {
                            Object obj2 = this.f1055b;
                            switch (this.f1054a) {
                                case 0:
                                    if (((Hy0.n) obj) != null) {
                                        ((C2891x) ((E1) obj2).f1201a).f24044g.setEnabled(true);
                                    }
                                    break;
                                case 1:
                                    int i44 = ConversationActivity.A1;
                                    ConversationActivity conversationActivity = (ConversationActivity) obj2;
                                    conversationActivity.getClass();
                                    ToastHelper.showToast(conversationActivity, (String) obj, 0);
                                    break;
                                case 2:
                                    BLog.e("MallShareWebHelper", "MallShareWebHelper handleArgs error" == 0 ? "" : "MallShareWebHelper handleArgs error", (Exception) obj);
                                    d.a aVar2 = (d.a) obj2;
                                    if (aVar2 != null) {
                                        aVar2.a(vm0.h.a(-1));
                                    }
                                    break;
                                default:
                                    List list = (List) obj;
                                    HomeContainerFragmentV2 homeContainerFragmentV2 = (HomeContainerFragmentV2) obj2;
                                    YY.i0 i0Var = homeContainerFragmentV2.n;
                                    if (i0Var == null) {
                                        homeContainerFragmentV2.r = list;
                                    } else {
                                        HomeContainerToolbarV2 homeContainerToolbarV2 = i0Var.p;
                                        if (homeContainerToolbarV2 != null) {
                                            homeContainerToolbarV2.setUp(list);
                                        }
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }));
                    eVar.c.observe(this, new E1.a(new C1470k1(e19, 0)));
                    eVar.e.observe(this, new E1.a(new C1473l1(e19, 0)));
                    eVar.f.observe(this, new E1.a(new C1476m1(e19, 0)));
                    final int i44 = 0;
                    eVar.g.observe(this, new E1.a(new Function1(e19, i44) { // from class: By0.n1

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final int f1286a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final Object f1287b;

                        {
                            this.f1286a = i44;
                            this.f1287b = e19;
                        }

                        public final Object invoke(Object obj) {
                            WQ.k kVar;
                            WQ.h hVar;
                            com.bilibili.bplus.followinglist.service.M0 m0L;
                            WQ.O o7;
                            WQ.D d8;
                            IAdFollowingSourceContentWrapper iAdFollowingSourceContentWrapper;
                            WQ.k kVarY;
                            WQ.h hVar2;
                            com.bilibili.bplus.followinglist.service.M0 m0L2;
                            WQ.O o8;
                            WQ.D d9;
                            IAdFollowingSourceContentWrapper iAdFollowingSourceContentWrapper2;
                            Object obj2 = this.f1287b;
                            switch (this.f1286a) {
                                case 0:
                                    Hy0.c cVar9 = (Hy0.c) obj;
                                    if (cVar9 != null) {
                                        E1 e110 = (E1) obj2;
                                        e110.getClass();
                                        List<PointF> list = cVar9.f8870a;
                                        Object obj3 = e110.f1201a;
                                        boolean z6 = cVar9.f8871b;
                                        if (list == null || list.isEmpty()) {
                                            BLog.e("PreviewUiManager", "updateCaptionRectDrawRect newList=" + cVar9.f8870a);
                                            ((C2891x) obj3).f24039b.b(cVar9.f8870a, z6);
                                        } else {
                                            C2891x c2891x2 = (C2891x) obj3;
                                            ArrayList arrayListA = px0.c.a(c2891x2.h, c2891x2.f24044g, cVar9.f8870a);
                                            BLog.e("PreviewUiManager", "updateCaptionRectDrawRect newList=" + arrayListA + ",");
                                            c2891x2.f24039b.b(arrayListA, z6);
                                        }
                                    }
                                    break;
                                case 1:
                                    ((TK.f) obj2).g0(((tI.c0) obj).a);
                                    break;
                                default:
                                    long jLongValue = ((Long) obj).longValue();
                                    int i45 = com.bilibili.bplus.followinglist.module.item.author.h.h;
                                    com.bilibili.bplus.followinglist.module.item.author.h hVar3 = (com.bilibili.bplus.followinglist.module.item.author.h) obj2;
                                    if (((KS.k) hVar3).b != null) {
                                        WQ.U0 u02 = ((KS.k) hVar3).c;
                                        com.bilibili.bplus.followinglist.service.N n7 = ((KS.k) hVar3).d;
                                        AdDynamicSceneType adDynamicSceneTypeA = null;
                                        if (u02 != null && (kVarY = u02.Y()) != null && (hVar2 = kVarY.a) != null && jLongValue == hVar2.a) {
                                            EQ.w wVar = EQ.w.a;
                                            AdDynamicSceneType adDynamicSceneTypeA2 = null;
                                            if (n7 != null) {
                                                adDynamicSceneTypeA2 = EQ.x.a(n7);
                                            }
                                            if (adDynamicSceneTypeA2 != null && (o8 = ((WQ.H) u02).a) != null && (d9 = o8.a) != null && (iAdFollowingSourceContentWrapper2 = d9.v) != null) {
                                            }
                                            if (n7 != null && (m0L2 = n7.l()) != null) {
                                                m0L2.f(u02, new Pair[]{TuplesKt.to("sub_module", "follow"), TuplesKt.to("action_type", "interaction_follow")});
                                            }
                                        } else if (u02 != null && (kVar = (WQ.k) CollectionsKt.getOrNull(u02.l, 1)) != null && (hVar = kVar.a) != null && jLongValue == hVar.a) {
                                            EQ.w wVar2 = EQ.w.a;
                                            if (n7 != null) {
                                                adDynamicSceneTypeA = EQ.x.a(n7);
                                            }
                                            if (adDynamicSceneTypeA != null && (o7 = ((WQ.H) u02).a) != null && (d8 = o7.a) != null && (iAdFollowingSourceContentWrapper = d8.v) != null) {
                                            }
                                            if (n7 != null && (m0L = n7.l()) != null) {
                                                m0L.f(u02, new Pair[]{TuplesKt.to("sub_module", "joint_follow"), TuplesKt.to("action_type", "interaction_follow")});
                                            }
                                        }
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }));
                    final int i45 = 0;
                    eVar.j.observe(this, new E1.a(new Function1(e19, i45) { // from class: By0.o1

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final int f1294a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final Object f1295b;

                        {
                            this.f1294a = i45;
                            this.f1295b = e19;
                        }

                        public final Object invoke(Object obj) {
                            ChatMessage dbMessage;
                            boolean z6 = false;
                            Object obj2 = this.f1295b;
                            switch (this.f1294a) {
                                case 0:
                                    Hy0.e eVar2 = (Hy0.e) obj;
                                    if (eVar2 != null) {
                                        E1 e110 = (E1) obj2;
                                        e110.getClass();
                                        Function1<Boolean, Unit> function1 = eVar2.f8873a;
                                        if (function1 != null) {
                                            function1.invoke(Boolean.valueOf(((C2891x) e110.f1201a).f24039b.f125665o));
                                        }
                                    }
                                    return Unit.INSTANCE;
                                case 1:
                                    ((Z9.c) obj2).getClass();
                                    ((JSONObjectCreator) obj).to("event_from", "");
                                    return Unit.INSTANCE;
                                case 2:
                                    com.bilibili.app.comment3.data.model.q qVar = (com.bilibili.app.comment3.data.model.q) obj;
                                    ReportAction.ReplyCardAllClick.Pos pos = ReportAction.ReplyCardAllClick.Pos.TOPIC;
                                    Map mapMapOf = MapsKt.mapOf(TuplesKt.to("message", qVar.a));
                                    CommentContentRichTextHandler commentContentRichTextHandler = (CommentContentRichTextHandler) obj2;
                                    commentContentRichTextHandler.d(pos, mapMapOf);
                                    commentContentRichTextHandler.a(qVar.c);
                                    return Unit.INSTANCE;
                                case 3:
                                    long jLongValue = ((Long) obj).longValue();
                                    int i46 = com.bilibili.bplus.followinglist.module.item.author.h.h;
                                    WQ.U0 u02 = ((KS.k) ((com.bilibili.bplus.followinglist.module.item.author.h) obj2)).c;
                                    return u02 != null ? Boolean.valueOf(u02.I(jLongValue)) : null;
                                case 4:
                                    Map map = (Map) obj;
                                    ConversationActivity conversationActivity = (ConversationActivity) obj2;
                                    for (BaseTypedMessage baseTypedMessage : conversationActivity.Z.f) {
                                        if (baseTypedMessage != null && (dbMessage = baseTypedMessage.getDbMessage()) != null) {
                                            Object content = baseTypedMessage.getContent();
                                            HasLikeState hasLikeState = (HasLikeState) map.get(Long.valueOf(dbMessage.getMsgKey()));
                                            Object objE = content;
                                            if (hasLikeState != null) {
                                                objE = content;
                                                if (content instanceof GptTextContent) {
                                                    objE = ((GptTextContent) content).e(hasLikeState);
                                                }
                                            }
                                            baseTypedMessage.updateContent(objE);
                                            z6 = true;
                                        }
                                    }
                                    if (z6) {
                                        conversationActivity.Z.notifyDataSetChanged();
                                    }
                                    return Unit.INSTANCE;
                                case 5:
                                    ((Boolean) obj).booleanValue();
                                    FeedSharePanel.access$switchDetailPage((FeedSharePanel) obj2);
                                    return Unit.INSTANCE;
                                case 6:
                                    FocusRequester.m2409requestFocus3ESFkO8$default((FocusRequester) obj2, 0, 1, null);
                                    return Unit.INSTANCE;
                                default:
                                    SubCardModule subCardModule = (SubCardModule) obj;
                                    Function2 function2 = ((AdSearchGoodsView) obj2).f;
                                    Unit unit = null;
                                    if (function2 != null) {
                                        function2.invoke(subCardModule, 0);
                                        unit = Unit.INSTANCE;
                                    }
                                    return unit;
                            }
                        }
                    }));
                    eVar.i.observe(this, new E1.a(new C1485p1(e19, 0)));
                    eVar.k.observe(this, new E1.a(new C1488q1(e19, 0)));
                    final int i46 = 0;
                    eVar.l.observe(this, new E1.a(new Function1(e19, i46) { // from class: By0.r1

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final int f1311a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final Object f1312b;

                        {
                            this.f1311a = i46;
                            this.f1312b = e19;
                        }

                        public final Object invoke(Object obj) {
                            switch (this.f1311a) {
                                case 0:
                                    Hy0.h hVar = (Hy0.h) obj;
                                    C2891x c2891x2 = (C2891x) ((E1) this.f1312b).f1201a;
                                    EditorPreviewDashedLineView editorPreviewDashedLineView = c2891x2.f24046j;
                                    if (hVar.f8883b) {
                                        editorPreviewDashedLineView.f107099c.setVisibility(0);
                                        editorPreviewDashedLineView.f107100d.setVisibility(0);
                                    } else {
                                        editorPreviewDashedLineView.f107099c.setVisibility(8);
                                        editorPreviewDashedLineView.f107100d.setVisibility(8);
                                    }
                                    boolean z6 = hVar.f8882a;
                                    EditorPreviewDashedLineView editorPreviewDashedLineView2 = c2891x2.f24046j;
                                    if (z6) {
                                        editorPreviewDashedLineView2.f107097a.setVisibility(0);
                                        editorPreviewDashedLineView2.f107098b.setVisibility(0);
                                    } else {
                                        editorPreviewDashedLineView2.f107097a.setVisibility(8);
                                        editorPreviewDashedLineView2.f107098b.setVisibility(8);
                                    }
                                    return Unit.INSTANCE;
                                case 1:
                                    String str2 = (String) obj;
                                    String str3 = (String) this.f1312b;
                                    return StringsKt.w(str2, str3) ? str2.substring(0, str2.length() - str3.length()) : C4448z.a(5, 0, str2);
                                case 2:
                                    int iIntValue = ((Integer) obj).intValue();
                                    MallStoryFeedsFragment mallStoryFeedsFragment = (MallStoryFeedsFragment) this.f1312b;
                                    return Integer.valueOf(iIntValue < 3 ? ((Number) mallStoryFeedsFragment.h.getValue()).intValue() : ((Number) mallStoryFeedsFragment.i.getValue()).intValue());
                                default:
                                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                                    Function1 function1 = (Function1) this.f1312b;
                                    if (zBooleanValue) {
                                        function1.invoke(new U.g((Map) null, 5, true));
                                    } else {
                                        function1.invoke(new U.m(0));
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }));
                    eVar.m.observe(this, new E1.a(new C1499u1(e19, 0)));
                    eVar.q.observe(this, new E1.a(new C1502v1(e19, 0)));
                    eVar.o.observe(this, new E1.a(new C1505w1(e19, 0)));
                    eVar.p.observe(this, new E1.a(new C1508x1(e19, 0)));
                    eVar.r.observe(this, new E1.a(new y1(e19, 0)));
                    eVar.s.observe(this, new E1.a(new z1(e19, 0)));
                    eVar.t.observe(this, new E1.a(new A1(e19, 0)));
                    eVar.u.observe(this, new E1.a(new B1(e19, 0)));
                }
                eVar.n.observe(this, new b(new com.bilibili.ship.theseus.ogv.intro.paybar.b(this, 1)));
                final int i47 = 0;
                eVar.d.observe(this, new b(new Function1(this, i47) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.d

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f106293a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Object f106294b;

                    {
                        this.f106293a = i47;
                        this.f106294b = this;
                    }

                    /* JADX WARN: Type inference failed for: r0v10, types: [android.app.Activity, com.bilibili.studio.editor.moudle.editormain.ui.BiliEditorMainActivity] */
                    public final Object invoke(Object obj) {
                        Object obj2 = this.f106294b;
                        switch (this.f106293a) {
                            case 0:
                                t tVar = (t) obj;
                                if (tVar != null) {
                                    ?? r02 = (BiliEditorMainActivity) obj2;
                                    if (r02.f106274N != null) {
                                        Window window = r02.getWindow();
                                        if (tVar.f8908a) {
                                            window.addFlags(128);
                                        } else {
                                            window.clearFlags(128);
                                        }
                                    }
                                } else {
                                    int i48 = BiliEditorMainActivity.f106268Y;
                                }
                                break;
                            default:
                                if (((Response) obj).isSuccessful()) {
                                    ((MallHomeTabPageDataRemoteSource) obj2).a++;
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                eVar.h.observe(this, new b(new l(this, 1)));
            }
            lB0.a aVarA = lB0.a.a();
            a$b a_b = new a$b(this) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.e

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final BiliEditorMainActivity f106295a;

                {
                    this.f106295a = this;
                }

                @Override // lB0.a$b
                public final void onBusEvent(Object obj) throws IOException {
                    int i48 = BiliEditorMainActivity.f106268Y;
                    this.f106295a.finish();
                }
            };
            aVarA.getClass();
            this.f106279S = lB0.a.b(EventFinishEdit.class, a_b);
            lB0.a aVarA2 = lB0.a.a();
            a$b a_b2 = new a$b(this) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final BiliEditorMainActivity f106288a;

                {
                    this.f106288a = this;
                }

                @Override // lB0.a$b
                public final void onBusEvent(Object obj) throws IOException {
                    int i48 = BiliEditorMainActivity.f106268Y;
                    this.f106288a.finish();
                }
            };
            aVarA2.getClass();
            this.f106280T = lB0.a.b(uC0.a.class, a_b2);
        }
        C2868b c2868b3 = (C2868b) ((Yv0.b) this).C;
        UpperLiveWindowExt upperLiveWindowExt = null;
        if (c2868b3 != null) {
            C2891x c2891x2 = c2868b3.f23744f;
            upperLiveWindowExt = null;
            if (c2891x2 != null) {
                upperLiveWindowExt = c2891x2.f24044g;
            }
        }
        if (upperLiveWindowExt == null) {
            BLog.e("BiliEditorMainActivity", "finish() onActivityCreate liveWindow==null");
            finish();
        } else {
            dz0.c cVar9 = ((Yv0.b) this).B;
            if (cVar9 != null) {
                cVar9.M0(bundle, getIntent(), upperLiveWindowExt, getLoaderManager());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a7() {
        try {
            dz0.c cVar = ((Yv0.b) this).B;
            GameSchemeBean gameSchemeBean = cVar != null ? cVar.d.d.f4799a : null;
            if (gameSchemeBean != null && !TextUtils.isEmpty(gameSchemeBean.callback)) {
                vC0.c.a(201, gameSchemeBean.callback, this);
            }
            dz0.c cVar2 = ((Yv0.b) this).B;
            if (cVar2 != null) {
                cVar2.O0();
            }
            finish();
        } catch (Exception e7) {
            e7.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void attachBaseContext(Context context) {
        super/*androidx.appcompat.app.AppCompatActivity*/.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean dispatchTouchEvent(@Nullable MotionEvent motionEvent) {
        if (this.f106282V) {
            return super/*android.app.Activity*/.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void finish() throws IOException {
        Mx0.g gVar;
        super/*android.app.Activity*/.finish();
        C2868b c2868b = (C2868b) ((Yv0.b) this).C;
        BiliMainEditorRecordFragment biliMainEditorRecordFragment = null;
        if (c2868b != null && (gVar = c2868b.f23741c.h) != null) {
            Mx0.a aVar = Mx0.a.f16457j;
            aVar.f16462e.clear();
            aVar.f16463f.clear();
            aVar.f16465i.cancel();
            aVar.h.forceFinished(true);
            gVar.f16490c = null;
        }
        this.f106282V = false;
        a.a aVar2 = this.f106279S;
        if (aVar2 != null) {
            aVar2.a();
        }
        a.a aVar3 = this.f106280T;
        if (aVar3 != null) {
            aVar3.a();
        }
        dz0.c cVar = ((Yv0.b) this).B;
        if (cVar != null) {
            cVar.e.c.getClass();
            com.bilibili.studio.editor.moudle.music.manager.b.d().b();
            com.bilibili.studio.editor.moudle.music.manager.b bVarD = com.bilibili.studio.editor.moudle.music.manager.b.d();
            bVarD.f107903a = null;
            ((ArrayList) bVarD.f107905c).clear();
            bVarD.f107904b = null;
            k0 k0Var = cVar.e.a;
            EditVideoInfo editVideoInfo = k0Var.f13142a.f4806b;
            if (editVideoInfo != null) {
                C8145a c8145aB = C8145a.b();
                c8145aB.getClass();
                List listA = C8145a.a(editVideoInfo);
                HandlerC8270a handlerC8270a = c8145aB.f124410a;
                handlerC8270a.getClass();
                Message messageObtain = Message.obtain();
                messageObtain.what = 103;
                messageObtain.obj = listA;
                handlerC8270a.sendMessage(messageObtain);
            }
            k0Var.f13147f = k0Var.l();
            com.bilibili.studio.editor.timeline.i iVar = cVar.d.a.f4833c;
            if (iVar != null) {
                iVar.c();
            }
            Lazy<UC0.n> lazy = UC0.n.f24629b;
            com.bilibili.studio.editor.moudle.material.e eVar = (com.bilibili.studio.editor.moudle.material.e) n.a.a().f24630a.getValue();
            eVar.f107893c.clear();
            eVar.f107892b = false;
            eVar.f107891a = null;
            k.a.f108315a.b(UpperEngineScene.MAIN_ENGINE);
            cVar.d.c.getClass();
            b.c cVar2 = RB0.b.h;
            if (cVar2 != null) {
                cVar2.f20686b = false;
                b.c cVar3 = RB0.b.h;
                if (cVar3 != null) {
                    cVar3.f20685a.clear();
                }
                RB0.b.h = null;
            }
            RB0.c cVar4 = RB0.b.f20676d;
            if (cVar4 != null) {
                cVar4.evictAll();
                RB0.b.f20676d = null;
            }
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) RB0.b.f20679g;
            if (!concurrentHashMap.isEmpty()) {
                Iterator it = concurrentHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    ((MediaMetadataRetriever) ((Map.Entry) it.next()).getValue()).release();
                }
                ((ConcurrentHashMap) RB0.b.f20679g).clear();
            }
            RB0.b.f20678f = null;
            RB0.b.f20677e.clear();
            WB0.a.f26425b = null;
            UB0.b.b();
            UB0.k.a().f24613a.shutdown();
            UB0.k.f24612b = null;
            Lazy<com.bilibili.studio.editor.moudle.home.presenter.a> lazy2 = com.bilibili.studio.editor.moudle.home.presenter.a.f107228b;
            a.C1194a.a().f107229a.clear();
            AsrZip2AiTask asrZip2AiTask = AsrZip2AiTask.f105675a;
            AsrZip2AiTask.b();
        }
        this.f106270J.getClass();
        G.b().f108864a = null;
        H1 h12 = this.f106272L;
        synchronized (h12) {
            BiliTemplateEngineManager biliTemplateEngineManager = h12.f1089c;
            if (biliTemplateEngineManager != null) {
                biliTemplateEngineManager.k();
            }
            h12.f1089c = null;
        }
        T t7 = this.f106277Q;
        if (t7 != null) {
            Fragment fragmentFindFragmentByTag = t7.f1156b.findFragmentByTag("BiliMainEditorRecordFragment");
            if (fragmentFindFragmentByTag instanceof BiliMainEditorRecordFragment) {
                biliMainEditorRecordFragment = (BiliMainEditorRecordFragment) fragmentFindFragmentByTag;
            }
            if (biliMainEditorRecordFragment != null) {
                sy0.a aVarKf = biliMainEditorRecordFragment.kf();
                ((ArrayList) aVarKf.k).clear();
                aVarKf.M0();
                sy0.b bVar = aVarKf.m;
                if (bVar != null) {
                    bVar.cancel();
                }
                biliMainEditorRecordFragment.kf().f.b(biliMainEditorRecordFragment, "EditorRecordViewModel");
            }
        }
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        return "creation.video-editor.0.0.pv";
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
    @Override // com.bilibili.pvtracker.IPvTracker
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle getPvExtra() {
        /*
            r3 = this;
            r0 = r3
            Yv0.c r0 = r0.B
            dz0.c r0 = (dz0.c) r0
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L1d
            r0 = r4
            dz0.h r0 = r0.e
            Ky0.k0 r0 = r0.a
            android.os.Bundle r0 = r0.m()
            r5 = r0
            r0 = r5
            r4 = r0
            r0 = r5
            if (r0 != 0) goto L25
        L1d:
            android.os.Bundle r0 = new android.os.Bundle
            r1 = r0
            r1.<init>()
            r4 = r0
        L25:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.BiliEditorMainActivity.getPvExtra():android.os.Bundle");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onActivityResult(int i7, int i8, @Nullable Intent intent) throws IOException {
        super/*androidx.fragment.app.FragmentActivity*/.onActivityResult(i7, i8, intent);
        if (i7 == 999 && i8 == -1) {
            finish();
            return;
        }
        dz0.c cVar = ((Yv0.b) this).B;
        if (cVar != null) {
            for (Ky0.l0 l0Var : (ArrayList) cVar.e.o.f13073a) {
                if (l0Var.b(i7)) {
                    l0Var.onActivityResult(i7, i8, intent);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cb  */
    /* JADX WARN: Type inference failed for: r0v30, types: [com.bilibili.studio.videoeditor.widgets.BiliEditorConfirmDialogV2$a, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onBackPressed() {
        /*
            Method dump skipped, instruction units count: 530
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.BiliEditorMainActivity.onBackPressed():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onConfigurationChanged(@NotNull Configuration configuration) {
        super/*com.bilibili.lib.ui.BaseAppCompatActivity*/.onConfigurationChanged(configuration);
        boolean z6 = ScreenUtil.getScreenWidth(this) > ScreenUtil.getScreenHeight(this);
        dz0.c cVar = ((Yv0.b) this).B;
        if (cVar != null) {
            Wy0.d dVar = cVar.e.s;
            if (((Boolean) dVar.f27448i.getValue()).booleanValue()) {
                return;
            }
            if (z6) {
                dVar.a();
                dVar.e();
            } else {
                dVar.b();
                dVar.e();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.studio.editor.moudle.editormain.ui.i
    public final void onCreate(@Nullable Bundle bundle) {
        View decorView;
        if (bundle != null) {
            bundle.remove("android:support:fragments");
            Bundle bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            if (bundle2 != null) {
                bundle2.remove("android:support:fragments");
            }
        }
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.setSystemUiVisibility(4102);
        }
        WindowInfoTracker.f53317a.getClass();
        this.f106281U = WindowInfoTracker.Companion.a(this);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getMain(), (CoroutineStart) null, new BiliEditorMainActivity$registerWindowLayoutListener$1(this, null), 2, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.studio.editor.moudle.editormain.ui.i
    public final void onDestroy() {
        super.onDestroy();
        dz0.c cVar = ((Yv0.b) this).B;
        if (cVar != null) {
            Ky0.j0 j0Var = cVar.e.g;
            j0Var.f13136a.getClass();
            if (zw0.b.q() ? j0Var.f13139d : false) {
                sendBroadcast(new Intent("finish_question_web_act_action"));
            }
        }
        if (EntryPointKt.getMemleakOptEnable()) {
            a.a aVar = this.f106279S;
            if (aVar != null) {
                aVar.a();
            }
            this.f106279S = null;
            a.a aVar2 = this.f106280T;
            if (aVar2 != null) {
                aVar2.a();
            }
            this.f106280T = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onMultiWindowModeChanged(boolean z6, @NotNull Configuration configuration) {
        super/*androidx.activity.ComponentActivity*/.onMultiWindowModeChanged(z6, configuration);
        dz0.c cVar = ((Yv0.b) this).B;
        if (cVar != null) {
            Wy0.d dVar = cVar.e.s;
            dVar.f27449j = z6;
            if (z6) {
                return;
            }
            MutableLiveData mutableLiveData = dVar.f27446f.m;
            mutableLiveData.setValue(new Ey0.a(false, 0, null));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onPause() {
        super/*androidx.fragment.app.FragmentActivity*/.onPause();
        this.f106283W = true;
        dz0.c cVar = ((Yv0.b) this).B;
        if (cVar != null) {
            cVar.d.a.j();
        }
        T t7 = this.f106277Q;
        if (t7 != null) {
            Fragment fragmentFindFragmentByTag = t7.f1156b.findFragmentByTag("BiliMainEditorRecordFragment");
            BiliMainEditorRecordFragment biliMainEditorRecordFragment = fragmentFindFragmentByTag instanceof BiliMainEditorRecordFragment ? (BiliMainEditorRecordFragment) fragmentFindFragmentByTag : null;
            if (biliMainEditorRecordFragment != null) {
                sy0.a aVarKf = biliMainEditorRecordFragment.kf();
                ((ArrayList) aVarKf.k).clear();
                aVarKf.M0();
                sy0.b bVar = aVarKf.m;
                if (bVar != null) {
                    bVar.cancel();
                }
                biliMainEditorRecordFragment.kf().f.b(biliMainEditorRecordFragment, "EditorRecordViewModel");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onPostCreate(@Nullable Bundle bundle) {
        super/*com.bilibili.lib.ui.BaseAppCompatActivity*/.onPostCreate(bundle);
        removeShade();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    public final void onRequestPermissionsResult(int i7, @NotNull String[] strArr, @NotNull int[] iArr) throws NoWhenBranchMatchedException, IOException {
        super/*com.bilibili.lib.ui.BaseAppCompatActivity*/.onRequestPermissionsResult(i7, strArr, iArr);
        final IM.c cVar = new IM.c(this, 3);
        this.f106269I.getClass();
        if (i7 == 17) {
            boolean z6 = true;
            for (int i8 : iArr) {
                z6 = z6 && i8 == 0;
            }
            if (!z6) {
                new AlertDialog.Builder(this).setCancelable(false).setMessage(Build.VERSION.SDK_INT >= 33 ? 2131842407 : 2131842431).setPositiveButton(2131842452, new DialogInterface.OnClickListener(cVar) { // from class: By0.g1

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final IM.c f1242a;

                    {
                        this.f1242a = cVar;
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i9) {
                        IM.c cVar2 = this.f1242a;
                        dialogInterface.dismiss();
                        cVar2.invoke();
                    }
                }).show();
            } else {
                Y6(null);
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onResume() {
        /*
            Method dump skipped, instruction units count: 418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.BiliEditorMainActivity.onResume():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onSaveInstanceState(@NotNull Bundle bundle) {
        Application application;
        super/*androidx.activity.ComponentActivity*/.onSaveInstanceState(bundle);
        this.f106270J.getClass();
        D d7 = G.b().f108864a;
        if (d7 != null) {
            bundle.putString("edit_customize", d7.getClass().getName());
        }
        dz0.c cVar = ((Yv0.b) this).B;
        if (cVar != null) {
            Ex0.c cVar2 = cVar.d.b;
            if (cVar2.f4806b != null && (application = BiliContext.application()) != null) {
                Lazy<com.bilibili.studio.videoeditor.common.intent.a> lazy = com.bilibili.studio.videoeditor.common.intent.a.f109426c;
                a.C1206a.a().c(application, "pref_key_VideoEditActivity_save_state", cVar2.f4806b);
            }
            cVar.d.a.getClass();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onWindowFocusChanged(boolean z6) {
        View decorView;
        super/*android.app.Activity*/.onWindowFocusChanged(z6);
        Window window = getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        decorView.setSystemUiVisibility(4102);
    }
}
