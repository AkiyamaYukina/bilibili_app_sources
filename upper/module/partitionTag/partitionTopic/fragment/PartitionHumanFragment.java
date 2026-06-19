package com.bilibili.upper.module.partitionTag.partitionTopic.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.GridLayoutManager;
import bF0.C5079z1;
import com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment;
import com.bilibili.upper.module.partitionTag.partition.model.UpperPartitionHuman;
import com.bilibili.upper.module.partitionTag.partitionTopic.bean.UpperPartTagRequestParam;
import com.bilibili.upper.module.partitionTag.partitionTopic.widget.BottomSheetRecyclerView;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import uI0.C8712a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitionTopic/fragment/PartitionHumanFragment.class */
@StabilityInferred(parameters = 0)
public final class PartitionHumanFragment extends androidx_fragment_app_Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public C5079z1 f113765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final C8712a f113766c = new C8712a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public AI0.f f113767d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitionTopic/fragment/PartitionHumanFragment$a.class */
    public static final /* synthetic */ class a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final XF0.h f113768a;

        public a(XF0.h hVar) {
            this.f113768a = hVar;
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
            return this.f113768a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f113768a.invoke(obj);
        }
    }

    public final void hf() {
        UpperPartTagRequestParam upperPartTagRequestParam;
        int i7;
        BottomSheetRecyclerView bottomSheetRecyclerView;
        MutableLiveData<List<UpperPartitionHuman>> mutableLiveData;
        List<UpperPartitionHuman> value;
        AI0.f fVar = this.f113767d;
        if (fVar == null || (upperPartTagRequestParam = fVar.f246m) == null) {
            return;
        }
        long humanTypeId = upperPartTagRequestParam.getHumanTypeId();
        AI0.f fVar2 = this.f113767d;
        if (fVar2 != null && (mutableLiveData = fVar2.f243j) != null && (value = mutableLiveData.getValue()) != null) {
            Iterator<T> it = value.iterator();
            int i8 = 0;
            int i9 = -1;
            while (true) {
                i7 = i9;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (i8 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                if (((UpperPartitionHuman) next).id == humanTypeId) {
                    i9 = i8;
                }
                i8++;
            }
        } else {
            i7 = -1;
        }
        if (i7 > -1) {
            this.f113766c.p0(true, i7);
            C5079z1 c5079z1 = this.f113765b;
            if (c5079z1 != null && (bottomSheetRecyclerView = c5079z1.f56392b) != null) {
                bottomSheetRecyclerView.scrollToPosition(i7);
            }
            AI0.f fVar3 = this.f113767d;
            if (fVar3 != null) {
                fVar3.f244k = this.f113766c.R(i7);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        C5079z1 c5079z1Inflate = C5079z1.inflate(LayoutInflater.from(getContext()));
        this.f113765b = c5079z1Inflate;
        return c5079z1Inflate != null ? c5079z1Inflate.f56391a : null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 != null) {
            this.f113767d = (AI0.f) R0.k.a(fragmentActivityP3, AI0.f.class);
        }
        AI0.f fVar = this.f113767d;
        if (fVar != null) {
            fVar.f243j.observe(getViewLifecycleOwner(), new a(new XF0.h(this, 2)));
        }
        this.f113766c.f25271f = new YA0.d(this) { // from class: com.bilibili.upper.module.partitionTag.partitionTopic.fragment.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PartitionHumanFragment f113798a;

            {
                this.f113798a = this;
            }

            @Override // YA0.d
            public final void b(int i7, View view2) {
                PartitionHumanFragment partitionHumanFragment = this.f113798a;
                if (!partitionHumanFragment.f113766c.l0(i7)) {
                    partitionHumanFragment.f113766c.p0(true, i7);
                    AI0.f fVar2 = partitionHumanFragment.f113767d;
                    if (fVar2 != null) {
                        fVar2.f244k = partitionHumanFragment.f113766c.R(i7);
                    }
                }
                AI0.f fVar3 = partitionHumanFragment.f113767d;
                String str = null;
                UpperPartitionHuman upperPartitionHuman = fVar3 != null ? fVar3.f244k : null;
                TE0.b bVar = TE0.b.f24088a;
                if (upperPartitionHuman != null) {
                    str = upperPartitionHuman.name;
                }
                long j7 = upperPartitionHuman != null ? upperPartitionHuman.id : 0L;
                bVar.getClass();
                TE0.b.R(j7, str);
            }
        };
        C5079z1 c5079z1 = this.f113765b;
        if (c5079z1 != null) {
            GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 4);
            BottomSheetRecyclerView bottomSheetRecyclerView = c5079z1.f56392b;
            bottomSheetRecyclerView.setLayoutManager(gridLayoutManager);
            bottomSheetRecyclerView.setAdapter(this.f113766c);
        }
    }
}
