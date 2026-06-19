package com.bilibili.upper.module.honour.ui;

import GO.q;
import P50.v;
import R50.r;
import Ri0.RunnableC2847c;
import UD.M0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import bI0.i;
import com.bilibili.base.BiliContext;
import com.bilibili.base.connectivity.Connectivity;
import com.bilibili.biligame.ui.gift.v3.dialog.B;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.foundation.FoundationAlias;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.sharewrapper.basic.ThirdPartyExtraBuilder;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.BaseAppCompatActivity;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.bilibili.studio.editor.moudle.templatev2.bean.EditorTemplateTabItemBean;
import com.bilibili.studio.editor.timeline.UpperLiveWindowExt;
import com.bilibili.studio.editor.timeline.UpperTimeline;
import com.bilibili.studio.videoeditor.C6600h;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import com.bilibili.studio.videoeditor.extension.ActivityExtKt;
import com.bilibili.studio.videoeditor.nvsstreaming.EditProxyUtils;
import com.bilibili.studio.videoeditor.template.BiliTemplateEngineManager;
import com.bilibili.upper.module.honour.bean.KingHonourDownloadBean;
import com.bilibili.upper.module.honour.bean.KingHonourPreviewBean;
import com.bilibili.upper.module.honour.bean.KingHonourPublishTemplateBean;
import com.bilibili.upper.module.honour.bean.KingHonourTopicBean;
import com.bilibili.upper.module.honour.bean.KingHonourVideoBean;
import com.bilibili.upper.module.honour.publish.e;
import com.bilibili.upper.module.honour.ui.KingHonourPublishActivity;
import com.bilibili.upper.module.honour.utils.b;
import com.bilibili.upper.module.honour.utils.p;
import com.bilibili.upper.module.honour.vm.d;
import com.google.android.material.tabs.TabLayout;
import dI0.C6808p;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/honour/ui/KingHonourPublishActivity.class */
@StabilityInferred(parameters = 0)
public final class KingHonourPublishActivity extends BaseAppCompatActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public static final int f113273d1 = 0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public TabLayout f113274B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public ImageView f113275C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public RecyclerView f113276D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @Nullable
    public List<String> f113277E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public FrameLayout f113278F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public TextView f113279G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public ImageView f113280H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public TextView f113281I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public LinearLayout f113282J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public RelativeLayout f113283K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public TextView f113284L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public EditText f113285M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public CheckBox f113286N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public ImageView f113287O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public TextView f113288P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public TextView f113289Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public LinearLayout f113290R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public ImageView f113291S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    @Nullable
    public UpperLiveWindowExt f113292T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    @Nullable
    public C6600h f113293U;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    @Nullable
    public KingHonourPreviewBean f113295W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public int f113296X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f113298Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public boolean f113300Z;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    public RecyclerView f113301Z0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f113302a0;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public boolean f113304b1;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    @Nullable
    public BiliTemplateEngineManager f113309v0;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    @NotNull
    public final e f113294V = new e(this);

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @NotNull
    public final HashSet<Integer> f113305c0 = new HashSet<>();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final HashSet<String> f113307p0 = new HashSet<>();

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public ArrayList<Integer> f113308r0 = new ArrayList<>();

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    @NotNull
    public final String f113297X0 = "http://member.bilibili.com/studio/convention/?navhide=1";

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    @NotNull
    public final Lazy f113299Y0 = LazyKt.lazy(new com.bilibili.ad.adview.story.iaa.b(this, 3));

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    @NotNull
    public final i f113303a1 = new i();

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    @NotNull
    public final a f113306c1 = new a(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/honour/ui/KingHonourPublishActivity$a.class */
    public static final class a implements C6600h.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f113310a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f113311b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final KingHonourPublishActivity f113312c;

        public a(KingHonourPublishActivity kingHonourPublishActivity) {
            this.f113312c = kingHonourPublishActivity;
        }

        @Override // com.bilibili.studio.videoeditor.C6600h.a
        public final void a() {
            BLog.e("KingHonourManager", " load engine success");
            KingHonourPublishActivity kingHonourPublishActivity = this.f113312c;
            kingHonourPublishActivity.f113304b1 = false;
            kingHonourPublishActivity.runOnUiThread(new RunnableC2847c(kingHonourPublishActivity));
            d(1, 0);
        }

        @Override // com.bilibili.studio.videoeditor.C6600h.a
        public final void b() {
            BLog.e("KingHonourManager", " load engine cancel");
            this.f113312c.f113304b1 = false;
        }

        @Override // com.bilibili.studio.videoeditor.C6600h.a
        public final void c() {
            com.bilibili.studio.editor.timeline.i iVar;
            UpperTimeline upperTimeline;
            BLog.e("KingHonourManager", " load engine failed");
            final KingHonourPublishActivity kingHonourPublishActivity = this.f113312c;
            kingHonourPublishActivity.f113304b1 = false;
            kingHonourPublishActivity.runOnUiThread(new Runnable(kingHonourPublishActivity) { // from class: dI0.x

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final KingHonourPublishActivity f116420a;

                {
                    this.f116420a = kingHonourPublishActivity;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    KingHonourPublishActivity kingHonourPublishActivity2 = this.f116420a;
                    int i7 = KingHonourPublishActivity.f113273d1;
                    kingHonourPublishActivity2.R6(1, false);
                }
            });
            C6600h c6600h = kingHonourPublishActivity.f113293U;
            if (c6600h != null && (iVar = c6600h.f109672c) != null && (upperTimeline = iVar.f108300b) != null) {
                upperTimeline.clearData();
            }
            d(0, Connectivity.isConnected(Connectivity.getActiveNetworkInfo(kingHonourPublishActivity)) ? 5 : 1);
        }

        public final void d(int i7, int i8) {
            float fCurrentTimeMillis = (System.currentTimeMillis() - this.f113311b) / 1000;
            int i9 = this.f113310a;
            KingHonourPublishActivity kingHonourPublishActivity = this.f113312c;
            if (i9 != 1) {
                if (i9 != 2) {
                    return;
                }
                TE0.b bVar = TE0.b.f24088a;
                boolean z6 = kingHonourPublishActivity.f113302a0;
                bVar.getClass();
                TE0.b.n0(i7, fCurrentTimeMillis, i8, z6);
                return;
            }
            TE0.b bVar2 = TE0.b.f24088a;
            boolean z7 = kingHonourPublishActivity.f113302a0;
            HashMap mapA = VF0.b.a(bVar2);
            mapA.put(EditCustomizeSticker.TAG_DURATION, String.valueOf(fCurrentTimeMillis));
            mapA.put(ThirdPartyExtraBuilder.KEY_RESULT, String.valueOf(i7));
            mapA.put("failed_reason", String.valueOf(i8));
            mapA.put("is_game", z7 ? "1" : "0");
            Unit unit = Unit.INSTANCE;
            Neurons.reportExposure$default(false, "creation.wangzhezhanbao.template.template-switch-result.show", mapA, (List) null, 8, (Object) null);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/honour/ui/KingHonourPublishActivity$b.class */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final eI0.c f113313a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final KingHonourPublishActivity f113314b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f113315c;

        public b(eI0.c cVar, KingHonourPublishActivity kingHonourPublishActivity, long j7) {
            this.f113313a = cVar;
            this.f113314b = kingHonourPublishActivity;
            this.f113315c = j7;
        }

        public final void a(String str, boolean z6) {
            this.f113313a.dismiss();
            if (z6 && str != null) {
                ToastHelper.showToastLong(this.f113314b, str);
            }
            String str2 = str;
            if (str == null) {
                str2 = "";
            }
            b(0, str2);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x00ce  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void b(int r8, java.lang.String r9) {
            /*
                Method dump skipped, instruction units count: 325
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.honour.ui.KingHonourPublishActivity.b.b(int, java.lang.String):void");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/honour/ui/KingHonourPublishActivity$c.class */
    public static final /* synthetic */ class c implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function1 f113316a;

        public c(Function1 function1) {
            this.f113316a = function1;
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
            return this.f113316a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f113316a.invoke(obj);
        }
    }

    public static final void P6(KingHonourPublishActivity kingHonourPublishActivity, TabLayout.Tab tab) {
        List<KingHonourVideoBean> list;
        KingHonourVideoBean kingHonourVideoBean;
        String str;
        List<KingHonourVideoBean> list2;
        List<KingHonourVideoBean> list3;
        kingHonourPublishActivity.getClass();
        if (tab.getId() == -2) {
            ArrayList arrayList = new ArrayList();
            KingHonourPreviewBean kingHonourPreviewBean = kingHonourPublishActivity.f113295W;
            if (kingHonourPreviewBean != null && (list3 = kingHonourPreviewBean.beautyLights) != null) {
                Iterator<T> it = list3.iterator();
                while (it.hasNext()) {
                    arrayList.add(((KingHonourVideoBean) it.next()).videoUrl);
                }
            }
            kingHonourPublishActivity.Q6().f113388b.setValue(arrayList);
            kingHonourPublishActivity.Q6().f113390d.setValue(String.valueOf(tab.getId()));
            kingHonourPublishActivity.f113296X = tab.getPosition();
        } else {
            KingHonourPreviewBean kingHonourPreviewBean2 = kingHonourPublishActivity.f113295W;
            if (tab.getPosition() >= ((kingHonourPreviewBean2 == null || (list2 = kingHonourPreviewBean2.singleLights) == null) ? 0 : list2.size())) {
                return;
            }
            MutableLiveData<List<String>> mutableLiveData = kingHonourPublishActivity.Q6().f113388b;
            ArrayList arrayList2 = new ArrayList();
            KingHonourPreviewBean kingHonourPreviewBean3 = kingHonourPublishActivity.f113295W;
            if (kingHonourPreviewBean3 != null && (list = kingHonourPreviewBean3.singleLights) != null && (kingHonourVideoBean = (KingHonourVideoBean) CollectionsKt.getOrNull(list, tab.getPosition() - 1)) != null && (str = kingHonourVideoBean.videoUrl) != null) {
                arrayList2.add(str);
            }
            mutableLiveData.setValue(arrayList2);
            kingHonourPublishActivity.Q6().f113390d.setValue(String.valueOf(tab.getId()));
            kingHonourPublishActivity.f113296X = tab.getPosition();
        }
        LinearLayout linearLayout = kingHonourPublishActivity.f113290R;
        LinearLayout linearLayout2 = linearLayout;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCustomLayout");
            linearLayout2 = null;
        }
        if (!linearLayout2.isEnabled()) {
            TextView textView = kingHonourPublishActivity.f113289Q;
            TextView textView2 = textView;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCustomView");
                textView2 = null;
            }
            Activity activity = BiliContext.topActivity();
            boolean zIsActive = ActivityExtKt.isActive(activity);
            Context fapp = activity;
            if (!zIsActive) {
                fapp = FoundationAlias.getFapp();
            }
            textView2.setText(fapp.getString(2131849790));
            TextView textView3 = kingHonourPublishActivity.f113289Q;
            TextView textView4 = textView3;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCustomView");
                textView4 = null;
            }
            textView4.setTextColor(Color.parseColor("#9499A0"));
            LinearLayout linearLayout3 = kingHonourPublishActivity.f113290R;
            LinearLayout linearLayout4 = linearLayout3;
            if (linearLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCustomLayout");
                linearLayout4 = null;
            }
            linearLayout4.setEnabled(true);
            ImageView imageView = kingHonourPublishActivity.f113291S;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCustomImage");
                imageView = null;
            }
            imageView.setVisibility(8);
        }
        TE0.b bVar = TE0.b.f24088a;
        String strValueOf = String.valueOf(tab.getText());
        int position = tab.getPosition();
        boolean z6 = kingHonourPublishActivity.f113302a0;
        bVar.getClass();
        TE0.b.l0(position, strValueOf, z6);
    }

    public final d Q6() {
        return (d) this.f113299Y0.getValue();
    }

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
    public final void R6(int i7, boolean z6) {
        v vVar = this.f113292T;
        if (vVar != null) {
            vVar.setVisibility(z6 ? 0 : 8);
        }
        T6(i7);
    }

    public final void S6(KingHonourPublishTemplateBean kingHonourPublishTemplateBean) {
        BLog.e("KingHonourManager", "start load engine");
        List<String> value = Q6().f113388b.getValue();
        if (value == null || value.isEmpty()) {
            BLog.e("KingHonourManager", "current tab video url is null");
            this.f113304b1 = false;
            return;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (kingHonourPublishTemplateBean != null) {
            EditorTemplateTabItemBean editorTemplateTabItemBean = new EditorTemplateTabItemBean();
            editorTemplateTabItemBean.id = kingHonourPublishTemplateBean.id;
            editorTemplateTabItemBean.name = kingHonourPublishTemplateBean.name;
            editorTemplateTabItemBean.downloadUrl = kingHonourPublishTemplateBean.downloadUrl;
            objectRef.element = editorTemplateTabItemBean;
        }
        a aVar = this.f113306c1;
        aVar.f113310a = 2;
        aVar.f113311b = System.currentTimeMillis();
        long jCurrentTimeMillis = System.currentTimeMillis();
        final B b7 = new B(this, objectRef);
        final C6808p c6808p = new C6808p(this, jCurrentTimeMillis);
        ArrayList arrayList = new ArrayList();
        List<String> value2 = Q6().f113388b.getValue();
        if (value2 != null) {
            int i7 = 0;
            for (Object obj : value2) {
                if (i7 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                arrayList.add(new KingHonourDownloadBean((String) obj, i7, false, 4, null));
                i7++;
            }
        }
        com.bilibili.upper.module.honour.utils.b bVar = com.bilibili.upper.module.honour.utils.b.f113332a;
        bVar.d(arrayList);
        com.bilibili.upper.module.honour.utils.b.f113337f = new b.a(c6808p, b7) { // from class: dI0.s

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final C6808p f116414a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final com.bilibili.biligame.ui.gift.v3.dialog.B f116415b;

            {
                this.f116414a = c6808p;
                this.f116415b = b7;
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Comparator] */
            @Override // com.bilibili.upper.module.honour.utils.b.a
            public final void a(List list) {
                int i8 = KingHonourPublishActivity.f113273d1;
                BLog.e("KingHonourPublish", "download success");
                ArrayList arrayList2 = new ArrayList();
                Iterator it = CollectionsKt.sortedWith(list, (Comparator) new Object()).iterator();
                while (it.hasNext()) {
                    arrayList2.add(((KingHonourDownloadBean) it.next()).getUrl());
                }
                if (!arrayList2.isEmpty()) {
                    this.f116415b.invoke(arrayList2);
                } else {
                    this.f116414a.invoke(Boolean.FALSE);
                }
            }
        };
        bVar.e();
    }

    public final void T6(int i7) {
        Q6().f113392f.setValue(Integer.valueOf(i7));
        if (i7 == 1) {
            LinearLayout linearLayout = this.f113282J;
            LinearLayout linearLayout2 = linearLayout;
            if (linearLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLoadingLayout");
                linearLayout2 = null;
            }
            linearLayout2.setVisibility(8);
            RelativeLayout relativeLayout = this.f113283K;
            RelativeLayout relativeLayout2 = relativeLayout;
            if (relativeLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLoadingErrorLayout");
                relativeLayout2 = null;
            }
            relativeLayout2.setVisibility(0);
            ImageView imageView = this.f113287O;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayIcon");
                imageView = null;
            }
            imageView.setVisibility(8);
            return;
        }
        if (i7 == 2) {
            LinearLayout linearLayout3 = this.f113282J;
            LinearLayout linearLayout4 = linearLayout3;
            if (linearLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLoadingLayout");
                linearLayout4 = null;
            }
            linearLayout4.setVisibility(0);
            RelativeLayout relativeLayout3 = this.f113283K;
            RelativeLayout relativeLayout4 = relativeLayout3;
            if (relativeLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLoadingErrorLayout");
                relativeLayout4 = null;
            }
            relativeLayout4.setVisibility(8);
            ImageView imageView2 = this.f113287O;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayIcon");
                imageView2 = null;
            }
            imageView2.setVisibility(8);
            return;
        }
        if (i7 == 3) {
            LinearLayout linearLayout5 = this.f113282J;
            LinearLayout linearLayout6 = linearLayout5;
            if (linearLayout5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLoadingLayout");
                linearLayout6 = null;
            }
            linearLayout6.setVisibility(8);
            RelativeLayout relativeLayout5 = this.f113283K;
            RelativeLayout relativeLayout6 = relativeLayout5;
            if (relativeLayout5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLoadingErrorLayout");
                relativeLayout6 = null;
            }
            relativeLayout6.setVisibility(8);
            ImageView imageView3 = this.f113287O;
            if (imageView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayIcon");
                imageView3 = null;
            }
            imageView3.setVisibility(8);
            return;
        }
        if (i7 != 4) {
            LinearLayout linearLayout7 = this.f113282J;
            LinearLayout linearLayout8 = linearLayout7;
            if (linearLayout7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLoadingLayout");
                linearLayout8 = null;
            }
            linearLayout8.setVisibility(8);
            RelativeLayout relativeLayout7 = this.f113283K;
            RelativeLayout relativeLayout8 = relativeLayout7;
            if (relativeLayout7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLoadingErrorLayout");
                relativeLayout8 = null;
            }
            relativeLayout8.setVisibility(8);
            ImageView imageView4 = this.f113287O;
            if (imageView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayIcon");
                imageView4 = null;
            }
            imageView4.setVisibility(8);
            return;
        }
        LinearLayout linearLayout9 = this.f113282J;
        LinearLayout linearLayout10 = linearLayout9;
        if (linearLayout9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLoadingLayout");
            linearLayout10 = null;
        }
        linearLayout10.setVisibility(8);
        RelativeLayout relativeLayout9 = this.f113283K;
        RelativeLayout relativeLayout10 = relativeLayout9;
        if (relativeLayout9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLoadingErrorLayout");
            relativeLayout10 = null;
        }
        relativeLayout10.setVisibility(8);
        ImageView imageView5 = this.f113287O;
        if (imageView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayIcon");
            imageView5 = null;
        }
        imageView5.setVisibility(0);
    }

    public final void U6(int i7, KingHonourPublishTemplateBean kingHonourPublishTemplateBean, Long l7, String str) {
        int i8;
        String str2;
        ArrayList<KingHonourTopicBean> arrayList;
        KingHonourTopicBean kingHonourTopicBean;
        KingHonourTopicBean next;
        if (i7 != 1) {
            if (i7 == 2) {
                if (l7 == null || str == null) {
                    return;
                }
                i iVar = this.f113303a1;
                long jLongValue = l7.longValue();
                int iN = iVar.N(l7, str, 2);
                if (iN >= 0) {
                    iVar.Q(iN);
                } else {
                    ArrayList<KingHonourTopicBean> arrayList2 = iVar.f56458e;
                    if (arrayList2 != null) {
                        Iterator<KingHonourTopicBean> it = arrayList2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            } else {
                                next = it.next();
                                if (next.sourceFrom == 2) {
                                    break;
                                }
                            }
                        }
                        kingHonourTopicBean = next;
                    } else {
                        kingHonourTopicBean = null;
                    }
                    KingHonourTopicBean kingHonourTopicBean2 = new KingHonourTopicBean();
                    iVar.f56456c = kingHonourTopicBean2;
                    kingHonourTopicBean2.topicId = jLongValue;
                    kingHonourTopicBean2.topicName = str;
                    kingHonourTopicBean2.sourceFrom = 2;
                    if (kingHonourTopicBean != null) {
                        ArrayList<KingHonourTopicBean> arrayList3 = iVar.f56458e;
                        int iIndexOf = 0;
                        if (arrayList3 != null) {
                            iIndexOf = arrayList3.indexOf(kingHonourTopicBean);
                        }
                        ArrayList<KingHonourTopicBean> arrayList4 = iVar.f56458e;
                        if (arrayList4 != null) {
                            arrayList4.set(iIndexOf, kingHonourTopicBean2);
                        }
                        iVar.Q(iIndexOf);
                    } else {
                        ArrayList<KingHonourTopicBean> arrayList5 = iVar.f56458e;
                        if (arrayList5 != null) {
                            arrayList5.add(0, kingHonourTopicBean2);
                        }
                        iVar.Q(0);
                        iVar.notifyDataSetChanged();
                    }
                }
                int i9 = iVar.f56454a;
                RecyclerView recyclerView = this.f113301Z0;
                if (recyclerView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mRvTopicList");
                    recyclerView = null;
                }
                recyclerView.scrollToPosition(i9);
            }
        } else {
            if (kingHonourPublishTemplateBean == null) {
                return;
            }
            i iVar2 = this.f113303a1;
            long j7 = kingHonourPublishTemplateBean.topicId;
            String str3 = kingHonourPublishTemplateBean.topicName;
            KingHonourTopicBean kingHonourTopicBeanP = iVar2.P(Integer.valueOf(iVar2.f56454a));
            ArrayList<KingHonourTopicBean> arrayList6 = iVar2.f56458e;
            if (arrayList6 != null) {
                arrayList6.clear();
            }
            ArrayList<KingHonourTopicBean> arrayList7 = iVar2.f56455b;
            if (arrayList7 != null && (arrayList = iVar2.f56458e) != null) {
                arrayList.addAll(arrayList7);
            }
            int iN2 = iVar2.N(Long.valueOf(j7), str3, 1);
            if (j7 > 0 && str3 != null && str3.length() != 0) {
                KingHonourTopicBean kingHonourTopicBean3 = new KingHonourTopicBean();
                kingHonourTopicBean3.topicId = j7;
                kingHonourTopicBean3.topicName = str3;
                kingHonourTopicBean3.sourceFrom = 0;
                if (iN2 == -1) {
                    ArrayList<KingHonourTopicBean> arrayList8 = iVar2.f56458e;
                    if (arrayList8 != null) {
                        arrayList8.add(0, kingHonourTopicBean3);
                    }
                } else if (iN2 > 0) {
                    ArrayList<KingHonourTopicBean> arrayList9 = iVar2.f56458e;
                    if (arrayList9 != null) {
                        arrayList9.remove(iN2);
                    }
                    ArrayList<KingHonourTopicBean> arrayList10 = iVar2.f56458e;
                    if (arrayList10 != null) {
                        arrayList10.add(0, kingHonourTopicBean3);
                    }
                }
            }
            KingHonourTopicBean kingHonourTopicBean4 = iVar2.f56456c;
            if (kingHonourTopicBean4 != null) {
                int iN3 = iVar2.N(Long.valueOf(kingHonourTopicBean4.topicId), kingHonourTopicBean4.topicName, 2);
                if (kingHonourTopicBean4.topicId > 0 && (str2 = kingHonourTopicBean4.topicName) != null && str2.length() != 0) {
                    KingHonourTopicBean kingHonourTopicBean5 = new KingHonourTopicBean();
                    kingHonourTopicBean5.topicId = kingHonourTopicBean4.topicId;
                    kingHonourTopicBean5.topicName = kingHonourTopicBean4.topicName;
                    kingHonourTopicBean5.sourceFrom = 2;
                    if (iN3 == -1) {
                        ArrayList<KingHonourTopicBean> arrayList11 = iVar2.f56458e;
                        if (arrayList11 != null) {
                            arrayList11.add(0, kingHonourTopicBean5);
                        }
                    } else if (iN3 >= 0) {
                        ArrayList<KingHonourTopicBean> arrayList12 = iVar2.f56458e;
                        if (arrayList12 != null) {
                            arrayList12.remove(iN3);
                        }
                        ArrayList<KingHonourTopicBean> arrayList13 = iVar2.f56458e;
                        if (arrayList13 != null) {
                            arrayList13.add(0, kingHonourTopicBean5);
                        }
                    }
                    iVar2.f56456c = kingHonourTopicBean5;
                }
                i8 = 1;
            } else {
                i8 = 0;
            }
            if (kingHonourTopicBeanP != null) {
                int iN4 = iVar2.N(Long.valueOf(kingHonourTopicBeanP.topicId), kingHonourTopicBeanP.topicName, 2);
                iVar2.notifyDataSetChanged();
                if (iN4 >= 0) {
                    i8 = iN4;
                } else if (j7 == 0 || str3 == null || str3.length() == 0) {
                    i8 = 0;
                }
                iVar2.Q(i8);
            }
            int i10 = iVar2.f56454a;
            RecyclerView recyclerView2 = this.f113301Z0;
            if (recyclerView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRvTopicList");
                recyclerView2 = null;
            }
            recyclerView2.scrollToPosition(i10);
        }
        Q6().f113391e.setValue(this.f113303a1.O());
    }

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i7, int i8, @Nullable Intent intent) {
        TabLayout.TabView tabView;
        Bundle extras;
        Bundle extras2;
        super.onActivityResult(i7, i8, intent);
        if (i7 == 100 && i8 == -1) {
            Serializable serializable = (intent == null || (extras2 = intent.getExtras()) == null) ? null : extras2.getSerializable("king_honour_local_video_path");
            ArrayList arrayList = serializable instanceof ArrayList ? (ArrayList) serializable : null;
            this.f113308r0 = (ArrayList) ((intent == null || (extras = intent.getExtras()) == null) ? null : extras.getSerializable("king_honour_local_video_index"));
            if (arrayList != null) {
                Q6().f113388b.setValue(arrayList);
                Q6().f113390d.setValue(CaptureSchema.OLD_INVALID_ID_STRING);
                TabLayout tabLayout = this.f113274B;
                TabLayout tabLayout2 = tabLayout;
                if (tabLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTab");
                    tabLayout2 = null;
                }
                TabLayout.Tab tabAt = tabLayout2.getTabAt(this.f113296X);
                if (tabAt != null && (tabView = tabAt.view) != null) {
                    tabView.setSelected(false);
                }
                LinearLayout linearLayout = this.f113290R;
                LinearLayout linearLayout2 = linearLayout;
                if (linearLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mCustomLayout");
                    linearLayout2 = null;
                }
                linearLayout2.setEnabled(false);
                TextView textView = this.f113289Q;
                TextView textView2 = textView;
                if (textView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mCustomView");
                    textView2 = null;
                }
                Activity activity = BiliContext.topActivity();
                boolean zIsActive = ActivityExtKt.isActive(activity);
                Context fapp = activity;
                if (!zIsActive) {
                    fapp = FoundationAlias.getFapp();
                }
                textView2.setText(fapp.getString(2131849859));
                TextView textView3 = this.f113289Q;
                TextView textView4 = textView3;
                if (textView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mCustomView");
                    textView4 = null;
                }
                textView4.setTextColor(Color.parseColor("#FF6699"));
                ImageView imageView = this.f113291S;
                ImageView imageView2 = imageView;
                if (imageView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mCustomImage");
                    imageView2 = null;
                }
                imageView2.setVisibility(0);
            }
        }
        if (i7 != 1 || intent == null) {
            return;
        }
        U6(2, null, Long.valueOf(intent.getLongExtra(CaptureSchema.TOPIC_ID, 0L)), intent.getStringExtra(CaptureSchema.TOPIC_NAME));
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        if (this.f113300Z) {
            p.d(this, false, true, this.f113302a0, 6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02d4  */
    /* JADX WARN: Type inference failed for: r0v131, types: [com.bilibili.upper.module.honour.publish.b] */
    /* JADX WARN: Type inference failed for: r0v51, types: [android.app.Dialog, eI0.c, tv.danmaku.bili.widget.BaseDialog] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onClick(@org.jetbrains.annotations.Nullable android.view.View r19) {
        /*
            Method dump skipped, instruction units count: 1961
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.honour.ui.KingHonourPublishActivity.onClick(android.view.View):void");
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        View decorView;
        q.a(this, 2131104159);
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.setSystemUiVisibility(4102);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setBackgroundDrawable(new ColorDrawable(ContextCompat.getColor(this, 2131104159)));
        }
        setContentView(2131500642);
        BiliTemplateEngineManager biliTemplateEngineManager = new BiliTemplateEngineManager(7);
        this.f113309v0 = biliTemplateEngineManager;
        biliTemplateEngineManager.i(this);
        BiliTemplateEngineManager biliTemplateEngineManager2 = this.f113309v0;
        if (biliTemplateEngineManager2 != null) {
            BiliTemplateEngineManager.c(biliTemplateEngineManager2, false, false, true, new M0(this, 3), 3);
        }
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onDestroy() {
        com.bilibili.studio.editor.timeline.i iVar;
        super.onDestroy();
        this.f113294V.c(true);
        C6600h c6600h = this.f113293U;
        if (c6600h != null && (iVar = c6600h.f109672c) != null) {
            eA0.c.a(iVar, "UpperStreamingVideo onVideoStop");
            r rVar = iVar.f108304f;
            if (rVar != null) {
                EditProxyUtils.stop(rVar);
            }
        }
        com.bilibili.upper.module.honour.utils.b.f113332a.a();
        BiliTemplateEngineManager biliTemplateEngineManager = this.f113309v0;
        if (biliTemplateEngineManager != null) {
            biliTemplateEngineManager.k();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onPause() {
        super.onPause();
        C6600h c6600h = this.f113293U;
        if (c6600h != null) {
            c6600h.c();
        }
        com.bilibili.upper.module.honour.utils.b.f113332a.a();
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onResume() {
        com.bilibili.studio.editor.timeline.i iVar;
        super.onResume();
        TE0.b bVar = TE0.b.f24088a;
        boolean z6 = this.f113302a0;
        HashMap mapA = VF0.b.a(bVar);
        mapA.put("is_game", z6 ? "1" : "0");
        Unit unit = Unit.INSTANCE;
        Neurons.reportExposure$default(false, "creation.wangzhezhanbao.template.0.show", mapA, (List) null, 8, (Object) null);
        C6600h c6600h = this.f113293U;
        if (c6600h == null || (iVar = c6600h.f109672c) == null || iVar.h() != 0 || this.f113304b1) {
            return;
        }
        C6600h c6600h2 = this.f113293U;
        if (c6600h2 != null) {
            C6600h.d(c6600h2, 3);
        }
        T6(3);
    }
}
