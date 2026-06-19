package com.bilibili.pegasus.channelv3;

import C80.u;
import Ua.d0;
import android.content.Context;
import android.content.Intent;
import android.graphics.Matrix;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import bF0.Q0;
import com.bilibili.ad.adview.pegasus.banner.topview.res.f;
import com.bilibili.app.comm.list.common.widget.ListCommonMenuWindow;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.base.viewbinding.ViewBindingProperty;
import com.bilibili.base.viewbinding.full.CreateMethod;
import com.bilibili.base.viewbinding.full.ReflectionActivityViewBindings;
import com.bilibili.base.viewbinding.internal.UtilsKt;
import com.bilibili.biligame.helper.a0;
import com.bilibili.bplus.im.conversation.widget.IMInputView;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.accounts.subscribe.PassportObserver;
import com.bilibili.lib.accounts.subscribe.Topic;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.BaseAppCompatActivity;
import com.bilibili.lib.ui.menu.BottomDialogMenu;
import com.bilibili.lib.ui.util.StatusBarCompat;
import com.bilibili.pegasus.channelv3.ChannelDetailActivityV3;
import com.bilibili.pegasus.channelv3.movie.head.ChannelMovieHeadVM;
import com.bilibili.pegasus.channelv3.movie.head.f;
import com.bilibili.pegasus.channelv3.movie.head.g;
import com.bilibili.pegasus.channelv3.movie.head.h;
import com.bilibili.pegasus.channelv3.movie.head.m;
import com.bilibili.pegasus.channelv3.movie.head.n;
import com.bilibili.pegasus.channelv3.utils.ChannelStatus;
import com.bilibili.pvtracker.IPvTracker;
import com.bilibili.studio.videoeditor.bean.EditorMaterialEntity;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoClip;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.bilibili.studio.videoeditor.ms.transition.TransitionData;
import com.bilibili.studio.videoeditor.ms.transition.TransitionInfo;
import com.bilibili.upper.module.aiplay.fragment.AiStoryPreviewFragment;
import com.bilibili.video.story.action.widget.StoryLandscapeDanmakuSendWidget;
import gl.m;
import gl.o;
import jT0.k;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import so0.C8604a;
import so0.C8605b;
import so0.C8606c;
import so0.C8607d;
import so0.C8611h;
import to0.AbstractC8675a;
import xo0.f;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/ChannelDetailActivityV3.class */
@StabilityInferred(parameters = 0)
public final class ChannelDetailActivityV3 extends BaseAppCompatActivity implements IPvTracker, PassportObserver {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final KProperty<Object>[] f75282G = {new PropertyReference1Impl(ChannelDetailActivityV3.class, "binding", "getBinding()Lcom/bilibili/app/pegasus/databinding/BiliChannelV3DetailLayoutBinding;", 0)};

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public AbstractC8675a f75284C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public eg.a f75285D;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @NotNull
    public final String f75283B = "ChannelDetailActivityV3";

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @NotNull
    public final ViewBindingProperty f75286E = ReflectionActivityViewBindings.inflateViewBindingActivity(this, m.class, CreateMethod.INFLATE, UtilsKt.emptyVbCallback());

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f75287F = new ViewModelLazy(Reflection.getOrCreateKotlinClass(C8611h.class), new d(this), new c(this), new e(this));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/ChannelDetailActivityV3$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f75288a;

        static {
            int[] iArr = new int[ChannelStatus.values().length];
            try {
                iArr[ChannelStatus.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[ChannelStatus.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[ChannelStatus.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[ChannelStatus.EMPTY.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            f75288a = iArr;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/ChannelDetailActivityV3$b.class */
    public static final /* synthetic */ class b implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C8604a f75289a;

        public b(C8604a c8604a) {
            this.f75289a = c8604a;
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
            return this.f75289a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) throws NoWhenBranchMatchedException {
            this.f75289a.invoke(obj);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/ChannelDetailActivityV3$c.class */
    public static final class c implements Function0<ViewModelProvider.Factory> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChannelDetailActivityV3 f75290a;

        public c(ChannelDetailActivityV3 channelDetailActivityV3) {
            this.f75290a = channelDetailActivityV3;
        }

        public final Object invoke() {
            return this.f75290a.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/ChannelDetailActivityV3$d.class */
    public static final class d implements Function0<ViewModelStore> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChannelDetailActivityV3 f75291a;

        public d(ChannelDetailActivityV3 channelDetailActivityV3) {
            this.f75291a = channelDetailActivityV3;
        }

        public final Object invoke() {
            return this.f75291a.getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/ChannelDetailActivityV3$e.class */
    public static final class e implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChannelDetailActivityV3 f75292a;

        public e(ChannelDetailActivityV3 channelDetailActivityV3) {
            this.f75292a = channelDetailActivityV3;
        }

        public final Object invoke() {
            return this.f75292a.getDefaultViewModelCreationExtras();
        }
    }

    public final m P6() {
        return (m) this.f75286E.getValue(this, f75282G[0]);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        return Op0.b.b("traffic.movie-channel-detail.0.0");
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final Bundle getPvExtra() {
        C8611h c8611h = (C8611h) this.f75287F.getValue();
        Bundle bundle = new Bundle();
        bundle.putString("channel_id", String.valueOf(c8611h.f127312b));
        bundle.putString("from", c8611h.I0());
        bundle.putString("page_entity_id", c8611h.f127313c);
        bundle.putString("page_entity_name", c8611h.f127311a);
        return bundle;
    }

    public final void onChange(@Nullable Topic topic) {
        if (topic == Topic.SIGN_IN || topic == Topic.SIGN_OUT) {
            AbstractC8675a abstractC8675a = this.f75284C;
            AbstractC8675a abstractC8675a2 = abstractC8675a;
            if (abstractC8675a == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mHeadViewModel");
                abstractC8675a2 = null;
            }
            abstractC8675a2.J0(((C8611h) this.f75287F.getValue()).f127315e);
        }
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        Bundle extras;
        Map<? extends String, ? extends String> stringMap;
        super.onCreate(bundle);
        setContentView(P6().a);
        this.f75285D = new eg.a(102, (String) null);
        Intent intent = getIntent();
        ViewModelLazy viewModelLazy = this.f75287F;
        if (intent != null && (extras = intent.getExtras()) != null && (stringMap = ListExtentionsKt.toStringMap(extras)) != null) {
            ((C8611h) viewModelLazy.getValue()).f127315e.putAll(stringMap);
        }
        setSupportActionBar(P6().f);
        StatusBarCompat.setHeightAndPadding(this, P6().f);
        this.f75284C = (AbstractC8675a) new ViewModelLazy(Reflection.getOrCreateKotlinClass(ChannelMovieHeadVM.class), new C8606c(this), new C8605b(this), new C8607d(this)).getValue();
        final com.bilibili.pegasus.channelv3.movie.head.m mVar = new com.bilibili.pegasus.channelv3.movie.head.m(this);
        LayoutInflater layoutInflater = getLayoutInflater();
        m mVarP6 = P6();
        mVar.f75428b = o.inflate(layoutInflater, mVarP6.d);
        mVarP6.f.addOnLayoutChangeListener(new n(mVar, mVarP6));
        mVar.b().f75385g.observe(this, new m.b(new f(mVar, 3)));
        mVar.b().h.observe(this, new m.b(new u(mVar, 2)));
        final int i7 = 2;
        mVar.b().f75386i.observe(this, new m.b(new Function1(mVar, i7) { // from class: Ex0.q

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f4849a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f4850b;

            {
                this.f4849a = i7;
                this.f4850b = mVar;
            }

            public final Object invoke(Object obj) {
                List<EditVideoClip> editVideoTracks;
                TextureView textureView;
                Object obj2 = this.f4850b;
                switch (this.f4849a) {
                    case 0:
                        EditorMaterialEntity editorMaterialEntity = (EditorMaterialEntity) obj;
                        EditVideoInfo editVideoInfo = (EditVideoInfo) obj2;
                        if (editVideoInfo != null && (editVideoTracks = editVideoInfo.getEditVideoTracks()) != null) {
                            Iterator<T> it = editVideoTracks.iterator();
                            while (it.hasNext()) {
                                List<TransitionInfo> transitionInfoList = ((EditVideoClip) it.next()).getTransitionInfoList();
                                if (transitionInfoList != null) {
                                    for (TransitionInfo transitionInfo : transitionInfoList) {
                                        List<TransitionData.TransitionBean> list = editorMaterialEntity.trans;
                                        if (list != null) {
                                            for (TransitionData.TransitionBean transitionBean : list) {
                                                if (transitionBean.id == transitionInfo.selectId) {
                                                    transitionInfo.overlap = transitionBean.overlap;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    case 1:
                        int i8 = IMInputView.p0;
                        IMInputView iMInputView = (IMInputView) obj2;
                        iMInputView.getClass();
                        if (((Integer) obj).intValue() == 5) {
                            iMInputView.C.setVisibility(8);
                        }
                        break;
                    case 2:
                        final com.bilibili.pegasus.channelv3.movie.head.o oVar = (com.bilibili.pegasus.channelv3.movie.head.o) obj;
                        final com.bilibili.pegasus.channelv3.movie.head.m mVar2 = (com.bilibili.pegasus.channelv3.movie.head.m) obj2;
                        Neurons.reportExposure$default(false, "traffic.movie-channel-detail.head-info.remark.show", com.bilibili.pegasus.channelv3.movie.head.e.b(mVar2.b()), (List) null, 8, (Object) null);
                        ListExtentionsKt.visible(mVar2.a().k);
                        mVar2.a().k.setText(oVar.f75447a);
                        mVar2.a().k.setOnClickListener(new View.OnClickListener(mVar2, oVar) { // from class: com.bilibili.pegasus.channelv3.movie.head.k

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final m f75423a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final o f75424b;

                            {
                                this.f75423a = mVar2;
                                this.f75424b = oVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                m mVar3 = this.f75423a;
                                o oVar2 = this.f75424b;
                                ChannelDetailActivityV3 channelDetailActivityV3 = mVar3.f75427a;
                                if (!BiliAccounts.get(channelDetailActivityV3).isLogin()) {
                                    Qp0.c.b(channelDetailActivityV3);
                                } else {
                                    Neurons.reportClick(false, "traffic.movie-channel-detail.head-info.remark.click", e.b(mVar3.b()));
                                    ListCommonMenuWindow.showBottomUpMenu$default(channelDetailActivityV3, SequencesKt.toList(SequencesKt.map(CollectionsKt.asSequence(oVar2.f75448b), new Td.h(mVar3, 1))), (BottomDialogMenu.OnCloseClickListener) null, 4, (Object) null);
                                }
                            }
                        });
                        break;
                    case 3:
                        AiStoryPreviewFragment aiStoryPreviewFragment = (AiStoryPreviewFragment) obj2;
                        if (aiStoryPreviewFragment.jf().I0()) {
                            int videoWidth = aiStoryPreviewFragment.jf().b.f17106a.getVideoWidth();
                            int videoHeight = aiStoryPreviewFragment.jf().b.f17106a.getVideoHeight();
                            Q0 q02 = aiStoryPreviewFragment.c;
                            if (q02 != null && (textureView = q02.h) != null) {
                                float measuredWidth = textureView.getMeasuredWidth();
                                float measuredHeight = textureView.getMeasuredHeight();
                                if (videoWidth != 0 && videoHeight != 0 && measuredWidth != 0.0f && measuredHeight != 0.0f) {
                                    Matrix matrix = new Matrix();
                                    float f7 = videoWidth;
                                    float f8 = (measuredWidth - f7) / 2.0f;
                                    float f9 = videoHeight;
                                    matrix.preTranslate(f8, (measuredHeight - f9) / 2.0f);
                                    matrix.preScale(f7 / measuredWidth, f9 / measuredHeight);
                                    float f10 = measuredWidth / f7;
                                    float f11 = 2;
                                    matrix.postScale(f10, f10, measuredWidth / f11, measuredHeight / f11);
                                    textureView.setTransform(matrix);
                                    textureView.postInvalidate();
                                }
                            }
                        }
                        break;
                    default:
                        int i9 = StoryLandscapeDanmakuSendWidget.z;
                        ((com.bilibili.playerbizcommonv2.danmaku.input.g) obj2).f81000l = (List) obj;
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        mVar.b().f75387j.observe(this, new m.b(new a0(mVar, 3)));
        com.bilibili.pegasus.channelv3.movie.head.f fVar = new com.bilibili.pegasus.channelv3.movie.head.f(this);
        fVar.f75408b = gl.n.inflate(getLayoutInflater(), P6().i);
        fVar.a().b.setOnClickListener(new d0(fVar, 1));
        fVar.a().c.setOnClickListener(new g(fVar));
        ViewModelLazy viewModelLazy2 = fVar.f75409c;
        ((ChannelMovieHeadVM) viewModelLazy2.getValue()).f75388k.observe(this, new f.b(new com.bilibili.ad.adview.pegasus.banner.topview.res.c(fVar, 1)));
        eg.a aVar = this.f75285D;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("channelManager");
            aVar = null;
        }
        aVar.c(this, new h(fVar));
        ((ChannelMovieHeadVM) viewModelLazy2.getValue()).f75385g.observe(this, new f.b(new com.bilibili.bplus.im.conversation.widget.u(fVar, 1)));
        AbstractC8675a abstractC8675a = this.f75284C;
        AbstractC8675a abstractC8675a2 = abstractC8675a;
        if (abstractC8675a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHeadViewModel");
            abstractC8675a2 = null;
        }
        ((ChannelMovieHeadVM) abstractC8675a2).f75385g.observe(this, new b(new C8604a(this)));
        xo0.f fVar2 = new xo0.f(this, P6());
        ((xo0.d) fVar2.f129402d.getValue()).f129397b.observe(this, new f.a(new k(fVar2, 1)));
        AbstractC8675a abstractC8675a3 = this.f75284C;
        AbstractC8675a abstractC8675a4 = abstractC8675a3;
        if (abstractC8675a3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHeadViewModel");
            abstractC8675a4 = null;
        }
        if (!abstractC8675a4.I0()) {
            AbstractC8675a abstractC8675a5 = this.f75284C;
            if (abstractC8675a5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mHeadViewModel");
                abstractC8675a5 = null;
            }
            abstractC8675a5.J0(((C8611h) viewModelLazy.getValue()).f127315e);
        }
        BiliAccounts.get(this).subscribe(this, new Topic[]{Topic.SIGN_IN, Topic.SIGN_OUT});
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        BiliAccounts.get(this).unsubscribe(this, new Topic[]{Topic.SIGN_IN, Topic.SIGN_OUT});
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public final void onPostCreate(@Nullable Bundle bundle) {
        super.onPostCreate(bundle);
        StatusBarCompat.immersiveStatusBar(this);
        StatusBarCompat.tintStatusBar(this, 0);
        P6().b.setStatusBarBackgroundColor(0);
        getWindow().setStatusBarColor(0);
        removeShade();
    }
}
