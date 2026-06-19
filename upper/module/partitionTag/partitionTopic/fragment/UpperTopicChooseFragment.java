package com.bilibili.upper.module.partitionTag.partitionTopic.fragment;

import QK.q;
import QK.r;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import bF0.H3;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.studio.comm.manager.v;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import com.bilibili.upper.api.bean.topic.UpperPublishTopicBean;
import com.bilibili.upper.module.partitionTag.partitionTopic.bean.PartitionLimitState;
import com.bilibili.upper.module.partitionTag.partitionTopic.bean.UpperTopicRequestParam;
import com.bilibili.upper.module.partitionTag.partitionTopic.bean.UpperTopicResponse;
import com.bilibili.upper.module.partitionTag.partitionTopic.widget.XLinearLayoutManager;
import eJ0.H;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Function;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vI0.AbstractC8792c;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitionTopic/fragment/UpperTopicChooseFragment.class */
@StabilityInferred(parameters = 0)
public final class UpperTopicChooseFragment extends BaseFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public H3 f113791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public uI0.h f113792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public List<? extends UpperPublishTopicBean.Topic> f113793d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public AI0.i f113794e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitionTopic/fragment/UpperTopicChooseFragment$a.class */
    public static final /* synthetic */ class a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function1 f113795a;

        public a(Function1 function1) {
            this.f113795a = function1;
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
            return this.f113795a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f113795a.invoke(obj);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i7, int i8, @Nullable Intent intent) {
        super.onActivityResult(i7, i8, intent);
        if (intent == null || i7 != 1) {
            return;
        }
        String stringExtra = intent.getStringExtra(CaptureSchema.TOPIC_NAME);
        boolean booleanExtra = intent.getBooleanExtra("is_created_topic", false);
        long longExtra = intent.getLongExtra(CaptureSchema.TOPIC_ID, 0L);
        String stringExtra2 = intent.getStringExtra("topic_desc");
        long longExtra2 = intent.getLongExtra(CaptureSchema.MISSION_ID, 0L);
        if (longExtra != 0) {
            int i9 = booleanExtra ? 3 : 2;
            AI0.i iVar = this.f113794e;
            if (iVar != null) {
                iVar.I0(longExtra, longExtra2, i9, stringExtra, stringExtra2);
            }
            uI0.h hVar = this.f113792c;
            if (hVar != null) {
                hVar.N();
                uI0.h hVar2 = this.f113792c;
                if (hVar2 != null) {
                    AI0.i iVar2 = this.f113794e;
                    long topicId = 0;
                    if (iVar2 != null) {
                        UpperTopicRequestParam upperTopicRequestParam = iVar2.f260f;
                        topicId = 0;
                        if (upperTopicRequestParam != null) {
                            topicId = upperTopicRequestParam.getTopicId();
                        }
                    }
                    hVar2.O(topicId);
                }
            }
        }
        String stringExtra3 = intent.getStringExtra("topic_user_tips");
        if (TextUtils.isEmpty(stringExtra3)) {
            return;
        }
        H.b(getContext(), stringExtra3);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        H3 h3Inflate = H3.inflate(layoutInflater);
        this.f113791b = h3Inflate;
        return h3Inflate != null ? h3Inflate.f54824a : null;
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        MutableLiveData<AbstractC8792c> mutableLiveData;
        MutableLiveData<PartitionLimitState> mutableLiveData2;
        MutableLiveData<UpperTopicResponse> mutableLiveData3;
        TE0.b.f24088a.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("experiment_num", "4");
        v.a(linkedHashMap);
        Neurons.reportExposure$default(false, "creation.new-publish.topic-select.select-panel.show", linkedHashMap, (List) null, 8, (Object) null);
        FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 != null) {
            this.f113794e = (AI0.i) R0.k.a(fragmentActivityP3, AI0.i.class);
        }
        AI0.i iVar = this.f113794e;
        if (iVar != null && (mutableLiveData3 = iVar.f258d) != null) {
            mutableLiveData3.observe(getViewLifecycleOwner(), new a(new Jk.c(this, 4)));
        }
        AI0.i iVar2 = this.f113794e;
        if (iVar2 != null && (mutableLiveData2 = iVar2.f259e) != null) {
            mutableLiveData2.observe(getViewLifecycleOwner(), new a(new q(1)));
        }
        AI0.i iVar3 = this.f113794e;
        if (iVar3 != null && (mutableLiveData = iVar3.f257c) != null) {
            mutableLiveData.observe(getViewLifecycleOwner(), new a(new r(this, 3)));
        }
        if (this.f113794e != null) {
            H3 h32 = this.f113791b;
            if (h32 != null) {
                h32.f54826c.setOnRetryClickListener(new Jk.b(this, 5));
            }
            H3 h33 = this.f113791b;
            if (h33 != null) {
                h33.f54826c.c();
            }
            H3 h34 = this.f113791b;
            if (h34 != null) {
                h34.f54826c.setVisibility(0);
            }
            this.f113792c = new uI0.h(this.f113794e);
            XLinearLayoutManager xLinearLayoutManager = new XLinearLayoutManager(getContext());
            xLinearLayoutManager.setOrientation(1);
            H3 h35 = this.f113791b;
            if (h35 != null) {
                h35.f54825b.setLayoutManager(xLinearLayoutManager);
            }
            H3 h36 = this.f113791b;
            if (h36 != null) {
                h36.f54825b.setAdapter(this.f113792c);
            }
            H3 h37 = this.f113791b;
            RecyclerView.ItemAnimator itemAnimator = (h37 != null ? h37.f54825b : null).getItemAnimator();
            if (itemAnimator != null) {
                itemAnimator.setAddDuration(0L);
                itemAnimator.setChangeDuration(0L);
                itemAnimator.setMoveDuration(0L);
                itemAnimator.setRemoveDuration(0L);
                ((SimpleItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
            }
            H3 h38 = this.f113791b;
            if (h38 != null) {
                h38.f54825b.addOnScrollListener(new k(this));
            }
        }
        AI0.i iVar4 = this.f113794e;
        if (iVar4 != null) {
            iVar4.K0(true);
        }
    }
}
