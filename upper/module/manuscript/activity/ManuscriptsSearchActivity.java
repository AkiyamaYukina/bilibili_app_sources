package com.bilibili.upper.module.manuscript.activity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import com.bilibili.droid.StringUtil;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.infoeyes.InfoEyesManager;
import com.bilibili.lib.mod.P0;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.BaseAppCompatActivity;
import com.bilibili.lib.ui.util.StatusBarCompat;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.moduleservice.account.AccountService;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.studio.kaleidoscope.adapter.KaleidoscopeFactory;
import com.bilibili.upper.api.bean.manuscript.ArcAudit;
import com.bilibili.upper.api.bean.manuscript.ManuscriptBean;
import com.bilibili.upper.api.bean.manuscript.VideoItem;
import com.bilibili.upper.module.contribute.up.ui.section.bean.VideoSectionResponse;
import com.bilibili.upper.module.manuscript.model.ArchiveAppealViewModel;
import com.bilibili.upper.widget.UpperFlowLayout;
import com.bilibili.upper.widget.text.UpperCommonEditText;
import com.bilibili.xpref.Xpref;
import com.squareup.otto.Subscribe;
import eJ0.C6931i;
import fI0.C7042a;
import jJ0.C7652a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import lB0.a;
import lB0.a$b;
import tv.danmaku.android.log.BLog;
import tv.danmaku.android.util.AppResUtil;
import tv.danmaku.bili.widget.swiperefresh.TintSwipeRefreshLayout;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/activity/ManuscriptsSearchActivity.class */
public class ManuscriptsSearchActivity extends BaseAppCompatActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final int f113490Z = 0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public com.bilibili.upper.module.manuscript.model.c f113491B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public a f113492C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public a f113493D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public gI0.w f113494E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public List<ArcAudit> f113495F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public ArchiveAppealViewModel f113496G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f113497H = 1;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f113498I = false;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public String f113499J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public UpperFlowLayout f113500K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public LinearLayout f113501L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public View f113502M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public View f113503N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public View f113504O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public TextView f113505P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public UpperCommonEditText f113506Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public RecyclerView f113507R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public View f113508S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public TintSwipeRefreshLayout f113509T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public LinearLayout f113510U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public TextView f113511V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public BiliImageView f113512W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public View f113513X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    @Nullable
    public a.a f113514Y;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/activity/ManuscriptsSearchActivity$a.class */
    public final class a extends BiliApiDataCallback<ManuscriptBean> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f113515b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ManuscriptsSearchActivity f113516c;

        public a(ManuscriptsSearchActivity manuscriptsSearchActivity, boolean z6) {
            this.f113516c = manuscriptsSearchActivity;
            this.f113515b = z6;
        }

        @Override // com.bilibili.okretro.BiliApiDataCallback
        public final void onDataSuccess(@Nullable ManuscriptBean manuscriptBean) {
            List list;
            List list2;
            gI0.w wVar;
            ManuscriptBean manuscriptBean2 = manuscriptBean;
            ManuscriptsSearchActivity manuscriptsSearchActivity = this.f113516c;
            if (manuscriptBean2 != null && (wVar = manuscriptsSearchActivity.f113494E) != null) {
                wVar.h = manuscriptBean2.showProcessDetail;
            }
            boolean z6 = this.f113515b;
            if (manuscriptBean2 != null && (list2 = manuscriptBean2.arcAudits) != null && list2.size() != 0) {
                if (z6) {
                    int i7 = ManuscriptsSearchActivity.f113490Z;
                    manuscriptsSearchActivity.S6(-1, false);
                } else {
                    ((ArrayList) manuscriptsSearchActivity.f113495F).clear();
                }
                int i8 = ManuscriptsSearchActivity.f113490Z;
                manuscriptsSearchActivity.V6(3, -1);
                ((ArrayList) manuscriptsSearchActivity.f113495F).addAll(jI0.f.a(manuscriptsSearchActivity, manuscriptBean2.arcAudits));
                manuscriptsSearchActivity.f113494E.W(manuscriptsSearchActivity.f113495F);
                manuscriptsSearchActivity.f113494E.notifyDataSetChanged();
            } else if (z6) {
                int i9 = ManuscriptsSearchActivity.f113490Z;
                manuscriptsSearchActivity.S6(2, true);
            } else {
                int i10 = ManuscriptsSearchActivity.f113490Z;
                manuscriptsSearchActivity.V6(2, 1);
            }
            if (z6) {
                manuscriptsSearchActivity.f113498I = false;
            } else {
                InfoEyesManager.getInstance().report2(false, "000225", new String[]{"ugc_center_contribution_result", "show", manuscriptsSearchActivity.f113506Q.getContent(), String.valueOf((manuscriptBean2 == null || (list = manuscriptBean2.arcAudits) == null) ? 0 : list.size())});
                if (manuscriptsSearchActivity.f113509T.isRefreshing()) {
                    manuscriptsSearchActivity.f113509T.setRefreshing(false);
                }
            }
            manuscriptsSearchActivity.U6(false);
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final void onError(Throwable th) {
            boolean z6 = this.f113515b;
            ManuscriptsSearchActivity manuscriptsSearchActivity = this.f113516c;
            if (z6) {
                manuscriptsSearchActivity.f113498I = false;
                manuscriptsSearchActivity.S6(2, true);
            } else {
                if (manuscriptsSearchActivity.f113509T.isRefreshing()) {
                    manuscriptsSearchActivity.f113509T.setRefreshing(false);
                }
                if (ConnectivityMonitor.getInstance().isNetworkActive()) {
                    manuscriptsSearchActivity.V6(2, 3);
                } else {
                    manuscriptsSearchActivity.V6(2, 2);
                }
            }
            int i7 = ManuscriptsSearchActivity.f113490Z;
            manuscriptsSearchActivity.U6(false);
        }
    }

    public final void P6() {
        if (this.f113498I) {
            return;
        }
        this.f113497H++;
        String accessToken = null;
        AccountService accountService = (AccountService) BLRouter.get$default(BLRouter.INSTANCE, AccountService.class, (String) null, 2, (Object) null);
        if (accountService != null) {
            accessToken = accountService.getAccessToken();
        }
        com.bilibili.upper.api.manager.a.b(accessToken, C7042a.f117737c[0], this.f113497H, C7042a.f117738d[0], 1L, this.f113499J, this.f113493D);
        this.f113498I = true;
    }

    public final void Q6(String str) {
        Xz0.j.c("sdk_type", KaleidoscopeFactory.SDK_MON);
        Xz0.j.c("router_topic_id", Xz0.g.f28463b);
        Map mapB = Xz0.j.b(Xz0.k.f28475b);
        ((HashMap) mapB).put("query", str);
        tw0.f.e("creation.creation-contribution.0.search.show", mapB);
        gI0.w wVar = this.f113494E;
        if (wVar != null) {
            wVar.f119953i = str;
        }
        ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(this.f113506Q.getWindowToken(), 2);
        this.f113499J = str;
        U6(false);
        if (StringUtil.isBlank(str)) {
            return;
        }
        int i7 = 1;
        this.f113497H = 1;
        AccountService accountService = (AccountService) BLRouter.get$default(BLRouter.INSTANCE, AccountService.class, (String) null, 2, (Object) null);
        com.bilibili.upper.api.manager.a.b(accountService != null ? accountService.getAccessToken() : null, C7042a.f117737c[0], this.f113497H, C7042a.f117738d[0], 1L, str, this.f113492C);
        V6(1, -1);
        com.bilibili.upper.module.manuscript.model.c cVar = this.f113491B;
        cVar.getClass();
        if (!StringUtil.isBlank(str)) {
            if (cVar.f113669a.size() >= 15) {
                cVar.f113669a.removeLast();
            }
            cVar.f113669a.addFirst(str);
            while (i7 < cVar.f113669a.size()) {
                if (str.equals(cVar.f113669a.get(i7))) {
                    cVar.f113669a.remove(i7);
                } else {
                    i7++;
                }
            }
        }
        this.f113491B.a();
    }

    public final void R6(int i7, int i8) {
        ViewGroup.LayoutParams layoutParams = this.f113512W.getLayoutParams();
        if (i7 != 2) {
            layoutParams.width = C6931i.a(this.f113512W.getContext(), 280.0f);
            layoutParams.height = C6931i.a(this.f113512W.getContext(), 158.0f);
            BiliImageLoader.INSTANCE.with(this.f113512W.getContext()).url(AppResUtil.getImageUrl("img_holder_loading_style1.webp")).into(this.f113512W);
            this.f113511V.setText(getResources().getText(2131851357));
        } else if (i8 == 1) {
            layoutParams.width = C6931i.a(this.f113512W.getContext(), 115.0f);
            layoutParams.height = C6931i.a(this.f113512W.getContext(), 112.0f);
            this.f113512W.setImageResource(2131235613);
            this.f113511V.setText(getResources().getText(2131851195));
        } else if (i8 == 2) {
            layoutParams.width = C6931i.a(this.f113512W.getContext(), 280.0f);
            layoutParams.height = C6931i.a(this.f113512W.getContext(), 158.0f);
            this.f113512W.setImageResource(2131232151);
            this.f113511V.setText(getResources().getText(2131851014));
        } else if (i8 == 4) {
            layoutParams.width = C6931i.a(this.f113512W.getContext(), 160.0f);
            layoutParams.height = C6931i.a(this.f113512W.getContext(), 140.0f);
            BiliImageLoader.INSTANCE.with(this.f113512W.getContext()).url(AppResUtil.getImageUrl("img_holder_forbid_style1.webp")).into(this.f113512W);
            this.f113511V.setText(getResources().getText(2131851082));
        } else {
            layoutParams.width = C6931i.a(this.f113512W.getContext(), 280.0f);
            layoutParams.height = C6931i.a(this.f113512W.getContext(), 158.0f);
            this.f113512W.setImageResource(2131232151);
            this.f113511V.setText(getResources().getText(2131851067));
        }
        this.f113512W.setLayoutParams(layoutParams);
    }

    public final void S6(int i7, boolean z6) {
        View view = this.f113508S;
        if (view != null) {
            view.setVisibility(z6 ? 0 : 8);
            this.f113508S.setOnClickListener(null);
            if (z6) {
                View viewFindViewById = this.f113508S.findViewById(2131303590);
                TextView textView = (TextView) this.f113508S.findViewById(2131311144);
                if (viewFindViewById == null || textView == null) {
                    BLog.w("ManuscriptsSearchActivity", "updateFooterView aborted, footer subviews missing");
                    return;
                }
                if (i7 == 2) {
                    viewFindViewById.setVisibility(8);
                    textView.setText(2131851025);
                } else if (i7 != 3) {
                    viewFindViewById.setVisibility(0);
                    textView.setText(2131851170);
                } else {
                    this.f113508S.setOnClickListener(new XD.a(this, 2));
                    viewFindViewById.setVisibility(8);
                    textView.setText(2131841381);
                }
            }
        }
    }

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
    public final void T6(boolean z6) {
        if (!z6) {
            this.f113504O.setVisibility(8);
            this.f113500K.setVisibility(8);
            this.f113501L.setVisibility(8);
            this.f113502M.setVisibility(8);
            this.f113503N.setVisibility(8);
            this.f113505P.setVisibility(8);
            return;
        }
        this.f113504O.setVisibility(0);
        this.f113500K.setVisibility(0);
        this.f113501L.setVisibility(0);
        this.f113502M.setVisibility(0);
        this.f113503N.setVisibility(0);
        this.f113505P.setVisibility(0);
        this.f113500K.removeAllViews();
        for (String str : this.f113491B.f113669a) {
            UpperFlowLayout upperFlowLayout = this.f113500K;
            upperFlowLayout.getClass();
            String str2 = new String[]{str}[0];
            UpperFlowLayout.a aVar = new UpperFlowLayout.a(upperFlowLayout.getContext());
            int iA = C6931i.a(aVar.getContext(), aVar.f114434a);
            int iA2 = C6931i.a(aVar.getContext(), aVar.f114435b);
            int iA3 = C6931i.a(aVar.getContext(), aVar.f114436c);
            int iA4 = C6931i.a(aVar.getContext(), aVar.f114437d);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(iA3, iA4, iA3, iA4);
            aVar.setLayoutParams(layoutParams);
            aVar.setPadding(iA, iA2, iA, iA2);
            aVar.setTextColor(aVar.getResources().getColor(2131104273));
            aVar.setTextSize(12.0f);
            aVar.setBackground(aVar.getResources().getDrawable(2131241419));
            ((GradientDrawable) aVar.getBackground()).setColor(aVar.getResources().getColor(2131104271));
            aVar.setMaxEms(10);
            aVar.setSingleLine();
            aVar.setText(str2);
            upperFlowLayout.addView(aVar);
        }
    }

    public final void U6(boolean z6) {
        this.f113513X.setVisibility(z6 ? 0 : 8);
    }

    public final void V6(int i7, int i8) {
        if (i7 == 1) {
            T6(false);
            this.f113507R.setVisibility(8);
            this.f113510U.setVisibility(0);
            this.f113509T.setVisibility(0);
            R6(1, -1);
            return;
        }
        if (i7 == 2) {
            T6(false);
            this.f113507R.setVisibility(8);
            this.f113510U.setVisibility(0);
            this.f113509T.setVisibility(0);
            R6(2, i8);
            return;
        }
        if (i7 == 3) {
            T6(false);
            this.f113510U.setVisibility(8);
            this.f113507R.setVisibility(0);
            this.f113504O.setVisibility(0);
            this.f113509T.setVisibility(0);
            return;
        }
        this.f113507R.setVisibility(8);
        this.f113510U.setVisibility(8);
        this.f113509T.setVisibility(8);
        if (this.f113491B.f113669a.size() > 0) {
            T6(true);
        } else {
            T6(false);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i7, int i8, @Nullable Intent intent) {
        UpperCommonEditText upperCommonEditText;
        Bundle bundleExtra;
        super.onActivityResult(i7, i8, intent);
        if (i8 == -1 && i7 == 1005) {
            VideoSectionResponse videoSectionResponse = (intent == null || (bundleExtra = intent.getBundleExtra("param_control")) == null) ? null : (VideoSectionResponse) bundleExtra.getParcelable("key_router_response");
            if (videoSectionResponse == null || !videoSectionResponse.isSectionGenerating() || (upperCommonEditText = this.f113506Q) == null) {
                return;
            }
            Q6(upperCommonEditText.getContent());
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == 2131315888) {
            new AlertDialog.Builder(view.getContext()).setMessage(2131850895).setNegativeButton(2131851368, (DialogInterface.OnClickListener) null).setPositiveButton(2131849746, new DialogInterface.OnClickListener(this) { // from class: com.bilibili.upper.module.manuscript.activity.x

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final ManuscriptsSearchActivity f113562a;

                {
                    this.f113562a = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i7) {
                    ManuscriptsSearchActivity manuscriptsSearchActivity = this.f113562a;
                    int i8 = ManuscriptsSearchActivity.f113490Z;
                    manuscriptsSearchActivity.getClass();
                    dialogInterface.cancel();
                    manuscriptsSearchActivity.f113491B.f113669a.clear();
                    manuscriptsSearchActivity.f113491B.a();
                    manuscriptsSearchActivity.V6(0, -1);
                }
            }).create().show();
        } else if (id == 2131315880) {
            finish();
        } else if (id == 2131315894) {
            U6(false);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [com.bilibili.upper.module.manuscript.model.c, java.lang.Object] */
    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131493748);
        this.f113495F = new ArrayList();
        gI0.w wVar = new gI0.w(this.f113495F, 1);
        this.f113494E = wVar;
        wVar.f119947b = true;
        wVar.f119949d = "稿件管理-搜索结果页";
        wVar.f119951f = new y(this);
        Context applicationContext = getApplicationContext();
        ?? obj = new Object();
        obj.f113669a = new LinkedList<>();
        obj.f113670b = Xpref.getSharedPreferences(applicationContext, "bili_upper_search_history_pref");
        this.f113491B = obj;
        for (int i7 = 0; i7 < 15; i7++) {
            String string = obj.f113670b.getString("search_history_" + i7, null);
            if (TextUtils.isEmpty(string)) {
                break;
            }
            obj.f113669a.addLast(string);
        }
        this.f113492C = new a(this, false);
        this.f113493D = new a(this, true);
        ((LinearLayout) findViewById(2131315892)).setPadding(0, StatusBarCompat.getStatusBarHeight(this) + ((int) getResources().getDimension(2131167259)), 0, (int) getResources().getDimension(2131167258));
        this.f113502M = findViewById(2131315889);
        this.f113503N = findViewById(2131315887);
        this.f113504O = findViewById(2131315882);
        UpperFlowLayout upperFlowLayout = (UpperFlowLayout) findViewById(2131315890);
        this.f113500K = upperFlowLayout;
        upperFlowLayout.setOnItemClick(new W60.n(this));
        this.f113501L = (LinearLayout) findViewById(2131315891);
        TextView textView = (TextView) findViewById(2131315888);
        this.f113505P = textView;
        textView.setOnClickListener(this);
        this.f113510U = (LinearLayout) findViewById(2131315885);
        this.f113511V = (TextView) findViewById(2131315886);
        this.f113512W = findViewById(2131315884);
        UpperCommonEditText upperCommonEditText = (UpperCommonEditText) findViewById(2131315881);
        this.f113506Q = upperCommonEditText;
        upperCommonEditText.setAutoShowSoftKeyboard(true);
        ((TextView) findViewById(2131315880)).setOnClickListener(this);
        UpperCommonEditText upperCommonEditText2 = this.f113506Q;
        upperCommonEditText2.f114603c.setOnKeyListener(new View.OnKeyListener(this) { // from class: com.bilibili.upper.module.manuscript.activity.w

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ManuscriptsSearchActivity f113561a;

            {
                this.f113561a = this;
            }

            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i8, KeyEvent keyEvent) {
                ManuscriptsSearchActivity manuscriptsSearchActivity = this.f113561a;
                int i9 = ManuscriptsSearchActivity.f113490Z;
                manuscriptsSearchActivity.getClass();
                if (i8 != 66 || keyEvent.getAction() != 1) {
                    return false;
                }
                manuscriptsSearchActivity.Q6(manuscriptsSearchActivity.f113506Q.getContent());
                InfoEyesManager.getInstance().report2(false, "000225", new String[]{"ugc_center_contribution_go", "click"});
                return false;
            }
        });
        upperCommonEditText2.f114601a = new W60.o(this, 3);
        upperCommonEditText2.f114603c.setOnClickListener(new Yn.m(this, 3));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setSmoothScrollbarEnabled(true);
        RecyclerView recyclerView = (RecyclerView) findViewById(2131315897);
        this.f113507R = recyclerView;
        recyclerView.setLayoutManager(linearLayoutManager);
        this.f113508S = LayoutInflater.from(this).inflate(2131494692, (ViewGroup) this.f113507R, false);
        C7652a c7652a = new C7652a(this.f113494E);
        c7652a.addFooterView(this.f113508S);
        this.f113507R.setAdapter(c7652a);
        S6(-1, false);
        this.f113507R.addOnScrollListener(new z(this));
        TintSwipeRefreshLayout tintSwipeRefreshLayoutFindViewById = findViewById(2131315895);
        this.f113509T = tintSwipeRefreshLayoutFindViewById;
        tintSwipeRefreshLayoutFindViewById.setColorSchemeColors(ThemeUtils.getColorById(this, 2131103284));
        this.f113509T.setOnRefreshListener(new P0(this));
        View viewFindViewById = findViewById(2131315894);
        this.f113513X = viewFindViewById;
        viewFindViewById.setOnClickListener(this);
        V6(0, -1);
        ArchiveAppealViewModel archiveAppealViewModel = (ArchiveAppealViewModel) new ViewModelProvider(this).get(ArchiveAppealViewModel.class);
        this.f113496G = archiveAppealViewModel;
        archiveAppealViewModel.f113661c.observe(this, new Observer(this) { // from class: com.bilibili.upper.module.manuscript.activity.u

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ManuscriptsSearchActivity f113559a;

            {
                this.f113559a = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj2) {
                com.bilibili.upper.module.manuscript.model.a aVar = (com.bilibili.upper.module.manuscript.model.a) obj2;
                int i8 = 0;
                while (true) {
                    ManuscriptsSearchActivity manuscriptsSearchActivity = this.f113559a;
                    if (i8 >= ((ArrayList) manuscriptsSearchActivity.f113495F).size()) {
                        return;
                    }
                    VideoItem videoItem = ((ArcAudit) ((ArrayList) manuscriptsSearchActivity.f113495F).get(i8)).archive;
                    if (videoItem != null && aVar.f113663a == videoItem.aid) {
                        videoItem.appealState = aVar.f113665c;
                        videoItem.appealURL = aVar.f113664b;
                        manuscriptsSearchActivity.f113494E.notifyItemChanged(i8);
                        return;
                    }
                    i8++;
                }
            }
        });
        this.f113494E.f119952g = new com.bilibili.upper.module.manuscript.model.d(this) { // from class: com.bilibili.upper.module.manuscript.activity.v

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ManuscriptsSearchActivity f113560a;

            {
                this.f113560a = this;
            }

            @Override // com.bilibili.upper.module.manuscript.model.d
            public final void a(long j7) {
                this.f113560a.f113496G.K0(j7);
            }
        };
        lB0.a aVarA = lB0.a.a();
        a$b a_b = new a$b(this) { // from class: com.bilibili.upper.module.manuscript.activity.t

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ManuscriptsSearchActivity f113558a;

            {
                this.f113558a = this;
            }

            @Override // lB0.a$b
            public final void onBusEvent(Object obj2) {
                ManuscriptsSearchActivity manuscriptsSearchActivity = this.f113558a;
                UpperCommonEditText upperCommonEditText3 = manuscriptsSearchActivity.f113506Q;
                if (upperCommonEditText3 == null) {
                    return;
                }
                manuscriptsSearchActivity.Q6(upperCommonEditText3.getContent());
            }
        };
        aVarA.getClass();
        this.f113514Y = lB0.a.b(uC0.e.class, a_b);
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        a.a aVar = this.f113514Y;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onPause() {
        super.onPause();
        QE0.c.a().getClass();
        ArrayList arrayList = (ArrayList) QE0.c.f19816d;
        if (arrayList.contains(this)) {
            QE0.c.f19815c.unregister(this);
            arrayList.remove(this);
        }
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        StatusBarCompat.immersiveStatusBar(this);
        StatusBarCompat.tintStatusBar(getWindow(), ThemeUtils.getThemeAttrColor(this, 2130968986));
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onResume() {
        super.onResume();
        QE0.c.a().getClass();
        ArrayList arrayList = (ArrayList) QE0.c.f19816d;
        if (!arrayList.contains(this)) {
            arrayList.add(this);
            QE0.c.f19815c.register(this);
        }
        this.f113496G.J0();
    }

    @Subscribe
    public void shareItem(eJ0.w wVar) {
        if (wVar != null) {
            wVar.a(this);
        }
    }
}
