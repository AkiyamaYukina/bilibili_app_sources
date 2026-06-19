package com.bilibili.pegasus.components.interest.ui.v32.page;

import Do0.a;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewGroupKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import aq0.C4859f;
import com.bilibili.app.comm.list.common.widget.PromoToast;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.app.comm.list.widget.utils.s;
import com.bilibili.app.dialogmanager.MainDialogManager;
import com.bilibili.bililive.room.ui.roomv3.vertical.business.o;
import com.bilibili.lib.performance.EntryPointKt;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.widgets.TintFrameLayout;
import com.bilibili.pegasus.components.interest.InterestChainErrorCode;
import com.bilibili.pegasus.components.interest.InterestChainProcess;
import com.bilibili.pegasus.components.interest.ui.reporter.InterestPageCloseReason;
import com.bilibili.pegasus.components.interest.ui.udf.actions.Actions;
import com.bilibili.pegasus.components.interest.ui.v32.vm.InterestChooseV32PageViewModel;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import com.bilibili.pegasus.interest.reporter.InterestErrorType;
import com.bilibili.pegasus.interest.reporter.InterestEvent;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.Iterator;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q4.Q;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v32/page/InterestChooseV32Dialog.class */
@StabilityInferred(parameters = 0)
@AndroidEntryPoint
public final class InterestChooseV32Dialog extends Hilt_InterestChooseV32Dialog implements com.bilibili.pegasus.components.interest.ui.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Lazy f76658g;

    @Nullable
    public com.bilibili.pegasus.components.interest.m h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public String f76659i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f76660j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f76661k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f76662l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public C4859f f76663m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f76664n;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v32/page/InterestChooseV32Dialog$a.class */
    public static final class a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterestChooseV32Dialog f76665a;

        public a(InterestChooseV32Dialog interestChooseV32Dialog) {
            this.f76665a = interestChooseV32Dialog;
        }

        public final void onSlide(View view, float f7) {
        }

        public final void onStateChanged(View view, int i7) {
            if (i7 == 5) {
                this.f76665a.f76659i = InterestPageCloseReason.BAR_PULLDOWN.getReason();
            }
        }
    }

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v32.page.InterestChooseV32Dialog$onStart$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v32/page/InterestChooseV32Dialog$onStart$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final InterestChooseV32Dialog this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v32.page.InterestChooseV32Dialog$onStart$3$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v32/page/InterestChooseV32Dialog$onStart$3$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final InterestChooseV32Dialog f76666a;

            public a(InterestChooseV32Dialog interestChooseV32Dialog) {
                this.f76666a = interestChooseV32Dialog;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public final Object emit(Object obj, Continuation continuation) throws NoWhenBranchMatchedException {
                Unit unit;
                Do0.a aVar = (Do0.a) obj;
                boolean z6 = aVar instanceof a.C0021a;
                InterestChooseV32Dialog interestChooseV32Dialog = this.f76666a;
                if (z6) {
                    a.C0021a c0021a = (a.C0021a) aVar;
                    Boolean bool = c0021a.f2998a;
                    if (bool != null) {
                        interestChooseV32Dialog.f76660j = bool.booleanValue();
                    }
                    Boolean bool2 = c0021a.f2999b;
                    if (bool2 != null) {
                        interestChooseV32Dialog.f76661k = bool2.booleanValue();
                    }
                    String str = c0021a.f3000c;
                    if (str != null) {
                        interestChooseV32Dialog.f76659i = str;
                    }
                    interestChooseV32Dialog.kc(null);
                } else {
                    if (!(aVar instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Context context = interestChooseV32Dialog.getContext();
                    if (context == null) {
                        unit = Unit.INSTANCE;
                        return unit;
                    }
                    PromoToast.showMidToast(context, (String) ((a.b) aVar).f3001a.invoke(context), 2131243891, R$color.Text_white);
                }
                unit = Unit.INSTANCE;
                return unit;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(InterestChooseV32Dialog interestChooseV32Dialog, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = interestChooseV32Dialog;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow<Do0.a> sharedFlow = this.this$0.jf().f76695d;
                a aVar = new a(this.this$0);
                this.label = 1;
                if (sharedFlow.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InterestChooseV32Dialog() {
        final Function0<Fragment> function0 = new Function0<Fragment>(this) { // from class: com.bilibili.pegasus.components.interest.ui.v32.page.InterestChooseV32Dialog$special$$inlined$viewModels$default$1
            final Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Fragment m8057invoke() {
                return this.$this_viewModels;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>(function0) { // from class: com.bilibili.pegasus.components.interest.ui.v32.page.InterestChooseV32Dialog$special$$inlined$viewModels$default$2
            final Function0 $ownerProducer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$ownerProducer = function0;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner m8058invoke() {
                return (ViewModelStoreOwner) this.$ownerProducer.invoke();
            }
        });
        final Function0 function02 = null;
        this.f76658g = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(InterestChooseV32PageViewModel.class), new Function0<ViewModelStore>(lazy) { // from class: com.bilibili.pegasus.components.interest.ui.v32.page.InterestChooseV32Dialog$special$$inlined$viewModels$default$3
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$owner$delegate = lazy;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStore m8059invoke() {
                return FragmentViewModelLazyKt.m4419viewModels$lambda1(this.$owner$delegate).getViewModelStore();
            }
        }, new Function0<CreationExtras>(function02, lazy) { // from class: com.bilibili.pegasus.components.interest.ui.v32.page.InterestChooseV32Dialog$special$$inlined$viewModels$default$4
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
            public final androidx.lifecycle.viewmodel.CreationExtras m8060invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.ui.v32.page.InterestChooseV32Dialog$special$$inlined$viewModels$default$4.m8060invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }
        }, new Function0<ViewModelProvider.Factory>(this, lazy) { // from class: com.bilibili.pegasus.components.interest.ui.v32.page.InterestChooseV32Dialog$special$$inlined$viewModels$default$5
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
            public final androidx.lifecycle.ViewModelProvider.Factory m8061invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.ui.v32.page.InterestChooseV32Dialog$special$$inlined$viewModels$default$5.m8061invoke():androidx.lifecycle.ViewModelProvider$Factory");
            }
        });
        this.f76660j = true;
        this.f76664n = ListExtentionsKt.toPx(668);
    }

    /* JADX INFO: renamed from: if, reason: not valid java name */
    public static void m8056if(View view, boolean z6) {
        if (view instanceof ViewGroup) {
            if (view instanceof RecyclerView) {
                ((RecyclerView) view).setNestedScrollingEnabled(z6);
                return;
            }
            Iterator<View> it = ViewGroupKt.iterator((ViewGroup) view);
            while (it.hasNext()) {
                m8056if(it.next(), z6);
            }
        }
    }

    @Override // com.bilibili.pegasus.components.interest.ui.c
    public final void T8(@NotNull final InterestChoose interestChoose, @NotNull final Fragment fragment) {
        MainDialogManager.addDialog(new MainDialogManager.DialogManagerInfo("pegasus_interest_chose", new MainDialogManager.IDialogInterface(fragment, this, interestChoose) { // from class: com.bilibili.pegasus.components.interest.ui.v32.page.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Fragment f76676a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final InterestChooseV32Dialog f76677b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final InterestChoose f76678c;

            {
                this.f76676a = fragment;
                this.f76677b = this;
                this.f76678c = interestChoose;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment, com.bilibili.pegasus.components.interest.ui.v32.page.InterestChooseV32Dialog, java.lang.Object] */
            public final void onShow() {
                InterestChoose interestChoose2 = this.f76678c;
                Fragment fragment2 = this.f76676a;
                boolean zIsDestroyed = fragment2.getChildFragmentManager().isDestroyed();
                ?? r02 = this.f76677b;
                if (zIsDestroyed) {
                    com.bilibili.pegasus.components.interest.e.b(InterestChainProcess.ERROR, 0, InterestChainErrorCode.PAGE_INVISIBLE, null, null, com.bilibili.pegasus.components.interest.e.a(), 24);
                    Gp0.a.b(InterestEvent.ERROR, InterestErrorType.PAGE_INVISIBLE, MapsKt.mapOf(TuplesKt.to(CaptureSchema.JUMP_PARAMS_EXTRA, "page_destroy")), null, 8);
                    com.bilibili.pegasus.components.interest.m mVar = r02.h;
                    if (mVar != null) {
                        mVar.a(false, null);
                    }
                    MainDialogManager.showNextDialog("pegasus_interest_chose", false, (Context) null);
                    return;
                }
                try {
                    FragmentManager childFragmentManager = fragment2.getChildFragmentManager();
                    r02.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("key_interest_choose_data", interestChoose2);
                    r02.setArguments(bundle);
                    r02.show(childFragmentManager, "SubCategoryInterestChooseDialog");
                } catch (Exception e7) {
                    Gp0.a.b(InterestEvent.ERROR, InterestErrorType.EXCEPTION, MapsKt.mapOf(TuplesKt.to(CaptureSchema.JUMP_PARAMS_EXTRA, "after_dialog")), null, 8);
                    com.bilibili.pegasus.components.interest.e.b(InterestChainProcess.ERROR, 0, InterestChainErrorCode.DIALOG_CRASH, null, null, com.bilibili.pegasus.components.interest.e.a(), 24);
                    BLog.i("InterestChooseV32Dialog", "show dialog failed", e7);
                    com.bilibili.pegasus.components.interest.m mVar2 = r02.h;
                    if (mVar2 != null) {
                        mVar2.a(false, null);
                    }
                    MainDialogManager.showNextDialog("pegasus_interest_chose", false, (Context) null);
                }
            }
        }, 95, false), fragment.getContext());
        if (MainDialogManager.isDialogShowing("biz_block_dialog")) {
            MainDialogManager.showNextDialog("biz_block_dialog", false, fragment.getContext());
        }
        MainDialogManager.removeDialog("biz_block_dialog");
    }

    @Override // com.bilibili.pegasus.components.interest.ui.c
    public final void c1(@Nullable String str) {
        this.f76659i = str;
    }

    @NotNull
    public final InterestChooseV32PageViewModel jf() {
        return (InterestChooseV32PageViewModel) this.f76658g.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.pegasus.components.interest.ui.c
    public final void kc(@Nullable InterestPageCloseReason interestPageCloseReason) {
        if (interestPageCloseReason != null) {
            this.f76659i = interestPageCloseReason.getReason();
        }
        if (isAdded()) {
            dismissAllowingStateLoss();
        }
    }

    @Override // com.bilibili.pegasus.components.interest.ui.c
    public final void o9(@Nullable com.bilibili.pegasus.components.interest.m mVar) {
        this.h = mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(@Nullable Bundle bundle) {
        super/*androidx.fragment.app.DialogFragment*/.onCreate(bundle);
        Bundle arguments = getArguments();
        InterestChoose interestChoose = arguments != null ? (InterestChoose) arguments.getParcelable("key_interest_choose_data") : null;
        boolean z6 = false;
        if (interestChoose != null && bundle == null) {
            setStyle(0, 2131888801);
            return;
        }
        boolean z7 = interestChoose == null;
        if (bundle != null) {
            z6 = true;
        }
        Q.a("onCreate, data invalid = ", ", from recover = ", "InterestChooseV32Dialog", z7, z6);
        dismissAllowingStateLoss();
    }

    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        TintFrameLayout tintFrameLayout;
        C4859f c4859fInflate = C4859f.inflate(layoutInflater);
        this.f76663m = c4859fInflate;
        TintFrameLayout tintFrameLayout2 = null;
        if (c4859fInflate != null && (tintFrameLayout = c4859fInflate.f54028a) != null) {
            tintFrameLayout.setBackgroundDrawable(null);
        }
        C4859f c4859f = this.f76663m;
        if (c4859f != null) {
            tintFrameLayout2 = c4859f.f54028a;
        }
        return tintFrameLayout2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDestroyView() {
        super/*androidx.fragment.app.DialogFragment*/.onDestroyView();
        if (EntryPointKt.getMemleakOptEnable()) {
            this.f76663m = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDismiss(@org.jetbrains.annotations.NotNull android.content.DialogInterface r15) {
        /*
            Method dump skipped, instruction units count: 383
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.ui.v32.page.InterestChooseV32Dialog.onDismiss(android.content.DialogInterface):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onStart() {
        View viewFindViewById;
        ViewGroup.LayoutParams layoutParams;
        super/*androidx.fragment.app.DialogFragment*/.onStart();
        Dialog dialog = getDialog();
        FrameLayout frameLayout = dialog != null ? (FrameLayout) dialog.findViewById(2131299837) : null;
        if (frameLayout != null && (layoutParams = frameLayout.getLayoutParams()) != null) {
            layoutParams.height = this.f76664n;
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (viewFindViewById = dialog2.findViewById(2131313772)) != null) {
            viewFindViewById.setOnClickListener(new View.OnClickListener(this) { // from class: com.bilibili.pegasus.components.interest.ui.v32.page.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final InterestChooseV32Dialog f76674a;

                {
                    this.f76674a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    InterestChooseV32Dialog interestChooseV32Dialog = this.f76674a;
                    interestChooseV32Dialog.f76659i = InterestPageCloseReason.BLANK_CLICK.getReason();
                    interestChooseV32Dialog.f76662l = true;
                    interestChooseV32Dialog.kc(null);
                }
            });
        }
        Dialog dialog3 = getDialog();
        if (dialog3 != null) {
            dialog3.setOnKeyListener(new DialogInterface.OnKeyListener(this) { // from class: com.bilibili.pegasus.components.interest.ui.v32.page.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final InterestChooseV32Dialog f76675a;

                {
                    this.f76675a = this;
                }

                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.fragment.app.Fragment, com.bilibili.pegasus.components.interest.ui.v32.page.InterestChooseV32Dialog] */
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i7, KeyEvent keyEvent) {
                    boolean z6;
                    ?? r02 = this.f76675a;
                    if (i7 == 4 && keyEvent.getAction() == 1) {
                        z6 = true;
                        if (r02.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                            r02.jf().I0(Actions.e.f76422a);
                            z6 = true;
                        }
                    } else {
                        z6 = false;
                    }
                    return z6;
                }
            });
        }
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Object next;
        super/*androidx.fragment.app.Fragment*/.onViewCreated(view, bundle);
        if (getDialog() instanceof BottomSheetDialog) {
            BottomSheetBehavior behavior = getDialog().getBehavior();
            behavior.setState(3);
            behavior.setPeekHeight(this.f76664n);
            behavior.addBottomSheetCallback(new a(this));
        }
        C4859f c4859f = this.f76663m;
        if (c4859f != null) {
            c4859f.f54029b.setOnClickListener(new com.bilibili.bililive.biz.interactionpanel.main.search.ui.k(this, 2));
        }
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new InterestChooseV32Dialog$initConfirmButton$2(this, null), 3, (Object) null);
        C4859f c4859f2 = this.f76663m;
        if (c4859f2 != null) {
            c4859f2.f54030c.setUserInputEnabled(false);
        }
        C4859f c4859f3 = this.f76663m;
        if (c4859f3 != null) {
            c4859f3.f54030c.setAdapter(new FragmentStateAdapter(getChildFragmentManager(), getLifecycle()));
        }
        C4859f c4859f4 = this.f76663m;
        if (c4859f4 != null) {
            c4859f4.f54030c.setOffscreenPageLimit(2);
        }
        C4859f c4859f5 = this.f76663m;
        if (c4859f5 != null) {
            ViewPager2 viewPager2 = c4859f5.f54030c;
            Iterator it = ViewGroupKt.getChildren(viewPager2).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((View) next) instanceof RecyclerView) {
                        break;
                    }
                }
            }
            View view2 = (View) next;
            if (view2 != null) {
                RecyclerView recyclerView = (RecyclerView) view2;
                recyclerView.setNestedScrollingEnabled(false);
                recyclerView.setOverScrollMode(2);
            }
            viewPager2.registerOnPageChangeCallback(new d(this));
        }
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new InterestChooseV32Dialog$initPage$1(this, null), 3, (Object) null);
        int i7 = ((Fo0.h) jf().h.getValue()).f6336b;
        long j7 = ((Fo0.h) jf().h.getValue()).f6337c;
        String str = ((Fo0.h) jf().h.getValue()).f6338d;
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        com.bilibili.pegasus.components.interest.e.g(i7, j7, str2);
        s.c(this, new o(this, 1));
    }
}
