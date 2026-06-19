package com.bilibili.topix.create;

import Bu.i;
import Ea.p;
import GO.m;
import PD0.C2768j;
import android.content.Context;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.StringRes;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.bilibili.ad.reward.activity.v;
import com.bilibili.api.BiliApiException;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.app.comment3.reducer.P;
import com.bilibili.base.viewbinding.ViewBindingProperty;
import com.bilibili.base.viewbinding.full.CreateMethod;
import com.bilibili.base.viewbinding.full.ReflectionFragmentViewBindings;
import com.bilibili.base.viewbinding.internal.UtilsKt;
import com.bilibili.bililive.room.ui.roomv3.player.x;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.arch.lifecycle.Resource;
import com.bilibili.lib.arch.lifecycle.Status;
import com.bilibili.lib.blkv.BLKV;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.ui.BaseToolbarFragment;
import com.bilibili.lib.ui.garb.GarbManager;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.magicasakura.widgets.TintToolbar;
import com.bilibili.pvtracker.IPvTracker;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/create/CreateTopicFragment.class */
@StabilityInferred(parameters = 0)
public final class CreateTopicFragment extends BaseToolbarFragment implements IPvTracker {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final KProperty<Object>[] f112575d = {new PropertyReference1Impl(CreateTopicFragment.class, "binding", "getBinding()Lcom/bilibili/topix/databinding/TpFragmentNewTopicBinding;", 0)};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ViewBindingProperty f112576b = ReflectionFragmentViewBindings.viewBindingFragment(this, C2768j.class, CreateMethod.INFLATE, UtilsKt.emptyVbCallback());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lazy f112577c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/create/CreateTopicFragment$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f112578a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int[] f112579b;

        static {
            int[] iArr = new int[TitleStatus.values().length];
            try {
                iArr[TitleStatus.Init.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[TitleStatus.Short.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[TitleStatus.Loading.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[TitleStatus.Valid.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr[TitleStatus.Invalid.ordinal()] = 5;
            } catch (NoSuchFieldError e11) {
            }
            try {
                iArr[TitleStatus.Failed.ordinal()] = 6;
            } catch (NoSuchFieldError e12) {
            }
            f112578a = iArr;
            int[] iArr2 = new int[Status.values().length];
            try {
                iArr2[Status.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError e13) {
            }
            try {
                iArr2[Status.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError e14) {
            }
            try {
                iArr2[Status.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError e15) {
            }
            f112579b = iArr2;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/create/CreateTopicFragment$b.class */
    public static final class b implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CreateTopicFragment f112580a;

        public b(CreateTopicFragment createTopicFragment) {
            this.f112580a = createTopicFragment;
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x0020  */
        @Override // android.text.TextWatcher
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void afterTextChanged(android.text.Editable r10) {
            /*
                r9 = this;
                r0 = r9
                com.bilibili.topix.create.CreateTopicFragment r0 = r0.f112580a
                r13 = r0
                kotlin.reflect.KProperty<java.lang.Object>[] r0 = com.bilibili.topix.create.CreateTopicFragment.f112575d
                r12 = r0
                r0 = r13
                com.bilibili.topix.create.CreateTopicViewModel r0 = r0.of()
                r14 = r0
                r0 = r10
                if (r0 == 0) goto L20
                r0 = r10
                java.lang.String r0 = r0.toString()
                r12 = r0
                r0 = r12
                r10 = r0
                r0 = r12
                if (r0 != 0) goto L23
            L20:
                java.lang.String r0 = ""
                r10 = r0
            L23:
                r0 = r14
                androidx.lifecycle.SavedStateHandle r0 = r0.f112582a
                java.lang.String r1 = "topic_current_title"
                r2 = r10
                r0.set(r1, r2)
                r0 = r10
                int r0 = com.bilibili.topix.utils.a.a(r0)
                r11 = r0
                r0 = r11
                r1 = 6
                if (r0 >= r1) goto L55
                r0 = r14
                androidx.lifecycle.MutableLiveData<com.bilibili.topix.create.TitleStatus> r0 = r0.f112583b
                r15 = r0
                r0 = r11
                if (r0 != 0) goto L4b
                com.bilibili.topix.create.TitleStatus r0 = com.bilibili.topix.create.TitleStatus.Init
                r12 = r0
                goto L4f
            L4b:
                com.bilibili.topix.create.TitleStatus r0 = com.bilibili.topix.create.TitleStatus.Short
                r12 = r0
            L4f:
                r0 = r15
                r1 = r12
                r0.setValue(r1)
            L55:
                r0 = r14
                kotlinx.coroutines.CoroutineScope r0 = androidx.lifecycle.ViewModelKt.getViewModelScope(r0)
                r1 = 0
                r2 = 0
                com.bilibili.topix.create.CreateTopicViewModel$onTitleChanged$1 r3 = new com.bilibili.topix.create.CreateTopicViewModel$onTitleChanged$1
                r4 = r3
                r5 = r14
                r6 = r10
                r7 = 0
                r4.<init>(r5, r6, r7)
                r4 = 3
                r5 = 0
                kotlinx.coroutines.Job r0 = kotlinx.coroutines.BuildersKt.launch$default(r0, r1, r2, r3, r4, r5)
                r0 = r13
                r0.mf()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.topix.create.CreateTopicFragment.b.afterTextChanged(android.text.Editable):void");
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/create/CreateTopicFragment$c.class */
    public static final class c implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CreateTopicFragment f112581a;

        public c(CreateTopicFragment createTopicFragment) {
            this.f112581a = createTopicFragment;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0075  */
        @Override // android.text.TextWatcher
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void afterTextChanged(android.text.Editable r9) {
            /*
                r8 = this;
                r0 = r8
                com.bilibili.topix.create.CreateTopicFragment r0 = r0.f112581a
                r12 = r0
                kotlin.reflect.KProperty<java.lang.Object>[] r0 = com.bilibili.topix.create.CreateTopicFragment.f112575d
                r11 = r0
                r0 = r12
                java.lang.Class r0 = r0.getClass()
                r0 = r9
                int r0 = com.bilibili.topix.utils.a.a(r0)
                r10 = r0
                r0 = r12
                PD0.j r0 = r0.nf()
                PD0.G r0 = r0.f18748d
                android.widget.TextView r0 = r0.f18617b
                r13 = r0
                r0 = r12
                android.content.Context r0 = r0.getContext()
                r11 = r0
                r0 = r11
                if (r0 == 0) goto L57
                r0 = r11
                android.content.res.Resources r0 = r0.getResources()
                r11 = r0
                r0 = r11
                if (r0 == 0) goto L57
                r0 = r11
                r1 = 2131836455(0x7f113e27, float:1.9306077E38)
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r10
                r6 = 1
                int r5 = r5 + r6
                r6 = 2
                int r5 = r5 / r6
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r3[r4] = r5
                r3 = r2
                r4 = 1
                r5 = 300(0x12c, float:4.2E-43)
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r3[r4] = r5
                java.lang.String r0 = r0.getString(r1, r2)
                r11 = r0
                goto L59
            L57:
                r0 = 0
                r11 = r0
            L59:
                r0 = r13
                r1 = r11
                r0.setText(r1)
                r0 = r12
                com.bilibili.topix.create.CreateTopicViewModel r0 = r0.of()
                r13 = r0
                r0 = r9
                if (r0 == 0) goto L75
                r0 = r9
                java.lang.String r0 = r0.toString()
                r11 = r0
                r0 = r11
                r9 = r0
                r0 = r11
                if (r0 != 0) goto L78
            L75:
                java.lang.String r0 = ""
                r9 = r0
            L78:
                r0 = r13
                androidx.lifecycle.SavedStateHandle r0 = r0.f112582a
                java.lang.String r1 = "topic_current_desc"
                r2 = r9
                r0.set(r1, r2)
                r0 = r12
                r0.mf()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.topix.create.CreateTopicFragment.c.afterTextChanged(android.text.Editable):void");
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        }
    }

    /* JADX INFO: renamed from: com.bilibili.topix.create.CreateTopicFragment$onViewCreated$9, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/create/CreateTopicFragment$onViewCreated$9.class */
    public static final class AnonymousClass9 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CreateTopicFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(CreateTopicFragment createTopicFragment, Continuation<? super AnonymousClass9> continuation) {
            super(2, continuation);
            this.this$0 = createTopicFragment;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass9(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (!((Boolean) BLKV.getKvs$default(this.this$0.requireContext(), "topix_blkv_config", false, 0, 6, (Object) null).get("topic_create_page_has_shown", Boolean.FALSE)).booleanValue()) {
                CreateTopicFragment createTopicFragment = this.this$0;
                createTopicFragment.qf(createTopicFragment.requireContext());
                BLKV.getKvs$default(this.this$0.requireContext(), "topix_blkv_config", false, 0, 6, (Object) null).putBoolean("topic_create_page_has_shown", true);
            }
            return Unit.INSTANCE;
        }
    }

    public CreateTopicFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>(this) { // from class: com.bilibili.topix.create.CreateTopicFragment$special$$inlined$viewModels$default$1
            final Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Fragment m10635invoke() {
                return this.$this_viewModels;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>(function0) { // from class: com.bilibili.topix.create.CreateTopicFragment$special$$inlined$viewModels$default$2
            final Function0 $ownerProducer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$ownerProducer = function0;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner m10636invoke() {
                return (ViewModelStoreOwner) this.$ownerProducer.invoke();
            }
        });
        final Function0 function02 = null;
        this.f112577c = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(CreateTopicViewModel.class), new Function0<ViewModelStore>(lazy) { // from class: com.bilibili.topix.create.CreateTopicFragment$special$$inlined$viewModels$default$3
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$owner$delegate = lazy;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStore m10637invoke() {
                return FragmentViewModelLazyKt.m4419viewModels$lambda1(this.$owner$delegate).getViewModelStore();
            }
        }, new Function0<CreationExtras>(function02, lazy) { // from class: com.bilibili.topix.create.CreateTopicFragment$special$$inlined$viewModels$default$4
            final Function0 $extrasProducer;
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$extrasProducer = function02;
                this.$owner$delegate = lazy;
            }

            /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
            @org.jetbrains.annotations.NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final androidx.lifecycle.viewmodel.CreationExtras m10638invoke() {
                /*
                    r2 = this;
                    r0 = r2
                    kotlin.jvm.functions.Function0 r0 = r0.$extrasProducer
                    r3 = r0
                    r0 = r3
                    if (r0 == 0) goto L19
                    r0 = r3
                    java.lang.Object r0 = r0.invoke()
                    androidx.lifecycle.viewmodel.CreationExtras r0 = (androidx.lifecycle.viewmodel.CreationExtras) r0
                    r4 = r0
                    r0 = r4
                    r3 = r0
                    r0 = r4
                    if (r0 != 0) goto L44
                L19:
                    r0 = r2
                    kotlin.Lazy r0 = r0.$owner$delegate
                    androidx.lifecycle.ViewModelStoreOwner r0 = androidx.fragment.app.FragmentViewModelLazyKt.m4417access$viewModels$lambda1(r0)
                    r3 = r0
                    r0 = r3
                    boolean r0 = r0 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
                    if (r0 == 0) goto L30
                    r0 = r3
                    androidx.lifecycle.HasDefaultViewModelProviderFactory r0 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r0
                    r3 = r0
                    goto L32
                L30:
                    r0 = 0
                    r3 = r0
                L32:
                    r0 = r3
                    if (r0 == 0) goto L40
                    r0 = r3
                    androidx.lifecycle.viewmodel.CreationExtras r0 = r0.getDefaultViewModelCreationExtras()
                    r3 = r0
                    goto L44
                L40:
                    androidx.lifecycle.viewmodel.CreationExtras$Empty r0 = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE
                    r3 = r0
                L44:
                    r0 = r3
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.topix.create.CreateTopicFragment$special$$inlined$viewModels$default$4.m10638invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }
        }, new Function0<ViewModelProvider.Factory>(this, lazy) { // from class: com.bilibili.topix.create.CreateTopicFragment$special$$inlined$viewModels$default$5
            final Lazy $owner$delegate;
            final Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
                this.$owner$delegate = lazy;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
            @org.jetbrains.annotations.NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final androidx.lifecycle.ViewModelProvider.Factory m10639invoke() {
                /*
                    r2 = this;
                    r0 = r2
                    kotlin.Lazy r0 = r0.$owner$delegate
                    androidx.lifecycle.ViewModelStoreOwner r0 = androidx.fragment.app.FragmentViewModelLazyKt.m4417access$viewModels$lambda1(r0)
                    r3 = r0
                    r0 = r3
                    boolean r0 = r0 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
                    if (r0 == 0) goto L17
                    r0 = r3
                    androidx.lifecycle.HasDefaultViewModelProviderFactory r0 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r0
                    r3 = r0
                    goto L19
                L17:
                    r0 = 0
                    r3 = r0
                L19:
                    r0 = r3
                    if (r0 == 0) goto L2a
                    r0 = r3
                    androidx.lifecycle.ViewModelProvider$Factory r0 = r0.getDefaultViewModelProviderFactory()
                    r4 = r0
                    r0 = r4
                    r3 = r0
                    r0 = r4
                    if (r0 != 0) goto L32
                L2a:
                    r0 = r2
                    androidx.fragment.app.Fragment r0 = r0.$this_viewModels
                    androidx.lifecycle.ViewModelProvider$Factory r0 = r0.getDefaultViewModelProviderFactory()
                    r3 = r0
                L32:
                    r0 = r3
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.topix.create.CreateTopicFragment$special$$inlined$viewModels$default$5.m10639invoke():androidx.lifecycle.ViewModelProvider$Factory");
            }
        });
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        return "dt.topic-create.0.0.pv";
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @Nullable
    public final Bundle getPvExtra() {
        return null;
    }

    public final void mf() {
        CreateTopicViewModel createTopicViewModelOf = of();
        boolean z6 = (StringsKt.isBlank(createTopicViewModelOf.I0()) || StringsKt.isBlank(createTopicViewModelOf.J0()) || createTopicViewModelOf.f112583b.getValue() == TitleStatus.Short) ? false : true;
        nf().f18747c.setEnabled(z6);
        nf().f18747c.setAlpha(z6 ? 1.0f : 0.4f);
    }

    public final C2768j nf() {
        return (C2768j) this.f112576b.getValue(this, f112575d[0]);
    }

    public final CreateTopicViewModel of() {
        return (CreateTopicViewModel) this.f112577c.getValue();
    }

    @Override // com.bilibili.lib.ui.BaseToolbarFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            Bundle arguments = getArguments();
            String string = null;
            String string2 = arguments != null ? arguments.getString("name") : null;
            Bundle arguments2 = getArguments();
            String string3 = arguments2 != null ? arguments2.getString("desc") : null;
            Bundle arguments3 = getArguments();
            if (arguments3 != null) {
                string = arguments3.getString("scene");
            }
            StringBuilder sbA = G0.b.a("Creating creation page with init data title ", string2, " desc ", string3, " scene ");
            sbA.append(string);
            BLog.i("CreateTopicFragment", sbA.toString());
            CreateTopicViewModel createTopicViewModelOf = of();
            boolean zIsBlank = StringsKt.isBlank(createTopicViewModelOf.J0());
            SavedStateHandle savedStateHandle = createTopicViewModelOf.f112582a;
            if (zIsBlank) {
                String str = string2;
                if (string2 == null) {
                    str = "";
                }
                savedStateHandle.set("topic_current_title", str);
            }
            if (StringsKt.isBlank(createTopicViewModelOf.I0())) {
                String str2 = string3;
                if (string3 == null) {
                    str2 = "";
                }
                savedStateHandle.set("topic_current_desc", str2);
            }
            String str3 = (String) savedStateHandle.get("topic_current_scene");
            String str4 = str3;
            if (str3 == null) {
                str4 = "";
            }
            if (StringsKt.isBlank(str4)) {
                String str5 = string;
                if (string == null) {
                    str5 = "";
                }
                savedStateHandle.set("topic_current_scene", str5);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return nf().f18745a;
    }

    @Override // com.bilibili.lib.ui.BaseToolbarFragment, com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Window window;
        super.onViewCreated(view, bundle);
        TintToolbar mToolbar = getMToolbar();
        if (mToolbar != null) {
            mToolbar.setTitleTextAppearance(view.getContext(), 2131887558);
        }
        setTitle(2131843358);
        FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 != null && (window = fragmentActivityP3.getWindow()) != null) {
            window.setSoftInputMode(32);
        }
        nf().f18750f.f18653c.setFilters(new InputFilter[]{new com.bilibili.topix.utils.b(), new com.bilibili.topix.utils.d(36)});
        nf().f18748d.f18618c.setFilters((InputFilter[]) new com.bilibili.topix.utils.d[]{new com.bilibili.topix.utils.d(600)});
        nf().f18750f.f18653c.addTextChangedListener(new b(this));
        nf().f18748d.f18618c.addTextChangedListener(new c(this));
        nf().f18750f.f18653c.setText(of().J0());
        nf().f18748d.f18618c.setText(of().I0());
        nf().f18747c.setOnClickListener(new View.OnClickListener(this) { // from class: com.bilibili.topix.create.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CreateTopicFragment f112589a;

            {
                this.f112589a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CreateTopicFragment createTopicFragment = this.f112589a;
                KProperty<Object>[] kPropertyArr = CreateTopicFragment.f112575d;
                CreateTopicViewModel createTopicViewModelOf = createTopicFragment.of();
                boolean zIsChecked = createTopicFragment.nf().f18749e.f18621c.isChecked();
                createTopicViewModelOf.f112584c.setValue(Resource.a.c(Resource.Companion));
                BuildersKt.launch$default(ViewModelKt.getViewModelScope(createTopicViewModelOf), (CoroutineContext) null, (CoroutineStart) null, new CreateTopicViewModel$postTopicCreation$1(createTopicViewModelOf, zIsChecked ? 1 : 0, null), 3, (Object) null);
            }
        });
        of().f112583b.observe(getViewLifecycleOwner(), new e(new v(this, 2)));
        of().f112586e.observe(getViewLifecycleOwner(), new e(new x(this, 1)));
        of().f112584c.observe(getViewLifecycleOwner(), new e(new i(3, this)));
        of().f112585d.observe(getViewLifecycleOwner(), new e(new P(this, 4)));
        CreateTopicViewModel createTopicViewModelOf = of();
        createTopicViewModelOf.f112585d.setValue(Resource.a.c(Resource.Companion));
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(createTopicViewModelOf), (CoroutineContext) null, (CoroutineStart) null, new CreateTopicViewModel$loadLimitInfo$1(createTopicViewModelOf, null), 3, (Object) null);
        nf().f18746b.setOnClickListener(new p(this, 2));
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new AnonymousClass9(this, null));
        TextView textView = nf().f18747c;
        Integer toolbarTitleColor = getToolbarTitleColor(GarbManager.getCurGarb());
        textView.setTextColor(toolbarTitleColor != null ? toolbarTitleColor.intValue() : ThemeUtils.getColorById(requireContext(), 2131103914));
    }

    public final void pf(Throwable th) {
        BiliApiException biliApiException;
        String message;
        boolean z6 = th instanceof BiliApiException;
        if (z6 && ((BiliApiException) th).mCode == -101) {
            ToastHelper.showToastLong(getContext(), 2131843355);
        } else if (!z6 || (message = (biliApiException = (BiliApiException) th).getMessage()) == null || StringsKt.isBlank(message)) {
            ToastHelper.showToastLong(getContext(), 2131841743);
        } else {
            ToastHelper.showToastLong(getContext(), biliApiException.getMessage());
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [GO.m, java.lang.Object] */
    public final void qf(Context context) {
        BottomSheetDialogFragment bottomSheetDialogFragmentA;
        Context context2 = getContext();
        if (context2 != null) {
            ?? obj = new Object();
            ((m) obj).b = context.getResources().getString(2131843491);
            ((m) obj).d = context.getResources().getString(2131842822);
            ((m) obj).a = MultipleThemeUtils.isNightTheme(context) ? "https://www.bilibili.com/h5/topic-active/topic-intro?night=1" : "https://www.bilibili.com/h5/topic-active/topic-intro";
            bottomSheetDialogFragmentA = obj.a(context2);
        } else {
            bottomSheetDialogFragmentA = null;
        }
        if (bottomSheetDialogFragmentA != null) {
            bottomSheetDialogFragmentA.show(getChildFragmentManager(), null);
        }
    }

    public final void rf(@StringRes int i7) {
        sf(true);
        ImageView imageView = nf().f18750f.f18654d;
        TextView textView = nf().f18750f.f18655e;
        textView.setText(i7);
        textView.setTextColor(ResourcesCompat.getColor(imageView.getResources(), R$color.Stress_red, null));
        imageView.setImageDrawable(ResourcesCompat.getDrawable(imageView.getResources(), 2131241127, null));
    }

    public final void sf(boolean z6) {
        nf().f18750f.f18654d.setVisibility(ListExtentionsKt.toVisibility(z6));
        nf().f18750f.f18655e.setVisibility(ListExtentionsKt.toVisibility(z6));
    }
}
