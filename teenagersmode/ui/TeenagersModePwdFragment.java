package com.bilibili.teenagersmode.ui;

import Pb.F;
import Pb.G;
import Pi0.C2779a;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.fragment.app.FragmentActivity;
import com.bapis.bilibili.app.interfaces.v1.PwdFrom;
import com.bapis.bilibili.app.interfaces.v1.UpdateStatusReq;
import com.bapis.bilibili.app.interfaces.v1.VerifyPwdReply;
import com.bilibili.droid.BundleUtil;
import com.bilibili.droid.ToastHelper;
import com.bilibili.droid.text.SpannedUtils;
import com.bilibili.lib.biliid.api.BiliIds;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blconfig.Contract;
import com.bilibili.lib.moss.api.BusinessException;
import com.bilibili.lib.moss.api.MossException;
import com.bilibili.lib.moss.api.MossResponseHandler;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.magicasakura.widgets.TintImageView;
import com.bilibili.magicasakura.widgets.TintProgressDialog;
import com.bilibili.teenagersmode.c;
import com.bilibili.teenagersmode.ui.PasswordView;
import com.bilibili.teenagersmode.ui.ResizeRelativeLayout;
import com.bilibili.teenagersmode.ui.TeenagersModePwdFragment;
import java.util.HashMap;
import kntr.base.utils.foundation.RomUtils;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import sD0.InterfaceC8578a;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/ui/TeenagersModePwdFragment.class */
public class TeenagersModePwdFragment extends BaseFragment implements ResizeRelativeLayout.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PasswordView f110625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TintProgressDialog f110626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f110627d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f110628e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f110629f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ResizeRelativeLayout f110630g;
    public ScrollView h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.bilibili.teenagersmode.c f110631i = c.C1213c.f110575a;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f110632j = "";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f110633k = "";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f110634l = "";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d f110635m = new d(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/ui/TeenagersModePwdFragment$a.class */
    public final class a implements PasswordView.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f110636a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TeenagersModePwdFragment f110637b;

        public a(TeenagersModePwdFragment teenagersModePwdFragment, e eVar) {
            this.f110637b = teenagersModePwdFragment;
            this.f110636a = eVar;
        }

        @Override // com.bilibili.teenagersmode.ui.PasswordView.b
        public final void a() {
            this.f110637b.f110627d = "";
        }

        @Override // com.bilibili.teenagersmode.ui.PasswordView.b
        public final void b(String str) {
            this.f110637b.f110627d = str;
            this.f110636a.f110652f.onFinished();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/ui/TeenagersModePwdFragment$b.class */
    public final class b extends ClickableSpan {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TeenagersModePwdFragment f110638a;

        public b(TeenagersModePwdFragment teenagersModePwdFragment) {
            this.f110638a = teenagersModePwdFragment;
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(@NonNull View view) {
            String str;
            int i7 = this.f110638a.f110628e;
            if (i7 != 2) {
                switch (i7) {
                    case 5:
                        str = "1";
                        break;
                    case 6:
                        str = "4";
                        break;
                    case 7:
                        str = "3";
                        break;
                    case 8:
                        str = "5";
                        break;
                    case 9:
                        str = "6";
                        break;
                    default:
                        str = null;
                        break;
                }
            } else {
                str = "2";
            }
            Cg.l.a("pos", str, "main.teenagermodel.enter-detail.find-pswd.click", false);
            TeenagersModePwdFragment teenagersModePwdFragment = this.f110638a;
            InterfaceC8578a interfaceC8578a = teenagersModePwdFragment.getParentFragment() instanceof InterfaceC8578a ? (InterfaceC8578a) teenagersModePwdFragment.getParentFragment() : teenagersModePwdFragment.p3() instanceof InterfaceC8578a ? (InterfaceC8578a) teenagersModePwdFragment.p3() : null;
            if (interfaceC8578a != null) {
                interfaceC8578a.G(null, TeenagerModeFindPwdComposeView.class.getName(), true);
            } else if (teenagersModePwdFragment.p3() instanceof TeenagersModeTimeUpActivity) {
                ((TeenagersModeTimeUpActivity) teenagersModePwdFragment.p3()).G(null, TeenagerModeFindPwdComposeView.class.getName(), true);
            }
            this.f110638a.f110625b.j0();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public final void updateDrawState(@NonNull TextPaint textPaint) {
            textPaint.setUnderlineText(false);
            if (this.f110638a.p3() == null) {
                return;
            }
            textPaint.bgColor = 0;
            textPaint.setColor(ThemeUtils.getColorById(this.f110638a.getApplicationContext(), R$color.Text_link));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/ui/TeenagersModePwdFragment$c.class */
    public final class c implements MossResponseHandler<VerifyPwdReply> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean[] f110639a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g f110640b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f110641c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TeenagersModePwdFragment f110642d;

        public c(TeenagersModePwdFragment teenagersModePwdFragment, boolean[] zArr, g gVar, String str) {
            this.f110642d = teenagersModePwdFragment;
            this.f110639a = zArr;
            this.f110640b = gVar;
            this.f110641c = str;
        }

        public final void onCompleted() {
            TeenagersModePwdFragment.kf(this.f110642d);
            if (this.f110639a[0]) {
                return;
            }
            this.f110640b.a(this.f110641c);
        }

        public final void onError(@Nullable MossException mossException) {
            this.f110639a[0] = true;
            TeenagersModePwdFragment teenagersModePwdFragment = this.f110642d;
            TeenagersModePwdFragment.kf(teenagersModePwdFragment);
            teenagersModePwdFragment.f110625b.j0();
            teenagersModePwdFragment.nf();
            TeenagersModePwdFragment.jf(teenagersModePwdFragment, mossException);
        }

        public final /* bridge */ /* synthetic */ void onNext(@Nullable Object obj) {
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/ui/TeenagersModePwdFragment$d.class */
    public final class d implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TeenagersModePwdFragment f110643a;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/ui/TeenagersModePwdFragment$d$a.class */
        public final class a implements MossResponseHandler<VerifyPwdReply> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean[] f110644a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final FragmentActivity f110645b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final d f110646c;

            public a(d dVar, boolean[] zArr, FragmentActivity fragmentActivity) {
                this.f110646c = dVar;
                this.f110644a = zArr;
                this.f110645b = fragmentActivity;
            }

            public final void onCompleted() {
                if (this.f110644a[0]) {
                    return;
                }
                TeenagersModePwdFragment teenagersModePwdFragment = this.f110646c.f110643a;
                FragmentActivity fragmentActivityP3 = teenagersModePwdFragment.p3();
                int i7 = teenagersModePwdFragment.f110628e;
                if (i7 == 6) {
                    com.bilibili.teenagersmode.b.j(fragmentActivityP3, true);
                    Neurons.reportClick(false, "main.teenagermodel.enter-detail.curfew-clock-success.click", new HashMap());
                    teenagersModePwdFragment.f110631i.n(null);
                } else if (i7 == 7) {
                    sD0.i.c("1");
                    com.bilibili.teenagersmode.b.m(fragmentActivityP3, true);
                    com.bilibili.teenagersmode.c cVar = teenagersModePwdFragment.f110631i;
                    cVar.f110570p.c = true;
                    cVar.p(null);
                }
                teenagersModePwdFragment.f110631i.getClass();
                com.bilibili.teenagersmode.c.l(false);
                teenagersModePwdFragment.f110631i.u(teenagersModePwdFragment.getContext());
                teenagersModePwdFragment.nf();
                ToastHelper.showToast(fragmentActivityP3, 2131855986, 0);
                Contract contractAb = ConfigManager.Companion.ab();
                Boolean bool = Boolean.TRUE;
                if (Intrinsics.areEqual(contractAb.get("bgthread_ui_access_detect_enable", bool), bool)) {
                    Thread threadCurrentThread = Thread.currentThread();
                    if (!androidx.appcompat.app.n.a(threadCurrentThread)) {
                        IllegalStateException illegalStateException = new IllegalStateException(F.b("Activity.finish() called from non-UI thread: ", threadCurrentThread, ", 请联系 Jackin"));
                        Neurons.trackT(false, "app.bgthread.ui.access", MapsKt.mapOf(new Pair[]{TuplesKt.to("stacktrace", G.b("Activity.finish() called from non-UI thread: ", threadCurrentThread, "BgThreadUIAccess", illegalStateException, illegalStateException)), TuplesKt.to("threadName", threadCurrentThread.getName())}), 1, new AT0.c(8));
                    }
                }
                fragmentActivityP3.finish();
            }

            public final void onError(@Nullable MossException mossException) {
                this.f110644a[0] = true;
                d dVar = this.f110646c;
                dVar.f110643a.f110625b.j0();
                TeenagersModePwdFragment teenagersModePwdFragment = dVar.f110643a;
                teenagersModePwdFragment.nf();
                boolean z6 = mossException instanceof BusinessException;
                FragmentActivity fragmentActivity = this.f110645b;
                if (!z6 || TextUtils.isEmpty(mossException.getMessage())) {
                    ToastHelper.showToast(fragmentActivity, teenagersModePwdFragment.getString(2131856000), 0);
                } else {
                    ToastHelper.showToast(fragmentActivity, mossException.getMessage(), 0);
                }
            }

            public final /* bridge */ /* synthetic */ void onNext(@Nullable Object obj) {
            }
        }

        public d(TeenagersModePwdFragment teenagersModePwdFragment) {
            this.f110643a = teenagersModePwdFragment;
        }

        @Override // com.bilibili.teenagersmode.ui.TeenagersModePwdFragment.f
        public final void onFinished() {
            TeenagersModePwdFragment teenagersModePwdFragment = this.f110643a;
            FragmentActivity fragmentActivityP3 = teenagersModePwdFragment.p3();
            if (TextUtils.isEmpty(teenagersModePwdFragment.f110627d) || teenagersModePwdFragment.f110627d.length() != 4 || fragmentActivityP3 == null) {
                return;
            }
            int i7 = teenagersModePwdFragment.f110628e;
            if (i7 == 6) {
                C2779a.a("main.teenagermodel.enter-detail.curfew-unclock.click", false);
            } else if (i7 == 7) {
                C2779a.a("main.teenagermodel.enter-detail.overtime-unlock.click", false);
            }
            vD0.d.b(teenagersModePwdFragment.f110627d, teenagersModePwdFragment.lf(teenagersModePwdFragment.f110628e), c.C1213c.f110575a.g(teenagersModePwdFragment.getContext()), false, new a(this, new boolean[]{false}, fragmentActivityP3));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/ui/TeenagersModePwdFragment$e.class */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f110647a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f110648b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f110649c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f110650d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f110651e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final f f110652f;

        public e(String str, String str2, boolean z6, int i7, d dVar) {
            this(str, str2, z6, dVar);
            this.f110650d = true;
            this.f110651e = i7;
        }

        public e(String str, String str2, boolean z6, f fVar) {
            this.f110647a = str;
            this.f110648b = str2;
            this.f110649c = z6;
            this.f110652f = fVar;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/ui/TeenagersModePwdFragment$f.class */
    public interface f {
        void onFinished();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/ui/TeenagersModePwdFragment$g.class */
    public interface g {
        void a(String str);
    }

    public static void jf(TeenagersModePwdFragment teenagersModePwdFragment, MossException mossException) {
        teenagersModePwdFragment.getClass();
        if (!(mossException instanceof BusinessException) || TextUtils.isEmpty(mossException.getMessage())) {
            ToastHelper.showToast(teenagersModePwdFragment.p3(), 2131856000, 0);
        } else {
            ToastHelper.showToast(teenagersModePwdFragment.p3(), mossException.getMessage(), 0);
        }
    }

    public static void kf(TeenagersModePwdFragment teenagersModePwdFragment) {
        TintProgressDialog tintProgressDialog = teenagersModePwdFragment.f110626c;
        if (tintProgressDialog != null) {
            tintProgressDialog.dismiss();
        }
    }

    public final PwdFrom lf(int i7) {
        boolean zG = c.C1213c.f110575a.g(getContext());
        if (i7 == 2) {
            return PwdFrom.TeenagersModifyPwdFrom;
        }
        switch (i7) {
            case 5:
                return zG ? PwdFrom.FamilyQuitFrom : PwdFrom.TeenagersQuitPwdFrom;
            case 6:
                return zG ? PwdFrom.FamilyCurfewFrom : PwdFrom.TeenagersCurfewFrom;
            case 7:
                return zG ? PwdFrom.FamilyAntiAddictionFrom : PwdFrom.TeenagersAntiAddictionFrom;
            case 8:
                return zG ? PwdFrom.FamilyLogOutFrom : PwdFrom.TeenagersLogOutFrom;
            case 9:
            case 10:
                return PwdFrom.TeenagersLoginFrom;
            case 11:
                return PwdFrom.TeenagersSetAge;
            default:
                return PwdFrom.UnknownFrom;
        }
    }

    public final void mf(int i7) {
        Bundle bundleB = B1.a.b(i7, "state");
        bundleB.putString("FirstPwd", this.f110627d);
        if (i7 == 3) {
            bundleB.putString("OldPwd", this.f110627d);
        } else {
            bundleB.putString("OldPwd", this.f110633k);
        }
        bundleB.putString("SecondPwd", this.f110627d);
        bundleB.putInt("source_event", this.f110629f);
        InterfaceC8578a interfaceC8578a = getParentFragment() instanceof InterfaceC8578a ? (InterfaceC8578a) getParentFragment() : p3() instanceof InterfaceC8578a ? (InterfaceC8578a) p3() : null;
        if (interfaceC8578a != null) {
            interfaceC8578a.G(bundleB, TeenagersModePwdFragment.class.getName(), true);
        }
    }

    public final void nf() {
        if (RomUtils.isHuaweiRom()) {
            BLog.i("TeenagersMode", "hideSoftInputInHW");
            this.f110625b.k0();
        }
    }

    public final void of(int i7) {
        FragmentActivity fragmentActivityP3 = p3();
        if (TextUtils.isEmpty(this.f110627d) || this.f110627d.length() != 4 || fragmentActivityP3 == null) {
            return;
        }
        mf(i7);
        this.f110625b.j0();
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        this.f110628e = BundleUtil.getInteger(arguments, "state", new Integer[]{0}).intValue();
        this.f110632j = BundleUtil.getString(arguments, "FirstPwd", new String[]{""});
        this.f110633k = BundleUtil.getString(arguments, "OldPwd", new String[]{""});
        this.f110634l = BundleUtil.getString(arguments, "SecondPwd", new String[]{""});
        this.f110629f = BundleUtil.getInteger(arguments, "source_event", new Integer[]{0}).intValue();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131500144, viewGroup, false);
    }

    @Override // com.bilibili.teenagersmode.ui.ResizeRelativeLayout.a
    public final void onSizeChanged(final int i7, final int i8) {
        ScrollView scrollView;
        if (i8 - i7 >= 0 || (scrollView = this.h) == null) {
            return;
        }
        scrollView.post(new Runnable(this, i8, i7) { // from class: com.bilibili.teenagersmode.ui.v

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TeenagersModePwdFragment f110690a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f110691b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final int f110692c;

            {
                this.f110690a = this;
                this.f110691b = i8;
                this.f110692c = i7;
            }

            @Override // java.lang.Runnable
            public final void run() {
                TeenagersModePwdFragment teenagersModePwdFragment = this.f110690a;
                int i9 = this.f110691b;
                int i10 = this.f110692c;
                ScrollView scrollView2 = teenagersModePwdFragment.h;
                if (scrollView2 == null) {
                    return;
                }
                scrollView2.smoothScrollBy(0, Math.abs(i9 - i10));
            }
        });
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        e eVar;
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) view.findViewById(2131308958);
        TextView textView2 = (TextView) view.findViewById(2131299190);
        TextView textView3 = (TextView) view.findViewById(2131301910);
        this.f110625b = (PasswordView) view.findViewById(2131308705);
        this.f110630g = (ResizeRelativeLayout) view.findViewById(2131306968);
        this.h = (ScrollView) view.findViewById(2131307182);
        this.f110630g.setOnSizeChangedListener(this);
        TintImageView tintImageView = (TintImageView) view.findViewById(2131302505);
        int i7 = this.f110628e;
        boolean z6 = !c.C1213c.f110575a.g(getContext());
        switch (i7) {
            case 0:
                eVar = new e(getString(2131856002), getString(2131856039), false, new f(this) { // from class: com.bilibili.teenagersmode.ui.m

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final TeenagersModePwdFragment f110681a;

                    {
                        this.f110681a = this;
                    }

                    @Override // com.bilibili.teenagersmode.ui.TeenagersModePwdFragment.f
                    public final void onFinished() {
                        this.f110681a.of(1);
                    }
                });
                break;
            case 1:
                eVar = new e(getString(2131855974), "", false, new com.bilibili.search2.result.column.g(this));
                break;
            case 2:
                eVar = new e(getString(2131856010), getString(2131856011), true, new p(this));
                break;
            case 3:
                eVar = new e(getString(2131855993), "", false, new f(this) { // from class: com.bilibili.teenagersmode.ui.q

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final TeenagersModePwdFragment f110685a;

                    {
                        this.f110685a = this;
                    }

                    @Override // com.bilibili.teenagersmode.ui.TeenagersModePwdFragment.f
                    public final void onFinished() {
                        this.f110685a.of(4);
                    }
                });
                break;
            case 4:
                eVar = new e(getString(2131855940), "", false, new r(this));
                break;
            case 5:
                eVar = new e(getString(2131855990), getString(2131855978), true, new f(this) { // from class: com.bilibili.teenagersmode.ui.s

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final TeenagersModePwdFragment f110687a;

                    {
                        this.f110687a = this;
                    }

                    @Override // com.bilibili.teenagersmode.ui.TeenagersModePwdFragment.f
                    public final void onFinished() {
                        TeenagersModePwdFragment teenagersModePwdFragment = this.f110687a;
                        if (teenagersModePwdFragment.p3() == null) {
                            return;
                        }
                        teenagersModePwdFragment.rf(5, new TeenagersModePwdFragment.g(teenagersModePwdFragment) { // from class: com.bilibili.teenagersmode.ui.n

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final TeenagersModePwdFragment f110682a;

                            {
                                this.f110682a = teenagersModePwdFragment;
                            }

                            @Override // com.bilibili.teenagersmode.ui.TeenagersModePwdFragment.g
                            public final void a(String str) {
                                this.f110682a.qf(5, str, false);
                            }
                        });
                    }
                });
                break;
            case 6:
                eVar = new e(getString(2131856023), getString(2131855979), z6, 2131236642, this.f110635m);
                break;
            case 7:
                eVar = new e(getString(2131855997), getString(2131855951), z6, 2131236643, this.f110635m);
                break;
            case 8:
                eVar = new e(getString(2131855966), getString(2131856019), z6, new EF0.i(this));
                break;
            case 9:
                eVar = new e(getString(2131855966), getString(2131855959), true, new t(this));
                break;
            case 10:
            default:
                eVar = null;
                break;
            case 11:
                eVar = new e(getString(2131855966), getString(2131855917), false, new u(this));
                break;
        }
        if (eVar == null) {
            return;
        }
        this.f110625b.setOnInputListener(new a(this, eVar));
        textView.setText(eVar.f110647a);
        if (eVar.f110650d) {
            tintImageView.setVisibility(0);
            tintImageView.setImageDrawable(AppCompatResources.getDrawable(view.getContext(), eVar.f110651e));
        } else {
            tintImageView.setVisibility(8);
        }
        String str = eVar.f110648b;
        if (TextUtils.isEmpty(str)) {
            textView2.setVisibility(8);
        } else {
            textView2.setText(str);
        }
        if (eVar.f110649c) {
            SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(getString(2131855980));
            SpannedUtils.append(getString(2131855981), new b(this), 33, spannableStringBuilderValueOf);
            textView3.setMovementMethod(LinkMovementMethod.getInstance());
            textView3.setLongClickable(false);
            textView3.setText(spannableStringBuilderValueOf);
        } else {
            textView3.setVisibility(8);
        }
        int i8 = this.f110628e;
        if (i8 == 6) {
            Neurons.reportExposure(false, "main.teenagermodel.enter-detail.curfew.show", new HashMap());
            com.bilibili.teenagersmode.b.j(p3(), false);
        } else if (i8 == 7) {
            sD0.i.b("1");
        } else if (i8 == 9) {
            Neurons.reportExposure(false, "main.teenagermodel.enter-detail.logon-limit.show");
        } else if (i8 == 8) {
            Neurons.reportExposure(false, "main.teenagermodel.enter-detail.logout-limit.show", new HashMap());
        }
    }

    public final void pf() {
        FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 == null || fragmentActivityP3.isFinishing()) {
            return;
        }
        TintProgressDialog tintProgressDialog = this.f110626c;
        if (tintProgressDialog == null) {
            this.f110626c = TintProgressDialog.show(p3(), "", getString(2131855989), true, false);
        } else {
            tintProgressDialog.show();
        }
    }

    public final void qf(int i7, String str, boolean z6) {
        FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 == null) {
            return;
        }
        pf();
        PwdFrom pwdFromLf = lf(i7);
        PwdFrom pwdFromLf2 = lf(i7);
        z zVar = new z(this, new boolean[]{false}, z6, pwdFromLf, fragmentActivityP3);
        vD0.d dVar = vD0.d.a;
        UpdateStatusReq updateStatusReqBuild = UpdateStatusReq.newBuilder().setPwd(str).setSwitch(z6).setPwdFrom(pwdFromLf2).setDeviceToken(BiliIds.buvidServer()).build();
        vD0.d.a.getClass();
        vD0.d.b.updateStatus(updateStatusReqBuild, vD0.d.a(zVar));
    }

    public final void rf(int i7, g gVar) {
        FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 == null) {
            return;
        }
        String str = this.f110627d;
        pf();
        vD0.d.b(str, lf(i7), c.C1213c.f110575a.g(fragmentActivityP3), false, new c(this, new boolean[]{false}, gVar, str));
    }
}
