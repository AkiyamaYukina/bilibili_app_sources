package com.bilibili.relation.group;

import ET.s;
import Gs0.g;
import Gs0.h;
import Gs0.i;
import Gs0.j;
import Gs0.k;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialog;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bolts.CancellationToken;
import bolts.CancellationTokenSource;
import bolts.Task;
import com.airbnb.lottie.LottieAnimationView;
import com.bilibili.droid.ActivityUtils;
import com.bilibili.droid.BundleUtil;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.blrouter.RouteRequestKt;
import com.bilibili.lib.infoeyes.InfoEyesManager;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.relation.api.AttentionGroup;
import com.bilibili.relation.api.RelationService;
import com.bilibili.relation.group.AttentionGroupDialog;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.bilibili.video.story.StoryDetail;
import com.bilibili.video.story.X;
import com.bilibili.video.story.action.StoryLandscapeController;
import com.bilibili.video.story.action.widget.StoryLandscapeSpeedWidget;
import com.bilibili.video.story.action.widget.StoryLikeWidget;
import com.bilibili.video.story.helper.O;
import com.bilibili.video.story.player.StoryPagerPlayer;
import com.bilibili.video.story.player.w;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import pJ0.a;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.widget.LoadingImageView;
import tv.danmaku.bili.widget.PinnedBottomSheetBehavior;
import tv.danmaku.bili.widget.recycler.DividerDecoration;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/group/AttentionGroupDialog.class */
public class AttentionGroupDialog extends AppCompatDialogFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewGroup f86070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f86071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RecyclerView f86072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LoadingImageView f86073e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ViewGroup f86074f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f86075g;
    public PinnedBottomSheetBehavior h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f86076i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f86077j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public RelationService f86078k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Gs0.b f86079l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public AttentionGroup f86080m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f86081n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CancellationTokenSource f86082o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public b f86083p;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/group/AttentionGroupDialog$a.class */
    public final class a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AttentionGroupDialog f86084a;

        public a(AttentionGroupDialog attentionGroupDialog) {
            this.f86084a = attentionGroupDialog;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            this.f86084a.f86070b.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            int height = this.f86084a.f86070b.getHeight();
            AttentionGroupDialog attentionGroupDialog = this.f86084a;
            attentionGroupDialog.h.setPeekHeight((int) TypedValue.applyDimension(1, 335.0f, attentionGroupDialog.getContext().getResources().getDisplayMetrics()));
            attentionGroupDialog.h.setBottomSheetCallback(new g(attentionGroupDialog, height, Math.max(height - attentionGroupDialog.h.getPeekHeight(), 0)));
            attentionGroupDialog.h.addPinnedView(attentionGroupDialog.f86074f);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/group/AttentionGroupDialog$b.class */
    public interface b {
        void a(boolean z6);
    }

    public static void hf(AttentionGroupDialog attentionGroupDialog, View view, int i7) {
        attentionGroupDialog.getClass();
        if (view == null) {
            return;
        }
        int i8 = i7 - ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        view.layout(view.getLeft(), i8 - view.getHeight(), view.getRight(), i8);
    }

    public static void jf(Context context, long j7, String str, b bVar) {
        Activity wrapperActivity = ActivityUtils.getWrapperActivity(context);
        if (!(wrapperActivity instanceof FragmentActivity)) {
            BLog.d("AttentionGroupDialog", "Activity is not a FragmentActivity");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong(EditCustomizeSticker.TAG_MID, j7);
        bundle.putString("spmid", str);
        AttentionGroupDialog attentionGroupDialog = new AttentionGroupDialog();
        attentionGroupDialog.setArguments(bundle);
        attentionGroupDialog.f86083p = bVar;
        attentionGroupDialog.show(((FragmentActivity) wrapperActivity).getSupportFragmentManager(), "attention_group");
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void dismiss() {
        this.h.setBottomSheetCallback((BottomSheetBehavior.BottomSheetCallback) null);
        this.h.removePinnedView(this.f86074f);
        super.dismiss();
    }

    /* JADX INFO: renamed from: if, reason: not valid java name */
    public final void m8618if() {
        InfoEyesManager.getInstance().report2(false, "000225", new String[]{"follow_create_click", "click"});
        BLRouter.routeTo(new RouteRequest.Builder(Uri.parse("bilibili://relation/create-group")).requestCode(100).build(), this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i7, int i8, Intent intent) {
        if (i8 == -1 && i7 == 100 && intent != null) {
            AttentionGroup attentionGroup = (AttentionGroup) intent.getParcelableExtra("attention_new_group");
            Gs0.b bVar = this.f86079l;
            if (bVar != null) {
                bVar.f7383a.add(attentionGroup);
                bVar.f7385c.put(attentionGroup.groupId, attentionGroup.groupName);
                bVar.notifyItemInserted(bVar.f7383a.size());
                h hVar = bVar.f7384b;
                if (hVar != null) {
                    Map<String, String> map = bVar.f7385c;
                    AttentionGroupDialog attentionGroupDialog = (AttentionGroupDialog) hVar.f7404a;
                    attentionGroupDialog.f86075g.setText(attentionGroupDialog.getString(map.size() > 0 ? 2131841640 : 2131847621));
                }
            }
        }
    }

    @Override // androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f86076i = BundleUtil.getLong(arguments, EditCustomizeSticker.TAG_MID, new long[0]);
            this.f86077j = arguments.getString("spmid", "");
        }
        if (this.f86076i == 0) {
            throw new IllegalArgumentException("up user id is missing");
        }
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        AppCompatDialog appCompatDialog = new AppCompatDialog(getContext(), 2131886161);
        appCompatDialog.supportRequestWindowFeature(1);
        appCompatDialog.getWindow().setLayout(-1, -1);
        appCompatDialog.getWindow().setSoftInputMode(51);
        return appCompatDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        menu.add(2131841512).setShowAsAction(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v20, types: [android.view.View$OnClickListener, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View viewInflate = layoutInflater.inflate(2131493857, viewGroup, false);
        final int i7 = 0;
        viewInflate.findViewById(2131307432).setOnClickListener(new View.OnClickListener(this, i7) { // from class: Gs0.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f7393a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f7394b;

            {
                this.f7393a = i7;
                this.f7394b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (this.f7393a) {
                    case 0:
                        ((AttentionGroupDialog) this.f7394b).dismiss();
                        break;
                    default:
                        ((s) this.f7394b).invoke();
                        break;
                }
            }
        });
        this.f86073e = viewInflate.findViewById(2131303626);
        this.f86071c = (ImageView) viewInflate.findViewById(2131303021);
        final int i8 = 0;
        ((TextView) viewInflate.findViewById(2131299725)).setOnClickListener(new View.OnClickListener(this, i8) { // from class: Gs0.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f7395a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f7396b;

            {
                this.f7395a = i8;
                this.f7396b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (this.f7395a) {
                    case 0:
                        ((AttentionGroupDialog) this.f7396b).m8618if();
                        break;
                    case 1:
                        ((no.a) this.f7396b).f124342c.invoke();
                        break;
                    default:
                        sf1.g gVar = (sf1.g) this.f7396b;
                        String str = gVar.l0;
                        Context context = gVar.a;
                        if (context != null && str != null && str.length() != 0) {
                            BLRouter.routeTo(RouteRequestKt.toRouteRequest(Uri.parse(str)), context);
                        }
                        break;
                }
            }
        });
        final int i9 = 0;
        this.f86071c.setOnClickListener(new View.OnClickListener(this, i9) { // from class: Gs0.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f7397a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f7398b;

            {
                this.f7397a = i9;
                this.f7398b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.bilibili.video.story.player.m player;
                switch (this.f7397a) {
                    case 0:
                        ((AttentionGroupDialog) this.f7398b).m8618if();
                        break;
                    case 1:
                        StoryLandscapeSpeedWidget storyLandscapeSpeedWidget = (StoryLandscapeSpeedWidget) this.f7398b;
                        com.bilibili.video.story.action.g gVar = storyLandscapeSpeedWidget.b;
                        if (gVar != null) {
                            gVar.hide();
                            MJ0.c cVar = storyLandscapeSpeedWidget.c;
                            if (cVar != null) {
                                com.bilibili.video.story.action.g gVar2 = storyLandscapeSpeedWidget.b;
                                Float fValueOf = (gVar2 == null || (player = gVar2.getPlayer()) == null) ? null : Float.valueOf(player.getPlaySpeed());
                                if (cVar.e == null) {
                                    cVar.e = cVar.a(cVar.a);
                                }
                                View view2 = cVar.e;
                                StoryLandscapeController storyLandscapeController = cVar.b;
                                if (storyLandscapeController.indexOfChild(view2) > 0) {
                                    cVar.b();
                                } else {
                                    ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -1);
                                    layoutParams.rightToRight = storyLandscapeController.getId();
                                    ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = 0;
                                    storyLandscapeController.addView(view2, layoutParams);
                                    if (cVar.h == null) {
                                        cVar.h = new pJ0.a();
                                    }
                                    RecyclerView recyclerView = cVar.g;
                                    if (recyclerView != null) {
                                        recyclerView.setVisibility(0);
                                    }
                                    RecyclerView recyclerView2 = cVar.g;
                                    if (recyclerView2 != null) {
                                        recyclerView2.setAdapter(cVar.h);
                                    }
                                    pJ0.a aVar = cVar.h;
                                    if (aVar != null) {
                                        aVar.a = new MJ0.b(cVar);
                                    }
                                    View view3 = cVar.d;
                                    if (view3 != null) {
                                        view3.setOnClickListener(new MJ0.a(cVar, 0));
                                    }
                                    if (fValueOf != null) {
                                        pJ0.a aVar2 = cVar.h;
                                        if (aVar2 != null) {
                                            float fFloatValue = fValueOf.floatValue();
                                            ((ArrayList) aVar2.b).clear();
                                            int length = aVar2.c.length;
                                            for (int i10 = 0; i10 < length; i10++) {
                                                float f7 = aVar2.c[i10];
                                                a.a aVar3 = new a.a();
                                                aVar3.a = f7;
                                                aVar3.b = ((double) Math.abs(fFloatValue - f7)) < 0.1d;
                                                ((ArrayList) aVar2.b).add(aVar3);
                                            }
                                        }
                                        pJ0.a aVar4 = cVar.h;
                                        if (aVar4 != null) {
                                            aVar4.notifyDataSetChanged();
                                        }
                                    }
                                    cVar.f = true;
                                }
                            }
                        }
                        com.bilibili.video.story.action.g gVar3 = storyLandscapeSpeedWidget.b;
                        com.bilibili.video.story.player.m player2 = gVar3 != null ? gVar3.getPlayer() : null;
                        StoryPagerPlayer storyPagerPlayer = player2 instanceof StoryPagerPlayer ? (StoryPagerPlayer) player2 : null;
                        if (storyPagerPlayer != null) {
                            w wVar = storyPagerPlayer.B;
                            StoryDetail storyDetailO0 = storyPagerPlayer.O0();
                            String str = wVar != null ? wVar.c : null;
                            String str2 = str == null ? "" : str;
                            String str3 = wVar != null ? wVar.b : null;
                            String str4 = str3 == null ? "" : str3;
                            long jB = com.bilibili.video.story.extension.a.b(storyDetailO0 != null ? Long.valueOf(storyDetailO0.getAid()) : null);
                            String cardGoto = storyDetailO0 != null ? storyDetailO0.getCardGoto() : null;
                            String str5 = cardGoto == null ? "" : cardGoto;
                            String trackId = storyDetailO0 != null ? storyDetailO0.getTrackId() : null;
                            String str6 = trackId == null ? "" : trackId;
                            String str7 = wVar != null ? wVar.g : null;
                            if (str7 == null) {
                                str7 = "";
                            }
                            O.a aVar5 = new O.a(storyPagerPlayer.N0() + 1, 1032, jB, 0L, com.bilibili.video.story.extension.a.b(storyDetailO0 != null ? Long.valueOf(storyDetailO0.getVideoId()) : null), str2, str4, str5, str6, str7, "1");
                            HashMap map = new HashMap();
                            O.H(map, aVar5);
                            Neurons.reportClick(false, "main.ugc-video-detail-vertical.sub-action.speed.click", map);
                            break;
                        }
                        break;
                    default:
                        sf1.i iVar = ((sf1.g) this.f7398b).c;
                        if (iVar != null) {
                            iVar.a();
                        }
                        break;
                }
            }
        });
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(2131297837);
        this.f86074f = viewGroup2;
        final int i10 = 0;
        viewGroup2.setOnClickListener(new View.OnClickListener(this, i10) { // from class: Gs0.f

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f7399a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f7400b;

            {
                this.f7399a = i10;
                this.f7400b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean z6;
                StoryDetail.RequestUser requestUser;
                StoryDetail data;
                switch (this.f7399a) {
                    case 0:
                        AttentionGroupDialog attentionGroupDialog = (AttentionGroupDialog) this.f7400b;
                        if (attentionGroupDialog.f86076i != 0) {
                            b bVar = attentionGroupDialog.f86079l;
                            String string = null;
                            if (bVar == null || bVar.f7385c.isEmpty()) {
                                z6 = false;
                            } else {
                                StringBuilder sb = new StringBuilder();
                                boolean z7 = false;
                                for (String str : attentionGroupDialog.f86079l.f7385c.keySet()) {
                                    if (str.equals(attentionGroupDialog.f86081n)) {
                                        z7 = true;
                                    }
                                    sb.append(str);
                                    sb.append(",");
                                }
                                z6 = z7;
                                if (sb.length() > 0) {
                                    string = sb.deleteCharAt(sb.length() - 1).toString();
                                    z6 = z7;
                                }
                            }
                            String str2 = string;
                            if (TextUtils.isEmpty(string)) {
                                AttentionGroup attentionGroup = attentionGroupDialog.f86080m;
                                if (attentionGroup == null || TextUtils.isEmpty(attentionGroup.groupId)) {
                                    ToastHelper.showToast(attentionGroupDialog.getContext(), 2131847644, 0);
                                    attentionGroupDialog.dismiss();
                                } else {
                                    str2 = attentionGroupDialog.f86080m.groupId;
                                }
                            }
                            attentionGroupDialog.f86078k.addToGroup(BiliAccounts.get(attentionGroupDialog.getContext()).getAccessKey(), String.valueOf(attentionGroupDialog.f86076i), str2).enqueue(new com.bilibili.relation.group.a(attentionGroupDialog, z6));
                            break;
                        }
                        break;
                    case 1:
                        StoryLikeWidget storyLikeWidget = (StoryLikeWidget) this.f7400b;
                        com.bilibili.video.story.action.g gVar = storyLikeWidget.a;
                        if (gVar != null && gVar.isActive()) {
                            com.bilibili.video.story.action.g gVar2 = storyLikeWidget.a;
                            if (gVar2 == null || (data = gVar2.getData()) == null || !data.isImage() || KJ0.h.a(storyLikeWidget.getContext())) {
                                boolean z8 = storyLikeWidget.e;
                                LottieAnimationView lottieAnimationView = storyLikeWidget.d;
                                BLog.i("story -- likeLoading:" + z8 + " isAnimating:" + (lottieAnimationView != null ? Boolean.valueOf(lottieAnimationView.isAnimating()) : null));
                                StoryDetail data2 = gVar.getData();
                                boolean z9 = (data2 == null || (requestUser = data2.getRequestUser()) == null || !requestUser.getLike()) ? false : true;
                                if (!z9 && !storyLikeWidget.i) {
                                    storyLikeWidget.m0(true);
                                } else if (!storyLikeWidget.e) {
                                    LottieAnimationView lottieAnimationView2 = storyLikeWidget.d;
                                    if (lottieAnimationView2 == null || !lottieAnimationView2.isAnimating()) {
                                        ImageView imageView = storyLikeWidget.b;
                                        if (imageView != null) {
                                            imageView.setSelected(!z9);
                                        }
                                        storyLikeWidget.k0();
                                    }
                                }
                                HashMap mapB = X.b(gVar.getCommonReportInfo());
                                mapB.put("like_state", z9 ? "0" : "1");
                                Neurons.reportClick(false, "main.ugc-video-detail-vertical.main-action.like.click", mapB);
                            }
                        }
                        break;
                    default:
                        sf1.g gVar3 = (sf1.g) this.f7400b;
                        gVar3.N = true;
                        gVar3.w(true ^ gVar3.M);
                        break;
                }
            }
        });
        this.f86075g = (TextView) viewInflate.findViewById(2131298598);
        ViewGroup viewGroup3 = (ViewGroup) viewInflate.findViewById(2131299396);
        this.f86070b = viewGroup3;
        viewGroup3.setOnClickListener(new Object());
        this.h = ((CoordinatorLayout.LayoutParams) this.f86070b.getLayoutParams()).getBehavior();
        this.f86070b.getViewTreeObserver().addOnGlobalLayoutListener(new a(this));
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(2131306580);
        this.f86072d = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f86072d.addItemDecoration(new DividerDecoration(getContext()));
        return viewInflate;
    }

    @Override // androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        CancellationTokenSource cancellationTokenSource = this.f86082o;
        if (cancellationTokenSource != null) {
            cancellationTokenSource.cancel();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        getDialog().getWindow().setLayout(-1, -1);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, @Nullable Bundle bundle) {
        if (this.f86078k == null) {
            this.f86078k = (RelationService) ServiceGenerator.createService(RelationService.class);
        }
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        this.f86082o = cancellationTokenSource;
        CancellationToken token = cancellationTokenSource.getToken();
        LoadingImageView loadingImageView = this.f86073e;
        if (loadingImageView != null) {
            loadingImageView.setVisibility(0);
            this.f86073e.setRefreshing();
        }
        String accessKey = BiliAccounts.get(getContext()).getAccessKey();
        Task.callInBackground(new k(this, accessKey), token).onSuccess(new j(this, accessKey), token).continueWith(new i(this), Task.UI_THREAD_EXECUTOR, token);
    }
}
