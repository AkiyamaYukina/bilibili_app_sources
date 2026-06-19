package com.bilibili.upper.module.editvideo;

import NE0.m;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.lib.infoeyes.InfoEyesManager;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.upper.api.bean.uppercenter.VideoDetail;
import java.util.ArrayList;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/editvideo/EditVideoListFragment.class */
public class EditVideoListFragment extends BaseFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList<VideoDetail.Videos> f113145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f113146c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RecyclerView f113147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m f113148e;

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.f113148e == null) {
            this.f113148e = new m(this.f113145b, this.f113146c);
        }
        this.f113147d.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f113147d.setAdapter(this.f113148e);
        this.f113148e.notifyDataSetChanged();
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f113145b = arguments.getParcelableArrayList("INTENT_VIDEOS");
            this.f113146c = arguments.getBoolean("KEY_CAN_ADD_VIDEO", false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View viewInflate = layoutInflater.inflate(2131494212, viewGroup, false);
        this.f113147d = (RecyclerView) viewInflate.findViewById(2131306580);
        InfoEyesManager.getInstance().report2(false, "000377", new String[]{"contribute_multi_show", "show"});
        return viewInflate;
    }
}
