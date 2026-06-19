package com.bilibili.upper.module.partitionTag.partitiontopicv2;

import BI0.f;
import Od1.O;
import QK.E;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import bF0.C5040r2;
import com.bilibili.commons.tuple.ImmutablePair;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import com.bilibili.upper.api.bean.topic.UpperPublishTopicBean;
import com.bilibili.upper.module.partitionTag.partitionTopic.bean.UpperTopicRequestParam;
import com.bilibili.upper.module.partitionTag.partitiontopicv2.a;
import eJ0.H;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitiontopicv2/UpperFenquBiaoqianHuatiFragment.class */
@StabilityInferred(parameters = 0)
public final class UpperFenquBiaoqianHuatiFragment extends BaseFragment implements f.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f113904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lazy f113905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public List<? extends UpperPublishTopicBean.Topic> f113906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C5040r2 f113907e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public e f113908f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitiontopicv2/UpperFenquBiaoqianHuatiFragment$a.class */
    public static final /* synthetic */ class a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function1 f113909a;

        public a(Function1 function1) {
            this.f113909a = function1;
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
            return this.f113909a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f113909a.invoke(obj);
        }
    }

    public UpperFenquBiaoqianHuatiFragment() {
        final Function0 function0 = null;
        this.f113904b = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(AI0.f.class), new Function0<ViewModelStore>(this) { // from class: com.bilibili.upper.module.partitionTag.partitiontopicv2.UpperFenquBiaoqianHuatiFragment$special$$inlined$activityViewModels$default$1
            final Fragment $this_activityViewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_activityViewModels = this;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStore m10682invoke() {
                return this.$this_activityViewModels.requireActivity().getViewModelStore();
            }
        }, new Function0<CreationExtras>(function0, this) { // from class: com.bilibili.upper.module.partitionTag.partitiontopicv2.UpperFenquBiaoqianHuatiFragment$special$$inlined$activityViewModels$default$2
            final Function0 $extrasProducer;
            final Fragment $this_activityViewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$extrasProducer = function0;
                this.$this_activityViewModels = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
            @org.jetbrains.annotations.NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final androidx.lifecycle.viewmodel.CreationExtras m10683invoke() {
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
                    if (r0 != 0) goto L24
                L19:
                    r0 = r2
                    androidx.fragment.app.Fragment r0 = r0.$this_activityViewModels
                    androidx.fragment.app.FragmentActivity r0 = r0.requireActivity()
                    androidx.lifecycle.viewmodel.CreationExtras r0 = r0.getDefaultViewModelCreationExtras()
                    r3 = r0
                L24:
                    r0 = r3
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.partitionTag.partitiontopicv2.UpperFenquBiaoqianHuatiFragment$special$$inlined$activityViewModels$default$2.m10683invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }
        }, new Function0<ViewModelProvider.Factory>(this) { // from class: com.bilibili.upper.module.partitionTag.partitiontopicv2.UpperFenquBiaoqianHuatiFragment$special$$inlined$activityViewModels$default$3
            final Fragment $this_activityViewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_activityViewModels = this;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelProvider.Factory m10684invoke() {
                return this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
        final Function0 function02 = null;
        this.f113905c = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(AI0.i.class), new Function0<ViewModelStore>(this) { // from class: com.bilibili.upper.module.partitionTag.partitiontopicv2.UpperFenquBiaoqianHuatiFragment$special$$inlined$activityViewModels$default$4
            final Fragment $this_activityViewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_activityViewModels = this;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStore m10685invoke() {
                return this.$this_activityViewModels.requireActivity().getViewModelStore();
            }
        }, new Function0<CreationExtras>(function02, this) { // from class: com.bilibili.upper.module.partitionTag.partitiontopicv2.UpperFenquBiaoqianHuatiFragment$special$$inlined$activityViewModels$default$5
            final Function0 $extrasProducer;
            final Fragment $this_activityViewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$extrasProducer = function02;
                this.$this_activityViewModels = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
            @org.jetbrains.annotations.NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final androidx.lifecycle.viewmodel.CreationExtras m10686invoke() {
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
                    if (r0 != 0) goto L24
                L19:
                    r0 = r2
                    androidx.fragment.app.Fragment r0 = r0.$this_activityViewModels
                    androidx.fragment.app.FragmentActivity r0 = r0.requireActivity()
                    androidx.lifecycle.viewmodel.CreationExtras r0 = r0.getDefaultViewModelCreationExtras()
                    r3 = r0
                L24:
                    r0 = r3
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.partitionTag.partitiontopicv2.UpperFenquBiaoqianHuatiFragment$special$$inlined$activityViewModels$default$5.m10686invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }
        }, new Function0<ViewModelProvider.Factory>(this) { // from class: com.bilibili.upper.module.partitionTag.partitiontopicv2.UpperFenquBiaoqianHuatiFragment$special$$inlined$activityViewModels$default$6
            final Fragment $this_activityViewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_activityViewModels = this;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelProvider.Factory m10687invoke() {
                return this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
    }

    @Override // BI0.f.a
    public final void U0(@Nullable String str) {
    }

    public final AI0.i jf() {
        return (AI0.i) this.f113905c.getValue();
    }

    public final AI0.f kf() {
        return (AI0.f) this.f113904b.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i7, int i8, @Nullable Intent intent) {
        super.onActivityResult(i7, i8, intent);
        if (intent == null || i7 != 1) {
            return;
        }
        String stringExtra = intent.getStringExtra(CaptureSchema.TOPIC_NAME);
        boolean booleanExtra = intent.getBooleanExtra("is_created_topic", false);
        long topicId = 0;
        long longExtra = intent.getLongExtra(CaptureSchema.TOPIC_ID, 0L);
        String stringExtra2 = intent.getStringExtra("topic_desc");
        long longExtra2 = intent.getLongExtra(CaptureSchema.MISSION_ID, 0L);
        if (longExtra != 0) {
            jf().I0(longExtra, longExtra2, booleanExtra ? 3 : 2, stringExtra, stringExtra2);
            e eVar = this.f113908f;
            if (eVar != null) {
                Integer num = (Integer) eVar.f113924c.right;
                eVar.f113924c = new ImmutablePair<>(0L, -1);
                eVar.notifyItemChanged(num.intValue());
                eVar.notifyItemChanged(0);
                e eVar2 = this.f113908f;
                if (eVar2 != null) {
                    UpperTopicRequestParam upperTopicRequestParam = jf().f260f;
                    if (upperTopicRequestParam != null) {
                        topicId = upperTopicRequestParam.getTopicId();
                    }
                    eVar2.N(topicId);
                }
                jf().K0(false);
            }
        }
        String stringExtra3 = intent.getStringExtra("topic_user_tips");
        if (TextUtils.isEmpty(stringExtra3)) {
            return;
        }
        H.b(getContext(), stringExtra3);
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        C5040r2 c5040r2Inflate = C5040r2.inflate(layoutInflater);
        this.f113907e = c5040r2Inflate;
        C5040r2 c5040r2 = c5040r2Inflate;
        if (c5040r2Inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c5040r2 = null;
        }
        return c5040r2.f56048a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v60, types: [androidx.recyclerview.widget.RecyclerView$OnScrollListener, com.bilibili.upper.module.partitionTag.partitiontopicv2.c] */
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
    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        kf().f238d.observe(getViewLifecycleOwner(), new Observer(this) { // from class: com.bilibili.upper.module.partitionTag.partitiontopicv2.j

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final UpperFenquBiaoqianHuatiFragment f113934a;

            {
                this.f113934a = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                List<a> list;
                UpperFenquBiaoqianHuatiFragment upperFenquBiaoqianHuatiFragment = this.f113934a;
                e eVar = upperFenquBiaoqianHuatiFragment.f113908f;
                if (eVar != null && (list = eVar.f113926e) != null) {
                    list.set(0, new a.C1231a(upperFenquBiaoqianHuatiFragment.kf().f236b, upperFenquBiaoqianHuatiFragment.kf().f237c));
                }
                e eVar2 = upperFenquBiaoqianHuatiFragment.f113908f;
                if (eVar2 != null) {
                    eVar2.notifyItemChanged(0);
                }
            }
        });
        kf().h.observe(getViewLifecycleOwner(), new a(new com.bilibili.bililive.room.biz.ad.answer.h(this, 2)));
        jf().f258d.observe(getViewLifecycleOwner(), new a(new E(this, 3)));
        jf().f259e.observe(getViewLifecycleOwner(), new a(new O(1)));
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), new AbstractCoroutineContextElement(CoroutineExceptionHandler.Key), (CoroutineStart) null, new UpperFenquBiaoqianHuatiFragment$reportExposure$2(this, null), 2, (Object) null);
        jf().f257c.observe(getViewLifecycleOwner(), new a(new com.bilibili.bililive.room.biz.ad.answer.j(this, 1)));
        C5040r2 c5040r2 = this.f113907e;
        C5040r2 c5040r22 = c5040r2;
        if (c5040r2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c5040r22 = null;
        }
        c5040r22.f56049b.setLayoutManager(new LinearLayoutManager(requireActivity(), 1, false));
        e eVar = new e(jf(), requireActivity());
        C5040r2 c5040r23 = this.f113907e;
        C5040r2 c5040r24 = c5040r23;
        if (c5040r23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c5040r24 = null;
        }
        c5040r24.f56049b.setAdapter(eVar);
        this.f113908f = eVar;
        C5040r2 c5040r25 = this.f113907e;
        C5040r2 c5040r26 = c5040r25;
        if (c5040r25 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c5040r26 = null;
        }
        RecyclerView recyclerView = c5040r26.f56049b;
        RecyclerView.ItemAnimator itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.setAddDuration(0L);
            itemAnimator.setChangeDuration(0L);
            itemAnimator.setMoveDuration(0L);
            itemAnimator.setRemoveDuration(0L);
        }
        if (recyclerView.getItemAnimator() instanceof SimpleItemAnimator) {
            ((SimpleItemAnimator) recyclerView.getItemAnimator()).setSupportsChangeAnimations(false);
        }
        C5040r2 c5040r27 = this.f113907e;
        C5040r2 c5040r28 = c5040r27;
        if (c5040r27 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c5040r28 = null;
        }
        c5040r28.f56049b.addOnScrollListener(new k(this));
        C5040r2 c5040r29 = this.f113907e;
        if (c5040r29 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c5040r29 = null;
        }
        RecyclerView recyclerView2 = c5040r29.f56049b;
        GI.g gVar = new GI.g(this, 1);
        ?? onScrollListener = new RecyclerView.OnScrollListener();
        onScrollListener.f113918a = gVar;
        onScrollListener.f113919b = -1;
        onScrollListener.f113920c = -1;
        recyclerView2.addOnScrollListener(onScrollListener);
        kf().O0(requireActivity(), true);
        kf().K0();
        jf().K0(true);
    }
}
