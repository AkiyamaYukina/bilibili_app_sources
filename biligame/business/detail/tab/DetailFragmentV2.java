package com.bilibili.biligame.business.detail.tab;

import Ir.d;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.C3246j;
import androidx.compose.animation.core.C3337p;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import com.bilibili.biligame.api.BiligameApiResponse;
import com.bilibili.biligame.api.BiligameApiService;
import com.bilibili.biligame.api.BiligameMainGame;
import com.bilibili.biligame.api.BiligameTag;
import com.bilibili.biligame.api.BookAward;
import com.bilibili.biligame.api.NoticeInfo;
import com.bilibili.biligame.api.bean.BiligameVideoInfo;
import com.bilibili.biligame.api.bean.gamedetail.GameDetailApiService;
import com.bilibili.biligame.api.bean.gamedetail.GameDetailContent;
import com.bilibili.biligame.api.bean.gamedetail.GameDetailInfo;
import com.bilibili.biligame.api.bean.gamedetail.GameForumHotPosts;
import com.bilibili.biligame.api.bean.gamedetail.GameOfficialAccount;
import com.bilibili.biligame.api.bean.gamedetail.GamePlatformGrade;
import com.bilibili.biligame.api.bean.gamedetail.GameRole;
import com.bilibili.biligame.api.bean.gamedetail.GameTestRecruitInfo;
import com.bilibili.biligame.api.bean.gamedetail.RecommendComment;
import com.bilibili.biligame.api.bean.gamedetail.SimpleGame;
import com.bilibili.biligame.api.bean.gamedetail.VideoPage;
import com.bilibili.biligame.api.call.BaseSafeApiCallback;
import com.bilibili.biligame.api.comment.CommentAttitude;
import com.bilibili.biligame.api.generator.GameServiceGenerator;
import com.bilibili.biligame.business.detail.tab.DetailFragmentV2;
import com.bilibili.biligame.business.detail.tab.a;
import com.bilibili.biligame.business.detail.tab.d;
import com.bilibili.biligame.helper.GameDialogHelper;
import com.bilibili.biligame.helper.o;
import com.bilibili.biligame.report.ReportExtra;
import com.bilibili.biligame.report3.ReporterV3;
import com.bilibili.biligame.router.BiligameRouterHelper;
import com.bilibili.biligame.ui.FragmentSelector;
import com.bilibili.biligame.ui.book.BookCallback;
import com.bilibili.biligame.ui.fragment.ScreenShotDialogFragment;
import com.bilibili.biligame.ui.gamedetail.GameDetailCallback;
import com.bilibili.biligame.ui.gamedetail.SourceFromEvent;
import com.bilibili.biligame.ui.gamedetail.widget.GameDetailData;
import com.bilibili.biligame.utils.CatchUtils;
import com.bilibili.biligame.utils.GameUtils;
import com.bilibili.biligame.utils.KotlinExtensionsKt;
import com.bilibili.biligame.utils.OnSafeClickListener;
import com.bilibili.biligame.utils.Utils;
import com.bilibili.biligame.utils.bus.GloBus;
import com.bilibili.biligame.web.JavaScriptParams;
import com.bilibili.biligame.widget.BaseSafeFragment;
import com.bilibili.biligame.widget.viewholder.IDataBinding;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.accounts.subscribe.Topic;
import com.bilibili.lib.biliid.api.BuvidHelper;
import com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment;
import com.bilibili.lib.theme.R$color;
import com.bilibili.okretro.BiliApiCallback;
import com.bilibili.okretro.call.BiliCall;
import com.bilibili.opd.app.bizcommon.context.provider.MallProviderParamsHelper;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.bilibili.upper.module.aistory.test.base.BaseAIStoryPageFragment;
import com.squareup.otto.Subscribe;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tv.danmaku.bili.widget.section.adapter.BaseAdapter;
import tv.danmaku.bili.widget.section.adapter.BaseSectionAdapter;
import tv.danmaku.bili.widget.section.holder.BaseViewHolder;
import wo.C8902a;
import wo.C8904c;
import wo.D;
import wo.l;
import wo.u;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/detail/tab/DetailFragmentV2.class */
public class DetailFragmentV2 extends BaseSafeFragment implements BaseAdapter.HandleClickListener, FragmentSelector, IDataBinding<GameDetailData>, BookCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f62508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.bilibili.biligame.business.detail.tab.a f62509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public GameDetailData f62510d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public GameDetailApiService f62511e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public RecyclerView f62512f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public z f62513g;
    public GameDetailCallback h;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f62524s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f62525t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public JSONObject f62526u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public AtomicInteger f62527v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public to.f f62528w;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f62514i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f62515j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f62516k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f62517l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f62518m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f62519n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f62520o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f62521p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f62522q = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f62523r = -1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f62529x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f62530y = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f62531z = false;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/detail/tab/DetailFragmentV2$a.class */
    public final class a extends OnSafeClickListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DetailFragmentV2 f62532c;

        public a(DetailFragmentV2 detailFragmentV2) {
            this.f62532c = detailFragmentV2;
        }

        public final void onSafeClick(View view) {
            super.onSafeClick(view);
            GameDetailCallback gameDetailCallback = this.f62532c.h;
            if (gameDetailCallback != null) {
                gameDetailCallback.onGameCenter();
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/detail/tab/DetailFragmentV2$b.class */
    public final class b extends OnSafeClickListener {
        public final void onSafeClick(View view) {
            super.onSafeClick(view);
            GameOfficialAccount gameOfficialAccount = (GameOfficialAccount) Utils.cast(view.getTag());
            if (gameOfficialAccount != null && gameOfficialAccount.mid > 0) {
                GloBus.get().post(new SourceFromEvent());
                BiligameRouterHelper.openGameUserCenter(view.getContext(), gameOfficialAccount.mid);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/detail/tab/DetailFragmentV2$c.class */
    public final class c extends OnSafeClickListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DetailFragmentV2 f62533c;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/detail/tab/DetailFragmentV2$c$a.class */
        public final class a extends BaseSafeApiCallback<BiligameApiResponse<JSONObject>> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f62534b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final GameOfficialAccount f62535c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final c f62536d;

            public a(c cVar, int i7, GameOfficialAccount gameOfficialAccount) {
                this.f62536d = cVar;
                this.f62534b = i7;
                this.f62535c = gameOfficialAccount;
            }

            @Override // com.bilibili.biligame.api.call.BaseSafeApiCallback
            public final void onErrorSafe(Throwable th) {
                c cVar = this.f62536d;
                if (cVar.f62533c.isAdded()) {
                    ToastHelper.showToastShort(cVar.f62533c.getContext(), 2131823617);
                }
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [androidx.fragment.app.Fragment, com.bilibili.biligame.business.detail.tab.DetailFragmentV2, com.bilibili.lib.ui.BaseFragment] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.bilibili.biligame.api.call.BaseSafeApiCallback
            public final void onSuccessSafe(BiligameApiResponse<JSONObject> biligameApiResponse) {
                String string;
                BiligameApiResponse<JSONObject> biligameApiResponse2 = biligameApiResponse;
                c cVar = this.f62536d;
                if (!cVar.f62533c.isAdded() || cVar.f62533c.f62509c == null || biligameApiResponse2 == null) {
                    return;
                }
                if (biligameApiResponse2.isSuccess()) {
                    GameOfficialAccount gameOfficialAccount = this.f62535c;
                    if (this.f62534b == 1) {
                        gameOfficialAccount.followed = true;
                    } else {
                        gameOfficialAccount.followed = false;
                    }
                    d.d dVar = cVar.f62533c.f62509c;
                    BaseSectionAdapter.Section sectionFromType = dVar.getSectionFromType(7);
                    if (sectionFromType != null) {
                        dVar.notifyItemChanged(sectionFromType.start, "follow");
                        return;
                    }
                    return;
                }
                final ?? r02 = cVar.f62533c;
                int i7 = biligameApiResponse2.code;
                if (i7 == -626) {
                    string = r02.getString(2131823148);
                } else if (i7 == -503) {
                    string = r02.getString(2131823147);
                } else if (i7 == -500) {
                    string = r02.getString(2131823146);
                } else if (i7 == -400) {
                    string = r02.getString(2131823144);
                } else if (i7 == -102) {
                    string = r02.getString(2131823136);
                } else if (i7 != 22009) {
                    switch (i7) {
                        case 22001:
                            string = r02.getString(2131823150);
                            break;
                        case BiligameApiResponse.CODE_BLOCKED /* 22002 */:
                            string = r02.getString(2131823153);
                            break;
                        case BiligameApiResponse.CODE_BLOCK /* 22003 */:
                            string = r02.getString(2131823162);
                            break;
                        case 22004:
                            string = r02.getString(2131823165);
                            break;
                        case 22005:
                            string = r02.getString(2131823137);
                            break;
                        case 22006:
                            if (r02.p3() == null || r02.activityDie()) {
                                return;
                            }
                            View viewInflate = LayoutInflater.from(r02.p3()).inflate(2131496788, (ViewGroup) null, false);
                            viewInflate.findViewById(2131316242).setBackground(KotlinExtensionsKt.tint(2131232943, r02.getContext(), R$color.f64616Wh0));
                            final AlertDialog alertDialogCreate = new AlertDialog.Builder(r02.p3(), 2131886643).setView(viewInflate).create();
                            viewInflate.findViewById(2131297705).setOnClickListener(new View.OnClickListener(r02, alertDialogCreate) { // from class: vo.f

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final DetailFragmentV2 f128321a;

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final AlertDialog f128322b;

                                {
                                    this.f128321a = r02;
                                    this.f128322b = alertDialogCreate;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    IDataBinding iDataBinding = this.f128321a;
                                    AlertDialog alertDialog = this.f128322b;
                                    iDataBinding.getClass();
                                    alertDialog.dismiss();
                                    BiligameRouterHelper.openUrl(iDataBinding.p3(), "https://account.bilibili.com/answer/base");
                                }
                            });
                            viewInflate.findViewById(2131297706).setOnClickListener(new View.OnClickListener(r02, alertDialogCreate) { // from class: vo.g

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final DetailFragmentV2 f128323a;

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final AlertDialog f128324b;

                                {
                                    this.f128323a = r02;
                                    this.f128324b = alertDialogCreate;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    IDataBinding iDataBinding = this.f128323a;
                                    AlertDialog alertDialog = this.f128324b;
                                    iDataBinding.getClass();
                                    alertDialog.dismiss();
                                    BiligameRouterHelper.openUrl(iDataBinding.p3(), "https://passport.bilibili.com/mobile/index.html");
                                }
                            });
                            final int i8 = 1;
                            viewInflate.findViewById(2131304180).setOnClickListener(new View.OnClickListener(alertDialogCreate, i8) { // from class: HF0.q

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final int f8383a;

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final Object f8384b;

                                {
                                    this.f8383a = i8;
                                    this.f8384b = alertDialogCreate;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (this.f8383a) {
                                        case 0:
                                            BaseAIStoryPageFragment baseAIStoryPageFragment = (BaseAIStoryPageFragment) this.f8384b;
                                            if (!Intrinsics.areEqual(baseAIStoryPageFragment.qf().x, baseAIStoryPageFragment.e)) {
                                                baseAIStoryPageFragment.nf();
                                            }
                                            baseAIStoryPageFragment.Df(baseAIStoryPageFragment.e);
                                            baseAIStoryPageFragment.zf(baseAIStoryPageFragment.e);
                                            break;
                                        default:
                                            ((AlertDialog) this.f8384b).dismiss();
                                            break;
                                    }
                                }
                            });
                            alertDialogCreate.show();
                            return;
                        default:
                            string = r02.getString(2131823590);
                            break;
                    }
                } else {
                    string = r02.getString(2131823140);
                }
                ToastHelper.showToastShort(r02.getContext(), string);
            }
        }

        public c(DetailFragmentV2 detailFragmentV2) {
            this.f62533c = detailFragmentV2;
        }

        public final void onSafeClick(View view) {
            super.onSafeClick(view);
            GameOfficialAccount gameOfficialAccount = (GameOfficialAccount) Utils.cast(view.getTag());
            if (gameOfficialAccount == null) {
                return;
            }
            if (!C3337p.c(view)) {
                BiligameRouterHelper.login(this.f62533c.getContext(), 100);
                return;
            }
            if (!ConnectivityMonitor.getInstance().isNetworkActive()) {
                ToastHelper.showToastShort(this.f62533c.getContext(), 2131823722);
                return;
            }
            int i7 = gameOfficialAccount.followed ? 2 : 1;
            o.a aVarB = com.bilibili.biligame.helper.o.b(this.f62533c);
            BiligameApiService biligameApiService = (BiligameApiService) GameServiceGenerator.createService(BiligameApiService.class);
            long j7 = gameOfficialAccount.mid;
            ReporterV3 reporterV3 = ReporterV3.INSTANCE;
            BiliCall<BiligameApiResponse<JSONObject>> biliCallModifyFollowStatus = biligameApiService.modifyFollowStatus(j7, i7, 142, reporterV3.getSCurrentSpmId(), reporterV3.getSSpmIdFrom(), "");
            aVarB.a(8, biliCallModifyFollowStatus);
            biliCallModifyFollowStatus.enqueue(new a(this, i7, gameOfficialAccount));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/detail/tab/DetailFragmentV2$d.class */
    public final class d extends OnSafeClickListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DetailFragmentV2 f62537c;

        public d(DetailFragmentV2 detailFragmentV2) {
            this.f62537c = detailFragmentV2;
        }

        public final void onSafeClick(View view) {
            super.onSafeClick(view);
            BiligameVideoInfo biligameVideoInfo = (BiligameVideoInfo) Utils.cast(view.getTag());
            if (biligameVideoInfo != null) {
                C3246j.a(GloBus.get());
                BiligameRouterHelper.openVideo(this.f62537c.getContext(), biligameVideoInfo.aid, biligameVideoInfo.bid, true);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/detail/tab/DetailFragmentV2$e.class */
    public final class e extends OnSafeClickListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DetailFragmentV2 f62538c;

        public e(DetailFragmentV2 detailFragmentV2) {
            this.f62538c = detailFragmentV2;
        }

        /* JADX WARN: Type inference failed for: r0v12, types: [androidx.fragment.app.Fragment, com.bilibili.biligame.business.detail.tab.DetailFragmentV2] */
        public final void onSafeClick(View view) {
            GameDetailContent gameDetailContent;
            super.onSafeClick(view);
            GameDetailData gameDetailData = this.f62538c.f62510d;
            if (gameDetailData == null || (gameDetailContent = gameDetailData.detail) == null) {
                return;
            }
            if (!TextUtils.isEmpty(gameDetailContent.mainGameBookLink)) {
                BiligameRouterHelper.openBookLink(this.f62538c.getContext(), this.f62538c.f62510d.detail.mainGameBookLink);
                return;
            }
            ?? r02 = this.f62538c;
            if (r02.f62510d.detail.mainGameBaseId > 0) {
                BiligameRouterHelper.openGameDetail(r02.getContext(), this.f62538c.f62510d.detail.mainGameBaseId);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/detail/tab/DetailFragmentV2$f.class */
    public final class f extends OnSafeClickListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DetailFragmentV2 f62539c;

        public f(DetailFragmentV2 detailFragmentV2) {
            this.f62539c = detailFragmentV2;
        }

        public final void onSafeClick(View view) {
            GameDetailContent gameDetailContent;
            super.onSafeClick(view);
            GameDetailData gameDetailData = this.f62539c.f62510d;
            if (gameDetailData == null || (gameDetailContent = gameDetailData.detail) == null || TextUtils.isEmpty(gameDetailContent.activityUrl)) {
                return;
            }
            BiligameRouterHelper.openUrl(this.f62539c.getContext(), this.f62539c.f62510d.detail.activityUrl);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/detail/tab/DetailFragmentV2$g.class */
    public final class g extends OnSafeClickListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DetailFragmentV2 f62540c;

        public g(DetailFragmentV2 detailFragmentV2) {
            this.f62540c = detailFragmentV2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.fragment.app.Fragment, com.bilibili.biligame.business.detail.tab.DetailFragmentV2] */
        public final void onSafeClick(View view) {
            super.onSafeClick(view);
            ?? r02 = this.f62540c;
            GameDetailData gameDetailData = r02.f62510d;
            if (gameDetailData == null || gameDetailData.detail == null) {
                return;
            }
            Context context = r02.getContext();
            String gameName = GameUtils.formatGameName(this.f62540c.f62510d.info);
            DetailFragmentV2 detailFragmentV2 = this.f62540c;
            BiligameRouterHelper.openGameDynamic(context, gameName, detailFragmentV2.f62509c.f62572q.mid, detailFragmentV2.f62508b);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/detail/tab/DetailFragmentV2$h.class */
    public final class h extends OnSafeClickListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DetailFragmentV2 f62541c;

        public h(DetailFragmentV2 detailFragmentV2) {
            this.f62541c = detailFragmentV2;
        }

        public final void onSafeClick(View view) {
            GameDetailContent gameDetailContent;
            if (view.getTag() instanceof GameDetailContent.ScreenShot) {
                GameDetailContent.ScreenShot screenShot = (GameDetailContent.ScreenShot) view.getTag();
                GameDetailData gameDetailData = this.f62541c.f62510d;
                if (gameDetailData == null || (gameDetailContent = gameDetailData.detail) == null || Utils.isEmpty(gameDetailContent.screenShotList)) {
                    return;
                }
                int iIndexOf = this.f62541c.f62510d.detail.screenShotList.indexOf(screenShot);
                DetailFragmentV2 detailFragmentV2 = this.f62541c;
                KotlinExtensionsKt.safeShow(ScreenShotDialogFragment.newInstance(detailFragmentV2.f62508b, detailFragmentV2.f62510d.detail.screenShotList, Math.max(iIndexOf, 0)), this.f62541c.getFragmentManager(), ScreenShotDialogFragment.class.getName());
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/detail/tab/DetailFragmentV2$i.class */
    public final class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DetailFragmentV2 f62542a;

        public i(DetailFragmentV2 detailFragmentV2) {
            this.f62542a = detailFragmentV2;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/detail/tab/DetailFragmentV2$j.class */
    public final class j extends BiliApiCallback<BiligameApiResponse<JSONObject>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DetailFragmentV2 f62543b;

        public j(DetailFragmentV2 detailFragmentV2) {
            this.f62543b = detailFragmentV2;
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final void onError(Throwable th) {
            DetailFragmentV2 detailFragmentV2 = this.f62543b;
            detailFragmentV2.f62529x = false;
            detailFragmentV2.f62530y = true;
            detailFragmentV2.f62531z = false;
            detailFragmentV2.uf(true);
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final void onSuccess(BiligameApiResponse<JSONObject> biligameApiResponse) {
            JSONObject jSONObject;
            BiligameApiResponse<JSONObject> biligameApiResponse2 = biligameApiResponse;
            DetailFragmentV2 detailFragmentV2 = this.f62543b;
            detailFragmentV2.f62529x = false;
            detailFragmentV2.f62530y = true;
            detailFragmentV2.f62531z = false;
            if (biligameApiResponse2 != null && (jSONObject = biligameApiResponse2.data) != null && jSONObject.getInteger("join").intValue() == 1) {
                detailFragmentV2.f62531z = true;
            }
            detailFragmentV2.uf(true);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/detail/tab/DetailFragmentV2$k.class */
    public final class k implements Function1<Topic, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DetailFragmentV2 f62544a;

        public k(DetailFragmentV2 detailFragmentV2) {
            this.f62544a = detailFragmentV2;
        }

        public final Object invoke(Object obj) {
            this.f62544a.rf(true);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/detail/tab/DetailFragmentV2$l.class */
    public final class l extends BaseSafeApiCallback<BiligameApiResponse<List<NoticeInfo>>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DetailFragmentV2 f62545b;

        public l(DetailFragmentV2 detailFragmentV2) {
            this.f62545b = detailFragmentV2;
        }

        @Override // com.bilibili.biligame.api.call.BaseSafeApiCallback
        public final void onErrorSafe(Throwable th) {
            DetailFragmentV2 detailFragmentV2 = this.f62545b;
            detailFragmentV2.mf();
            detailFragmentV2.f62520o = -1;
        }

        @Override // com.bilibili.biligame.api.call.BaseSafeApiCallback
        public final void onSuccessSafe(BiligameApiResponse<List<NoticeInfo>> biligameApiResponse) {
            BiligameApiResponse<List<NoticeInfo>> biligameApiResponse2 = biligameApiResponse;
            DetailFragmentV2 detailFragmentV2 = this.f62545b;
            detailFragmentV2.mf();
            if (biligameApiResponse2 != null && biligameApiResponse2.isSuccess()) {
                com.bilibili.biligame.business.detail.tab.a aVar = detailFragmentV2.f62509c;
                aVar.f62573r = biligameApiResponse2.data;
                aVar.notifySectionData();
                detailFragmentV2.f62520o = 1;
                return;
            }
            if (biligameApiResponse2 == null || !biligameApiResponse2.isNoData()) {
                detailFragmentV2.f62520o = -1;
                return;
            }
            com.bilibili.biligame.business.detail.tab.a aVar2 = detailFragmentV2.f62509c;
            aVar2.f62573r = null;
            aVar2.notifySectionData();
            detailFragmentV2.f62520o = 1;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/detail/tab/DetailFragmentV2$m.class */
    public final class m extends BaseSafeApiCallback<BiligameApiResponse<BookAward>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DetailFragmentV2 f62546b;

        public m(DetailFragmentV2 detailFragmentV2) {
            this.f62546b = detailFragmentV2;
        }

        @Override // com.bilibili.biligame.api.call.BaseSafeApiCallback
        public final void onErrorSafe(Throwable th) {
            DetailFragmentV2 detailFragmentV2 = this.f62546b;
            detailFragmentV2.mf();
            detailFragmentV2.f62522q = -1;
        }

        @Override // com.bilibili.biligame.api.call.BaseSafeApiCallback
        public final void onSuccessSafe(BiligameApiResponse<BookAward> biligameApiResponse) {
            BiligameApiResponse<BookAward> biligameApiResponse2 = biligameApiResponse;
            DetailFragmentV2 detailFragmentV2 = this.f62546b;
            detailFragmentV2.mf();
            if (biligameApiResponse2 != null && biligameApiResponse2.isSuccess()) {
                detailFragmentV2.f62509c.O(biligameApiResponse2.data);
                detailFragmentV2.f62522q = 1;
            } else if (biligameApiResponse2 == null || !biligameApiResponse2.isNoData()) {
                detailFragmentV2.f62522q = -1;
            } else {
                detailFragmentV2.f62509c.O(null);
                detailFragmentV2.f62522q = 1;
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/detail/tab/DetailFragmentV2$n.class */
    public final class n extends BaseSafeApiCallback<BiligameApiResponse<List<SimpleGame>>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DetailFragmentV2 f62547b;

        public n(DetailFragmentV2 detailFragmentV2) {
            this.f62547b = detailFragmentV2;
        }

        @Override // com.bilibili.biligame.api.call.BaseSafeApiCallback
        public final void onErrorSafe(Throwable th) {
            DetailFragmentV2 detailFragmentV2 = this.f62547b;
            detailFragmentV2.mf();
            detailFragmentV2.f62517l = -1;
        }

        @Override // com.bilibili.biligame.api.call.BaseSafeApiCallback
        public final void onSuccessSafe(BiligameApiResponse<List<SimpleGame>> biligameApiResponse) {
            BiligameApiResponse<List<SimpleGame>> biligameApiResponse2 = biligameApiResponse;
            DetailFragmentV2 detailFragmentV2 = this.f62547b;
            detailFragmentV2.mf();
            detailFragmentV2.f62517l = -1;
            if (detailFragmentV2.f62509c == null || biligameApiResponse2 == null) {
                return;
            }
            if (biligameApiResponse2.isSuccess()) {
                detailFragmentV2.f62517l = 1;
                com.bilibili.biligame.business.detail.tab.a aVar = detailFragmentV2.f62509c;
                aVar.f62565j = biligameApiResponse2.data;
                aVar.notifySectionData();
                return;
            }
            if (biligameApiResponse2.isNoData()) {
                detailFragmentV2.f62517l = 1;
                com.bilibili.biligame.business.detail.tab.a aVar2 = detailFragmentV2.f62509c;
                aVar2.f62565j = biligameApiResponse2.data;
                aVar2.notifySectionData();
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/detail/tab/DetailFragmentV2$o.class */
    public final class o extends BaseSafeApiCallback<BiligameApiResponse<List<GameRole>>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DetailFragmentV2 f62548b;

        public o(DetailFragmentV2 detailFragmentV2) {
            this.f62548b = detailFragmentV2;
        }

        @Override // com.bilibili.biligame.api.call.BaseSafeApiCallback
        public final void onErrorSafe(Throwable th) {
            DetailFragmentV2 detailFragmentV2 = this.f62548b;
            detailFragmentV2.mf();
            detailFragmentV2.f62515j = -1;
        }

        @Override // com.bilibili.biligame.api.call.BaseSafeApiCallback
        public final void onSuccessSafe(BiligameApiResponse<List<GameRole>> biligameApiResponse) {
            BiligameApiResponse<List<GameRole>> biligameApiResponse2 = biligameApiResponse;
            DetailFragmentV2 detailFragmentV2 = this.f62548b;
            detailFragmentV2.mf();
            detailFragmentV2.f62515j = -1;
            if (detailFragmentV2.f62509c == null || biligameApiResponse2 == null) {
                return;
            }
            if (biligameApiResponse2.isSuccess()) {
                detailFragmentV2.f62515j = 1;
                com.bilibili.biligame.business.detail.tab.a aVar = detailFragmentV2.f62509c;
                aVar.f62567l = biligameApiResponse2.data;
                aVar.notifySectionData();
                return;
            }
            if (biligameApiResponse2.isNoData()) {
                detailFragmentV2.f62515j = 1;
                com.bilibili.biligame.business.detail.tab.a aVar2 = detailFragmentV2.f62509c;
                aVar2.f62567l = biligameApiResponse2.data;
                aVar2.notifySectionData();
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/detail/tab/DetailFragmentV2$p.class */
    public final class p extends BaseSafeApiCallback<BiligameApiResponse<GameOfficialAccount>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DetailFragmentV2 f62549b;

        public p(DetailFragmentV2 detailFragmentV2) {
            this.f62549b = detailFragmentV2;
        }

        @Override // com.bilibili.biligame.api.call.BaseSafeApiCallback
        public final void onErrorSafe(Throwable th) {
            DetailFragmentV2 detailFragmentV2 = this.f62549b;
            detailFragmentV2.mf();
            detailFragmentV2.f62519n = 1;
        }

        @Override // com.bilibili.biligame.api.call.BaseSafeApiCallback
        public final void onSuccessSafe(BiligameApiResponse<GameOfficialAccount> biligameApiResponse) {
            GameOfficialAccount gameOfficialAccount;
            BiligameApiResponse<GameOfficialAccount> biligameApiResponse2 = biligameApiResponse;
            DetailFragmentV2 detailFragmentV2 = this.f62549b;
            detailFragmentV2.mf();
            detailFragmentV2.f62519n = -1;
            if (detailFragmentV2.f62509c == null || biligameApiResponse2 == null || !biligameApiResponse2.isSuccess() || (gameOfficialAccount = biligameApiResponse2.data) == null) {
                return;
            }
            GameOfficialAccount gameOfficialAccount2 = gameOfficialAccount;
            detailFragmentV2.f62514i = gameOfficialAccount2.mid;
            com.bilibili.biligame.business.detail.tab.a aVar = detailFragmentV2.f62509c;
            aVar.f62570o = gameOfficialAccount2;
            aVar.notifySectionData();
            detailFragmentV2.f62519n = 1;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/detail/tab/DetailFragmentV2$q.class */
    public final class q extends BaseSafeApiCallback<BiligameApiResponse<List<RecommendComment>>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DetailFragmentV2 f62550b;

        public q(DetailFragmentV2 detailFragmentV2) {
            this.f62550b = detailFragmentV2;
        }

        @Override // com.bilibili.biligame.api.call.BaseSafeApiCallback
        public final void onErrorSafe(Throwable th) {
            DetailFragmentV2 detailFragmentV2 = this.f62550b;
            detailFragmentV2.mf();
            detailFragmentV2.f62516k = -1;
        }

        @Override // com.bilibili.biligame.api.call.BaseSafeApiCallback
        public final void onSuccessSafe(BiligameApiResponse<List<RecommendComment>> biligameApiResponse) {
            BiligameApiResponse<List<RecommendComment>> biligameApiResponse2 = biligameApiResponse;
            DetailFragmentV2 detailFragmentV2 = this.f62550b;
            detailFragmentV2.mf();
            detailFragmentV2.f62516k = -1;
            if (detailFragmentV2.f62509c == null || biligameApiResponse2 == null) {
                return;
            }
            if (biligameApiResponse2.isSuccess()) {
                detailFragmentV2.f62516k = 1;
                com.bilibili.biligame.business.detail.tab.a aVar = detailFragmentV2.f62509c;
                aVar.f62568m = biligameApiResponse2.data;
                aVar.notifySectionData();
                return;
            }
            if (biligameApiResponse2.isNoData()) {
                detailFragmentV2.f62516k = 1;
                com.bilibili.biligame.business.detail.tab.a aVar2 = detailFragmentV2.f62509c;
                aVar2.f62568m = biligameApiResponse2.data;
                aVar2.notifySectionData();
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/detail/tab/DetailFragmentV2$r.class */
    public final class r extends OnSafeClickListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DetailFragmentV2 f62551c;

        public r(DetailFragmentV2 detailFragmentV2) {
            this.f62551c = detailFragmentV2;
        }

        public final void onSafeClick(View view) {
            super.onSafeClick(view);
            if (view.getTag() instanceof NoticeInfo) {
                NoticeInfo noticeInfo = (NoticeInfo) view.getTag();
                if (noticeInfo.type == 1) {
                    C3246j.a(GloBus.get());
                    BiligameRouterHelper.openGiftAll(this.f62551c.getContext(), String.valueOf(this.f62551c.f62508b));
                } else {
                    C3246j.a(GloBus.get());
                    BiligameRouterHelper.openUrl(this.f62551c.getContext(), noticeInfo.url);
                }
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/detail/tab/DetailFragmentV2$s.class */
    public final class s extends BaseSafeApiCallback<BiligameApiResponse<VideoPage>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DetailFragmentV2 f62552b;

        public s(DetailFragmentV2 detailFragmentV2) {
            this.f62552b = detailFragmentV2;
        }

        @Override // com.bilibili.biligame.api.call.BaseSafeApiCallback
        public final void onErrorSafe(Throwable th) {
            DetailFragmentV2 detailFragmentV2 = this.f62552b;
            detailFragmentV2.mf();
            detailFragmentV2.f62521p = -1;
        }

        @Override // com.bilibili.biligame.api.call.BaseSafeApiCallback
        public final void onSuccessSafe(BiligameApiResponse<VideoPage> biligameApiResponse) {
            BiligameApiResponse<VideoPage> biligameApiResponse2 = biligameApiResponse;
            DetailFragmentV2 detailFragmentV2 = this.f62552b;
            detailFragmentV2.mf();
            if (biligameApiResponse2 != null) {
                if (biligameApiResponse2.isSuccess()) {
                    detailFragmentV2.f62521p = 1;
                    com.bilibili.biligame.business.detail.tab.a aVar = detailFragmentV2.f62509c;
                    aVar.f62569n = biligameApiResponse2.data;
                    aVar.notifySectionData();
                    return;
                }
                if (biligameApiResponse2.isNoData()) {
                    detailFragmentV2.f62521p = 1;
                    com.bilibili.biligame.business.detail.tab.a aVar2 = detailFragmentV2.f62509c;
                    aVar2.f62569n = null;
                    aVar2.notifySectionData();
                    return;
                }
            }
            detailFragmentV2.f62521p = -1;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/detail/tab/DetailFragmentV2$t.class */
    public final class t extends OnSafeClickListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final u.b f62553c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DetailFragmentV2 f62554d;

        public t(DetailFragmentV2 detailFragmentV2, u.b bVar) {
            this.f62554d = detailFragmentV2;
            this.f62553c = bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onSafeClick(android.view.View r7) {
            /*
                r6 = this;
                r0 = r6
                r1 = r7
                super.onSafeClick(r1)
                r0 = r6
                com.bilibili.biligame.business.detail.tab.DetailFragmentV2 r0 = r0.f62554d
                androidx.fragment.app.FragmentManager r0 = r0.getChildFragmentManager()
                r7 = r0
                r0 = r7
                if (r0 == 0) goto L9f
                r0 = r7
                boolean r0 = r0.isStateSaved()
                if (r0 != 0) goto L9f
                r0 = r7
                boolean r0 = r0.isDestroyed()
                if (r0 != 0) goto L9f
                r0 = r6
                com.bilibili.biligame.business.detail.tab.DetailFragmentV2 r0 = r0.f62554d
                com.bilibili.biligame.ui.gamedetail.widget.GameDetailData r0 = r0.f62510d
                r7 = r0
                r0 = r7
                if (r0 == 0) goto L3c
                r0 = r7
                com.bilibili.biligame.api.bean.gamedetail.GameDetailInfo r0 = r0.info
                r7 = r0
                r0 = r7
                if (r0 == 0) goto L3c
                r0 = r7
                java.lang.String r0 = r0.title
                r8 = r0
                goto L3f
            L3c:
                java.lang.String r0 = ""
                r8 = r0
            L3f:
                r0 = r6
                wo.u$b r0 = r0.f62553c
                tv.danmaku.bili.widget.section.adapter.BaseAdapter r0 = r0.getAdapter()
                r7 = r0
                r0 = r7
                if (r0 == 0) goto L79
                r0 = r7
                boolean r0 = r0 instanceof wo.u.a
                if (r0 == 0) goto L79
                r0 = r7
                wo.u$a r0 = (wo.u.a) r0
                java.util.List r0 = r0.getList()
                r7 = r0
                r0 = r7
                boolean r0 = r0 instanceof java.util.ArrayList
                if (r0 == 0) goto L69
                r0 = r7
                java.util.ArrayList r0 = (java.util.ArrayList) r0
                r7 = r0
                goto L82
            L69:
                r0 = r7
                if (r0 == 0) goto L79
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = r0
                r2 = r7
                r1.<init>(r2)
                r7 = r0
                goto L82
            L79:
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = r0
                r2 = 0
                r1.<init>(r2)
                r7 = r0
            L82:
                r0 = r8
                r1 = r7
                r2 = r6
                wo.u$b r2 = r2.f62553c
                int r2 = r2.getAdapterPosition()
                r3 = 0
                r4 = 0
                com.bilibili.biligame.ui.fragment.RoleDialogFragment r0 = com.bilibili.biligame.ui.fragment.RoleDialogFragment.newInstance(r0, r1, r2, r3, r4)
                r1 = r6
                com.bilibili.biligame.business.detail.tab.DetailFragmentV2 r1 = r1.f62554d
                androidx.fragment.app.FragmentManager r1 = r1.getChildFragmentManager()
                java.lang.Class<com.bilibili.biligame.ui.fragment.RoleDialogFragment> r2 = com.bilibili.biligame.ui.fragment.RoleDialogFragment.class
                java.lang.String r2 = r2.getName()
                r0.show(r1, r2)
            L9f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.biligame.business.detail.tab.DetailFragmentV2.t.onSafeClick(android.view.View):void");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/detail/tab/DetailFragmentV2$u.class */
    public final class u extends OnSafeClickListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final BaseViewHolder f62555c;

        public u(BaseViewHolder baseViewHolder) {
            this.f62555c = baseViewHolder;
        }

        public final void onSafeClick(View view) {
            SimpleGame simpleGame;
            super.onSafeClick(view);
            int i7 = 66019;
            if (this.f62555c.getItemViewType() == 12) {
                BiligameMainGame biligameMainGame = (BiligameMainGame) Utils.cast(view.getTag());
                if (biligameMainGame != null) {
                    C3246j.a(GloBus.get());
                    if (GameUtils.isSmallGame(biligameMainGame.source)) {
                        Context context = view.getContext();
                        int i8 = biligameMainGame.gameBaseId;
                        String str = biligameMainGame.smallGameLink;
                        if (this.f62555c.getItemViewType() == 12) {
                            i7 = 66020;
                        }
                        BiligameRouterHelper.openSmallGame(context, i8, str, i7);
                        return;
                    }
                    if (GameUtils.isOpenWiki(biligameMainGame.source, biligameMainGame.androidGameStatus)) {
                        BiligameRouterHelper.openWikiPage(view.getContext(), biligameMainGame.protocolLink);
                        return;
                    } else if (GameUtils.isBookSkipGame(biligameMainGame.androidGameStatus, biligameMainGame.androidBookLink)) {
                        BiligameRouterHelper.openBookLink(view.getContext(), biligameMainGame.androidBookLink);
                        return;
                    } else {
                        BiligameRouterHelper.openGameDetail(view.getContext(), biligameMainGame.gameBaseId);
                        return;
                    }
                }
                return;
            }
            if (this.f62555c.getItemViewType() != 11 || (simpleGame = (SimpleGame) Utils.cast(view.getTag())) == null) {
                return;
            }
            C3246j.a(GloBus.get());
            if (GameUtils.isSmallGame(simpleGame.source)) {
                Context context2 = view.getContext();
                int i9 = simpleGame.gameBaseId;
                String str2 = simpleGame.smallGameLink;
                if (this.f62555c.getItemViewType() == 12) {
                    i7 = 66020;
                }
                BiligameRouterHelper.openSmallGame(context2, i9, str2, i7);
                return;
            }
            if (GameUtils.isOpenWiki(simpleGame.source, simpleGame.gameStatus)) {
                BiligameRouterHelper.openWikiPage(view.getContext(), simpleGame.protocolLink);
            } else if (GameUtils.isBookSkipGame(simpleGame.gameStatus, simpleGame.bookLink)) {
                BiligameRouterHelper.openBookLink(view.getContext(), simpleGame.bookLink);
            } else {
                BiligameRouterHelper.openGameDetail(view.getContext(), simpleGame.gameBaseId);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/detail/tab/DetailFragmentV2$v.class */
    public final class v extends OnSafeClickListener {
        public final void onSafeClick(View view) {
            super.onSafeClick(view);
            l.a aVar = (l.a) Utils.cast(view.getTag());
            if (aVar != null) {
                Context context = view.getContext();
                BiligameTag biligameTag = aVar.f128837a;
                BiligameRouterHelper.openTagGameList(context, String.valueOf(biligameTag.tagid), biligameTag.name);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/detail/tab/DetailFragmentV2$w.class */
    public final class w extends OnSafeClickListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DetailFragmentV2 f62556c;

        public w(DetailFragmentV2 detailFragmentV2) {
            this.f62556c = detailFragmentV2;
        }

        public final void onSafeClick(View view) {
            super.onSafeClick(view);
            DetailFragmentV2 detailFragmentV2 = this.f62556c;
            z zVar = detailFragmentV2.f62513g;
            if (zVar != null) {
                zVar.b();
                return;
            }
            GameDetailCallback gameDetailCallback = detailFragmentV2.h;
            if (gameDetailCallback != null) {
                gameDetailCallback.onTabSwitch(1);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/detail/tab/DetailFragmentV2$x.class */
    public final class x extends OnSafeClickListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DetailFragmentV2 f62557c;

        public x(DetailFragmentV2 detailFragmentV2) {
            this.f62557c = detailFragmentV2;
        }

        public final void onSafeClick(View view) {
            super.onSafeClick(view);
            DetailFragmentV2 detailFragmentV2 = this.f62557c;
            z zVar = detailFragmentV2.f62513g;
            if (zVar != null) {
                zVar.b();
                return;
            }
            GameDetailCallback gameDetailCallback = detailFragmentV2.h;
            if (gameDetailCallback != null) {
                gameDetailCallback.onTabSwitch(1);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/detail/tab/DetailFragmentV2$y.class */
    public final class y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RecommendComment f62558a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f62559b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DetailFragmentV2 f62560c;

        /* JADX WARN: Multi-variable type inference failed */
        public y(DetailFragmentV2 detailFragmentV2, BaseViewHolder baseViewHolder) {
            this.f62560c = detailFragmentV2;
            this.f62558a = (RecommendComment) Utils.cast(baseViewHolder.itemView.getTag());
            this.f62559b = BiliAccounts.get(detailFragmentV2.getContext()).mid();
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.fragment.app.Fragment, com.bilibili.biligame.business.detail.tab.DetailFragmentV2] */
        public final void a(RecommendComment recommendComment) {
            C3246j.a(GloBus.get());
            ?? r02 = this.f62560c;
            Context context = r02.getContext();
            int i7 = recommendComment.gameBaseId;
            String str = r02.f62510d.info.title;
            String str2 = recommendComment.commentNo;
            Boolean bool = Boolean.FALSE;
            BiligameRouterHelper.openCommentDetail(context, String.valueOf(i7), str, str2, bool, r02.f62525t, bool, bool, Boolean.valueOf(this.f62559b == recommendComment.uid), (String) null, (ArrayList) null);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.fragment.app.Fragment, com.bilibili.biligame.business.detail.tab.DetailFragmentV2, com.bilibili.lib.ui.BaseFragment, java.lang.Object] */
        public final void b(RecommendComment recommendComment) {
            ?? r02 = this.f62560c;
            if (recommendComment == null) {
                r02.getClass();
                return;
            }
            long jMid = BiliAccounts.get(r02.getApplicationContext()).mid();
            HashMap map = new HashMap();
            map.put("game_base_id", String.valueOf(r02.f62508b));
            map.put("commentno", recommendComment.commentNo);
            map.put(EditCustomizeSticker.TAG_MID, String.valueOf(recommendComment.uid));
            map.put(MallProviderParamsHelper.ActiveProviderParams.URI_QUERY_PAGE, "game-comment-page");
            GameDialogHelper.showCommentDialog(r02.p3(), jMid > 0 && jMid == recommendComment.uid, recommendComment, map, new vo.i(r02, recommendComment));
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.fragment.app.Fragment, com.bilibili.biligame.business.detail.tab.DetailFragmentV2] */
        public final void c(RecommendComment recommendComment) {
            C3246j.a(GloBus.get());
            ?? r02 = this.f62560c;
            Context context = r02.getContext();
            int i7 = recommendComment.gameBaseId;
            String str = r02.f62510d.info.title;
            String str2 = recommendComment.commentNo;
            Boolean bool = Boolean.FALSE;
            BiligameRouterHelper.openCommentDetail(context, String.valueOf(i7), str, str2, bool, r02.f62525t, bool, Boolean.TRUE, Boolean.valueOf(this.f62559b == recommendComment.uid), (String) null, (ArrayList) null);
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.fragment.app.Fragment, com.bilibili.biligame.business.detail.tab.DetailFragmentV2] */
        public final void d(RecommendComment recommendComment) {
            C3246j.a(GloBus.get());
            ?? r02 = this.f62560c;
            Context context = r02.getContext();
            int i7 = recommendComment.gameBaseId;
            String str = r02.f62510d.info.title;
            String str2 = recommendComment.commentNo;
            Boolean bool = Boolean.FALSE;
            BiligameRouterHelper.openCommentDetail(context, String.valueOf(i7), str, str2, bool, r02.f62525t, Boolean.TRUE, bool, Boolean.valueOf(this.f62559b == recommendComment.uid), (String) null, (ArrayList) null);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/detail/tab/DetailFragmentV2$z.class */
    public interface z {
        void a();

        void b();
    }

    public static void jf(DetailFragmentV2 detailFragmentV2, RecommendComment recommendComment, int i7) {
        detailFragmentV2.getClass();
        o.a aVarB = com.bilibili.biligame.helper.o.b(detailFragmentV2);
        BiliCall<BiligameApiResponse<CommentAttitude>> biliCallModifyCommentEvaluateStatus = ((BiligameApiService) GameServiceGenerator.createService(BiligameApiService.class)).modifyCommentEvaluateStatus(recommendComment.gameBaseId, recommendComment.commentNo, i7, recommendComment.uid);
        aVarB.a(5, biliCallModifyCommentEvaluateStatus);
        biliCallModifyCommentEvaluateStatus.enqueue(new vo.h(detailFragmentV2, recommendComment, i7));
    }

    public final void bind(Object obj) {
        GameTestRecruitInfo gameTestRecruitInfo;
        GameDetailData gameDetailData = (GameDetailData) obj;
        if (gameDetailData == null || this.f62509c == null) {
            return;
        }
        this.f62510d = gameDetailData;
        uf(false);
        this.f62509c.P(gameDetailData.info, gameDetailData.detail);
        GameDetailInfo gameDetailInfo = gameDetailData.info;
        if (gameDetailInfo == null || (gameTestRecruitInfo = gameDetailInfo.gameTestRecruitInfo) == null) {
            return;
        }
        kf(gameTestRecruitInfo.getRecruitQuestionnaireId());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v124, types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, wo.u$b] */
    /* JADX WARN: Type inference failed for: r0v50, types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, wo.g] */
    public final void handleClick(final BaseViewHolder baseViewHolder) {
        if (baseViewHolder instanceof wo.v) {
            ((wo.v) baseViewHolder).f128871k = new r(this);
            return;
        }
        if (baseViewHolder instanceof u.b) {
            ?? r02 = (u.b) baseViewHolder;
            r02.itemView.setOnClickListener(new t(this, r02));
            return;
        }
        if (baseViewHolder instanceof wo.j) {
            ((wo.j) baseViewHolder).setOnMoreListener(new View.OnClickListener(this, baseViewHolder) { // from class: vo.e

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final DetailFragmentV2 f128319a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final BaseViewHolder f128320b;

                {
                    this.f128319a = this;
                    this.f128320b = baseViewHolder;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DetailFragmentV2 detailFragmentV2 = this.f128319a;
                    BaseViewHolder baseViewHolder2 = this.f128320b;
                    detailFragmentV2.getClass();
                    if (baseViewHolder2.getItemViewType() == 12) {
                        BiligameRouterHelper.openOperatorGameList(view.getContext(), detailFragmentV2.f62510d.info.operatorId, detailFragmentV2.f62508b);
                    }
                }
            });
            return;
        }
        if (baseViewHolder instanceof wo.l) {
            return;
        }
        if (baseViewHolder instanceof l.c) {
            OnSafeClickListener uVar = new u(baseViewHolder);
            View.OnClickListener onSafeClickListener = new OnSafeClickListener();
            baseViewHolder.itemView.findViewById(2131307981).setOnClickListener(uVar);
            baseViewHolder.itemView.findViewById(2131307982).setOnClickListener(uVar);
            baseViewHolder.itemView.findViewById(2131307983).setOnClickListener(uVar);
            baseViewHolder.itemView.findViewById(2131307981).findViewById(2131312902).findViewById(2131309017).setOnClickListener(onSafeClickListener);
            baseViewHolder.itemView.findViewById(2131307981).findViewById(2131312902).findViewById(2131309018).setOnClickListener(onSafeClickListener);
            baseViewHolder.itemView.findViewById(2131307981).findViewById(2131312902).findViewById(2131309019).setOnClickListener(onSafeClickListener);
            baseViewHolder.itemView.findViewById(2131307982).findViewById(2131312902).findViewById(2131309017).setOnClickListener(onSafeClickListener);
            baseViewHolder.itemView.findViewById(2131307982).findViewById(2131312902).findViewById(2131309018).setOnClickListener(onSafeClickListener);
            baseViewHolder.itemView.findViewById(2131307982).findViewById(2131312902).findViewById(2131309019).setOnClickListener(onSafeClickListener);
            baseViewHolder.itemView.findViewById(2131307983).findViewById(2131312902).findViewById(2131309017).setOnClickListener(onSafeClickListener);
            baseViewHolder.itemView.findViewById(2131307983).findViewById(2131312902).findViewById(2131309018).setOnClickListener(onSafeClickListener);
            baseViewHolder.itemView.findViewById(2131307983).findViewById(2131312902).findViewById(2131309019).setOnClickListener(onSafeClickListener);
            return;
        }
        if (baseViewHolder instanceof C8904c) {
            C8904c c8904c = (C8904c) baseViewHolder;
            c8904c.h.setOnClickListener(new w(this));
            c8904c.f128765i.setOnClickListener(new x(this));
            return;
        }
        if (baseViewHolder instanceof wo.e) {
            ((wo.e) baseViewHolder).f128793z = new y(this, baseViewHolder);
            return;
        }
        if (baseViewHolder instanceof wo.w) {
            baseViewHolder.itemView.setOnClickListener(new a(this));
            return;
        }
        if (baseViewHolder instanceof wo.s) {
            ?? r03 = ((wo.s) baseViewHolder).f128861l;
            r03.itemView.setOnClickListener(new OnSafeClickListener());
            r03.f128813j.setOnClickListener(new c(this));
            return;
        }
        if (baseViewHolder instanceof wo.y) {
            final int i7 = 2;
            ((wo.y) baseViewHolder).setOnMoreListener(new View.OnClickListener(i7, this) { // from class: HF0.n

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f8377a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final androidx_fragment_app_Fragment f8378b;

                {
                    this.f8377a = i7;
                    this.f8378b = this;
                }

                /* JADX WARN: Removed duplicated region for block: B:20:0x00a8  */
                /* JADX WARN: Type inference failed for: r0v29, types: [androidx.fragment.app.Fragment, com.bilibili.biligame.business.detail.tab.DetailFragmentV2] */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void onClick(android.view.View r6) {
                    /*
                        r5 = this;
                        r0 = r5
                        int r0 = r0.f8377a
                        switch(r0) {
                            case 0: goto L75;
                            case 1: goto L60;
                            default: goto L1c;
                        }
                    L1c:
                        r0 = r5
                        com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment r0 = r0.f8378b
                        com.bilibili.biligame.business.detail.tab.DetailFragmentV2 r0 = (com.bilibili.biligame.business.detail.tab.DetailFragmentV2) r0
                        r8 = r0
                        r0 = r8
                        com.bilibili.biligame.ui.gamedetail.widget.GameDetailData r0 = r0.f62510d
                        r6 = r0
                        r0 = r6
                        if (r0 == 0) goto L5f
                        r0 = r6
                        com.bilibili.biligame.api.bean.gamedetail.GameDetailInfo r0 = r0.info
                        if (r0 == 0) goto L5f
                        r0 = r8
                        android.content.Context r0 = r0.getContext()
                        r6 = r0
                        r0 = r8
                        com.bilibili.biligame.ui.gamedetail.widget.GameDetailData r0 = r0.f62510d
                        com.bilibili.biligame.api.bean.gamedetail.GameDetailInfo r0 = r0.info
                        int r0 = r0.gameBaseId
                        r7 = r0
                        r0 = r8
                        com.bilibili.biligame.ui.gamedetail.widget.GameDetailData r0 = r0.f62510d
                        com.bilibili.biligame.api.bean.gamedetail.GameDetailInfo r0 = r0.info
                        r8 = r0
                        r0 = r6
                        r1 = r7
                        java.lang.String r1 = java.lang.String.valueOf(r1)
                        r2 = r8
                        java.lang.String r2 = r2.title
                        r3 = r8
                        java.lang.String r3 = r3.expandedName
                        java.lang.String r2 = com.bilibili.biligame.utils.GameUtils.formatGameName(r2, r3)
                        com.bilibili.biligame.router.BiligameRouterHelper.openHotVideoList(r0, r1, r2)
                    L5f:
                        return
                    L60:
                        r0 = r5
                        com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment r0 = r0.f8378b
                        com.mall.ui.page.ip.sponsor.MallCharacterSponsorFragmentV2 r0 = (com.mall.ui.page.ip.sponsor.MallCharacterSponsorFragmentV2) r0
                        r1 = 2
                        r2 = 1
                        r0.rf(r1, r2)
                        r0 = 2131830624(0x7f112760, float:1.929425E38)
                        java.util.Map r1 = kotlin.collections.MapsKt.emptyMap()
                        KQ0.e.e(r0, r1)
                        return
                    L75:
                        r0 = r5
                        com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment r0 = r0.f8378b
                        com.bilibili.upper.module.aistory.test.base.BaseAIStoryPageFragment r0 = (com.bilibili.upper.module.aistory.test.base.BaseAIStoryPageFragment) r0
                        r9 = r0
                        r0 = r9
                        bF0.R0 r0 = r0.c
                        r6 = r0
                        r0 = r6
                        if (r0 == 0) goto Lc2
                        r0 = r6
                        android.widget.EditText r0 = r0.f55063A
                        r10 = r0
                        r0 = r10
                        if (r0 == 0) goto Lc2
                        r0 = r10
                        android.text.Editable r0 = r0.getText()
                        r6 = r0
                        r0 = r6
                        if (r0 == 0) goto La8
                        r0 = r6
                        java.lang.String r0 = r0.toString()
                        r8 = r0
                        r0 = r8
                        r6 = r0
                        r0 = r8
                        if (r0 != 0) goto Lab
                    La8:
                        java.lang.String r0 = ""
                        r6 = r0
                    Lab:
                        r0 = r6
                        java.lang.String r1 = ""
                        boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                        if (r0 != 0) goto Lc2
                        r0 = r10
                        java.lang.String r1 = ""
                        r0.setText(r1)
                        r0 = r9
                        java.lang.String r1 = ""
                        r0.Ef(r1)
                    Lc2:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: HF0.n.onClick(android.view.View):void");
                }
            });
            return;
        }
        if (baseViewHolder instanceof wo.f) {
            baseViewHolder.itemView.setOnClickListener(new d(this));
            return;
        }
        if (baseViewHolder instanceof C8902a) {
            baseViewHolder.itemView.setOnClickListener(new e(this));
            return;
        }
        if (baseViewHolder instanceof com.bilibili.biligame.widget.viewholder.a) {
            baseViewHolder.itemView.setOnClickListener(new f(this));
            return;
        }
        if (baseViewHolder instanceof wo.i) {
            ((wo.i) baseViewHolder).f128827l.setOnClickListener(new g(this));
            return;
        }
        if (baseViewHolder instanceof d.a) {
            ((d.a) baseViewHolder).f62592g.setOnClickListener(new h(this));
        } else if (baseViewHolder instanceof D) {
            ((D) baseViewHolder).f128741F = new i(this);
        }
    }

    public final void kf(String str) {
        if (this.f62529x || str == null || str.isEmpty()) {
            return;
        }
        this.f62529x = true;
        ((com.bilibili.biligame.api.c) GameServiceGenerator.createService(com.bilibili.biligame.api.c.class)).checkQuestionnaire(str).enqueue(new j(this));
    }

    public final GameDetailApiService lf() {
        if (this.f62511e == null) {
            this.f62511e = (GameDetailApiService) GameServiceGenerator.createService(GameDetailApiService.class);
        }
        return this.f62511e;
    }

    public final void mf() {
        com.bilibili.biligame.business.detail.tab.a aVar;
        if (this.f62527v.incrementAndGet() != 9 || (aVar = this.f62509c) == null) {
            return;
        }
        aVar.f62578w = true;
    }

    public final void nf() {
        if (this.f62522q == -1) {
            this.f62522q = 0;
            o.a aVarB = com.bilibili.biligame.helper.o.b(this);
            BiliCall<BiligameApiResponse<BookAward>> bookAwardInfoList = lf().getBookAwardInfoList(String.valueOf(this.f62508b));
            aVarB.a(14, bookAwardInfoList);
            bookAwardInfoList.enqueue(new m(this));
        }
    }

    public final void notifyRefresh() {
        notifySelected();
    }

    public final void notifySelected() {
        List<BiligameMainGame> value;
        qf();
        nf();
        tf();
        pf();
        of(false);
        rf(false);
        if (!this.f62525t) {
            sf();
        }
        if (this.f62518m != -1 || (value = this.f62528w.f127581e.getValue()) == null) {
            return;
        }
        this.f62518m = 1;
        com.bilibili.biligame.business.detail.tab.a aVar = this.f62509c;
        aVar.f62566k = value;
        aVar.notifySectionData();
    }

    public final void notifyUnselected() {
    }

    public final void of(boolean z6) {
        if (z6 || this.f62519n == -1) {
            this.f62519n = 0;
            o.a aVarB = com.bilibili.biligame.helper.o.b(this);
            BiliCall<BiligameApiResponse<GameOfficialAccount>> gameCenterOfficialAccount = lf().getGameCenterOfficialAccount("");
            aVarB.a(7, gameCenterOfficialAccount);
            gameCenterOfficialAccount.enqueue(new p(this));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttach(Context context) {
        super/*com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment*/.onAttach(context);
        if (context instanceof z) {
            this.f62513g = (z) context;
        }
        if (KotlinExtensionsKt.getActivity(context) instanceof GameDetailCallback) {
            this.h = KotlinExtensionsKt.getActivity(context);
        }
    }

    public final void onBookFailure() {
    }

    public final boolean onBookShare(int i7) {
        GameDetailCallback gameDetailCallback = this.h;
        if (gameDetailCallback == null) {
            return true;
        }
        gameDetailCallback.onShare();
        return true;
    }

    public final void onBookSuccess(int i7) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:14:0x0073
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public final void onCreateSafe(@androidx.annotation.Nullable android.os.Bundle r7) {
        /*
            r6 = this;
            r0 = r6
            r1 = r7
            super.onCreateSafe(r1)
            r0 = r6
            android.os.Bundle r0 = r0.getArguments()
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L58
            r0 = r7
            java.lang.String r1 = "key_game_info"
            java.io.Serializable r0 = r0.getSerializable(r1)
            com.bilibili.biligame.ui.gamedetail.widget.GameDetailData r0 = (com.bilibili.biligame.ui.gamedetail.widget.GameDetailData) r0
            r8 = r0
            r0 = r6
            r1 = r8
            r0.f62510d = r1
            r0 = r8
            if (r0 == 0) goto L33
            r0 = r8
            com.bilibili.biligame.api.bean.gamedetail.GameDetailInfo r0 = r0.info
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L33
            r0 = r6
            r1 = r8
            int r1 = r1.gameBaseId
            r0.f62508b = r1
        L33:
            r0 = r6
            r1 = r7
            java.lang.String r2 = "key_goto_home"
            r3 = 0
            boolean r1 = r1.getBoolean(r2, r3)
            r0.f62524s = r1
            r0 = r6
            r1 = r7
            java.lang.String r2 = "key_is_private_recruit"
            boolean r1 = r1.getBoolean(r2)
            r0.f62525t = r1
            r0 = r6
            r1 = r7
            java.lang.String r2 = "reportExtra"
            java.io.Serializable r1 = r1.getSerializable(r2)     // Catch: java.lang.Exception -> L73
            com.alibaba.fastjson.JSONObject r1 = (com.alibaba.fastjson.JSONObject) r1     // Catch: java.lang.Exception -> L73
            r0.f62526u = r1     // Catch: java.lang.Exception -> L73
        L58:
            com.bilibili.lib.accounts.subscribe.Topic r0 = com.bilibili.lib.accounts.subscribe.Topic.SIGN_IN     // Catch: java.lang.Exception -> L73
            r8 = r0
            com.bilibili.biligame.business.detail.tab.DetailFragmentV2$k r0 = new com.bilibili.biligame.business.detail.tab.DetailFragmentV2$k
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            r7 = r0
            r0 = r6
            r1 = 1
            com.bilibili.lib.accounts.subscribe.Topic[] r1 = new com.bilibili.lib.accounts.subscribe.Topic[r1]
            r2 = r1
            r3 = 0
            r4 = r8
            r2[r3] = r4
            r2 = r7
            com.bilibili.biligame.utils.KotlinExtensionsKt.subscribeLogin(r0, r1, r2)
            return
        L73:
            r7 = move-exception
            goto L58
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.biligame.business.detail.tab.DetailFragmentV2.onCreateSafe(android.os.Bundle):void");
    }

    @Nullable
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131494739, viewGroup, false);
    }

    public final void onDestroyViewSafe() {
        super.onDestroyViewSafe();
        GloBus.get().unregister(this);
        com.bilibili.biligame.helper.o.a(this);
    }

    /* JADX WARN: Type inference failed for: r0v52, types: [androidx.recyclerview.widget.RecyclerView$Adapter, com.bilibili.biligame.business.detail.tab.a, tv.danmaku.bili.widget.section.adapter.BaseSectionAdapter] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Subscribe
    public void onEventRefresh(ArrayList<JavaScriptParams.NotifyInfo> arrayList) {
        GameDetailData gameDetailData;
        GameDetailContent gameDetailContent;
        GameDetailInfo gameDetailInfo;
        int i7;
        try {
            if (this.f62508b <= 0) {
                return;
            }
            boolean z6 = false;
            boolean z7 = false;
            for (JavaScriptParams.NotifyInfo notifyInfo : arrayList) {
                if (notifyInfo != null) {
                    int i8 = notifyInfo.type;
                    if (i8 == 5) {
                        if (!Utils.isEmpty(notifyInfo.list)) {
                            long j7 = this.f62514i;
                            if (j7 > 0 && notifyInfo.list.contains(String.valueOf(j7))) {
                                z7 = true;
                            }
                        }
                    } else if (i8 != 6 || z6) {
                        if (i8 == 1 && (gameDetailData = this.f62510d) != null && (gameDetailContent = gameDetailData.detail) != null && (gameDetailInfo = gameDetailData.info) != null && gameDetailInfo.gameTestRecruitInfo != null && notifyInfo.list.contains(String.valueOf(gameDetailContent.mainGameBaseId))) {
                            this.f62510d.info.gameTestRecruitInfo.setBooked(true);
                            ?? r02 = this.f62509c;
                            r02.f62571p = this.f62510d.info.gameTestRecruitInfo;
                            BaseSectionAdapter.Section sectionFromType = r02.getSectionFromType(19);
                            if (sectionFromType != null && (i7 = sectionFromType.start) >= 0) {
                                r02.notifyItemChanged(i7);
                            }
                        }
                    } else if (!Utils.isEmpty(notifyInfo.list) && notifyInfo.list.contains(String.valueOf(this.f62508b))) {
                        z6 = true;
                    }
                }
            }
            if (z6) {
                rf(true);
            }
            if (z7) {
                of(true);
            }
        } catch (Throwable th) {
            CatchUtils.e("DetailFragment", "", th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    public final void onViewCreatedSafe(@NonNull View view, @Nullable Bundle bundle) {
        List<BiligameMainGame> value;
        super.onViewCreatedSafe(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(2131306580);
        this.f62512f = recyclerView;
        recyclerView.setVerticalScrollBarEnabled(false);
        this.f62512f.setDescendantFocusability(393216);
        this.f62512f.setLayoutManager(new LinearLayoutManager(getContext()));
        RecyclerView.ItemAnimator itemAnimator = this.f62512f.getItemAnimator();
        if (itemAnimator instanceof SimpleItemAnimator) {
            ((SimpleItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
        }
        com.bilibili.biligame.business.detail.tab.a aVar = new com.bilibili.biligame.business.detail.tab.a(getLayoutInflater());
        this.f62509c = aVar;
        aVar.f62579x = ReportExtra.create(this.f62526u);
        com.bilibili.biligame.business.detail.tab.a aVar2 = this.f62509c;
        aVar2.f62577v = this.f62525t;
        boolean z6 = this.f62524s;
        if (aVar2.f62575t != z6) {
            aVar2.f62575t = z6;
            aVar2.notifySectionData();
        }
        this.f62509c.setHandleClickListener(this);
        this.f62512f.setAdapter(this.f62509c);
        com.bilibili.biligame.business.detail.tab.a aVar3 = this.f62509c;
        GameDetailData gameDetailData = this.f62510d;
        aVar3.P(gameDetailData.info, gameDetailData.detail);
        this.f62512f.addItemDecoration(new a.C0344a(getContext()));
        this.f62515j = -1;
        this.f62516k = -1;
        this.f62517l = -1;
        this.f62528w = (to.f) new ViewModelProvider(p3()).get(to.f.class);
        this.f62527v = new AtomicInteger();
        GameTestRecruitInfo gameTestRecruitInfo = this.f62510d.info.gameTestRecruitInfo;
        if (gameTestRecruitInfo != null) {
            kf(gameTestRecruitInfo.getRecruitQuestionnaireId());
        }
        qf();
        nf();
        tf();
        if (this.f62523r == -1) {
            this.f62523r = 0;
            o.a aVarB = com.bilibili.biligame.helper.o.b(this);
            BiliCall<BiligameApiResponse<GamePlatformGrade>> platformGrade = lf().getPlatformGrade(String.valueOf(this.f62508b));
            aVarB.a(15, platformGrade);
            platformGrade.enqueue(new vo.k(this));
        }
        pf();
        of(true);
        rf(true);
        if (!this.f62525t) {
            sf();
        }
        if (this.f62518m == -1 && (value = this.f62528w.f127581e.getValue()) != null) {
            this.f62518m = 1;
            com.bilibili.biligame.business.detail.tab.a aVar4 = this.f62509c;
            aVar4.f62566k = value;
            aVar4.notifySectionData();
        }
        to.f fVar = this.f62528w;
        Integer num = fVar.f127580d;
        if (num != null) {
            BiliCall<BiligameApiResponse<GameOfficialAccount>> gameOfficialAccount = fVar.f127579c.getGameOfficialAccount(String.valueOf(num));
            ((ArrayList) fVar.f127578b).add(gameOfficialAccount);
            gameOfficialAccount.enqueue(new to.e(fVar));
        }
        to.f fVar2 = this.f62528w;
        Integer num2 = fVar2.f127580d;
        if (num2 != null) {
            fVar2.f127577a.add(KotlinExtensionsKt.toObservable(fVar2.f127579c.fetchGameForumHotPosts(String.valueOf(num2))).observeOn(AndroidSchedulers.mainThread()).subscribe(new to.c(fVar2), to.d.f127575a));
        }
        GloBus.get().register(this);
        this.f62528w.f127581e.observe(this, new Vm.d(this, 2));
        this.f62528w.f127582f.observe(this, new Observer(this) { // from class: vo.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final DetailFragmentV2 f128317a;

            {
                this.f128317a = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                GameOfficialAccount gameOfficialAccount2 = (GameOfficialAccount) obj;
                DetailFragmentV2 detailFragmentV2 = this.f128317a;
                if (gameOfficialAccount2 == null) {
                    detailFragmentV2.getClass();
                    return;
                }
                com.bilibili.biligame.business.detail.tab.a aVar5 = detailFragmentV2.f62509c;
                aVar5.f62572q = gameOfficialAccount2;
                aVar5.notifySectionData();
            }
        });
        this.f62528w.f127583g.observe(this, new Observer(this) { // from class: vo.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final DetailFragmentV2 f128318a;

            {
                this.f128318a = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                GameForumHotPosts gameForumHotPosts = (GameForumHotPosts) obj;
                DetailFragmentV2 detailFragmentV2 = this.f128318a;
                if (gameForumHotPosts != null) {
                    detailFragmentV2.f62509c.notifySectionData();
                } else {
                    detailFragmentV2.getClass();
                }
            }
        });
    }

    public final void pf() {
        if (this.f62515j == -1) {
            this.f62515j = 0;
            o.a aVarB = com.bilibili.biligame.helper.o.b(this);
            BiliCall<BiligameApiResponse<List<GameRole>>> gameRoleList = lf().getGameRoleList(String.valueOf(this.f62508b));
            aVarB.a(1, gameRoleList);
            gameRoleList.enqueue(new o(this));
        }
    }

    public final boolean pvReport() {
        return false;
    }

    public final void qf() {
        if (this.f62520o == -1) {
            this.f62520o = 0;
            o.a aVarB = com.bilibili.biligame.helper.o.b(this);
            BiliCall<BiligameApiResponse<List<NoticeInfo>>> noticeInfoList = lf().getNoticeInfoList(String.valueOf(this.f62508b));
            aVarB.a(12, noticeInfoList);
            noticeInfoList.enqueue(new l(this));
        }
    }

    public final void rf(boolean z6) {
        if (z6 || this.f62516k == -1) {
            this.f62516k = 0;
            o.a aVarB = com.bilibili.biligame.helper.o.b(this);
            BiliCall<BiligameApiResponse<List<RecommendComment>>> recommendCommentList = lf().getRecommendCommentList(String.valueOf(this.f62508b));
            aVarB.a(4, recommendCommentList);
            recommendCommentList.enqueue(new q(this));
        }
    }

    public final void sf() {
        if (this.f62517l == -1) {
            this.f62517l = 0;
            o.a aVarB = com.bilibili.biligame.helper.o.b(this);
            BiliCall<BiligameApiResponse<List<SimpleGame>>> relatedGameList = lf().getRelatedGameList(String.valueOf(this.f62508b));
            aVarB.a(0, relatedGameList);
            relatedGameList.enqueue(new n(this));
        }
    }

    public final void tf() {
        if (this.f62521p == -1) {
            this.f62521p = 0;
            String buvid = BuvidHelper.getBuvid();
            o.a aVarB = com.bilibili.biligame.helper.o.b(this);
            GameDetailApiService gameDetailApiServiceLf = lf();
            int i7 = this.f62508b;
            String str = buvid;
            if (buvid == null) {
                str = "";
            }
            BiliCall<BiligameApiResponse<VideoPage>> hotVideoList = gameDetailApiServiceLf.getHotVideoList(String.valueOf(i7), str, 1002);
            aVarB.a(11, hotVideoList);
            hotVideoList.enqueue(new s(this));
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [androidx.recyclerview.widget.RecyclerView$Adapter, com.bilibili.biligame.business.detail.tab.a, tv.danmaku.bili.widget.section.adapter.BaseSectionAdapter] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void uf(boolean z6) {
        GameDetailInfo gameDetailInfo;
        ?? r02;
        int i7;
        GameDetailData gameDetailData = this.f62510d;
        if (gameDetailData == null || (gameDetailInfo = gameDetailData.info) == null) {
            return;
        }
        GameTestRecruitInfo gameTestRecruitInfo = gameDetailInfo.gameTestRecruitInfo;
        if (gameTestRecruitInfo != null) {
            gameTestRecruitInfo.setHasQuestionnaireFilled(this.f62531z);
            gameTestRecruitInfo.setHasQuestionnaireChecked(this.f62530y);
        }
        if (!z6 || (r02 = this.f62509c) == 0) {
            return;
        }
        r02.f62571p = gameTestRecruitInfo;
        BaseSectionAdapter.Section sectionFromType = r02.getSectionFromType(19);
        if (sectionFromType == null || (i7 = sectionFromType.start) < 0) {
            return;
        }
        r02.notifyItemChanged(i7);
    }
}
