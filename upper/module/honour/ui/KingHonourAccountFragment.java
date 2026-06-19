package com.bilibili.upper.module.honour.ui;

import FF0.h;
import Nj.v;
import Re.c;
import TE0.b;
import UD.u0;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.Observer;
import com.bilibili.api.base.Config;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.ImageRequestBuilder;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.image2.view.InnerInsulateImageView;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.lib.ui.mixin.Flag;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.okretro.call.BiliCall;
import com.bilibili.upper.module.honour.bean.KingHonourAccountBean;
import com.bilibili.upper.module.honour.bean.KingHonourResponseBean;
import com.bilibili.upper.module.honour.net.KingHonourApiService;
import com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import dI0.C6795c;
import dI0.C6797e;
import dI0.TextureViewSurfaceTextureListenerC6796d;
import eI0.C6921b;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/honour/ui/KingHonourAccountFragment.class */
@StabilityInferred(parameters = 0)
public final class KingHonourAccountFragment extends BaseFragment implements View.OnClickListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextureView f113215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f113216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f113217e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f113218f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public CheckBox f113219g;
    public LinearLayout h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public BiliImageView f113220i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public BiliImageView f113221j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public BiliImageView f113222k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public BiliImageView f113223l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f113224m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public KingHonourAccountBean.MinProgramBean f113225n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f113229r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f113230s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ImageView f113231t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public RelativeLayout f113232u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f113233v;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f113214b = LazyKt.lazy(new v(this, 3));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f113226o = true;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public String f113227p = "";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f113228q = true;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final String f113234w = "http://i0.hdslb.com/bfs/creative/f145c616ff77c421acb68f4b913302260331ba7a.jpg";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final String f113235x = "http://i0.hdslb.com/bfs/creative/88de6da29b7e685a5949a7492504a5674d278c9d.png";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final String f113236y = "http://i0.hdslb.com/bfs/creative/098cd14293edd43909fbafef4a6a6e21f94bae9a.png";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final String f113237z = "http://i0.hdslb.com/bfs/creative/215f5d68778d4d7c3d8ed27f054100aa22ea6a76.png";

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @NotNull
    public final String f113213A = "wxcb8d4298c6a09bcb";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/honour/ui/KingHonourAccountFragment$a.class */
    public static final /* synthetic */ class a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f113238a;

        public a(c cVar) {
            this.f113238a = cVar;
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
            return this.f113238a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f113238a.invoke(obj);
        }
    }

    public final com.bilibili.upper.module.honour.vm.c jf() {
        return (com.bilibili.upper.module.honour.vm.c) this.f113214b.getValue();
    }

    public final void kf() throws UnsupportedEncodingException {
        boolean zSendReq;
        if (this.f113225n == null) {
            BLog.e("KingHonourAccountFragment", "account data is null");
            return;
        }
        jf().K0();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f113225n.basePath);
        stringBuffer.append("?");
        stringBuffer.append("t=" + URLEncoder.encode(this.f113225n.timestamp, "utf-8") + "&");
        stringBuffer.append("gameIdList=" + URLEncoder.encode(this.f113225n.gameIdList, "utf-8") + "&");
        stringBuffer.append("livePlatId=" + URLEncoder.encode(this.f113225n.livePlatId, "utf-8") + "&");
        stringBuffer.append("sig=" + URLEncoder.encode(this.f113225n.sign, "utf-8") + "&");
        stringBuffer.append("nickName=" + URLEncoder.encode(this.f113225n.nickName, "utf-8") + "&");
        stringBuffer.append("faceUrl=" + URLEncoder.encode(this.f113225n.face, "utf-8") + "&");
        stringBuffer.append("gameAuthScene=" + URLEncoder.encode(this.f113225n.gameAuthScene, "utf-8") + "&");
        stringBuffer.append("code=" + URLEncoder.encode(this.f113225n.code, "utf-8"));
        BLog.e("KingHonourAccountFragment", "url is " + ((Object) stringBuffer));
        Context contextRequireContext = requireContext();
        String str = this.f113225n.originId;
        String string = stringBuffer.toString();
        try {
            IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(contextRequireContext, this.f113213A);
            WXLaunchMiniProgram.Req req = new WXLaunchMiniProgram.Req();
            req.userName = str;
            if (string != null && !StringsKt.isBlank(string)) {
                req.path = string;
            }
            req.miniprogramType = 0;
            req.extData = "";
            zSendReq = iwxapiCreateWXAPI.sendReq(req);
        } catch (Exception e7) {
            BLog.e("Ad.WxOpenHelper#openWXMiniProgramInternal", e7);
            zSendReq = false;
        }
        if (Config.isDebuggable()) {
            Y0.c.c("is Success ", "KingHonourAccountFragment", zSendReq);
        }
        this.f113233v = true;
    }

    public final void lf() {
        new C6921b(requireContext(), new u0(this, 3), true).show();
    }

    public final void mf() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        if (!jf().f113381b.f17106a.isPlaying()) {
            jf().L0(this.f113227p);
        }
        int color = ContextCompat.getColor(context, 2131104161);
        String string = getString(2131851377);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(color), string.length() - 12, string.length(), 33);
        spannableStringBuilder.setSpan(new C6797e(this), string.length() - 12, string.length(), 33);
        TextView textView = this.f113218f;
        TextView textView2 = textView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mProtocolView");
            textView2 = null;
        }
        textView2.setText(spannableStringBuilder);
        TextView textView3 = this.f113218f;
        TextView textView4 = textView3;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mProtocolView");
            textView4 = null;
        }
        textView4.setHighlightColor(0);
        TextView textView5 = this.f113218f;
        TextView textView6 = textView5;
        if (textView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mProtocolView");
            textView6 = null;
        }
        textView6.setMovementMethod(LinkMovementMethod.getInstance());
        if (this.f113228q || !this.f113229r) {
            TextView textView7 = this.f113217e;
            TextView textView8 = textView7;
            if (textView7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTipsView");
                textView8 = null;
            }
            textView8.setText(getString(2131851418));
            TextView textView9 = this.f113216d;
            if (textView9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBindingView");
                textView9 = null;
            }
            textView9.setText(getString(2131851217));
            return;
        }
        TextView textView10 = this.f113217e;
        TextView textView11 = textView10;
        if (textView10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTipsView");
            textView11 = null;
        }
        textView11.setText(getString(2131850993));
        TextView textView12 = this.f113216d;
        if (textView12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBindingView");
            textView12 = null;
        }
        textView12.setText(getString(2131850904));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) throws UnsupportedEncodingException {
        if (view == null) {
            return;
        }
        int id = view.getId();
        CheckBox checkBox = null;
        if (id == 2131315787) {
            CheckBox checkBox2 = this.f113219g;
            if (checkBox2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mProtocolCheck");
            } else {
                checkBox = checkBox2;
            }
            if (checkBox.isChecked()) {
                kf();
            } else {
                lf();
            }
            b.f24088a.getClass();
            b.a("1");
            return;
        }
        if (id == 2131315788) {
            CheckBox checkBox3 = this.f113219g;
            if (checkBox3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mProtocolCheck");
                checkBox3 = null;
            }
            if (checkBox3.isChecked()) {
                kf();
            } else {
                lf();
            }
            b.f24088a.getClass();
            b.a("2");
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131500627, viewGroup, false);
    }

    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, com.bilibili.lib.ui.mixin.IFragmentShowHide
    public final void onFragmentHide(@NotNull Flag flag) {
        super.onFragmentHide(flag);
        jf().K0();
    }

    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, com.bilibili.lib.ui.mixin.IFragmentShowHide
    public final void onFragmentShow(@NotNull Flag flag) {
        super.onFragmentShow(flag);
        jf().M0();
        BLog.e("KingHonourAccountFragment", "onFragmentShow");
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.f113233v) {
            Context contextRequireContext = requireContext();
            BiliCall<GeneralResponse<KingHonourResponseBean<KingHonourAccountBean>>> bindingContent = ((KingHonourApiService) ServiceGenerator.createService(KingHonourApiService.class)).getBindingContent();
            if (bindingContent != null) {
                bindingContent.enqueue(new C6795c(this, contextRequireContext));
            }
            this.f113233v = false;
        }
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f113215c = (TextureView) view.findViewById(2131315816);
        this.f113216d = (TextView) view.findViewById(2131315787);
        this.f113218f = (TextView) view.findViewById(2131315792);
        this.f113219g = (CheckBox) view.findViewById(2131315793);
        this.h = (LinearLayout) view.findViewById(2131304677);
        this.f113220i = view.findViewById(2131315786);
        this.f113217e = (TextView) view.findViewById(2131315794);
        this.f113221j = view.findViewById(2131315802);
        this.f113222k = view.findViewById(2131315804);
        this.f113223l = view.findViewById(2131315803);
        this.f113224m = (TextView) view.findViewById(2131315788);
        this.f113231t = (ImageView) view.findViewById(2131315815);
        this.f113232u = (RelativeLayout) view.findViewById(2131304676);
        TextureView textureView = this.f113215c;
        TextureView textureView2 = textureView;
        if (textureView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayView");
            textureView2 = null;
        }
        textureView2.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC6796d(this));
        TextView textView = this.f113216d;
        TextView textView2 = textView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBindingView");
            textView2 = null;
        }
        textView2.setOnClickListener(this);
        TextView textView3 = this.f113218f;
        TextView textView4 = textView3;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mProtocolView");
            textView4 = null;
        }
        textView4.setOnClickListener(this);
        TextView textView5 = this.f113224m;
        TextView textView6 = textView5;
        if (textView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBindingOk");
            textView6 = null;
        }
        textView6.setOnClickListener(this);
        TextureView textureView3 = this.f113215c;
        TextureView textureView4 = textureView3;
        if (textureView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayView");
            textureView4 = null;
        }
        textureView4.setOnClickListener(new h(3, this));
        jf().f113383d.observe(getViewLifecycleOwner(), new a(new c(this, 3)));
        b.f24088a.getClass();
        Neurons.reportExposure$default(false, "creation.wangzhezhanbao.account-associate.0.show", (Map) null, (List) null, 12, (Object) null);
        Bundle arguments = getArguments();
        boolean z6 = true;
        if (arguments != null) {
            Serializable serializable = arguments.getSerializable("king_honour_account_data");
            this.f113225n = serializable instanceof KingHonourAccountBean.MinProgramBean ? (KingHonourAccountBean.MinProgramBean) serializable : null;
            this.f113226o = arguments.getBoolean("king_honour_from_add", true);
            this.f113227p = arguments.getString("king_honour_video_url", "");
            this.f113228q = arguments.getBoolean("king_honour_user_is_grant", true);
            this.f113229r = arguments.getBoolean("king_honour_user_is_bind", false);
            z6 = arguments.getBoolean("king_honour_account_bg", true);
            this.f113230s = arguments.getBoolean("king_honour_is_from_game_factory", false);
        }
        if (z6) {
            InnerInsulateImageView innerInsulateImageView = this.f113220i;
            InnerInsulateImageView innerInsulateImageView2 = innerInsulateImageView;
            if (innerInsulateImageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBackground");
                innerInsulateImageView2 = null;
            }
            innerInsulateImageView2.setVisibility(0);
            ImageRequestBuilder imageRequestBuilderUrl = BiliImageLoader.INSTANCE.with(this).url(this.f113234w);
            BiliImageView biliImageView = this.f113220i;
            BiliImageView biliImageView2 = biliImageView;
            if (biliImageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBackground");
                biliImageView2 = null;
            }
            imageRequestBuilderUrl.into(biliImageView2);
        } else {
            InnerInsulateImageView innerInsulateImageView3 = this.f113220i;
            InnerInsulateImageView innerInsulateImageView4 = innerInsulateImageView3;
            if (innerInsulateImageView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBackground");
                innerInsulateImageView4 = null;
            }
            innerInsulateImageView4.setVisibility(4);
        }
        BiliImageLoader biliImageLoader = BiliImageLoader.INSTANCE;
        ImageRequestBuilder imageRequestBuilderUrl2 = biliImageLoader.with(this).url(this.f113235x);
        BiliImageView biliImageView3 = this.f113221j;
        BiliImageView biliImageView4 = biliImageView3;
        if (biliImageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFirstStep");
            biliImageView4 = null;
        }
        imageRequestBuilderUrl2.into(biliImageView4);
        ImageRequestBuilder imageRequestBuilderUrl3 = biliImageLoader.with(this).url(this.f113236y);
        BiliImageView biliImageView5 = this.f113222k;
        BiliImageView biliImageView6 = biliImageView5;
        if (biliImageView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSecondStep");
            biliImageView6 = null;
        }
        imageRequestBuilderUrl3.into(biliImageView6);
        ImageRequestBuilder imageRequestBuilderUrl4 = biliImageLoader.with(this).url(this.f113237z);
        BiliImageView biliImageView7 = this.f113223l;
        if (biliImageView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mThirdStep");
            biliImageView7 = null;
        }
        imageRequestBuilderUrl4.into(biliImageView7);
        if (!this.f113226o) {
            mf();
            return;
        }
        Context contextRequireContext = requireContext();
        BiliCall<GeneralResponse<KingHonourResponseBean<KingHonourAccountBean>>> bindingContent = ((KingHonourApiService) ServiceGenerator.createService(KingHonourApiService.class)).getBindingContent();
        if (bindingContent != null) {
            bindingContent.enqueue(new C6795c(this, contextRequireContext));
        }
    }
}
